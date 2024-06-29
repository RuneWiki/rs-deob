import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class468 extends class564 {

    @OriginalMember(owner = "client!vaa", name = "jd", descriptor = "I")
    public int field6636 = -1;

    @OriginalMember(owner = "client!vaa", name = "ld", descriptor = "I")
    public int field6638 = -1;

    @OriginalMember(owner = "client!vaa", name = "Wc", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!vaa", name = "Xc", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!vaa", name = "Yc", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!vaa", name = "Zc", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!vaa", name = "ad", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!vaa", name = "bd", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!vaa", name = "cd", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!vaa", name = "dd", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!vaa", name = "ed", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!vaa", name = "gd", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!vaa", name = "hd", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!vaa", name = "id", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!vaa", name = "kd", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!vaa", name = "md", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!vaa", name = "nd", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!vaa", name = "od", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!vaa", name = "pd", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!vaa", name = "qd", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!vaa", name = "fd", descriptor = "Lkm;")
    public class353 field6632;

    @OriginalMember(owner = "client!vaa", name = "m", descriptor = "(I)I", line = 4)
    public final int method1843(int arg0) {
        ++field6641;
        if (this.field6632.field5026 != null) {
            class353 var2 = this.field6632.method2273((byte) 29, class101.field1201);
            if (var2 != null && var2.field4997 != -1) {
                return var2.field4997;
            }
        }
        return arg0 != 2 ? 52 : this.field6632.field4997;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILha;I)Z", line = 26)
    private final boolean method2788(int arg0, class58 arg1, int arg2) {
        ++field6643;
        int var4 = arg0;
        class224 var5 = this.method3247(21816);
        class709 var6 = ~super.field7991 != arg2 && super.field7925 == 0 ? class343.field4785.method3525(super.field7991, (byte) 109) : null;
        class709 var7 = super.field7930 == -1 || super.field7968 && var6 != null ? null : class343.field4785.method3525(super.field7930, (byte) -99);
        int var8 = var5.field3010;
        int var9 = var5.field3023;
        if (~var8 != -1 || ~var9 != -1 || ~var5.field3014 != -1 || var5.field3015 != 0) {
            arg0 |= 7;
        }
        boolean var10 = super.field7971 != 0 && super.field7999 <= class740.field10285 && class740.field10285 < super.field7983;
        if (var10) {
            arg0 |= 524288;
        }
        int var11 = super.field7917.method2122(~arg2);
        class471 var12 = super.field8010[0] = this.field6632.method2279(super.field7921, class343.field4785, super.field7906, class101.field1201, super.field7927, super.field7922, super.field7981, arg1, var11, super.field7982, var6, true, arg0, var7, class200.field2638, super.field7963, super.field7965);
        if (var12 == null) {
            return false;
        } else {
            super.field7974 = var12.method253();
            super.field7995 = var12.method218();
            this.method3252((byte) -89, var12);
            if (~var8 == -1 && ~var9 == -1) {
                this.method3244(0, this.method1835((byte) 127) << 9, 0, var11, (byte) -5, this.method1835((byte) 127) << 9);
            } else {
                this.method3244(var5.field2987, var8, var5.field3027, var11, (byte) -39, var9);
                if (super.field7948 != 0) {
                    super.field8010[0].method238(super.field7948);
                }
                if (~super.field7941 != -1) {
                    super.field8010[0].method249(super.field7941);
                }
                if (super.field7957 != 0) {
                    super.field8010[0].method235(0, super.field7957, 0);
                }
            }
            if (var10) {
                var12.method225(super.field7962, super.field7914, super.field7997, 255 & super.field7971);
            }
            if (super.field7928 != -1 && ~super.field7966 != 0) {
                class752 var13 = class220.field2879.method977(super.field7928, (byte) 84);
                boolean var14 = var13.field10445 == 3 && (~var8 != -1 || var9 != 0);
                int var15 = var4;
                if (!var14) {
                    if (super.field7936 != 0) {
                        var15 = var4 | 5;
                    }
                    if (super.field7938 != 0) {
                        var15 |= 2;
                    }
                    if (super.field7976 >= 0) {
                        var15 |= 7;
                    }
                } else {
                    var15 = var4 | 7;
                }
                class471 var16 = super.field8010[1] = var13.method4185(arg1, (byte) 6, super.field7920, super.field7966, super.field7923, var15, class343.field4785);
                if (var16 != null) {
                    if (super.field7976 < 0) {
                        if (~super.field7936 != -1) {
                            var16.method231(super.field7936 * 2048);
                        }
                    } else {
                        int var17 = 0;
                        int var18 = 0;
                        int var19 = 0;
                        if (var5.field3016 != null && var5.field3016[super.field7976] != null) {
                            var18 += var5.field3016[super.field7976][1];
                            var17 += var5.field3016[super.field7976][0];
                            var19 += var5.field3016[super.field7976][2];
                        }
                        if (var5.field2981 != null && var5.field2981[super.field7976] != null) {
                            var18 += var5.field2981[super.field7976][1];
                            var17 += var5.field2981[super.field7976][0];
                            var19 += var5.field2981[super.field7976][2];
                        }
                        if (~var19 != -1 || ~var17 != -1) {
                            int var20 = var11;
                            if (super.field7963 != null && super.field7963[super.field7976] != -1) {
                                var20 = super.field7963[super.field7976];
                            }
                            int var21 = super.field7936 * 2048 - -var20 + -var11 & 16383;
                            if (var21 != 0) {
                                var16.method231(var21);
                            }
                            int var22 = class164.field2258[var21];
                            int var23 = class164.field2252[var21];
                            int var24 = var17 * var23 + var19 * var22 >> 14;
                            var19 = var19 * var23 + -(var17 * var22) >> 14;
                            var17 = var24;
                        }
                        var16.method235(var17, var18, var19);
                    }
                    if (super.field7938 != 0) {
                        var16.method235(0, -super.field7938 << 2, 0);
                    }
                    if (var14) {
                        if (super.field7948 != 0) {
                            var16.method238(super.field7948);
                        }
                        if (super.field7941 != 0) {
                            var16.method249(super.field7941);
                        }
                        if (super.field7957 != 0) {
                            var16.method235(0, super.field7957, 0);
                        }
                    }
                }
            } else {
                super.field8010[1] = null;
            }
            if (super.field7977 != -1 && super.field7953 != -1) {
                class752 var25 = class220.field2879.method977(super.field7977, (byte) -65);
                boolean var26 = var25.field10445 == 3 && (var8 != 0 || var9 != 0);
                int var27 = var4;
                if (var26) {
                    var27 = var4 | 7;
                } else {
                    if (super.field7973 != 0) {
                        var27 = var4 | 5;
                    }
                    if (~super.field7986 != -1) {
                        var27 |= 2;
                    }
                    if (~super.field7955 <= -1) {
                        var27 |= 7;
                    }
                }
                class471 var28 = super.field8010[2] = var25.method4180(super.field7953, class343.field4785, arg1, var27, super.field7912, super.field7952, (byte) -123);
                if (var28 != null) {
                    if (super.field7955 >= 0 && var5.field3016 != null && var5.field3016[super.field7955] != null) {
                        int var29 = 0;
                        int var30 = 0;
                        int var31 = 0;
                        if (var5.field3016 != null && var5.field3016[super.field7955] != null) {
                            var29 += var5.field3016[super.field7955][0];
                            var31 += var5.field3016[super.field7955][2];
                            var30 += var5.field3016[super.field7955][1];
                        }
                        if (var5.field2981 != null && var5.field2981[super.field7955] != null) {
                            var31 += var5.field2981[super.field7955][2];
                            var30 += var5.field2981[super.field7955][1];
                            var29 += var5.field2981[super.field7955][0];
                        }
                        if (~var31 != -1 || ~var29 != -1) {
                            int var32 = var11;
                            if (super.field7963 != null && ~super.field7963[super.field7955] != 0) {
                                var32 = super.field7963[super.field7955];
                            }
                            int var33 = super.field7973 * 2048 - (-var32 - -var11) & 16383;
                            if (~var33 != -1) {
                                var28.method231(var33);
                            }
                            int var34 = class164.field2258[var33];
                            int var35 = class164.field2252[var33];
                            int var36 = var31 * var34 - -(var29 * var35) >> 14;
                            var31 = var31 * var35 + -(var29 * var34) >> 14;
                            var29 = var36;
                        }
                        var28.method235(var29, var30, var31);
                    } else if (super.field7973 != 0) {
                        var28.method231(super.field7973 * 2048);
                    }
                    if (~super.field7986 != -1) {
                        var28.method235(0, -super.field7986 << 2, 0);
                    }
                    if (var26) {
                        if (super.field7948 != 0) {
                            var28.method238(super.field7948);
                        }
                        if (super.field7941 != 0) {
                            var28.method249(super.field7941);
                        }
                        if (super.field7957 != 0) {
                            var28.method235(0, super.field7957, 0);
                        }
                    }
                }
            } else {
                super.field8010[2] = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "k", descriptor = "(I)V", line = 306)
    public final void method614(int arg0) {
        if (arg0 == 26062) {
            ++field6624;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "(I)Z", line = 318)
    public final boolean method621(int arg0) {
        if (arg0 > -103) {
            this.method1837((byte) 65);
        }
        ++field6633;
        return false;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILkm;)V", line = 330)
    public final void method2789(int arg0, class353 arg1) {
        this.field6632 = arg1;
        ++field6637;
        if (arg0 != -1) {
            this.field6636 = -35;
        }
        if (super.field8008 != null) {
            super.field8008.method3111();
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)I", line = 344)
    public final int method2790(int arg0) {
        ++field6639;
        if (this.field6632.field5026 != null) {
            class353 var2 = this.field6632.method2273((byte) 29, class101.field1201);
            if (var2 != null && var2.field4998 != -1) {
                return var2.field4998;
            }
        }
        if (arg0 != 0) {
            this.method2789(-93, (class353) null);
        }
        return this.field6632.field4998 == -1 ? super.method2790(0) : this.field6632.field4998;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)I", line = 371)
    public final int method1837(byte arg0) {
        ++field6640;
        if (arg0 != 72) {
            return 75;
        } else {
            if (this.field6632.field5026 != null) {
                class353 var2 = this.field6632.method2273((byte) 29, class101.field1201);
                if (var2 != null && var2.field5044 != -1) {
                    return var2.field5044;
                }
            }
            return this.field6632.field5044;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZLha;IILkba;II)V", line = 393)
    public final void method615(boolean arg0, class58 arg1, int arg2, int arg3, class105 arg4, int arg5, int arg6) {
        if (arg5 != 22501) {
            this.method752((class58) null, 19, -45, -30);
        }
        ++field6630;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vaa", name = "f", descriptor = "(I)I", line = 405)
    public final int method747(int arg0) {
        ++field6629;
        if (arg0 <= 72) {
            this.method2793(39);
        }
        return this.field6632 == null ? 0 : this.field6632.field5000;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(III)V", line = 420)
    public final void method2791(int arg0, int arg1, int arg2) {
        ++field6626;
        int var4 = super.field8009[0];
        int var5 = super.field8015[0];
        if (arg0 == 0) {
            ++var5;
        }
        if (~arg0 == -2) {
            ++var4;
            ++var5;
        }
        if (arg0 == 2) {
            ++var4;
        }
        if (~arg0 == -4) {
            ++var4;
            --var5;
        }
        if (~arg0 == -5) {
            --var5;
        }
        if (arg0 == 5) {
            --var4;
            --var5;
        }
        if (arg0 == 6) {
            --var4;
        }
        if (~super.field7991 != 0 && ~class343.field4785.method3525(super.field7991, (byte) 98).field9839 == -2) {
            super.field7991 = -1;
            super.field7911 = null;
        }
        if (arg2 != -1) {
            this.field6638 = 18;
        }
        if (~arg0 == -8) {
            --var4;
            ++var5;
        }
        if (~super.field7928 != 0) {
            class752 var6 = class220.field2879.method977(super.field7928, (byte) 112);
            if (var6.field10443 && ~var6.field10449 != 0 && ~class343.field4785.method3525(var6.field10449, (byte) -77).field9839 == -2) {
                super.field7928 = -1;
            }
        }
        if (~super.field7977 != 0) {
            class752 var7 = class220.field2879.method977(super.field7977, (byte) -127);
            if (var7.field10443 && ~var7.field10449 != 0 && ~class343.field4785.method3525(var7.field10449, (byte) -63).field9839 == -2) {
                super.field7977 = -1;
            }
        }
        if (super.field8014 < 9) {
            ++super.field8014;
        }
        for (int var8 = super.field8014; var8 > 0; --var8) {
            super.field8009[var8] = super.field8009[var8 + -1];
            super.field8015[var8] = super.field8015[var8 + -1];
            super.field8011[var8] = super.field8011[var8 + -1];
        }
        super.field8009[0] = var4;
        super.field8015[0] = var5;
        super.field8011[0] = (byte) arg1;
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(BLha;)Lml;", line = 525)
    public final class387 method755(byte arg0, class58 arg1) {
        ++field6625;
        if (this.field6632 != null && this.method2788(2048, arg1, 0)) {
            class513 var3 = arg1.method439();
            int var4 = super.field7917.method2122(arg0 + 126);
            var3.method363(var4);
            class165 var5 = class553.field7776[super.field1266][super.field1264 >> class660.field9038][super.field1250 >> class660.field9038];
            if (var5 != null && var5.field2266 != null) {
                int var6 = -var5.field2266.field7425 + super.field7946;
                super.field7946 = (int) ((float) super.field7946 - (float) var6 / 10.0F);
            } else {
                super.field7946 = (int) ((float) super.field7946 - (float) super.field7946 / 10.0F);
            }
            var3.method360(super.field1264, super.field1255 - super.field7946 + -20, super.field1250);
            class224 var7 = this.method3247(21816);
            class353 var8 = this.field6632.field5026 != null ? this.field6632.method2273((byte) 29, class101.field1201) : this.field6632;
            super.field8017 = false;
            class387 var9 = null;
            if (~class557.field7812.field6525.method1231(false) == -2 && var8.field5023 && var7.field2986) {
                class709 var10 = super.field7991 != -1 && ~super.field7925 == -1 ? class343.field4785.method3525(super.field7991, (byte) 107) : null;
                class709 var11 = super.field7930 == -1 || super.field7968 && var10 != null ? null : class343.field4785.method3525(super.field7930, (byte) -96);
                class471 var12 = class713.method4013(this.field6632.field5027 & 255, super.field7948, super.field7941, super.field7957, this.field6632.field5007 & 255, arg1, 21525, super.field8010[0], 65535 & this.field6632.field5006, this.field6632.field5051, this.field6632.field5021 & 65535, var11 != null ? super.field7906 : super.field7965, var11 != null ? var11 : var10, var4);
                if (var12 != null) {
                    var9 = class65.method544(this.method2793(-19066), super.field8010.length + 1, arg0 + 24951);
                    super.field8017 = true;
                    arg1.method490(false);
                    if (!class180.field2409) {
                        var12.method221(var3, var9.field5482[super.field8010.length], 0);
                    } else {
                        var12.method262(var3, var9.field5482[super.field8010.length], class516.field7361, 0);
                    }
                    arg1.method490(true);
                }
            }
            var3.method363(var4);
            var3.method360(super.field1264, super.field1255 - (5 - -super.field7946), super.field1250);
            if (arg0 != -127) {
                this.method614(-54);
            }
            if (var9 == null) {
                var9 = class65.method544(this.method2793(arg0 ^ 18951), super.field8010.length, 24824);
            }
            this.method3249(true, var3, arg1, super.field8010, false);
            if (!class180.field2409) {
                for (int var13 = 0; ~var13 > ~super.field8010.length; ++var13) {
                    if (super.field8010[var13] != null) {
                        super.field8010[var13].method221(var3, var9.field5482[var13], 0);
                    }
                }
            } else {
                for (int var14 = 0; ~var14 > ~super.field8010.length; ++var14) {
                    if (super.field8010[var14] != null) {
                        super.field8010[var14].method262(var3, var9.field5482[var14], class516.field7361, 0);
                    }
                }
            }
            if (super.field8008 != null) {
                class50 var15 = super.field8008.method3116();
                if (class180.field2409) {
                    arg1.method379(var15, class516.field7361);
                } else {
                    arg1.method381(var15);
                }
            }
            for (int var16 = 0; ~var16 > ~super.field8010.length; ++var16) {
                if (super.field8010[var16] != null) {
                    super.field8017 |= super.field8010[var16].method224();
                }
            }
            super.field7907 = class82.field1033;
            super.field8010[0] = super.field8010[1] = super.field8010[2] = null;
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "o", descriptor = "(I)Z", line = 655)
    public final boolean method2792(int arg0) {
        if (arg0 != 92160000) {
            this.field6632 = null;
        }
        ++field6635;
        return this.field6632 != null;
    }

    @OriginalMember(owner = "client!vaa", name = "p", descriptor = "(I)Z", line = 674)
    private final boolean method2793(int arg0) {
        ++field6623;
        return arg0 != -19066 ? true : this.field6632.field5046;
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(ILha;)Lkj;", line = 685)
    public final class566 method744(int arg0, class58 arg1) {
        if (arg0 != 0) {
            this.method753((byte) -82, (class58) null);
        }
        ++field6627;
        return null;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BLha;)V", line = 697)
    public final void method753(byte arg0, class58 arg1) {
        ++field6634;
        int var3 = 102 / ((18 - arg0) / 40);
        if (this.field6632 != null) {
            if (super.field8016 || this.method2788(0, arg1, 0)) {
                class513 var4 = arg1.method439();
                var4.method363(super.field7917.method2122(-1));
                var4.method360(super.field1264, super.field1255 + -20, super.field1250);
                this.method3249(true, var4, arg1, super.field8010, super.field8016);
                super.field8010[0] = super.field8010[1] = super.field8010[2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZIIIBI)V", line = 724)
    public final void method2794(boolean arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        ++field6628;
        super.field1266 = super.field1258 = (byte) arg2;
        if (class364.method2319((byte) -88, arg5, arg3)) {
            ++super.field1258;
        }
        if (super.field7991 != -1 && ~class343.field4785.method3525(super.field7991, (byte) -45).field9839 == -2) {
            super.field7911 = null;
            super.field7991 = -1;
        }
        if (~super.field7928 != 0) {
            class752 var7 = class220.field2879.method977(super.field7928, (byte) -74);
            if (var7.field10443 && var7.field10449 != -1 && class343.field4785.method3525(var7.field10449, (byte) -46).field9839 == 1) {
                super.field7928 = -1;
            }
        }
        if (super.field7977 != -1) {
            class752 var8 = class220.field2879.method977(super.field7977, (byte) 61);
            if (var8.field10443 && ~var8.field10449 != 0 && ~class343.field4785.method3525(var8.field10449, (byte) -44).field9839 == -2) {
                super.field7977 = -1;
            }
        }
        if (!arg0) {
            int var9 = -super.field8009[0] + arg5;
            int var10 = -super.field8015[0] + arg3;
            if (~var9 <= 7 && ~var9 >= -9 && var10 >= -8 && ~var10 >= -9) {
                if (~super.field8014 > -10) {
                    ++super.field8014;
                }
                for (int var11 = super.field8014; ~var11 < -1; --var11) {
                    super.field8009[var11] = super.field8009[var11 + -1];
                    super.field8015[var11] = super.field8015[var11 - 1];
                    super.field8011[var11] = super.field8011[var11 + -1];
                }
                super.field8009[0] = arg5;
                super.field8015[0] = arg3;
                super.field8011[0] = 1;
                return;
            }
        }
        super.field8014 = 0;
        super.field8012 = 0;
        super.field8009[0] = arg5;
        super.field8007 = 0;
        super.field8015[0] = arg3;
        super.field1264 = (super.field8009[0] << 9) + (arg1 << 8);
        super.field1250 = (super.field8015[0] << 9) + (arg1 << 8);
        if (super.field8008 != null) {
            super.field8008.method3111();
        }
        if (arg4 <= 13) {
            this.field6638 = -33;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lha;III)Z", line = 807)
    public final boolean method752(class58 arg0, int arg1, int arg2, int arg3) {
        ++field6631;
        if (this.field6632 != null && this.method2788(131072, arg0, 0)) {
            class513 var5 = arg0.method439();
            int var6 = super.field7917.method2122(-1);
            var5.method363(var6);
            var5.method360(super.field1264, super.field1255, super.field1250);
            boolean var7 = false;
            for (int var8 = arg1; ~super.field8010.length < ~var8; ++var8) {
                if (super.field8010[var8] != null) {
                    boolean var10000;
                    label43: {
                        if (this.field6632.field5000 <= 0) {
                            label41: {
                                if (this.field6632.field4984 == -1) {
                                    if (~this.field6632.field5051 == -2) {
                                        break label41;
                                    }
                                    var10000 = false;
                                } else {
                                    if (~this.field6632.field4984 == -2) {
                                        break label41;
                                    }
                                    var10000 = false;
                                }
                                if (!var10000) {
                                    var10000 = false;
                                    break label43;
                                }
                            }
                        }
                        var10000 = true;
                    }
                    boolean var9 = var10000;
                    boolean var10;
                    if (!class180.field2409) {
                        var10 = super.field8010[var8].method233(arg3, arg2, var5, var9, this.field6632.field5000);
                    } else {
                        var10 = super.field8010[var8].method229(arg3, arg2, var5, var9, this.field6632.field5000, class516.field7361);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            super.field8010[0] = super.field8010[1] = super.field8010[2] = null;
            return var7;
        } else {
            return false;
        }
    }
}
