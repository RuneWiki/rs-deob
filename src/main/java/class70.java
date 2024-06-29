import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class70 extends class193 {

    @OriginalMember(owner = "client!haa", name = "h", descriptor = "I")
    private int field1173 = 1;

    @OriginalMember(owner = "client!haa", name = "j", descriptor = "J")
    private long field1175 = 0L;

    @OriginalMember(owner = "client!haa", name = "m", descriptor = "I")
    private int field1178 = 0;

    @OriginalMember(owner = "client!haa", name = "i", descriptor = "[J")
    private long[] field1174 = new long[10];

    @OriginalMember(owner = "client!haa", name = "k", descriptor = "J")
    private long field1176 = 0L;

    @OriginalMember(owner = "client!haa", name = "l", descriptor = "J")
    private long field1177 = 0L;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Z)V")
    public final void method570(boolean arg0) {
        if (arg0) {
            this.field1176 = -22L;
        }
        if (this.field1175 > this.field1176) {
            this.field1176 += this.field1175 - this.field1176;
        }
        this.field1177 = 0L;
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)J")
    public final long method571(int arg0) {
        if (arg0 < 105) {
            this.field1173 = 25;
        }
        return this.field1176;
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(Z)J")
    private final long method572(boolean arg0) {
        long var2 = class488.method2835(30160) * 1000000L;
        long var4 = var2 - this.field1177;
        this.field1177 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1174[this.field1178] = var4;
            this.field1178 = (this.field1178 + 1) % 10;
            if (this.field1173 < 10) {
                this.field1173++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field1173; var8++) {
            var6 += this.field1174[(this.field1178 + 10 - var8) % 10];
        }
        return arg0 ? 63L : var6 / (long) this.field1173;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)J")
    public final long method573(byte arg0) {
        this.field1176 += this.method572(false);
        if (arg0 <= 38) {
            return 46L;
        } else if (this.field1176 < this.field1175) {
            return (this.field1175 - this.field1176) / 1000000L;
        } else {
            return 0L;
        }
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(IJ)I")
    public final int method574(int arg0, long arg1) {
        if (arg0 != 2) {
            this.method571(-61);
        }
        if (this.field1175 > this.field1176) {
            this.field1177 += this.field1175 - this.field1176;
            this.field1176 += this.field1175 - this.field1176;
            this.field1175 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field1175 += arg1;
        } while (var4 < 10 && this.field1176 > this.field1175);
        if (this.field1176 > this.field1175) {
            this.field1175 = this.field1176;
        }
        return var4;
    }
}
