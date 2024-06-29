import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class88 extends class162 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "[Z")
    private boolean[] field1250 = new boolean[112];

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "Lsf;")
    public static class398 field1245 = new class398();

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "[I")
    public static int[] field1252 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "Lrg;")
    public static class406 field1254 = new class406("runescape", 0);

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "Lda;")
    private class310 field1238;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "Lda;")
    private class310 field1249;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "Lda;")
    private class310 field1253;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "Ljava/awt/Component;")
    private Component field1246;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)V")
    public static void method573(byte arg0) {
        if (arg0 != 32) {
            method584(-18, (class261) null, (class228) null, 59, -63, (class227) null);
        }
        field1245 = null;
        field1252 = null;
        field1254 = null;
    }

    @OriginalMember(owner = "client!bk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1243++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IILjava/awt/event/KeyEvent;)V")
    private final void method574(int arg0, int arg1, KeyEvent arg2) {
        field1256++;
        int var4 = arg2.getKeyCode();
        int var5;
        if (arg0 == var4) {
            var5 = 0;
        } else if (var4 >= 0 && class253.field3866.length > var4) {
            int var6 = class253.field3866[var4];
            if (arg1 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method582(false, var5, arg1, '\u0000');
            arg2.consume();
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V")
    public static final void method575(int arg0, int arg1) {
        field1257++;
        int var2 = class26.field332 - class414.field6156;
        if (var2 >= 100) {
            class80.field1054 = 1;
            return;
        }
        int var3 = (int) class188.field2811;
        if (var3 < class198.field3007 >> 8) {
            var3 = class198.field3007 >> 8;
        }
        if (class79.field1038[4] && var3 < class161.field2245[4] + 128) {
            var3 = class161.field2245[4] + 128;
        }
        int var4 = (int) class462.field6810 + class240.field3601 & 0x3FFF;
        class433.method2664(class103.field1401, var4, (var3 >> 3) * 3 + 600, class136.field1804, (byte) -1, var3, arg0 + class437.method2686(class143.field1911, 0, class113.field1500.field1892, class113.field1500.field1900), arg1);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class350.field5204 = (int) ((float) (class350.field5204 - class411.field6114) * var5 + (float) class411.field6114);
        class185.field2790 = (int) ((float) (class185.field2790 - class363.field5348) * var5 + (float) class363.field5348);
        class127.field1626 = (int) ((float) (class127.field1626 - class374.field5449) * var5 + (float) class374.field5449);
        class196.field2967 = (int) ((float) (class196.field2967 - class75.field1014) * var5 + (float) class75.field1014);
        int var6 = class201.field3037 - class341.field5109;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class201.field3037 = (int) ((float) var6 * var5 + (float) class341.field5109);
        class201.field3037 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)Lol;")
    public final class174 method576(byte arg0) {
        field1248++;
        if (arg0 != -86) {
            field1263 = -70;
        }
        class310 var2;
        for (var2 = this.field1249; var2 != null && var2.field4667 == -1; var2 = var2.field4674) {
        }
        if (var2 == null) {
            this.field1249 = null;
        } else {
            this.field1249 = var2.field4674;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bk", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method574(0, 0, arg0);
        field1244++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    private final void method577(Component arg0, byte arg1) {
        field1260++;
        this.method581(true);
        this.field1246 = arg0;
        Method var3 = class239.field3590;
        int var4 = 56 % ((arg1 + 7) / 47);
        if (var3 != null) {
            try {
                var3.invoke(this.field1246, Boolean.FALSE);
            } catch (Throwable var5) {
            }
        }
        this.field1246.addKeyListener(this);
        this.field1246.addFocusListener(this);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)Z")
    public final boolean method578(boolean arg0, int arg1) {
        field1241++;
        if (arg1 >= 0 && arg1 < 112) {
            return arg0 ? true : this.field1250[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIIIBII)V")
    public static final void method579(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        field1240++;
        if (arg0 < 128 || arg1 < 128 || (class115.field1522 * 128 - 256) < arg0 || arg1 > (class198.field3004 - 2) * 128) {
            class212.field3189[0] = class212.field3189[1] = -1;
            return;
        }
        int var10 = class437.method2686(arg3, 0, arg1, arg0) - arg8;
        class94.field1312.method604(arg6, 0, 0);
        int var11 = 17 / ((-arg7 - 66) / 59);
        class196.field2965.method397(class94.field1312);
        class196.field2965.method402(arg0, var10, arg1, class212.field3189);
        class94.field1312.method604(-arg6, 0, 0);
        class196.field2965.method397(class94.field1312);
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
    public final void method580(int arg0) {
        field1242++;
        this.method581(true);
        if (arg0 != -21396) {
            method575(33, 36);
        }
    }

    @OriginalMember(owner = "client!bk", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method574(0, 1, arg0);
        field1239++;
    }

    @OriginalMember(owner = "client!bk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method582(false, 0, -1, '\u0000');
        field1247++;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(Z)V")
    private final void method581(boolean arg0) {
        field1261++;
        if (this.field1246 == null) {
            return;
        }
        this.field1246.removeKeyListener(this);
        this.field1246.removeFocusListener(this);
        this.field1246 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field1250[var2] = false;
        }
        this.field1253 = null;
        if (!arg0) {
            field1254 = null;
        }
        this.field1238 = null;
        this.field1249 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZIIC)V")
    private final void method582(boolean arg0, int arg1, int arg2, char arg3) {
        field1258++;
        class310 var5 = new class310();
        if (arg0) {
            this.keyReleased((KeyEvent) null);
        }
        var5.field4676 = arg3;
        var5.field4667 = arg2;
        var5.field4662 = arg1;
        var5.field4660 = class445.method2750(-27580);
        if (this.field1238 == null) {
            this.field1253 = var5;
        } else {
            this.field1238.field4674 = var5;
        }
        this.field1238 = var5;
    }

    @OriginalMember(owner = "client!bk", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field1251++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class189.method1148((byte) 119, var2)) {
            this.method582(false, -1, 2, var2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public final synchronized void method583(int arg0) {
        if (arg0 != 1) {
            this.field1249 = null;
        }
        field1259++;
        for (class310 var2 = this.field1253; var2 != null; var2 = var2.field4674) {
            if (var2.field4667 == 0) {
                if (var2.field4662 >= 0) {
                    var2.field4657 = !this.field1250[var2.field4662];
                }
                this.field1250[var2.field4662] = true;
            } else if (var2.field4667 == 1) {
                this.field1250[var2.field4662] = false;
            } else if (var2.field4667 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field1250[var3] = false;
                }
            }
        }
        this.field1249 = this.field1253;
        this.field1238 = null;
        this.field1253 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILdr;Lfc;IILdh;)Z")
    public static final boolean method584(int arg0, class261 arg1, class228 arg2, int arg3, int arg4, class227 arg5) {
        field1255++;
        if (arg0 != -19168) {
            field1263 = -49;
        }
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg2.field3474 != null) {
            var9 = class223.field3393 - (arg2.field3485 - (class223.field3406 - arg5.field3434)) * (class223.field3393 - class223.field3398) / (class223.field3395 - class223.field3406);
            var8 = class223.field3393 - ((arg2.field3476 + arg5.field3434 - class223.field3406) * (class223.field3393 - class223.field3398) / (class223.field3395 - class223.field3406));
            var7 = (arg2.field3484 + arg5.field3442 - class223.field3391) * (class223.field3412 - class223.field3410) / (class223.field3397 - class223.field3391) + class223.field3410;
            var6 = (class223.field3412 - class223.field3410) * (arg5.field3442 + arg2.field3460 - class223.field3391) / (class223.field3397 - class223.field3391) + class223.field3410;
        }
        class234 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg2.field3454 != -1) {
            if (arg5.field3436 && arg2.field3446 != -1) {
                var10 = arg2.method1381(arg1, true, 6234);
            } else {
                var10 = arg2.method1381(arg1, false, 6234);
            }
            if (var10 != null) {
                var11 = arg5.field3441 - (var10.method1226() + 1 >> 1);
                var12 = arg5.field3441 + (var10.method1226() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var13 = arg5.field3439 - (var10.method1219() + 1 >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                var14 = arg5.field3439 + (var10.method1219() + 1 >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class290 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg2.field3489 != null) {
            var15 = class451.method2774(arg2.field3463, (byte) -58);
            if (var15 != null) {
                var16 = class148.field2044.method1698((int[]) null, (class234[]) null, (byte) 117, arg2.field3489, class362.field5332);
                int var23 = arg5.field3439;
                if (var10 == null) {
                    var17 = var23 - var15.method1799() * var16 / 2;
                } else {
                    var17 = var23 - ((var10.method1219() >> 1) + (var16 * var15.method1795()));
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class362.field5332[var24];
                    if ((var16 - 1) > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method1796(var25);
                    if (var26 > var18) {
                        var18 = var26;
                    }
                }
                var19 = arg4 + arg5.field3441 - (var18 / 2);
                if (var6 > var19) {
                    var6 = var19;
                }
                var20 = var18 / 2 + arg5.field3441 + arg4;
                var21 = arg3 + var17;
                if (var20 > var7) {
                    var7 = var20;
                }
                var22 = arg3 + var16 * var15.method1795() + var17;
                if (var21 < var8) {
                    var8 = var21;
                }
                if (var9 < var22) {
                    var9 = var22;
                }
            }
        }
        if (var7 < class223.field3410 || var6 > class223.field3412 || class223.field3398 > var9 || var8 > class223.field3393) {
            return true;
        }
        if (arg2.field3474 != null) {
            int[] var27 = new int[arg2.field3474.length];
            for (int var28 = 0; var28 < var27.length / 2; var28++) {
                int var30 = arg2.field3474[var28 * 2] + arg5.field3442;
                int var31 = arg2.field3474[var28 * 2 + 1] + arg5.field3434;
                var27[var28 * 2] = (class223.field3412 - class223.field3410) * (var30 - class223.field3391) / (class223.field3397 - class223.field3391) + class223.field3410;
                var27[var28 * 2 + 1] = class223.field3393 - ((var31 - class223.field3406) * (class223.field3393 - class223.field3398) / (class223.field3395 - class223.field3406));
            }
            class182.method1103(arg1, var27, arg2.field3486);
            for (int var29 = 0; var29 < (var27.length / 2 - 1); var29++) {
                arg1.method1612((byte) 13, var27[var29 * 2 + 1 + 2], var27[var29 * 2 + 1], var27[var29 * 2], arg2.field3458, var27[(var29 + 1) * 2]);
            }
            arg1.method1612((byte) 13, var27[1], var27[var27.length - 1], var27[var27.length - 2], arg2.field3458, var27[0]);
        }
        if (var10 != null) {
            if (class354.field5228 > 0 && (class327.field4919 != -1 && class327.field4919 == arg5.field3437 || class71.field911 != -1 && class71.field911 == arg2.field3487)) {
                int var32;
                if (class426.field6263 <= 50) {
                    var32 = class426.field6263 * 2;
                } else {
                    var32 = (100 - class426.field6263) * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg1.method1616(arg5.field3439, (byte) 123, arg5.field3441, var33, var10.method1227() / 2 + 7);
                arg1.method1616(arg5.field3439, (byte) 117, arg5.field3441, var33, var10.method1227() / 2 + 5);
                arg1.method1616(arg5.field3439, (byte) 113, arg5.field3441, var33, var10.method1227() / 2 + 3);
                arg1.method1616(arg5.field3439, (byte) 116, arg5.field3441, var33, var10.method1227() / 2 + 1);
                arg1.method1616(arg5.field3439, (byte) 125, arg5.field3441, var33, var10.method1227() / 2);
            }
            var10.method1408(arg5.field3441 - (var10.method1226() >> 1), arg5.field3439 - (var10.method1219() >> 1));
        }
        if (arg2.field3489 != null && var15 != null) {
            class50.method284(var15, arg5, true, arg1, arg2, var18, var16, var17);
        }
        if (arg2.field3454 != -1 || arg2.field3489 != null) {
            class245 var34 = new class245(arg5);
            var34.field3675 = var12;
            var34.field3671 = var21;
            var34.field3674 = var19;
            var34.field3672 = var14;
            var34.field3673 = var22;
            var34.field3678 = var13;
            var34.field3677 = var20;
            var34.field3667 = var11;
            class298.field4502.method2504(arg0 + 19210, var34);
        }
        return false;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "()V")
    public static final void method585() {
        for (int var0 = 0; var0 < class15.field190; var0++) {
            class141 var1 = class360.field5318[var0];
            class153.method944(var1);
            class360.field5318[var0] = null;
        }
        class15.field190 = 0;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class88(Component arg0) {
        class220.method1338(true);
        this.method577(arg0, (byte) -117);
    }

    static {
        new class151("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        field1262 = 503;
        field1263 = 0;
    }
}
