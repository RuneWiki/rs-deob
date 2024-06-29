import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class516 extends class498 {

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "J")
    private long field7019 = 0L;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "J")
    private long field7018 = 0L;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "[J")
    private long[] field7020 = new long[10];

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    private int field7023 = 1;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "J")
    private long field7022 = 0L;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    private int field7021 = 0;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)J", line = 5)
    private final long method2946(boolean arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field7022;
        this.field7022 = var2;
        if (!arg0) {
            return -32L;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7020[this.field7021] = var4;
            if (this.field7023 < 1) {
                this.field7023++;
            }
            this.field7021 = (this.field7021 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field7023; var8++) {
            var6 += this.field7020[(this.field7021 + 10 - var8) % 10];
        }
        return var6 / (long) this.field7023;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V", line = 91)
    public class516() {
        this.field7018 = System.nanoTime();
        this.field7019 = System.nanoTime();
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V", line = 43)
    public final void method1360(byte arg0) {
        this.field7022 = 0L;
        if (arg0 < 77) {
            this.field7020 = null;
        }
        if (this.field7018 < this.field7019) {
            this.field7018 += this.field7019 - this.field7018;
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(IJ)I", line = 57)
    public final int method1358(int arg0, long arg1) {
        if (arg0 != 4399) {
            this.field7023 = 50;
        }
        if (this.field7018 < this.field7019) {
            this.field7022 += this.field7019 - this.field7018;
            this.field7018 += this.field7019 - this.field7018;
            this.field7019 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field7019 += arg1;
        } while (var4 < 10 && this.field7019 < this.field7018);
        if (this.field7018 > this.field7019) {
            this.field7019 = this.field7018;
        }
        return var4;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(B)J", line = 109)
    public final long method1361(byte arg0) {
        int var2 = -65 % ((35 - arg0) / 48);
        return this.field7018;
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(B)J", line = 120)
    public final long method1359(byte arg0) {
        this.field7018 += this.method2946(true);
        if (arg0 != -43) {
            this.method2946(true);
        }
        return this.field7018 >= this.field7019 ? 0L : (this.field7019 - this.field7018) / 1000000L;
    }
}
