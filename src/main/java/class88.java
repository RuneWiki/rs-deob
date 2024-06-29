import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class88 {

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "[Lnb;")
    private class130[] field1696 = new class130[10];

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    private int field1697;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    private int field1698;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()I")
    public final int method657() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1696[var2] != null && this.field1696[var2].field2333 / 20 < var1) {
                var1 = this.field1696[var2].field2333 / 20;
            }
        }
        if (this.field1697 < this.field1698 && this.field1697 / 20 < var1) {
            var1 = this.field1697 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1696[var3] != null) {
                this.field1696[var3].field2333 -= var1 * 20;
            }
        }
        if (this.field1697 < this.field1698) {
            this.field1697 -= var1 * 20;
            this.field1698 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()Loh;")
    public final class261 method658() {
        byte[] var1 = this.method660();
        return new class261(22050, var1, this.field1697 * 22050 / 1000, this.field1698 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lmb;II)Lqa;")
    public static final class88 method659(class178 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1197(arg2, arg1, -2);
        return var3 == null ? null : new class88(new class152(var3));
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()[B")
    private final byte[] method660() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1696[var2] != null && this.field1696[var2].field2333 + this.field1696[var2].field2322 > var1) {
                var1 = this.field1696[var2].field2333 + this.field1696[var2].field2322;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1696[var5] != null) {
                int var6 = this.field1696[var5].field2322 * 22050 / 1000;
                int var7 = this.field1696[var5].field2333 * 22050 / 1000;
                int[] var8 = this.field1696[var5].method904(var6, this.field1696[var5].field2322);
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

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lk;)V")
    private class88(class152 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1051((byte) -118);
            if (var3 != 0) {
                arg0.field2677--;
                this.field1696[var2] = new class130();
                this.field1696[var2].method905(arg0);
            }
        }
        this.field1697 = arg0.method1063(-17162);
        this.field1698 = arg0.method1063(-17162);
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
    private class88() {
    }
}
