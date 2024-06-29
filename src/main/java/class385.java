import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class385 extends class617 {

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "Lcea;")
    public class197 field5984;

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "[I")
    public static int[] field5982 = new int[2];

    @OriginalMember(owner = "client!mba", name = "g", descriptor = "I")
    public static int field5986 = 0;

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "Lwe;")
    public static class374 field5985;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)V")
    public static void method2506(byte arg0) {
        field5982 = null;
        field5985 = null;
        if (arg0 != -44) {
            method2506((byte) -56);
        }
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Ler;II[B)V")
    public class385(class92 arg0, int arg1, int arg2, byte[] arg3) {
        this.field5984 = class174.method1420(arg1, false, 6406, arg3, arg2, 0, arg0, 6406);
        this.field5984.method1158(false, false, (byte) 100);
    }
}
