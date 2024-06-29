import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class215 extends class148 {

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "J")
    private long field3089 = 0L;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "J")
    private long field3090 = 0L;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "[J")
    private long[] field3092 = new long[10];

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    private int field3091 = 0;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "J")
    private long field3093 = 0L;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    private int field3094 = 1;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)J", line = 6)
    private final long method1496(int arg0) {
        long var2 = System.nanoTime();
        int var4 = -12 / ((arg0 + 3) / 62);
        long var5 = var2 - this.field3093;
        this.field3093 = var2;
        if (var5 > -5000000000L && var5 < 5000000000L) {
            this.field3092[this.field3091] = var5;
            this.field3091 = (this.field3091 + 1) % 10;
            if (this.field3094 < 1) {
                this.field3094++;
            }
        }
        long var7 = 0L;
        for (int var9 = 1; var9 <= this.field3094; var9++) {
            var7 += this.field3092[(this.field3091 + 10 - var9) % 10];
        }
        return var7 / (long) this.field3094;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V", line = 114)
    public class215() {
        this.field3089 = System.nanoTime();
        this.field3090 = System.nanoTime();
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)J", line = 43)
    public final long method1025(byte arg0) {
        this.field3089 += this.method1496(91);
        int var2 = -21 / ((-arg0 - 33) / 49);
        return this.field3090 <= this.field3089 ? 0L : (this.field3090 - this.field3089) / 1000000L;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)J", line = 62)
    public final long method1026(int arg0) {
        if (arg0 != 0) {
            this.method1021(115L, (byte) 6);
        }
        return this.field3089;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V", line = 72)
    public final void method1020(byte arg0) {
        if (this.field3090 > this.field3089) {
            this.field3089 += this.field3090 - this.field3089;
        }
        this.field3093 = 0L;
        int var2 = 56 % ((arg0 - 13) / 45);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(JB)I", line = 84)
    public final int method1021(long arg0, byte arg1) {
        if (arg1 != -14) {
            this.field3092 = null;
        }
        if (this.field3090 > this.field3089) {
            this.field3093 += this.field3090 - this.field3089;
            this.field3089 += this.field3090 - this.field3089;
            this.field3090 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field3090 += arg0;
        } while (var4 < 10 && this.field3089 > this.field3090);
        if (this.field3089 > this.field3090) {
            this.field3090 = this.field3089;
        }
        return var4;
    }
}
