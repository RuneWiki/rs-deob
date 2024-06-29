import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class169 extends class196 {

    @OriginalMember(owner = "client!je", name = "K", descriptor = "I")
    public static int field2538 = 1;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "I")
    public int field2530;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    public int field2542;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    public int field2543;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "Lfa;")
    public static class95 field2529;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "Ljava/lang/String;")
    public String field2527;

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "[I")
    public static int[] field2544;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V", line = 10)
    public static final void method1174(int arg0) {
        if (arg0 < -50) {
            field2537++;
            class54.field673.method2029((byte) 77);
            class314.field4757 = null;
            class54.field682 = 1;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 30)
    public static final boolean method1175(int arg0, String arg1) {
        field2533++;
        if (arg0 != 16) {
            method1179(76, -6, 114, 55, 82, -38, (class233) null, 94, 11L);
        }
        return class200.method1371((byte) -128, true, arg1, 10);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIII)V", line = 41)
    public static final void method1176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2540++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg0 * arg0;
        int var9 = arg1 * arg1;
        int var10 = var8 << 1;
        int var11 = var9 << 1;
        int var12 = arg0 << 1;
        int var13 = var8 - ((var12 - 1) * var11);
        int var14 = var9 << 2;
        int var15 = var8 << 2;
        int var16 = (1 - var12) * var9 + var10;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var15;
        int var20 = (arg5 + arg0) * var14;
        if (arg3 >= class185.field2769 && class166.field2494 >= arg3) {
            int var21 = class222.method1553(class184.field2761, (byte) -87, arg1 + arg4, class157.field2357);
            int var22 = class222.method1553(class184.field2761, (byte) -42, arg4 - arg1, class157.field2357);
            class315.method2160(class40.field488[arg3], arg2, var21, var22, 7);
        }
        while (var7 > 0) {
            var7--;
            if (var16 < 0) {
                while (var16 < 0) {
                    var16 += var17;
                    var13 += var19;
                    var19 += var15;
                    var6++;
                    var17 += var15;
                }
            }
            int var23 = arg3 + var7;
            if (var13 < 0) {
                var16 += var17;
                var6++;
                var17 += var15;
                var13 += var19;
                var19 += var15;
            }
            var13 += -var18;
            var16 += -var20;
            var18 -= var14;
            var20 -= var14;
            int var24 = arg3 - var7;
            if (class185.field2769 <= var23 && var24 <= class166.field2494) {
                int var25 = class222.method1553(class184.field2761, (byte) -121, arg4 + var6, class157.field2357);
                int var26 = class222.method1553(class184.field2761, (byte) -46, arg4 - var6, class157.field2357);
                if (class185.field2769 <= var24) {
                    class315.method2160(class40.field488[var24], arg2, var25, var26, 7);
                }
                if (class166.field2494 >= var23) {
                    class315.method2160(class40.field488[var23], arg2, var25, var26, arg5 ^ 0xFFFFFFF8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I[IBI[Ljava/lang/Object;)V", line = 140)
    public static final void method1177(int arg0, int[] arg1, byte arg2, int arg3, Object[] arg4) {
        field2536++;
        if (arg0 > arg3) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg3;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            Object var8 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var8;
            for (int var9 = arg3; var9 < arg0; var9++) {
                if (((var9 & 0x1) + var7) > arg1[var9]) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    Object var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var8;
            method1177(var6 - 1, arg1, (byte) 76, arg3, arg4);
            method1177(arg0, arg1, (byte) 94, var6 + 1, arg4);
        }
        int var12 = -50 % ((arg2) / 61);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V", line = 195)
    public final void method1178(byte arg0) {
        field2539++;
        if (arg0 > 2) {
            this.field2955 = this.field2955 & Long.MIN_VALUE | class231.method1594(-20375) + 500L;
            class23.field349.method1697(34, this);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIILmd;IJ)Z", line = 212)
    public static final boolean method1179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class233 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class327.method2229(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 223)
    public static final void method1180(String arg0, byte arg1) {
        class198.method1363(-1, false);
        if (arg1 != -95) {
            method1179(-95, 93, 22, 34, 77, 35, (class233) null, 76, 42L);
        }
        class163.method1153(-9877, arg0);
        field2531++;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V", line = 238)
    public static void method1181(byte arg0) {
        if (arg0 < 63) {
            method1174(39);
        }
        field2544 = null;
        field2529 = null;
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)I", line = 249)
    public final int method1182(int arg0) {
        if (arg0 > -33) {
            this.field2530 = 93;
        }
        field2541++;
        return (int) this.field1603;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V", line = 260)
    public final void method1183(boolean arg0) {
        this.field2955 |= Long.MIN_VALUE;
        if (this.method1187((byte) 122) == 0L) {
            class44.field534.method1697(34, this);
        }
        field2534++;
        if (arg0) {
            field2528 = -54;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III[[[BIBII)V", line = 276)
    public static final void method1184(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class170.field2557++;
        class302.field4615 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class22.field321; var12 < class183.field2743; var12++) {
            class221[][] var13 = class158.field2367[var12];
            for (int var14 = class183.field2741; var14 < class327.field4917; var14++) {
                for (int var15 = class212.field3223; var15 < class76.field993; var15++) {
                    class221 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class293.field4487[var14 + class90.field1339 - class271.field4153][var15 + class90.field1339 - class147.field2214] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field3365 = true;
                            var16.field3360 = true;
                            if (var16.field3374 > 0) {
                                var16.field3377 = true;
                            } else {
                                var16.field3377 = false;
                            }
                            class302.field4615++;
                        } else {
                            var16.field3365 = false;
                            var16.field3360 = false;
                            var16.field3375 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field3370 != null) {
                                    class163 var17 = var16.field3370;
                                    var17.field2451.method108(0, var12, var17.field2461, var17.field2449, var17.field2464);
                                    if (var17.field2452 != null) {
                                        var17.field2452.method108(0, var12, var17.field2461, var17.field2449, var17.field2464);
                                    }
                                }
                                if (var16.field3368 != null) {
                                    class226 var18 = var16.field3368;
                                    var18.field3450.method108(var18.field3443, var12, var18.field3441, var18.field3447, var18.field3446);
                                    if (var18.field3435 != null) {
                                        var18.field3435.method108(var18.field3443, var12, var18.field3441, var18.field3447, var18.field3446);
                                    }
                                }
                                if (var16.field3364 != null) {
                                    class187 var19 = var16.field3364;
                                    var19.field2781.method108(0, var12, var19.field2782, var19.field2793, var19.field2792);
                                }
                                if (var16.field3354 != null) {
                                    for (int var20 = 0; var20 < var16.field3374; var20++) {
                                        class311 var21 = var16.field3354[var20];
                                        var21.field4728.method108(var21.field4721, var12, var21.field4727, var21.field4723, var21.field4739);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class318.field4797 == class294.field4502;
        if (class117.field1817) {
            GL var23 = class117.field1801;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class243.method1648();
                class204.method1397(-118, -1, 3);
                class225.field3424 = true;
                class118.method840();
                class192.field2883 = -1;
                class294.field4501 = -1;
                for (int var24 = 0; var24 < class145.field2199[0].length; var24++) {
                    class86 var25 = class145.field2199[0][var24];
                    float var26 = 251.5F - (var25.field1270 ? 1.0F : 0.5F);
                    if (class192.field2883 != var25.field1261) {
                        class192.field2883 = var25.field1261;
                        class192.method1331(var25.field1261, -108);
                        class280.method1954(class258.method1748(-106));
                    }
                    var25.method601(class158.field2367, var26, false);
                }
                class118.method841();
            } else {
                int var27 = class22.field321;
                while (true) {
                    if (var27 >= class183.field2743) {
                        class31.method210(class271.field4153, class147.field2214, class158.field2367);
                        break;
                    }
                    for (int var28 = 0; var28 < class145.field2199[var27].length; var28++) {
                        class86 var29 = class145.field2199[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field1270 ? 1.0F : 0.5F);
                        if (var29.field1281 != -1 && class148.field2233.method744(255, var29.field1281) == 4 && class45.field569) {
                            class192.method1331(var29.field1261, 102);
                        }
                        var29.method601(class158.field2367, var30, false);
                    }
                    if (var27 == 0 && class284.field4298 > 0) {
                        class117.method801(101.5F);
                        class32.method221(class271.field4153, class147.field2214, class90.field1339, arg1, class293.field4487, class294.field4502[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class22.field321; var31 < class183.field2743; var31++) {
            class221[][] var32 = class158.field2367[var31];
            for (int var33 = -class90.field1339; var33 <= 0; var33++) {
                int var34 = class271.field4153 + var33;
                int var35 = class271.field4153 - var33;
                if (var34 >= class183.field2741 || var35 < class327.field4917) {
                    for (int var36 = -class90.field1339; var36 <= 0; var36++) {
                        int var37 = class147.field2214 + var36;
                        int var38 = class147.field2214 - var36;
                        if (var34 >= class183.field2741) {
                            if (var37 >= class212.field3223) {
                                class221 var39 = var32[var34][var37];
                                if (var39 != null && var39.field3365) {
                                    class128.method955(var39, true);
                                }
                            }
                            if (var38 < class76.field993) {
                                class221 var40 = var32[var34][var38];
                                if (var40 != null && var40.field3365) {
                                    class128.method955(var40, true);
                                }
                            }
                        }
                        if (var35 < class327.field4917) {
                            if (var37 >= class212.field3223) {
                                class221 var41 = var32[var35][var37];
                                if (var41 != null && var41.field3365) {
                                    class128.method955(var41, true);
                                }
                            }
                            if (var38 < class76.field993) {
                                class221 var42 = var32[var35][var38];
                                if (var42 != null && var42.field3365) {
                                    class128.method955(var42, true);
                                }
                            }
                        }
                        if (class302.field4615 == 0) {
                            if (!var22) {
                                class126.field1976 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class22.field321; var43 < class183.field2743; var43++) {
            class221[][] var44 = class158.field2367[var43];
            for (int var45 = -class90.field1339; var45 <= 0; var45++) {
                int var46 = class271.field4153 + var45;
                int var47 = class271.field4153 - var45;
                if (var46 >= class183.field2741 || var47 < class327.field4917) {
                    for (int var48 = -class90.field1339; var48 <= 0; var48++) {
                        int var49 = class147.field2214 + var48;
                        int var50 = class147.field2214 - var48;
                        if (var46 >= class183.field2741) {
                            if (var49 >= class212.field3223) {
                                class221 var51 = var44[var46][var49];
                                if (var51 != null && var51.field3365) {
                                    class128.method955(var51, false);
                                }
                            }
                            if (var50 < class76.field993) {
                                class221 var52 = var44[var46][var50];
                                if (var52 != null && var52.field3365) {
                                    class128.method955(var52, false);
                                }
                            }
                        }
                        if (var47 < class327.field4917) {
                            if (var49 >= class212.field3223) {
                                class221 var53 = var44[var47][var49];
                                if (var53 != null && var53.field3365) {
                                    class128.method955(var53, false);
                                }
                            }
                            if (var50 < class76.field993) {
                                class221 var54 = var44[var47][var50];
                                if (var54 != null && var54.field3365) {
                                    class128.method955(var54, false);
                                }
                            }
                        }
                        if (class302.field4615 == 0) {
                            if (!var22) {
                                class126.field1976 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class126.field1976 = false;
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(I)I", line = 649)
    public final int method1185(int arg0) {
        if (arg0 == 649254432) {
            field2535++;
            return (int) (this.field1603 >>> 32 & 0xFFL);
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)I", line = 663)
    public static final int method1186(int arg0, int arg1) {
        if (arg1 == 0) {
            field2526++;
            return arg0 & 0xFF;
        } else {
            return 9;
        }
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(B)J", line = 676)
    public final long method1187(byte arg0) {
        field2525++;
        int var2 = -14 / ((73 - arg0) / 36);
        return this.field2955 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(II)V", line = 685)
    public class169(int arg0, int arg1) {
        this.field1603 = (long) arg1 | (long) arg0 << 32;
    }
}
