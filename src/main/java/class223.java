import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class223 extends class159 {

    @OriginalMember(owner = "client!su", name = "k", descriptor = "I")
    public int field2885 = -1;

    @OriginalMember(owner = "client!su", name = "q", descriptor = "Z")
    public boolean field2891 = false;

    @OriginalMember(owner = "client!su", name = "p", descriptor = "[Lsaa;")
    public static class345[] field2890 = new class345[5];

    @OriginalMember(owner = "client!su", name = "l", descriptor = "I")
    public int field2886;

    @OriginalMember(owner = "client!su", name = "m", descriptor = "I")
    public int field2887;

    @OriginalMember(owner = "client!su", name = "n", descriptor = "I")
    public int field2888;

    @OriginalMember(owner = "client!su", name = "o", descriptor = "I")
    public int field2889;

    @OriginalMember(owner = "client!su", name = "r", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!su", name = "s", descriptor = "I")
    public int field2893;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V")
    public static void method1420(int arg0) {
        field2890 = null;
        if (arg0 != 31509) {
            method1420(-56);
        }
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(I)V")
    public class223(int arg0) {
        this.field2885 = arg0;
    }

    static {
        for (int var0 = 0; var0 < field2890.length; var0++) {
            field2890[var0] = new class345();
        }
    }
}
