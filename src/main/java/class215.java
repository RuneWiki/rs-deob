import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class215 {

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field2993 = 0;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field2991 = 0;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "[[I")
    public static int[][] field2992;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIII)V")
    public static final void method1464(int arg0, int arg1, int arg2, int arg3) {
        class420 var4 = class380.field5802[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class255 var5 = var4.field6277;
        class255 var6 = var4.field6283;
        if (var5 != null) {
            var5.field3531 = var5.field3531 * arg3 / (0x10 << class386.field5882 - 7);
            var5.field3525 = var5.field3525 * arg3 / (0x10 << class386.field5882 - 7);
        }
        if (var6 != null) {
            var6.field3531 = var6.field3531 * arg3 / (0x10 << class386.field5882 - 7);
            var6.field3525 = var6.field3525 * arg3 / (0x10 << class386.field5882 - 7);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ltl;B)V")
    public static final void method1465(class91 arg0, byte arg1) {
        field2994++;
        int var2 = arg0.method598(false);
        class204.field2866 = new class29[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class204.field2866[var3] = new class29();
            class204.field2866[var3].field453 = arg0.method598(false);
            class204.field2866[var3].field451 = arg0.method601((byte) -112);
        }
        class198.field2799 = arg0.method598(false);
        class428.field6361 = arg0.method598(false);
        if (arg1 != -41) {
            field2992 = null;
        }
        class58.field781 = arg0.method598(false);
        class428.field6363 = new class349[class428.field6361 + 1 - class198.field2799];
        for (int var4 = 0; var4 < class58.field781; var4++) {
            int var5 = arg0.method598(false);
            class349 var6 = class428.field6363[var5] = new class349();
            var6.field6183 = arg0.method618((byte) 100);
            var6.field6178 = arg0.method626((byte) 100);
            var6.field5438 = class198.field2799 + var5;
            var6.field5434 = arg0.method601((byte) 6);
            var6.field5437 = arg0.method601((byte) -87);
        }
        class249.field3467 = arg0.method626((byte) 100);
        class164.field2394 = true;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZI[BIILbv;I)Log;")
    public static final class346 method1466(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4, int arg5, class282 arg6, int arg7) {
        if (arg7 != 23409) {
            field2993 = -42;
        }
        field2990++;
        if (!arg6.field4134 && (!class124.method799(true, arg2) || !class124.method799(true, arg4))) {
            return arg6.field4155 ? new class346(arg6, 34037, arg5, arg2, arg4, arg1, arg3, arg0) : new class346(arg6, arg5, arg2, arg4, class353.method2231(arg2, (byte) -84), class353.method2231(arg4, (byte) -84), arg3, arg0);
        } else {
            return new class346(arg6, 3553, arg5, arg2, arg4, arg1, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static void method1467(int arg0) {
        if (arg0 != 0) {
            method1466(81, false, -94, null, -14, -58, null, -29);
        }
        field2992 = null;
    }
}
