import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class314 {

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "[Ltn;")
    private class59[] field4580 = new class59[10];

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    private int field4579;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    private int field4581;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "()I")
    public final int method1975() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4580[var2] != null && this.field4580[var2].field844 / 20 < var1) {
                var1 = this.field4580[var2].field844 / 20;
            }
        }
        if (this.field4579 < this.field4581 && this.field4579 / 20 < var1) {
            var1 = this.field4579 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field4580[var3] != null) {
                this.field4580[var3].field844 -= var1 * 20;
            }
        }
        if (this.field4579 < this.field4581) {
            this.field4579 -= var1 * 20;
            this.field4581 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Luu;II)Lqv;")
    public static final class314 method1976(class191 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1281(arg1, arg2, 75);
        return var3 == null ? null : new class314(new class164(var3));
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "()Ljp;")
    public final class242 method1977() {
        byte[] var1 = this.method1978();
        return new class242(22050, var1, this.field4579 * 22050 / 1000, this.field4581 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "()[B")
    private final byte[] method1978() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4580[var2] != null && this.field4580[var2].field844 + this.field4580[var2].field836 > var1) {
                var1 = this.field4580[var2].field844 + this.field4580[var2].field836;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field4580[var5] != null) {
                int var6 = this.field4580[var5].field836 * 22050 / 1000;
                int var7 = this.field4580[var5].field844 * 22050 / 1000;
                int[] var8 = this.field4580[var5].method428(var6, this.field4580[var5].field836);
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

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lnj;)V")
    private class314(class164 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1087(false);
            if (var3 != 0) {
                arg0.field2185--;
                this.field4580[var2] = new class59();
                this.field4580[var2].method429(arg0);
            }
        }
        this.field4579 = arg0.method1074(-635989152);
        this.field4581 = arg0.method1074(-635989152);
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "()V")
    private class314() {
    }
}
