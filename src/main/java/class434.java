import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class434 extends class480 {

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "Lab;")
    private class576 field5810;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "S")
    private short field5813;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "S")
    private short field5814;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "S")
    private short field5815;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "S")
    private short field5807;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "S")
    private short field5808;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "I")
    private int field5809;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    private int field5811;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "S")
    private short field5812;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "()V")
    public final void method2531() {
        this.field5810.field8480.field3056[this.field5812] = null;
        class636.field9306[class19.field189] = this;
        class19.field189 = class19.field189 + 1 & 1023;
        this.method1783((byte) -127);
        this.method3591((byte) 81);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lab;IIIIIIIIIIIZZ)V")
    public final void method2532(class576 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field5810 = arg0;
        super.field6826 = arg1 << 12;
        super.field6824 = arg2 << 12;
        super.field6815 = arg3 << 12;
        super.field6825 = arg9;
        this.field5814 = this.field5813 = (short) arg8;
        super.field6829 = arg10;
        super.field6828 = arg11;
        super.field6827 = arg13;
        this.field5815 = (short) arg4;
        this.field5807 = (short) arg5;
        this.field5808 = (short) arg6;
        this.field5809 = arg7;
        super.field6817 = this.field5810.field8474.field6309;
        this.method2535();
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(JI)V")
    public final void method2533(long arg0, int arg1) {
        this.field5813 = (short) (this.field5813 - arg1);
        if (this.field5813 <= 0) {
            this.method2531();
        } else {
            int var4 = super.field6826 >> 12;
            int var5 = super.field6824 >> 12;
            int var6 = super.field6815 >> 12;
            class206 var7 = this.field5810.field8480;
            class601 var8 = this.field5810.field8489;
            if (var8.field8947 != 0) {
                if (this.field5814 - this.field5813 <= var8.field8964) {
                    int var9 = var8.field8940 * arg1 + (super.field6825 >> 8 & 65280) + (this.field5811 >> 16 & 255);
                    int var10 = var8.field8904 * arg1 + (this.field5811 >> 8 & 255) + (super.field6825 & 65280);
                    int var11 = var8.field8941 * arg1 + (super.field6825 << 8 & 65280) + (this.field5811 & 255);
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
                    super.field6825 &= -16777216;
                    super.field6825 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field5811 &= -16777216;
                    this.field5811 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field5814 - this.field5813 <= var8.field8897) {
                    int var12 = var8.field8953 * arg1 + (super.field6825 >> 16 & 65280) + (this.field5811 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field6825 &= 16777215;
                    super.field6825 |= (var12 & 65280) << 16;
                    this.field5811 &= 16777215;
                    this.field5811 |= (var12 & 255) << 24;
                }
            }
            if (var8.field8913 != -1 && this.field5814 - this.field5813 <= var8.field8916) {
                this.field5809 += var8.field8918 * arg1;
            }
            if (var8.field8912 != -1 && this.field5814 - this.field5813 <= var8.field8926) {
                super.field6829 += var8.field8954 * arg1;
            }
            int var13 = this.field5815;
            int var14 = this.field5807;
            int var15 = this.field5808;
            boolean var16 = false;
            if (var8.field8915 == 1) {
                int var17 = var4 - this.field5810.field8458;
                int var18 = var5 - this.field5810.field8486;
                int var19 = var6 - this.field5810.field8481;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field8946 * var20 * arg1);
                this.field5809 = (int) ((long) this.field5809 - ((long) this.field5809 * var21 >> 18));
            } else if (var8.field8915 == 2) {
                int var23 = var4 - this.field5810.field8458;
                int var24 = var5 - this.field5810.field8486;
                int var25 = var6 - this.field5810.field8481;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field8946 * var26 * arg1);
                this.field5809 = (int) ((long) this.field5809 - ((long) this.field5809 * var27 >> 28));
            }
            if (var8.field8960 != null) {
                class417 var29 = var7.field3065.field179;
                for (class417 var30 = var29.field5645; var29 != var30; var30 = var30.field5645) {
                    class139 var31 = (class139) var30;
                    class158 var32 = var31.field1975;
                    if (var32.field2342 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field8960.length; ++var34) {
                            if (var8.field8960[var34] == var32.field2338) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field1972;
                            int var36 = var5 - var31.field1976;
                            int var37 = var6 - var31.field1981;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field2345) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field1973 * var37 + var31.field1977 * var35 + var32.field2348 * var36) * 65535L / (long) (var32.field2351 * var40);
                                if (var41 >= (long) var32.field2353) {
                                    int var43 = 0;
                                    if (var32.field2356 == 1) {
                                        var43 = (var40 >> 4) * var32.field2346;
                                    } else if (var32.field2356 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field2346;
                                    }
                                    if (var32.field2343 == 0) {
                                        if (var32.field2350 == 0) {
                                            var13 += (var31.field1977 - var43) * arg1;
                                            var14 += (var32.field2348 - var43) * arg1;
                                            var15 += (var31.field1973 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field6826 += (var31.field1977 - var43) * arg1;
                                            super.field6824 += (var32.field2348 - var43) * arg1;
                                            super.field6815 += (var31.field1973 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field2351;
                                        int var45 = (var36 << 15) / var40 * var32.field2351;
                                        int var46 = (var37 << 15) / var40 * var32.field2351;
                                        if (var32.field2350 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field6826 += arg1 * var44 >> 15;
                                            super.field6824 += arg1 * var45 >> 15;
                                            super.field6815 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field8932 != null) {
                for (int var47 = 0; var47 < var8.field8932.length; ++var47) {
                    class139 var48 = (class139) class20.field197.method1443(false, (long) var8.field8932[var47]);
                    while (var48 != null) {
                        class158 var49 = var48.field1975;
                        int var50 = var4 - var48.field1972;
                        int var51 = var5 - var48.field1976;
                        int var52 = var6 - var48.field1981;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field2345) {
                            var48 = (class139) class20.field197.method1446(101);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field1973 * var52 + var48.field1977 * var50 + var49.field2348 * var51) * 65535L / (long) (var49.field2351 * var55);
                            if (var56 < (long) var49.field2353) {
                                var48 = (class139) class20.field197.method1446(55);
                            } else {
                                int var58 = 0;
                                if (var49.field2356 == 1) {
                                    var58 = (var55 >> 4) * var49.field2346;
                                } else if (var49.field2356 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field2346;
                                }
                                if (var49.field2343 == 0) {
                                    if (var49.field2350 == 0) {
                                        var13 += (var48.field1977 - var58) * arg1;
                                        var14 += (var49.field2348 - var58) * arg1;
                                        var15 += (var48.field1973 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field6826 += (var48.field1977 - var58) * arg1;
                                        super.field6824 += (var49.field2348 - var58) * arg1;
                                        super.field6815 += (var48.field1973 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field2351;
                                    int var60 = (var51 << 15) / var55 * var49.field2351;
                                    int var61 = (var52 << 15) / var55 * var49.field2351;
                                    if (var49.field2350 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field6826 += arg1 * var59 >> 15;
                                        super.field6824 += arg1 * var60 >> 15;
                                        super.field6815 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class139) class20.field197.method1446(61);
                            }
                        }
                    }
                }
            }
            if (var8.field8931 != null) {
                if (var8.field8930 == null) {
                    var8.field8930 = new int[var8.field8931.length];
                    for (int var62 = 0; var62 < var8.field8931.length; ++var62) {
                        class286.method1778(var8.field8931[var62], (byte) -111);
                        var8.field8930[var62] = ((class556) class336.field4651.method2799((long) var8.field8931[var62], true)).field8278;
                    }
                }
                for (int var63 = 0; var63 < var8.field8930.length; ++var63) {
                    class158 var64 = class219.field3192[var8.field8930[var63]];
                    if (var64.field2350 == 0) {
                        var13 += var64.field2344 * arg1;
                        var14 += var64.field2348 * arg1;
                        var15 += var64.field2341 * arg1;
                        var16 = true;
                    } else {
                        super.field6826 += var64.field2344 * arg1;
                        super.field6824 += var64.field2348 * arg1;
                        super.field6815 += var64.field2341 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field5815 = (short) var13;
                        this.field5807 = (short) var14;
                        this.field5808 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field5809 <<= 1;
                }
            }
            super.field6826 = (int) ((long) super.field6826 + ((long) this.field5815 * (long) this.field5809 >> 23) * (long) arg1);
            super.field6824 = (int) ((long) super.field6824 + ((long) this.field5807 * (long) this.field5809 >> 23) * (long) arg1);
            super.field6815 = (int) ((long) super.field6815 + ((long) this.field5808 * (long) this.field5809 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lqa;J)V")
    public final void method2534(class208 arg0, long arg1) {
        int var4 = super.field6826 >> class115.field1626 + 12;
        int var5 = super.field6815 >> class115.field1626 + 12;
        int var6 = super.field6824 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class145.field2083 && var5 >= 0 && var5 < class384.field5282) {
            class206 var7 = this.field5810.field8480;
            class601 var8 = this.field5810.field8489;
            class176[] var9 = class165.field2609;
            int var10 = var7.field3074;
            class205 var11 = class420.field5697[var7.field3074][var4][var5];
            if (var11 != null) {
                var10 = var11.field3036;
            }
            int var12 = var9[var10].method1239(var4, var5);
            int var13;
            if (var10 < class348.field4772 - 1) {
                var13 = var9[var10 + 1].method1239(var4, var5);
            } else {
                var13 = var12 - (8 << class115.field1626);
            }
            if (var8.field8907) {
                if (var8.field8937 == -1 && var6 > var12) {
                    this.method2531();
                    return;
                }
                if (var8.field8937 >= 0 && var6 > var9[var8.field8937].method1239(var4, var5)) {
                    this.method2531();
                    return;
                }
                if (var8.field8905 == -1 && var6 < var13) {
                    this.method2531();
                    return;
                }
                if (var8.field8905 >= 0 && var6 < var9[var8.field8905 + 1].method1239(var4, var5)) {
                    this.method2531();
                    return;
                }
            }
            if (var4 >= var7.field3073 && var4 <= var7.field3068 && var5 >= var7.field3071 && var5 <= var7.field3069 && var6 <= var12 && var6 >= var13) {
                var7.field3067.field3959.method1249(this, -4);
            } else {
                int var14;
                for (var14 = class348.field4772 - 1; var14 > 0 && var6 > var9[var14].method1239(var4, var5); --var14) {
                }
                if (var14 == 0 && var6 > var9[0].method1239(var4, var5)) {
                    this.method2531();
                } else if (class348.field4772 - 1 == var14 && var9[var14].method1239(var4, var5) - var6 > 8 << class115.field1626) {
                    this.method2531();
                } else {
                    class205 var15 = class420.field5697[var14][var4][var5];
                    if (var15 == null) {
                        if (var14 == 0 || class420.field5697[0][var4][var5] == null) {
                            var15 = class420.field5697[0][var4][var5] = new class205(0, var4, var5);
                        }
                        boolean var16 = class420.field5697[0][var4][var5].field3025 != null;
                        if (var14 == 3 && var16) {
                            this.method2531();
                            return;
                        }
                        for (int var17 = 1; var17 <= var14; ++var17) {
                            if (class420.field5697[var17][var4][var5] == null) {
                                var15 = class420.field5697[var17][var4][var5] = new class205(var17, var4, var5);
                                if (var16) {
                                    ++var15.field3036;
                                }
                            }
                        }
                    }
                    if (var8.field8909) {
                        int var18 = super.field6826 >> 12;
                        int var19 = super.field6815 >> 12;
                        if (var15.field3047 != null) {
                            class558 var20 = var15.field3047.method189(arg0, 31733);
                            if (var20 != null && var20.method3362(var18, var19, var6, -20444)) {
                                this.method2531();
                                return;
                            }
                        }
                        if (var15.field3037 != null) {
                            class558 var21 = var15.field3037.method189(arg0, 31733);
                            if (var21 != null && var21.method3362(var18, var19, var6, -20444)) {
                                this.method2531();
                                return;
                            }
                        }
                        if (var15.field3045 != null) {
                            class558 var22 = var15.field3045.method189(arg0, 31733);
                            if (var22 != null && var22.method3362(var18, var19, var6, -20444)) {
                                this.method2531();
                                return;
                            }
                        }
                        for (class636 var23 = var15.field3029; var23 != null; var23 = var23.field9302) {
                            class558 var24 = var23.field9299.method189(arg0, 31733);
                            if (var24 != null && var24.method3362(var18, var19, var6, -20444)) {
                                this.method2531();
                                return;
                            }
                        }
                    }
                    if (var15.field3030 == null) {
                        var15.field3030 = new class283();
                        var15.field3053 = (byte) ((int) (arg1 & 255L));
                    } else if ((byte) ((int) (arg1 & 255L)) != var15.field3053) {
                        var15.field3030.field3959.method1245(75);
                        var15.field3030.field3962 = false;
                        var15.field3053 = (byte) ((int) (arg1 & 255L));
                    }
                    var15.field3030.field3959.method1249(this, -4);
                }
            }
        } else {
            this.method2531();
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "()V")
    private final void method2535() {
        int var1 = this.field5810.field8480.field3064;
        if (this.field5810.field8480.field3056[var1] != null) {
            this.field5810.field8480.field3056[var1].method2531();
        }
        this.field5810.field8480.field3056[var1] = this;
        this.field5812 = (short) this.field5810.field8480.field3064;
        this.field5810.field8480.field3064 = var1 + 1 & 8191;
        this.field5810.field8463.method2241((byte) 66, this);
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lab;IIIIIIIIIIIZZ)V")
    public class434(class576 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field5810 = arg0;
        super.field6826 = arg1 << 12;
        super.field6824 = arg2 << 12;
        super.field6815 = arg3 << 12;
        super.field6825 = arg9;
        this.field5814 = this.field5813 = (short) arg8;
        super.field6829 = arg10;
        super.field6828 = arg11;
        super.field6827 = arg13;
        this.field5815 = (short) arg4;
        this.field5807 = (short) arg5;
        this.field5808 = (short) arg6;
        this.field5809 = arg7;
        super.field6817 = this.field5810.field8474.field6309;
        this.method2535();
    }
}
