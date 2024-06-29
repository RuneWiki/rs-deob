import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class157 {

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static volatile int field2168 = 0;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field2169 = -1;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field2173 = 0;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2175 = "cyan:";

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "[[[I")
    public static int[][][] field2167;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIZLp;IZIIII)V", line = 6)
    public static final void method1042(int arg0, int arg1, int arg2, int arg3, boolean arg4, class107 arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg8 >= 0 && arg8 < 104 && arg3 >= 0 && arg3 < 104) {
            if (!arg4 && !arg7) {
                class264.field4163[arg1][arg8][arg3] = 0;
            }
            while (true) {
                int var12 = arg5.method661(-1);
                if (var12 == 0) {
                    if (arg4) {
                        class167.field2324[0][arg2 + arg8][arg3 + arg9] = class74.field957[0][arg8 + arg2][arg3 + arg9];
                    } else if (arg1 == 0) {
                        class167.field2324[0][arg8 + arg2][arg3 + arg9] = -class9.method42(arg11 + 932731, 556238 - -arg10, -306674912) * 8;
                    } else {
                        class167.field2324[arg1][arg8 + arg2][arg3 + arg9] = class167.field2324[arg1 - 1][arg2 + arg8][arg3 + arg9] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg5.method661(-1);
                    if (arg4) {
                        class167.field2324[0][arg2 + arg8][arg3 + arg9] = class74.field957[0][arg2 + arg8][arg3 + arg9] + (var13 * 8);
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg1 == 0) {
                            class167.field2324[0][arg2 + arg8][arg3 + arg9] = -var13 * 8;
                        } else {
                            class167.field2324[arg1][arg2 + arg8][arg3 + arg9] = class167.field2324[arg1 - 1][arg2 + arg8][arg3 + arg9] - (var13 * 8);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg7) {
                        arg5.method661(-1);
                    } else {
                        class239.field3573[arg1][arg8][arg3] = arg5.method679(-3);
                        class85.field1082[arg1][arg8][arg3] = (byte) ((var12 - 2) / 4);
                        class21.field270[arg1][arg8][arg3] = (byte) class229.method1613(3, var12 + arg6 - 2);
                    }
                } else if (var12 <= 81) {
                    if (!arg4 && !arg7) {
                        class264.field4163[arg1][arg8][arg3] = (byte) (var12 - 49);
                    }
                } else if (!arg7) {
                    class67.field884[arg1][arg8][arg3] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg5.method661(-1);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg5.method661(-1);
                    break;
                }
                if (var14 <= 49) {
                    arg5.method661(-1);
                }
            }
        }
        if (arg0 < -8) {
            field2171++;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V", line = 123)
    public static void method1043(byte arg0) {
        field2175 = null;
        field2167 = (int[][][]) null;
        if (arg0 != -44) {
            field2175 = (String) null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III[[[BIBII)V", line = 140)
    public static final void method1044(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class208.field2947++;
        class115.field1636 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class81.field1047; var12 < class90.field1128; var12++) {
            class225[][] var13 = class158.field2184[var12];
            for (int var14 = class222.field3136; var14 < class237.field3485; var14++) {
                for (int var15 = class19.field256; var15 < class228.field3278; var15++) {
                    class225 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class218.field3067[var14 + class342.field5302 - class49.field610][var15 + class342.field5302 - class242.field3645] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field3215 = true;
                            var16.field3202 = true;
                            if (var16.field3214 > 0) {
                                var16.field3211 = true;
                            } else {
                                var16.field3211 = false;
                            }
                            class115.field1636++;
                        } else {
                            var16.field3215 = false;
                            var16.field3202 = false;
                            var16.field3207 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field3196 != null) {
                                    class168 var17 = var16.field3196;
                                    var17.field2335.method12(0, var12, var17.field2329, var17.field2338, var17.field2330);
                                    if (var17.field2331 != null) {
                                        var17.field2331.method12(0, var12, var17.field2329, var17.field2338, var17.field2330);
                                    }
                                }
                                if (var16.field3213 != null) {
                                    class54 var18 = var16.field3213;
                                    var18.field662.method12(var18.field666, var12, var18.field654, var18.field665, var18.field655);
                                    if (var18.field669 != null) {
                                        var18.field669.method12(var18.field666, var12, var18.field654, var18.field665, var18.field655);
                                    }
                                }
                                if (var16.field3209 != null) {
                                    class138 var19 = var16.field3209;
                                    var19.field1935.method12(0, var12, var19.field1933, var19.field1932, var19.field1927);
                                }
                                if (var16.field3199 != null) {
                                    for (int var20 = 0; var20 < var16.field3214; var20++) {
                                        class80 var21 = var16.field3199[var20];
                                        var21.field1024.method12(var21.field1016, var12, var21.field1033, var21.field1030, var21.field1032);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class99.field1291 == class167.field2324;
        if (class250.field3787) {
            GL var23 = class250.field3818;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class238.method1707();
                class262.method1886(3, 3, -1);
                class211.field2978 = true;
                class95.method579();
                class283.field4447 = -1;
                class88.field1102 = -1;
                for (int var24 = 0; var24 < class7.field105[0].length; var24++) {
                    class245 var25 = class7.field105[0][var24];
                    float var26 = 251.5F - (var25.field3713 ? 1.0F : 0.5F);
                    if (class283.field4447 != var25.field3695) {
                        class283.field4447 = var25.field3695;
                        class258.method1867((byte) 126, var25.field3695);
                        class64.method405(class264.method1905((byte) 2));
                    }
                    var25.method1763(class158.field2184, var26, false);
                }
                class95.method577();
            } else {
                int var27 = class81.field1047;
                while (true) {
                    if (var27 >= class90.field1128) {
                        class193.method1346(class49.field610, class242.field3645, class158.field2184);
                        break;
                    }
                    for (int var28 = 0; var28 < class7.field105[var27].length; var28++) {
                        class245 var29 = class7.field105[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field3713 ? 1.0F : 0.5F);
                        if (var29.field3705 != -1 && class120.method819(class215.field3020.method391(false, var29.field3705), 83) && class172.field2481) {
                            class258.method1867((byte) 124, var29.field3695);
                        }
                        var29.method1763(class158.field2184, var30, false);
                    }
                    if (var27 == 0 && class345.field5352 > 0) {
                        class250.method1814(101.5F);
                        class178.method1220(class49.field610, class242.field3645, class342.field5302, arg1, class218.field3067, class167.field2324[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class81.field1047; var31 < class90.field1128; var31++) {
            class225[][] var32 = class158.field2184[var31];
            for (int var33 = -class342.field5302; var33 <= 0; var33++) {
                int var34 = class49.field610 + var33;
                int var35 = class49.field610 - var33;
                if (var34 >= class222.field3136 || var35 < class237.field3485) {
                    for (int var36 = -class342.field5302; var36 <= 0; var36++) {
                        int var37 = class242.field3645 + var36;
                        int var38 = class242.field3645 - var36;
                        if (var34 >= class222.field3136) {
                            if (var37 >= class19.field256) {
                                class225 var39 = var32[var34][var37];
                                if (var39 != null && var39.field3215) {
                                    class330.method2277(var39, true);
                                }
                            }
                            if (var38 < class228.field3278) {
                                class225 var40 = var32[var34][var38];
                                if (var40 != null && var40.field3215) {
                                    class330.method2277(var40, true);
                                }
                            }
                        }
                        if (var35 < class237.field3485) {
                            if (var37 >= class19.field256) {
                                class225 var41 = var32[var35][var37];
                                if (var41 != null && var41.field3215) {
                                    class330.method2277(var41, true);
                                }
                            }
                            if (var38 < class228.field3278) {
                                class225 var42 = var32[var35][var38];
                                if (var42 != null && var42.field3215) {
                                    class330.method2277(var42, true);
                                }
                            }
                        }
                        if (class115.field1636 == 0) {
                            if (!var22) {
                                class283.field4449 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class81.field1047; var43 < class90.field1128; var43++) {
            class225[][] var44 = class158.field2184[var43];
            for (int var45 = -class342.field5302; var45 <= 0; var45++) {
                int var46 = class49.field610 + var45;
                int var47 = class49.field610 - var45;
                if (var46 >= class222.field3136 || var47 < class237.field3485) {
                    for (int var48 = -class342.field5302; var48 <= 0; var48++) {
                        int var49 = class242.field3645 + var48;
                        int var50 = class242.field3645 - var48;
                        if (var46 >= class222.field3136) {
                            if (var49 >= class19.field256) {
                                class225 var51 = var44[var46][var49];
                                if (var51 != null && var51.field3215) {
                                    class330.method2277(var51, false);
                                }
                            }
                            if (var50 < class228.field3278) {
                                class225 var52 = var44[var46][var50];
                                if (var52 != null && var52.field3215) {
                                    class330.method2277(var52, false);
                                }
                            }
                        }
                        if (var47 < class237.field3485) {
                            if (var49 >= class19.field256) {
                                class225 var53 = var44[var47][var49];
                                if (var53 != null && var53.field3215) {
                                    class330.method2277(var53, false);
                                }
                            }
                            if (var50 < class228.field3278) {
                                class225 var54 = var44[var47][var50];
                                if (var54 != null && var54.field3215) {
                                    class330.method2277(var54, false);
                                }
                            }
                        }
                        if (class115.field1636 == 0) {
                            if (!var22) {
                                class283.field4449 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class283.field4449 = false;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([BIBI)Z", line = 513)
    public static final boolean method1045(byte[] arg0, int arg1, byte arg2, int arg3) {
        field2170++;
        boolean var4 = true;
        if (arg2 > -90) {
            method1047((byte[]) null, 110, 15, true, (class22[]) null, 40);
        }
        int var5 = -1;
        class107 var6 = new class107(arg0);
        label76: while (true) {
            int var7 = var6.method664((byte) 123);
            if (var7 == 0) {
                return var4;
            }
            var5 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var14;
                class238 var16;
                do {
                    int var12;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var6.method643(-14205);
                                        if (var17 == 0) {
                                            continue label76;
                                        }
                                        var6.method661(-1);
                                    }
                                    int var10 = var6.method643(-14205);
                                    if (var10 == 0) {
                                        continue label76;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 >> 6 & 0x3F;
                                    var12 = arg1 + var11;
                                    int var13 = var8 & 0x3F;
                                    var14 = var6.method661(-1) >> 2;
                                    var15 = arg3 + var13;
                                } while (var12 <= 0);
                            } while (var15 <= 0);
                        } while (var12 >= 103);
                    } while (var15 >= 103);
                    var16 = class142.method951(var5, 26915);
                } while (var14 == 22 && !class90.field1124 && var16.field3509 == 0 && var16.field3507 != 1 && !var16.field3488);
                if (!var16.method1699((byte) -104)) {
                    class132.field1818++;
                    var4 = false;
                }
                var9 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 598)
    public static final void method1046(int arg0) {
        class230.field3359.method1237((byte) 120);
        if (arg0 < 30) {
            field2169 = 49;
        }
        field2174++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([BIIZ[Lhm;I)V", line = 620)
    public static final void method1047(byte[] arg0, int arg1, int arg2, boolean arg3, class22[] arg4, int arg5) {
        field2172++;
        class107 var6 = new class107(arg0);
        int var7 = 83 / ((63 - arg1) / 35);
        int var8 = -1;
        while (true) {
            int var9 = var6.method664((byte) 123);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var6.method643(-14205);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = (var10 & 0xFDC) >> 6;
                int var13 = var10 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var6.method661(-1);
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg2 + var12;
                int var19 = arg5 + var13;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    class22 var20 = null;
                    if (!arg3) {
                        int var21 = var14;
                        if ((class264.field4163[1][var18][var19] & 0x2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg4[var21];
                        }
                    }
                    class91.method532(var16, var17, arg3, var14, !arg3, var14, var20, var18, 3, var8, var19);
                }
            }
        }
    }
}
