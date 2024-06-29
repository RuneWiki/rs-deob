import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class74 extends class409 {

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "J")
    private long field1156 = 0L;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "J")
    private long field1155 = 0L;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "I")
    private int field1157 = 1;

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "[J")
    private long[] field1159 = new long[10];

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "J")
    private long field1158 = 0L;

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "I")
    private int field1160 = 0;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)J", line = 6)
    private final long method490(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field1158;
        this.field1158 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1159[this.field1160] = var4;
            this.field1160 = (this.field1160 + 1) % 10;
            if (this.field1157 < 1) {
                this.field1157++;
            }
        }
        long var6 = 0L;
        int var8 = 1;
        if (arg0 > -50) {
            return -2L;
        }
        while (var8 <= this.field1157) {
            var6 += this.field1159[(this.field1160 + 10 - var8) % 10];
            var8++;
        }
        return var6 / (long) this.field1157;
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)J", line = 39)
    public final long method491(int arg0) {
        return arg0 == -30419 ? this.field1155 : 50L;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V", line = 51)
    public final void method492(int arg0) {
        int var2 = -18 / ((50 - arg0) / 60);
        this.field1158 = 0L;
        if (this.field1156 > this.field1155) {
            this.field1155 += this.field1156 - this.field1155;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BI)I", line = 63)
    public final int method493(byte arg0, int arg1) {
        if (arg0 != -126) {
            this.field1155 = -114L;
        }
        long var3 = (long) arg1 * 1000000L;
        this.field1155 += this.method490((byte) -117);
        if (this.field1156 > this.field1155) {
            class4.method28((this.field1156 - this.field1155) / 1000000L, 63);
            this.field1158 += this.field1156 - this.field1155;
            this.field1155 += this.field1156 - this.field1155;
            this.field1156 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field1156 += var3;
        } while (var5 < 10 && this.field1155 > this.field1156);
        if (this.field1155 > this.field1156) {
            this.field1156 = this.field1155;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "()V", line = 103)
    public class74() {
        this.field1155 = System.nanoTime();
        this.field1156 = System.nanoTime();
    }
}
