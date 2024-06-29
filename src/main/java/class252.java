import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class252 {

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "[I")
    private int[] field4288;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "[B")
    private byte[] field4278;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "[I")
    private int[] field4292;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "Lke;")
    public static class256 field4282 = class316.method2202("unzap", 27626);

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "Lke;")
    private static class256 field4286 = class316.method2202(" more options", 27626);

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "Lke;")
    public static class256 field4291 = class316.method2202(" )2> <col=ffffff>", 27626);

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "Lke;")
    public static class256 field4290 = field4286;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIIII)V", line = 7)
    public static final void method1692(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4289++;
        if (class253.field4323) {
            int var8 = arg6 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = (class181.field3208 - class214.field3822) * var8 / 100 + class214.field3822;
            arg7 = arg7 * var9 >> 8;
        }
        if (arg1 != -687989968) {
            field4282 = (class256) null;
        }
        int var10 = 2048 - arg2 & 0x7FF;
        int var11 = 2048 - arg0 & 0x7FF;
        int var12 = 0;
        int var13 = arg7;
        int var14 = 0;
        if (var11 != 0) {
            int var15 = class136.field2366[var11];
            var14 = -arg7 * var15 >> 16;
            int var16 = class136.field2372[var11];
            var13 = arg7 * var16 >> 16;
        }
        if (var10 != 0) {
            int var17 = class136.field2372[var10];
            int var18 = class136.field2366[var10];
            var12 = var13 * var18 >> 16;
            var13 = var13 * var17 >> 16;
        }
        class72.field1319 = arg4 - var13;
        class180.field3192 = arg0;
        class10.field152 = arg3 - var14;
        class50.field926 = arg5 - var12;
        class210.field3784 = arg2;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILng;Lng;)V", line = 70)
    public static final void method1693(int arg0, class138 arg1, class138 arg2) {
        int var3 = -72 % ((61 - arg0) / 32);
        class76.field1448 = arg2;
        field4287++;
        class206.field3727 = arg1;
        class255.field4372 = class76.field1448.method991(3, -1);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IB)V", line = 82)
    public static final void method1694(int arg0, byte arg1) {
        field4295++;
        class77 var2 = class156.method1158(4, false, arg0);
        var2.method586((byte) 98);
        int var3 = 66 / ((arg1 + 56) / 51);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)Lqg;", line = 94)
    public static final class192 method1695(int arg0, int arg1) {
        field4281++;
        class192 var2 = (class192) class25.field325.method2077(-13408, (long) arg0);
        if (arg1 != -31903) {
            return (class192) null;
        } else if (var2 == null) {
            byte[] var3 = class32.field516.method1016(4, 100, arg0);
            class192 var4 = new class192();
            if (var3 != null) {
                var4.method1388(arg0, new class41(var3), -6);
            }
            class25.field325.method2074(var4, (long) arg0, arg1 ^ 0x7C9E);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I[BI[BII)I", line = 123)
    public final int method1696(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field4285++;
        int var7 = 0;
        if (arg5 != 8) {
            method1692(-17, -4, -30, -18, 37, -18, 77, -34);
        }
        int var8 = arg0 << 3;
        int var9 = arg2 + arg4;
        while (var9 > arg4) {
            int var10 = arg1[arg4] & 0xFF;
            int var11 = this.field4288[var10];
            byte var12 = this.field4278[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            var8 += var12;
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var7 = class100.method721(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg3[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg3[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg3[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg3[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg4++;
        }
        return (var8 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 193)
    public static void method1697(int arg0) {
        field4291 = null;
        field4286 = null;
        if (arg0 == 30843) {
            field4290 = null;
            field4282 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(IB)V", line = 208)
    public static final void method1698(int arg0, byte arg1) {
        if (arg1 != -41) {
            field4294 = 52;
        }
        field4280++;
        class119.field2119 = arg0;
        class152.method1138(3, (byte) -100);
        class152.method1138(4, (byte) -100);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLla;)V", line = 223)
    public static final void method1699(byte arg0, class188 arg1) {
        class188 var2 = class56.method442((byte) 125, arg1);
        field4283++;
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class124.field2200;
            var4 = class112.field1969;
        } else {
            var4 = var2.field3391;
            var3 = var2.field3343;
        }
        if (arg0 != 69) {
            method1694(11, (byte) -59);
        }
        class199.method1428(var4, false, arg1, var3, arg0 - 71);
        class100.method724(var3, arg1, (byte) 74, var4);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "([BBI[BII)I", line = 248)
    public final int method1700(byte[] arg0, byte arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        if (arg1 != 74) {
            return -21;
        }
        field4279++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg4 + arg5;
        int var9 = arg2;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field4292[var7];
            }
            int var11;
            if ((var11 = this.field4292[var7]) < 0) {
                arg0[arg4++] = (byte) (~var11);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field4292[var7];
            }
            int var12;
            if ((var12 = this.field4292[var7]) < 0) {
                arg0[arg4++] = (byte) (~var12);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field4292[var7];
            }
            int var13;
            if ((var13 = this.field4292[var7]) < 0) {
                arg0[arg4++] = (byte) (~var13);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field4292[var7];
            }
            int var14;
            if ((var14 = this.field4292[var7]) < 0) {
                arg0[arg4++] = (byte) (~var14);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field4292[var7];
            }
            int var15;
            if ((var15 = this.field4292[var7]) < 0) {
                arg0[arg4++] = (byte) (~var15);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field4292[var7];
            }
            int var16;
            if ((var16 = this.field4292[var7]) < 0) {
                arg0[arg4++] = (byte) (~var16);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field4292[var7];
            }
            int var17;
            if ((var17 = this.field4292[var7]) < 0) {
                arg0[arg4++] = (byte) (~var17);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field4292[var7];
            }
            int var18;
            if ((var18 = this.field4292[var7]) < 0) {
                arg0[arg4++] = (byte) (~var18);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lng;Lng;Lng;BLng;)V", line = 398)
    public static final void method1701(class138 arg0, class138 arg1, class138 arg2, byte arg3, class138 arg4) {
        field4293++;
        if (arg3 != 0) {
            return;
        }
        class119.field2112 = arg2;
        class238.field4053 = arg1;
        class295.field5123 = arg0;
        class14.field191 = arg4;
        class50.field921 = new class188[class238.field4053.method997(28402)][];
        class111.field1944 = new boolean[class238.field4053.method997(arg3 ^ 0x6EF2)];
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(IB)I", line = 415)
    public static final int method1702(int arg0, byte arg1) {
        if (arg1 != 39) {
            field4286 = (class256) null;
        }
        field4284++;
        return arg0 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "([B)V", line = 451)
    public class252(byte[] arg0) {
        int var2 = arg0.length;
        this.field4288 = new int[var2];
        this.field4278 = arg0;
        this.field4292 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field4288[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class100.method721(var12, var11);
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
                        if (this.field4292[var14] == 0) {
                            this.field4292[var14] = var4;
                        }
                        var14 = this.field4292[var14];
                    }
                    if (var14 >= this.field4292.length) {
                        int[] var17 = new int[this.field4292.length * 2];
                        for (int var18 = 0; var18 < this.field4292.length; var18++) {
                            var17[var18] = this.field4292[var18];
                        }
                        this.field4292 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field4292[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
