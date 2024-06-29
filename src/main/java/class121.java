import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class121 {

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public int field3016 = -1;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "La;")
    private static class1 field3012 = class113.method934(-11538, "wishes to duel with you)3");

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "La;")
    private static class1 field3008 = class113.method934(-11538, "Username: ");

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "La;")
    public static class1 field3010 = class113.method934(-11538, "mapedge");

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "La;")
    public static class1 field3005 = field3008;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "[[I")
    public static int[][] field3018 = new int[104][104];

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "La;")
    private static class1 field3021 = class113.method934(-11538, "System update in: ");

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "La;")
    private static class1 field3022 = class113.method934(-11538, "To play on this world move to a free area first");

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "La;")
    public static class1 field3009 = class113.method934(-11538, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "La;")
    public static class1 field3023 = class113.method934(-11538, "backleft1");

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "La;")
    public static class1 field3015 = field3021;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "La;")
    public static class1 field3011 = field3012;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "La;")
    public static class1 field3020 = class113.method934(-11538, "null");

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "Z")
    public static boolean field3027 = false;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "La;")
    public static class1 field3004 = field3022;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lfe;")
    public static class36 field3006 = new class36(5000);

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "La;")
    public static class1 field3029 = class113.method934(-11538, "Fps:");

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "Lwc;")
    public static class134 field3024;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Lcc;")
    public class16 field3002;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "[I")
    public int[] field3003;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "[I")
    public static int[] field3028;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "[La;")
    public class1[] field3013;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)V", line = 10)
    public static final void method988(byte arg0, int arg1) {
        field3019++;
        if (arg1 == -1 || !class134.field3299[arg1]) {
            return;
        }
        class35.field925.method217(1, arg1);
        if (arg0 < 31) {
            field3011 = null;
        }
        if (class117.field2925[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class117.field2925[arg1].length; var3++) {
            if (class117.field2925[arg1][var3] != null) {
                if (class117.field2925[arg1][var3].field2492 == 2) {
                    var2 = false;
                } else {
                    class117.field2925[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class117.field2925[arg1] = null;
        }
        class134.field3299[arg1] = false;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 65)
    public static final void method989(int arg0) {
        field3026++;
        if (arg0 != 19655) {
            field3015 = null;
        }
        class44.field1169.method1057((byte) 90);
        class52.field1369.method330(0, 0);
        class42.field1097 = class27.method363(class42.field1097);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V", line = 113)
    public static final void method990(int arg0) {
        field3007++;
        if (arg0 != 47) {
            method992(-42, (byte) 12, 92, 18, -72);
        }
        if (class69.field1717.toLowerCase().indexOf("microsoft") != -1) {
            class132.field3234[186] = 57;
            class132.field3234[187] = 27;
            class132.field3234[188] = 71;
            class132.field3234[189] = 26;
            class132.field3234[190] = 72;
            class132.field3234[191] = 73;
            class132.field3234[192] = 58;
            class132.field3234[219] = 42;
            class132.field3234[220] = 74;
            class132.field3234[221] = 43;
            class132.field3234[222] = 59;
            class132.field3234[223] = 28;
            return;
        }
        class132.field3234[44] = 71;
        class132.field3234[45] = 26;
        class132.field3234[46] = 72;
        class132.field3234[47] = 73;
        class132.field3234[59] = 57;
        class132.field3234[61] = 27;
        class132.field3234[91] = 42;
        class132.field3234[92] = 74;
        class132.field3234[93] = 43;
        if (class69.field1711 == null) {
            class132.field3234[192] = 58;
            class132.field3234[222] = 59;
        } else {
            class132.field3234[192] = 28;
            class132.field3234[222] = 58;
            class132.field3234[520] = 59;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V", line = 168)
    public static void method991(int arg0) {
        field3018 = null;
        field3029 = null;
        field3028 = null;
        field3024 = null;
        field3006 = null;
        field3005 = null;
        field3012 = null;
        field3009 = null;
        field3022 = null;
        field3020 = null;
        field3021 = null;
        field3008 = null;
        field3004 = null;
        if (arg0 > -8) {
            field3006 = null;
        }
        field3015 = null;
        field3011 = null;
        field3023 = null;
        field3010 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBIII)V", line = 202)
    public static final void method992(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3017++;
        int var5 = -112 / ((50 - arg1) / 53);
        for (int var6 = arg0; var6 <= arg0 + arg2; var6++) {
            for (int var7 = arg4; var7 <= arg3 + arg4; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class37.field1004[0][var7][var6] = 127;
                    if (arg4 == var7 && var7 > 0) {
                        class57.field1454[0][var7][var6] = class57.field1454[0][var7 - 1][var6];
                    }
                    if (arg3 + arg4 == var7 && var7 < 103) {
                        class57.field1454[0][var7][var6] = class57.field1454[0][var7 + 1][var6];
                    }
                    if (arg0 == var6 && var6 > 0) {
                        class57.field1454[0][var7][var6] = class57.field1454[0][var7][var6 - 1];
                    }
                    if (arg0 + arg2 == var6 && var6 < 103) {
                        class57.field1454[0][var7][var6] = class57.field1454[0][var7][var6 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V", line = 254)
    public static final void method993(boolean arg0) {
        if (!arg0) {
            return;
        }
        field3014++;
        for (class116 var1 = (class116) class112.field2759.method805((byte) -90); var1 != null; var1 = (class116) class112.field2759.method812(-4)) {
            if (class2.field76 != var1.field2898 || var1.field2896) {
                var1.method742(-1);
            } else if (class82.field2066 >= var1.field2889) {
                var1.method961(8076, class9.field322);
                if (var1.field2896) {
                    var1.method742(-1);
                } else {
                    class130.field3186.method91(var1.field2898, var1.field2903, var1.field2894, var1.field2890, 60, var1, 0, -1, false);
                }
            }
        }
    }
}
