import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public abstract class class539 extends class692 {

    @OriginalMember(owner = "client!ht", name = "t", descriptor = "S")
    public short field7864;

    @OriginalMember(owner = "client!ht", name = "u", descriptor = "Lor;")
    public static class594 field7865 = new class594();

    @OriginalMember(owner = "client!ht", name = "w", descriptor = "F")
    public static float field7867;

    @OriginalMember(owner = "client!ht", name = "v", descriptor = "I")
    public static int field7866;

    @OriginalMember(owner = "client!ht", name = "x", descriptor = "I")
    public static int field7868;

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "I")
    public static int field7870;

    @OriginalMember(owner = "client!ht", name = "y", descriptor = "Lih;")
    public static class650 field7869;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "(I)Z")
    public final boolean method1472(int arg0) {
        ++field7866;
        if (arg0 > -97) {
            method3271(false);
        }
        return class640.method3715(91, super.field9696 >> class439.field6699, super.field9705 >> class439.field6699, super.field9703);
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(IIIIII)V")
    public class539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field9696 = arg0;
        super.field9705 = arg2;
        super.field9701 = arg1;
        this.field7864 = (short) arg5;
        super.field9695 = (byte) arg3;
        super.field9703 = (byte) arg4;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Z)V")
    public static void method3271(boolean arg0) {
        if (arg0) {
            method3271(false);
        }
        field7869 = null;
        field7865 = null;
    }

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "(I)Z")
    public final boolean method1474(int arg0) {
        if (arg0 != -1) {
            return true;
        } else {
            ++field7870;
            return class37.field509[(super.field9696 >> class439.field6699) - (-class443.field6744 + class325.field5056)][(super.field9705 >> class439.field6699) + class443.field6744 + -class542.field7902];
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(B[Lcp;)I")
    public final int method1473(byte arg0, class674[] arg1) {
        ++field7868;
        if (arg0 > -43) {
            this.method1474(-120);
        }
        return this.method3918(arg1, (byte) 101, super.field9705 >> class439.field6699, super.field9696 >> class439.field6699);
    }
}
