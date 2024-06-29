import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class355 extends class215 {

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "J")
    private long field5606 = 0L;

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "J")
    private long field5605 = 0L;

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "J")
    private long field5609 = 0L;

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
    private int field5607 = 1;

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
    private int field5608 = 0;

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "[J")
    private long[] field5610 = new long[10];

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V", line = 4)
    public final void method821(byte arg0) {
        if (this.field5606 > this.field5605) {
            this.field5605 += this.field5606 - this.field5605;
        }
        this.field5609 = 0L;
        int var2 = -60 / ((arg0 + 74) / 47);
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V", line = 105)
    public class355() {
        this.field5605 = System.nanoTime();
        this.field5606 = System.nanoTime();
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)J", line = 27)
    private final long method2468(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field5609;
        long var6 = 0L;
        this.field5609 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5610[this.field5608] = var4;
            this.field5608 = (this.field5608 + 1) % 10;
            if (this.field5607 < 1) {
                this.field5607++;
            }
        }
        for (int var8 = 1; var8 <= this.field5607; var8++) {
            var6 += this.field5610[(this.field5608 + 10 - var8) % 10];
        }
        if (arg0 > -93) {
            this.field5606 = 61L;
        }
        return var6 / (long) this.field5607;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)I", line = 59)
    public final int method819(int arg0, int arg1, int arg2) {
        class142.method1149((long) arg0, (byte) 127);
        this.field5605 += this.method2468(-98);
        long var4 = (long) arg1 * 1000000L;
        if (arg2 >= -83) {
            return 82;
        } else if (this.field5606 > this.field5605) {
            class142.method1149((this.field5606 - this.field5605) / 1000000L, (byte) 126);
            this.field5609 += this.field5606 - this.field5605;
            this.field5605 += this.field5606 - this.field5605;
            this.field5606 += var4;
            return 1;
        } else {
            int var6 = 0;
            do {
                var6++;
                this.field5606 += var4;
            } while (var6 < 10 && this.field5605 > this.field5606);
            if (this.field5605 > this.field5606) {
                this.field5606 = this.field5605;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)J", line = 97)
    public final long method822(int arg0) {
        return arg0 == 32234 ? this.field5605 : 50L;
    }
}
