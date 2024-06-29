import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class220 {

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Lmh;")
    public static class62 field3781 = class201.method1405(true, ":duelfriend:");

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Lmh;")
    public static class62 field3786 = class201.method1405(true, "overlay2");

    @OriginalMember(owner = "client!h", name = "b", descriptor = "Lmh;")
    public static class62 field3782 = class201.method1405(true, "<br>");

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Lmh;")
    public static class62 field3783 = class201.method1405(true, "scrollen:");

    @OriginalMember(owner = "client!h", name = "d", descriptor = "[Z")
    public static boolean[] field3784 = new boolean[100];

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "[Lfd;")
    public static class61[] field3788;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([IIIIII)V", line = 4)
    public static final void method1567(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class166 var6 = class256.field4320[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class187 var7 = var6.field2710;
        if (var7 != null) {
            int var8 = var7.field2986;
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
        class295 var10 = var6.field2719;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field5043;
        int var12 = var10.field5032;
        int var13 = var10.field5033;
        int var14 = var10.field5035;
        int[] var15 = class71.field1083[var11];
        int[] var16 = class37.field575[var12];
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

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V", line = 115)
    public static void method1568(boolean arg0) {
        field3781 = null;
        field3786 = null;
        if (!arg0) {
            field3782 = null;
            field3788 = null;
            field3784 = null;
            field3783 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 135)
    public static final void method1569(int arg0) {
        if (arg0 != 0) {
            field3783 = (class62) null;
        }
        field3787++;
        class222.field3829 = new class49(32);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Z", line = 148)
    public static final boolean method1570(int arg0, int arg1) {
        field3785++;
        if (arg1 <= 80) {
            field3781 = (class62) null;
        }
        return (-arg0 & arg0) == arg0;
    }
}
