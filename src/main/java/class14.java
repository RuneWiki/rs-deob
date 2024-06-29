import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class14 extends class4 {

    @OriginalMember(owner = "client!eda", name = "y", descriptor = "Lnba;")
    public class491 field136;

    @OriginalMember(owner = "client!eda", name = "s", descriptor = "Lgca;")
    public class209 field130;

    @OriginalMember(owner = "client!eda", name = "z", descriptor = "[I")
    public static int[] field137 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!eda", name = "r", descriptor = "I")
    public int field129;

    @OriginalMember(owner = "client!eda", name = "t", descriptor = "I")
    public int field131;

    @OriginalMember(owner = "client!eda", name = "u", descriptor = "I")
    public int field132;

    @OriginalMember(owner = "client!eda", name = "v", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!eda", name = "w", descriptor = "I")
    public int field134;

    @OriginalMember(owner = "client!eda", name = "x", descriptor = "I")
    public int field135;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)V")
    public static void method63(byte arg0) {
        if (arg0 <= 79) {
            field137 = null;
        }
        field137 = null;
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(B)V")
    public final void method64(byte arg0) {
        field133++;
        this.field134 = this.field136.field6898;
        this.field135 = this.field136.field6896;
        this.field129 = this.field136.field6894;
        if (this.field136.field6900 != null) {
            this.field136.field6900.method907(this.field130.field2723, this.field130.field2726, this.field130.field2717, class682.field9475);
        }
        this.field131 = class682.field9475[0];
        if (arg0 != -92) {
            this.method64((byte) -70);
        }
        this.field132 = class682.field9475[2];
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(Lnba;Lnha;)V")
    public class14(class491 arg0, class689 arg1) {
        this.field136 = arg0;
        this.field130 = this.field136.method2982(3000000);
        this.method64((byte) -92);
    }
}
