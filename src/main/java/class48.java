import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class48 extends class137 {

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "[J")
    private long[] field698 = new long[10];

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    private int field694 = 1;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    private int field692 = 256;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    private int field689 = 0;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "J")
    private long field699 = class134.method924(false);

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    private int field693;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "[[[B")
    public static byte[][][] field690;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
    public final void method352(boolean arg0) {
        if (arg0) {
            field697++;
            for (int var2 = 0; var2 < 10; var2++) {
                this.field698[var2] = 0L;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)I")
    public final int method353(int arg0, int arg1, int arg2) {
        field691++;
        int var4 = this.field692;
        this.field692 = 300;
        int var5 = this.field694;
        this.field694 = 1;
        if (arg0 != 2) {
            this.field692 = 85;
        }
        this.field699 = class134.method924(false);
        if (this.field698[this.field693] == 0L) {
            this.field692 = var4;
            this.field694 = var5;
        } else if (this.field699 > this.field698[this.field693]) {
            this.field692 = (int) ((long) (arg2 * 2560) / (this.field699 - this.field698[this.field693]));
        }
        if (this.field692 < 25) {
            this.field692 = 25;
        }
        if (this.field692 > 256) {
            this.field692 = 256;
            this.field694 = (int) ((long) arg2 - ((this.field699 - this.field698[this.field693]) / 10L));
        }
        if (this.field694 > arg2) {
            this.field694 = arg2;
        }
        this.field698[this.field693] = this.field699;
        this.field693 = (this.field693 + 1) % 10;
        if (this.field694 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field698[var6] != 0L) {
                    this.field698[var6] += (long) this.field694;
                }
            }
        }
        if (this.field694 < arg1) {
            this.field694 = arg1;
        }
        class150.method1011((byte) 41, (long) this.field694);
        int var7 = 0;
        while (this.field689 < 256) {
            var7++;
            this.field689 += this.field692;
        }
        this.field689 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public static void method354(int arg0) {
        if (arg0 == -257) {
            field690 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
    public class48() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field698[var1] = this.field699;
        }
    }
}
