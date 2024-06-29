import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class263 extends class266 {

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
    private int field3844 = 1;

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "J")
    private long field3847 = 0L;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
    private int field3845 = 0;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "J")
    private long field3846 = 0L;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "J")
    private long field3848 = 0L;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "[J")
    private long[] field3849 = new long[10];

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZ)I")
    public final int method954(int arg0, boolean arg1) {
        if (!arg1) {
            this.field3847 = -100L;
        }
        this.field3846 += this.method1625(103);
        long var3 = (long) arg0 * 1000000L;
        if (this.field3846 < this.field3847) {
            class111.method713(-117, (this.field3847 - this.field3846) / 1000000L);
            this.field3848 += this.field3847 - this.field3846;
            this.field3846 += this.field3847 - this.field3846;
            this.field3847 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field3847 += var3;
        } while (var5 < 10 && this.field3846 > this.field3847);
        if (this.field3846 > this.field3847) {
            this.field3847 = this.field3846;
        }
        return var5;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(Z)V")
    public final void method955(boolean arg0) {
        if (arg0) {
            this.field3847 = 1L;
        }
        if (this.field3846 < this.field3847) {
            this.field3846 += this.field3847 - this.field3846;
        }
        this.field3848 = 0L;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)J")
    public final long method957(byte arg0) {
        if (arg0 >= -8) {
            this.method955(true);
        }
        return this.field3846;
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)J")
    private final long method1625(int arg0) {
        long var2 = class433.method2562(-2039) * 1000000L;
        long var4 = var2 - this.field3848;
        this.field3848 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3849[this.field3845] = var4;
            if (this.field3844 < 10) {
                this.field3844++;
            }
            this.field3845 = (this.field3845 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field3844; var8++) {
            var6 += this.field3849[(this.field3845 + 10 - var8) % 10];
        }
        if (arg0 <= 33) {
            this.field3849 = null;
        }
        return var6 / (long) this.field3844;
    }
}
