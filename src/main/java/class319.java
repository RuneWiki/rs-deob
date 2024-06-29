import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class319 {

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public int field4626 = 128;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public int field4634 = 128;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public int field4627;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public int field4632;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public int field4623;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public int field4624;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "Z")
    public static boolean field4633;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)Ldh;")
    public final class319 method1956(int arg0) {
        if (arg0 == 128) {
            field4622++;
            return new class319(this.field4627, this.field4626, this.field4634, this.field4624, this.field4623, this.field4632);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIILoh;)V")
    public static final void method1957(int arg0, int arg1, int arg2, class549 arg3) {
        field4628++;
        class367.field5208 = arg0;
        if (arg1 != 128) {
            field4629 = 113;
        }
        class541.field7536 = arg2;
        class353.field5039 = arg3;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZLdh;)V")
    public final void method1958(boolean arg0, class319 arg1) {
        this.field4632 = arg1.field4632;
        this.field4627 = arg1.field4627;
        this.field4634 = arg1.field4634;
        this.field4626 = arg1.field4626;
        if (!arg0) {
            method1957(123, 46, -80, null);
        }
        this.field4624 = arg1.field4624;
        field4631++;
        this.field4623 = arg1.field4623;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(I)V")
    public class319(int arg0) {
        this.field4627 = arg0;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(IIIIII)V")
    private class319(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4627 = arg0;
        this.field4632 = arg5;
        this.field4626 = arg1;
        this.field4623 = arg4;
        this.field4624 = arg3;
        this.field4634 = arg2;
    }
}
