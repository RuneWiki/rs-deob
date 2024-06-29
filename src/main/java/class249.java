import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class249 extends class129 {

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "J")
    private long field3612 = 0L;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "J")
    private long field3613 = 0L;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    private int field3616 = 0;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    private int field3614 = 1;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "[J")
    private long[] field3615 = new long[10];

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "J")
    private long field3617 = 0L;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)J", line = 5)
    private final long method1596(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field3617;
        this.field3617 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3615[this.field3616] = var4;
            if (this.field3614 < 1) {
                this.field3614++;
            }
            this.field3616 = (this.field3616 + 1) % 10;
        }
        long var6 = 0L;
        int var8 = 43 % ((36 - arg0) / 45);
        for (int var9 = 1; var9 <= this.field3614; var9++) {
            var6 += this.field3615[(this.field3616 + 10 - var9) % 10];
        }
        return var6 / (long) this.field3614;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)J", line = 37)
    public final long method898(int arg0) {
        if (arg0 != -8905) {
            this.method1596(19);
        }
        return this.field3612;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)J", line = 47)
    public final long method899(int arg0) {
        this.field3612 += this.method1596(96);
        if (this.field3613 > this.field3612) {
            return (this.field3613 - this.field3612) / 1000000L;
        } else if (arg0 == 92) {
            return 0L;
        } else {
            return 85L;
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V", line = 115)
    public class249() {
        this.field3612 = System.nanoTime();
        this.field3613 = System.nanoTime();
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V", line = 67)
    public final void method900(boolean arg0) {
        this.field3617 = 0L;
        if (arg0 && this.field3613 > this.field3612) {
            this.field3612 += this.field3613 - this.field3612;
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(JI)I", line = 84)
    public final int method896(long arg0, int arg1) {
        if (arg1 != 0) {
            return -85;
        } else if (this.field3612 < this.field3613) {
            this.field3617 += this.field3613 - this.field3612;
            this.field3612 += this.field3613 - this.field3612;
            this.field3613 += arg0;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field3613 += arg0;
            } while (var4 < 10 && this.field3612 > this.field3613);
            if (this.field3612 > this.field3613) {
                this.field3613 = this.field3612;
            }
            return var4;
        }
    }
}
