import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class115 extends class515 {

    @OriginalMember(owner = "client!kba", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field1457 = new String[100];

    @OriginalMember(owner = "client!kba", name = "B", descriptor = "[I")
    public static int[] field1459 = new int[4];

    @OriginalMember(owner = "client!kba", name = "A", descriptor = "Lhe;")
    public static class391 field1458 = new class391(0, 0);

    @OriginalMember(owner = "client!kba", name = "C", descriptor = "I")
    public static int field1460 = 0;

    @OriginalMember(owner = "client!kba", name = "w", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!kba", name = "x", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!kba", name = "y", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(BIII)V")
    public final void method544(byte arg0, int arg1, int arg2, int arg3) {
        super.field7268 = arg1;
        if (arg0 != 25) {
            field1457 = null;
        }
        super.field7255 = arg2;
        super.field7259 = arg3;
        ++field1454;
    }

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "(Z)V")
    public static void method907(boolean arg0) {
        field1457 = null;
        if (!arg0) {
            field1458 = null;
            field1459 = null;
        }
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(IIIIIF)V")
    public class115(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IF)V")
    public final void method545(int arg0, float arg1) {
        ++field1455;
        super.field7263 = arg1;
        if (arg0 != 0) {
            this.method544((byte) 93, -57, 113, -78);
        }
    }
}
