import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class486 {

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "Lre;")
    public static class515 field6795 = new class515("runescape", 0);

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "Lui;")
    public static class193 field6798 = new class193();

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(FIFIIIZ[FIII)V", line = 3)
    public static final void method2822(float arg0, int arg1, float arg2, int arg3, int arg4, int arg5, boolean arg6, float[] arg7, int arg8, int arg9, int arg10) {
        int var11 = arg5 - arg10;
        int var12 = arg1 - arg9;
        int var13 = arg3 - arg4;
        field6799++;
        float var14 = arg7[2] * (float) var11 + arg7[0] * (float) var13 + arg7[1] * (float) var12;
        float var15 = arg7[5] * (float) var11 + arg7[4] * (float) var12 + arg7[3] * (float) var13;
        float var16 = arg7[8] * (float) var11 + arg7[6] * (float) var13 + arg7[7] * (float) var12;
        if (arg6) {
            method2822(0.08275633F, 59, -1.3879778F, 79, 97, -36, false, null, 121, -119, 93);
        }
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg0 != 1.0F) {
            var17 = arg0 * var17;
        }
        float var18 = var15 + arg2 + 0.5F;
        if (arg8 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg8 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg8 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class403.field5289 = var18;
        class613.field8885 = var17;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILpq;)[Lsn;", line = 58)
    public static final class536[] method2823(int arg0, class165 arg1) {
        field6796++;
        if (!arg1.method905(683)) {
            return new class536[0];
        }
        class506 var2 = arg1.method908((byte) -81);
        while (var2.field7031 == 0) {
            class462.method2688(10L, (byte) 110);
        }
        if (var2.field7031 == 2) {
            return new class536[0];
        }
        int[] var3 = (int[]) var2.field7030;
        class536[] var4 = new class536[var3.length >> 2];
        for (int var5 = arg0; var5 < var4.length; var5++) {
            class536 var6 = new class536();
            var4[var5] = var6;
            var6.field7519 = var3[var5 << 2];
            var6.field7514 = var3[(var5 << 2) + 1];
            var6.field7522 = var3[(var5 << 2) + 2];
            var6.field7515 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V", line = 106)
    public static void method2824(int arg0) {
        field6798 = null;
        if (arg0 < 9) {
            method2822(-0.6526073F, -5, -0.44603646F, -41, -121, -22, true, null, 12, 62, 35);
        }
        field6795 = null;
    }
}
