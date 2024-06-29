import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class397 extends class336 {

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lgq;")
    public class241 field5703;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Lsn;")
    public static class205 field5704 = new class205(7, 7);

    @OriginalMember(owner = "client!t", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5705 = "";

    @OriginalMember(owner = "client!t", name = "m", descriptor = "Lrb;")
    public static class283 field5707 = new class283(61, -1);

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "[[B")
    public static byte[][] field5706;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 5)
    public static void method2356(int arg0) {
        field5705 = null;
        field5704 = null;
        field5707 = null;
        if (arg0 != -1) {
            field5706 = null;
        }
        field5706 = null;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lpg;II[B)V", line = 21)
    public class397(class333 arg0, int arg1, int arg2, byte[] arg3) {
        this.field5703 = class79.method612(arg1, 6406, arg0, 34037, false, arg2, 6406, arg3);
        this.field5703.method990(false, 1024, false);
    }
}
