import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class122 extends class59 {

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "[Ldj;")
    public static class44[] field2161 = new class44[200];

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "[Lca;")
    public static class24[] field2168 = new class24[2048];

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "Ldj;")
    private static class44 field2171 = class89.method650(255, "Enter your username (V password)3");

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "Ldj;")
    public static class44 field2164 = field2171;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Lri;")
    public static class189 field2159 = new class189(64);

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "Ldj;")
    public static class44 field2173 = class89.method650(255, "Schlie-8en");

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "[[I")
    public static int[][] field2174 = new int[104][104];

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "Ldj;")
    public static class44 field2172 = class89.method650(255, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "Ldj;")
    public static class44 field2175 = class89.method650(255, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "Lve;")
    public static class225 field2162;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "Lve;")
    public static class225 field2165;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "Lve;")
    public static class225 field2166;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Z")
    public static final boolean method835(int arg0, int arg1) {
        field2167++;
        if (class157.field2744[arg0]) {
            return true;
        } else if (class152.field2652.method1468(true, arg0)) {
            int var2 = class152.field2652.method1473(arg1 + 20725, arg0);
            if (var2 == 0) {
                class157.field2744[arg0] = true;
                return true;
            }
            if (class4.field52[arg0] == null) {
                class4.field52[arg0] = new class223[var2];
            }
            if (arg1 != 31) {
                field2176 = -6;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class4.field52[arg0][var3] == null) {
                    byte[] var4 = class152.field2652.method1466(arg0, var3, (byte) -120);
                    if (var4 != null) {
                        class4.field52[arg0][var3] = new class223();
                        class4.field52[arg0][var3].field4040 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class4.field52[arg0][var3].method1445(5, new class66(var4));
                        } else {
                            class4.field52[arg0][var3].method1438(-46, new class66(var4));
                        }
                    }
                }
            }
            class157.field2744[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIILfj;I)V")
    public static final void method836(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class66 arg6, int arg7) {
        if (arg2 >= 0 && arg2 < 104 && arg4 >= 0 && arg4 < 104) {
            class47.field875[arg7][arg2][arg4] = 0;
            while (true) {
                int var8 = arg6.method506(255);
                if (var8 == 0) {
                    if (arg7 == 0) {
                        class211.field3771[0][arg2][arg4] = -class212.method1370((byte) -92, arg5 + arg4 + 556238, arg0 + arg2 + 932731) * 8;
                    } else {
                        class211.field3771[arg7][arg2][arg4] = class211.field3771[arg7 - 1][arg2][arg4] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg6.method506(255);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg7 == 0) {
                        class211.field3771[0][arg2][arg4] = -var9 * 8;
                    } else {
                        class211.field3771[arg7][arg2][arg4] = class211.field3771[arg7 - 1][arg2][arg4] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class201.field3564[arg7][arg2][arg4] = arg6.method505(false);
                    class165.field2845[arg7][arg2][arg4] = (byte) ((var8 - 2) / 4);
                    class221.field4005[arg7][arg2][arg4] = (byte) class29.method202(arg1 + var8 - 2, 3);
                } else if (var8 <= 81) {
                    class47.field875[arg7][arg2][arg4] = (byte) (var8 - 49);
                } else {
                    class30.field526[arg7][arg2][arg4] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg6.method506(255);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg6.method506(arg3 ^ 0xE3B84);
                    break;
                }
                if (var10 <= 49) {
                    arg6.method506(255);
                }
            }
        }
        if (arg3 == 932731) {
            field2160++;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[Lvc;IIIIIII)V")
    public static final void method837(int arg0, class223[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var9 = 0; var9 < arg1.length; var9++) {
            class223 var10 = arg1[var9];
            if (var10 != null && (!var10.field4118 || var10.field4076 == 0 || var10.field4125 || class117.method821(var10, 21064) != 0 || class61.field1148 == var10 || var10.field4033 == 1338) && var10.field4170 == arg3 && (!var10.field4118 || !class54.method391(var10, (byte) -63))) {
                int var11 = var10.field4039 + arg0;
                int var12 = var10.field4043 + arg5;
                if (class235.field4364 == var10) {
                    class203.field3635 = true;
                    class76.field1458 = var12;
                    class70.field1338 = var11;
                }
                int var13;
                int var14;
                int var15;
                int var16;
                if (var10.field4076 == 2) {
                    var13 = arg7;
                    var14 = arg8;
                    var15 = arg4;
                    var16 = arg6;
                } else {
                    var16 = var11 > arg6 ? var11 : arg6;
                    int var17 = var10.field4130 + var11;
                    var13 = arg7 < var12 ? var12 : arg7;
                    int var18 = var10.field4134 + var12;
                    if (var10.field4076 == 9) {
                        var17++;
                        var18++;
                    }
                    var15 = arg4 <= var17 ? arg4 : var17;
                    var14 = var18 >= arg8 ? arg8 : var18;
                }
                if (!var10.field4118 || var15 > var16 && var13 < var14) {
                    if (var10.field4076 == 0) {
                        if (!var10.field4118 && class54.method391(var10, (byte) -63) && class226.field4253 != var10) {
                            continue;
                        }
                        if (var10.field4086 && var16 <= class27.field486 && class7.field151 >= var13 && class27.field486 < var15 && var14 > class7.field151) {
                            for (class140 var19 = (class140) class189.field3259.method1189(0); var19 != null; var19 = (class140) class189.field3259.method1192((byte) -115)) {
                                if (var19.field2516) {
                                    var19.method1148(-13215);
                                }
                            }
                            for (class140 var20 = (class140) class54.field987.method1189(0); var20 != null; var20 = (class140) class54.field987.method1192((byte) -87)) {
                                if (var20.field2516) {
                                    var20.method1148(-13215);
                                }
                            }
                            class119.field2121 = false;
                            if (class205.field3669 == 0) {
                                class61.field1148 = null;
                                class235.field4364 = null;
                            }
                        }
                    }
                    if (var10.field4118) {
                        boolean var21;
                        if (var16 <= class27.field486 && class7.field151 >= var13 && var15 > class27.field486 && class7.field151 < var14) {
                            var21 = true;
                        } else {
                            var21 = false;
                        }
                        boolean var22 = false;
                        boolean var23 = false;
                        if (class194.field3393 == 1 && var16 <= class180.field3108 && class102.field1860 >= var13 && var15 > class180.field3108 && var14 > class102.field1860) {
                            var23 = true;
                        }
                        if (class213.field3821 == 1 && var21) {
                            var22 = true;
                        }
                        if (var23) {
                            class183.method1151(class180.field3108 - var11, -var12 + class102.field1860, (byte) 89, var10);
                        }
                        if (class235.field4364 != null && class235.field4364 != var10 && var21 && class128.method877(class117.method821(var10, 21064), 8672)) {
                            class205.field3681 = var10;
                        }
                        if (class61.field1148 == var10) {
                            class213.field3825 = var11;
                            class171.field2986 = true;
                            class70.field1320 = var12;
                        }
                        if (var10.field4125 || var10.field4033 != 0) {
                            if (var21 && class213.field3822 != 0 && var10.field4031 != null) {
                                class140 var24 = new class140();
                                var24.field2507 = var10;
                                var24.field2503 = class213.field3822;
                                var24.field2516 = true;
                                var24.field2506 = var10.field4031;
                                class189.field3259.method1185(var24, (byte) -110);
                            }
                            if (class235.field4364 != null || class220.field3989 != null || class58.field1086 || var10.field4033 != 1400 && class119.field2121) {
                                var21 = false;
                                var22 = false;
                                var23 = false;
                            }
                            if (var10.field4033 == 1337) {
                                class225.method1457(92, var10);
                                continue;
                            }
                            if (var10.field4033 == 1338) {
                                if (var23) {
                                    class112.method790((byte) -126, var10, class180.field3108 - var11, class102.field1860 - var12);
                                }
                                continue;
                            }
                            if (var10.field4033 == 1400) {
                                class48.field895 = var10;
                                if (var23) {
                                    if (class130.field2324[82] && class30.field543 > 0) {
                                        int var25 = (int) ((double) (class180.field3108 - var11 - var10.field4130 / 2) * 2.0D / class202.field3601) + class2.field38 + class198.field3502;
                                        int var26 = class136.field2431 + class214.field3851 - class3.field46 - (int) ((double) (class102.field1860 - var10.field4134 / 2 + -var12) * 2.0D / class202.field3601);
                                        class44 var27 = class70.method555(new class44[] { class50.field924, class199.method1287(var25 >> 6, -1), class204.field3662, class199.method1287(var26 >> 6, -1), class204.field3662, class199.method1287(var25 & 0x3F, -1), class204.field3662, class199.method1287(var26 & 0x3F, -1) }, -3);
                                        var27.method335(true);
                                        class207.method1350(var27, -23357);
                                        class170.method1081((byte) 123);
                                        continue;
                                    }
                                    class182.field3166 = class3.field46;
                                    class215.field3919 = class7.field151;
                                    class133.field2380 = class2.field38;
                                    class213.field3824 = class27.field486;
                                    class119.field2121 = true;
                                    continue;
                                }
                                if (var22 && class119.field2121) {
                                    class170.method1085((int) ((double) (class213.field3824 - class27.field486) * 2.0D / class32.field565) + class133.field2380, (byte) 39);
                                    class226.method1482((int) ((double) (class215.field3919 - class7.field151) * 2.0D / class32.field565) + class182.field3166, (byte) -41);
                                    continue;
                                }
                                class119.field2121 = false;
                                continue;
                            }
                            if (var10.field4033 == 1401) {
                                if (var22) {
                                    class59.method446(var10.field4130, class7.field151 - var12, var10.field4134, class27.field486 - var11, (byte) -65);
                                }
                                continue;
                            }
                            if (!var10.field4028 && var23) {
                                var10.field4028 = true;
                                if (var10.field4129 != null) {
                                    class140 var28 = new class140();
                                    var28.field2506 = var10.field4129;
                                    var28.field2507 = var10;
                                    var28.field2505 = class180.field3108 - var11;
                                    var28.field2503 = class102.field1860 - var12;
                                    var28.field2516 = true;
                                    class189.field3259.method1185(var28, (byte) -110);
                                }
                            }
                            if (var10.field4028 && var22 && var10.field4152 != null) {
                                class140 var29 = new class140();
                                var29.field2505 = class27.field486 - var11;
                                var29.field2506 = var10.field4152;
                                var29.field2503 = class7.field151 - var12;
                                var29.field2516 = true;
                                var29.field2507 = var10;
                                class189.field3259.method1185(var29, (byte) -110);
                            }
                            if (var10.field4028 && !var22) {
                                var10.field4028 = false;
                                if (var10.field4131 != null) {
                                    class140 var30 = new class140();
                                    var30.field2507 = var10;
                                    var30.field2506 = var10.field4131;
                                    var30.field2505 = class27.field486 - var11;
                                    var30.field2516 = true;
                                    var30.field2503 = class7.field151 - var12;
                                    class54.field987.method1185(var30, (byte) -110);
                                }
                            }
                            if (var22 && var10.field4032 != null) {
                                class140 var31 = new class140();
                                var31.field2516 = true;
                                var31.field2507 = var10;
                                var31.field2503 = class7.field151 - var12;
                                var31.field2506 = var10.field4032;
                                var31.field2505 = class27.field486 - var11;
                                class189.field3259.method1185(var31, (byte) -110);
                            }
                            if (!var10.field4147 && var21) {
                                var10.field4147 = true;
                                if (var10.field4113 != null) {
                                    class140 var32 = new class140();
                                    var32.field2505 = class27.field486 - var11;
                                    var32.field2516 = true;
                                    var32.field2503 = class7.field151 - var12;
                                    var32.field2506 = var10.field4113;
                                    var32.field2507 = var10;
                                    class189.field3259.method1185(var32, (byte) -110);
                                }
                            }
                            if (var10.field4147 && var21 && var10.field4084 != null) {
                                class140 var33 = new class140();
                                var33.field2516 = true;
                                var33.field2503 = class7.field151 - var12;
                                var33.field2506 = var10.field4084;
                                var33.field2505 = class27.field486 - var11;
                                var33.field2507 = var10;
                                class189.field3259.method1185(var33, (byte) -110);
                            }
                            if (var10.field4147 && !var21) {
                                var10.field4147 = false;
                                if (var10.field4069 != null) {
                                    class140 var34 = new class140();
                                    var34.field2516 = true;
                                    var34.field2507 = var10;
                                    var34.field2506 = var10.field4069;
                                    var34.field2505 = class27.field486 - var11;
                                    var34.field2503 = class7.field151 - var12;
                                    class54.field987.method1185(var34, (byte) -110);
                                }
                            }
                            if (var10.field4065 != null) {
                                class140 var35 = new class140();
                                var35.field2506 = var10.field4065;
                                var35.field2507 = var10;
                                class101.field1847.method1185(var35, (byte) -110);
                            }
                            if (var10.field4029 != null && var10.field4137 < class79.field1527) {
                                if (var10.field4159 == null || class79.field1527 - var10.field4137 > 32) {
                                    class140 var40 = new class140();
                                    var40.field2507 = var10;
                                    var40.field2506 = var10.field4029;
                                    class189.field3259.method1185(var40, (byte) -110);
                                } else {
                                    label433: for (int var36 = var10.field4137; var36 < class79.field1527; var36++) {
                                        int var37 = class207.field3714[var36 & 0x1F];
                                        for (int var38 = 0; var38 < var10.field4159.length; var38++) {
                                            if (var10.field4159[var38] == var37) {
                                                class140 var39 = new class140();
                                                var39.field2507 = var10;
                                                var39.field2506 = var10.field4029;
                                                class189.field3259.method1185(var39, (byte) -110);
                                                break label433;
                                            }
                                        }
                                    }
                                }
                                var10.field4137 = class79.field1527;
                            }
                            if (var10.field4112 != null && var10.field4034 < class13.field261) {
                                if (var10.field4053 == null || class13.field261 - var10.field4034 > 32) {
                                    class140 var45 = new class140();
                                    var45.field2506 = var10.field4112;
                                    var45.field2507 = var10;
                                    class189.field3259.method1185(var45, (byte) -110);
                                } else {
                                    label409: for (int var41 = var10.field4034; var41 < class13.field261; var41++) {
                                        int var42 = class61.field1144[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var10.field4053.length; var43++) {
                                            if (var10.field4053[var43] == var42) {
                                                class140 var44 = new class140();
                                                var44.field2507 = var10;
                                                var44.field2506 = var10.field4112;
                                                class189.field3259.method1185(var44, (byte) -110);
                                                break label409;
                                            }
                                        }
                                    }
                                }
                                var10.field4034 = class13.field261;
                            }
                            if (var10.field4082 != null && class237.field4399 > var10.field4075) {
                                if (var10.field4167 == null || class237.field4399 - var10.field4075 > 32) {
                                    class140 var50 = new class140();
                                    var50.field2507 = var10;
                                    var50.field2506 = var10.field4082;
                                    class189.field3259.method1185(var50, (byte) -110);
                                } else {
                                    label385: for (int var46 = var10.field4075; var46 < class237.field4399; var46++) {
                                        int var47 = class163.field2820[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var10.field4167.length; var48++) {
                                            if (var10.field4167[var48] == var47) {
                                                class140 var49 = new class140();
                                                var49.field2506 = var10.field4082;
                                                var49.field2507 = var10;
                                                class189.field3259.method1185(var49, (byte) -110);
                                                break label385;
                                            }
                                        }
                                    }
                                }
                                var10.field4075 = class237.field4399;
                            }
                            if (class37.field666 > var10.field4109 && var10.field4054 != null) {
                                class140 var51 = new class140();
                                var51.field2506 = var10.field4054;
                                var51.field2507 = var10;
                                class189.field3259.method1185(var51, (byte) -110);
                            }
                            if (class143.field2531 > var10.field4109 && var10.field4049 != null) {
                                class140 var52 = new class140();
                                var52.field2507 = var10;
                                var52.field2506 = var10.field4049;
                                class189.field3259.method1185(var52, (byte) -110);
                            }
                            if (class59.field1098 > var10.field4109 && var10.field4154 != null) {
                                class140 var53 = new class140();
                                var53.field2506 = var10.field4154;
                                var53.field2507 = var10;
                                class189.field3259.method1185(var53, (byte) -110);
                            }
                            if (class157.field2741 > var10.field4109 && var10.field4100 != null) {
                                class140 var54 = new class140();
                                var54.field2507 = var10;
                                var54.field2506 = var10.field4100;
                                class189.field3259.method1185(var54, (byte) -110);
                            }
                            if (var10.field4109 < class189.field3272 && var10.field4172 != null) {
                                class140 var55 = new class140();
                                var55.field2507 = var10;
                                var55.field2506 = var10.field4172;
                                class189.field3259.method1185(var55, (byte) -110);
                            }
                            var10.field4109 = class66.field1251;
                            if (var10.field4141 != null) {
                                for (int var56 = 0; var56 < class184.field3203; var56++) {
                                    class140 var57 = new class140();
                                    var57.field2507 = var10;
                                    var57.field2513 = class179.field3105[var56];
                                    var57.field2515 = class40.field759[var56];
                                    var57.field2506 = var10.field4141;
                                    class189.field3259.method1185(var57, (byte) -110);
                                }
                            }
                        }
                    }
                    if (!var10.field4118 && class235.field4364 == null && class220.field3989 == null && !class58.field1086) {
                        if ((var10.field4093 >= 0 || var10.field4119 != 0) && var16 <= class27.field486 && class7.field151 >= var13 && var15 > class27.field486 && class7.field151 < var14) {
                            if (var10.field4093 < 0) {
                                class226.field4253 = var10;
                            } else {
                                class226.field4253 = arg1[var10.field4093];
                            }
                        }
                        if (var10.field4076 == 8 && var16 <= class27.field486 && var13 <= class7.field151 && class27.field486 < var15 && var14 > class7.field151) {
                            class48.field903 = var10;
                        }
                        if (var10.field4025 > var10.field4134) {
                            class68.method543(var10.field4134, var10.field4130 + var11, class7.field151, var10, -125, class27.field486, var10.field4025, var12);
                        }
                    }
                    if (var10.field4076 == 0) {
                        method837(var11 - var10.field4132, arg1, -126, var10.field4040, var15, var12 - var10.field4026, var16, var13, var14);
                        if (var10.field4169 != null) {
                            method837(var11 - var10.field4132, var10.field4169, -128, var10.field4040, var15, var12 - var10.field4026, var16, var13, var14);
                        }
                        class104 var58 = (class104) class129.field2294.method828((long) var10.field4040, (byte) -40);
                        if (var58 != null) {
                            class106.method769(var16, var11, var58.field1893, var14, var12, var15, var13, (byte) 25);
                        }
                    }
                }
            }
        }
        if (arg2 <= -124) {
            field2158++;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBIII)V")
    public static final void method838(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -35) {
            method838(21, (byte) 55, -91, 37, -7);
        }
        for (int var5 = 0; var5 < class29.field502; var5++) {
            if (class172.field2999[var5] + class128.field2277[var5] > arg4 && arg0 + arg4 > class172.field2999[var5] && arg3 < class166.field2860[var5] + class158.field2749[var5] && class166.field2860[var5] < arg2 + arg3) {
                class187.field3219[var5] = true;
            }
        }
        field2170++;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)V")
    public static final void method839(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= arg3) {
            class42.method290(class108.field1979[arg0], arg1 ^ 0x1EBD, arg3, arg2, arg4);
        } else {
            class42.method290(class108.field1979[arg0], -7, arg2, arg3, arg4);
        }
        field2163++;
        if (arg1 != -7868) {
            field2175 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public static final void method840(int arg0) {
        class175.field3039 = null;
        class38.field672 = null;
        class88.field1684 = null;
        if (arg0 == -33) {
            class58.field1082 = null;
            class170.field2933 = null;
            class94.field1745 = null;
            field2169++;
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
    public static void method841(int arg0) {
        field2161 = null;
        field2168 = null;
        field2172 = null;
        field2165 = null;
        if (arg0 > -116) {
            field2164 = null;
        }
        field2164 = null;
        field2162 = null;
        field2173 = null;
        field2175 = null;
        field2171 = null;
        field2166 = null;
        field2174 = null;
        field2159 = null;
    }
}
