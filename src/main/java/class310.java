import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class310 extends class498 {

    @OriginalMember(owner = "client!tha", name = "e", descriptor = "J")
    private long field4224 = 0L;

    @OriginalMember(owner = "client!tha", name = "f", descriptor = "J")
    private long field4225 = 0L;

    @OriginalMember(owner = "client!tha", name = "g", descriptor = "[J")
    private long[] field4226 = new long[10];

    @OriginalMember(owner = "client!tha", name = "i", descriptor = "J")
    private long field4228 = 0L;

    @OriginalMember(owner = "client!tha", name = "j", descriptor = "I")
    private int field4229 = 1;

    @OriginalMember(owner = "client!tha", name = "h", descriptor = "I")
    private int field4227 = 0;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)V", line = 3)
    public final void method1360(byte arg0) {
        if (this.field4224 > this.field4225) {
            this.field4225 += this.field4224 - this.field4225;
        }
        this.field4228 = 0L;
        if (arg0 <= 77) {
            this.method1361((byte) 69);
        }
    }

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "(I)J", line = 16)
    private final long method1975(int arg0) {
        if (arg0 != -2243) {
            this.field4229 = -55;
        }
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field4228;
        this.field4228 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4226[this.field4227] = var4;
            if (this.field4229 < 1) {
                this.field4229++;
            }
            this.field4227 = (this.field4227 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field4229; var8++) {
            var6 += this.field4226[(this.field4227 + 10 - var8) % 10];
        }
        return var6 / (long) this.field4229;
    }

    @OriginalMember(owner = "client!tha", name = "<init>", descriptor = "()V", line = 116)
    public class310() {
        this.field4224 = this.field4225 = jagmisc.nanoTime();
        if (this.field4225 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "(IJ)I", line = 56)
    public final int method1358(int arg0, long arg1) {
        if (arg0 != 4399) {
            this.field4226 = null;
        }
        if (this.field4224 > this.field4225) {
            this.field4228 += this.field4224 - this.field4225;
            this.field4225 += this.field4224 - this.field4225;
            this.field4224 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field4224 += arg1;
        } while (var4 < 10 && this.field4225 > this.field4224);
        if (this.field4225 > this.field4224) {
            this.field4224 = this.field4225;
        }
        return var4;
    }

    @OriginalMember(owner = "client!tha", name = "c", descriptor = "(B)J", line = 91)
    public final long method1359(byte arg0) {
        if (arg0 == -43) {
            this.field4225 += this.method1975(-2243);
            return this.field4225 < this.field4224 ? (this.field4224 - this.field4225) / 1000000L : 0L;
        } else {
            return 46L;
        }
    }

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "(B)J", line = 108)
    public final long method1361(byte arg0) {
        int var2 = 44 / ((arg0 - 35) / 48);
        return this.field4225;
    }
}
