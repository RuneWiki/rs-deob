import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class154 extends class88 {

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    private int field2448;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    private int field2445;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
    private int field2437;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    private int field2446;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "Lwm;")
    public static class152 field2447 = class157.method1048("scrollen:", 105);

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "Lfd;")
    public static class243 field2450 = new class243(64);

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    public static int field2452 = 2;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "Lwm;")
    private static class152 field2456 = class157.method1048("Loading )2 please wait)3", 120);

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "Lwm;")
    public static class152 field2457 = field2456;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "[I")
    public static int[] field2451 = new int[1000];

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    private int field2435;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    private int field2444;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    private int field2453;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    private int field2455;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "Lah;")
    public static class205 field2454;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "[B")
    private byte[] field2438;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)Lwm;", line = 5)
    public static final class152 method1028(int arg0) {
        if (arg0 != 31099) {
            method1028(21);
        }
        class152 var1 = class201.field3252;
        field2449++;
        class152 var2 = class10.field128;
        if (class39.field638 != 0) {
            var2 = class252.field4331;
        }
        if (class106.field1514 != null) {
            var1 = class195.method1307(new class152[] { class9.field124, class106.field1514 }, (byte) 29);
        }
        return class195.method1307(new class152[] { class134.field2069, var2, class52.field809, class38.method280(arg0 - 31015, class222.field3622), class26.field448, class38.method280(80, class45.field726), var1, class232.field3808 }, (byte) 29);
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V", line = 26)
    public static void method1029(int arg0) {
        field2457 = null;
        field2454 = null;
        field2447 = null;
        field2450 = null;
        if (arg0 != -13143) {
            field2454 = (class205) null;
        }
        field2456 = null;
        field2451 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 41)
    public final void method580(int arg0) {
        if (arg0 != -13820) {
            return;
        }
        field2442++;
        this.field2446 = this.field2437;
        this.field2444 >>= 0x4;
        if (this.field2444 < 0) {
            this.field2444 = 0;
        } else if (this.field2444 > 255) {
            this.field2444 = 255;
        }
        this.method1033(this.field2453++, (byte) this.field2444);
        this.field2444 = 0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZI)V", line = 70)
    public static final void method1030(boolean arg0, int arg1) {
        class272.field4679 = arg0;
        field2434++;
        class176.field2836 = !class296.method2044(-56);
        if (arg1 >= -108) {
            method1031(-6, -106, 86, 42);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V", line = 83)
    public final void method579(boolean arg0) {
        if (!arg0) {
            field2443++;
            this.field2453 = 0;
            this.field2444 = 0;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(IIII)I", line = 97)
    public static final int method1031(int arg0, int arg1, int arg2, int arg3) {
        field2439++;
        if (class65.field984 == null) {
            return 0;
        }
        int var4 = arg1 >> 7;
        int var5 = arg3 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg2;
        if (arg0 < 42) {
            return -38;
        }
        if (arg2 < 3 && (class70.field1026[1][var4][var5] & 0x2) == 2) {
            var6 = arg2 + 1;
        }
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var7) * class65.field984[var6][var4][var5 + 1] + (class65.field984[var6][var4 + 1][var5 + 1] * var7) >> 7;
        int var9 = arg3 & 0x7F;
        int var10 = (128 - var7) * class65.field984[var6][var4][var5] + (class65.field984[var6][var4 + 1][var5] * var7) >> 7;
        return (128 - var9) * var10 + (var8 * var9) >> 7;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V", line = 147)
    public final void method581(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.field2455 = 4096;
            this.field2435 = this.field2448 - (arg2 < 0 ? -arg2 : arg2);
            this.field2435 = this.field2435 * this.field2435 >> 12;
            this.field2444 = this.field2435;
        } else {
            this.field2455 = this.field2445 * this.field2435 >> 12;
            this.field2435 = this.field2448 - (arg2 >= 0 ? arg2 : -arg2);
            this.field2435 = this.field2435 * this.field2435 >> 12;
            if (this.field2455 < 0) {
                this.field2455 = 0;
            } else if (this.field2455 > 4096) {
                this.field2455 = 4096;
            }
            this.field2435 = this.field2455 * this.field2435 >> 12;
            this.field2444 += this.field2446 * this.field2435 >> 12;
            this.field2446 = this.field2446 * this.field2437 >> 12;
        }
        field2441++;
        if (arg1 >= -98) {
            method1030(true, -24);
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(IIIIIFFF)V", line = 188)
    public class154(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field2448 = (int) (arg6 * 4096.0F);
        this.field2445 = (int) (arg7 * 4096.0F);
        this.field2446 = this.field2437 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BZ)V", line = 205)
    public static final void method1032(byte arg0, boolean arg1) {
        if (arg0 != 32) {
            method1032((byte) -22, true);
        }
        field2440++;
        byte[][] var2;
        if (class217.field3516 && arg1) {
            var2 = class323.field5637;
        } else {
            var2 = class202.field3267;
        }
        int var3 = class107.field1534.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class284.field4835[var4] >> 8) * 64 - class272.field4670;
                int var7 = (class284.field4835[var4] & 0xFF) * 64 - class199.field3226;
                class234.method1609(-128);
                class200.method1334(var5, var6, var7, arg1, class135.field2076, -78);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)V", line = 250)
    public void method1033(int arg0, byte arg1) {
        this.field2438[arg0] = arg1;
        field2436++;
    }
}
