import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class703 extends RuntimeException {

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field9785;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "Ljava/lang/String;")
    public String field9786;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "J")
    public static long field9781 = -1L;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "[I")
    public static int[] field9782 = new int[6];

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "[[B")
    public static byte[][] field9784 = new byte[1000][];

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field9783;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public static void method3956(int arg0) {
        if (arg0 != 6) {
            field9782 = null;
        }
        field9784 = null;
        field9782 = null;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class703(Throwable arg0, String arg1) {
        this.field9785 = arg0;
        this.field9786 = arg1;
    }
}
