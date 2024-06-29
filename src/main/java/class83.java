import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class83 extends class41 {

    @OriginalMember(owner = "client!v", name = "J", descriptor = "Z")
    public boolean field1089 = false;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "Lva;")
    public class165 field1086;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public int field1087;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "S")
    private short field1076;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "S")
    private short field1088;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "S")
    private short field1084;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "S")
    private short field1085;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "S")
    private short field1082;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    private int field1077;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    private static int field1081 = 12;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    private int field1080;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "S")
    public short field1075;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V", line = 5)
    private final void method533() {
        this.field1086.field2532.field2179[this.field1075] = null;
        class141.field2178[class141.field2166] = this;
        class141.field2166 = class141.field2166 + 1 & 0x3FF;
        this.field1086 = null;
        this.method222((byte) -84);
        this.method253(2);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lva;IIIIIIIII)V", line = 18)
    public final void method534(class165 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1086 = arg0;
        this.field1079 = arg1 << field1081;
        this.field1078 = arg2 << field1081;
        this.field1083 = arg3 << field1081;
        this.field1087 = arg9;
        this.field1088 = this.field1076 = (short) arg8;
        this.field1084 = (short) arg4;
        this.field1085 = (short) arg5;
        this.field1082 = (short) arg6;
        this.field1077 = arg7;
        this.method536();
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(JI)V", line = 31)
    public final void method535(long arg0, int arg1) {
        if (this.field1086 == null) {
            return;
        }
        this.field1076 = (short) (this.field1076 - arg1);
        if (this.field1076 <= 0) {
            this.method533();
            return;
        }
        int var4 = this.field1079 >> field1081;
        int var5 = this.field1078 >> field1081;
        int var6 = this.field1083 >> field1081;
        class141 var7 = this.field1086.field2532;
        class127 var8 = this.field1086.field2557;
        if (var8.field1812 != 0) {
            if (this.field1088 - this.field1076 <= var8.field1842) {
                int var9 = var8.field1816 * arg1 + (this.field1087 >> 8 & 0xFF00) + (this.field1080 >> 16 & 0xFF);
                int var10 = var8.field1792 * arg1 + (this.field1080 >> 8 & 0xFF) + (this.field1087 & 0xFF00);
                int var11 = var8.field1832 * arg1 + (this.field1087 & 0xFF << 8) + (this.field1080 & 0xFF);
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
                this.field1087 &= 0xFF000000;
                this.field1087 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field1080 &= 0xFF000000;
                this.field1080 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field1088 - this.field1076 <= var8.field1821) {
                int var12 = var8.field1852 * arg1 + (this.field1087 >> 16 & 0xFF00) + (this.field1080 >> 24 & 0xFF);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field1087 &= 0xFFFFFF;
                this.field1087 |= (var12 & 0xFF00) << 16;
                this.field1080 &= 0xFFFFFF;
                this.field1080 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field1817 != -1 && this.field1088 - this.field1076 <= var8.field1828) {
            this.field1077 += var8.field1854 * arg1;
        }
        int var13 = this.field1084;
        int var14 = this.field1085;
        int var15 = this.field1082;
        boolean var16 = false;
        if (var8.field1833 == 1) {
            int var17 = var4 - this.field1086.field2547;
            int var18 = var5 - this.field1086.field2543;
            int var19 = var6 - this.field1086.field2549;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field1801 * var20 * arg1);
            this.field1077 = (int) ((long) this.field1077 - ((long) this.field1077 * var21 >> 18));
        } else if (var8.field1833 == 2) {
            int var23 = var4 - this.field1086.field2547;
            int var24 = var5 - this.field1086.field2543;
            int var25 = var6 - this.field1086.field2549;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field1801 * var26 * arg1);
            this.field1077 = (int) ((long) this.field1077 - ((long) this.field1077 * var27 >> 28));
        }
        class188 var29 = var7.field2185.field4061;
        for (class188 var30 = var29.field2835; var30 != var29; var30 = var30.field2835) {
            class63 var31 = (class63) var30;
            class147 var32 = var31.field758.field4890;
            if (var32.field2332 != 1) {
                int var33 = var4 - var31.field749;
                int var34 = var5 - var31.field763;
                int var35 = var6 - var31.field751;
                long var36 = (long) (var35 * var35 + var33 * var33 + var34 * var34);
                if (var36 <= var32.field2340) {
                    int var38 = (int) Math.sqrt((double) var36);
                    if (var38 == 0) {
                        var38 = 1;
                    }
                    long var39 = (long) (var31.field760 * var35 + var31.field754 * var33 + var32.field2346 * var34) * 65535L / (long) (var32.field2333 * var38);
                    if (var39 >= (long) var32.field2344) {
                        int var41 = 0;
                        if (var32.field2349 == 1) {
                            var41 = (var38 >> 4) * var32.field2331;
                        } else if (var32.field2349 == 2) {
                            var41 = (var38 >> 4) * (var38 >> 4) * var32.field2331;
                        }
                        if (var32.field2351 != 0) {
                            int var42 = (var33 << 15) / var38 * var32.field2333;
                            int var43 = (var34 << 15) / var38 * var32.field2333;
                            int var44 = (var35 << 15) / var38 * var32.field2333;
                            if (var32.field2338 == 0) {
                                var13 += arg1 * var42 >> 15;
                                var14 += arg1 * var43 >> 15;
                                var15 += arg1 * var44 >> 15;
                                var16 = true;
                            } else {
                                this.field1079 += arg1 * var42 >> 15;
                                this.field1078 += arg1 * var43 >> 15;
                                this.field1083 += arg1 * var44 >> 15;
                            }
                        } else if (var32.field2338 == 0) {
                            var13 += (var31.field754 - var41) * arg1;
                            var14 += (var32.field2346 - var41) * arg1;
                            var15 += (var31.field760 - var41) * arg1;
                            var16 = true;
                        } else {
                            this.field1079 += (var31.field754 - var41) * arg1;
                            this.field1078 += (var32.field2346 - var41) * arg1;
                            this.field1083 += (var31.field760 - var41) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field1847 != null) {
            for (int var45 = 0; var45 < var8.field1847.length; var45++) {
                class63 var46 = (class63) class141.field2176.method630((byte) -119, (long) var8.field1847[var45]);
                while (var46 != null) {
                    class147 var47 = var46.field758.field4890;
                    int var48 = var4 - var46.field749;
                    int var49 = var5 - var46.field763;
                    int var50 = var6 - var46.field751;
                    long var51 = (long) (var50 * var50 + var48 * var48 + var49 * var49);
                    if (var51 > var47.field2340) {
                        var46 = (class63) class141.field2176.method628(-1);
                    } else {
                        int var53 = (int) Math.sqrt((double) var51);
                        if (var53 == 0) {
                            var53 = 1;
                        }
                        long var54 = (long) (var46.field760 * var50 + var46.field754 * var48 + var47.field2346 * var49) * 65535L / (long) (var47.field2333 * var53);
                        if (var54 < (long) var47.field2344) {
                            var46 = (class63) class141.field2176.method628(-1);
                        } else {
                            int var56 = 0;
                            if (var47.field2349 == 1) {
                                var56 = (var53 >> 4) * var47.field2331;
                            } else if (var47.field2349 == 2) {
                                var56 = (var53 >> 4) * (var53 >> 4) * var47.field2331;
                            }
                            if (var47.field2351 != 0) {
                                int var57 = (var48 << 15) / var53 * var47.field2333;
                                int var58 = (var49 << 15) / var53 * var47.field2333;
                                int var59 = (var50 << 15) / var53 * var47.field2333;
                                if (var47.field2338 == 0) {
                                    var13 += arg1 * var57 >> 15;
                                    var14 += arg1 * var58 >> 15;
                                    var15 += arg1 * var59 >> 15;
                                    var16 = true;
                                } else {
                                    this.field1079 += arg1 * var57 >> 15;
                                    this.field1078 += arg1 * var58 >> 15;
                                    this.field1083 += arg1 * var59 >> 15;
                                }
                            } else if (var47.field2338 == 0) {
                                var13 += (var46.field754 - var56) * arg1;
                                var14 += (var47.field2346 - var56) * arg1;
                                var15 += (var46.field760 - var56) * arg1;
                                var16 = true;
                            } else {
                                this.field1079 += (var46.field754 - var56) * arg1;
                                this.field1078 += (var47.field2346 - var56) * arg1;
                                this.field1083 += (var46.field760 - var56) * arg1;
                            }
                            var46 = (class63) class141.field2176.method628(-1);
                        }
                    }
                }
            }
        }
        if (var8.field1823 != null) {
            if (var8.field1824 == null) {
                var8.field1824 = new int[var8.field1823.length];
                for (int var60 = 0; var60 < var8.field1823.length; var60++) {
                    class42.method257(var8.field1823[var60], (byte) 14);
                    var8.field1824[var60] = ((class305) class111.field1528.method770((long) var8.field1823[var60], -105)).field4748;
                }
            }
            for (int var61 = 0; var61 < var8.field1824.length; var61++) {
                class147 var62 = class303.field4732[var8.field1824[var61]];
                if (var62.field2338 == 0) {
                    var13 += var62.field2345 * arg1;
                    var14 += var62.field2346 * arg1;
                    var15 += var62.field2335 * arg1;
                    var16 = true;
                } else {
                    this.field1079 += var62.field2345 * arg1;
                    this.field1078 += var62.field2346 * arg1;
                    this.field1083 += var62.field2335 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field1084 = (short) var13;
                    this.field1085 = (short) var14;
                    this.field1082 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field1077 <<= 0x1;
            }
        }
        this.field1079 = (int) ((long) this.field1079 + ((long) this.field1084 * (long) this.field1077 >> 23) * (long) arg1);
        this.field1078 = (int) ((long) this.field1078 + ((long) this.field1085 * (long) this.field1077 >> 23) * (long) arg1);
        this.field1083 = (int) ((long) this.field1083 + ((long) this.field1082 * (long) this.field1077 >> 23) * (long) arg1);
        int var63 = this.field1079 >> 19;
        int var64 = this.field1083 >> 19;
        int var65 = this.field1078 >> field1081;
        if (var65 > 0 || var65 < -65535 || var63 < 0 || var63 >= class236.field3633 || var64 < 0 || var64 >= class293.field4607) {
            this.method533();
            return;
        }
        int[][][] var66 = class72.field902;
        int var67 = var66[var7.field2205][var63][var64];
        int var68;
        if (var7.field2205 < 3) {
            var68 = var66[var7.field2205 + 1][var63][var64];
        } else {
            var68 = var66[var7.field2205][var63][var64] - 1024;
        }
        if (var8.field1830) {
            if (var8.field1843 == -1 && var65 > var67) {
                this.method533();
                return;
            }
            if (var8.field1843 >= 0 && var65 > var66[var8.field1843][var63][var64]) {
                this.method533();
                return;
            }
            if (var8.field1799 == -1 && var65 < var68) {
                this.method533();
                return;
            }
            if (var8.field1799 >= 0 && var65 < var66[var8.field1799 + 1][var63][var64]) {
                this.method533();
                return;
            }
        }
        if (var63 >= var7.field2206 && var63 <= var7.field2208 && var64 >= var7.field2203 && var64 <= var7.field2207 && var65 <= var7.field2209 && var65 >= var7.field2196) {
            this.field1089 = false;
            return;
        }
        this.field1089 = true;
        byte var69 = 3;
        if (var65 > var66[1][var63][var64]) {
            var69 = 0;
        } else if (var65 > var66[2][var63][var64]) {
            var69 = 1;
        } else if (var65 > var66[3][var63][var64]) {
            var69 = 2;
        } else if (var65 < var66[3][var63][var64] - 1024) {
            this.method533();
            return;
        }
        class196 var70 = class194.field2947[var69][var63][var64];
        if (var70 == null) {
            var70 = class194.field2947[var69][var63][var64] = new class196(var69, var63, var64);
        }
        if (var70.field3001 == null) {
            var70.field3001 = new class281();
            var70.field2989 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var70.field2989) {
            var70.field3001.method2030(8226);
            var70.field2989 = (byte) ((int) (arg0 & 0xFFL));
        }
        var70.field3001.method2028(this, 92);
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V", line = 503)
    private final void method536() {
        int var1 = this.field1086.field2532.field2171;
        if (this.field1086.field2532.field2179[var1] != null) {
            this.field1086.field2532.field2179[var1].method533();
        }
        this.field1086.field2532.field2179[var1] = this;
        this.field1075 = (short) this.field1086.field2532.field2171;
        this.field1086.field2532.field2171 = var1 + 1 & 0x1FFF;
        this.field1086.field2533.method1519(128, this);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lva;IIIIIIIII)V", line = 521)
    public class83(class165 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1086 = arg0;
        this.field1079 = arg1 << field1081;
        this.field1078 = arg2 << field1081;
        this.field1083 = arg3 << field1081;
        this.field1087 = arg9;
        this.field1088 = this.field1076 = (short) arg8;
        this.field1084 = (short) arg4;
        this.field1085 = (short) arg5;
        this.field1082 = (short) arg6;
        this.field1077 = arg7;
        this.method536();
    }
}
