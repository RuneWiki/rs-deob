import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class225 extends class190 {

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "J")
    private long field3712 = 0L;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "J")
    private long field3714 = 0L;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    private int field3713 = 0;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "J")
    private long field3716 = 0L;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "[J")
    private long[] field3717 = new long[10];

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    private int field3715 = 1;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)J", line = 4)
    public final long method39(byte arg0) {
        if (arg0 != -32) {
            this.method1701((byte) 72);
        }
        return this.field3716;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V", line = 15)
    public final void method37(byte arg0) {
        this.field3714 = 0L;
        if (this.field3712 > this.field3716) {
            this.field3716 += this.field3712 - this.field3716;
        }
        if (arg0 != -105) {
            this.field3717 = (long[]) null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(B)J", line = 30)
    private final long method1701(byte arg0) {
        long var2 = class47.method371(-115) * 1000000L;
        long var4 = var2 - this.field3714;
        long var6 = 0L;
        this.field3714 = var2;
        if (arg0 <= 53) {
            return -37L;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3717[this.field3713] = var4;
            if (this.field3715 < 10) {
                this.field3715++;
            }
            this.field3713 = (this.field3713 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field3715; var8++) {
            var6 += this.field3717[(this.field3713 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3715;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIB)I", line = 73)
    public final int method36(int arg0, int arg1, byte arg2) {
        if (arg2 < 57) {
            return 84;
        }
        class283.method2076((byte) -115, (long) arg1);
        this.field3716 += this.method1701((byte) 71);
        long var4 = (long) arg0 * 1000000L;
        if (this.field3712 > this.field3716) {
            class283.method2076((byte) -121, (this.field3712 - this.field3716) / 1000000L);
            this.field3714 += this.field3712 - this.field3716;
            this.field3716 += this.field3712 - this.field3716;
            this.field3712 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field3712 += var4;
            var6++;
        } while (var6 < 10 && this.field3712 < this.field3716);
        if (this.field3716 > this.field3712) {
            this.field3712 = this.field3716;
        }
        return var6;
    }
}
