import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class241 extends class115 {

    @OriginalMember(owner = "client!sa", name = "ab", descriptor = "I")
    private int field4124 = 204;

    @OriginalMember(owner = "client!sa", name = "fb", descriptor = "I")
    private int field4129 = 1;

    @OriginalMember(owner = "client!sa", name = "hb", descriptor = "I")
    private int field4131 = 1;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
    public static int field4120 = 0;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "Lqe;")
    public static class168 field4116 = class66.method448("sch-Utteln:", 34);

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "Lqe;")
    private static class168 field4118 = class66.method448("Select", 100);

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "Lqe;")
    public static class168 field4119 = field4118;

    @OriginalMember(owner = "client!sa", name = "ib", descriptor = "Lqe;")
    public static class168 field4132 = class66.method448("scrollen:", 127);

    @OriginalMember(owner = "client!sa", name = "jb", descriptor = "Z")
    public static boolean field4133 = true;

    @OriginalMember(owner = "client!sa", name = "eb", descriptor = "Lwc;")
    public static class232 field4128 = new class232(64);

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!sa", name = "bb", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!sa", name = "cb", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!sa", name = "db", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!sa", name = "gb", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "Lwd;")
    public static class67 field4122;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "[[I")
    public static int[][] field4117;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field4124 = arg1.method731(false);
                }
            } else {
                this.field4129 = arg1.method758(true);
            }
        } else {
            this.field4131 = arg1.method758(true);
        }
        if (arg0 != 107) {
            method1569(-20, 59, 71, 40, (class13) null, (class13) null, 25, 117, 26, 38, -35L);
        }
        ++field4125;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIILqf;Lqf;IIIIJ)V")
    public static final void method1569(int arg0, int arg1, int arg2, int arg3, class13 arg4, class13 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 != null) {
            class199 var12 = new class199();
            var12.field3443 = arg10;
            var12.field3439 = arg1 * 128 + 64;
            var12.field3431 = arg2 * 128 + 64;
            var12.field3440 = arg3;
            var12.field3446 = arg4;
            var12.field3441 = arg5;
            var12.field3444 = arg6;
            var12.field3436 = arg7;
            var12.field3433 = arg8;
            var12.field3435 = arg9;
            for (int var13 = arg0; var13 >= 0; --var13) {
                if (class254.field4395[var13][arg1][arg2] == null) {
                    class254.field4395[var13][arg1][arg2] = new class177(var13, arg1, arg2);
                }
            }
            class254.field4395[arg0][arg1][arg2].field3103 = var12;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([[II)V")
    public static final void method1570(int[][] arg0, int arg1) {
        ++field4127;
        field4117 = arg0;
        if (arg1 != 96) {
            method1573(38);
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class241() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lnh;B)V")
    public static final void method1571(class112 arg0, byte arg1) {
        if (arg1 < -58) {
            ++field4121;
            if (class34.field423 != null) {
                try {
                    class34.field423.method437(-16099, 0L);
                    class34.field423.method432(arg0.field1821, 24, arg0.field1780, true);
                } catch (Exception var2) {
                }
            }
            arg0.field1821 += 24;
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
    public static final void method1572(byte arg0) {
        if (arg0 != 58) {
            method1571((class112) null, (byte) -34);
        }
        ++field4123;
        Object var1 = class229.field3882;
        synchronized (class229.field3882) {
            if (class154.field2676 == 0) {
                class205.field3559.method1553((byte) 66, 5, new class30());
            }
            class154.field2676 = 600;
        }
    }

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "(I)V")
    public static void method1573(int arg0) {
        field4122 = null;
        field4119 = null;
        field4118 = null;
        field4128 = null;
        field4132 = null;
        if (arg0 < 81) {
            field4126 = 11;
        }
        field4117 = null;
        field4116 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIILqf;IJZ)Z")
    public static final boolean method1574(int arg0, int arg1, int arg2, int arg3, int arg4, class13 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        } else {
            int var10 = arg1 - arg4;
            int var11 = arg2 - arg4;
            int var12 = arg1 + arg4;
            int var13 = arg2 + arg4;
            if (arg8) {
                if (arg6 > 640 && arg6 < 1408) {
                    var13 += 128;
                }
                if (arg6 > 1152 && arg6 < 1920) {
                    var12 += 128;
                }
                if (arg6 > 1664 || arg6 < 384) {
                    var11 -= 128;
                }
                if (arg6 > 128 && arg6 < 896) {
                    var10 -= 128;
                }
            }
            int var14 = var10 / 128;
            int var15 = var11 / 128;
            int var16 = var12 / 128;
            int var17 = var13 / 128;
            return class146.method983(arg0, var14, var15, var16 - var14 + 1, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
        }
    }

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "(I)V")
    public static final void method1575(int arg0) {
        ++field4130;
        if (class131.field2314 != null) {
            if (~class236.field4021 > -11) {
                if (!class74.field1127.method1701(class131.field2314, arg0 + -26311)) {
                    class236.field4021 = class74.field1127.method1685(class131.field2314, -105) / 10;
                    return;
                }
                class85.method560(-92);
                class236.field4021 = 10;
            }
            if (class236.field4021 != arg0) {
                if (class236.field4021 == 20) {
                    class130.method886(class74.field1127.method1699(class245.field4256, class131.field2314, 0), -21658);
                    class236.field4021 = 30;
                    class153.method1013(arg0 ^ 10, true);
                    class47.method317(arg0 + -10);
                } else if (~class236.field4021 == -31) {
                    class74.method503(class74.field1127.method1699(class99.field1564, class131.field2314, 0), (byte) 94);
                    class236.field4021 = 40;
                    class47.method317(0);
                } else if (~class236.field4021 == -41) {
                    class106.method701(class74.field1127.method1699(class110.field1767, class131.field2314, arg0 ^ 10), (byte) 40);
                    class236.field4021 = 50;
                    class47.method317(0);
                } else if (class236.field4021 == 50) {
                    class209.method1356(class74.field1127.method1699(class173.field3010, class131.field2314, 0), -126);
                    class236.field4021 = 60;
                    class153.method1013(0, true);
                    class47.method317(0);
                } else if (class236.field4021 == 60) {
                    class247.method1618(true, class74.field1127.method1699(class92.field1453, class131.field2314, 0));
                    class236.field4021 = 70;
                    class47.method317(0);
                } else if (~class236.field4021 == -71) {
                    class212.field3669 = new class67(11, true, class51.field686);
                    class236.field4021 = 73;
                    class153.method1013(0, true);
                    class47.method317(arg0 ^ 10);
                } else if (class236.field4021 == 73) {
                    class54.field741 = new class67(12, true, class51.field686);
                    class236.field4021 = 76;
                    class153.method1013(0, true);
                    class47.method317(arg0 ^ 10);
                } else if (class236.field4021 == 76) {
                    class87.field1355 = new class67(14, true, class51.field686);
                    class236.field4021 = 79;
                    class153.method1013(0, true);
                    class47.method317(0);
                } else if (class236.field4021 == 79) {
                    class105.field1690 = new class67(17, true, class51.field686);
                    class236.field4021 = 82;
                    class153.method1013(arg0 ^ 10, true);
                    class47.method317(0);
                } else if (~class236.field4021 == -83) {
                    class130.field2293 = new class67(19, true, class51.field686);
                    class236.field4021 = 85;
                    class153.method1013(0, true);
                    class47.method317(0);
                } else if (class236.field4021 == 85) {
                    class64.field895 = new class67(22, true, class51.field686);
                    class236.field4021 = 88;
                    class153.method1013(0, true);
                    class47.method317(0);
                } else if (~class236.field4021 == -89) {
                    field4122 = new class67(26, true, class51.field686);
                    class236.field4021 = 91;
                    class153.method1013(arg0 ^ 10, true);
                    class47.method317(0);
                } else {
                    class198.field3430 = new class67(30, true, class51.field686);
                    class236.field4021 = 100;
                    class153.method1013(0, true);
                    class47.method317(0);
                    class68.field971 = -1;
                    class27.field342 = -1;
                    System.gc();
                }
            } else {
                class112 var1 = new class112(class74.field1127.method1699(class44.field574, class131.field2314, 0));
                int var2 = var1.method731(false);
                int var3 = var1.method731(false);
                int var4 = var1.method731(false);
                int var5 = var1.method731(false);
                int var6 = var1.method731(false);
                int var7 = var1.method731(false);
                class79.field1189 = (-var2 + 1 + var4) * 64;
                class232.field3935 = var2 * 64;
                class42.field552 = (-var3 + var5) * 64 + 64;
                int var8 = (class7.field85.field190 >> 7) + -class232.field3935 + class246.field4261;
                class162.field2781 = var3 * 64;
                class167.field2852 = 8.0D;
                class194.field3383 = 8.0D;
                int var9 = var8 + ((int) (Math.random() * 10.0D) - 5);
                int var10 = (class7.field85.field166 >> 7) + (class125.field2060 - class162.field2781);
                int var11 = var10 + ((int) (Math.random() * 10.0D) - 5);
                if (~var9 <= -1 && var9 < class79.field1189 && ~var11 <= -1 && ~class42.field552 < ~var11) {
                    class91.field1423 = class42.field552 - var11;
                    class151.field2629 = var9;
                } else {
                    class91.field1423 = class42.field552 + class162.field2781 - var7 * 64;
                    class151.field2629 = var6 * 64 + -class232.field3935;
                }
                class55.method386((byte) 44);
                int var12 = class42.field552 >> 6;
                int var13 = class79.field1189 >> 6;
                class233.field3964 = new byte[var13][var12][];
                class243.field4226 = new byte[var13][var12][];
                class252.field4362 = new byte[var13][var12][];
                class32.field389 = new int[var13][var12][];
                class1.field6 = new byte[var13][var12][];
                class74.field1123 = new int[var13][var12][];
                class89.field1394 = new byte[var13][var12][];
                int var14 = class247.field4279 >> 1;
                class94.field1482 = new byte[var13][var12][];
                class166.field2838 = new int[class242.field4177 + 1];
                int var15 = class193.field3365 >> 2 << 10;
                for (int var16 = 0; class242.field4177 > var16; ++var16) {
                    class95 var17 = class238.method1550(4, var16);
                    if (var17 != null) {
                        int var18 = var17.field1492;
                        if (~var18 <= -1 && !class248.field4299.method680(4437, var18)) {
                            var18 = -1;
                        }
                        int var19;
                        if (var17.field1495 < 0) {
                            if (~var18 > -1) {
                                if (var17.field1496 == -1) {
                                    var19 = -1;
                                } else {
                                    int var20 = var17.field1496;
                                    int var21 = (var20 & 127) + var14;
                                    if (var21 >= 0) {
                                        if (var21 > 127) {
                                            var21 = 127;
                                        }
                                    } else {
                                        var21 = 0;
                                    }
                                    int var22 = (64512 & var20 - -var15) + (var20 & 896) + var21;
                                    var19 = class248.field4296[class83.method549((byte) -122, 96, var22)];
                                }
                            } else {
                                var19 = class248.field4296[class83.method549((byte) -115, 96, class248.field4299.method681(var18, 1))];
                            }
                        } else {
                            int var23 = var17.field1495;
                            int var24 = (127 & var23) + var14;
                            if (~var24 > -1) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (var23 - -var15 & 64512) + (var23 & 896) + var24;
                            var19 = class248.field4296[class83.method549((byte) -113, 96, var25)];
                        }
                        class166.field2838[var16 + 1] = var19;
                    }
                }
                class236.field4021 = 20;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        ++field4115;
        if (arg1 <= 37) {
            this.method5(20, (byte) -41);
        }
        int[] var3 = super.field1872.method182((byte) -123, arg0);
        if (super.field1872.field341) {
            for (int var4 = 0; var4 < class130.field2297; ++var4) {
                int var5 = class193.field3367[var4];
                int var6 = class170.field2963[arg0];
                int var7 = var6 % (4096 / this.field4129) * this.field4129;
                int var8 = this.field4131 * var5 >> 12;
                int var9 = this.field4129 * var6 >> 12;
                int var10 = var5 % (4096 / this.field4131) * this.field4131;
                if (~var7 > ~this.field4124) {
                    for (var8 -= var9; var8 < 0; var8 += 4) {
                    }
                    while (~var8 < -4) {
                        var8 -= 4;
                    }
                    if (var8 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var10 > ~this.field4124) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field4124 < ~var10) {
                    int var11;
                    for (var11 = var8 - var9; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }
}
