import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class410 {

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "[I")
    public static int[] field5934 = new int[32];

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Lfi;")
    public static class331 field5935;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLjf;Len;)V")
    public static final void method2575(byte arg0, class119 arg1, class174 arg2) {
        field5932++;
        class228.method1469(0, arg2, (byte) -123, 0, arg1);
        int var3 = 98 / ((arg0 - 7) / 44);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)V")
    public static final void method2576(int arg0, int arg1, int arg2, int arg3) {
        if (class41.field481 != null) {
            class41.field481[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static void method2577(int arg0) {
        field5935 = null;
        field5934 = null;
        int var1 = -75 % ((arg0 + 12) / 37);
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field5934[var1] = var0 - 1;
            var0 += var0;
        }
        field5935 = new class331(8);
        field5936 = -1;
    }
}
