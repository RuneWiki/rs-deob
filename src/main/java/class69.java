import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class69 {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "[Lw;")
    private class153[] field1715 = new class153[10];

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    private int field1716;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    private int field1717;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lef;II)Lk;")
    public static final class69 method548(class35 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method266(arg1, (byte) 102, arg2);
        return var3 == null ? null : new class69(new class83(var3));
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "()I")
    public final int method549() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1715[var2] != null && this.field1715[var2].field3439 / 20 < var1) {
                var1 = this.field1715[var2].field3439 / 20;
            }
        }
        if (this.field1716 < this.field1717 && this.field1716 / 20 < var1) {
            var1 = this.field1716 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1715[var3] != null) {
                this.field1715[var3].field3439 -= var1 * 20;
            }
        }
        if (this.field1716 < this.field1717) {
            this.field1716 -= var1 * 20;
            this.field1717 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "()[B")
    private final byte[] method550() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1715[var2] != null && this.field1715[var2].field3449 + this.field1715[var2].field3439 > var1) {
                var1 = this.field1715[var2].field3449 + this.field1715[var2].field3439;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1715[var5] != null) {
                int var6 = this.field1715[var5].field3449 * 22050 / 1000;
                int var7 = this.field1715[var5].field3439 * 22050 / 1000;
                int[] var8 = this.field1715[var5].method1167(var6, this.field1715[var5].field3449);
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

    @OriginalMember(owner = "client!k", name = "c", descriptor = "()Lnb;")
    public final class92 method551() {
        byte[] var1 = this.method550();
        return new class92(22050, var1, this.field1716 * 22050 / 1000, this.field1717 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lm;)V")
    private class69(class83 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method638(0);
            if (var3 != 0) {
                arg0.field2076--;
                this.field1715[var2] = new class153();
                this.field1715[var2].method1166(arg0);
            }
        }
        this.field1716 = arg0.method631((byte) -118);
        this.field1717 = arg0.method631((byte) -116);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
    private class69() {
    }
}
