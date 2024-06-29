import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public abstract class class3 extends class27 {

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "Z")
    public static boolean field64 = false;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "Lat;")
    public static class260 field65;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public static void method23(int arg0) {
        if (arg0 == 19865) {
            field65 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(B)V")
    public static final void method24(byte arg0) {
        field63++;
        class535.field7837 = false;
        if (arg0 >= 38) {
            class2.field61 = null;
            class385.method2235((byte) 63);
        }
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(B)V")
    public static final void method25(byte arg0) {
        int var1 = 63 / ((arg0 - 57) / 40);
        field62++;
        class502.field7099.method2408(99);
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)Law;")
    public abstract class55 method26(int arg0);
}
