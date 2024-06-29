import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class213 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Lcd;")
    public static class64 field3580 = class44.method335((byte) 71, "mapflag");

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field3589 = 500;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "Lcd;")
    private static class64 field3593 = class44.method335((byte) 71, "Use");

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Lcd;")
    public static class64 field3588 = field3593;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field3594 = 0;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Lqm;")
    public static class222 field3578;

    @OriginalMember(owner = "client!kf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 16)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3587++;
        if (class29.field477 == null) {
            return;
        }
        class43.field698 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class135.field2406.length) {
            var3 = class135.field2406[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class276.field4746 >= 0 && var3 >= 0) {
            class61.field1189[class276.field4746] = var3;
            class276.field4746 = class276.field4746 + 1 & 0x7F;
            if (class276.field4746 == class199.field3414) {
                class276.field4746 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class35.field576 + 1 & 0x7F;
            if (class27.field439 != var4) {
                class131.field2337[class35.field576] = var3;
                class222.field3766[class35.field576] = -1;
                class35.field576 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 76)
    public static void method1499(int arg0) {
        field3580 = null;
        field3593 = null;
        field3578 = null;
        field3588 = null;
        if (arg0 >= -127) {
            field3589 = 93;
        }
    }

    @OriginalMember(owner = "client!kf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 89)
    public final synchronized void focusLost(FocusEvent arg0) {
        field3585++;
        if (class29.field477 != null) {
            class276.field4746 = -1;
        }
    }

    @OriginalMember(owner = "client!kf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 123)
    public final void focusGained(FocusEvent arg0) {
        field3581++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)[Lnm;", line = 138)
    public static final class176[] method1500(byte arg0) {
        class176[] var1 = new class176[class265.field4554];
        field3579++;
        int var2 = 0;
        int var3 = -74 / ((arg0 - 28) / 59);
        while (class265.field4554 > var2) {
            var1[var2] = new class176(class24.field400, class46.field755, class234.field3959[var2], class251.field4365[var2], class223.field3811[var2], class310.field5263[var2], class58.field969[var2], class236.field3985);
            var2++;
        }
        class251.method1803(-1);
        return var1;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)I", line = 214)
    public static final int method1501(int arg0, int arg1) {
        field3583++;
        if (arg0 != -10189) {
            return 63;
        }
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILkh;)V", line = 264)
    public static final void method1502(int arg0, class13 arg1) {
        field3577++;
        if (arg0 != 8) {
            return;
        }
        while (true) {
            while (arg1.field281 < arg1.field254.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method152((byte) -109) == 1) {
                    var3 = arg1.method152((byte) -78);
                    var4 = arg1.method152((byte) -103);
                    var2 = true;
                }
                int var5 = arg1.method152((byte) -99);
                int var6 = arg1.method152((byte) -126);
                int var7 = var5 * 64 - class251.field4360;
                int var8 = class232.field3923 + (class233.field3934 - 1) - var6 * 64;
                if (var7 >= 0 && (var8 - 63) >= 0 && class226.field3845 > var7 + 63 && var8 < class233.field3934) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && var3 * 8 + 8 > var11 && var4 * 8 <= var12 && var12 < (var4 * 8 + 8)) {
                                int var13 = arg1.method152((byte) -70);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method152((byte) -90);
                                        if (class122.field2192[var9][var10] == null) {
                                            class122.field2192[var9][var10] = new byte[4096];
                                        }
                                        class122.field2192[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method112((byte) 92);
                                        if (class270.field4665[var9][var10] == null) {
                                            class270.field4665[var9][var10] = new short[4096];
                                        }
                                        class270.field4665[var9][var10][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = ((arg1.method152((byte) -76) & 0xFF) << 16) + (arg1.method152((byte) -91) & 0xFF << 8) + (arg1.method152((byte) -119) & 0xFF);
                                        if (class62.field1209[var9][var10] == null) {
                                            class62.field1209[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class290 var17 = class172.method1207(var16, arg0 ^ 0xFFFFFF84);
                                        if (var17.field4993 != null) {
                                            var17 = var17.method2001(true);
                                            if (var17 == null || var17.field5007 == -1) {
                                                continue;
                                            }
                                        }
                                        class62.field1209[var9][var10][(63 - var12 << 6) + var11] = var17.field4962 + 1;
                                        class27 var18 = new class27();
                                        var18.field440 = var7;
                                        var18.field437 = var17.field5007;
                                        var18.field444 = var8;
                                        class117.field2134.method781(var18, 10751);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg1.method152((byte) -107);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field281++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field281 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field281 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!kf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 413)
    public final void keyTyped(KeyEvent arg0) {
        field3584++;
        if (class29.field477 != null) {
            int var2 = class195.method1372(-24, arg0);
            if (var2 >= 0) {
                int var3 = class35.field576 + 1 & 0x7F;
                if (class27.field439 != var3) {
                    class131.field2337[class35.field576] = -1;
                    class222.field3766[class35.field576] = var2;
                    class35.field576 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!kf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 454)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class29.field477 != null) {
            class43.field698 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class135.field2406.length) {
                var3 = class135.field2406[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class276.field4746 >= 0 && var3 >= 0) {
                class61.field1189[class276.field4746] = ~var3;
                class276.field4746 = class276.field4746 + 1 & 0x7F;
                if (class276.field4746 == class199.field3414) {
                    class276.field4746 = -1;
                }
            }
        }
        field3582++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[[FZIILfg;[[FIIFI[[III[[II[[FI)I", line = 483)
    public static final int method1503(int arg0, float[][] arg1, boolean arg2, int arg3, int arg4, class204 arg5, float[][] arg6, int arg7, int arg8, float arg9, int arg10, int[][] arg11, int arg12, int arg13, int[][] arg14, int arg15, float[][] arg16, int arg17) {
        if (arg17 != 16988) {
            field3580 = (class64) null;
        }
        field3590++;
        if (arg13 == 1) {
            int var19 = arg10;
            arg10 = arg4;
            arg4 = 128 - var19;
        } else if (arg13 == 2) {
            arg4 = 128 - arg4;
            arg10 = 128 - arg10;
        } else if (arg13 == 3) {
            int var18 = arg10;
            arg10 = 128 - arg4;
            arg4 = var18;
        }
        int var20;
        float var21;
        float var22;
        float var23;
        if (arg10 == 0 && arg4 == 0) {
            var20 = arg12;
            var21 = arg6[arg15][arg8];
            var22 = arg16[arg15][arg8];
            var23 = arg1[arg15][arg8];
        } else if (arg10 == 128 && arg4 == 0) {
            var23 = arg1[arg15 + 1][arg8];
            var20 = arg3;
            var21 = arg6[arg15 + 1][arg8];
            var22 = arg16[arg15 + 1][arg8];
        } else if (arg10 == 128 && arg4 == 128) {
            var23 = arg1[arg15 + 1][arg8 + 1];
            var22 = arg16[arg15 + 1][arg8 + 1];
            var21 = arg6[arg15 + 1][arg8 + 1];
            var20 = arg7;
        } else if (arg10 == 0 && arg4 == 128) {
            var21 = arg6[arg15][arg8 + 1];
            var23 = arg1[arg15][arg8 + 1];
            var22 = arg16[arg15][arg8 + 1];
            var20 = arg0;
        } else {
            float var24 = arg1[arg15][arg8];
            float var25 = arg6[arg15][arg8];
            float var26 = arg16[arg15][arg8];
            float var27 = (float) arg10 / 128.0F;
            float var28 = (arg6[arg15 + 1][arg8] - var25) * var27 + var25;
            float var29 = (arg1[arg15 + 1][arg8] - var24) * var27 + var24;
            float var30 = (arg16[arg15 + 1][arg8] - var26) * var27 + var26;
            float var31 = (float) arg4 / 128.0F;
            float var32 = arg1[arg15][arg8 + 1];
            float var33 = arg6[arg15][arg8 + 1];
            float var34 = (arg1[arg15 + 1][arg8 + 1] - var32) * var27 + var32;
            float var35 = (arg6[arg15 + 1][arg8 + 1] - var33) * var27 + var33;
            var21 = (var35 - var28) * var31 + var28;
            float var36 = arg16[arg15][arg8 + 1];
            var23 = (var34 - var29) * var31 + var29;
            float var37 = (arg16[arg15 + 1][arg8 + 1] - var36) * var27 + var36;
            var22 = (var37 - var30) * var31 + var30;
            int var38 = class15.method168(arg10, -27014, arg12, arg3);
            int var39 = class15.method168(arg10, arg17 ^ 0xFFFFD426, arg0, arg7);
            var20 = class15.method168(arg4, arg17 ^ 0xFFFFD426, var38, var39);
        }
        int var40 = (arg15 << 7) + arg10;
        int var41 = (arg8 << 7) + arg4;
        int var42 = class298.method2080(arg4, arg10, arg15, arg14, arg8, (byte) -34);
        return arg5.method1430(var40, var42, var41, var23, var21, var22, arg2 ? var20 & 0xFFFFFF00 : var20, arg11 == null ? 0.0F : (float) (var42 - class298.method2080(arg4, arg10, arg15, arg11, arg8, (byte) -49)) / arg9);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)I", line = 598)
    public static final int method1504(int arg0, int arg1) {
        field3586++;
        return arg0 >= -80 ? 44 : arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z[B)V", line = 613)
    public static final void method1505(boolean arg0, byte[] arg1) {
        field3591++;
        if (arg0) {
            return;
        }
        class13 var2 = new class13(arg1);
        var2.field281 += 2;
        int var3 = var2.method152((byte) -119);
        if (var3 != 1) {
            return;
        }
        boolean var4 = var2.method152((byte) -78) == 1;
        if (var4) {
            class9.method81((byte) 34, var2);
        }
        class307.method2137(var2, (byte) 48);
    }
}
