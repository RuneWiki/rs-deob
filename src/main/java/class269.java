import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class269 extends class88 {

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "[J")
    private long[] field4189 = new long[10];

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "J")
    private long field4188 = 0L;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    private int field4190 = 0;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "J")
    private long field4193 = 0L;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "J")
    private long field4191 = 0L;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    private int field4192 = 1;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V", line = 4)
    public final void method642(boolean arg0) {
        if (arg0) {
            this.method642(false);
        }
        this.field4193 = 0L;
        if (this.field4191 > this.field4188) {
            this.field4188 += this.field4191 - this.field4188;
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)J", line = 20)
    private final long method1855(int arg0) {
        long var2 = class102.method743((byte) 93) * 1000000L;
        long var4 = var2 - this.field4193;
        this.field4193 = var2;
        long var6 = 0L;
        if (var4 > 0L && var4 < 5000000000L) {
            this.field4189[this.field4190] = var4;
            if (this.field4192 < 10) {
                this.field4192++;
            }
            this.field4190 = (this.field4190 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field4192; var8++) {
            var6 += this.field4189[(this.field4190 + 10 - var8) % 10];
        }
        if (arg0 != -11) {
            this.field4188 = 118L;
        }
        return var6 / (long) this.field4192;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)J", line = 52)
    public final long method639(int arg0) {
        if (arg0 != 40) {
            this.field4190 = 49;
        }
        return this.field4188;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIZ)I", line = 80)
    public final int method643(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field4192 = 60;
        }
        long var4 = (long) arg1 * 1000000L;
        class5.method26(0, (long) arg0);
        this.field4188 += this.method1855(-11);
        if (this.field4191 > this.field4188) {
            class5.method26(0, (this.field4191 - this.field4188) / 1000000L);
            this.field4193 += this.field4191 - this.field4188;
            this.field4188 += this.field4191 - this.field4188;
            this.field4191 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field4191 += var4;
        } while (var6 < 10 && this.field4188 > this.field4191);
        if (this.field4191 < this.field4188) {
            this.field4191 = this.field4188;
        }
        return var6;
    }
}
