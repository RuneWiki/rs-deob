import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class208 {

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "[I")
    private int[] field3470;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "[I")
    private int[] field3471;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "[B")
    private byte[] field3476;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Ldf;")
    private static class51 field3469 = class46.method233("Hidden", 100);

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Ldf;")
    public static class51 field3466 = field3469;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Lfb;")
    public static class29 field3475 = new class29();

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "Ldf;")
    public static class51 field3479 = class46.method233("Angreifen", 100);

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "Ldf;")
    public static class51 field3483 = class46.method233("", 100);

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "[I")
    public static int[] field3480 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "Lu;")
    public static class111 field3481;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "Lfd;")
    public static class114 field3482;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III[B[BB)I")
    public final int method1429(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, byte arg5) {
        field3478++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = arg0 + arg2;
        int var8 = 0;
        int var9 = arg1;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 < 0) {
                var8 = this.field3471[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field3471[var8]) < 0) {
                arg4[arg2++] = (byte) (~var11);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field3471[var8];
            }
            int var12;
            if ((var12 = this.field3471[var8]) < 0) {
                arg4[arg2++] = (byte) (~var12);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field3471[var8];
            }
            int var13;
            if ((var13 = this.field3471[var8]) < 0) {
                arg4[arg2++] = (byte) (~var13);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field3471[var8];
            }
            int var14;
            if ((var14 = this.field3471[var8]) < 0) {
                arg4[arg2++] = (byte) (~var14);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field3471[var8];
            }
            int var15;
            if ((var15 = this.field3471[var8]) < 0) {
                arg4[arg2++] = (byte) (~var15);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field3471[var8];
            }
            int var16;
            if ((var16 = this.field3471[var8]) < 0) {
                arg4[arg2++] = (byte) (~var16);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field3471[var8];
            }
            int var17;
            if ((var17 = this.field3471[var8]) < 0) {
                arg4[arg2++] = (byte) (~var17);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field3471[var8];
            }
            int var18;
            if ((var18 = this.field3471[var8]) < 0) {
                arg4[arg2++] = (byte) (~var18);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        if (arg5 != -111) {
            field3479 = null;
        }
        return var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIB)Lhg;")
    public static final class167 method1430(int arg0, int arg1, byte arg2) {
        if (arg2 != -117) {
            field3480 = null;
        }
        class167 var3 = (class167) class223.field3938.method1453((long) arg0 | (long) arg1 << 32, 1);
        field3474++;
        if (var3 == null) {
            var3 = new class167(arg1, arg0);
            class223.field3938.method1447(-93, var3.field1760, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method1431(int arg0) {
        field3469 = null;
        field3481 = null;
        field3482 = null;
        field3475 = null;
        field3483 = null;
        field3479 = null;
        field3480 = null;
        field3466 = null;
        if (arg0 != -5954) {
            method1432(-10);
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
    public static final void method1432(int arg0) {
        field3468++;
        if (class93.field1546 == null) {
            return;
        }
        if (class74.field1182 < 10) {
            if (!class183.field3027.method805(class93.field1546.field44, 31514) || !class183.field3027.method805(class20.method104(arg0 + 15074, new class51[] { class93.field1546.field44, class231.field4031 }), 31514)) {
                class74.field1182 = class95.field1565.method822(class93.field1546.field44, (byte) -115) / 10;
                return;
            }
            class93.method704(0);
            class74.field1182 = 10;
        }
        if (class74.field1182 == 10) {
            class46.field736 = class93.field1546.field48 >> 6 << 6;
            class107.field1764 = class93.field1546.field50 >> 6 << 6;
            class5.field38 = (class93.field1546.field58 >> 6 << 6) + 64 - class107.field1764;
            class79.field1261 = 8.0F;
            class207.field3454 = 8.0F;
            class85.field1433 = (class93.field1546.field51 >> 6 << 6) + 64 - class46.field736;
            int var1 = class11.field160 + (class44.field706.field4319 >> 7) - class107.field1764;
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            int var3 = class46.field736 + class85.field1433 - class241.field4179 - (class44.field706.field4348 >> 7) - 1;
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            if (var2 >= 0 && class5.field38 > var2 && var4 >= 0 && class85.field1433 > var4) {
                class44.field701 = var2;
                class169.field2758 = var4;
            } else {
                class44.field701 = class93.field1546.field60 * 64 - class107.field1764;
                class169.field2758 = class46.field736 + class85.field1433 - (class93.field1546.field52 * 64) - 1;
            }
            class120.method863(68);
            int var5 = class85.field1433 >> 6;
            int var6 = class5.field38 >> 6;
            class79.field1266 = new int[var6][var5][];
            class262.field4574 = new short[var6][var5][];
            int var7 = class87.field1450 >> 2 << 10;
            int var8 = class145.field2421 >> 1;
            class172.field2808 = new int[class240.field4172 + 1];
            class172.field2817 = new byte[var6][var5][];
            class45.field716 = new int[var6][var5][];
            class202.field3379 = new byte[var6][var5][];
            class111.field1877 = new byte[var6][var5][];
            class222.field3873 = new byte[var6][var5][];
            class214.field3709 = new byte[var6][var5][];
            class72.method499(var8, (byte) 5, var7);
            class74.field1182 = 20;
        } else if (class74.field1182 == 20) {
            class66.method465(new class121(class183.field3027.method811(class48.field763, 23, class93.field1546.field44)), false);
            class74.field1182 = 30;
            class119.method858(true, true);
            class14.method76((byte) -36);
        } else if (class74.field1182 == 30) {
            class175.method1229(arg0 ^ 0x3ACB, new class121(class183.field3027.method811(class172.field2813, arg0 ^ 0x3AE0, class93.field1546.field44)));
            class74.field1182 = 40;
            class14.method76((byte) -36);
        } else if (arg0 == -15030) {
            if (class74.field1182 == 40) {
                class227.method1565((byte) 80, new class121(class183.field3027.method811(class27.field396, -105, class93.field1546.field44)));
                class74.field1182 = 50;
                class14.method76((byte) -36);
            } else if (class74.field1182 == 50) {
                class50.method267(new class121(class183.field3027.method811(class138.field2323, -98, class93.field1546.field44)), -30708);
                class74.field1182 = 60;
                class119.method858(true, true);
                class14.method76((byte) -36);
            } else if (class74.field1182 == 60) {
                class259.field4530 = class32.method163(class20.method104(-4, new class51[] { class93.field1546.field44, class231.field4031 }), class183.field3027, (byte) 102);
                class74.field1182 = 70;
                class14.method76((byte) -36);
            } else if (class74.field1182 == 70) {
                class49.field786 = new class91(11, true, class31.field452);
                class74.field1182 = 73;
                class119.method858(true, true);
                class14.method76((byte) -36);
            } else if (class74.field1182 == 73) {
                class233.field4054 = new class91(12, true, class31.field452);
                class74.field1182 = 76;
                class119.method858(true, true);
                class14.method76((byte) -36);
            } else if (class74.field1182 == 76) {
                class80.field1315 = new class91(14, true, class31.field452);
                class74.field1182 = 79;
                class119.method858(true, true);
                class14.method76((byte) -36);
            } else if (class74.field1182 == 79) {
                class31.field457 = new class91(17, true, class31.field452);
                class74.field1182 = 82;
                class119.method858(true, true);
                class14.method76((byte) -36);
            } else if (class74.field1182 == 82) {
                class70.field1126 = new class91(19, true, class31.field452);
                class74.field1182 = 85;
                class119.method858(true, true);
                class14.method76((byte) -36);
            } else if (class74.field1182 == 85) {
                class147.field2467 = new class91(22, true, class31.field452);
                class74.field1182 = 88;
                class119.method858(true, true);
                class14.method76((byte) -36);
            } else if (class74.field1182 == 88) {
                class121.field2051 = new class91(26, true, class31.field452);
                class74.field1182 = 91;
                class119.method858(true, true);
                class14.method76((byte) -36);
            } else {
                class13.field199 = new class91(30, true, class31.field452);
                class74.field1182 = 100;
                class119.method858(true, true);
                class14.method76((byte) -36);
                class42.field678 = -1;
                class3.field16 = -1;
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIZLmb;)V")
    public static final void method1433(int arg0, int arg1, int arg2, int arg3, boolean arg4, class151 arg5) {
        field3465++;
        if (class218.field3792 >= 50 || arg5.field2538 == null || arg5.field2538.length <= arg3 || arg5.field2538[arg3] == null) {
            return;
        }
        int var6 = arg5.field2538[arg3][0];
        int var7 = var6 >> 4 & 0x7;
        int var8 = var6 >> 8;
        if (arg5.field2538[arg3].length > 1) {
            int var9 = (int) ((double) arg5.field2538[arg3].length * Math.random());
            if (var9 > 0) {
                var8 = arg5.field2538[arg3][var9];
            }
        }
        int var10 = var6 & 0xF;
        if (var10 == 0) {
            if (arg4) {
                class47.method245(-30361, 0, var8, var7);
            }
        } else if (class218.field3801 != 0) {
            int var11 = (arg0 - 64) / 128;
            if (arg2 > 56) {
                int var12 = (arg1 - 64) / 128;
                class192.field3226[class218.field3792] = var8;
                class7.field76[class218.field3792] = var7;
                class228.field3977[class218.field3792] = 0;
                class145.field2426[class218.field3792] = null;
                class209.field3487[class218.field3792] = (var11 << 8) + (var12 << 16) + var10;
                class218.field3792++;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public static final void method1434(int arg0) {
        field3467++;
        class60.field980 = null;
        class195.field3264 = null;
        class135.field2252 = null;
        if (arg0 != 10759) {
            field3479 = null;
        }
        class128.field2146 = null;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "([B)V")
    public class208(byte[] arg0) {
        int var2 = arg0.length;
        this.field3470 = new int[var2];
        int[] var3 = new int[33];
        this.field3471 = new int[8];
        this.field3476 = arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field3470[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class82.method642(var11, var12);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field3471[var14] == 0) {
                            this.field3471[var14] = var4;
                        }
                        var14 = this.field3471[var14];
                    }
                    if (var14 >= this.field3471.length) {
                        int[] var17 = new int[this.field3471.length * 2];
                        for (int var18 = 0; var18 < this.field3471.length; var18++) {
                            var17[var18] = this.field3471[var18];
                        }
                        this.field3471 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field3471[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III[BI[B)I")
    public final int method1435(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        int var7 = arg2 + arg4;
        field3473++;
        if (arg0 != 60) {
            method1432(-64);
        }
        int var8 = 0;
        int var9 = arg1 << 3;
        while (var7 > arg4) {
            int var10 = arg5[arg4] & 0xFF;
            byte var11 = this.field3476[var10];
            int var12 = this.field3470[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var11;
            int var15 = var8 & -var14 >> 31;
            int var16 = (var11 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var8 = class82.method642(var15, var12 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg3[var13] = (byte) (var8 = var12 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg3[var13] = (byte) (var8 = var12 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg3[var13] = (byte) (var8 = var12 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg3[var13] = (byte) (var8 = var12 << -var14);
                        }
                    }
                }
            }
            arg4++;
        }
        return (var9 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V")
    public static final void method1436(int arg0) {
        field3477++;
        if (arg0 != 0) {
            field3482 = null;
        }
        for (class42 var1 = (class42) class79.field1265.method1451(-117); var1 != null; var1 = (class42) class79.field1265.method1449(~arg0)) {
            int var2 = var1.field668;
            if (class207.method1426((byte) 115, var2)) {
                boolean var3 = true;
                class213[] var4 = class10.field106[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field3574;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field1760;
                    class213 var7 = class198.method1392(11823, var6);
                    if (var7 != null) {
                        class25.method135(var7, -28014);
                    }
                }
            }
        }
    }
}
