import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class554 extends class427 {

    @OriginalMember(owner = "client!ou", name = "i", descriptor = "J")
    private long field7505 = 0L;

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "J")
    private long field7504 = 0L;

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "I")
    private int field7506 = 0;

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "I")
    private int field7509 = 1;

    @OriginalMember(owner = "client!ou", name = "k", descriptor = "[J")
    private long[] field7507 = new long[10];

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "J")
    private long field7508 = 0L;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(JI)I")
    public final int method1059(long arg0, int arg1) {
        int var4 = 105 % ((arg1 + 56) / 57);
        if (this.field7505 < this.field7504) {
            this.field7508 += this.field7504 - this.field7505;
            this.field7505 += this.field7504 - this.field7505;
            this.field7504 += arg0;
            return 1;
        }
        int var5 = 0;
        do {
            this.field7504 += arg0;
            var5++;
        } while (var5 < 10 && this.field7504 < this.field7505);
        if (this.field7504 < this.field7505) {
            this.field7504 = this.field7505;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)J")
    public final long method1061(byte arg0) {
        this.field7505 += this.method3042(11454);
        if (arg0 != 73) {
            this.field7506 = -10;
        }
        return this.field7504 > this.field7505 ? (this.field7504 - this.field7505) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "(I)J")
    private final long method3042(int arg0) {
        long var2 = class680.method3756(arg0 - 11508) * 1000000L;
        long var4 = var2 - this.field7508;
        this.field7508 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7507[this.field7506] = var4;
            if (this.field7509 < 10) {
                this.field7509++;
            }
            this.field7506 = (this.field7506 + 1) % 10;
        }
        long var6 = 0L;
        int var8 = 1;
        if (arg0 != 11454) {
            this.method3042(118);
        }
        while (this.field7509 >= var8) {
            var6 += this.field7507[(this.field7506 + 10 - var8) % 10];
            var8++;
        }
        return var6 / (long) this.field7509;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)J")
    public final long method1060(int arg0) {
        if (arg0 != 73) {
            this.field7505 = -67L;
        }
        return this.field7505;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
    public final void method1062(int arg0) {
        if (arg0 != 20054) {
            this.field7507 = null;
        }
        if (this.field7504 > this.field7505) {
            this.field7505 += this.field7504 - this.field7505;
        }
        this.field7508 = 0L;
    }
}
