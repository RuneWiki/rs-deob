import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class261 extends class16 {

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    private int field4617 = -32768;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    private int field4614 = -1;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "Lc;")
    private class60 field4608 = null;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    private int field4622 = -1;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    private int field4611;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
    private int field4628;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    private int field4603;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    private int field4609;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    private int field4604;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "I")
    private int field4627;

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "Lab;")
    private class248 field4629;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    private int field4619;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    private int field4599;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field4597 = 0;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "Z")
    public static boolean field4602 = false;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "Le;")
    public static class191 field4621 = class54.method368("W-=hlen Sie eine Option", 2047);

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "Z")
    public static boolean field4623 = false;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static volatile int field4596 = -1;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "Le;")
    public static class191 field4615 = class54.method368("scrollen:", 2047);

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "Le;")
    public static class191 field4631 = class54.method368("sch-Utteln:", 2047);

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "[B")
    public static byte[] field4607 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "Lng;")
    public static class121 field4626;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Z")
    public static boolean field4595;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "[Led;")
    public static class262[] field4612;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "[[B")
    public static byte[][] field4625;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lvi;")
    public static final class194 method1788(Throwable arg0, String arg1) {
        field4630++;
        class194 var2;
        if (arg0 instanceof class194) {
            var2 = (class194) arg0;
            var2.field3493 = var2.field3493 + ' ' + arg1;
        } else {
            var2 = new class194(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class16 var11 = this.method1789((byte) 80);
        field4594++;
        if (var11 != null) {
            var11.method127(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field4617 = var11.method126();
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)Lbe;")
    private final class16 method1789(byte arg0) {
        field4601++;
        if (arg0 != 80) {
            field4602 = false;
        }
        return this.method1790(arg0 ^ 0x7047D5B6, false);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)Lbe;")
    private final class16 method1790(int arg0, boolean arg1) {
        field4616++;
        boolean var3 = class65.field1136 != class12.field143;
        class102 var4 = class31.method216(this.field4611, (byte) 120);
        if (var4.field1649 != null) {
            var4 = var4.method643(10853);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field4627 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field1652;
            var6 = var4.field1686;
        } else {
            var6 = var4.field1652;
            var7 = var4.field1686;
        }
        int var8 = (var6 + 1 >> 1) + this.field4628;
        int var9 = this.field4628 + (var6 >> 1);
        int var10 = this.field4604 + (var7 >> 1);
        int var11 = (var7 + 1 >> 1) + this.field4604;
        this.method1791(var9 * 128, 69, var10 * 128);
        boolean var12 = !var3 && var4.field1637 && (this.field4614 != var4.field1690 || this.field4622 != this.field4599 && class102.field1660 >= 2);
        if (arg1 && !var12) {
            return null;
        }
        int[][] var13 = class12.field143[this.field4609];
        int var14 = var13[var9][var10] + var13[var8][var11] + var13[var8][var10] + var13[var9][var11] >> 2;
        if (arg0 != 1883756006) {
            this.method1791(-4, 105, 47);
        }
        int var15 = (this.field4604 << 7) + (var7 << 6);
        int var16 = (this.field4628 << 7) + (var6 << 6);
        boolean var17 = this.field4608 == null;
        int[][] var18 = null;
        if (var3) {
            var18 = class65.field1136[0];
        } else if (this.field4609 < 3) {
            var18 = class12.field143[this.field4609 + 1];
        }
        class270 var19;
        if (this.field4629 == null) {
            var19 = var4.method635(var14, var15, var16, var13, var18, (byte) -30, var17 ? class178.field3060 : this.field4608, var12, this.field4603, false, this.field4627);
        } else {
            var19 = var4.method638(this.field4603, var15, this.field4629, var12, var14, var17 ? class178.field3060 : this.field4608, var13, this.field4599, -10, var16, var18, this.field4627);
        }
        return var19 == null ? null : var19.field4760;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(III)V")
    private final void method1791(int arg0, int arg1, int arg2) {
        if (this.field4629 != null) {
            int var4 = class135.field2267 - this.field4619;
            if (var4 > 100 && this.field4629.field4402 > 0) {
                int var5 = this.field4629.field4419.length - this.field4629.field4402;
                while (this.field4599 < var5 && var4 > this.field4629.field4406[this.field4599]) {
                    var4 -= this.field4629.field4406[this.field4599];
                    this.field4599++;
                }
                if (this.field4599 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field4629.field4419.length; var7++) {
                        var6 += this.field4629.field4406[var7];
                    }
                    var4 %= var6;
                }
            }
            label58: {
                do {
                    do {
                        if (this.field4629.field4406[this.field4599] >= var4) {
                            break label58;
                        }
                        class252.method1750((byte) -8, arg0, arg2, this.field4629, false, this.field4599);
                        var4 -= this.field4629.field4406[this.field4599];
                        this.field4599++;
                    } while (this.field4629.field4419.length > this.field4599);
                    this.field4599 -= this.field4629.field4402;
                } while (this.field4599 >= 0 && this.field4629.field4419.length > this.field4599);
                this.field4629 = null;
            }
            this.field4619 = class135.field2267 - var4;
        }
        int var8 = -107 % ((-arg1 - 69) / 52);
        field4606++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1792(int arg0, int arg1, int arg2, long arg3) {
        class199 var5 = class201.field3608[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field3535 != null && var5.field3535.field4498 == arg3) {
            return true;
        } else if (var5.field3541 != null && var5.field3541.field86 == arg3) {
            return true;
        } else if (var5.field3556 != null && var5.field3556.field4566 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field3550; var6++) {
                if (var5.field3549[var6].field136 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
    public static final void method1793(byte arg0) {
        if (arg0 != 18) {
            field4597 = 100;
        }
        field4600++;
        for (class13 var1 = (class13) class149.field2578.method1173(49); var1 != null; var1 = (class13) class149.field2578.method1175(-1)) {
            class101 var2 = var1.field159;
            if (field4598 != var2.field1616 || var2.field1620) {
                var1.method655(63);
            } else if (var2.field1624 <= class135.field2267) {
                var2.method628(class182.field3138, false);
                if (var2.field1620) {
                    var1.method655(arg0 ^ 0x2D);
                } else {
                    class165.method1110(var2.field1616, var2.field1610, var2.field1606, var2.field1605, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Llk;IIIIIIIZ)V")
    public static final void method1794(class215 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class267.field4716;
        int var11;
        int var12 = var11 = (arg7 << 7) - class73.field1268;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class12.field143[arg1][arg6][arg7] - class22.field319;
        int var18 = class12.field143[arg1][arg6 + 1][arg7] - class22.field319;
        int var19 = class12.field143[arg1][arg6 + 1][arg7 + 1] - class22.field319;
        int var20 = class12.field143[arg1][arg6][arg7 + 1] - class22.field319;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class15.field209;
        int var46 = (var24 << 9) / var25 + class15.field192;
        int var47 = (var27 << 9) / var31 + class15.field209;
        int var48 = (var30 << 9) / var31 + class15.field192;
        int var49 = (var33 << 9) / var37 + class15.field209;
        int var50 = (var36 << 9) / var37 + class15.field192;
        int var51 = (var39 << 9) / var43 + class15.field209;
        int var52 = (var42 << 9) / var43 + class15.field192;
        class15.field203 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class53.field968 && class266.method1829(class69.field1205 + class15.field209, class178.field3063 + class15.field192, var50, var52, var48, var49, var51, var47)) {
                class75.field1280 = arg6;
                class122.field2011 = arg7;
            }
            if (!arg8) {
                class15.field200 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class15.field195 || var51 > class15.field195 || var47 > class15.field195) {
                    class15.field200 = true;
                }
                if (arg0.field3804 == -1) {
                    if (arg0.field3799 != 12345678) {
                        class15.method101(var50, var52, var48, var49, var51, var47, arg0.field3799, arg0.field3791, arg0.field3793);
                    }
                } else if (!class226.field4074) {
                    int var53 = class15.field199.method1371(17045, arg0.field3804);
                    class15.method101(var50, var52, var48, var49, var51, var47, class153.method1035(var53, arg0.field3799), class153.method1035(var53, arg0.field3791), class153.method1035(var53, arg0.field3793));
                } else if (arg0.field3802) {
                    class15.method100(var50, var52, var48, var49, var51, var47, arg0.field3799, arg0.field3791, arg0.field3793, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3804);
                } else {
                    class15.method100(var50, var52, var48, var49, var51, var47, arg0.field3799, arg0.field3791, arg0.field3793, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field3804);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class53.field968 && class266.method1829(class69.field1205 + class15.field209, class178.field3063 + class15.field192, var46, var48, var52, var45, var47, var51)) {
            class75.field1280 = arg6;
            class122.field2011 = arg7;
        }
        if (arg8) {
            return;
        }
        class15.field200 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class15.field195 || var47 > class15.field195 || var51 > class15.field195) {
            class15.field200 = true;
        }
        if (arg0.field3804 != -1) {
            if (class226.field4074) {
                class15.method100(var46, var48, var52, var45, var47, var51, arg0.field3800, arg0.field3793, arg0.field3791, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3804);
                return;
            }
            int var54 = class15.field199.method1371(17045, arg0.field3804);
            class15.method101(var46, var48, var52, var45, var47, var51, class153.method1035(var54, arg0.field3800), class153.method1035(var54, arg0.field3793), class153.method1035(var54, arg0.field3791));
        } else if (arg0.field3800 != 12345678) {
            class15.method101(var46, var48, var52, var45, var47, var51, arg0.field3800, arg0.field3793, arg0.field3791);
            return;
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)V")
    public static final void method1795(int arg0, int arg1) {
        if (arg0 == 14265) {
            field4618++;
            class117.field1937.method990(44, arg1);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "()I")
    public final int method126() {
        field4613++;
        return this.field4617;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILeg;)Leg;")
    public static final class33 method1796(int arg0, class33 arg1) {
        field4632++;
        int var2 = 84 % ((49 - arg0) / 52);
        if (arg1.field478 != -1) {
            return class233.method1646(5877, arg1.field478);
        }
        int var3 = arg1.field491 >>> 16;
        class63 var4 = new class63(class73.field1259);
        for (class267 var5 = (class267) var4.method420(0); var5 != null; var5 = (class267) var4.method421((byte) -121)) {
            if (var5.field4721 == var3) {
                return class233.method1646(5877, (int) var5.field1713);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)V")
    public static void method1797(byte arg0) {
        field4607 = null;
        field4631 = null;
        field4625 = null;
        field4615 = null;
        if (arg0 < 113) {
            method1793((byte) 45);
        }
        field4621 = null;
        field4626 = null;
        field4612 = null;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIIIIZLbe;)V")
    public class261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class16 arg8) {
        this.field4611 = arg0;
        this.field4628 = arg4;
        this.field4603 = arg1;
        this.field4609 = arg3;
        this.field4604 = arg5;
        this.field4627 = arg2;
        if (arg6 != -1) {
            this.field4629 = class67.method445((byte) -61, arg6);
            this.field4619 = class135.field2267 - 1;
            this.field4599 = 0;
            if (this.field4629.field4407 == 0 && arg8 != null && arg8 instanceof class261) {
                class261 var10 = (class261) arg8;
                if (this.field4629 == var10.field4629) {
                    this.field4599 = var10.field4599;
                    this.field4619 = var10.field4619;
                    return;
                }
            }
            if (arg7 && this.field4629.field4402 != -1) {
                this.field4599 = (int) (Math.random() * (double) this.field4629.field4419.length);
                this.field4619 -= (int) (Math.random() * (double) this.field4629.field4406[this.field4599]);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBIII)V")
    public final void method129(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4605++;
        if (arg1 > -4) {
            field4626 = null;
        }
        this.method1791((arg4 + (arg3 - arg4 >> 1)) * 128 + 64, -124, (arg0 - -(-arg0 + arg2 >> 1)) * 128 + 64);
    }
}
