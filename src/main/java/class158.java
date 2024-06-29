import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class158 extends class284 {

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "J")
    private long field2000 = 0L;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "J")
    private long field1999 = 0L;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "J")
    private long field2001 = 0L;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    private int field2002 = 0;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    private int field2003 = 1;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "[J")
    private long[] field2004 = new long[10];

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)J", line = 5)
    public final long method542(int arg0) {
        return arg0 <= 105 ? 118L : this.field1999;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V", line = 15)
    public final void method543(int arg0) {
        if (arg0 >= -48) {
            this.field2000 = 30L;
        }
        this.field2001 = 0L;
        if (this.field2000 > this.field1999) {
            this.field1999 += this.field2000 - this.field1999;
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V", line = 104)
    public class158() {
        this.field1999 = System.nanoTime();
        this.field2000 = System.nanoTime();
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)J", line = 34)
    private final long method1021(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field2001;
        this.field2001 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2004[this.field2002] = var4;
            if (this.field2003 < 1) {
                this.field2003++;
            }
            this.field2002 = (this.field2002 + 1) % 10;
        }
        if (arg0 != -104) {
            this.field2001 = 59L;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field2003; var8++) {
            var6 += this.field2004[(this.field2002 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2003;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)I", line = 68)
    public final int method544(int arg0, int arg1) {
        this.field1999 += this.method1021((byte) -104);
        long var3 = (long) arg1 * 1000000L;
        int var5 = -83 / ((arg0 + 80) / 44);
        if (this.field2000 > this.field1999) {
            class199.method1251((this.field2000 - this.field1999) / 1000000L, (byte) 116);
            this.field2001 += this.field2000 - this.field1999;
            this.field1999 += this.field2000 - this.field1999;
            this.field2000 += var3;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field2000 += var3;
        } while (var6 < 10 && this.field2000 < this.field1999);
        if (this.field1999 > this.field2000) {
            this.field2000 = this.field1999;
        }
        return var6;
    }
}
