import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class277 extends class449 {

    @OriginalMember(owner = "client!df", name = "f", descriptor = "J")
    private long field4182 = 0L;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "J")
    private long field4183 = 0L;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "[J")
    private long[] field4186 = new long[10];

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    private int field4185 = 1;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "J")
    private long field4184 = 0L;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    private int field4187 = 0;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)J")
    public final long method1442(boolean arg0) {
        return arg0 ? -58L : this.field4182;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)J")
    private final long method1748(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field4184;
        this.field4184 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4186[this.field4187] = var4;
            this.field4187 = (this.field4187 + 1) % 10;
            if (this.field4185 < 1) {
                this.field4185++;
            }
        }
        long var6 = 0L;
        int var8 = -17 % ((arg0 + 20) / 61);
        for (int var9 = 1; var9 <= this.field4185; var9++) {
            var6 += this.field4186[(this.field4187 + 10 - var9) % 10];
        }
        return var6 / (long) this.field4185;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public final void method1440(int arg0) {
        this.field4184 = 0L;
        if (this.field4183 > this.field4182) {
            this.field4182 += this.field4183 - this.field4182;
        }
        int var2 = -46 % ((-arg0 - 47) / 53);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)I")
    public final int method1443(int arg0, int arg1) {
        if (arg1 != 19116) {
            this.method1443(94, -119);
        }
        long var3 = (long) arg0 * 1000000L;
        this.field4182 += this.method1748(99);
        if (this.field4183 > this.field4182) {
            class50.method470((this.field4183 - this.field4182) / 1000000L, -5);
            this.field4184 += this.field4183 - this.field4182;
            this.field4182 += this.field4183 - this.field4182;
            this.field4183 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field4183 += var3;
        } while (var5 < 10 && this.field4183 < this.field4182);
        if (this.field4182 > this.field4183) {
            this.field4183 = this.field4182;
        }
        return var5;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
    public class277() {
        this.field4183 = this.field4182 = jagmisc.nanoTime();
        if (this.field4182 == 0L) {
            throw new RuntimeException();
        }
    }
}
