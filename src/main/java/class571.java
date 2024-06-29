import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class571 implements class503 {

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public int field8303;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Z")
    public static boolean field8300 = true;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field8301;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field8302;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field8304;

    @OriginalMember(owner = "client!te", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8301++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/io/File;I)[B")
    public static final byte[] method3288(File arg0, int arg1) {
        field8302++;
        if (arg1 <= 61) {
            method3288(null, -91);
        }
        return class5.method239(arg0, (int) arg0.length(), (byte) -54);
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class571(String arg0, int arg1) {
        this.field8303 = arg1;
    }
}
