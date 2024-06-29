import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class321 extends class20 {

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "[J")
    private long[] field5491 = new long[10];

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    private int field5497 = 1;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    private int field5500 = 256;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    private int field5492 = 0;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "J")
    private long field5499 = class118.method835(-1272);

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "Lsf;")
    public static class108 field5498 = class140.method973(255, ")2");

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    private int field5495;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "[I")
    public static int[] field5494;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)V", line = 10)
    public static final void method2220(byte arg0) {
        field5493++;
        class256.field4471.method1427(21, 0);
        class100.field1765++;
        class256.field4471.method1759(-32768, class281.method2020((byte) -31));
        class256.field4471.method1724(false, class73.field1110);
        class256.field4471.method1724(false, class21.field331);
        class256.field4471.method1759(arg0 - 32669, class184.field3372);
        if (arg0 != -99) {
            method2221(-95);
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 171)
    public class321() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field5491[var1] = this.field5499;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V", line = 44)
    public final void method138(byte arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            this.field5491[var2] = 0L;
        }
        if (arg0 != -82) {
            method2221(-57);
        }
        field5490++;
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V", line = 66)
    public static void method2221(int arg0) {
        field5498 = null;
        if (arg0 != 10) {
            field5498 = (class108) null;
        }
        field5494 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)I", line = 80)
    public final int method141(int arg0, int arg1, int arg2) {
        field5496++;
        int var4 = this.field5497;
        this.field5497 = 1;
        int var5 = this.field5500;
        this.field5500 = 300;
        if (arg0 != -4) {
            method2221(121);
        }
        this.field5499 = class118.method835(-1272);
        if (this.field5491[this.field5495] == 0L) {
            this.field5497 = var4;
            this.field5500 = var5;
        } else if (this.field5499 > this.field5491[this.field5495]) {
            this.field5500 = (int) ((long) (arg1 * 2560) / (this.field5499 - this.field5491[this.field5495]));
        }
        if (this.field5500 < 25) {
            this.field5500 = 25;
        }
        if (this.field5500 > 256) {
            this.field5500 = 256;
            this.field5497 = (int) ((long) arg1 - ((this.field5499 - this.field5491[this.field5495]) / 10L));
        }
        if (arg1 < this.field5497) {
            this.field5497 = arg1;
        }
        this.field5491[this.field5495] = this.field5499;
        this.field5495 = (this.field5495 + 1) % 10;
        if (this.field5497 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field5491[var6] != 0L) {
                    this.field5491[var6] += (long) this.field5497;
                }
            }
        }
        if (this.field5497 < arg2) {
            this.field5497 = arg2;
        }
        class83.method556((long) this.field5497, 125);
        int var7 = 0;
        while (this.field5492 < 256) {
            this.field5492 += this.field5500;
            var7++;
        }
        this.field5492 &= 0xFF;
        return var7;
    }
}
