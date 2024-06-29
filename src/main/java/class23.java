import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class23 {

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "[Lad;")
    private class9[] field311 = new class9[10];

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    private int field309;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "()I")
    public final int method145() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field311[var2] != null && this.field311[var2].field104 / 20 < var1) {
                var1 = this.field311[var2].field104 / 20;
            }
        }
        if (this.field310 < this.field309 && this.field310 / 20 < var1) {
            var1 = this.field310 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field311[var3] != null) {
                this.field311[var3].field104 -= var1 * 20;
            }
        }
        if (this.field310 < this.field309) {
            this.field310 -= var1 * 20;
            this.field309 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Liq;II)Lml;")
    public static final class23 method146(class134 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method823(arg1, -20334, arg2);
        return var3 == null ? null : new class23(new class385(var3));
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "()[B")
    private final byte[] method147() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field311[var2] != null && this.field311[var2].field94 + this.field311[var2].field104 > var1) {
                var1 = this.field311[var2].field94 + this.field311[var2].field104;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field311[var5] != null) {
                int var6 = this.field311[var5].field94 * 22050 / 1000;
                int var7 = this.field311[var5].field104 * 22050 / 1000;
                int[] var8 = this.field311[var5].method68(var6, this.field311[var5].field94);
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

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "()Lar;")
    public final class2 method148() {
        byte[] var1 = this.method147();
        return new class2(22050, var1, this.field310 * 22050 / 1000, this.field309 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lef;)V")
    private class23(class385 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2343(255);
            if (var3 != 0) {
                arg0.field5666--;
                this.field311[var2] = new class9();
                this.field311[var2].method67(arg0);
            }
        }
        this.field310 = arg0.method2323(-89);
        this.field309 = arg0.method2323(-55);
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
    private class23() {
    }
}
