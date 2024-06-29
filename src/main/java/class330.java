import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class330 extends class457 {

    @OriginalMember(owner = "client!qaa", name = "j", descriptor = "I")
    private int field4193 = 1;

    @OriginalMember(owner = "client!qaa", name = "h", descriptor = "J")
    private long field4191 = 0L;

    @OriginalMember(owner = "client!qaa", name = "i", descriptor = "I")
    private int field4192 = 0;

    @OriginalMember(owner = "client!qaa", name = "l", descriptor = "[J")
    private long[] field4195 = new long[10];

    @OriginalMember(owner = "client!qaa", name = "k", descriptor = "J")
    private long field4194 = 0L;

    @OriginalMember(owner = "client!qaa", name = "m", descriptor = "J")
    private long field4196 = 0L;

    @OriginalMember(owner = "client!qaa", name = "d", descriptor = "(I)J", line = 5)
    public final long method1218(int arg0) {
        this.field4191 += this.method1943((byte) 86);
        if (this.field4196 > this.field4191) {
            return (this.field4196 - this.field4191) / 1000000L;
        } else {
            if (arg0 != -3152) {
                this.method1219(-106);
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(BJ)I", line = 22)
    public final int method1215(byte arg0, long arg1) {
        if (arg0 >= -33) {
            return 90;
        } else if (this.field4196 > this.field4191) {
            this.field4194 += this.field4196 - this.field4191;
            this.field4191 += this.field4196 - this.field4191;
            this.field4196 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field4196 += arg1;
            } while (var4 < 10 && this.field4196 < this.field4191);
            if (this.field4191 > this.field4196) {
                this.field4196 = this.field4191;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "(I)V", line = 58)
    public final void method1217(int arg0) {
        this.field4194 = 0L;
        if (this.field4196 > this.field4191) {
            this.field4191 += this.field4196 - this.field4191;
        }
        int var2 = 116 / ((arg0 - 54) / 39);
    }

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(B)J", line = 71)
    private final long method1943(byte arg0) {
        if (arg0 < 67) {
            this.field4193 = 102;
        }
        long var2 = class97.method654((byte) 80) * 1000000L;
        long var4 = var2 - this.field4194;
        this.field4194 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4195[this.field4192] = var4;
            this.field4192 = (this.field4192 + 1) % 10;
            if (this.field4193 < 10) {
                this.field4193++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field4193; var8++) {
            var6 += this.field4195[(this.field4192 + 10 - var8) % 10];
        }
        return var6 / (long) this.field4193;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)J", line = 110)
    public final long method1219(int arg0) {
        if (arg0 != -18641) {
            this.method1215((byte) -4, 36L);
        }
        return this.field4191;
    }
}
