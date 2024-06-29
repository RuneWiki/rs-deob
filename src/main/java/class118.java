import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class118 {

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "[[I")
    public static int[][] field2051 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "[I")
    public static int[] field2056 = new int[32];

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2062 = "wishes to trade with you.";

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public int field2050;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public int field2053;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public int field2057;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public int field2058;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public int field2059;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public int field2063;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public int field2067;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "Lbm;")
    public static class307 field2060;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "Lkl;")
    public static class68 field2065;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "[B")
    public byte[] field2052;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "[B")
    public byte[] field2055;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)[B", line = 8)
    public static final byte[] method773(int arg0, boolean arg1) {
        field2066++;
        if (!arg1) {
            method773(106, false);
        }
        class88 var2 = (class88) class306.field4627.method2367((long) arg0, -12270);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class220.method1462(var4, -861395680, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class88(var3);
            class306.field4627.method2369((long) arg0, -28759, var2);
        }
        return var2.field1657;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BZ)V", line = 56)
    public static final void method774(byte arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field2061++;
        if (class6.field137 == null) {
            class6.field137 = new byte[4][104][104];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class6.field137[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V", line = 104)
    public static final void method775(byte arg0, int arg1) {
        class134.field2255.method1883(arg0 + 2047773168, arg1);
        if (arg0 != 119) {
            field2060 = (class307) null;
        }
        field2068++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 116)
    public static void method776(int arg0) {
        if (arg0 != 4) {
            field2051 = (int[][]) ((int[][]) null);
        }
        field2056 = null;
        field2062 = null;
        field2060 = null;
        field2051 = (int[][]) null;
        field2065 = null;
    }
}
