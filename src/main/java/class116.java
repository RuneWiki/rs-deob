import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class116 extends class69 {

    @OriginalMember(owner = "client!l", name = "n", descriptor = "J")
    private long field1753 = 0L;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "J")
    private long field1754 = 0L;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    private int field1756 = 0;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "J")
    private long field1755 = 0L;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "[J")
    private long[] field1757 = new long[10];

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    private int field1758 = 1;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IBI)I")
    public final int method547(int arg0, byte arg1, int arg2) {
        client.method323((long) arg0, -122);
        this.field1754 += this.method827(-97);
        long var4 = (long) arg2 * 1000000L;
        if (arg1 != -41) {
            return -11;
        } else if (this.field1753 > this.field1754) {
            client.method323((this.field1753 - this.field1754) / 1000000L, -128);
            this.field1755 += this.field1753 - this.field1754;
            this.field1754 += this.field1753 - this.field1754;
            this.field1753 += var4;
            return 1;
        } else {
            int var6 = 0;
            do {
                var6++;
                this.field1753 += var4;
            } while (var6 < 10 && this.field1754 > this.field1753);
            if (this.field1753 < this.field1754) {
                this.field1753 = this.field1754;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)J")
    public final long method551(byte arg0) {
        if (arg0 != 114) {
            this.field1755 = 78L;
        }
        return this.field1754;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)J")
    private final long method827(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field1755;
        this.field1755 = var2;
        long var6 = 0L;
        if (var4 > 0L && var4 < 5000000000L) {
            this.field1757[this.field1756] = var4;
            if (this.field1758 < 1) {
                this.field1758++;
            }
            this.field1756 = (this.field1756 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field1758; var8++) {
            var6 += this.field1757[(this.field1756 + 10 - var8) % 10];
        }
        int var9 = -95 % ((27 - arg0) / 62);
        return var6 / (long) this.field1758;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public final void method546(int arg0) {
        this.field1755 = 0L;
        if (arg0 != 32768) {
            this.field1754 = 29L;
        }
        if (this.field1754 < this.field1753) {
            this.field1754 += this.field1753 - this.field1754;
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
    public class116() {
        this.field1754 = System.nanoTime();
        this.field1753 = System.nanoTime();
    }
}
