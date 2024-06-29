import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class75 extends class335 {

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "J")
    private long field979 = 0L;

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "J")
    private long field980 = 0L;

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "J")
    private long field981 = 0L;

    @OriginalMember(owner = "client!aw", name = "k", descriptor = "I")
    private int field983 = 0;

    @OriginalMember(owner = "client!aw", name = "j", descriptor = "I")
    private int field982 = 1;

    @OriginalMember(owner = "client!aw", name = "l", descriptor = "[J")
    private long[] field984 = new long[10];

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)J")
    public final long method164(int arg0) {
        if (arg0 != -9876) {
            this.method163(100, 58L);
        }
        this.field980 += this.method604((byte) -123);
        return this.field979 <= this.field980 ? 0L : (this.field979 - this.field980) / 1000000L;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)J")
    public final long method160(byte arg0) {
        if (arg0 < 2) {
            this.method604((byte) -124);
        }
        return this.field980;
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)V")
    public final void method161(int arg0) {
        int var2 = 78 / ((-arg0 - 65) / 48);
        if (this.field980 < this.field979) {
            this.field980 += this.field979 - this.field980;
        }
        this.field981 = 0L;
    }

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "(B)J")
    private final long method604(byte arg0) {
        if (arg0 >= -119) {
            this.method163(70, 71L);
        }
        long var2 = System.nanoTime();
        long var4 = var2 - this.field981;
        this.field981 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field984[this.field983] = var4;
            this.field983 = (this.field983 + 1) % 10;
            if (this.field982 < 1) {
                this.field982++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field982; var8++) {
            var6 += this.field984[(this.field983 + 10 - var8) % 10];
        }
        return var6 / (long) this.field982;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IJ)I")
    public final int method163(int arg0, long arg1) {
        if (arg0 != 70) {
            return 43;
        } else if (this.field979 > this.field980) {
            this.field981 += this.field979 - this.field980;
            this.field980 += this.field979 - this.field980;
            this.field979 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field979 += arg1;
            } while (var4 < 10 && this.field980 > this.field979);
            if (this.field979 < this.field980) {
                this.field979 = this.field980;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "()V")
    public class75() {
        this.field980 = System.nanoTime();
        this.field979 = System.nanoTime();
    }
}
