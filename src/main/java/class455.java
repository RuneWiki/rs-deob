import jaggl.memory.NativeStream;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class455 extends class91 {

    @OriginalMember(owner = "client!rp", name = "Kb", descriptor = "Z")
    public static boolean field6680 = false;

    @OriginalMember(owner = "client!rp", name = "Ob", descriptor = "I")
    public static int field6684 = 64;

    @OriginalMember(owner = "client!rp", name = "Mb", descriptor = "Lpg;")
    public static class492 field6682 = new class492(68, 16);

    @OriginalMember(owner = "client!rp", name = "Pb", descriptor = "Lpg;")
    public static class492 field6685 = new class492(94, -1);

    @OriginalMember(owner = "client!rp", name = "U", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!rp", name = "Gb", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!rp", name = "Hb", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!rp", name = "Ib", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!rp", name = "Jb", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!rp", name = "Lb", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!rp", name = "Qb", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!rp", name = "Nb", descriptor = "[Lna;")
    public static class206[] field6683;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "(Z)V")
    public static void method2736(boolean arg0) {
        field6682 = null;
        field6683 = null;
        if (!arg0) {
            field6683 = null;
        }
        field6685 = null;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IF)V")
    public final void method2737(int arg0, float arg1) {
        if (arg0 > -76) {
            this.method2741(50, 0.5653407F);
        }
        ++field6676;
        int var3 = NativeStream.floatToRawIntBits(arg1);
        super.field1277[super.field1292++] = (byte) var3;
        super.field1277[super.field1292++] = (byte) (var3 >> 8);
        super.field1277[super.field1292++] = (byte) (var3 >> 16);
        super.field1277[super.field1292++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILps;Lbo;Lwk;Lqa;IBI)V")
    public static final void method2738(int arg0, class5 arg1, class24 arg2, class171 arg3, class496 arg4, int arg5, byte arg6, int arg7) {
        ++field6675;
        int var8 = -(arg5 / 2) + arg1.field67 + -5;
        int var9 = arg0 + 2;
        if (arg2.field396 != 0) {
            arg4.method2952(arg5 + 10, -var9 + arg3.method1203() * arg7 + (arg0 - -1), var8, arg2.field396, (byte) -53, var9);
        }
        if (arg2.field391 != 0) {
            arg4.method2956(var8, -20293, arg2.field391, arg5 + 10, 1 + arg0 + arg3.method1203() * arg7 + -var9, var9);
        }
        int var10 = arg2.field390;
        if (arg1.field71 && ~arg2.field379 != 0) {
            var10 = arg2.field379;
        }
        if (arg6 != -75) {
            field6685 = null;
        }
        for (int var11 = 0; var11 < arg7; ++var11) {
            String var12 = class519.field7697[var11];
            if (var11 < arg7 - 1) {
                var12 = var12.substring(0, var12.length() + -4);
            }
            arg3.method1205(arg4, var12, arg1.field67, arg0, var10, true);
            arg0 += arg3.method1203();
        }
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(I)V")
    public class455(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ltq;BIIIIILc;IIIILqa;ZI)Lc;")
    public static final class201 method2739(class270 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class201 arg7, int arg8, int arg9, int arg10, int arg11, class496 arg12, boolean arg13, int arg14) {
        ++field6678;
        if (arg7 == null) {
            return null;
        } else {
            int var15 = 2055;
            if (arg0 != null) {
                int var16 = var15 | arg0.method1725((byte) -107, false, arg10, -1);
                var15 = var16 & -513;
            }
            long var17 = ((long) arg6 << 32) + ((long) ((arg14 << 16) + arg2 - -(arg11 << 24)) - -((long) arg3 << 48));
            class157 var19 = class211.field2971;
            class201 var20;
            synchronized (class211.field2971) {
                var20 = (class201) class211.field2971.method1013(var17, (byte) -106);
            }
            if (var20 == null || ~arg12.method1141(var20.method279(), var15) != -1) {
                if (var20 != null) {
                    var15 = arg12.method1130(var15, var20.method279());
                }
                byte var21;
                if (~arg2 == -2) {
                    var21 = 9;
                } else if (~arg2 == -3) {
                    var21 = 12;
                } else if (arg2 != 3) {
                    if (~arg2 != -5) {
                        var21 = 21;
                    } else {
                        var21 = 18;
                    }
                } else {
                    var21 = 15;
                }
                byte var22 = 3;
                int[] var23 = new int[] { 64, 96, 128 };
                class192 var24 = new class192(var21 * var22 + 1, var22 * 2 * var21 + -var21, 0);
                int var25 = var24.method1355((byte) 120, 0, 0, 0);
                int[][] var26 = new int[var22][var21];
                for (int var27 = 0; ~var22 < ~var27; ++var27) {
                    int var28 = var23[var27];
                    int var29 = var23[var27];
                    for (int var30 = 0; var21 > var30; ++var30) {
                        int var31 = (var30 << 14) / var21;
                        int var32 = class525.field7760[var31] * var28 >> 15;
                        int var33 = class525.field7763[var31] * var29 >> 15;
                        var26[var27][var30] = var24.method1355((byte) 59, 0, var32, var33);
                    }
                }
                for (int var34 = 0; var22 > var34; ++var34) {
                    int var35 = (var34 * 256 - -128) / var22;
                    int var36 = -var35 + 256;
                    byte var37 = (byte) (arg11 * var35 + arg14 * var36 >> 8);
                    short var38 = (short) ((32512 & (127 & arg3) * var35 + (127 & arg6) * var36) + ((arg3 & 896) * var35 + (896 & arg6) * var36 & 229376) + ((64512 & arg3) * var35 + (64512 & arg6) * var36 & 16515072) >> 8);
                    for (int var39 = 0; ~var39 > ~var21; ++var39) {
                        if (var34 == 0) {
                            var24.method1357(var37, (short) -1, var25, var26[0][var39], (byte) -1, var26[0][(var39 - -1) % var21], var38, (byte) 1, true);
                        } else {
                            var24.method1357(var37, (short) -1, var26[var34 + -1][var39], var26[var34][(var39 + 1) % var21], (byte) -1, var26[var34 - 1][(var39 + 1) % var21], var38, (byte) 1, true);
                            var24.method1357(var37, (short) -1, var26[var34 + -1][var39], var26[var34][var39], (byte) -1, var26[var34][(var39 + 1) % var21], var38, (byte) 1, true);
                        }
                    }
                }
                var20 = arg12.method1076(var24, var15, class292.field4350, 64, 768);
                class157 var40 = class211.field2971;
                synchronized (class211.field2971) {
                    class211.field2971.method1012(-99, var17, var20);
                }
            }
            int var41 = (arg2 << 6) + -1;
            int var42 = -var41;
            int var43 = -var41;
            int var44 = var41;
            int var45 = var41;
            if (arg13) {
                if (arg9 > 13312 || arg9 < 3072) {
                    var43 -= 128;
                }
                if (arg9 > 1024 && arg9 < 7168) {
                    var42 -= 128;
                }
                if (arg9 > 9216 && arg9 < 15360) {
                    var44 = var41 + 128;
                }
                if (~arg9 < -5121 && ~arg9 > -11265) {
                    var45 = var41 + 128;
                }
            }
            int var46 = arg7.method286();
            int var47 = arg7.method300();
            int var48 = arg7.method301();
            if (var46 < var42) {
                var46 = var42;
            }
            if (var43 > var48) {
                var48 = var43;
            }
            int var49 = arg7.method282();
            if (var44 < var47) {
                var47 = var44;
            }
            if (var49 > var45) {
                var49 = var45;
            }
            class472 var50 = null;
            if (arg1 != -1) {
                return null;
            } else {
                if (arg0 != null) {
                    int var51 = arg0.field3765[arg10];
                    var50 = class260.field3621.method1936(var51 >> 16, 213);
                    arg10 = var51 & 65535;
                }
                class201 var52;
                if (var50 == null) {
                    var52 = var20.method292((byte) 3, var15, true);
                    var52.method277(-var46 + var47 >> 1, 128, -var48 + var49 >> 1);
                    var52.method307(var46 - -var47 >> 1, 0, var48 + var49 >> 1);
                } else {
                    var52 = var20.method292((byte) 3, var15, true);
                    var52.method277(-var46 + var47 >> 1, 128, -var48 + var49 >> 1);
                    var52.method307(var46 - -var47 >> 1, 0, var48 + var49 >> 1);
                    var52.method1406(var50, arg10, (byte) 65);
                }
                if (arg8 != 0) {
                    var52.method293(arg8);
                }
                if (~arg4 != -1) {
                    var52.method287(arg4);
                }
                if (~arg5 != -1) {
                    var52.method307(0, arg5, 0);
                }
                return var52;
            }
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILjava/util/Random;I)I")
    public static final int method2740(int arg0, Random arg1, int arg2) {
        ++field6681;
        if (~arg2 >= -1) {
            throw new IllegalArgumentException();
        } else if (class124.method799(true, arg2)) {
            return (int) (((long) arg1.nextInt() & 4294967295L) * (long) arg2 >> 32);
        } else {
            int var3 = -((int) (4294967296L % (long) arg2)) + Integer.MIN_VALUE;
            if (arg0 != -8) {
                return 65;
            } else {
                int var4;
                do {
                    var4 = arg1.nextInt();
                } while (var4 >= var3);
                return class2.method27((byte) -83, var4, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(IF)V")
    public final void method2741(int arg0, float arg1) {
        ++field6679;
        int var3 = NativeStream.floatToRawIntBits(arg1);
        if (arg0 < 64) {
            this.method2737(-10, 1.4036657F);
        }
        super.field1277[super.field1292++] = (byte) (var3 >> 24);
        super.field1277[super.field1292++] = (byte) (var3 >> 16);
        super.field1277[super.field1292++] = (byte) (var3 >> 8);
        super.field1277[super.field1292++] = (byte) var3;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIBLjava/lang/String;)V")
    public static final void method2742(int arg0, int arg1, int arg2, byte arg3, String arg4) {
        ++field6677;
        class499 var5 = class458.method2757(arg2, false, arg0);
        if (var5 != null) {
            if (var5.field7381 != null) {
                class199 var6 = new class199();
                var6.field2809 = arg1;
                var6.field2817 = var5;
                var6.field2813 = var5.field7381;
                var6.field2805 = arg4;
                class291.method1886(var6);
            }
            boolean var7 = true;
            if (~var5.field7369 != -1) {
                var7 = class86.method559(1, var5);
            }
            if (var7) {
                if (client.method450(var5).method2398(arg1 - 1, arg3 + -27931)) {
                    if (~arg1 == -2) {
                        class179.method1287(false, class189.field2652);
                        ++class103.field1476;
                        class389.method2401(var5.field7310, arg2, (byte) 123, arg0);
                    }
                    if (~arg1 == -3) {
                        ++class48.field670;
                        class179.method1287(false, class359.field5555);
                        class389.method2401(var5.field7310, arg2, (byte) 20, arg0);
                    }
                    if (arg1 == 3) {
                        class179.method1287(false, class504.field7526);
                        ++class485.field7090;
                        class389.method2401(var5.field7310, arg2, (byte) 25, arg0);
                    }
                    if (arg1 == 4) {
                        ++class450.field6638;
                        class179.method1287(false, class470.field6871);
                        class389.method2401(var5.field7310, arg2, (byte) 41, arg0);
                    }
                    if (~arg1 == -6) {
                        ++class381.field5810;
                        class179.method1287(false, class380.field5799);
                        class389.method2401(var5.field7310, arg2, (byte) 101, arg0);
                    }
                    if (~arg1 == -7) {
                        class179.method1287(false, class133.field1926);
                        ++class128.field1811;
                        class389.method2401(var5.field7310, arg2, (byte) 53, arg0);
                    }
                    if (~arg1 == -8) {
                        ++class344.field5394;
                        class179.method1287(false, class352.field5457);
                        class389.method2401(var5.field7310, arg2, (byte) 81, arg0);
                    }
                    if (~arg1 == -9) {
                        class179.method1287(false, class517.field7677);
                        ++class420.field6269;
                        class389.method2401(var5.field7310, arg2, (byte) 37, arg0);
                    }
                    if (arg1 == 9) {
                        class179.method1287(false, class72.field983);
                        ++class36.field585;
                        class389.method2401(var5.field7310, arg2, (byte) 16, arg0);
                    }
                    if (arg3 != 35) {
                        field6686 = 50;
                    }
                    if (~arg1 == -11) {
                        class179.method1287(false, class302.field4452);
                        ++class38.field604;
                        class389.method2401(var5.field7310, arg2, (byte) 65, arg0);
                    }
                }
            }
        }
    }
}
