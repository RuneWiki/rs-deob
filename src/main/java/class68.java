import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class68 {

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "J")
    public long field1241;

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "Lhp;")
    private class296 field1238;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "Lwr;")
    public static class421 field1242;

    @OriginalMember(owner = "client!aw", name = "finalize", descriptor = "()V", line = 9)
    protected final void finalize() throws Throwable {
        this.field1238.method1871(this.field1241, 34168);
        field1237++;
        super.finalize();
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)V", line = 23)
    public static void method677(byte arg0) {
        if (arg0 != -127) {
            method677((byte) -38);
        }
        field1242 = null;
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lhp;J[Lne;)V", line = 32)
    public class68(class296 arg0, long arg1, class287[] arg2) {
        this.field1241 = arg1;
        this.field1238 = arg0;
    }
}
