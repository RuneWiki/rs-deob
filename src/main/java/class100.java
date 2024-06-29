import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class100 extends class75 {

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "J")
    private long field1728 = 0L;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "J")
    private long field1729 = 0L;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    private int field1731 = 0;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "J")
    private long field1730 = 0L;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "[J")
    private long[] field1732 = new long[10];

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    private int field1733 = 1;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZJ)I")
    public final int method716(boolean arg0, long arg1) {
        if (!arg0) {
            this.field1733 = 19;
        }
        if (this.field1729 < this.field1728) {
            this.field1730 += this.field1728 - this.field1729;
            this.field1729 += this.field1728 - this.field1729;
            this.field1728 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field1728 += arg1;
            var4++;
        } while (var4 < 10 && this.field1729 > this.field1728);
        if (this.field1729 > this.field1728) {
            this.field1728 = this.field1729;
        }
        return var4;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)J")
    public final long method722(int arg0) {
        this.field1729 += this.method858(-82);
        if (this.field1728 <= this.field1729) {
            return arg0 <= 7 ? 95L : 0L;
        } else {
            return (this.field1728 - this.field1729) / 1000000L;
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)J")
    private final long method858(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field1730;
        this.field1730 = var2;
        int var6 = -110 % ((arg0 - 10) / 53);
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1732[this.field1731] = var4;
            if (this.field1733 < 1) {
                this.field1733++;
            }
            this.field1731 = (this.field1731 + 1) % 10;
        }
        long var7 = 0L;
        for (int var9 = 1; var9 <= this.field1733; var9++) {
            var7 += this.field1732[(this.field1731 + 10 - var9) % 10];
        }
        return var7 / (long) this.field1733;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
    public final void method720(boolean arg0) {
        this.field1730 = 0L;
        if (!arg0) {
            this.method722(112);
        }
        if (this.field1729 < this.field1728) {
            this.field1729 += this.field1728 - this.field1729;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)J")
    public final long method721(int arg0) {
        if (arg0 != 2259880) {
            this.field1733 = -76;
        }
        return this.field1729;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    public class100() {
        this.field1729 = System.nanoTime();
        this.field1728 = System.nanoTime();
    }
}
