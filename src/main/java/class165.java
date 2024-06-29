import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class165 extends class73 {

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    private int field2430;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    private int field2423;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    private int field2433;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    private int field2425;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "I")
    private int field2435;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "I")
    private int field2428;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "I")
    private int field2436;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "I")
    private int field2437;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field2421 = 0;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field2426 = 0;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2432 = "red:";

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static volatile int field2422 = -1;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2419;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "[[B")
    public static byte[][] field2429;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
    public static void method1124(int arg0) {
        field2429 = null;
        field2432 = null;
        field2419 = null;
        if (arg0 < 93) {
            method1126((String) null, -17);
        }
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V")
    public static final void method1125(int arg0) {
        ++field2418;
        class211.field3148.method940(arg0 + -27953);
        if (arg0 != 27968) {
            method1125(-48);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1126(String arg0, int arg1) {
        ++field2427;
        if (arg0 == null) {
            return false;
        } else {
            int var2 = 62 % ((arg1 - 32) / 50);
            for (int var3 = 0; ~class206.field3090 < ~var3; ++var3) {
                if (arg0.equalsIgnoreCase(class248.field3853[var3])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
    public final void method584(int arg0, int arg1, int arg2) {
        if (arg1 <= 116) {
            this.field2423 = -69;
        }
        int var4 = this.field2428 * arg0 >> 12;
        ++field2431;
        int var5 = this.field2425 * arg2 >> 12;
        int var6 = this.field2437 * arg2 >> 12;
        int var7 = this.field2433 * arg2 >> 12;
        int var8 = this.field2436 * arg0 >> 12;
        int var9 = this.field2430 * arg2 >> 12;
        int var10 = this.field2435 * arg0 >> 12;
        int var11 = this.field2423 * arg0 >> 12;
        class22.method153(var8, super.field1182, 200, var4, var5, var9, var6, var7, var11, var10);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(III)V")
    public final void method587(int arg0, int arg1, int arg2) {
        if (arg2 != -10) {
            this.field2437 = 34;
        }
        ++field2420;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(III)V")
    public final void method588(int arg0, int arg1, int arg2) {
        int var4 = 127 / ((arg2 - 61) / 46);
        ++field2434;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2430 = arg6;
        this.field2423 = arg5;
        this.field2433 = arg4;
        this.field2425 = arg2;
        this.field2435 = arg7;
        this.field2428 = arg1;
        this.field2436 = arg3;
        this.field2437 = arg0;
    }
}
