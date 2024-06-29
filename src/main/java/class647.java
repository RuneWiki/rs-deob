import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class647 extends class284 {

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "J")
    private long field9151 = 0L;

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "J")
    private long field9152 = 0L;

    @OriginalMember(owner = "client!lv", name = "i", descriptor = "I")
    private int field9153 = 1;

    @OriginalMember(owner = "client!lv", name = "k", descriptor = "[J")
    private long[] field9155 = new long[10];

    @OriginalMember(owner = "client!lv", name = "j", descriptor = "J")
    private long field9154 = 0L;

    @OriginalMember(owner = "client!lv", name = "l", descriptor = "I")
    private int field9156 = 0;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Z)J")
    public final long method706(boolean arg0) {
        if (!arg0) {
            this.field9156 = 120;
        }
        this.field9152 += this.method3594((byte) 118);
        return this.field9151 > this.field9152 ? (this.field9151 - this.field9152) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IJ)I")
    public final int method704(int arg0, long arg1) {
        if (arg0 != -65536) {
            return -29;
        } else if (this.field9151 > this.field9152) {
            this.field9154 += this.field9151 - this.field9152;
            this.field9152 += this.field9151 - this.field9152;
            this.field9151 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field9151 += arg1;
            } while (var4 < 10 && this.field9151 < this.field9152);
            if (this.field9151 < this.field9152) {
                this.field9151 = this.field9152;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)V")
    public final void method703(int arg0) {
        this.field9154 = 0L;
        if (arg0 != -19014) {
            this.field9152 = -128L;
        }
        if (this.field9152 < this.field9151) {
            this.field9152 += this.field9151 - this.field9152;
        }
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(B)J")
    private final long method3594(byte arg0) {
        long var2 = jagmisc.nanoTime();
        if (arg0 < 60) {
            return 121L;
        }
        long var4 = var2 - this.field9154;
        this.field9154 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field9155[this.field9156] = var4;
            if (this.field9153 < 1) {
                this.field9153++;
            }
            this.field9156 = (this.field9156 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field9153; var8++) {
            var6 += this.field9155[(this.field9156 + 10 - var8) % 10];
        }
        return var6 / (long) this.field9153;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)J")
    public final long method702(int arg0) {
        if (arg0 != 3) {
            this.field9156 = 122;
        }
        return this.field9152;
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "()V")
    public class647() {
        this.field9151 = this.field9152 = jagmisc.nanoTime();
        if (this.field9152 == 0L) {
            throw new RuntimeException();
        }
    }
}
