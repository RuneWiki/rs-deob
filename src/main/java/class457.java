import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class457 {

    @OriginalMember(owner = "client!af", name = "k", descriptor = "[I")
    public int[] field6556 = new int[3];

    @OriginalMember(owner = "client!af", name = "j", descriptor = "[I")
    public int[] field6555 = new int[2];

    @OriginalMember(owner = "client!af", name = "a", descriptor = "[I")
    public int[] field6546 = new int[2];

    @OriginalMember(owner = "client!af", name = "h", descriptor = "[I")
    public int[] field6553 = new int[3];

    @OriginalMember(owner = "client!af", name = "i", descriptor = "[S")
    public short[] field6554;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "[S")
    public short[] field6552;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field6547 = 0;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "[I")
    public static int[] field6549 = new int[] { 1, 4, 1, 2 };

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field6557 = 0;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "[[Z")
    public static boolean[][] field6551;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/awt/Component;B)Lrp;")
    public static final class458 method2727(Component arg0, byte arg1) {
        if (arg1 != -41) {
            field6547 = 88;
        }
        field6548++;
        return new class750(arg0);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method2728(int arg0) {
        if (arg0 >= -103) {
            field6547 = -44;
        }
        field6551 = null;
        field6549 = null;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Llia;)V")
    public class457(class501 arg0) {
        this.field6556[1] = arg0.field7116;
        this.field6556[0] = arg0.field7100;
        this.field6556[2] = arg0.field7157;
        this.field6553[0] = arg0.field7103;
        this.field6553[2] = arg0.field7177;
        this.field6553[1] = arg0.field7120;
        this.field6555[0] = arg0.field7101;
        this.field6555[1] = arg0.field7159;
        this.field6546[0] = arg0.field7170;
        this.field6546[1] = arg0.field7137;
        if (arg0.field7169 != null) {
            this.field6554 = new short[arg0.field7169.length];
            class42.method287(arg0.field7169, 0, this.field6554, 0, this.field6554.length);
        }
        if (arg0.field7114 != null) {
            this.field6552 = new short[arg0.field7114.length];
            class42.method287(arg0.field7114, 0, this.field6552, 0, this.field6552.length);
        }
    }
}
