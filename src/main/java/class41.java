import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class41 extends class45 {

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "Lkd;")
    private static class73 field1088 = class126.method1070((byte) -66, "Welcome to RuneScape");

    @OriginalMember(owner = "client!fe", name = "fb", descriptor = "Lkd;")
    public static class73 field1099 = class126.method1070((byte) -66, ")4slr)3ws?order=LPWM");

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
    public static int field1089 = 0;

    @OriginalMember(owner = "client!fe", name = "bb", descriptor = "Lkd;")
    public static class73 field1095 = class126.method1070((byte) -66, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!fe", name = "eb", descriptor = "Lkd;")
    public static class73 field1098 = class126.method1070((byte) -66, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!fe", name = "hb", descriptor = "Lkd;")
    private static class73 field1101 = class126.method1070((byte) -66, "Loaded gamescreen");

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "Lkd;")
    public static class73 field1086 = field1101;

    @OriginalMember(owner = "client!fe", name = "jb", descriptor = "Lkd;")
    public static class73 field1103 = field1088;

    @OriginalMember(owner = "client!fe", name = "kb", descriptor = "I")
    public static int field1104 = 0;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    public int field1087;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
    public int field1092;

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!fe", name = "ab", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!fe", name = "cb", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!fe", name = "db", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "client!fe", name = "ib", descriptor = "Lkc;")
    public static class72 field1102;

    @OriginalMember(owner = "client!fe", name = "gb", descriptor = "[Lpb;")
    public static class106[] field1100;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(B)V")
    public static void method306(byte arg0) {
        field1103 = null;
        field1102 = null;
        field1095 = null;
        field1099 = null;
        if (arg0 > -123) {
            return;
        }
        field1098 = null;
        field1088 = null;
        field1101 = null;
        field1086 = null;
        field1100 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBLkd;)V")
    public static final void method307(int arg0, byte arg1, class73 arg2) {
        class121.field3079.method1215(-104, 234);
        if (arg1 < 116) {
            method312(95);
        }
        field1093++;
        class121.field3079.method977(arg0, 65280);
        class79.field2003++;
        class121.field3079.method948(-97, arg2.method643(255));
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBLqc;)V")
    private final void method308(int arg0, byte arg1, class114 arg2) {
        if (arg0 == 1) {
            this.field1097 = arg2.method944((byte) 125);
            this.field1092 = arg2.method957((byte) 74);
            this.field1087 = arg2.method957((byte) 89);
        }
        field1085++;
        if (arg1 != -97) {
            this.field1087 = -15;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZZIIZ)Lua;")
    public static final class137 method309(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        class109 var5 = null;
        field1090++;
        if (class119.field3026 != null) {
            var5 = new class109(arg3, class119.field3026, class141.field3511[arg3], 1000000);
        }
        if (arg2 != -11209) {
            field1102 = null;
        }
        return new class137(var5, class50.field1312, arg3, arg4, arg0, arg1);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZIIILq;)V")
    public static final void method310(int arg0, boolean arg1, int arg2, int arg3, int arg4, class111 arg5) {
        class38.field1041 = arg0;
        class142.field3548 = arg4;
        class15.field474 = arg1;
        field1094++;
        if (arg2 < -22) {
            class31.field870 = arg3;
            class104.field2591 = arg5;
            class53.field1416 = 10000;
            class26.field754 = 1;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLqc;)V")
    public final void method311(byte arg0, class114 arg1) {
        field1096++;
        while (true) {
            int var3 = arg1.method957((byte) 107);
            if (var3 == 0) {
                if (arg0 == 4) {
                    return;
                } else {
                    field1099 = null;
                    return;
                }
            }
            this.method308(var3, (byte) -97, arg1);
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
    public static final void method312(int arg0) {
        field1091++;
        int var1 = class89.field2235.method1211(8, 7);
        if (class63.field1661 > var1) {
            for (int var2 = var1; var2 < class63.field1661; var2++) {
                class89.field2246[class58.field1547++] = class14.field435[var2];
            }
        }
        if (var1 > class63.field1661) {
            throw new RuntimeException("gppov1");
        }
        class63.field1661 = 0;
        int var3 = 0;
        int var4 = -115 % ((-arg0 - 32) / 59);
        while (var3 < var1) {
            int var5 = class14.field435[var3];
            class118 var6 = class42.field1141[var5];
            int var7 = class89.field2235.method1211(1, 7);
            if (var7 == 0) {
                class14.field435[class63.field1661++] = var5;
                var6.field2270 = class49.field1308;
            } else {
                int var8 = class89.field2235.method1211(2, 7);
                if (var8 == 0) {
                    class14.field435[class63.field1661++] = var5;
                    var6.field2270 = class49.field1308;
                    class137.field3422[class110.field2712++] = var5;
                } else if (var8 == 1) {
                    class14.field435[class63.field1661++] = var5;
                    var6.field2270 = class49.field1308;
                    int var9 = class89.field2235.method1211(3, 7);
                    var6.method743(28077, var9, false);
                    int var10 = class89.field2235.method1211(1, 7);
                    if (var10 == 1) {
                        class137.field3422[class110.field2712++] = var5;
                    }
                } else if (var8 == 2) {
                    class14.field435[class63.field1661++] = var5;
                    var6.field2270 = class49.field1308;
                    int var11 = class89.field2235.method1211(3, 7);
                    var6.method743(28077, var11, true);
                    int var12 = class89.field2235.method1211(3, 7);
                    var6.method743(28077, var12, true);
                    int var13 = class89.field2235.method1211(1, 7);
                    if (var13 == 1) {
                        class137.field3422[class110.field2712++] = var5;
                    }
                } else if (var8 == 3) {
                    class89.field2246[class58.field1547++] = var5;
                }
            }
            var3++;
        }
    }
}
