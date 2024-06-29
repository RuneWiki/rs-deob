import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class528 extends class47 {

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "J")
    private long field7307 = 0L;

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "J")
    private long field7306 = 0L;

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "J")
    private long field7308 = 0L;

    @OriginalMember(owner = "client!iw", name = "g", descriptor = "I")
    private int field7309 = 0;

    @OriginalMember(owner = "client!iw", name = "h", descriptor = "[J")
    private long[] field7310 = new long[10];

    @OriginalMember(owner = "client!iw", name = "i", descriptor = "I")
    private int field7311 = 1;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)J")
    private final long method2981(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field7308;
        this.field7308 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7310[this.field7309] = var4;
            if (this.field7311 < 1) {
                this.field7311++;
            }
            this.field7309 = (this.field7309 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field7311; var8++) {
            var6 += this.field7310[(this.field7309 + 10 - var8) % 10];
        }
        if (arg0 != 21) {
            this.field7310 = null;
        }
        return var6 / (long) this.field7311;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IJ)I")
    public final int method247(int arg0, long arg1) {
        if (arg0 != 3) {
            this.field7311 = -86;
        }
        if (this.field7307 > this.field7306) {
            this.field7308 += this.field7307 - this.field7306;
            this.field7306 += this.field7307 - this.field7306;
            this.field7307 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field7307 += arg1;
        } while (var4 < 10 && this.field7306 > this.field7307);
        if (this.field7306 > this.field7307) {
            this.field7307 = this.field7306;
        }
        return var4;
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)J")
    public final long method251(int arg0) {
        int var2 = -46 / ((-arg0 - 75) / 47);
        this.field7306 += this.method2981((byte) 21);
        return this.field7307 > this.field7306 ? (this.field7307 - this.field7306) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Z)V")
    public final void method249(boolean arg0) {
        if (!arg0) {
            this.field7308 = 0L;
            if (this.field7307 > this.field7306) {
                this.field7306 += this.field7307 - this.field7306;
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)J")
    public final long method250(int arg0) {
        if (arg0 >= -33) {
            this.method251(-76);
        }
        return this.field7306;
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "()V")
    public class528() {
        this.field7307 = this.field7306 = jagmisc.nanoTime();
        if (this.field7306 == 0L) {
            throw new RuntimeException();
        }
    }
}
