import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class140 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Ljd;")
    public static class92 field2796 = class202.method1325((byte) 90, "null");

    @OriginalMember(owner = "client!of", name = "b", descriptor = "Ljd;")
    private static class92 field2797 = class202.method1325((byte) 90, " has logged out)3");

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Ljd;")
    public static class92 field2808 = class202.method1325((byte) 90, "cookieprefix");

    @OriginalMember(owner = "client!of", name = "i", descriptor = "Z")
    public static volatile boolean field2804 = true;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "Ljd;")
    private static class92 field2815 = class202.method1325((byte) 90, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field2812 = 0;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Ljd;")
    public static class92 field2803 = field2797;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field2811 = 0;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Ljd;")
    public static class92 field2809 = field2815;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public int field2799;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public int field2800;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public int field2802;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public int field2805;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public int field2806;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public int field2810;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public int field2819;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "Lrh;")
    public static class169 field2817;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "[B")
    public byte[] field2801;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "[B")
    public byte[] field2813;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BJ)V")
    public static final void method931(byte arg0, long arg1) {
        field2816++;
        try {
            if (arg0 == -25) {
                Thread.sleep(arg1);
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IZLjd;)V")
    public static final void method932(int arg0, boolean arg1, class92 arg2) {
        field2818++;
        class114.field2295++;
        class99.field2000.method405(147, 7);
        class99.field2000.method427(arg0, (byte) 114);
        class99.field2000.method419(0, arg2.method609(10354));
        if (!arg1) {
            method931((byte) 114, 37L);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)Lrf;")
    public static final class167 method933(int arg0) {
        if (arg0 != 255) {
            field2817 = null;
        }
        class167 var1 = new class167();
        var1.field3276 = class119.field2419[0];
        var1.field3280 = class153.field3039[0];
        var1.field3277 = class61.field1275[0];
        var1.field3275 = class39.field876[0];
        var1.field3279 = class153.field3029;
        var1.field3278 = class147.field2917;
        int var2 = var1.field3276 * var1.field3275;
        field2798++;
        var1.field3281 = new int[var2];
        byte[] var3 = class14.field401[0];
        for (int var4 = 0; var4 < var2; var4++) {
            var1.field3281[var4] = class123.field2503[class196.method1301(255, var3[var4])];
        }
        class146.method955(true);
        return var1;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public static void method934(int arg0) {
        field2808 = null;
        field2809 = null;
        field2817 = null;
        field2803 = null;
        if (arg0 >= 52) {
            field2796 = null;
            field2815 = null;
            field2797 = null;
        }
    }
}
