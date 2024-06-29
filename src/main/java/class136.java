import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class136 {

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Lli;")
    public static class185 field2554 = class245.method1649("Suche nach Updates )2 ", 124);

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Lli;")
    public static class185 field2551 = class245.method1649("glissement:", -10);

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Z")
    public static boolean field2556 = false;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field2552 = 0;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "Lli;")
    private static class185 field2559 = class245.method1649("level: ", 127);

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Lli;")
    public static class185 field2558 = field2559;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "[[Lp;")
    public static class82[][] field2557;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIILbb;IJZ)Z")
    public static final boolean method977(int arg0, int arg1, int arg2, int arg3, int arg4, class75 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class122.method897(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static void method978(int arg0) {
        field2554 = null;
        if (arg0 != -31904) {
            method978(117);
        }
        field2557 = null;
        field2558 = null;
        field2559 = null;
        field2551 = null;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)[Lda;")
    public static final class101[] method979(int arg0) {
        field2553++;
        class101[] var1 = new class101[class27.field457];
        for (int var2 = 0; var2 < class27.field457; var2++) {
            byte[] var3 = class174.field3182[var2];
            int var4 = class55.field940[var2] * class258.field4591[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class211.field3842[class220.method1526(255, var3[var6])];
            }
            var1[var2] = new class101(class87.field1716, class210.field3839, class145.field2766[var2], class249.field4418[var2], class55.field940[var2], class258.field4591[var2], var5);
        }
        if (arg0 == 255) {
            class269.method1827((byte) -118);
            return var1;
        } else {
            return null;
        }
    }
}
