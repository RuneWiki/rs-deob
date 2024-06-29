import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class16 extends class715 {

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "J")
    private long field117 = 0L;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "J")
    private long field118 = 0L;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "[J")
    private long[] field119 = new long[10];

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    private int field121 = 1;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    private int field120 = 0;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "J")
    private long field122 = 0L;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
    public final void method67(boolean arg0) {
        this.field122 = 0L;
        if (this.field117 > this.field118) {
            this.field118 += this.field117 - this.field118;
        }
        if (arg0) {
            this.method70((byte) -114);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)J")
    public final long method68(byte arg0) {
        this.field118 += this.method71(-123);
        if (this.field118 < this.field117) {
            return (this.field117 - this.field118) / 1000000L;
        } else {
            if (arg0 >= -80) {
                this.method69(73, -115L);
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(IJ)I")
    public final int method69(int arg0, long arg1) {
        if (arg0 <= 117) {
            this.field118 = -7L;
        }
        if (this.field118 < this.field117) {
            this.field122 += this.field117 - this.field118;
            this.field118 += this.field117 - this.field118;
            this.field117 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field117 += arg1;
        } while (var4 < 10 && this.field117 < this.field118);
        if (this.field118 > this.field117) {
            this.field117 = this.field118;
        }
        return var4;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)J")
    public final long method70(byte arg0) {
        return arg0 <= 12 ? 126L : this.field118;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)J")
    private final long method71(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field122;
        this.field122 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field119[this.field120] = var4;
            this.field120 = (this.field120 + 1) % 10;
            if (this.field121 < 1) {
                this.field121++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field121; var8++) {
            var6 += this.field119[(this.field120 + 10 - var8) % 10];
        }
        int var9 = 28 / ((arg0 + 84) / 38);
        return var6 / (long) this.field121;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
    public class16() {
        this.field118 = System.nanoTime();
        this.field117 = System.nanoTime();
    }
}
