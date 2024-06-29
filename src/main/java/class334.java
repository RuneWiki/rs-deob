import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class334 extends class310 {

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "J")
    private long field4128 = 0L;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "J")
    private long field4129 = 0L;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "[J")
    private long[] field4130 = new long[10];

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    private int field4131 = 1;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    private int field4132 = 0;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "J")
    private long field4133 = 0L;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)J", line = 4)
    public final long method1831(int arg0) {
        if (arg0 != -2) {
            this.method1833((byte) -74);
        }
        return this.field4129;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)J", line = 14)
    public final long method1836(boolean arg0) {
        this.field4129 += this.method1976((byte) 97);
        if (this.field4128 <= this.field4129) {
            if (!arg0) {
                this.method1836(false);
            }
            return 0L;
        } else {
            return (this.field4128 - this.field4129) / 1000000L;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)J", line = 32)
    private final long method1976(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field4133;
        this.field4133 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4130[this.field4132] = var4;
            this.field4132 = (this.field4132 + 1) % 10;
            if (this.field4131 < 1) {
                this.field4131++;
            }
        }
        if (arg0 != 97) {
            this.method1836(false);
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field4131; var8++) {
            var6 += this.field4130[(this.field4132 + 10 - var8) % 10];
        }
        return var6 / (long) this.field4131;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V", line = 64)
    public final void method1833(byte arg0) {
        this.field4133 = 0L;
        if (arg0 < 16) {
            this.field4130 = null;
        }
        if (this.field4129 < this.field4128) {
            this.field4129 += this.field4128 - this.field4129;
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V", line = 116)
    public class334() {
        this.field4129 = System.nanoTime();
        this.field4128 = System.nanoTime();
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(JI)I", line = 81)
    public final int method1835(long arg0, int arg1) {
        if (arg1 != 3) {
            this.field4129 = -117L;
        }
        if (this.field4128 > this.field4129) {
            this.field4133 += this.field4128 - this.field4129;
            this.field4129 += this.field4128 - this.field4129;
            this.field4128 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field4128 += arg0;
        } while (var4 < 10 && this.field4129 > this.field4128);
        if (this.field4128 < this.field4129) {
            this.field4128 = this.field4129;
        }
        return var4;
    }
}
