import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class514 {

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field7549 = 0;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "Lla;")
    public static class319 field7550 = new class319(85, -1);

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field7553 = 0;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "Lps;")
    public static class63 field7552 = new class63();

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "[I")
    public static int[] field7554 = new int[5];

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field7555 = new String[100];

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "[Lsm;")
    public static class189[] field7556;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lsm;)V", line = 3)
    public static final void method3067(class189 arg0) {
        if (class401.field6115 >= 65535) {
            return;
        }
        class28 var1 = arg0.field2518;
        field7556[class401.field6115] = arg0;
        class375.field5703[class401.field6115] = false;
        class401.field6115++;
        int var2 = arg0.field2519;
        if (arg0.field2530) {
            var2 = 0;
        }
        int var3 = arg0.field2519;
        if (arg0.field2525) {
            var3 = class141.field1892 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method255(-7164) + class251.field3501 - var1.method252(81) >> class10.field179;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method255(-7164) + var1.method252(58) - class251.field3501 >> class10.field179;
            if (var7 >= class475.field7051) {
                var7 = class475.field7051 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field2526[var5++];
                int var10 = (var1.method257(-46) + class251.field3501 - var1.method252(79) >> class10.field179) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class533.field7842) {
                    var11 = class533.field7842 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class411.field6251[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class411.field6251[var4][var12][var8] = var13 | (long) class401.field6115;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class411.field6251[var4][var12][var8] = var13 | (long) class401.field6115 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class411.field6251[var4][var12][var8] = var13 | (long) class401.field6115 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class411.field6251[var4][var12][var8] = var13 | (long) class401.field6115 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V", line = 96)
    public static void method3068(byte arg0) {
        field7554 = null;
        field7556 = null;
        if (arg0 != -72) {
            method3067(null);
        }
        field7552 = null;
        field7550 = null;
        field7555 = null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 112)
    public static final void method3069(int arg0) {
        field7551++;
        class169.method1147();
        if (arg0 != 1510) {
            field7554 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BIIIII)V", line = 131)
    public static final void method3070(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7548++;
        int var6 = arg2;
        if (arg0 == 116) {
            while (arg3 >= var6) {
                class221.method1489(class466.field6955[var6], arg5, arg1, (byte) -30, arg4);
                var6++;
            }
        }
    }
}
