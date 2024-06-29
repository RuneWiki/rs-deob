import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class778 {

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "Lpca;")
    public class745 field10683 = new class745();

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "Z")
    public static boolean field10685 = false;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field10682 = 0;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field10679;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field10680;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field10681;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field10684;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field10686;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field10688;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field10689;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "Lpca;")
    private class745 field10687;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZ)V")
    public static final void method4277(int arg0, int arg1, boolean arg2) {
        field10679++;
        class787 var3 = class447.method2666(arg1, Integer.MIN_VALUE, arg2);
        if (arg0 != 7563) {
            method4277(69, -116, true);
        }
        if (var3 != null) {
            var3.method3387((byte) 118);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILpca;)V")
    public final void method4278(int arg0, class745 arg1) {
        field10680++;
        if (arg1.field10327 != null) {
            arg1.method4150((byte) -128);
        }
        arg1.field10320 = this.field10683;
        if (arg0 != 0) {
            field10686 = 52;
        }
        arg1.field10327 = this.field10683.field10327;
        arg1.field10327.field10320 = arg1;
        arg1.field10320.field10327 = arg1;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public final void method4279(int arg0) {
        if (arg0 != 0) {
            field10682 = -15;
        }
        field10684++;
        while (true) {
            class745 var2 = this.field10683.field10320;
            if (this.field10683 == var2) {
                this.field10687 = null;
                return;
            }
            var2.method4150((byte) -83);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)Lpca;")
    public final class745 method4280(byte arg0) {
        field10688++;
        if (arg0 <= 2) {
            method4277(-66, -70, false);
        }
        class745 var2 = this.field10687;
        if (this.field10683 == var2) {
            this.field10687 = null;
            return null;
        } else {
            this.field10687 = var2.field10320;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)Lpca;")
    public final class745 method4281(int arg0) {
        if (arg0 != 0) {
            field10682 = -9;
        }
        field10689++;
        class745 var2 = this.field10683.field10320;
        if (this.field10683 == var2) {
            this.field10687 = null;
            return null;
        } else {
            this.field10687 = var2.field10320;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)I")
    public final int method4282(int arg0) {
        field10681++;
        if (arg0 != 4873) {
            return -13;
        }
        int var2 = 0;
        class745 var3 = this.field10683.field10320;
        while (this.field10683 != var3) {
            var3 = var3.field10320;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    public class778() {
        this.field10683.field10320 = this.field10683;
        this.field10683.field10327 = this.field10683;
    }
}
