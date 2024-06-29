import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class547 {

    @OriginalMember(owner = "client!id", name = "b", descriptor = "[Lrw;")
    private class708[] field6873 = new class708[10];

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    private int field6874;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    private int field6872;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lpfa;II)Lid;")
    public static final class547 method2930(class275 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1659(-26, arg2, arg1);
        return var3 == null ? null : new class547(new class572(var3));
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()[B")
    private final byte[] method2931() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field6873[var2] != null && this.field6873[var2].field9881 + this.field6873[var2].field9878 > var1) {
                var1 = this.field6873[var2].field9881 + this.field6873[var2].field9878;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field6873[var5] != null) {
                int var6 = this.field6873[var5].field9878 * 22050 / 1000;
                int var7 = this.field6873[var5].field9881 * 22050 / 1000;
                int[] var8 = this.field6873[var5].method3905(var6, this.field6873[var5].field9878);
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

    @OriginalMember(owner = "client!id", name = "b", descriptor = "()Lft;")
    public final class4 method2932() {
        byte[] var1 = this.method2931();
        return new class4(22050, var1, this.field6874 * 22050 / 1000, this.field6872 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "()I")
    public final int method2933() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field6873[var2] != null && this.field6873[var2].field9881 / 20 < var1) {
                var1 = this.field6873[var2].field9881 / 20;
            }
        }
        if (this.field6874 < this.field6872 && this.field6874 / 20 < var1) {
            var1 = this.field6874 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field6873[var3] != null) {
                this.field6873[var3].field9881 -= var1 * 20;
            }
        }
        if (this.field6874 < this.field6872) {
            this.field6874 -= var1 * 20;
            this.field6872 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lji;)V")
    private class547(class572 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3097((byte) 12);
            if (var3 != 0) {
                arg0.field7313--;
                this.field6873[var2] = new class708();
                this.field6873[var2].method3903(arg0);
            }
        }
        this.field6874 = arg0.method3031(-1);
        this.field6872 = arg0.method3031(-1);
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    private class547() {
    }
}
