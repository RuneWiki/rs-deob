import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class602 extends class617 {

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "Loi;")
    public class65 field8508;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "Z")
    public static boolean field8510 = false;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field8509;

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lhea;II[B)V", line = 10)
    public class602(class387 arg0, int arg1, int arg2, byte[] arg3) {
        this.field8508 = arg0.method2330(false, class87.field1467, 0, arg1, arg3, arg2);
        this.field8508.method663((byte) -102, false, false);
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lhea;II[I)V", line = 22)
    public class602(class387 arg0, int arg1, int arg2, int[] arg3) {
        this.field8508 = arg0.method2363(arg1, 0, false, arg3, arg2);
        this.field8508.method663((byte) -102, false, false);
    }
}
