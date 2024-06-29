import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class270 {

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "[Lba;")
    private class166[] field4730 = new class166[10];

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    private int field4729;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    private int field4728;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "()I")
    public final int method1806() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4730[var2] != null && this.field4730[var2].field2902 / 20 < var1) {
                var1 = this.field4730[var2].field2902 / 20;
            }
        }
        if (this.field4729 < this.field4728 && this.field4729 / 20 < var1) {
            var1 = this.field4729 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field4730[var3] != null) {
                this.field4730[var3].field2902 -= var1 * 20;
            }
        }
        if (this.field4729 < this.field4728) {
            this.field4729 -= var1 * 20;
            this.field4728 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "()[B")
    private final byte[] method1807() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4730[var2] != null && this.field4730[var2].field2902 + this.field4730[var2].field2897 > var1) {
                var1 = this.field4730[var2].field2902 + this.field4730[var2].field2897;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field4730[var5] != null) {
                int var6 = this.field4730[var5].field2897 * 22050 / 1000;
                int var7 = this.field4730[var5].field2902 * 22050 / 1000;
                int[] var8 = this.field4730[var5].method1166(var6, this.field4730[var5].field2897);
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

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "()Lei;")
    public final class171 method1808() {
        byte[] var1 = this.method1807();
        return new class171(22050, var1, this.field4729 * 22050 / 1000, this.field4728 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ltg;II)Lvh;")
    public static final class270 method1809(class180 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1258(arg1, arg2, (byte) 108);
        return var3 == null ? null : new class270(new class25(var3));
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Llj;)V")
    private class270(class25 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method189((byte) -103);
            if (var3 != 0) {
                arg0.field481--;
                this.field4730[var2] = new class166();
                this.field4730[var2].method1164(arg0);
            }
        }
        this.field4729 = arg0.method193((byte) 77);
        this.field4728 = arg0.method193((byte) 77);
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
    private class270() {
    }
}
