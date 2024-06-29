import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class14 {

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "[Lgl;")
    private class210[] field181 = new class210[10];

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "()[B")
    private final byte[] method98() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field181[var2] != null && this.field181[var2].field3278 + this.field181[var2].field3275 > var1) {
                var1 = this.field181[var2].field3278 + this.field181[var2].field3275;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field181[var5] != null) {
                int var6 = this.field181[var5].field3278 * 22050 / 1000;
                int var7 = this.field181[var5].field3275 * 22050 / 1000;
                int[] var8 = this.field181[var5].method1417(var6, this.field181[var5].field3278);
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

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "()Lu;")
    public final class119 method99() {
        byte[] var1 = this.method98();
        return new class119(22050, var1, this.field180 * 22050 / 1000, this.field182 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ldl;II)Lfk;")
    public static final class14 method100(class123 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method807((byte) 98, arg2, arg1);
        return var3 == null ? null : new class14(new class25(var3));
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "()I")
    public final int method101() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field181[var2] != null && this.field181[var2].field3275 / 20 < var1) {
                var1 = this.field181[var2].field3275 / 20;
            }
        }
        if (this.field180 < this.field182 && this.field180 / 20 < var1) {
            var1 = this.field180 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field181[var3] != null) {
                this.field181[var3].field3275 -= var1 * 20;
            }
        }
        if (this.field180 < this.field182) {
            this.field180 -= var1 * 20;
            this.field182 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Llj;)V")
    private class14(class25 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method201(255);
            if (var3 != 0) {
                arg0.field349--;
                this.field181[var2] = new class210();
                this.field181[var2].method1418(arg0);
            }
        }
        this.field180 = arg0.method190(-3);
        this.field182 = arg0.method190(-3);
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
    private class14() {
    }
}
