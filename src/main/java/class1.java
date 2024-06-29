import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 {

    @OriginalMember(owner = "client!us", name = "b", descriptor = "Lhe;")
    private class239 field2;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "I")
    public int field5;

    @OriginalMember(owner = "client!us", name = "f", descriptor = "[I")
    public static int[] field6 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!us", name = "d", descriptor = "Lgn;")
    public static class475 field4 = new class475(53, 4);

    @OriginalMember(owner = "client!us", name = "g", descriptor = "[B")
    public static byte[] field7 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!us", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "Lhe;")
    public static class239 field1;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(II)I", line = 9)
    public static final int method1(int arg0, int arg1) {
        return class256.field3674 == null ? 0 : (class256.field3674[arg0][arg1] & 0xFF) << 3;
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(II)V", line = 20)
    public static final void method2(int arg0, int arg1) {
        field3++;
        class5 var2 = class151.field1951;
        synchronized (class151.field1951) {
            class151.field1951.method39(false, arg1);
            int var3 = -9 / ((arg0 - 28) / 51);
        }
        class5 var4 = class124.field1607;
        synchronized (class124.field1607) {
            class124.field1607.method39(false, arg1);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Z)V", line = 38)
    public static void method3(boolean arg0) {
        if (!arg0) {
            field1 = null;
        }
        field6 = null;
        field4 = null;
        field1 = null;
        field7 = null;
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lci;ILhe;)V", line = 65)
    public class1(class298 arg0, int arg1, class239 arg2) {
        new class5(64);
        this.field2 = arg2;
        this.field5 = this.field2.method1473(4309, 15);
    }
}
