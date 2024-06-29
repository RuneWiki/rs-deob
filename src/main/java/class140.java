import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class140 extends class133 {

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "[J")
    private long[] field2442 = new long[10];

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    private int field2444 = 1;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    private int field2443 = 256;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    private int field2445 = 0;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "J")
    private long field2438 = class77.method569((byte) -115);

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "Z")
    public static boolean field2430 = true;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "Lp;")
    public static class280 field2436 = class18.method140((byte) -119, "scape main");

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field2431 = 0;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field2434 = 2301979;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "Lp;")
    public static class280 field2440 = class18.method140((byte) -119, "Chargement de RuneScape en cours )2 veuillez patienter)3)3)3");

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    private int field2435;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "Lff;")
    public static class18 field2433;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)I")
    public static final int method972(byte arg0, int arg1) {
        field2441++;
        return arg0 == 100 ? (arg1 & 0x3FB1A) >> 11 : -5;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method973(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2432++;
        if (arg4 < 31) {
            method975((byte) 97);
        }
        if (class48.method356(-664, arg6)) {
            client.method1104(class251.field4394[arg6], -1, arg2, arg0, arg5, arg3, arg1, arg7);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BIIIZI)V")
    public static final void method974(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg5 < 1) {
            arg5 = 1;
        }
        field2437++;
        if (arg0 >= -77) {
            return;
        }
        if (arg2 < 1) {
            arg2 = 1;
        }
        class225.field3888 = (short) arg2;
        class175.field3038 = (short) arg5;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public final void method102(int arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            this.field2442[var2] = 0L;
        }
        field2439++;
        if (arg0 != -1) {
            this.field2442 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)I")
    public final int method101(int arg0, int arg1, int arg2) {
        int var4 = this.field2443;
        this.field2443 = 300;
        int var5 = this.field2444;
        field2429++;
        this.field2444 = 1;
        this.field2438 = class77.method569((byte) 80);
        if (this.field2442[this.field2435] == 0L) {
            this.field2444 = var5;
            this.field2443 = var4;
        } else if (this.field2442[this.field2435] < this.field2438) {
            this.field2443 = (int) ((long) (arg1 * 2560) / (this.field2438 - this.field2442[this.field2435]));
        }
        if (this.field2443 < 25) {
            this.field2443 = 25;
        }
        if (this.field2443 > 256) {
            this.field2443 = 256;
            this.field2444 = (int) ((long) arg1 - ((this.field2438 - this.field2442[this.field2435]) / 10L));
        }
        if (this.field2444 > arg1) {
            this.field2444 = arg1;
        }
        this.field2442[this.field2435] = this.field2438;
        this.field2435 = (this.field2435 + 1) % 10;
        if (this.field2444 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field2442[var6] != 0L) {
                    this.field2442[var6] += (long) this.field2444;
                }
            }
        }
        int var7 = 0;
        if (this.field2444 < arg2) {
            this.field2444 = arg2;
        }
        class159.method1130((long) this.field2444, 0);
        if (arg0 < 59) {
            return 50;
        }
        while (this.field2445 < 256) {
            var7++;
            this.field2445 += this.field2443;
        }
        this.field2445 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static void method975(byte arg0) {
        if (arg0 <= 123) {
            method972((byte) -58, -46);
        }
        field2433 = null;
        field2436 = null;
        field2440 = null;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
    public class140() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2442[var1] = this.field2438;
        }
    }
}
