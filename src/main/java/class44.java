import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class44 {

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "[Ld;")
    private class19[] field953 = new class19[10];

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    private int field952;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    private int field951;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "()[B")
    private final byte[] method346() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field953[var2] != null && this.field953[var2].field419 + this.field953[var2].field408 > var1) {
                var1 = this.field953[var2].field419 + this.field953[var2].field408;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field953[var5] != null) {
                int var6 = this.field953[var5].field419 * 22050 / 1000;
                int var7 = this.field953[var5].field408 * 22050 / 1000;
                int[] var8 = this.field953[var5].method130(var6, this.field953[var5].field419);
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

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "()Lra;")
    public final class101 method347() {
        byte[] var1 = this.method346();
        return new class101(22050, var1, this.field952 * 22050 / 1000, this.field951 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lud;)V")
    private class44(class119 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method879((byte) 45);
            if (var3 != 0) {
                arg0.field2554--;
                this.field953[var2] = new class19();
                this.field953[var2].method129(arg0);
            }
        }
        this.field952 = arg0.method903(2);
        this.field951 = arg0.method903(2);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lvb;II)Lhb;")
    public static final class44 method348(class122 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method932(125, arg2, arg1);
        return var3 == null ? null : new class44(new class119(var3));
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    private class44() {
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "()I")
    public final int method349() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field953[var2] != null && this.field953[var2].field408 / 20 < var1) {
                var1 = this.field953[var2].field408 / 20;
            }
        }
        if (this.field952 < this.field951 && this.field952 / 20 < var1) {
            var1 = this.field952 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field953[var3] != null) {
                this.field953[var3].field408 -= var1 * 20;
            }
        }
        if (this.field952 < this.field951) {
            this.field952 -= var1 * 20;
            this.field951 -= var1 * 20;
        }
        return var1;
    }
}
