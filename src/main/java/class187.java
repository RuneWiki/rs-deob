import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class187 extends class214 {

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "[J")
    private long[] field3208 = new long[10];

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    private int field3202 = 256;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    private int field3210 = 0;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    private int field3201 = 1;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "J")
    private long field3211 = class216.method1426(255);

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "[I")
    public static int[] field3200 = new int[50];

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public static int field3203 = 0;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "Lbe;")
    public static class283 field3212 = class153.method941(126, "gelb:");

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    private int field3206;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "Lcm;")
    public static class181 field3209;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V", line = 7)
    public final void method937(byte arg0) {
        field3204++;
        for (int var2 = 0; var2 < 10; var2++) {
            this.field3208[var2] = 0L;
        }
        if (arg0 >= -45) {
            this.field3211 = 108L;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BII)I", line = 40)
    public final int method936(byte arg0, int arg1, int arg2) {
        field3213++;
        int var4 = this.field3202;
        this.field3202 = 300;
        int var5 = this.field3201;
        this.field3201 = 1;
        this.field3211 = class216.method1426(arg0 + 221);
        if (this.field3208[this.field3206] == 0L) {
            this.field3201 = var5;
            this.field3202 = var4;
        } else if (this.field3211 > this.field3208[this.field3206]) {
            this.field3202 = (int) ((long) (arg1 * 2560) / (this.field3211 - this.field3208[this.field3206]));
        }
        if (this.field3202 < 25) {
            this.field3202 = 25;
        }
        if (this.field3202 > 256) {
            this.field3202 = 256;
            this.field3201 = (int) ((long) arg1 - ((this.field3211 - this.field3208[this.field3206]) / 10L));
        }
        if (arg0 != 34) {
            return 29;
        }
        if (this.field3201 > arg1) {
            this.field3201 = arg1;
        }
        this.field3208[this.field3206] = this.field3211;
        this.field3206 = (this.field3206 + 1) % 10;
        if (this.field3201 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field3208[var6] != 0L) {
                    this.field3208[var6] += (long) this.field3201;
                }
            }
        }
        if (this.field3201 < arg2) {
            this.field3201 = arg2;
        }
        class2.method11((byte) -20, (long) this.field3201);
        int var7 = 0;
        while (this.field3210 < 256) {
            this.field3210 += this.field3202;
            var7++;
        }
        this.field3210 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIII)V", line = 117)
    public static final void method1225(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3207++;
        class228.field3831.field3905 = 0;
        class228.field3831.method1499(true, 47);
        class228.field3831.method1499(true, arg0);
        class228.field3831.method1499(true, arg4);
        class228.field3831.method1510((byte) 34, arg2);
        class228.field3831.method1510((byte) 89, arg1);
        class166.field2773 = 0;
        class2.field20 = -3;
        class194.field3316 = 1;
        class62.field862 = arg3;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)V", line = 135)
    public static void method1226(byte arg0) {
        field3212 = null;
        field3200 = null;
        if (arg0 == -27) {
            field3209 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V", line = 166)
    public class187() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field3208[var1] = this.field3211;
        }
    }
}
