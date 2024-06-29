import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class299 extends class293 {

    @OriginalMember(owner = "client!gr", name = "q", descriptor = "Lar;")
    public class479 field4103 = new class479();

    @OriginalMember(owner = "client!gr", name = "B", descriptor = "Ler;")
    public class69 field4114 = new class69();

    @OriginalMember(owner = "client!gr", name = "A", descriptor = "Lqu;")
    private class64 field4113;

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "[I")
    public static int[] field4101 = new int[1];

    @OriginalMember(owner = "client!gr", name = "p", descriptor = "Z")
    public static boolean field4102 = false;

    @OriginalMember(owner = "client!gr", name = "r", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!gr", name = "s", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!gr", name = "t", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!gr", name = "u", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!gr", name = "w", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "()Lad;", line = 13)
    public final class293 method521() {
        field4106++;
        class63 var1;
        do {
            var1 = (class63) this.field4103.method2820((byte) -58);
            if (var1 == null) {
                return null;
            }
        } while (var1.field797 == null);
        return var1.field797;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "([J[IBII)V", line = 33)
    public static final void method1751(long[] arg0, int[] arg1, byte arg2, int arg3, int arg4) {
        field4104++;
        if (arg2 <= 49 || arg4 <= arg3) {
            return;
        }
        int var5 = (arg3 + arg4) / 2;
        int var6 = arg3;
        long var7 = arg0[var5];
        arg0[var5] = arg0[arg4];
        arg0[arg4] = var7;
        int var9 = arg1[var5];
        arg1[var5] = arg1[arg4];
        arg1[arg4] = var9;
        int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
        for (int var11 = arg3; var11 < arg4; var11++) {
            if (((long) (var10 & var11) + var7) > arg0[var11]) {
                long var12 = arg0[var11];
                arg0[var11] = arg0[var6];
                arg0[var6] = var12;
                int var14 = arg1[var11];
                arg1[var11] = arg1[var6];
                arg1[var6++] = var14;
            }
        }
        arg0[arg4] = arg0[var6];
        arg0[var6] = var7;
        arg1[arg4] = arg1[var6];
        arg1[var6] = var9;
        method1751(arg0, arg1, (byte) 53, arg3, var6 - 1);
        method1751(arg0, arg1, (byte) 95, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lps;BIII[I)V", line = 90)
    private final void method1752(class63 arg0, byte arg1, int arg2, int arg3, int arg4, int[] arg5) {
        field4110++;
        int var7 = -25 / ((arg1 - 78) / 44);
        if ((this.field4113.field815[arg0.field783] & 0x4) != 0 && arg0.field787 < 0) {
            int var8 = this.field4113.field813[arg0.field783] / class188.field2724;
            while (true) {
                int var9 = (var8 + 1048575 - arg0.field788) / var8;
                if (arg4 < var9) {
                    arg0.field788 += arg4 * var8;
                    break;
                }
                arg0.field797.method523(arg5, arg3, var9);
                arg4 -= var9;
                arg0.field788 += var8 * var9 - 1048576;
                arg3 += var9;
                int var10 = class188.field2724 / 100;
                int var11 = 262144 / var8;
                if (var11 < var10) {
                    var10 = var11;
                }
                class505 var12 = arg0.field797;
                if (this.field4113.field822[arg0.field783] == 0) {
                    arg0.field797 = class505.method3015(arg0.field786, var12.method2982(), var12.method3008(), var12.method3013());
                } else {
                    arg0.field797 = class505.method3015(arg0.field786, var12.method2982(), 0, var12.method3013());
                    this.field4113.method549(arg0, arg0.field800.field5584[arg0.field778] < 0, false);
                    arg0.field797.method2983(var10, var12.method3008());
                }
                if (arg0.field800.field5584[arg0.field778] < 0) {
                    arg0.field797.method3010(-1);
                }
                var12.method3011(var10);
                var12.method523(arg5, arg3, arg2 - arg3);
                if (var12.method3016()) {
                    this.field4114.method583(var12);
                }
            }
        }
        arg0.field797.method523(arg5, arg3, arg4);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "()I", line = 155)
    public final int method538() {
        field4108++;
        return 0;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V", line = 164)
    public static void method1753(byte arg0) {
        int var1 = -110 % ((39 - arg0) / 38);
        field4101 = null;
    }

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "(I)V", line = 178)
    public final void method546(int arg0) {
        this.field4114.method546(arg0);
        field4112++;
        for (class63 var2 = (class63) this.field4103.method2818((byte) 109); var2 != null; var2 = (class63) this.field4103.method2820((byte) -58)) {
            if (!this.field4113.method555(var2, (byte) -7)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field796) {
                        this.method1754(var2, (byte) -50, var3);
                        var2.field796 -= var3;
                        break;
                    }
                    this.method1754(var2, (byte) -84, var2.field796);
                    var3 -= var2.field796;
                } while (!this.field4113.method545(var3, 0, var2, 127, null));
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lps;BI)V", line = 213)
    private final void method1754(class63 arg0, byte arg1, int arg2) {
        field4109++;
        if ((this.field4113.field815[arg0.field783] & 0x4) != 0 && arg0.field787 < 0) {
            int var4 = this.field4113.field813[arg0.field783] / class188.field2724;
            int var5 = (var4 + 1048575 - arg0.field788) / var4;
            arg0.field788 = arg2 * var4 + arg0.field788 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field4113.field822[arg0.field783] == 0) {
                    arg0.field797 = class505.method3015(arg0.field786, arg0.field797.method2982(), arg0.field797.method3008(), arg0.field797.method3013());
                } else {
                    arg0.field797 = class505.method3015(arg0.field786, arg0.field797.method2982(), 0, arg0.field797.method3013());
                    this.field4113.method549(arg0, arg0.field800.field5584[arg0.field778] < 0, false);
                }
                if (arg0.field800.field5584[arg0.field778] < 0) {
                    arg0.field797.method3010(-1);
                }
                arg2 = arg0.field788 / var4;
            }
        }
        arg0.field797.method546(arg2);
        if (arg1 >= -41) {
            this.field4103 = null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "()Lad;", line = 253)
    public final class293 method550() {
        field4105++;
        class63 var1 = (class63) this.field4103.method2818((byte) -14);
        if (var1 == null) {
            return null;
        } else if (var1.field797 == null) {
            return this.method521();
        } else {
            return var1.field797;
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "([III)V", line = 271)
    public final void method523(int[] arg0, int arg1, int arg2) {
        field4111++;
        this.field4114.method523(arg0, arg1, arg2);
        for (class63 var4 = (class63) this.field4103.method2818((byte) 118); var4 != null; var4 = (class63) this.field4103.method2820((byte) -58)) {
            if (!this.field4113.method555(var4, (byte) -7)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field796 >= var5) {
                        this.method1752(var4, (byte) -87, var5 + var6, var6, var5, arg0);
                        var4.field796 -= var5;
                        break;
                    }
                    this.method1752(var4, (byte) -17, var5 + var6, var6, var4.field796, arg0);
                    var6 += var4.field796;
                    var5 -= var4.field796;
                } while (!this.field4113.method545(var5, var6, var4, 124, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lqu;)V", line = 317)
    public class299(class64 arg0) {
        this.field4113 = arg0;
    }
}
