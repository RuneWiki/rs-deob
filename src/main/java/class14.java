import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class14 {

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "[Lge;")
    private class41[] field272 = new class41[10];

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()I")
    public final int method73() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field272[var2] != null && this.field272[var2].field807 / 20 < var1) {
                var1 = this.field272[var2].field807 / 20;
            }
        }
        if (this.field270 < this.field271 && this.field270 / 20 < var1) {
            var1 = this.field270 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field272[var3] != null) {
                this.field272[var3].field807 -= var1 * 20;
            }
        }
        if (this.field270 < this.field271) {
            this.field270 -= var1 * 20;
            this.field271 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "()[B")
    private final byte[] method74() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field272[var2] != null && this.field272[var2].field812 + this.field272[var2].field807 > var1) {
                var1 = this.field272[var2].field812 + this.field272[var2].field807;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field272[var5] != null) {
                int var6 = this.field272[var5].field812 * 22050 / 1000;
                int var7 = this.field272[var5].field807 * 22050 / 1000;
                int[] var8 = this.field272[var5].method244(var6, this.field272[var5].field812);
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

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "()Lga;")
    public final class38 method75() {
        byte[] var1 = this.method74();
        return new class38(22050, var1, this.field270 * 22050 / 1000, this.field271 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lkc;II)Lca;")
    public static final class14 method76(class63 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method394(arg1, arg2, (byte) -63);
        return var3 == null ? null : new class14(new class94(var3));
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lpd;)V")
    private class14(class94 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method703((byte) 86);
            if (var3 != 0) {
                arg0.field2061--;
                this.field272[var2] = new class41();
                this.field272[var2].method245(arg0);
            }
        }
        this.field270 = arg0.method665(8666);
        this.field271 = arg0.method665(8666);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
    private class14() {
    }
}
