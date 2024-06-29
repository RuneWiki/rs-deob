import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class28 {

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
    public int field426;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
    public int field424;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "Ljava/lang/String;")
    public static String field429 = null;

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "[F")
    public static float[] field430 = new float[16];

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "J")
    public static long field428 = 0L;

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "[I")
    public static int[] field436 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
    public int field432;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "Lir;")
    public class28 field431;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "Lnh;")
    public class778 field427;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V", line = 5)
    public static void method266(byte arg0) {
        field436 = null;
        field429 = null;
        if (arg0 != -112) {
            field436 = null;
        }
        field430 = null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZI)Lir;", line = 19)
    public final class28 method267(boolean arg0, int arg1) {
        field434++;
        if (!arg0) {
            method266((byte) -4);
        }
        return new class28(this.field426, arg1);
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)Lrq;", line = 43)
    public final class371 method268(byte arg0) {
        field423++;
        return arg0 <= 11 ? null : class622.method3540(this.field426, 4622);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 55)
    public static final String method269(String arg0, int arg1) {
        field433++;
        String var2 = class748.method4179((byte) -65, class450.method2728(arg0, false));
        if (arg1 != 47) {
            method269(null, 38);
        }
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(II)V", line = 76)
    public class28(int arg0, int arg1) {
        this.field426 = arg0;
        this.field424 = arg1;
    }
}
