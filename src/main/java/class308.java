import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class308 extends class457 {

    @OriginalMember(owner = "client!uca", name = "h", descriptor = "J")
    private long field3940 = 0L;

    @OriginalMember(owner = "client!uca", name = "i", descriptor = "J")
    private long field3941 = 0L;

    @OriginalMember(owner = "client!uca", name = "k", descriptor = "J")
    private long field3943 = 0L;

    @OriginalMember(owner = "client!uca", name = "l", descriptor = "I")
    private int field3944 = 1;

    @OriginalMember(owner = "client!uca", name = "m", descriptor = "[J")
    private long[] field3945 = new long[10];

    @OriginalMember(owner = "client!uca", name = "j", descriptor = "I")
    private int field3942 = 0;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)J", line = 3)
    public final long method1219(int arg0) {
        if (arg0 != -18641) {
            this.method1805(-99);
        }
        return this.field3941;
    }

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "(I)J", line = 14)
    public final long method1218(int arg0) {
        this.field3941 += this.method1805(arg0 ^ 0xC4E);
        if (arg0 != -3152) {
            this.field3945 = null;
        }
        return this.field3940 > this.field3941 ? (this.field3940 - this.field3941) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "()V", line = 103)
    public class308() {
        this.field3940 = this.field3941 = jagmisc.nanoTime();
        if (this.field3941 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "(I)J", line = 33)
    private final long method1805(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field3943;
        this.field3943 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3945[this.field3942] = var4;
            this.field3942 = (this.field3942 + 1) % 10;
            if (this.field3944 < 1) {
                this.field3944++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field3944; var8++) {
            var6 += this.field3945[(this.field3942 + 10 - var8) % 10];
        }
        if (arg0 != -2) {
            this.method1215((byte) 75, 69L);
        }
        return var6 / (long) this.field3944;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(BJ)I", line = 68)
    public final int method1215(byte arg0, long arg1) {
        if (arg0 > -33) {
            return 68;
        } else if (this.field3940 > this.field3941) {
            this.field3943 += this.field3940 - this.field3941;
            this.field3941 += this.field3940 - this.field3941;
            this.field3940 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field3940 += arg1;
            } while (var4 < 10 && this.field3941 > this.field3940);
            if (this.field3941 > this.field3940) {
                this.field3940 = this.field3941;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(I)V", line = 131)
    public final void method1217(int arg0) {
        this.field3943 = 0L;
        if (this.field3940 > this.field3941) {
            this.field3941 += this.field3940 - this.field3941;
        }
        int var2 = -118 / ((54 - arg0) / 39);
    }
}
