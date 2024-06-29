import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public abstract class class291 {

    @OriginalMember(owner = "client!up", name = "a", descriptor = "Lfea;")
    public static class152 field4152 = new class152();

    @OriginalMember(owner = "client!up", name = "b", descriptor = "Ltca;")
    public static class184 field4153 = new class184(8);

    @OriginalMember(owner = "client!up", name = "e", descriptor = "I")
    public static int field4156 = 0;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "Lmw;")
    public static class517 field4155 = new class517(40, 2);

    @OriginalMember(owner = "client!up", name = "c", descriptor = "Luq;")
    public static class172 field4154;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V", line = 3)
    public static void method1865(byte arg0) {
        field4153 = null;
        field4154 = null;
        int var1 = 89 % ((57 - arg0) / 62);
        field4152 = null;
        field4155 = null;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IB)[B")
    public abstract byte[] method1866(int arg0, byte arg1);

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BI)V")
    public abstract void method1867(byte arg0, int arg1);

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)Lwk;")
    public abstract class153 method1868(boolean arg0);

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(BI)I")
    public abstract int method1869(byte arg0, int arg1);
}
