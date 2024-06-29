import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class74 {

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "J")
    public long field1106;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "Lom;")
    private class642 field1103;

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "Lei;")
    public static class180 field1107 = null;

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "Lda;")
    public static class400 field1105;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)V", line = 3)
    public static void method679(int arg0) {
        field1107 = null;
        field1105 = null;
        if (arg0 <= 15) {
            method679(-37);
        }
    }

    @OriginalMember(owner = "client!kea", name = "finalize", descriptor = "()V", line = 16)
    protected final void finalize() throws Throwable {
        this.field1103.method3626(this.field1106, 27693);
        field1104++;
        super.finalize();
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Lom;JI)V", line = 28)
    public class74(class642 arg0, long arg1, int arg2) {
        this.field1106 = arg1;
        this.field1103 = arg0;
    }
}
