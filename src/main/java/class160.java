import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class160 extends RuntimeException {

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2734;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Ljava/lang/String;")
    public String field2730;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lsc;")
    public static class181 field2729 = class149.method967(255, "(Udns");

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Lsc;")
    public static class181 field2733 = class149.method967(255, "<col=80ff00>");

    @OriginalMember(owner = "client!g", name = "l", descriptor = "[[I")
    public static int[][] field2740 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Lo;")
    public static class175 field2736;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Llg;")
    public static class195 field2732;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Lng;")
    public static class46 field2731;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIBIII)V")
    public static final void method1072(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var6 = arg4 * arg4;
        int var7 = 0;
        int var8 = arg1;
        field2738++;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        if (arg2 < 76) {
            return;
        }
        int var11 = arg1 << 1;
        int var12 = (1 - var11) * var6 + var10;
        int var13 = var6 << 1;
        int var14 = var6 << 2;
        int var15 = var9 - ((var11 - 1) * var13);
        int var16 = var9 << 2;
        int var17 = ((var7 << 1) + 3) * var10;
        int var18 = (var7 + 1) * var16;
        int var19 = (arg1 - 1) * var14;
        if (arg3 >= class23.field408 && class125.field2056 >= arg3) {
            int var20 = class144.method931(116, class124.field2032, class11.field219, arg4 + arg5);
            int var21 = class144.method931(-120, class124.field2032, class11.field219, arg5 - arg4);
            class171.method1133(class149.field2507[arg3], var21, arg0, var20, (byte) 127);
        }
        int var22 = ((arg1 << 1) - 3) * var13;
        while (var8 > 0) {
            var8--;
            if (var12 < 0) {
                while (var12 < 0) {
                    var7++;
                    var12 += var17;
                    var17 += var16;
                    var15 += var18;
                    var18 += var16;
                }
            }
            if (var15 < 0) {
                var12 += var17;
                var7++;
                var17 += var16;
                var15 += var18;
                var18 += var16;
            }
            var15 += -var22;
            var22 -= var14;
            int var23 = arg3 - var8;
            var12 += -var19;
            var19 -= var14;
            int var24 = arg3 + var8;
            if (class23.field408 <= var24 && class125.field2056 >= var23) {
                int var25 = class144.method931(95, class124.field2032, class11.field219, arg5 + var7);
                int var26 = class144.method931(111, class124.field2032, class11.field219, arg5 - var7);
                if (var23 >= class23.field408) {
                    class171.method1133(class149.field2507[var23], var26, arg0, var25, (byte) 127);
                }
                if (class125.field2056 >= var24) {
                    class171.method1133(class149.field2507[var24], var26, arg0, var25, (byte) 126);
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZZ)V")
    public static final void method1073(boolean arg0, boolean arg1) {
        field2735++;
        byte[][] var2 = class184.field3266;
        byte var3 = 4;
        if (!arg0) {
            return;
        }
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class78.field1264[var5] >> 8) * 64 - class253.field4420;
            int var12 = (class78.field1264[var5] & 0xFF) * 64 - class222.field3844;
            byte[] var13 = var2[var5];
            if (var13 != null) {
                class4.method36((byte) 18);
                class151.method976(var11, var12, (class79.field1285 - 6) * 8, class109.field1784, (class144.field2342 - 6) * 8, var13, arg1, true);
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class78.field1264[var6] & 0xFF) * 64 - class222.field3844;
            byte[] var8 = var2[var6];
            int var9 = (class78.field1264[var6] >> 8) * 64 - class253.field4420;
            if (var8 == null && class79.field1285 < 800) {
                class4.method36((byte) 18);
                for (int var10 = 0; var10 < var3; var10++) {
                    class19.method175(var10, 64, 64, var9, var7, -57);
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lmj;BII)V")
    public static final void method1074(class178 arg0, byte arg1, int arg2, int arg3) {
        field2741++;
        if (arg1 > -51) {
            method1072(112, -113, (byte) 106, -120, -17, -53);
        }
        if (arg0.field2685 == arg3 && arg3 != -1) {
            class254 var4 = class128.method827(arg3, 113);
            int var5 = var4.field4444;
            if (var5 == 1) {
                arg0.field2684 = 0;
                arg0.field2644 = 0;
                arg0.field2656 = 0;
                arg0.field2618 = arg2;
                class211.method1396(arg0.field2681, -1287515740, arg0.field2654, var4, false, arg0.field2656);
            }
            if (var5 == 2) {
                arg0.field2684 = 0;
            }
        } else if (arg3 == -1 || arg0.field2685 == -1 || class128.method827(arg3, 101).field4428 >= class128.method827(arg0.field2685, 122).field4428) {
            arg0.field2684 = 0;
            arg0.field2676 = arg0.field2631;
            arg0.field2644 = 0;
            arg0.field2618 = arg2;
            arg0.field2685 = arg3;
            arg0.field2656 = 0;
            if (arg0.field2685 == -1) {
                return;
            }
            class211.method1396(arg0.field2681, -1287515740, arg0.field2654, class128.method827(arg0.field2685, 126), false, arg0.field2656);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZ)I")
    public static final int method1075(int arg0, int arg1, boolean arg2) {
        field2742++;
        int var3 = class181.method1213(arg1 + 45365, false, arg0 + 91923, 4) + (class181.method1213(arg1 + 10294, !arg2, arg0 + 37821, 2) - 128 >> 1) + (class181.method1213(arg1, !arg2, arg0, 1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (!arg2) {
            field2731 = null;
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class160(Throwable arg0, String arg1) {
        this.field2734 = arg0;
        this.field2730 = arg1;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public static void method1076(boolean arg0) {
        field2733 = null;
        if (arg0) {
            return;
        }
        field2736 = null;
        field2731 = null;
        field2729 = null;
        field2740 = null;
        field2732 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static final void method1077(int arg0) {
        int var1 = class264.field4585.length;
        field2737++;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class264.field4585[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class192.field3369; var4++) {
                    if (class78.field1264[var2] == class264.field4603[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class264.field4603[class192.field3369] = class78.field1264[var2];
                    var3 = class192.field3369++;
                }
                class230 var5 = new class230(class264.field4585[var2]);
                int var6 = 0;
                while (var5.field3933 < class264.field4585[var2].length && var6 < 511) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method1535(2);
                    int var9 = (var8 & 0x1FAC) >> 7;
                    int var10 = var8 & 0x3F;
                    int var11 = var8 >> 14;
                    int var12 = (class78.field1264[var2] >> 8) * 64 + var9 - class253.field4420;
                    int var13 = (class78.field1264[var2] & 0xFF) * 64 + var10 - class222.field3844;
                    class64 var14 = class9.method75(-1, var5.method1535(2));
                    if (class129.field2140[var7] == null && (var14.field1051 & 0x1) > 0 && class31.field509 == var11 && var12 >= 0 && (var14.field995 + var12) < 104 && var13 >= 0 && (var14.field995 + var13) < 104) {
                        class129.field2140[var7] = new class178();
                        class178 var15 = class129.field2140[var7];
                        class263.field4581[class137.field2237++] = var7;
                        var15.field2639 = class237.field4125;
                        var15.field3117 = var14;
                        var15.field2619 = var15.field3117.field995;
                        var15.field2669 = var15.field3117.field1005;
                        var15.field2663 = var15.field3117.field990;
                        var15.field2635 = var15.field3117.field1043;
                        var15.field2655 = var15.field3117.field1015;
                        var15.field2653 = var15.field3117.field1040;
                        var15.field2689 = var15.field3117.field1054;
                        var15.field2671 = var15.field3117.field1021;
                        var15.field2628 = var15.field3117.field1028;
                        if (var15.field2628 == 0) {
                            var15.field2675 = 0;
                        }
                        var15.method1051(var13, true, var12, -6882);
                    }
                }
            }
        }
        if (arg0 >= -69) {
            field2740 = null;
        }
    }
}
