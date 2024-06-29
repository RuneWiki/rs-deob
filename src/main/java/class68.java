import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class68 extends class144 {

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "J")
    private long field1125 = 0L;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    private int field1124 = 1;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "[J")
    private long[] field1128 = new long[10];

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    private int field1129 = 0;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "J")
    private long field1127 = 0L;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "J")
    private long field1126 = 0L;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)J", line = 3)
    private final long method534(int arg0) {
        long var2 = class165.method1188((byte) 26) * 1000000L;
        long var4 = var2 - this.field1125;
        this.field1125 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1128[this.field1129] = var4;
            this.field1129 = (this.field1129 + 1) % 10;
            if (this.field1124 < 10) {
                this.field1124++;
            }
        }
        long var6 = 0L;
        if (arg0 == 10) {
            for (int var8 = 1; var8 <= this.field1124; var8++) {
                var6 += this.field1128[(this.field1129 + 10 - var8) % 10];
            }
            return var6 / (long) this.field1124;
        } else {
            return 123L;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V", line = 36)
    public final void method535(byte arg0) {
        int var2 = -16 % ((arg0 + 65) / 52);
        if (this.field1126 < this.field1127) {
            this.field1126 += this.field1127 - this.field1126;
        }
        this.field1125 = 0L;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)I", line = 49)
    public final int method536(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        this.field1126 += this.method534(arg0 - 16711925);
        if (arg0 != 16711935) {
            this.method537(-113);
        }
        if (this.field1127 > this.field1126) {
            class477.method2826((this.field1127 - this.field1126) / 1000000L, 0);
            this.field1125 += this.field1127 - this.field1126;
            this.field1126 += this.field1127 - this.field1126;
            this.field1127 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field1127 += var3;
        } while (var5 < 10 && this.field1127 < this.field1126);
        if (this.field1127 < this.field1126) {
            this.field1127 = this.field1126;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)J", line = 95)
    public final long method537(int arg0) {
        if (arg0 != 16711935) {
            this.method534(-30);
        }
        return this.field1126;
    }
}
