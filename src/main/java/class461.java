import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class class461 {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public int field6245;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public int field6248;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public int field6246;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "[I")
    public static int[] field6249 = new int[13];

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBIIIFIIF[FFII)V", line = 5)
    public static final void method2619(int arg0, byte arg1, int arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, float[] arg9, float arg10, int arg11, int arg12) {
        int var13 = arg0 - arg7;
        if (arg1 >= -83) {
            return;
        }
        field6247++;
        int var14 = arg3 - arg6;
        int var15 = arg2 - arg11;
        float var16 = arg9[2] * (float) var13 + arg9[1] * (float) var14 + arg9[0] * (float) var15;
        float var17 = arg9[5] * (float) var13 + arg9[4] * (float) var14 + arg9[3] * (float) var15;
        float var18 = arg9[8] * (float) var13 + arg9[6] * (float) var15 + arg9[7] * (float) var14;
        float var19;
        float var20;
        if (arg12 == 0) {
            var19 = arg8 + var16 + 0.5F;
            var20 = arg10 + 0.5F - var18;
        } else if (arg12 == 1) {
            var19 = arg8 + var16 + 0.5F;
            var20 = arg10 + var18 + 0.5F;
        } else if (arg12 == 2) {
            var20 = arg5 + 0.5F - var17;
            var19 = arg8 + 0.5F - var16;
        } else if (arg12 == 3) {
            var20 = arg5 + 0.5F - var17;
            var19 = arg8 + var16 + 0.5F;
        } else if (arg12 == 4) {
            var20 = arg5 + 0.5F - var17;
            var19 = arg10 + var18 + 0.5F;
        } else {
            var19 = arg10 + 0.5F - var18;
            var20 = arg5 + 0.5F - var17;
        }
        if (arg4 == 1) {
            float var22 = var19;
            var19 = -var20;
            var20 = var22;
        } else if (arg4 == 2) {
            var20 = -var20;
            var19 = -var19;
        } else if (arg4 == 3) {
            float var21 = var19;
            var19 = var20;
            var20 = -var21;
        }
        class300.field4194 = var20;
        class313.field4307 = var19;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 100)
    public static void method2620(int arg0) {
        field6249 = null;
        if (arg0 != 27461) {
            field6249 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(III)V", line = 113)
    public class461(int arg0, int arg1, int arg2) {
        this.field6245 = arg2;
        this.field6248 = arg1;
        this.field6246 = arg0;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BII)V")
    public abstract void method704(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIB)V")
    public abstract void method705(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
    public abstract void method703(int arg0, int arg1, int arg2);
}
