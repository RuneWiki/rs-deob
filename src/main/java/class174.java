import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class174 {

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public int field2778;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public int field2785;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "F")
    public float field2793;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public int field2781;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public int field2777;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "F")
    public float field2791;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public int field2782;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public int field2783;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "F")
    public float field2792;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "[I")
    public static int[] field2788 = new int[100];

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "Lwm;")
    private static class152 field2786 = class157.method1048("Attack", 95);

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "Lwm;")
    public static class152 field2787 = class157.method1048("Vous ne pouvez pas ajouter votre nom -9 votre liste d(Wamis)3", 113);

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "Lwm;")
    public static class152 field2789 = field2786;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "Ldc;")
    public static class109 field2776;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "Lah;")
    public static class205 field2794;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IJ)V", line = 11)
    public static final void method1160(int arg0, long arg1) {
        field2780++;
        if (arg1 == 0L) {
            return;
        }
        class245.field4102.method1065(125, 123);
        if (arg0 != -1) {
            field2789 = (class152) null;
        }
        class245.field4102.method1988(arg1, 105);
        class18.field258++;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILah;)V", line = 40)
    public static final void method1161(int arg0, class205 arg1) {
        class37.field626 = arg1;
        if (arg0 != 30671) {
            method1160(-40, -110L);
        }
        field2779++;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V", line = 58)
    public static void method1162(byte arg0) {
        field2794 = null;
        field2789 = null;
        field2786 = null;
        field2787 = null;
        if (arg0 >= -4) {
            field2789 = (class152) null;
        }
        field2776 = null;
        field2788 = null;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V", line = 86)
    public class174() {
        this.field2778 = class14.field198;
        this.field2785 = class14.field186;
        this.field2793 = 1.1523438F;
        this.field2781 = -50;
        this.field2777 = 0;
        this.field2791 = 0.69921875F;
        this.field2782 = -60;
        this.field2783 = -50;
        this.field2792 = 1.2F;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 106)
    public static final void method1163(int arg0) {
        class306.field5254.method1619(11300);
        field2784++;
        class176.field2833.method1619(11300);
        if (arg0 != -30995) {
            field2776 = (class109) null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lhi;)V", line = 116)
    public class174(class291 arg0) {
        int var2 = arg0.method2011(-107);
        if ((var2 & 0x1) == 0) {
            this.field2778 = class14.field198;
        } else {
            this.field2778 = arg0.method1969((byte) -16);
        }
        if ((var2 & 0x2) == 0) {
            this.field2793 = 1.1523438F;
        } else {
            this.field2793 = (float) arg0.method2021((byte) 74) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field2791 = 0.69921875F;
        } else {
            this.field2791 = (float) arg0.method2021((byte) 74) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field2792 = 1.2F;
        } else {
            this.field2792 = (float) arg0.method2021((byte) 74) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2782 = -60;
            this.field2781 = -50;
            this.field2783 = -50;
        } else {
            this.field2781 = arg0.method1986(true);
            this.field2782 = arg0.method1986(true);
            this.field2783 = arg0.method1986(true);
        }
        if ((var2 & 0x20) == 0) {
            this.field2785 = class14.field186;
        } else {
            this.field2785 = arg0.method1969((byte) -16);
        }
        if ((var2 & 0x40) == 0) {
            this.field2777 = 0;
        } else {
            this.field2777 = arg0.method2021((byte) 74);
        }
    }
}
