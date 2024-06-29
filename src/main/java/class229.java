import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class229 extends class167 {

    @OriginalMember(owner = "client!uj", name = "Y", descriptor = "I")
    private int field4123 = 4096;

    @OriginalMember(owner = "client!uj", name = "cb", descriptor = "I")
    private int field4127 = 409;

    @OriginalMember(owner = "client!uj", name = "bb", descriptor = "[I")
    private int[] field4126 = new int[3];

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "I")
    private int field4119 = 4096;

    @OriginalMember(owner = "client!uj", name = "gb", descriptor = "I")
    private int field4131 = 4096;

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "[Lkh;")
    public static class117[] field4118 = new class117[100];

    @OriginalMember(owner = "client!uj", name = "W", descriptor = "I")
    public static int field4121 = 0;

    @OriginalMember(owner = "client!uj", name = "eb", descriptor = "[B")
    public static byte[] field4129 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!uj", name = "ab", descriptor = "Ldb;")
    public static class36 field4125 = new class36();

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!uj", name = "Z", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!uj", name = "fb", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!uj", name = "X", descriptor = "Lkb;")
    public static class111 field4122;

    @OriginalMember(owner = "client!uj", name = "db", descriptor = "Lcb;")
    public static class25 field4128;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(B)V")
    public static void method1481(byte arg0) {
        field4122 = null;
        field4129 = null;
        field4128 = null;
        if (arg0 == -126) {
            field4118 = null;
            field4125 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            int var5 = arg0.method1023(-1002744);
                            this.field4126[1] = class209.method1370(65280, var5) >> 4;
                            this.field4126[2] = class209.method1370(255, var5) >> 12;
                            this.field4126[0] = class209.method1370(16711680, var5) << 4;
                        }
                    } else {
                        this.field4119 = arg0.method1049((byte) 108);
                    }
                } else {
                    this.field4131 = arg0.method1049((byte) 88);
                }
            } else {
                this.field4123 = arg0.method1049((byte) 99);
            }
        } else {
            this.field4127 = arg0.method1049((byte) 106);
        }
        if (arg1) {
            this.field4131 = -83;
        }
        ++field4120;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZILef;)V")
    public static final void method1482(boolean arg0, int arg1, class51 arg2) {
        ++field4124;
        Object[] var3 = arg2.field1048;
        int var4 = (Integer) var3[0];
        class223 var5 = class148.method1063(var4, (byte) 50);
        if (var5 != null) {
            class49.field1033 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = -1;
            int[] var9 = var5.field4016;
            int[] var10 = var5.field4033;
            if (!arg0) {
                byte var11 = -1;
                try {
                    class52.field1076 = new class117[var5.field4027];
                    class170.field3052 = new int[var5.field4026];
                    int var12 = 0;
                    int var13 = 0;
                    for (int var14 = 1; var3.length > var14; ++var14) {
                        if (!(var3[var14] instanceof Integer)) {
                            if (var3[var14] instanceof class117) {
                                class117 var15 = (class117) var3[var14];
                                if (var15.method810((byte) -50, class1.field3)) {
                                    var15 = arg2.field1044;
                                }
                                class52.field1076[var12++] = var15;
                            }
                        } else {
                            int var16 = (Integer) var3[var14];
                            if (~var16 == 2147483646) {
                                var16 = arg2.field1051;
                            }
                            if (var16 == -2147483646) {
                                var16 = arg2.field1055;
                            }
                            if (~var16 == 2147483644) {
                                var16 = arg2.field1046 == null ? -1 : arg2.field1046.field218;
                            }
                            if (var16 == -2147483644) {
                                var16 = arg2.field1052;
                            }
                            if (var16 == -2147483643) {
                                var16 = arg2.field1046 == null ? -1 : arg2.field1046.field239;
                            }
                            if (var16 == -2147483642) {
                                var16 = arg2.field1057 != null ? arg2.field1057.field218 : -1;
                            }
                            if (var16 == -2147483641) {
                                var16 = arg2.field1057 == null ? -1 : arg2.field1057.field239;
                            }
                            if (var16 == -2147483640) {
                                var16 = arg2.field1054;
                            }
                            if (~var16 == 2147483638) {
                                var16 = arg2.field1050;
                            }
                            class170.field3052[var13++] = var16;
                        }
                    }
                    int var17 = 0;
                    label2580: while (true) {
                        ++var17;
                        if (var17 > arg1) {
                            throw new RuntimeException("slow");
                        }
                        ++var8;
                        int var383 = var10[var8];
                        if (~var383 > -101) {
                            if (~var383 == -1) {
                                class148.field2704[var6++] = var9[var8];
                                continue;
                            }
                            if (var383 == 1) {
                                int var18 = var9[var8];
                                class148.field2704[var6++] = class141.field2561[var18];
                                continue;
                            }
                            if (~var383 == -3) {
                                int var19 = var9[var8];
                                --var6;
                                class141.field2561[var19] = class148.field2704[var6];
                                continue;
                            }
                            if (~var383 == -4) {
                                class141.field2560[var7++] = var5.field4030[var8];
                                continue;
                            }
                            if (~var383 == -7) {
                                var8 += var9[var8];
                                continue;
                            }
                            if (~var383 == -8) {
                                var6 -= 2;
                                if (class148.field2704[var6 + 1] != class148.field2704[var6]) {
                                    var8 += var9[var8];
                                }
                                continue;
                            }
                            if (var383 == 8) {
                                var6 -= 2;
                                if (~class148.field2704[var6 + 1] == ~class148.field2704[var6]) {
                                    var8 += var9[var8];
                                }
                                continue;
                            }
                            if (~var383 == -10) {
                                var6 -= 2;
                                if (class148.field2704[var6 + 1] > class148.field2704[var6]) {
                                    var8 += var9[var8];
                                }
                                continue;
                            }
                            if (~var383 == -11) {
                                var6 -= 2;
                                if (class148.field2704[var6] > class148.field2704[var6 + 1]) {
                                    var8 += var9[var8];
                                }
                                continue;
                            }
                            if (~var383 == -22) {
                                if (~class49.field1033 == -1) {
                                    return;
                                }
                                class180 var20 = class193.field3450[--class49.field1033];
                                class170.field3052 = var20.field3261;
                                class52.field1076 = var20.field3265;
                                var8 = var20.field3262;
                                var5 = var20.field3264;
                                var9 = var5.field4016;
                                var10 = var5.field4033;
                                continue;
                            }
                            if (var383 == 25) {
                                int var21 = var9[var8];
                                class148.field2704[var6++] = class8.method57(var21, -97);
                                continue;
                            }
                            if (~var383 == -28) {
                                int var22 = var9[var8];
                                --var6;
                                class21.method183(class148.field2704[var6], var22, (byte) -111);
                                continue;
                            }
                            if (var383 == 31) {
                                var6 -= 2;
                                if (~class148.field2704[var6 + 1] <= ~class148.field2704[var6]) {
                                    var8 += var9[var8];
                                }
                                continue;
                            }
                            if (~var383 == -33) {
                                var6 -= 2;
                                if (~class148.field2704[var6 + 1] >= ~class148.field2704[var6]) {
                                    var8 += var9[var8];
                                }
                                continue;
                            }
                            if (var383 == 33) {
                                class148.field2704[var6++] = class170.field3052[var9[var8]];
                                continue;
                            }
                            int var10001;
                            if (~var383 == -35) {
                                var10001 = var9[var8];
                                --var6;
                                class170.field3052[var10001] = class148.field2704[var6];
                                continue;
                            }
                            if (var383 == 35) {
                                class141.field2560[var7++] = class52.field1076[var9[var8]];
                                continue;
                            }
                            if (~var383 == -37) {
                                var10001 = var9[var8];
                                --var7;
                                class52.field1076[var10001] = class141.field2560[var7];
                                continue;
                            }
                            if (~var383 == -38) {
                                int var23 = var9[var8];
                                var7 -= var23;
                                class117 var24 = class90.method630(var23, var7, -102, class141.field2560);
                                class141.field2560[var7++] = var24;
                                continue;
                            }
                            if (~var383 == -39) {
                                --var6;
                                continue;
                            }
                            if (var383 == 39) {
                                --var7;
                                continue;
                            }
                            if (var383 == 40) {
                                int var25 = var9[var8];
                                class223 var26 = class148.method1063(var25, (byte) 50);
                                int[] var27 = new int[var26.field4026];
                                class117[] var28 = new class117[var26.field4027];
                                for (int var29 = 0; var26.field4034 > var29; ++var29) {
                                    var27[var29] = class148.field2704[var6 - var26.field4034 + var29];
                                }
                                for (int var30 = 0; var26.field4032 > var30; ++var30) {
                                    var28[var30] = class141.field2560[-var26.field4032 + var7 + var30];
                                }
                                var6 -= var26.field4034;
                                var7 -= var26.field4032;
                                class180 var31 = new class180();
                                var31.field3262 = var8;
                                var31.field3261 = class170.field3052;
                                var31.field3265 = class52.field1076;
                                var31.field3264 = var5;
                                if (class193.field3450.length <= class49.field1033) {
                                    throw new RuntimeException();
                                }
                                class193.field3450[class49.field1033++] = var31;
                                class170.field3052 = var27;
                                class52.field1076 = var28;
                                var5 = var26;
                                var9 = var26.field4016;
                                var8 = -1;
                                var10 = var26.field4033;
                                continue;
                            }
                            if (var383 == 42) {
                                class148.field2704[var6++] = class232.field4183[var9[var8]];
                                continue;
                            }
                            if (~var383 == -44) {
                                var10001 = var9[var8];
                                --var6;
                                class232.field4183[var10001] = class148.field2704[var6];
                                continue;
                            }
                            if (~var383 == -45) {
                                int var32 = var9[var8] >> 16;
                                int var33 = 65535 & var9[var8];
                                --var6;
                                int var34 = class148.field2704[var6];
                                if (~var34 <= -1 && ~var34 >= -5001) {
                                    byte var35 = -1;
                                    class40.field917[var32] = var34;
                                    if (var33 == 105) {
                                        var35 = 0;
                                    }
                                    int var36 = 0;
                                    while (true) {
                                        if (var36 >= var34) {
                                            continue label2580;
                                        }
                                        class211.field3834[var32][var36] = var35;
                                        ++var36;
                                    }
                                }
                                throw new RuntimeException();
                            }
                            if (~var383 == -46) {
                                --var6;
                                int var37 = class148.field2704[var6];
                                int var38 = var9[var8];
                                if (~var37 <= -1 && class40.field917[var38] > var37) {
                                    class148.field2704[var6++] = class211.field3834[var38][var37];
                                    continue;
                                }
                                throw new RuntimeException();
                            }
                            if (var383 == 46) {
                                int var39 = var9[var8];
                                var6 -= 2;
                                int var40 = class148.field2704[var6];
                                if (var40 >= 0 && var40 < class40.field917[var39]) {
                                    class211.field3834[var39][var40] = class148.field2704[var6 - -1];
                                    continue;
                                }
                                throw new RuntimeException();
                            }
                            if (var383 == 47) {
                                class117 var41 = class181.field3269[var9[var8]];
                                if (var41 == null) {
                                    var41 = class32.field762;
                                }
                                class141.field2560[var7++] = var41;
                                continue;
                            }
                            if (var383 == 48) {
                                var10001 = var9[var8];
                                --var7;
                                class181.field3269[var10001] = class141.field2560[var7];
                                continue;
                            }
                            if (~var383 == -52) {
                                class62 var42 = var5.field4017[var9[var8]];
                                --var6;
                                class123 var43 = (class123) var42.method460((long) class148.field2704[var6], 1);
                                if (var43 != null) {
                                    var8 += var43.field2304;
                                }
                                continue;
                            }
                        }
                        boolean var44;
                        if (var9[var8] == 1) {
                            var44 = true;
                        } else {
                            var44 = false;
                        }
                        if (var383 < 300) {
                            if (var383 == 100) {
                                var6 -= 3;
                                int var45 = class148.field2704[var6];
                                int var46 = class148.field2704[var6 - -2];
                                int var47 = class148.field2704[var6 - -1];
                                if (var47 == 0) {
                                    throw new RuntimeException();
                                }
                                class9 var48 = class119.method837((byte) 114, var45);
                                if (var48.field157 == null) {
                                    var48.field157 = new class9[var46 + 1];
                                }
                                if (var48.field157.length <= var46) {
                                    class9[] var49 = new class9[var46 + 1];
                                    for (int var50 = 0; var50 < var48.field157.length; ++var50) {
                                        var49[var50] = var48.field157[var50];
                                    }
                                    var48.field157 = var49;
                                }
                                if (~var46 < -1 && var48.field157[var46 + -1] == null) {
                                    throw new RuntimeException("Gap at:" + (var46 - 1));
                                }
                                class9 var51 = new class9();
                                var51.field239 = var46;
                                var51.field249 = true;
                                var51.field225 = var47;
                                var51.field175 = var51.field218 = var48.field218;
                                var48.field157[var46] = var51;
                                if (var44) {
                                    class149.field2712 = var51;
                                } else {
                                    class90.field1667 = var51;
                                }
                                class62.method457(var48, 0);
                                continue;
                            }
                            if (~var383 == -102) {
                                class9 var52 = !var44 ? class90.field1667 : class149.field2712;
                                if (~var52.field239 == 0) {
                                    if (var44) {
                                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                                    }
                                    throw new RuntimeException("Tried to cc_delete static active-component!");
                                }
                                class9 var53 = class119.method837((byte) 94, var52.field218);
                                var53.field157[var52.field239] = null;
                                class62.method457(var53, 0);
                                continue;
                            }
                            if (var383 == 102) {
                                --var6;
                                class9 var54 = class119.method837((byte) 113, class148.field2704[var6]);
                                var54.field157 = null;
                                class62.method457(var54, 0);
                                continue;
                            }
                            if (var383 == 200) {
                                var6 -= 2;
                                int var55 = class148.field2704[var6];
                                int var56 = class148.field2704[var6 - -1];
                                class9 var57 = class101.method686(126, var55, var56);
                                if (var57 != null && ~var56 != 0) {
                                    class148.field2704[var6++] = 1;
                                    if (!var44) {
                                        class90.field1667 = var57;
                                    } else {
                                        class149.field2712 = var57;
                                    }
                                    continue;
                                }
                                class148.field2704[var6++] = 0;
                                continue;
                            }
                            if (~var383 == -202) {
                                --var6;
                                int var58 = class148.field2704[var6];
                                class9 var59 = class119.method837((byte) 93, var58);
                                if (var59 != null) {
                                    class148.field2704[var6++] = 1;
                                    if (var44) {
                                        class149.field2712 = var59;
                                    } else {
                                        class90.field1667 = var59;
                                    }
                                } else {
                                    class148.field2704[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var383 < 500) {
                            if (var383 == 403) {
                                var6 -= 2;
                                int var60 = class148.field2704[var6];
                                if (~var60 <= -8) {
                                    var60 -= 7;
                                }
                                int var61 = class148.field2704[var6 + 1];
                                class93.field1712.field1143.method663(var61, var60, (byte) 93);
                                continue;
                            }
                            if (~var383 == -405) {
                                var6 -= 2;
                                int var62 = class148.field2704[var6];
                                int var63 = class148.field2704[var6 + 1];
                                class93.field1712.field1143.method662(var62, var63, (byte) 1);
                                continue;
                            }
                            if (~var383 == -411) {
                                --var6;
                                boolean var64 = class148.field2704[var6] != 0;
                                class93.field1712.field1143.method661(20, var64);
                                continue;
                            }
                        } else if ((~var383 > -1001 || var383 >= 1100) && (var383 < 2000 || ~var383 <= -2101)) {
                            if (var383 >= 1100 && ~var383 > -1201 || var383 >= 2100 && var383 < 2200) {
                                class9 var375;
                                if (~var383 <= -2001) {
                                    var383 -= 1000;
                                    --var6;
                                    var375 = class119.method837((byte) 120, class148.field2704[var6]);
                                } else {
                                    var375 = !var44 ? class90.field1667 : class149.field2712;
                                }
                                if (~var383 == -1101) {
                                    var6 -= 2;
                                    var375.field255 = class148.field2704[var6];
                                    if (var375.field255 > var375.field170 - var375.field256) {
                                        var375.field255 = -var375.field256 + var375.field170;
                                    }
                                    if (~var375.field255 > -1) {
                                        var375.field255 = 0;
                                    }
                                    var375.field247 = class148.field2704[var6 + 1];
                                    if (~var375.field247 < ~(var375.field294 - var375.field207)) {
                                        var375.field247 = var375.field294 - var375.field207;
                                    }
                                    if (var375.field247 < 0) {
                                        var375.field247 = 0;
                                    }
                                    class62.method457(var375, 0);
                                    continue;
                                }
                                if (var383 == 1101) {
                                    --var6;
                                    var375.field149 = class148.field2704[var6];
                                    class62.method457(var375, 0);
                                    continue;
                                }
                                if (~var383 == -1103) {
                                    --var6;
                                    var375.field242 = class148.field2704[var6] == 1;
                                    class62.method457(var375, 0);
                                    continue;
                                }
                                if (var383 == 1103) {
                                    --var6;
                                    var375.field203 = class148.field2704[var6];
                                    class62.method457(var375, 0);
                                    continue;
                                }
                                if (var383 == 1104) {
                                    --var6;
                                    var375.field303 = class148.field2704[var6];
                                    class62.method457(var375, 0);
                                    continue;
                                }
                                if (~var383 == -1106) {
                                    --var6;
                                    var375.field269 = class148.field2704[var6];
                                    class62.method457(var375, 0);
                                    continue;
                                }
                                if (var383 == 1106) {
                                    --var6;
                                    var375.field219 = class148.field2704[var6];
                                    class62.method457(var375, 0);
                                    continue;
                                }
                                if (var383 == 1107) {
                                    --var6;
                                    var375.field188 = class148.field2704[var6] == 1;
                                    class62.method457(var375, 0);
                                    continue;
                                }
                                if (~var383 == -1109) {
                                    var375.field245 = 1;
                                    --var6;
                                    var375.field235 = class148.field2704[var6];
                                    class62.method457(var375, 0);
                                    continue;
                                }
                                if (~var383 == -1110) {
                                    var6 -= 6;
                                    var375.field202 = class148.field2704[var6];
                                    var375.field150 = class148.field2704[var6 + 1];
                                    var375.field229 = class148.field2704[var6 + 2];
                                    var375.field209 = class148.field2704[var6 + 3];
                                    var375.field293 = class148.field2704[var6 + 4];
                                    var375.field195 = class148.field2704[var6 - -5];
                                    class62.method457(var375, 0);
                                    continue;
                                }
                                if (~var383 == -1111) {
                                    --var6;
                                    int var376 = class148.field2704[var6];
                                    if (var375.field291 != var376) {
                                        var375.field270 = 0;
                                        var375.field291 = var376;
                                        var375.field299 = 0;
                                        class62.method457(var375, 0);
                                    }
                                    continue;
                                }
                                if (~var383 == -1112) {
                                    --var6;
                                    var375.field233 = class148.field2704[var6] == 1;
                                    class62.method457(var375, 0);
                                    continue;
                                }
                                if (var383 == 1112) {
                                    --var7;
                                    class117 var377 = class141.field2560[var7];
                                    if (!var377.method810((byte) -50, var375.field162)) {
                                        var375.field162 = var377;
                                        class62.method457(var375, 0);
                                    }
                                    continue;
                                }
                                if (~var383 == -1114) {
                                    --var6;
                                    var375.field240 = class148.field2704[var6];
                                    class62.method457(var375, 0);
                                    continue;
                                }
                                if (~var383 == -1115) {
                                    var6 -= 3;
                                    var375.field261 = class148.field2704[var6];
                                    var375.field216 = class148.field2704[var6 + 1];
                                    var375.field212 = class148.field2704[var6 + 2];
                                    class62.method457(var375, 0);
                                    continue;
                                }
                                if (~var383 == -1116) {
                                    --var6;
                                    var375.field288 = ~class148.field2704[var6] == -2;
                                    class62.method457(var375, 0);
                                    continue;
                                }
                                if (var383 == 1116) {
                                    --var6;
                                    var375.field194 = class148.field2704[var6];
                                    class62.method457(var375, 0);
                                    continue;
                                }
                                if (~var383 == -1118) {
                                    --var6;
                                    var375.field274 = class148.field2704[var6];
                                    class62.method457(var375, 0);
                                    continue;
                                }
                                if (~var383 == -1119) {
                                    --var6;
                                    var375.field173 = ~class148.field2704[var6] == -2;
                                    class62.method457(var375, 0);
                                    continue;
                                }
                                if (var383 == 1119) {
                                    --var6;
                                    var375.field265 = class148.field2704[var6] == 1;
                                    class62.method457(var375, 0);
                                    continue;
                                }
                                if (~var383 == -1121) {
                                    var6 -= 2;
                                    var375.field170 = class148.field2704[var6];
                                    var375.field294 = class148.field2704[var6 + 1];
                                    class62.method457(var375, 0);
                                    if (~var375.field225 == -1) {
                                        class201.method1338((byte) -87, false, var375);
                                    }
                                    continue;
                                }
                                if (var383 == 1121) {
                                    --var6;
                                    class62.method457(var375, 0);
                                    continue;
                                }
                                if (var383 == 1122) {
                                    --var6;
                                    var375.field300 = class148.field2704[var6] == 1;
                                    class62.method457(var375, 0);
                                    continue;
                                }
                            } else if ((var383 < 1200 || ~var383 <= -1301) && (~var383 > -2201 || ~var383 <= -2301)) {
                                if (var383 >= 1300 && ~var383 > -1401 || var383 >= 2300 && ~var383 > -2401) {
                                    class9 var371;
                                    if (~var383 <= -2001) {
                                        var383 -= 1000;
                                        --var6;
                                        var371 = class119.method837((byte) 103, class148.field2704[var6]);
                                    } else {
                                        var371 = !var44 ? class90.field1667 : class149.field2712;
                                    }
                                    if (var383 == 1300) {
                                        --var6;
                                        int var372 = class148.field2704[var6] - 1;
                                        if (~var372 <= -1 && ~var372 >= -10) {
                                            --var7;
                                            var371.method67(class141.field2560[var7], true, var372);
                                            continue;
                                        }
                                        --var7;
                                        continue;
                                    }
                                    if (~var383 == -1302) {
                                        var6 -= 2;
                                        int var373 = class148.field2704[var6 + 1];
                                        int var374 = class148.field2704[var6];
                                        var371.field266 = class101.method686(125, var374, var373);
                                        continue;
                                    }
                                    if (var383 == 1302) {
                                        --var6;
                                        var371.field243 = ~class148.field2704[var6] == -2;
                                        continue;
                                    }
                                    if (~var383 == -1304) {
                                        --var6;
                                        var371.field259 = class148.field2704[var6];
                                        continue;
                                    }
                                    if (var383 == 1304) {
                                        --var6;
                                        var371.field251 = class148.field2704[var6];
                                        continue;
                                    }
                                    if (var383 == 1305) {
                                        --var7;
                                        var371.field252 = class141.field2560[var7];
                                        continue;
                                    }
                                    if (var383 == 1306) {
                                        --var7;
                                        var371.field181 = class141.field2560[var7];
                                        continue;
                                    }
                                    if (var383 == 1307) {
                                        var371.field231 = null;
                                        continue;
                                    }
                                } else {
                                    if (var383 >= 1400 && var383 < 1500 || var383 >= 2400 && ~var383 > -2501) {
                                        class9 var364;
                                        if (~var383 <= -2001) {
                                            var383 -= 1000;
                                            --var6;
                                            var364 = class119.method837((byte) 126, class148.field2704[var6]);
                                        } else {
                                            var364 = !var44 ? class90.field1667 : class149.field2712;
                                        }
                                        --var7;
                                        class117 var365 = class141.field2560[var7];
                                        int[] var366 = null;
                                        if (~var365.method819((byte) -104) < -1 && var365.method777(!arg0, var365.method819((byte) -115) + -1) == 89) {
                                            --var6;
                                            int var367 = class148.field2704[var6];
                                            if (var367 > 0) {
                                                var366 = new int[var367];
                                                while (var367-- > 0) {
                                                    --var6;
                                                    var366[var367] = class148.field2704[var6];
                                                }
                                            }
                                            var365 = var365.method781(true, 0, -1 + var365.method819((byte) -112));
                                        }
                                        Object[] var368 = new Object[var365.method819((byte) -114) - -1];
                                        for (int var369 = var368.length + -1; ~var369 <= -2; --var369) {
                                            if (var365.method777(true, var369 - 1) != 115) {
                                                --var6;
                                                var368[var369] = new Integer(class148.field2704[var6]);
                                            } else {
                                                --var7;
                                                var368[var369] = class141.field2560[var7];
                                            }
                                        }
                                        --var6;
                                        int var370 = class148.field2704[var6];
                                        if (~var370 == 0) {
                                            var368 = null;
                                        } else {
                                            var368[0] = new Integer(var370);
                                        }
                                        if (~var383 == -1421) {
                                            var364.field198 = var368;
                                        }
                                        if (var383 == 1427) {
                                            var364.field237 = var368;
                                        }
                                        if (var383 == 1403) {
                                            var364.field148 = var368;
                                        }
                                        if (var383 == 1417) {
                                            var364.field199 = var368;
                                        }
                                        if (~var383 == -1402) {
                                            var364.field155 = var368;
                                        }
                                        if (var383 == 1405) {
                                            var364.field153 = var368;
                                        }
                                        if (~var383 == -1407) {
                                            var364.field176 = var368;
                                        }
                                        if (var383 == 1425) {
                                            var364.field279 = var368;
                                        }
                                        if (var383 == 1422) {
                                            var364.field296 = var368;
                                        }
                                        if (var383 == 1404) {
                                            var364.field246 = var368;
                                        }
                                        if (var383 == 1410) {
                                            var364.field172 = var368;
                                        }
                                        if (~var383 == -1415) {
                                            var364.field156 = var368;
                                            var364.field278 = var366;
                                        }
                                        if (~var383 == -1413) {
                                            var364.field263 = var368;
                                        }
                                        if (var383 == 1402) {
                                            var364.field267 = var368;
                                        }
                                        if (~var383 == -1422) {
                                            var364.field232 = var368;
                                        }
                                        if (~var383 == -1424) {
                                            var364.field223 = var368;
                                        }
                                        if (~var383 == -1419) {
                                            var364.field182 = var368;
                                        }
                                        if (var383 == 1416) {
                                            var364.field177 = var368;
                                        }
                                        if (var383 == 1415) {
                                            var364.field221 = var366;
                                            var364.field250 = var368;
                                        }
                                        if (var383 == 1424) {
                                            var364.field260 = var368;
                                        }
                                        if (~var383 == -1408) {
                                            var364.field184 = var368;
                                            var364.field190 = var366;
                                        }
                                        if (~var383 == -1409) {
                                            var364.field253 = var368;
                                        }
                                        if (var383 == 1411) {
                                            var364.field201 = var368;
                                        }
                                        var364.field273 = true;
                                        if (~var383 == -1420) {
                                            var364.field160 = var368;
                                        }
                                        if (var383 == 1409) {
                                            var364.field165 = var368;
                                        }
                                        if (var383 == 1400) {
                                            var364.field287 = var368;
                                        }
                                        continue;
                                    }
                                    if (var383 < 1600) {
                                        class9 var73 = var44 ? class149.field2712 : class90.field1667;
                                        if (~var383 == -1501) {
                                            class148.field2704[var6++] = var73.field283;
                                            continue;
                                        }
                                        if (~var383 == -1502) {
                                            class148.field2704[var6++] = var73.field227;
                                            continue;
                                        }
                                        if (~var383 == -1503) {
                                            class148.field2704[var6++] = var73.field256;
                                            continue;
                                        }
                                        if (var383 == 1503) {
                                            class148.field2704[var6++] = var73.field207;
                                            continue;
                                        }
                                        if (var383 == 1504) {
                                            class148.field2704[var6++] = !var73.field290 ? 0 : 1;
                                            continue;
                                        }
                                        if (var383 == 1505) {
                                            class148.field2704[var6++] = var73.field175;
                                            continue;
                                        }
                                    } else if (~var383 > -1701) {
                                        class9 var74 = !var44 ? class90.field1667 : class149.field2712;
                                        if (~var383 == -1601) {
                                            class148.field2704[var6++] = var74.field255;
                                            continue;
                                        }
                                        if (~var383 == -1602) {
                                            class148.field2704[var6++] = var74.field247;
                                            continue;
                                        }
                                        if (~var383 == -1603) {
                                            class141.field2560[var7++] = var74.field162;
                                            continue;
                                        }
                                        if (~var383 == -1604) {
                                            class148.field2704[var6++] = var74.field170;
                                            continue;
                                        }
                                        if (var383 == 1604) {
                                            class148.field2704[var6++] = var74.field294;
                                            continue;
                                        }
                                        if (~var383 == -1606) {
                                            class148.field2704[var6++] = var74.field195;
                                            continue;
                                        }
                                        if (~var383 == -1607) {
                                            class148.field2704[var6++] = var74.field229;
                                            continue;
                                        }
                                        if (~var383 == -1608) {
                                            class148.field2704[var6++] = var74.field293;
                                            continue;
                                        }
                                        if (~var383 == -1609) {
                                            class148.field2704[var6++] = var74.field209;
                                            continue;
                                        }
                                        if (~var383 == -1610) {
                                            class148.field2704[var6++] = var74.field203;
                                            continue;
                                        }
                                    } else if (var383 < 1800) {
                                        class9 var75 = !var44 ? class90.field1667 : class149.field2712;
                                        if (~var383 == -1701) {
                                            class148.field2704[var6++] = var75.field158;
                                            continue;
                                        }
                                        if (~var383 == -1702) {
                                            if (var75.field158 != -1) {
                                                class148.field2704[var6++] = var75.field151;
                                            } else {
                                                class148.field2704[var6++] = 0;
                                            }
                                            continue;
                                        }
                                        if (var383 == 1702) {
                                            class148.field2704[var6++] = var75.field239;
                                            continue;
                                        }
                                    } else if (~var383 <= -1901) {
                                        if (var383 >= 2600) {
                                            if (~var383 <= -2701) {
                                                if (~var383 <= -2801) {
                                                    if (var383 >= 2900) {
                                                        if (~var383 > -3201) {
                                                            if (var383 == 3100) {
                                                                --var7;
                                                                class117 var76 = class141.field2560[var7];
                                                                class14.method129(class53.field1102, var76, 0, 0);
                                                                continue;
                                                            }
                                                            if (~var383 == -3102) {
                                                                var6 -= 2;
                                                                class246.method1614(class148.field2704[var6 + 1], class148.field2704[var6], -2, class93.field1712);
                                                                continue;
                                                            }
                                                            if (~var383 == -3104) {
                                                                class90.method631(-1);
                                                                continue;
                                                            }
                                                            if (~var383 == -3105) {
                                                                --var7;
                                                                class117 var77 = class141.field2560[var7];
                                                                int var78 = 0;
                                                                if (var77.method795((byte) -112)) {
                                                                    var78 = var77.method825((byte) -115);
                                                                }
                                                                ++class114.field2126;
                                                                class105.field1911.method400(152, 8);
                                                                class105.field1911.method1024(-51, var78);
                                                                continue;
                                                            }
                                                            if (~var383 == -3106) {
                                                                --var7;
                                                                class117 var79 = class141.field2560[var7];
                                                                ++class6.field90;
                                                                class105.field1911.method400(54, 8);
                                                                class105.field1911.method1000((byte) 74, var79.method813((byte) 93));
                                                                continue;
                                                            }
                                                            if (var383 == 3106) {
                                                                ++class106.field1940;
                                                                --var7;
                                                                class117 var80 = class141.field2560[var7];
                                                                class105.field1911.method400(60, 8);
                                                                class105.field1911.method1002(false, 1 + var80.method819((byte) -105));
                                                                class105.field1911.method1027(32768, var80);
                                                                continue;
                                                            }
                                                            if (~var383 == -3108) {
                                                                --var6;
                                                                int var81 = class148.field2704[var6];
                                                                --var7;
                                                                class117 var82 = class141.field2560[var7];
                                                                class38.method333(var82, 7, var81);
                                                                continue;
                                                            }
                                                            if (~var383 == -3109) {
                                                                var6 -= 3;
                                                                int var83 = class148.field2704[var6];
                                                                int var84 = class148.field2704[var6 + 1];
                                                                int var85 = class148.field2704[var6 + 2];
                                                                class9 var86 = class119.method837((byte) 110, var85);
                                                                class198.method1314(var86, var84, var83, -100);
                                                                continue;
                                                            }
                                                            if (~var383 == -3110) {
                                                                var6 -= 2;
                                                                int var87 = class148.field2704[var6];
                                                                int var88 = class148.field2704[var6 - -1];
                                                                class9 var89 = var44 ? class149.field2712 : class90.field1667;
                                                                class198.method1314(var89, var88, var87, -10);
                                                                continue;
                                                            }
                                                            if (~var383 == -3111) {
                                                                ++class79.field1491;
                                                                --var6;
                                                                int var90 = class148.field2704[var6];
                                                                class105.field1911.method400(194, 8);
                                                                class105.field1911.method993(false, var90);
                                                                continue;
                                                            }
                                                        } else if (var383 >= 3300) {
                                                            if (var383 >= 3400) {
                                                                if (var383 < 3500) {
                                                                    if (~var383 == -3401) {
                                                                        var6 -= 2;
                                                                        int var91 = class148.field2704[var6];
                                                                        int var92 = class148.field2704[var6 + 1];
                                                                        class140 var93 = class58.method440((byte) 85, var91);
                                                                        class141.field2560[var7++] = var93.method951(var92, 0);
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -3409) {
                                                                        var6 -= 4;
                                                                        int var94 = class148.field2704[var6];
                                                                        int var95 = class148.field2704[var6 + 2];
                                                                        int var96 = class148.field2704[var6 - -1];
                                                                        int var97 = class148.field2704[var6 - -3];
                                                                        class140 var98 = class58.method440((byte) -63, var95);
                                                                        if (var98.field2549 == var94 && ~var98.field2544 == ~var96) {
                                                                            if (~var96 == -116) {
                                                                                class141.field2560[var7++] = var98.method951(var97, 0);
                                                                            } else {
                                                                                class148.field2704[var6++] = var98.method954(-15, var97);
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (~var96 != -116) {
                                                                            class148.field2704[var6++] = 0;
                                                                        } else {
                                                                            class141.field2560[var7++] = class32.field762;
                                                                        }
                                                                        continue;
                                                                    }
                                                                } else if (var383 >= 3700) {
                                                                    if (var383 >= 4000) {
                                                                        if (var383 >= 4100) {
                                                                            if (var383 >= 4200) {
                                                                                if (var383 < 4300) {
                                                                                    if (var383 == 4200) {
                                                                                        --var6;
                                                                                        int var99 = class148.field2704[var6];
                                                                                        class141.field2560[var7++] = class214.method1408((byte) 102, var99).field2812;
                                                                                        continue;
                                                                                    }
                                                                                    if (var383 == 4201) {
                                                                                        var6 -= 2;
                                                                                        int var100 = class148.field2704[var6 - -1];
                                                                                        int var101 = class148.field2704[var6];
                                                                                        class154 var102 = class214.method1408((byte) 102, var101);
                                                                                        if (var100 >= 1 && ~var100 >= -6 && var102.field2761[var100 + -1] != null) {
                                                                                            class141.field2560[var7++] = var102.field2761[var100 + -1];
                                                                                            continue;
                                                                                        }
                                                                                        class141.field2560[var7++] = class53.field1102;
                                                                                        continue;
                                                                                    }
                                                                                    if (var383 == 4202) {
                                                                                        var6 -= 2;
                                                                                        int var103 = class148.field2704[var6 + 1];
                                                                                        int var104 = class148.field2704[var6];
                                                                                        class154 var105 = class214.method1408((byte) 102, var104);
                                                                                        if (~var103 <= -2 && var103 <= 5 && var105.field2775[var103 + -1] != null) {
                                                                                            class141.field2560[var7++] = var105.field2775[var103 - 1];
                                                                                            continue;
                                                                                        }
                                                                                        class141.field2560[var7++] = class53.field1102;
                                                                                        continue;
                                                                                    }
                                                                                    if (var383 == 4203) {
                                                                                        --var6;
                                                                                        int var106 = class148.field2704[var6];
                                                                                        class148.field2704[var6++] = class214.method1408((byte) 102, var106).field2780;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var383 == -4205) {
                                                                                        --var6;
                                                                                        int var107 = class148.field2704[var6];
                                                                                        class148.field2704[var6++] = class214.method1408((byte) 102, var107).field2806 == 1 ? 1 : 0;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var383 == -4206) {
                                                                                        --var6;
                                                                                        int var108 = class148.field2704[var6];
                                                                                        class154 var109 = class214.method1408((byte) 102, var108);
                                                                                        if (var109.field2822 == -1 && ~var109.field2818 <= -1) {
                                                                                            class148.field2704[var6++] = var109.field2818;
                                                                                            continue;
                                                                                        }
                                                                                        class148.field2704[var6++] = var108;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var383 == -4207) {
                                                                                        --var6;
                                                                                        int var110 = class148.field2704[var6];
                                                                                        class154 var111 = class214.method1408((byte) 102, var110);
                                                                                        if (~var111.field2822 <= -1 && var111.field2818 >= 0) {
                                                                                            class148.field2704[var6++] = var111.field2818;
                                                                                            continue;
                                                                                        }
                                                                                        class148.field2704[var6++] = var110;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var383 == -4208) {
                                                                                        --var6;
                                                                                        int var112 = class148.field2704[var6];
                                                                                        class148.field2704[var6++] = class214.method1408((byte) 102, var112).field2793 ? 1 : 0;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var383 == -4209) {
                                                                                        var6 -= 2;
                                                                                        int var113 = class148.field2704[var6];
                                                                                        int var114 = class148.field2704[var6 + 1];
                                                                                        class230 var115 = class191.method1279(var114, -123);
                                                                                        if (var115.method1486(0)) {
                                                                                            class141.field2560[var7++] = class214.method1408((byte) 102, var113).method1098(var115.field4138, -23881, var114);
                                                                                        } else {
                                                                                            class148.field2704[var6++] = class214.method1408((byte) 102, var113).method1089(var115.field4135, -1, var114);
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    if (var383 == 4210) {
                                                                                        --var7;
                                                                                        class117 var116 = class141.field2560[var7];
                                                                                        --var6;
                                                                                        int var117 = class148.field2704[var6];
                                                                                        class6.method50(var116, ~var117 == -2, 23636);
                                                                                        class148.field2704[var6++] = class148.field2703;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var383 == -4212) {
                                                                                        if (class203.field3677 != null && ~class40.field911 > ~class148.field2703) {
                                                                                            class148.field2704[var6++] = class209.method1370(65535, class203.field3677[class40.field911++]);
                                                                                            continue;
                                                                                        }
                                                                                        class148.field2704[var6++] = -1;
                                                                                        continue;
                                                                                    }
                                                                                    if (var383 == 4212) {
                                                                                        class40.field911 = 0;
                                                                                        continue;
                                                                                    }
                                                                                } else if (~var383 > -4401) {
                                                                                    if (~var383 == -4301) {
                                                                                        var6 -= 2;
                                                                                        int var118 = class148.field2704[var6 + 1];
                                                                                        int var119 = class148.field2704[var6];
                                                                                        class230 var120 = class191.method1279(var118, -126);
                                                                                        if (var120.method1486(0)) {
                                                                                            class141.field2560[var7++] = class56.method429(0, var119).method742(var120.field4138, var118, (byte) 59);
                                                                                        } else {
                                                                                            class148.field2704[var6++] = class56.method429(0, var119).method740((byte) 64, var120.field4135, var118);
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                } else if (var383 >= 4500) {
                                                                                    if (var383 < 4600) {
                                                                                        if (~var383 == -4501) {
                                                                                            var6 -= 2;
                                                                                            int var121 = class148.field2704[var6];
                                                                                            int var122 = class148.field2704[var6 + 1];
                                                                                            class230 var123 = class191.method1279(var122, -125);
                                                                                            if (var123.method1486(0)) {
                                                                                                class141.field2560[var7++] = class216.method1419((byte) 126, var121).method1342(var122, 82, var123.field4138);
                                                                                            } else {
                                                                                                class148.field2704[var6++] = class216.method1419((byte) 126, var121).method1341(var122, -76, var123.field4135);
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                    } else if (~var383 > -5101) {
                                                                                        if (var383 == 5000) {
                                                                                            class148.field2704[var6++] = class133.field2401;
                                                                                            continue;
                                                                                        }
                                                                                        if (var383 == 5001) {
                                                                                            var6 -= 3;
                                                                                            ++class66.field1270;
                                                                                            class133.field2401 = class148.field2704[var6];
                                                                                            class17.field506 = class148.field2704[var6 + 1];
                                                                                            class44.field960 = class148.field2704[var6 - -2];
                                                                                            class105.field1911.method400(115, 8);
                                                                                            class105.field1911.method1002(false, class133.field2401);
                                                                                            class105.field1911.method1002(false, class17.field506);
                                                                                            class105.field1911.method1002(false, class44.field960);
                                                                                            continue;
                                                                                        }
                                                                                        if (var383 == 5002) {
                                                                                            var6 -= 2;
                                                                                            ++class14.field431;
                                                                                            int var124 = class148.field2704[var6 + 1];
                                                                                            int var125 = class148.field2704[var6];
                                                                                            --var7;
                                                                                            class117 var126 = class141.field2560[var7];
                                                                                            class105.field1911.method400(99, 8);
                                                                                            class105.field1911.method1000((byte) 105, var126.method813((byte) 93));
                                                                                            class105.field1911.method1002(false, var125 - 1);
                                                                                            class105.field1911.method1002(false, var124);
                                                                                            continue;
                                                                                        }
                                                                                        if (var383 == 5003) {
                                                                                            --var6;
                                                                                            int var127 = class148.field2704[var6];
                                                                                            class117 var128 = null;
                                                                                            if (~var127 > -101) {
                                                                                                var128 = class6.field99[var127];
                                                                                            }
                                                                                            if (var128 == null) {
                                                                                                var128 = class53.field1102;
                                                                                            }
                                                                                            class141.field2560[var7++] = var128;
                                                                                            continue;
                                                                                        }
                                                                                        if (var383 == 5004) {
                                                                                            --var6;
                                                                                            int var129 = class148.field2704[var6];
                                                                                            int var130 = -1;
                                                                                            if (var129 < 100 && class6.field99[var129] != null) {
                                                                                                var130 = class96.field1766[var129];
                                                                                            }
                                                                                            class148.field2704[var6++] = var130;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var383 == -5006) {
                                                                                            class148.field2704[var6++] = class17.field506;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var383 == -5009) {
                                                                                            --var7;
                                                                                            class117 var131 = class141.field2560[var7];
                                                                                            if (var131.method822(33, class140.field2559)) {
                                                                                                class86.method600(var131, -3);
                                                                                                continue;
                                                                                            }
                                                                                            if (~class172.field3106 == -1 && (class198.field3548 == 1 || ~class67.field1292 == -2)) {
                                                                                                continue;
                                                                                            }
                                                                                            ++class69.field1317;
                                                                                            byte var132 = 0;
                                                                                            class117 var133 = var131.method820(81);
                                                                                            byte var134 = 0;
                                                                                            if (!var133.method822(33, class84.field1577)) {
                                                                                                if (!var133.method822(33, class228.field4101)) {
                                                                                                    if (!var133.method822(33, class143.field2587)) {
                                                                                                        if (!var133.method822(33, class52.field1078)) {
                                                                                                            if (var133.method822(33, class206.field3703)) {
                                                                                                                var131 = var131.method802(class206.field3703.method819((byte) -109), 1176819746);
                                                                                                                var132 = 4;
                                                                                                            } else if (!var133.method822(33, class179.field3250)) {
                                                                                                                if (var133.method822(33, class28.field690)) {
                                                                                                                    var131 = var131.method802(class28.field690.method819((byte) -127), 1176819746);
                                                                                                                    var132 = 6;
                                                                                                                } else if (!var133.method822(33, class81.field1537)) {
                                                                                                                    if (!var133.method822(33, class42.field936)) {
                                                                                                                        if (!var133.method822(33, class104.field1904)) {
                                                                                                                            if (!var133.method822(33, class151.field2751)) {
                                                                                                                                if (!var133.method822(33, class12.field401)) {
                                                                                                                                    if (~class233.field4193 != -1) {
                                                                                                                                        if (!var133.method822(33, class84.field1591)) {
                                                                                                                                            if (!var133.method822(33, class228.field4097)) {
                                                                                                                                                if (!var133.method822(33, class143.field2596)) {
                                                                                                                                                    if (var133.method822(33, class52.field1066)) {
                                                                                                                                                        var131 = var131.method802(class52.field1066.method819((byte) -88), 1176819746);
                                                                                                                                                        var132 = 3;
                                                                                                                                                    } else if (var133.method822(33, class206.field3704)) {
                                                                                                                                                        var131 = var131.method802(class206.field3704.method819((byte) -93), 1176819746);
                                                                                                                                                        var132 = 4;
                                                                                                                                                    } else if (var133.method822(33, class179.field3235)) {
                                                                                                                                                        var132 = 5;
                                                                                                                                                        var131 = var131.method802(class179.field3235.method819((byte) -89), 1176819746);
                                                                                                                                                    } else if (!var133.method822(33, class28.field695)) {
                                                                                                                                                        if (!var133.method822(33, class81.field1531)) {
                                                                                                                                                            if (!var133.method822(33, class42.field941)) {
                                                                                                                                                                if (var133.method822(33, class104.field1890)) {
                                                                                                                                                                    var131 = var131.method802(class104.field1890.method819((byte) -119), 1176819746);
                                                                                                                                                                    var132 = 9;
                                                                                                                                                                } else if (var133.method822(33, class151.field2738)) {
                                                                                                                                                                    var131 = var131.method802(class151.field2738.method819((byte) -84), 1176819746);
                                                                                                                                                                    var132 = 10;
                                                                                                                                                                } else if (var133.method822(33, class12.field399)) {
                                                                                                                                                                    var132 = 11;
                                                                                                                                                                    var131 = var131.method802(class12.field399.method819((byte) -101), 1176819746);
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                var132 = 8;
                                                                                                                                                                var131 = var131.method802(class42.field941.method819((byte) -113), 1176819746);
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            var132 = 7;
                                                                                                                                                            var131 = var131.method802(class81.field1531.method819((byte) -114), 1176819746);
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        var132 = 6;
                                                                                                                                                        var131 = var131.method802(class28.field695.method819((byte) -87), 1176819746);
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    var131 = var131.method802(class143.field2596.method819((byte) -105), 1176819746);
                                                                                                                                                    var132 = 2;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                var131 = var131.method802(class228.field4097.method819((byte) -90), 1176819746);
                                                                                                                                                var132 = 1;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            var131 = var131.method802(class84.field1591.method819((byte) -107), 1176819746);
                                                                                                                                            var132 = 0;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    var131 = var131.method802(class12.field401.method819((byte) -126), 1176819746);
                                                                                                                                    var132 = 11;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                var132 = 10;
                                                                                                                                var131 = var131.method802(class151.field2751.method819((byte) -89), 1176819746);
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var132 = 9;
                                                                                                                            var131 = var131.method802(class104.field1904.method819((byte) -110), 1176819746);
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var131 = var131.method802(class42.field936.method819((byte) -86), 1176819746);
                                                                                                                        var132 = 8;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    var132 = 7;
                                                                                                                    var131 = var131.method802(class81.field1537.method819((byte) -92), 1176819746);
                                                                                                                }
                                                                                                            } else {
                                                                                                                var132 = 5;
                                                                                                                var131 = var131.method802(class179.field3250.method819((byte) -119), 1176819746);
                                                                                                            }
                                                                                                        } else {
                                                                                                            var132 = 3;
                                                                                                            var131 = var131.method802(class52.field1078.method819((byte) -107), 1176819746);
                                                                                                        }
                                                                                                    } else {
                                                                                                        var131 = var131.method802(class143.field2587.method819((byte) -117), 1176819746);
                                                                                                        var132 = 2;
                                                                                                    }
                                                                                                } else {
                                                                                                    var131 = var131.method802(class228.field4101.method819((byte) -107), 1176819746);
                                                                                                    var132 = 1;
                                                                                                }
                                                                                            } else {
                                                                                                var132 = 0;
                                                                                                var131 = var131.method802(class84.field1577.method819((byte) -99), 1176819746);
                                                                                            }
                                                                                            class117 var135 = var131.method820(-126);
                                                                                            if (var135.method822(33, class67.field1283)) {
                                                                                                var134 = 1;
                                                                                                var131 = var131.method802(class67.field1283.method819((byte) -94), 1176819746);
                                                                                            } else if (var135.method822(33, class233.field4198)) {
                                                                                                var131 = var131.method802(class233.field4198.method819((byte) -113), 1176819746);
                                                                                                var134 = 2;
                                                                                            } else if (!var135.method822(33, class190.field3381)) {
                                                                                                if (var135.method822(33, class177.field3217)) {
                                                                                                    var131 = var131.method802(class177.field3217.method819((byte) -116), 1176819746);
                                                                                                    var134 = 4;
                                                                                                } else if (var135.method822(33, class115.field2147)) {
                                                                                                    var131 = var131.method802(class115.field2147.method819((byte) -85), 1176819746);
                                                                                                    var134 = 5;
                                                                                                } else if (~class233.field4193 != -1) {
                                                                                                    if (var135.method822(33, class67.field1298)) {
                                                                                                        var131 = var131.method802(class67.field1298.method819((byte) -124), 1176819746);
                                                                                                        var134 = 1;
                                                                                                    } else if (!var135.method822(33, class233.field4207)) {
                                                                                                        if (var135.method822(33, class190.field3392)) {
                                                                                                            var134 = 3;
                                                                                                            var131 = var131.method802(class190.field3392.method819((byte) -90), 1176819746);
                                                                                                        } else if (var135.method822(33, class177.field3218)) {
                                                                                                            var134 = 4;
                                                                                                            var131 = var131.method802(class177.field3218.method819((byte) -88), 1176819746);
                                                                                                        } else if (var135.method822(33, class115.field2144)) {
                                                                                                            var134 = 5;
                                                                                                            var131 = var131.method802(class115.field2144.method819((byte) -126), 1176819746);
                                                                                                        }
                                                                                                    } else {
                                                                                                        var134 = 2;
                                                                                                        var131 = var131.method802(class233.field4207.method819((byte) -91), 1176819746);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var131 = var131.method802(class190.field3381.method819((byte) -127), 1176819746);
                                                                                                var134 = 3;
                                                                                            }
                                                                                            class105.field1911.method400(189, 8);
                                                                                            class105.field1911.method1002(arg0, 0);
                                                                                            int var136 = class105.field1911.field2643;
                                                                                            class105.field1911.method1002(false, var132);
                                                                                            class105.field1911.method1002(false, var134);
                                                                                            class216.method1418(true, var131, class105.field1911);
                                                                                            class105.field1911.method1007(-var136 + class105.field1911.field2643, !arg0);
                                                                                            continue;
                                                                                        }
                                                                                        if (~var383 == -5010) {
                                                                                            var7 -= 2;
                                                                                            class117 var137 = class141.field2560[var7];
                                                                                            class117 var138 = class141.field2560[var7 - -1];
                                                                                            if (class172.field3106 != 0 || ~class198.field3548 != -2 && ~class67.field1292 != -2) {
                                                                                                ++class199.field3595;
                                                                                                class105.field1911.method400(80, 8);
                                                                                                class105.field1911.method1002(false, 0);
                                                                                                int var139 = class105.field1911.field2643;
                                                                                                class105.field1911.method1000((byte) 63, var137.method813((byte) 93));
                                                                                                class216.method1418(!arg0, var138, class105.field1911);
                                                                                                class105.field1911.method1007(-var139 + class105.field1911.field2643, true);
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        if (~var383 == -5011) {
                                                                                            --var6;
                                                                                            int var140 = class148.field2704[var6];
                                                                                            class117 var141 = null;
                                                                                            if (var140 < 100) {
                                                                                                var141 = field4118[var140];
                                                                                            }
                                                                                            if (var141 == null) {
                                                                                                var141 = class53.field1102;
                                                                                            }
                                                                                            class141.field2560[var7++] = var141;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var383 == -5012) {
                                                                                            --var6;
                                                                                            int var142 = class148.field2704[var6];
                                                                                            class117 var143 = null;
                                                                                            if (var142 < 100) {
                                                                                                var143 = class106.field1939[var142];
                                                                                            }
                                                                                            if (var143 == null) {
                                                                                                var143 = class53.field1102;
                                                                                            }
                                                                                            class141.field2560[var7++] = var143;
                                                                                            continue;
                                                                                        }
                                                                                        if (var383 == 5012) {
                                                                                            --var6;
                                                                                            int var144 = class148.field2704[var6];
                                                                                            int var145 = -1;
                                                                                            if (~var144 > -101) {
                                                                                                var145 = class90.field1664[var144];
                                                                                            }
                                                                                            class148.field2704[var6++] = var145;
                                                                                            continue;
                                                                                        }
                                                                                        if (var383 == 5015) {
                                                                                            class117 var146;
                                                                                            if (class93.field1712 != null && class93.field1712.field1141 != null) {
                                                                                                var146 = class93.field1712.field1141;
                                                                                            } else {
                                                                                                var146 = class13.field404;
                                                                                            }
                                                                                            class141.field2560[var7++] = var146;
                                                                                            continue;
                                                                                        }
                                                                                        if (var383 == 5016) {
                                                                                            class148.field2704[var6++] = class44.field960;
                                                                                            continue;
                                                                                        }
                                                                                        if (var383 == 5017) {
                                                                                            class148.field2704[var6++] = class143.field2589;
                                                                                            continue;
                                                                                        }
                                                                                        if (var383 == 5050) {
                                                                                            --var6;
                                                                                            int var147 = class148.field2704[var6];
                                                                                            class141.field2560[var7++] = class176.method1224(-32769, var147).field584;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var383 == -5052) {
                                                                                            --var6;
                                                                                            int var148 = class148.field2704[var6];
                                                                                            class23 var149 = class176.method1224(-32769, var148);
                                                                                            if (var149.field586 != null) {
                                                                                                class148.field2704[var6++] = var149.field586.length;
                                                                                            } else {
                                                                                                class148.field2704[var6++] = 0;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        if (var383 == 5052) {
                                                                                            var6 -= 2;
                                                                                            int var150 = class148.field2704[var6];
                                                                                            int var151 = class148.field2704[var6 - -1];
                                                                                            class23 var152 = class176.method1224(-32769, var150);
                                                                                            int var153 = var152.field586[var151];
                                                                                            class148.field2704[var6++] = var153;
                                                                                            continue;
                                                                                        }
                                                                                        if (var383 == 5053) {
                                                                                            --var6;
                                                                                            int var154 = class148.field2704[var6];
                                                                                            class23 var155 = class176.method1224(-32769, var154);
                                                                                            if (var155.field590 != null) {
                                                                                                class148.field2704[var6++] = var155.field590.length;
                                                                                            } else {
                                                                                                class148.field2704[var6++] = 0;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        if (~var383 == -5055) {
                                                                                            var6 -= 2;
                                                                                            int var156 = class148.field2704[var6];
                                                                                            int var157 = class148.field2704[var6 + 1];
                                                                                            class148.field2704[var6++] = class176.method1224(-32769, var156).field590[var157];
                                                                                            continue;
                                                                                        }
                                                                                        if (~var383 == -5056) {
                                                                                            --var6;
                                                                                            int var158 = class148.field2704[var6];
                                                                                            class141.field2560[var7++] = class172.method1204((byte) -69, var158).method1123(1);
                                                                                            continue;
                                                                                        }
                                                                                        if (~var383 == -5057) {
                                                                                            --var6;
                                                                                            int var159 = class148.field2704[var6];
                                                                                            class158 var160 = class172.method1204((byte) -109, var159);
                                                                                            if (var160.field2866 == null) {
                                                                                                class148.field2704[var6++] = 0;
                                                                                            } else {
                                                                                                class148.field2704[var6++] = var160.field2866.length;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        if (~var383 == -5058) {
                                                                                            var6 -= 2;
                                                                                            int var161 = class148.field2704[var6 + 1];
                                                                                            int var162 = class148.field2704[var6];
                                                                                            class148.field2704[var6++] = class172.method1204((byte) -86, var162).field2866[var161];
                                                                                            continue;
                                                                                        }
                                                                                        if (~var383 == -5059) {
                                                                                            class88.field1636 = new class95();
                                                                                            --var6;
                                                                                            class88.field1636.field1745 = class148.field2704[var6];
                                                                                            class88.field1636.field1741 = class172.method1204((byte) -76, class88.field1636.field1745);
                                                                                            class88.field1636.field1735 = new int[class88.field1636.field1741.method1121(true)];
                                                                                            continue;
                                                                                        }
                                                                                        if (var383 == 5059) {
                                                                                            class105.field1911.method400(197, 8);
                                                                                            class105.field1911.method1002(arg0, 0);
                                                                                            ++class110.field2073;
                                                                                            int var163 = class105.field1911.field2643;
                                                                                            class105.field1911.method1002(false, 0);
                                                                                            class105.field1911.method993(false, class88.field1636.field1745);
                                                                                            class88.field1636.field1741.method1126(86, class88.field1636.field1735, class105.field1911);
                                                                                            class105.field1911.method1007(-var163 + class105.field1911.field2643, !arg0);
                                                                                            continue;
                                                                                        }
                                                                                        if (var383 == 5060) {
                                                                                            ++class26.field654;
                                                                                            --var7;
                                                                                            class117 var164 = class141.field2560[var7];
                                                                                            class105.field1911.method400(242, 8);
                                                                                            class105.field1911.method1002(arg0, 0);
                                                                                            int var165 = class105.field1911.field2643;
                                                                                            class105.field1911.method1000((byte) 79, var164.method813((byte) 93));
                                                                                            class105.field1911.method993(false, class88.field1636.field1745);
                                                                                            class88.field1636.field1741.method1126(102, class88.field1636.field1735, class105.field1911);
                                                                                            class105.field1911.method1007(-var165 + class105.field1911.field2643, true);
                                                                                            continue;
                                                                                        }
                                                                                        if (~var383 == -5062) {
                                                                                            class105.field1911.method400(197, 8);
                                                                                            class105.field1911.method1002(false, 0);
                                                                                            ++class110.field2073;
                                                                                            int var166 = class105.field1911.field2643;
                                                                                            class105.field1911.method1002(false, 1);
                                                                                            class105.field1911.method993(false, class88.field1636.field1745);
                                                                                            class88.field1636.field1741.method1126(-126, class88.field1636.field1735, class105.field1911);
                                                                                            class105.field1911.method1007(-var166 + class105.field1911.field2643, true);
                                                                                            continue;
                                                                                        }
                                                                                        if (~var383 == -5063) {
                                                                                            var6 -= 2;
                                                                                            int var167 = class148.field2704[var6];
                                                                                            int var168 = class148.field2704[var6 + 1];
                                                                                            class148.field2704[var6++] = class176.method1224(-32769, var167).field581[var168];
                                                                                            continue;
                                                                                        }
                                                                                        if (~var383 == -5064) {
                                                                                            var6 -= 2;
                                                                                            int var169 = class148.field2704[var6 + 1];
                                                                                            int var170 = class148.field2704[var6];
                                                                                            class148.field2704[var6++] = class176.method1224(-32769, var170).field591[var169];
                                                                                            continue;
                                                                                        }
                                                                                        if (var383 == 5064) {
                                                                                            var6 -= 2;
                                                                                            int var171 = class148.field2704[var6];
                                                                                            int var172 = class148.field2704[var6 + 1];
                                                                                            if (var172 != -1) {
                                                                                                class148.field2704[var6++] = class176.method1224(-32769, var171).method207(21706, var172);
                                                                                            } else {
                                                                                                class148.field2704[var6++] = -1;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        if (~var383 == -5066) {
                                                                                            var6 -= 2;
                                                                                            int var173 = class148.field2704[var6];
                                                                                            int var174 = class148.field2704[var6 - -1];
                                                                                            if (var174 == -1) {
                                                                                                class148.field2704[var6++] = -1;
                                                                                            } else {
                                                                                                class148.field2704[var6++] = class176.method1224(-32769, var173).method202(arg0, var174);
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        if (var383 == 5066) {
                                                                                            --var6;
                                                                                            int var175 = class148.field2704[var6];
                                                                                            class148.field2704[var6++] = class172.method1204((byte) -120, var175).method1121(!arg0);
                                                                                            continue;
                                                                                        }
                                                                                        if (~var383 == -5068) {
                                                                                            var6 -= 2;
                                                                                            int var176 = class148.field2704[var6 + 1];
                                                                                            int var177 = class148.field2704[var6];
                                                                                            int var178 = class172.method1204((byte) -126, var177).method1125(var176, -27819);
                                                                                            class148.field2704[var6++] = var178;
                                                                                            continue;
                                                                                        }
                                                                                        if (var383 == 5068) {
                                                                                            var6 -= 2;
                                                                                            int var179 = class148.field2704[var6];
                                                                                            int var180 = class148.field2704[var6 + 1];
                                                                                            class88.field1636.field1735[var179] = var180;
                                                                                            continue;
                                                                                        }
                                                                                        if (var383 == 5069) {
                                                                                            var6 -= 2;
                                                                                            int var181 = class148.field2704[var6];
                                                                                            int var182 = class148.field2704[var6 + 1];
                                                                                            class88.field1636.field1735[var181] = var182;
                                                                                            continue;
                                                                                        }
                                                                                        if (var383 == 5070) {
                                                                                            var6 -= 3;
                                                                                            int var183 = class148.field2704[var6];
                                                                                            int var184 = class148.field2704[var6 + 1];
                                                                                            int var185 = class148.field2704[var6 + 2];
                                                                                            class158 var186 = class172.method1204((byte) -86, var183);
                                                                                            if (var186.method1125(var184, -27819) != 0) {
                                                                                                throw new RuntimeException("bad command");
                                                                                            }
                                                                                            class148.field2704[var6++] = var186.method1129(false, var185, var184);
                                                                                            continue;
                                                                                        }
                                                                                    } else if (~var383 > -5201) {
                                                                                        if (~var383 == -5101) {
                                                                                            if (!class53.field1090[86]) {
                                                                                                class148.field2704[var6++] = 0;
                                                                                            } else {
                                                                                                class148.field2704[var6++] = 1;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        if (~var383 == -5102) {
                                                                                            if (class53.field1090[82]) {
                                                                                                class148.field2704[var6++] = 1;
                                                                                            } else {
                                                                                                class148.field2704[var6++] = 0;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        if (~var383 == -5103) {
                                                                                            if (!class53.field1090[81]) {
                                                                                                class148.field2704[var6++] = 0;
                                                                                            } else {
                                                                                                class148.field2704[var6++] = 1;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                    } else if (~var383 <= -5301) {
                                                                                        if (var383 < 5400) {
                                                                                            if (~var383 == -5305) {
                                                                                                class148.field2704[var6++] = 0;
                                                                                                continue;
                                                                                            }
                                                                                        } else if (~var383 > -5501) {
                                                                                            if (~var383 == -5401) {
                                                                                                ++class117.field2207;
                                                                                                var7 -= 2;
                                                                                                class117 var187 = class141.field2560[var7];
                                                                                                class117 var188 = class141.field2560[var7 + 1];
                                                                                                --var6;
                                                                                                int var189 = class148.field2704[var6];
                                                                                                class105.field1911.method400(85, 8);
                                                                                                class105.field1911.method1002(false, 1 + class200.method1334(0, var187) - -class200.method1334(0, var188));
                                                                                                class105.field1911.method1027(32768, var187);
                                                                                                class105.field1911.method1027(32768, var188);
                                                                                                class105.field1911.method1002(false, var189);
                                                                                                continue;
                                                                                            }
                                                                                            if (~var383 == -5402) {
                                                                                                var6 -= 2;
                                                                                                class112.field2107[class148.field2704[var6]] = (short) class58.method442(-104, class148.field2704[var6 + 1]);
                                                                                                class38.method332(108);
                                                                                                class117.method812((byte) -126);
                                                                                                class119.method841(-1);
                                                                                                class52.method399((byte) 113);
                                                                                                class231.method1490(arg0);
                                                                                                continue;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        if (~var383 == -5201) {
                                                                                            --var6;
                                                                                            class214.method1405(class148.field2704[var6], (byte) 20);
                                                                                            continue;
                                                                                        }
                                                                                        if (~var383 == -5202) {
                                                                                            class148.field2704[var6++] = class209.method1371(5972);
                                                                                            continue;
                                                                                        }
                                                                                        if (~var383 == -5203) {
                                                                                            --var6;
                                                                                            class149.method1069(class148.field2704[var6], 5);
                                                                                            continue;
                                                                                        }
                                                                                        if (var383 == 5203) {
                                                                                            --var7;
                                                                                            class205.method1360(false, class141.field2560[var7]);
                                                                                            continue;
                                                                                        }
                                                                                        if (~var383 == -5205) {
                                                                                            class141.field2560[var7 + -1] = class94.method646(class141.field2560[var7 - 1], (byte) -58);
                                                                                            continue;
                                                                                        }
                                                                                        if (var383 == 5205) {
                                                                                            --var7;
                                                                                            client.method289(false, class141.field2560[var7]);
                                                                                            continue;
                                                                                        }
                                                                                    }
                                                                                } else if (~var383 == -4401) {
                                                                                    var6 -= 2;
                                                                                    int var190 = class148.field2704[var6];
                                                                                    int var191 = class148.field2704[var6 - -1];
                                                                                    class230 var192 = class191.method1279(var191, -123);
                                                                                    if (var192.method1486(0)) {
                                                                                        class141.field2560[var7++] = class48.method379(48, var190).method1384(var191, var192.field4138, -1);
                                                                                    } else {
                                                                                        class148.field2704[var6++] = class48.method379(105, var190).method1379(var191, var192.field4135, (byte) 65);
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                            } else {
                                                                                if (~var383 == -4101) {
                                                                                    --var7;
                                                                                    class117 var193 = class141.field2560[var7];
                                                                                    --var6;
                                                                                    int var194 = class148.field2704[var6];
                                                                                    class141.field2560[var7++] = class36.method316((byte) -34, new class117[] { var193, class42.method358(var194, (byte) 34) });
                                                                                    continue;
                                                                                }
                                                                                if (~var383 == -4102) {
                                                                                    var7 -= 2;
                                                                                    class117 var195 = class141.field2560[var7];
                                                                                    class117 var196 = class141.field2560[var7 + 1];
                                                                                    class141.field2560[var7++] = class36.method316((byte) -34, new class117[] { var195, var196 });
                                                                                    continue;
                                                                                }
                                                                                if (~var383 == -4103) {
                                                                                    --var7;
                                                                                    class117 var197 = class141.field2560[var7];
                                                                                    --var6;
                                                                                    int var198 = class148.field2704[var6];
                                                                                    class141.field2560[var7++] = class36.method316((byte) -34, new class117[] { var197, class71.method499(true, -8259, var198) });
                                                                                    continue;
                                                                                }
                                                                                if (~var383 == -4104) {
                                                                                    --var7;
                                                                                    class117 var199 = class141.field2560[var7];
                                                                                    class141.field2560[var7++] = var199.method820(-128);
                                                                                    continue;
                                                                                }
                                                                                if (~var383 == -4105) {
                                                                                    --var6;
                                                                                    int var200 = class148.field2704[var6];
                                                                                    long var201 = (long) var200 * 86400000L + 1014768000000L;
                                                                                    class157.field2846.setTime(new Date(var201));
                                                                                    int var203 = class157.field2846.get(5);
                                                                                    int var204 = class157.field2846.get(2);
                                                                                    int var205 = class157.field2846.get(1);
                                                                                    class141.field2560[var7++] = class36.method316((byte) -34, new class117[] { class42.method358(var203, (byte) 34), class10.field362, class117.field2162[var204], class10.field362, class42.method358(var205, (byte) 34) });
                                                                                    continue;
                                                                                }
                                                                                if (var383 == 4105) {
                                                                                    var7 -= 2;
                                                                                    class117 var206 = class141.field2560[var7];
                                                                                    class117 var207 = class141.field2560[var7 + 1];
                                                                                    if (class93.field1712.field1143 != null && class93.field1712.field1143.field1781) {
                                                                                        class141.field2560[var7++] = var207;
                                                                                        continue;
                                                                                    }
                                                                                    class141.field2560[var7++] = var206;
                                                                                    continue;
                                                                                }
                                                                                if (var383 == 4106) {
                                                                                    --var6;
                                                                                    int var208 = class148.field2704[var6];
                                                                                    class141.field2560[var7++] = class42.method358(var208, (byte) 34);
                                                                                    continue;
                                                                                }
                                                                                if (~var383 == -4108) {
                                                                                    var7 -= 2;
                                                                                    class148.field2704[var6++] = class141.field2560[var7].method794(-126, class141.field2560[var7 + 1]);
                                                                                    continue;
                                                                                }
                                                                                if (var383 == 4108) {
                                                                                    var6 -= 2;
                                                                                    --var7;
                                                                                    class117 var209 = class141.field2560[var7];
                                                                                    int var210 = class148.field2704[var6];
                                                                                    int var211 = class148.field2704[var6 - -1];
                                                                                    byte[] var212 = class140.field2552.method104(-55, var211, 0);
                                                                                    class235 var213 = new class235(var212);
                                                                                    var213.method931(class120.field2267, (int[]) null);
                                                                                    class148.field2704[var6++] = var213.method921(var209, var210);
                                                                                    continue;
                                                                                }
                                                                                if (var383 == 4109) {
                                                                                    --var7;
                                                                                    class117 var214 = class141.field2560[var7];
                                                                                    var6 -= 2;
                                                                                    int var215 = class148.field2704[var6];
                                                                                    int var216 = class148.field2704[var6 + 1];
                                                                                    byte[] var217 = class140.field2552.method104(-25, var216, 0);
                                                                                    class235 var218 = new class235(var217);
                                                                                    var218.method931(class120.field2267, (int[]) null);
                                                                                    class148.field2704[var6++] = var218.method943(var214, var215);
                                                                                    continue;
                                                                                }
                                                                                if (~var383 == -4111) {
                                                                                    var7 -= 2;
                                                                                    class117 var219 = class141.field2560[var7];
                                                                                    class117 var220 = class141.field2560[var7 - -1];
                                                                                    --var6;
                                                                                    if (~class148.field2704[var6] == -2) {
                                                                                        class141.field2560[var7++] = var219;
                                                                                    } else {
                                                                                        class141.field2560[var7++] = var220;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (~var383 == -4112) {
                                                                                    --var7;
                                                                                    class117 var221 = class141.field2560[var7];
                                                                                    class141.field2560[var7++] = class138.method925(var221);
                                                                                    continue;
                                                                                }
                                                                                if (~var383 == -4113) {
                                                                                    --var7;
                                                                                    class117 var222 = class141.field2560[var7];
                                                                                    --var6;
                                                                                    int var223 = class148.field2704[var6];
                                                                                    if (~var223 == 0) {
                                                                                        throw new RuntimeException("null char");
                                                                                    }
                                                                                    class141.field2560[var7++] = var222.method783(65, var223);
                                                                                    continue;
                                                                                }
                                                                                if (~var383 == -4114) {
                                                                                    --var6;
                                                                                    int var224 = class148.field2704[var6];
                                                                                    class148.field2704[var6++] = !class9.method66(var224, -5665) ? 0 : 1;
                                                                                    continue;
                                                                                }
                                                                                if (~var383 == -4115) {
                                                                                    --var6;
                                                                                    int var225 = class148.field2704[var6];
                                                                                    class148.field2704[var6++] = !class5.method44(122, var225) ? 0 : 1;
                                                                                    continue;
                                                                                }
                                                                                if (var383 == 4115) {
                                                                                    --var6;
                                                                                    int var226 = class148.field2704[var6];
                                                                                    class148.field2704[var6++] = !class93.method638(var226, (byte) -120) ? 0 : 1;
                                                                                    continue;
                                                                                }
                                                                                if (~var383 == -4117) {
                                                                                    --var6;
                                                                                    int var227 = class148.field2704[var6];
                                                                                    class148.field2704[var6++] = class10.method93(false, var227) ? 1 : 0;
                                                                                    continue;
                                                                                }
                                                                                if (~var383 == -4118) {
                                                                                    --var7;
                                                                                    class117 var228 = class141.field2560[var7];
                                                                                    if (var228 != null) {
                                                                                        class148.field2704[var6++] = var228.method819((byte) -110);
                                                                                    } else {
                                                                                        class148.field2704[var6++] = 0;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (~var383 == -4119) {
                                                                                    --var7;
                                                                                    class117 var229 = class141.field2560[var7];
                                                                                    var6 -= 2;
                                                                                    int var230 = class148.field2704[var6];
                                                                                    int var231 = class148.field2704[var6 + 1];
                                                                                    class141.field2560[var7++] = var229.method781(true, var230, var231);
                                                                                    continue;
                                                                                }
                                                                                if (~var383 == -4120) {
                                                                                    boolean var232 = false;
                                                                                    --var7;
                                                                                    class117 var233 = class141.field2560[var7];
                                                                                    class117 var234 = class34.method304(144, var233.method819((byte) -87));
                                                                                    for (int var235 = 0; ~var233.method819((byte) -120) < ~var235; ++var235) {
                                                                                        int var236 = var233.method777(true, var235);
                                                                                        if (var236 == 60) {
                                                                                            var232 = true;
                                                                                        } else if (var236 != 62) {
                                                                                            if (!var232) {
                                                                                                var234.method800(var236, (byte) 44);
                                                                                            }
                                                                                        } else {
                                                                                            var232 = false;
                                                                                        }
                                                                                    }
                                                                                    var234.method779(26553);
                                                                                    class141.field2560[var7++] = var234;
                                                                                    continue;
                                                                                }
                                                                                if (var383 == 4120) {
                                                                                    --var7;
                                                                                    class117 var237 = class141.field2560[var7];
                                                                                    var6 -= 2;
                                                                                    int var238 = class148.field2704[var6 + 1];
                                                                                    int var239 = class148.field2704[var6];
                                                                                    class148.field2704[var6++] = var237.method816(16323, var239, var238);
                                                                                    continue;
                                                                                }
                                                                                if (~var383 == -4122) {
                                                                                    var7 -= 2;
                                                                                    class117 var240 = class141.field2560[var7 + 1];
                                                                                    --var6;
                                                                                    int var241 = class148.field2704[var6];
                                                                                    class117 var242 = class141.field2560[var7];
                                                                                    class148.field2704[var6++] = var242.method821(var240, var241, false);
                                                                                    continue;
                                                                                }
                                                                                if (~var383 == -4123) {
                                                                                    --var6;
                                                                                    int var243 = class148.field2704[var6];
                                                                                    class148.field2704[var6++] = class231.method1491((byte) -90, var243);
                                                                                    continue;
                                                                                }
                                                                                if (~var383 == -4124) {
                                                                                    --var6;
                                                                                    int var244 = class148.field2704[var6];
                                                                                    class148.field2704[var6++] = class182.method1255((byte) -100, var244);
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (~var383 == -4001) {
                                                                                var6 -= 2;
                                                                                int var245 = class148.field2704[var6 + 1];
                                                                                int var246 = class148.field2704[var6];
                                                                                class148.field2704[var6++] = var246 - -var245;
                                                                                continue;
                                                                            }
                                                                            if (var383 == 4001) {
                                                                                var6 -= 2;
                                                                                int var247 = class148.field2704[var6];
                                                                                int var248 = class148.field2704[var6 + 1];
                                                                                class148.field2704[var6++] = -var248 + var247;
                                                                                continue;
                                                                            }
                                                                            if (var383 == 4002) {
                                                                                var6 -= 2;
                                                                                int var249 = class148.field2704[var6];
                                                                                int var250 = class148.field2704[var6 + 1];
                                                                                class148.field2704[var6++] = var249 * var250;
                                                                                continue;
                                                                            }
                                                                            if (var383 == 4003) {
                                                                                var6 -= 2;
                                                                                int var251 = class148.field2704[var6 - -1];
                                                                                int var252 = class148.field2704[var6];
                                                                                class148.field2704[var6++] = var252 / var251;
                                                                                continue;
                                                                            }
                                                                            if (var383 == 4004) {
                                                                                --var6;
                                                                                int var253 = class148.field2704[var6];
                                                                                class148.field2704[var6++] = (int) ((double) var253 * Math.random());
                                                                                continue;
                                                                            }
                                                                            if (~var383 == -4006) {
                                                                                --var6;
                                                                                int var254 = class148.field2704[var6];
                                                                                class148.field2704[var6++] = (int) (Math.random() * (double) (var254 + 1));
                                                                                continue;
                                                                            }
                                                                            if (~var383 == -4007) {
                                                                                var6 -= 5;
                                                                                int var255 = class148.field2704[var6 + 1];
                                                                                int var256 = class148.field2704[var6 + 4];
                                                                                int var257 = class148.field2704[var6 + 3];
                                                                                int var258 = class148.field2704[var6 - -2];
                                                                                int var259 = class148.field2704[var6];
                                                                                class148.field2704[var6++] = var259 - -((var255 - var259) * (-var258 + var256) / (-var258 + var257));
                                                                                continue;
                                                                            }
                                                                            if (var383 == 4007) {
                                                                                var6 -= 2;
                                                                                long var260 = (long) class148.field2704[var6];
                                                                                long var262 = (long) class148.field2704[var6 + 1];
                                                                                class148.field2704[var6++] = (int) (var260 - -(var260 * var262 / 100L));
                                                                                continue;
                                                                            }
                                                                            if (~var383 == -4009) {
                                                                                var6 -= 2;
                                                                                int var264 = class148.field2704[var6 + 1];
                                                                                int var265 = class148.field2704[var6];
                                                                                class148.field2704[var6++] = class40.method352(1 << var264, var265);
                                                                                continue;
                                                                            }
                                                                            if (~var383 == -4010) {
                                                                                var6 -= 2;
                                                                                int var266 = class148.field2704[var6 + 1];
                                                                                int var267 = class148.field2704[var6];
                                                                                class148.field2704[var6++] = class209.method1370(-(1 << var266) + -1, var267);
                                                                                continue;
                                                                            }
                                                                            if (~var383 == -4011) {
                                                                                var6 -= 2;
                                                                                int var268 = class148.field2704[var6 - -1];
                                                                                int var269 = class148.field2704[var6];
                                                                                class148.field2704[var6++] = ~class209.method1370(var269, 1 << var268) == -1 ? 0 : 1;
                                                                                continue;
                                                                            }
                                                                            if (~var383 == -4012) {
                                                                                var6 -= 2;
                                                                                int var270 = class148.field2704[var6];
                                                                                int var271 = class148.field2704[var6 - -1];
                                                                                class148.field2704[var6++] = var270 % var271;
                                                                                continue;
                                                                            }
                                                                            if (var383 == 4012) {
                                                                                var6 -= 2;
                                                                                int var272 = class148.field2704[var6];
                                                                                int var273 = class148.field2704[var6 + 1];
                                                                                if (var272 == 0) {
                                                                                    class148.field2704[var6++] = 0;
                                                                                } else {
                                                                                    class148.field2704[var6++] = (int) Math.pow((double) var272, (double) var273);
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (var383 == 4013) {
                                                                                var6 -= 2;
                                                                                int var274 = class148.field2704[var6 + 1];
                                                                                int var275 = class148.field2704[var6];
                                                                                if (var275 == 0) {
                                                                                    class148.field2704[var6++] = 0;
                                                                                } else if (~var274 == -1) {
                                                                                    class148.field2704[var6++] = Integer.MAX_VALUE;
                                                                                } else {
                                                                                    class148.field2704[var6++] = (int) Math.pow((double) var275, 1.0D / (double) var274);
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (~var383 == -4015) {
                                                                                var6 -= 2;
                                                                                int var276 = class148.field2704[var6 + 1];
                                                                                int var277 = class148.field2704[var6];
                                                                                class148.field2704[var6++] = class209.method1370(var276, var277);
                                                                                continue;
                                                                            }
                                                                            if (~var383 == -4016) {
                                                                                var6 -= 2;
                                                                                int var278 = class148.field2704[var6];
                                                                                int var279 = class148.field2704[var6 + 1];
                                                                                class148.field2704[var6++] = class40.method352(var278, var279);
                                                                                continue;
                                                                            }
                                                                            if (var383 == 4016) {
                                                                                var6 -= 2;
                                                                                int var280 = class148.field2704[var6];
                                                                                int var281 = class148.field2704[var6 + 1];
                                                                                class148.field2704[var6++] = ~var281 >= ~var280 ? var281 : var280;
                                                                                continue;
                                                                            }
                                                                            if (var383 == 4017) {
                                                                                var6 -= 2;
                                                                                int var282 = class148.field2704[var6];
                                                                                int var283 = class148.field2704[var6 + 1];
                                                                                class148.field2704[var6++] = var283 < var282 ? var282 : var283;
                                                                                continue;
                                                                            }
                                                                            if (~var383 == -4019) {
                                                                                var6 -= 3;
                                                                                long var284 = (long) class148.field2704[var6];
                                                                                long var286 = (long) class148.field2704[var6 + 1];
                                                                                long var288 = (long) class148.field2704[var6 + 2];
                                                                                class148.field2704[var6++] = (int) (var284 * var288 / var286);
                                                                                continue;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (var383 == 3903) {
                                                                            --var6;
                                                                            int var290 = class148.field2704[var6];
                                                                            class148.field2704[var6++] = class175.field3156[var290].method1297((byte) -87);
                                                                            continue;
                                                                        }
                                                                        if (var383 == 3904) {
                                                                            --var6;
                                                                            int var291 = class148.field2704[var6];
                                                                            class148.field2704[var6++] = class175.field3156[var291].field3482;
                                                                            continue;
                                                                        }
                                                                        if (var383 == 3905) {
                                                                            --var6;
                                                                            int var292 = class148.field2704[var6];
                                                                            class148.field2704[var6++] = class175.field3156[var292].field3480;
                                                                            continue;
                                                                        }
                                                                        if (~var383 == -3907) {
                                                                            --var6;
                                                                            int var293 = class148.field2704[var6];
                                                                            class148.field2704[var6++] = class175.field3156[var293].field3472;
                                                                            continue;
                                                                        }
                                                                        if (~var383 == -3908) {
                                                                            --var6;
                                                                            int var294 = class148.field2704[var6];
                                                                            class148.field2704[var6++] = class175.field3156[var294].field3481;
                                                                            continue;
                                                                        }
                                                                        if (var383 == 3908) {
                                                                            --var6;
                                                                            int var295 = class148.field2704[var6];
                                                                            class148.field2704[var6++] = class175.field3156[var295].field3484;
                                                                            continue;
                                                                        }
                                                                        if (var383 == 3910) {
                                                                            --var6;
                                                                            int var296 = class148.field2704[var6];
                                                                            int var297 = class175.field3156[var296].method1296(-106);
                                                                            class148.field2704[var6++] = var297 == 0 ? 1 : 0;
                                                                            continue;
                                                                        }
                                                                        if (var383 == 3911) {
                                                                            --var6;
                                                                            int var298 = class148.field2704[var6];
                                                                            int var299 = class175.field3156[var298].method1296(-109);
                                                                            class148.field2704[var6++] = ~var299 == -3 ? 1 : 0;
                                                                            continue;
                                                                        }
                                                                        if (~var383 == -3913) {
                                                                            --var6;
                                                                            int var300 = class148.field2704[var6];
                                                                            int var301 = class175.field3156[var300].method1296(-113);
                                                                            class148.field2704[var6++] = ~var301 != -6 ? 0 : 1;
                                                                            continue;
                                                                        }
                                                                        if (var383 == 3913) {
                                                                            --var6;
                                                                            int var302 = class148.field2704[var6];
                                                                            int var303 = class175.field3156[var302].method1296(96);
                                                                            class148.field2704[var6++] = var303 == 1 ? 1 : 0;
                                                                            continue;
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (~var383 == -3601) {
                                                                        if (~class169.field3047 != -1) {
                                                                            if (~class169.field3047 == -2) {
                                                                                class148.field2704[var6++] = -1;
                                                                            } else {
                                                                                class148.field2704[var6++] = class151.field2744;
                                                                            }
                                                                        } else {
                                                                            class148.field2704[var6++] = -2;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var383 == 3601) {
                                                                        --var6;
                                                                        int var304 = class148.field2704[var6];
                                                                        if (class169.field3047 == 2 && ~class151.field2744 < ~var304) {
                                                                            class141.field2560[var7++] = class68.field1301[var304];
                                                                            continue;
                                                                        }
                                                                        class141.field2560[var7++] = class53.field1102;
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -3603) {
                                                                        --var6;
                                                                        int var305 = class148.field2704[var6];
                                                                        if (~class169.field3047 == -3 && class151.field2744 > var305) {
                                                                            class148.field2704[var6++] = class99.field1813[var305];
                                                                            continue;
                                                                        }
                                                                        class148.field2704[var6++] = 0;
                                                                        continue;
                                                                    }
                                                                    if (var383 == 3603) {
                                                                        --var6;
                                                                        int var306 = class148.field2704[var6];
                                                                        if (~class169.field3047 == -3 && ~class151.field2744 < ~var306) {
                                                                            class148.field2704[var6++] = class239.field4330[var306];
                                                                            continue;
                                                                        }
                                                                        class148.field2704[var6++] = 0;
                                                                        continue;
                                                                    }
                                                                    if (var383 == 3604) {
                                                                        --var7;
                                                                        class117 var307 = class141.field2560[var7];
                                                                        --var6;
                                                                        int var308 = class148.field2704[var6];
                                                                        class143.method964(var308, 3, var307);
                                                                        continue;
                                                                    }
                                                                    if (var383 == 3605) {
                                                                        --var7;
                                                                        class117 var309 = class141.field2560[var7];
                                                                        class114.method763((byte) 100, var309.method813((byte) 93));
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -3607) {
                                                                        --var7;
                                                                        class117 var310 = class141.field2560[var7];
                                                                        class36.method319(1, var310.method813((byte) 93));
                                                                        continue;
                                                                    }
                                                                    if (var383 == 3607) {
                                                                        --var7;
                                                                        class117 var311 = class141.field2560[var7];
                                                                        class180.method1243((byte) 114, var311.method813((byte) 93));
                                                                        continue;
                                                                    }
                                                                    if (var383 == 3608) {
                                                                        --var7;
                                                                        class117 var312 = class141.field2560[var7];
                                                                        class221.method1440((byte) 35, var312.method813((byte) 93));
                                                                        continue;
                                                                    }
                                                                    if (var383 == 3609) {
                                                                        --var7;
                                                                        class117 var313 = class141.field2560[var7];
                                                                        if (var313.method822(33, class232.field4182) || var313.method822(33, class221.field3992)) {
                                                                            var313 = var313.method802(7, 1176819746);
                                                                        }
                                                                        class148.field2704[var6++] = class25.method220(var313, 0) ? 1 : 0;
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -3611) {
                                                                        --var6;
                                                                        int var314 = class148.field2704[var6];
                                                                        if (~class169.field3047 == -3 && var314 < class151.field2744) {
                                                                            class141.field2560[var7++] = class190.field3384[var314];
                                                                            continue;
                                                                        }
                                                                        class141.field2560[var7++] = class53.field1102;
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -3612) {
                                                                        if (class231.field4157 == null) {
                                                                            class141.field2560[var7++] = class53.field1102;
                                                                        } else {
                                                                            class141.field2560[var7++] = class231.field4157.method796((byte) -40);
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -3613) {
                                                                        if (class231.field4157 == null) {
                                                                            class148.field2704[var6++] = 0;
                                                                        } else {
                                                                            class148.field2704[var6++] = class211.field3840;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -3614) {
                                                                        --var6;
                                                                        int var315 = class148.field2704[var6];
                                                                        if (class231.field4157 != null && var315 < class211.field3840) {
                                                                            class141.field2560[var7++] = class39.field898[var315].field3960.method796((byte) -40);
                                                                            continue;
                                                                        }
                                                                        class141.field2560[var7++] = class53.field1102;
                                                                        continue;
                                                                    }
                                                                    if (var383 == 3614) {
                                                                        --var6;
                                                                        int var316 = class148.field2704[var6];
                                                                        if (class231.field4157 != null && var316 < class211.field3840) {
                                                                            class148.field2704[var6++] = class39.field898[var316].field3969;
                                                                            continue;
                                                                        }
                                                                        class148.field2704[var6++] = 0;
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -3616) {
                                                                        --var6;
                                                                        int var317 = class148.field2704[var6];
                                                                        if (class231.field4157 != null && ~var317 > ~class211.field3840) {
                                                                            class148.field2704[var6++] = class39.field898[var317].field3968;
                                                                            continue;
                                                                        }
                                                                        class148.field2704[var6++] = 0;
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -3617) {
                                                                        class148.field2704[var6++] = class210.field3764;
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -3618) {
                                                                        --var7;
                                                                        class117 var318 = class141.field2560[var7];
                                                                        class69.method487((byte) 81, var318);
                                                                        continue;
                                                                    }
                                                                    if (var383 == 3618) {
                                                                        class148.field2704[var6++] = class130.field2393;
                                                                        continue;
                                                                    }
                                                                    if (var383 == 3619) {
                                                                        --var7;
                                                                        class117 var319 = class141.field2560[var7];
                                                                        class39.method338(-98, var319.method813((byte) 93));
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -3621) {
                                                                        class108.method732((byte) 124);
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -3622) {
                                                                        if (~class169.field3047 == -1) {
                                                                            class148.field2704[var6++] = -1;
                                                                        } else {
                                                                            class148.field2704[var6++] = class85.field1613;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var383 == 3622) {
                                                                        --var6;
                                                                        int var320 = class148.field2704[var6];
                                                                        if (~class169.field3047 != -1 && var320 < class85.field1613) {
                                                                            class141.field2560[var7++] = class162.method1156(class158.field2873[var320], (byte) 125).method796((byte) -40);
                                                                            continue;
                                                                        }
                                                                        class141.field2560[var7++] = class53.field1102;
                                                                        continue;
                                                                    }
                                                                    if (var383 == 3623) {
                                                                        --var7;
                                                                        class117 var321 = class141.field2560[var7];
                                                                        if (var321.method822(33, class232.field4182) || var321.method822(33, class221.field3992)) {
                                                                            var321 = var321.method802(7, 1176819746);
                                                                        }
                                                                        class148.field2704[var6++] = class124.method864(22, var321) ? 1 : 0;
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -3625) {
                                                                        --var6;
                                                                        int var322 = class148.field2704[var6];
                                                                        if (class39.field898 != null && ~class211.field3840 < ~var322 && class39.field898[var322].field3960.method789(class93.field1712.field1141, -126)) {
                                                                            class148.field2704[var6++] = 1;
                                                                            continue;
                                                                        }
                                                                        class148.field2704[var6++] = 0;
                                                                        continue;
                                                                    }
                                                                    if (var383 == 3625) {
                                                                        if (class37.field856 != null) {
                                                                            class141.field2560[var7++] = class37.field856.method796((byte) -40);
                                                                        } else {
                                                                            class141.field2560[var7++] = class53.field1102;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -3627) {
                                                                        --var6;
                                                                        int var323 = class148.field2704[var6];
                                                                        if (class231.field4157 != null && var323 < class211.field3840) {
                                                                            class141.field2560[var7++] = class39.field898[var323].field3958;
                                                                            continue;
                                                                        }
                                                                        class141.field2560[var7++] = class53.field1102;
                                                                        continue;
                                                                    }
                                                                    if (~var383 == -3628) {
                                                                        --var6;
                                                                        int var324 = class148.field2704[var6];
                                                                        if (class169.field3047 == 2 && var324 >= 0 && class151.field2744 > var324) {
                                                                            class148.field2704[var6++] = class148.field2706[var324] ? 1 : 0;
                                                                            continue;
                                                                        }
                                                                        class148.field2704[var6++] = 0;
                                                                        continue;
                                                                    }
                                                                    if (var383 == 3628) {
                                                                        --var7;
                                                                        class117 var325 = class141.field2560[var7];
                                                                        if (var325.method822(33, class232.field4182) || var325.method822(33, class221.field3992)) {
                                                                            var325 = var325.method802(7, 1176819746);
                                                                        }
                                                                        class148.field2704[var6++] = class53.method413(66, var325);
                                                                        continue;
                                                                    }
                                                                }
                                                            } else {
                                                                if (~var383 == -3301) {
                                                                    class148.field2704[var6++] = class44.field966;
                                                                    continue;
                                                                }
                                                                if (var383 == 3301) {
                                                                    var6 -= 2;
                                                                    int var326 = class148.field2704[var6 + 1];
                                                                    int var327 = class148.field2704[var6];
                                                                    class148.field2704[var6++] = class140.method958(0, var327, var326);
                                                                    continue;
                                                                }
                                                                if (~var383 == -3303) {
                                                                    var6 -= 2;
                                                                    int var328 = class148.field2704[var6];
                                                                    int var329 = class148.field2704[var6 + 1];
                                                                    class148.field2704[var6++] = class94.method643(-3, var329, var328);
                                                                    continue;
                                                                }
                                                                if (var383 == 3303) {
                                                                    var6 -= 2;
                                                                    int var330 = class148.field2704[var6];
                                                                    int var331 = class148.field2704[var6 + 1];
                                                                    class148.field2704[var6++] = class210.method1375(var331, var330, -8);
                                                                    continue;
                                                                }
                                                                if (var383 == 3304) {
                                                                    --var6;
                                                                    int var332 = class148.field2704[var6];
                                                                    class148.field2704[var6++] = class55.method421(var332, true).field2708;
                                                                    continue;
                                                                }
                                                                if (~var383 == -3306) {
                                                                    --var6;
                                                                    int var333 = class148.field2704[var6];
                                                                    class148.field2704[var6++] = class196.field3523[var333];
                                                                    continue;
                                                                }
                                                                if (var383 == 3306) {
                                                                    --var6;
                                                                    int var334 = class148.field2704[var6];
                                                                    class148.field2704[var6++] = class115.field2142[var334];
                                                                    continue;
                                                                }
                                                                if (var383 == 3307) {
                                                                    --var6;
                                                                    int var335 = class148.field2704[var6];
                                                                    class148.field2704[var6++] = class177.field3188[var335];
                                                                    continue;
                                                                }
                                                                if (var383 == 3308) {
                                                                    int var336 = class203.field3675;
                                                                    int var337 = (class93.field1712.field4244 >> 7) + class143.field2591;
                                                                    int var338 = (class93.field1712.field4221 >> 7) + class184.field3319;
                                                                    class148.field2704[var6++] = (var336 << 28) + (var337 << 14) + var338;
                                                                    continue;
                                                                }
                                                                if (~var383 == -3310) {
                                                                    --var6;
                                                                    int var339 = class148.field2704[var6];
                                                                    class148.field2704[var6++] = class209.method1370(var339 >> 14, 16383);
                                                                    continue;
                                                                }
                                                                if (~var383 == -3311) {
                                                                    --var6;
                                                                    int var340 = class148.field2704[var6];
                                                                    class148.field2704[var6++] = var340 >> 28;
                                                                    continue;
                                                                }
                                                                if (~var383 == -3312) {
                                                                    --var6;
                                                                    int var341 = class148.field2704[var6];
                                                                    class148.field2704[var6++] = class209.method1370(var341, 16383);
                                                                    continue;
                                                                }
                                                                if (~var383 == -3313) {
                                                                    class148.field2704[var6++] = class226.field4081 ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (var383 == 3313) {
                                                                    var6 -= 2;
                                                                    int var342 = class148.field2704[var6] - -32768;
                                                                    int var343 = class148.field2704[var6 + 1];
                                                                    class148.field2704[var6++] = class140.method958(0, var342, var343);
                                                                    continue;
                                                                }
                                                                if (var383 == 3314) {
                                                                    var6 -= 2;
                                                                    int var344 = class148.field2704[var6] + 32768;
                                                                    int var345 = class148.field2704[var6 + 1];
                                                                    class148.field2704[var6++] = class94.method643(-3, var345, var344);
                                                                    continue;
                                                                }
                                                                if (var383 == 3315) {
                                                                    var6 -= 2;
                                                                    int var346 = class148.field2704[var6] + 32768;
                                                                    int var347 = class148.field2704[var6 - -1];
                                                                    class148.field2704[var6++] = class210.method1375(var347, var346, -24);
                                                                    continue;
                                                                }
                                                                if (var383 == 3316) {
                                                                    if (~class172.field3106 <= -3) {
                                                                        class148.field2704[var6++] = class172.field3106;
                                                                    } else {
                                                                        class148.field2704[var6++] = 0;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var383 == 3317) {
                                                                    class148.field2704[var6++] = class10.field357;
                                                                    continue;
                                                                }
                                                                if (~var383 == -3319) {
                                                                    class148.field2704[var6++] = class10.field361;
                                                                    continue;
                                                                }
                                                                if (~var383 == -3322) {
                                                                    class148.field2704[var6++] = class230.field4146;
                                                                    continue;
                                                                }
                                                                if (~var383 == -3323) {
                                                                    class148.field2704[var6++] = class61.field1236;
                                                                    continue;
                                                                }
                                                                if (~var383 == -3324) {
                                                                    if (~class157.field2863 <= -6 && class157.field2863 <= 9) {
                                                                        class148.field2704[var6++] = 1;
                                                                        continue;
                                                                    }
                                                                    class148.field2704[var6++] = 0;
                                                                    continue;
                                                                }
                                                                if (~var383 == -3325) {
                                                                    if (class157.field2863 >= 5 && ~class157.field2863 >= -10) {
                                                                        class148.field2704[var6++] = class157.field2863;
                                                                        continue;
                                                                    }
                                                                    class148.field2704[var6++] = 0;
                                                                    continue;
                                                                }
                                                                if (~var383 == -3326) {
                                                                    if (class196.field3507 > 0) {
                                                                        class148.field2704[var6++] = 1;
                                                                    } else {
                                                                        class148.field2704[var6++] = 0;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var383 == -3327) {
                                                                    class148.field2704[var6++] = class93.field1712.field1149;
                                                                    continue;
                                                                }
                                                                if (~var383 == -3328) {
                                                                    class148.field2704[var6++] = !class93.field1712.field1143.field1781 ? 0 : 1;
                                                                    continue;
                                                                }
                                                                if (var383 == 3328) {
                                                                    class148.field2704[var6++] = class198.field3548;
                                                                    continue;
                                                                }
                                                                if (var383 == 3329) {
                                                                    class148.field2704[var6++] = class67.field1292;
                                                                    continue;
                                                                }
                                                            }
                                                        } else {
                                                            if (~var383 == -3201) {
                                                                var6 -= 3;
                                                                class73.method515(class148.field2704[var6], class148.field2704[var6 + 1], -80, class148.field2704[var6 + 2]);
                                                                continue;
                                                            }
                                                            if (var383 == 3201) {
                                                                --var6;
                                                                class39.method343(0, class148.field2704[var6]);
                                                                continue;
                                                            }
                                                            if (~var383 == -3203) {
                                                                var6 -= 2;
                                                                class57.method434(class148.field2704[var6], (byte) -70, class148.field2704[var6 - -1]);
                                                                continue;
                                                            }
                                                        }
                                                    } else {
                                                        --var6;
                                                        class9 var348 = class119.method837((byte) 96, class148.field2704[var6]);
                                                        if (var383 == 2800) {
                                                            class148.field2704[var6++] = class181.method1253(class187.method1269(var348, (byte) 16), -47);
                                                            continue;
                                                        }
                                                        if (var383 == 2801) {
                                                            --var6;
                                                            int var349 = class148.field2704[var6];
                                                            int var384 = var349 - 1;
                                                            if (var348.field231 != null && var348.field231.length > var384 && var348.field231[var384] != null) {
                                                                class141.field2560[var7++] = var348.field231[var384];
                                                                continue;
                                                            }
                                                            class141.field2560[var7++] = class53.field1102;
                                                            continue;
                                                        }
                                                        if (var383 == 2802) {
                                                            if (var348.field252 != null) {
                                                                class141.field2560[var7++] = var348.field252;
                                                            } else {
                                                                class141.field2560[var7++] = class53.field1102;
                                                            }
                                                            continue;
                                                        }
                                                    }
                                                } else {
                                                    if (~var383 == -2701) {
                                                        --var6;
                                                        class9 var350 = class119.method837((byte) 112, class148.field2704[var6]);
                                                        class148.field2704[var6++] = var350.field158;
                                                        continue;
                                                    }
                                                    if (~var383 == -2702) {
                                                        --var6;
                                                        class9 var351 = class119.method837((byte) 86, class148.field2704[var6]);
                                                        if (var351.field158 == -1) {
                                                            class148.field2704[var6++] = 0;
                                                        } else {
                                                            class148.field2704[var6++] = var351.field151;
                                                        }
                                                        continue;
                                                    }
                                                    if (~var383 == -2703) {
                                                        --var6;
                                                        int var352 = class148.field2704[var6];
                                                        class73 var353 = (class73) class11.field371.method460((long) var352, 1);
                                                        if (var353 == null) {
                                                            class148.field2704[var6++] = 0;
                                                        } else {
                                                            class148.field2704[var6++] = 1;
                                                        }
                                                        continue;
                                                    }
                                                    if (~var383 == -2704) {
                                                        --var6;
                                                        class9 var354 = class119.method837((byte) 95, class148.field2704[var6]);
                                                        if (var354.field157 == null) {
                                                            class148.field2704[var6++] = 0;
                                                            continue;
                                                        }
                                                        int var355 = var354.field157.length;
                                                        for (int var356 = 0; var356 < var354.field157.length; ++var356) {
                                                            if (var354.field157[var356] == null) {
                                                                var355 = var356;
                                                                break;
                                                            }
                                                        }
                                                        class148.field2704[var6++] = var355;
                                                        continue;
                                                    }
                                                    if (var383 == 2704 || ~var383 == -2706) {
                                                        var6 -= 2;
                                                        int var357 = class148.field2704[var6 + 1];
                                                        int var358 = class148.field2704[var6];
                                                        class73 var359 = (class73) class11.field371.method460((long) var358, 1);
                                                        if (var359 != null && var359.field1397 == var357) {
                                                            class148.field2704[var6++] = 1;
                                                            continue;
                                                        }
                                                        class148.field2704[var6++] = 0;
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                --var6;
                                                class9 var360 = class119.method837((byte) 92, class148.field2704[var6]);
                                                if (~var383 == -2601) {
                                                    class148.field2704[var6++] = var360.field255;
                                                    continue;
                                                }
                                                if (~var383 == -2602) {
                                                    class148.field2704[var6++] = var360.field247;
                                                    continue;
                                                }
                                                if (var383 == 2602) {
                                                    class141.field2560[var7++] = var360.field162;
                                                    continue;
                                                }
                                                if (~var383 == -2604) {
                                                    class148.field2704[var6++] = var360.field170;
                                                    continue;
                                                }
                                                if (~var383 == -2605) {
                                                    class148.field2704[var6++] = var360.field294;
                                                    continue;
                                                }
                                                if (~var383 == -2606) {
                                                    class148.field2704[var6++] = var360.field195;
                                                    continue;
                                                }
                                                if (~var383 == -2607) {
                                                    class148.field2704[var6++] = var360.field229;
                                                    continue;
                                                }
                                                if (~var383 == -2608) {
                                                    class148.field2704[var6++] = var360.field293;
                                                    continue;
                                                }
                                                if (~var383 == -2609) {
                                                    class148.field2704[var6++] = var360.field209;
                                                    continue;
                                                }
                                                if (var383 == 2609) {
                                                    class148.field2704[var6++] = var360.field203;
                                                    continue;
                                                }
                                            }
                                        } else {
                                            --var6;
                                            class9 var361 = class119.method837((byte) 89, class148.field2704[var6]);
                                            if (var383 == 2500) {
                                                class148.field2704[var6++] = var361.field283;
                                                continue;
                                            }
                                            if (var383 == 2501) {
                                                class148.field2704[var6++] = var361.field227;
                                                continue;
                                            }
                                            if (~var383 == -2503) {
                                                class148.field2704[var6++] = var361.field256;
                                                continue;
                                            }
                                            if (~var383 == -2504) {
                                                class148.field2704[var6++] = var361.field207;
                                                continue;
                                            }
                                            if (var383 == 2504) {
                                                class148.field2704[var6++] = var361.field290 ? 1 : 0;
                                                continue;
                                            }
                                            if (var383 == 2505) {
                                                class148.field2704[var6++] = var361.field175;
                                                continue;
                                            }
                                        }
                                    } else {
                                        class9 var362 = !var44 ? class90.field1667 : class149.field2712;
                                        if (var383 == 1800) {
                                            class148.field2704[var6++] = class181.method1253(class187.method1269(var362, (byte) 16), 115);
                                            continue;
                                        }
                                        if (~var383 == -1802) {
                                            --var6;
                                            int var363 = class148.field2704[var6];
                                            int var385 = var363 - 1;
                                            if (var362.field231 != null && var362.field231.length > var385 && var362.field231[var385] != null) {
                                                class141.field2560[var7++] = var362.field231[var385];
                                                continue;
                                            }
                                            class141.field2560[var7++] = class53.field1102;
                                            continue;
                                        }
                                        if (~var383 == -1803) {
                                            if (var362.field252 == null) {
                                                class141.field2560[var7++] = class53.field1102;
                                            } else {
                                                class141.field2560[var7++] = var362.field252;
                                            }
                                            continue;
                                        }
                                    }
                                }
                            } else {
                                class9 var69;
                                if (~var383 > -2001) {
                                    var69 = var44 ? class149.field2712 : class90.field1667;
                                } else {
                                    --var6;
                                    var69 = class119.method837((byte) 127, class148.field2704[var6]);
                                    var383 -= 1000;
                                }
                                class62.method457(var69, 0);
                                if (var383 == 1200 || ~var383 == -1206) {
                                    var6 -= 2;
                                    int var70 = class148.field2704[var6];
                                    int var71 = class148.field2704[var6 + 1];
                                    if (var70 == -1) {
                                        var69.field235 = -1;
                                        var69.field158 = -1;
                                        var69.field245 = 1;
                                    } else {
                                        var69.field158 = var70;
                                        var69.field151 = var71;
                                        class154 var72 = class214.method1408((byte) 102, var70);
                                        var69.field229 = var72.field2810;
                                        if (var383 != 1205) {
                                            var69.field286 = true;
                                        } else {
                                            var69.field286 = false;
                                        }
                                        var69.field150 = var72.field2779;
                                        var69.field202 = var72.field2768;
                                        var69.field293 = var72.field2784;
                                        var69.field195 = var72.field2803;
                                        var69.field209 = var72.field2776;
                                        if (~var69.field179 >= -1) {
                                            if (var69.field222 > 0) {
                                                var69.field195 = var69.field195 * 32 / var69.field222;
                                            }
                                        } else {
                                            var69.field195 = var69.field195 * 32 / var69.field179;
                                        }
                                    }
                                    continue;
                                }
                                if (var383 == 1201) {
                                    var69.field245 = 2;
                                    --var6;
                                    var69.field235 = class148.field2704[var6];
                                    continue;
                                }
                                if (~var383 == -1203) {
                                    var69.field245 = 3;
                                    var69.field235 = class93.field1712.field1143.method656(255);
                                    continue;
                                }
                                if (~var383 == -1204) {
                                    var69.field245 = 6;
                                    --var6;
                                    var69.field235 = class148.field2704[var6];
                                    continue;
                                }
                                if (~var383 == -1205) {
                                    var69.field245 = 5;
                                    --var6;
                                    var69.field235 = class148.field2704[var6];
                                    continue;
                                }
                            }
                        } else {
                            class9 var65;
                            if (var383 < 2000) {
                                var65 = var44 ? class149.field2712 : class90.field1667;
                            } else {
                                var383 -= 1000;
                                --var6;
                                var65 = class119.method837((byte) 100, class148.field2704[var6]);
                            }
                            if (var383 == 1000) {
                                var65.field276 = 0;
                                var6 -= 2;
                                var65.field283 = var65.field258 = class148.field2704[var6];
                                var65.field248 = 0;
                                var65.field227 = var65.field163 = class148.field2704[var6 + 1];
                                class62.method457(var65, 0);
                                continue;
                            }
                            if (var383 == 1001) {
                                var6 -= 2;
                                var65.field215 = 0;
                                var65.field256 = var65.field222 = class148.field2704[var6];
                                var65.field179 = 0;
                                var65.field161 = 0;
                                var65.field207 = var65.field304 = class148.field2704[var6 + 1];
                                var65.field226 = 0;
                                class62.method457(var65, 0);
                                if (var65.field225 == 0) {
                                    class201.method1338((byte) -87, false, var65);
                                }
                                class201.method1345(var65, (byte) 100);
                                continue;
                            }
                            if (~var383 == -1004) {
                                --var6;
                                boolean var66 = ~class148.field2704[var6] == -2;
                                if (!var66 != !var65.field290) {
                                    var65.field290 = var66;
                                    class62.method457(var65, 0);
                                }
                                continue;
                            }
                            if (~var383 == -1005) {
                                var6 -= 4;
                                var65.field258 = class148.field2704[var6];
                                var65.field163 = class148.field2704[var6 + 1];
                                int var67 = class148.field2704[var6 + 2];
                                if (~var67 <= -1) {
                                    if (~var67 < -3) {
                                        var67 = 2;
                                    }
                                } else {
                                    var67 = 0;
                                }
                                int var68 = class148.field2704[var6 - -3];
                                if (~var68 <= -1) {
                                    if (var68 > 2) {
                                        var68 = 2;
                                    }
                                } else {
                                    var68 = 0;
                                }
                                var65.field276 = (byte) (var67 + 3);
                                var65.field248 = (byte) (var68 + 3);
                                class62.method457(var65, 0);
                                class201.method1345(var65, (byte) 98);
                                continue;
                            }
                            if (var383 == 1005) {
                                var6 -= 2;
                                var65.field276 = 2;
                                var65.field258 = class148.field2704[var6];
                                var65.field248 = 2;
                                var65.field163 = class148.field2704[var6 + 1];
                                class62.method457(var65, 0);
                                if (~var65.field225 == -1) {
                                    class201.method1338((byte) -87, false, var65);
                                }
                                class201.method1345(var65, (byte) 107);
                                continue;
                            }
                        }
                        throw new IllegalStateException();
                    }
                } catch (Exception var382) {
                    if (var5.field4022 == null) {
                        if (class30.field723 != 0) {
                            class14.method129(class53.field1102, class231.field4151, 0, 0);
                        }
                        class147.method1055(6678, "CS2 - scr:" + var5.field389 + " op:" + var11, var382);
                    } else {
                        class117 var379 = class34.method304(144, 30);
                        var379.method807((byte) -8, class19.field541).method807((byte) -8, var5.field4022);
                        for (int var380 = class49.field1033 - 1; var380 >= 0; --var380) {
                            var379.method807((byte) -8, class81.field1535).method807((byte) -8, class193.field3450[var380].field3264.field4022);
                        }
                        if (var11 == 40) {
                            int var381 = var9[var8];
                            var379.method807((byte) -8, class212.field3860).method807((byte) -8, class42.method358(var381, (byte) 34));
                        }
                        if (class30.field723 != 0) {
                            class14.method129(class53.field1102, class36.method316((byte) -34, new class117[] { class155.field2830, var5.field4022 }), 0, 0);
                        }
                        class147.method1055(6678, "CS2 - scr:" + var5.field389 + " op:" + var11 + new String(var379.method815((byte) 112)), var382);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
    public class229() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)[[I")
    public final int[][] method116(int arg0, int arg1) {
        ++field4130;
        if (arg1 != -9179) {
            method1481((byte) -15);
        }
        int[][] var3 = super.field3022.method1148(arg0, 8708);
        if (super.field3022.field2957) {
            int[][] var4 = this.method1180(arg0, 26851, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class115.field2146 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field4126[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field4127) {
                    var7[var11] = var12;
                    var8[var11] = var9[var11];
                    var10[var11] = var6[var11];
                } else {
                    int var14 = var9[var11];
                    int var15 = -this.field4126[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 > this.field4127) {
                        var7[var11] = var12;
                        var8[var11] = var14;
                        var10[var11] = var6[var11];
                    } else {
                        int var16 = var6[var11];
                        int var17 = -this.field4126[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field4127 < var17) {
                            var7[var11] = var12;
                            var8[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var7[var11] = this.field4119 * var12 >> 12;
                            var8[var11] = this.field4131 * var14 >> 12;
                            var10[var11] = this.field4123 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
