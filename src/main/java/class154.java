import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class154 {

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "[Lsg;")
    public static class169[] field2967 = new class169[500];

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "Lsg;")
    private static class169 field2973 = class165.method1060(" more options", 1536);

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field2964 = 0;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field2974 = 0;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public static int field2976 = 0;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Lsg;")
    public static class169 field2972 = field2973;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public int field2959;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public int field2961;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public int field2962;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public int field2963;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public int field2966;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "Lse;")
    public static class167 field2971;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Lac;")
    public class4 field2958;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lug;I[IIZ[I)V")
    public static final void method1004(class187[] arg0, int arg1, int[] arg2, int arg3, boolean arg4, int[] arg5) {
        if (!arg4) {
            return;
        }
        field2969++;
        if (arg1 >= arg3) {
            return;
        }
        int var6 = arg3 + 1;
        int var7 = (arg1 + arg3) / 2;
        int var8 = arg1 - 1;
        class187 var9 = arg0[var7];
        arg0[var7] = arg0[arg1];
        arg0[arg1] = var9;
        while (var8 < var6) {
            boolean var10 = true;
            do {
                var6--;
                for (int var11 = 0; var11 < 4; var11++) {
                    int var12;
                    int var13;
                    if (arg5[var11] == 2) {
                        var12 = arg0[var6].field3635;
                        var13 = var9.field3635;
                    } else if (arg5[var11] == 1) {
                        var12 = arg0[var6].field3631;
                        if (var12 == -1 && arg2[var11] == 1) {
                            var12 = 2001;
                        }
                        var13 = var9.field3631;
                        if (var13 == -1 && arg2[var11] == 1) {
                            var13 = 2001;
                        }
                    } else if (arg5[var11] == 3) {
                        var12 = arg0[var6].field3638 ? 1 : 0;
                        var13 = var9.field3638 ? 1 : 0;
                    } else {
                        var12 = arg0[var6].field3637;
                        var13 = var9.field3637;
                    }
                    if (var12 != var13) {
                        if ((arg2[var11] != 1 || var13 >= var12) && (arg2[var11] != 0 || var13 <= var12)) {
                            var10 = false;
                        }
                        break;
                    }
                    if (var11 == 3) {
                        var10 = false;
                    }
                }
            } while (var10);
            boolean var14 = true;
            do {
                var8++;
                for (int var15 = 0; var15 < 4; var15++) {
                    int var16;
                    int var17;
                    if (arg5[var15] == 2) {
                        var16 = arg0[var8].field3635;
                        var17 = var9.field3635;
                    } else if (arg5[var15] == 1) {
                        var16 = arg0[var8].field3631;
                        if (var16 == -1 && arg2[var15] == 1) {
                            var16 = 2001;
                        }
                        var17 = var9.field3631;
                        if (var17 == -1 && arg2[var15] == 1) {
                            var17 = 2001;
                        }
                    } else if (arg5[var15] == 3) {
                        var16 = arg0[var8].field3638 ? 1 : 0;
                        var17 = var9.field3638 ? 1 : 0;
                    } else {
                        var16 = arg0[var8].field3637;
                        var17 = var9.field3637;
                    }
                    if (var16 != var17) {
                        if ((arg2[var15] != 1 || var16 >= var17) && (arg2[var15] != 0 || var16 <= var17)) {
                            var14 = false;
                        }
                        break;
                    }
                    if (var15 == 3) {
                        var14 = false;
                    }
                }
            } while (var14);
            if (var6 > var8) {
                class187 var18 = arg0[var8];
                arg0[var8] = arg0[var6];
                arg0[var6] = var18;
            }
        }
        method1004(arg0, arg1, arg2, var6, true, arg5);
        method1004(arg0, var6 + 1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    public static final void method1005(byte arg0) {
        class51.field899++;
        field2975++;
        class141.field2621.method1024(51, (byte) -94);
        if (arg0 > -90) {
            field2974 = -70;
        }
        for (class80 var1 = (class80) class202.field3948.method1042((byte) 104); var1 != null; var1 = (class80) class202.field3948.method1047((byte) 64)) {
            if (var1.field1480 == 0) {
                class15.method88(true, 6, var1);
            }
        }
        if (class55.field999 != null) {
            class64.method404(107, class55.field999);
            class55.field999 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V")
    public static void method1006(byte arg0) {
        field2972 = null;
        field2971 = null;
        field2973 = null;
        field2967 = null;
        if (arg0 >= -99) {
            method1006((byte) 70);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILvg;II)V")
    public static final void method1007(int arg0, int arg1, class196 arg2, int arg3, int arg4) {
        field2965++;
        if (class4.field79 == arg2 || class20.field436 >= 400) {
            return;
        }
        class169 var5;
        if (arg2.field3845 == 0) {
            var5 = class165.method1058(0, new class169[] { arg2.field3856, class129.method836(2, class4.field79.field3866, arg2.field3866), class112.field2051, class112.field2056, class2.method18((byte) -62, arg2.field3866), class139.field2583 });
        } else {
            var5 = class165.method1058(0, new class169[] { arg2.field3856, class112.field2051, class20.field440, class2.method18((byte) -62, arg2.field3845), class139.field2583 });
        }
        if (class141.field2630 == 1) {
            class1.field18++;
            class167.method1092(class165.method1058(0, new class169[] { class16.field341, class98.field1832, var5 }), arg0, arg3, class73.field1368, -1, 8, arg4);
        } else if (!class17.field380) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class42.field798[var6] != null) {
                    class103.field1889++;
                    boolean var8 = false;
                    short var9 = 0;
                    if (class42.field798[var6].method1110(class112.field2044, arg1 + 67)) {
                        if (arg2.field3866 > class4.field79.field3866) {
                            var9 = 2000;
                        }
                        if (class4.field79.field3841 != 0 && arg2.field3841 != 0) {
                            if (class4.field79.field3841 == arg2.field3841) {
                                var9 = 2000;
                            } else {
                                var9 = 0;
                            }
                        }
                    } else if (class28.field571[var6]) {
                        var9 = 2000;
                    }
                    int var10 = class88.field1606[var6] + var9;
                    class167.method1092(class165.method1058(0, new class169[] { class164.field3147, var5 }), arg0, arg3, class42.field798[var6], -1, var10, arg4);
                }
            }
        } else if ((class11.field269 & 0x8) == 8) {
            class167.method1092(class165.method1058(0, new class169[] { class21.field455, class98.field1832, var5 }), arg0, arg3, class137.field2551, -1, 20, arg4);
            class76.field1443++;
        }
        int var7 = 0;
        if (arg1 != 3) {
            method1004(null, 117, null, 31, true, null);
        }
        while (class20.field436 > var7) {
            if (class149.field2746[var7] == 40) {
                field2967[var7] = class165.method1058(0, new class169[] { class164.field3147, var5 });
                return;
            }
            var7++;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)Lib;")
    public static final class75 method1008(byte arg0, int arg1) {
        if (arg0 > -74) {
            field2972 = null;
        }
        class75 var2 = (class75) class205.field4013.method1206((long) arg1, -24742);
        field2960++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class90.field1641.method552(arg1, 14, 0);
        class75 var4 = new class75();
        if (var3 != null) {
            var4.method464((byte) -46, new class127(var3));
        }
        class205.field4013.method1208((long) arg1, -95, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II[Lsg;I)Lsg;")
    public static final class169 method1009(int arg0, int arg1, class169[] arg2, int arg3) {
        field2968++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg2[arg1 + var5] == null) {
                arg2[arg1 + var5] = class107.field1965;
            }
            var4 += arg2[arg1 + var5].field3253;
        }
        byte[] var6 = new byte[var4];
        int var7 = arg0;
        for (int var8 = 0; var8 < arg3; var8++) {
            class169 var10 = arg2[arg1 + var8];
            class97.method580(var10.field3248, 0, var6, var7, var10.field3253);
            var7 += var10.field3253;
        }
        class169 var9 = new class169();
        var9.field3248 = var6;
        var9.field3253 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)[Lgd;")
    public static final class59[] method1010(int arg0) {
        field2970++;
        if (arg0 != -25083) {
            return null;
        }
        class59[] var1 = new class59[class141.field2627];
        for (int var2 = 0; var2 < class141.field2627; var2++) {
            class59 var3 = new class59();
            var3.field1104 = class16.field334;
            var3.field1106 = class156.field2992;
            var3.field1100 = class182.field3544[var2];
            var3.field1107 = class41.field770[var2];
            var3.field1105 = class203.field3976[var2];
            var3.field1103 = class2.field43[var2];
            var3.field1102 = class197.field3873;
            var3.field1101 = class193.field3814[var2];
            var1[var2] = var3;
        }
        class66.method424((byte) 120);
        return var1;
    }
}
