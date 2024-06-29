import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class123 {

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "[Lf;")
    private class46[] field2535 = new class46[10];

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    private int field2533;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    private int field2534;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "()Ljc;")
    public final class83 method761() {
        byte[] var1 = this.method762();
        return new class83(22050, var1, this.field2533 * 22050 / 1000, this.field2534 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "()[B")
    private final byte[] method762() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2535[var2] != null && this.field2535[var2].field995 + this.field2535[var2].field993 > var1) {
                var1 = this.field2535[var2].field995 + this.field2535[var2].field993;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2535[var5] != null) {
                int var6 = this.field2535[var5].field995 * 22050 / 1000;
                int var7 = this.field2535[var5].field993 * 22050 / 1000;
                int[] var8 = this.field2535[var5].method363(var6, this.field2535[var5].field995);
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

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "()I")
    public final int method763() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2535[var2] != null && this.field2535[var2].field993 / 20 < var1) {
                var1 = this.field2535[var2].field993 / 20;
            }
        }
        if (this.field2533 < this.field2534 && this.field2533 / 20 < var1) {
            var1 = this.field2533 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2535[var3] != null) {
                this.field2535[var3].field993 -= var1 * 20;
            }
        }
        if (this.field2533 < this.field2534) {
            this.field2533 -= var1 * 20;
            this.field2534 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lva;)V")
    private class123(class189 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1202(-19);
            if (var3 != 0) {
                arg0.field3752--;
                this.field2535[var2] = new class46();
                this.field2535[var2].method360(arg0);
            }
        }
        this.field2533 = arg0.method1197(-1);
        this.field2534 = arg0.method1197(-1);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lkh;II)Lng;")
    public static final class123 method764(class97 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method651(4, arg2, arg1);
        return var3 == null ? null : new class123(new class189(var3));
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
    private class123() {
    }
}
