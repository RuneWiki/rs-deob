import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public abstract class class240 {

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public int field3400;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public int field3402;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public int field3401;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "Lhi;")
    public static class192 field3398 = new class192();

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field3407 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "Lkm;")
    public static class133 field3405;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "Lkm;")
    public static class133 field3408;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "[[Z")
    public static boolean[][] field3399;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "[[[B")
    public static byte[][][] field3406;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V", line = 13)
    public static void method1643(int arg0) {
        if (arg0 >= -91) {
            return;
        }
        field3398 = null;
        field3399 = (boolean[][]) null;
        field3408 = null;
        field3405 = null;
        field3407 = null;
        field3406 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(III)V", line = 28)
    public class240(int arg0, int arg1, int arg2) {
        this.field3400 = arg0;
        this.field3402 = arg2;
        this.field3401 = arg1;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)V")
    public abstract void method499(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(III)V")
    public abstract void method501(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(III)V")
    public abstract void method495(int arg0, int arg1, int arg2);
}
