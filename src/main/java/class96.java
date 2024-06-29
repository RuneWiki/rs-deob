import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class96 {

    @OriginalMember(owner = "client!od", name = "a", descriptor = "[Lle;")
    private class79[] field2247 = new class79[10];

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    private int field2249;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    private int field2248;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lnb;II)Lod;")
    public static final class96 method686(class88 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method668(arg1, -214, arg2);
        return var3 == null ? null : new class96(new class109(var3));
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()[B")
    private final byte[] method687() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2247[var2] != null && this.field2247[var2].field1761 + this.field2247[var2].field1753 > var1) {
                var1 = this.field2247[var2].field1761 + this.field2247[var2].field1753;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2247[var5] != null) {
                int var6 = this.field2247[var5].field1761 * 22050 / 1000;
                int var7 = this.field2247[var5].field1753 * 22050 / 1000;
                int[] var8 = this.field2247[var5].method581(var6, this.field2247[var5].field1761);
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

    @OriginalMember(owner = "client!od", name = "b", descriptor = "()I")
    public final int method688() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2247[var2] != null && this.field2247[var2].field1753 / 20 < var1) {
                var1 = this.field2247[var2].field1753 / 20;
            }
        }
        if (this.field2249 < this.field2248 && this.field2249 / 20 < var1) {
            var1 = this.field2249 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2247[var3] != null) {
                this.field2247[var3].field1753 -= var1 * 20;
            }
        }
        if (this.field2249 < this.field2248) {
            this.field2249 -= var1 * 20;
            this.field2248 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lqe;)V")
    private class96(class109 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method838(255);
            if (var3 != 0) {
                arg0.field2583--;
                this.field2247[var2] = new class79();
                this.field2247[var2].method580(arg0);
            }
        }
        this.field2249 = arg0.method835(2);
        this.field2248 = arg0.method835(2);
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    private class96() {
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "()Lw;")
    public final class140 method689() {
        byte[] var1 = this.method687();
        return new class140(22050, var1, this.field2249 * 22050 / 1000, this.field2248 * 22050 / 1000);
    }
}
