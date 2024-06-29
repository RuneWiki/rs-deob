import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class317 extends class330 {

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "J")
    private long field4276 = 0L;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "J")
    private long field4273 = 0L;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    private int field4277 = 1;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "J")
    private long field4274 = 0L;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    private int field4278 = 0;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "[J")
    private long[] field4275 = new long[10];

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)V", line = 3)
    public final void method1984(byte arg0) {
        if (this.field4274 > this.field4273) {
            this.field4273 += this.field4274 - this.field4273;
        }
        this.field4276 = 0L;
        if (arg0 != 117) {
            this.method1986((byte) -45);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)I", line = 20)
    public final int method1985(byte arg0, int arg1) {
        this.field4273 += this.method1987(-30633);
        long var3 = (long) arg1 * 1000000L;
        if (arg0 != 105) {
            this.method1986((byte) 110);
        }
        if (this.field4274 > this.field4273) {
            class219.method1330((this.field4274 - this.field4273) / 1000000L, true);
            this.field4276 += this.field4274 - this.field4273;
            this.field4273 += this.field4274 - this.field4273;
            this.field4274 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field4274 += var3;
            var5++;
        } while (var5 < 10 && this.field4274 < this.field4273);
        if (this.field4274 < this.field4273) {
            this.field4274 = this.field4273;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)J", line = 66)
    public final long method1986(byte arg0) {
        if (arg0 <= 44) {
            this.method1986((byte) -27);
        }
        return this.field4273;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)J", line = 79)
    private final long method1987(int arg0) {
        long var2 = class164.method1038(8635) * 1000000L;
        long var4 = var2 - this.field4276;
        this.field4276 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4275[this.field4278] = var4;
            this.field4278 = (this.field4278 + 1) % 10;
            if (this.field4277 < 10) {
                this.field4277++;
            }
        }
        long var6 = 0L;
        if (arg0 == -30633) {
            for (int var8 = 1; var8 <= this.field4277; var8++) {
                var6 += this.field4275[(this.field4278 + 10 - var8) % 10];
            }
            return var6 / (long) this.field4277;
        } else {
            return -23L;
        }
    }
}
