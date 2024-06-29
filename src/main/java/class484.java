import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class484 extends class71 {

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "J")
    private long field6979 = 0L;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "J")
    private long field6980 = 0L;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    private int field6982 = 0;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    private int field6983 = 1;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "[J")
    private long[] field6984 = new long[10];

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "J")
    private long field6981 = 0L;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V", line = 4)
    public final void method369(byte arg0) {
        if (this.field6979 > this.field6980) {
            this.field6980 += this.field6979 - this.field6980;
        }
        this.field6981 = 0L;
        int var2 = 70 % ((arg0 - 12) / 60);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(JZ)I", line = 17)
    public final int method371(long arg0, boolean arg1) {
        if (arg1) {
            return -73;
        } else if (this.field6980 < this.field6979) {
            this.field6981 += this.field6979 - this.field6980;
            this.field6980 += this.field6979 - this.field6980;
            this.field6979 += arg0;
            return 1;
        } else {
            int var4 = 0;
            do {
                this.field6979 += arg0;
                var4++;
            } while (var4 < 10 && this.field6980 > this.field6979);
            if (this.field6979 < this.field6980) {
                this.field6979 = this.field6980;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)J", line = 52)
    public final long method370(int arg0) {
        int var2 = 28 % ((39 - arg0) / 60);
        return this.field6980;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)J", line = 60)
    public final long method374(int arg0) {
        if (arg0 == -1913) {
            this.field6980 += this.method2796(10);
            return this.field6980 < this.field6979 ? (this.field6979 - this.field6980) / 1000000L : 0L;
        } else {
            return 54L;
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)J", line = 78)
    private final long method2796(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field6981;
        this.field6981 = var2;
        if (arg0 != 10) {
            this.field6982 = 54;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6984[this.field6982] = var4;
            if (this.field6983 < 1) {
                this.field6983++;
            }
            this.field6982 = (this.field6982 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field6983; var8++) {
            var6 += this.field6984[(this.field6982 + 10 - var8) % 10];
        }
        return var6 / (long) this.field6983;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V", line = 115)
    public class484() {
        this.field6980 = System.nanoTime();
        this.field6979 = System.nanoTime();
    }
}
