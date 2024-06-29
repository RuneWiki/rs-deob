import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class154 {

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "[Lec;")
    private class44[] field2917 = new class44[10];

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    private int field2918;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    private int field2916;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "()Loc;")
    public final class142 method1016() {
        byte[] var1 = this.method1018();
        return new class142(22050, var1, this.field2918 * 22050 / 1000, this.field2916 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lbc;II)Lpe;")
    public static final class154 method1017(class14 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method142(arg1, arg2, (byte) 2);
        return var3 == null ? null : new class154(new class121(var3));
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "()[B")
    private final byte[] method1018() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2917[var2] != null && this.field2917[var2].field886 + this.field2917[var2].field881 > var1) {
                var1 = this.field2917[var2].field886 + this.field2917[var2].field881;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2917[var5] != null) {
                int var6 = this.field2917[var5].field881 * 22050 / 1000;
                int var7 = this.field2917[var5].field886 * 22050 / 1000;
                int[] var8 = this.field2917[var5].method309(var6, this.field2917[var5].field881);
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

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "()I")
    public final int method1019() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2917[var2] != null && this.field2917[var2].field886 / 20 < var1) {
                var1 = this.field2917[var2].field886 / 20;
            }
        }
        if (this.field2918 < this.field2916 && this.field2918 / 20 < var1) {
            var1 = this.field2918 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2917[var3] != null) {
                this.field2917[var3].field886 -= var1 * 20;
            }
        }
        if (this.field2918 < this.field2916) {
            this.field2918 -= var1 * 20;
            this.field2916 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lmb;)V")
    private class154(class121 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method751((byte) -34);
            if (var3 != 0) {
                arg0.field2222--;
                this.field2917[var2] = new class44();
                this.field2917[var2].method312(arg0);
            }
        }
        this.field2918 = arg0.method755((byte) -68);
        this.field2916 = arg0.method755((byte) -104);
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    private class154() {
    }
}
