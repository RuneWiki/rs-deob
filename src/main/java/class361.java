import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class361 {

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "Lnv;")
    public static class44 field5319 = new class44();

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "Ljp;")
    public static class55 field5322 = new class55(110, 3);

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "Lo;")
    public static class363 field5323;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(III[FIFIIIFI)V", line = 4)
    public static final void method2289(int arg0, int arg1, int arg2, float[] arg3, int arg4, float arg5, int arg6, int arg7, int arg8, float arg9, int arg10) {
        int var11 = arg4 - arg8;
        field5320++;
        int var12 = arg7 - arg0;
        int var13 = arg10 - arg2;
        float var14 = arg3[2] * (float) var11 + arg3[0] * (float) var13 + arg3[1] * (float) var12;
        float var15 = arg3[5] * (float) var11 + arg3[4] * (float) var12 + arg3[3] * (float) var13;
        float var16 = arg3[8] * (float) var11 + arg3[6] * (float) var13 + arg3[7] * (float) var12;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg5 != 1.0F) {
            var17 = arg5 * var17;
        }
        float var18 = var15 + arg9 + 0.5F;
        if (arg6 != -10825) {
            method2292(-40, 115, 83, (byte) -67, 106);
        }
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
        class6.field78 = var18;
        class313.field4768 = var17;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V", line = 62)
    public static final void method2290(int arg0) {
        if (class376.field5542.method568()) {
            class376.field5542.method536(class342.field5114);
            class208.method1448(-82);
            class376.field5542.method539(class342.field5114);
            class376.field5542.method507(class342.field5114);
        } else {
            class155.method1127(class108.field1631, -60);
        }
        field5318++;
        class80.method713(-14703);
        if (arg0 != -18613) {
            method2292(71, 66, -83, (byte) 79, 56);
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V", line = 83)
    public static void method2291(int arg0) {
        field5319 = null;
        if (arg0 < 14) {
            method2291(13);
        }
        field5323 = null;
        field5322 = null;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIBI)V", line = 102)
    public static final void method2292(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class40.field667.field4199 != 0 && arg0 != 0 && class510.field7414 < 50 && arg2 != -1) {
            class258.field4135[class510.field7414++] = new class128((byte) 1, arg2, arg0, arg1, arg4, 0);
        }
        if (arg3 < 103) {
            field5322 = null;
        }
        field5321++;
    }
}
