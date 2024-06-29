import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class229 extends class43 {

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    private int field3011;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    private int field3012;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    private int field3009;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    private int field3006;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "Lbf;")
    private class344 field3015;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    private int field3007;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    private int field3013;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "[[I")
    private static int[][] field3010 = new int[6][];

    @OriginalMember(owner = "client!he", name = "q", descriptor = "[I")
    private static int[] field3014 = new int[6];

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Lqd;")
    private class286 field3008;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)Lqd;", line = 11)
    public final class286 method36(int arg0) {
        if (this.field3008 == null) {
            field3014[0] = this.field3007;
            field3014[4] = this.field3009;
            field3014[2] = this.field3013;
            field3014[1] = this.field3006;
            class287 var2 = this.field3015.field4988;
            field3014[3] = this.field3011;
            field3014[5] = this.field3012;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1620(-3810, field3014[var5])) {
                    return null;
                }
                class23 var6 = var2.method1621(arg0 ^ 0x2665, field3014[var5]);
                int var7 = var6.field309 ? 64 : 128;
                if (var4 < var7) {
                    var4 = var7;
                }
                if (var6.field293 > 0) {
                    var3 = true;
                }
            }
            for (int var8 = 0; var8 < 6; var8++) {
                field3010[var8] = var2.method1622(field3014[var8], false, -124, var4, 1.0F, var4);
            }
            this.field3008 = new class286(this.field3015, 6407, var4, var3, field3010);
        }
        if (arg0 != 25067) {
            this.method36(121);
        }
        return this.field3008;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lbf;IIIIII)V", line = 79)
    public class229(class344 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3011 = arg4;
        this.field3012 = arg6;
        this.field3009 = arg5;
        this.field3006 = arg2;
        this.field3015 = arg0;
        this.field3007 = arg1;
        this.field3013 = arg3;
    }
}
