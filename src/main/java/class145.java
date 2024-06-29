import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class145 extends class545 {

    @OriginalMember(owner = "client!nr", name = "M", descriptor = "Lod;")
    public class618 field1953;

    @OriginalMember(owner = "client!nr", name = "I", descriptor = "S")
    private short field1949;

    @OriginalMember(owner = "client!nr", name = "N", descriptor = "S")
    private short field1954;

    @OriginalMember(owner = "client!nr", name = "L", descriptor = "S")
    private short field1952;

    @OriginalMember(owner = "client!nr", name = "H", descriptor = "S")
    private short field1948;

    @OriginalMember(owner = "client!nr", name = "P", descriptor = "S")
    private short field1956;

    @OriginalMember(owner = "client!nr", name = "O", descriptor = "I")
    private int field1955;

    @OriginalMember(owner = "client!nr", name = "J", descriptor = "I")
    private int field1950;

    @OriginalMember(owner = "client!nr", name = "K", descriptor = "S")
    private short field1951;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "()V")
    private final void method827() {
        int var1 = this.field1953.field8567.field7149;
        if (this.field1953.field8567.field7154[var1] != null) {
            this.field1953.field8567.field7154[var1].method828();
        }
        this.field1953.field8567.field7154[var1] = this;
        this.field1951 = (short) this.field1953.field8567.field7149;
        this.field1953.field8567.field7149 = var1 + 1 & 8191;
        this.field1953.field8568.method1300(this, -1);
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "()V")
    public final void method828() {
        this.field1953.field8567.field7154[this.field1951] = null;
        class324.field4368[class376.field4982] = this;
        class376.field4982 = class376.field4982 + 1 & 1023;
        this.method3499(12151);
        this.method3940(55);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lr;J)V")
    public final void method829(class562 arg0, long arg1) {
        int var4 = super.field7451 >> class62.field762 + 12;
        int var5 = super.field7456 >> class62.field762 + 12;
        int var6 = super.field7448 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class329.field4421 && var5 >= 0 && var5 < class641.field8846) {
            class514 var7 = this.field1953.field8567;
            class153 var8 = this.field1953.field8571;
            class270[] var9 = class246.field3214;
            int var10 = var7.field7157;
            class207 var11 = class153.field2168[var7.field7157][var4][var5];
            if (var11 != null) {
                var10 = var11.field2776;
            }
            int var12 = var9[var10].method1611(var4, true, var5);
            int var13;
            if (var10 < class171.field2428 - 1) {
                var13 = var9[var10 + 1].method1611(var4, true, var5);
            } else {
                var13 = var12 - (8 << class62.field762);
            }
            if (var8.field2154) {
                if (var8.field2130 == -1 && var6 > var12) {
                    this.method828();
                    return;
                }
                if (var8.field2130 >= 0 && var6 > var9[var8.field2130].method1611(var4, true, var5)) {
                    this.method828();
                    return;
                }
                if (var8.field2127 == -1 && var6 < var13) {
                    this.method828();
                    return;
                }
                if (var8.field2127 >= 0 && var6 < var9[var8.field2127 + 1].method1611(var4, true, var5)) {
                    this.method828();
                    return;
                }
            }
            int var14;
            for (var14 = class171.field2428 - 1; var14 > 0 && var6 > var9[var14].method1611(var4, true, var5); --var14) {
            }
            if (var8.field2111 && var14 == 0 && var6 > var9[0].method1611(var4, true, var5)) {
                this.method828();
            } else if (class171.field2428 - 1 == var14 && var9[var14].method1611(var4, true, var5) - var6 > 8 << class62.field762) {
                this.method828();
            } else {
                class207 var15 = class153.field2168[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class153.field2168[0][var4][var5] == null) {
                        var15 = class153.field2168[0][var4][var5] = new class207(0);
                    }
                    boolean var16 = class153.field2168[0][var4][var5].field2771 != null;
                    if (var14 == 3 && var16) {
                        this.method828();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class153.field2168[var17][var4][var5] == null) {
                            var15 = class153.field2168[var17][var4][var5] = new class207(var17);
                            if (var16) {
                                ++var15.field2776;
                            }
                        }
                    }
                }
                if (var8.field2119) {
                    int var18 = super.field7451 >> 12;
                    int var19 = super.field7456 >> 12;
                    if (var15.field2768 != null) {
                        class475 var20 = var15.field2768.method174(arg0, -14700);
                        if (var20 != null && var20.method2735(var18, (byte) -126, var19, var6)) {
                            this.method828();
                            return;
                        }
                    }
                    if (var15.field2767 != null) {
                        class475 var21 = var15.field2767.method174(arg0, -14700);
                        if (var21 != null && var21.method2735(var18, (byte) -127, var19, var6)) {
                            this.method828();
                            return;
                        }
                    }
                    if (var15.field2765 != null) {
                        class475 var22 = var15.field2765.method174(arg0, -14700);
                        if (var22 != null && var22.method2735(var18, (byte) -126, var19, var6)) {
                            this.method828();
                            return;
                        }
                    }
                    for (class634 var23 = var15.field2774; var23 != null; var23 = var23.field8764) {
                        class475 var24 = var23.field8767.method174(arg0, -14700);
                        if (var24 != null && var24.method2735(var18, (byte) -128, var19, var6)) {
                            this.method828();
                            return;
                        }
                    }
                }
                var7.field7161.field1942.method1877((byte) -18, this);
            }
        } else {
            this.method828();
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(JI)V")
    public final void method830(long arg0, int arg1) {
        this.field1949 = (short) (this.field1949 - arg1);
        if (this.field1949 <= 0) {
            this.method828();
        } else {
            int var4 = super.field7451 >> 12;
            int var5 = super.field7448 >> 12;
            int var6 = super.field7456 >> 12;
            class514 var7 = this.field1953.field8567;
            class153 var8 = this.field1953.field8571;
            if (var8.field2136 != 0) {
                if (this.field1954 - this.field1949 <= var8.field2110) {
                    int var9 = var8.field2160 * arg1 + (super.field7454 >> 8 & 65280) + (this.field1950 >> 16 & 255);
                    int var10 = var8.field2101 * arg1 + (this.field1950 >> 8 & 255) + (super.field7454 & 65280);
                    int var11 = var8.field2133 * arg1 + (super.field7454 << 8 & 65280) + (this.field1950 & 255);
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
                    super.field7454 &= -16777216;
                    super.field7454 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field1950 &= -16777216;
                    this.field1950 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field1954 - this.field1949 <= var8.field2134) {
                    int var12 = var8.field2103 * arg1 + (super.field7454 >> 16 & 65280) + (this.field1950 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field7454 &= 16777215;
                    super.field7454 |= (var12 & 65280) << 16;
                    this.field1950 &= 16777215;
                    this.field1950 |= (var12 & 255) << 24;
                }
            }
            if (var8.field2106 != -1 && this.field1954 - this.field1949 <= var8.field2095) {
                this.field1955 += var8.field2104 * arg1;
            }
            if (var8.field2162 != -1 && this.field1954 - this.field1949 <= var8.field2117) {
                super.field7447 += var8.field2158 * arg1;
            }
            double var13 = (double) this.field1952;
            double var15 = (double) this.field1948;
            double var17 = (double) this.field1956;
            boolean var19 = false;
            if (var8.field2099 == 1) {
                int var20 = var4 - this.field1953.field8579.field8822;
                int var21 = var5 - this.field1953.field8579.field8829;
                int var22 = var6 - this.field1953.field8579.field8825;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field2112 * var23 * arg1);
                this.field1955 = (int) ((long) this.field1955 - ((long) this.field1955 * var24 >> 18));
            } else if (var8.field2099 == 2) {
                int var26 = var4 - this.field1953.field8579.field8822;
                int var27 = var5 - this.field1953.field8579.field8829;
                int var28 = var6 - this.field1953.field8579.field8825;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field2112 * var29 * arg1);
                this.field1955 = (int) ((long) this.field1955 - ((long) this.field1955 * var30 >> 28));
            }
            if (var8.field2144 != null) {
                class45 var32 = var7.field7155.field5887;
                for (class45 var33 = var32.field548; var32 != var33; var33 = var33.field548) {
                    class588 var34 = (class588) var33;
                    class632 var35 = var34.field8117;
                    if (var35.field8740 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field2144.length; ++var37) {
                            if (var8.field2144[var37] == var35.field8758) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field8119);
                            double var40 = (double) (var5 - var34.field8112);
                            double var42 = (double) (var6 - var34.field8108);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field8741)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field8113 * var42 + (double) var34.field8114 * var38 + (double) var35.field8739 * var40) * 65535.0D / ((double) var35.field8750 * var46);
                                if (!(var48 < (double) var35.field8752)) {
                                    double var50 = 0.0D;
                                    if (var35.field8757 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field8751;
                                    } else if (var35.field8757 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field8751;
                                    }
                                    if (var35.field8747 == 0) {
                                        if (var35.field8753 == 0) {
                                            var13 += ((double) var34.field8114 - var50) * (double) arg1;
                                            var15 += ((double) var35.field8739 - var50) * (double) arg1;
                                            var17 += ((double) var34.field8113 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field7451 = (int) ((double) super.field7451 + ((double) var34.field8114 - var50) * (double) arg1);
                                            super.field7448 = (int) ((double) super.field7448 + ((double) var35.field8739 - var50) * (double) arg1);
                                            super.field7456 = (int) ((double) super.field7456 + ((double) var34.field8113 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field8750;
                                        double var54 = var40 / var46 * (double) var35.field8750;
                                        double var56 = var42 / var46 * (double) var35.field8750;
                                        if (var35.field8753 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field7451 = (int) ((double) super.field7451 + (double) arg1 * var52);
                                            super.field7448 = (int) ((double) super.field7448 + (double) arg1 * var54);
                                            super.field7456 = (int) ((double) super.field7456 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field2105 != null) {
                for (int var58 = 0; var58 < var8.field2105.length; ++var58) {
                    class588 var59 = (class588) class380.field5023.method720(-4412, (long) var8.field2105[var58]);
                    while (var59 != null) {
                        class632 var60 = var59.field8117;
                        double var61 = (double) (var4 - var59.field8119);
                        double var63 = (double) (var5 - var59.field8112);
                        double var65 = (double) (var6 - var59.field8108);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field8741) {
                            var59 = (class588) class380.field5023.method722(57);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field8113 * var65 + (double) var59.field8114 * var61 + (double) var60.field8739 * var63) * 65535.0D / ((double) var60.field8750 * var69);
                            if (var71 < (double) var60.field8752) {
                                var59 = (class588) class380.field5023.method722(119);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field8757 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field8751;
                                } else if (var60.field8757 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field8751;
                                }
                                if (var60.field8747 == 0) {
                                    if (var60.field8753 == 0) {
                                        var13 += ((double) var59.field8114 - var73) * (double) arg1;
                                        var15 += ((double) var60.field8739 - var73) * (double) arg1;
                                        var17 += ((double) var59.field8113 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field7451 = (int) ((double) super.field7451 + ((double) var59.field8114 - var73) * (double) arg1);
                                        super.field7448 = (int) ((double) super.field7448 + ((double) var60.field8739 - var73) * (double) arg1);
                                        super.field7456 = (int) ((double) super.field7456 + ((double) var59.field8113 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field8750;
                                    double var77 = var63 / var69 * (double) var60.field8750;
                                    double var79 = var65 / var69 * (double) var60.field8750;
                                    if (var60.field8753 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field7451 = (int) ((double) super.field7451 + (double) arg1 * var75);
                                        super.field7448 = (int) ((double) super.field7448 + (double) arg1 * var77);
                                        super.field7456 = (int) ((double) super.field7456 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class588) class380.field5023.method722(70);
                            }
                        }
                    }
                }
            }
            if (var8.field2139 != null) {
                if (var8.field2128 == null) {
                    var8.field2128 = new int[var8.field2139.length];
                    for (int var81 = 0; var81 < var8.field2139.length; ++var81) {
                        class627.method3477(var8.field2139[var81], 0);
                        var8.field2128[var81] = ((class37) class207.field2761.method3057(1, (long) var8.field2139[var81])).field505;
                    }
                }
                for (int var82 = 0; var82 < var8.field2128.length; ++var82) {
                    class632 var83 = class407.field5359[var8.field2128[var82]];
                    if (var83.field8753 == 0) {
                        var13 += (double) (var83.field8756 * arg1);
                        var15 += (double) (var83.field8739 * arg1);
                        var17 += (double) (var83.field8748 * arg1);
                        var19 = true;
                    } else {
                        super.field7451 += var83.field8756 * arg1;
                        super.field7448 += var83.field8739 * arg1;
                        super.field7456 += var83.field8748 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field1952 = (short) ((int) var13);
                        this.field1948 = (short) ((int) var15);
                        this.field1956 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field1955 <<= 1;
                }
            }
            super.field7451 = (int) ((long) super.field7451 + ((long) (this.field1955 << 2) * (long) this.field1952 >> 23) * (long) arg1);
            super.field7448 = (int) ((long) super.field7448 + ((long) (this.field1955 << 2) * (long) this.field1948 >> 23) * (long) arg1);
            super.field7456 = (int) ((long) super.field7456 + ((long) (this.field1955 << 2) * (long) this.field1956 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lod;IIIIIIIIIIIZZ)V")
    public final void method831(class618 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field1953 = arg0;
        super.field7451 = arg1 << 12;
        super.field7448 = arg2 << 12;
        super.field7456 = arg3 << 12;
        super.field7454 = arg9;
        this.field1954 = this.field1949 = (short) arg8;
        super.field7447 = arg10;
        super.field7444 = arg11;
        super.field7445 = arg13;
        this.field1952 = (short) arg4;
        this.field1948 = (short) arg5;
        this.field1956 = (short) arg6;
        this.field1955 = arg7;
        super.field7446 = this.field1953.field8574.field1899;
        this.method827();
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lod;IIIIIIIIIIIZZ)V")
    public class145(class618 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field1953 = arg0;
        super.field7451 = arg1 << 12;
        super.field7448 = arg2 << 12;
        super.field7456 = arg3 << 12;
        super.field7454 = arg9;
        this.field1954 = this.field1949 = (short) arg8;
        super.field7447 = arg10;
        super.field7444 = arg11;
        super.field7445 = arg13;
        this.field1952 = (short) arg4;
        this.field1948 = (short) arg5;
        this.field1956 = (short) arg6;
        this.field1955 = arg7;
        super.field7446 = this.field1953.field8574.field1899;
        this.method827();
    }
}
