import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class373 extends class548 {

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    private int field5693 = 1;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "J")
    private long field5695 = 0L;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "[J")
    private long[] field5694 = new long[10];

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "J")
    private long field5697 = 0L;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    private int field5696 = 0;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "J")
    private long field5698 = 0L;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V", line = 3)
    public final void method1606(byte arg0) {
        int var2 = 76 % ((arg0 + 69) / 41);
        if (this.field5698 < this.field5697) {
            this.field5698 += this.field5697 - this.field5698;
        }
        this.field5695 = 0L;
    }

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(B)J", line = 16)
    private final long method2407(byte arg0) {
        long var2 = class84.method550((byte) -104) * 1000000L;
        long var4 = var2 - this.field5695;
        this.field5695 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5694[this.field5696] = var4;
            this.field5696 = (this.field5696 + 1) % 10;
            if (this.field5693 < 10) {
                this.field5693++;
            }
        }
        long var6 = 0L;
        if (arg0 <= 103) {
            return 34L;
        } else {
            for (int var8 = 1; var8 <= this.field5693; var8++) {
                var6 += this.field5694[(this.field5696 + 10 - var8) % 10];
            }
            return var6 / (long) this.field5693;
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(B)J", line = 52)
    public final long method1607(byte arg0) {
        if (arg0 > -71) {
            this.method1604(75L, -103);
        }
        return this.field5698;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(JI)I", line = 62)
    public final int method1604(long arg0, int arg1) {
        if (arg1 != 50) {
            return 51;
        } else if (this.field5698 < this.field5697) {
            this.field5695 += this.field5697 - this.field5698;
            this.field5698 += this.field5697 - this.field5698;
            this.field5697 += arg0;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field5697 += arg0;
            } while (var4 < 10 && this.field5698 > this.field5697);
            if (this.field5697 < this.field5698) {
                this.field5697 = this.field5698;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)J", line = 108)
    public final long method1605(int arg0) {
        if (arg0 != 12948) {
            this.method1604(48L, 114);
        }
        this.field5698 += this.method2407((byte) 111);
        return this.field5698 < this.field5697 ? (this.field5697 - this.field5698) / 1000000L : 0L;
    }
}
