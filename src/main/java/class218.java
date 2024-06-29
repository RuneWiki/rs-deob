import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class218 extends class63 {

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    private int field3680;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    private int field3686;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    private int field3683;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    private int field3687;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field3681 = 0;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "Laj;")
    public static class151 field3688;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "Ljava/awt/Frame;")
    public static Frame field3682;

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(IIIIII)V")
    public class218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3680 = arg3;
        this.field3686 = arg2;
        this.field3683 = arg1;
        this.field3687 = arg0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIB)V")
    public final void method214(int arg0, int arg1, byte arg2) {
        ++field3679;
        int var4 = this.field3687 * arg0 >> 12;
        int var5 = this.field3686 * arg0 >> 12;
        if (arg2 > -110) {
            field3682 = null;
        }
        int var6 = this.field3680 * arg1 >> 12;
        int var7 = this.field3683 * arg1 >> 12;
        class107.method800(true, super.field1066, var7, var4, var6, var5);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static void method1555(byte arg0) {
        field3688 = null;
        if (arg0 < 92) {
            field3682 = null;
        }
        field3682 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)V")
    public final void method210(int arg0, int arg1, int arg2) {
        ++field3684;
        if (arg2 != 8846) {
            this.field3680 = -64;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZI)V")
    public final void method216(int arg0, boolean arg1, int arg2) {
        ++field3685;
        if (!arg1) {
            field3682 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(III)V")
    public static final void method1556(int arg0, int arg1, int arg2) {
        class9.field171 = new class17(arg0);
        class171.field2761 = new class17(arg2);
        if (arg1 != 1907952044) {
            method1556(-78, 20, 39);
        }
        ++field3678;
    }
}
