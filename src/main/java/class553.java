import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class553 implements class549 {

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public int field7696;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public int field7694;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public int field7700;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public int field7703;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public int field7688;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Lft;")
    public class4 field7699;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public int field7690;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "Lps;")
    public class105 field7693;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public int field7691;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Lde;")
    public static class558 field7698 = new class558("WTQA", "office", "_qa", 2);

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field7689;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field7695;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field7697;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lgda;)V")
    public static final void method3244(class61 arg0) {
        class6.field80.method570(arg0.field823, arg0.field809 + (arg0.method509(118) >> 1), arg0.field813, class440.field5917);
        arg0.field817 = class440.field5917[0];
        arg0.field806 = class440.field5917[1];
        arg0.field816 = class440.field5917[2];
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)Llf;")
    public class251 method94(int arg0) {
        if (arg0 != 1024) {
            this.field7690 = -42;
        }
        field7692++;
        return null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
    public static final void method3245(int arg0, int arg1) {
        field7689++;
        if (arg0 == -1) {
            return;
        }
        if (arg1 < 15) {
            method3245(23, 26);
        }
        if (class512.field7234[arg0]) {
            class741.field10314.method448(true, arg0);
            class316.field3880[arg0] = null;
            class642.field8762[arg0] = null;
            class512.field7234[arg0] = false;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public static void method3246(int arg0) {
        field7698 = null;
        if (arg0 != 2) {
            method3246(-38);
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lps;Lft;IIIIIII)V")
    public class553(class105 arg0, class4 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field7696 = arg6;
        this.field7694 = arg4;
        this.field7700 = arg3;
        this.field7703 = arg5;
        this.field7688 = arg7;
        this.field7699 = arg1;
        this.field7690 = arg2;
        this.field7693 = arg0;
        this.field7691 = arg8;
    }
}
