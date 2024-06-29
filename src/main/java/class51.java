import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class51 {

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "Ljava/lang/String;")
    public String field740;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IZI)Z")
    public static final boolean method375(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return true;
        } else {
            field739++;
            return (arg0 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B)Lvh;")
    public static final class381 method376(byte arg0) {
        field737++;
        class381 var1 = (class381) class220.field2967.method111((byte) -7);
        if (arg0 != -18) {
            return null;
        } else if (var1 == null) {
            return new class381();
        } else {
            class492.field6822--;
            return var1;
        }
    }
}
