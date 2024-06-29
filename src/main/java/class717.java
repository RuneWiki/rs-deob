import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class717 extends class610 {

    @OriginalMember(owner = "client!oda", name = "h", descriptor = "J")
    private long field9411 = 0L;

    @OriginalMember(owner = "client!oda", name = "i", descriptor = "J")
    private long field9412 = 0L;

    @OriginalMember(owner = "client!oda", name = "j", descriptor = "I")
    private int field9413 = 0;

    @OriginalMember(owner = "client!oda", name = "l", descriptor = "[J")
    private long[] field9415 = new long[10];

    @OriginalMember(owner = "client!oda", name = "k", descriptor = "J")
    private long field9414 = 0L;

    @OriginalMember(owner = "client!oda", name = "m", descriptor = "I")
    private int field9416 = 1;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(B)V")
    public final void method840(byte arg0) {
        this.field9414 = 0L;
        if (this.field9411 < this.field9412) {
            this.field9411 += this.field9412 - this.field9411;
        }
        int var2 = 96 / ((-arg0 - 41) / 42);
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "()V")
    public class717() {
        this.field9411 = System.nanoTime();
        this.field9412 = System.nanoTime();
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(B)J")
    public final long method841(byte arg0) {
        this.field9411 += this.method3848(11847);
        if (this.field9411 < this.field9412) {
            return (this.field9412 - this.field9411) / 1000000L;
        } else if (arg0 <= 97) {
            return 51L;
        } else {
            return 0L;
        }
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)J")
    public final long method839(int arg0) {
        int var2 = -16 % ((44 - arg0) / 37);
        return this.field9411;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IJ)I")
    public final int method842(int arg0, long arg1) {
        if (arg0 >= -45) {
            this.method842(-35, -115L);
        }
        if (this.field9411 < this.field9412) {
            this.field9414 += this.field9412 - this.field9411;
            this.field9411 += this.field9412 - this.field9411;
            this.field9412 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field9412 += arg1;
            var4++;
        } while (var4 < 10 && this.field9412 < this.field9411);
        if (this.field9412 < this.field9411) {
            this.field9412 = this.field9411;
        }
        return var4;
    }

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "(I)J")
    private final long method3848(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field9414;
        this.field9414 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field9415[this.field9413] = var4;
            this.field9413 = (this.field9413 + 1) % 10;
            if (this.field9416 < 1) {
                this.field9416++;
            }
        }
        if (arg0 != 11847) {
            return -68L;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field9416; var8++) {
            var6 += this.field9415[(this.field9413 + 10 - var8) % 10];
        }
        return var6 / (long) this.field9416;
    }
}
