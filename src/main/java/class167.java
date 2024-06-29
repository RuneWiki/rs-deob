import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class167 extends class601 {

    @OriginalMember(owner = "client!r", name = "j", descriptor = "J")
    private long field2004 = 0L;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "J")
    private long field2005 = 0L;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "[J")
    private long[] field2006 = new long[10];

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    private int field2007 = 0;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    private int field2008 = 1;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "J")
    private long field2009 = 0L;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V", line = 4)
    public final void method999(boolean arg0) {
        this.field2009 = 0L;
        if (arg0) {
            this.method1002(true);
        }
        if (this.field2004 < this.field2005) {
            this.field2004 += this.field2005 - this.field2004;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)J", line = 17)
    public final long method1000(byte arg0) {
        if (arg0 != -19) {
            this.field2006 = null;
        }
        return this.field2004;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BJ)I", line = 28)
    public final int method1001(byte arg0, long arg1) {
        int var4 = -31 / ((-arg0 - 38) / 43);
        if (this.field2004 < this.field2005) {
            this.field2009 += this.field2005 - this.field2004;
            this.field2004 += this.field2005 - this.field2004;
            this.field2005 += arg1;
            return 1;
        }
        int var5 = 0;
        do {
            this.field2005 += arg1;
            var5++;
        } while (var5 < 10 && this.field2004 > this.field2005);
        if (this.field2005 < this.field2004) {
            this.field2005 = this.field2004;
        }
        return var5;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V", line = 114)
    public class167() {
        this.field2004 = System.nanoTime();
        this.field2005 = System.nanoTime();
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)J", line = 62)
    public final long method1002(boolean arg0) {
        this.field2004 += this.method1003(22859);
        if (arg0) {
            this.field2008 = 29;
        }
        return this.field2005 <= this.field2004 ? 0L : (this.field2005 - this.field2004) / 1000000L;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)J", line = 82)
    private final long method1003(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field2009;
        this.field2009 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2006[this.field2007] = var4;
            this.field2007 = (this.field2007 + 1) % 10;
            if (this.field2008 < 1) {
                this.field2008++;
            }
        }
        if (arg0 != 22859) {
            this.method1001((byte) 11, 21L);
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field2008; var8++) {
            var6 += this.field2006[(this.field2007 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2008;
    }
}
