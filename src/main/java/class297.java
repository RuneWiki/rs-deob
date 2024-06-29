import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class297 extends class466 {

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "J")
    private long field4403 = 0L;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "J")
    private long field4404 = 0L;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    private int field4405 = 0;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "[J")
    private long[] field4407 = new long[10];

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "J")
    private long field4406 = 0L;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    private int field4408 = 1;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)J")
    private final long method1909(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field4406;
        this.field4406 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4407[this.field4405] = var4;
            if (this.field4408 < 1) {
                this.field4408++;
            }
            this.field4405 = (this.field4405 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field4408; var8++) {
            var6 += this.field4407[(this.field4405 + 10 - var8) % 10];
        }
        if (arg0 != 49) {
            this.method334((byte) 86);
        }
        return var6 / (long) this.field4408;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
    public final void method336(int arg0) {
        this.field4406 = arg0;
        if (this.field4404 > this.field4403) {
            this.field4403 += this.field4404 - this.field4403;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)I")
    public final int method337(int arg0, int arg1) {
        this.field4403 += this.method1909((byte) 49);
        long var3 = (long) arg0 * 1000000L;
        if (arg1 != 8) {
            this.field4407 = null;
        }
        if (this.field4404 > this.field4403) {
            class106.method710((this.field4404 - this.field4403) / 1000000L, (byte) 6);
            this.field4406 += this.field4404 - this.field4403;
            this.field4403 += this.field4404 - this.field4403;
            this.field4404 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field4404 += var3;
        } while (var5 < 10 && this.field4403 > this.field4404);
        if (this.field4403 > this.field4404) {
            this.field4404 = this.field4403;
        }
        return var5;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)J")
    public final long method334(byte arg0) {
        if (arg0 <= 47) {
            this.field4406 = -44L;
        }
        return this.field4403;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    public class297() {
        this.field4404 = this.field4403 = jagmisc.nanoTime();
        if (this.field4403 == 0L) {
            throw new RuntimeException();
        }
    }
}
