import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class212 extends class453 {

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    private int field3185 = 0;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "[J")
    private long[] field3184 = new long[10];

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "J")
    private long field3186 = 0L;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "J")
    private long field3183 = 0L;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "J")
    private long field3187 = 0L;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
    private int field3188 = 1;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(JZ)I", line = 9)
    public final int method4(long arg0, boolean arg1) {
        if (arg1) {
            this.method3((byte) -94);
        }
        if (this.field3183 < this.field3187) {
            this.field3186 += this.field3187 - this.field3183;
            this.field3183 += this.field3187 - this.field3183;
            this.field3187 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field3187 += arg0;
        } while (var4 < 10 && this.field3183 > this.field3187);
        if (this.field3183 > this.field3187) {
            this.field3187 = this.field3183;
        }
        return var4;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)J", line = 45)
    public final long method5(int arg0) {
        if (arg0 != 56) {
            this.field3187 = -46L;
        }
        return this.field3183;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)J", line = 55)
    public final long method1(int arg0) {
        if (arg0 != 0) {
            this.method1445(123);
        }
        this.field3183 += this.method1445(arg0 ^ 0xFFFFDB05);
        return this.field3183 < this.field3187 ? (this.field3187 - this.field3183) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)J", line = 77)
    private final long method1445(int arg0) {
        long var2 = class524.method3075(arg0 + 9485) * 1000000L;
        long var4 = var2 - this.field3186;
        this.field3186 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3184[this.field3185] = var4;
            this.field3185 = (this.field3185 + 1) % 10;
            if (this.field3188 < 10) {
                this.field3188++;
            }
        }
        if (arg0 != -9467) {
            this.method1(16);
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field3188; var8++) {
            var6 += this.field3184[(this.field3185 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3188;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(B)V", line = 117)
    public final void method3(byte arg0) {
        int var2 = 118 % ((arg0 + 28) / 40);
        this.field3186 = 0L;
        if (this.field3183 < this.field3187) {
            this.field3183 += this.field3187 - this.field3183;
        }
    }
}
