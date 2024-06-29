import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class337 extends class126 {

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "J")
    private long field4679 = 0L;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "J")
    private long field4681 = 0L;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    private int field4680 = 1;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    private int field4682 = 0;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "[J")
    private long[] field4683 = new long[10];

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "J")
    private long field4684 = 0L;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)J", line = 9)
    public final long method921(byte arg0) {
        if (arg0 != -53) {
            this.field4683 = null;
        }
        return this.field4679;
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)J", line = 22)
    private final long method2055(byte arg0) {
        long var2 = class437.method2644(-89) * 1000000L;
        long var4 = var2 - this.field4681;
        this.field4681 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4683[this.field4682] = var4;
            this.field4682 = (this.field4682 + 1) % 10;
            if (this.field4680 < 10) {
                this.field4680++;
            }
        }
        long var6 = 0L;
        int var8 = -42 / ((arg0 - 17) / 38);
        for (int var9 = 1; var9 <= this.field4680; var9++) {
            var6 += this.field4683[(this.field4682 + 10 - var9) % 10];
        }
        return var6 / (long) this.field4680;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)I", line = 65)
    public final int method923(boolean arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        if (!arg0) {
            this.field4684 = 78L;
        }
        this.field4679 += this.method2055((byte) 90);
        if (this.field4679 < this.field4684) {
            class213.method1462((this.field4684 - this.field4679) / 1000000L, -5184);
            this.field4681 += this.field4684 - this.field4679;
            this.field4679 += this.field4684 - this.field4679;
            this.field4684 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field4684 += var3;
            var5++;
        } while (var5 < 10 && this.field4684 < this.field4679);
        if (this.field4684 < this.field4679) {
            this.field4684 = this.field4679;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V", line = 102)
    public final void method924(byte arg0) {
        if (this.field4684 > this.field4679) {
            this.field4679 += this.field4684 - this.field4679;
        }
        this.field4681 = 0L;
        if (arg0 <= 25) {
            this.field4684 = -3L;
        }
    }
}
