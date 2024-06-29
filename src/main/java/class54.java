import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class54 extends class219 {

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "J")
    private long field720 = 0L;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    private int field722 = 0;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    private int field721 = 1;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "[J")
    private long[] field724 = new long[10];

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "J")
    private long field723 = 0L;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "J")
    private long field725 = 0L;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)I")
    public final int method369(int arg0, int arg1) {
        this.field723 += this.method372(true);
        if (arg1 != 24168) {
            this.method371(-53);
        }
        long var3 = (long) arg0 * 1000000L;
        if (this.field725 > this.field723) {
            class144.method918((this.field725 - this.field723) / 1000000L, true);
            this.field720 += this.field725 - this.field723;
            this.field723 += this.field725 - this.field723;
            this.field725 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field725 += var3;
            var5++;
        } while (var5 < 10 && this.field723 > this.field725);
        if (this.field723 > this.field725) {
            this.field725 = this.field723;
        }
        return var5;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)J")
    public final long method370(int arg0) {
        if (arg0 != 4) {
            this.field724 = null;
        }
        return this.field723;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V")
    public final void method371(int arg0) {
        if (this.field723 < this.field725) {
            this.field723 += this.field725 - this.field723;
        }
        if (arg0 != 4) {
            this.field721 = 61;
        }
        this.field720 = 0L;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)J")
    private final long method372(boolean arg0) {
        long var2 = class114.method735(124) * 1000000L;
        long var4 = var2 - this.field720;
        this.field720 = var2;
        if (!arg0) {
            this.field722 = 66;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field724[this.field722] = var4;
            if (this.field721 < 10) {
                this.field721++;
            }
            this.field722 = (this.field722 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field721; var8++) {
            var6 += this.field724[(this.field722 + 10 - var8) % 10];
        }
        return var6 / (long) this.field721;
    }
}
