import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class69 extends class193 {

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "J")
    private long field969 = 0L;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "J")
    private long field970 = 0L;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "J")
    private long field971 = 0L;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "[J")
    private long[] field973 = new long[10];

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    private int field972 = 0;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    private int field974 = 1;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)J", line = 5)
    public final long method550(byte arg0) {
        int var2 = 89 / ((60 - arg0) / 57);
        return this.field969;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)V", line = 13)
    public final void method551(byte arg0) {
        this.field971 = 0L;
        if (this.field970 > this.field969) {
            this.field969 += this.field970 - this.field969;
        }
        int var2 = -109 % ((arg0 + 62) / 52);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)J", line = 27)
    private final long method552(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field971;
        this.field971 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field973[this.field972] = var4;
            this.field972 = (this.field972 + 1) % 10;
            if (this.field974 < 1) {
                this.field974++;
            }
        }
        long var6 = 0L;
        if (arg0 >= -111) {
            this.method552(-5);
        }
        for (int var8 = 1; var8 <= this.field974; var8++) {
            var6 += this.field973[(this.field972 + 10 - var8) % 10];
        }
        return var6 / (long) this.field974;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V", line = 64)
    public class69() {
        this.field969 = System.nanoTime();
        this.field970 = System.nanoTime();
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)I", line = 87)
    public final int method553(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        this.field969 += this.method552(arg0 - 5082);
        if (arg0 != 4970) {
            this.method552(12);
        }
        if (this.field969 < this.field970) {
            class328.method1999(0, (this.field970 - this.field969) / 1000000L);
            this.field971 += this.field970 - this.field969;
            this.field969 += this.field970 - this.field969;
            this.field970 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field970 += var3;
        } while (var5 < 10 && this.field970 < this.field969);
        if (this.field969 > this.field970) {
            this.field970 = this.field969;
        }
        return var5;
    }
}
