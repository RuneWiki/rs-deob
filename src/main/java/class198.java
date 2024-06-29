import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class198 extends class145 {

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "Lwh;")
    public class102 field2811;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "Lkn;")
    public static class530 field2812 = new class530("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "[[I")
    public static int[][] field2813 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "Z")
    public static boolean field2816 = false;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "[I")
    public static int[] field2818 = new int[2];

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "[B")
    public static byte[] field2814 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    public static int field2815 = 0;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(III[B)Ljava/lang/String;", line = 5)
    public static final String method1250(int arg0, int arg1, int arg2, byte[] arg3) {
        field2810++;
        char[] var4 = new char[arg1];
        int var5 = 0;
        int var6 = -11 % ((-arg2 - 50) / 50);
        int var7 = arg0 + arg1;
        for (int var8 = arg0; var8 < var7; var8++) {
            int var9 = arg3[var8] & 0xFF;
            if (var9 >= 128) {
                if (var9 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var9);
                }
                if (var9 < 224) {
                    if (var7 <= var8 + 1) {
                        throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                    }
                    var8++;
                    int var10 = arg3[var8] & 0xFF;
                    if (var10 < 128 || var10 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var4[var5++] = (char) class170.method1067(class239.method1507(var10, -129), class239.method1507(var9 << 6, -12352));
                } else if (var9 < 240) {
                    if (var8 + 2 >= var7) {
                        throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                    }
                    var8++;
                    int var11 = arg3[var8] & 0xFF;
                    if (var11 < 128 || var11 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                    }
                    var8++;
                    int var12 = arg3[var8] & 0xFF;
                    if (var12 < 128 || var12 > 191) {
                        throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                    }
                    var4[var5++] = (char) class170.method1067(class170.method1067(class239.method1507(var11 << 6, -8256), class239.method1507(var9, -225) << 12), class239.method1507(var12, -129));
                } else if (var9 >= 244) {
                    throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var9);
                } else {
                    throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                }
            } else {
                var4[var5++] = (char) var9;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V", line = 83)
    public static void method1251(int arg0) {
        field2818 = null;
        field2813 = null;
        if (arg0 != 6406) {
            field2812 = null;
        }
        field2812 = null;
        field2814 = null;
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lih;II[B)V", line = 95)
    public class198(class503 arg0, int arg1, int arg2, byte[] arg3) {
        this.field2811 = class418.method2477(arg0, arg1, 6406, arg2, false, false, 6406, arg3);
        this.field2811.method2467(19, false, false);
    }
}
