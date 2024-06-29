import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class337 extends class7 {

    @OriginalMember(owner = "client!en", name = "h", descriptor = "[J")
    private long[] field5250 = new long[10];

    @OriginalMember(owner = "client!en", name = "l", descriptor = "I")
    private int field5251 = 1;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "I")
    private int field5252 = 0;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "J")
    private long field5253 = 0L;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "J")
    private long field5254 = 0L;

    @OriginalMember(owner = "client!en", name = "k", descriptor = "J")
    private long field5255 = 0L;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)J")
    public final long method49(int arg0) {
        this.field5255 += this.method2814(10);
        if (this.field5255 < this.field5253) {
            return (this.field5253 - this.field5255) / 1000000L;
        } else {
            if (arg0 != -9305) {
                this.method49(-76);
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZJ)I")
    public final int method52(boolean arg0, long arg1) {
        if (arg0) {
            return -83;
        } else if (this.field5255 < this.field5253) {
            this.field5254 += this.field5253 - this.field5255;
            this.field5255 += this.field5253 - this.field5255;
            this.field5253 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field5253 += arg1;
            } while (var4 < 10 && this.field5253 < this.field5255);
            if (this.field5255 > this.field5253) {
                this.field5253 = this.field5255;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)V")
    public final void method46(boolean arg0) {
        if (arg0) {
            this.method45(-124);
        }
        if (this.field5253 > this.field5255) {
            this.field5255 += this.field5253 - this.field5255;
        }
        this.field5254 = 0L;
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(I)J")
    public final long method45(int arg0) {
        if (arg0 != 0) {
            this.field5250 = null;
        }
        return this.field5255;
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(I)J")
    private final long method2814(int arg0) {
        if (arg0 != 10) {
            this.method52(false, -112L);
        }
        long var2 = class430.method3299(arg0 + 97) * 1000000L;
        long var4 = var2 - this.field5254;
        this.field5254 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5250[this.field5252] = var4;
            if (this.field5251 < 10) {
                this.field5251++;
            }
            this.field5252 = (this.field5252 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field5251; var8++) {
            var6 += this.field5250[(this.field5252 + 10 - var8) % 10];
        }
        return var6 / (long) this.field5251;
    }
}
