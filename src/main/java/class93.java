import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class93 extends class151 {

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "Lbd;")
    public class162 field1649;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "Z")
    public static boolean field1643 = false;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    public static int field1646 = 1;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "Lbd;")
    public static class162 field1644 = class17.method142(0, "<img=1>");

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "Lqb;")
    public static class209 field1647 = new class209(30);

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "[Ldc;")
    public static class71[] field1642;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "[[[I")
    public static int[][][] field1648;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(Z)V", line = 21)
    public static void method701(boolean arg0) {
        field1647 = null;
        field1644 = null;
        field1648 = (int[][][]) null;
        if (!arg0) {
            field1647 = (class209) null;
        }
        field1642 = null;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V", line = 40)
    public class93() {
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lbd;)V", line = 42)
    public class93(class162 arg0) {
        this.field1649 = arg0;
    }
}
