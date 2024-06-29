import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class515 extends class381 {

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public int field7225;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public int field7224;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field7222 = 7000;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Z")
    public static final boolean method2903(int arg0, int arg1) {
        field7223++;
        if (arg1 == -13) {
            return arg0 == 10 || arg0 == 11 || arg0 == 12;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(II)V")
    public class515(int arg0, int arg1) {
        this.field7225 = arg0;
        this.field7224 = arg1;
    }
}
