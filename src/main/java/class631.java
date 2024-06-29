import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class631 {

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public int field8873;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    private int field8869;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "[S")
    private static short[] field8865 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "[S")
    private static short[] field8871 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "[S")
    private static short[] field8874 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "[[S")
    public static short[][] field8868 = new short[][] { field8871, field8865, field8874 };

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field8870;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field8872;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method3574(int arg0) {
        field8865 = null;
        field8871 = null;
        field8868 = null;
        field8874 = null;
        if (arg0 != 6798) {
            method3574(12);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)I")
    public final int method3575(boolean arg0) {
        field8872++;
        if (!arg0) {
            field8865 = null;
        }
        return this.field8869;
    }

    @OriginalMember(owner = "client!cb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8870++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)Z")
    public static final boolean method3576(boolean arg0) {
        field8867++;
        if (!arg0) {
            method3574(-99);
        }
        if (class237.field3816) {
            try {
                class284.method1862(class351.field5138, "showVideoAd", (byte) 47);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(II)V")
    public class631(int arg0, int arg1) {
        this.field8873 = arg1;
        this.field8869 = arg0;
    }
}
