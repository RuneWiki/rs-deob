import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class183 {

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public int field2346;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "Ljava/lang/String;")
    public String field2347;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "Ljava/lang/String;")
    public String field2345;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public int field2342;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "J")
    public long field2348;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "Lim;")
    public static class353 field2349 = new class353(22, -1);

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "[[Z")
    public static boolean[][] field2350 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "[I")
    public static int[] field2340;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "[Lha;")
    public static class116[] field2337;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZLjava/lang/String;)[B")
    public static final byte[] method1121(boolean arg0, String arg1) {
        field2343++;
        int var2 = arg1.length();
        if (var2 == 0) {
            return new byte[0];
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        int var4 = var3 / 4 * 3;
        if (arg0) {
            method1123(-43, 94, (byte) 106, -16);
        }
        if (var2 <= var3 - 2 || class375.method2294(-6279, arg1.charAt(var3 - 2)) == -1) {
            var4 -= 2;
        } else if (var2 <= var3 - 1 || class375.method2294(-6279, arg1.charAt(var3 - 1)) == -1) {
            var4--;
        }
        byte[] var5 = new byte[var4];
        class82.method461(0, arg1, 1020, var5);
        return var5;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)Z")
    public static final boolean method1122(byte arg0, int arg1) {
        if (arg0 < 75) {
            method1123(-90, -28, (byte) -111, -23);
        }
        field2344++;
        return arg1 == 0 || arg1 == 1;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIBI)I")
    public static final int method1123(int arg0, int arg1, byte arg2, int arg3) {
        field2339++;
        if (arg0 == arg3) {
            return arg0;
        }
        int var4 = 128 - arg1;
        int var5 = (arg0 & 0x7F) * var4 + ((arg3 & 0x7F) * arg1) >> 7;
        int var6 = (arg0 & 0x380) * var4 + (arg3 & 0x380) * arg1 >> 7;
        int var7 = -104 / ((37 - arg2) / 63);
        int var8 = (arg0 & 0xFC00) * var4 + (arg3 & 0xFC00) * arg1 >> 7;
        return var6 & 0x380 | var8 & 0xFC00 | var5 & 0x7F;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
    public static void method1124(byte arg0) {
        int var1 = 9 % ((arg0 - 55) / 51);
        field2350 = null;
        field2340 = null;
        field2349 = null;
        field2337 = null;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class183(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field2346 = arg0;
        this.field2347 = arg3;
        this.field2345 = arg1;
        this.field2342 = arg2;
        this.field2348 = arg4;
    }
}
