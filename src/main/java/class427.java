import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class427 extends class578 {

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public int field5978;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "Llj;")
    private class565 field5976;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "J")
    private long field5975;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public static int field5974;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)J", line = 6)
    public final long method2456(int arg0) {
        field5974++;
        if (arg0 != 0) {
            this.method2457(false);
        }
        return this.field5975;
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(Z)V", line = 17)
    private final void method2457(boolean arg0) {
        if (!arg0) {
            this.field5976 = null;
        }
        field5973++;
        if (this.field5975 > 0L) {
            this.field5976.field7699.releasePbuffer(this.field5975);
            this.field5975 = 0L;
        }
    }

    @OriginalMember(owner = "client!qg", name = "finalize", descriptor = "()V", line = 34)
    protected final void finalize() throws Throwable {
        field5977++;
        this.method2457(true);
        super.finalize();
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Llj;II)V", line = 44)
    public class427(class565 arg0, int arg1, int arg2) {
        this.field5978 = arg1 * arg2;
        this.field5976 = arg0;
        this.field5975 = this.field5976.field7699.createPbuffer(arg1, arg2);
    }
}
