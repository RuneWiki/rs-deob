import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class372 extends class113 {

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public int field5402;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "Lrha;")
    public static class587 field5400 = new class587();

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "Leda;")
    public static class14 field5401 = new class14();

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "Z")
    public static boolean field5403 = false;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "[I")
    public static int[] field5404 = new int[5];

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "[I")
    public static int[] field5405 = new int[5];

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "Lla;")
    public static class423 field5406;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V")
    public static void method2322(byte arg0) {
        field5405 = null;
        field5400 = null;
        field5404 = null;
        field5401 = null;
        if (arg0 >= -1) {
            method2322((byte) 125);
        }
        field5406 = null;
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(I)V")
    public class372(int arg0) {
        this.field5402 = arg0;
    }
}
