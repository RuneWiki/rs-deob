import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class355 extends class176 {

    @OriginalMember(owner = "client!mba", name = "z", descriptor = "I")
    public int field4797;

    @OriginalMember(owner = "client!mba", name = "A", descriptor = "I")
    private int field4798;

    @OriginalMember(owner = "client!mba", name = "q", descriptor = "I")
    public int field4788;

    @OriginalMember(owner = "client!mba", name = "p", descriptor = "I")
    private int field4787;

    @OriginalMember(owner = "client!mba", name = "x", descriptor = "I")
    private int field4795;

    @OriginalMember(owner = "client!mba", name = "m", descriptor = "I")
    public int field4784;

    @OriginalMember(owner = "client!mba", name = "u", descriptor = "I")
    private int field4792;

    @OriginalMember(owner = "client!mba", name = "s", descriptor = "I")
    public int field4790;

    @OriginalMember(owner = "client!mba", name = "t", descriptor = "I")
    private int field4791;

    @OriginalMember(owner = "client!mba", name = "n", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!mba", name = "o", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!mba", name = "r", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!mba", name = "v", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!mba", name = "w", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!mba", name = "y", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(BIII)Z")
    public final boolean method2126(byte arg0, int arg1, int arg2, int arg3) {
        field4789++;
        if (arg0 == 16) {
            return this.field4791 == arg2 && arg1 >= this.field4787 && this.field4792 >= arg1 && arg3 >= this.field4798 && arg3 <= this.field4795;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(I[III)V")
    public final void method2127(int arg0, int[] arg1, int arg2, int arg3) {
        arg1[1] = this.field4787 + arg0 - this.field4797;
        arg1[2] = arg2 + this.field4798 - this.field4790;
        arg1[0] = this.field4791;
        field4794++;
        if (arg3 != 361) {
            this.method2127(-99, null, 58, 38);
        }
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(III)Z")
    public final boolean method2128(int arg0, int arg1, int arg2) {
        if (arg2 <= 80) {
            return true;
        } else {
            field4785++;
            return this.field4797 <= arg1 && this.field4788 >= arg1 && this.field4790 <= arg0 && this.field4784 >= arg0;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IZI[I)V")
    public final void method2129(int arg0, boolean arg1, int arg2, int[] arg3) {
        arg3[0] = 0;
        arg3[2] = this.field4790 + arg2 - this.field4798;
        field4793++;
        if (arg1) {
            this.method2128(-95, -76, -47);
        }
        arg3[1] = this.field4797 + arg0 - this.field4787;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)V")
    public static final void method2130(int arg0) {
        for (int var1 = arg0; var1 < class480.field6764; var1++) {
            int var2 = class586.field8386[var1];
            class576 var3 = (class576) class278.field3837.method1242(0, (long) var2);
            if (var3 != null) {
                class109 var4 = var3.field7929;
                class168.method1077(6621, var4, var4.field1669.field8597);
            }
        }
        field4786++;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIB)Z")
    public final boolean method2131(int arg0, int arg1, byte arg2) {
        field4796++;
        if (arg2 != -78) {
            method2130(-122);
        }
        return this.field4787 <= arg1 && this.field4792 >= arg1 && arg0 >= this.field4798 && arg0 <= this.field4795;
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field4797 = arg5;
        this.field4798 = arg2;
        this.field4788 = arg7;
        this.field4787 = arg1;
        this.field4795 = arg4;
        this.field4784 = arg8;
        this.field4792 = arg3;
        this.field4790 = arg6;
        this.field4791 = arg0;
    }

    static {
        new class104("From", "Von:", "De", "De");
    }
}
