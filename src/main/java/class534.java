import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class534 extends class416 {

    @OriginalMember(owner = "client!as", name = "h", descriptor = "J")
    private long field7846 = 0L;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "J")
    private long field7845 = 0L;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "J")
    private long field7847 = 0L;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "[J")
    private long[] field7848 = new long[10];

    @OriginalMember(owner = "client!as", name = "k", descriptor = "I")
    private int field7849 = 1;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "I")
    private int field7850 = 0;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(JI)I")
    public final int method1352(long arg0, int arg1) {
        if (arg1 != 12889) {
            return -83;
        } else if (this.field7845 > this.field7846) {
            this.field7847 += this.field7845 - this.field7846;
            this.field7846 += this.field7845 - this.field7846;
            this.field7845 += arg0;
            return 1;
        } else {
            int var4 = 0;
            do {
                this.field7845 += arg0;
                var4++;
            } while (var4 < 10 && this.field7845 < this.field7846);
            if (this.field7845 < this.field7846) {
                this.field7845 = this.field7846;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)J")
    public final long method1353(int arg0) {
        this.field7846 += this.method3089((byte) 99);
        if (this.field7845 <= this.field7846) {
            if (arg0 != 0) {
                this.field7847 = 90L;
            }
            return 0L;
        } else {
            return (this.field7845 - this.field7846) / 1000000L;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)J")
    public final long method1351(int arg0) {
        return arg0 == 0 ? this.field7846 : 100L;
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(B)V")
    public final void method1355(byte arg0) {
        this.field7847 = 0L;
        if (this.field7845 > this.field7846) {
            this.field7846 += this.field7845 - this.field7846;
        }
        if (arg0 != 114) {
            this.field7849 = 14;
        }
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(B)J")
    private final long method3089(byte arg0) {
        long var2 = System.nanoTime();
        if (arg0 < 79) {
            return 77L;
        }
        long var4 = var2 - this.field7847;
        this.field7847 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7848[this.field7850] = var4;
            if (this.field7849 < 1) {
                this.field7849++;
            }
            this.field7850 = (this.field7850 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field7849; var8++) {
            var6 += this.field7848[(this.field7850 + 10 - var8) % 10];
        }
        return var6 / (long) this.field7849;
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "()V")
    public class534() {
        this.field7846 = System.nanoTime();
        this.field7845 = System.nanoTime();
    }
}
