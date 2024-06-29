import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public abstract class class1 {

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field2 = new String[5];

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "[I")
    public static int[] field4 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Lhc;")
    public static class235 field1;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIB)I")
    public static final int method1(int arg0, int arg1, int arg2, byte arg3) {
        field3++;
        if (arg2 > 243) {
            arg1 >>= 0x4;
        } else if (arg2 > 217) {
            arg1 >>= 0x3;
        } else if (arg2 > 192) {
            arg1 >>= 0x2;
        } else if (arg2 > 179) {
            arg1 >>= 0x1;
        }
        if (arg3 <= 14) {
            method1(111, 32, -94, (byte) -120);
        }
        return (arg0 >> 2 << 10) + (arg1 >> 5 << 7) + (arg2 >> 1);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)I")
    public abstract int method2(int arg0);

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
    public static void method3(int arg0) {
        field2 = null;
        field4 = null;
        if (arg0 < 114) {
            field6 = -106;
        }
        field1 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method4(Component arg0, int arg1);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BII)V")
    public static final void method5(byte arg0, int arg1, int arg2) {
        if (arg0 != -85) {
            field6 = 54;
        }
        class281.field4359.method1864(49, (byte) -69);
        class281.field4359.method1477(arg1, -61);
        class281.field4359.method1489(65280, arg2);
        class63.field872++;
        field7++;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method6(Component arg0, int arg1);
}
