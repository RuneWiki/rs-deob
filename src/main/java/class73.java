import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class73 {

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public int field1257;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "[I")
    public int[] field1254;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "[I")
    public int[] field1252;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "[I")
    public static int[] field1259 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "[[S")
    public static short[][] field1253;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
    public static void method518(int arg0) {
        field1259 = null;
        field1253 = null;
        if (arg0 != 0) {
            method519(102, 6, 124, 0.27638185F, -122, null, -127, 112, 105, (byte) 82, 1.4379025F);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIFI[FIIIBF)V")
    public static final void method519(int arg0, int arg1, int arg2, float arg3, int arg4, float[] arg5, int arg6, int arg7, int arg8, byte arg9, float arg10) {
        int var11 = arg0 - arg4;
        int var12 = arg7 - arg2;
        int var13 = arg6 - arg1;
        field1256++;
        float var14 = arg5[2] * (float) var12 + arg5[0] * (float) var13 + arg5[1] * (float) var11;
        float var15 = arg5[5] * (float) var12 + arg5[4] * (float) var11 + arg5[3] * (float) var13;
        float var16 = arg5[8] * (float) var12 + arg5[7] * (float) var11 + arg5[6] * (float) var13;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg3 != 1.0F) {
            var17 = arg3 * var17;
        }
        if (arg9 <= 58) {
            method518(25);
        }
        float var18 = var15 + arg10 + 0.5F;
        if (arg8 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg8 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg8 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class30.field481 = var17;
        class93.field1558 = var18;
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)V")
    public static final void method520(int arg0) {
        field1255++;
        if (class32.field515 == 8) {
            class75.method540(-7, 4);
        } else if (class32.field515 == 4 || class32.field515 == 5) {
            class75.method540(arg0 ^ 0xFFFFFFFD, 2);
        } else if (class32.field515 == 11) {
            class75.method540(-7, 2);
        }
        if (arg0 != 4) {
            field1253 = null;
        }
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(I)V")
    public class73(int arg0) {
        this.field1257 = arg0;
        this.field1254 = new int[this.field1257];
        this.field1252 = new int[this.field1257];
    }
}
