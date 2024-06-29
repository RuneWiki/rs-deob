import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class138 {

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field2553 = 0;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "Llg;")
    public static class137 field2552;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZI[Llg;II)V", line = 10)
    public static final void method1132(int arg0, boolean arg1, int arg2, class137[] arg3, int arg4, int arg5) {
        for (int var6 = 0; var6 < arg3.length; var6++) {
            class137 var7 = arg3[var6];
            if (var7 != null && var7.field2465 == arg0) {
                class282.method1922(var7, 125, arg5, arg2, arg1);
                class66.method639(var7, arg2, arg5, false);
                if (var7.field2531 > (var7.field2497 - var7.field2515)) {
                    var7.field2531 = var7.field2497 - var7.field2515;
                }
                if (var7.field2426 - var7.field2533 < var7.field2477) {
                    var7.field2477 = var7.field2426 - var7.field2533;
                }
                if (var7.field2531 < 0) {
                    var7.field2531 = 0;
                }
                if (var7.field2477 < 0) {
                    var7.field2477 = 0;
                }
                if (var7.field2490 == 0) {
                    class185.method1425(var7, 120, arg1);
                }
            }
        }
        field2551++;
        int var8 = 38 % ((arg4 + 81) / 45);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V", line = 58)
    public static void method1133(boolean arg0) {
        if (arg0) {
            method1133(false);
        }
        field2552 = null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BJ)V", line = 72)
    public static final void method1134(byte arg0, long arg1) {
        field2554++;
        if (arg1 == 0L || arg0 > -120) {
            return;
        }
        for (int var3 = 0; var3 < class200.field3424; var3++) {
            if (class20.field305[var3] == arg1) {
                class200.field3424--;
                for (int var4 = var3; var4 < class200.field3424; var4++) {
                    class20.field305[var4] = class20.field305[var4 + 1];
                    class264.field4270[var4] = class264.field4270[var4 + 1];
                    class322.field5121[var4] = class322.field5121[var4 + 1];
                }
                class21.field325++;
                class51.field809 = class99.field1606;
                class341.field5443.method26(76, 7);
                class341.field5443.method2333(arg1, 74);
                break;
            }
        }
    }
}
