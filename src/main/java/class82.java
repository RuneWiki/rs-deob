import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class82 {

    @OriginalMember(owner = "client!j", name = "c", descriptor = "[Lmg;")
    private class115[] field1963 = new class115[10];

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    private int field1962;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    private int field1961;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I")
    public final int method728() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1963[var2] != null && this.field1963[var2].field2569 / 20 < var1) {
                var1 = this.field1963[var2].field2569 / 20;
            }
        }
        if (this.field1962 < this.field1961 && this.field1962 / 20 < var1) {
            var1 = this.field1962 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1963[var3] != null) {
                this.field1963[var3].field2569 -= var1 * 20;
            }
        }
        if (this.field1962 < this.field1961) {
            this.field1962 -= var1 * 20;
            this.field1961 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()Lnc;")
    public final class120 method729() {
        byte[] var1 = this.method730();
        return new class120(22050, var1, this.field1962 * 22050 / 1000, this.field1961 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()[B")
    private final byte[] method730() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1963[var2] != null && this.field1963[var2].field2576 + this.field1963[var2].field2569 > var1) {
                var1 = this.field1963[var2].field2576 + this.field1963[var2].field2569;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1963[var5] != null) {
                int var6 = this.field1963[var5].field2576 * 22050 / 1000;
                int var7 = this.field1963[var5].field2569 * 22050 / 1000;
                int[] var8 = this.field1963[var5].method907(var6, this.field1963[var5].field2576);
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

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljc;II)Lj;")
    public static final class82 method731(class85 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method745(arg1, arg2, 0);
        return var3 == null ? null : new class82(new class3(var3));
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lab;)V")
    private class82(class3 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method64(31790);
            if (var3 != 0) {
                arg0.field54--;
                this.field1963[var2] = new class115();
                this.field1963[var2].method908(arg0);
            }
        }
        this.field1962 = arg0.method46((byte) 65);
        this.field1961 = arg0.method46((byte) 65);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
    private class82() {
    }
}
