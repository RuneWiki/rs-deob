import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class108 {

    @OriginalMember(owner = "client!p", name = "c", descriptor = "[Lr;")
    private class285[] field1627 = new class285[10];

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    private int field1625;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    private int field1626;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()[B", line = 6)
    private final byte[] method743() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1627[var2] != null && this.field1627[var2].field4507 + this.field1627[var2].field4493 > var1) {
                var1 = this.field1627[var2].field4507 + this.field1627[var2].field4493;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1627[var5] != null) {
                int var6 = this.field1627[var5].field4493 * 22050 / 1000;
                int var7 = this.field1627[var5].field4507 * 22050 / 1000;
                int[] var8 = this.field1627[var5].method2011(var6, this.field1627[var5].field4493);
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

    @OriginalMember(owner = "client!p", name = "b", descriptor = "()I", line = 66)
    public final int method744() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1627[var2] != null && this.field1627[var2].field4507 / 20 < var1) {
                var1 = this.field1627[var2].field4507 / 20;
            }
        }
        if (this.field1625 < this.field1626 && this.field1625 / 20 < var1) {
            var1 = this.field1625 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1627[var3] != null) {
                this.field1627[var3].field4507 -= var1 * 20;
            }
        }
        if (this.field1625 < this.field1626) {
            this.field1625 -= var1 * 20;
            this.field1626 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "()Lqj;", line = 111)
    public final class267 method745() {
        byte[] var1 = this.method743();
        return new class267(22050, var1, this.field1625 * 22050 / 1000, this.field1626 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lim;)V", line = 129)
    private class108(class192 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1399(-1172389784);
            if (var3 != 0) {
                arg0.field3129--;
                this.field1627[var2] = new class285();
                this.field1627[var2].method2010(arg0);
            }
        }
        this.field1625 = arg0.method1396(-29);
        this.field1626 = arg0.method1396(-80);
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V", line = 149)
    private class108() {
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lkb;II)Lp;", line = 122)
    public static final class108 method746(class39 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method250(true, arg1, arg2);
        return var3 == null ? null : new class108(new class192(var3));
    }
}
