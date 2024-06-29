import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class124 {

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field2243 = 0;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "[I")
    public static int[] field2244 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "Lcd;")
    public static class64 field2246 = class44.method335((byte) 71, "Wordpack geladen)3");

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "Lqm;")
    public static class222 field2242;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "Lcd;")
    public static class64 field2249;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "[[I")
    public static int[][] field2241;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 10)
    public static void method901(int arg0) {
        field2246 = null;
        field2241 = (int[][]) null;
        field2242 = null;
        if (arg0 != 506047432) {
            method901(1);
        }
        field2244 = null;
        field2249 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)I", line = 27)
    public static final int method902(byte arg0, int arg1) {
        field2245++;
        return arg0 > -57 ? -15 : arg1 >>> 8;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILcd;)Z", line = 51)
    public static final boolean method903(int arg0, class64 arg1) {
        if (arg0 >= -70) {
            method904(72, (byte[]) null);
        }
        field2247++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class61.field1194; var2++) {
            if (arg1.method515(-64, class267.field4607[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I[B)[B", line = 79)
    public static final byte[] method904(int arg0, byte[] arg1) {
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        field2248++;
        class95.method721(arg1, 0, var3, arg0, var2);
        return var3;
    }
}
