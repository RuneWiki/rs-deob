import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class418 {

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "Z")
    public boolean field5880 = false;

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "I")
    public int field5887 = 43594;

    @OriginalMember(owner = "client!ht", name = "l", descriptor = "I")
    public int field5889 = 443;

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "[Lmh;")
    public static class454[] field5884 = new class454[14];

    @OriginalMember(owner = "client!ht", name = "m", descriptor = "Lmt;")
    public static class276 field5890 = new class276(7, 0, 1, 1);

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "F")
    public static float field5888;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "I")
    public int field5885;

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "Ljava/lang/String;")
    public String field5883;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "[[[Lrb;")
    public static class239[][][] field5879;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V", line = 5)
    public static void method2474(int arg0) {
        int var1 = -58 % ((-arg0 - 75) / 48);
        field5884 = null;
        field5879 = null;
        field5890 = null;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(FIIF[FIIIIII)V", line = 27)
    public static final void method2475(float arg0, int arg1, int arg2, float arg3, float[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field5881++;
        int var11 = arg8 - arg9;
        int var12 = arg2 - arg6;
        int var13 = arg10 - arg7;
        float var14 = arg4[2] * (float) var12 + arg4[0] * (float) var13 + arg4[1] * (float) var11;
        float var15 = arg4[5] * (float) var12 + arg4[4] * (float) var11 + arg4[3] * (float) var13;
        float var16 = arg4[8] * (float) var12 + arg4[arg5] * (float) var11 + arg4[6] * (float) var13;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg0 != 1.0F) {
            var17 = arg0 * var17;
        }
        float var18 = var15 + arg3 + 0.5F;
        if (arg1 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg1 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg1 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class389.field5472 = var18;
        class441.field6173 = var17;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lht;I)Z", line = 79)
    public final boolean method2476(class418 arg0, int arg1) {
        int var3 = -96 / ((arg1 - 91) / 35);
        field5886++;
        if (arg0 == null) {
            return false;
        } else {
            return this.field5885 == arg0.field5885 && this.field5883.equals(arg0.field5883);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lih;IIIZZI[B)Lwh;", line = 94)
    public static final class102 method2477(class503 arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6, byte[] arg7) {
        if (arg4) {
            method2477(null, 80, 33, 14, false, false, 123, null);
        }
        field5882++;
        if (!arg0.field7436 && (!class51.method407(arg1, 1024) || !class51.method407(arg3, 1024))) {
            return arg0.field7428 ? new class102(arg0, 34037, arg6, arg1, arg3, arg5, arg7, arg2) : new class102(arg0, arg6, arg1, arg3, class280.method1749(-31679, arg1), class280.method1749(-31679, arg3), arg7, arg2);
        } else {
            return new class102(arg0, 3553, arg6, arg1, arg3, arg5, arg7, arg2);
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)I", line = 113)
    public final int method2478(int arg0) {
        if (arg0 <= 5) {
            this.method2478(127);
        }
        field5878++;
        return this.field5880 ? this.field5889 : this.field5887;
    }
}
