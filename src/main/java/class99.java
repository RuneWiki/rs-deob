import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class99 {

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "[Lpj;")
    private class182[] field1606 = new class182[10];

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    private int field1607;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    private int field1605;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "()[B", line = 8)
    private final byte[] method733() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1606[var2] != null && this.field1606[var2].field2856 + this.field1606[var2].field2849 > var1) {
                var1 = this.field1606[var2].field2856 + this.field1606[var2].field2849;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1606[var5] != null) {
                int var6 = this.field1606[var5].field2849 * 22050 / 1000;
                int var7 = this.field1606[var5].field2856 * 22050 / 1000;
                int[] var8 = this.field1606[var5].method1257(var6, this.field1606[var5].field2849);
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

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lve;II)Lsl;", line = 70)
    public static final class99 method734(class266 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1889(arg1, (byte) -122, arg2);
        return var3 == null ? null : new class99(new class82(var3));
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "()Lkj;", line = 78)
    public final class176 method735() {
        byte[] var1 = this.method733();
        return new class176(22050, var1, this.field1607 * 22050 / 1000, this.field1605 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lwa;)V", line = 129)
    private class99(class82 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method642((byte) -48);
            if (var3 != 0) {
                arg0.field1301--;
                this.field1606[var2] = new class182();
                this.field1606[var2].method1258(arg0);
            }
        }
        this.field1607 = arg0.method576(1);
        this.field1605 = arg0.method576(1);
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V", line = 149)
    private class99() {
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "()I", line = 87)
    public final int method736() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1606[var2] != null && this.field1606[var2].field2856 / 20 < var1) {
                var1 = this.field1606[var2].field2856 / 20;
            }
        }
        if (this.field1607 < this.field1605 && this.field1607 / 20 < var1) {
            var1 = this.field1607 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1606[var3] != null) {
                this.field1606[var3].field2856 -= var1 * 20;
            }
        }
        if (this.field1607 < this.field1605) {
            this.field1607 -= var1 * 20;
            this.field1605 -= var1 * 20;
        }
        return var1;
    }
}
