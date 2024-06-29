import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class147 {

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "[Laf;")
    private class70[] field2041 = new class70[10];

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    private int field2040;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    private int field2039;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "()[B")
    private final byte[] method984() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2041[var2] != null && this.field2041[var2].field955 + this.field2041[var2].field946 > var1) {
                var1 = this.field2041[var2].field955 + this.field2041[var2].field946;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2041[var5] != null) {
                int var6 = this.field2041[var5].field946 * 22050 / 1000;
                int var7 = this.field2041[var5].field955 * 22050 / 1000;
                int[] var8 = this.field2041[var5].method437(var6, this.field2041[var5].field946);
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

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "()Lec;")
    public final class24 method985() {
        byte[] var1 = this.method984();
        return new class24(22050, var1, this.field2040 * 22050 / 1000, this.field2039 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lhc;II)Lkj;")
    public static final class147 method986(class235 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1576(-60, arg1, arg2);
        return var3 == null ? null : new class147(new class224(var3));
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lql;)V")
    private class147(class224 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1453((byte) -128);
            if (var3 != 0) {
                arg0.field3402--;
                this.field2041[var2] = new class70();
                this.field2041[var2].method435(arg0);
            }
        }
        this.field2040 = arg0.method1445(false);
        this.field2039 = arg0.method1445(false);
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "()I")
    public final int method987() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2041[var2] != null && this.field2041[var2].field955 / 20 < var1) {
                var1 = this.field2041[var2].field955 / 20;
            }
        }
        if (this.field2040 < this.field2039 && this.field2040 / 20 < var1) {
            var1 = this.field2040 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2041[var3] != null) {
                this.field2041[var3].field955 -= var1 * 20;
            }
        }
        if (this.field2040 < this.field2039) {
            this.field2040 -= var1 * 20;
            this.field2039 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    private class147() {
    }
}
