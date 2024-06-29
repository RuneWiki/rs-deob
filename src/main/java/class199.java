import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class199 {

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Ler;")
    private class92 field3244;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "J")
    public long field3247;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Lsba;")
    public static class200 field3246 = new class200(16);

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!jf", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        this.field3244.method883(89, this.field3247);
        field3245++;
        super.finalize();
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 17)
    public static void method1553(int arg0) {
        field3246 = null;
        if (arg0 < 44) {
            method1553(-128);
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Ler;JI)V", line = 27)
    public class199(class92 arg0, long arg1, int arg2) {
        this.field3244 = arg0;
        this.field3247 = arg1;
    }
}
