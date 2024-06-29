import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class218 extends class87 {

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "Z")
    public static boolean field3190 = false;

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "Ljava/lang/String;")
    public static String field3191 = "Loaded sprites";

    @OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
    public static int field3184 = -1;

    @OriginalMember(owner = "client!vi", name = "I", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!vi", name = "J", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!vi", name = "H", descriptor = "Lvf;")
    public static class60 field3185;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method1520(String arg0, int arg1, boolean arg2) {
        if (arg1 != 16) {
            return;
        }
        if (arg2) {
            try {
                class93.field1507.getAppletContext().showDocument(new URL(class93.field1507.getCodeBase(), arg0), "_blank");
            } catch (Exception var5) {
            }
        } else {
            try {
                class150.method1120(class273.field4426.field2020, false, "loggedout");
            } catch (Throwable var4) {
            }
            try {
                class93.field1507.getAppletContext().showDocument(new URL(class93.field1507.getCodeBase(), arg0), "_top");
            } catch (Exception var3) {
            }
        }
        field3187++;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method1521(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field3189++;
        if (class309.method2092(91923, arg3)) {
            client.method907(class134.field2195[arg3], -1, arg6, arg1, arg7, arg0, arg5, arg2);
            if (arg4 <= 62) {
                field3186 = 52;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class218() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(B)V")
    public static void method1522(byte arg0) {
        if (arg0 < -69) {
            field3191 = null;
            field3185 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method1523(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class47.field652++;
        class106.field1816 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class129.field2155; var12 < class188.field2799; var12++) {
            class313[][] var38 = class223.field3286[var12];
            for (int var39 = class223.field3264; var39 < class251.field3796; var39++) {
                for (int var40 = class104.field1797; var40 < field3186; var40++) {
                    class313 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class79.field1276[var39 + class91.field1457 - class142.field2288][var40 + class91.field1457 - class138.field2252] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field5020 = true;
                            var41.field5029 = true;
                            if (var41.field5022 > 0) {
                                var41.field5028 = true;
                            } else {
                                var41.field5028 = false;
                            }
                            class106.field1816++;
                        } else {
                            var41.field5020 = false;
                            var41.field5029 = false;
                            var41.field5031 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field5012 != null) {
                                    class231 var42 = var41.field5012;
                                    var42.field3401.method15(0, var12, var42.field3391, var42.field3399, var42.field3403);
                                    if (var42.field3388 != null) {
                                        var42.field3388.method15(0, var12, var42.field3391, var42.field3399, var42.field3403);
                                    }
                                }
                                if (var41.field5023 != null) {
                                    class272 var43 = var41.field5023;
                                    var43.field4402.method15(var43.field4407, var12, var43.field4403, var43.field4397, var43.field4396);
                                    if (var43.field4401 != null) {
                                        var43.field4401.method15(var43.field4407, var12, var43.field4403, var43.field4397, var43.field4396);
                                    }
                                }
                                if (var41.field5027 != null) {
                                    class214 var44 = var41.field5027;
                                    var44.field3150.method15(0, var12, var44.field3144, var44.field3142, var44.field3143);
                                }
                                if (var41.field5037 != null) {
                                    for (int var45 = 0; var45 < var41.field5022; var45++) {
                                        class156 var46 = var41.field5037[var45];
                                        var46.field2436.method15(var46.field2442, var12, var46.field2437, var46.field2440, var46.field2445);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class277.field4486 == class103.field1792;
        for (int var14 = class129.field2155; var14 < class188.field2799; var14++) {
            class313[][] var27 = class223.field3286[var14];
            for (int var28 = -class91.field1457; var28 <= 0; var28++) {
                int var29 = class142.field2288 + var28;
                int var30 = class142.field2288 - var28;
                if (var29 >= class223.field3264 || var30 < class251.field3796) {
                    for (int var31 = -class91.field1457; var31 <= 0; var31++) {
                        int var32 = class138.field2252 + var31;
                        int var33 = class138.field2252 - var31;
                        if (var29 >= class223.field3264) {
                            if (var32 >= class104.field1797) {
                                class313 var34 = var27[var29][var32];
                                if (var34 != null && var34.field5020) {
                                    class226.method1568(var34, true);
                                }
                            }
                            if (var33 < field3186) {
                                class313 var35 = var27[var29][var33];
                                if (var35 != null && var35.field5020) {
                                    class226.method1568(var35, true);
                                }
                            }
                        }
                        if (var30 < class251.field3796) {
                            if (var32 >= class104.field1797) {
                                class313 var36 = var27[var30][var32];
                                if (var36 != null && var36.field5020) {
                                    class226.method1568(var36, true);
                                }
                            }
                            if (var33 < field3186) {
                                class313 var37 = var27[var30][var33];
                                if (var37 != null && var37.field5020) {
                                    class226.method1568(var37, true);
                                }
                            }
                        }
                        if (class106.field1816 == 0) {
                            if (!var13) {
                                class32.field404 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class129.field2155; var15 < class188.field2799; var15++) {
            class313[][] var16 = class223.field3286[var15];
            for (int var17 = -class91.field1457; var17 <= 0; var17++) {
                int var18 = class142.field2288 + var17;
                int var19 = class142.field2288 - var17;
                if (var18 >= class223.field3264 || var19 < class251.field3796) {
                    for (int var20 = -class91.field1457; var20 <= 0; var20++) {
                        int var21 = class138.field2252 + var20;
                        int var22 = class138.field2252 - var20;
                        if (var18 >= class223.field3264) {
                            if (var21 >= class104.field1797) {
                                class313 var23 = var16[var18][var21];
                                if (var23 != null && var23.field5020) {
                                    class226.method1568(var23, false);
                                }
                            }
                            if (var22 < field3186) {
                                class313 var24 = var16[var18][var22];
                                if (var24 != null && var24.field5020) {
                                    class226.method1568(var24, false);
                                }
                            }
                        }
                        if (var19 < class251.field3796) {
                            if (var21 >= class104.field1797) {
                                class313 var25 = var16[var19][var21];
                                if (var25 != null && var25.field5020) {
                                    class226.method1568(var25, false);
                                }
                            }
                            if (var22 < field3186) {
                                class313 var26 = var16[var19][var22];
                                if (var26 != null && var26.field5020) {
                                    class226.method1568(var26, false);
                                }
                            }
                        }
                        if (class106.field1816 == 0) {
                            if (!var13) {
                                class32.field404 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class32.field404 = false;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class57 var7 = new class57();
        var7.field827 = arg1 / 128;
        var7.field848 = arg2 / 128;
        var7.field831 = arg3 / 128;
        var7.field825 = arg4 / 128;
        var7.field826 = arg0;
        var7.field844 = arg1;
        var7.field846 = arg2;
        var7.field847 = arg3;
        var7.field834 = arg4;
        var7.field849 = arg5;
        var7.field839 = arg6;
        class254.field3829[class139.field2268++] = var7;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        if (arg1) {
            method1522((byte) 111);
        }
        field3192++;
        return class138.field2254;
    }
}
