import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class434 {

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "[I")
    public static int[] field6346 = new int[2];

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "Ljava/lang/String;")
    public static String field6349 = "Examine";

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lve;III[Z)V", line = 3)
    public static final void method2681(class307 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class98.field1161 == class275.field3707) {
            return;
        }
        int var5 = class272.field3682[arg1].method265(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class54 var7 = class272.field3682[var6];
                if (var7 != null) {
                    var7.method273(arg0, arg2, var5 - var7.method265(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lam;Lam;ILam;)V", line = 29)
    public static final void method2682(class286 arg0, class286 arg1, int arg2, class286 arg3) {
        class62.field633 = arg0;
        if (arg2 != 32) {
            method2681((class307) null, 60, -16, 45, (boolean[]) null);
        }
        field6345++;
        class149.method797(false, arg1, arg3);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILfd;IIIII)V", line = 41)
    public static final void method2683(int arg0, int arg1, class194 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2.field2492 == 2) {
            int var8 = 99999;
            int var9 = 0;
            int var10 = 0;
            for (int var11 = 0; var11 < arg2.field2450; var11++) {
                for (int var12 = 0; var12 < arg2.field2495; var12++) {
                    int var13 = (arg2.field2602 + 32) * var12 + arg6;
                    int var14 = (arg2.field2538 + 32) * var11 + arg7;
                    if (var10 < 20) {
                        var13 += arg2.field2532[var10];
                        var14 += arg2.field2618[var10];
                    }
                    if (arg2.field2473[var10] > 0 && (arg1 < (var13 + 32) && arg3 > var13 && arg4 < var14 + 32 && arg0 > var14 || class123.field1558 == arg2 && class192.field2421 == var10)) {
                        if (var8 > var10) {
                            var8 = var10;
                        }
                        if (var9 < var10) {
                            var9 = var10;
                        }
                    }
                    var10++;
                }
            }
            class105.method561(arg2, class88.field1003, var9, true, var8);
        } else if (arg2.field2492 == 5 && arg2.field2507 != -1) {
            class175.method923(class88.field1003, arg2, (byte) 122);
        }
        field6347++;
        if (arg5 != -21) {
            field6346 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V", line = 113)
    public static void method2684(boolean arg0) {
        field6346 = null;
        field6349 = null;
        if (arg0) {
            method2684(true);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lam;ILam;)V", line = 134)
    public static final void method2685(class286 arg0, int arg1, class286 arg2) {
        class180.field2269 = arg0;
        field6348++;
        class213.field2884 = arg2;
        class213.field2884.method1691(36, 0);
        if (arg1 > -90) {
            field6346 = null;
        }
    }
}
