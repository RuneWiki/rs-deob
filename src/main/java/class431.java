import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class431 {

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public int field6226 = 128;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public int field6225 = 128;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public int field6235;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public int field6232;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public int field6222;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public int field6231;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public int field6224;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public int field6227;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public int field6228;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public int field6234;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public int field6236;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZZIII)I")
    public static final int method2622(boolean arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field6221++;
        class430 var5 = class605.method3470((byte) -122, arg0, arg2);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        if (arg3 != -13867) {
            return -90;
        }
        for (int var7 = 0; var7 < var5.field6215.length; var7++) {
            if (var5.field6215[var7] >= 0 && var5.field6215[var7] < class268.field3985.field496) {
                class110 var8 = class268.field3985.method258(var5.field6215[var7], (byte) -67);
                int var9 = var8.method986(false, client.field4124.method980(-86, arg4).field6413, arg4);
                if (arg1) {
                    var6 += var5.field6218[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lqg;I)V")
    public final void method2623(class431 arg0, int arg1) {
        this.field6235 = arg0.field6235;
        field6233++;
        this.field6232 = arg0.field6232;
        this.field6226 = arg0.field6226;
        this.field6231 = arg0.field6231;
        if (arg1 < 20) {
            this.method2625(-74);
        }
        this.field6225 = arg0.field6225;
        this.field6222 = arg0.field6222;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IFIII[FIFIII)V")
    public static final void method2624(int arg0, float arg1, int arg2, int arg3, int arg4, float[] arg5, int arg6, float arg7, int arg8, int arg9, int arg10) {
        field6223++;
        int var11 = arg4 - arg0;
        int var12 = arg6 - arg3;
        int var13 = arg8 - arg2;
        float var14 = arg5[arg9] * (float) var11 + arg5[0] * (float) var12 + arg5[1] * (float) var13;
        float var15 = arg5[5] * (float) var11 + arg5[3] * (float) var12 + arg5[4] * (float) var13;
        float var16 = arg5[8] * (float) var11 + arg5[6] * (float) var12 + arg5[7] * (float) var13;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var17 = arg7 * var17;
        }
        float var18 = var15 + arg1 + 0.5F;
        if (arg10 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg10 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg10 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class544.field7587 = var18;
        class608.field8860 = var17;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)Lqg;")
    public final class431 method2625(int arg0) {
        if (arg0 == 128) {
            field6229++;
            return new class431(this.field6235, this.field6225, this.field6226, this.field6232, this.field6222, this.field6231);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(I)V")
    public class431(int arg0) {
        this.field6235 = arg0;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(IIIIII)V")
    private class431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6225 = arg1;
        this.field6226 = arg2;
        this.field6235 = arg0;
        this.field6232 = arg3;
        this.field6222 = arg4;
        this.field6231 = arg5;
    }
}
