import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class201 extends class130 {

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "J")
    private long field2904 = 0L;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "J")
    private long field2905 = 0L;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "[J")
    private long[] field2906 = new long[10];

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    private int field2907 = 0;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    private int field2908 = 1;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "J")
    private long field2909 = 0L;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)J", line = 4)
    public final long method756(byte arg0) {
        this.field2904 += this.method1355((byte) -117);
        if (this.field2904 < this.field2905) {
            return (this.field2905 - this.field2904) / 1000000L;
        } else if (arg0 < 80) {
            return -29L;
        } else {
            return 0L;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 20)
    public final void method757(int arg0) {
        if (arg0 != 15749) {
            this.field2908 = -67;
        }
        this.field2909 = 0L;
        if (this.field2905 > this.field2904) {
            this.field2904 += this.field2905 - this.field2904;
        }
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(B)J", line = 35)
    private final long method1355(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field2909;
        this.field2909 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2906[this.field2907] = var4;
            this.field2907 = (this.field2907 + 1) % 10;
            if (this.field2908 < 1) {
                this.field2908++;
            }
        }
        long var6 = 0L;
        int var8 = -89 % ((arg0 + 17) / 63);
        for (int var9 = 1; var9 <= this.field2908; var9++) {
            var6 += this.field2906[(this.field2907 + 10 - var9) % 10];
        }
        return var6 / (long) this.field2908;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)J", line = 66)
    public final long method755(int arg0) {
        if (arg0 != 30706) {
            this.field2904 = 25L;
        }
        return this.field2904;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(JI)I", line = 76)
    public final int method754(long arg0, int arg1) {
        if (arg1 != 255) {
            this.field2906 = null;
        }
        if (this.field2905 > this.field2904) {
            this.field2909 += this.field2905 - this.field2904;
            this.field2904 += this.field2905 - this.field2904;
            this.field2905 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            this.field2905 += arg0;
            var4++;
        } while (var4 < 10 && this.field2905 < this.field2904);
        if (this.field2905 < this.field2904) {
            this.field2905 = this.field2904;
        }
        return var4;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V", line = 114)
    public class201() {
        this.field2904 = System.nanoTime();
        this.field2905 = System.nanoTime();
    }
}
