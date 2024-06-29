import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class29 extends class71 {

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    public static int field418 = 0;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "[I")
    public static int[] field422 = new int[2500];

    @OriginalMember(owner = "client!na", name = "w", descriptor = "F")
    public static float field420;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "J")
    public long field416;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "Lna;")
    public class29 field417;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "Lna;")
    public class29 field419;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V", line = 10)
    public final void method189(int arg0) {
        field421++;
        if (this.field419 == null) {
            return;
        }
        this.field419.field417 = this.field417;
        this.field417.field419 = this.field419;
        if (arg0 == 0) {
            this.field419 = null;
            this.field417 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(B)V", line = 45)
    public static void method190(byte arg0) {
        field422 = null;
        if (arg0 < 12) {
            field418 = -2;
        }
    }
}
