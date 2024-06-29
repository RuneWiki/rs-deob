import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class373 extends class310 {

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "J")
    private long field4692 = 0L;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "J")
    private long field4693 = 0L;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    private int field4694 = 1;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "J")
    private long field4695 = 0L;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    private int field4696 = 0;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "[J")
    private long[] field4697 = new long[10];

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)J")
    public final long method1836(boolean arg0) {
        this.field4693 += this.method2182((byte) 92);
        if (this.field4692 > this.field4693) {
            return (this.field4692 - this.field4693) / 1000000L;
        } else {
            if (!arg0) {
                this.method1833((byte) -90);
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)J")
    public final long method1831(int arg0) {
        if (arg0 != -2) {
            this.method2182((byte) 57);
        }
        return this.field4693;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(JI)I")
    public final int method1835(long arg0, int arg1) {
        if (arg1 != 3) {
            this.method1836(false);
        }
        if (this.field4693 < this.field4692) {
            this.field4695 += this.field4692 - this.field4693;
            this.field4693 += this.field4692 - this.field4693;
            this.field4692 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            this.field4692 += arg0;
            var4++;
        } while (var4 < 10 && this.field4692 < this.field4693);
        if (this.field4692 < this.field4693) {
            this.field4692 = this.field4693;
        }
        return var4;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)J")
    private final long method2182(byte arg0) {
        int var2 = -104 / ((arg0 - 22) / 59);
        long var3 = jagmisc.nanoTime();
        long var5 = var3 - this.field4695;
        this.field4695 = var3;
        if (var5 > -5000000000L && var5 < 5000000000L) {
            this.field4697[this.field4696] = var5;
            if (this.field4694 < 1) {
                this.field4694++;
            }
            this.field4696 = (this.field4696 + 1) % 10;
        }
        long var7 = 0L;
        for (int var9 = 1; var9 <= this.field4694; var9++) {
            var7 += this.field4697[(this.field4696 - (var9 - 10)) % 10];
        }
        return var7 / (long) this.field4694;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
    public final void method1833(byte arg0) {
        if (this.field4693 < this.field4692) {
            this.field4693 += this.field4692 - this.field4693;
        }
        this.field4695 = 0L;
        if (arg0 <= 16) {
            this.field4693 = 35L;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class373() {
        this.field4692 = this.field4693 = jagmisc.nanoTime();
        if (this.field4693 == 0L) {
            throw new RuntimeException();
        }
    }
}
