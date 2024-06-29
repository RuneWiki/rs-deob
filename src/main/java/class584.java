import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class584 {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Z")
    public static boolean field7748 = true;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field7753 = -1;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "Lcu;")
    public static class206 field7750 = new class206(73, 7);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field7747;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field7749;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field7751;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field7752;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static void method3212(byte arg0) {
        field7750 = null;
        if (arg0 < 61) {
            method3214(null, 38);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILjava/io/File;I)[B")
    public static final byte[] method3213(int arg0, File arg1, int arg2) {
        field7749++;
        if (arg0 != 73) {
            field7748 = false;
        }
        try {
            byte[] var3 = new byte[arg2];
            class44.method313(arg2, arg1, 2, var3);
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lmf;I)I")
    public static final int method3214(class388 arg0, int arg1) {
        if (arg1 >= -3) {
            return 76;
        }
        field7751++;
        if (class484.field6545 == arg0) {
            return 9216;
        } else if (class262.field3598 == arg0) {
            return 34065;
        } else if (class439.field6038 == arg0) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!eb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7752++;
        throw new IllegalStateException();
    }
}
