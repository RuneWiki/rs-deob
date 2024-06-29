import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class36 extends class294 {

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    private int field583;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    private int field580;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    private int field582;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "Lih;")
    private class330 field586;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    private int field589;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    private int field584;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    private int field585;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "[I")
    private static int[] field587 = new int[6];

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "[[I")
    private static int[][] field588 = new int[6][];

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "Lsg;")
    private class266 field581;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Lsg;")
    public final class266 method292(int arg0) {
        if (this.field581 == null) {
            class386 var2 = this.field586.field4740;
            field587[0] = this.field589;
            field587[3] = this.field585;
            field587[5] = this.field584;
            field587[1] = this.field580;
            field587[4] = this.field582;
            field587[2] = this.field583;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1756(false, field587[var5])) {
                    return null;
                }
                class175 var6 = var2.method1760(-19907, field587[var5]);
                int var7 = var6.field2281 ? 64 : 128;
                if (var4 < var7) {
                    var4 = var7;
                }
                if (var6.field2278 > 0) {
                    var3 = 1;
                }
            }
            for (int var8 = 0; var8 < 6; var8++) {
                field588[var8] = var2.method1757(1.0F, var4, field587[var8], var4, false, false);
            }
            this.field581 = new class266(this.field586, 6407, var4, var3 != 0, field588);
        }
        if (arg0 != -1457) {
            this.method292(-22);
        }
        return this.field581;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lih;IIIIII)V")
    public class36(class330 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field583 = arg3;
        this.field580 = arg2;
        this.field582 = arg5;
        this.field586 = arg0;
        this.field589 = arg1;
        this.field584 = arg6;
        this.field585 = arg4;
    }
}
