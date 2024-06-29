import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class410 extends class464 {

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "J")
    private long field6305 = 0L;

    @OriginalMember(owner = "client!lv", name = "i", descriptor = "J")
    private long field6306 = 0L;

    @OriginalMember(owner = "client!lv", name = "l", descriptor = "J")
    private long field6309 = 0L;

    @OriginalMember(owner = "client!lv", name = "j", descriptor = "I")
    private int field6307 = 1;

    @OriginalMember(owner = "client!lv", name = "k", descriptor = "I")
    private int field6308 = 0;

    @OriginalMember(owner = "client!lv", name = "m", descriptor = "[J")
    private long[] field6310 = new long[10];

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(JI)I", line = 4)
    public final int method444(long arg0, int arg1) {
        if (arg1 != 20359) {
            this.method2616(-102);
        }
        if (this.field6306 < this.field6305) {
            this.field6309 += this.field6305 - this.field6306;
            this.field6306 += this.field6305 - this.field6306;
            this.field6305 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field6305 += arg0;
        } while (var4 < 10 && this.field6305 < this.field6306);
        if (this.field6306 > this.field6305) {
            this.field6305 = this.field6306;
        }
        return var4;
    }

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "(I)J", line = 38)
    private final long method2616(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field6309;
        this.field6309 = var2;
        int var6 = 55 % ((88 - arg0) / 32);
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6310[this.field6308] = var4;
            this.field6308 = (this.field6308 + 1) % 10;
            if (this.field6307 < 1) {
                this.field6307++;
            }
        }
        long var7 = 0L;
        for (int var9 = 1; var9 <= this.field6307; var9++) {
            var7 += this.field6310[(this.field6308 + 10 - var9) % 10];
        }
        return var7 / (long) this.field6307;
    }

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "(I)J", line = 69)
    public final long method445(int arg0) {
        if (arg0 <= 42) {
            this.field6306 = -11L;
        }
        return this.field6306;
    }

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "(I)V", line = 79)
    public final void method442(int arg0) {
        this.field6309 = 0L;
        if (this.field6306 < this.field6305) {
            this.field6306 += this.field6305 - this.field6306;
        }
        if (arg0 != -201) {
            this.method442(2);
        }
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "()V", line = 115)
    public class410() {
        this.field6306 = System.nanoTime();
        this.field6305 = System.nanoTime();
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)J", line = 96)
    public final long method446(int arg0) {
        this.field6306 += this.method2616(121);
        if (arg0 > -1) {
            return -52L;
        } else if (this.field6306 >= this.field6305) {
            return 0L;
        } else {
            return (this.field6305 - this.field6306) / 1000000L;
        }
    }
}
