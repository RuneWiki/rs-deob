import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class4 extends class135 {

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "J")
    private long field71 = 0L;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "J")
    private long field72 = 0L;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "J")
    private long field73 = 0L;

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "[J")
    private long[] field76 = new long[10];

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "I")
    private int field75 = 0;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
    private int field74 = 1;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)J", line = 7)
    private final long method36(int arg0) {
        long var2 = System.nanoTime();
        if (arg0 < 107) {
            this.method38(53, -72, -123);
        }
        long var4 = var2 - this.field73;
        long var6 = 0L;
        this.field73 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field76[this.field75] = var4;
            this.field75 = (this.field75 + 1) % 10;
            if (this.field74 < 1) {
                this.field74++;
            }
        }
        for (int var8 = 1; var8 <= this.field74; var8++) {
            var6 += this.field76[(this.field75 + 10 - var8) % 10];
        }
        return var6 / (long) this.field74;
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V", line = 91)
    public class4() {
        this.field71 = System.nanoTime();
        this.field72 = System.nanoTime();
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)J", line = 41)
    public final long method37(boolean arg0) {
        return arg0 ? -84L : this.field71;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)I", line = 51)
    public final int method38(int arg0, int arg1, int arg2) {
        if (arg0 != -128) {
            this.method39(false);
        }
        class122.method881(-67, (long) arg2);
        this.field71 += this.method36(125);
        long var4 = (long) arg1 * 1000000L;
        if (this.field72 > this.field71) {
            class122.method881(-102, (this.field72 - this.field71) / 1000000L);
            this.field73 += this.field72 - this.field71;
            this.field71 += this.field72 - this.field71;
            this.field72 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field72 += var4;
        } while (var6 < 10 && this.field71 > this.field72);
        if (this.field72 < this.field71) {
            this.field72 = this.field71;
        }
        return var6;
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(Z)V", line = 102)
    public final void method39(boolean arg0) {
        if (this.field72 > this.field71) {
            this.field71 += this.field72 - this.field71;
        }
        if (arg0) {
            this.field73 = 0L;
        }
    }
}
