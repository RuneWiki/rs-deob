import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class148 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field2527 = 0;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Lne;")
    public static class262 field2523;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "[[B")
    public static byte[][] field2516;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)Ltk;", line = 3)
    public static final class278 method1060(int arg0, int arg1, int arg2) {
        if (arg1 < 0 || arg1 >= class224.field3701 || arg2 < 0 || arg2 >= class280.field4578) {
            return null;
        }
        class312 var3 = class353.field5644[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        class278 var4 = null;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < var3.field5078; var7++) {
            class278 var8 = var3.field5089[var7];
            if ((var8.field4527 >> 29 & 0x3L) <= 1L && var8.field4523 == arg1 && var8.field4530 == arg2 && (var8.field4525 > var5 || var8.field4544 > var6)) {
                var4 = var8;
                var5 = var8.field4525;
                var6 = var8.field4544;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIZI[BII[Lrm;II)V", line = 47)
    public static final void method1061(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte[] arg5, int arg6, int arg7, class273[] arg8, int arg9, int arg10) {
        if (arg4 != -11286) {
            method1065((char) 65409, -92);
        }
        field2521++;
        class146 var11 = new class146(arg5);
        int var12 = -1;
        while (true) {
            int var13 = var11.method1016((byte) 53);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1020(true);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method1005((byte) 122);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg0 == var18 && arg1 <= var17 && arg1 + 8 > var17 && arg7 <= var16 && var16 < arg7 + 8) {
                    class238 var22 = class1.method7(var12, 25);
                    int var23 = arg9 + class108.method810(var17 & 0x7, arg2, -71, var20, var22.field3935, var16 & 0x7, var22.field3890);
                    int var24 = class39.method290(64, var16 & 0x7, var17 & 0x7, var22.field3935, var22.field3890, arg2, var20) + arg10;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class273 var25 = null;
                        if (!arg3) {
                            int var26 = arg6;
                            if ((class282.field4615[1][var23][var24] & 0x2) == 2) {
                                var26 = arg6 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg8[var26];
                            }
                        }
                        class227.method1579(arg6, var23, !arg3, -15255, arg2 + var20 & 0x3, var24, var21, var12, arg3, var25, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 129)
    public static void method1062(int arg0) {
        field2523 = null;
        if (arg0 != -1) {
            field2523 = (class262) null;
        }
        field2516 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZII[[F[[FZ[[FI[[I[ILwl;IZ[ZI[[IBIZZI)V", line = 142)
    public static final void method1063(int arg0, boolean arg1, int arg2, int arg3, float[][] arg4, float[][] arg5, boolean arg6, float[][] arg7, int arg8, int[][] arg9, int[] arg10, class102 arg11, int arg12, boolean arg13, boolean[] arg14, int arg15, int[][] arg16, byte arg17, int arg18, boolean arg19, boolean arg20, int arg21) {
        field2524++;
        int var22 = (arg1 ? 255 : 0) + (arg12 << 8);
        int var23 = (arg0 << 8) + (arg13 ? 255 : 0);
        int var24 = (arg2 << 8) + (arg20 ? 255 : 0);
        int var25 = (arg21 << 8) + (arg6 ? 255 : 0);
        int[] var26 = new int[arg10.length / 2];
        int var27 = 0;
        if (!arg19) {
            method1061(94, -46, -8, true, -7, (byte[]) null, 109, -75, (class273[]) null, 83, 64);
        }
        while (var26.length > var27) {
            int var28 = arg10[var27 + var27 + 1];
            int var29 = arg10[var27 + var27];
            int[][] var30 = arg16 == null || arg14 == null || !arg14[var27] ? arg9 : arg16;
            var26[var27] = class205.method1397(arg16, arg4, false, (float) arg18, var23, var28, arg5, arg15, (byte) 32, var24, var30, var22, arg17, arg8, var29, arg11, var25, arg7);
            var27++;
        }
        arg11.method771(arg3, arg15, arg8, var26, (int[]) null, false);
    }

    @OriginalMember(owner = "client!qa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 178)
    public final void focusGained(FocusEvent arg0) {
        field2522++;
    }

    @OriginalMember(owner = "client!qa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 192)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class181.field3149 != null) {
            class173.field2880 = -1;
        }
        field2518++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZIJI)Ljava/lang/String;", line = 206)
    public static final String method1064(int arg0, boolean arg1, int arg2, long arg3, int arg4) {
        field2528++;
        char var6 = '.';
        char var7 = ',';
        boolean var8 = false;
        StringBuffer var9 = new StringBuffer(26);
        if (arg2 == 0) {
            var6 = ',';
            var7 = '.';
        }
        if (arg2 == 2) {
            var6 = ' ';
        }
        if (arg3 < 0L) {
            var8 = true;
            arg3 = -arg3;
        }
        if (arg0 > 0) {
            for (int var10 = 0; var10 < arg0; var10++) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg3 * 10)));
            }
            var9.append(var7);
        }
        if (arg4 < 81) {
            method1065((char) 65480, 80);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg3;
            arg3 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg3 * 10));
            if (arg3 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg1) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(CI)B", line = 288)
    public static final byte method1065(char arg0, int arg1) {
        if (arg1 != -1) {
            field2526 = 48;
        }
        field2517++;
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qa", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 413)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2519++;
        if (class181.field3149 == null) {
            return;
        }
        class235.field3855 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class177.field2924.length > var2) {
            var3 = class177.field2924[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class173.field2880 >= 0 && var3 >= 0) {
            class112.field2042[class173.field2880] = var3;
            class173.field2880 = class173.field2880 + 1 & 0x7F;
            if (class220.field3644 == class173.field2880) {
                class173.field2880 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class200.field3360 + 1 & 0x7F;
            if (class356.field5677 != var4) {
                class252.field4146[class200.field3360] = var3;
                class323.field5234[class200.field3360] = '\u0000';
                class200.field3360 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!qa", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 470)
    public final void keyTyped(KeyEvent arg0) {
        if (class181.field3149 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class44.method370(var2, 160)) {
                int var3 = class200.field3360 + 1 & 0x7F;
                if (class356.field5677 != var3) {
                    class252.field4146[class200.field3360] = -1;
                    class323.field5234[class200.field3360] = var2;
                    class200.field3360 = var3;
                }
            }
        }
        arg0.consume();
        field2529++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 500)
    public static final int method1066(String arg0, byte arg1) {
        if (arg1 == 57) {
            field2525++;
            return arg0.length() + 1;
        } else {
            return 118;
        }
    }

    @OriginalMember(owner = "client!qa", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 511)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field2520++;
        if (class181.field3149 != null) {
            class235.field3855 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class177.field2924.length) {
                var3 = class177.field2924[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class173.field2880 >= 0 && var3 >= 0) {
                class112.field2042[class173.field2880] = ~var3;
                class173.field2880 = class173.field2880 + 1 & 0x7F;
                if (class220.field3644 == class173.field2880) {
                    class173.field2880 = -1;
                }
            }
        }
        arg0.consume();
    }
}
