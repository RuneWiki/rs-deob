import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class17 {

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "[Lld;")
    private class80[] field311 = new class80[10];

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    private int field309;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()I")
    public final int method156() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field311[var2] != null && this.field311[var2].field1799 / 20 < var1) {
                var1 = this.field311[var2].field1799 / 20;
            }
        }
        if (this.field309 < this.field310 && this.field309 / 20 < var1) {
            var1 = this.field309 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field311[var3] != null) {
                this.field311[var3].field1799 -= var1 * 20;
            }
        }
        if (this.field309 < this.field310) {
            this.field309 -= var1 * 20;
            this.field310 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "()Lu;")
    public final class139 method157() {
        byte[] var1 = this.method159();
        return new class139(22050, var1, this.field309 * 22050 / 1000, this.field310 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lsf;II)Lcb;")
    public static final class17 method158(class131 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1023(arg2, arg1, (byte) -35);
        return var3 == null ? null : new class17(new class86(var3));
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "()[B")
    private final byte[] method159() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field311[var2] != null && this.field311[var2].field1799 + this.field311[var2].field1790 > var1) {
                var1 = this.field311[var2].field1799 + this.field311[var2].field1790;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field311[var5] != null) {
                int var6 = this.field311[var5].field1790 * 22050 / 1000;
                int var7 = this.field311[var5].field1799 * 22050 / 1000;
                int[] var8 = this.field311[var5].method600(var6, this.field311[var5].field1790);
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

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lmc;)V")
    private class17(class86 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method646(-15447);
            if (var3 != 0) {
                arg0.field1924--;
                this.field311[var2] = new class80();
                this.field311[var2].method599(arg0);
            }
        }
        this.field309 = arg0.method632((byte) -80);
        this.field310 = arg0.method632((byte) -80);
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    private class17() {
    }
}
