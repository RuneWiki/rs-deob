import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class457 extends class204 {

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "I")
    private int field5990;

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
    private int field5993;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "Lji;")
    private class622 field5984;

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
    private int field5995;

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "I")
    private int field5989;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "I")
    private int field5992;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
    private int field5985;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "[I")
    public static int[] field5991 = new int[2];

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "I")
    public static int field5994 = 0;

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "Lca;")
    public static class119 field5988 = new class119();

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "Lgfa;")
    private class660 field5987;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)Lgfa;", line = 8)
    public final class660 method928(int arg0) {
        int var2 = -49 / ((arg0 - 68) / 44);
        field5986++;
        if (this.field5987 == null) {
            class97.field1299[2] = this.field5995;
            class97.field1299[3] = this.field5985;
            class702 var3 = this.field5984.field598;
            class97.field1299[1] = this.field5993;
            class97.field1299[5] = this.field5989;
            class97.field1299[4] = this.field5990;
            class97.field1299[0] = this.field5992;
            byte var4 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < 6; var6++) {
                if (!var3.method3164((byte) -31, class97.field1299[var6])) {
                    return null;
                }
                class59 var8 = var3.method3162((byte) -104, class97.field1299[var6]);
                int var9 = var8.field794 ? 64 : 128;
                if (var8.field801 > 0) {
                    var4 = 1;
                }
                if (var5 < var9) {
                    var5 = var9;
                }
            }
            for (int var7 = 0; var7 < 6; var7++) {
                class427.field5535[var7] = var3.method3158(var5, false, 1.0F, var5, class97.field1299[var7], (byte) -56);
            }
            this.field5987 = new class660(this.field5984, 6407, var5, var4 != 0, class427.field5535);
        }
        return this.field5987;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V", line = 82)
    public static void method2573(boolean arg0) {
        if (arg0) {
            field5991 = null;
            field5988 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lji;IIIIII)V", line = 96)
    public class457(class622 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5990 = arg5;
        this.field5993 = arg2;
        this.field5984 = arg0;
        this.field5995 = arg3;
        this.field5989 = arg6;
        this.field5992 = arg1;
        this.field5985 = arg4;
    }
}
