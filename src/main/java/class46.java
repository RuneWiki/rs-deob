import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class46 {

    @OriginalMember(owner = "client!u", name = "c", descriptor = "[Ltl;")
    private class368[] field557 = new class368[10];

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    private int field556;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()Lfp;", line = 4)
    public final class177 method289() {
        byte[] var1 = this.method292();
        return new class177(22050, var1, this.field556 * 22050 / 1000, this.field555 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "()I", line = 12)
    public final int method290() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field557[var2] != null && this.field557[var2].field5374 / 20 < var1) {
                var1 = this.field557[var2].field5374 / 20;
            }
        }
        if (this.field556 < this.field555 && this.field556 / 20 < var1) {
            var1 = this.field556 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field557[var3] != null) {
                this.field557[var3].field5374 -= var1 * 20;
            }
        }
        if (this.field556 < this.field555) {
            this.field556 -= var1 * 20;
            this.field555 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lra;II)Lu;", line = 57)
    public static final class46 method291(class57 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method361(arg1, 116, arg2);
        return var3 == null ? null : new class46(new class211(var3));
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "()[B", line = 66)
    private final byte[] method292() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field557[var2] != null && this.field557[var2].field5374 + this.field557[var2].field5371 > var1) {
                var1 = this.field557[var2].field5374 + this.field557[var2].field5371;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field557[var5] != null) {
                int var6 = this.field557[var5].field5371 * 22050 / 1000;
                int var7 = this.field557[var5].field5374 * 22050 / 1000;
                int[] var8 = this.field557[var5].method2322(var6, this.field557[var5].field5371);
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

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lbk;)V", line = 129)
    private class46(class211 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1342((byte) -127);
            if (var3 != 0) {
                arg0.field2888--;
                this.field557[var2] = new class368();
                this.field557[var2].method2324(arg0);
            }
        }
        this.field556 = arg0.method1355(32136);
        this.field555 = arg0.method1355(32136);
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V", line = 149)
    private class46() {
    }
}
