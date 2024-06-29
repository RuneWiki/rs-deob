import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class263 extends class124 {

    @OriginalMember(owner = "client!td", name = "h", descriptor = "J")
    private long field3698 = 0L;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "J")
    private long field3697 = 0L;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    private int field3700 = 0;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    private int field3699 = 1;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "J")
    private long field3701 = 0L;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "[J")
    private long[] field3702 = new long[10];

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)I")
    public final int method300(int arg0, int arg1) {
        if (arg1 != 6223) {
            this.field3697 = 70L;
        }
        long var3 = (long) arg0 * 1000000L;
        this.field3698 += this.method1685(27243);
        if (this.field3698 < this.field3697) {
            class278.method1757((this.field3697 - this.field3698) / 1000000L, 0);
            this.field3701 += this.field3697 - this.field3698;
            this.field3698 += this.field3697 - this.field3698;
            this.field3697 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field3697 += var3;
            var5++;
        } while (var5 < 10 && this.field3698 > this.field3697);
        if (this.field3697 < this.field3698) {
            this.field3697 = this.field3698;
        }
        return var5;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public final void method301(int arg0) {
        if (arg0 != -1) {
            this.method301(-17);
        }
        this.field3701 = 0L;
        if (this.field3698 < this.field3697) {
            this.field3698 += this.field3697 - this.field3698;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)J")
    public final long method299(byte arg0) {
        if (arg0 != -95) {
            this.method300(-54, -98);
        }
        return this.field3698;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)J")
    private final long method1685(int arg0) {
        long var2 = jagmisc.nanoTime();
        if (arg0 != 27243) {
            this.field3702 = null;
        }
        long var4 = var2 - this.field3701;
        this.field3701 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3702[this.field3700] = var4;
            this.field3700 = (this.field3700 + 1) % 10;
            if (this.field3699 < 1) {
                this.field3699++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field3699; var8++) {
            var6 += this.field3702[(this.field3700 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3699;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    public class263() {
        this.field3697 = this.field3698 = jagmisc.nanoTime();
        if (this.field3698 == 0L) {
            throw new RuntimeException();
        }
    }
}
