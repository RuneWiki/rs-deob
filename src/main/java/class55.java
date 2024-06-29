import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class55 extends class182 {

    @OriginalMember(owner = "client!rv", name = "tc", descriptor = "Ljb;")
    private class670 field747;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZZIIZI)V")
    public final void method478(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (super.field2275 != null) {
            int var7 = 0;
            while (var7 < super.field2273) {
                class95 var8 = super.field2275[var7];
                super.field2243[var8.field1250] = var7++;
            }
        }
        for (int var9 = 0; var9 < super.field2282; ++var9) {
            if (super.field2284 == null || super.field2284[var9] == 0) {
                this.method486(var9, arg0, arg1);
            }
        }
        if (super.field2318) {
            if (super.field2323 == null) {
                for (int var10 = 0; var10 < super.field2282; ++var10) {
                    if (super.field2284 == null || super.field2284[var10] != 0) {
                        this.method486(var10, arg0, arg1);
                    }
                }
            } else {
                for (int var11 = 0; var11 < 12; ++var11) {
                    for (int var12 = 0; var12 < super.field2282; ++var12) {
                        if ((super.field2284 == null || super.field2284[var12] != 0) && super.field2323[var12] == var11) {
                            this.method486(var12, arg0, arg1);
                        }
                    }
                }
            }
        }
        if (arg4) {
            for (int var13 = 0; var13 < arg5; ++var13) {
                class66 var14 = super.field2256[var13];
                int var15 = super.field2268[var13];
                if (var15 == 0) {
                    var15 = 1;
                }
                super.field2315.method847(var14, super.field2300[var13], super.field2325[var13], var15, (super.field2315.field2162 * var14.field903 >> 12) / var15);
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BIZ)Lba;")
    public final class107 method479(byte arg0, int arg1, boolean arg2) {
        this.method1217(Thread.currentThread());
        class182 var4;
        class182 var5;
        if (arg0 == 1) {
            var4 = super.field2253;
            var5 = super.field2287;
        } else if (arg0 == 2) {
            var4 = super.field2298;
            var5 = super.field2252;
        } else if (arg0 == 3) {
            var4 = super.field2329;
            var5 = super.field2248;
        } else if (arg0 == 4) {
            var4 = super.field2299;
            var5 = super.field2338;
        } else if (arg0 == 5) {
            var4 = super.field2320;
            var5 = super.field2303;
        } else {
            var5 = var4 = new class55(super.field2315);
        }
        return this.method1209(var5, var4, arg1, arg0 != 0, arg2);
    }

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "()V")
    public final void method480() {
        this.field747 = null;
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lql;Lfca;IIII)V")
    public class55(class173 arg0, class645 arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "(I)V")
    private final void method481(int arg0) {
        int var2 = 0;
        int var3 = super.field2315.field2165;
        short var4 = super.field2294[arg0];
        short var5 = super.field2286[arg0];
        short var6 = super.field2293[arg0];
        int var7 = super.field2236[var4];
        int var8 = super.field2236[var5];
        int var9 = super.field2236[var6];
        if (super.field2284 == null) {
            this.field747.field9305 = 0;
        } else {
            this.field747.field9305 = super.field2284[arg0] & 255;
        }
        if (var7 >= var3) {
            super.field2239[var2] = super.field2319[var4];
            super.field2311[var2] = super.field2262[var4];
            super.field2244[var2] = super.field2312[var4];
            super.field2250[var2++] = super.field2310[arg0] & 65535;
        } else {
            int var10 = super.field2326[var4];
            int var11 = super.field2339[var4];
            int var12 = super.field2310[arg0] & 65535;
            if (var9 >= var3) {
                int var13 = (var3 - var7) * class182.field2337[var9 - var7];
                super.field2239[var2] = (((super.field2326[var6] - var10) * var13 >> 16) + var10) * super.field2315.field2162 / var3 + super.field2269.field5631;
                super.field2311[var2] = (((super.field2339[var6] - var11) * var13 >> 16) + var11) * super.field2315.field2171 / var3 + super.field2269.field5604;
                super.field2244[var2] = var3;
                super.field2250[var2++] = (((super.field2342[arg0] & 65535) - var12) * var13 >> 16) + var12;
            }
            if (var8 >= var3) {
                int var14 = (var3 - var7) * class182.field2337[var8 - var7];
                super.field2239[var2] = (((super.field2326[var5] - var10) * var14 >> 16) + var10) * super.field2315.field2162 / var3 + super.field2269.field5631;
                super.field2311[var2] = (((super.field2339[var5] - var11) * var14 >> 16) + var11) * super.field2315.field2171 / var3 + super.field2269.field5604;
                super.field2244[var2] = var3;
                super.field2250[var2++] = (((super.field2324[arg0] & 65535) - var12) * var14 >> 16) + var12;
            }
        }
        if (var8 >= var3) {
            super.field2239[var2] = super.field2319[var5];
            super.field2311[var2] = super.field2262[var5];
            super.field2244[var2] = super.field2312[var5];
            super.field2250[var2++] = super.field2324[arg0] & 65535;
        } else {
            int var15 = super.field2326[var5];
            int var16 = super.field2339[var5];
            int var17 = super.field2324[arg0] & 65535;
            if (var7 >= var3) {
                int var18 = (var3 - var8) * class182.field2337[var7 - var8];
                super.field2239[var2] = (((super.field2326[var4] - var15) * var18 >> 16) + var15) * super.field2315.field2162 / var3 + super.field2269.field5631;
                super.field2311[var2] = (((super.field2339[var4] - var16) * var18 >> 16) + var16) * super.field2315.field2171 / var3 + super.field2269.field5604;
                super.field2244[var2] = var3;
                super.field2250[var2++] = (((super.field2310[arg0] & 65535) - var17) * var18 >> 16) + var17;
            }
            if (var9 >= var3) {
                int var19 = (var3 - var8) * class182.field2337[var9 - var8];
                super.field2239[var2] = (((super.field2326[var6] - var15) * var19 >> 16) + var15) * super.field2315.field2162 / var3 + super.field2269.field5631;
                super.field2311[var2] = (((super.field2339[var6] - var16) * var19 >> 16) + var16) * super.field2315.field2171 / var3 + super.field2269.field5604;
                super.field2244[var2] = var3;
                super.field2250[var2++] = (((super.field2342[arg0] & 65535) - var17) * var19 >> 16) + var17;
            }
        }
        if (var9 >= var3) {
            super.field2239[var2] = super.field2319[var6];
            super.field2311[var2] = super.field2262[var6];
            super.field2244[var2] = super.field2312[var6];
            super.field2250[var2++] = super.field2342[arg0] & 65535;
        } else {
            int var20 = super.field2326[var6];
            int var21 = super.field2339[var6];
            int var22 = super.field2342[arg0] & 65535;
            if (var8 >= var3) {
                int var23 = (var3 - var9) * class182.field2337[var8 - var9];
                super.field2239[var2] = (((super.field2326[var5] - var20) * var23 >> 16) + var20) * super.field2315.field2162 / var3 + super.field2269.field5631;
                super.field2311[var2] = (((super.field2339[var5] - var21) * var23 >> 16) + var21) * super.field2315.field2171 / var3 + super.field2269.field5604;
                super.field2244[var2] = var3;
                super.field2250[var2++] = (((super.field2324[arg0] & 65535) - var22) * var23 >> 16) + var22;
            }
            if (var7 >= var3) {
                int var24 = (var3 - var9) * class182.field2337[var7 - var9];
                super.field2239[var2] = (((super.field2326[var4] - var20) * var24 >> 16) + var20) * super.field2315.field2162 / var3 + super.field2269.field5631;
                super.field2311[var2] = (((super.field2339[var4] - var21) * var24 >> 16) + var21) * super.field2315.field2171 / var3 + super.field2269.field5604;
                super.field2244[var2] = var3;
                super.field2250[var2++] = (((super.field2310[arg0] & 65535) - var22) * var24 >> 16) + var22;
            }
        }
        int var25 = super.field2239[0];
        int var26 = super.field2239[1];
        int var27 = super.field2239[2];
        int var28 = super.field2311[0];
        int var29 = super.field2311[1];
        int var30 = super.field2311[2];
        int var31 = super.field2244[0];
        int var32 = super.field2244[1];
        int var33 = super.field2244[2];
        this.field747.field9308 = false;
        if (var2 == 3) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field2269.field5620 || var26 > super.field2269.field5620 || var27 > super.field2269.field5620) {
                this.field747.field9308 = true;
            }
            if (super.field2278 != null && super.field2278[arg0] != -1) {
                int var35;
                int var36;
                int var37;
                if (super.field2266 != null && super.field2266[arg0] != -1) {
                    int var34 = super.field2266[arg0] & 255;
                    var35 = super.field2241[var34];
                    var36 = super.field2317[var34];
                    var37 = super.field2301[var34];
                } else {
                    var35 = var4;
                    var36 = var5;
                    var37 = var6;
                }
                if (super.field2342[arg0] == -1) {
                    this.field747.method3685(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field2310[arg0], super.field2310[arg0], super.field2310[arg0], super.field2326[var35], super.field2326[var36], super.field2326[var37], super.field2339[var35], super.field2339[var36], super.field2339[var37], super.field2236[var35], super.field2236[var36], super.field2236[var37], super.field2278[arg0]);
                } else {
                    this.field747.method3685(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field2250[0], super.field2250[1], super.field2250[2], super.field2326[var35], super.field2326[var36], super.field2326[var37], super.field2339[var35], super.field2339[var36], super.field2339[var37], super.field2236[var35], super.field2236[var36], super.field2236[var37], super.field2278[arg0]);
                }
            } else if (super.field2342[arg0] == -1) {
                this.field747.method3671(var28, var29, var30, var25, var26, var27, var31, var32, var33, class127.field1637[super.field2310[arg0] & 65535]);
            } else {
                this.field747.method3669(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field2250[0], super.field2250[1], super.field2250[2]);
            }
        }
        if (var2 == 4) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field2269.field5620 || var26 > super.field2269.field5620 || var27 > super.field2269.field5620 || super.field2239[3] < 0 || super.field2239[3] > super.field2269.field5620) {
                this.field747.field9308 = true;
            }
            if (super.field2278 == null || super.field2278[arg0] == -1) {
                if (super.field2342[arg0] == -1) {
                    int var43 = class127.field1637[super.field2310[arg0] & 65535];
                    this.field747.method3671(var28, var29, var30, var25, var26, var27, var31, var32, var33, var43);
                    this.field747.method3671(var28, var30, super.field2311[3], var25, var27, super.field2239[3], var31, var32, super.field2244[3], var43);
                    return;
                }
                this.field747.method3669(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field2250[0], super.field2250[1], super.field2250[2]);
                this.field747.method3669(var28, var30, super.field2311[3], var25, var27, super.field2239[3], var31, var32, super.field2244[3], super.field2250[0], super.field2250[2], super.field2250[3]);
                return;
            }
            int var39;
            int var40;
            int var41;
            if (super.field2266 != null && super.field2266[arg0] != -1) {
                int var38 = super.field2266[arg0] & 255;
                var39 = super.field2241[var38];
                var40 = super.field2317[var38];
                var41 = super.field2301[var38];
            } else {
                var39 = var4;
                var40 = var5;
                var41 = var6;
            }
            short var42 = super.field2278[arg0];
            if (super.field2342[arg0] == -1) {
                this.field747.method3685(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field2310[arg0], super.field2310[arg0], super.field2310[arg0], super.field2326[var39], super.field2326[var40], super.field2326[var41], super.field2339[var39], super.field2339[var40], super.field2339[var41], super.field2236[var39], super.field2236[var40], super.field2236[var41], var42);
                this.field747.method3685(var28, var30, super.field2311[3], var25, var27, super.field2239[3], var31, var32, super.field2244[3], super.field2310[arg0], super.field2310[arg0], super.field2310[arg0], super.field2326[var39], super.field2326[var40], super.field2326[var41], super.field2339[var39], super.field2339[var40], super.field2339[var41], super.field2236[var39], super.field2236[var40], super.field2236[var41], var42);
                return;
            }
            this.field747.method3685(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field2250[0], super.field2250[1], super.field2250[2], super.field2326[var39], super.field2326[var40], super.field2326[var41], super.field2339[var39], super.field2339[var40], super.field2339[var41], super.field2236[var39], super.field2236[var40], super.field2236[var41], var42);
            this.field747.method3685(var28, var30, super.field2311[3], var25, var27, super.field2239[3], var31, var32, super.field2244[3], super.field2250[0], super.field2250[2], super.field2250[3], super.field2326[var39], super.field2326[var40], super.field2326[var41], super.field2339[var39], super.field2339[var40], super.field2339[var41], super.field2236[var39], super.field2236[var40], super.field2236[var41], var42);
        }
    }

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "(I)V")
    private final void method482(int arg0) {
        if (!super.field2315.field2156) {
            short var2 = super.field2294[arg0];
            short var3 = super.field2286[arg0];
            short var4 = super.field2293[arg0];
            int var5 = super.field2312[var2] - super.field2315.field2152;
            if (var5 > 255) {
                var5 = 255;
            } else if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field2312[var3] - super.field2315.field2152;
            if (var6 > 255) {
                var6 = 255;
            } else if (var6 < 0) {
                var6 = 0;
            }
            int var7 = super.field2312[var4] - super.field2315.field2152;
            if (var7 > 255) {
                var7 = 255;
            } else if (var7 < 0) {
                var7 = 0;
            }
            int var8 = var5 + var6 + var7;
            if (var8 != 765) {
                if (var8 == 0) {
                    this.method484(arg0);
                } else {
                    if (super.field2284 == null) {
                        this.field747.field9305 = 0;
                    } else {
                        this.field747.field9305 = super.field2284[arg0] & 255;
                    }
                    this.field747.field9308 = super.field2309[arg0];
                    if (super.field2278 != null && super.field2278[arg0] != -1) {
                        int var10;
                        int var11;
                        int var12;
                        if (super.field2266 != null && super.field2266[arg0] != -1) {
                            int var9 = super.field2266[arg0] & 255;
                            var10 = super.field2241[var9];
                            var11 = super.field2317[var9];
                            var12 = super.field2301[var9];
                        } else {
                            var10 = var2;
                            var11 = var3;
                            var12 = var4;
                        }
                        if (super.field2342[arg0] == -1) {
                            this.field747.method3686(super.field2262[var2], super.field2262[var3], super.field2262[var4], super.field2319[var2], super.field2319[var3], super.field2319[var4], super.field2312[var2], super.field2312[var3], super.field2312[var4], super.field2315.field2175, var5, var6, var7, super.field2310[arg0], super.field2310[arg0], super.field2310[arg0], super.field2326[var10], super.field2326[var11], super.field2326[var12], super.field2339[var10], super.field2339[var11], super.field2339[var12], super.field2236[var10], super.field2236[var11], super.field2236[var12], super.field2278[arg0]);
                        } else {
                            this.field747.method3686(super.field2262[var2], super.field2262[var3], super.field2262[var4], super.field2319[var2], super.field2319[var3], super.field2319[var4], super.field2312[var2], super.field2312[var3], super.field2312[var4], super.field2315.field2175, var5, var6, var7, super.field2310[arg0], super.field2324[arg0], super.field2342[arg0], super.field2326[var10], super.field2326[var11], super.field2326[var12], super.field2339[var10], super.field2339[var11], super.field2339[var12], super.field2236[var10], super.field2236[var11], super.field2236[var12], super.field2278[arg0]);
                        }
                    } else if (super.field2342[arg0] == -1) {
                        this.field747.method3673(super.field2262[var2], super.field2262[var3], super.field2262[var4], super.field2319[var2], super.field2319[var3], super.field2319[var4], super.field2312[var2], super.field2312[var3], super.field2312[var4], class354.method2040(var5 << 24 | super.field2315.field2175, (byte) 87, class127.field1637[super.field2310[arg0] & 65535]), class354.method2040(var6 << 24 | super.field2315.field2175, (byte) -97, class127.field1637[super.field2310[arg0] & 65535]), class354.method2040(var7 << 24 | super.field2315.field2175, (byte) 79, class127.field1637[super.field2310[arg0] & 65535]));
                    } else {
                        this.field747.method3673(super.field2262[var2], super.field2262[var3], super.field2262[var4], super.field2319[var2], super.field2319[var3], super.field2319[var4], super.field2312[var2], super.field2312[var3], super.field2312[var4], class354.method2040(var5 << 24 | super.field2315.field2175, (byte) 86, class127.field1637[super.field2310[arg0] & 65535]), class354.method2040(var6 << 24 | super.field2315.field2175, (byte) -27, class127.field1637[super.field2324[arg0] & 65535]), class354.method2040(var7 << 24 | super.field2315.field2175, (byte) -32, class127.field1637[super.field2342[arg0] & 65535]));
                    }
                }
            }
        } else if (!super.field2251[arg0]) {
            short var13 = super.field2294[arg0];
            short var14 = super.field2286[arg0];
            short var15 = super.field2293[arg0];
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            if (super.field2321[var13] > super.field2315.field2166) {
                var16 = 255;
            } else if (super.field2321[var13] > super.field2315.field2155) {
                var16 = (super.field2315.field2155 - super.field2321[var13]) * 255 / (super.field2315.field2155 - super.field2315.field2166);
            }
            if (super.field2321[var14] > super.field2315.field2166) {
                var17 = 255;
            } else if (super.field2321[var14] > super.field2315.field2155) {
                var17 = (super.field2315.field2155 - super.field2321[var14]) * 255 / (super.field2315.field2155 - super.field2315.field2166);
            }
            if (super.field2321[var15] > super.field2315.field2166) {
                var18 = 255;
            } else if (super.field2321[var15] > super.field2315.field2155) {
                var18 = (super.field2315.field2155 - super.field2321[var15]) * 255 / (super.field2315.field2155 - super.field2315.field2166);
            }
            if (super.field2284 == null) {
                this.field747.field9305 = 0;
            } else {
                this.field747.field9305 = super.field2284[arg0] & 255;
            }
            this.field747.field9308 = super.field2309[arg0];
            if (super.field2278 != null && super.field2278[arg0] != -1) {
                int var20;
                int var21;
                int var22;
                if (super.field2266 != null && super.field2266[arg0] != -1) {
                    int var19 = super.field2266[arg0] & 255;
                    var20 = super.field2241[var19];
                    var21 = super.field2317[var19];
                    var22 = super.field2301[var19];
                } else {
                    var20 = var13;
                    var21 = var14;
                    var22 = var15;
                }
                if (super.field2342[arg0] == -1) {
                    this.field747.method3686(super.field2262[var13], super.field2262[var14], super.field2262[var15], super.field2319[var13], super.field2319[var14], super.field2319[var15], super.field2312[var13], super.field2312[var14], super.field2312[var15], super.field2315.field2175, var16, var17, var18, super.field2310[arg0], super.field2310[arg0], super.field2310[arg0], super.field2326[var20], super.field2326[var21], super.field2326[var22], super.field2339[var20], super.field2339[var21], super.field2339[var22], super.field2236[var20], super.field2236[var21], super.field2236[var22], super.field2278[arg0]);
                } else {
                    this.field747.method3686(super.field2262[var13], super.field2262[var14], super.field2262[var15], super.field2319[var13], super.field2319[var14], super.field2319[var15], super.field2312[var13], super.field2312[var14], super.field2312[var15], super.field2315.field2175, var16, var17, var18, super.field2310[arg0], super.field2324[arg0], super.field2342[arg0], super.field2326[var20], super.field2326[var21], super.field2326[var22], super.field2339[var20], super.field2339[var21], super.field2339[var22], super.field2236[var20], super.field2236[var21], super.field2236[var22], super.field2278[arg0]);
                }
            } else if (super.field2342[arg0] == -1) {
                this.field747.method3673(super.field2262[var13], super.field2262[var14], super.field2262[var15], super.field2319[var13], super.field2319[var14], super.field2319[var15], super.field2312[var13], super.field2312[var14], super.field2312[var15], class354.method2040(var16 << 24 | super.field2315.field2175, (byte) -103, class127.field1637[super.field2310[arg0] & 65535]), class354.method2040(var17 << 24 | super.field2315.field2175, (byte) 92, class127.field1637[super.field2310[arg0] & 65535]), class354.method2040(var18 << 24 | super.field2315.field2175, (byte) -64, class127.field1637[super.field2310[arg0] & 65535]));
            } else {
                this.field747.method3673(super.field2262[var13], super.field2262[var14], super.field2262[var15], super.field2319[var13], super.field2319[var14], super.field2319[var15], super.field2312[var13], super.field2312[var14], super.field2312[var15], class354.method2040(var16 << 24 | super.field2315.field2175, (byte) 111, class127.field1637[super.field2310[arg0] & 65535]), class354.method2040(var17 << 24 | super.field2315.field2175, (byte) 123, class127.field1637[super.field2324[arg0] & 65535]), class354.method2040(var18 << 24 | super.field2315.field2175, (byte) 106, class127.field1637[super.field2342[arg0] & 65535]));
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(Ljava/lang/Thread;)V")
    public final void method483(Thread arg0) {
        super.method483(arg0);
        class639 var2 = (class639) super.field2315.method846(arg0);
        this.field747 = var2.field8892;
    }

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "(I)V")
    private final void method484(int arg0) {
        short var2 = super.field2294[arg0];
        short var3 = super.field2286[arg0];
        short var4 = super.field2293[arg0];
        this.field747.field9308 = super.field2309[arg0];
        if (super.field2284 == null) {
            this.field747.field9305 = 0;
        } else {
            this.field747.field9305 = super.field2284[arg0] & 255;
        }
        if (super.field2278 != null && super.field2278[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (super.field2266 != null && super.field2266[arg0] != -1) {
                int var5 = super.field2266[arg0] & 255;
                var6 = super.field2241[var5];
                var7 = super.field2317[var5];
                var8 = super.field2301[var5];
            } else {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            }
            if (super.field2342[arg0] == -1) {
                this.field747.method3685(super.field2262[var2], super.field2262[var3], super.field2262[var4], super.field2319[var2], super.field2319[var3], super.field2319[var4], super.field2312[var2], super.field2312[var3], super.field2312[var4], super.field2310[arg0], super.field2310[arg0], super.field2310[arg0], super.field2326[var6], super.field2326[var7], super.field2326[var8], super.field2339[var6], super.field2339[var7], super.field2339[var8], super.field2236[var6], super.field2236[var7], super.field2236[var8], super.field2278[arg0]);
            } else {
                this.field747.method3685(super.field2262[var2], super.field2262[var3], super.field2262[var4], super.field2319[var2], super.field2319[var3], super.field2319[var4], super.field2312[var2], super.field2312[var3], super.field2312[var4], super.field2310[arg0], super.field2324[arg0], super.field2342[arg0], super.field2326[var6], super.field2326[var7], super.field2326[var8], super.field2339[var6], super.field2339[var7], super.field2339[var8], super.field2236[var6], super.field2236[var7], super.field2236[var8], super.field2278[arg0]);
            }
        } else if (super.field2342[arg0] == -1) {
            this.field747.method3671(super.field2262[var2], super.field2262[var3], super.field2262[var4], super.field2319[var2], super.field2319[var3], super.field2319[var4], super.field2312[var2], super.field2312[var3], super.field2312[var4], class127.field1637[super.field2310[arg0] & 65535]);
        } else {
            this.field747.method3669(super.field2262[var2], super.field2262[var3], super.field2262[var4], super.field2319[var2], super.field2319[var3], super.field2319[var4], super.field2312[var2], super.field2312[var3], super.field2312[var4], super.field2310[arg0] & 65535, super.field2324[arg0] & 65535, super.field2342[arg0] & 65535);
        }
    }

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "()V")
    public final void method485() {
        super.field2269.field5620 = this.field747.field9306;
        super.field2269.field5631 = this.field747.field9309;
        super.field2269.field5604 = this.field747.field9299;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IZZ)V")
    private final void method486(int arg0, boolean arg1, boolean arg2) {
        if (super.field2342[arg0] != -2) {
            short var4 = super.field2294[arg0];
            short var5 = super.field2286[arg0];
            short var6 = super.field2293[arg0];
            int var7 = super.field2319[var4];
            int var8 = super.field2319[var5];
            int var9 = super.field2319[var6];
            if (!arg1 || var7 != -5000 && var8 != -5000 && var9 != -5000) {
                if (super.field2243[arg0] != -1 || (super.field2262[var6] - super.field2262[var5]) * (var7 - var8) - (super.field2262[var4] - super.field2262[var5]) * (var9 - var8) > 0) {
                    if (var7 >= 0 && var8 >= 0 && var9 >= 0 && var7 <= super.field2269.field5620 && var8 <= super.field2269.field5620 && var9 <= super.field2269.field5620) {
                        super.field2309[arg0] = false;
                    } else {
                        super.field2309[arg0] = true;
                    }
                    if (arg2) {
                        int var28 = super.field2243[arg0];
                        if (var28 == -1 || !super.field2275[var28].field1248) {
                            this.method482(arg0);
                        }
                        return;
                    }
                    int var29 = super.field2243[arg0];
                    if (var29 != -1) {
                        class95 var30 = super.field2275[var29];
                        class291 var31 = super.field2245[var29];
                        if (!var30.field1248) {
                            this.method484(arg0);
                        }
                        super.field2315.method848(var31.field3767, var31.field3765, var31.field3769, var31.field3771, var31.field3761, var31.field3759, var30.field1255 & 65535, var31.field3762, var30.field1252, var30.field1246);
                        return;
                    }
                    this.method484(arg0);
                }
            } else {
                int var10 = super.field2326[var4];
                int var11 = super.field2326[var5];
                int var12 = super.field2326[var6];
                int var13 = super.field2339[var4];
                int var14 = super.field2339[var5];
                int var15 = super.field2339[var6];
                int var16 = super.field2236[var4];
                int var17 = super.field2236[var5];
                int var18 = super.field2236[var6];
                int var19 = var10 - var11;
                int var20 = var12 - var11;
                int var21 = var13 - var14;
                int var22 = var15 - var14;
                int var23 = var16 - var17;
                int var24 = var18 - var17;
                int var25 = var21 * var24 - var22 * var23;
                int var26 = var20 * var23 - var19 * var24;
                int var27 = var19 * var22 - var20 * var21;
                if (var17 * var27 + var11 * var25 + var14 * var26 > 0) {
                    this.method481(arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lql;)V")
    public class55(class173 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)V")
    public final void method487(int arg0) {
        this.field747.field9303 = (arg0 & 1) == 0;
        this.field747.field9300 = false;
    }
}
