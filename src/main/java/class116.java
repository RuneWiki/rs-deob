import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class116 extends class284 {

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "J")
    private long field1490 = 0L;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "[J")
    private long[] field1489 = new long[10];

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "J")
    private long field1488 = 0L;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    private int field1491 = 1;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
    private int field1492 = 0;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "J")
    private long field1493 = 0L;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)J", line = 4)
    public final long method702(int arg0) {
        if (arg0 != 3) {
            this.method706(true);
        }
        return this.field1493;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V", line = 15)
    public final void method703(int arg0) {
        if (this.field1493 < this.field1488) {
            this.field1493 += this.field1488 - this.field1493;
        }
        if (arg0 != -19014) {
            this.method705((byte) 89);
        }
        this.field1490 = 0L;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IJ)I", line = 28)
    public final int method704(int arg0, long arg1) {
        if (arg0 != -65536) {
            this.field1490 = 112L;
        }
        if (this.field1493 < this.field1488) {
            this.field1490 += this.field1488 - this.field1493;
            this.field1493 += this.field1488 - this.field1493;
            this.field1488 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field1488 += arg1;
            var4++;
        } while (var4 < 10 && this.field1488 < this.field1493);
        if (this.field1488 < this.field1493) {
            this.field1488 = this.field1493;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)J", line = 65)
    private final long method705(byte arg0) {
        long var2 = class669.method3713(0) * 1000000L;
        long var4 = var2 - this.field1490;
        this.field1490 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1489[this.field1492] = var4;
            if (this.field1491 < 10) {
                this.field1491++;
            }
            this.field1492 = (this.field1492 + 1) % 10;
        }
        long var6 = 0L;
        int var8 = 1;
        if (arg0 != -126) {
            return 68L;
        }
        while (var8 <= this.field1491) {
            var6 += this.field1489[(this.field1492 + 10 - var8) % 10];
            var8++;
        }
        return var6 / (long) this.field1491;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)J", line = 112)
    public final long method706(boolean arg0) {
        if (arg0) {
            this.field1493 += this.method705((byte) -126);
            return this.field1493 < this.field1488 ? (this.field1488 - this.field1493) / 1000000L : 0L;
        } else {
            return -51L;
        }
    }
}
