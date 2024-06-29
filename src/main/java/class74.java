import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class74 {

    @OriginalMember(owner = "client!td", name = "b", descriptor = "[Ltl;")
    private class68[] field1071 = new class68[10];

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    private int field1072;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    private int field1070;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "()Lwe;")
    public final class15 method539() {
        byte[] var1 = this.method542();
        return new class15(22050, var1, this.field1072 * 22050 / 1000, this.field1070 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Llc;II)Ltd;")
    public static final class74 method540(class86 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method643(arg2, arg1, false);
        return var3 == null ? null : new class74(new class152(var3));
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "()I")
    public final int method541() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1071[var2] != null && this.field1071[var2].field1007 / 20 < var1) {
                var1 = this.field1071[var2].field1007 / 20;
            }
        }
        if (this.field1072 < this.field1070 && this.field1072 / 20 < var1) {
            var1 = this.field1072 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1071[var3] != null) {
                this.field1071[var3].field1007 -= var1 * 20;
            }
        }
        if (this.field1072 < this.field1070) {
            this.field1072 -= var1 * 20;
            this.field1070 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "()[B")
    private final byte[] method542() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1071[var2] != null && this.field1071[var2].field1013 + this.field1071[var2].field1007 > var1) {
                var1 = this.field1071[var2].field1013 + this.field1071[var2].field1007;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1071[var5] != null) {
                int var6 = this.field1071[var5].field1013 * 22050 / 1000;
                int var7 = this.field1071[var5].field1007 * 22050 / 1000;
                int[] var8 = this.field1071[var5].method486(var6, this.field1071[var5].field1013);
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

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lv;)V")
    private class74(class152 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1111(255);
            if (var3 != 0) {
                arg0.field2511--;
                this.field1071[var2] = new class68();
                this.field1071[var2].method487(arg0);
            }
        }
        this.field1072 = arg0.method1126(false);
        this.field1070 = arg0.method1126(false);
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    private class74() {
    }
}
