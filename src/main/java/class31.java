import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class31 extends class129 {

    @OriginalMember(owner = "client!w", name = "x", descriptor = "[Lbd;")
    public static class162[] field516 = new class162[500];

    @OriginalMember(owner = "client!w", name = "B", descriptor = "I")
    public static int field520 = 0;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Lli;")
    public static class18 field512 = new class18();

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    public static int field522 = 0;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "[I")
    public static int[] field515;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "[I")
    public static int[] field518;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "[[[I")
    public static int[][][] field517;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V", line = 11)
    public static void method254(int arg0) {
        field512 = null;
        field518 = null;
        field516 = null;
        field517 = (int[][][]) null;
        field515 = null;
        if (arg0 != 200000) {
            field517 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Llm;)V", line = 34)
    public static final void method255(class43 arg0) {
        for (int var1 = arg0.field711; var1 <= arg0.field707; var1++) {
            for (int var2 = arg0.field699; var2 <= arg0.field701; var2++) {
                class225 var3 = class288.field4856[arg0.field705][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3756; var4++) {
                        if (var3.field3765[var4] == arg0) {
                            var3.field3756--;
                            for (int var5 = var4; var5 < var3.field3756; var5++) {
                                var3.field3765[var5] = var3.field3765[var5 + 1];
                                var3.field3768[var5] = var3.field3768[var5 + 1];
                            }
                            var3.field3765[var3.field3756] = null;
                            break;
                        }
                    }
                    var3.field3769 = 0;
                    for (int var6 = 0; var6 < var3.field3756; var6++) {
                        var3.field3769 |= var3.field3768[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BI)Laf;", line = 93)
    public static final class223 method256(byte arg0, int arg1) {
        int var2 = -23 / ((arg0 + 32) / 37);
        field514++;
        return class245.field4081 && class40.field657 <= arg1 && class114.field2040 >= arg1 ? class220.field3661[arg1 - class40.field657] : null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILoj;)V", line = 106)
    public static final void method257(int arg0, class180 arg1) {
        class242.method1717(200000, (byte) -17, arg1);
        if (arg0 == -32581) {
            field513++;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLjm;Ljm;)V", line = 129)
    public static final void method258(byte arg0, class151 arg1, class151 arg2) {
        if (arg1.field2691 != null) {
            arg1.method1183(false);
        }
        arg1.field2707 = arg2;
        field519++;
        arg1.field2691 = arg2.field2691;
        if (arg0 == 54) {
            arg1.field2691.field2707 = arg1;
            arg1.field2707.field2691 = arg1;
        }
    }
}
