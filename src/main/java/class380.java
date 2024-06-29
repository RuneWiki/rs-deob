import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class380 extends class15 {

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field5368;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "[I")
    public static int[] field5361 = new int[4];

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "Leh;")
    public static class246 field5362 = new class246(79, 19);

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "Ljava/lang/String;")
    public static String field5366 = null;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "[I")
    public static int[] field5367 = new int[1];

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int field5369 = -1;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public static int field5370 = 0;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(FI)F")
    public static final float method2209(float arg0, int arg1) {
        int var2 = 14 % ((-arg1 - 41) / 40);
        field5364++;
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V")
    public final void method2210(int arg0) {
        if (arg0 == 19) {
            this.field5368.method2620();
            field5363++;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method2211(byte arg0) {
        field5367 = null;
        if (arg0 >= -39) {
            method2211((byte) 34);
        }
        field5366 = null;
        field5362 = null;
        field5361 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIFIII[F)V")
    public static final void method2212(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, float[] arg9) {
        field5365++;
        int var10 = arg0 - arg1;
        int var11 = arg6 - arg3;
        int var12 = arg2 - arg7;
        float var13 = arg9[2] * (float) var12 + arg9[1] * (float) var10 + arg9[0] * (float) var11;
        float var14 = arg9[5] * (float) var12 + arg9[3] * (float) var11 + arg9[4] * (float) var10;
        float var15 = arg9[8] * (float) var12 + arg9[7] * (float) var10 + arg9[6] * (float) var11;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = arg5 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (arg4 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg4 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg4 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class209.field3047 = var18;
        if (arg8 >= -84) {
            method2212(-23, 9, 101, -40, -102, 1.5730498F, -106, -103, -66, null);
        }
        class104.field1369 = var17;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(I)V")
    public class380(int arg0) {
        this.field5368 = new NativeHeap(arg0);
    }
}
