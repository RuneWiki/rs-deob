import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class524 extends class715 {

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "J")
    private long field7050 = 0L;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "[J")
    private long[] field7051 = new long[10];

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    private int field7052 = 1;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "J")
    private long field7054 = 0L;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "J")
    private long field7055 = 0L;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    private int field7053 = 0;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)J")
    private final long method2909(int arg0) {
        long var2 = class538.method2963(-47) * 1000000L;
        long var4 = var2 - this.field7055;
        this.field7055 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7051[this.field7053] = var4;
            this.field7053 = (this.field7053 + 1) % 10;
            if (this.field7052 < 10) {
                this.field7052++;
            }
        }
        long var6 = (long) arg0;
        for (int var8 = 1; var8 <= this.field7052; var8++) {
            var6 += this.field7051[(this.field7053 + 10 - var8) % 10];
        }
        return var6 / (long) this.field7052;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)J")
    public final long method68(byte arg0) {
        if (arg0 >= -80) {
            this.field7055 = 38L;
        }
        this.field7054 += this.method2909(0);
        return this.field7054 < this.field7050 ? (this.field7050 - this.field7054) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
    public final void method67(boolean arg0) {
        this.field7055 = 0L;
        if (this.field7054 < this.field7050) {
            this.field7054 += this.field7050 - this.field7054;
        }
        if (arg0) {
            this.method70((byte) 9);
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(IJ)I")
    public final int method69(int arg0, long arg1) {
        if (arg0 <= 117) {
            return 55;
        } else if (this.field7054 < this.field7050) {
            this.field7055 += this.field7050 - this.field7054;
            this.field7054 += this.field7050 - this.field7054;
            this.field7050 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                this.field7050 += arg1;
                var4++;
            } while (var4 < 10 && this.field7054 > this.field7050);
            if (this.field7054 > this.field7050) {
                this.field7050 = this.field7054;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)J")
    public final long method70(byte arg0) {
        return arg0 <= 12 ? 77L : this.field7054;
    }
}
