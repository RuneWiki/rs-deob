import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class163 implements Runnable {

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Z")
    public boolean field2842 = true;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field2839 = new Object();

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public int field2849 = 0;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "[I")
    public int[] field2850 = new int[500];

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "[I")
    public int[] field2851 = new int[500];

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field2840 = -1;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Lda;")
    public static class275 field2844 = class255.method1672(124, "::fpson");

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "Z")
    public static boolean field2845 = true;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field2847 = 0;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "Lda;")
    public static class275 field2846 = class255.method1672(119, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
    public static void method1131(byte arg0) {
        field2844 = null;
        if (arg0 != 72) {
            method1131((byte) -24);
        }
        field2846 = null;
    }

    @OriginalMember(owner = "client!vh", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field2842) {
            Object var1 = this.field2839;
            synchronized (this.field2839) {
                if (this.field2849 < 500) {
                    this.field2850[this.field2849] = class44.field746;
                    this.field2851[this.field2849] = class213.field3617;
                    this.field2849++;
                }
            }
            class250.method1640(50L, -61);
        }
        field2848++;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -83 % ((-arg0 - 18) / 55);
        field2843++;
        if (class246.field4355 <= arg4 && arg3 <= class96.field1632 && class149.field2603 <= arg2 && class141.field2493 >= arg6) {
            if (arg5 == 1) {
                class161.method1123(arg3, 500, arg4, arg1, arg2, arg6);
            } else {
                class12.method56(arg5, arg4, arg1, arg3, arg2, -64, arg6);
            }
        } else if (arg5 == 1) {
            class199.method1304(arg1, arg4, arg6, false, arg3, arg2);
        } else {
            class135.method983(arg6, arg1, arg4, arg5, arg3, arg2, 32663);
        }
    }
}
