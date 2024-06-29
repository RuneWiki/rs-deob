import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class204 extends class452 {

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "[B")
    public byte[] field3376;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public static int field3374 = 0;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;)V", line = 9)
    public static final void method1420(String arg0, int arg1, boolean arg2, String arg3) {
        class36.field436 = arg1;
        class6.field66 = 2;
        field3375++;
        if (!arg2) {
            field3374 = 50;
        }
        class259.method1734((byte) -109, arg3, arg0);
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "([B)V", line = 22)
    public class204(byte[] arg0) {
        this.field3376 = arg0;
    }
}
