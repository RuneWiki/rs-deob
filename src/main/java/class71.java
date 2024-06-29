import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class71 {

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "[Ln;")
    private class16[] field1107 = new class16[10];

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    private int field1109;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    private int field1108;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()I")
    public final int method564() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1107[var2] != null && this.field1107[var2].field213 / 20 < var1) {
                var1 = this.field1107[var2].field213 / 20;
            }
        }
        if (this.field1109 < this.field1108 && this.field1109 / 20 < var1) {
            var1 = this.field1109 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1107[var3] != null) {
                this.field1107[var3].field213 -= var1 * 20;
            }
        }
        if (this.field1109 < this.field1108) {
            this.field1109 -= var1 * 20;
            this.field1108 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "()Ljd;")
    public final class90 method565() {
        byte[] var1 = this.method566();
        return new class90(22050, var1, this.field1109 * 22050 / 1000, this.field1108 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "()[B")
    private final byte[] method566() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1107[var2] != null && this.field1107[var2].field229 + this.field1107[var2].field213 > var1) {
                var1 = this.field1107[var2].field229 + this.field1107[var2].field213;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1107[var5] != null) {
                int var6 = this.field1107[var5].field229 * 22050 / 1000;
                int var7 = this.field1107[var5].field213 * 22050 / 1000;
                int[] var8 = this.field1107[var5].method128(var6, this.field1107[var5].field229);
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

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lub;II)Ltb;")
    public static final class71 method567(class92 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method721((byte) -117, arg1, arg2);
        return var3 == null ? null : new class71(new class31(var3));
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lha;)V")
    private class71(class31 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method265(-112);
            if (var3 != 0) {
                arg0.field541--;
                this.field1107[var2] = new class16();
                this.field1107[var2].method127(arg0);
            }
        }
        this.field1109 = arg0.method260((byte) -67);
        this.field1108 = arg0.method260((byte) -67);
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    private class71() {
    }
}
