import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class182 extends class498 {

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    private int field2837 = 1;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "J")
    private long field2838 = 0L;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "J")
    private long field2839 = 0L;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    private int field2841 = 0;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "[J")
    private long[] field2842 = new long[10];

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "J")
    private long field2840 = 0L;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(IJ)I")
    public final int method1358(int arg0, long arg1) {
        if (arg0 != 4399) {
            return -56;
        } else if (this.field2840 < this.field2839) {
            this.field2838 += this.field2839 - this.field2840;
            this.field2840 += this.field2839 - this.field2840;
            this.field2839 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                this.field2839 += arg1;
                var4++;
            } while (var4 < 10 && this.field2839 < this.field2840);
            if (this.field2839 < this.field2840) {
                this.field2839 = this.field2840;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)J")
    public final long method1359(byte arg0) {
        if (arg0 != -43) {
            this.method1361((byte) 103);
        }
        this.field2840 += this.method1362(20563);
        return this.field2840 < this.field2839 ? (this.field2839 - this.field2840) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public final void method1360(byte arg0) {
        if (arg0 < 77) {
            this.method1362(56);
        }
        this.field2838 = 0L;
        if (this.field2840 < this.field2839) {
            this.field2840 += this.field2839 - this.field2840;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)J")
    public final long method1361(byte arg0) {
        int var2 = -50 / ((arg0 - 35) / 48);
        return this.field2840;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)J")
    private final long method1362(int arg0) {
        long var2 = class197.method1423(1) * 1000000L;
        long var4 = var2 - this.field2838;
        this.field2838 = var2;
        if (arg0 != 20563) {
            return -65L;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2842[this.field2841] = var4;
            this.field2841 = (this.field2841 + 1) % 10;
            if (this.field2837 < 10) {
                this.field2837++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field2837; var8++) {
            var6 += this.field2842[(this.field2841 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2837;
    }
}
