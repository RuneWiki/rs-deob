import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class2 {

    @OriginalMember(owner = "client!is", name = "c", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public int field13;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "I")
    public int field14;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public int field8;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public int field9;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(II)Z")
    public static final boolean method12(int arg0, int arg1) {
        field15++;
        if (arg1 == 10755) {
            return arg0 == 7 || arg0 == 8 || arg0 == 9;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(II)I")
    public static int method13(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
