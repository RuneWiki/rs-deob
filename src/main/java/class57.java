import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class57 {

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "[Le;")
    private class294[] field953 = new class294[10];

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    private int field951;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    private int field952;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "()[B")
    private final byte[] method472() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field953[var2] != null && this.field953[var2].field4469 + this.field953[var2].field4459 > var1) {
                var1 = this.field953[var2].field4469 + this.field953[var2].field4459;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field953[var5] != null) {
                int var6 = this.field953[var5].field4469 * 22050 / 1000;
                int var7 = this.field953[var5].field4459 * 22050 / 1000;
                int[] var8 = this.field953[var5].method1937(var6, this.field953[var5].field4469);
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

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lpk;II)Lig;")
    public static final class57 method473(class237 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1605(-127, arg2, arg1);
        return var3 == null ? null : new class57(new class54(var3));
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "()Ltf;")
    public final class98 method474() {
        byte[] var1 = this.method472();
        return new class98(22050, var1, this.field951 * 22050 / 1000, this.field952 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "()I")
    public final int method475() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field953[var2] != null && this.field953[var2].field4459 / 20 < var1) {
                var1 = this.field953[var2].field4459 / 20;
            }
        }
        if (this.field951 < this.field952 && this.field951 / 20 < var1) {
            var1 = this.field951 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field953[var3] != null) {
                this.field953[var3].field4459 -= var1 * 20;
            }
        }
        if (this.field951 < this.field952) {
            this.field951 -= var1 * 20;
            this.field952 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lca;)V")
    private class57(class54 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method407(255);
            if (var3 != 0) {
                arg0.field887--;
                this.field953[var2] = new class294();
                this.field953[var2].method1939(arg0);
            }
        }
        this.field951 = arg0.method423(126);
        this.field952 = arg0.method423(107);
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
    private class57() {
    }
}
