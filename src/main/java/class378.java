import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class378 extends class193 {

    @OriginalMember(owner = "client!an", name = "h", descriptor = "J")
    private long field5225 = 0L;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "J")
    private long field5226 = 0L;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    private int field5228 = 1;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "J")
    private long field5229 = 0L;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "[J")
    private long[] field5227 = new long[10];

    @OriginalMember(owner = "client!an", name = "m", descriptor = "I")
    private int field5230 = 0;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(B)V", line = 3)
    public final void method551(byte arg0) {
        this.field5229 = 0L;
        if (this.field5226 > this.field5225) {
            this.field5225 += this.field5226 - this.field5225;
        }
        int var2 = -65 % ((arg0 + 62) / 52);
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V", line = 99)
    public class378() {
        this.field5226 = this.field5225 = jagmisc.nanoTime();
        if (this.field5225 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(II)I", line = 19)
    public final int method553(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        this.field5225 += this.method2353(1);
        if (arg0 != 4970) {
            return 117;
        } else if (this.field5225 < this.field5226) {
            class328.method1999(arg0 - 4970, (-this.field5225 + this.field5226) / 1000000L);
            this.field5229 += this.field5226 - this.field5225;
            this.field5225 += this.field5226 - this.field5225;
            this.field5226 += var3;
            return 1;
        } else {
            int var5 = 0;
            do {
                this.field5226 += var3;
                var5++;
            } while (var5 < 10 && this.field5226 < this.field5225);
            if (this.field5226 < this.field5225) {
                this.field5226 = this.field5225;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(B)J", line = 55)
    public final long method550(byte arg0) {
        int var2 = 37 % ((arg0 - 60) / 57);
        return this.field5225;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)J", line = 64)
    private final long method2353(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field5229;
        this.field5229 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5227[this.field5230] = var4;
            if (this.field5228 < 1) {
                this.field5228++;
            }
            this.field5230 = (this.field5230 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = arg0; var8 <= this.field5228; var8++) {
            var6 += this.field5227[(this.field5230 + 10 - var8) % 10];
        }
        return var6 / (long) this.field5228;
    }
}
