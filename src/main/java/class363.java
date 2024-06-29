import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class363 extends class37 {

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "[I")
    public static int[] field5000 = new int[32];

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "Z")
    public static boolean field4996 = false;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "[Z")
    public static boolean[] field4998 = new boolean[100];

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
    public int field5004;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "Lnf;")
    public class258 field4997;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "[B")
    public byte[] field5001;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "[Lwn;")
    public static class77[] field4995;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)[B")
    public final byte[] method154(boolean arg0) {
        ++field4999;
        if (!arg0) {
            return null;
        } else if (super.field484) {
            throw new RuntimeException();
        } else {
            return this.field5001;
        }
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)V")
    public static void method2229(byte arg0) {
        field5000 = null;
        field4998 = null;
        field4995 = null;
        int var1 = 35 % ((arg0 - 11) / 53);
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)I")
    public final int method156(byte arg0) {
        ++field5003;
        if (arg0 <= 125) {
            return -16;
        } else {
            return super.field484 ? 0 : 100;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BIII)V")
    public static final void method2230(byte arg0, int arg1, int arg2, int arg3) {
        ++field4994;
        class26 var4 = class217.method1445(true, arg1, 9);
        var4.method158(28194);
        var4.field339 = arg2;
        if (arg0 == 27) {
            var4.field341 = arg3;
        }
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(B)Ldb;")
    public static final class26 method2231(byte arg0) {
        ++field5002;
        class26 var1 = (class26) class191.field2750.method152(124);
        if (var1 != null) {
            var1.method1884(false);
            var1.method1213((byte) 106);
            return var1;
        } else {
            int var2 = 53 / ((-57 - arg0) / 59);
            class26 var3;
            do {
                var3 = (class26) class334.field4527.method152(63);
                if (var3 == null) {
                    return null;
                }
                if (~var3.method163(10) < ~class199.method1372(30938)) {
                    return null;
                }
                var3.method1884(false);
                var3.method1213((byte) 106);
            } while (~(var3.field2411 & Long.MIN_VALUE) == -1L);
            return var3;
        }
    }
}
