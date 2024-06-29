import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class386 {

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public int field5504;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "Lbt;")
    private class33 field5503;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "Lci;")
    public static class320 field5505;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Lhr;")
    public static class372 field5506;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "[[[B")
    public static byte[][][] field5507;

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V", line = 9)
    protected final void finalize() throws Throwable {
        this.field5503.method302(this.field5504, 29919);
        field5508++;
        super.finalize();
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lbt;II)V", line = 20)
    public class386(class33 arg0, int arg1, int arg2) {
        this.field5504 = arg2;
        this.field5503 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V", line = 31)
    public static void method2342(byte arg0) {
        if (arg0 != -88) {
            method2342((byte) -93);
        }
        field5506 = null;
        field5507 = null;
        field5505 = null;
    }
}
