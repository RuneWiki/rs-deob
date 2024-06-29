import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class283 extends class47 {

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "J")
    private long field3729 = 0L;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "J")
    private long field3726 = 0L;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "J")
    private long field3727 = 0L;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "[J")
    private long[] field3728 = new long[10];

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    private int field3730 = 0;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    private int field3731 = 1;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)J", line = 4)
    private final long method1677(int arg0) {
        long var2 = class529.method2982((byte) -69) * 1000000L;
        long var4 = var2 - this.field3727;
        if (arg0 != -17416) {
            return 89L;
        }
        this.field3727 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3728[this.field3730] = var4;
            this.field3730 = (this.field3730 + 1) % 10;
            if (this.field3731 < 10) {
                this.field3731++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field3731; var8++) {
            var6 += this.field3728[(this.field3730 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3731;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IJ)I", line = 40)
    public final int method247(int arg0, long arg1) {
        if (arg0 != 3) {
            this.method1677(72);
        }
        if (this.field3729 < this.field3726) {
            this.field3727 += this.field3726 - this.field3729;
            this.field3729 += this.field3726 - this.field3729;
            this.field3726 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field3726 += arg1;
            var4++;
        } while (var4 < 10 && this.field3729 > this.field3726);
        if (this.field3729 > this.field3726) {
            this.field3726 = this.field3729;
        }
        return var4;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)J", line = 73)
    public final long method250(int arg0) {
        if (arg0 > -33) {
            this.method247(106, 71L);
        }
        return this.field3729;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)J", line = 89)
    public final long method251(int arg0) {
        this.field3729 += this.method1677(-17416);
        if (this.field3729 < this.field3726) {
            return (this.field3726 - this.field3729) / 1000000L;
        } else {
            int var2 = -28 % ((-arg0 - 75) / 47);
            return 0L;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V", line = 107)
    public final void method249(boolean arg0) {
        if (this.field3729 < this.field3726) {
            this.field3729 += this.field3726 - this.field3729;
        }
        if (arg0) {
            this.field3729 = 11L;
        }
        this.field3727 = 0L;
    }
}
