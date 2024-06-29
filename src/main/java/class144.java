import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class144 extends class300 {

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    private int field2141 = 1;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    private int field2140 = 2048;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "[B")
    private byte[] field2138 = new byte[512];

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    private int field2148 = 0;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "[S")
    private short[] field2153 = new short[512];

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    private int field2142 = 5;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
    private int field2151 = 2;

    @OriginalMember(owner = "client!ge", name = "bb", descriptor = "I")
    private int field2157 = 5;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "F")
    public static float field2145 = 0.0F;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "Ljava/lang/String;")
    public static String field2137 = "flash2:";

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public static int field2144 = 2301979;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "J")
    public static long field2139 = 0L;

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "[I")
    public static int[] field2155 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    public static int field2147 = 0;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "Lac;")
    public static class153 field2149 = new class153(16);

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!ge", name = "ab", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "Lvl;")
    public static class73 field2154;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
    public static void method943(boolean arg0) {
        field2155 = null;
        if (arg0) {
            method946((String) null, 115);
        }
        field2154 = null;
        field2137 = null;
        field2149 = null;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
    public final void method144(int arg0) {
        this.field2138 = class293.method1986(this.field2148, 70);
        this.method945(-126);
        if (arg0 >= 126) {
            ++field2143;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZLu;)V")
    public static final void method944(boolean arg0, class243 arg1) {
        ++field2150;
        if (arg0) {
            arg1.field3956 = false;
            if (~arg1.field3946 != 0) {
                class57 var2 = class174.method1241(120, arg1.field3946);
                if (var2 != null && var2.field850 != null) {
                    ++arg1.field3969;
                    if (arg1.field3959 < var2.field850.length && ~var2.field828[arg1.field3959] > ~arg1.field3969) {
                        ++arg1.field3889;
                        ++arg1.field3959;
                        arg1.field3969 = 1;
                        class173.method1240(arg1.field3915, arg1.field3920, -9160, class214.field3347 == arg1, var2, arg1.field3959);
                    }
                    if (~var2.field850.length >= ~arg1.field3959) {
                        arg1.field3969 = 0;
                        arg1.field3959 = 0;
                        class173.method1240(arg1.field3915, arg1.field3920, -9160, class214.field3347 == arg1, var2, arg1.field3959);
                    }
                    arg1.field3889 = arg1.field3959 + 1;
                    if (~var2.field850.length >= ~arg1.field3889) {
                        arg1.field3889 = 0;
                    }
                } else {
                    arg1.field3946 = -1;
                }
            }
            if (~arg1.field3904 != 0 && class311.field4996 >= arg1.field3935) {
                class214 var3 = class92.method629(arg1.field3904, 12288);
                int var4 = var3.field3338;
                if (~var4 == 0) {
                    arg1.field3904 = -1;
                } else {
                    label295: {
                        class57 var5 = class174.method1241(52, var4);
                        if (var3.field3346) {
                            if (var5.field832 == 3) {
                                if (arg1.field3976 > 0 && arg1.field3888 <= class311.field4996 && class311.field4996 > arg1.field3975) {
                                    arg1.field3904 = -1;
                                    break label295;
                                }
                            } else if (~var5.field832 == -2 && arg1.field3976 > 0 && ~arg1.field3888 >= ~class311.field4996 && ~arg1.field3975 > ~class311.field4996) {
                                arg1.field3935 = class311.field4996 + 1;
                                break label295;
                            }
                        }
                        if (var5 != null && var5.field850 != null) {
                            if (~arg1.field3930 > -1) {
                                arg1.field3930 = 0;
                                class173.method1240(arg1.field3915, arg1.field3920, -9160, class214.field3347 == arg1, var5, 0);
                            }
                            ++arg1.field3909;
                            if (arg1.field3930 < var5.field850.length && ~arg1.field3909 < ~var5.field828[arg1.field3930]) {
                                ++arg1.field3930;
                                arg1.field3909 = 1;
                                class173.method1240(arg1.field3915, arg1.field3920, -9160, class214.field3347 == arg1, var5, arg1.field3930);
                            }
                            if (~arg1.field3930 <= ~var5.field850.length) {
                                if (!var3.field3346) {
                                    arg1.field3904 = -1;
                                } else {
                                    ++arg1.field3953;
                                    arg1.field3930 -= var5.field830;
                                    if (~arg1.field3953 <= ~var5.field843) {
                                        arg1.field3904 = -1;
                                    } else if (arg1.field3930 >= 0 && ~var5.field850.length < ~arg1.field3930) {
                                        class173.method1240(arg1.field3915, arg1.field3920, -9160, class214.field3347 == arg1, var5, arg1.field3930);
                                    } else {
                                        arg1.field3904 = -1;
                                    }
                                }
                            }
                            arg1.field3893 = arg1.field3930 + 1;
                            if (arg1.field3893 >= var5.field850.length) {
                                if (!var3.field3346) {
                                    arg1.field3893 = -1;
                                } else {
                                    arg1.field3893 -= var5.field830;
                                    if (var5.field843 > arg1.field3953 - -1) {
                                        if (arg1.field3893 < 0 || var5.field850.length <= arg1.field3893) {
                                            arg1.field3893 = -1;
                                        }
                                    } else {
                                        arg1.field3893 = -1;
                                    }
                                }
                            }
                        } else {
                            arg1.field3904 = -1;
                        }
                    }
                }
            }
            if (arg1.field3987 != -1 && ~arg1.field3977 >= -2) {
                class57 var6 = class174.method1241(-127, arg1.field3987);
                if (var6.field832 == 3) {
                    if (~arg1.field3976 < -1 && arg1.field3888 <= class311.field4996 && ~arg1.field3975 > ~class311.field4996) {
                        arg1.field3987 = -1;
                    }
                } else if (var6.field832 == 1 && arg1.field3976 > 0 && arg1.field3888 <= class311.field4996 && ~arg1.field3975 > ~class311.field4996) {
                    arg1.field3977 = 2;
                }
            }
            if (arg1.field3987 != -1 && arg1.field3977 == 0) {
                class57 var7 = class174.method1241(80, arg1.field3987);
                if (var7 != null && var7.field850 != null) {
                    ++arg1.field3932;
                    if (var7.field850.length > arg1.field3980 && arg1.field3932 > var7.field828[arg1.field3980]) {
                        arg1.field3932 = 1;
                        ++arg1.field3980;
                        class173.method1240(arg1.field3915, arg1.field3920, -9160, class214.field3347 == arg1, var7, arg1.field3980);
                    }
                    if (var7.field850.length <= arg1.field3980) {
                        arg1.field3980 -= var7.field830;
                        ++arg1.field3899;
                        if (arg1.field3899 >= var7.field843) {
                            arg1.field3987 = -1;
                        } else if (~arg1.field3980 <= -1 && arg1.field3980 < var7.field850.length) {
                            class173.method1240(arg1.field3915, arg1.field3920, -9160, class214.field3347 == arg1, var7, arg1.field3980);
                        } else {
                            arg1.field3987 = -1;
                        }
                    }
                    arg1.field3973 = arg1.field3980 + 1;
                    if (~arg1.field3973 <= ~var7.field850.length) {
                        arg1.field3973 -= var7.field830;
                        if (~(arg1.field3899 + 1) > ~var7.field843) {
                            if (arg1.field3973 < 0 || ~var7.field850.length >= ~arg1.field3973) {
                                arg1.field3973 = -1;
                            }
                        } else {
                            arg1.field3973 = -1;
                        }
                    }
                    arg1.field3956 = var7.field841;
                } else {
                    arg1.field3987 = -1;
                }
            }
            if (~arg1.field3977 < -1) {
                --arg1.field3977;
            }
            for (int var8 = 0; ~var8 > ~arg1.field3951.length; ++var8) {
                class282 var9 = arg1.field3951[var8];
                if (var9 != null) {
                    if (~var9.field4585 < -1) {
                        --var9.field4585;
                    } else {
                        class57 var10 = class174.method1241(-124, var9.field4586);
                        if (var10 != null && var10.field850 != null) {
                            ++var9.field4588;
                            if (~var9.field4589 > ~var10.field850.length && ~var9.field4588 < ~var10.field828[var9.field4589]) {
                                ++var9.field4589;
                                var9.field4588 = 1;
                                class173.method1240(arg1.field3915, arg1.field3920, -9160, class214.field3347 == arg1, var10, var9.field4589);
                            }
                            if (~var9.field4589 <= ~var10.field850.length) {
                                var9.field4589 -= var10.field830;
                                ++var9.field4594;
                                if (var10.field843 > var9.field4594) {
                                    if (var9.field4589 >= 0 && ~var9.field4589 > ~var10.field850.length) {
                                        class173.method1240(arg1.field3915, arg1.field3920, -9160, class214.field3347 == arg1, var10, var9.field4589);
                                    } else {
                                        arg1.field3951[var8] = null;
                                    }
                                } else {
                                    arg1.field3951[var8] = null;
                                }
                            }
                            var9.field4584 = var9.field4589 + 1;
                            if (var9.field4584 >= var10.field850.length) {
                                var9.field4584 -= var10.field830;
                                if (var10.field843 > var9.field4594 + 1) {
                                    if (var9.field4584 < 0 || var9.field4584 >= var10.field850.length) {
                                        var9.field4584 = -1;
                                    }
                                } else {
                                    var9.field4584 = -1;
                                }
                            }
                        } else {
                            arg1.field3951[var8] = null;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field2157 = arg0.method1218(-80);
                                }
                            } else {
                                this.field2142 = arg0.method1218(100);
                            }
                        } else {
                            this.field2141 = arg0.method1218(127);
                        }
                    } else {
                        this.field2151 = arg0.method1218(-122);
                    }
                } else {
                    this.field2140 = arg0.method1186((byte) -119);
                }
            } else {
                this.field2148 = arg0.method1218(-36);
            }
        } else {
            this.field2142 = this.field2157 = arg0.method1218(-78);
        }
        ++field2152;
        if (arg1 > -43) {
            this.field2157 = -46;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        ++field2146;
        if (arg1 != -957953300) {
            method946((String) null, -48);
        }
        int[] var3 = super.field4797.method217(arg0, true);
        if (super.field4797.field470) {
            int var4 = class235.field3797[arg0] * this.field2157 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; ~class180.field2826 < ~var7; ++var7) {
                class42.field517 = Integer.MAX_VALUE;
                class20.field271 = Integer.MAX_VALUE;
                class13.field184 = Integer.MAX_VALUE;
                class19.field253 = Integer.MAX_VALUE;
                int var8 = class5.field73[var7] * this.field2142 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                    int var13 = this.field2138[(var11 < this.field2157 ? var11 : -this.field2157 + var11) & 255] & 255;
                    for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                        int var15 = 2 * (this.field2138[255 & var13 - -(~this.field2142 < ~var14 ? var14 : -this.field2142 + var14)] & 255);
                        int var27 = var15 + 1;
                        int var16 = -this.field2153[var15] + -(var14 << 12) + var8;
                        int var17 = -(var11 << 12) - this.field2153[var27] + var4;
                        int var18 = this.field2141;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (var17 < 0 ? -var17 : var17) + (~var16 <= -1 ? var16 : -var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 <= -1 ? var16 : -var16;
                                int var26 = ~var17 <= -1 ? var17 : -var17;
                                var19 = ~var25 >= ~var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~var19 <= ~class19.field253) {
                            if (~class13.field184 >= ~var19) {
                                if (var19 >= class20.field271) {
                                    if (var19 < class42.field517) {
                                        class42.field517 = var19;
                                    }
                                } else {
                                    class42.field517 = class20.field271;
                                    class20.field271 = var19;
                                }
                            } else {
                                class42.field517 = class20.field271;
                                class20.field271 = class13.field184;
                                class13.field184 = var19;
                            }
                        } else {
                            class42.field517 = class20.field271;
                            class20.field271 = class13.field184;
                            class13.field184 = class19.field253;
                            class19.field253 = var19;
                        }
                    }
                }
                int var12 = this.field2151;
                if (var12 != 0) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = -class19.field253 + class13.field184;
                                }
                            } else {
                                var3[var7] = class42.field517;
                            }
                        } else {
                            var3[var7] = class20.field271;
                        }
                    } else {
                        var3[var7] = class13.field184;
                    }
                } else {
                    var3[var7] = class19.field253;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)V")
    private final void method945(int arg0) {
        Random var2 = new Random((long) this.field2148);
        this.field2153 = new short[512];
        if (arg0 <= -106) {
            if (this.field2140 > 0) {
                for (int var3 = 0; ~var3 > -513; ++var3) {
                    this.field2153[var3] = (short) class19.method108(var2, this.field2140, 26329);
                }
            }
            ++field2136;
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
    public class144() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method946(String arg0, int arg1) {
        if (arg1 != -1) {
            method943(false);
        }
        ++field2156;
        return class215.method1505(10, arg1 ^ -92, true, arg0);
    }
}
