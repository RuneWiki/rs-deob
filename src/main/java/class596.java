import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class596 implements class226 {

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "Lwn;")
    public class673 field8557;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "Lom;")
    private class344 field8564;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field8556;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field8558;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field8559;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field8560;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field8562;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field8563;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field8565;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "Lf;")
    public class702 field8561;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)Z")
    public final boolean method1398(byte arg0) {
        if (arg0 <= 112) {
            this.field8564 = null;
        }
        field8560++;
        return this.field8564.method2230((byte) -109, this.field8557.field9584);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
    public final void method1400(byte arg0) {
        if (arg0 != -10) {
            this.method1398((byte) 88);
        }
        field8565++;
        this.field8561 = class505.method3001((byte) 71, this.field8564, this.field8557.field9584);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZZ)V")
    public void method1432(boolean arg0, boolean arg1) {
        field8556++;
        if (arg1) {
            this.field8561 = null;
        }
        if (arg0) {
            int var3 = this.field8557.field9586.method2056(121, this.field8561.method1784(), class575.field8355) + this.field8557.field9578;
            int var4 = this.field8557.field9575.method3156(class693.field9762, 4416, this.field8561.method1789()) + this.field8557.field9577;
            this.field8561.method3914(var3, var4);
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(B)V")
    public static final void method3396(byte arg0) {
        if (arg0 != 18) {
            field8558 = -1;
        }
        field8559++;
        if (class389.field5684 == null) {
            return;
        }
        if (class389.field5684.field6502 == 1) {
            class389.field5684 = null;
            return;
        }
        if (class389.field5684.field6502 == 2) {
            class410.method2501((byte) 50, class138.field2453, class448.field6445, 2);
            class389.field5684 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public static final void method3397(int arg0) {
        field8563++;
        if (class194.field3050) {
            return;
        }
        class194.field3050 = true;
        if (class527.field7429.field2675) {
            class27.field926 = ((int) class27.field926 + 47 & 0xFFFFFFF0);
        } else {
            class623.field9015 += (12.0F - class623.field9015) / 2.0F;
        }
        if (arg0 == -47) {
            class292.field4392 = true;
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lom;Lwn;)V")
    public class596(class344 arg0, class673 arg1) {
        this.field8557 = arg1;
        this.field8564 = arg0;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lgfa;III)V")
    public static final void method3398(class697 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class520.field7369) {
            class370 var4 = class257.field3792[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field5494 != null && var4.field5494.method447(-87)) {
                arg0.method455(class576.field8369, -1008, var4.field5494, 0, 0, class521.field7381, true);
            }
        }
        if (arg3 < class520.field7369) {
            class370 var5 = class257.field3792[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field5494 != null && var5.field5494.method447(-41)) {
                arg0.method455(0, -1008, var5.field5494, class576.field8369, 0, class521.field7381, true);
            }
        }
        if (arg2 < class520.field7369 && arg3 < class107.field1852) {
            class370 var6 = class257.field3792[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field5494 != null && var6.field5494.method447(-52)) {
                arg0.method455(class576.field8369, -1008, var6.field5494, class576.field8369, 0, class521.field7381, true);
            }
        }
        if (arg2 < class520.field7369 && arg3 > 0) {
            class370 var7 = class257.field3792[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field5494 != null && var7.field5494.method447(-42)) {
                arg0.method455(class576.field8369, -1008, var7.field5494, -class576.field8369, 0, class521.field7381, true);
            }
        }
    }
}
