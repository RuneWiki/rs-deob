import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class488 extends class7 {

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "J")
    private long field7019 = 0L;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "J")
    private long field7018 = 0L;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "[J")
    private long[] field7020 = new long[10];

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "J")
    private long field7023 = 0L;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    private int field7021 = 0;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    private int field7022 = 1;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)J", line = 6)
    private final long method3703(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field7023;
        this.field7023 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7020[this.field7021] = var4;
            this.field7021 = (this.field7021 + 1) % 10;
            if (this.field7022 < 1) {
                this.field7022++;
            }
        }
        long var6 = 0L;
        if (arg0 != 8) {
            this.field7020 = null;
        }
        for (int var8 = 1; var8 <= this.field7022; var8++) {
            var6 += this.field7020[(this.field7021 + 10 - var8) % 10];
        }
        return var6 / (long) this.field7022;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)J", line = 37)
    public final long method49(int arg0) {
        this.field7019 += this.method3703((byte) 8);
        if (this.field7018 > this.field7019) {
            return (this.field7018 - this.field7019) / 1000000L;
        } else {
            if (arg0 != -9305) {
                this.field7023 = -109L;
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)J", line = 53)
    public final long method45(int arg0) {
        if (arg0 != 0) {
            this.method46(false);
        }
        return this.field7019;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZJ)I", line = 63)
    public final int method52(boolean arg0, long arg1) {
        if (arg0) {
            this.field7019 = -97L;
        }
        if (this.field7018 > this.field7019) {
            this.field7023 += this.field7018 - this.field7019;
            this.field7019 += this.field7018 - this.field7019;
            this.field7018 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field7018 += arg1;
            var4++;
        } while (var4 < 10 && this.field7019 > this.field7018);
        if (this.field7019 > this.field7018) {
            this.field7018 = this.field7019;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V", line = 115)
    public class488() {
        this.field7019 = System.nanoTime();
        this.field7018 = System.nanoTime();
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V", line = 100)
    public final void method46(boolean arg0) {
        if (this.field7018 > this.field7019) {
            this.field7019 += this.field7018 - this.field7019;
        }
        this.field7023 = 0L;
        if (arg0) {
            this.field7020 = null;
        }
    }
}
