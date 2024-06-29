import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class98 {

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "[[I")
    public static int[][] field2482 = new int[104][104];

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "[B")
    public static byte[] field2485 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field2486 = 0;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Lpd;")
    public static class94 field2484 = class28.method249(87, " x");

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Lpd;")
    public static class94 field2487 = class28.method249(109, "hitmarks");

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Lpd;")
    public static class94 field2489 = class28.method249(31, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Lla;")
    public static class66 field2483;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "[I")
    public static int[] field2488;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)I", line = 15)
    public static final int method740(int arg0, int arg1, int arg2) {
        int var3 = -55 % ((arg2 - 18) / 53);
        field2491++;
        int var4 = arg1 * 57 + arg0;
        int var5 = var4 ^ var4 << 13;
        int var6 = Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589;
        return var6 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)Z", line = 34)
    public static final boolean method741(byte arg0, int arg1) {
        field2490++;
        if (class51.field1276[arg1]) {
            return true;
        } else if (class6.field122.method817(74, arg1)) {
            int var2 = class6.field122.method825(true, arg1);
            if (var2 == 0) {
                class51.field1276[arg1] = true;
                return true;
            }
            if (class108.field2673[arg1] == null) {
                class108.field2673[arg1] = new class77[var2];
            }
            int var3 = 0;
            if (arg0 != -89) {
                return false;
            }
            while (var2 > var3) {
                if (class108.field2673[arg1][var3] == null) {
                    byte[] var4 = class6.field122.method808((byte) 83, arg1, var3);
                    if (var4 != null) {
                        class108.field2673[arg1][var3] = new class77();
                        class108.field2673[arg1][var3].field1928 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class108.field2673[arg1][var3].method577(arg0 ^ 0xFFFFFFDB, new class122(var4));
                        } else {
                            class108.field2673[arg1][var3].method581(new class122(var4), (byte) 37);
                        }
                    }
                }
                var3++;
            }
            class51.field1276[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 123)
    public static void method742(int arg0) {
        field2484 = null;
        field2488 = null;
        field2482 = null;
        if (arg0 < 20) {
            method742(91);
        }
        field2485 = null;
        field2487 = null;
        field2483 = null;
        field2489 = null;
    }
}
