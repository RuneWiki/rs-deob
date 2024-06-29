import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class446 extends class189 {

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "I")
    public int field6322;

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
    public int field6325;

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "I")
    public static int field6324 = 0;

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(III)Z", line = 5)
    public static final boolean method2674(int arg0, int arg1, int arg2) {
        field6321++;
        if (arg0 == 33) {
            return (arg2 & 0x21) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(II)V", line = 21)
    public class446(int arg0, int arg1) {
        this.field6322 = arg1;
        this.field6325 = arg0;
    }
}
