import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class515 extends class550 {

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "J")
    private long field7068 = 0L;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "J")
    private long field7069 = 0L;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    private int field7070 = 1;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    private int field7071 = 0;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "J")
    private long field7072 = 0L;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "[J")
    private long[] field7073 = new long[10];

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)J", line = 3)
    public final long method2303(byte arg0) {
        int var2 = 7 % ((arg0 + 70) / 48);
        return this.field7068;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZJ)I", line = 12)
    public final int method2299(boolean arg0, long arg1) {
        if (!arg0) {
            this.field7072 = 102L;
        }
        if (this.field7069 > this.field7068) {
            this.field7072 += this.field7069 - this.field7068;
            this.field7068 += this.field7069 - this.field7068;
            this.field7069 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field7069 += arg1;
            var4++;
        } while (var4 < 10 && this.field7068 > this.field7069);
        if (this.field7068 > this.field7069) {
            this.field7069 = this.field7068;
        }
        return var4;
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(B)J", line = 45)
    public final long method2302(byte arg0) {
        this.field7068 += this.method3069(false);
        if (this.field7068 < this.field7069) {
            return (this.field7069 - this.field7068) / 1000000L;
        } else {
            int var2 = 65 / ((arg0 - 71) / 40);
            return 0L;
        }
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(B)V", line = 61)
    public final void method2300(byte arg0) {
        if (this.field7069 > this.field7068) {
            this.field7068 += this.field7069 - this.field7068;
        }
        if (arg0 > 100) {
            this.field7072 = 0L;
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V", line = 115)
    public class515() {
        this.field7069 = this.field7068 = jagmisc.nanoTime();
        if (this.field7068 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)J", line = 78)
    private final long method3069(boolean arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field7072;
        this.field7072 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7073[this.field7071] = var4;
            this.field7071 = (this.field7071 + 1) % 10;
            if (this.field7070 < 1) {
                this.field7070++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field7070; var8++) {
            var6 += this.field7073[(this.field7071 + 10 - var8) % 10];
        }
        if (arg0) {
            this.method2302((byte) 114);
        }
        return var6 / (long) this.field7070;
    }
}
