import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class416 {

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "[Loi;")
    private class44[] field6152 = new class44[10];

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    private int field6150;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    private int field6151;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "()Lkr;", line = 4)
    public final class445 method2598() {
        byte[] var1 = this.method2601();
        return new class445(22050, var1, this.field6150 * 22050 / 1000, this.field6151 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "()I", line = 10)
    public final int method2599() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field6152[var2] != null && this.field6152[var2].field559 / 20 < var1) {
                var1 = this.field6152[var2].field559 / 20;
            }
        }
        if (this.field6150 < this.field6151 && this.field6150 / 20 < var1) {
            var1 = this.field6150 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field6152[var3] != null) {
                this.field6152[var3].field559 -= var1 * 20;
            }
        }
        if (this.field6150 < this.field6151) {
            this.field6150 -= var1 * 20;
            this.field6151 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lmo;II)Lih;", line = 54)
    public static final class416 method2600(class447 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2771(arg1, arg2, 3);
        return var3 == null ? null : new class416(new class186(var3));
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "()[B", line = 69)
    private final byte[] method2601() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field6152[var2] != null && this.field6152[var2].field559 + this.field6152[var2].field551 > var1) {
                var1 = this.field6152[var2].field559 + this.field6152[var2].field551;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field6152[var5] != null) {
                int var6 = this.field6152[var5].field551 * 22050 / 1000;
                int var7 = this.field6152[var5].field559 * 22050 / 1000;
                int[] var8 = this.field6152[var5].method294(var6, this.field6152[var5].field551);
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

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Ljg;)V", line = 129)
    private class416(class186 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1322(false);
            if (var3 != 0) {
                arg0.field3044--;
                this.field6152[var2] = new class44();
                this.field6152[var2].method292(arg0);
            }
        }
        this.field6150 = arg0.method1272((byte) -62);
        this.field6151 = arg0.method1272((byte) -52);
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V", line = 149)
    private class416() {
    }
}
