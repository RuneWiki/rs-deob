import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class201 extends class212 {

    @OriginalMember(owner = "client!el", name = "l", descriptor = "[J")
    private long[] field3549 = new long[10];

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    private int field3553 = 1;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    private int field3554 = 256;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    private int field3555 = 0;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "J")
    private long field3550 = class53.method405(65);

    @OriginalMember(owner = "client!el", name = "k", descriptor = "Lqk;")
    public static class207 field3548 = class24.method212(255, "");

    @OriginalMember(owner = "client!el", name = "n", descriptor = "Lqk;")
    public static class207 field3551 = class24.method212(255, "um");

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    public static int field3558 = 0;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    private int field3557;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
    public static void method1398(boolean arg0) {
        field3551 = null;
        if (arg0) {
            method1398(false);
        }
        field3548 = null;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
    public final void method258(int arg0) {
        if (arg0 != 2047) {
            method1398(false);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field3549[var2] = 0L;
        }
        field3552++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIZ)I")
    public final int method257(int arg0, int arg1, boolean arg2) {
        field3547++;
        int var4 = this.field3553;
        this.field3553 = 1;
        int var5 = this.field3554;
        this.field3554 = 300;
        this.field3550 = class53.method405(56);
        if (this.field3549[this.field3557] == 0L) {
            this.field3554 = var5;
            this.field3553 = var4;
        } else if (this.field3550 > this.field3549[this.field3557]) {
            this.field3554 = (int) ((long) (arg0 * 2560) / (this.field3550 - this.field3549[this.field3557]));
        }
        if (this.field3554 < 25) {
            this.field3554 = 25;
        }
        if (this.field3554 > 256) {
            this.field3554 = 256;
            this.field3553 = (int) ((long) arg0 - (this.field3550 - this.field3549[this.field3557]) / 10L);
        }
        if (arg0 < this.field3553) {
            this.field3553 = arg0;
        }
        this.field3549[this.field3557] = this.field3550;
        this.field3557 = (this.field3557 + 1) % 10;
        if (this.field3553 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field3549[var6] != 0L) {
                    this.field3549[var6] += (long) this.field3553;
                }
            }
        }
        if (!arg2) {
            return 84;
        }
        if (arg1 > this.field3553) {
            this.field3553 = arg1;
        }
        int var7 = 0;
        class153.method1098((byte) 76, (long) this.field3553);
        while (this.field3555 < 256) {
            var7++;
            this.field3555 += this.field3554;
        }
        this.field3555 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
    public class201() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field3549[var1] = this.field3550;
        }
    }
}
