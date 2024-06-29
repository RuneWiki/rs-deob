import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class502 extends class72 {

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "J")
    private long field6925 = 0L;

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "J")
    private long field6926 = 0L;

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "[J")
    private long[] field6928 = new long[10];

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "J")
    private long field6927 = 0L;

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "I")
    private int field6929 = 1;

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "I")
    private int field6930 = 0;

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(II)I", line = 3)
    public final int method472(int arg0, int arg1) {
        if (arg1 != 14965) {
            this.method2870(79);
        }
        this.field6925 += this.method2870(122);
        long var3 = (long) arg0 * 1000000L;
        if (this.field6925 < this.field6926) {
            class94.method674((this.field6926 - this.field6925) / 1000000L, 1);
            this.field6927 += this.field6926 - this.field6925;
            this.field6925 += this.field6926 - this.field6925;
            this.field6926 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field6926 += var3;
            var5++;
        } while (var5 < 10 && this.field6925 > this.field6926);
        if (this.field6926 < this.field6925) {
            this.field6926 = this.field6925;
        }
        return var5;
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V", line = 103)
    public class502() {
        this.field6926 = this.field6925 = jagmisc.nanoTime();
        if (this.field6925 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(I)J", line = 43)
    private final long method2870(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field6927;
        this.field6927 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6928[this.field6930] = var4;
            if (this.field6929 < 1) {
                this.field6929++;
            }
            this.field6930 = (this.field6930 + 1) % 10;
        }
        long var6 = 0L;
        int var8 = 1;
        if (arg0 <= 82) {
            this.field6930 = 23;
        }
        while (var8 <= this.field6929) {
            var6 += this.field6928[(this.field6930 + 10 - var8) % 10];
            var8++;
        }
        return var6 / (long) this.field6929;
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)V", line = 76)
    public final void method473(int arg0) {
        this.field6927 = 0L;
        if (arg0 != -3512) {
            this.method474((byte) -50);
        }
        if (this.field6926 > this.field6925) {
            this.field6925 += this.field6926 - this.field6925;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)J", line = 91)
    public final long method474(byte arg0) {
        if (arg0 != 90) {
            this.field6928 = null;
        }
        return this.field6925;
    }
}
