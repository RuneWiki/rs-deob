import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class20 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "[I")
    public int[] field440;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field441 = 0;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BLfca;)V", line = 6)
    private final void method135(byte arg0, class93 arg1) {
        field443++;
        if (arg0 > -50) {
            return;
        }
        while (true) {
            int var3;
            do {
                var3 = arg1.method793((byte) 75);
                if (var3 == 0) {
                    return;
                }
            } while (var3 != 1);
            int var4 = arg1.method793((byte) 73);
            this.field440 = new int[var4];
            for (int var5 = 0; var5 < this.field440.length; var5++) {
                this.field440[var5] = arg1.method793((byte) 93);
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V", line = 60)
    public static final void method136(int arg0, int arg1) {
        field444++;
        class281 var2 = class54.method395((byte) -53, (long) arg1, arg0);
        var2.method1818((byte) 117);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIB)I", line = 73)
    public static final int method137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var7 = arg1 & 0x3;
        if (arg6 != 63) {
            return 127;
        }
        field442++;
        if ((arg2 & 0x1) == 1) {
            int var8 = arg3;
            arg3 = arg4;
            arg4 = var8;
        }
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return 7 - arg5 - (arg3 + -1);
        } else if (var7 == 2) {
            return 7 + 1 - arg4 - arg0;
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lgj;)V", line = 110)
    public class20(class662 arg0) {
        byte[] var2 = arg0.method3742(5, 6);
        this.method135((byte) -101, new class93(var2));
        if (this.field440 == null) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V", line = 123)
    protected class20() {
        this.field440 = new int[0];
    }
}
