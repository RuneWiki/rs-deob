import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class195 {

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "[I")
    public static int[] field2798 = new int[500];

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Z")
    public static boolean field2797 = true;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Ltc;")
    public static class35 field2800 = new class35();

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field2807 = 0;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field2810 = 1;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field2809 = -1;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Llk;")
    public static class244 field2808;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "[[B")
    public static byte[][] field2811;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
    public static void method1246(boolean arg0) {
        if (arg0) {
            method1248(125, (String) null);
        }
        field2811 = null;
        field2798 = null;
        field2808 = null;
        field2800 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)I")
    public static final int method1247(int arg0, int arg1) {
        if (arg1 == 0) {
            field2806++;
            return arg0 >>> 8;
        } else {
            return 36;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method1248(int arg0, String arg1) {
        field2799++;
        int var2 = arg1.length();
        long var3 = 0L;
        int var5 = 0;
        int var6 = -96 / ((50 - arg0) / 43);
        while (var2 > var5) {
            var3 = (long) arg1.charAt(var5) + (var3 << 5) - var3;
            var5++;
        }
        return var3;
    }
}
