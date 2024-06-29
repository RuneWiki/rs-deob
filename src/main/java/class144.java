import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class144 {

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "Lma;")
    public static class5 field2096 = class12.method119("Wordpack geladen)3", (byte) 71);

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Lni;")
    public static class202 field2093;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZ)V", line = 5)
    public static final void method914(int arg0, boolean arg1) {
        class286.field4829 = new int[104];
        class181.field2754 = new int[104];
        class91.field1364 = new int[104];
        class57.field904 = new int[104];
        class283.field4803 = new int[104];
        field2094++;
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class278.field4718 = new int[var2][105][arg0];
        class111.field1641 = new byte[var2][104][104];
        class24.field415 = 99;
        class152.field2235 = new byte[var2][104][104];
        class37.field583 = new byte[var2][105][105];
        class279.field4733 = new byte[var2][104][104];
        class78.field1213 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BILeb;)Lma;", line = 30)
    public static final class5 method915(byte arg0, int arg1, class253 arg2) {
        field2097++;
        if (!class151.method951(1, client.method767(arg2), arg1) && arg2.field4329 == null) {
            return null;
        } else if (arg2.field4199 == null || arg1 >= arg2.field4199.length || arg2.field4199[arg1] == null || arg2.field4199[arg1].method40((byte) -124).method36(30673) == 0) {
            return class184.field2833 ? class288.method1940((byte) 90, new class5[] { class74.field1160, class175.method1148(arg1, false) }) : null;
        } else {
            int var3 = -66 / ((arg0 + 23) / 34);
            return arg2.field4199[arg1];
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V", line = 62)
    public static void method916(byte arg0) {
        field2093 = null;
        if (arg0 == -20) {
            field2096 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lec;B)V", line = 75)
    public static final void method917(class91 arg0, byte arg1) {
        field2095++;
        class150 var2 = (class150) class86.field1298.method1372(false, arg0.field1367.method69(-49));
        if (arg1 >= -88) {
            field2093 = (class202) null;
        }
        if (var2 == null) {
            class230.method1642(arg0.field186[0], (class177) null, class276.field4701, arg0, 0, 0, arg0.field175[0], (class185) null);
        } else {
            var2.method942(-9430);
        }
    }
}
