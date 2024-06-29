import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public class class595 {

    @OriginalMember(owner = "client!hia", name = "g", descriptor = "J")
    public long field7559;

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "Ljc;")
    private class179 field7554;

    @OriginalMember(owner = "client!hia", name = "e", descriptor = "Lrn;")
    public static class633 field7557 = new class633(74, 12);

    @OriginalMember(owner = "client!hia", name = "k", descriptor = "Lfca;")
    public static class661 field7563 = new class661();

    @OriginalMember(owner = "client!hia", name = "l", descriptor = "[I")
    public static int[] field7564 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!hia", name = "m", descriptor = "D")
    public static double field7565;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!hia", name = "c", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!hia", name = "d", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!hia", name = "f", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!hia", name = "h", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!hia", name = "i", descriptor = "Lal;")
    public static class131 field7561;

    @OriginalMember(owner = "client!hia", name = "j", descriptor = "Lda;")
    public static class420 field7562;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(I)V")
    public static void method3206(int arg0) {
        field7562 = null;
        field7557 = null;
        field7563 = null;
        field7564 = null;
        int var1 = 107 % ((-arg0 - 50) / 62);
        field7561 = null;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(B)Laca;")
    public static final class230 method3207(byte arg0) {
        field7553++;
        if (class534.field6741 < class21.field199.length) {
            return class21.field199[class534.field6741++];
        } else if (arg0 == -126) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(IIFII[FIIIF[FIFI)V")
    public static final void method3208(int arg0, int arg1, float arg2, int arg3, int arg4, float[] arg5, int arg6, int arg7, int arg8, float arg9, float[] arg10, int arg11, float arg12, int arg13) {
        field7556++;
        int var14 = arg13 - arg0;
        int var15 = arg7 - arg3;
        int var16 = arg4 - arg11;
        float var17 = arg5[2] * (float) var14 + arg5[0] * (float) var16 + arg5[1] * (float) var15;
        if (arg1 <= 116) {
            return;
        }
        float var18 = arg5[5] * (float) var14 + arg5[4] * (float) var15 + arg5[3] * (float) var16;
        float var19 = arg5[8] * (float) var14 + arg5[6] * (float) var16 + arg5[7] * (float) var15;
        float var20;
        float var21;
        if (arg6 == 0) {
            var20 = arg9 + 0.5F - var19;
            var21 = arg2 + var17 + 0.5F;
        } else if (arg6 == 1) {
            var20 = arg9 + var19 + 0.5F;
            var21 = arg2 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var20 = arg12 + 0.5F - var18;
            var21 = arg2 + 0.5F - var17;
        } else if (arg6 == 3) {
            var20 = arg12 + 0.5F - var18;
            var21 = arg2 + var17 + 0.5F;
        } else if (arg6 == 4) {
            var21 = arg9 + var19 + 0.5F;
            var20 = arg12 + 0.5F - var18;
        } else {
            var20 = arg12 + 0.5F - var18;
            var21 = arg9 + 0.5F - var19;
        }
        if (arg8 == 1) {
            float var22 = var21;
            var21 = -var20;
            var20 = var22;
        } else if (arg8 == 2) {
            var21 = -var21;
            var20 = -var20;
        } else if (arg8 == 3) {
            float var23 = var21;
            var21 = var20;
            var20 = -var23;
        }
        arg10[0] = var21;
        arg10[1] = var20;
    }

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "(I)V")
    public static final void method3209(int arg0) {
        class364.method2092(class485.field6252.field6930.method3991(false) == 1, 2, 22050, -8001);
        field7560++;
        class331.field4047 = class596.method3216(1, 22050, class678.field8763, 0, class740.field10014);
        class288.method1748(class176.method1122(null, (byte) 117), -80, true);
        class223.field3037 = class596.method3216(1, 2048, class678.field8763, 1, class740.field10014);
        int var1 = -71 / ((21 - arg0) / 41);
        class1.field10 = new class10();
        class223.field3037.method1029(class1.field10, 26707);
        class738.field9993 = new class632(22050, class791.field10837);
        class309.method1819(false);
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(IZ)V")
    public static final void method3210(int arg0, boolean arg1) {
        field7558++;
        class720 var2 = (class720) class479.field6198.method2616((long) arg0, (byte) 126);
        if (arg1 && var2 != null) {
            var2.field9464.method597(8);
            class405.method2360((byte) 90, var2.field9463, var2.field9459);
            var2.method1946(-10364);
        }
    }

    @OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Ljc;J[Lkga;)V")
    public class595(class179 arg0, long arg1, class578[] arg2) {
        this.field7559 = arg1;
        this.field7554 = arg0;
    }

    @OriginalMember(owner = "client!hia", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field7555++;
        this.field7554.method1178((byte) -77, this.field7559);
        super.finalize();
    }
}
