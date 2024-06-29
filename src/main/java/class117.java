import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class117 extends class280 {

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    private int field1582;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    private int field1580;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "Lks;")
    private class173 field1579;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    private int field1581;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    private int field1586;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    private int field1584;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    private int field1583;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "[I")
    private static int[] field1585 = new int[6];

    @OriginalMember(owner = "client!te", name = "q", descriptor = "[[I")
    private static int[][] field1587 = new int[6][];

    @OriginalMember(owner = "client!te", name = "h", descriptor = "Lea;")
    private class61 field1578;

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lks;IIIIII)V")
    public class117(class173 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1582 = arg1;
        this.field1580 = arg3;
        this.field1579 = arg0;
        this.field1581 = arg6;
        this.field1586 = arg5;
        this.field1584 = arg4;
        this.field1583 = arg2;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)Lea;")
    public final class61 method344(int arg0) {
        if (arg0 != 15733) {
            this.field1584 = -81;
        }
        if (this.field1578 == null) {
            field1585[0] = this.field1582;
            class235 var2 = this.field1579.field2260;
            field1585[3] = this.field1584;
            field1585[4] = this.field1586;
            field1585[5] = this.field1581;
            field1585[2] = this.field1580;
            field1585[1] = this.field1583;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method463(field1585[var5], -26564)) {
                    return null;
                }
                class17 var6 = var2.method468((byte) -37, field1585[var5]);
                int var7 = var6.field271 ? 64 : 128;
                if (var6.field277 > 0) {
                    var3 = true;
                }
                if (var7 > var4) {
                    var4 = var7;
                }
            }
            for (int var8 = 0; var8 < 6; var8++) {
                field1587[var8] = var2.method464(var4, false, var4, field1585[var8], 4260, 1.0F);
            }
            this.field1578 = new class61(this.field1579, 6407, var4, var3, field1587);
        }
        return this.field1578;
    }
}
