import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class298 extends class349 {

    @OriginalMember(owner = "client!km", name = "h", descriptor = "J")
    private long field4093 = 0L;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "J")
    private long field4094 = 0L;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "J")
    private long field4095 = 0L;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "[J")
    private long[] field4098 = new long[10];

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    private int field4096 = 0;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    private int field4097 = 1;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)J")
    public final long method1715(boolean arg0) {
        if (!arg0) {
            this.method1717(-30);
        }
        return this.field4094;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)J")
    public final long method1718(int arg0) {
        this.field4094 += this.method1828((byte) -26);
        if (arg0 != -16722) {
            this.method1715(true);
        }
        return this.field4094 < this.field4093 ? (this.field4093 - this.field4094) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZJ)I")
    public final int method1714(boolean arg0, long arg1) {
        if (arg0) {
            this.field4097 = 62;
        }
        if (this.field4094 < this.field4093) {
            this.field4095 += this.field4093 - this.field4094;
            this.field4094 += this.field4093 - this.field4094;
            this.field4093 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field4093 += arg1;
            var4++;
        } while (var4 < 10 && this.field4093 < this.field4094);
        if (this.field4094 > this.field4093) {
            this.field4093 = this.field4094;
        }
        return var4;
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(B)J")
    private final long method1828(byte arg0) {
        int var2 = 46 % ((54 - arg0) / 48);
        long var3 = jagmisc.nanoTime();
        long var5 = var3 - this.field4095;
        this.field4095 = var3;
        if (var5 > -5000000000L && var5 < 5000000000L) {
            this.field4098[this.field4096] = var5;
            this.field4096 = (this.field4096 + 1) % 10;
            if (this.field4097 < 1) {
                this.field4097++;
            }
        }
        long var7 = 0L;
        for (int var9 = 1; var9 <= this.field4097; var9++) {
            var7 += this.field4098[(this.field4096 + 10 - var9) % 10];
        }
        return var7 / (long) this.field4097;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
    public final void method1717(int arg0) {
        if (this.field4094 < this.field4093) {
            this.field4094 += this.field4093 - this.field4094;
        }
        this.field4095 = 0L;
        if (arg0 != 31913) {
            this.method1828((byte) -19);
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
    public class298() {
        this.field4093 = this.field4094 = jagmisc.nanoTime();
        if (this.field4094 == 0L) {
            throw new RuntimeException();
        }
    }
}
