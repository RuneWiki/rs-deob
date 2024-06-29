import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class70 extends class181 {

    @OriginalMember(owner = "client!th", name = "J", descriptor = "Lfa;")
    public class165 field1225;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "Lli;")
    public static class185 field1224 = class245.method1649("Verbindung zum Update)2Server hergestellt)3", -71);

    @OriginalMember(owner = "client!th", name = "L", descriptor = "Lli;")
    public static class185 field1227 = class245.method1649("clignotant1:", 124);

    @OriginalMember(owner = "client!th", name = "O", descriptor = "[I")
    public static int[] field1230 = new int[2000];

    @OriginalMember(owner = "client!th", name = "P", descriptor = "I")
    public static int field1231 = 0;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "Lli;")
    public static class185 field1229 = class245.method1649("null", 123);

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    public static int field1226 = 0;

    @OriginalMember(owner = "client!th", name = "T", descriptor = "Lli;")
    public static class185 field1235 = class245.method1649("lila:", 125);

    @OriginalMember(owner = "client!th", name = "R", descriptor = "Lli;")
    public static class185 field1233 = class245.method1649(")1a2)1m", 124);

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!th", name = "S", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I[Lli;[S)V")
    public static final void method459(int arg0, class185[] arg1, short[] arg2) {
        class86.method563(arg1.length + arg0, arg2, arg1, 0, 84);
        field1234++;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lfa;)V")
    public class70(class165 arg0) {
        this.field1225 = arg0;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
    public static final void method460(int arg0, int arg1) {
        field1228++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class118.method847(-9631);
        } else if (arg1 == 2) {
            class144.method1036((byte) -33);
        } else {
            throw new RuntimeException();
        }
        if (arg0 < 35) {
            field1233 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V")
    public static void method461(int arg0) {
        if (arg0 <= 3) {
            field1235 = null;
        }
        field1227 = null;
        field1230 = null;
        field1229 = null;
        field1235 = null;
        field1233 = null;
        field1224 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lli;I)V")
    public static final void method462(class185 arg0, int arg1) {
        field1232++;
        if (class81.field1455 == null) {
            return;
        }
        if (arg1 >= -80) {
            method461(-38);
        }
        int var2 = 0;
        long var3 = arg0.method1327((byte) 101);
        if (var3 == 0L) {
            return;
        }
        while (class81.field1455.length > var2 && class81.field1455[var2].field1278 != var3) {
            var2++;
        }
        if (class81.field1455.length > var2 && class81.field1455[var2] != null) {
            class182.field3349.method577(111, 0);
            class182.field3349.method870(class81.field1455[var2].field1278, (byte) 122);
            class275.field4870++;
        }
    }
}
