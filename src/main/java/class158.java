import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class158 {

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "[Lq;")
    private class104[] field2185;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field2179 = 0;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2176 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "[I")
    public static int[] field2178 = new int[2];

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "[[[Ldk;")
    public static class225[][][] field2184;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V", line = 4)
    public static void method1048(byte arg0) {
        field2176 = null;
        field2184 = (class225[][][]) null;
        field2178 = null;
        int var1 = 43 / ((arg0 - 41) / 48);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 40)
    public static final String method1049(byte arg0, int arg1) {
        field2181++;
        if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else if (arg0 > -116) {
            return (String) null;
        } else if (arg1 < 10000000) {
            return "<col=ffffff>" + arg1 / 1000 + class321.field4923 + "</col>";
        } else {
            return "<col=00ff80>" + arg1 / 1000000 + class275.field4290 + "</col>";
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V", line = 58)
    public static final void method1050(int arg0, int arg1) {
        field2182++;
        if (arg0 == 37) {
            class184.field2652 = 3.0F;
        } else if (arg0 == 50) {
            class184.field2652 = 4.0F;
        } else if (arg0 == 75) {
            class184.field2652 = 6.0F;
        } else if (arg0 == 100) {
            class184.field2652 = 8.0F;
        } else if (arg0 == 200) {
            class184.field2652 = 16.0F;
        }
        class30.field383 = -1;
        int var2 = 78 % ((-arg1 - 54) / 35);
        class30.field383 = -1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lve;IIII)V", line = 90)
    public static final void method1051(class282 arg0, int arg1, int arg2, int arg3, int arg4) {
        field2186++;
        if (arg2 != -1) {
            field2177 = -33;
        }
        if (class310.field4794 >= 400) {
            return;
        }
        if (arg0.field4401 != null) {
            arg0 = arg0.method2021((byte) 22);
        }
        if (arg0 == null || !arg0.field4435) {
            return;
        }
        String var5 = arg0.field4418;
        if (arg0.field4407 != 0) {
            String var6 = class249.field3769 == 1 ? class19.field252 : class279.field4338;
            var5 = var5 + class284.method2028(-7, class118.field1664.field1495, arg0.field4407) + " (" + var6 + arg0.field4407 + ")";
        }
        if (class314.field4848 == 1) {
            class168.method1100(arg3, (short) 4, (long) arg4, class285.field4488 + " -> <col=ffff00>" + var5, arg1, arg2 - 500, class47.field551, class50.field629);
            class335.field5173++;
        } else if (class72.field909) {
            class30 var7 = class161.field2219 == -1 ? null : class343.method2373(-116, class161.field2219);
            if ((class37.field442 & 0x2) != 0 && (var7 == null || arg0.method2023(class161.field2219, false, var7.field377) != var7.field377)) {
                class94.field1236++;
                class168.method1100(arg3, (short) 12, (long) arg4, class255.field3892 + " -> <col=ffff00>" + var5, arg1, -501, class229.field3343, class260.field3943);
            }
        } else {
            class100.field1320++;
            String[] var8 = arg0.field4381;
            if (class35.field418) {
                var8 = class293.method2082(var8, (byte) 23);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class249.field3769 != 0 || !var8[var9].equalsIgnoreCase(class311.field4813))) {
                        class90.field1126++;
                        byte var10 = 0;
                        if (var9 == 0) {
                            var10 = 30;
                        }
                        int var11 = -1;
                        if (var9 == 1) {
                            var10 = 46;
                        }
                        if (arg0.field4406 == var9) {
                            var11 = arg0.field4389;
                        }
                        if (var9 == 2) {
                            var10 = 40;
                        }
                        if (var9 == 3) {
                            var10 = 16;
                        }
                        if (arg0.field4404 == var9) {
                            var11 = arg0.field4372;
                        }
                        if (var9 == 4) {
                            var10 = 24;
                        }
                        class168.method1100(arg3, var10, (long) arg4, "<col=ffff00>" + var5, arg1, arg2 - 500, var11, var8[var9]);
                    }
                }
            }
            if (class249.field3769 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class311.field4813)) {
                        class13.field177++;
                        short var13 = 0;
                        if (var12 == 0) {
                            var13 = 30;
                        }
                        if (var12 == 1) {
                            var13 = 46;
                        }
                        short var14 = 0;
                        if (class118.field1664.field1495 < arg0.field4407) {
                            var14 = 2000;
                        }
                        if (var12 == 2) {
                            var13 = 40;
                        }
                        if (var12 == 3) {
                            var13 = 16;
                        }
                        if (var12 == 4) {
                            var13 = 24;
                        }
                        if (var13 != 0) {
                            var13 += var14;
                        }
                        class168.method1100(arg3, var13, (long) arg4, "<col=ffff00>" + var5, arg1, -501, arg0.field4419, var8[var12]);
                    }
                }
            }
            class168.method1100(arg3, (short) 1005, (long) arg4, "<col=ffff00>" + var5, arg1, -501, class60.field738, class343.field5323);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIZ)V", line = 248)
    public static final void method1052(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class62.field788 = arg1;
        class326.field4993 = arg2;
        class342.field5302 = arg3;
        class248.field3764 = new class225[arg0][class62.field788][class326.field4993];
        class74.field957 = new int[arg0][class62.field788 + 1][class326.field4993 + 1];
        if (class250.field3787) {
            class281.field4365 = new class245[4][];
        }
        if (arg4) {
            class150.field2081 = new class225[1][class62.field788][class326.field4993];
            class312.field4826 = new int[class62.field788][class326.field4993];
            class99.field1291 = new int[1][class62.field788 + 1][class326.field4993 + 1];
            if (class250.field3787) {
                class58.field703 = new class245[1][];
            }
        } else {
            class150.field2081 = (class225[][][]) null;
            class312.field4826 = (int[][]) null;
            class99.field1291 = (int[][][]) null;
            class58.field703 = (class245[][]) null;
        }
        class325.method2255(false);
        class287.field4507 = new class342[500];
        class31.field390 = 0;
        class337.field5216 = new class342[500];
        class247.field3733 = 0;
        class109.field1491 = new int[arg0][class62.field788 + 1][class326.field4993 + 1];
        class176.field2563 = new class80[5000];
        class318.field4894 = 0;
        class57.field690 = new class80[100];
        class218.field3067 = new boolean[class342.field5302 + class342.field5302 + 1][class342.field5302 + class342.field5302 + 1];
        client.field4232 = new boolean[class342.field5302 + class342.field5302 + 2][class342.field5302 + class342.field5302 + 2];
        class148.field2053 = new byte[arg0][class62.field788][class326.field4993];
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I)V", line = 297)
    public class158(int arg0) {
        this.field2185 = new class104[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class104 var3 = this.field2185[var2] = new class104();
            var3.field1341 = var3;
            var3.field1343 = var3;
        }
    }
}
