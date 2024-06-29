import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class317 {

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public int field4979 = 0;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public int field4983 = 0;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Z")
    public boolean field4984 = false;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4982 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!od", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field4978 = new String[100];

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Z")
    public static boolean field4985 = true;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Lpc;")
    public class216 field4976;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field4980;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/lang/String;)V", line = 6)
    public static final void method2156(int arg0, String arg1) {
        field4977++;
        if (class146.field2297 == null) {
            return;
        }
        int var2 = arg0;
        long var3 = class108.method723(arg1, -67);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class146.field2297.length && class146.field2297[var2].field2852 != var3) {
            var2++;
        }
        if (var2 < class146.field2297.length && class146.field2297[var2] != null) {
            class152.field2410++;
            class265.field4095.method2064(255, 109);
            class265.field4095.method2023(class146.field2297[var2].field2852, -81);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljh;I)Z", line = 41)
    public static final boolean method2157(class207 arg0, int arg1) {
        field4975++;
        if (arg1 != 0) {
            method2159(115);
        }
        if (arg0.field3149 == 205) {
            class312.field4940 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z[Lwb;B[[[I)V", line = 62)
    public static final void method2158(boolean arg0, class294[] arg1, byte arg2, int[][][] arg3) {
        if (!arg0) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class305.field4784[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class305.field4784[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg1[var7].method1919(var6, var5, (byte) 28);
                            }
                        }
                    }
                }
            }
            class335.field5204 += (int) (Math.random() * 5.0D) - 2;
            if (class335.field5204 < -16) {
                class335.field5204 = -16;
            }
            class50.field708 += (int) (Math.random() * 5.0D) - 2;
            if (class50.field708 < -8) {
                class50.field708 = -8;
            }
            if (class335.field5204 > 16) {
                class335.field5204 = 16;
            }
            if (class50.field708 > 8) {
                class50.field708 = 8;
            }
        }
        field4981++;
        byte var8;
        if (arg0) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        int var9 = class50.field708 >> 2 << 10;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        int var12 = class335.field5204 >> 1;
        if (arg2 != -122) {
            method2158(false, (class294[]) null, (byte) 52, (int[][][]) ((int[][][]) null));
        }
        for (int var13 = 0; var13 < var8; var13++) {
            byte[][] var14 = class280.field4323[var13];
            if (!class333.field5166) {
                int var35 = (int) Math.sqrt(5100.0D);
                int var36 = var35 * 768 >> 8;
                for (int var37 = 1; var37 < 103; var37++) {
                    for (int var38 = 1; var38 < 103; var38++) {
                        int var39 = client.field2034[var13][var38 + 1][var37] - client.field2034[var13][var38 - 1][var37];
                        byte var40 = 74;
                        int var41 = client.field2034[var13][var38][var37 + 1] - client.field2034[var13][var38][var37 - 1];
                        int var42 = (int) Math.sqrt((double) (var41 * var41 + var39 * var39 + 65536));
                        int var43 = (var39 << 8) / var42;
                        int var44 = -65536 / var42;
                        int var45 = (var41 << 8) / var42;
                        int var46 = (var43 * -50 + (var44 * -10) + (var45 * -50)) / var36 + var40;
                        int var47 = (var14[var38 - 1][var37] >> 2) + (var14[var38 + 1][var37] >> 3) + (var14[var38][var37 + -1] >> 2) + (var14[var38][var37 + 1] >> 3) + (var14[var38][var37] >> 1);
                        var11[var38][var37] = var46 - var47;
                    }
                }
            } else if (class192.field2903) {
                for (int var15 = 1; var15 < 103; var15++) {
                    for (int var16 = 1; var16 < 103; var16++) {
                        byte var17 = 74;
                        int var18 = (var14[var16 + 1][var15] >> 3) + (var14[var16 - 1][var15] >> 2) + (var14[var16][var15] >> 1) - (-(var14[var16][var15 - 1] >> 2) - (var14[var16][var15 + 1] >> 3));
                        var11[var16][var15] = var17 - var18;
                    }
                }
            } else {
                int var19 = (int) class326.field5070[0];
                int var20 = (int) class326.field5070[1];
                int var21 = (int) class326.field5070[2];
                int var22 = (int) Math.sqrt((double) (var21 * var21 + var19 * var19 + var20 * var20));
                int var23 = var22 * 1024 >> 8;
                for (int var24 = 1; var24 < 103; var24++) {
                    for (int var25 = 1; var25 < 103; var25++) {
                        byte var26 = 96;
                        int var27 = client.field2034[var13][var25 + 1][var24] - client.field2034[var13][var25 - 1][var24];
                        int var28 = client.field2034[var13][var25][var24 + 1] - client.field2034[var13][var25][var24 - 1];
                        int var29 = (int) Math.sqrt((double) (var27 * var27 + ((var28 * var28) + 65536)));
                        int var30 = (var27 << 8) / var29;
                        int var31 = -65536 / var29;
                        int var32 = (var14[var25][var24] >> 1) + ((var14[var25 + 1][var24] >> 3) + (var14[var25 - 1][var24] >> 2) - (-(var14[var25][var24 + -1] >> 2) + -(var14[var25][var24 + 1] >> 3)));
                        int var33 = (var28 << 8) / var29;
                        int var34 = (var21 * var33 + var19 * var30 + var20 * var31) / var23 + var26;
                        var11[var25][var24] = var34 - ((int) ((float) var32 * 1.7F));
                    }
                }
            }
            for (int var48 = 0; var48 < 104; var48++) {
                class192.field2908[var48] = 0;
                class138.field2143[var48] = 0;
                class107.field1635[var48] = 0;
                class297.field4547[var48] = 0;
                class3.field32[var48] = 0;
            }
            for (int var49 = -5; var49 < 104; var49++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    int var51 = var49 + 5;
                    int var10002;
                    if (var51 < 104) {
                        int var52 = class298.field4586[var13][var51][var50] & 0xFF;
                        if (var52 > 0) {
                            class183 var53 = class79.method549((byte) -90, var52 - 1);
                            class192.field2908[var50] += var53.field2809;
                            class138.field2143[var50] += var53.field2810;
                            class107.field1635[var50] += var53.field2792;
                            class297.field4547[var50] += var53.field2793;
                            var10002 = class3.field32[var50]++;
                        }
                    }
                    int var54 = var49 - 5;
                    if (var54 >= 0) {
                        int var55 = class298.field4586[var13][var54][var50] & 0xFF;
                        if (var55 > 0) {
                            class183 var56 = class79.method549((byte) -49, var55 - 1);
                            class192.field2908[var50] -= var56.field2809;
                            class138.field2143[var50] -= var56.field2810;
                            class107.field1635[var50] -= var56.field2792;
                            class297.field4547[var50] -= var56.field2793;
                            var10002 = class3.field32[var50]--;
                        }
                    }
                }
                if (var49 >= 0) {
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    int var61 = 0;
                    for (int var62 = -5; var62 < 104; var62++) {
                        int var63 = var62 + 5;
                        if (var63 < 104) {
                            var57 += class192.field2908[var63];
                            var58 += class107.field1635[var63];
                            var60 += class297.field4547[var63];
                            var59 += class138.field2143[var63];
                            var61 += class3.field32[var63];
                        }
                        int var64 = var62 - 5;
                        if (var64 >= 0) {
                            var60 -= class297.field4547[var64];
                            var57 -= class192.field2908[var64];
                            var59 -= class138.field2143[var64];
                            var58 -= class107.field1635[var64];
                            var61 -= class3.field32[var64];
                        }
                        if (var62 >= 0 && var61 > 0) {
                            var10[var49][var62] = class30.method229(var58 / var61, var59 / var61, var57 * 256 / var60, 4138);
                        }
                    }
                }
            }
            for (int var65 = 1; var65 < 103; var65++) {
                label770: for (int var66 = 1; var66 < 103; var66++) {
                    if (arg0 || class148.method1042((byte) 54) || (class305.field4784[0][var65][var66] & 0x2) != 0 || (class305.field4784[var13][var65][var66] & 0x10) == 0 && class36.method259(arg2 + 230, var13, var65, var66) == class230.field3720) {
                        if (class174.field2662 > var13) {
                            class174.field2662 = var13;
                        }
                        int var67 = class298.field4586[var13][var65][var66] & 0xFF;
                        int var68 = class173.field2641[var13][var65][var66] & 0xFF;
                        if (var67 > 0 || var68 > 0) {
                            int var69 = client.field2034[var13][var65][var66];
                            int var70 = client.field2034[var13][var65 + 1][var66];
                            int var71 = client.field2034[var13][var65][var66 + 1];
                            int var72 = client.field2034[var13][var65 + 1][var66 + 1];
                            if (var13 > 0) {
                                boolean var73 = true;
                                if (var67 == 0 && class246.field3861[var13][var65][var66] != 0) {
                                    var73 = false;
                                }
                                if (var68 > 0 && !class29.method223((byte) -28, var68 - 1).field4998) {
                                    var73 = false;
                                }
                                if (var73 && var69 == var70 && var69 == var72 && var69 == var71) {
                                    class274.field4218[var13][var65][var66] = class276.method1810(class274.field4218[var13][var65][var66], 4);
                                }
                            }
                            int var74;
                            int var75;
                            if (var67 <= 0) {
                                var74 = 0;
                                var75 = -1;
                            } else {
                                var75 = var10[var65][var66];
                                int var76 = (var75 & 0x7F) + var12;
                                if (var76 < 0) {
                                    var76 = 0;
                                } else if (var76 > 127) {
                                    var76 = 127;
                                }
                                int var77 = (var75 + var9 & 0xFC00) + (var75 & 0x380) + var76;
                                var74 = class12.field129[class307.method2110(var77, 96, 3326)];
                            }
                            int var78 = var11[var65][var66];
                            int var79 = var11[var65 + 1][var66];
                            int var80 = var11[var65][var66 + 1];
                            int var81 = var11[var65 + 1][var66 + 1];
                            if (var68 == 0) {
                                class277.method1817(var13, var65, var66, 0, 0, -1, var69, var70, var72, var71, class307.method2110(var75, var78, 3326), class307.method2110(var75, var79, 3326), class307.method2110(var75, var81, arg2 + 3448), class307.method2110(var75, var80, 3326), 0, 0, 0, 0, var74, 0);
                                if (class333.field5166 && var13 > 0 && var75 != -1 && class79.method549((byte) -111, var67 - 1).field2805) {
                                    class11.method73(0, 0, true, false, var65, var66, var69 - client.field2034[0][var65][var66], -client.field2034[0][var65 + 1][var66] + var70, var72 - client.field2034[0][var65 + 1][var66 + 1], -client.field2034[0][var65][var66 + 1] + var71);
                                }
                                if (class333.field5166 && !arg0 && class150.field2367 != null && var13 == 0) {
                                    for (int var97 = var65 - 1; var97 <= (var65 + 1); var97++) {
                                        for (int var98 = var66 - 1; var98 <= var66 + 1; var98++) {
                                            if ((var65 != var97 || var66 != var98) && var97 >= 0 && var97 < 104 && var98 >= 0 && var98 < 104) {
                                                int var99 = class173.field2641[var13][var97][var98] & 0xFF;
                                                if (var99 != 0) {
                                                    class319 var100 = class29.method223((byte) -28, var99 - 1);
                                                    if (var100.field4994 != -1 && class64.method459(class12.field126.method472(false, var100.field4994), false)) {
                                                        class150.field2367[var65][var66] = (var100.field5003 << 24) + var100.field4996;
                                                        continue label770;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var82 = class246.field3861[var13][var65][var66] + 1;
                                byte var83 = class58.field827[var13][var65][var66];
                                class319 var84 = class29.method223((byte) -28, var68 - 1);
                                if (class333.field5166 && !arg0 && class150.field2367 != null && var13 == 0) {
                                    if (var84.field4994 != -1 && class64.method459(class12.field126.method472(false, var84.field4994), false)) {
                                        class150.field2367[var65][var66] = (var84.field5003 << 24) + var84.field4996;
                                    } else {
                                        label736: for (int var85 = var65 - 1; var85 <= (var65 + 1); var85++) {
                                            for (int var86 = var66 - 1; var86 <= var66 + 1; var86++) {
                                                if ((var65 != var85 || var66 != var86) && var85 >= 0 && var85 < 104 && var86 >= 0 && var86 < 104) {
                                                    int var87 = class173.field2641[var13][var85][var86] & 0xFF;
                                                    if (var87 != 0) {
                                                        class319 var88 = class29.method223((byte) -28, var87 - 1);
                                                        if (var88.field4994 != -1 && class64.method459(class12.field126.method472(false, var88.field4994), false)) {
                                                            class150.field2367[var65][var66] = (var88.field5003 << 24) + var88.field4996;
                                                            break label736;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var89 = var84.field4994;
                                if (var89 >= 0 && !class12.field126.method468(13496, var89)) {
                                    var89 = -1;
                                }
                                int var90;
                                int var91;
                                if (var89 >= 0) {
                                    var90 = class12.field129[class196.method1328(class12.field126.method477(arg2 ^ 0xFFFFE40B, var89), -30048, 96)];
                                    var91 = -1;
                                } else if (var84.field5005 == -1) {
                                    var90 = 0;
                                    var91 = -2;
                                } else {
                                    var91 = var84.field5005;
                                    int var92 = (var91 & 0x7F) + var12;
                                    if (var92 < 0) {
                                        var92 = 0;
                                    } else if (var92 > 127) {
                                        var92 = 127;
                                    }
                                    int var93 = (var91 & 0x380) + ((var9 + var91 & 0xFC00) + var92);
                                    var90 = class12.field129[class196.method1328(var93, -30048, 96)];
                                }
                                if (var84.field5001 >= 0) {
                                    int var94 = var84.field5001;
                                    int var95 = (var94 & 0x7F) + var12;
                                    if (var95 < 0) {
                                        var95 = 0;
                                    } else if (var95 > 127) {
                                        var95 = 127;
                                    }
                                    int var96 = (var94 + var9 & 0xFC00) + (var94 & 0x380) + var95;
                                    var90 = class12.field129[class196.method1328(var96, arg2 - 29926, 96)];
                                }
                                class277.method1817(var13, var65, var66, var82, var83, var89, var69, var70, var72, var71, class307.method2110(var75, var78, arg2 + 3448), class307.method2110(var75, var79, 3326), class307.method2110(var75, var81, 3326), class307.method2110(var75, var80, 3326), class196.method1328(var91, -30048, var78), class196.method1328(var91, -30048, var79), class196.method1328(var91, -30048, var81), class196.method1328(var91, arg2 ^ 0x7526, var80), var74, var90);
                                if (class333.field5166 && var13 > 0) {
                                    class11.method73(var82, var83, var91 == -2 || !var84.field4999, var75 == -1 || !class79.method549((byte) -126, var67 - 1).field2805, var65, var66, var69 - client.field2034[0][var65][var66], var70 - client.field2034[0][var65 + 1][var66], var72 - client.field2034[0][var65 + 1][var66 + 1], -client.field2034[0][var65][var66 + 1] + var71);
                                }
                            }
                        }
                    }
                }
            }
            if (class333.field5166) {
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                float[][] var103 = new float[105][105];
                int[][] var104 = client.field2034[var13];
                int var105 = 1;
                while (true) {
                    if (var105 > 103) {
                        if (arg0) {
                            class217[] var115 = class211.method1414(class298.field4586[var13], var102, class58.field827[var13], var13, arg3, var101, (byte) 115, var10, class246.field3861[var13], class150.field2367, class193.field2911[0], var11, client.field2034[var13], class305.field4784, var103, class173.field2641[var13]);
                            class71.method512(var13, var115);
                            break;
                        }
                        class217[] var110 = class211.method1414(class298.field4586[var13], var102, class58.field827[var13], var13, arg3, var101, (byte) 114, var10, class246.field3861[var13], (int[][]) null, (int[][]) null, var11, client.field2034[var13], class305.field4784, var103, class173.field2641[var13]);
                        class217[] var111 = class276.method1809(var103, class173.field2641[var13], class246.field3861[var13], var13, 8, client.field2034[var13], class298.field4586[var13], var102, var101, var11, class58.field827[var13], class305.field4784);
                        class217[] var112 = new class217[var110.length + var111.length];
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var112[var113] = var110[var113];
                        }
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var112[var114 + var110.length] = var111[var114];
                        }
                        class71.method512(var13, var112);
                        class92.method631(var102, class246.field3861[var13], arg2 + 122, class147.field2321, var13, var103, class147.field2326, client.field2034[var13], class58.field827[var13], class298.field4586[var13], var101, class173.field2641[var13]);
                        break;
                    }
                    for (int var106 = 1; var106 <= 103; var106++) {
                        int var107 = var104[var106 + 1][var105] - var104[var106 - 1][var105];
                        int var108 = var104[var106][var105 + 1] - var104[var106][var105 - 1];
                        float var109 = (float) Math.sqrt((double) (var107 * var107 + var108 * var108 + 65536));
                        var101[var106][var105] = (float) var107 / var109;
                        var102[var106][var105] = -256.0F / var109;
                        var103[var106][var105] = (float) var108 / var109;
                    }
                    var105++;
                }
            }
            class298.field4586[var13] = (byte[][]) null;
            class173.field2641[var13] = (byte[][]) null;
            class246.field3861[var13] = (byte[][]) null;
            class58.field827[var13] = (byte[][]) null;
            class280.field4323[var13] = (byte[][]) null;
        }
        class159.method1100(-50, -10, -50);
        if (arg0) {
            return;
        }
        for (int var116 = 0; var116 < 104; var116++) {
            for (int var117 = 0; var117 < 104; var117++) {
                if ((class305.field4784[1][var116][var117] & 0x2) == 2) {
                    class110.method741(var116, var117);
                }
            }
        }
        for (int var118 = 0; var118 < 4; var118++) {
            for (int var119 = 0; var119 <= 104; var119++) {
                for (int var120 = 0; var120 <= 104; var120++) {
                    if ((class274.field4218[var118][var120][var119] & 0x1) != 0) {
                        int var121;
                        for (var121 = var119; var121 > 0 && (class274.field4218[var118][var120][var121 - 1] & 0x1) != 0; var121--) {
                        }
                        int var122 = var119;
                        int var123 = var118;
                        while (var122 < 104 && (class274.field4218[var118][var120][var122 + 1] & 0x1) != 0) {
                            var122++;
                        }
                        label453: while (var123 > 0) {
                            for (int var124 = var121; var124 <= var122; var124++) {
                                if ((class274.field4218[var123 - 1][var120][var124] & 0x1) == 0) {
                                    break label453;
                                }
                            }
                            var123--;
                        }
                        int var125;
                        label441: for (var125 = var118; var125 < 3; var125++) {
                            for (int var126 = var121; var126 <= var122; var126++) {
                                if ((class274.field4218[var125 + 1][var120][var126] & 0x1) == 0) {
                                    break label441;
                                }
                            }
                        }
                        int var127 = (var122 - (var121 - 1)) * (var125 + 1 - var123);
                        if (var127 >= 8) {
                            short var128 = 240;
                            int var129 = client.field2034[var125][var120][var121] - var128;
                            int var130 = client.field2034[var123][var120][var121];
                            class33.method244(1, var120 * 128, var120 * 128, var121 * 128, var122 * 128 + 128, var129, var130);
                            for (int var131 = var123; var131 <= var125; var131++) {
                                for (int var132 = var121; var132 <= var122; var132++) {
                                    class274.field4218[var131][var120][var132] = class311.method2135(class274.field4218[var131][var120][var132], -2);
                                }
                            }
                        }
                    }
                    if ((class274.field4218[var118][var120][var119] & 0x2) != 0) {
                        int var133 = var120;
                        int var134;
                        for (var134 = var120; var134 < 104 && (class274.field4218[var118][var134 + 1][var119] & 0x2) != 0; var134++) {
                        }
                        while (var133 > 0 && (class274.field4218[var118][var133 - 1][var119] & 0x2) != 0) {
                            var133--;
                        }
                        int var135;
                        label508: for (var135 = var118; var135 > 0; var135--) {
                            for (int var136 = var133; var136 <= var134; var136++) {
                                if ((class274.field4218[var135 - 1][var136][var119] & 0x2) == 0) {
                                    break label508;
                                }
                            }
                        }
                        int var137;
                        label496: for (var137 = var118; var137 < 3; var137++) {
                            for (int var138 = var133; var138 <= var134; var138++) {
                                if ((class274.field4218[var137 + 1][var138][var119] & 0x2) == 0) {
                                    break label496;
                                }
                            }
                        }
                        int var139 = (var137 + 1 - var135) * (var134 + 1 - var133);
                        if (var139 >= 8) {
                            short var140 = 240;
                            int var141 = client.field2034[var137][var133][var119] - var140;
                            int var142 = client.field2034[var135][var133][var119];
                            class33.method244(2, var133 * 128, var134 * 128 + 128, var119 * 128, var119 * 128, var141, var142);
                            for (int var143 = var135; var143 <= var137; var143++) {
                                for (int var144 = var133; var144 <= var134; var144++) {
                                    class274.field4218[var143][var144][var119] = class311.method2135(class274.field4218[var143][var144][var119], -3);
                                }
                            }
                        }
                    }
                    if ((class274.field4218[var118][var120][var119] & 0x4) != 0) {
                        int var145 = var120;
                        int var146 = var119;
                        int var147 = var120;
                        int var148;
                        for (var148 = var119; var148 < 104 && (class274.field4218[var118][var120][var148 + 1] & 0x4) != 0; var148++) {
                        }
                        while (var146 > 0 && (class274.field4218[var118][var120][var146 - 1] & 0x4) != 0) {
                            var146--;
                        }
                        label562: while (var145 > 0) {
                            for (int var149 = var146; var149 <= var148; var149++) {
                                if ((class274.field4218[var118][var145 - 1][var149] & 0x4) == 0) {
                                    break label562;
                                }
                            }
                            var145--;
                        }
                        label551: while (var147 < 104) {
                            for (int var150 = var146; var150 <= var148; var150++) {
                                if ((class274.field4218[var118][var147 + 1][var150] & 0x4) == 0) {
                                    break label551;
                                }
                            }
                            var147++;
                        }
                        if ((var148 + 1 - var146) * (var147 + 1 - var145) >= 4) {
                            int var151 = client.field2034[var118][var145][var146];
                            class33.method244(4, var145 * 128, var147 * 128 + 128, var146 * 128, var148 * 128 + 128, var151, var151);
                            for (int var152 = var145; var152 <= var147; var152++) {
                                for (int var153 = var146; var153 <= var148; var153++) {
                                    class274.field4218[var118][var152][var153] = class311.method2135(class274.field4218[var118][var152][var153], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 1060)
    public static void method2159(int arg0) {
        field4982 = null;
        if (arg0 < 92) {
            method2157((class207) null, 13);
        }
        field4978 = null;
    }
}
