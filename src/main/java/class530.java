import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class530 extends OutputStream {

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field7811;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    public static int field7812;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "I")
    public static int field7814;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    public static int field7815;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "I")
    public static int field7816;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V", line = 4)
    public static final void method3072(int arg0) {
        class102.method731(-96);
        field7811++;
        class274.field3590 = null;
        class170.field2401 = null;
        class319.field4628 = null;
        if (arg0 >= -97) {
            field7814 = -3;
        }
        class329.field4779 = null;
        class20.field383 = null;
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)V", line = 20)
    public static final void method3073(int arg0) {
        if (arg0 == -25103) {
            class130.method931();
            field7812++;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 32)
    public static final int method3074(String arg0, int arg1) {
        int var2 = 116 / ((32 - arg1) / 61);
        field7813++;
        return arg0.length() + 2;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZBZ)V", line = 46)
    public static final void method3075(boolean arg0, byte arg1, boolean arg2) {
        field7815++;
        if (arg2) {
            class562.field8226++;
            class645.method3675(-109);
        }
        if (arg0) {
            class462.field6643++;
            class127.method907((byte) -62);
        }
        int var3 = -10 / ((-arg1 - 7) / 42);
    }

    @OriginalMember(owner = "client!bu", name = "write", descriptor = "(I)V", line = 70)
    public final void write(int arg0) throws IOException {
        field7816++;
        throw new IOException();
    }
}
