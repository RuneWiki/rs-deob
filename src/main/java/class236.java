import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class236 extends class447 {

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "Llq;")
    public static class5 field3537 = new class5();

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public int field3533;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public int field3534;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public int field3535;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    public int field3539;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "Liq;")
    public static class134 field3543;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "Lmr;")
    public class145 field3538;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "Lil;")
    public static class42 field3536;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "[[B")
    public static byte[][] field3544;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BILjava/awt/Component;Lsc;I)Lil;")
    public static final class42 method1423(byte arg0, int arg1, Component arg2, class239 arg3, int arg4) {
        field3540++;
        if (class81.field1082 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class42 var5 = (class42) Class.forName("hb").getDeclaredConstructor().newInstance();
                var5.field525 = arg4;
                var5.field520 = new int[(class278.field4229 ? 2 : 1) * 256];
                var5.method243(arg2);
                var5.field532 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field532 > 16384) {
                    var5.field532 = 16384;
                }
                var5.method242(var5.field532);
                if (class327.field4921 > 0 && class307.field4636 == null) {
                    class307.field4636 = new class363();
                    class307.field4636.field5342 = arg3;
                    arg3.method1438(false, class327.field4921, class307.field4636);
                }
                if (class307.field4636 != null) {
                    if (class307.field4636.field5338[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class307.field4636.field5338[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class256 var6 = new class256(arg3, arg1);
                    var6.field525 = arg4;
                    var6.field520 = new int[(class278.field4229 ? 2 : 1) * 256];
                    var6.method243(arg2);
                    var6.field532 = 16384;
                    var6.method242(var6.field532);
                    if (arg0 > -73) {
                        field3543 = null;
                    }
                    if (class327.field4921 > 0 && class307.field4636 == null) {
                        class307.field4636 = new class363();
                        class307.field4636.field5342 = arg3;
                        arg3.method1438(false, class327.field4921, class307.field4636);
                    }
                    if (class307.field4636 != null) {
                        if (class307.field4636.field5338[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class307.field4636.field5338[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class42();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lmf;Ldc;)V")
    public static final void method1424(class45 arg0, class13 arg1) {
        if (!arg1.field144) {
            return;
        }
        short var2 = arg1.field157;
        short var3 = arg1.field148;
        byte var4 = arg1.field154;
        byte var5 = arg1.field150;
        int var6 = (var2 << class254.field3869) + class267.field4058;
        int var7 = (var3 << class254.field3869) + class267.field4058;
        class13[][] var8 = class277.field4216[var4];
        float var10;
        if (class307.field4638 == class154.field2118) {
            int var9 = class246.field3684[var2][var3];
            class1.field14.method405(class85.field1201[0].method100(var6, var7), var9 & 0xFFFFFF, var9 >>> 21 & 0x7F8);
            var10 = 251.5F;
        } else {
            var10 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class1.field14.method423(3000.0F, var10 * 1.5F);
        if (arg1.field162) {
            if (class302.field4565) {
                if (var4 > 0) {
                    class13 var11 = class277.field4216[var4 - 1][var2][var3];
                    if (var11 != null && var11.field144) {
                        return;
                    }
                }
                if (var2 <= class319.field4825 && var2 > class452.field6686) {
                    class13 var12 = var8[var2 - 1][var3];
                    if (var12 != null && var12.field144 && (var12.field162 || (arg1.field141 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class319.field4825 && var2 < class44.field553 - 1) {
                    class13 var13 = var8[var2 + 1][var3];
                    if (var13 != null && var13.field144 && (var13.field162 || (arg1.field141 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class426.field6265 && var3 > class337.field5008) {
                    class13 var14 = var8[var2][var3 - 1];
                    if (var14 != null && var14.field144 && (var14.field162 || (arg1.field141 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class426.field6265 && var3 < class196.field2958 - 1) {
                    class13 var15 = var8[var2][var3 + 1];
                    if (var15 != null && var15.field144 && (var15.field162 || (arg1.field141 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class302.field4565 = true;
            }
            arg1.field162 = false;
            if (arg1.field146 != null) {
                class13 var16 = arg1.field146;
                class1.field14.method423(3000.0F, (201.5F - (float) (var16.field150 + 1) * 50.0F) * 1.5F);
                if (!class331.method2032(var16.field150, var2, var3)) {
                    class307.field4638[var16.field150].method104(var2, var3);
                }
                class233 var17 = var16.field167;
                if (var17 != null) {
                    if (class385.field5626) {
                        if ((var17.field3526 & arg1.field145) == 0) {
                            class42.method235(arg0, var4, var2, var3);
                        } else {
                            class299.method1850(arg0, var17.field3526, var5, var2, var3);
                        }
                        class1.field14.method408(arg0.field559, arg0.field554);
                    }
                    var17.method10(class1.field14, 7);
                }
                for (class466 var18 = var16.field151; var18 != null; var18 = var18.field6853) {
                    class141 var19 = var18.field6862;
                    if (var19 != null) {
                        if (class385.field5626) {
                            class42.method235(arg0, var4, var2, var3);
                            class1.field14.method408(arg0.field559, arg0.field554);
                        }
                        var19.method10(class1.field14, 7);
                    }
                }
                class1.field14.method423(3000.0F, var10 * 1.5F);
            }
            boolean var20 = !class331.method2032(var5, var2, var3);
            if (var20) {
                class307.field4638[var5].method104(var2, var3);
                class316 var21 = arg1.field166;
                if (var21 != null && var21.field4784) {
                    if (var21.field4781) {
                        class1.field14.method423(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class385.field5626) {
                        class42.method235(arg0, var4, var2, var3);
                        class1.field14.method408(arg0.field559, arg0.field554);
                    }
                    class70 var22 = var21.method10(class1.field14, 7);
                    if (var22 != null) {
                        var22.field901 = var21;
                        var22.field897 = var4;
                        var22.field898 = var2;
                        var22.field900 = var3;
                        class47.field577.method2125(var22, -29983);
                    }
                    if (var21.field4781) {
                        class1.field14.method423(3000.0F, var10 * 1.5F);
                    }
                }
            }
            int var23 = 0;
            int var24 = 0;
            class233 var25 = arg1.field167;
            class337 var26 = arg1.field164;
            if (var25 != null || var26 != null) {
                if (class319.field4825 == var2) {
                    var23++;
                } else if (class319.field4825 < var2) {
                    var23 += 2;
                }
                if (class426.field6265 == var3) {
                    var23 += 3;
                } else if (class426.field6265 > var3) {
                    var23 += 6;
                }
                var24 = class63.field793[var23];
                arg1.field145 = class13.field160[var23];
            }
            if (var25 != null) {
                if ((var25.field3526 & class201.field3035[var23]) == 0) {
                    arg1.field158 = 0;
                } else if (var25.field3526 == 16) {
                    arg1.field158 = 3;
                    arg1.field147 = class11.field123[var23];
                    arg1.field161 = (byte) (3 - arg1.field147);
                } else if (var25.field3526 == 32) {
                    arg1.field158 = 6;
                    arg1.field147 = class394.field5919[var23];
                    arg1.field161 = (byte) (6 - arg1.field147);
                } else if (var25.field3526 == 64) {
                    arg1.field158 = 12;
                    arg1.field147 = class451.field6651[var23];
                    arg1.field161 = (byte) (12 - arg1.field147);
                } else {
                    arg1.field158 = 9;
                    arg1.field147 = class439.field6456[var23];
                    arg1.field161 = (byte) (9 - arg1.field147);
                }
                if ((var25.field3526 & var24) != 0 && !method1428(var5, var2, var3, var25.field3526)) {
                    if (class385.field5626) {
                        class42.method235(arg0, var4, var2, var3);
                        class1.field14.method408(arg0.field559, arg0.field554);
                    }
                    class70 var27 = var25.method10(class1.field14, 7);
                    if (var27 != null) {
                        var27.field901 = var25;
                        var27.field897 = var4;
                        var27.field898 = var2;
                        var27.field900 = var3;
                        class47.field577.method2125(var27, -29983);
                    }
                }
                class233 var28 = arg1.field163;
                if (var28 != null && (var28.field3526 & var24) != 0 && !method1428(var5, var2, var3, var28.field3526)) {
                    if (class385.field5626) {
                        class42.method235(arg0, var4, var2, var3);
                        class1.field14.method408(arg0.field559, arg0.field554);
                    }
                    class70 var29 = var28.method10(class1.field14, 7);
                    if (var29 != null) {
                        var29.field901 = var28;
                        var29.field897 = var4;
                        var29.field898 = var2;
                        var29.field900 = var3;
                        class47.field577.method2125(var29, -29983);
                    }
                }
            }
            if (var26 != null && !class145.method907(var5, var2, var3, var26.method16((byte) -115))) {
                class337 var30 = arg1.field149;
                class1.field14.method423(3000.0F, (var10 - 0.5F) * 1.5F);
                if ((var26.field5015 & var24) != 0) {
                    if (class385.field5626) {
                        class42.method235(arg0, var4, var2, var3);
                        class1.field14.method408(arg0.field559, arg0.field554);
                    }
                    class70 var31 = var26.method10(class1.field14, 7);
                    if (var31 != null) {
                        var31.field901 = var26;
                        var31.field897 = var4;
                        var31.field898 = var2;
                        var31.field900 = var3;
                        class47.field577.method2125(var31, -29983);
                    }
                } else if (var26.field5015 == 256) {
                    int var32 = var26.field5017 - class121.field1596;
                    int var33 = var26.field5013 - class446.field6573;
                    int var34 = var26.field5009;
                    int var35;
                    if (var34 == 1 || var34 == 2) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    int var36;
                    if (var34 == 2 || var34 == 3) {
                        var36 = -var33;
                    } else {
                        var36 = var33;
                    }
                    if (class385.field5626) {
                        class42.method235(arg0, var4, var2, var3);
                        class1.field14.method408(arg0.field559, arg0.field554);
                    }
                    if (var36 < var35) {
                        class70 var37 = var26.method10(class1.field14, 7);
                        if (var37 != null) {
                            var37.field901 = var26;
                            var37.field897 = var4;
                            var37.field898 = var2;
                            var37.field900 = var3;
                            class47.field577.method2125(var37, -29983);
                        }
                    } else if (var30 != null) {
                        class70 var38 = var30.method10(class1.field14, 7);
                        if (var38 != null) {
                            var38.field901 = var30;
                            var38.field897 = var4;
                            var38.field898 = var2;
                            var38.field900 = var3;
                            class47.field577.method2125(var38, -29983);
                        }
                    }
                }
                class1.field14.method423(3000.0F, var10 * 1.5F);
            }
            if (var20) {
                class316 var39 = arg1.field166;
                if (var39 != null && !var39.field4784) {
                    if (var39.field4781) {
                        class1.field14.method423(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class385.field5626) {
                        class42.method235(arg0, var4, var2, var3);
                        class1.field14.method408(arg0.field559, arg0.field554);
                    }
                    class70 var40 = var39.method10(class1.field14, 7);
                    if (var40 != null) {
                        var40.field901 = var39;
                        var40.field897 = var4;
                        var40.field898 = var2;
                        var40.field900 = var3;
                        class47.field577.method2125(var40, -29983);
                    }
                    if (var39.field4781) {
                        class1.field14.method423(3000.0F, var10 * 1.5F);
                    }
                }
                class376 var41 = arg1.field165;
                if (var41 != null && !var41.field5484) {
                    if (class385.field5626) {
                        class42.method235(arg0, var4, var2, var3);
                        class1.field14.method408(arg0.field559, arg0.field554);
                    }
                    class70 var42 = var41.method10(class1.field14, 7);
                    if (var42 != null) {
                        var42.field901 = var41;
                        var42.field897 = var4;
                        var42.field898 = var2;
                        var42.field900 = var3;
                        class47.field577.method2125(var42, -29983);
                    }
                }
            }
            byte var43 = arg1.field141;
            if (var43 != 0) {
                if (var2 < class319.field4825 && (var43 & 0x4) != 0) {
                    class13 var44 = var8[var2 + 1][var3];
                    if (var44 != null && var44.field144) {
                        class426.field6271.method1465(var44, 5);
                    }
                }
                if (var3 < class426.field6265 && (var43 & 0x2) != 0) {
                    class13 var45 = var8[var2][var3 + 1];
                    if (var45 != null && var45.field144) {
                        class426.field6271.method1465(var45, 5);
                    }
                }
                if (var2 > class319.field4825 && (var43 & 0x1) != 0) {
                    class13 var46 = var8[var2 - 1][var3];
                    if (var46 != null && var46.field144) {
                        class426.field6271.method1465(var46, 5);
                    }
                }
                if (var3 > class426.field6265 && (var43 & 0x8) != 0) {
                    class13 var47 = var8[var2][var3 - 1];
                    if (var47 != null && var47.field144) {
                        class426.field6271.method1465(var47, 5);
                    }
                }
            }
        }
        if (arg1.field158 != 0) {
            boolean var48 = true;
            for (class466 var49 = arg1.field151; var49 != null; var49 = var49.field6853) {
                if (class68.field892 != var49.field6862.field1894 && (var49.field6856 & arg1.field158) == arg1.field147) {
                    var48 = false;
                    break;
                }
            }
            if (var48) {
                class233 var50 = arg1.field167;
                if (!method1428(var5, var2, var3, var50.field3526)) {
                    if (class385.field5626) {
                        label687: {
                            if (var50.field3526 >= 16) {
                                int var51 = var2 - class319.field4825;
                                int var52 = var3 - class426.field6265;
                                if (var50.field3526 == 16) {
                                    int var53 = var51 - class267.field4058;
                                    int var54 = class267.field4058 + var52;
                                    if (var54 < var53 && var2 > 0 && var3 <= class265.field4044) {
                                        class42.method235(arg0, var4, var2 - 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field3526 == 32) {
                                    int var55 = class267.field4058 + var51;
                                    int var56 = class267.field4058 + var52;
                                    if (var56 < -var55 && var2 < class275.field4206 && var3 < class265.field4044) {
                                        class42.method235(arg0, var4, var2 + 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field3526 == 64) {
                                    int var57 = class267.field4058 + var51;
                                    int var58 = var52 - class267.field4058;
                                    if (var58 > var57 && var2 < class275.field4206 && var3 > 0) {
                                        class42.method235(arg0, var4, var2 + 1, var3 - 1);
                                        break label687;
                                    }
                                } else if (var50.field3526 == 128) {
                                    int var59 = var51 - class267.field4058;
                                    int var60 = var52 - class267.field4058;
                                    if (var60 > -var59 && var2 > 0 && var3 > 0) {
                                        class42.method235(arg0, var4, var2 - 1, var3 - 1);
                                        break label687;
                                    }
                                }
                            }
                            class42.method235(arg0, var4, var2, var3);
                        }
                        class1.field14.method408(arg0.field559, arg0.field554);
                    }
                    class70 var61 = var50.method10(class1.field14, 7);
                    if (var61 != null) {
                        var61.field901 = var50;
                        var61.field897 = var4;
                        var61.field898 = var2;
                        var61.field900 = var3;
                        class47.field577.method2125(var61, -29983);
                    }
                }
                arg1.field158 = 0;
            }
        }
        if (arg1.field142) {
            try {
                arg1.field142 = false;
                int var62 = 0;
                label630: for (class466 var63 = arg1.field151; var63 != null; var63 = var63.field6853) {
                    class141 var64 = var63.field6862;
                    if (class68.field892 != var64.field1894) {
                        for (int var65 = var64.field1895; var65 <= var64.field1890; var65++) {
                            for (int var66 = var64.field1901; var66 <= var64.field1889; var66++) {
                                class13 var67 = var8[var65][var66];
                                if (var67.field162) {
                                    arg1.field142 = true;
                                    continue label630;
                                }
                                if (var67.field158 != 0) {
                                    int var68 = 0;
                                    if (var65 > var64.field1895) {
                                        var68++;
                                    }
                                    if (var65 < var64.field1890) {
                                        var68 += 4;
                                    }
                                    if (var66 > var64.field1901) {
                                        var68 += 8;
                                    }
                                    if (var66 < var64.field1889) {
                                        var68 += 2;
                                    }
                                    if ((var68 & var67.field158) == arg1.field161) {
                                        arg1.field142 = true;
                                        continue label630;
                                    }
                                }
                            }
                        }
                        int var69 = class319.field4825 - var64.field1895;
                        int var70 = var64.field1890 - class319.field4825;
                        if (var70 > var69) {
                            var69 = var70;
                        }
                        int var71 = class426.field6265 - var64.field1901;
                        int var72 = var64.field1889 - class426.field6265;
                        if (var72 > var71) {
                            var71 = var72;
                        }
                        arg0.field556[var62] = var64;
                        arg0.field558[var62++] = var69 + var71;
                    }
                }
                while (var62 > 0) {
                    int var73 = -50;
                    int var74 = -1;
                    for (int var75 = 0; var75 < var62; var75++) {
                        class141 var76 = arg0.field556[var75];
                        if (class68.field892 != var76.field1894) {
                            int var77 = arg0.field558[var75];
                            if (var77 > var73) {
                                var73 = var77;
                                var74 = var75;
                            } else if (var73 == var77) {
                                int var78 = var76.field1900 - class121.field1596;
                                int var79 = var76.field1892 - class446.field6573;
                                int var80 = arg0.field556[var74].field1900 - class121.field1596;
                                int var81 = arg0.field556[var74].field1892 - class446.field6573;
                                if (var78 * var78 + var79 * var79 > var80 * var80 + var81 * var81) {
                                    var74 = var75;
                                }
                            }
                        }
                    }
                    if (var74 == -1) {
                        break;
                    }
                    class141 var82 = arg0.field556[var74];
                    var82.field1894 = class68.field892;
                    if (!class44.method256(var5, var82.field1895, var82.field1890, var82.field1901, var82.field1889, var82.method120(false))) {
                        if (class385.field5626) {
                            if (var82.field1899 == 0) {
                                class161.method979(arg0, var4, var82.field1895, var82.field1901, var82.field1890, var82.field1889);
                            } else {
                                class42.method235(arg0, var4, var2, var3);
                                int var83 = var2 - class319.field4825;
                                int var84 = var3 - class426.field6265;
                                if (var82.field1899 == 2) {
                                    if (var84 > -var83) {
                                        class30.method172(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class30.method172(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var84 > var83) {
                                    class30.method172(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class30.method172(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class1.field14.method408(arg0.field559, arg0.field554);
                        }
                        class70 var85 = var82.method10(class1.field14, 7);
                        if (var85 != null) {
                            var85.field901 = var82;
                            var85.field897 = var4;
                            var85.field898 = var82.field1895;
                            var85.field900 = var82.field1901;
                            class47.field577.method2125(var85, -29983);
                        }
                    }
                    for (int var86 = var82.field1895; var86 <= var82.field1890; var86++) {
                        for (int var87 = var82.field1901; var87 <= var82.field1889; var87++) {
                            class13 var88 = var8[var86][var87];
                            if (var88.field158 != 0) {
                                class426.field6271.method1465(var88, 5);
                            } else if ((var2 != var86 || var3 != var87) && var88.field144) {
                                class426.field6271.method1465(var88, 5);
                            }
                        }
                    }
                }
                if (arg1.field142) {
                    return;
                }
            } catch (Exception var123) {
                arg1.field142 = false;
            }
        }
        if (arg1.field159 != null) {
            if ((byte) (class319.field4826 & 0xFF) == arg1.field156) {
                class439 var89 = arg1.field159;
                int var90 = class307.field4638[var4].method92(var2, var3);
                int var91;
                if (var4 < class56.field750 - 1) {
                    var91 = class307.field4638[var4].method92(var2, var3) - class307.field4638[var4 + 1].method92(var2, var3);
                } else {
                    var91 = 1024;
                }
                class183.field2740.method606(var6, var90, var7, arg0.field560);
                int var92 = arg0.field560[2];
                class183.field2740.method606(var6, var90 - var91, var7, arg0.field560);
                int var93 = arg0.field560[2];
                int var94 = var92;
                int var95 = var93;
                if (var92 > var93) {
                    var94 = var93;
                    var95 = var92;
                }
                int var96 = var94 - class20.field277;
                int var97 = class20.field277 + var95;
                if (var96 < var97 - 1597) {
                    var96 = var97 - 1597;
                }
                var89.field6459 = var96;
                var89.field6458 = var97;
                var89.field6457 = true;
                class1.field14.method349(var89);
            } else {
                arg1.field159 = null;
            }
        }
        if (!arg1.field144) {
            return;
        }
        if (arg1.field158 != 0) {
            return;
        }
        if (var2 <= class319.field4825 && var2 > class452.field6686) {
            class13 var98 = var8[var2 - 1][var3];
            if (var98 != null && var98.field144) {
                return;
            }
        }
        if (var2 >= class319.field4825 && var2 < class44.field553 - 1) {
            class13 var99 = var8[var2 + 1][var3];
            if (var99 != null && var99.field144) {
                return;
            }
        }
        if (var3 <= class426.field6265 && var3 > class337.field5008) {
            class13 var100 = var8[var2][var3 - 1];
            if (var100 != null && var100.field144) {
                return;
            }
        }
        if (var3 >= class426.field6265 && var3 < class196.field2958 - 1) {
            class13 var101 = var8[var2][var3 + 1];
            if (var101 != null && var101.field144) {
                return;
            }
        }
        arg1.field144 = false;
        class165.field2299--;
        class376 var102 = arg1.field165;
        if (var102 != null && var102.field5484) {
            if (class385.field5626) {
                class42.method235(arg0, var4, var2, var3);
                class1.field14.method408(arg0.field559, arg0.field554);
            }
            class70 var103 = var102.method10(class1.field14, 7);
            if (var103 != null) {
                var103.field901 = var102;
                var103.field897 = var4;
                var103.field898 = var2;
                var103.field900 = var3;
                class47.field577.method2125(var103, -29983);
            }
        }
        if (arg1.field145 != 0) {
            class337 var104 = arg1.field164;
            if (var104 != null && !class145.method907(var5, var2, var3, var104.method16((byte) -102))) {
                if ((var104.field5015 & arg1.field145) != 0) {
                    if (class385.field5626) {
                        class42.method235(arg0, var4, var2, var3);
                        class1.field14.method408(arg0.field559, arg0.field554);
                    }
                    class70 var105 = var104.method10(class1.field14, 7);
                    if (var105 != null) {
                        var105.field901 = var104;
                        var105.field897 = var4;
                        var105.field898 = var2;
                        var105.field900 = var3;
                        class47.field577.method2125(var105, -29983);
                    }
                } else if (var104.field5015 == 256) {
                    int var106 = var104.field5017 - class121.field1596;
                    int var107 = var104.field5013 - class446.field6573;
                    int var108 = var104.field5009;
                    int var109;
                    if (var108 == 1 || var108 == 2) {
                        var109 = -var106;
                    } else {
                        var109 = var106;
                    }
                    int var110;
                    if (var108 == 2 || var108 == 3) {
                        var110 = -var107;
                    } else {
                        var110 = var107;
                    }
                    if (class385.field5626) {
                        class42.method235(arg0, var4, var2, var3);
                        class1.field14.method408(arg0.field559, arg0.field554);
                    }
                    class337 var111 = arg1.field149;
                    if (var110 > var109) {
                        class70 var112 = var104.method10(class1.field14, 7);
                        if (var112 != null) {
                            var112.field901 = var104;
                            var112.field897 = var4;
                            var112.field898 = var2;
                            var112.field900 = var3;
                            class47.field577.method2125(var112, -29983);
                        }
                    } else if (var111 != null) {
                        class70 var113 = var111.method10(class1.field14, 7);
                        if (var113 != null) {
                            var113.field901 = var111;
                            var113.field897 = var4;
                            var113.field898 = var2;
                            var113.field900 = var3;
                            class47.field577.method2125(var113, -29983);
                        }
                    }
                }
            }
            class233 var114 = arg1.field167;
            class233 var115 = arg1.field163;
            if (var115 != null && (var115.field3526 & arg1.field145) != 0 && !method1428(var5, var2, var3, var115.field3526)) {
                if (class385.field5626) {
                    class299.method1850(arg0, var115.field3526, var4, var2, var3);
                    class1.field14.method408(arg0.field559, arg0.field554);
                }
                class70 var116 = var115.method10(class1.field14, 7);
                if (var116 != null) {
                    var116.field901 = var115;
                    var116.field897 = var4;
                    var116.field898 = var2;
                    var116.field900 = var3;
                    class47.field577.method2125(var116, -29983);
                }
            }
            if (var114 != null && (var114.field3526 & arg1.field145) != 0 && !method1428(var5, var2, var3, var114.field3526)) {
                if (class385.field5626) {
                    class299.method1850(arg0, var114.field3526, var4, var2, var3);
                    class1.field14.method408(arg0.field559, arg0.field554);
                }
                class70 var117 = var114.method10(class1.field14, 7);
                if (var117 != null) {
                    var117.field901 = var114;
                    var117.field897 = var4;
                    var117.field898 = var2;
                    var117.field900 = var3;
                    class47.field577.method2125(var117, -29983);
                }
            }
        }
        if (var4 < class56.field750 - 1) {
            class13 var118 = class277.field4216[var4 + 1][var2][var3];
            if (var118 != null && var118.field144) {
                class426.field6271.method1471(5000, var118);
            }
        }
        if (var2 < class319.field4825) {
            class13 var119 = var8[var2 + 1][var3];
            if (var119 != null && var119.field144) {
                class426.field6271.method1465(var119, 5);
            }
        }
        if (var3 < class426.field6265) {
            class13 var120 = var8[var2][var3 + 1];
            if (var120 != null && var120.field144) {
                class426.field6271.method1465(var120, 5);
            }
        }
        if (var2 > class319.field4825) {
            class13 var121 = var8[var2 - 1][var3];
            if (var121 != null && var121.field144) {
                class426.field6271.method1465(var121, 5);
            }
        }
        if (var3 > class426.field6265) {
            class13 var122 = var8[var2][var3 - 1];
            if (var122 != null && var122.field144) {
                class426.field6271.method1465(var122, 5);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIBII)V")
    public static final void method1425(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -113) {
            return;
        }
        field3541++;
        if (class192.field2917 <= arg4 - arg3 && class39.field497 >= arg3 + arg4 && class189.field2831 <= (arg0 - arg3) && arg0 + arg3 <= class204.field3060) {
            class213.method1244(arg0, arg4, arg1, 127, arg3);
        } else {
            class266.method1648(arg4, 7083, arg3, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)V")
    public static void method1426(byte arg0) {
        field3543 = null;
        field3544 = null;
        field3536 = null;
        field3537 = null;
        if (arg0 != 21) {
            method1428(-51, -72, 29, 35);
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V")
    public static final void method1427(int arg0) {
        field3542++;
        int var1 = -21 % ((arg0 - 19) / 38);
        class67.method457((long) class26.field332, (byte) 127, class196.field2965);
        if (class6.field69 != -1) {
            class114.method692((byte) -127, class6.field69);
        }
        for (int var2 = 0; var2 < class174.field2662; var2++) {
            if (class6.field71[var2]) {
                class71.field931[var2] = true;
            }
            class71.field914[var2] = class6.field71[var2];
            class6.field71[var2] = false;
        }
        class426.field6267 = class26.field332;
        if (class196.field2965.method398()) {
            class174.field2665 = true;
        }
        if (class6.field69 != -1) {
            class174.field2662 = 0;
            class6.method55((byte) -62);
        }
        class196.field2965.method433();
        class56.method322(0, class57.field764);
        class342.field5118 = 0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIII)Z")
    private static final boolean method1428(int arg0, int arg1, int arg2, int arg3) {
        if (!class331.method2032(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class254.field3869;
        int var5 = arg2 << class254.field3869;
        int var6 = class307.field4638[arg0].method92(arg1, arg2) - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 == 1) {
            if (var4 > class121.field1596) {
                if (!class430.method2641(var4, var6, var5)) {
                    return false;
                }
                if (!class430.method2641(var4, var6, class26.field337 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class430.method2641(var4, var7, var5)) {
                    return false;
                }
                if (!class430.method2641(var4, var7, class26.field337 + var5)) {
                    return false;
                }
            }
            if (class430.method2641(var4, var8, var5)) {
                return class430.method2641(var4, var8, class26.field337 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class446.field6573) {
                if (!class430.method2641(var4, var6, class26.field337 + var5)) {
                    return false;
                }
                if (!class430.method2641(class26.field337 + var4, var6, class26.field337 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class430.method2641(var4, var7, class26.field337 + var5)) {
                    return false;
                }
                if (!class430.method2641(class26.field337 + var4, var7, class26.field337 + var5)) {
                    return false;
                }
            }
            if (class430.method2641(var4, var8, class26.field337 + var5)) {
                return class430.method2641(class26.field337 + var4, var8, class26.field337 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class121.field1596) {
                if (!class430.method2641(class26.field337 + var4, var6, var5)) {
                    return false;
                }
                if (!class430.method2641(class26.field337 + var4, var6, class26.field337 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class430.method2641(class26.field337 + var4, var7, var5)) {
                    return false;
                }
                if (!class430.method2641(class26.field337 + var4, var7, class26.field337 + var5)) {
                    return false;
                }
            }
            if (class430.method2641(class26.field337 + var4, var8, var5)) {
                return class430.method2641(class26.field337 + var4, var8, class26.field337 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class446.field6573) {
                if (!class430.method2641(var4, var6, var5)) {
                    return false;
                }
                if (!class430.method2641(class26.field337 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class430.method2641(var4, var7, var5)) {
                    return false;
                }
                if (!class430.method2641(class26.field337 + var4, var7, var5)) {
                    return false;
                }
            }
            if (class430.method2641(var4, var8, var5)) {
                return class430.method2641(class26.field337 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class430.method2641(class267.field4058 + var4, var9, class267.field4058 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class430.method2641(var4, var8, class26.field337 + var5);
        } else if (arg3 == 32) {
            return class430.method2641(class26.field337 + var4, var8, class26.field337 + var5);
        } else if (arg3 == 64) {
            return class430.method2641(class26.field337 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class430.method2641(var4, var8, var5);
        } else {
            return true;
        }
    }
}
