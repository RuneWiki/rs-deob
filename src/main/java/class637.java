import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class637 extends class412 {

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    private int field8970;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    private int field8968;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "Lvj;")
    private class422 field8973;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    private int field8969;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    private int field8963;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    private int field8965;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    private int field8961;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "Z")
    public static boolean field8960 = false;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "[I")
    public static int[] field8966 = new int[2];

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
    public static int field8972;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "Lfca;")
    private class140 field8962;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "Lcv;")
    public static class632 field8964;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "Ltf;")
    public static class701 field8971;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)I")
    public static final int method3579(int arg0, int arg1) {
        int var2 = -27 % ((arg1 + 63) / 33);
        field8967++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)Lfca;")
    public final class140 method1501(int arg0) {
        field8972++;
        if (arg0 != 4) {
            this.field8961 = 87;
        }
        if (this.field8962 == null) {
            class624.field8832[1] = this.field8968;
            class624.field8832[4] = this.field8969;
            class524 var2 = this.field8973.field8050;
            class624.field8832[5] = this.field8965;
            class624.field8832[2] = this.field8970;
            class624.field8832[3] = this.field8961;
            class624.field8832[0] = this.field8963;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method144(8649, class624.field8832[var5])) {
                    return null;
                }
                class295 var7 = var2.method140(class624.field8832[var5], 862);
                int var8 = var7.field3668 ? 64 : 128;
                if (var7.field3675 > 0) {
                    var3 = true;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class206.field2455[var6] = var2.method145(var4, false, 1.0F, -18551, var4, class624.field8832[var6]);
            }
            this.field8962 = new class140(this.field8973, 6407, var4, var3, class206.field2455);
        }
        return this.field8962;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    public static void method3580(int arg0) {
        field8964 = null;
        if (arg0 == 255) {
            field8971 = null;
            field8966 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lvj;IIIIII)V")
    public class637(class422 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field8970 = arg3;
        this.field8968 = arg2;
        this.field8973 = arg0;
        this.field8969 = arg5;
        this.field8963 = arg1;
        this.field8965 = arg6;
        this.field8961 = arg4;
    }
}
