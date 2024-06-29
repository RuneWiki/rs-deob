import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class416 extends class704 {

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "[B")
    public byte[] field5907;

    @OriginalMember(owner = "client!hm", name = "w", descriptor = "Llc;")
    public static class435 field5904 = new class435(73, 6);

    @OriginalMember(owner = "client!hm", name = "N", descriptor = "I")
    public static int field5920 = 0;

    @OriginalMember(owner = "client!hm", name = "M", descriptor = "Z")
    public static boolean field5919 = false;

    @OriginalMember(owner = "client!hm", name = "x", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!hm", name = "y", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!hm", name = "A", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!hm", name = "B", descriptor = "I")
    public int field5909;

    @OriginalMember(owner = "client!hm", name = "C", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!hm", name = "D", descriptor = "I")
    public static int field5911;

    @OriginalMember(owner = "client!hm", name = "E", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!hm", name = "F", descriptor = "I")
    public int field5913;

    @OriginalMember(owner = "client!hm", name = "G", descriptor = "I")
    public int field5914;

    @OriginalMember(owner = "client!hm", name = "H", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!hm", name = "I", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!hm", name = "J", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!hm", name = "L", descriptor = "I")
    public int field5918;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(II)Z", line = 6)
    public static final boolean method2507(int arg0, int arg1) {
        field5910++;
        if (class542.field7863[arg0]) {
            return true;
        } else if (class316.field4267.method2617(0, arg0)) {
            int var2 = class316.field4267.method2616(arg0, arg1 + 2113733296);
            if (var2 == 0) {
                class542.field7863[arg0] = true;
                return true;
            }
            if (class600.field8524[arg0] == null) {
                class600.field8524[arg0] = new class146[var2];
            }
            if (arg1 != -2113733296) {
                field5920 = -59;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class600.field8524[arg0][var3] == null) {
                    byte[] var4 = class316.field4267.method2600(arg1 ^ 0x8202FD50, arg0, var3);
                    if (var4 != null) {
                        class146 var5 = class600.field8524[arg0][var3] = new class146();
                        var5.field2079 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method1029(new class479(var4), 80);
                    }
                }
            }
            class542.field7863[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIII)Z", line = 63)
    public static final boolean method2508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5908++;
        int var6 = arg0;
        if (arg1 != 3435) {
            return false;
        }
        while (arg4 >= var6) {
            for (int var7 = arg5; var7 <= arg3; var7++) {
                if (class558.field8115[var6][var7] == arg2 && class21.field196[var6][var7] <= 1) {
                    return true;
                }
            }
            var6++;
        }
        return false;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V", line = 95)
    public final void method2509(byte arg0) {
        field5905++;
        int var2 = -1;
        if (arg0 != 23) {
            return;
        }
        int var3 = this.field5907.length - 8;
        while (var2 < var3) {
            var2++;
            this.field5907[var2] = 0;
            var2++;
            this.field5907[var2] = 0;
            var2++;
            this.field5907[var2] = 0;
            var2++;
            this.field5907[var2] = 0;
            var2++;
            this.field5907[var2] = 0;
            var2++;
            this.field5907[var2] = 0;
            var2++;
            this.field5907[var2] = 0;
            var2++;
            this.field5907[var2] = 0;
        }
        while (this.field5907.length - 1 > var2) {
            var2++;
            this.field5907[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(III)Z", line = 124)
    public final boolean method2510(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method2512(-25, 74, 44, (byte) 13, -119, -77, -11);
        }
        field5912++;
        return (arg0 * arg1) <= this.field5907.length;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IILd;IILha;I)V", line = 141)
    public static final void method2511(int arg0, int arg1, class267 arg2, int arg3, int arg4, class543 arg5, int arg6) {
        field5906++;
        if (class499.field7172 < 100) {
            class45.method444(arg5, arg2, 1535);
        }
        arg5.method297(arg3, arg1, arg0 + arg3, arg1 - -arg6);
        if (class499.field7172 < 100) {
            byte var7 = 20;
            int var8 = arg0 / 2 + arg3;
            int var9 = arg6 / 2 + (arg1 - (var7 + 18));
            arg5.method397(arg3, arg1, arg0, arg6, -16777216, 0);
            arg5.method305(var8 - 152, var9, 304, 34, class597.field8487[class266.field3801].getRGB(), 0);
            arg5.method397(var8 - 150, var9 + 2, class499.field7172 * 3, 30, class181.field2501[class266.field3801].getRGB(), 0);
            class193.field2838.method2424((byte) 106, -1, var7 + var9, var8, class608.field8638.method3543(-24350, class45.field748), class280.field3927[class266.field3801].getRGB());
            return;
        }
        int var10 = class488.field7039 - (int) ((float) arg0 / class664.field9492);
        int var11 = (int) ((float) arg6 / class664.field9492) + class78.field1135;
        int var12 = (int) ((float) arg0 / class664.field9492) + class488.field7039;
        class541.field7848 = class488.field7039 - ((int) ((float) arg0 / class664.field9492));
        class542.field7857 = (int) ((float) (arg0 * 2) / class664.field9492);
        if (arg4 >= -23) {
            method2514(-46, null);
        }
        int var13 = class78.field1135 - ((int) ((float) arg6 / class664.field9492));
        class362.field5295 = (int) ((float) (arg6 * 2) / class664.field9492);
        class493.field7103 = class78.field1135 - ((int) ((float) arg6 / class664.field9492));
        class664.method3797(class664.field9502 + var10, class664.field9498 + var11, var12 + class664.field9502, var13 - -class664.field9498, arg3, arg1, arg0 + arg3, arg1 + arg6 + 1);
        class664.method3802(arg5);
        class611 var14 = class664.method3782(arg5);
        class539.method3250(0, 0, arg5, var14, false);
        if (class672.field9575 > 0) {
            class556.field8080--;
            if (class556.field8080 == 0) {
                class672.field9575--;
                class556.field8080 = 20;
            }
        }
        if (!class372.field5403) {
            return;
        }
        int var15 = arg0 + arg3 - 5;
        int var16 = arg1 + arg6 - 8;
        class208.field3141.method2427(-1, var15, "Fps:" + class162.field2322, var16, 16776960, (byte) 77);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class208.field3141.method2427(-1, var15, "Mem:" + var18 + "k", var20, var19, (byte) 58);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIBIII)V", line = 225)
    public final void method2512(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field5916++;
        int var8 = 0;
        if (arg2 != arg4) {
            var8 = (arg1 - arg0 << 16) / (arg4 - arg2);
        }
        int var9 = 0;
        if (arg4 != arg5) {
            var9 = (arg6 - arg1 << 16) / (arg5 - arg4);
        }
        if (arg3 < 49) {
            return;
        }
        int var10 = 0;
        if (arg2 != arg5) {
            var10 = (arg0 - arg6 << 16) / (arg2 - arg5);
        }
        if (arg2 <= arg4 && arg2 <= arg5) {
            if (arg5 > arg4) {
                int var11;
                int var12 = var11 = arg0 << 16;
                if (arg2 < 0) {
                    var11 -= arg2 * var8;
                    var12 -= arg2 * var10;
                    arg2 = 0;
                }
                int var13 = arg1 << 16;
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg2 != arg4 && var8 > var10 || arg2 == arg4 && var9 < var10) {
                    int var14 = arg5 - arg4;
                    int var15 = arg4 - arg2;
                    int var16 = this.field5918 * arg2;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class234.method1633(var12 >> 16, 0, var13 >> 16, (byte) -79, var16, this.field5907);
                                var12 += var10;
                                var16 += this.field5918;
                                var13 += var9;
                            }
                        }
                        class234.method1633(var12 >> 16, 0, var11 >> 16, (byte) -81, var16, this.field5907);
                        var12 += var10;
                        var16 += this.field5918;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg5 - arg4;
                    int var18 = arg4 - arg2;
                    int var19 = this.field5918 * arg2;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class234.method1633(var13 >> 16, 0, var12 >> 16, (byte) -123, var19, this.field5907);
                                var19 += this.field5918;
                                var13 += var9;
                                var12 += var10;
                            }
                        }
                        class234.method1633(var11 >> 16, 0, var12 >> 16, (byte) -116, var19, this.field5907);
                        var19 += this.field5918;
                        var12 += var10;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg0 << 16;
                if (arg2 < 0) {
                    var20 -= arg2 * var8;
                    var21 -= arg2 * var10;
                    arg2 = 0;
                }
                int var22 = arg6 << 16;
                if (arg5 < 0) {
                    var22 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg2 != arg5 && var10 < var8 || arg2 == arg5 && var8 < var9) {
                    int var23 = arg4 - arg5;
                    int var24 = arg5 - arg2;
                    int var25 = this.field5918 * arg2;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class234.method1633(var22 >> 16, 0, var20 >> 16, (byte) -94, var25, this.field5907);
                                var20 += var8;
                                var22 += var9;
                                var25 += this.field5918;
                            }
                        }
                        class234.method1633(var21 >> 16, 0, var20 >> 16, (byte) -35, var25, this.field5907);
                        var25 += this.field5918;
                        var20 += var8;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg4 - arg5;
                    int var27 = arg5 - arg2;
                    int var28 = this.field5918 * arg2;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class234.method1633(var20 >> 16, 0, var22 >> 16, (byte) -61, var28, this.field5907);
                                var28 += this.field5918;
                                var20 += var8;
                                var22 += var9;
                            }
                        }
                        class234.method1633(var20 >> 16, 0, var21 >> 16, (byte) -46, var28, this.field5907);
                        var20 += var8;
                        var21 += var10;
                        var28 += this.field5918;
                    }
                }
            }
        } else if (arg5 >= arg4) {
            if (arg2 <= arg5) {
                int var29;
                int var30 = var29 = arg1 << 16;
                if (arg4 < 0) {
                    var30 -= arg4 * var8;
                    var29 -= arg4 * var9;
                    arg4 = 0;
                }
                int var31 = arg0 << 16;
                if (arg2 < 0) {
                    var31 -= arg2 * var10;
                    arg2 = 0;
                }
                if (var9 <= var8) {
                    int var32 = arg5 - arg2;
                    int var33 = arg2 - arg4;
                    int var34 = this.field5918 * arg4;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class234.method1633(var29 >> 16, 0, var31 >> 16, (byte) -121, var34, this.field5907);
                                var31 += var10;
                                var29 += var9;
                                var34 += this.field5918;
                            }
                        }
                        class234.method1633(var29 >> 16, 0, var30 >> 16, (byte) -121, var34, this.field5907);
                        var34 += this.field5918;
                        var30 += var8;
                        var29 += var9;
                    }
                } else {
                    int var35 = arg5 - arg2;
                    int var36 = arg2 - arg4;
                    int var37 = this.field5918 * arg4;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class234.method1633(var31 >> 16, 0, var29 >> 16, (byte) -56, var37, this.field5907);
                                var29 += var9;
                                var37 += this.field5918;
                                var31 += var10;
                            }
                        }
                        class234.method1633(var30 >> 16, 0, var29 >> 16, (byte) -123, var37, this.field5907);
                        var37 += this.field5918;
                        var29 += var9;
                        var30 += var8;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg1 << 16;
                if (arg4 < 0) {
                    var38 -= arg4 * var9;
                    var39 -= arg4 * var8;
                    arg4 = 0;
                }
                int var40 = arg6 << 16;
                if (arg5 < 0) {
                    var40 -= arg5 * var10;
                    arg5 = 0;
                }
                if (arg4 != arg5 && var8 < var9 || arg4 == arg5 && var8 > var10) {
                    int var41 = arg2 - arg5;
                    int var42 = arg5 - arg4;
                    int var43 = this.field5918 * arg4;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class234.method1633(var39 >> 16, 0, var40 >> 16, (byte) -87, var43, this.field5907);
                                var39 += var8;
                                var43 += this.field5918;
                                var40 += var10;
                            }
                        }
                        class234.method1633(var39 >> 16, 0, var38 >> 16, (byte) -78, var43, this.field5907);
                        var38 += var9;
                        var43 += this.field5918;
                        var39 += var8;
                    }
                } else {
                    int var44 = arg2 - arg5;
                    int var45 = arg5 - arg4;
                    int var46 = this.field5918 * arg4;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class234.method1633(var40 >> 16, 0, var39 >> 16, (byte) -48, var46, this.field5907);
                                var40 += var10;
                                var39 += var8;
                                var46 += this.field5918;
                            }
                        }
                        class234.method1633(var38 >> 16, 0, var39 >> 16, (byte) -42, var46, this.field5907);
                        var38 += var9;
                        var39 += var8;
                        var46 += this.field5918;
                    }
                }
            }
        } else if (arg2 < arg4) {
            int var47;
            int var48 = var47 = arg6 << 16;
            if (arg5 < 0) {
                var47 -= arg5 * var10;
                var48 -= arg5 * var9;
                arg5 = 0;
            }
            int var49 = arg0 << 16;
            if (arg2 < 0) {
                var49 -= arg2 * var8;
                arg2 = 0;
            }
            if (var10 <= var9) {
                int var50 = arg4 - arg2;
                int var51 = arg2 - arg5;
                int var52 = this.field5918 * arg5;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class234.method1633(var49 >> 16, 0, var48 >> 16, (byte) -103, var52, this.field5907);
                            var49 += var8;
                            var48 += var9;
                            var52 += this.field5918;
                        }
                    }
                    class234.method1633(var47 >> 16, 0, var48 >> 16, (byte) -34, var52, this.field5907);
                    var52 += this.field5918;
                    var47 += var10;
                    var48 += var9;
                }
            } else {
                int var53 = arg4 - arg2;
                int var54 = arg2 - arg5;
                int var55 = this.field5918 * arg5;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class234.method1633(var48 >> 16, 0, var49 >> 16, (byte) -32, var55, this.field5907);
                            var55 += this.field5918;
                            var48 += var9;
                            var49 += var8;
                        }
                    }
                    class234.method1633(var48 >> 16, 0, var47 >> 16, (byte) -77, var55, this.field5907);
                    var55 += this.field5918;
                    var47 += var10;
                    var48 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg6 << 16;
            int var58 = arg1 << 16;
            if (arg5 < 0) {
                var57 -= arg5 * var9;
                var56 -= arg5 * var10;
                arg5 = 0;
            }
            if (arg4 < 0) {
                var58 -= arg4 * var8;
                arg4 = 0;
            }
            if (var9 >= var10) {
                int var59 = arg2 - arg4;
                int var60 = arg4 - arg5;
                int var61 = this.field5918 * arg5;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class234.method1633(var56 >> 16, 0, var58 >> 16, (byte) -87, var61, this.field5907);
                            var56 += var10;
                            var61 += this.field5918;
                            var58 += var8;
                        }
                    }
                    class234.method1633(var56 >> 16, 0, var57 >> 16, (byte) -50, var61, this.field5907);
                    var56 += var10;
                    var57 += var9;
                    var61 += this.field5918;
                }
            } else {
                int var62 = arg2 - arg4;
                int var63 = arg4 - arg5;
                int var64 = this.field5918 * arg5;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class234.method1633(var58 >> 16, 0, var56 >> 16, (byte) -103, var64, this.field5907);
                            var56 += var10;
                            var58 += var8;
                            var64 += this.field5918;
                        }
                    }
                    class234.method1633(var57 >> 16, 0, var56 >> 16, (byte) -75, var64, this.field5907);
                    var64 += this.field5918;
                    var56 += var10;
                    var57 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIII)V", line = 664)
    public final void method2513(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5909 = arg3;
        if (arg4 != 32428) {
            field5920 = -36;
        }
        field5917++;
        this.field5913 = arg0 - arg1;
        this.field5914 = arg1;
        this.field5918 = arg2 - arg3;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILsl;)Lnj;", line = 686)
    public static final class709 method2514(int arg0, class479 arg1) {
        if (arg0 > -17) {
            return null;
        } else {
            field5915++;
            return new class709(arg1.method2870(-11395), arg1.method2870(-11395), arg1.method2870(-11395), arg1.method2870(-11395), arg1.method2865(255), arg1.method2865(255), arg1.method2886(true));
        }
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(B)V", line = 698)
    public static void method2515(byte arg0) {
        if (arg0 <= 64) {
            field5920 = 44;
        }
        field5904 = null;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lch;II)V", line = 708)
    public class416(class38 arg0, int arg1, int arg2) {
        this.field5907 = new byte[arg1 * arg2];
    }
}
