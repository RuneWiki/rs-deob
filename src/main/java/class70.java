import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public abstract class class70 extends class232 {

    @OriginalMember(owner = "client!je", name = "I", descriptor = "Z")
    public static boolean field1142 = false;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "Lok;")
    public static class146 field1146 = class235.method1724(-12908, "http:)4)4");

    @OriginalMember(owner = "client!je", name = "R", descriptor = "Z")
    public static boolean field1151 = false;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "Z")
    public static boolean field1147 = true;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "I")
    public static int field1154 = 0;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "I")
    public int field1140;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "I")
    public int field1144;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "I")
    public int field1145;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    public int field1148;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "client!je", name = "S", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!je", name = "T", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!je", name = "V", descriptor = "I")
    public int field1155;

    @OriginalMember(owner = "client!je", name = "W", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "Lng;")
    public static class156 field1139;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIBI)V", line = 10)
    public final void method517(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1156++;
        int var6 = this.field1144 << 3;
        int var7 = (arg2 << 4) + (var6 & 0xF);
        int var8 = this.field1140 << 3;
        int var9 = (arg4 << 4) + (var8 & 0xF);
        if (arg3 != 71) {
            method520(94, -35, false);
        }
        this.method56(var6, var8, var7, var9, arg0, arg1);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BLjava/lang/String;)V", line = 38)
    public static final void method518(byte arg0, String arg1) {
        int var2 = 104 / ((85 - arg0) / 38);
        for (int var3 = arg1.indexOf("%0a"); var3 != -1; var3 = arg1.indexOf("%0a", var3)) {
            arg1 = arg1.substring(0, var3) + "\n" + arg1.substring(var3 + 3);
        }
        System.out.println("Error: " + arg1);
        field1141++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIBII)V", line = 58)
    public static final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field1143++;
        if (arg6 >= -120) {
            field1151 = true;
        }
        for (int var9 = 0; var9 < class135.field2255.field4796; var9++) {
            if (class135.field2255.method2036(var9, 8)) {
                int var10 = class33.field639 + class191.field3152 - class135.field2255.field4793[var9] - 1;
                int var11 = class135.field2255.field4792[var9] - class277.field4764;
                int var12 = (var11 - arg4) * (arg1 - arg5) / (arg8 - arg4) + arg5;
                int var13 = arg7 + ((var10 - arg0) * (arg2 - arg7) / (arg3 - arg0));
                int var14 = class135.field2255.method2030(var9, (byte) -104);
                int var15 = 16777215;
                class246 var16 = null;
                if (var14 == 0) {
                    if ((double) class133.field2231 == 3.0D) {
                        var16 = class20.field382;
                    }
                    if ((double) class133.field2231 == 4.0D) {
                        var16 = class14.field269;
                    }
                    if ((double) class133.field2231 == 6.0D) {
                        var16 = class89.field1423;
                    }
                    if ((double) class133.field2231 >= 8.0D) {
                        var16 = class309.field5253;
                    }
                }
                if (var14 == 1) {
                    if ((double) class133.field2231 == 3.0D) {
                        var16 = class89.field1423;
                    }
                    if ((double) class133.field2231 == 4.0D) {
                        var16 = class309.field5253;
                    }
                    if ((double) class133.field2231 == 6.0D) {
                        var16 = class26.field461;
                    }
                    if ((double) class133.field2231 >= 8.0D) {
                        var16 = class226.field3774;
                    }
                }
                if (var14 == 2) {
                    var15 = 16755200;
                    if ((double) class133.field2231 == 3.0D) {
                        var16 = class26.field461;
                    }
                    if ((double) class133.field2231 == 4.0D) {
                        var16 = class226.field3774;
                    }
                    if ((double) class133.field2231 == 6.0D) {
                        var16 = class192.field3173;
                    }
                    if ((double) class133.field2231 >= 8.0D) {
                        var16 = class101.field1632;
                    }
                }
                if (class135.field2255.field4798[var9] != -1) {
                    var15 = class135.field2255.field4798[var9];
                }
                if (var16 != null) {
                    int var17 = class274.field4725.method203(class135.field2255.field4805[var9], (int[]) null, class135.field2271);
                    int var18 = var13 - (var17 - 1) * var16.method1778() / 2;
                    int var19 = var18 + var16.method1780() / 2;
                    for (int var20 = 0; var20 < var17; var20++) {
                        class146 var21 = class135.field2271[var20];
                        if (var20 < var17 - 1) {
                            var21.method1120(var21.method1094((byte) -57) - 4, true);
                        }
                        var16.method1787(var21, var12, var19, var15, true);
                        var19 += var16.method1778();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIZ)V", line = 179)
    public static final void method520(int arg0, int arg1, boolean arg2) {
        class306.field5242++;
        field1149++;
        class47.field820.method1656(194, 16);
        class47.field820.method387(arg0, 119);
        if (arg2) {
            class47.field820.method330(arg1, 128);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II[Lr;)V", line = 198)
    public static final void method521(int arg0, int arg1, class264[] arg2) {
        field1153++;
        if (arg0 != -1) {
            field1146 = (class146) null;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class264 var4 = arg2[var3];
            if (var4 != null && var4.field4497 == arg1 && (!var4.field4462 || !client.method1795(var4))) {
                if (var4.field4536 == 0) {
                    if (!var4.field4462 && client.method1795(var4) && class124.field2037 != var4) {
                        continue;
                    }
                    method521(-1, var4.field4461, arg2);
                    if (var4.field4402 != null) {
                        method521(-1, var4.field4461, var4.field4402);
                    }
                    class142 var5 = (class142) class135.field2266.method810((byte) -127, (long) var4.field4461);
                    if (var5 != null) {
                        class274.method2000(var5.field2370, false);
                    }
                }
                if (var4.field4536 == 6) {
                    if (var4.field4378 != -1 || var4.field4488 != -1) {
                        boolean var6 = class79.method565(var4, arg0 ^ 0x3090);
                        int var7;
                        if (var6) {
                            var7 = var4.field4488;
                        } else {
                            var7 = var4.field4378;
                        }
                        if (var7 != -1) {
                            class287 var8 = class306.method2156(127, var7);
                            if (var8 != null) {
                                var4.field4448 += class214.field3534;
                                while (var4.field4448 > var8.field4898[var4.field4474]) {
                                    var4.field4448 -= var8.field4898[var4.field4474];
                                    var4.field4474++;
                                    if (var8.field4904.length <= var4.field4474) {
                                        var4.field4474 -= var8.field4893;
                                        if (var4.field4474 < 0 || var8.field4904.length <= var4.field4474) {
                                            var4.field4474 = 0;
                                        }
                                    }
                                    class164.method1280(false, var4);
                                }
                            }
                        }
                    }
                    if (var4.field4528 != 0 && !var4.field4462) {
                        int var9 = var4.field4528 >> 16;
                        int var10 = class214.field3534 * var9;
                        int var11 = var4.field4528 << 16 >> 16;
                        var4.field4410 = var4.field4410 + var10 & 0x7FF;
                        int var12 = class214.field3534 * var11;
                        var4.field4514 = var4.field4514 + var12 & 0x7FF;
                        class164.method1280(false, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V", line = 329)
    public static void method522(boolean arg0) {
        field1139 = null;
        field1146 = null;
        if (arg0) {
            field1154 = 6;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIII)V", line = 353)
    public static final void method523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = arg6 - arg4;
        int var11 = arg6 * arg6;
        int var12 = arg2 - arg4;
        int var13 = arg2;
        int var14 = arg2 * arg2;
        int var15 = var10 * var10;
        field1152++;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var11 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = var14 - (var21 - 1) * var18;
        int var24 = (1 - var21) * var11 + var17;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        if (arg0 != -22130) {
            return;
        }
        int var27 = var11 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var17 * 3;
        int var31 = (var21 - 3) * var18;
        int var32 = var16 << 2;
        int var33 = (var22 - 3) * var20;
        int var34 = var19 * 3;
        int var35 = var28;
        int var36 = (arg2 - 1) * var27;
        int var37 = var32;
        int[] var38 = class81.field1297[arg3];
        class40.method281(arg5, arg7 - arg6, var38, arg7 - var10, 7);
        int var39 = (var12 - 1) * var29;
        class40.method281(arg1, arg7 - var10, var38, arg7 + var10, arg0 ^ 0xFFFFA989);
        class40.method281(arg5, arg7 + var10, var38, arg7 + arg6, arg0 + 22137);
        while (var13 > 0) {
            boolean var40 = var13 <= var12;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var34;
                        var8++;
                        var34 += var32;
                        var37 += var32;
                    }
                }
                if (var26 < 0) {
                    var8++;
                    var26 += var37;
                    var37 += var32;
                    var25 += var34;
                    var34 += var32;
                }
                var26 += -var33;
                var33 -= var29;
                var25 += -var39;
                var39 -= var29;
            }
            if (var24 < 0) {
                while (var24 < 0) {
                    var9++;
                    var24 += var30;
                    var23 += var35;
                    var30 += var28;
                    var35 += var28;
                }
            }
            var13--;
            if (var23 < 0) {
                var9++;
                var23 += var35;
                var24 += var30;
                var35 += var28;
                var30 += var28;
            }
            int var41 = arg3 - var13;
            var24 += -var36;
            var23 += -var31;
            var36 -= var27;
            int var42 = arg7 + var9;
            var31 -= var27;
            int var43 = arg7 - var9;
            int var44 = arg3 + var13;
            if (var40) {
                int var45 = arg7 + var8;
                int var46 = arg7 - var8;
                class40.method281(arg5, var43, class81.field1297[var41], var46, 7);
                class40.method281(arg1, var46, class81.field1297[var41], var45, 7);
                class40.method281(arg5, var45, class81.field1297[var41], var42, 7);
                class40.method281(arg5, var43, class81.field1297[var44], var46, arg0 + 22137);
                class40.method281(arg1, var46, class81.field1297[var44], var45, 7);
                class40.method281(arg5, var45, class81.field1297[var44], var42, arg0 ^ 0xFFFFA989);
            } else {
                class40.method281(arg5, var43, class81.field1297[var41], var42, 7);
                class40.method281(arg5, var43, class81.field1297[var44], var42, 7);
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
    public abstract void method53(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIII)V")
    public abstract void method50(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)V")
    public abstract void method47(int arg0, int arg1);

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(II)V")
    public abstract void method49(int arg0, int arg1);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIII)V")
    public abstract void method58(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(IIIIII)V")
    public abstract void method56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(II)V")
    public abstract void method46(int arg0, int arg1);
}
