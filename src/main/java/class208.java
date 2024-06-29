import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class208 extends class193 {

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "J")
    private long field2918 = 0L;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "J")
    private long field2917 = 0L;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "J")
    private long field2921 = 0L;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    private int field2922 = 0;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "[J")
    private long[] field2919 = new long[10];

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    private int field2920 = 1;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)I", line = 12)
    public final int method553(int arg0, int arg1) {
        if (arg0 != 4970) {
            this.method553(104, 111);
        }
        long var3 = (long) arg1 * 1000000L;
        this.field2921 += this.method1402(arg0 - 5087);
        if (this.field2918 > this.field2921) {
            class328.method1999(0, (this.field2918 - this.field2921) / 1000000L);
            this.field2917 += this.field2918 - this.field2921;
            this.field2921 += this.field2918 - this.field2921;
            this.field2918 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field2918 += var3;
        } while (var5 < 10 && this.field2921 > this.field2918);
        if (this.field2918 < this.field2921) {
            this.field2918 = this.field2921;
        }
        return var5;
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(B)V", line = 50)
    public final void method551(byte arg0) {
        this.field2917 = 0L;
        if (this.field2918 > this.field2921) {
            this.field2921 += this.field2918 - this.field2921;
        }
        int var2 = 113 % ((arg0 + 62) / 52);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)J", line = 77)
    private final long method1402(int arg0) {
        long var2 = class199.method1372(30938) * 1000000L;
        long var4 = var2 - this.field2917;
        this.field2917 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2919[this.field2922] = var4;
            this.field2922 = (this.field2922 + 1) % 10;
            if (this.field2920 < 10) {
                this.field2920++;
            }
        }
        long var6 = 0L;
        if (arg0 > -79) {
            this.method550((byte) -98);
        }
        for (int var8 = 1; var8 <= this.field2920; var8++) {
            var6 += this.field2919[(this.field2922 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2920;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)J", line = 112)
    public final long method550(byte arg0) {
        int var2 = 2 / ((60 - arg0) / 57);
        return this.field2921;
    }
}
