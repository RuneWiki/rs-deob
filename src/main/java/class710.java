import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class710 extends class27 {

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "[I")
    private int[] field9962 = new int[512];

    @OriginalMember(owner = "client!ufa", name = "h", descriptor = "Ltja;")
    public static class288 field9963 = new class288(8);

    @OriginalMember(owner = "client!ufa", name = "i", descriptor = "[I")
    public static int[] field9964 = new int[8];

    @OriginalMember(owner = "client!ufa", name = "k", descriptor = "I")
    public static int field9966 = 0;

    @OriginalMember(owner = "client!ufa", name = "l", descriptor = "Ljava/lang/String;")
    public static String field9967 = "";

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "I")
    public static int field9961;

    @OriginalMember(owner = "client!ufa", name = "j", descriptor = "I")
    public static int field9965;

    @OriginalMember(owner = "client!ufa", name = "m", descriptor = "I")
    public static int field9968;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IZIFIIFF[FIF)V", line = 7)
    public final void method264(int arg0, boolean arg1, int arg2, float arg3, int arg4, int arg5, float arg6, float arg7, float[] arg8, int arg9, float arg10) {
        field9965++;
        int var12 = (int) ((float) arg4 * arg7 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg0 * arg10 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg2 * arg6 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg9 * arg6;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        float var23 = class617.method3495(var21, 6);
        int var24 = var20 & var17;
        if (!arg1) {
            return;
        }
        int var25 = var19 & var17;
        int var26 = this.field9962[var25];
        int var27 = this.field9962[var24];
        for (int var28 = 0; var28 < arg0; var28++) {
            float var29 = (float) var28 * arg10;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var31 & var15;
            float var35 = class617.method3495(var32, 6);
            int var36 = var30 & var15;
            int var37 = this.field9962[var36 + var26];
            int var38 = this.field9962[var34 + var26];
            int var39 = this.field9962[var27 + var36];
            int var40 = this.field9962[var27 + var34];
            for (int var41 = 0; var41 < arg4; var41++) {
                float var42 = (float) var41 * arg7;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                float var48 = class617.method3495(var45, 6);
                int var49 = var44 & var13;
                arg8[arg5++] = class529.method3160(class529.method3160(class529.method3160(class372.method2173(var22, 1, var33, var46, class296.method1733(this.field9962[var47 + var37], 7)), var48, class372.method2173(var22, 1, var33, var45, class296.method1733(this.field9962[var37 + var49], 7)), (byte) 102), var35, class529.method3160(class372.method2173(var22, 1, var32, var46, class296.method1733(this.field9962[var47 + var38], 7)), var48, class372.method2173(var22, 1, var32, var45, class296.method1733(this.field9962[var38 + var49], 7)), (byte) 124), (byte) 108), var23, class529.method3160(class529.method3160(class372.method2173(var21, 1, var33, var46, class296.method1733(this.field9962[var39 + var47], 7)), var48, class372.method2173(var21, 1, var33, var45, class296.method1733(7, this.field9962[var39 + var49])), (byte) 106), var35, class529.method3160(class372.method2173(var21, 1, var32, var46, class296.method1733(7, this.field9962[var40 + var47])), var48, class372.method2173(var21, 1, var32, var45, class296.method1733(7, this.field9962[var40 + var49])), (byte) 87), (byte) 124), (byte) 96) * arg3;
            }
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Les;II)V", line = 97)
    public static final void method4024(class403 arg0, int arg1, int arg2) {
        if (class765.field10540 != null) {
            try {
                class765.field10540.method2759(54, 0L);
                class765.field10540.method2769(arg1, 85, 24, arg0.field5275);
            } catch (Exception var4) {
            }
        }
        field9961++;
        int var3 = -110 % ((arg2 + 72) / 50);
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(I)V", line = 164)
    public class710(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field9962[var3] = this.field9962[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field9962[var5];
            this.field9962[var5] = this.field9962[var5 + 256] = this.field9962[var4];
            this.field9962[var4] = this.field9962[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "(I)V", line = 124)
    public static void method4025(int arg0) {
        field9964 = null;
        if (arg0 == -1) {
            field9963 = null;
            field9967 = null;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIIIILha;)V", line = 143)
    public static final void method4026(int arg0, int arg1, int arg2, int arg3, int arg4, class66 arg5) {
        field9968++;
        class434.field5738 = arg5;
        class415.field5434 = class434.field5738.method614();
        class677.field9286 = class434.field5738.method614();
        class594.field8080 = class434.field5738.method614();
        class340.field4250 = null;
        class727.field10184 = 0;
        class369.field4587 = arg4;
        class534.field7524 = null;
        class136.field1707 = arg0;
        class199.method1296(0, arg2, arg1);
        class769.field10561 = -1;
        class60.field800 = -1;
        class328.field4056 = arg3;
    }
}
