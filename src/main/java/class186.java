import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class186 {

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "[I")
    public static int[] field2880 = new int[128];

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "[I")
    public static int[] field2882 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "[I")
    public static int[] field2899 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "Z")
    public static boolean field2903 = true;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public int field2878;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public int field2879;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public int field2881;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public int field2883;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public int field2885;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public int field2886;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public int field2887;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public int field2888;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public int field2889;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public int field2890;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public int field2891;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public int field2894;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public int field2897;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public int field2898;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    public int field2901;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public int field2902;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
    public int field2904;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "Lml;")
    public static class178 field2895;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILjava/lang/String;)V", line = 17)
    public static final void method1284(int arg0, int arg1, String arg2) {
        field2896++;
        class211 var3 = class17.method115(2, arg0, 4086);
        int var4 = -93 / ((arg1 - 64) / 52);
        var3.method1433(true);
        var3.field3213 = arg2;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V", line = 40)
    public static final void method1285(int arg0, int arg1) {
        field2884++;
        int var2 = class38.field561;
        if (arg1 == 0) {
            var2 = 1;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class39 var4;
            if (arg1 == 0) {
                var4 = class329.field5388;
            } else {
                var4 = class130.field1984[class150.field2410[var3]];
            }
            if (var4 != null && var4.method310((byte) -12)) {
                int var5 = var4.method312(-107);
                if (arg1 == 0 || arg1 == var5) {
                    if (var5 == 1) {
                        if ((var4.field4796 & 0x7F) == 64 && (var4.field4783 & 0x7F) == 64) {
                            int var6 = var4.field4783 >> 7;
                            int var7 = var4.field4796 >> 7;
                            if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                                var10002 = class273.field4482[var7][var6]++;
                            }
                        }
                    } else if (((var5 & 0x1) != 0 || (var4.field4796 & 0x7F) == 0 && (var4.field4783 & 0x7F) == 0) && ((var5 & 0x1) != 1 || (var4.field4796 & 0x7F) == 64 && (var4.field4783 & 0x7F) == 64)) {
                        int var8 = var4.field4783 - (var5 * 64) >> 7;
                        int var9 = var4.field4796 - (var5 * 64) >> 7;
                        int var10 = var4.method312(30) + var9;
                        int var11 = var8 + var4.method312(-81);
                        if (var11 > 104) {
                            var11 = 104;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        if (var10 > 104) {
                            var10 = 104;
                        }
                        for (int var12 = var9; var12 < var10; var12++) {
                            for (int var13 = var8; var13 < var11; var13++) {
                                var10002 = class273.field4482[var12][var13]++;
                            }
                        }
                    }
                }
            }
        }
        label225: for (int var14 = 0; var14 < var2; var14++) {
            class39 var15;
            long var16;
            if (arg1 == 0) {
                var15 = class329.field5388;
                var16 = 8791798054912L;
            } else {
                var15 = class130.field1984[class150.field2410[var14]];
                var16 = (long) class150.field2410[var14] << 32;
            }
            if (var15 != null && var15.method310((byte) -12)) {
                int var18 = var15.method312(81);
                if (arg1 == 0 || arg1 == var18) {
                    var15.field4696 = true;
                    var15.field577 = false;
                    if ((class295.field4905 && class38.field561 > 200 || class38.field561 > 50) && arg1 != 0 && var15.field4750 == var15.method2025((byte) 118).field1739) {
                        var15.field577 = true;
                    }
                    if (var18 == 1) {
                        if ((var15.field4796 & 0x7F) == 64 && (var15.field4783 & 0x7F) == 64) {
                            int var28 = var15.field4796 >> 7;
                            int var29 = var15.field4783 >> 7;
                            if (var28 < 0 || var28 >= 104 || var29 < 0 || var29 >= 104) {
                                continue;
                            }
                            if (class273.field4482[var28][var29] > 1) {
                                var10002 = class273.field4482[var28][var29]--;
                                continue;
                            }
                        }
                    } else if ((var18 & 0x1) == 0 && (var15.field4796 & 0x7F) == 0 && (var15.field4783 & 0x7F) == 0 || (var18 & 0x1) == 1 && (var15.field4796 & 0x7F) == 64 && (var15.field4783 & 0x7F) == 0) {
                        int var19 = var15.field4796 - (var18 * 64) >> 7;
                        int var20 = var15.field4783 - (var18 * 64) >> 7;
                        int var21 = var18 + var19;
                        int var22 = var18 + var20;
                        if (var19 < 0) {
                            var19 = 0;
                        }
                        if (var21 > 104) {
                            var21 = 104;
                        }
                        if (var20 < 0) {
                            var20 = 0;
                        }
                        if (var22 > 104) {
                            var22 = 104;
                        }
                        boolean var23 = true;
                        for (int var24 = var19; var24 < var21; var24++) {
                            for (int var25 = var20; var25 < var22; var25++) {
                                if (class273.field4482[var24][var25] <= 1) {
                                    var23 = false;
                                    break;
                                }
                            }
                        }
                        if (var23) {
                            int var26 = var19;
                            while (true) {
                                if (var26 >= var21) {
                                    continue label225;
                                }
                                for (int var27 = var20; var27 < var22; var27++) {
                                    var10002 = class273.field4482[var26][var27]--;
                                }
                                var26++;
                            }
                        }
                    }
                    if (var15.field4739 == null || var15.field4698 > class58.field875 || class58.field875 >= var15.field4766) {
                        var15.field4696 = false;
                        var15.field4763 = client.method889(var15.field4796, class120.field1779, var15.field4783, -122);
                        class255.method1816(class120.field1779, var15.field4796, var15.field4783, var15.field4763, var18 * 64 + 60 - 64, var15, var15.field4778, var16, var15.field4794);
                    } else {
                        var15.field4696 = false;
                        var15.field577 = false;
                        var15.field4763 = client.method889(var15.field4796, class120.field1779, var15.field4783, -121);
                        class27.method230(class120.field1779, var15.field4796, var15.field4783, var15.field4763, var15, var15.field4778, var16, var15.field4744, var15.field4730, var15.field4791, var15.field4770);
                    }
                }
            }
        }
        if (arg0 != -960410169) {
            field2882 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 302)
    public static void method1286(int arg0) {
        field2882 = null;
        field2899 = null;
        field2895 = null;
        field2880 = null;
        if (arg0 <= 97) {
            method1286(-60);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lro;Z)V", line = 322)
    public static final void method1287(class1 arg0, boolean arg1) {
        if (arg0.field4 != null) {
            arg0.field4.field4962 = 0;
        }
        field2892++;
        arg0.field3 = arg1;
        for (class1 var2 = arg0.method3(); var2 != null; var2 = arg0.method1()) {
            method1287(var2, false);
        }
    }
}
