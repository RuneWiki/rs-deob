import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class72 extends class324 {

    @OriginalMember(owner = "client!gv", name = "r", descriptor = "I")
    public int field766;

    @OriginalMember(owner = "client!gv", name = "q", descriptor = "I")
    public int field765;

    @OriginalMember(owner = "client!gv", name = "v", descriptor = "I")
    private int field770;

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
    public int field761;

    @OriginalMember(owner = "client!gv", name = "p", descriptor = "I")
    private int field764;

    @OriginalMember(owner = "client!gv", name = "y", descriptor = "I")
    private int field773;

    @OriginalMember(owner = "client!gv", name = "n", descriptor = "I")
    private int field762;

    @OriginalMember(owner = "client!gv", name = "s", descriptor = "I")
    private int field767;

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
    public int field758;

    @OriginalMember(owner = "client!gv", name = "z", descriptor = "Lhb;")
    public static class629 field774 = new class629(0, 7);

    @OriginalMember(owner = "client!gv", name = "B", descriptor = "[I")
    public static int[] field776 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!gv", name = "o", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!gv", name = "t", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!gv", name = "u", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!gv", name = "w", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!gv", name = "x", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!gv", name = "C", descriptor = "Ljava/lang/Object;")
    public static Object field777;

    @OriginalMember(owner = "client!gv", name = "A", descriptor = "[[I")
    public static int[][] field775;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILua;)I")
    public static final int method477(int arg0, class581 arg1) {
        field772++;
        if (arg0 != -17878) {
            return -99;
        } else if (class274.field3839 == arg1) {
            return 7681;
        } else if (class457.field6837 == arg1) {
            return 8448;
        } else if (class310.field4559 == arg1) {
            return 34165;
        } else if (class107.field1276 == arg1) {
            return 260;
        } else if (class543.field7773 == arg1) {
            return 34023;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZI[II)V")
    public final void method478(boolean arg0, int arg1, int[] arg2, int arg3) {
        arg2[0] = this.field762;
        field759++;
        arg2[1] = this.field770 + arg1 - this.field758;
        arg2[2] = arg3 - (this.field765 - this.field773);
        if (!arg0) {
            this.method478(true, -123, null, 106);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IZII)Z")
    public final boolean method479(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            return true;
        } else {
            field760++;
            return this.field762 == arg0 && arg2 >= this.field770 && arg2 <= this.field767 && this.field773 <= arg3 && this.field764 >= arg3;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(III)Z")
    public final boolean method480(int arg0, int arg1, int arg2) {
        if (arg1 == 9116) {
            field768++;
            return arg2 >= this.field770 && this.field767 >= arg2 && this.field773 <= arg0 && this.field764 >= arg0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
    public static void method481(int arg0) {
        if (arg0 >= -123) {
            field777 = null;
        }
        field775 = null;
        field777 = null;
        field774 = null;
        field776 = null;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I[III)V")
    public final void method482(int arg0, int[] arg1, int arg2, int arg3) {
        field769++;
        arg1[arg3] = this.field765 + arg0 - this.field773;
        arg1[1] = -this.field770 - (-this.field758 - arg2);
        arg1[0] = 0;
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field766 = arg8;
        this.field765 = arg6;
        this.field770 = arg1;
        this.field761 = arg7;
        this.field764 = arg4;
        this.field773 = arg2;
        this.field762 = arg0;
        this.field767 = arg3;
        this.field758 = arg5;
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(III)Z")
    public final boolean method483(int arg0, int arg1, int arg2) {
        field771++;
        if (arg2 != 34165) {
            this.method478(false, -78, null, 117);
        }
        return this.field758 <= arg1 && arg1 <= this.field761 && arg0 >= this.field765 && arg0 <= this.field766;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
    public static final void method484(byte arg0) {
        if (class413.field6264.method399()) {
            class413.field6264.method357(class30.field348);
            class499.method2989(true);
            class413.field6264.method298(class30.field348);
            class413.field6264.method361(class30.field348);
        } else {
            class418.method2644(class81.field908, (byte) 80);
        }
        field763++;
        if (arg0 <= -7) {
            class410.method2598(97);
        }
    }
}
