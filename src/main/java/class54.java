import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class54 extends class159 {

    @OriginalMember(owner = "client!di", name = "s", descriptor = "I")
    public static int field815 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "B")
    public byte field810;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    public int field819;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "Ljava/lang/String;")
    public String field808;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "Ljava/lang/String;")
    public String field812;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "[I")
    public static int[] field813;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 6)
    public static final boolean method386(int arg0, String arg1) {
        if (arg0 == 10) {
            field814++;
            return class270.method1907(10, true, arg1, (byte) -42);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZIIILsm;IIILsb;IIIII)Lsm;", line = 17)
    public static final class128 method387(boolean arg0, int arg1, int arg2, int arg3, class128 arg4, int arg5, int arg6, int arg7, class131 arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field818++;
        long var14 = ((long) arg2 << 48) + ((long) ((arg7 << 16) + (arg11 << 24) + arg6) + ((long) arg3 << 32));
        class128 var16 = (class128) class268.field4419.method652(var14, false);
        if (var16 == null) {
            byte var17;
            if (arg6 == 1) {
                var17 = 9;
            } else if (arg6 == 2) {
                var17 = 12;
            } else if (arg6 == 3) {
                var17 = 15;
            } else if (arg6 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            class135 var19 = new class135(var17 * var18 + 1, var17 * 2 * var18 + -var17, 0);
            int[] var20 = new int[] { 64, 96, 128 };
            int[][] var21 = new int[var18][var17];
            int var22 = var19.method928(0, 0, 0);
            for (int var23 = 0; var23 < var18; var23++) {
                int var24 = var20[var23];
                int var25 = var20[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = arg5 + (class272.field4470[var27] * var24) >> 16;
                    int var29 = class272.field4480[var27] * var25 + arg9 >> 16;
                    var21[var23][var26] = var19.method928(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var18; var30++) {
                int var31 = (var30 * 256 + 128) / var18;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg7 * var32 + arg11 * var31 >> 8);
                short var34 = (short) (((arg2 & 0x7F) * var31 + (arg3 & 0x7F) * var32 & 0x7F00) + ((arg2 & 0xFC00) * var31 + (arg3 & 0xFC00) * var32 & 0xFC0000) + ((arg2 & 0x380) * var31 + (arg3 & 0x380) * var32 & 0x38000) >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var19.method919(var22, var21[0][(var35 + 1) % var17], var21[0][var35], (byte) 1, var34, var33);
                    } else {
                        var19.method919(var21[var30 - 1][var35], var21[var30 - 1][(var35 + 1) % var17], var21[var30][(var35 + 1) % var17], (byte) 1, var34, var33);
                        var19.method919(var21[var30 - 1][var35], var21[var30][(var35 + 1) % var17], var21[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var19.method906(64, 768, -50, -10, -50);
            class268.field4419.method642(var16, var14, -100);
        }
        int var36 = arg6 * 64 - 1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = arg4.method174();
        int var40 = -var36;
        int var41 = arg4.method186();
        if (arg12 >= -22) {
            field809 = 120;
        }
        int var42 = arg4.method154();
        int var43 = var36;
        if (arg0) {
            if (arg1 > 1152 && arg1 < 1920) {
                var43 = var36 + 128;
            }
            if (arg1 > 128 && arg1 < 896) {
                var37 -= 128;
            }
            if (arg1 > 640 && arg1 < 1408) {
                var38 = var36 + 128;
            }
            if (arg1 > 1664 || arg1 < 384) {
                var40 -= 128;
            }
        }
        if (var41 > var43) {
            var41 = var43;
        }
        if (var37 > var39) {
            var39 = var37;
        }
        if (var40 > var42) {
            var42 = var40;
        }
        class146 var44 = null;
        int var45 = arg4.method183();
        if (var38 < var45) {
            var45 = var38;
        }
        if (arg8 != null) {
            int var46 = arg8.field1988[arg10];
            var44 = class17.method114(var46 >> 16, false);
            arg10 = var46 & 0xFFFF;
        }
        class128 var47;
        if (var44 == null) {
            var47 = var16.method198(true, true, true);
            var47.method169((var41 - var39) / 2, 128, (var45 - var42) / 2);
            var47.method140((var39 + var41) / 2, 0, (var42 + var45) / 2);
        } else {
            var47 = var16.method198(!var44.method1041(arg10, 0), !var44.method1040(14678, arg10), true);
            var47.method169((var41 - var39) / 2, 128, (var45 - var42) / 2);
            var47.method140((var39 + var41) / 2, 0, (var42 + var45) / 2);
            var47.method839(var44, arg10);
        }
        if (arg1 != 0) {
            var47.method149(arg1);
        }
        if (class245.field3886) {
            class22 var50 = (class22) var47;
            if (client.method889(arg5 + var39, class120.field1779, arg9 + var42, -106) != arg13 || client.method889(arg5 + var41, class120.field1779, arg9 + var45, -115) != arg13) {
                for (int var51 = 0; var51 < var50.field280; var51++) {
                    var50.field301[var51] += client.method889(var50.field306[var51] + arg5, class120.field1779, var50.field279[var51] + arg9, -108) - arg13;
                }
                var50.field286.field2516 = false;
                var50.field295.field4822 = false;
            }
        } else {
            class67 var48 = (class67) var47;
            if (client.method889(arg5 + var39, class120.field1779, arg9 + var42, -115) != arg13 || client.method889(arg5 + var41, class120.field1779, arg9 + var45, -105) != arg13) {
                for (int var49 = 0; var49 < var48.field967; var49++) {
                    var48.field969[var49] += client.method889(var48.field973[var49] + arg5, class120.field1779, var48.field990[var49] + arg9, -119) - arg13;
                }
                var48.field982 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V", line = 251)
    public static final void method388(boolean arg0) {
        class84.field1208 = null;
        class320.field5273 = (byte[][][]) null;
        class109.field1615 = null;
        class197.field3034 = null;
        class183.field2846 = null;
        class116.field1696 = null;
        if (arg0) {
            return;
        }
        class6.field72 = (byte[][][]) null;
        class56.field867 = (byte[][][]) null;
        class15.field192 = null;
        field821++;
        class109.field1614 = (int[][][]) null;
        class180.field2806 = (byte[][][]) null;
        class151.field2430 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(III)I", line = 273)
    public static final int method389(int arg0, int arg1, int arg2) {
        if (arg2 != 18678) {
            method393((byte) 33, -36L);
        }
        field811++;
        int var3 = arg0 >> 31 & arg1 - 1;
        return ((arg0 >>> 31) + arg0) % arg1 + var3;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lnm;ZI)Llj;", line = 288)
    public static final class289 method390(class221 arg0, boolean arg1, int arg2) {
        field822++;
        if (arg1) {
            return (class289) null;
        } else if (class358.method2493((byte) -90, arg0, arg2)) {
            return class125.method809(-110);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lil;Lwm;B)Ljb;", line = 308)
    public static final class226 method391(class4 arg0, class266 arg1, byte arg2) {
        int var3 = 53 % ((arg2 + 29) / 47);
        field816++;
        long var4 = ((long) arg1.field4378 << 32) + ((long) arg1.field4382 << 56) + (long) ((arg1.field4386 + 1 << 16) - -arg1.field4381);
        class226 var6 = (class226) arg0.method29(var4, 103);
        if (var6 == null) {
            var6 = new class226(arg1.field4386, (float) arg1.field4381, true, false, arg1.field4378);
            arg0.method37(false, var6, var4);
        }
        return var6;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V", line = 328)
    public static void method392(byte arg0) {
        if (arg0 != -63) {
            method390((class221) null, true, -58);
        }
        field813 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BJ)V", line = 338)
    public static final void method393(byte arg0, long arg1) {
        if (!class307.field5005) {
            class285.field4676 += (float) arg1 * class117.field1712 / 40.0F;
            class355.field5628 += (float) arg1 * class41.field629 / 40.0F;
        }
        field820++;
        if (arg0 < 117) {
            method391((class4) null, (class266) null, (byte) 28);
        }
        int var3 = class198.field3044 + class329.field5388.field4796;
        int var4 = class329.field5388.field4783 + class294.field4897;
        if (class249.field3957 - var3 < -500 || class249.field3957 - var3 > 500 || (class343.field5516 - var4) < -500 || (class343.field5516 - var4) > 500) {
            class249.field3957 = var3;
            class343.field5516 = var4;
        }
        if (class249.field3957 != var3) {
            int var5 = var3 - class249.field3957;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class249.field3957 += var6;
        }
        if (class343.field5516 != var4) {
            int var7 = var4 - class343.field5516;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class343.field5516 += var8;
        }
        class126.method819(true);
    }
}
