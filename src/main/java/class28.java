import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public abstract class class28 extends class55 {

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "Z")
    public volatile boolean field338 = true;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "Lrc;")
    public static class9 field336 = new class9(4);

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "Lc;")
    public static class284 field342 = new class284(16);

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "Lji;")
    public static class145 field341;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "Lbc;")
    public static class282 field343;

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "Z")
    public boolean field335;

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "Z")
    public boolean field339;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)I")
    public abstract int method169(int arg0);

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)[B")
    public abstract byte[] method170(int arg0);

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(B)V")
    public static final void method171(byte arg0) {
        int var1 = 40 % ((54 - arg0) / 63);
        class261.method1669();
        for (int var2 = 0; var2 < 4; var2++) {
            class127.field1825[var2].method891(28734);
        }
        field340++;
        System.gc();
    }

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)V")
    public static void method172(int arg0) {
        field343 = null;
        field336 = null;
        field342 = null;
        if (arg0 > 63) {
            field341 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZ)V")
    public static final void method173(int arg0, boolean arg1) {
        field337++;
        class196.field2800 = arg0;
        if (arg1) {
            class259.field3767 = 3;
            class87.field1184 = 20;
        }
    }
}
