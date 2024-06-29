import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class151 {

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "Lvi;")
    private class560 field1900 = new class560(64);

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "Lpq;")
    private class159 field1898;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "Lpq;")
    private class159 field1897;

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "I")
    public static int field1901 = 0;

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "Lvi;")
    public static class560 field1899 = new class560(200);

    @OriginalMember(owner = "client!sba", name = "f", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V")
    public static void method1017(int arg0) {
        if (arg0 != 32768) {
            field1899 = null;
        }
        field1899 = null;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(II)Ldp;")
    public final class217 method1018(int arg0, int arg1) {
        field1902++;
        class217 var3 = (class217) this.field1900.method3134((long) arg1, -71);
        if (arg0 != 32767) {
            field1901 = -99;
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field1897.method1087(0, arg1, 1);
        } else {
            var4 = this.field1898.method1087(0, arg1 & 0x7FFF, 1);
        }
        class217 var5 = new class217();
        if (var4 != null) {
            var5.method1337(new class138(var4), 3);
        }
        if (arg1 >= 32768) {
            var5.method1340(0);
        }
        this.field1900.method3130((long) arg1, true, var5);
        return var5;
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(ILpq;Lpq;)V")
    public class151(int arg0, class159 arg1, class159 arg2) {
        this.field1898 = arg2;
        this.field1897 = arg1;
        if (this.field1897 != null) {
            this.field1897.method1076(0, 0);
        }
        if (this.field1898 != null) {
            this.field1898.method1076(0, 0);
        }
    }
}
