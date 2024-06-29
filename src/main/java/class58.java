import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class58 extends class45 {

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "Ldj;")
    private static class44 field1078 = class89.method650(255, "Loading title screen )2 ");

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "Ldj;")
    public static class44 field1083 = class89.method650(255, "<img=0>");

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "Ldj;")
    public static class44 field1081 = class89.method650(255, "hitmarks");

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "[[I")
    public static int[][] field1085 = new int[104][104];

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "Ldj;")
    public static class44 field1088 = field1078;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "Z")
    public static boolean field1086 = false;

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "Ldj;")
    public static class44 field1093 = class89.method650(255, "<br>(X");

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "Ldj;")
    public static class44 field1090 = class89.method650(255, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "Ldj;")
    public static class44 field1095 = class89.method650(255, "(U4");

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "Ldj;")
    public static class44 field1092 = class89.method650(255, "<col=c0ff00>");

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "Lnf;")
    public static class147 field1094;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "Lve;")
    public static class225 field1091;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "[[B")
    public static byte[][] field1082;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILve;Lve;)V")
    public static final void method440(int arg0, class225 arg1, class225 arg2) {
        field1080++;
        if (arg0 == 104) {
            class201.field3562 = arg1;
            class40.field757 = arg2;
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
    public static final void method441(int arg0) {
        field1079++;
        int var1 = class218.field3957.method1173(arg0 - 28991, 8);
        if (var1 < class90.field1702) {
            for (int var2 = var1; var2 < class90.field1702; var2++) {
                class62.field1156[class183.field3183++] = class45.field858[var2];
            }
        }
        if (class90.field1702 < var1) {
            throw new RuntimeException("gppov1");
        }
        class90.field1702 = 0;
        if (arg0 != 29118) {
            method443(60);
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class45.field858[var3];
            class24 var5 = class122.field2168[var4];
            int var6 = class218.field3957.method1173(127, 1);
            if (var6 == 0) {
                class45.field858[class90.field1702++] = var4;
                var5.field2248 = class46.field868;
            } else {
                int var7 = class218.field3957.method1173(127, 2);
                if (var7 == 0) {
                    class45.field858[class90.field1702++] = var4;
                    var5.field2248 = class46.field868;
                    class143.field2533[class27.field490++] = var4;
                } else if (var7 == 1) {
                    class45.field858[class90.field1702++] = var4;
                    var5.field2248 = class46.field868;
                    int var8 = class218.field3957.method1173(127, 3);
                    var5.method857((byte) -123, false, var8);
                    int var9 = class218.field3957.method1173(127, 1);
                    if (var9 == 1) {
                        class143.field2533[class27.field490++] = var4;
                    }
                } else if (var7 == 2) {
                    class45.field858[class90.field1702++] = var4;
                    var5.field2248 = class46.field868;
                    int var10 = class218.field3957.method1173(127, 3);
                    var5.method857((byte) -121, true, var10);
                    int var11 = class218.field3957.method1173(127, 3);
                    var5.method857((byte) -128, true, var11);
                    int var12 = class218.field3957.method1173(127, 1);
                    if (var12 == 1) {
                        class143.field2533[class27.field490++] = var4;
                    }
                } else if (var7 == 3) {
                    class62.field1156[class183.field3183++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
    public static final void method442(int arg0, int arg1) {
        field1089++;
        if (arg0 == -1 || !class157.field2744[arg0]) {
            return;
        }
        class152.field2652.method1475(arg0, -120);
        if (class4.field52[arg0] == null) {
            return;
        }
        boolean var2 = true;
        if (arg1 != 1) {
            method443(91);
        }
        for (int var3 = 0; var3 < class4.field52[arg0].length; var3++) {
            if (class4.field52[arg0][var3] != null) {
                if (class4.field52[arg0][var3].field4076 == 2) {
                    var2 = false;
                } else {
                    class4.field52[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class4.field52[arg0] = null;
        }
        class157.field2744[arg0] = false;
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V")
    public static void method443(int arg0) {
        field1091 = null;
        field1088 = null;
        field1083 = null;
        field1092 = null;
        field1095 = null;
        field1093 = null;
        field1094 = null;
        field1081 = null;
        field1090 = null;
        field1078 = null;
        field1085 = null;
        if (arg0 == -12999) {
            field1082 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)I")
    public static final int method444(boolean arg0, int arg1) {
        field1087++;
        return arg0 ? arg1 & 0xFF : -10;
    }
}
