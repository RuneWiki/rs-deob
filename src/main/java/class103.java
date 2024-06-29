import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class103 {

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "[Lvc;")
    private class124[] field2661 = new class124[10];

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    private int field2662;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    private int field2660;

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lg;)V", line = 75)
    private class103(class39 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method334(117);
            if (var3 != 0) {
                arg0.field998--;
                this.field2661[var2] = new class124();
                this.field2661[var2].method981(arg0);
            }
        }
        this.field2662 = arg0.method326(255);
        this.field2660 = arg0.method326(255);
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V", line = 95)
    private class103() {
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "()[B", line = 12)
    private final byte[] method849() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2661[var2] != null && this.field2661[var2].field3012 + this.field2661[var2].field3002 > var1) {
                var1 = this.field2661[var2].field3012 + this.field2661[var2].field3002;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2661[var5] != null) {
                int var6 = this.field2661[var5].field3012 * 22050 / 1000;
                int var7 = this.field2661[var5].field3002 * 22050 / 1000;
                int[] var8 = this.field2661[var5].method980(var6, this.field2661[var5].field3012);
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = (var8[var9] >> 8) + var4[var7 + var9];
                    if ((var10 + 128 & 0xFFFFFF00) != 0) {
                        var10 = var10 >> 31 ^ 0x7F;
                    }
                    var4[var7 + var9] = (byte) var10;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "()Lqa;", line = 72)
    public final class96 method850() {
        byte[] var1 = this.method849();
        return new class96(22050, var1, this.field2662 * 22050 / 1000, this.field2660 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljd;II)Lrb;", line = 99)
    public static final class103 method851(class58 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method477(arg1, (byte) 127, arg2);
        return var3 == null ? null : new class103(new class39(var3));
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "()I", line = 108)
    public final int method852() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2661[var2] != null && this.field2661[var2].field3002 / 20 < var1) {
                var1 = this.field2661[var2].field3002 / 20;
            }
        }
        if (this.field2662 < this.field2660 && this.field2662 / 20 < var1) {
            var1 = this.field2662 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2661[var3] != null) {
                this.field2661[var3].field3002 -= var1 * 20;
            }
        }
        if (this.field2662 < this.field2660) {
            this.field2662 -= var1 * 20;
            this.field2660 -= var1 * 20;
        }
        return var1;
    }
}
