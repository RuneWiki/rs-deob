import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class166 {

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "[Lia;")
    private class74[] field3172 = new class74[10];

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    private int field3173;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    private int field3174;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "()[B")
    private final byte[] method1063() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3172[var2] != null && this.field3172[var2].field1407 + this.field3172[var2].field1406 > var1) {
                var1 = this.field3172[var2].field1407 + this.field3172[var2].field1406;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3172[var5] != null) {
                int var6 = this.field3172[var5].field1406 * 22050 / 1000;
                int var7 = this.field3172[var5].field1407 * 22050 / 1000;
                int[] var8 = this.field3172[var5].method457(var6, this.field3172[var5].field1406);
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

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "()Ljb;")
    public final class83 method1064() {
        byte[] var1 = this.method1063();
        return new class83(22050, var1, this.field3173 * 22050 / 1000, this.field3174 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "()I")
    public final int method1065() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3172[var2] != null && this.field3172[var2].field1407 / 20 < var1) {
                var1 = this.field3172[var2].field1407 / 20;
            }
        }
        if (this.field3173 < this.field3174 && this.field3173 / 20 < var1) {
            var1 = this.field3173 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3172[var3] != null) {
                this.field3172[var3].field1407 -= var1 * 20;
            }
        }
        if (this.field3173 < this.field3174) {
            this.field3173 -= var1 * 20;
            this.field3174 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lke;II)Lsd;")
    public static final class166 method1066(class95 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method552(arg2, arg1, 0);
        return var3 == null ? null : new class166(new class127(var3));
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Loa;)V")
    private class166(class127 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method819((byte) 22);
            if (var3 != 0) {
                arg0.field2346--;
                this.field3172[var2] = new class74();
                this.field3172[var2].method458(arg0);
            }
        }
        this.field3173 = arg0.method785(true);
        this.field3174 = arg0.method785(true);
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    private class166() {
    }
}
