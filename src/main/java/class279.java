import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class279 {

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "[Lsl;")
    private class19[] field4547 = new class19[10];

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    private int field4545;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    private int field4546;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()I")
    public final int method1899() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4547[var2] != null && this.field4547[var2].field349 / 20 < var1) {
                var1 = this.field4547[var2].field349 / 20;
            }
        }
        if (this.field4545 < this.field4546 && this.field4545 / 20 < var1) {
            var1 = this.field4545 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field4547[var3] != null) {
                this.field4547[var3].field349 -= var1 * 20;
            }
        }
        if (this.field4545 < this.field4546) {
            this.field4545 -= var1 * 20;
            this.field4546 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lgi;II)Lii;")
    public static final class279 method1900(class164 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1156(arg1, arg2, (byte) -16);
        return var3 == null ? null : new class279(new class274(var3));
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "()Lhh;")
    public final class126 method1901() {
        byte[] var1 = this.method1902();
        return new class126(22050, var1, this.field4545 * 22050 / 1000, this.field4546 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "()[B")
    private final byte[] method1902() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4547[var2] != null && this.field4547[var2].field349 + this.field4547[var2].field347 > var1) {
                var1 = this.field4547[var2].field349 + this.field4547[var2].field347;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field4547[var5] != null) {
                int var6 = this.field4547[var5].field347 * 22050 / 1000;
                int var7 = this.field4547[var5].field349 * 22050 / 1000;
                int[] var8 = this.field4547[var5].method152(var6, this.field4547[var5].field347);
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

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lfj;)V")
    private class279(class274 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1849(255);
            if (var3 != 0) {
                arg0.field4458--;
                this.field4547[var2] = new class19();
                this.field4547[var2].method150(arg0);
            }
        }
        this.field4545 = arg0.method1837(252);
        this.field4546 = arg0.method1837(252);
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    private class279() {
    }
}
