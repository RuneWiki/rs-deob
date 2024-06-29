import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class605 extends class522 {

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    private int field8408;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    private int field8413;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    private int field8407;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    private int field8411;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "[I")
    public static int[] field8415 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Lqk;")
    public static class16 field8409 = new class16();

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
    public static int field8416 = 16777215;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field8406;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field8412;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field8414;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "Lrea;")
    public static class210 field8417;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "Lkr;")
    public static class748 field8418;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZII)V", line = 4)
    public final void method1094(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method3417((byte) 30);
        }
        ++field8406;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V", line = 17)
    public static void method3416(byte arg0) {
        if (arg0 >= -1) {
            method3417((byte) -17);
        }
        field8415 = null;
        field8409 = null;
        field8418 = null;
        field8417 = null;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(IIIIII)V", line = 31)
    public class605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field8408 = arg0;
        this.field8413 = arg1;
        this.field8407 = arg3;
        this.field8411 = arg2;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(III)V", line = 42)
    public final void method1093(int arg0, int arg1, int arg2) {
        ++field8414;
        int var4 = this.field8408 * arg0 >> 12;
        int var5 = this.field8411 * arg0 >> 12;
        int var6 = this.field8413 * arg2 >> 12;
        int var7 = this.field8407 * arg2 >> 12;
        class114.method894(var7, super.field7318, 92, var6, var4, var5);
        if (arg1 != 1) {
            this.method1093(61, -35, 92);
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)V", line = 70)
    public static final void method3417(byte arg0) {
        ++field8410;
        int[] var1 = new int[class21.field381.field3322];
        int var2 = -120 % ((54 - arg0) / 50);
        int var3 = 0;
        for (int var4 = 0; ~class21.field381.field3322 < ~var4; ++var4) {
            class639 var6 = class21.field381.method1583(-83, var4);
            if (~var6.field8837 <= -1 || ~var6.field8802 <= -1) {
                var1[var3++] = var4;
            }
        }
        class453.field5996 = new int[var3];
        for (int var5 = 0; ~var3 < ~var5; ++var5) {
            class453.field5996[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V", line = 114)
    public final void method1092(int arg0, int arg1, int arg2) {
        if (arg2 == 2048) {
            ++field8412;
        }
    }
}
