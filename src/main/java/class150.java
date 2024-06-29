import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public abstract class class150 {

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public int field2408;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public int field2407;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public int field2413;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public static int field2414 = 50;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "[I")
    public static int[] field2416 = new int[field2414];

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "[I")
    public static int[] field2411 = new int[field2414];

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "[I")
    public static int[] field2409 = new int[field2414];

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "[I")
    public static int[] field2405 = new int[field2414];

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "[I")
    public static int[] field2417 = new int[field2414];

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field2415 = new String[field2414];

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "[I")
    public static int[] field2412 = new int[field2414];

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "[I")
    public static int[] field2410 = new int[field2414];

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "[[[I")
    public static int[][][] field2404;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lja;III)Z", line = 12)
    public static final boolean method1152(class64 arg0, int arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method467(arg3, 116, arg1);
        if (arg2 != 50) {
            return true;
        }
        field2403++;
        if (var4 == null) {
            return false;
        } else {
            class250.method1771(3, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V", line = 29)
    public static void method1153(int arg0) {
        if (arg0 > -89) {
            field2411 = (int[]) null;
        }
        field2410 = null;
        field2415 = null;
        field2405 = null;
        field2404 = (int[][][]) null;
        field2409 = null;
        field2417 = null;
        field2412 = null;
        field2411 = null;
        field2416 = null;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(III)V", line = 52)
    public class150(int arg0, int arg1, int arg2) {
        this.field2408 = arg0;
        this.field2407 = arg2;
        this.field2413 = arg1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILob;)Lob;", line = 84)
    public static final class292 method1154(int arg0, class292 arg1) {
        field2406++;
        class292 var2 = client.method1798(arg1);
        if (arg0 != 50) {
            field2409 = (int[]) null;
        }
        if (var2 == null) {
            var2 = arg1.field4447;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)V")
    public abstract void method1061(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(III)V")
    public abstract void method1063(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIZ)V")
    public abstract void method1060(int arg0, int arg1, boolean arg2);
}
