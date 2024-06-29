import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class361 implements class580 {

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "Lee;")
    private class706 field5278 = new class706(128);

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "[I")
    private int[] field5271 = new int[class488.field6763.field5060];

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "[I")
    public int[] field5274 = new int[class488.field6763.field5060];

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "[I")
    public static int[] field5272 = new int[6];

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZB)I", line = 4)
    public final int method2266(boolean arg0, byte arg1) {
        field5270++;
        long var3 = class302.method1910(0);
        int var5 = 3 % ((-arg1 - 42) / 56);
        for (class536 var6 = arg0 ? (class536) this.field5278.method3960(0) : (class536) this.field5278.method3955((byte) -127); var6 != null; var6 = (class536) this.field5278.method3955((byte) 21)) {
            if (var3 > (var6.field7300 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var6.field7300 & 0x4000000000000000L) != 0L) {
                    int var7 = (int) var6.field1409;
                    this.field5274[var7] = this.field5271[var7];
                    var6.method792((byte) -106);
                    return var7;
                }
                var6.method792((byte) -114);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BII)V", line = 43)
    public final void method2267(byte arg0, int arg1, int arg2) {
        field5279++;
        class261 var4 = class642.field8904.method3238(arg1, 126);
        int var5 = var4.field3873;
        int var6 = var4.field3878;
        if (arg0 != 0) {
            this.method2271(86, -6);
        }
        int var7 = var4.field3879;
        int var8 = class194.field2603[var7 - var6];
        if (arg2 < 0 || var8 < arg2) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method2273(var5, this.field5271[var5] & ~var9 | var9 & arg2 << var6, 0);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIB)V", line = 74)
    public final void method2268(int arg0, int arg1, byte arg2) {
        field5280++;
        this.field5274[arg0] = arg1;
        int var4 = -85 % ((arg2 + 48) / 36);
        class536 var5 = (class536) this.field5278.method3953((long) arg0, 14);
        if (var5 == null) {
            class536 var6 = new class536(class302.method1910(0) + 500L);
            this.field5278.method3962((long) arg0, var6, -107);
        } else {
            var5.field7300 = class302.method1910(0) + 500L;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V", line = 96)
    public static void method2269(byte arg0) {
        if (arg0 < -108) {
            field5272 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V", line = 109)
    public final void method2270(int arg0) {
        field5273++;
        for (int var2 = arg0; var2 < class488.field6763.field5060; var2++) {
            class493 var3 = class488.field6763.method2178(var2, (byte) -125);
            if (var3 != null && var3.field6835 == 0) {
                this.field5271[var2] = 0;
                this.field5274[var2] = 0;
            }
        }
        this.field5278 = new class706(128);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)I", line = 135)
    public final int method2271(int arg0, int arg1) {
        field5275++;
        class261 var3 = class642.field8904.method3238(arg0, 108);
        int var4 = var3.field3873;
        int var5 = var3.field3878;
        if (arg1 == 14194) {
            int var6 = var3.field3879;
            int var7 = class194.field2603[var6 - var5];
            return this.field5274[var4] >> var5 & var7;
        } else {
            return -81;
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(II)I", line = 157)
    public final int method2272(int arg0, int arg1) {
        field5277++;
        if (arg0 != 0) {
            this.method2267((byte) 66, 64, 66);
        }
        return this.field5274[arg1];
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)V", line = 168)
    public final void method2273(int arg0, int arg1, int arg2) {
        this.field5271[arg0] = arg1;
        field5276++;
        class536 var4 = (class536) this.field5278.method3953((long) arg0, 14);
        if (arg2 != 0) {
            return;
        }
        if (var4 == null) {
            class536 var5 = new class536(4611686018427387905L);
            this.field5278.method3962((long) arg0, var5, -122);
        } else if (var4.field7300 != 4611686018427387905L) {
            var4.field7300 = class302.method1910(0) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(III)V", line = 205)
    public final void method2274(int arg0, int arg1, int arg2) {
        field5281++;
        class261 var4 = class642.field8904.method3238(arg0, 107);
        int var5 = var4.field3873;
        int var6 = var4.field3878;
        int var7 = var4.field3879;
        int var8 = class194.field2603[var7 - var6];
        if (arg2 > arg1 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method2268(var5, this.field5274[var5] & ~var9 | arg1 << var6 & var9, (byte) 4);
    }
}
