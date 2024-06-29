import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class224 extends InputStream {

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Lhi;")
    private static class82 field3890 = class95.method664((byte) -46, "flash2:");

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "[I")
    public static int[] field3891 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Lhi;")
    private static class82 field3888 = class95.method664((byte) -109, "red:");

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "[I")
    public static int[] field3892 = new int[2];

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Lhi;")
    public static class82 field3886 = field3890;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Lhi;")
    public static class82 field3894 = field3888;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field3895 = -1;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "Lhi;")
    public static class82 field3893 = field3888;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "Lhi;")
    public static class82 field3896 = field3890;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Lei;")
    public static class70 field3889;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 20)
    public static void method1604(int arg0) {
        field3893 = null;
        field3892 = null;
        field3890 = null;
        field3889 = null;
        field3888 = null;
        field3886 = null;
        field3891 = null;
        field3894 = null;
        field3896 = null;
        if (arg0 >= -120) {
            method1604(-84);
        }
    }

    @OriginalMember(owner = "client!fd", name = "read", descriptor = "()I", line = 90)
    public final int read() {
        class290.method2001(30000L, false);
        field3885++;
        return -1;
    }
}
