import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class282 extends class318 {

    @OriginalMember(owner = "client!sh", name = "Pb", descriptor = "Lok;")
    private static class146 field4832 = class235.method1724(-12908, "Ok");

    @OriginalMember(owner = "client!sh", name = "Lb", descriptor = "Lok;")
    public static class146 field4828 = field4832;

    @OriginalMember(owner = "client!sh", name = "Qb", descriptor = "I")
    public static int field4833 = -1;

    @OriginalMember(owner = "client!sh", name = "Mb", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!sh", name = "Nb", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!sh", name = "Ob", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!sh", name = "Rb", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!sh", name = "Sb", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!sh", name = "Tb", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!sh", name = "Ub", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!sh", name = "Wb", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!sh", name = "Vb", descriptor = "Lbd;")
    public class301 field4838;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)Z", line = 5)
    public final boolean method1719(byte arg0) {
        field4839++;
        if (this.field4838 == null) {
            return false;
        } else {
            if (arg0 > -23) {
                method2046(35);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)V", line = 19)
    public static final void method2043(int arg0, int arg1) {
        field4829++;
        if (~arg0 == arg1) {
            return;
        }
        if (arg0 == 1) {
            class146.method1105(0);
        } else if (arg0 == 2) {
            class81.method578(0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lbd;B)V", line = 44)
    public final void method2044(class301 arg0, byte arg1) {
        this.field4838 = arg0;
        field4835++;
        if (arg1 <= 56) {
            method2043(-115, 49);
        }
        if (this.field5426 != null) {
            this.field5426.method2052();
        }
    }

    @OriginalMember(owner = "client!sh", name = "finalize", descriptor = "()V", line = 64)
    protected final void finalize() {
        field4834++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIIIIJILmk;)V", line = 85)
    public final void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class284 arg10) {
        field4837++;
        if (this.field4838 == null) {
            return;
        }
        class287 var13 = this.field5408 != -1 && this.field5438 == 0 ? class306.method2156(122, this.field5408) : null;
        class287 var14 = this.field5429 == -1 || this.field5429 == this.field5398 && var13 != null ? null : class306.method2156(127, this.field5429);
        class208 var15 = this.field4838.method2134(this.field5443, this.field5422, var13, (byte) 127, var14);
        if (var15 == null) {
            return;
        }
        this.field5386 = var15.method325();
        class301 var16 = this.field4838;
        if (var16.field5092 != null) {
            var16 = var16.method2135(-1);
        }
        if (class281.field4822 && var16.field5143) {
            class208 var17 = class4.method12(this.field5409, var14 == null ? var13 : var14, arg0, this.field4838.field5160, var14 == null ? this.field5443 : this.field5422, this.field4838.field5093, this.field5417, this.field4838.field5150, var15, this.field4838.field5090, this.field5380, this.field4838.field5154, this.field5378, true);
            if (class271.field4640) {
                float var18 = class271.method1976();
                float var19 = class271.method1964();
                class271.method1960();
                class271.method1959(var18, var19 - 150.0F);
                var17.method326(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field5426);
                class271.method1963();
                class271.method1959(var18, var19);
            } else {
                var17.method326(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field5426);
            }
        }
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (this.field4838.field5153 != 0 || this.field4838.field5141 != 0) {
            int var23 = class109.field1757[arg0];
            short var24 = this.field4838.field5153;
            int var25 = -var24 / 2;
            short var26 = this.field4838.field5141;
            int var27 = class109.field1750[arg0];
            int var28 = -var26 / 2;
            int var29 = var23 * var25 + var27 * var28 >> 16;
            int var30 = var23 * var28 - (var25 * var27) >> 16;
            int var31 = class19.method141(this.field5409 + var29, class203.field3387, this.field5380 + var30, 119);
            int var32 = var24 / 2;
            int var33 = -var26 / 2;
            int var34 = var23 * var32 + var27 * var33 >> 16;
            int var35 = var23 * var33 - (var27 * var32) >> 16;
            int var36 = class19.method141(this.field5409 + var34, class203.field3387, this.field5380 + var35, 124);
            int var37 = -var24 / 2;
            int var38 = var26 / 2;
            int var39 = var23 * var38 - var27 * var37 >> 16;
            int var40 = var23 * var37 + var27 * var38 >> 16;
            int var41 = var24 / 2;
            int var42 = class19.method141(this.field5409 + var40, class203.field3387, this.field5380 + var39, 123);
            int var43 = var26 / 2;
            int var44 = var23 * var41 + var27 * var43 >> 16;
            int var45 = var23 * var43 - var27 * var41 >> 16;
            int var46 = class19.method141(this.field5409 + var44, class203.field3387, this.field5380 + var45, 125);
            int var47 = var31 + var46;
            if (var47 > var36 + var42) {
                var47 = var36 + var42;
            }
            int var48 = var31 >= var36 ? var36 : var31;
            int var49 = var46 > var42 ? var42 : var46;
            if (var26 != 0) {
                var20 = (int) (Math.atan2((double) (var48 - var49), (double) var26) * 325.95D) & 0x7FF;
                if (var20 != 0) {
                    var15.method1365(var20);
                }
            }
            int var50 = var46 <= var36 ? var46 : var36;
            int var51 = var31 < var42 ? var31 : var42;
            if (var24 != 0) {
                var22 = (int) (Math.atan2((double) (var51 - var50), (double) var24) * 325.95D) & 0x7FF;
                if (var22 != 0) {
                    var15.method1373(var22);
                }
            }
            var21 = (var47 >> 1) - this.field5417;
            if (var21 != 0) {
                var15.method1374(0, var21, 0);
            }
        }
        class208 var52 = null;
        if (this.field5441 != -1 && this.field5387 != -1) {
            class140 var53 = class73.method540((byte) -123, this.field5441);
            var52 = var53.method1035(this.field5387, (byte) -42);
            if (var52 != null) {
                var52.method1374(0, -this.field5371, 0);
                if (var53.field2356) {
                    if (var20 != 0) {
                        var52.method1365(var20);
                    }
                    if (var22 != 0) {
                        var52.method1373(var22);
                    }
                    if (var21 != 0) {
                        var52.method1374(0, var21, 0);
                    }
                }
            }
        }
        if (!class271.field4640) {
            if (var52 != null) {
                var15 = ((class220) var15).method1619(var52);
            }
            if (this.field4838.field5150 == 1) {
                var15.field3470 = true;
            }
            var15.method326(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5426);
            return;
        }
        if (this.field4838.field5150 == 1) {
            var15.field3470 = true;
        }
        var15.method326(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5426);
        if (var52 != null) {
            if (this.field4838.field5150 == 1) {
                var52.field3470 = true;
            }
            var52.method326(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5426);
        }
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(B)V", line = 294)
    public static final void method2045(byte arg0) {
        field4831++;
        if (!class322.method2236(-7750) && class203.field3387 != class201.field3358) {
            class170.method1315(class273.field4707, class55.field979, false, class203.field3387, 104, class102.field1639.field5419[0], class102.field1639.field5432[0]);
            return;
        }
        int var1 = 41 % ((arg0 - 8) / 44);
        if (class203.field3387 != class127.field2066) {
            class127.field2066 = class203.field3387;
            class170.method1314(class203.field3387, (byte) 124);
            class91.method625(-104);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIII)V", line = 327)
    public final void method316(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4830++;
        if (this.field4838 == null) {
            ;
        }
    }

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(I)V", line = 340)
    public static void method2046(int arg0) {
        if (arg0 != 0) {
            field4832 = (class146) null;
        }
        field4832 = null;
        field4828 = null;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "()I", line = 354)
    public final int method325() {
        field4836++;
        return this.field5386;
    }
}
