import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class738 extends class556 {

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field10184;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field10185;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field10186;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field10187;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public int field10189;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public int field10190;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    public int field10191;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public int field10192;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public static int field10193;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public static int field10194;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "J")
    public long field10188;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)I")
    public final int method2734(boolean arg0) {
        if (arg0) {
            this.method2733(-67);
        }
        field10186++;
        return this.field10192;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)I")
    public final int method2731(int arg0) {
        if (arg0 != 125) {
            this.method2733(-99);
        }
        field10187++;
        return this.field10190;
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)I")
    public final int method2732(int arg0) {
        if (arg0 >= -72) {
            this.field10191 = 43;
        }
        field10185++;
        return this.field10189;
    }

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)I")
    public final int method2733(int arg0) {
        field10184++;
        return arg0 == 0 ? this.field10191 : 84;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[I[[BBI[I[[B[B)I")
    public static final int method4092(int arg0, int[] arg1, byte[][] arg2, byte arg3, int arg4, int[] arg5, byte[][] arg6, byte[] arg7) {
        field10193++;
        int var8 = arg1[arg0];
        int var9 = arg5[arg0] + var8;
        int var10 = arg1[arg4];
        int var11 = arg5[arg4] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg7[arg0] & 0xFF;
        if (var14 > (arg7[arg4] & 0xFF)) {
            var14 = arg7[arg4] & 0xFF;
        }
        byte[] var15 = arg2[arg0];
        byte[] var16 = arg6[arg4];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        if (arg3 != 106) {
            return -106;
        }
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var15[var17++] + var16[var18++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)J")
    public final long method2735(int arg0) {
        field10194++;
        return arg0 == -2 ? this.field10188 : -78L;
    }
}
