import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class104 {

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "S")
    public static short field1246 = 205;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field1250 = new String[100];

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "Lig;")
    public static class206 field1252 = new class206(21, 8);

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
    public int field1249;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "Lfv;")
    public class104 field1251;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "Lada;")
    public class144 field1253;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Z)Lus;", line = 4)
    public static final class1 method644(boolean arg0) {
        if (!arg0) {
            method645(null, (byte) 105);
        }
        field1254++;
        try {
            return (class1) Class.forName("gj").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lkea;B)I", line = 23)
    public static final int method645(class203 arg0, byte arg1) {
        field1245++;
        int var2 = 0;
        if (arg0.method1311(class32.field363, (byte) -93)) {
            var2++;
        }
        if (arg0.method1311(class11.field93, (byte) -93)) {
            var2++;
        }
        if (arg0.method1311(class447.field6681, (byte) -93)) {
            var2++;
        }
        if (arg0.method1311(class18.field180, (byte) -93)) {
            var2++;
        }
        if (arg0.method1311(class86.field987, (byte) -93)) {
            var2++;
        }
        if (arg0.method1311(class322.field4661, (byte) -93)) {
            var2++;
        }
        if (arg0.method1311(class86.field982, (byte) -93)) {
            var2++;
        }
        if (arg0.method1311(class656.field9488, (byte) -93)) {
            var2++;
        }
        if (arg0.method1311(class561.field8012, (byte) -93)) {
            var2++;
        }
        if (arg0.method1311(class381.field5774, (byte) -93)) {
            var2++;
        }
        if (arg0.method1311(class650.field9383, (byte) -93)) {
            var2++;
        }
        if (arg0.method1311(class114.field1424, (byte) -93)) {
            var2++;
        }
        if (arg0.method1311(class50.field538, (byte) -93)) {
            var2++;
        }
        if (arg0.method1311(class346.field4959, (byte) -93)) {
            var2++;
        }
        if (arg1 > -5) {
            method649(120, -94, false);
        }
        if (arg0.method1311(class499.field7267, (byte) -93)) {
            var2++;
        }
        if (arg0.method1311(class321.field4644, (byte) -93)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V", line = 96)
    public static void method646(int arg0) {
        if (arg0 >= 86) {
            field1252 = null;
            field1250 = null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V", line = 110)
    public final void method647(int arg0) {
        field1244++;
        if (class96.field1137 >= 500) {
            return;
        }
        this.field1253 = null;
        this.field1249 = 0;
        if (arg0 >= 110) {
            this.field1251 = class27.field288;
            class96.field1137++;
            class27.field288 = this;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(CI)Z", line = 139)
    public static final boolean method648(char arg0, int arg1) {
        field1248++;
        if (arg1 != -501) {
            field1250 = null;
        }
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIZ)Ljava/lang/String;", line = 150)
    public static final String method649(int arg0, int arg1, boolean arg2) {
        field1247++;
        if (arg1 == 17288) {
            return arg2 && arg0 >= 0 ? class434.method2708(10, arg2, arg0, 114) : Integer.toString(arg0);
        } else {
            return null;
        }
    }
}
