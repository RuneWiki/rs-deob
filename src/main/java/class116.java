import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class116 extends class30 {

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "[J")
    private long[] field1575 = new long[10];

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "J")
    private long field1572 = 0L;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "J")
    private long field1574 = 0L;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    private int field1573 = 0;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    private int field1577 = 1;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "J")
    private long field1576 = 0L;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)I")
    public final int method301(int arg0, int arg1) {
        if (arg0 != -9862) {
            return -113;
        }
        long var3 = (long) arg1 * 1000000L;
        this.field1574 += this.method806(-17070);
        if (this.field1572 > this.field1574) {
            class418.method2587(false, (this.field1572 - this.field1574) / 1000000L);
            this.field1576 += this.field1572 - this.field1574;
            this.field1574 += this.field1572 - this.field1574;
            this.field1572 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field1572 += var3;
            var5++;
        } while (var5 < 10 && this.field1572 < this.field1574);
        if (this.field1572 < this.field1574) {
            this.field1572 = this.field1574;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
    public final void method302(byte arg0) {
        this.field1576 = 0L;
        if (this.field1572 > this.field1574) {
            this.field1574 += this.field1572 - this.field1574;
        }
        if (arg0 >= -20) {
            this.field1573 = -106;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)J")
    private final long method806(int arg0) {
        if (arg0 != -17070) {
            this.field1574 = 7L;
        }
        long var2 = class43.method364(-16756) * 1000000L;
        long var4 = var2 - this.field1576;
        this.field1576 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1575[this.field1573] = var4;
            this.field1573 = (this.field1573 + 1) % 10;
            if (this.field1577 < 10) {
                this.field1577++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field1577; var8++) {
            var6 += this.field1575[(this.field1573 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1577;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)J")
    public final long method303(byte arg0) {
        int var2 = -76 / ((-arg0 - 71) / 32);
        return this.field1574;
    }
}
