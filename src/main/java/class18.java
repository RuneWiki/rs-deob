import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class18 extends class112 {

    @OriginalMember(owner = "client!l", name = "v", descriptor = "B")
    public byte field332 = 5;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "[J")
    public static long[] field329 = new long[256];

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    public int field335;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "I")
    public int field339;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "Lpp;")
    public static class396 field331;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "Z")
    public boolean field334;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field329[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BIIIII)V", line = 3)
    public static final void method125(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field328++;
        if (arg2 == arg5) {
            class99.method794(arg2, arg4, arg3, (byte) -107, arg1);
            return;
        }
        if (class667.field9373 <= (arg1 - arg2) && class225.field2994 >= arg1 + arg2 && class546.field7619 <= arg4 - arg5 && class760.field10606 >= arg4 + arg5) {
            class236.method1482(arg5, arg2, arg1, 1, arg4, arg3);
        } else {
            class339.method1951(-2002199167, arg4, arg3, arg2, arg1, arg5);
        }
        if (arg0 != 27) {
            method127(24);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([[F[[SB)[[S", line = 30)
    public static final short[][] method126(float[][] arg0, short[][] arg1, byte arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            for (int var4 = 0; var4 < arg1[var3].length; var4++) {
                arg1[var3][var4] = (short) ((int) (arg0[var3][var4] * 16383.0F));
            }
        }
        if (arg2 == -128) {
            field336++;
            return arg1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 72)
    public static void method127(int arg0) {
        field331 = null;
        int var1 = 117 / ((arg0 + 55) / 59);
        field329 = null;
    }
}
