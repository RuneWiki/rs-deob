import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class251 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lgk;")
    public static class157 field4400 = new class157();

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Lid;")
    public static class149 field4404 = class60.method382("titlebg", (byte) 6);

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "[I")
    public static int[] field4407 = new int[2048];

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "Lsi;")
    public static class198 field4408;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZZ)Lid;")
    public static final class149 method1740(int arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            field4405++;
            return class249.method1727(arg1, 0, arg0, 10);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)Laj;")
    public static final class47 method1741(byte arg0, int arg1) {
        if (arg0 != 110) {
            method1744(33, 71, 15, (byte[][][]) null, -72, (byte) -22, 118, 1);
        }
        field4401++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class14.field206[var2] == null || class14.field206[var2][var3] == null) {
            boolean var4 = class104.method735(var2, false);
            if (!var4) {
                return null;
            }
        }
        return class14.field206[var2][var3];
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static void method1742(int arg0) {
        field4408 = null;
        field4407 = null;
        field4404 = null;
        field4400 = null;
        if (arg0 <= 33) {
            field4407 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)V")
    public static final void method1743(int arg0, byte arg1) {
        class249.field4358.method1289(arg0, 124);
        field4403++;
        class231.field4066.method1289(arg0, 107);
        class148.field2666.method1289(arg0, 86);
        if (arg1 >= -15) {
            field4408 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method1744(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class96.field1704++;
        class68.field1194 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class161.field2979; var12 < class62.field1114; var12++) {
            class231[][] var38 = class261.field4664[var12];
            for (int var39 = class224.field3945; var39 < class286.field5081; var39++) {
                for (int var40 = class75.field1348; var40 < class245.field4314; var40++) {
                    class231 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class272.field4897[var39 + class200.field3624 - class118.field2011][var40 + class200.field3624 - class124.field2186] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field4055 = true;
                            var41.field4063 = true;
                            if (var41.field4047 > 0) {
                                var41.field4058 = true;
                            } else {
                                var41.field4058 = false;
                            }
                            class68.field1194++;
                        } else {
                            var41.field4055 = false;
                            var41.field4063 = false;
                            var41.field4057 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field4053 != null) {
                                    class125 var42 = var41.field4053;
                                    var42.field2203.method49(0, var12, var42.field2206, var42.field2202, var42.field2207);
                                    if (var42.field2197 != null) {
                                        var42.field2197.method49(0, var12, var42.field2206, var42.field2202, var42.field2207);
                                    }
                                }
                                if (var41.field4056 != null) {
                                    class158 var43 = var41.field4056;
                                    var43.field2911.method49(var43.field2909, var12, var43.field2907, var43.field2906, var43.field2904);
                                    if (var43.field2913 != null) {
                                        var43.field2913.method49(var43.field2909, var12, var43.field2907, var43.field2906, var43.field2904);
                                    }
                                }
                                if (var41.field4048 != null) {
                                    class100 var44 = var41.field4048;
                                    var44.field1764.method49(0, var12, var44.field1772, var44.field1767, var44.field1761);
                                }
                                if (var41.field4061 != null) {
                                    for (int var45 = 0; var45 < var41.field4047; var45++) {
                                        class23 var46 = var41.field4061[var45];
                                        var46.field343.method49(var46.field323, var12, var46.field337, var46.field320, var46.field336);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class54.field973 == class189.field3393;
        for (int var14 = class161.field2979; var14 < class62.field1114; var14++) {
            class231[][] var27 = class261.field4664[var14];
            for (int var28 = -class200.field3624; var28 <= 0; var28++) {
                int var29 = class118.field2011 + var28;
                int var30 = class118.field2011 - var28;
                if (var29 >= class224.field3945 || var30 < class286.field5081) {
                    for (int var31 = -class200.field3624; var31 <= 0; var31++) {
                        int var32 = class124.field2186 + var31;
                        int var33 = class124.field2186 - var31;
                        if (var29 >= class224.field3945) {
                            if (var32 >= class75.field1348) {
                                class231 var34 = var27[var29][var32];
                                if (var34 != null && var34.field4055) {
                                    class284.method1948(var34, true);
                                }
                            }
                            if (var33 < class245.field4314) {
                                class231 var35 = var27[var29][var33];
                                if (var35 != null && var35.field4055) {
                                    class284.method1948(var35, true);
                                }
                            }
                        }
                        if (var30 < class286.field5081) {
                            if (var32 >= class75.field1348) {
                                class231 var36 = var27[var30][var32];
                                if (var36 != null && var36.field4055) {
                                    class284.method1948(var36, true);
                                }
                            }
                            if (var33 < class245.field4314) {
                                class231 var37 = var27[var30][var33];
                                if (var37 != null && var37.field4055) {
                                    class284.method1948(var37, true);
                                }
                            }
                        }
                        if (class68.field1194 == 0) {
                            if (!var13) {
                                class246.field4317 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class161.field2979; var15 < class62.field1114; var15++) {
            class231[][] var16 = class261.field4664[var15];
            for (int var17 = -class200.field3624; var17 <= 0; var17++) {
                int var18 = class118.field2011 + var17;
                int var19 = class118.field2011 - var17;
                if (var18 >= class224.field3945 || var19 < class286.field5081) {
                    for (int var20 = -class200.field3624; var20 <= 0; var20++) {
                        int var21 = class124.field2186 + var20;
                        int var22 = class124.field2186 - var20;
                        if (var18 >= class224.field3945) {
                            if (var21 >= class75.field1348) {
                                class231 var23 = var16[var18][var21];
                                if (var23 != null && var23.field4055) {
                                    class284.method1948(var23, false);
                                }
                            }
                            if (var22 < class245.field4314) {
                                class231 var24 = var16[var18][var22];
                                if (var24 != null && var24.field4055) {
                                    class284.method1948(var24, false);
                                }
                            }
                        }
                        if (var19 < class286.field5081) {
                            if (var21 >= class75.field1348) {
                                class231 var25 = var16[var19][var21];
                                if (var25 != null && var25.field4055) {
                                    class284.method1948(var25, false);
                                }
                            }
                            if (var22 < class245.field4314) {
                                class231 var26 = var16[var19][var22];
                                if (var26 != null && var26.field4055) {
                                    class284.method1948(var26, false);
                                }
                            }
                        }
                        if (class68.field1194 == 0) {
                            if (!var13) {
                                class246.field4317 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class246.field4317 = false;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V")
    public static final void method1745(int arg0, int arg1) {
        class118.field2004.method1289(arg0, 95);
        field4402++;
        if (arg1 != 0) {
            field4404 = null;
        }
    }
}
