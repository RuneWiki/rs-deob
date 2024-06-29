import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class93 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "[Lla;")
    private class144[] field1081 = new class144[10];

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    private int field1082;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    private int field1083;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()Lwo;")
    public final class52 method509() {
        byte[] var1 = this.method512();
        return new class52(22050, var1, this.field1082 * 22050 / 1000, this.field1083 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "()I")
    public final int method510() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1081[var2] != null && this.field1081[var2].field1862 / 20 < var1) {
                var1 = this.field1081[var2].field1862 / 20;
            }
        }
        if (this.field1082 < this.field1083 && this.field1082 / 20 < var1) {
            var1 = this.field1082 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1081[var3] != null) {
                this.field1081[var3].field1862 -= var1 * 20;
            }
        }
        if (this.field1082 < this.field1083) {
            this.field1082 -= var1 * 20;
            this.field1083 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lam;II)Lki;")
    public static final class93 method511(class286 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1687(arg2, arg1, 255);
        return var3 == null ? null : new class93(new class250(var3));
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "()[B")
    private final byte[] method512() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1081[var2] != null && this.field1081[var2].field1862 + this.field1081[var2].field1845 > var1) {
                var1 = this.field1081[var2].field1862 + this.field1081[var2].field1845;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1081[var5] != null) {
                int var6 = this.field1081[var5].field1845 * 22050 / 1000;
                int var7 = this.field1081[var5].field1862 * 22050 / 1000;
                int[] var8 = this.field1081[var5].method785(var6, this.field1081[var5].field1845);
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

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Ltq;)V")
    private class93(class250 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1350(31351);
            if (var3 != 0) {
                arg0.field3389--;
                this.field1081[var2] = new class144();
                this.field1081[var2].method782(arg0);
            }
        }
        this.field1082 = arg0.method1374(-2);
        this.field1083 = arg0.method1374(-2);
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
    private class93() {
    }
}
