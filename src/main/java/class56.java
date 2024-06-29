import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class56 {

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "[I")
    public static int[] field1144 = new int[5];

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "Z")
    public static boolean field1137 = false;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field1142 = 0;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "Lvf;")
    public static class265 field1143 = class87.method582(-46, "; Max)2Age=");

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public static int field1146 = 0;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Lch;")
    public static class117 field1141 = new class117();

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "Lvf;")
    public static class265 field1149 = class87.method582(-46, ")3");

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field1150 = 0;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "Lue;")
    public static class13 field1148;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Lfl;")
    public static class192 field1138;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "[I")
    public static int[] field1145;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)Lv;")
    public static final class59 method424(byte arg0) {
        if (arg0 != -10) {
            field1143 = null;
        }
        field1139++;
        try {
            return (class59) Class.forName("rf").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static final void method425(int arg0) {
        int var1 = -7 % ((arg0 - 3) / 54);
        for (int var2 = -1; var2 < class19.field520; var2++) {
            int var6;
            if (var2 == -1) {
                var6 = 2047;
            } else {
                var6 = class93.field1652[var2];
            }
            class122 var7 = class209.field3766[var6];
            if (var7 != null && var7.field2579 > 0) {
                var7.field2579--;
                if (var7.field2579 == 0) {
                    var7.field2603 = null;
                }
            }
        }
        field1140++;
        for (int var3 = 0; var3 < class48.field1027; var3++) {
            int var4 = class93.field1646[var3];
            class23 var5 = class4.field67[var4];
            if (var5 != null && var5.field2579 > 0) {
                var5.field2579--;
                if (var5.field2579 == 0) {
                    var5.field2603 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
    public static final void method426(boolean arg0) {
        field1135++;
        if (class264.field4602 || class264.field4601 == 2) {
            return;
        }
        if (arg0) {
            method428(-80, 68);
        }
        try {
            class55.field1123.method1782(class21.field652, 0);
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
    public static void method427(int arg0) {
        field1144 = null;
        field1148 = null;
        field1145 = null;
        if (arg0 != 8380) {
            field1148 = null;
        }
        field1141 = null;
        field1143 = null;
        field1149 = null;
        field1138 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Z")
    public static final boolean method428(int arg0, int arg1) {
        field1147++;
        if (arg0 < 32) {
            return false;
        }
        int var2 = 5 % ((17 - arg1) / 33);
        if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }
}
