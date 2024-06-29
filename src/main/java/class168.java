import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class168 {

    @OriginalMember(owner = "client!q", name = "r", descriptor = "Lab;")
    public static class3 field3064 = new class3(0, 0);

    @OriginalMember(owner = "client!q", name = "w", descriptor = "[B")
    public static byte[] field3069 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!q", name = "t", descriptor = "Loc;")
    public static class151 field3066 = class137.method873(2, "0(U");

    @OriginalMember(owner = "client!q", name = "u", descriptor = "Lv;")
    public static class218 field3067 = new class218();

    @OriginalMember(owner = "client!q", name = "A", descriptor = "[I")
    public static int[] field3073 = new int[256];

    @OriginalMember(owner = "client!q", name = "B", descriptor = "Loc;")
    public static class151 field3074;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public int field3047;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public int field3048;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public int field3050;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public int field3051;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public int field3052;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public int field3053;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public int field3054;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public int field3055;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public int field3056;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public int field3057;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public int field3058;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public int field3059;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public int field3060;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public int field3062;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public int field3063;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public int field3065;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    public int field3070;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "I")
    public int field3072;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public static void method1088(byte arg0) {
        if (arg0 != 100) {
            return;
        }
        field3074 = null;
        field3066 = null;
        field3069 = null;
        field3064 = null;
        field3067 = null;
        field3073 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III)V")
    public static final void method1089(int arg0, int arg1, int arg2) {
        field3061++;
        class152 var3 = class138.method880((byte) -124, arg0);
        int var4 = var3.field2749;
        int var5 = var3.field2747;
        int var6 = var3.field2755;
        int var7 = class212.field3726[var4 - var5];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        if (arg2 != 0) {
            field3067 = null;
        }
        class156.field2836[var6] = class73.method479(class26.method206(var8, arg1 << var5), class26.method206(class156.field2836[var6], ~var8));
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I")
    public static final int method1090(int arg0, int arg1) {
        if (arg0 == -4565) {
            field3068++;
            return arg1 & 0xFF;
        } else {
            return -88;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3073[var0] = var1;
        }
        field3074 = class137.method873(2, " )2> <col=ff9040>");
    }
}
