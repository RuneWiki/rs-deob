import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class272 extends class325 {

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "J")
    private long field4088 = 0L;

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "J")
    private long field4089 = 0L;

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "I")
    private int field4090 = 0;

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
    private int field4093 = 1;

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "J")
    private long field4091 = 0L;

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "[J")
    private long[] field4092 = new long[10];

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)J")
    private final long method1774(int arg0) {
        long var2 = class435.method2539(-10659) * 1000000L;
        long var4 = var2 - this.field4091;
        this.field4091 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4092[this.field4090] = var4;
            if (this.field4093 < 10) {
                this.field4093++;
            }
            this.field4090 = (this.field4090 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0 != -6342) {
            this.method1774(-70);
        }
        for (int var8 = 1; var8 <= this.field4093; var8++) {
            var6 += this.field4092[(this.field4090 + 10 - var8) % 10];
        }
        return var6 / (long) this.field4093;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V")
    public final void method716(byte arg0) {
        if (this.field4088 > this.field4089) {
            this.field4089 += this.field4088 - this.field4089;
        }
        if (arg0 >= -35) {
            this.field4092 = null;
        }
        this.field4091 = 0L;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)I")
    public final int method719(int arg0, int arg1) {
        int var3 = 0 % ((arg0 - 2) / 43);
        long var4 = (long) arg1 * 1000000L;
        this.field4089 += this.method1774(-6342);
        if (this.field4088 > this.field4089) {
            class325.method2005(true, (this.field4088 - this.field4089) / 1000000L);
            this.field4091 += this.field4088 - this.field4089;
            this.field4089 += this.field4088 - this.field4089;
            this.field4088 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field4088 += var4;
            var6++;
        } while (var6 < 10 && this.field4089 > this.field4088);
        if (this.field4089 > this.field4088) {
            this.field4088 = this.field4089;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)J")
    public final long method718(boolean arg0) {
        return arg0 ? 91L : this.field4089;
    }
}
