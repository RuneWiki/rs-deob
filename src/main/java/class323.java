import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class323 extends class35 {

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    public int field4662;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
    public int field4660;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
    public static int field4658 = 1;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "[[I")
    public static int[][] field4657 = new int[128][128];

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "J")
    public static long field4661;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "Ldp;")
    public static class174 field4659;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)V", line = 15)
    public static void method2146(byte arg0) {
        if (arg0 != 77) {
            field4657 = null;
        }
        field4657 = null;
        field4659 = null;
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(II)V", line = 32)
    public class323(int arg0, int arg1) {
        this.field4662 = arg0;
        this.field4660 = arg1;
    }
}
