import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class197 extends class424 {

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "J")
    private long field2617 = 0L;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "J")
    private long field2618 = 0L;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "J")
    private long field2619 = 0L;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "I")
    private int field2621 = 0;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "[J")
    private long[] field2620 = new long[10];

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "I")
    private int field2622 = 1;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)J", line = 4)
    public final long method385(byte arg0) {
        return arg0 == -71 ? this.field2617 : 66L;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)I", line = 15)
    public final int method383(int arg0, int arg1) {
        if (arg1 != 0) {
            return -49;
        }
        this.field2617 += this.method1320(1);
        long var3 = (long) arg0 * 1000000L;
        if (this.field2617 < this.field2618) {
            class388.method2433((this.field2618 - this.field2617) / 1000000L, arg1 ^ 0x69);
            this.field2619 += this.field2618 - this.field2617;
            this.field2617 += this.field2618 - this.field2617;
            this.field2618 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field2618 += var3;
            var5++;
        } while (var5 < 10 && this.field2618 < this.field2617);
        if (this.field2618 < this.field2617) {
            this.field2618 = this.field2617;
        }
        return var5;
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)J", line = 53)
    private final long method1320(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field2619;
        this.field2619 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2620[this.field2621] = var4;
            if (this.field2622 < 1) {
                this.field2622++;
            }
            this.field2621 = (this.field2621 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = arg0; var8 <= this.field2622; var8++) {
            var6 += this.field2620[(this.field2621 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2622;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V", line = 82)
    public final void method386(int arg0) {
        this.field2619 = 0L;
        if (this.field2617 < this.field2618) {
            this.field2617 += this.field2618 - this.field2617;
        }
        if (arg0 != 1206) {
            this.method386(74);
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V", line = 101)
    public class197() {
        this.field2617 = System.nanoTime();
        this.field2618 = System.nanoTime();
    }
}
