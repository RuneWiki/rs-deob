import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class501 extends class642 {

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "J")
    private long field6934 = 0L;

    @OriginalMember(owner = "client!nw", name = "g", descriptor = "J")
    private long field6935 = 0L;

    @OriginalMember(owner = "client!nw", name = "i", descriptor = "I")
    private int field6937 = 0;

    @OriginalMember(owner = "client!nw", name = "h", descriptor = "[J")
    private long[] field6936 = new long[10];

    @OriginalMember(owner = "client!nw", name = "j", descriptor = "J")
    private long field6938 = 0L;

    @OriginalMember(owner = "client!nw", name = "k", descriptor = "I")
    private int field6939 = 1;

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(B)J", line = 6)
    private final long method2893(byte arg0) {
        if (arg0 != 9) {
            this.field6939 = 36;
        }
        long var2 = System.nanoTime();
        long var4 = var2 - this.field6938;
        this.field6938 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6936[this.field6937] = var4;
            if (this.field6939 < 1) {
                this.field6939++;
            }
            this.field6937 = (this.field6937 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field6939; var8++) {
            var6 += this.field6936[(this.field6937 + 10 - var8) % 10];
        }
        return var6 / (long) this.field6939;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V", line = 39)
    public final void method1770(int arg0) {
        this.field6938 = 0L;
        if (this.field6935 < this.field6934) {
            this.field6935 += this.field6934 - this.field6935;
        }
        if (arg0 != 21308) {
            this.method2893((byte) 47);
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(BJ)I", line = 54)
    public final int method1771(byte arg0, long arg1) {
        int var4 = 40 % ((arg0 + 64) / 59);
        if (this.field6934 > this.field6935) {
            this.field6938 += this.field6934 - this.field6935;
            this.field6935 += this.field6934 - this.field6935;
            this.field6934 += arg1;
            return 1;
        }
        int var5 = 0;
        do {
            this.field6934 += arg1;
            var5++;
        } while (var5 < 10 && this.field6935 > this.field6934);
        if (this.field6935 > this.field6934) {
            this.field6934 = this.field6935;
        }
        return var5;
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)J", line = 85)
    public final long method1773(int arg0) {
        this.field6935 += this.method2893((byte) 9);
        if (arg0 != -5866) {
            this.method1770(77);
        }
        return this.field6935 >= this.field6934 ? 0L : (this.field6934 - this.field6935) / 1000000L;
    }

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "()V", line = 107)
    public class501() {
        this.field6935 = System.nanoTime();
        this.field6934 = System.nanoTime();
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)J", line = 119)
    public final long method1772(byte arg0) {
        if (arg0 <= 119) {
            this.method1771((byte) -78, 64L);
        }
        return this.field6935;
    }
}
