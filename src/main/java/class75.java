import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class75 extends class642 {

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "J")
    private long field1029 = 0L;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "[J")
    private long[] field1031 = new long[10];

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "J")
    private long field1028 = 0L;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    private int field1030 = 0;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    private int field1032 = 1;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "J")
    private long field1033 = 0L;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)J")
    public final long method612(byte arg0) {
        if (arg0 != 67) {
            this.field1030 = 92;
        }
        return this.field1033;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public final void method613(int arg0) {
        this.field1029 = 0L;
        if (arg0 >= -31) {
            this.method614(false);
        }
        if (this.field1033 < this.field1028) {
            this.field1033 += this.field1028 - this.field1033;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)J")
    private final long method614(boolean arg0) {
        if (arg0) {
            this.field1028 = -98L;
        }
        long var2 = class584.method3191(1) * 1000000L;
        long var4 = var2 - this.field1029;
        this.field1029 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1031[this.field1030] = var4;
            this.field1030 = (this.field1030 + 1) % 10;
            if (this.field1032 < 10) {
                this.field1032++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field1032; var8++) {
            var6 += this.field1031[(this.field1030 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1032;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(JI)I")
    public final int method615(long arg0, int arg1) {
        if (arg1 != 0) {
            this.field1029 = -12L;
        }
        if (this.field1028 > this.field1033) {
            this.field1029 += this.field1028 - this.field1033;
            this.field1033 += this.field1028 - this.field1033;
            this.field1028 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field1028 += arg0;
        } while (var4 < 10 && this.field1028 < this.field1033);
        if (this.field1028 < this.field1033) {
            this.field1028 = this.field1033;
        }
        return var4;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)J")
    public final long method616(int arg0) {
        this.field1033 += this.method614(false);
        if (arg0 != 0) {
            this.field1029 = -125L;
        }
        return this.field1033 < this.field1028 ? (this.field1028 - this.field1033) / 1000000L : 0L;
    }
}
