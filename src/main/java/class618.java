import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class618 {

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "[[I")
    public static int[][] field8377 = new int[6][];

    @OriginalMember(owner = "client!lw", name = "f", descriptor = "[I")
    public static int[] field8380 = new int[200];

    @OriginalMember(owner = "client!lw", name = "h", descriptor = "Ldr;")
    public static class675 field8382 = new class675(61, 12);

    @OriginalMember(owner = "client!lw", name = "l", descriptor = "Z")
    public static boolean field8386 = true;

    @OriginalMember(owner = "client!lw", name = "m", descriptor = "[I")
    public static int[] field8387 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!lw", name = "k", descriptor = "I")
    public static int field8385 = 0;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "I")
    public static int field8375;

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "I")
    public static int field8376;

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "I")
    public static int field8378;

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "I")
    public static int field8379;

    @OriginalMember(owner = "client!lw", name = "g", descriptor = "I")
    public static int field8381;

    @OriginalMember(owner = "client!lw", name = "i", descriptor = "[I")
    public static int[] field8383;

    @OriginalMember(owner = "client!lw", name = "j", descriptor = "[Lvea;")
    public static class256[] field8384;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(III)Lap;", line = 4)
    public static final class445 method3444(int arg0, int arg1, int arg2) {
        class565 var3 = class407.field5237[arg0][arg1][arg2];
        return var3 == null || var3.field7085 == null ? null : var3.field7085;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V", line = 13)
    public static final void method3445(int arg0) {
        field8378++;
        if (class257.field3292 == class235.field3043) {
            return;
        }
        try {
            class104.method744(class455.field5687, "tbrefresh", 114);
        } catch (Throwable var1) {
        }
        if (arg0 != -5942) {
            method3448(true);
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)V", line = 33)
    public static final void method3446(int arg0) {
        field8376++;
        class78.method609(arg0 + 10492, arg0);
        class683.method3777((byte) 85);
        System.gc();
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lqf;I)I", line = 46)
    public static final int method3447(class638 arg0, int arg1) {
        if (arg1 != 36067) {
            method3445(-119);
        }
        field8375++;
        int var2 = arg0.method3578(8, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method3578(8, 5);
        } else if (var2 == 2) {
            var3 = arg0.method3578(arg1 - 36059, 8);
        } else {
            var3 = arg0.method3578(arg1 ^ 0x8CEB, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Z)V", line = 73)
    public static void method3448(boolean arg0) {
        field8384 = null;
        field8382 = null;
        field8377 = null;
        field8380 = null;
        field8387 = null;
        if (arg0) {
            method3444(113, -107, 74);
        }
        field8383 = null;
    }
}
