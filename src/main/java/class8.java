import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class8 extends class190 {

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "J")
    private long field74 = 0L;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "J")
    private long field75 = 0L;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "J")
    private long field76 = 0L;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
    private int field77 = 0;

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
    private int field78 = 1;

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "[J")
    private long[] field79 = new long[10];

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIB)I", line = 5)
    public final int method36(int arg0, int arg1, byte arg2) {
        class283.method2076((byte) -125, (long) arg1);
        if (arg2 <= 57) {
            this.field79 = (long[]) null;
        }
        this.field74 += this.method38(1);
        long var4 = (long) arg0 * 1000000L;
        if (this.field75 > this.field74) {
            class283.method2076((byte) 115, (this.field75 - this.field74) / 1000000L);
            this.field76 += this.field75 - this.field74;
            this.field74 += this.field75 - this.field74;
            this.field75 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field75 += var4;
            var6++;
        } while (var6 < 10 && this.field75 < this.field74);
        if (this.field75 < this.field74) {
            this.field75 = this.field74;
        }
        return var6;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V", line = 41)
    public final void method37(byte arg0) {
        if (this.field74 < this.field75) {
            this.field74 += this.field75 - this.field74;
        }
        this.field76 = 0L;
        if (arg0 != -105) {
            this.method37((byte) 105);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)J", line = 56)
    private final long method38(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field76;
        this.field76 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field79[this.field77] = var4;
            if (this.field78 < 1) {
                this.field78++;
            }
            this.field77 = (this.field77 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = arg0; var8 <= this.field78; var8++) {
            var6 += this.field79[(this.field77 + 10 - var8) % 10];
        }
        return var6 / (long) this.field78;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V", line = 92)
    public class8() {
        this.field75 = this.field74 = jagmisc.nanoTime();
        if (this.field74 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "(B)J", line = 106)
    public final long method39(byte arg0) {
        return arg0 == -32 ? this.field74 : 36L;
    }
}
