import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class379 {

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Lbea;")
    private class205 field5908;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "J")
    public long field5909;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Ldca;")
    public static class161 field5910 = new class161();

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "Lhga;")
    public static class158 field5911 = new class158(100, 20);

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field5913 = 0;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "[I")
    public static int[] field5914;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public static void method2496(byte arg0) {
        field5911 = null;
        if (arg0 > -32) {
            method2497(12, 60);
        }
        field5910 = null;
        field5914 = null;
    }

    @OriginalMember(owner = "client!dg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field5907++;
        this.field5908.method1579((byte) -44, this.field5909);
        super.finalize();
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I")
    public static final int method2497(int arg0, int arg1) {
        return class479.field7078 == null ? 0 : class479.field7078[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lbea;JI)V")
    public class379(class205 arg0, long arg1, int arg2) {
        this.field5908 = arg0;
        this.field5909 = arg1;
    }
}
