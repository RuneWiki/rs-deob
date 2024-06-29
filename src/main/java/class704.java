import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class704 extends class129 {

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "I")
    private int field9955 = 1;

    @OriginalMember(owner = "client!tea", name = "g", descriptor = "J")
    private long field9956 = 0L;

    @OriginalMember(owner = "client!tea", name = "h", descriptor = "[J")
    private long[] field9957 = new long[10];

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "I")
    private int field9954 = 0;

    @OriginalMember(owner = "client!tea", name = "j", descriptor = "J")
    private long field9959 = 0L;

    @OriginalMember(owner = "client!tea", name = "i", descriptor = "J")
    private long field9958 = 0L;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)J", line = 3)
    public final long method899(int arg0) {
        this.field9956 += this.method3948((byte) 93);
        if (this.field9956 < this.field9958) {
            return (this.field9958 - this.field9956) / 1000000L;
        } else {
            if (arg0 != 92) {
                this.method898(117);
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(B)J", line = 20)
    private final long method3948(byte arg0) {
        long var2 = class254.method1619(true) * 1000000L;
        if (arg0 < 18) {
            this.field9959 = 100L;
        }
        long var4 = var2 - this.field9959;
        this.field9959 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field9957[this.field9954] = var4;
            if (this.field9955 < 10) {
                this.field9955++;
            }
            this.field9954 = (this.field9954 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field9955; var8++) {
            var6 += this.field9957[(this.field9954 + 10 - var8) % 10];
        }
        return var6 / (long) this.field9955;
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(I)J", line = 55)
    public final long method898(int arg0) {
        if (arg0 != -8905) {
            this.method3948((byte) -43);
        }
        return this.field9956;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Z)V", line = 69)
    public final void method900(boolean arg0) {
        if (this.field9958 > this.field9956) {
            this.field9956 += this.field9958 - this.field9956;
        }
        this.field9959 = 0L;
        if (!arg0) {
            this.field9958 = -113L;
        }
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(JI)I", line = 82)
    public final int method896(long arg0, int arg1) {
        if (arg1 != 0) {
            this.method3948((byte) 31);
        }
        if (this.field9956 < this.field9958) {
            this.field9959 += this.field9958 - this.field9956;
            this.field9956 += this.field9958 - this.field9956;
            this.field9958 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field9958 += arg0;
        } while (var4 < 10 && this.field9956 > this.field9958);
        if (this.field9958 < this.field9956) {
            this.field9958 = this.field9956;
        }
        return var4;
    }
}
