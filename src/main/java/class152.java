import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public abstract class class152 {

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Lkh;")
    public static class13 field2261 = new class13(4);

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field2262 = 500;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field2263 = 1;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Lul;")
    public static class406 field2264;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 3)
    public static final void method1044(byte arg0) {
        int var1 = -107 / ((-arg0 - 40) / 50);
        for (int var2 = 0; var2 < 100; var2++) {
            class277.field4219[var2] = true;
        }
        field2260++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V", line = 23)
    public static void method1046(boolean arg0) {
        field2264 = null;
        field2261 = null;
        if (arg0) {
            method1046(true);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)Z")
    public abstract boolean method1045(int arg0, byte arg1);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public abstract void method1047(int arg0);

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)Lup;")
    public abstract class183 method1048(int arg0);

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    public abstract void method1049(int arg0);
}
