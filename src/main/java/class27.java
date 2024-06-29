import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class27 extends class68 {

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "Lce;")
    private static class126 field380 = class206.method1445(-7923, "Loaded title screen");

    @OriginalMember(owner = "client!da", name = "r", descriptor = "Z")
    public static boolean field377 = false;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field378 = 0;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "Lce;")
    public static class126 field382 = class206.method1445(-7923, "null");

    @OriginalMember(owner = "client!da", name = "v", descriptor = "Lce;")
    public static class126 field381 = field380;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "Lce;")
    public static class126 field385 = class206.method1445(-7923, "<col=40ff00>");

    @OriginalMember(owner = "client!da", name = "B", descriptor = "[I")
    public static int[] field387 = new int[4096];

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "[I")
    public static int[] field386;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZBII)Lce;", line = 14)
    public static final class126 method127(boolean arg0, byte arg1, int arg2, int arg3) {
        field384++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var4 = 1;
        int var5 = arg3 / arg2;
        while (var5 != 0) {
            var5 /= arg2;
            var4++;
        }
        if (arg1 >= -98) {
            field382 = (class126) null;
        }
        int var6 = var4;
        if (arg3 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg3 % arg2;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
            arg3 /= arg2;
        }
        class126 var10 = new class126();
        var10.field2140 = var6;
        var10.field2158 = var7;
        return var10;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field387[var0] = class286.method1905(var0, (byte) 39);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)V", line = 91)
    public static void method128(boolean arg0) {
        field382 = null;
        field386 = null;
        if (arg0) {
            field380 = (class126) null;
        }
        field381 = null;
        field380 = null;
        field387 = null;
        field385 = null;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V", line = 123)
    public class27() {
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(I)V", line = 139)
    public class27(int arg0) {
        this.field383 = arg0;
    }
}
