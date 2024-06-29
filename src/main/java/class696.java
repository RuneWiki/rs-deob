import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class696 {

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "I")
    public static int field9855;

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "I")
    public static int field9856;

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "I")
    public static int field9857;

    @OriginalMember(owner = "client!cca", name = "g", descriptor = "I")
    public static int field9861;

    @OriginalMember(owner = "client!cca", name = "i", descriptor = "I")
    public static int field9863;

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "Lcr;")
    public static class175 field9858;

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "Lpq;")
    public static class184 field9859;

    @OriginalMember(owner = "client!cca", name = "f", descriptor = "Lcca;")
    public class696 field9860;

    @OriginalMember(owner = "client!cca", name = "h", descriptor = "Lcca;")
    public class696 field9862;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cca", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field9864;

    // $FF: synthetic method
    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3874(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)V", line = 8)
    public final void method3869(boolean arg0) {
        field9856++;
        if (this.field9862 == null) {
            return;
        }
        this.field9862.field9860 = this.field9860;
        this.field9860.field9862 = this.field9862;
        this.field9860 = null;
        this.field9862 = null;
        if (!arg0) {
            this.method3869(false);
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 28)
    public static final boolean method3870(int arg0, String arg1) {
        field9855++;
        if (arg1 == null) {
            return false;
        } else if (arg0 > -88) {
            return true;
        } else {
            for (int var2 = 0; var2 < class497.field7034; var2++) {
                if (arg1.equalsIgnoreCase(class223.field2934[var2])) {
                    return true;
                }
                if (arg1.equalsIgnoreCase(class556.field7801[var2])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "(I)V", line = 59)
    public static void method3871(int arg0) {
        field9858 = null;
        if (arg0 == -1713569622) {
            field9859 = null;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(III)Lwn;", line = 70)
    public static final class548 method3872(int arg0, int arg1, int arg2) {
        field9857++;
        if (arg2 != -1633381944) {
            field9859 = null;
        }
        class548 var3 = (class548) class506.field7140.method3248((long) arg1 << 32 | (long) arg0, 0);
        if (var3 == null) {
            var3 = new class548(arg1, arg0);
            class506.field7140.method3249(var3.field8746, var3, (byte) 34);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lha;II)Z", line = 92)
    public static final boolean method3873(class454 arg0, int arg1, int arg2) {
        field9861++;
        int var3 = (class613.field8591 - 104) / 2;
        int var4 = (class1.field3 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var57 = var4; var57 < (var4 + 104); var57++) {
                for (int var58 = arg1; var58 <= 3; var58++) {
                    if (class613.method3363(arg2 - 37346, var6, arg1, var58, var57)) {
                        int var59 = var58;
                        if (class739.method4140((byte) 113, var57, var6)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class13.method182(var6, 97, var57, var59);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class701.field9883 = arg0.method2666(512, 512, (byte) -48, var7, 0, 512);
        class516.method2964(arg2 - 19749);
        int var9 = -((-((int) (Math.random() * 20.0D)) - (((int) (Math.random() * 20.0D) + 228 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16))) - 238) - 10 | 0xFF000000;
        int var10 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xCB9EFF00) << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
        if (arg2 != 20004) {
            return true;
        }
        boolean[][] var12 = new boolean[class643.field8877 + 1 + 2][class643.field8877 + 1 + 2];
        for (int var13 = var3; var13 < (var3 + 104); var13 += class643.field8877) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class643.field8877) {
                int var37 = 0;
                int var38 = 0;
                int var39 = var13;
                if (var13 > 0) {
                    var37 += 4;
                    var39 = var13 - 1;
                }
                int var40 = var36;
                if (var36 > 0) {
                    var40 = var36 - 1;
                }
                int var41 = class643.field8877 + var13;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = var36 + class643.field8877;
                if (var42 < 104) {
                    var38 += 4;
                    var42++;
                }
                arg0.method131(0, 0, class643.field8877 * 4 + var37, var38 - -(class643.field8877 * 4));
                arg0.method166(-16777216);
                for (int var43 = arg1; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class643.field8877; var50++) {
                        for (int var56 = 0; var56 <= class643.field8877; var56++) {
                            var12[var50][var56] = class613.method3363(-17342, var39 + var50, arg1, var43, var40 + var56);
                        }
                    }
                    class716.field10106[var43].method541(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class233.field3012) {
                        for (int var51 = -4; var51 < class643.field8877; var51++) {
                            for (int var52 = -4; var52 < class643.field8877; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var3 <= var53 && var4 <= var54 && class613.method3363(arg2 - 37346, var53, arg1, var43, var54)) {
                                    int var55 = var43;
                                    if (class739.method4140((byte) 67, var54, var53)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class602.method3313(arg0, var38 + ((class643.field8877 - var52) * 4) - 4, var10, var55, (byte) 110, var53, var54, var9, var37 + (var51 * 4));
                                    }
                                }
                            }
                        }
                    }
                }
                if (class233.field3012) {
                    class685 var44 = class410.field5786[arg1];
                    for (int var45 = 0; var45 < class643.field8877; var45++) {
                        for (int var46 = 0; var46 < class643.field8877; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field9700[var47 - var44.field9685][var48 - var44.field9679];
                            if ((var49 & 0x40240000) != 0) {
                                arg0.method2668(var38 + ((class643.field8877 - var46) * 4) - 4, false, 4, 4, var37 + (var45 * 4), -1713569622);
                            } else if ((var49 & 0x800000) != 0) {
                                arg0.method2660(4, arg2 ^ 0x4E1E, var38 + ((class643.field8877 - var46) * 4) - 4, -1713569622, var45 * 4 + var37);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg0.method2667(var37 + (var45 * 4) + 3, (byte) 113, (class643.field8877 - var46) * 4 + var38 - 4, -1713569622, 4);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg0.method2660(4, 57, (class643.field8877 - var46) * 4 + var38 - 1, -1713569622, var45 * 4 + var37);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg0.method2667(var45 * 4 + var37, (byte) 113, (class643.field8877 - var46) * 4 + var38 - 4, -1713569622, 4);
                            }
                        }
                    }
                }
                arg0.method167(var37, var38, class643.field8877 * 4, class643.field8877 * 4, var11, 2);
                class701.field9883.method688((var13 - var3) * 4 + 48, -((-var4 + var36) * 4) + 464 - class643.field8877 * 4, class643.field8877 * 4, class643.field8877 * 4, var37, var38);
            }
        }
        arg0.method59();
        arg0.method166(-16777215);
        class728.method4033(arg2 - 20128);
        class457.field6397 = 0;
        class200.field2561.method3114(true);
        if (!class233.field3012) {
            for (int var14 = var3; var14 < (var3 + 104); var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg1; var21 <= arg1 + 1 && var21 <= 3; var21++) {
                        if (class613.method3363(-17342, var14, arg1, var21, var20)) {
                            class559 var22 = (class559) class315.method1848(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class559) class730.method4079(var21, var14, var20, field9864 == null ? (field9864 = method3874("op")) : field9864);
                            }
                            if (var22 == null) {
                                var22 = (class559) class548.method3123(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class559) class457.method2676(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class290 var23 = class358.field5112.method890(var22.method735(24123), false);
                                if (!var23.field3710 || class680.field9235) {
                                    int var24 = var23.field3773;
                                    if (var23.field3685 != null) {
                                        for (int var25 = 0; var25 < var23.field3685.length; var25++) {
                                            if (var23.field3685[var25] != -1) {
                                                class290 var26 = class358.field5112.method890(var23.field3685[var25], false);
                                                if (var26.field3773 >= 0) {
                                                    var24 = var26.field3773;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class351 var28 = class37.field551.method2765(36, var24);
                                            if (var28 != null && var28.field4627) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class410.field5786[var21].field9700;
                                            int var32 = class410.field5786[var21].field9685;
                                            int var33 = class410.field5786[var21].field9679;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var29 > var14 - 3 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var3 + 104 - 1 > var29 && var29 < (var14 + 3) && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var20 - 3 < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < (var4 + 104 - 1) && (var20 + 3) > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class461.field6643[class457.field6397] = var23.field3771;
                                        class612.field8457[class457.field6397] = var29;
                                        class547.field7707[class457.field6397] = var30;
                                        class457.field6397++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class512.field7223 != null) {
                class565.field7911.field9720 = 1;
                class37.field551.method2768(1024, (byte) 116, 64);
                for (int var15 = 0; var15 < class512.field7223.field9055; var15++) {
                    int var16 = class512.field7223.field9054[var15];
                    if (var16 >> 28 == class339.field4374.field5779) {
                        int var17 = (var16 >> 14 & 0x3FFF) - class63.field851;
                        int var18 = (var16 & 0x3FFF) - class753.field10509;
                        if (var17 >= 0 && class613.field8591 > var17 && var18 >= 0 && class1.field3 > var18) {
                            class200.field2561.method3110(new class394(var15), 1);
                        } else {
                            class351 var19 = class37.field551.method2765(36, class512.field7223.field9056[var15]);
                            if (var19.field4614 != null && (var19.field4623 + var17) >= 0 && class613.field8591 > (var17 + var19.field4585) && (var19.field4589 + var18) >= 0 && class1.field3 > var19.field4611 + var18) {
                                class200.field2561.method3110(new class394(var15), 1);
                            }
                        }
                    }
                }
                class37.field551.method2768(128, (byte) 116, 64);
                class565.field7911.field9720 = 2;
                class565.field7911.method3835((byte) -106);
            }
        }
        return true;
    }
}
