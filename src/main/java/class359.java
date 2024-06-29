import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class359 extends class408 {

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "Lh;")
    private class327 field4879;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    private int field4872;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    private int field4878;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    private int field4870;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    private int field4875;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    private int field4871;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    private int field4876;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "[[I")
    private static int[][] field4874 = new int[6][];

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "[I")
    private static int[] field4873 = new int[6];

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "Lhp;")
    private class254 field4877;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)Lhp;")
    public final class254 method1137(int arg0) {
        int var2 = -36 / ((arg0 + 81) / 40);
        if (this.field4877 == null) {
            field4873[3] = this.field4876;
            field4873[4] = this.field4872;
            field4873[2] = this.field4870;
            field4873[0] = this.field4878;
            field4873[1] = this.field4871;
            class172 var3 = this.field4879.field4355;
            field4873[5] = this.field4875;
            byte var4 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < 6; var6++) {
                if (!var3.method963(field4873[var6], true)) {
                    return null;
                }
                class358 var7 = var3.method960(field4873[var6], (byte) -40);
                int var8 = var7.field4856 ? 64 : 128;
                if (var8 > var5) {
                    var5 = var8;
                }
                if (var7.field4865 > 0) {
                    var4 = 1;
                }
            }
            for (int var9 = 0; var9 < 6; var9++) {
                field4874[var9] = var3.method965(-94, var5, field4873[var9], 1.0F, var5, false);
            }
            this.field4877 = new class254(this.field4879, 6407, var5, var4 != 0, field4874);
        }
        return this.field4877;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lh;IIIIII)V")
    public class359(class327 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4879 = arg0;
        this.field4872 = arg5;
        this.field4878 = arg1;
        this.field4870 = arg3;
        this.field4875 = arg6;
        this.field4871 = arg2;
        this.field4876 = arg4;
    }
}
