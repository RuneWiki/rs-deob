import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class175 extends class164 {

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "Lmm;")
    private class357 field2494;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "I")
    private int field2492;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "I")
    private int field2499;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
    private int field2498;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    private int field2496;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
    private int field2493;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
    private int field2500;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "[I")
    private static int[] field2495 = new int[6];

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "[[I")
    private static int[][] field2497 = new int[6][];

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "Lfq;")
    private class180 field2491;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)Lfq;")
    public final class180 method755(int arg0) {
        if (this.field2491 == null) {
            field2495[2] = this.field2499;
            class202 var2 = this.field2494.field4797;
            field2495[0] = this.field2498;
            field2495[1] = this.field2496;
            field2495[3] = this.field2493;
            field2495[5] = this.field2500;
            field2495[4] = this.field2492;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1360((byte) -106, field2495[var5])) {
                    return null;
                }
                class55 var6 = var2.method1366(field2495[var5], -11039);
                int var7 = var6.field708 ? 64 : 128;
                if (var6.field705 > 0) {
                    var3 = 1;
                }
                if (var4 < var7) {
                    var4 = var7;
                }
            }
            for (int var8 = 0; var8 < 6; var8++) {
                field2497[var8] = var2.method1367(var4, var4, field2495[var8], false, 1.0F, class267.method1701(arg0, 25311));
            }
            this.field2491 = new class180(this.field2494, 6407, var4, var3 != 0, field2497);
        }
        if (arg0 != -17479) {
            this.field2496 = -99;
        }
        return this.field2491;
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lmm;IIIIII)V")
    public class175(class357 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2494 = arg0;
        this.field2492 = arg5;
        this.field2499 = arg3;
        this.field2498 = arg1;
        this.field2496 = arg2;
        this.field2493 = arg4;
        this.field2500 = arg6;
    }
}
