import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class655 {

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public int field9156;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Ler;")
    private class92 field9157;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Lor;")
    public static class594 field9149 = new class594();

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field9150;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field9152;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field9153;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field9154;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field9155;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lcl;")
    public static class245 field9151;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZZI)V", line = 6)
    public static final void method3770(boolean arg0, boolean arg1, int arg2) {
        field9154++;
        if (arg2 != 0) {
            method3772(-112, (byte) -28, 0.29945183F, -8, 88, -0.09518216F, -96, -123, null, -49, -0.57680386F, -126, -106);
        }
        if (arg1) {
            class473.field7015--;
            if (class473.field7015 == 0) {
                class444.field6749 = null;
            }
        }
        if (!arg0) {
            return;
        }
        class659.field9186--;
        if (class659.field9186 == 0) {
            class63.field819 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!ed", name = "finalize", descriptor = "()V", line = 37)
    protected final void finalize() throws Throwable {
        this.field9157.method899(1, this.field9156);
        field9153++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILfa;Ljava/awt/Canvas;)Lr;", line = 53)
    public static final class167 method3771(int arg0, class214 arg1, Canvas arg2) {
        if (arg0 == 0) {
            field9150++;
            return new class18(arg2, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBFIIFII[FIFII)V", line = 66)
    public static final void method3772(int arg0, byte arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float[] arg8, int arg9, float arg10, int arg11, int arg12) {
        int var13 = arg11 - arg9;
        int var14 = arg12 - arg0;
        int var15 = arg6 - arg7;
        field9155++;
        float var16 = arg8[2] * (float) var14 + arg8[0] * (float) var13 + arg8[1] * (float) var15;
        float var17 = arg8[5] * (float) var14 + arg8[4] * (float) var15 + arg8[3] * (float) var13;
        if (arg1 > -110) {
            field9149 = null;
        }
        float var18 = arg8[8] * (float) var14 + arg8[7] * (float) var15 + arg8[6] * (float) var13;
        float var19;
        float var20;
        if (arg3 == 0) {
            var19 = arg2 + 0.5F - var18;
            var20 = arg5 + var16 + 0.5F;
        } else if (arg3 == 1) {
            var19 = arg2 + var18 + 0.5F;
            var20 = arg5 + var16 + 0.5F;
        } else if (arg3 == 2) {
            var20 = arg5 + 0.5F - var16;
            var19 = arg10 + 0.5F - var17;
        } else if (arg3 == 3) {
            var19 = arg10 + 0.5F - var17;
            var20 = arg5 + var16 + 0.5F;
        } else if (arg3 == 4) {
            var20 = arg2 + var18 + 0.5F;
            var19 = arg10 + 0.5F - var17;
        } else {
            var20 = arg2 + 0.5F - var18;
            var19 = arg10 + 0.5F - var17;
        }
        if (arg4 == 1) {
            float var22 = var20;
            var20 = -var19;
            var19 = var22;
        } else if (arg4 == 2) {
            var19 = -var19;
            var20 = -var20;
        } else if (arg4 == 3) {
            float var21 = var20;
            var20 = var19;
            var19 = -var21;
        }
        class546.field7947 = var19;
        class693.field9713 = var20;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Ler;II)V", line = 152)
    public class655(class92 arg0, int arg1, int arg2) {
        this.field9156 = arg2;
        this.field9157 = arg0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 163)
    public static void method3773(int arg0) {
        if (arg0 != -4) {
            method3771(15, null, null);
        }
        field9151 = null;
        field9149 = null;
    }
}
