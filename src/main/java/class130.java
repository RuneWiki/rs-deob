import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class130 extends class302 {

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "Z")
    public boolean field2079 = true;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
    private int field2083 = 0;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "Z")
    public boolean field2097 = false;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "Lga;")
    public class181 field2096;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "Lk;")
    public class192 field2091;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "Lla;")
    public class102 field2067;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "J")
    private long field2068;

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "Lfi;")
    public class118 field2099;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "B")
    public static byte field2071 = 0;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    private int field2069;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    private int field2070;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    private int field2073;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
    public int field2074;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
    private int field2075;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    public int field2076;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
    private int field2077;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
    private int field2078;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
    private int field2080;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    private int field2082;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    private int field2084;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
    public int field2085;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    public int field2086;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
    private int field2087;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    private int field2088;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
    private int field2089;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
    private int field2092;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    private int field2093;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "I")
    private int field2095;

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "I")
    private int field2098;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Lgi;")
    public static class164 field2072;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method883(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class271.field4367++;
        class292.field4791 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class300.field4917; var12 < class284.field4608; var12++) {
            class116[][] var38 = class307.field4991[var12];
            for (int var39 = class21.field395; var39 < class310.field5017; var39++) {
                for (int var40 = class154.field2460; var40 < class49.field719; var40++) {
                    class116 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class306.field4970[var39 + class210.field3346 - class270.field4351][var40 + class210.field3346 - class72.field1157] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field1786 = true;
                            var41.field1767 = true;
                            if (var41.field1787 > 0) {
                                var41.field1789 = true;
                            } else {
                                var41.field1789 = false;
                            }
                            class292.field4791++;
                        } else {
                            var41.field1786 = false;
                            var41.field1767 = false;
                            var41.field1788 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field1775 != null) {
                                    class138 var42 = var41.field1775;
                                    var42.field2226.method102(0, var12, var42.field2229, var42.field2225, var42.field2228);
                                    if (var42.field2227 != null) {
                                        var42.field2227.method102(0, var12, var42.field2229, var42.field2225, var42.field2228);
                                    }
                                }
                                if (var41.field1780 != null) {
                                    class219 var43 = var41.field1780;
                                    var43.field3444.method102(var43.field3447, var12, var43.field3448, var43.field3449, var43.field3445);
                                    if (var43.field3437 != null) {
                                        var43.field3437.method102(var43.field3447, var12, var43.field3448, var43.field3449, var43.field3445);
                                    }
                                }
                                if (var41.field1765 != null) {
                                    class122 var44 = var41.field1765;
                                    var44.field1930.method102(0, var12, var44.field1941, var44.field1923, var44.field1935);
                                }
                                if (var41.field1782 != null) {
                                    for (int var45 = 0; var45 < var41.field1787; var45++) {
                                        class90 var46 = var41.field1782[var45];
                                        var46.field1416.method102(var46.field1403, var12, var46.field1406, var46.field1411, var46.field1412);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class199.field3192 == class166.field2746;
        for (int var14 = class300.field4917; var14 < class284.field4608; var14++) {
            class116[][] var27 = class307.field4991[var14];
            for (int var28 = -class210.field3346; var28 <= 0; var28++) {
                int var29 = class270.field4351 + var28;
                int var30 = class270.field4351 - var28;
                if (var29 >= class21.field395 || var30 < class310.field5017) {
                    for (int var31 = -class210.field3346; var31 <= 0; var31++) {
                        int var32 = class72.field1157 + var31;
                        int var33 = class72.field1157 - var31;
                        if (var29 >= class21.field395) {
                            if (var32 >= class154.field2460) {
                                class116 var34 = var27[var29][var32];
                                if (var34 != null && var34.field1786) {
                                    class84.method601(var34, true);
                                }
                            }
                            if (var33 < class49.field719) {
                                class116 var35 = var27[var29][var33];
                                if (var35 != null && var35.field1786) {
                                    class84.method601(var35, true);
                                }
                            }
                        }
                        if (var30 < class310.field5017) {
                            if (var32 >= class154.field2460) {
                                class116 var36 = var27[var30][var32];
                                if (var36 != null && var36.field1786) {
                                    class84.method601(var36, true);
                                }
                            }
                            if (var33 < class49.field719) {
                                class116 var37 = var27[var30][var33];
                                if (var37 != null && var37.field1786) {
                                    class84.method601(var37, true);
                                }
                            }
                        }
                        if (class292.field4791 == 0) {
                            if (!var13) {
                                class24.field449 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class300.field4917; var15 < class284.field4608; var15++) {
            class116[][] var16 = class307.field4991[var15];
            for (int var17 = -class210.field3346; var17 <= 0; var17++) {
                int var18 = class270.field4351 + var17;
                int var19 = class270.field4351 - var17;
                if (var18 >= class21.field395 || var19 < class310.field5017) {
                    for (int var20 = -class210.field3346; var20 <= 0; var20++) {
                        int var21 = class72.field1157 + var20;
                        int var22 = class72.field1157 - var20;
                        if (var18 >= class21.field395) {
                            if (var21 >= class154.field2460) {
                                class116 var23 = var16[var18][var21];
                                if (var23 != null && var23.field1786) {
                                    class84.method601(var23, false);
                                }
                            }
                            if (var22 < class49.field719) {
                                class116 var24 = var16[var18][var22];
                                if (var24 != null && var24.field1786) {
                                    class84.method601(var24, false);
                                }
                            }
                        }
                        if (var19 < class310.field5017) {
                            if (var21 >= class154.field2460) {
                                class116 var25 = var16[var19][var21];
                                if (var25 != null && var25.field1786) {
                                    class84.method601(var25, false);
                                }
                            }
                            if (var22 < class49.field719) {
                                class116 var26 = var16[var19][var22];
                                if (var26 != null && var26.field1786) {
                                    class84.method601(var26, false);
                                }
                            }
                        }
                        if (class292.field4791 == 0) {
                            if (!var13) {
                                class24.field449 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class24.field449 = false;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method884(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2098 = arg3;
        this.field2078 = arg9;
        this.field2087 = arg0;
        this.field2095 = arg1;
        this.field2073 = arg7;
        this.field2088 = arg2;
        this.field2069 = arg5;
        field2094++;
        this.field2080 = arg8;
        this.field2089 = arg4;
        int var11 = (this.field2088 + this.field2087 + this.field2089) / 3 + this.field2096.field3016;
        int var12 = (this.field2078 + this.field2073 + this.field2069) / 3 + this.field2096.field3004;
        int var13 = (this.field2098 + this.field2080 + this.field2095) / 3 + this.field2096.field3005;
        if (this.field2074 != var13 || this.field2086 != var12 || this.field2085 != var11) {
            this.field2079 = true;
            this.field2085 = var11;
            this.field2074 = var13;
            this.field2086 = var12;
        }
        if (arg6 != 31779) {
            field2071 = -87;
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
    public static void method885(int arg0) {
        if (arg0 == 1023) {
            field2072 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BIIJZI)V")
    public final void method886(byte arg0, int arg1, int arg2, long arg3, boolean arg4, int arg5) {
        field2081++;
        if (this.field2097) {
            arg4 = false;
        } else if (class181.field2996 < this.field2099.field1868) {
            arg4 = false;
        } else if (class263.field4306[class181.field2996] < class181.field2989) {
            arg4 = false;
        } else if (this.field2095 == this.field2080 && this.field2098 == this.field2095 && this.field2073 == this.field2069 && this.field2078 == this.field2069 && this.field2089 == this.field2088 && this.field2089 == this.field2087) {
            arg4 = false;
        } else if (this.field2099.field1858 != -1) {
            int var8 = (int) (arg3 - this.field2068);
            if (this.field2099.field1819 || this.field2099.field1858 >= var8) {
                var8 %= this.field2099.field1858;
            } else {
                arg4 = false;
            }
            if (!this.field2099.field1863 && this.field2099.field1854 > var8) {
                arg4 = false;
            }
            if (this.field2099.field1863 && var8 >= this.field2099.field1854) {
                arg4 = false;
            }
        }
        if (arg4) {
            this.field2083 += (int) ((double) arg5 * ((double) this.field2099.field1833 + Math.random() * (double) (this.field2099.field1820 - this.field2099.field1833)));
            if (this.field2083 > 63) {
                int var9 = this.field2083 >> 6;
                this.field2083 &= 0x3F;
                if (this.field2079) {
                    int var10 = this.field2095 - this.field2080;
                    int var11 = this.field2069 - this.field2073;
                    int var12 = this.field2089 - this.field2088;
                    int var13 = this.field2078 - this.field2073;
                    int var14 = this.field2098 - this.field2080;
                    this.field2070 = var10 * var13 - (var11 * var14);
                    int var15 = this.field2087 - this.field2088;
                    this.field2077 = var11 * var15 - (var12 * var13);
                    this.field2093 = var12 * var14 - (var10 * var15);
                    while (true) {
                        if (this.field2077 <= 32767 && this.field2093 <= 32767 && this.field2070 <= 32767 && this.field2077 >= -32767 && this.field2093 >= -32767 && this.field2070 >= -32767) {
                            int var16 = (int) Math.sqrt((double) (this.field2077 * this.field2077 + this.field2070 * this.field2070 + (this.field2093 * this.field2093)));
                            if (var16 <= 0) {
                                var16 = 1;
                            }
                            this.field2093 = this.field2093 * 32767 / var16;
                            this.field2070 = this.field2070 * 32767 / var16;
                            this.field2077 = this.field2077 * 32767 / var16;
                            if (this.field2099.field1813 > 0 || this.field2099.field1857 > 0) {
                                int var18 = (int) (Math.atan2((double) this.field2070, (double) this.field2077) * 2047.0D / 6.283185307179586D);
                                int var19 = (int) (Math.atan2((double) this.field2093, Math.sqrt((double) (this.field2077 * this.field2077 + (this.field2070 * this.field2070)))) * 2047.0D / 6.283185307179586D);
                                this.field2092 = this.field2099.field1813 - this.field2099.field1821;
                                this.field2084 = this.field2099.field1857 - this.field2099.field1823;
                                int var20 = var18 - this.field2096.field3009;
                                this.field2075 = this.field2099.field1821 + var20 - (this.field2092 / 2);
                                this.field2082 = var19 + this.field2099.field1823 - (this.field2084 / 2);
                            } else if (this.field2096.field3009 != 0) {
                                int var17 = this.field2077 * arg1 + this.field2070 * arg2 >> 16;
                                this.field2070 = this.field2070 * arg1 - (this.field2077 * arg2) >> 16;
                                this.field2077 = var17;
                            }
                            this.field2079 = false;
                            break;
                        }
                        this.field2070 >>= 0x1;
                        this.field2077 >>= 0x1;
                        this.field2093 >>= 0x1;
                    }
                }
                for (int var21 = 0; var21 < var9; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field2099.field1813 <= 0 && this.field2099.field1857 <= 0) {
                        var22 = this.field2077;
                        var23 = this.field2093;
                        var24 = this.field2070;
                    } else {
                        int var25 = this.field2075 + (int) (Math.random() * (double) this.field2092);
                        int var26 = var25 & 0x7FF;
                        int var27 = class136.field2191[var26] >> 1;
                        int var28 = class136.field2193[var26] >> 1;
                        int var29 = this.field2082 + (int) ((double) this.field2084 * Math.random());
                        int var30 = var29 & 0x3FF;
                        int var31 = class136.field2193[var30] >> 1;
                        int var32 = class136.field2191[var30] >> 1;
                        var22 = var28 * var32 >> 15;
                        var23 = var31 * -1;
                        var24 = var27 * var32 >> 15;
                    }
                    int var33 = (int) (Math.random() * 255.0D);
                    int var34 = (int) (Math.random() * 255.0D);
                    int var35 = (255 - var34) * var33 >> 8;
                    int var36 = 255 - var34 - var35;
                    int var37 = this.field2095 * var35 + (this.field2080 * var34 + (this.field2098 * var36)) >> 8;
                    int var38 = this.field2087 * var36 + (this.field2088 * var34 + (this.field2089 * var35)) >> 8;
                    int var39 = this.field2073 * var34 + this.field2078 * var36 + this.field2069 * var35 >> 8;
                    if (this.field2096.field3009 != 0) {
                        int var40 = arg1 * var37 + arg2 * var38 >> 16;
                        var38 = arg1 * var38 - (arg2 * var37) >> 16;
                        var37 = var40;
                    }
                    int var41 = this.field2099.field1865 + (int) ((double) (this.field2099.field1810 - this.field2099.field1865) * Math.random());
                    int var42;
                    if (this.field2099.field1838) {
                        double var43 = Math.random();
                        var42 = (int) ((double) this.field2099.field1822 * var43 + (double) this.field2099.field1808) << 24 | (int) ((double) this.field2099.field1851 * var43 + (double) this.field2099.field1856) | (int) ((double) this.field2099.field1814 * var43 + (double) this.field2099.field1839) << 16 | (int) ((double) this.field2099.field1816 * var43 + (double) this.field2099.field1848) << 8;
                    } else {
                        var42 = (int) (Math.random() * (double) this.field2099.field1851 + (double) this.field2099.field1856) | (int) (Math.random() * (double) this.field2099.field1814 + (double) this.field2099.field1839) << 16 | (int) ((double) this.field2099.field1816 * Math.random() + (double) this.field2099.field1848) << 8 | (int) (Math.random() * (double) this.field2099.field1822 + (double) this.field2099.field1808) << 24;
                    }
                    int var45 = (int) (Math.random() * (double) (this.field2099.field1832 - this.field2099.field1862)) + this.field2099.field1862;
                    if (class181.field2994 == class181.field2991) {
                        new class176(this, this.field2096.field3005 + var37, this.field2096.field3004 - -var39, this.field2096.field3016 + var38, var22, var23, var24, var45, var41, var42);
                    } else {
                        class176 var47 = class181.field2985[class181.field2991];
                        class181.field2991 = class181.field2991 + 1 & 0x3FF;
                        var47.method1244(this, this.field2096.field3005 + var37, this.field2096.field3004 + var39, this.field2096.field3016 + var38, var22, var23, var24, var45, var41, var42);
                    }
                }
            }
        }
        this.field2076 = 0;
        if (arg0 != -57) {
            this.field2075 = -51;
        }
        for (class176 var48 = (class176) this.field2067.method730((byte) -44); var48 != null; var48 = (class176) this.field2067.method729((byte) -128)) {
            var48.method1246(arg3, arg5);
            this.field2076++;
        }
        class181.field2995 += this.field2076;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)V")
    public static final void method887(byte arg0, int arg1) {
        field2090++;
        class74 var2 = (class74) class57.field829.method371(-104, (long) arg1);
        if (var2 != null && arg0 <= -85) {
            for (int var3 = 0; var3 < var2.field1187.length; var3++) {
                var2.field1187[var3] = -1;
                var2.field1188[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lk;Lga;J)V")
    public class130(class192 arg0, class181 arg1, long arg2) {
        this.field2096 = arg1;
        this.field2091 = arg0;
        this.field2067 = new class102();
        this.field2083 = (int) ((double) this.field2083 + Math.random() * 64.0D);
        this.field2068 = arg2;
        this.field2099 = this.field2091.field3133;
    }
}
