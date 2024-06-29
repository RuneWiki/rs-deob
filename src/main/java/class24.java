import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class24 extends class333 {

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "J")
    private long field265 = 0L;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "J")
    private long field266 = 0L;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    private int field267 = 1;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "[J")
    private long[] field268 = new long[10];

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    private int field269 = 0;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "J")
    private long field270 = 0L;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIB)I", line = 5)
    public final int method190(int arg0, int arg1, byte arg2) {
        class324.method2252(arg2 ^ 0xFFFF9EB8, (long) arg0);
        if (arg2 != 91) {
            this.field268 = (long[]) null;
        }
        this.field266 += this.method192((byte) 110);
        long var4 = (long) arg1 * 1000000L;
        if (this.field265 > this.field266) {
            class324.method2252(-24861, (this.field265 - this.field266) / 1000000L);
            this.field270 += this.field265 - this.field266;
            this.field266 += this.field265 - this.field266;
            this.field265 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field265 += var4;
        } while (var6 < 10 && this.field265 < this.field266);
        if (this.field266 > this.field265) {
            this.field265 = this.field266;
        }
        return var6;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V", line = 42)
    public final void method191(int arg0) {
        this.field270 = (long) arg0;
        if (this.field266 < this.field265) {
            this.field266 += this.field265 - this.field266;
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)J", line = 52)
    private final long method192(byte arg0) {
        if (arg0 <= 102) {
            this.method190(-82, -78, (byte) 1);
        }
        long var2 = System.nanoTime();
        long var4 = 0L;
        long var6 = var2 - this.field270;
        this.field270 = var2;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field268[this.field269] = var6;
            this.field269 = (this.field269 + 1) % 10;
            if (this.field267 < 1) {
                this.field267++;
            }
        }
        for (int var8 = 1; var8 <= this.field267; var8++) {
            var4 += this.field268[(this.field269 + 10 - var8) % 10];
        }
        return var4 / (long) this.field267;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)J", line = 86)
    public final long method193(byte arg0) {
        if (arg0 != -65) {
            this.method191(45);
        }
        return this.field266;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V", line = 101)
    public class24() {
        this.field266 = System.nanoTime();
        this.field265 = System.nanoTime();
    }
}
