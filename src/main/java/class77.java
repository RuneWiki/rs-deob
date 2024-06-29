import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public abstract class class77 extends class28 {

    @OriginalMember(owner = "client!jda", name = "y", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "client!jda", name = "A", descriptor = "[Lga;")
    public static class63[] field1050 = new class63[14];

    @OriginalMember(owner = "client!jda", name = "u", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!jda", name = "v", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!jda", name = "w", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!jda", name = "x", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!jda", name = "z", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "(I)V", line = 3)
    public static final void method620(int arg0) {
        field1044++;
        if (arg0 != 55) {
            field1050 = null;
        }
        class349.field4467.method41(62);
    }

    @OriginalMember(owner = "client!jda", name = "j", descriptor = "(I)V", line = 20)
    public static void method623(int arg0) {
        if (arg0 != 0) {
            method620(27);
        }
        field1050 = null;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(III)Z", line = 36)
    public static final boolean method624(int arg0, int arg1, int arg2) {
        if (arg0 != 55) {
            return true;
        }
        field1047++;
        if ((class247.method1555(arg2, arg1, (byte) 104) | (arg1 & 0x10000) != 0) || class701.method3834(-107, arg1, arg2)) {
            return true;
        } else {
            return (arg2 & 0x37) == 0 && class337.method1932(arg0 - 56, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(I)V", line = 50)
    public class77(int arg0) {
        this.field1048 = arg0;
    }

    @OriginalMember(owner = "client!jda", name = "h", descriptor = "(I)Z")
    public abstract boolean method621(int arg0);

    @OriginalMember(owner = "client!jda", name = "i", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method622(int arg0);
}
