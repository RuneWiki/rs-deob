import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class270 extends class183 {

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "J")
    private long field3752 = 0L;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "J")
    private long field3753 = 0L;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    private int field3754 = 1;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "J")
    private long field3756 = 0L;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "[J")
    private long[] field3757 = new long[10];

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    private int field3755 = 0;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)J")
    private final long method1773(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field3756;
        this.field3756 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3757[this.field3755] = var4;
            if (this.field3754 < 1) {
                this.field3754++;
            }
            this.field3755 = (this.field3755 + 1) % 10;
        }
        long var6 = 0L;
        int var8 = -84 % ((arg0 - 37) / 52);
        for (int var9 = 1; var9 <= this.field3754; var9++) {
            var6 += this.field3757[(this.field3755 + 10 - var9) % 10];
        }
        return var6 / (long) this.field3754;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public final void method1194(byte arg0) {
        this.field3756 = 0L;
        if (this.field3752 > this.field3753) {
            this.field3753 += this.field3752 - this.field3753;
        }
        if (arg0 != -41) {
            this.method1194((byte) 6);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)J")
    public final long method1198(int arg0) {
        return arg0 > -69 ? 20L : this.field3753;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)I")
    public final int method1195(int arg0, byte arg1) {
        this.field3753 += this.method1773(-25);
        long var3 = (long) arg0 * 1000000L;
        if (arg1 > -44) {
            return 74;
        } else if (this.field3753 < this.field3752) {
            class349.method2219((this.field3752 - this.field3753) / 1000000L, -118);
            this.field3756 += this.field3752 - this.field3753;
            this.field3753 += this.field3752 - this.field3753;
            this.field3752 += var3;
            return 1;
        } else {
            int var5 = 0;
            do {
                var5++;
                this.field3752 += var3;
            } while (var5 < 10 && this.field3752 < this.field3753);
            if (this.field3753 > this.field3752) {
                this.field3752 = this.field3753;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
    public class270() {
        this.field3752 = this.field3753 = jagmisc.nanoTime();
        if (this.field3753 == 0L) {
            throw new RuntimeException();
        }
    }
}
