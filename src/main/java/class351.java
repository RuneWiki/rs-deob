import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class351 extends class231 {

    @OriginalMember(owner = "client!nu", name = "ad", descriptor = "I")
    public int field4666 = -1;

    @OriginalMember(owner = "client!nu", name = "wd", descriptor = "I")
    public int field4688 = -1;

    @OriginalMember(owner = "client!nu", name = "bd", descriptor = "Ljava/lang/String;")
    public static String field4667 = "";

    @OriginalMember(owner = "client!nu", name = "md", descriptor = "I")
    public static int field4678 = 0;

    @OriginalMember(owner = "client!nu", name = "rd", descriptor = "Z")
    public static boolean field4683 = false;

    @OriginalMember(owner = "client!nu", name = "Xc", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!nu", name = "Yc", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!nu", name = "Zc", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!nu", name = "cd", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!nu", name = "dd", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!nu", name = "ed", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!nu", name = "gd", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!nu", name = "hd", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!nu", name = "id", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!nu", name = "jd", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!nu", name = "kd", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!nu", name = "ld", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!nu", name = "nd", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!nu", name = "od", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!nu", name = "qd", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!nu", name = "sd", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!nu", name = "td", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!nu", name = "ud", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!nu", name = "vd", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!nu", name = "fd", descriptor = "Liv;")
    public class384 field4671;

    @OriginalMember(owner = "client!nu", name = "pd", descriptor = "[Lir;")
    public static class27[] field4681;

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "(B)V")
    public static void method2072(byte arg0) {
        field4681 = null;
        if (arg0 >= -31) {
            method2072((byte) -32);
        }
        field4667 = null;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZIIIII)V")
    public final void method2073(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field385 = super.field386 = (byte) arg1;
        ++field4670;
        if (class8.method44(arg3, arg5, 15090)) {
            ++super.field386;
        }
        if (super.field3048 != -1 && class423.field5620.method1707(super.field3048, 37).field2573 == 1) {
            super.field2989 = null;
            super.field3048 = -1;
        }
        if (arg4 != -6) {
            field4678 = -58;
        }
        if (~super.field3022 != 0) {
            class521 var7 = class24.field291.method2940(super.field3022, 17);
            if (var7.field7219 && var7.field7228 != -1 && ~class423.field5620.method1707(var7.field7228, -93).field2573 == -2) {
                super.field3022 = -1;
            }
        }
        if (~super.field3064 != 0) {
            class521 var8 = class24.field291.method2940(super.field3064, 17);
            if (var8.field7219 && var8.field7228 != -1 && ~class423.field5620.method1707(var8.field7228, -79).field2573 == -2) {
                super.field3064 = -1;
            }
        }
        if (!arg0) {
            int var9 = -super.field3088[0] + arg5;
            int var10 = arg3 - super.field3086[0];
            if (~var9 <= 7 && var9 <= 8 && ~var10 <= 7 && ~var10 >= -9) {
                if (~super.field3095 > -10) {
                    ++super.field3095;
                }
                for (int var11 = super.field3095; ~var11 < -1; --var11) {
                    super.field3088[var11] = super.field3088[var11 + -1];
                    super.field3086[var11] = super.field3086[var11 + -1];
                    super.field3093[var11] = super.field3093[var11 + -1];
                }
                super.field3088[0] = arg5;
                super.field3093[0] = 1;
                super.field3086[0] = arg3;
                return;
            }
        }
        super.field3088[0] = arg5;
        super.field3087 = 0;
        super.field3095 = 0;
        super.field3085 = 0;
        super.field3086[0] = arg3;
        super.field397 = (super.field3086[0] << 9) + (arg2 << 8);
        super.field398 = (super.field3088[0] << 9) - -(arg2 << 8);
        if (super.field3094 != null) {
            super.field3094.method2911();
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Liv;Z)V")
    public final void method2074(class384 arg0, boolean arg1) {
        this.field4671 = arg0;
        ++field4682;
        if (arg1) {
            if (super.field3094 != null) {
                super.field3094.method2911();
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "(B)V")
    public final void method175(byte arg0) {
        ++field4677;
        if (arg0 < 24) {
            this.method2079((class562) null, 105, -15);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(Lr;I)Lcu;")
    public final class475 method174(class562 arg0, int arg1) {
        if (arg1 != -14700) {
            method2072((byte) 99);
        }
        ++field4674;
        return null;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IZI)V")
    public final void method2075(int arg0, boolean arg1, int arg2) {
        ++field4673;
        int var4 = super.field3088[0];
        int var5 = super.field3086[0];
        if (arg0 == 0) {
            ++var5;
        }
        if (arg0 == 1) {
            ++var5;
            ++var4;
        }
        if (~arg0 == -3) {
            ++var4;
        }
        if (~arg0 == -4) {
            --var5;
            ++var4;
        }
        if (arg0 == 4) {
            --var5;
        }
        if (~arg0 == -6) {
            --var5;
            --var4;
        }
        if (~arg0 == -7) {
            --var4;
        }
        if (~arg0 == -8) {
            ++var5;
            --var4;
        }
        if (~super.field3048 != 0 && class423.field5620.method1707(super.field3048, 35).field2573 == 1) {
            super.field2989 = null;
            super.field3048 = -1;
        }
        if (super.field3022 != -1) {
            class521 var6 = class24.field291.method2940(super.field3022, 17);
            if (var6.field7219 && ~var6.field7228 != 0 && class423.field5620.method1707(var6.field7228, 24).field2573 == 1) {
                super.field3022 = -1;
            }
        }
        if (super.field3064 != -1) {
            class521 var7 = class24.field291.method2940(super.field3064, 17);
            if (var7.field7219 && ~var7.field7228 != 0 && class423.field5620.method1707(var7.field7228, 106).field2573 == 1) {
                super.field3064 = -1;
            }
        }
        if (~super.field3095 > -10) {
            ++super.field3095;
        }
        if (arg1) {
            field4679 = -70;
        }
        for (int var8 = super.field3095; ~var8 < -1; --var8) {
            super.field3088[var8] = super.field3088[var8 + -1];
            super.field3086[var8] = super.field3086[var8 + -1];
            super.field3093[var8] = super.field3093[var8 - 1];
        }
        super.field3088[0] = var4;
        super.field3086[0] = var5;
        super.field3093[0] = (byte) arg2;
    }

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "(Z)I")
    public final int method1433(boolean arg0) {
        ++field4663;
        if (arg0) {
            return -84;
        } else {
            if (this.field4671.field5121 != null) {
                class384 var2 = this.field4671.method2203(3, class564.field7696);
                if (var2 != null && ~var2.field5089 != 0) {
                    return var2.field5089;
                }
            }
            return ~this.field4671.field5089 == 0 ? super.method1433(false) : this.field4671.field5089;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)I")
    public final int method1429(int arg0) {
        ++field4676;
        if (arg0 >= -2) {
            return -108;
        } else {
            if (this.field4671.field5121 != null) {
                class384 var2 = this.field4671.method2203(3, class564.field7696);
                if (var2 != null && ~var2.field5123 != 0) {
                    return var2.field5123;
                }
            }
            return this.field4671.field5123;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZI)V")
    public static final void method2076(boolean arg0, int arg1) {
        class138.field1878 = arg1;
        ++field4686;
        class380 var2 = class83.field970;
        synchronized (class83.field970) {
            class83.field970.method2168((byte) -84);
        }
        if (!arg0) {
            class380 var3 = class162.field2320;
            synchronized (class162.field2320) {
                class162.field2320.method2168((byte) -126);
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lr;Z)V")
    public final void method177(class562 arg0, boolean arg1) {
        ++field4685;
        if (this.field4671 != null) {
            if (super.field3090 || this.method2079(arg0, 0, 69)) {
                class487 var3 = arg0.method1153();
                var3.method357(super.field3027.method3603(63));
                var3.method356(super.field398, super.field388 - 20, super.field397);
                this.method1441(super.field3091, arg1, super.field3090, var3, arg0);
                super.field3091[0] = super.field3091[1] = super.field3091[2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(BLr;)Lqw;")
    public final class329 method165(byte arg0, class562 arg1) {
        ++field4664;
        if (this.field4671 != null && this.method2079(arg1, 2048, -122)) {
            class487 var3 = arg1.method1153();
            int var4 = super.field3027.method3603(63);
            var3.method357(var4);
            class207 var5 = class153.field2168[super.field385][super.field398 >> class62.field762][super.field397 >> class62.field762];
            if (var5 != null && var5.field2765 != null) {
                int var6 = -var5.field2765.field3534 + super.field3011;
                super.field3011 = (int) ((float) super.field3011 - (float) var6 / 10.0F);
            } else {
                super.field3011 = (int) ((float) super.field3011 - (float) super.field3011 / 10.0F);
            }
            var3.method356(super.field398, super.field388 + -20 + -super.field3011, super.field397);
            class266 var7 = this.method1432(-1);
            class384 var8 = this.field4671.field5121 != null ? this.field4671.method2203(3, class564.field7696) : this.field4671;
            super.field3089 = false;
            if (class602.field8408.field4314 && var8.field5086 && var7.field3463) {
                class186 var9 = ~super.field3048 != 0 && ~super.field3068 == -1 ? class423.field5620.method1707(super.field3048, 47) : null;
                class186 var10 = ~super.field3067 == 0 || super.field3021 && var9 != null ? null : class423.field5620.method1707(super.field3067, 70);
                class470 var11 = class255.method1544(super.field3004, super.field3091[0], var10 != null ? var10 : var9, super.field3020, arg1, super.field2986, var4, (byte) 109, 65535 & this.field4671.field5076, this.field4671.field5070 & 255, this.field4671.field5105, this.field4671.field5122 & 65535, var10 != null ? super.field3008 : super.field2991, this.field4671.field5106 & 255);
                if (var11 != null) {
                    super.field3089 = true;
                    arg1.method1091(false);
                    if (class347.field4632) {
                        var11.method648(var3, (class667) null, class414.field5430, 0);
                    } else {
                        var11.method625(var3, (class667) null, 0);
                    }
                    arg1.method1091(true);
                }
            }
            var3.method357(var4);
            var3.method356(super.field398, -super.field3011 + super.field388 - 5, super.field397);
            class329 var12 = null;
            if (this.method2080((byte) 12)) {
                var12 = class541.method3035(27479, super.field3091.length);
            }
            this.method1441(super.field3091, true, false, var3, arg1);
            if (class347.field4632) {
                for (int var13 = 0; ~var13 > ~super.field3091.length; ++var13) {
                    if (super.field3091[var13] != null) {
                        super.field3091[var13].method648(var3, var12 != null ? var12.field4414[var13] : null, class414.field5430, 0);
                    }
                }
            } else {
                for (int var14 = 0; super.field3091.length > var14; ++var14) {
                    if (super.field3091[var14] != null) {
                        super.field3091[var14].method625(var3, var12 != null ? var12.field4414[var14] : null, 0);
                    }
                }
            }
            if (super.field3094 != null) {
                class144 var15 = super.field3094.method2915();
                if (class347.field4632) {
                    arg1.method1120(var15, class414.field5430);
                } else {
                    arg1.method1096(var15);
                }
            }
            for (int var16 = 0; super.field3091.length > var16; ++var16) {
                if (super.field3091[var16] != null) {
                    super.field3089 |= super.field3091[var16].method657();
                }
            }
            if (arg0 < 109) {
                this.method2080((byte) -58);
            }
            super.field3024 = class647.field8940;
            super.field3091[0] = super.field3091[1] = super.field3091[2] = null;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "o", descriptor = "(I)Z")
    public final boolean method2077(int arg0) {
        if (arg0 != 0) {
            field4679 = -21;
        }
        ++field4669;
        return this.field4671 != null;
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)I")
    public final int method1436(byte arg0) {
        ++field4668;
        int var2 = -113 % ((-2 - arg0) / 33);
        if (this.field4671.field5121 != null) {
            class384 var3 = this.field4671.method2203(3, class564.field7696);
            if (var3 != null && var3.field5072 != -1) {
                return var3.field5072;
            }
        }
        return this.field4671.field5072;
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(IZI)Ltda;")
    public static final class16 method2078(int arg0, boolean arg1, int arg2) {
        if (arg0 != 0) {
            method2078(-91, false, 16);
        }
        ++field4665;
        long var3 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg2);
        return (class16) class253.field3318.method3057(arg0 ^ 1, var3);
    }

    @OriginalMember(owner = "client!nu", name = "i", descriptor = "(I)Z")
    public final boolean method166(int arg0) {
        ++field4684;
        return arg0 != 0 ? false : false;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZLr;II)Z")
    public final boolean method167(boolean arg0, class562 arg1, int arg2, int arg3) {
        ++field4687;
        if (this.field4671 != null && this.method2079(arg1, 131072, 78)) {
            class487 var5 = arg1.method1153();
            int var6 = super.field3027.method3603(63);
            var5.method357(var6);
            var5.method356(super.field398, super.field388, super.field397);
            boolean var7 = arg0;
            for (int var8 = 0; ~super.field3091.length < ~var8; ++var8) {
                if (super.field3091[var8] != null) {
                    boolean var9 = ~this.field4671.field5066 != 0 ? this.field4671.field5066 == 1 : this.field4671.field5105 == 1;
                    boolean var10;
                    if (!class347.field4632) {
                        var10 = super.field3091[var8].method655(arg3, arg2, var5, var9);
                    } else {
                        var10 = super.field3091[var8].method603(arg3, arg2, var5, var9, class414.field5430);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            super.field3091[0] = super.field3091[1] = super.field3091[2] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lr;II)Z")
    private final boolean method2079(class562 arg0, int arg1, int arg2) {
        ++field4675;
        int var4 = arg1;
        class266 var5 = this.method1432(-1);
        class186 var6 = ~super.field3048 != 0 && super.field3068 == 0 ? class423.field5620.method1707(super.field3048, -101) : null;
        class186 var7 = super.field3067 == -1 || super.field3021 && var6 != null ? null : class423.field5620.method1707(super.field3067, -88);
        int var8 = var5.field3472;
        int var9 = var5.field3477;
        if (~var8 != -1 || var9 != 0 || var5.field3439 != 0 || ~var5.field3444 != -1) {
            arg1 |= 7;
        }
        boolean var10 = ~super.field2988 != -1 && ~class327.field4404 <= ~super.field3016 && super.field3075 > class327.field4404;
        if (var10) {
            arg1 |= 524288;
        }
        class470 var11 = super.field3091[0] = this.field4671.method2198(var6, super.field3058, super.field2991, class423.field5620, super.field3047, arg0, super.field3008, super.field3073, super.field3026, class159.field2282, class564.field7696, 69, arg1, var7, super.field3030);
        if (var11 == null) {
            return false;
        } else {
            super.field3044 = var11.method613();
            int var12 = -122 / ((arg2 - -15) / 59);
            super.field2997 = var11.method621();
            this.method1437(-120, var11);
            int var13 = super.field3027.method3603(63);
            if (var8 == 0 && var9 == 0) {
                this.method1428(16384, var13, 0, this.method1435((byte) 117) << 9, this.method1435((byte) 98) << 9, 0);
            } else {
                this.method1428(16384, var13, var5.field3486, var8, var9, var5.field3488);
                if (~super.field3020 != -1) {
                    super.field3091[0].method643(super.field3020);
                }
                if (super.field2986 != 0) {
                    super.field3091[0].method616(super.field2986);
                }
                if (super.field3004 != 0) {
                    super.field3091[0].method605(0, super.field3004, 0);
                }
            }
            if (var10) {
                var11.method651(super.field3055, super.field3037, super.field3007, super.field2988 & 255);
            }
            if (~super.field3022 != 0 && ~super.field3000 != 0) {
                class521 var14 = class24.field291.method2940(super.field3022, 17);
                boolean var15 = var14.field7214 == 3 && (var8 != 0 || var9 != 0);
                int var16 = var4;
                if (!var15) {
                    if (super.field2999 != 0) {
                        var16 = var4 | 5;
                    }
                    if (super.field3054 != 0) {
                        var16 |= 2;
                    }
                } else {
                    var16 = var4 | 7;
                }
                class470 var17 = super.field3091[1] = var14.method2958((byte) 45, super.field3000, super.field3040, class423.field5620, super.field3001, var16, arg0);
                if (var17 != null) {
                    if (~super.field3054 != -1) {
                        var17.method605(0, -super.field3054 << 2, 0);
                    }
                    if (~super.field2999 != -1) {
                        var17.method612(super.field2999 * 2048);
                    }
                    if (var15) {
                        if (~super.field3020 != -1) {
                            var17.method643(super.field3020);
                        }
                        if (super.field2986 != 0) {
                            var17.method616(super.field2986);
                        }
                        if (~super.field3004 != -1) {
                            var17.method605(0, super.field3004, 0);
                        }
                    }
                }
            } else {
                super.field3091[1] = null;
            }
            if (super.field3064 != -1 && ~super.field3063 != 0) {
                class521 var18 = class24.field291.method2940(super.field3064, 17);
                boolean var19 = var18.field7214 == 3 && (~var8 != -1 || var9 != 0);
                int var20 = var4;
                if (!var19) {
                    if (~super.field3038 != -1) {
                        var20 = var4 | 5;
                    }
                    if (~super.field2992 != -1) {
                        var20 |= 2;
                    }
                } else {
                    var20 = var4 | 7;
                }
                class470 var21 = super.field3091[2] = var18.method2956(111, super.field2996, var20, arg0, super.field3059, class423.field5620, super.field3063);
                if (var21 != null) {
                    if (~super.field2992 != -1) {
                        var21.method605(0, -super.field2992 << 2, 0);
                    }
                    if (~super.field3038 != -1) {
                        var21.method612(super.field3038 * 2048);
                    }
                    if (var19) {
                        if (~super.field3020 != -1) {
                            var21.method643(super.field3020);
                        }
                        if (super.field2986 != 0) {
                            var21.method616(super.field2986);
                        }
                        if (super.field3004 != 0) {
                            var21.method605(0, super.field3004, 0);
                        }
                    }
                }
            } else {
                super.field3091[2] = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILir;ZILr;IB)V")
    public final void method169(int arg0, class27 arg1, boolean arg2, int arg3, class562 arg4, int arg5, byte arg6) {
        ++field4680;
        if (arg6 > -117) {
            this.method167(true, (class562) null, 79, -127);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "(B)Z")
    private final boolean method2080(byte arg0) {
        ++field4672;
        if (arg0 != 12) {
            this.field4688 = 4;
        }
        return this.field4671.field5079;
    }
}
