import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class206 extends class266 {

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "Lmj;")
    public class267 field3283;

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "I")
    public static int field3281 = 0;

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "I")
    public static int field3279 = 2;

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "Ltj;")
    public static class73 field3277 = new class73(64);

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "Lje;")
    public static class158 field3285;

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "Lni;")
    public static class202 field3286;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(Z)V", line = 23)
    public static void method1359(boolean arg0) {
        field3285 = null;
        field3277 = null;
        field3286 = null;
        if (!arg0) {
            method1362((class56) null, false, (int[][]) ((int[][]) null), 120, false, -59, 125, 53, (byte) 70, false, 76, -121, (int[]) null, 39, -9, (boolean[]) null, 9, (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), true, (int[][]) ((int[][]) null), (float[][]) ((float[][]) null));
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIILci;)V", line = 39)
    public static final void method1360(int arg0, int arg1, int arg2, class177 arg3) {
        field3278++;
        if (arg1 != -1) {
            return;
        }
        if (arg3.field238 == arg0 && arg0 != -1) {
            class33 var4 = class171.method1136(arg0, -6722);
            int var5 = var4.field499;
            if (var5 == 1) {
                arg3.field214 = arg2;
                arg3.field232 = 0;
                arg3.field221 = 0;
                arg3.field216 = 0;
                class272.method1859(arg3.field178, arg3.field211, arg1 + 65, arg3.field221, var4, false);
            }
            if (var5 == 2) {
                arg3.field216 = 0;
            }
        } else if (arg0 == -1 || arg3.field238 == -1 || class171.method1136(arg0, -6722).field524 >= class171.method1136(arg3.field238, arg1 ^ 0x1A41).field524) {
            arg3.field221 = 0;
            arg3.field172 = arg3.field208;
            arg3.field216 = 0;
            arg3.field232 = 0;
            arg3.field238 = arg0;
            arg3.field214 = arg2;
            if (arg3.field238 != -1) {
                class272.method1859(arg3.field178, arg3.field211, 64, arg3.field221, class171.method1136(arg3.field238, -6722), false);
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)Z", line = 97)
    public static final boolean method1361(int arg0, int arg1) {
        field3282++;
        if (arg0 != 20079) {
            field3284 = 19;
        }
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lwh;Z[[IIZIIIBZII[III[ZI[[F[[FZ[[I[[F)V", line = 112)
    public static final void method1362(class56 arg0, boolean arg1, int[][] arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, byte arg8, boolean arg9, int arg10, int arg11, int[] arg12, int arg13, int arg14, boolean[] arg15, int arg16, float[][] arg17, float[][] arg18, boolean arg19, int[][] arg20, float[][] arg21) {
        field3276++;
        if (arg13 != 255) {
            method1359(false);
        }
        int var22 = (arg4 ? 255 : 0) + (arg5 << 8);
        int var23 = (arg9 ? 255 : 0) + (arg7 << 8);
        int var24 = (arg1 ? 255 : 0) + (arg16 << 8);
        int var25 = (arg10 << 8) + (arg19 ? 255 : 0);
        int[] var26 = new int[arg12.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg12[var27 + var27 + 1];
            int var29 = arg12[var27 + var27];
            int[][] var30 = arg20 == null || arg15 == null || !arg15[var27] ? arg2 : arg20;
            var26[var27] = class297.method2000(arg17, var23, 1, var29, arg20, var22, var30, var28, false, var25, arg11, arg0, arg18, arg3, arg21, arg8, (float) arg14, var24);
        }
        arg0.method428(arg6, arg3, arg11, var26, (int[]) null, false);
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lmj;)V", line = 143)
    public class206(class267 arg0) {
        this.field3283 = arg0;
    }
}
