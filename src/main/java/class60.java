import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class60 extends class183 {

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "J")
    private long field1043 = 0L;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "J")
    private long field1044 = 0L;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    private int field1046 = 0;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "J")
    private long field1047 = 0L;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
    private int field1045 = 1;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "[J")
    private long[] field1048 = new long[10];

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)J")
    public final long method417(int arg0) {
        return arg0 == 0 ? this.field1044 : 67L;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)J")
    private final long method418(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = 0L;
        long var6 = var2 - this.field1047;
        this.field1047 = var2;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field1048[this.field1046] = var6;
            this.field1046 = (this.field1046 + 1) % 10;
            if (this.field1045 < 1) {
                this.field1045++;
            }
        }
        if (arg0 != 30128) {
            this.method418(-6);
        }
        for (int var8 = 1; var8 <= this.field1045; var8++) {
            var4 += this.field1048[(this.field1046 + 10 - var8) % 10];
        }
        return var4 / (long) this.field1045;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V")
    public final void method419(boolean arg0) {
        if (this.field1044 < this.field1043) {
            this.field1044 += this.field1043 - this.field1044;
        }
        this.field1047 = 0L;
        if (!arg0) {
            this.field1044 = -61L;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)I")
    public final int method420(int arg0, int arg1, int arg2) {
        class28.method182((long) arg0, true);
        this.field1044 += this.method418(30128);
        long var4 = (long) arg2 * 1000000L;
        if (arg1 != 0) {
            this.method418(-97);
        }
        if (this.field1043 > this.field1044) {
            class28.method182((this.field1043 - this.field1044) / 1000000L, true);
            this.field1047 += this.field1043 - this.field1044;
            this.field1044 += this.field1043 - this.field1044;
            this.field1043 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field1043 += var4;
        } while (var6 < 10 && this.field1043 < this.field1044);
        if (this.field1044 > this.field1043) {
            this.field1043 = this.field1044;
        }
        return var6;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
    public class60() {
        this.field1043 = this.field1044 = jagmisc.nanoTime();
        if (this.field1044 == 0L) {
            throw new RuntimeException();
        }
    }
}
