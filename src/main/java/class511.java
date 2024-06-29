import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class511 extends class416 {

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "J")
    private long field7203 = 0L;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    private int field7202 = 1;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "J")
    private long field7204 = 0L;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
    private int field7205 = 0;

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "[J")
    private long[] field7207 = new long[10];

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "J")
    private long field7206 = 0L;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(JI)I")
    public final int method1352(long arg0, int arg1) {
        if (arg1 != 12889) {
            this.method2896(-94);
        }
        if (this.field7206 < this.field7203) {
            this.field7204 += this.field7203 - this.field7206;
            this.field7206 += this.field7203 - this.field7206;
            this.field7203 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            this.field7203 += arg0;
            var4++;
        } while (var4 < 10 && this.field7203 < this.field7206);
        if (this.field7206 > this.field7203) {
            this.field7203 = this.field7206;
        }
        return var4;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)J")
    public final long method1353(int arg0) {
        if (arg0 != 0) {
            this.method2896(39);
        }
        this.field7206 += this.method2896(-91);
        return this.field7206 < this.field7203 ? (this.field7203 - this.field7206) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)V")
    public final void method1355(byte arg0) {
        if (arg0 != 114) {
            this.method1355((byte) -116);
        }
        if (this.field7206 < this.field7203) {
            this.field7206 += this.field7203 - this.field7206;
        }
        this.field7204 = 0L;
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)J")
    private final long method2896(int arg0) {
        long var2 = class60.method371(false) * 1000000L;
        if (arg0 > -9) {
            this.field7205 = 84;
        }
        long var4 = var2 - this.field7204;
        this.field7204 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7207[this.field7205] = var4;
            this.field7205 = (this.field7205 + 1) % 10;
            if (this.field7202 < 10) {
                this.field7202++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field7202; var8++) {
            var6 += this.field7207[(this.field7205 + 10 - var8) % 10];
        }
        return var6 / (long) this.field7202;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)J")
    public final long method1351(int arg0) {
        if (arg0 != 0) {
            this.field7203 = 63L;
        }
        return this.field7206;
    }
}
