import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class427 {

    @OriginalMember(owner = "client!h", name = "c", descriptor = "[B")
    public static byte[] field6255 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Lph;")
    public static class114 field6253 = new class114(10);

    @OriginalMember(owner = "client!h", name = "x", descriptor = "[[Z")
    public static boolean[][] field6276 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public int field6254;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public int field6256;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public int field6257;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public int field6259;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public int field6261;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public int field6265;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public int field6266;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public int field6267;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public int field6268;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public int field6269;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public int field6270;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "I")
    public int field6271;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public int field6272;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "I")
    public int field6273;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "I")
    public int field6274;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "I")
    public int field6275;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "I")
    public int field6277;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "I")
    public int field6278;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "Lc;")
    public static class158 field6264;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Lam;")
    public static class286 field6258;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "[I")
    public static int[] field6263;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static void method2643(byte arg0) {
        field6255 = null;
        field6263 = null;
        field6264 = null;
        field6276 = null;
        if (arg0 != 0) {
            field6253 = null;
        }
        field6258 = null;
        field6253 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZI)I")
    public static final int method2644(boolean arg0, int arg1) {
        field6260++;
        if (arg1 != -28232) {
            method2644(true, -77);
        }
        long var2 = class442.method2730(arg1 ^ 0xFFFFF3CF);
        for (class392 var4 = arg0 ? (class392) class126.field1618.method315((byte) -93) : (class392) class126.field1618.method310(-126); var4 != null; var4 = (class392) class126.field1618.method310(-89)) {
            if ((var4.field5638 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field5638 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field4510;
                    class254.field3495[var5] = class73.field814[var5];
                    var4.method1967(arg1 + 28231);
                    return var5;
                }
                var4.method1967(-1);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)[B")
    public static final byte[] method2645(byte arg0, int arg1) {
        field6262++;
        if (arg0 != -93) {
            return null;
        }
        class379 var2 = (class379) class171.field2146.method222((long) arg1, -8407);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class409.method2546(18992, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class379(var3);
            class171.field2146.method218((long) arg1, (byte) 115, var2);
        }
        return var2.field5357;
    }
}
