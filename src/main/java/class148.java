import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class148 {

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Z")
    public boolean field2650 = false;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public int field2658 = 0;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public int field2664 = 0;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2649 = "Loaded sprites";

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "[I")
    public static int[] field2655 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "[[[I")
    public static int[][][] field2661 = new int[2][][];

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field2660 = -2;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "[C")
    public static char[] field2662 = new char[128];

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "Lme;")
    public class206 field2656;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "Ljg;")
    public static class326 field2657;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field2654;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "[I")
    public static int[] field2663;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIII)V", line = 6)
    public static final void method1175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -1) {
            method1177((byte) 6, (String) null);
        }
        field2651++;
        int var9 = arg5 + 1;
        class317.method2184(arg4, (byte) -41, class64.field1007[arg5], arg1, arg2);
        int var8 = arg3 - 1;
        class317.method2184(arg4, (byte) 121, class64.field1007[arg3], arg1, arg2);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class64.field1007[var6];
            var7[arg2] = var7[arg4] = arg1;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V", line = 45)
    public static void method1176(byte arg0) {
        field2663 = null;
        field2662 = null;
        field2657 = null;
        if (arg0 != -4) {
            field2660 = 103;
        }
        field2649 = null;
        field2655 = null;
        field2661 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLjava/lang/String;)V", line = 60)
    public static final void method1177(byte arg0, String arg1) {
        field2653++;
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        int var2 = -35 % ((arg0 - 42) / 34);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)I", line = 81)
    public static final int method1178(boolean arg0) {
        field2659++;
        if (arg0) {
            field2662 = (char[]) null;
        }
        return 2;
    }
}
