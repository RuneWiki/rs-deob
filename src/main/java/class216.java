import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class class216 {

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "Lph;")
    public static class229 field3551 = class266.method1858("null", 0);

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field3555 = 0;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "()Z", line = 4)
    public boolean method222() {
        field3553++;
        return false;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)Lrk;", line = 12)
    public class216 method213(int arg0, int arg1, int arg2) {
        field3554++;
        return this;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "([IIIIII)V", line = 27)
    public static final void method1519(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class72 var6 = class225.field3705[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class98 var7 = var6.field1212;
        if (var7 != null) {
            int var8 = var7.field1657;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class158 var10 = var6.field1229;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field2582;
        int var12 = var10.field2564;
        int var13 = var10.field2580;
        int var14 = var10.field2579;
        int[] var15 = class195.field3269[var11];
        int[] var16 = class228.field3748[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 119)
    public static void method1520(int arg0) {
        if (arg0 != -20763) {
            method1520(-61);
        }
        field3551 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lrk;IIIZ)V", line = 135)
    public void method212(class216 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3550++;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "()I")
    public abstract int method182();

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIIIJILbn;)V")
    public abstract void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class194 arg10);

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIII)V")
    public abstract void method183(int arg0, int arg1, int arg2, int arg3, int arg4);
}
