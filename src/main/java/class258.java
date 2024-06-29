import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class258 extends class64 {

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "Lgk;")
    public static class157 field4506 = new class157();

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "I")
    public static volatile int field4516 = 0;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    public static int field4514 = -1;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "I")
    public static int field4519 = 0;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
    public int field4508;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    public int field4515;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "I")
    public int field4520;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "Lwi;")
    public static class134 field4511;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIII)I")
    public static final int method1776(int arg0, int arg1, int arg2, int arg3) {
        field4510++;
        if (arg2 != -31863) {
            return 32;
        }
        if (arg1 > 243) {
            arg3 >>= 0x4;
        } else if (arg1 > 217) {
            arg3 >>= 0x3;
        } else if (arg1 > 192) {
            arg3 >>= 0x2;
        } else if (arg1 > 179) {
            arg3 >>= 0x1;
        }
        return (arg0 >> 2 << 10) + (arg3 >> 5 << 7) + (arg1 >> 1);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZLaj;I)V")
    public static final void method1777(boolean arg0, class47 arg1, int arg2) {
        field4509++;
        int var3 = arg1.field861 == 0 ? arg1.field722 : arg1.field861;
        int var4 = arg1.field755 == 0 ? arg1.field727 : arg1.field755;
        class137.method956(var3, var4, arg1.field834, (byte) 100, class14.field206[arg1.field834 >> 16], arg0);
        if (arg1.field761 != null) {
            class137.method956(var3, var4, arg1.field834, (byte) 100, arg1.field761, arg0);
        }
        class3 var5 = (class3) class34.field499.method639((byte) -79, (long) arg1.field834);
        if (arg2 > 52 && var5 != null) {
            class267.method1852(arg0, var4, (byte) 91, var3, var5.field42);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILal;)V")
    public static final void method1778(int arg0, class230 arg1) {
        field4507++;
        class188.field3369 = arg1;
        if (arg0 != 415013098) {
            field4516 = 97;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static void method1779(int arg0) {
        field4511 = null;
        field4506 = null;
        if (arg0 != 0) {
            method1778(33, (class230) null);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BJ)Lid;")
    public static final class149 method1780(byte arg0, long arg1) {
        field4517++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg0 != -72) {
                field4506 = null;
            }
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class267.field4758[(int) (var8 - (arg1 * 37L))];
            }
            class149 var7 = new class149();
            var7.field2694 = var6;
            var7.field2670 = var6.length;
            return var7;
        }
    }
}
