import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class179 {

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "I")
    public int field2611;

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "Loh;")
    public static class549 field2601 = null;

    @OriginalMember(owner = "client!hca", name = "h", descriptor = "Lbv;")
    public static class567 field2607 = new class567("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "I")
    public static int field2612 = 0;

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!hca", name = "f", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!hca", name = "g", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!hca", name = "i", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "Lgp;")
    public static class561 field2600;

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "[[B")
    public static byte[][] field2602;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(ZIZLbo;Lbo;)I", line = 8)
    public static final int method1213(boolean arg0, int arg1, boolean arg2, class225 arg3, class225 arg4) {
        field2604++;
        if (arg1 == 1) {
            int var5 = arg4.field583;
            int var6 = arg3.field583;
            if (!arg2) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg1 == 2) {
            return class268.method1743(arg3.method1497(0).field3884, 0, class538.field7500, arg4.method1497(0).field3884);
        } else if (arg1 == 3) {
            if (arg4.field3362.equals("-")) {
                if (arg3.field3362.equals("-")) {
                    return 0;
                } else if (arg2) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field3362.equals("-")) {
                return arg2 ? 1 : -1;
            } else {
                return class268.method1743(arg3.field3362, 0, class538.field7500, arg4.field3362);
            }
        } else if (arg1 == 4) {
            if (arg4.method380(8)) {
                return arg3.method380(8) ? 0 : 1;
            } else if (arg3.method380(8)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 != 5) {
            if (!arg0) {
                field2612 = -78;
            }
            if (arg1 == 6) {
                if (arg4.method379(28149)) {
                    return arg3.method379(28149) ? 0 : 1;
                } else if (arg3.method379(28149)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg1 == 7) {
                if (arg4.method377(123)) {
                    return arg3.method377(95) ? 0 : 1;
                } else if (arg3.method377(55)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg1 == 8) {
                int var7 = arg4.field3358;
                int var8 = arg3.field3358;
                if (arg2) {
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                } else {
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg4.field3364 - arg3.field3364;
            }
        } else if (arg4.method381((byte) 81)) {
            return arg3.method381((byte) -125) ? 0 : 1;
        } else if (arg3.method381((byte) 3)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hca", name = "toString", descriptor = "()Ljava/lang/String;", line = 104)
    public final String toString() {
        field2609++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Loh;IZI)V", line = 113)
    public static final void method1214(class549 arg0, int arg1, boolean arg2, int arg3) {
        field2608++;
        if (arg0.field7720 == 0) {
            arg0.field7687 = arg0.field7670;
        } else if (arg0.field7720 == 1) {
            arg0.field7687 = (arg3 - arg0.field7776) / 2 + arg0.field7670;
        } else if (arg0.field7720 == 2) {
            arg0.field7687 = arg3 - arg0.field7776 - arg0.field7670;
        } else if (arg0.field7720 == 3) {
            arg0.field7687 = arg0.field7670 * arg3 >> 14;
        } else if (arg0.field7720 == 4) {
            arg0.field7687 = (arg3 - arg0.field7776) / 2 + (arg0.field7670 * arg3 >> 14);
        } else {
            arg0.field7687 = arg3 - (arg0.field7670 * arg3 >> 14) - arg0.field7776;
        }
        if (arg0.field7628 == 0) {
            arg0.field7631 = arg0.field7765;
        } else if (arg0.field7628 == 1) {
            arg0.field7631 = (arg1 - arg0.field7678) / 2 + arg0.field7765;
        } else if (arg0.field7628 == 2) {
            arg0.field7631 = arg1 - arg0.field7765 - arg0.field7678;
        } else if (arg0.field7628 == 3) {
            arg0.field7631 = arg0.field7765 * arg1 >> 14;
        } else if (arg0.field7628 == 4) {
            arg0.field7631 = (arg1 - arg0.field7678) / 2 + (arg0.field7765 * arg1 >> 14);
        } else {
            arg0.field7631 = arg1 - arg0.field7678 - (arg0.field7765 * arg1 >> 14);
        }
        if (class640.field9285 && (client.method3530(arg0).field7595 != 0 || arg0.field7749 == 0)) {
            if (arg0.field7687 < 0) {
                arg0.field7687 = 0;
            } else if (arg3 < arg0.field7776 + arg0.field7687) {
                arg0.field7687 = arg3 - arg0.field7776;
            }
            if (arg0.field7631 < 0) {
                arg0.field7631 = 0;
            } else if (arg1 < (arg0.field7678 + arg0.field7631)) {
                arg0.field7631 = arg1 - arg0.field7678;
            }
        }
        if (!arg2) {
            method1214(null, -18, true, 19);
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lgb;Lfm;ILqa;)V", line = 197)
    public static final void method1215(class153 arg0, class192 arg1, int arg2, class167 arg3) {
        field2605++;
        class116 var4 = arg1.method1271(0, arg3);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method962();
        if (var4.method968() > var5) {
            var5 = var4.method968();
        }
        byte var6 = 10;
        int var7 = arg0.field2304;
        int var8 = arg0.field2303;
        int var9 = 0;
        if (arg2 != -3) {
            method1214(null, -100, true, 116);
        }
        int var10 = 0;
        int var11 = 0;
        if (arg1.field2753 != null) {
            var9 = class258.field3751.method3660(arg1.field2753, 4, null, null, class609.field8658);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class609.field8658[var12];
                if ((var9 - 1) > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class471.field6773.method2779(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = var9 * class471.field6773.method2777() + (class471.field6773.method2776() / 2);
        }
        int var15 = arg0.field2304 + (var5 / 2);
        if (class212.field3122 + var5 > var7) {
            var15 = var5 / 2 + class212.field3122 + var10 / 2 + var6 + 5;
            var7 = class212.field3122;
        } else if (var7 > class212.field3111 - var5) {
            var7 = class212.field3111 - var5;
            var15 = class212.field3111 - (var10 / 2) - (var5 / 2) - var6 - 5;
        }
        int var16 = arg0.field2303;
        if (var8 < (class212.field3123 + var5)) {
            var8 = class212.field3123;
            var16 = class212.field3123 - (-var6 - var5 / 2);
        } else if ((class212.field3109 - var5) < var8) {
            var8 = class212.field3109 - var5;
            var16 = class212.field3109 - (var5 / 2) - var6 - var11;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg0.field2304), (double) (var8 - arg0.field2303)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method965((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg1.field2753 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var20 = var10 + var18 + 10;
            var21 = var16 - (-(class471.field6773.method2777() * var9) - 3);
            if (arg1.field2749 != 0) {
                arg3.method1159(arg1.field2749, var21 - var16, var16, var18, (byte) -52, var20 - var18);
            }
            if (arg1.field2774 != 0) {
                arg3.method1156(true, var16, var21 - var16, arg1.field2774, var18, var20 - var18);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class609.field8658[var22];
                if ((var9 - 1) > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class471.field6773.method2775(arg3, var23, var15, var16, arg1.field2760, true);
                var16 += class471.field6773.method2777();
            }
        }
        if (arg1.field2747 == -1 && arg1.field2753 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class345 var25 = new class345(arg0);
        var25.field4940 = var19;
        var25.field4943 = var7 + var24;
        var25.field4941 = var8 - var24;
        var25.field4948 = var8 + var24;
        var25.field4945 = var7 - var24;
        var25.field4942 = var18;
        var25.field4947 = var21;
        var25.field4938 = var20;
        class97.field1694.method414(var25, (byte) 114);
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)I", line = 347)
    public final int method1216(int arg0) {
        int var2 = -49 % ((64 - arg0) / 41);
        field2606++;
        return this.field2611;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)I", line = 357)
    public static final int method1217(int arg0, int arg1) {
        field2610++;
        if (arg0 != -4) {
            field2601 = null;
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 373)
    public class179(String arg0, int arg1) {
        this.field2611 = arg1;
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)V", line = 384)
    public static void method1218(int arg0) {
        if (arg0 != 0) {
            field2600 = null;
        }
        field2600 = null;
        field2607 = null;
        field2601 = null;
        field2602 = null;
    }
}
