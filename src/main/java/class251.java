import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class251 {

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public int field3141;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "Lwg;")
    public static class58 field3138 = new class58(10);

    @OriginalMember(owner = "client!js", name = "e", descriptor = "F")
    public static float field3142;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "Lkr;")
    public static class329 field3143;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V")
    public static void method1530(byte arg0) {
        field3138 = null;
        field3143 = null;
        if (arg0 != 11) {
            field3142 = -0.8827019F;
        }
    }

    @OriginalMember(owner = "client!js", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3139++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(II)V")
    public class251(int arg0, int arg1) {
        this.field3141 = arg0;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([BI[III[[B[[B[I)I")
    public static final int method1531(byte[] arg0, int arg1, int[] arg2, int arg3, int arg4, byte[][] arg5, byte[][] arg6, int[] arg7) {
        field3140++;
        int var8 = arg7[arg3];
        int var9 = arg2[arg3] + var8;
        int var10 = arg7[arg1];
        int var11 = arg2[arg1] + var10;
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg4 & arg0[arg3];
        if (var14 > (arg0[arg1] & 0xFF)) {
            var14 = arg0[arg1] & 0xFF;
        }
        byte[] var15 = arg6[arg3];
        byte[] var16 = arg5[arg1];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var15[var17++] + var16[var18++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }
}
