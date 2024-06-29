import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class136 {

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "[Lvc;")
    private class143[] field3308 = new class143[10];

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    private int field3307;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    private int field3309;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ltb;I)Lub;")
    public static final class136 method1101(class130 arg0, int arg1) {
        byte[] var2 = arg0.method1066(124, arg1);
        return var2 == null ? null : new class136(new class8(var2));
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()Lr;")
    public final class116 method1102() {
        byte[] var1 = this.method1103();
        return new class116(22050, var1, this.field3307 * 22050 / 1000, this.field3309 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "()[B")
    private final byte[] method1103() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3308[var2] != null && this.field3308[var2].field3486 + this.field3308[var2].field3465 > var1) {
                var1 = this.field3308[var2].field3486 + this.field3308[var2].field3465;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3308[var5] != null) {
                int var6 = this.field3308[var5].field3486 * 22050 / 1000;
                int var7 = this.field3308[var5].field3465 * 22050 / 1000;
                int[] var8 = this.field3308[var5].method1156(var6, this.field3308[var5].field3486);
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

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "()I")
    public final int method1104() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3308[var2] != null && this.field3308[var2].field3465 / 20 < var1) {
                var1 = this.field3308[var2].field3465 / 20;
            }
        }
        if (this.field3307 < this.field3309 && this.field3307 / 20 < var1) {
            var1 = this.field3307 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3308[var3] != null) {
                this.field3308[var3].field3465 -= var1 * 20;
            }
        }
        if (this.field3307 < this.field3309) {
            this.field3307 -= var1 * 20;
            this.field3309 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ltb;II)Lub;")
    public static final class136 method1105(class130 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1058(arg1, 13, arg2);
        return var3 == null ? null : new class136(new class8(var3));
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lb;)V")
    private class136(class8 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method62((byte) 105);
            if (var3 != 0) {
                arg0.field182--;
                this.field3308[var2] = new class143();
                this.field3308[var2].method1154(arg0);
            }
        }
        this.field3307 = arg0.method68(-2);
        this.field3309 = arg0.method68(-2);
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    private class136() {
    }
}
