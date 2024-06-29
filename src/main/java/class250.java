import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class250 {

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "Z")
    public static boolean field3279 = false;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "Ldc;")
    public static class302 field3284 = new class302();

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "F")
    public static float field3285;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "J")
    public static long field3286;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method1515(boolean arg0) {
        field3282++;
        int[] var1 = new int[class259.field3355.field5795];
        int var2 = 0;
        int var3 = 0;
        if (arg0) {
            method1516(104);
        }
        while (class259.field3355.field5795 > var3) {
            class390 var5 = class259.field3355.method2382(var3, (byte) 28);
            if (var5.field5860 >= 0 || var5.field5844 >= 0) {
                var1[var2++] = var3;
            }
            var3++;
        }
        class116.field1743 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class116.field1743[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 49)
    public static void method1516(int arg0) {
        int var1 = -101 / ((arg0 - 12) / 36);
        field3284 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)V", line = 66)
    public static final void method1517(int arg0, int arg1, int arg2) {
        field3283++;
        class489 var3 = class704.method3942(arg1, 14, arg0 + arg0);
        var3.method2797(-1);
        var3.field6952 = arg2;
    }
}
