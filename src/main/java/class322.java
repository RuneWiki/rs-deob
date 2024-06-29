import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class322 extends class124 {

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    private int field4539 = 1;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "J")
    private long field4544 = 0L;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    private int field4542 = 0;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "J")
    private long field4541 = 0L;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "[J")
    private long[] field4540 = new long[10];

    @OriginalMember(owner = "client!md", name = "k", descriptor = "J")
    private long field4543 = 0L;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)J", line = 4)
    public final long method299(byte arg0) {
        if (arg0 != -95) {
            this.method301(58);
        }
        return this.field4541;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(B)J", line = 15)
    private final long method1995(byte arg0) {
        long var2 = class203.method1299((byte) 5) * 1000000L;
        long var4 = var2 - this.field4544;
        this.field4544 = var2;
        if (arg0 > -13) {
            return 46L;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4540[this.field4542] = var4;
            this.field4542 = (this.field4542 + 1) % 10;
            if (this.field4539 < 10) {
                this.field4539++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field4539; var8++) {
            var6 += this.field4540[(this.field4542 + 10 - var8) % 10];
        }
        return var6 / (long) this.field4539;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)I", line = 53)
    public final int method300(int arg0, int arg1) {
        this.field4541 += this.method1995((byte) -119);
        if (arg1 != 6223) {
            this.method300(-74, 40);
        }
        long var3 = (long) arg0 * 1000000L;
        if (this.field4541 < this.field4543) {
            class278.method1757((this.field4543 - this.field4541) / 1000000L, 0);
            this.field4544 += this.field4543 - this.field4541;
            this.field4541 += this.field4543 - this.field4541;
            this.field4543 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field4543 += var3;
            var5++;
        } while (var5 < 10 && this.field4543 < this.field4541);
        if (this.field4541 > this.field4543) {
            this.field4543 = this.field4541;
        }
        return var5;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V", line = 98)
    public final void method301(int arg0) {
        this.field4544 = 0L;
        if (this.field4543 > this.field4541) {
            this.field4541 += this.field4543 - this.field4541;
        }
        if (arg0 != -1) {
            this.method301(-12);
        }
    }
}
