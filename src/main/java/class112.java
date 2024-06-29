import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class112 extends class243 {

    @OriginalMember(owner = "client!pb", name = "Y", descriptor = "I")
    private int field2070 = 5;

    @OriginalMember(owner = "client!pb", name = "fb", descriptor = "[B")
    private byte[] field2077 = new byte[512];

    @OriginalMember(owner = "client!pb", name = "cb", descriptor = "I")
    private int field2074 = 2;

    @OriginalMember(owner = "client!pb", name = "bb", descriptor = "I")
    private int field2073 = 0;

    @OriginalMember(owner = "client!pb", name = "qb", descriptor = "I")
    private int field2088 = 2048;

    @OriginalMember(owner = "client!pb", name = "mb", descriptor = "I")
    private int field2084 = 5;

    @OriginalMember(owner = "client!pb", name = "nb", descriptor = "I")
    private int field2085 = 1;

    @OriginalMember(owner = "client!pb", name = "pb", descriptor = "[S")
    private short[] field2087 = new short[512];

    @OriginalMember(owner = "client!pb", name = "eb", descriptor = "Lub;")
    public static class227 field2076 = class257.method1749("overlay)3dat", 17263);

    @OriginalMember(owner = "client!pb", name = "jb", descriptor = "I")
    public static int field2081 = 0;

    @OriginalMember(owner = "client!pb", name = "rb", descriptor = "Lub;")
    private static class227 field2089 = class257.method1749("shake:", 17263);

    @OriginalMember(owner = "client!pb", name = "ib", descriptor = "Lub;")
    public static class227 field2080 = field2089;

    @OriginalMember(owner = "client!pb", name = "hb", descriptor = "Lub;")
    public static class227 field2079 = field2089;

    @OriginalMember(owner = "client!pb", name = "Z", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!pb", name = "ab", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!pb", name = "db", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!pb", name = "gb", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!pb", name = "kb", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!pb", name = "lb", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!pb", name = "ob", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(B)V")
    public static void method712(byte arg0) {
        field2089 = null;
        field2080 = null;
        int var1 = -92 / ((-27 - arg0) / 51);
        field2076 = null;
        field2079 = null;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V")
    public final void method170(boolean arg0) {
        ++field2071;
        this.field2077 = class87.method520(255, this.field2073);
        this.method713(125);
        if (arg0) {
            method715(80, -14, 114, -50);
        }
    }

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "(I)V")
    private final void method713(int arg0) {
        int var2 = 34 / ((41 - arg0) / 45);
        Random var3 = new Random((long) this.field2073);
        this.field2087 = new short[512];
        if (~this.field2088 < -1) {
            for (int var4 = 0; var4 < 512; ++var4) {
                this.field2087[var4] = (short) class210.method1342(5, var3, this.field2088);
            }
        }
        ++field2086;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class112() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        if (arg1) {
            method714((class4) null, false);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field2070 = arg0.method1471(255);
                                }
                            } else {
                                this.field2084 = arg0.method1471(255);
                            }
                        } else {
                            this.field2085 = arg0.method1471(255);
                        }
                    } else {
                        this.field2074 = arg0.method1471(255);
                    }
                } else {
                    this.field2088 = arg0.method1447(0);
                }
            } else {
                this.field2073 = arg0.method1471(255);
            }
        } else {
            this.field2084 = this.field2070 = arg0.method1471(255);
        }
        ++field2083;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lja;Z)V")
    public static final void method714(class4 arg0, boolean arg1) {
        arg0.field103 = arg1;
        if (arg0.field82 != -1) {
            class51 var2 = class25.method127(true, arg0.field82);
            if (var2 != null && var2.field910 != null) {
                ++arg0.field51;
                if (var2.field910.length > arg0.field72 && ~arg0.field51 < ~var2.field899[arg0.field72]) {
                    ++arg0.field72;
                    arg0.field51 = 1;
                    class67.method421(128, var2, arg0.field99, arg0.field50, arg0.field72, class216.field3639 == arg0);
                }
                if (arg0.field72 >= var2.field910.length) {
                    arg0.field72 = 0;
                    arg0.field51 = 0;
                    class67.method421(128, var2, arg0.field99, arg0.field50, arg0.field72, class216.field3639 == arg0);
                }
            } else {
                arg0.field82 = -1;
            }
        }
        ++field2078;
        if (~arg0.field69 != 0 && arg0.field97 <= class253.field4393) {
            if (arg0.field109 < 0) {
                arg0.field109 = 0;
            }
            int var3 = class179.method1149(arg0.field69, -86).field2501;
            if (~var3 != 0) {
                class51 var4 = class25.method127(true, var3);
                if (var4 != null && var4.field910 != null) {
                    ++arg0.field110;
                    if (~arg0.field109 > ~var4.field910.length && ~arg0.field110 < ~var4.field899[arg0.field109]) {
                        ++arg0.field109;
                        arg0.field110 = 1;
                        class67.method421(128, var4, arg0.field99, arg0.field50, arg0.field109, class216.field3639 == arg0);
                    }
                    if (~var4.field910.length >= ~arg0.field109) {
                        arg0.field69 = -1;
                    }
                } else {
                    arg0.field69 = -1;
                }
            } else {
                arg0.field69 = -1;
            }
        }
        if (arg0.field101 != -1 && arg0.field60 <= 1) {
            class51 var5 = class25.method127(true, arg0.field101);
            if (var5.field888 == 1 && arg0.field76 > 0 && ~arg0.field66 >= ~class253.field4393 && ~arg0.field65 > ~class253.field4393) {
                arg0.field60 = 1;
                return;
            }
        }
        if (arg0.field101 != -1 && arg0.field60 == 0) {
            class51 var6 = class25.method127(!arg1, arg0.field101);
            if (var6 != null && var6.field910 != null) {
                ++arg0.field95;
                if (~var6.field910.length < ~arg0.field52 && ~arg0.field95 < ~var6.field899[arg0.field52]) {
                    ++arg0.field52;
                    arg0.field95 = 1;
                    class67.method421(128, var6, arg0.field99, arg0.field50, arg0.field52, class216.field3639 == arg0);
                }
                if (~arg0.field52 <= ~var6.field910.length) {
                    arg0.field52 -= var6.field905;
                    ++arg0.field85;
                    if (arg0.field85 < var6.field909) {
                        if (arg0.field52 >= 0 && ~var6.field910.length < ~arg0.field52) {
                            class67.method421(128, var6, arg0.field99, arg0.field50, arg0.field52, class216.field3639 == arg0);
                        } else {
                            arg0.field101 = -1;
                        }
                    } else {
                        arg0.field101 = -1;
                    }
                }
                arg0.field103 = var6.field912;
            } else {
                arg0.field101 = -1;
            }
        }
        if (arg0.field60 > 0) {
            --arg0.field60;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(IIII)I")
    public static final int method715(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 84) {
            method712((byte) -14);
        }
        int var4 = arg2 & 3;
        ++field2082;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else {
            return ~var4 == -3 ? -arg0 + 7 : -arg3 + 7;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        ++field2072;
        int var3 = 121 / ((arg0 - -15) / 51);
        int[] var4 = super.field4215.method984(arg1, 0);
        if (super.field4215.field2707) {
            int var5 = 2048 - -(class148.field2582[arg1] * this.field2070);
            int var6 = var5 >> 12;
            int var7 = var6 + 1;
            for (int var8 = 0; ~var8 > ~class212.field3586; ++var8) {
                class5.field113 = Integer.MAX_VALUE;
                class253.field4430 = Integer.MAX_VALUE;
                class179.field3071 = Integer.MAX_VALUE;
                class151.field2636 = Integer.MAX_VALUE;
                int var9 = class212.field3585[var8] * this.field2084 + 2048;
                int var10 = var9 >> 12;
                int var11 = var10 - -1;
                for (int var12 = var6 - 1; var7 >= var12; ++var12) {
                    int var14 = this.field2077[255 & (this.field2070 > var12 ? var12 : -this.field2070 + var12)] & 255;
                    for (int var15 = var10 + -1; ~var15 >= ~var11; ++var15) {
                        int var16 = 2 * (this.field2077[var14 + (~var15 > ~this.field2084 ? var15 : -this.field2084 + var15) & 255] & 255);
                        int var28 = var16 + 1;
                        int var17 = var9 - (this.field2087[var16] + (var15 << 12));
                        int var18 = -this.field2087[var28] - (var12 << 12) + var5;
                        int var19 = this.field2085;
                        int var20;
                        if (var19 != 1) {
                            if (var19 != 3) {
                                if (var19 != 4) {
                                    if (~var19 != -6) {
                                        if (~var19 == -3) {
                                            var20 = (var18 >= 0 ? var18 : -var18) + (~var17 > -1 ? -var17 : var17);
                                        } else {
                                            var20 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 * var17 + var18 * var18) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var21 = var18 * var18;
                                        int var22 = var17 * var17;
                                        var20 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var21 + var22) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)));
                                    int var24 = (int) (4096.0D * Math.sqrt((double) ((float) (~var18 > -1 ? -var18 : var18) / 4096.0F)));
                                    int var25 = var23 - -var24;
                                    var20 = var25 * var25 >> 12;
                                }
                            } else {
                                int var26 = ~var18 <= -1 ? var18 : -var18;
                                int var27 = ~var17 <= -1 ? var17 : -var17;
                                var20 = ~var26 <= ~var27 ? var26 : var27;
                            }
                        } else {
                            var20 = var17 * var17 + var18 * var18 >> 12;
                        }
                        if (~var20 <= ~class151.field2636) {
                            if (~var20 <= ~class179.field3071) {
                                if (~var20 <= ~class253.field4430) {
                                    if (~var20 > ~class5.field113) {
                                        class5.field113 = var20;
                                    }
                                } else {
                                    class5.field113 = class253.field4430;
                                    class253.field4430 = var20;
                                }
                            } else {
                                class5.field113 = class253.field4430;
                                class253.field4430 = class179.field3071;
                                class179.field3071 = var20;
                            }
                        } else {
                            class5.field113 = class253.field4430;
                            class253.field4430 = class179.field3071;
                            class179.field3071 = class151.field2636;
                            class151.field2636 = var20;
                        }
                    }
                }
                int var13 = this.field2074;
                if (~var13 != -1) {
                    if (var13 != 1) {
                        if (var13 != 3) {
                            if (~var13 != -5) {
                                if (~var13 == -3) {
                                    var4[var8] = -class151.field2636 + class179.field3071;
                                }
                            } else {
                                var4[var8] = class5.field113;
                            }
                        } else {
                            var4[var8] = class253.field4430;
                        }
                    } else {
                        var4[var8] = class179.field3071;
                    }
                } else {
                    var4[var8] = class151.field2636;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([IIIIII)V")
    public static final void method716(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class108 var6 = class261.field4539[arg3][arg4][arg5];
        if (var6 != null) {
            class237 var7 = var6.field2013;
            if (var7 == null) {
                class1 var10 = var6.field2035;
                if (var10 != null) {
                    int var11 = var10.field18;
                    int var12 = var10.field3;
                    int var13 = var10.field1;
                    int var14 = var10.field11;
                    int[] var15 = class148.field2589[var11];
                    int[] var16 = class60.field1118[var12];
                    int var17 = 0;
                    if (var13 != 0) {
                        for (int var18 = 0; var18 < 4; ++var18) {
                            arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg1 += arg2;
                        }
                    } else {
                        for (int var19 = 0; var19 < 4; ++var19) {
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 2] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 3] = var14;
                            }
                            arg1 += arg2;
                        }
                    }
                }
            } else {
                int var8 = var7.field4114;
                if (var8 != 0) {
                    for (int var9 = 0; var9 < 4; ++var9) {
                        arg0[arg1] = var8;
                        arg0[arg1 + 1] = var8;
                        arg0[arg1 + 2] = var8;
                        arg0[arg1 + 3] = var8;
                        arg1 += arg2;
                    }
                }
            }
        }
    }
}
