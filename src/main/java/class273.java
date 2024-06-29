import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class273 {

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Llc;")
    public static class143 field4860 = class66.method374("Titelbild geladen)3", -1);

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "J")
    public static long field4864 = 0L;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field4866 = -1;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "[I")
    public static int[] field4869 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2 };

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Lgd;")
    public class273 field4859;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Lgd;")
    public class273 field4868;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "[[[I")
    public static int[][][] field4861;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public final void method1800(int arg0) {
        field4867++;
        if (this.field4859 == null) {
            return;
        }
        this.field4859.field4868 = this.field4868;
        this.field4868.field4859 = this.field4859;
        this.field4859 = null;
        this.field4868 = null;
        int var2 = 75 % ((19 - arg0) / 40);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)J")
    public static final long method1801(int arg0, int arg1, int arg2) {
        class120 var3 = class7.field122[arg0][arg1][arg2];
        return var3 == null || var3.field2129 == null ? 0L : var3.field2129.field2437;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static void method1802(byte arg0) {
        field4869 = null;
        if (arg0 >= -9) {
            method1802((byte) -64);
        }
        field4860 = null;
        field4861 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILgf;BI)[Lfe;")
    public static final class212[] method1803(int arg0, class7 arg1, byte arg2, int arg3) {
        int var4 = -78 % ((-arg2 - 63) / 49);
        field4862++;
        return class189.method1223(arg1, arg3, 81, arg0) ? class97.method570((byte) -41) : null;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    public static final void method1804(int arg0) {
        field4865++;
        if (arg0 == 26751) {
            class277.field4894.method823(true);
            class144.field2572.method823(true);
            class175.field3135.method823(true);
        }
    }
}
