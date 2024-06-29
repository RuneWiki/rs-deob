import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class59 {

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lje;")
    public static class67 field1177 = class85.method592(255, "welle:");

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Lje;")
    public static class67 field1180 = class85.method592(255, ")1p");

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Lje;")
    public static class67 field1179 = class85.method592(255, "k");

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "Lje;")
    public static class67 field1183 = class85.method592(255, "au");

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field1178 = 0;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "[I")
    public static int[] field1174 = new int[50];

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Lje;")
    private static class67 field1176 = class85.method592(255, "Could not complete login)3");

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "Lje;")
    public static class67 field1189 = class85.method592(255, "huffman");

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "Lje;")
    public static class67 field1188 = field1176;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Lje;")
    public static class67 field1186 = class85.method592(255, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "[[[B")
    public static byte[][][] field1185;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Led;I)V")
    public static final void method410(class33 arg0, int arg1) {
        if (arg1 != 1) {
            field1189 = null;
        }
        class58.field1169 = arg0;
        field1182++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static final void method411(int arg0) {
        if (class111.field2506.toLowerCase().indexOf("microsoft") == -1) {
            class147.field3369[93] = 43;
            class147.field3369[44] = 71;
            class147.field3369[45] = 26;
            class147.field3369[61] = 27;
            class147.field3369[47] = 73;
            class147.field3369[91] = 42;
            class147.field3369[92] = 74;
            class147.field3369[46] = 72;
            class147.field3369[59] = 57;
            if (class111.field2513 == null) {
                class147.field3369[222] = 59;
                class147.field3369[192] = 58;
            } else {
                class147.field3369[520] = 59;
                class147.field3369[222] = 58;
                class147.field3369[192] = 28;
            }
        } else {
            class147.field3369[192] = 58;
            class147.field3369[190] = 72;
            class147.field3369[187] = 27;
            class147.field3369[220] = 74;
            class147.field3369[188] = 71;
            class147.field3369[221] = 43;
            class147.field3369[191] = 73;
            class147.field3369[219] = 42;
            class147.field3369[186] = 57;
            class147.field3369[189] = 26;
            class147.field3369[222] = 59;
            class147.field3369[223] = 28;
        }
        field1184++;
        if (arg0 != 192) {
            method410(null, -127);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
    public static final void method412(int arg0, int arg1) {
        field1175++;
        class58.method405((byte) 102);
        class151.method1156(31382);
        int var2 = class101.method804(arg1, -126).field2130;
        if (var2 == 0) {
            return;
        }
        int var3 = class42.field804[arg1];
        if (var2 == 1) {
            if (var3 == 1) {
                class96.method744(0.9D);
                ((class69) class96.field2158).method506(0.9D, true);
            }
            if (var3 == 2) {
                class96.method744(0.8D);
                ((class69) class96.field2158).method506(0.8D, true);
            }
            if (var3 == 3) {
                class96.method744(0.7D);
                ((class69) class96.field2158).method506(0.7D, true);
            }
            if (var3 == 4) {
                class96.method744(0.6D);
                ((class69) class96.field2158).method506(0.6D, true);
            }
            class123.method963(48);
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class99.field2203 != var4) {
                if (class99.field2203 == 0 && class97.field2171 != -1) {
                    class64.method435(false, class97.field2171, 0, class76.field1640, (byte) 125, var4);
                    class105.field2404 = false;
                } else if (var4 == 0) {
                    class64.method434(true);
                    class105.field2404 = false;
                } else {
                    class91.method668(-104, var4);
                }
                class99.field2203 = var4;
            }
        }
        if (var2 == 5) {
            class29.field513 = var3;
        }
        if (arg0 > -125) {
            method413(112);
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class82.field1801 = 127;
            }
            if (var3 == 1) {
                class82.field1801 = 96;
            }
            if (var3 == 2) {
                class82.field1801 = 64;
            }
            if (var3 == 3) {
                class82.field1801 = 32;
            }
            if (var3 == 4) {
                class82.field1801 = 0;
            }
        }
        if (var2 == 6) {
            class132.field2906 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class129.field2842 = 127;
            }
            if (var3 == 1) {
                class129.field2842 = 96;
            }
            if (var3 == 2) {
                class129.field2842 = 64;
            }
            if (var3 == 3) {
                class129.field2842 = 32;
            }
            if (var3 == 4) {
                class129.field2842 = 0;
            }
        }
        if (var2 == 9) {
            class14.field248 = var3;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public static void method413(int arg0) {
        if (arg0 != 104) {
            return;
        }
        field1185 = null;
        field1183 = null;
        field1188 = null;
        field1186 = null;
        field1180 = null;
        field1189 = null;
        field1176 = null;
        field1179 = null;
        field1174 = null;
        field1177 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZII)I")
    public static final int method414(int arg0, boolean arg1, int arg2, int arg3) {
        field1181++;
        int var4 = arg3 / arg0;
        int var5 = arg2 / arg0;
        int var6 = arg0 - 1 & arg3;
        int var7 = class112.method884(var4, 17720, var5);
        int var8 = class112.method884(var4 + 1, 17720, var5);
        int var9 = class112.method884(var4, 17720, var5 + 1);
        int var10 = arg0 - 1 & arg2;
        if (arg1) {
            int var11 = class112.method884(var4 + 1, 17720, var5 + 1);
            int var12 = class15.method108(-7, arg0, var7, var8, var6);
            int var13 = class15.method108(-7, arg0, var9, var11, var6);
            return class15.method108(-7, arg0, var12, var13, var10);
        } else {
            return -26;
        }
    }
}
