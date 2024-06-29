import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class90 {

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "Lkaa;")
    public static class47 field1091 = new class47(66, -1);

    @OriginalMember(owner = "client!eha", name = "c", descriptor = "Lkg;")
    public static class275 field1093 = new class275(13, 0, 1, 0);

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!eha", name = "e", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!eha", name = "d", descriptor = "[I")
    public static int[] field1094;

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "([IZ[I)V", line = 4)
    public static final void method685(int[] arg0, boolean arg1, int[] arg2) {
        field1095++;
        if (arg2 == null || arg0 == null) {
            class327.field4666 = null;
            class630.field8394 = null;
            class475.field6516 = null;
            return;
        }
        if (arg1) {
            method685(null, false, null);
        }
        class630.field8394 = arg2;
        class475.field6516 = new int[arg2.length];
        class327.field4666 = new byte[arg2.length][][];
        for (int var3 = 0; var3 < class630.field8394.length; var3++) {
            class327.field4666[var3] = new byte[arg0[var3]][];
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(Laha;I[[B)V", line = 39)
    public static final void method686(class385 arg0, int arg1, byte[][] arg2) {
        field1092++;
        int var3 = 0;
        if (arg1 > -40) {
            method686(null, 42, null);
        }
        while (var3 < arg0.field6057) {
            class651.method3552(-25926);
            for (int var4 = 0; var4 < class719.field10004 >> 3; var4++) {
                for (int var5 = 0; var5 < (class107.field1453 >> 3); var5++) {
                    int var6 = class447.field6131[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg0.field6053 || var7 == 0) {
                            int var8 = (var6 & 0x7) >> 1;
                            int var9 = (var6 & 0xFFDAFE) >> 14;
                            int var10 = var6 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + (var10 / 8);
                            for (int var12 = 0; var12 < class197.field2972.length; var12++) {
                                if (class197.field2972[var12] == var11 && arg2[var12] != null) {
                                    arg0.method2285(class341.field4807, var7, (var10 & 0x7) * 8, arg2[var12], var4 * 8, class456.field6226, var5 * 8, (var9 & 0x7) * 8, (byte) -124, var8, var3);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(I)V", line = 113)
    public static void method687(int arg0) {
        field1091 = null;
        field1094 = null;
        int var1 = -126 / ((arg0 - 45) / 40);
        field1093 = null;
    }
}
