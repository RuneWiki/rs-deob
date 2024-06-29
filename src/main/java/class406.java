import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class406 {

    @OriginalMember(owner = "client!v", name = "b", descriptor = "J")
    public long field5973;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lqg;")
    private class321 field5976;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Ldq;")
    public static class489 field5974 = new class489(1, 2);

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field5977 = 0;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() throws Throwable {
        field5972++;
        this.field5976.method2047(-116, this.field5973);
        super.finalize();
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V", line = 15)
    public static void method2523(boolean arg0) {
        field5974 = null;
        if (arg0) {
            method2523(false);
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lqg;J[Lwe;)V", line = 27)
    public class406(class321 arg0, long arg1, class279[] arg2) {
        this.field5973 = arg1;
        this.field5976 = arg0;
    }
}
