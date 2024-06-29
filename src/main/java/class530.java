import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class530 extends class555 {

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "J")
    private long field7014 = 0L;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "J")
    private long field7015 = 0L;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "J")
    private long field7018 = 0L;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    private int field7017 = 1;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "[J")
    private long[] field7016 = new long[10];

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    private int field7019 = 0;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V", line = 6)
    public final void method1093(byte arg0) {
        int var2 = -40 / ((21 - arg0) / 57);
        this.field7018 = 0L;
        if (this.field7014 > this.field7015) {
            this.field7015 += this.field7014 - this.field7015;
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V", line = 71)
    public class530() {
        this.field7015 = System.nanoTime();
        this.field7014 = System.nanoTime();
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(JI)I", line = 20)
    public final int method1091(long arg0, int arg1) {
        if (arg1 >= -123) {
            this.method2958((byte) -24);
        }
        if (this.field7015 < this.field7014) {
            this.field7018 += this.field7014 - this.field7015;
            this.field7015 += this.field7014 - this.field7015;
            this.field7014 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field7014 += arg0;
        } while (var4 < 10 && this.field7015 > this.field7014);
        if (this.field7014 < this.field7015) {
            this.field7014 = this.field7015;
        }
        return var4;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)J", line = 53)
    public final long method1092(int arg0) {
        if (arg0 != 6407) {
            this.field7016 = null;
        }
        this.field7015 += this.method2958((byte) -22);
        return this.field7015 < this.field7014 ? (this.field7014 - this.field7015) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)J", line = 82)
    private final long method2958(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field7018;
        if (arg0 != -22) {
            this.field7014 = 41L;
        }
        this.field7018 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7016[this.field7019] = var4;
            this.field7019 = (this.field7019 + 1) % 10;
            if (this.field7017 < 1) {
                this.field7017++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field7017; var8++) {
            var6 += this.field7016[(this.field7019 + 10 - var8) % 10];
        }
        return var6 / (long) this.field7017;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)J", line = 116)
    public final long method1094(int arg0) {
        if (arg0 != -21571) {
            this.method2958((byte) 115);
        }
        return this.field7015;
    }
}
