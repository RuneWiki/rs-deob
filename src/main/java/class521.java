import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class521 extends class62 {

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "J")
    private long field7724 = 0L;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "J")
    private long field7725 = 0L;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "[J")
    private long[] field7726 = new long[10];

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    private int field7728 = 1;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    private int field7727 = 0;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "J")
    private long field7729 = 0L;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V", line = 4)
    public final void method387(byte arg0) {
        if (arg0 != 36) {
            this.method392(-34L, -101);
        }
        this.field7729 = 0L;
        if (this.field7725 > this.field7724) {
            this.field7724 += this.field7725 - this.field7724;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)J", line = 18)
    public final long method393(boolean arg0) {
        if (arg0) {
            this.method393(true);
        }
        this.field7724 += this.method3088((byte) 125);
        return this.field7724 < this.field7725 ? (this.field7725 - this.field7724) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)J", line = 36)
    private final long method3088(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field7729;
        this.field7729 = var2;
        if (arg0 <= 123) {
            return 104L;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7726[this.field7727] = var4;
            if (this.field7728 < 1) {
                this.field7728++;
            }
            this.field7727 = (this.field7727 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field7728; var8++) {
            var6 += this.field7726[(this.field7727 + 10 - var8) % 10];
        }
        return var6 / (long) this.field7728;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(JI)I", line = 70)
    public final int method392(long arg0, int arg1) {
        int var4 = 14 % ((arg1 - 44) / 53);
        if (this.field7724 < this.field7725) {
            this.field7729 += this.field7725 - this.field7724;
            this.field7724 += this.field7725 - this.field7724;
            this.field7725 += arg0;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field7725 += arg0;
        } while (var5 < 10 && this.field7725 < this.field7724);
        if (this.field7725 < this.field7724) {
            this.field7725 = this.field7724;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V", line = 116)
    public class521() {
        this.field7724 = System.nanoTime();
        this.field7725 = System.nanoTime();
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)J", line = 104)
    public final long method391(int arg0) {
        return arg0 == -24244 ? this.field7724 : -58L;
    }
}
