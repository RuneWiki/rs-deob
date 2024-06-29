import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class93 extends class28 {

    @OriginalMember(owner = "client!cea", name = "C", descriptor = "I")
    public int field1235;

    @OriginalMember(owner = "client!cea", name = "x", descriptor = "Lji;")
    private class622 field1231;

    @OriginalMember(owner = "client!cea", name = "y", descriptor = "J")
    private long field1232;

    @OriginalMember(owner = "client!cea", name = "w", descriptor = "[Ltu;")
    public static class234[] field1230 = new class234[1024];

    @OriginalMember(owner = "client!cea", name = "D", descriptor = "S")
    public static short field1236 = 256;

    @OriginalMember(owner = "client!cea", name = "z", descriptor = "[I")
    public static int[] field1233 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!cea", name = "u", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!cea", name = "v", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!cea", name = "A", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!cea", name = "E", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "(I)V")
    public static void method717(int arg0) {
        field1233 = null;
        if (arg0 == 23805) {
            field1230 = null;
        }
    }

    @OriginalMember(owner = "client!cea", name = "h", descriptor = "(I)J")
    public final long method718(int arg0) {
        if (arg0 != 192) {
            field1236 = -119;
        }
        field1234++;
        return this.field1232;
    }

    @OriginalMember(owner = "client!cea", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method719(-3401);
        field1237++;
        super.finalize();
    }

    @OriginalMember(owner = "client!cea", name = "i", descriptor = "(I)V")
    private final void method719(int arg0) {
        if (arg0 != -3401) {
            field1230 = null;
        }
        field1229++;
        if (this.field1232 > 0L) {
            this.field1231.field8501.releasePbuffer(this.field1232);
            this.field1232 = 0L;
        }
    }

    @OriginalMember(owner = "client!cea", name = "j", descriptor = "(I)V")
    public static final void method720(int arg0) {
        int var1 = -128 / ((arg0 + 3) / 51);
        class43.field599 = true;
        field1228++;
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lji;II)V")
    public class93(class622 arg0, int arg1, int arg2) {
        this.field1235 = arg1 * arg2;
        this.field1231 = arg0;
        this.field1232 = this.field1231.field8501.createPbuffer(arg1, arg2);
    }
}
