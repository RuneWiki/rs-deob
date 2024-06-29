import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class486 {

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "[Lja;")
    private class304[] field6744 = new class304[10];

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    private int field6746;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    private int field6745;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lga;II)Ljq;", line = 7)
    public static final class486 method2791(class332 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1938(arg2, arg1, -17);
        return var3 == null ? null : new class486(new class157(var3));
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "()Lql;", line = 16)
    public final class161 method2792() {
        byte[] var1 = this.method2793();
        return new class161(22050, var1, this.field6746 * 22050 / 1000, this.field6745 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lio;)V", line = 129)
    private class486(class157 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method930(255);
            if (var3 != 0) {
                arg0.field2219--;
                this.field6744[var2] = new class304();
                this.field6744[var2].method1784(arg0);
            }
        }
        this.field6746 = arg0.method963(-120);
        this.field6745 = arg0.method963(-124);
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V", line = 149)
    private class486() {
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "()[B", line = 25)
    private final byte[] method2793() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field6744[var2] != null && this.field6744[var2].field4057 + this.field6744[var2].field4052 > var1) {
                var1 = this.field6744[var2].field4057 + this.field6744[var2].field4052;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field6744[var5] != null) {
                int var6 = this.field6744[var5].field4052 * 22050 / 1000;
                int var7 = this.field6744[var5].field4057 * 22050 / 1000;
                int[] var8 = this.field6744[var5].method1785(var6, this.field6744[var5].field4052);
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

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "()I", line = 84)
    public final int method2794() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field6744[var2] != null && this.field6744[var2].field4057 / 20 < var1) {
                var1 = this.field6744[var2].field4057 / 20;
            }
        }
        if (this.field6746 < this.field6745 && this.field6746 / 20 < var1) {
            var1 = this.field6746 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field6744[var3] != null) {
                this.field6744[var3].field4057 -= var1 * 20;
            }
        }
        if (this.field6746 < this.field6745) {
            this.field6746 -= var1 * 20;
            this.field6745 -= var1 * 20;
        }
        return var1;
    }
}
