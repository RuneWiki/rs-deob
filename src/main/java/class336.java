import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class336 extends class13 {

    @OriginalMember(owner = "client!jo", name = "w", descriptor = "Leca;")
    public class755 field4734;

    @OriginalMember(owner = "client!jo", name = "y", descriptor = "Lpo;")
    public class558 field4736;

    @OriginalMember(owner = "client!jo", name = "F", descriptor = "Luh;")
    public static class168 field4743 = new class168();

    @OriginalMember(owner = "client!jo", name = "I", descriptor = "[I")
    public static int[] field4746 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!jo", name = "x", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "I")
    public int field4737;

    @OriginalMember(owner = "client!jo", name = "A", descriptor = "I")
    public int field4738;

    @OriginalMember(owner = "client!jo", name = "B", descriptor = "I")
    public int field4739;

    @OriginalMember(owner = "client!jo", name = "C", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!jo", name = "D", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!jo", name = "E", descriptor = "I")
    public int field4742;

    @OriginalMember(owner = "client!jo", name = "G", descriptor = "I")
    public int field4744;

    @OriginalMember(owner = "client!jo", name = "H", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!jo", name = "J", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
    public final void method2125(int arg0) {
        this.field4738 = this.field4734.field10536;
        field4740++;
        this.field4742 = this.field4734.field10537;
        this.field4744 = this.field4734.field10535;
        if (this.field4734.field10549 != null) {
            this.field4734.field10549.method771(this.field4736.field7716, this.field4736.field7715, this.field4736.field7719, class272.field3834);
        }
        this.field4737 = class272.field3834[0];
        this.field4739 = class272.field3834[arg0];
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)V")
    public static void method2126(int arg0) {
        field4743 = null;
        field4746 = null;
        int var1 = 112 / ((arg0 - 16) / 57);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(BLha;)V")
    public static final void method2127(byte arg0, class59 arg1) {
        if (class311.field4321) {
            class181.method1332(false, arg1);
        } else {
            class182.method1333(arg1, (byte) -123);
        }
        field4741++;
        if (arg0 < 29) {
            method2126(81);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class322.field4441 = arg6;
        class204.field2933 = arg5;
        class78.field1400 = arg2;
        class331.field4622 = arg0;
        class276.field3877 = arg4;
        class88.field1572 = arg1;
        if (arg3 != 0) {
            method2127((byte) 92, null);
        }
        field4735++;
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Leca;Luj;)V")
    public class336(class755 arg0, class385 arg1) {
        this.field4734 = arg0;
        this.field4736 = this.field4734.method4215((byte) -13);
        this.method2125(2);
    }

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)V")
    public static final void method2129(int arg0) {
        if (class689.field9299.field2525 && class393.field5776.field9140 != -1) {
            class689.method3851(class393.field5776.field9144, class393.field5776.field9140, -54);
        }
        field4745++;
        int var1 = 9 / ((arg0 - 60) / 50);
    }
}
