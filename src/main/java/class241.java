import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class241 {

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "[Lfh;")
    private class234[] field4015 = new class234[10];

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    private int field4014;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    private int field4013;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()I", line = 5)
    public final int method1710() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4015[var2] != null && this.field4015[var2].field3905 / 20 < var1) {
                var1 = this.field4015[var2].field3905 / 20;
            }
        }
        if (this.field4014 < this.field4013 && this.field4014 / 20 < var1) {
            var1 = this.field4014 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field4015[var3] != null) {
                this.field4015[var3].field3905 -= var1 * 20;
            }
        }
        if (this.field4014 < this.field4013) {
            this.field4014 -= var1 * 20;
            this.field4013 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "()Ls;", line = 49)
    public final class310 method1711() {
        byte[] var1 = this.method1713();
        return new class310(22050, var1, this.field4014 * 22050 / 1000, this.field4013 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lda;II)Lfc;", line = 56)
    public static final class241 method1712(class143 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1128(arg2, 0, arg1);
        return var3 == null ? null : new class241(new class94(var3));
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "()[B", line = 67)
    private final byte[] method1713() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4015[var2] != null && this.field4015[var2].field3905 + this.field4015[var2].field3900 > var1) {
                var1 = this.field4015[var2].field3905 + this.field4015[var2].field3900;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field4015[var5] != null) {
                int var6 = this.field4015[var5].field3900 * 22050 / 1000;
                int var7 = this.field4015[var5].field3905 * 22050 / 1000;
                int[] var8 = this.field4015[var5].method1661(var6, this.field4015[var5].field3900);
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

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lb;)V", line = 129)
    private class241(class94 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method756(915905888);
            if (var3 != 0) {
                arg0.field1653--;
                this.field4015[var2] = new class234();
                this.field4015[var2].method1662(arg0);
            }
        }
        this.field4014 = arg0.method761((byte) 108);
        this.field4013 = arg0.method761((byte) 108);
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V", line = 149)
    private class241() {
    }
}
