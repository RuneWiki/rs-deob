import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class334 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public int field4658 = 128;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public int field4664 = 128;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public int field4660;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public int field4667;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public int field4665;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public int field4659;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field4666 = -1;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Luv;")
    public static class3 field4663 = new class3(77, 7);

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Lsm;")
    public static class577 field4669 = new class577();

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "Ldh;")
    public static class321 field4671 = new class321("", 13);

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "F")
    public static float field4670;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "[I")
    public static int[] field4672;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILsc;)V")
    public final void method2123(int arg0, class334 arg1) {
        this.field4658 = arg1.field4658;
        this.field4665 = arg1.field4665;
        this.field4664 = arg1.field4664;
        this.field4667 = arg1.field4667;
        this.field4659 = arg1.field4659;
        field4661++;
        if (arg0 >= 95) {
            this.field4660 = arg1.field4660;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public static void method2124(byte arg0) {
        field4672 = null;
        if (arg0 >= -5) {
            field4663 = null;
        }
        field4671 = null;
        field4669 = null;
        field4663 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZI)Z")
    public static final boolean method2125(int arg0, boolean arg1, int arg2) {
        field4657++;
        if (arg1) {
            return false;
        } else {
            return (arg0 & 0x580) != 0;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/awt/Frame;ILgaa;)V")
    public static final void method2126(Frame arg0, int arg1, class279 arg2) {
        field4668++;
        while (true) {
            class441 var3 = arg2.method1744(arg0, -125);
            while (var3.field6001 == 0) {
                class353.method2204(10L, 7806);
            }
            if (var3.field6001 == 1) {
                if (arg1 != 77) {
                    return;
                }
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            class353.method2204(100L, 7806);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Lsc;")
    public final class334 method2127(int arg0) {
        if (arg0 == 77) {
            field4662++;
            return new class334(this.field4660, this.field4658, this.field4664, this.field4667, this.field4659, this.field4665);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(I)V")
    public class334(int arg0) {
        this.field4660 = arg0;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(IIIIII)V")
    private class334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4667 = arg3;
        this.field4658 = arg1;
        this.field4665 = arg5;
        this.field4660 = arg0;
        this.field4659 = arg4;
        this.field4664 = arg2;
    }
}
