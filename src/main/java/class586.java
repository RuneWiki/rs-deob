import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class586 {

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "[Lgs;")
    private class585[] field8066 = new class585[10];

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
    private int field8067;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    private int field8065;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "()I")
    public final int method3277() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field8066[var2] != null && this.field8066[var2].field8046 / 20 < var1) {
                var1 = this.field8066[var2].field8046 / 20;
            }
        }
        if (this.field8067 < this.field8065 && this.field8067 / 20 < var1) {
            var1 = this.field8067 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field8066[var3] != null) {
                this.field8066[var3].field8046 -= var1 * 20;
            }
        }
        if (this.field8067 < this.field8065) {
            this.field8067 -= var1 * 20;
            this.field8065 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "()[B")
    private final byte[] method3278() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field8066[var2] != null && this.field8066[var2].field8051 + this.field8066[var2].field8046 > var1) {
                var1 = this.field8066[var2].field8051 + this.field8066[var2].field8046;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field8066[var5] != null) {
                int var6 = this.field8066[var5].field8051 * 22050 / 1000;
                int var7 = this.field8066[var5].field8046 * 22050 / 1000;
                int[] var8 = this.field8066[var5].method3274(var6, this.field8066[var5].field8051);
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

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "()Lmda;")
    public final class53 method3279() {
        byte[] var1 = this.method3278();
        return new class53(22050, var1, this.field8067 * 22050 / 1000, this.field8065 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lpq;II)Ltq;")
    public static final class586 method3280(class159 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1087(arg1, arg2, 1);
        return var3 == null ? null : new class586(new class138(var3));
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Ldga;)V")
    private class586(class138 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method957((byte) -97);
            if (var3 != 0) {
                arg0.field1745--;
                this.field8066[var2] = new class585();
                this.field8066[var2].method3275(arg0);
            }
        }
        this.field8067 = arg0.method922((byte) -114);
        this.field8065 = arg0.method922((byte) -119);
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V")
    private class586() {
    }
}
