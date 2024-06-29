import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class65 {

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "J")
    public static long field663 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "[I")
    public static int[] field662 = new int[3];

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Lha;")
    public class120 field664;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "Lda;")
    public class473 field665;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 6)
    public static void method350(int arg0) {
        if (arg0 > -113) {
            field663 = -97L;
        }
        field662 = null;
    }
}
