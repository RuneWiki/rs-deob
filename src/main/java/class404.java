import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class404 extends class182 {

    @OriginalMember(owner = "client!lo", name = "tc", descriptor = "Llr;")
    private class312 field5154;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "(I)V", line = 3)
    private final void method2295(int arg0) {
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
                    this.method2296(arg0);
                } else {
                    if (super.field2284 == null) {
                        this.field5154.field4047 = 0;
                    } else {
                        this.field5154.field4047 = super.field2284[arg0] & 255;
                    }
                    this.field5154.field4045 = super.field2309[arg0];
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
                            this.field5154.method1825(super.field2262[var2], super.field2262[var3], super.field2262[var4], super.field2319[var2], super.field2319[var3], super.field2319[var4], super.field2315.field2175, var5, var6, var7, super.field2310[arg0], super.field2310[arg0], super.field2310[arg0], super.field2326[var10], super.field2326[var11], super.field2326[var12], super.field2339[var10], super.field2339[var11], super.field2339[var12], super.field2236[var10], super.field2236[var11], super.field2236[var12], super.field2278[arg0]);
                        } else {
                            this.field5154.method1825(super.field2262[var2], super.field2262[var3], super.field2262[var4], super.field2319[var2], super.field2319[var3], super.field2319[var4], super.field2315.field2175, var5, var6, var7, super.field2310[arg0], super.field2324[arg0], super.field2342[arg0], super.field2326[var10], super.field2326[var11], super.field2326[var12], super.field2339[var10], super.field2339[var11], super.field2339[var12], super.field2236[var10], super.field2236[var11], super.field2236[var12], super.field2278[arg0]);
                        }
                    } else if (super.field2342[arg0] == -1) {
                        this.field5154.method1822(super.field2262[var2], super.field2262[var3], super.field2262[var4], super.field2319[var2], super.field2319[var3], super.field2319[var4], class354.method2040(var5 << 24 | super.field2315.field2175, (byte) 87, class127.field1637[super.field2310[arg0] & 65535]), class354.method2040(var6 << 24 | super.field2315.field2175, (byte) -16, class127.field1637[super.field2310[arg0] & 65535]), class354.method2040(var7 << 24 | super.field2315.field2175, (byte) 83, class127.field1637[super.field2310[arg0] & 65535]));
                    } else {
                        this.field5154.method1822(super.field2262[var2], super.field2262[var3], super.field2262[var4], super.field2319[var2], super.field2319[var3], super.field2319[var4], class354.method2040(var5 << 24 | super.field2315.field2175, (byte) -23, class127.field1637[super.field2310[arg0] & 65535]), class354.method2040(var6 << 24 | super.field2315.field2175, (byte) -79, class127.field1637[super.field2324[arg0] & 65535]), class354.method2040(var7 << 24 | super.field2315.field2175, (byte) 92, class127.field1637[super.field2342[arg0] & 65535]));
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
                this.field5154.field4047 = 0;
            } else {
                this.field5154.field4047 = super.field2284[arg0] & 255;
            }
            this.field5154.field4045 = super.field2309[arg0];
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
                    this.field5154.method1825(super.field2262[var13], super.field2262[var14], super.field2262[var15], super.field2319[var13], super.field2319[var14], super.field2319[var15], super.field2315.field2175, var16, var17, var18, super.field2310[arg0], super.field2310[arg0], super.field2310[arg0], super.field2326[var20], super.field2326[var21], super.field2326[var22], super.field2339[var20], super.field2339[var21], super.field2339[var22], super.field2236[var20], super.field2236[var21], super.field2236[var22], super.field2278[arg0]);
                } else {
                    this.field5154.method1825(super.field2262[var13], super.field2262[var14], super.field2262[var15], super.field2319[var13], super.field2319[var14], super.field2319[var15], super.field2315.field2175, var16, var17, var18, super.field2310[arg0], super.field2324[arg0], super.field2342[arg0], super.field2326[var20], super.field2326[var21], super.field2326[var22], super.field2339[var20], super.field2339[var21], super.field2339[var22], super.field2236[var20], super.field2236[var21], super.field2236[var22], super.field2278[arg0]);
                }
            } else if (super.field2342[arg0] == -1) {
                this.field5154.method1822(super.field2262[var13], super.field2262[var14], super.field2262[var15], super.field2319[var13], super.field2319[var14], super.field2319[var15], class354.method2040(var16 << 24 | super.field2315.field2175, (byte) -105, class127.field1637[super.field2310[arg0] & 65535]), class354.method2040(var17 << 24 | super.field2315.field2175, (byte) -48, class127.field1637[super.field2310[arg0] & 65535]), class354.method2040(var18 << 24 | super.field2315.field2175, (byte) -70, class127.field1637[super.field2310[arg0] & 65535]));
            } else {
                this.field5154.method1822(super.field2262[var13], super.field2262[var14], super.field2262[var15], super.field2319[var13], super.field2319[var14], super.field2319[var15], class354.method2040(var16 << 24 | super.field2315.field2175, (byte) -72, class127.field1637[super.field2310[arg0] & 65535]), class354.method2040(var17 << 24 | super.field2315.field2175, (byte) 93, class127.field1637[super.field2324[arg0] & 65535]), class354.method2040(var18 << 24 | super.field2315.field2175, (byte) 76, class127.field1637[super.field2342[arg0] & 65535]));
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lql;[Llo;)V", line = 175)
    private class404(class173 arg0, class404[] arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "()V", line = 178)
    public final void method480() {
        this.field5154 = null;
    }

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "(I)V", line = 181)
    private final void method2296(int arg0) {
        if (super.field2251[arg0]) {
            this.method2298(arg0);
        } else {
            short var2 = super.field2294[arg0];
            short var3 = super.field2286[arg0];
            short var4 = super.field2293[arg0];
            this.field5154.field4045 = super.field2309[arg0];
            if (super.field2284 == null) {
                this.field5154.field4047 = 0;
            } else {
                this.field5154.field4047 = super.field2284[arg0] & 255;
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
                    this.field5154.method1826(super.field2262[var2], super.field2262[var3], super.field2262[var4], super.field2319[var2], super.field2319[var3], super.field2319[var4], super.field2310[arg0], super.field2310[arg0], super.field2310[arg0], super.field2326[var6], super.field2326[var7], super.field2326[var8], super.field2339[var6], super.field2339[var7], super.field2339[var8], super.field2236[var6], super.field2236[var7], super.field2236[var8], super.field2278[arg0]);
                } else {
                    this.field5154.method1826(super.field2262[var2], super.field2262[var3], super.field2262[var4], super.field2319[var2], super.field2319[var3], super.field2319[var4], super.field2310[arg0], super.field2324[arg0], super.field2342[arg0], super.field2326[var6], super.field2326[var7], super.field2326[var8], super.field2339[var6], super.field2339[var7], super.field2339[var8], super.field2236[var6], super.field2236[var7], super.field2236[var8], super.field2278[arg0]);
                }
            } else if (super.field2342[arg0] == -1) {
                this.field5154.method1820(super.field2262[var2], super.field2262[var3], super.field2262[var4], super.field2319[var2], super.field2319[var3], super.field2319[var4], class127.field1637[super.field2310[arg0] & 65535]);
            } else {
                this.field5154.method1821(super.field2262[var2], super.field2262[var3], super.field2262[var4], super.field2319[var2], super.field2319[var3], super.field2319[var4], super.field2310[arg0] & 65535, super.field2324[arg0] & 65535, super.field2342[arg0] & 65535);
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BIZ)Lba;", line = 237)
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
            var5 = var4 = new class404(super.field2315);
        }
        return this.method1209(var5, var4, arg1, arg0 != 0, arg2);
    }

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "()V", line = 281)
    public final void method485() {
        super.field2269.field5620 = this.field5154.field4043;
        super.field2269.field5631 = this.field5154.field4051;
        super.field2269.field5604 = this.field5154.field4046;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lap;[Llo;)Llo;", line = 287)
    public static final class404 method2297(class449 arg0, class404[] arg1) {
        int var2 = 0;
        class404 var3 = null;
        for (int var4 = 0; var4 < arg1.length; ++var4) {
            if (arg1[var4] != null) {
                ++var2;
                var3 = arg1[var4];
            }
        }
        if (var2 == 1) {
            return var3;
        } else {
            return new class404(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "(I)V", line = 312)
    private final void method2298(int arg0) {
        int var2 = 0;
        int var3 = super.field2315.field2165;
        short var4 = super.field2294[arg0];
        short var5 = super.field2286[arg0];
        short var6 = super.field2293[arg0];
        int var7 = super.field2236[var4];
        int var8 = super.field2236[var5];
        int var9 = super.field2236[var6];
        if (super.field2284 == null) {
            this.field5154.field4047 = 0;
        } else {
            this.field5154.field4047 = super.field2284[arg0] & 255;
        }
        if (var7 >= var3) {
            super.field2239[var2] = super.field2319[var4];
            super.field2311[var2] = super.field2262[var4];
            super.field2250[var2++] = super.field2310[arg0] & 65535;
        } else {
            int var10 = super.field2326[var4];
            int var11 = super.field2339[var4];
            int var12 = super.field2310[arg0] & 65535;
            if (var9 >= var3) {
                int var13 = (var3 - var7) * class182.field2337[var9 - var7];
                super.field2239[var2] = (((super.field2326[var6] - var10) * var13 >> 16) + var10) * super.field2315.field2162 / var3 + super.field2269.field5631;
                super.field2311[var2] = (((super.field2339[var6] - var11) * var13 >> 16) + var11) * super.field2315.field2171 / var3 + super.field2269.field5604;
                super.field2250[var2++] = (((super.field2342[arg0] & 65535) - var12) * var13 >> 16) + var12;
            }
            if (var8 >= var3) {
                int var14 = (var3 - var7) * class182.field2337[var8 - var7];
                super.field2239[var2] = (((super.field2326[var5] - var10) * var14 >> 16) + var10) * super.field2315.field2162 / var3 + super.field2269.field5631;
                super.field2311[var2] = (((super.field2339[var5] - var11) * var14 >> 16) + var11) * super.field2315.field2171 / var3 + super.field2269.field5604;
                super.field2250[var2++] = (((super.field2324[arg0] & 65535) - var12) * var14 >> 16) + var12;
            }
        }
        if (var8 >= var3) {
            super.field2239[var2] = super.field2319[var5];
            super.field2311[var2] = super.field2262[var5];
            super.field2250[var2++] = super.field2324[arg0] & 65535;
        } else {
            int var15 = super.field2326[var5];
            int var16 = super.field2339[var5];
            int var17 = super.field2324[arg0] & 65535;
            if (var7 >= var3) {
                int var18 = (var3 - var8) * class182.field2337[var7 - var8];
                super.field2239[var2] = (((super.field2326[var4] - var15) * var18 >> 16) + var15) * super.field2315.field2162 / var3 + super.field2269.field5631;
                super.field2311[var2] = (((super.field2339[var4] - var16) * var18 >> 16) + var16) * super.field2315.field2171 / var3 + super.field2269.field5604;
                super.field2250[var2++] = (((super.field2310[arg0] & 65535) - var17) * var18 >> 16) + var17;
            }
            if (var9 >= var3) {
                int var19 = (var3 - var8) * class182.field2337[var9 - var8];
                super.field2239[var2] = (((super.field2326[var6] - var15) * var19 >> 16) + var15) * super.field2315.field2162 / var3 + super.field2269.field5631;
                super.field2311[var2] = (((super.field2339[var6] - var16) * var19 >> 16) + var16) * super.field2315.field2171 / var3 + super.field2269.field5604;
                super.field2250[var2++] = (((super.field2342[arg0] & 65535) - var17) * var19 >> 16) + var17;
            }
        }
        if (var9 >= var3) {
            super.field2239[var2] = super.field2319[var6];
            super.field2311[var2] = super.field2262[var6];
            super.field2250[var2++] = super.field2342[arg0] & 65535;
        } else {
            int var20 = super.field2326[var6];
            int var21 = super.field2339[var6];
            int var22 = super.field2342[arg0] & 65535;
            if (var8 >= var3) {
                int var23 = (var3 - var9) * class182.field2337[var8 - var9];
                super.field2239[var2] = (((super.field2326[var5] - var20) * var23 >> 16) + var20) * super.field2315.field2162 / var3 + super.field2269.field5631;
                super.field2311[var2] = (((super.field2339[var5] - var21) * var23 >> 16) + var21) * super.field2315.field2171 / var3 + super.field2269.field5604;
                super.field2250[var2++] = (((super.field2324[arg0] & 65535) - var22) * var23 >> 16) + var22;
            }
            if (var7 >= var3) {
                int var24 = (var3 - var9) * class182.field2337[var7 - var9];
                super.field2239[var2] = (((super.field2326[var4] - var20) * var24 >> 16) + var20) * super.field2315.field2162 / var3 + super.field2269.field5631;
                super.field2311[var2] = (((super.field2339[var4] - var21) * var24 >> 16) + var21) * super.field2315.field2171 / var3 + super.field2269.field5604;
                super.field2250[var2++] = (((super.field2310[arg0] & 65535) - var22) * var24 >> 16) + var22;
            }
        }
        int var25 = super.field2239[0];
        int var26 = super.field2239[1];
        int var27 = super.field2239[2];
        int var28 = super.field2311[0];
        int var29 = super.field2311[1];
        int var30 = super.field2311[2];
        this.field5154.field4045 = false;
        if (var2 == 3) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field2269.field5620 || var26 > super.field2269.field5620 || var27 > super.field2269.field5620) {
                this.field5154.field4045 = true;
            }
            if (super.field2278 != null && super.field2278[arg0] != -1) {
                int var32;
                int var33;
                int var34;
                if (super.field2266 != null && super.field2266[arg0] != -1) {
                    int var31 = super.field2266[arg0] & 255;
                    var32 = super.field2241[var31];
                    var33 = super.field2317[var31];
                    var34 = super.field2301[var31];
                } else {
                    var32 = var4;
                    var33 = var5;
                    var34 = var6;
                }
                if (super.field2342[arg0] == -1) {
                    this.field5154.method1826(var28, var29, var30, var25, var26, var27, super.field2310[arg0], super.field2310[arg0], super.field2310[arg0], super.field2326[var32], super.field2326[var33], super.field2326[var34], super.field2339[var32], super.field2339[var33], super.field2339[var34], super.field2236[var32], super.field2236[var33], super.field2236[var34], super.field2278[arg0]);
                } else {
                    this.field5154.method1826(var28, var29, var30, var25, var26, var27, super.field2250[0], super.field2250[1], super.field2250[2], super.field2326[var32], super.field2326[var33], super.field2326[var34], super.field2339[var32], super.field2339[var33], super.field2339[var34], super.field2236[var32], super.field2236[var33], super.field2236[var34], super.field2278[arg0]);
                }
            } else if (super.field2342[arg0] == -1) {
                this.field5154.method1820(var28, var29, var30, var25, var26, var27, class127.field1637[super.field2310[arg0] & 65535]);
            } else {
                this.field5154.method1821(var28, var29, var30, var25, var26, var27, super.field2250[0], super.field2250[1], super.field2250[2]);
            }
        }
        if (var2 == 4) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field2269.field5620 || var26 > super.field2269.field5620 || var27 > super.field2269.field5620 || super.field2239[3] < 0 || super.field2239[3] > super.field2269.field5620) {
                this.field5154.field4045 = true;
            }
            if (super.field2278 == null || super.field2278[arg0] == -1) {
                if (super.field2342[arg0] == -1) {
                    int var40 = class127.field1637[super.field2310[arg0] & 65535];
                    this.field5154.method1820(var28, var29, var30, var25, var26, var27, var40);
                    this.field5154.method1820(var28, var30, super.field2311[3], var25, var27, super.field2239[3], var40);
                    return;
                }
                this.field5154.method1821(var28, var29, var30, var25, var26, var27, super.field2250[0], super.field2250[1], super.field2250[2]);
                this.field5154.method1821(var28, var30, super.field2311[3], var25, var27, super.field2239[3], super.field2250[0], super.field2250[2], super.field2250[3]);
                return;
            }
            int var36;
            int var37;
            int var38;
            if (super.field2266 != null && super.field2266[arg0] != -1) {
                int var35 = super.field2266[arg0] & 255;
                var36 = super.field2241[var35];
                var37 = super.field2317[var35];
                var38 = super.field2301[var35];
            } else {
                var36 = var4;
                var37 = var5;
                var38 = var6;
            }
            short var39 = super.field2278[arg0];
            if (super.field2342[arg0] == -1) {
                this.field5154.method1826(var28, var29, var30, var25, var26, var27, super.field2310[arg0], super.field2310[arg0], super.field2310[arg0], super.field2326[var36], super.field2326[var37], super.field2326[var38], super.field2339[var36], super.field2339[var37], super.field2339[var38], super.field2236[var36], super.field2236[var37], super.field2236[var38], var39);
                this.field5154.method1826(var28, var30, super.field2311[3], var25, var27, super.field2239[3], super.field2310[arg0], super.field2310[arg0], super.field2310[arg0], super.field2326[var36], super.field2326[var37], super.field2326[var38], super.field2339[var36], super.field2339[var37], super.field2339[var38], super.field2236[var36], super.field2236[var37], super.field2236[var38], var39);
                return;
            }
            this.field5154.method1826(var28, var29, var30, var25, var26, var27, super.field2250[0], super.field2250[1], super.field2250[2], super.field2326[var36], super.field2326[var37], super.field2326[var38], super.field2339[var36], super.field2339[var37], super.field2339[var38], super.field2236[var36], super.field2236[var37], super.field2236[var38], var39);
            this.field5154.method1826(var28, var30, super.field2311[3], var25, var27, super.field2239[3], super.field2250[0], super.field2250[2], super.field2250[3], super.field2326[var36], super.field2326[var37], super.field2326[var38], super.field2339[var36], super.field2339[var37], super.field2339[var38], super.field2236[var36], super.field2236[var37], super.field2236[var38], var39);
        }
    }

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "(I)V", line = 549)
    public final void method487(int arg0) {
        this.field5154.field4044 = (arg0 & 1) == 0;
        this.field5154.field4049 = false;
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(Ljava/lang/Thread;)V", line = 553)
    public final void method483(Thread arg0) {
        super.method483(arg0);
        class669 var2 = (class669) super.field2315.method846(arg0);
        this.field5154 = var2.field9291;
        super.field2237 = var2.field9286;
        super.field2289 = var2.field9285;
        super.field2267 = var2.field9292;
        super.field2341 = var2.field9294;
        super.field2308 = var2.field9296;
        super.field2247 = var2.field9283;
        super.field2295 = var2.field9290;
        super.field2255 = var2.field9287;
        super.field2240 = var2.field9281;
        super.field2336 = var2.field9295;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZZIIZI)V", line = 570)
    public final void method478(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7;
        if (arg3 + 2 > 2200) {
            var7 = 1 + class127.method924(12, arg3) - class182.field2258;
            arg3 = (arg3 >> var7) + 2;
        } else {
            var7 = 0;
            arg3 += 2;
        }
        for (int var8 = 0; var8 < 2200; ++var8) {
            super.field2289[var8] = 0;
        }
        int var9 = 0;
        if (super.field2275 != null) {
            int var10 = 0;
            while (var10 < super.field2273) {
                class95 var11 = super.field2275[var10];
                super.field2243[var11.field1250] = var10++;
            }
        }
        for (int var12 = 0; var12 < super.field2282; ++var12) {
            if (super.field2342[var12] != -2) {
                short var159 = super.field2294[var12];
                short var160 = super.field2286[var12];
                short var161 = super.field2293[var12];
                int var162 = super.field2319[var159];
                int var163 = super.field2319[var160];
                int var164 = super.field2319[var161];
                if (!arg0 || var162 != -5000 && var163 != -5000 && var164 != -5000) {
                    if (super.field2243[var12] != -1 || (super.field2262[var161] - super.field2262[var160]) * (var162 - var163) - (super.field2262[var159] - super.field2262[var160]) * (var164 - var163) > 0) {
                        super.field2251[var12] = false;
                        if (var162 >= 0 && var163 >= 0 && var164 >= 0 && var162 <= super.field2269.field5620 && var163 <= super.field2269.field5620 && var164 <= super.field2269.field5620) {
                            super.field2309[var12] = false;
                        } else {
                            super.field2309[var12] = true;
                        }
                        int var185 = (super.field2237[var159] + super.field2237[var160] + super.field2237[var161]) / 3 >> var7;
                        if (super.field2289[var185] < 64) {
                            super.field2267[var185][super.field2289[var185]++] = var12;
                        } else {
                            int var186 = super.field2289[var185];
                            if (var186 == 64) {
                                if (var9 == 512) {
                                    continue;
                                }
                                super.field2341[var9] = 0;
                                super.field2289[var185] = var186 = 65 + var9++;
                            }
                            var186 -= 65;
                            super.field2308[var186][super.field2341[var186]++] = var12;
                        }
                    }
                } else {
                    int var165 = super.field2326[var159];
                    int var166 = super.field2326[var160];
                    int var167 = super.field2326[var161];
                    int var168 = super.field2339[var159];
                    int var169 = super.field2339[var160];
                    int var170 = super.field2339[var161];
                    int var171 = super.field2236[var159];
                    int var172 = super.field2236[var160];
                    int var173 = super.field2236[var161];
                    int var174 = var165 - var166;
                    int var175 = var167 - var166;
                    int var176 = var168 - var169;
                    int var177 = var170 - var169;
                    int var178 = var171 - var172;
                    int var179 = var173 - var172;
                    int var180 = var176 * var179 - var177 * var178;
                    int var181 = var175 * var178 - var174 * var179;
                    int var182 = var174 * var177 - var175 * var176;
                    if (var172 * var182 + var166 * var180 + var169 * var181 > 0) {
                        super.field2251[var12] = true;
                        int var183 = (super.field2237[var159] + super.field2237[var160] + super.field2237[var161]) / 3 >> var7;
                        if (super.field2289[var183] < 64) {
                            super.field2267[var183][super.field2289[var183]++] = var12;
                        } else {
                            int var184 = super.field2289[var183];
                            if (var184 == 64) {
                                if (var9 == 512) {
                                    continue;
                                }
                                super.field2341[var9] = 0;
                                super.field2289[var183] = var184 = 65 + var9++;
                            }
                            var184 -= 65;
                            super.field2308[var184][super.field2341[var184]++] = var12;
                        }
                    }
                }
            }
        }
        if (arg4) {
            for (int var13 = 0; var13 < arg5; ++var13) {
                int var14 = super.field2268[var13] - arg2 >> var7;
                if (var14 >= 0 && var14 < 2200) {
                    if (super.field2289[var14] < 64) {
                        super.field2267[var14][super.field2289[var14]++] = var13 + 1 << 16;
                    } else {
                        int var15 = super.field2289[var14];
                        if (var15 == 64) {
                            if (var9 == 512) {
                                continue;
                            }
                            super.field2341[var9] = 0;
                            super.field2289[var14] = var15 = 65 + var9++;
                        }
                        var15 -= 65;
                        super.field2308[var15][super.field2341[var15]++] = var13 + 1 << 16;
                    }
                }
            }
        }
        if (super.field2323 == null) {
            if (!arg4 && super.field2275 == null) {
                if (arg1) {
                    for (int var16 = arg3 - 1; var16 >= 0; --var16) {
                        int var17 = super.field2289[var16];
                        if (var17 > 0) {
                            int var18 = var17 > 64 ? 64 : var17;
                            int[] var19 = super.field2267[var16];
                            for (int var20 = 0; var20 < var18; ++var20) {
                                this.method2295(var19[var20]);
                            }
                        }
                        if (var17 > 64) {
                            int var21 = super.field2289[var16] - 64 - 1;
                            int[] var22 = super.field2308[var21];
                            for (int var23 = 0; var23 < super.field2341[var21]; ++var23) {
                                this.method2295(var22[var23]);
                            }
                        }
                    }
                } else {
                    for (int var24 = arg3 - 1; var24 >= 0; --var24) {
                        int var25 = super.field2289[var24];
                        if (var25 > 0) {
                            int var26 = var25 > 64 ? 64 : var25;
                            int[] var27 = super.field2267[var24];
                            for (int var28 = 0; var28 < var26; ++var28) {
                                this.method2296(var27[var28]);
                            }
                        }
                        if (var25 > 64) {
                            int var29 = super.field2289[var24] - 64 - 1;
                            int[] var30 = super.field2308[var29];
                            for (int var31 = 0; var31 < super.field2341[var29]; ++var31) {
                                this.method2296(var30[var31]);
                            }
                        }
                    }
                }
            } else if (arg1) {
                for (int var32 = arg3 - 1; var32 >= 0; --var32) {
                    int var33 = super.field2289[var32];
                    if (var33 > 0) {
                        int var34 = var33 > 64 ? 64 : var33;
                        int[] var35 = super.field2267[var32];
                        for (int var36 = 0; var36 < var34; ++var36) {
                            int var37 = var35[var36];
                            if (var37 < 65536) {
                                int var38 = super.field2243[var37];
                                if (var38 == -1 || !super.field2275[var38].field1248) {
                                    this.method2295(var37);
                                }
                            }
                        }
                    }
                    if (var33 > 64) {
                        int var39 = super.field2289[var32] - 64 - 1;
                        int[] var40 = super.field2308[var39];
                        for (int var41 = 0; var41 < super.field2341[var39]; ++var41) {
                            int var42 = var40[var41];
                            if (var42 < 65536) {
                                int var43 = super.field2243[var42];
                                if (var43 == -1 || !super.field2275[var43].field1248) {
                                    this.method2295(var42);
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var44 = arg3 - 1; var44 >= 0; --var44) {
                    int var45 = super.field2289[var44];
                    if (var45 > 0) {
                        int var46 = var45 > 64 ? 64 : var45;
                        int[] var47 = super.field2267[var44];
                        for (int var48 = 0; var48 < var46; ++var48) {
                            int var49 = var47[var48];
                            if (var49 < 65536) {
                                int var50 = super.field2243[var49];
                                if (var50 != -1) {
                                    class95 var51 = super.field2275[var50];
                                    class291 var52 = super.field2245[var50];
                                    if (!var51.field1248) {
                                        this.method2296(var49);
                                    }
                                    super.field2315.method848(var52.field3767, var52.field3765, var52.field3769, var52.field3771, var52.field3761, var52.field3759, var51.field1255 & 65535, var52.field3762, var51.field1252, var51.field1246);
                                } else {
                                    this.method2296(var47[var48]);
                                }
                            } else {
                                int var53 = (var49 >> 16) - 1;
                                class66 var54 = super.field2256[var53];
                                int var55 = super.field2268[var53];
                                if (var55 == 0) {
                                    var55 = 1;
                                }
                                super.field2315.method847(var54, super.field2300[var53], super.field2325[var53], var55, (super.field2315.field2162 * var54.field903 >> 12) / var55);
                            }
                        }
                    }
                    if (var45 > 64) {
                        int var56 = super.field2289[var44] - 64 - 1;
                        int[] var57 = super.field2308[var56];
                        for (int var58 = 0; var58 < super.field2341[var56]; ++var58) {
                            int var59 = var57[var58];
                            if (var59 < 65536) {
                                int var60 = super.field2243[var59];
                                if (var60 != -1) {
                                    class95 var61 = super.field2275[var60];
                                    class291 var62 = super.field2245[var60];
                                    if (!var61.field1248) {
                                        this.method2296(var59);
                                    }
                                    super.field2315.method848(var62.field3767, var62.field3765, var62.field3769, var62.field3771, var62.field3761, var62.field3759, var61.field1255 & 65535, var62.field3762, var61.field1252, var61.field1246);
                                } else {
                                    this.method2296(var57[var58]);
                                }
                            } else {
                                int var63 = (var59 >> 16) - 1;
                                class66 var64 = super.field2256[var63];
                                int var65 = super.field2268[var63];
                                if (var65 == 0) {
                                    var65 = 1;
                                }
                                super.field2315.method847(var64, super.field2300[var63], super.field2325[var63], var65, (super.field2315.field2162 * var64.field903 >> 12) / var65);
                            }
                        }
                    }
                }
            }
        } else {
            for (int var66 = 0; var66 < 12; ++var66) {
                super.field2247[var66] = 0;
                super.field2336[var66] = 0;
            }
            if (arg4) {
                for (int var67 = arg3 - 1; var67 >= 0; --var67) {
                    int var68 = super.field2289[var67];
                    if (var68 > 0) {
                        int var69;
                        if (var68 > 64) {
                            var69 = 64;
                        } else {
                            var69 = var68;
                        }
                        int[] var70 = super.field2267[var67];
                        for (int var71 = 0; var71 < var69; ++var71) {
                            int var72 = var70[var71];
                            if (var72 < 65536) {
                                byte var73 = super.field2323[var72];
                                int var74 = super.field2247[var73]++;
                                super.field2295[var73][var74] = var72;
                                if (var73 < 10) {
                                    super.field2336[var73] += var67;
                                } else if (var73 == 10) {
                                    super.field2255[var74] = var67;
                                } else {
                                    super.field2240[var74] = var67;
                                }
                            } else {
                                byte var75 = super.field2256[(var72 >> 16) - 1].field896;
                                int var76 = super.field2247[var75]++;
                                super.field2295[var75][var76] = var72;
                                if (var75 < 10) {
                                    super.field2336[var75] += var67;
                                } else if (var75 == 10) {
                                    super.field2255[var76] = var67;
                                } else {
                                    super.field2240[var76] = var67;
                                }
                            }
                        }
                    }
                    if (var68 > 64) {
                        int var77 = super.field2289[var67] - 64 - 1;
                        int[] var78 = super.field2308[var77];
                        for (int var79 = 0; var79 < super.field2341[var77]; ++var79) {
                            int var80 = var78[var79];
                            if (var80 < 65536) {
                                byte var81 = super.field2323[var80];
                                int var82 = super.field2247[var81]++;
                                super.field2295[var81][var82] = var80;
                                if (var81 < 10) {
                                    super.field2336[var81] += var67;
                                } else if (var81 == 10) {
                                    super.field2255[var82] = var67;
                                } else {
                                    super.field2240[var82] = var67;
                                }
                            } else {
                                byte var83 = super.field2256[(var80 >> 16) - 1].field896;
                                int var84 = super.field2247[var83]++;
                                super.field2295[var83][var84] = var80;
                                if (var83 < 10) {
                                    super.field2336[var83] += var67;
                                } else if (var83 == 10) {
                                    super.field2255[var84] = var67;
                                } else {
                                    super.field2240[var84] = var67;
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var85 = arg3 - 1; var85 >= 0; --var85) {
                    int var146 = super.field2289[var85];
                    if (var146 > 0) {
                        int var147;
                        if (var146 > 64) {
                            var147 = 64;
                        } else {
                            var147 = var146;
                        }
                        int[] var148 = super.field2267[var85];
                        for (int var149 = 0; var149 < var147; ++var149) {
                            int var150 = var148[var149];
                            byte var151 = super.field2323[var150];
                            int var152 = super.field2247[var151]++;
                            super.field2295[var151][var152] = var150;
                            if (var151 < 10) {
                                super.field2336[var151] += var85;
                            } else if (var151 == 10) {
                                super.field2255[var152] = var85;
                            } else {
                                super.field2240[var152] = var85;
                            }
                        }
                    }
                    if (var146 > 64) {
                        int var153 = super.field2289[var85] - 64 - 1;
                        int[] var154 = super.field2308[var153];
                        for (int var155 = 0; var155 < super.field2341[var153]; ++var155) {
                            int var156 = var154[var155];
                            byte var157 = super.field2323[var156];
                            int var158 = super.field2247[var157]++;
                            super.field2295[var157][var158] = var156;
                            if (var157 < 10) {
                                super.field2336[var157] += var85;
                            } else if (var157 == 10) {
                                super.field2255[var158] = var85;
                            } else {
                                super.field2240[var158] = var85;
                            }
                        }
                    }
                }
            }
            int var86 = 0;
            if (super.field2247[1] > 0 || super.field2247[2] > 0) {
                var86 = (super.field2336[1] + super.field2336[2]) / (super.field2247[1] + super.field2247[2]);
            }
            int var87 = 0;
            if (super.field2247[3] > 0 || super.field2247[4] > 0) {
                var87 = (super.field2336[3] + super.field2336[4]) / (super.field2247[3] + super.field2247[4]);
            }
            int var88 = 0;
            if (super.field2247[6] > 0 || super.field2247[8] > 0) {
                var88 = (super.field2336[6] + super.field2336[8]) / (super.field2247[6] + super.field2247[8]);
            }
            int var89 = 0;
            int var90 = super.field2247[10];
            int[] var91 = super.field2295[10];
            int[] var92 = super.field2255;
            if (var89 == var90) {
                var89 = 0;
                var90 = super.field2247[11];
                var91 = super.field2295[11];
                var92 = super.field2240;
            }
            int var93;
            if (var89 < var90) {
                var93 = var92[var89];
            } else {
                var93 = -1000;
            }
            for (int var94 = 0; var94 < 10; ++var94) {
                if (arg1) {
                    while (var94 == 0 && var93 > var86) {
                        int var104 = var91[var89++];
                        if (var104 < 65536) {
                            int var105 = super.field2243[var104];
                            if (var105 == -1 || !super.field2275[var105].field1248) {
                                this.method2295(var104);
                            }
                        }
                        if (var89 == var90 && super.field2295[11] != var91) {
                            var89 = 0;
                            var90 = super.field2247[11];
                            var91 = super.field2295[11];
                            var92 = super.field2240;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                    while (var94 == 3 && var93 > var87) {
                        int var106 = var91[var89++];
                        if (var106 < 65536) {
                            int var107 = super.field2243[var106];
                            if (var107 == -1 || !super.field2275[var107].field1248) {
                                this.method2295(var106);
                            }
                        }
                        if (var89 == var90 && super.field2295[11] != var91) {
                            var89 = 0;
                            var90 = super.field2247[11];
                            var91 = super.field2295[11];
                            var92 = super.field2240;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                    while (var94 == 5 && var93 > var88) {
                        int var108 = var91[var89++];
                        if (var108 < 65536) {
                            int var109 = super.field2243[var108];
                            if (var109 == -1 || !super.field2275[var109].field1248) {
                                this.method2295(var108);
                            }
                        }
                        if (var89 == var90 && super.field2295[11] != var91) {
                            var89 = 0;
                            var90 = super.field2247[11];
                            var91 = super.field2295[11];
                            var92 = super.field2240;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                } else {
                    while (var94 == 0 && var93 > var86) {
                        int var110 = var91[var89++];
                        if (var110 < 65536) {
                            int var111 = super.field2243[var110];
                            if (var111 != -1) {
                                class95 var112 = super.field2275[var111];
                                class291 var113 = super.field2245[var111];
                                if (!var112.field1248) {
                                    this.method2296(var110);
                                }
                                super.field2315.method848(var113.field3767, var113.field3765, var113.field3769, var113.field3771, var113.field3761, var113.field3759, var112.field1255 & 65535, var113.field3762, var112.field1252, var112.field1246);
                            } else {
                                this.method2296(var110);
                            }
                        } else {
                            int var114 = (var110 >> 16) - 1;
                            class66 var115 = super.field2256[var114];
                            int var116 = super.field2268[var114];
                            if (var116 == 0) {
                                var116 = 1;
                            }
                            super.field2315.method847(var115, super.field2300[var114], super.field2325[var114], var116, (super.field2315.field2162 * var115.field903 >> 12) / var116);
                        }
                        if (var89 == var90 && super.field2295[11] != var91) {
                            var89 = 0;
                            var90 = super.field2247[11];
                            var91 = super.field2295[11];
                            var92 = super.field2240;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                    while (var94 == 3 && var93 > var87) {
                        int var117 = var91[var89++];
                        if (var117 < 65536) {
                            int var118 = super.field2243[var117];
                            if (var118 != -1) {
                                class95 var119 = super.field2275[var118];
                                class291 var120 = super.field2245[var118];
                                if (!var119.field1248) {
                                    this.method2296(var117);
                                }
                                super.field2315.method848(var120.field3767, var120.field3765, var120.field3769, var120.field3771, var120.field3761, var120.field3759, var119.field1255 & 65535, var120.field3762, var119.field1252, var119.field1246);
                            } else {
                                this.method2296(var117);
                            }
                        } else {
                            int var121 = (var117 >> 16) - 1;
                            class66 var122 = super.field2256[var121];
                            int var123 = super.field2268[var121];
                            if (var123 == 0) {
                                var123 = 1;
                            }
                            super.field2315.method847(var122, super.field2300[var121], super.field2325[var121], var123, (super.field2315.field2162 * var122.field903 >> 12) / var123);
                        }
                        if (var89 == var90 && super.field2295[11] != var91) {
                            var89 = 0;
                            var90 = super.field2247[11];
                            var91 = super.field2295[11];
                            var92 = super.field2240;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                    while (var94 == 5 && var93 > var88) {
                        int var124 = var91[var89++];
                        if (var124 < 65536) {
                            int var125 = super.field2243[var124];
                            if (var125 != -1) {
                                class95 var126 = super.field2275[var125];
                                class291 var127 = super.field2245[var125];
                                if (!var126.field1248) {
                                    this.method2296(var124);
                                }
                                super.field2315.method848(var127.field3767, var127.field3765, var127.field3769, var127.field3771, var127.field3761, var127.field3759, var126.field1255 & 65535, var127.field3762, var126.field1252, var126.field1246);
                            } else {
                                this.method2296(var124);
                            }
                        } else {
                            int var128 = (var124 >> 16) - 1;
                            class66 var129 = super.field2256[var128];
                            int var130 = super.field2268[var128];
                            if (var130 == 0) {
                                var130 = 1;
                            }
                            super.field2315.method847(var129, super.field2300[var128], super.field2325[var128], var130, (super.field2315.field2162 * var129.field903 >> 12) / var130);
                        }
                        if (var89 == var90 && super.field2295[11] != var91) {
                            var89 = 0;
                            var90 = super.field2247[11];
                            var91 = super.field2295[11];
                            var92 = super.field2240;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                }
                int var131 = super.field2247[var94];
                int[] var132 = super.field2295[var94];
                if (!arg4 && super.field2275 == null) {
                    if (arg1) {
                        for (int var133 = 0; var133 < var131; ++var133) {
                            this.method2295(var132[var133]);
                        }
                    } else {
                        for (int var134 = 0; var134 < var131; ++var134) {
                            this.method2296(var132[var134]);
                        }
                    }
                } else if (!arg1) {
                    for (int var138 = 0; var138 < var131; ++var138) {
                        int var139 = var132[var138];
                        if (var139 < 65536) {
                            int var140 = super.field2243[var139];
                            if (var140 != -1) {
                                class95 var141 = super.field2275[var140];
                                class291 var142 = super.field2245[var140];
                                if (!var141.field1248) {
                                    this.method2296(var139);
                                }
                                super.field2315.method848(var142.field3767, var142.field3765, var142.field3769, var142.field3771, var142.field3761, var142.field3759, var141.field1255 & 65535, var142.field3762, var141.field1252, var141.field1246);
                            } else {
                                this.method2296(var139);
                            }
                        } else {
                            int var143 = (var139 >> 16) - 1;
                            class66 var144 = super.field2256[var143];
                            int var145 = super.field2268[var143];
                            if (var145 == 0) {
                                var145 = 1;
                            }
                            super.field2315.method847(var144, super.field2300[var143], super.field2325[var143], var145, (super.field2315.field2162 * var144.field903 >> 12) / var145);
                        }
                    }
                } else {
                    for (int var135 = 0; var135 < var131; ++var135) {
                        int var136 = var132[var135];
                        if (var136 < 65536) {
                            int var137 = super.field2243[var136];
                            if (var137 == -1 || !super.field2275[var137].field1248) {
                                this.method2295(var136);
                            }
                        }
                    }
                }
            }
            if (!arg4 && super.field2275 == null) {
                if (arg1) {
                    while (var93 != -1000) {
                        this.method2295(var91[var89++]);
                        if (var89 == var90 && super.field2295[11] != var91) {
                            var89 = 0;
                            var91 = super.field2295[11];
                            var90 = super.field2247[11];
                            var92 = super.field2240;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                } else {
                    while (var93 != -1000) {
                        this.method2296(var91[var89++]);
                        if (var89 == var90 && super.field2295[11] != var91) {
                            var89 = 0;
                            var91 = super.field2295[11];
                            var90 = super.field2247[11];
                            var92 = super.field2240;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                }
            } else if (!arg1) {
                while (var93 != -1000) {
                    int var97 = var91[var89++];
                    if (var97 < 65536) {
                        int var98 = super.field2243[var97];
                        if (var98 != -1) {
                            class95 var99 = super.field2275[var98];
                            class291 var100 = super.field2245[var98];
                            if (!var99.field1248) {
                                this.method2296(var97);
                            }
                            super.field2315.method848(var100.field3767, var100.field3765, var100.field3769, var100.field3771, var100.field3761, var100.field3759, var99.field1255 & 65535, var100.field3762, var99.field1252, var99.field1246);
                        } else {
                            this.method2296(var97);
                        }
                    } else {
                        int var101 = (var97 >> 16) - 1;
                        class66 var102 = super.field2256[var101];
                        int var103 = super.field2268[var101];
                        if (var103 == 0) {
                            var103 = 1;
                        }
                        super.field2315.method847(var102, super.field2300[var101], super.field2325[var101], var103, (super.field2315.field2162 * var102.field903 >> 12) / var103);
                    }
                    if (var89 == var90 && super.field2295[11] != var91) {
                        var89 = 0;
                        var91 = super.field2295[11];
                        var90 = super.field2247[11];
                        var92 = super.field2240;
                    }
                    if (var89 < var90) {
                        var93 = var92[var89];
                    } else {
                        var93 = -1000;
                    }
                }
            } else {
                while (var93 != -1000) {
                    int var95 = var91[var89++];
                    if (var95 < 65536) {
                        int var96 = super.field2243[var95];
                        if (var96 == -1 || !super.field2275[var96].field1248) {
                            this.method2295(var95);
                        }
                    }
                    if (var89 == var90 && super.field2295[11] != var91) {
                        var89 = 0;
                        var91 = super.field2295[11];
                        var90 = super.field2247[11];
                        var92 = super.field2240;
                    }
                    if (var89 < var90) {
                        var93 = var92[var89];
                    } else {
                        var93 = -1000;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lql;)V", line = 1809)
    public class404(class173 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lql;Lfca;IIII)V", line = 1812)
    public class404(class173 arg0, class645 arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
