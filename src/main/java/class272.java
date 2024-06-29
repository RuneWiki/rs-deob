import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class272 extends class86 {

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    private int field4545 = 0;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
    private int field4558 = -1;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    private int field4559 = -32768;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "Z")
    public boolean field4563 = false;

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "I")
    private int field4564 = 0;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
    public int field4552;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
    public int field4560;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
    public int field4562;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    public int field4540;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    private int field4549;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    public int field4554;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "Ltk;")
    private class249 field4553;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "[I")
    public static int[] field4550 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "Lna;")
    public static class26 field4546 = class69.method505("<br>(X100(U(Y", (byte) -118);

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public static int field4537 = 0;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "Lna;")
    public static class26 field4539 = class69.method505("floorshadows", (byte) -121);

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "Z")
    public static boolean field4543 = true;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "Lna;")
    public static class26 field4536 = class69.method505("p11_full", (byte) -120);

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "Lga;")
    private class19 field4542;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "Z")
    public static boolean field4556;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)Lak;", line = 11)
    private final class311 method1927(boolean arg0) {
        field4561++;
        class300 var2 = class236.method1582((byte) 42, this.field4549);
        if (arg0) {
            field4546 = (class26) null;
        }
        class311 var3;
        if (this.field4563) {
            var3 = var2.method2114(-1, (byte) -30, -1, 0);
        } else {
            var3 = var2.method2114(this.field4558, (byte) -30, this.field4545, this.field4564);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lfe;Z)V", line = 40)
    public static final void method1928(class241 arg0, boolean arg1) {
        field4548++;
        int var2 = arg0.field3940 - class229.field3626;
        int var3 = arg0.field3921 * 128 + (arg0.method1078((byte) 114) * 64);
        if (!arg1) {
            return;
        }
        int var4 = arg0.field3979 * 128 + (arg0.method1078((byte) 114) * 64);
        if (arg0.field3984 == 0) {
            arg0.field3946 = 1024;
        }
        arg0.field3962 += (var3 - arg0.field3962) / var2;
        arg0.field3972 += (var4 - arg0.field3972) / var2;
        if (arg0.field3984 == 1) {
            arg0.field3946 = 1536;
        }
        arg0.field3967 = 0;
        if (arg0.field3984 == 2) {
            arg0.field3946 = 0;
        }
        if (arg0.field3984 == 3) {
            arg0.field3946 = 512;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IB)I", line = 82)
    public static final int method1929(int arg0, byte arg1) {
        if (arg1 > -67) {
            field4556 = false;
        }
        field4538++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIII)V", line = 108)
    public static final void method1930(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class255.field4184) {
            int var8 = arg2 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = (class78.field1236 - class262.field4281) * var8 / 100 + class262.field4281;
            arg4 = arg4 * var9 >> 8;
        }
        field4555++;
        int var10 = 2048 - arg7 & 0x7FF;
        int var11 = 2048 - arg5 & 0x7FF;
        int var12 = 0;
        int var13 = arg4;
        int var14 = 0;
        if (var10 != 0) {
            int var15 = class200.field3115[var10];
            int var16 = class200.field3104[var10];
            var14 = -arg4 * var16 >> 16;
            var13 = arg4 * var15 >> 16;
        }
        if (var11 != 0) {
            int var17 = class200.field3104[var11];
            int var18 = class200.field3115[var11];
            var12 = var13 * var17 >> 16;
            var13 = var13 * var18 >> 16;
        }
        if (arg1 != -1907397104) {
            method1928((class241) null, false);
        }
        class312.field5335 = arg7;
        class230.field3660 = arg5;
        class14.field231 = arg6 - var13;
        class324.field5589 = arg0 - var12;
        class178.field2793 = arg3 - var14;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)Lba;", line = 170)
    public static final class166 method1931(byte arg0) {
        field4541++;
        if (arg0 <= 97) {
            field4550 = (int[]) null;
        }
        class202.field3146 = 0;
        return class217.method1457(5422);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "()I", line = 183)
    public final int method679() {
        field4544++;
        return this.field4559;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(IIIIIII)V", line = 330)
    public class272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4552 = arg3;
        this.field4560 = arg2;
        this.field4562 = arg1;
        this.field4540 = arg5 + arg6;
        this.field4549 = arg0;
        this.field4554 = arg4;
        int var8 = class236.method1582((byte) 42, this.field4549).field5168;
        if (var8 == -1) {
            this.field4563 = true;
        } else {
            this.field4563 = false;
            this.field4553 = client.method1731(var8, (byte) -20);
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V", line = 194)
    public static void method1932(int arg0) {
        if (arg0 == 0) {
            field4539 = null;
            field4536 = null;
            field4550 = null;
            field4546 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIIIJILga;)V", line = 227)
    public final void method676(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class19 arg10) {
        field4557++;
        class311 var13 = this.method1927(false);
        if (var13 != null) {
            var13.method676(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4542);
            this.field4559 = var13.method679();
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI)V", line = 243)
    public final void method1933(boolean arg0, int arg1) {
        field4547++;
        if (this.field4563) {
            return;
        }
        if (!arg0) {
            this.method1933(true, -72);
        }
        this.field4564 += arg1;
        while (this.field4564 > this.field4553.field4076[this.field4545]) {
            this.field4564 -= this.field4553.field4076[this.field4545];
            this.field4545++;
            if (this.field4553.field4051.length <= this.field4545) {
                this.field4563 = true;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIII)V", line = 286)
    public static final void method1934(int arg0, int arg1, int arg2, int arg3) {
        class55 var4 = class36.field585[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class164 var5 = var4.field889;
        if (var5 != null) {
            var5.field2551 = var5.field2551 * arg3 / 16;
            var5.field2547 = var5.field2547 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIII)V", line = 306)
    public final void method675(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4551++;
    }
}
