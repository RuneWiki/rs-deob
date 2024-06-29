import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class74 extends class105 {

    @OriginalMember(owner = "client!td", name = "f", descriptor = "J")
    private long field1210 = 0L;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    private int field1207 = 0;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "J")
    private long field1208 = 0L;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    private int field1209 = 1;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "[J")
    private long[] field1211 = new long[10];

    @OriginalMember(owner = "client!td", name = "h", descriptor = "J")
    private long field1212 = 0L;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)J")
    public final long method499(int arg0) {
        if (arg0 != -22091) {
            this.field1208 = -123L;
        }
        return this.field1208;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public final void method500(int arg0) {
        if (arg0 < -40) {
            if (this.field1208 < this.field1210) {
                this.field1208 += this.field1210 - this.field1208;
            }
            this.field1212 = 0L;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)I")
    public final int method501(int arg0, int arg1, int arg2) {
        if (arg2 != 25912) {
            this.method500(36);
        }
        class250.method1643(1, (long) arg0);
        this.field1208 += this.method502(true);
        long var4 = (long) arg1 * 1000000L;
        if (this.field1208 < this.field1210) {
            class250.method1643(1, (this.field1210 - this.field1208) / 1000000L);
            this.field1212 += this.field1210 - this.field1208;
            this.field1208 += this.field1210 - this.field1208;
            this.field1210 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field1210 += var4;
            var6++;
        } while (var6 < 10 && this.field1208 > this.field1210);
        if (this.field1210 < this.field1208) {
            this.field1210 = this.field1208;
        }
        return var6;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)J")
    private final long method502(boolean arg0) {
        long var2 = 0L;
        long var4 = class263.method1754(4) * 1000000L;
        long var6 = var4 - this.field1212;
        this.field1212 = var4;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field1211[this.field1207] = var6;
            this.field1207 = (this.field1207 + 1) % 10;
            if (this.field1209 < 10) {
                this.field1209++;
            }
        }
        if (arg0) {
            for (int var8 = 1; var8 <= this.field1209; var8++) {
                var2 += this.field1211[(this.field1207 + 10 - var8) % 10];
            }
            return var2 / (long) this.field1209;
        } else {
            return 113L;
        }
    }
}
