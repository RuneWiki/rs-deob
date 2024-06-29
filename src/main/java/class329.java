import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class329 extends class256 {

    @OriginalMember(owner = "client!sc", name = "Fc", descriptor = "I")
    public static int field4966 = 0;

    @OriginalMember(owner = "client!sc", name = "vc", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!sc", name = "wc", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!sc", name = "xc", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!sc", name = "yc", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!sc", name = "zc", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!sc", name = "Bc", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!sc", name = "Cc", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!sc", name = "Ec", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!sc", name = "Gc", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!sc", name = "Ic", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!sc", name = "Ac", descriptor = "Lff;")
    public class181 field4961;

    @OriginalMember(owner = "client!sc", name = "Hc", descriptor = "Lclient;")
    public static client field4968;

    @OriginalMember(owner = "client!sc", name = "Dc", descriptor = "Ljava/awt/Frame;")
    public static Frame field4964;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V", line = 6)
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4956++;
        if (this.field4961 == null) {
            ;
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)I", line = 19)
    public final int method1646(int arg0) {
        if (arg0 <= 87) {
            this.finalize();
        }
        field4962++;
        if (class39.field448 != 0 && this.field4961.field2476 != null) {
            class181 var2 = this.field4961.method1266((byte) -42);
            if (var2 != null && var2.field2458 != -1) {
                return var2.field2458;
            }
        }
        return this.field3738;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(II)V", line = 45)
    public static final void method2298(int arg0, int arg1) {
        field4958++;
        int var2 = class198.field2820;
        int var3 = class101.field1394;
        int var4 = class275.field4123;
        int var5 = class204.field2944;
        int var6 = class236.field3347;
        int var7 = (int) class124.field1674;
        if (var7 < class93.field1286 / 256) {
            var7 = class93.field1286 / 256;
        }
        int var8 = (int) class89.field1257 + class7.field67 & 0x7FF;
        if (class306.field4592[4] && var7 < class237.field3364[4] + 128) {
            var7 = class237.field3364[4] + 128;
        }
        class209.method1469(var8, var7, arg0, var7 * 3 + 600, class111.field1505, class135.method985(class173.field2356.field3679, class251.field3603, class173.field2356.field3745, (byte) -94) - 50, class17.field228, (byte) 20);
        if (class198.field2820 == var2 && class101.field1394 == var3 && class275.field4123 == var4 && class204.field2944 == var5 && class236.field3347 == var6) {
            class343.field5168 = 1;
            return;
        }
        class175.field2379 = 10;
        class242.field3460 = 10;
        int var9 = class236.field3347 - var6;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        class171.field2338 = 10;
        if (arg1 >= -28) {
            field4966 = 9;
        }
        class232.field3280 = 10;
        if (var3 < class101.field1394) {
            var3 += (class101.field1394 - var3) * class232.field3280 / 1000 + class242.field3460;
            if (class101.field1394 > var3) {
                class101.field1394 = var3;
            }
        }
        if (class101.field1394 < var3) {
            int var10 = var3 - (class242.field3460 + ((var3 - class101.field1394) * class232.field3280 / 1000));
            if (class101.field1394 < var10) {
                class101.field1394 = var10;
            }
        }
        if (var2 < class198.field2820) {
            var2 += (class198.field2820 - var2) * class232.field3280 / 1000 + class242.field3460;
            if (class198.field2820 > var2) {
                class198.field2820 = var2;
            }
        }
        if (var9 < -1024) {
            var9 += 2048;
        }
        if (class204.field2944 > var5) {
            var5 += class175.field2379 + ((class204.field2944 - var5) * class171.field2338 / 1000);
            if (class204.field2944 > var5) {
                class204.field2944 = var5;
            }
        }
        if (var9 > 0) {
            int var11 = class171.field2338 * var9 / 1000 + class175.field2379 + var6;
            var6 = var11 & 0x7FF;
        }
        if (var2 > class198.field2820) {
            int var12 = var2 - ((var2 - class198.field2820) * class232.field3280 / 1000 + class242.field3460);
            if (class198.field2820 < var12) {
                class198.field2820 = var12;
            }
        }
        if (class204.field2944 < var5) {
            int var13 = var5 - ((var5 - class204.field2944) * class171.field2338 / 1000 + class175.field2379);
            if (var13 > class204.field2944) {
                class204.field2944 = var13;
            }
        }
        if (class275.field4123 > var4) {
            var4 += (class275.field4123 - var4) * class232.field3280 / 1000 + class242.field3460;
            if (class275.field4123 > var4) {
                class275.field4123 = var4;
            }
        }
        if (var9 < 0) {
            int var14 = var6 - (class175.field2379 + (-var9 * class171.field2338 / 1000));
            var6 = var14 & 0x7FF;
        }
        int var15 = class236.field3347 - var6;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var4 > class275.field4123) {
            int var16 = var4 - ((var4 - class275.field4123) * class232.field3280 / 1000 + class242.field3460);
            if (class275.field4123 < var16) {
                class275.field4123 = var16;
            }
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 >= 0 || var9 <= 0 || var15 > 0 && var9 < 0) {
            class236.field3347 = var6;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()I", line = 195)
    public final int method105() {
        field4967++;
        return this.field3766;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIIIJILsa;)V", line = 207)
    public final void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class265 arg10) {
        field4965++;
        if (this.field4961 == null) {
            return;
        }
        class125 var13 = this.field3668 != -1 && this.field3762 == 0 ? class52.method361(true, this.field3668) : null;
        class125 var14 = this.field3719 == -1 || this.field3719 == this.method1753(-1).field2665 && var13 != null ? null : class52.method361(true, this.field3719);
        class345 var15 = this.field4961.method1255(this.field3688, this.field3682, false, this.field3674, this.field3725, var13, var14, this.field3689, this.field3684, this.field3724);
        if (var15 == null) {
            return;
        }
        this.field3766 = var15.method105();
        class181 var16 = this.field4961;
        if (var16.field2476 != null) {
            var16 = var16.method1266((byte) 127);
        }
        if (class342.field5117 && var16.field2441) {
            class345 var17 = class278.method1930(this.field4961.field2426, var15, this.field3679, this.field4961.field2484, this.field3761, this.field3745, var14 == null ? this.field3684 : this.field3689, this.field4961.field2468, 128, this.field3698, this.field4961.field2479, this.field4961.field2424, arg0, var14 == null ? var13 : var14);
            if (class67.field908) {
                float var18 = class67.method470();
                float var19 = class67.method485();
                class67.method475();
                class67.method491(var18, var19 - 150.0F);
                var17.method108(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field3720);
                class67.method482();
                class67.method491(var18, var19);
            } else {
                var17.method108(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field3720);
            }
        }
        this.method1755((byte) -98, var15);
        class345 var20 = null;
        this.method1749(arg0, var15, -31609);
        if (this.field3715 != -1 && this.field3737 != -1) {
            class309 var21 = class336.method2329(-62, this.field3715);
            var20 = var21.method2122(this.field3737, 126, this.field3713, this.field3718);
            if (var20 != null) {
                var20.method334(0, -this.field3692, 0);
                if (var21.field4675) {
                    if (class7.field65 != 0) {
                        var20.method344(class7.field65);
                    }
                    if (class249.field3575 != 0) {
                        var20.method337(class249.field3575);
                    }
                    if (class181.field2433 != 0) {
                        var20.method334(0, class181.field2433, 0);
                    }
                }
            }
        }
        if (!class67.field908) {
            if (var20 != null) {
                var15 = ((class50) var15).method331(var20);
            }
            if (this.field4961.field2424 == 1) {
                var15.field5357 = true;
            }
            var15.method108(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3720);
            return;
        }
        if (this.field4961.field2424 == 1) {
            var15.field5357 = true;
        }
        var15.method108(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3720);
        if (var20 != null) {
            if (this.field4961.field2424 == 1) {
                var20.field5357 = true;
            }
            var20.method108(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3720);
        }
    }

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "(I)V", line = 323)
    public static void method2299(int arg0) {
        int var1 = -25 / ((-arg0 - 37) / 33);
        field4964 = null;
        field4968 = null;
    }

    @OriginalMember(owner = "client!sc", name = "finalize", descriptor = "()V", line = 332)
    protected final void finalize() {
        field4959++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIZI)V", line = 347)
    public static final void method2300(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var6 = arg5 - arg3;
        int var7 = arg0 - arg2;
        field4960++;
        if (var6 == 0) {
            if (var7 != 0) {
                class56.method384(arg2, false, arg1, arg3, arg0);
            }
        } else if (var7 == 0) {
            class332.method2311((byte) 49, arg3, arg1, arg2, arg5);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 > var6;
            if (var8) {
                int var9 = arg3;
                int var10 = arg5;
                arg5 = arg0;
                arg0 = var10;
                arg3 = arg2;
                arg2 = var9;
            }
            if (arg4) {
                field4966 = 114;
            }
            if (arg3 > arg5) {
                int var11 = arg2;
                arg2 = arg0;
                int var12 = arg3;
                arg3 = arg5;
                arg5 = var12;
                arg0 = var11;
            }
            int var13 = arg5 - arg3;
            int var14 = arg2;
            int var15 = arg0 - arg2;
            if (var15 < 0) {
                var15 = -var15;
            }
            int var16 = arg2 < arg0 ? 1 : -1;
            int var17 = -(var13 >> 1);
            if (var8) {
                for (int var18 = arg3; var18 <= arg5; var18++) {
                    class126.field1723[var18][var14] = arg1;
                    var17 += var15;
                    if (var17 > 0) {
                        var14 += var16;
                        var17 -= var13;
                    }
                }
            } else {
                for (int var19 = arg3; var19 <= arg5; var19++) {
                    var17 += var15;
                    class126.field1723[var14][var19] = arg1;
                    if (var17 > 0) {
                        var14 += var16;
                        var17 -= var13;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lff;B)V", line = 463)
    public final void method2301(class181 arg0, byte arg1) {
        if (arg1 != -6) {
            return;
        }
        field4969++;
        this.field4961 = arg0;
        if (this.field3720 != null) {
            this.field3720.method1801();
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)Z", line = 483)
    public final boolean method1652(byte arg0) {
        field4957++;
        if (this.field4961 == null) {
            return false;
        } else {
            if (arg0 != -50) {
                this.method108(92, 25, -71, -85, 6, -122, 99, -9, -92L, -32, (class265) null);
            }
            return true;
        }
    }
}
