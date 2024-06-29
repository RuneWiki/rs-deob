import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class23 {

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "[Lpf;")
    private class149[] field539 = new class149[10];

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    private int field541;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    private int field540;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lnh;II)Lcb;")
    public static final class23 method144(class133 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method899((byte) 87, arg1, arg2);
        return var3 == null ? null : new class23(new class70(var3));
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()[B")
    private final byte[] method145() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field539[var2] != null && this.field539[var2].field2965 + this.field539[var2].field2962 > var1) {
                var1 = this.field539[var2].field2965 + this.field539[var2].field2962;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field539[var5] != null) {
                int var6 = this.field539[var5].field2962 * 22050 / 1000;
                int var7 = this.field539[var5].field2965 * 22050 / 1000;
                int[] var8 = this.field539[var5].method965(var6, this.field539[var5].field2962);
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

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "()Lvf;")
    public final class203 method146() {
        byte[] var1 = this.method145();
        return new class203(22050, var1, this.field541 * 22050 / 1000, this.field540 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lh;)V")
    private class23(class70 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method443(255);
            if (var3 != 0) {
                arg0.field1472--;
                this.field539[var2] = new class149();
                this.field539[var2].method966(arg0);
            }
        }
        this.field541 = arg0.method442(-21351);
        this.field540 = arg0.method442(-21351);
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "()I")
    public final int method147() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field539[var2] != null && this.field539[var2].field2965 / 20 < var1) {
                var1 = this.field539[var2].field2965 / 20;
            }
        }
        if (this.field541 < this.field540 && this.field541 / 20 < var1) {
            var1 = this.field541 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field539[var3] != null) {
                this.field539[var3].field2965 -= var1 * 20;
            }
        }
        if (this.field541 < this.field540) {
            this.field541 -= var1 * 20;
            this.field540 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    private class23() {
    }
}
