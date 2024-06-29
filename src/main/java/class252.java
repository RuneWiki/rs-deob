import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class252 extends class276 {

    @OriginalMember(owner = "client!g", name = "i", descriptor = "J")
    private long field4018 = 0L;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "J")
    private long field4019 = 0L;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    private int field4021 = 1;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "[J")
    private long[] field4022 = new long[10];

    @OriginalMember(owner = "client!g", name = "n", descriptor = "J")
    private long field4023 = 0L;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    private int field4020 = 0;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(B)J")
    private final long method1700(byte arg0) {
        if (arg0 != 72) {
            this.field4022 = (long[]) null;
        }
        long var2 = System.nanoTime();
        long var4 = var2 - this.field4023;
        long var6 = 0L;
        this.field4023 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4022[this.field4020] = var4;
            if (this.field4021 < 1) {
                this.field4021++;
            }
            this.field4020 = (this.field4020 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field4021; var8++) {
            var6 += this.field4022[(this.field4020 + 10 - var8) % 10];
        }
        return var6 / (long) this.field4021;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)J")
    public final long method154(byte arg0) {
        return arg0 == 7 ? this.field4018 : -9L;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)I")
    public final int method152(int arg0, int arg1, int arg2) {
        class262.method1758((long) arg2, 29552);
        this.field4018 += this.method1700((byte) 72);
        long var4 = (long) arg0 * 1000000L;
        int var6 = -26 / ((-arg1 - 35) / 48);
        if (this.field4018 < this.field4019) {
            class262.method1758((this.field4019 - this.field4018) / 1000000L, 29552);
            this.field4023 += this.field4019 - this.field4018;
            this.field4018 += this.field4019 - this.field4018;
            this.field4019 += var4;
            return 1;
        }
        int var7 = 0;
        do {
            this.field4019 += var4;
            var7++;
        } while (var7 < 10 && this.field4018 > this.field4019);
        if (this.field4019 < this.field4018) {
            this.field4019 = this.field4018;
        }
        return var7;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class252() {
        this.field4018 = System.nanoTime();
        this.field4019 = System.nanoTime();
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public final void method151(int arg0) {
        if (this.field4018 < this.field4019) {
            this.field4018 += this.field4019 - this.field4018;
        }
        if (arg0 != 29051) {
            this.method154((byte) 82);
        }
        this.field4023 = 0L;
    }
}
