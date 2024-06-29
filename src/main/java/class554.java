import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class554 extends class676 {

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "Lco;")
    public class119 field7934;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "S")
    private short field7936;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "S")
    private short field7939;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "S")
    private short field7938;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "S")
    private short field7933;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "S")
    private short field7935;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    private int field7931;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    private int field7937;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "S")
    private short field7932;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "()V")
    public final void method3245() {
        this.field7934.field1219.field3134[this.field7932] = null;
        class465.field6672[class89.field933] = this;
        class89.field933 = class89.field933 + 1 & 1023;
        this.method2401((byte) -57);
        this.method3279((byte) 70);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lha;J)V")
    public final void method3246(class58 arg0, long arg1) {
        int var4 = super.field9573 >> class748.field10430 + 12;
        int var5 = super.field9571 >> class748.field10430 + 12;
        int var6 = super.field9578 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class284.field3473 && var5 >= 0 && var5 < class151.field1664) {
            class257 var7 = this.field7934.field1219;
            class170 var8 = this.field7934.field1232;
            class278[] var9 = class504.field7120;
            int var10 = var7.field3149;
            class691 var11 = class638.field9170[var7.field3149][var4][var5];
            if (var11 != null) {
                var10 = var11.field9727;
            }
            int var12 = var9[var10].method1671(var5, var4, (byte) 117);
            int var13;
            if (var10 < class723.field10134 - 1) {
                var13 = var9[var10 + 1].method1671(var5, var4, (byte) 102);
            } else {
                var13 = var12 - (8 << class748.field10430);
            }
            if (var8.field1929) {
                if (var8.field1925 == -1 && var6 > var12) {
                    this.method3245();
                    return;
                }
                if (var8.field1925 >= 0 && var6 > var9[var8.field1925].method1671(var5, var4, (byte) -78)) {
                    this.method3245();
                    return;
                }
                if (var8.field1976 == -1 && var6 < var13) {
                    this.method3245();
                    return;
                }
                if (var8.field1976 >= 0 && var6 < var9[var8.field1976 + 1].method1671(var5, var4, (byte) -102)) {
                    this.method3245();
                    return;
                }
            }
            int var14;
            for (var14 = class723.field10134 - 1; var14 > 0 && var6 > var9[var14].method1671(var5, var4, (byte) 124); --var14) {
            }
            if (var8.field1936 && var14 == 0 && var6 > var9[0].method1671(var5, var4, (byte) 51)) {
                this.method3245();
            } else if (class723.field10134 - 1 == var14 && var9[var14].method1671(var5, var4, (byte) 50) - var6 > 8 << class748.field10430) {
                this.method3245();
            } else {
                class691 var15 = class638.field9170[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class638.field9170[0][var4][var5] == null) {
                        var15 = class638.field9170[0][var4][var5] = new class691(0);
                    }
                    boolean var16 = class638.field9170[0][var4][var5].field9737 != null;
                    if (var14 == 3 && var16) {
                        this.method3245();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class638.field9170[var17][var4][var5] == null) {
                            var15 = class638.field9170[var17][var4][var5] = new class691(var17);
                            if (var16) {
                                ++var15.field9727;
                            }
                        }
                    }
                }
                if (var8.field1923) {
                    int var18 = super.field9573 >> 12;
                    int var19 = super.field9571 >> 12;
                    if (var15.field9728 != null) {
                        class642 var20 = var15.field9728.method983(0, arg0);
                        if (var20 != null && var20.method3660(var18, false, var19, var6)) {
                            this.method3245();
                            return;
                        }
                    }
                    if (var15.field9725 != null) {
                        class642 var21 = var15.field9725.method983(0, arg0);
                        if (var21 != null && var21.method3660(var18, false, var19, var6)) {
                            this.method3245();
                            return;
                        }
                    }
                    if (var15.field9736 != null) {
                        class642 var22 = var15.field9736.method983(0, arg0);
                        if (var22 != null && var22.method3660(var18, false, var19, var6)) {
                            this.method3245();
                            return;
                        }
                    }
                    for (class398 var23 = var15.field9739; var23 != null; var23 = var23.field5451) {
                        class642 var24 = var23.field5449.method983(0, arg0);
                        if (var24 != null && var24.method3660(var18, false, var19, var6)) {
                            this.method3245();
                            return;
                        }
                    }
                }
                var7.field3145.field10032.method1076(this, -26776);
            }
        } else {
            this.method3245();
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lco;IIIIIIIIIIIZZ)V")
    public final void method3247(class119 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field7934 = arg0;
        super.field9573 = arg1 << 12;
        super.field9578 = arg2 << 12;
        super.field9571 = arg3 << 12;
        super.field9576 = arg9;
        this.field7939 = this.field7936 = (short) arg8;
        super.field9566 = arg10;
        super.field9569 = arg11;
        super.field9574 = arg13;
        this.field7938 = (short) arg4;
        this.field7933 = (short) arg5;
        this.field7935 = (short) arg6;
        this.field7931 = arg7;
        super.field9568 = this.field7934.field1231.field7963;
        this.method3248();
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "()V")
    private final void method3248() {
        int var1 = this.field7934.field1219.field3141;
        if (this.field7934.field1219.field3134[var1] != null) {
            this.field7934.field1219.field3134[var1].method3245();
        }
        this.field7934.field1219.field3134[var1] = this;
        this.field7932 = (short) this.field7934.field1219.field3141;
        this.field7934.field1219.field3141 = var1 + 1 & 8191;
        this.field7934.field1221.method2792((byte) -13, this);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(JI)V")
    public final void method3249(long arg0, int arg1) {
        this.field7936 = (short) (this.field7936 - arg1);
        if (this.field7936 <= 0) {
            this.method3245();
        } else {
            int var4 = super.field9573 >> 12;
            int var5 = super.field9578 >> 12;
            int var6 = super.field9571 >> 12;
            class257 var7 = this.field7934.field1219;
            class170 var8 = this.field7934.field1232;
            if (var8.field1945 != 0) {
                if (this.field7939 - this.field7936 <= var8.field1928) {
                    int var9 = var8.field1946 * arg1 + (super.field9576 >> 8 & 65280) + (this.field7937 >> 16 & 255);
                    int var10 = var8.field1933 * arg1 + (this.field7937 >> 8 & 255) + (super.field9576 & 65280);
                    int var11 = var8.field1966 * arg1 + (super.field9576 << 8 & 65280) + (this.field7937 & 255);
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > 65535) {
                        var9 = 65535;
                    }
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 65535) {
                        var10 = 65535;
                    }
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 65535) {
                        var11 = 65535;
                    }
                    super.field9576 &= -16777216;
                    super.field9576 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field7937 &= -16777216;
                    this.field7937 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field7939 - this.field7936 <= var8.field1940) {
                    int var12 = var8.field1939 * arg1 + (super.field9576 >> 16 & 65280) + (this.field7937 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field9576 &= 16777215;
                    super.field9576 |= (var12 & 65280) << 16;
                    this.field7937 &= 16777215;
                    this.field7937 |= (var12 & 255) << 24;
                }
            }
            if (var8.field1926 != -1 && this.field7939 - this.field7936 <= var8.field1942) {
                this.field7931 += var8.field1943 * arg1;
            }
            if (var8.field1962 != -1 && this.field7939 - this.field7936 <= var8.field1935) {
                super.field9566 += var8.field1932 * arg1;
            }
            double var13 = (double) this.field7938;
            double var15 = (double) this.field7933;
            double var17 = (double) this.field7935;
            boolean var19 = false;
            if (var8.field1960 == 1) {
                int var20 = var4 - this.field7934.field1226.field1070;
                int var21 = var5 - this.field7934.field1226.field1066;
                int var22 = var6 - this.field7934.field1226.field1071;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field1965 * var23 * arg1);
                this.field7931 = (int) ((long) this.field7931 - ((long) this.field7931 * var24 >> 18));
            } else if (var8.field1960 == 2) {
                int var26 = var4 - this.field7934.field1226.field1070;
                int var27 = var5 - this.field7934.field1226.field1066;
                int var28 = var6 - this.field7934.field1226.field1071;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field1965 * var29 * arg1);
                this.field7931 = (int) ((long) this.field7931 - ((long) this.field7931 * var30 >> 28));
            }
            if (var8.field1961 != null) {
                class134 var32 = var7.field3143.field3563;
                for (class134 var33 = var32.field1521; var32 != var33; var33 = var33.field1521) {
                    class570 var34 = (class570) var33;
                    class40 var35 = var34.field8092;
                    if (var35.field453 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field1961.length; ++var37) {
                            if (var8.field1961[var37] == var35.field458) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field8095);
                            double var40 = (double) (var5 - var34.field8097);
                            double var42 = (double) (var6 - var34.field8088);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field462)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field8090 * var42 + (double) var34.field8091 * var38 + (double) var35.field455 * var40) * 65535.0D / ((double) var35.field445 * var46);
                                if (!(var48 < (double) var35.field443)) {
                                    double var50 = 0.0D;
                                    if (var35.field444 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field439;
                                    } else if (var35.field444 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field439;
                                    }
                                    if (var35.field442 == 0) {
                                        if (var35.field448 == 0) {
                                            var13 += ((double) var34.field8091 - var50) * (double) arg1;
                                            var15 += ((double) var35.field455 - var50) * (double) arg1;
                                            var17 += ((double) var34.field8090 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field9573 = (int) ((double) super.field9573 + ((double) var34.field8091 - var50) * (double) arg1);
                                            super.field9578 = (int) ((double) super.field9578 + ((double) var35.field455 - var50) * (double) arg1);
                                            super.field9571 = (int) ((double) super.field9571 + ((double) var34.field8090 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field445;
                                        double var54 = var40 / var46 * (double) var35.field445;
                                        double var56 = var42 / var46 * (double) var35.field445;
                                        if (var35.field448 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field9573 = (int) ((double) super.field9573 + (double) arg1 * var52);
                                            super.field9578 = (int) ((double) super.field9578 + (double) arg1 * var54);
                                            super.field9571 = (int) ((double) super.field9571 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field1950 != null) {
                for (int var58 = 0; var58 < var8.field1950.length; ++var58) {
                    class570 var59 = (class570) class629.field9032.method1958(-1, (long) var8.field1950[var58]);
                    while (var59 != null) {
                        class40 var60 = var59.field8092;
                        double var61 = (double) (var4 - var59.field8095);
                        double var63 = (double) (var5 - var59.field8097);
                        double var65 = (double) (var6 - var59.field8088);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field462) {
                            var59 = (class570) class629.field9032.method1953(-29571);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field8090 * var65 + (double) var59.field8091 * var61 + (double) var60.field455 * var63) * 65535.0D / ((double) var60.field445 * var69);
                            if (var71 < (double) var60.field443) {
                                var59 = (class570) class629.field9032.method1953(-29571);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field444 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field439;
                                } else if (var60.field444 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field439;
                                }
                                if (var60.field442 == 0) {
                                    if (var60.field448 == 0) {
                                        var13 += ((double) var59.field8091 - var73) * (double) arg1;
                                        var15 += ((double) var60.field455 - var73) * (double) arg1;
                                        var17 += ((double) var59.field8090 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field9573 = (int) ((double) super.field9573 + ((double) var59.field8091 - var73) * (double) arg1);
                                        super.field9578 = (int) ((double) super.field9578 + ((double) var60.field455 - var73) * (double) arg1);
                                        super.field9571 = (int) ((double) super.field9571 + ((double) var59.field8090 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field445;
                                    double var77 = var63 / var69 * (double) var60.field445;
                                    double var79 = var65 / var69 * (double) var60.field445;
                                    if (var60.field448 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field9573 = (int) ((double) super.field9573 + (double) arg1 * var75);
                                        super.field9578 = (int) ((double) super.field9578 + (double) arg1 * var77);
                                        super.field9571 = (int) ((double) super.field9571 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class570) class629.field9032.method1953(-29571);
                            }
                        }
                    }
                }
            }
            if (var8.field1978 != null) {
                if (var8.field1949 == null) {
                    var8.field1949 = new int[var8.field1978.length];
                    for (int var81 = 0; var81 < var8.field1978.length; ++var81) {
                        class299.method1770(true, var8.field1978[var81]);
                        var8.field1949[var81] = ((class716) class436.field6353.method1754(false, (long) var8.field1978[var81])).field10054;
                    }
                }
                for (int var82 = 0; var82 < var8.field1949.length; ++var82) {
                    class40 var83 = class552.field7916[var8.field1949[var82]];
                    if (var83.field448 == 0) {
                        var13 += (double) (var83.field438 * arg1);
                        var15 += (double) (var83.field455 * arg1);
                        var17 += (double) (var83.field440 * arg1);
                        var19 = true;
                    } else {
                        super.field9573 += var83.field438 * arg1;
                        super.field9578 += var83.field455 * arg1;
                        super.field9571 += var83.field440 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field7938 = (short) ((int) var13);
                        this.field7933 = (short) ((int) var15);
                        this.field7935 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field7931 <<= 1;
                }
            }
            super.field9573 = (int) ((long) super.field9573 + ((long) (this.field7931 << 2) * (long) this.field7938 >> 23) * (long) arg1);
            super.field9578 = (int) ((long) super.field9578 + ((long) (this.field7931 << 2) * (long) this.field7933 >> 23) * (long) arg1);
            super.field9571 = (int) ((long) super.field9571 + ((long) (this.field7931 << 2) * (long) this.field7935 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lco;IIIIIIIIIIIZZ)V")
    public class554(class119 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field7934 = arg0;
        super.field9573 = arg1 << 12;
        super.field9578 = arg2 << 12;
        super.field9571 = arg3 << 12;
        super.field9576 = arg9;
        this.field7939 = this.field7936 = (short) arg8;
        super.field9566 = arg10;
        super.field9569 = arg11;
        super.field9574 = arg13;
        this.field7938 = (short) arg4;
        this.field7933 = (short) arg5;
        this.field7935 = (short) arg6;
        this.field7931 = arg7;
        super.field9568 = this.field7934.field1231.field7963;
        this.method3248();
    }
}
