import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class353 extends class388 {

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "J")
    private long field5312 = 0L;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "J")
    private long field5313 = 0L;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    private int field5314 = 1;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "[J")
    private long[] field5315 = new long[10];

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "J")
    private long field5317 = 0L;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    private int field5316 = 0;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)J")
    private final long method2283(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field5317;
        this.field5317 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5315[this.field5316] = var4;
            this.field5316 = (this.field5316 + 1) % 10;
            if (this.field5314 < 1) {
                this.field5314++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field5314; var8++) {
            var6 += this.field5315[(this.field5316 + 10 - var8) % 10];
        }
        if (arg0 != 9854) {
            this.field5312 = 107L;
        }
        return var6 / (long) this.field5314;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)J")
    public final long method2284(int arg0) {
        this.field5312 += this.method2283(9854);
        if (this.field5313 > this.field5312) {
            return (this.field5313 - this.field5312) / 1000000L;
        } else {
            if (arg0 != 2) {
                this.method2285(-33, -89L);
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(IJ)I")
    public final int method2285(int arg0, long arg1) {
        if (arg0 < 115) {
            this.method2287(-33);
        }
        if (this.field5313 > this.field5312) {
            this.field5317 += this.field5313 - this.field5312;
            this.field5312 += this.field5313 - this.field5312;
            this.field5313 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field5313 += arg1;
            var4++;
        } while (var4 < 10 && this.field5312 > this.field5313);
        if (this.field5312 > this.field5313) {
            this.field5313 = this.field5312;
        }
        return var4;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public final void method2286(byte arg0) {
        if (this.field5313 > this.field5312) {
            this.field5312 += this.field5313 - this.field5312;
        }
        this.field5317 = 0L;
        if (arg0 > -7) {
            this.method2287(-65);
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)J")
    public final long method2287(int arg0) {
        int var2 = 104 % ((arg0 - 26) / 39);
        return this.field5312;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
    public class353() {
        this.field5313 = this.field5312 = jagmisc.nanoTime();
        if (this.field5312 == 0L) {
            throw new RuntimeException();
        }
    }
}
