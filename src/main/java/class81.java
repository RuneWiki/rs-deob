import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class81 extends class250 {

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "J")
    private long field1046 = 0L;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "[J")
    private long[] field1044 = new long[10];

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "J")
    private long field1047 = 0L;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "J")
    private long field1048 = 0L;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    private int field1045 = 1;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    private int field1049 = 0;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)J")
    public final long method191(boolean arg0) {
        if (!arg0) {
            this.method193((byte) -97);
        }
        return this.field1047;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public final void method193(byte arg0) {
        if (arg0 >= -47) {
            this.field1049 = -106;
        }
        if (this.field1047 < this.field1046) {
            this.field1047 += this.field1046 - this.field1047;
        }
        this.field1048 = 0L;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(Z)J")
    private final long method479(boolean arg0) {
        if (!arg0) {
            this.method479(false);
        }
        long var2 = class18.method107(-16145) * 1000000L;
        long var4 = var2 - this.field1048;
        this.field1048 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1044[this.field1049] = var4;
            if (this.field1045 < 10) {
                this.field1045++;
            }
            this.field1049 = (this.field1049 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field1045; var8++) {
            var6 += this.field1044[(this.field1049 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1045;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)I")
    public final int method194(int arg0, int arg1) {
        if (arg1 <= 41) {
            this.method194(-47, -28);
        }
        this.field1047 += this.method479(true);
        long var3 = (long) arg0 * 1000000L;
        if (this.field1047 < this.field1046) {
            class259.method1790((byte) -124, (this.field1046 - this.field1047) / 1000000L);
            this.field1048 += this.field1046 - this.field1047;
            this.field1047 += this.field1046 - this.field1047;
            this.field1046 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field1046 += var3;
        } while (var5 < 10 && this.field1047 > this.field1046);
        if (this.field1046 < this.field1047) {
            this.field1046 = this.field1047;
        }
        return var5;
    }
}
