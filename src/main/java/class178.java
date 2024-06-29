import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class178 extends class171 {

    @OriginalMember(owner = "client!as", name = "q", descriptor = "I")
    private int field2626;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    private int field2619;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "Lhd;")
    private class17 field2623;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "I")
    private int field2625;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    private int field2622;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "I")
    private int field2618;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    private int field2617;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "[[I")
    private static int[][] field2620 = new int[6][];

    @OriginalMember(owner = "client!as", name = "l", descriptor = "[I")
    private static int[] field2621 = new int[6];

    @OriginalMember(owner = "client!as", name = "o", descriptor = "Lm;")
    private class181 field2624;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)Lm;", line = 7)
    public final class181 method1280(boolean arg0) {
        if (this.field2624 == null) {
            class112 var2 = this.field2623.field201;
            field2621[2] = this.field2625;
            field2621[4] = this.field2622;
            field2621[3] = this.field2619;
            field2621[0] = this.field2618;
            field2621[1] = this.field2626;
            field2621[5] = this.field2617;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method918(field2621[var5], -567)) {
                    return null;
                }
                class122 var6 = var2.method917((byte) 118, field2621[var5]);
                int var7 = var6.field1703 ? 64 : 128;
                if (var7 > var4) {
                    var4 = var7;
                }
                if (var6.field1706 > 0) {
                    var3 = 1;
                }
            }
            for (int var8 = 0; var8 < 6; var8++) {
                field2620[var8] = var2.method919(-106, var4, var4, field2621[var8], false, 1.0F);
            }
            this.field2624 = new class181(this.field2623, 6407, var4, var3 != 0, field2620);
        }
        return arg0 ? this.field2624 : (class181) null;
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lhd;IIIIII)V", line = 76)
    public class178(class17 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2626 = arg2;
        this.field2619 = arg4;
        this.field2623 = arg0;
        this.field2625 = arg3;
        this.field2622 = arg5;
        this.field2618 = arg1;
        this.field2617 = arg6;
    }
}
