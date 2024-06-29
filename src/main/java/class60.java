import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class60 {

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "[Lhg;")
    private class173[] field1214 = new class173[10];

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    private int field1215;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    private int field1213;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lfa;II)Loc;")
    public static final class60 method515(class239 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1645(true, arg2, arg1);
        return var3 == null ? null : new class60(new class32(var3));
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "()[B")
    private final byte[] method516() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1214[var2] != null && this.field1214[var2].field3029 + this.field1214[var2].field3024 > var1) {
                var1 = this.field1214[var2].field3029 + this.field1214[var2].field3024;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1214[var5] != null) {
                int var6 = this.field1214[var5].field3024 * 22050 / 1000;
                int var7 = this.field1214[var5].field3029 * 22050 / 1000;
                int[] var8 = this.field1214[var5].method1203(var6, this.field1214[var5].field3024);
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

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "()Lkc;")
    public final class266 method517() {
        byte[] var1 = this.method516();
        return new class266(22050, var1, this.field1215 * 22050 / 1000, this.field1213 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "()I")
    public final int method518() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1214[var2] != null && this.field1214[var2].field3029 / 20 < var1) {
                var1 = this.field1214[var2].field3029 / 20;
            }
        }
        if (this.field1215 < this.field1213 && this.field1215 / 20 < var1) {
            var1 = this.field1215 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1214[var3] != null) {
                this.field1214[var3].field3029 -= var1 * 20;
            }
        }
        if (this.field1215 < this.field1213) {
            this.field1215 -= var1 * 20;
            this.field1213 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lie;)V")
    private class60(class32 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method316((byte) 106);
            if (var3 != 0) {
                arg0.field647--;
                this.field1214[var2] = new class173();
                this.field1214[var2].method1200(arg0);
            }
        }
        this.field1215 = arg0.method339(-16777216);
        this.field1213 = arg0.method339(-16777216);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    private class60() {
    }
}
