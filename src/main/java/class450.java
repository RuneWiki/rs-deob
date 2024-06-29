import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class450 extends class438 {

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
    public int field6454;

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
    public int field6455;

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
    public int field6459;

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "Lac;")
    public class216 field6458;

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "[Luh;")
    public class153[] field6451;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "[[Z")
    public static boolean[][] field6457;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIILea;)Z", line = 12)
    public final boolean method2809(int arg0, int arg1, int arg2, class58 arg3) {
        field6453++;
        if (this.field6451 != null) {
            for (int var5 = 0; var5 < this.field6451.length; var5++) {
                if (this.field6451[var5].method1123(arg2, arg1) && this.field6458.method710(true, arg1, arg3, arg2)) {
                    return true;
                }
            }
        }
        if (arg0 != 10282) {
            method2811(-113, 110);
        }
        return false;
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V", line = 46)
    public static final void method2810(int arg0) {
        class399[] var1 = class30.field417;
        synchronized (class30.field417) {
            for (int var2 = 0; var2 < class30.field417.length; var2++) {
                class30.field417[var2] = new class399();
                class185.field2625[var2] = 0;
            }
            if (arg0 != -1) {
                field6457 = null;
            }
        }
        field6452++;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)V", line = 68)
    public static final void method2811(int arg0, int arg1) {
        class350.field4719 = arg0;
        if (arg1 == 0) {
            class24.field312 = -1;
            field6460++;
            class258.field3572 = -1;
            class302.method1833(arg1 ^ 0x3B);
        }
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)V", line = 83)
    public static void method2812(int arg0) {
        field6457 = null;
        if (arg0 != -21460) {
            field6457 = null;
        }
    }
}
