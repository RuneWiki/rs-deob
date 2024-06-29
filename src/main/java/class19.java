import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class19 {

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "Z")
    public static boolean field125 = true;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "Z")
    public static boolean field127 = false;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)I", line = 7)
    public static final int method71(int arg0) {
        if (arg0 != 18345) {
            method71(-96);
        }
        field126++;
        return class467.field6492;
    }
}
