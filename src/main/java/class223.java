import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class223 {

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "[La;")
    private class160[] field3884 = new class160[10];

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    private int field3883;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    private int field3882;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lhi;II)Lhm;", line = 5)
    public static final class223 method1584(class26 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method157(arg2, arg1, (byte) 19);
        return var3 == null ? null : new class223(new class92(var3));
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "()[B", line = 14)
    private final byte[] method1585() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3884[var2] != null && this.field3884[var2].field2584 + this.field3884[var2].field2574 > var1) {
                var1 = this.field3884[var2].field2584 + this.field3884[var2].field2574;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3884[var5] != null) {
                int var6 = this.field3884[var5].field2584 * 22050 / 1000;
                int var7 = this.field3884[var5].field2574 * 22050 / 1000;
                int[] var8 = this.field3884[var5].method1167(var6, this.field3884[var5].field2584);
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

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lmi;)V", line = 81)
    private class223(class92 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method702(-1);
            if (var3 != 0) {
                arg0.field1476--;
                this.field3884[var2] = new class160();
                this.field3884[var2].method1166(arg0);
            }
        }
        this.field3883 = arg0.method721(66);
        this.field3882 = arg0.method721(87);
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V", line = 101)
    private class223() {
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "()I", line = 105)
    public final int method1586() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3884[var2] != null && this.field3884[var2].field2574 / 20 < var1) {
                var1 = this.field3884[var2].field2574 / 20;
            }
        }
        if (this.field3883 < this.field3882 && this.field3883 / 20 < var1) {
            var1 = this.field3883 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3884[var3] != null) {
                this.field3884[var3].field2574 -= var1 * 20;
            }
        }
        if (this.field3883 < this.field3882) {
            this.field3883 -= var1 * 20;
            this.field3882 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "()Ljf;", line = 148)
    public final class9 method1587() {
        byte[] var1 = this.method1585();
        return new class9(22050, var1, this.field3883 * 22050 / 1000, this.field3882 * 22050 / 1000);
    }
}
