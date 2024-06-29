import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class290 extends class376 {

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "Lpf;")
    public class410 field4159;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "Lah;")
    public class261 field4160;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
    public int field4161;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
    public int field4163;

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "I")
    public int field4164;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
    public int field4165;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "I")
    public int field4170;

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "[I")
    public static int[] field4168;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "[I")
    public static int[] field4169;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(Z)V")
    public static void method1830(boolean arg0) {
        field4169 = null;
        field4168 = null;
        if (!arg0) {
            field4169 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lfs;I)V")
    public static final void method1831(class387 arg0, int arg1) {
        class133.field1919 = arg0;
        field4166++;
        if (arg1 != 23028) {
            method1831(null, -111);
        }
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(B)V")
    public static final void method1832(byte arg0) {
        if (arg0 <= 81) {
            field4168 = null;
        }
        field4162++;
        if (class289.field4154 > 0) {
            class531.method3135(2700);
        } else {
            class60.field697 = class383.field5635;
            class383.field5635 = null;
            class432.method2619((byte) 1, 40);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public final void method1833(int arg0) {
        this.field4165 = this.field4159.field6092;
        this.field4163 = this.field4159.field6094;
        field4167++;
        this.field4170 = this.field4159.field6101;
        if (this.field4159.field6091 != null) {
            this.field4159.field6091.method241(this.field4160.field3844, this.field4160.field3840, this.field4160.field3848, class420.field6207);
        }
        this.field4164 = class420.field6207[arg0];
        this.field4161 = class420.field6207[0];
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lpf;Lao;)V")
    public class290(class410 arg0, class189 arg1) {
        this.field4159 = arg0;
        this.field4160 = this.field4159.method2515((byte) 125);
        this.method1833(2);
    }
}
