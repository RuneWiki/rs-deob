import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class113 extends class213 {

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "Lob;")
    public class141 field2164;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "[I")
    public static int[] field2163 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "Lob;")
    public static class141 field2166 = class175.method1195(40, " )2>");

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "[Lah;")
    public static class9[] field2165 = new class9[5000];

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "[I")
    public static int[] field2170 = new int[100];

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "Lob;")
    private static class141 field2168 = class175.method1195(40, "Please enter your username)3");

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "Lob;")
    public static class141 field2167 = field2168;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "Lob;")
    public static class141 field2173 = class175.method1195(40, "event_opbase");

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public static int field2169 = 0;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static void method731(byte arg0) {
        field2165 = null;
        field2163 = null;
        if (arg0 >= -58) {
            field2166 = null;
        }
        field2166 = null;
        field2170 = null;
        field2168 = null;
        field2167 = null;
        field2173 = null;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(III)J")
    public static final long method732(int arg0, int arg1, int arg2) {
        class153 var3 = class131.field2506[arg0][arg1][arg2];
        return var3 == null || var3.field2923 == null ? 0L : var3.field2923.field1133;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)I")
    public static final int method733(int arg0, int arg1) {
        field2172++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 != 16) {
            method733(24, -52);
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(IIIIII)V")
    public static final void method734(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class163.field3158 * 128) {
            arg0 = class163.field3158 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class220.field4172 * 128) {
            arg2 = class220.field4172 * 128 - 1;
        }
        class209.field3942++;
        class104.field2005 = class44.field854[arg3];
        class119.field2311 = class44.field843[arg3];
        class215.field4095 = class44.field854[arg4];
        class151.field2903 = class44.field843[arg4];
        class34.field694 = class1.field4[(arg3 - 128) / 32][arg4 / 64];
        class18.field316 = arg0;
        class162.field3145 = arg1;
        class35.field710 = arg2;
        class213.field4066 = arg0 / 128;
        class77.field1567 = arg2 / 128;
        class53.field1009 = arg5;
        class200.field3780 = class213.field4066 - class12.field230;
        if (class200.field3780 < 0) {
            class200.field3780 = 0;
        }
        class220.field4173 = class77.field1567 - class12.field230;
        if (class220.field4173 < 0) {
            class220.field4173 = 0;
        }
        class67.field1303 = class213.field4066 + class12.field230;
        if (class67.field1303 > class163.field3158) {
            class67.field1303 = class163.field3158;
        }
        class144.field2790 = class77.field1567 + class12.field230;
        if (class144.field2790 > class220.field4172) {
            class144.field2790 = class220.field4172;
        }
        class159.method1111();
        class81.field1618 = 0;
        for (int var6 = class169.field3257; var6 < class108.field2090; var6++) {
            class153[][] var31 = class131.field2506[var6];
            for (int var32 = class200.field3780; var32 < class67.field1303; var32++) {
                for (int var33 = class220.field4173; var33 < class144.field2790; var33++) {
                    class153 var34 = var31[var32][var33];
                    if (var34 != null) {
                        if (var34.field2937 <= arg5 && (class34.field694[var32 + class12.field230 - class213.field4066][var33 + class12.field230 - class77.field1567] || class110.field2119[var6][var32][var33] - arg1 >= 2000)) {
                            var34.field2922 = true;
                            var34.field2941 = true;
                            if (var34.field2933 > 0) {
                                var34.field2921 = true;
                            } else {
                                var34.field2921 = false;
                            }
                            class81.field1618++;
                        } else {
                            var34.field2922 = false;
                            var34.field2941 = false;
                            var34.field2928 = 0;
                        }
                    }
                }
            }
        }
        for (int var7 = class169.field3257; var7 < class108.field2090; var7++) {
            class153[][] var20 = class131.field2506[var7];
            for (int var21 = -class12.field230; var21 <= 0; var21++) {
                int var22 = class213.field4066 + var21;
                int var23 = class213.field4066 - var21;
                if (var22 >= class200.field3780 || var23 < class67.field1303) {
                    for (int var24 = -class12.field230; var24 <= 0; var24++) {
                        int var25 = class77.field1567 + var24;
                        int var26 = class77.field1567 - var24;
                        if (var22 >= class200.field3780) {
                            if (var25 >= class220.field4173) {
                                class153 var27 = var20[var22][var25];
                                if (var27 != null && var27.field2922) {
                                    class133.method844(var27, true);
                                }
                            }
                            if (var26 < class144.field2790) {
                                class153 var28 = var20[var22][var26];
                                if (var28 != null && var28.field2922) {
                                    class133.method844(var28, true);
                                }
                            }
                        }
                        if (var23 < class67.field1303) {
                            if (var25 >= class220.field4173) {
                                class153 var29 = var20[var23][var25];
                                if (var29 != null && var29.field2922) {
                                    class133.method844(var29, true);
                                }
                            }
                            if (var26 < class144.field2790) {
                                class153 var30 = var20[var23][var26];
                                if (var30 != null && var30.field2922) {
                                    class133.method844(var30, true);
                                }
                            }
                        }
                        if (class81.field1618 == 0) {
                            class27.field515 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var8 = class169.field3257; var8 < class108.field2090; var8++) {
            class153[][] var9 = class131.field2506[var8];
            for (int var10 = -class12.field230; var10 <= 0; var10++) {
                int var11 = class213.field4066 + var10;
                int var12 = class213.field4066 - var10;
                if (var11 >= class200.field3780 || var12 < class67.field1303) {
                    for (int var13 = -class12.field230; var13 <= 0; var13++) {
                        int var14 = class77.field1567 + var13;
                        int var15 = class77.field1567 - var13;
                        if (var11 >= class200.field3780) {
                            if (var14 >= class220.field4173) {
                                class153 var16 = var9[var11][var14];
                                if (var16 != null && var16.field2922) {
                                    class133.method844(var16, false);
                                }
                            }
                            if (var15 < class144.field2790) {
                                class153 var17 = var9[var11][var15];
                                if (var17 != null && var17.field2922) {
                                    class133.method844(var17, false);
                                }
                            }
                        }
                        if (var12 < class67.field1303) {
                            if (var14 >= class220.field4173) {
                                class153 var18 = var9[var12][var14];
                                if (var18 != null && var18.field2922) {
                                    class133.method844(var18, false);
                                }
                            }
                            if (var15 < class144.field2790) {
                                class153 var19 = var9[var12][var15];
                                if (var19 != null && var19.field2922) {
                                    class133.method844(var19, false);
                                }
                            }
                        }
                        if (class81.field1618 == 0) {
                            class27.field515 = false;
                            return;
                        }
                    }
                }
            }
        }
        class27.field515 = false;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class113() {
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lob;)V")
    public class113(class141 arg0) {
        this.field2164 = arg0;
    }
}
