import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class646 extends class496 {

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public int field9375;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public int field9376;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "Lqp;")
    public static class586 field9377 = new class586(110, 12);

    @OriginalMember(owner = "client!am", name = "n", descriptor = "Lrb;")
    public static class352 field9379 = new class352(2, 4, 4, 0);

    @OriginalMember(owner = "client!am", name = "o", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field9380 = new Hashtable();

    @OriginalMember(owner = "client!am", name = "q", descriptor = "[F")
    public static float[] field9382 = new float[4];

    @OriginalMember(owner = "client!am", name = "p", descriptor = "Lmh;")
    public static class145 field9381 = new class145("", 13);

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field9374;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "Ldda;")
    public static class597 field9378;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
    public static void method3731(int arg0) {
        field9380 = null;
        field9377 = null;
        field9382 = null;
        field9379 = null;
        field9381 = null;
        field9378 = null;
        if (arg0 != -32525) {
            field9382 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(II)V")
    public class646(int arg0, int arg1) {
        this.field9375 = arg0;
        this.field9376 = arg1;
    }
}
