import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class213 extends class416 {

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "J")
    private long field2873 = 0L;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "J")
    private long field2874 = 0L;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
    private int field2876 = 0;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "[J")
    private long[] field2878 = new long[10];

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
    private int field2877 = 1;

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "J")
    private long field2875 = 0L;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)J", line = 3)
    public final long method1351(int arg0) {
        return arg0 == 0 ? this.field2874 : -82L;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(JI)I", line = 13)
    public final int method1352(long arg0, int arg1) {
        if (arg1 != 12889) {
            this.method1355((byte) -64);
        }
        if (this.field2873 > this.field2874) {
            this.field2875 += this.field2873 - this.field2874;
            this.field2874 += this.field2873 - this.field2874;
            this.field2873 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            this.field2873 += arg0;
            var4++;
        } while (var4 < 10 && this.field2873 < this.field2874);
        if (this.field2873 < this.field2874) {
            this.field2873 = this.field2874;
        }
        return var4;
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)J", line = 46)
    public final long method1353(int arg0) {
        this.field2874 += this.method1354(-15921);
        if (arg0 != 0) {
            this.method1354(-49);
        }
        return this.field2873 > this.field2874 ? (this.field2873 - this.field2874) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "()V", line = 117)
    public class213() {
        this.field2873 = this.field2874 = jagmisc.nanoTime();
        if (this.field2874 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)J", line = 66)
    private final long method1354(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field2875;
        this.field2875 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2878[this.field2876] = var4;
            this.field2876 = (this.field2876 + 1) % 10;
            if (this.field2877 < 1) {
                this.field2877++;
            }
        }
        long var6 = 0L;
        if (arg0 != -15921) {
            this.method1351(-10);
        }
        for (int var8 = 1; var8 <= this.field2877; var8++) {
            var6 += this.field2878[(this.field2876 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2877;
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)V", line = 100)
    public final void method1355(byte arg0) {
        if (arg0 == 114) {
            this.field2875 = 0L;
            if (this.field2874 < this.field2873) {
                this.field2874 += this.field2873 - this.field2874;
            }
        }
    }
}
