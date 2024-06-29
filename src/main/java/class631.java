import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class631 extends class158 {

    @OriginalMember(owner = "client!nfa", name = "l", descriptor = "J")
    private long field8813 = 0L;

    @OriginalMember(owner = "client!nfa", name = "m", descriptor = "I")
    private int field8814 = 1;

    @OriginalMember(owner = "client!nfa", name = "p", descriptor = "[J")
    private long[] field8817 = new long[10];

    @OriginalMember(owner = "client!nfa", name = "o", descriptor = "I")
    private int field8816 = 0;

    @OriginalMember(owner = "client!nfa", name = "n", descriptor = "J")
    private long field8815 = 0L;

    @OriginalMember(owner = "client!nfa", name = "q", descriptor = "J")
    private long field8818 = 0L;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IJ)I", line = 3)
    public final int method449(int arg0, long arg1) {
        if (arg0 != -19913) {
            this.method451(-93);
        }
        if (this.field8818 < this.field8813) {
            this.field8815 += this.field8813 - this.field8818;
            this.field8818 += this.field8813 - this.field8818;
            this.field8813 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field8813 += arg1;
            var4++;
        } while (var4 < 10 && this.field8813 < this.field8818);
        if (this.field8813 < this.field8818) {
            this.field8813 = this.field8818;
        }
        return var4;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)V", line = 38)
    public final void method450(int arg0) {
        this.field8815 = 0L;
        if (arg0 <= -30 && this.field8813 > this.field8818) {
            this.field8818 += this.field8813 - this.field8818;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)J", line = 59)
    public final long method448(byte arg0) {
        this.field8818 += this.method3514(arg0 ^ 0xFFFFFFCF);
        if (this.field8813 > this.field8818) {
            return (this.field8813 - this.field8818) / 1000000L;
        } else if (arg0 == 123) {
            return 0L;
        } else {
            return -27L;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "(I)J", line = 77)
    public final long method451(int arg0) {
        if (arg0 > -20) {
            this.method449(50, 95L);
        }
        return this.field8818;
    }

    @OriginalMember(owner = "client!nfa", name = "f", descriptor = "(I)J", line = 88)
    private final long method3514(int arg0) {
        long var2 = class490.method2840(true) * 1000000L;
        long var4 = var2 - this.field8815;
        this.field8815 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field8817[this.field8816] = var4;
            if (this.field8814 < 10) {
                this.field8814++;
            }
            this.field8816 = (this.field8816 + 1) % 10;
        }
        long var6 = 0L;
        int var8 = 1;
        int var9 = 61 / ((8 - arg0) / 60);
        while (var8 <= this.field8814) {
            var6 += this.field8817[(this.field8816 + 10 - var8) % 10];
            var8++;
        }
        return var6 / (long) this.field8814;
    }
}
