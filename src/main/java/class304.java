import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class304 extends class149 {

    @OriginalMember(owner = "client!c", name = "C", descriptor = "Lwm;")
    public static class152 field5226 = class157.method1048("Clientscript error in: ", 96);

    @OriginalMember(owner = "client!c", name = "H", descriptor = "[I")
    public static int[] field5231 = new int[256];

    @OriginalMember(owner = "client!c", name = "G", descriptor = "I")
    public static int field5230 = 1;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    public static int field5229 = 0;

    @OriginalMember(owner = "client!c", name = "B", descriptor = "Lwm;")
    public static class152 field5225 = class157.method1048("event_opbase", 121);

    @OriginalMember(owner = "client!c", name = "D", descriptor = "[I")
    public static int[] field5227 = new int[14];

    @OriginalMember(owner = "client!c", name = "K", descriptor = "[Z")
    public static boolean[] field5234 = new boolean[200];

    @OriginalMember(owner = "client!c", name = "J", descriptor = "F")
    public static float field5233;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII[IIZIIII)V", line = 17)
    public static final void method2121(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg2 != -22084) {
            return;
        }
        field5228++;
        int var11 = arg10;
        if (arg10 >= class96.field1378) {
            return;
        }
        if (arg10 < class96.field1379) {
            var11 = class96.field1379;
        }
        int var12 = arg3 + arg10;
        if (class96.field1379 >= var12) {
            return;
        }
        if (var12 > class96.field1378) {
            var12 = class96.field1378;
        }
        int var13 = arg5;
        if (arg5 >= class96.field1374) {
            return;
        }
        if (class96.field1375 > arg5) {
            var13 = class96.field1375;
        }
        int var14 = arg5 + arg7;
        if (class96.field1375 >= var14) {
            return;
        }
        if (var14 > class96.field1374) {
            var14 = class96.field1374;
        }
        int var15 = class96.field1380 * var13 + var11;
        int var16 = var13 - arg5;
        int var17 = var14 - arg5;
        int var18 = class96.field1380 + var11 - var12;
        int var19 = var11 - arg10;
        if (arg1 == 9) {
            arg1 = 1;
            arg8 = arg8 + 1 & 0x3;
        }
        if (arg1 == 10) {
            arg8 = arg8 + 3 & 0x3;
            arg1 = 1;
        }
        int var20 = var12 - arg10;
        if (arg1 == 11) {
            arg1 = 8;
            arg8 = arg8 + 3 & 0x3;
        }
        int var21 = arg3 - var20;
        int var22 = arg7 - var17;
        int var23 = arg7 - var16;
        int var24 = arg3 - var19;
        if (arg1 == 1) {
            if (arg8 == 0) {
                for (int var25 = var16; var25 < var17; var25++) {
                    for (int var26 = var19; var26 < var20; var26++) {
                        if (var26 <= var25) {
                            arg4[var15] = arg9;
                        } else if (arg6) {
                            arg4[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 1) {
                for (int var31 = var23 - 1; var31 >= var22; var31--) {
                    for (int var32 = var19; var32 < var20; var32++) {
                        if (var32 <= var31) {
                            arg4[var15] = arg9;
                        } else if (arg6) {
                            arg4[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 2) {
                for (int var27 = var16; var27 < var17; var27++) {
                    for (int var28 = var19; var28 < var20; var28++) {
                        if (var28 >= var27) {
                            arg4[var15] = arg9;
                        } else if (arg6) {
                            arg4[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 3) {
                for (int var29 = var23 - 1; var29 >= var22; var29--) {
                    for (int var30 = var19; var30 < var20; var30++) {
                        if (var29 <= var30) {
                            arg4[var15] = arg9;
                        } else if (arg6) {
                            arg4[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg1 == 2) {
            if (arg8 == 0) {
                for (int var33 = var23 - 1; var33 >= var22; var33--) {
                    for (int var34 = var19; var34 < var20; var34++) {
                        if (var34 <= (var33 >> 1)) {
                            arg4[var15] = arg9;
                        } else if (arg6) {
                            arg4[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 1) {
                for (int var35 = var16; var35 < var17; var35++) {
                    for (int var36 = var19; var36 < var20; var36++) {
                        if (var15 >= 0 && var15 < arg4.length) {
                            if (var36 >= (var35 << 1)) {
                                arg4[var15] = arg9;
                            } else if (arg6) {
                                arg4[var15] = arg0;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var18;
                }
            } else if (arg8 == 2) {
                for (int var37 = var16; var37 < var17; var37++) {
                    for (int var38 = var24 - 1; var38 >= var21; var38--) {
                        if (var38 <= (var37 >> 1)) {
                            arg4[var15] = arg9;
                        } else if (arg6) {
                            arg4[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 3) {
                for (int var39 = var23 - 1; var39 >= var22; var39--) {
                    for (int var40 = var24 - 1; var40 >= var21; var40--) {
                        if (var39 << 1 <= var40) {
                            arg4[var15] = arg9;
                        } else if (arg6) {
                            arg4[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg1 == 3) {
            if (arg8 == 0) {
                for (int var87 = var23 - 1; var87 >= var22; var87--) {
                    for (int var88 = var24 - 1; var88 >= var21; var88--) {
                        if (var87 >> 1 >= var88) {
                            arg4[var15] = arg9;
                        } else if (arg6) {
                            arg4[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 1) {
                for (int var81 = var23 - 1; var81 >= var22; var81--) {
                    for (int var82 = var19; var82 < var20; var82++) {
                        if (var82 >= var81 << 1) {
                            arg4[var15] = arg9;
                        } else if (arg6) {
                            arg4[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 2) {
                for (int var85 = var16; var85 < var17; var85++) {
                    for (int var86 = var19; var86 < var20; var86++) {
                        if (var85 >> 1 >= var86) {
                            arg4[var15] = arg9;
                        } else if (arg6) {
                            arg4[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 3) {
                for (int var83 = var16; var83 < var17; var83++) {
                    for (int var84 = var24 - 1; var84 >= var21; var84--) {
                        if ((var83 << 1) <= var84) {
                            arg4[var15] = arg9;
                        } else if (arg6) {
                            arg4[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg1 == 4) {
            if (arg8 == 0) {
                for (int var79 = var23 - 1; var79 >= var22; var79--) {
                    for (int var80 = var19; var80 < var20; var80++) {
                        if ((var79 >> 1) <= var80) {
                            arg4[var15] = arg9;
                        } else if (arg6) {
                            arg4[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 1) {
                for (int var73 = var16; var73 < var17; var73++) {
                    for (int var74 = var19; var74 < var20; var74++) {
                        if (var74 <= var73 << 1) {
                            arg4[var15] = arg9;
                        } else if (arg6) {
                            arg4[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 2) {
                for (int var75 = var16; var75 < var17; var75++) {
                    for (int var76 = var24 - 1; var76 >= var21; var76--) {
                        if (var76 >= var75 >> 1) {
                            arg4[var15] = arg9;
                        } else if (arg6) {
                            arg4[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 3) {
                for (int var77 = var23 - 1; var77 >= var22; var77--) {
                    for (int var78 = var24 - 1; var78 >= var21; var78--) {
                        if (var78 <= (var77 << 1)) {
                            arg4[var15] = arg9;
                        } else if (arg6) {
                            arg4[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg1 != 5) {
            if (arg1 == 6) {
                if (arg8 == 0) {
                    for (int var71 = var16; var71 < var17; var71++) {
                        for (int var72 = var19; var72 < var20; var72++) {
                            if (var72 <= arg3 / 2) {
                                arg4[var15] = arg9;
                            } else if (arg6) {
                                arg4[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var49 = var16; var49 < var17; var49++) {
                        for (int var50 = var19; var50 < var20; var50++) {
                            if (var49 <= (arg7 / 2)) {
                                arg4[var15] = arg9;
                            } else if (arg6) {
                                arg4[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var69 = var16; var69 < var17; var69++) {
                        for (int var70 = var19; var70 < var20; var70++) {
                            if (var70 >= (arg3 / 2)) {
                                arg4[var15] = arg9;
                            } else if (arg6) {
                                arg4[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var67 = var16; var67 < var17; var67++) {
                        for (int var68 = var19; var68 < var20; var68++) {
                            if ((arg7 / 2) <= var67) {
                                arg4[var15] = arg9;
                            } else if (arg6) {
                                arg4[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg1 == 7) {
                if (arg8 == 0) {
                    for (int var51 = var16; var51 < var17; var51++) {
                        for (int var52 = var19; var52 < var20; var52++) {
                            if ((var51 - (arg7 / 2)) >= var52) {
                                arg4[var15] = arg9;
                            } else if (arg6) {
                                arg4[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var65 = var23 - 1; var65 >= var22; var65--) {
                        for (int var66 = var19; var66 < var20; var66++) {
                            if (var66 <= var65 - (arg7 / 2)) {
                                arg4[var15] = arg9;
                            } else if (arg6) {
                                arg4[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var63 = var23 - 1; var63 >= var22; var63--) {
                        for (int var64 = var24 - 1; var64 >= var21; var64--) {
                            if (var64 <= (var63 - (arg7 / 2))) {
                                arg4[var15] = arg9;
                            } else if (arg6) {
                                arg4[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var61 = var16; var61 < var17; var61++) {
                        for (int var62 = var24 - 1; var62 >= var21; var62--) {
                            if (var62 <= var61 - arg7 / 2) {
                                arg4[var15] = arg9;
                            } else if (arg6) {
                                arg4[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg1 == 8) {
                if (arg8 == 0) {
                    for (int var59 = var16; var59 < var17; var59++) {
                        for (int var60 = var19; var60 < var20; var60++) {
                            if ((var59 - (arg7 / 2)) <= var60) {
                                arg4[var15] = arg9;
                            } else if (arg6) {
                                arg4[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var57 = var23 - 1; var57 >= var22; var57--) {
                        for (int var58 = var19; var58 < var20; var58++) {
                            if (var57 - (arg7 / 2) <= var58) {
                                arg4[var15] = arg9;
                            } else if (arg6) {
                                arg4[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var55 = var23 - 1; var55 >= var22; var55--) {
                        for (int var56 = var24 - 1; var56 >= var21; var56--) {
                            if ((var55 - (arg7 / 2)) <= var56) {
                                arg4[var15] = arg9;
                            } else if (arg6) {
                                arg4[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var53 = var16; var53 < var17; var53++) {
                        for (int var54 = var24 - 1; var54 >= var21; var54--) {
                            if (var54 >= var53 - (arg7 / 2)) {
                                arg4[var15] = arg9;
                            } else if (arg6) {
                                arg4[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
        } else if (arg8 == 0) {
            for (int var41 = var23 - 1; var41 >= var22; var41--) {
                for (int var42 = var24 - 1; var42 >= var21; var42--) {
                    if (var42 >= var41 >> 1) {
                        arg4[var15] = arg9;
                    } else if (arg6) {
                        arg4[var15] = arg0;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg8 == 1) {
            for (int var43 = var23 - 1; var43 >= var22; var43--) {
                for (int var44 = var19; var44 < var20; var44++) {
                    if (var43 << 1 >= var44) {
                        arg4[var15] = arg9;
                    } else if (arg6) {
                        arg4[var15] = arg0;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg8 == 2) {
            for (int var47 = var16; var47 < var17; var47++) {
                for (int var48 = var19; var48 < var20; var48++) {
                    if (var47 >> 1 <= var48) {
                        arg4[var15] = arg9;
                    } else if (arg6) {
                        arg4[var15] = arg0;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg8 == 3) {
            for (int var45 = var16; var45 < var17; var45++) {
                for (int var46 = var24 - 1; var46 >= var21; var46--) {
                    if (var46 <= var45 << 1) {
                        arg4[var15] = arg9;
                    } else if (arg6) {
                        arg4[var15] = arg0;
                    }
                    var15++;
                }
                var15 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)Z", line = 1210)
    public static final boolean method2122(boolean arg0) {
        field5232++;
        try {
            if (arg0) {
                method2124(true);
            }
            return class87.method570(125);
        } catch (IOException var5) {
            class234.method1606(22243);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class294.field5034 + "," + class59.field902 + "," + class291.field4968 + " - " + class288.field4882 + "," + (class85.field1176.field4188[0] + class272.field4670) + "," + (class85.field1176.field4245[0] + class199.field3226) + " - ";
            for (int var4 = 0; class288.field4882 > var4 && var4 < 50; var4++) {
                var3 = var3 + class73.field1058.field4950[var4] + ",";
            }
            class169.method1109(var6, (byte) -94, var3);
            class211.method1418(2130);
            return true;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IILah;)Loc;", line = 1243)
    public static final class143 method2123(int arg0, int arg1, class205 arg2) {
        field5237++;
        byte[] var3 = arg2.method1371(arg0, arg1 ^ arg1);
        return var3 == null ? null : new class143(var3);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)V", line = 1277)
    public static final void method2124(boolean arg0) {
        field5236++;
        int var1 = class137.field2100;
        if (arg0) {
            return;
        }
        int var2 = class205.field3350 - var1 - class172.field2757;
        int var3 = class172.field2739;
        int var4 = class81.field1137 - (class227.field3709 + var3);
        if (var1 <= 0 && var2 <= 0 && var3 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class23.field397 != null) {
                var5 = class23.field397;
            } else if (class85.field1201 == null) {
                var5 = class34.field572.field2359;
            } else {
                var5 = class85.field1201;
            }
            int var6 = 0;
            int var7 = 0;
            if (class85.field1201 == var5) {
                Insets var8 = class85.field1201.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class81.field1137);
            }
            if (var3 > 0) {
                var9.fillRect(var6, var7, class205.field3350, var3);
            }
            if (var2 > 0) {
                var9.fillRect(class205.field3350 + var6 - var2, var7, var2, class81.field1137);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class81.field1137 + var7 - var4, class205.field3350, var4);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V", line = 1344)
    public static void method2125(int arg0) {
        if (arg0 != -3) {
            method2124(false);
        }
        field5231 = null;
        field5234 = null;
        field5227 = null;
        field5226 = null;
        field5225 = null;
    }
}
