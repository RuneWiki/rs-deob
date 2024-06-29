import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class391 extends class183 {

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "J")
    private long field5603 = 0L;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "J")
    private long field5602 = 0L;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    private int field5606 = 0;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    private int field5605 = 1;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "[J")
    private long[] field5604 = new long[10];

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "J")
    private long field5607 = 0L;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)J")
    private final long method2472(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field5607;
        this.field5607 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5604[this.field5606] = var4;
            if (this.field5605 < 1) {
                this.field5605++;
            }
            this.field5606 = (this.field5606 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = arg0; var8 <= this.field5605; var8++) {
            var6 += this.field5604[(this.field5606 + 10 - var8) % 10];
        }
        return var6 / (long) this.field5605;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public final void method1194(byte arg0) {
        if (this.field5602 > this.field5603) {
            this.field5603 += this.field5602 - this.field5603;
        }
        if (arg0 != -41) {
            this.method1198(81);
        }
        this.field5607 = 0L;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)I")
    public final int method1195(int arg0, byte arg1) {
        if (arg1 > -44) {
            this.method1194((byte) -26);
        }
        this.field5603 += this.method2472(1);
        long var3 = (long) arg0 * 1000000L;
        if (this.field5603 < this.field5602) {
            class349.method2219((this.field5602 - this.field5603) / 1000000L, -38);
            this.field5607 += this.field5602 - this.field5603;
            this.field5603 += this.field5602 - this.field5603;
            this.field5602 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field5602 += var3;
        } while (var5 < 10 && this.field5602 < this.field5603);
        if (this.field5603 > this.field5602) {
            this.field5602 = this.field5603;
        }
        return var5;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)J")
    public final long method1198(int arg0) {
        if (arg0 > -69) {
            this.method1194((byte) 61);
        }
        return this.field5603;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    public class391() {
        this.field5603 = System.nanoTime();
        this.field5602 = System.nanoTime();
    }
}
