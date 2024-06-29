import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class192 {

    @OriginalMember(owner = "client!en", name = "a", descriptor = "[Lqk;")
    private class14[] field2847 = new class14[10];

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    private int field2849;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    private int field2848;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lb;II)Len;")
    public static final class192 method1187(class201 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1257(arg2, arg1, 24558);
        return var3 == null ? null : new class192(new class276(var3));
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "()[B")
    private final byte[] method1188() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2847[var2] != null && this.field2847[var2].field161 + this.field2847[var2].field155 > var1) {
                var1 = this.field2847[var2].field161 + this.field2847[var2].field155;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2847[var5] != null) {
                int var6 = this.field2847[var5].field155 * 22050 / 1000;
                int var7 = this.field2847[var5].field161 * 22050 / 1000;
                int[] var8 = this.field2847[var5].method102(var6, this.field2847[var5].field155);
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

    @OriginalMember(owner = "client!en", name = "b", descriptor = "()I")
    public final int method1189() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2847[var2] != null && this.field2847[var2].field161 / 20 < var1) {
                var1 = this.field2847[var2].field161 / 20;
            }
        }
        if (this.field2849 < this.field2848 && this.field2849 / 20 < var1) {
            var1 = this.field2849 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2847[var3] != null) {
                this.field2847[var3].field161 -= var1 * 20;
            }
        }
        if (this.field2849 < this.field2848) {
            this.field2849 -= var1 * 20;
            this.field2848 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "()Lnd;")
    public final class352 method1190() {
        byte[] var1 = this.method1188();
        return new class352(22050, var1, this.field2849 * 22050 / 1000, this.field2848 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lrp;)V")
    private class192(class276 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1701(-23121);
            if (var3 != 0) {
                arg0.field4021--;
                this.field2847[var2] = new class14();
                this.field2847[var2].method99(arg0);
            }
        }
        this.field2849 = arg0.method1729(65280);
        this.field2848 = arg0.method1729(65280);
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V")
    private class192() {
    }
}
