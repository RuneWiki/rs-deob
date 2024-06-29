import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class190 extends class464 {

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "J")
    private long field3157 = 0L;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "J")
    private long field3158 = 0L;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    private int field3156 = 1;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "J")
    private long field3159 = 0L;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    private int field3160 = 0;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "[J")
    private long[] field3161 = new long[10];

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)J", line = 4)
    public final long method445(int arg0) {
        return arg0 <= 42 ? 14L : this.field3157;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)V", line = 15)
    public final void method442(int arg0) {
        if (this.field3159 > this.field3157) {
            this.field3157 += this.field3159 - this.field3157;
        }
        this.field3158 = 0L;
        if (arg0 != -201) {
            this.field3159 = 42L;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)J", line = 31)
    public final long method446(int arg0) {
        this.field3157 += this.method1524(0);
        if (this.field3159 > this.field3157) {
            return (this.field3159 - this.field3157) / 1000000L;
        } else {
            if (arg0 >= -1) {
                this.field3158 = -127L;
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(JI)I", line = 47)
    public final int method444(long arg0, int arg1) {
        if (arg1 != 20359) {
            this.method445(89);
        }
        if (this.field3157 < this.field3159) {
            this.field3158 += this.field3159 - this.field3157;
            this.field3157 += this.field3159 - this.field3157;
            this.field3159 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field3159 += arg0;
        } while (var4 < 10 && this.field3157 > this.field3159);
        if (this.field3159 < this.field3157) {
            this.field3159 = this.field3157;
        }
        return var4;
    }

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)J", line = 93)
    private final long method1524(int arg0) {
        long var2 = class112.method1033(-11752) * 1000000L;
        long var4 = var2 - this.field3158;
        this.field3158 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3161[this.field3160] = var4;
            this.field3160 = (this.field3160 + 1) % 10;
            if (this.field3156 < 10) {
                this.field3156++;
            }
        }
        long var6 = (long) arg0;
        for (int var8 = 1; var8 <= this.field3156; var8++) {
            var6 += this.field3161[(this.field3160 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3156;
    }
}
