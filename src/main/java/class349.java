import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public abstract class class349 {

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public int field5583;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public int field5585;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public int field5589;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "Ljava/lang/String;")
    public static String field5592 = "white:";

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5588 = "purple:";

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "Z")
    public static boolean field5590 = true;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field5593 = -1;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "Lek;")
    public static class206 field5582;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "Lak;")
    public static class345 field5586;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "[I")
    public static int[] field5591;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V", line = 16)
    public static void method2495(byte arg0) {
        field5592 = null;
        field5588 = null;
        field5582 = null;
        field5586 = null;
        if (arg0 <= -22) {
            field5591 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)I", line = 33)
    public static final int method2496(int arg0, int arg1) {
        field5584++;
        int var2 = arg0 * 6 - 61440;
        int var3 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var4 = (arg0 * var2 >> 12) + 40960;
        int var5 = 24 % ((-arg1 - 17) / 35);
        return var3 * var4 >> 12;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(III)V", line = 64)
    public class349(int arg0, int arg1, int arg2) {
        this.field5583 = arg1;
        this.field5585 = arg0;
        this.field5589 = arg2;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)V")
    public abstract void method210(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)V")
    public abstract void method215(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(III)V")
    public abstract void method213(int arg0, int arg1, int arg2);
}
