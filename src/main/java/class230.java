import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class230 {

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "[Ltv;")
    private class333[] field3813 = new class333[10];

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    private int field3815;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    private int field3814;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "()I")
    public final int method1645() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3813[var2] != null && this.field3813[var2].field5204 / 20 < var1) {
                var1 = this.field3813[var2].field5204 / 20;
            }
        }
        if (this.field3815 < this.field3814 && this.field3815 / 20 < var1) {
            var1 = this.field3815 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3813[var3] != null) {
                this.field3813[var3].field5204 -= var1 * 20;
            }
        }
        if (this.field3815 < this.field3814) {
            this.field3815 -= var1 * 20;
            this.field3814 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "()Llf;")
    public final class391 method1646() {
        byte[] var1 = this.method1648();
        return new class391(22050, var1, this.field3815 * 22050 / 1000, this.field3814 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lmn;II)Lko;")
    public static final class230 method1647(class162 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1004(arg1, false, arg2);
        return var3 == null ? null : new class230(new class208(var3));
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "()[B")
    private final byte[] method1648() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3813[var2] != null && this.field3813[var2].field5207 + this.field3813[var2].field5204 > var1) {
                var1 = this.field3813[var2].field5207 + this.field3813[var2].field5204;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3813[var5] != null) {
                int var6 = this.field3813[var5].field5207 * 22050 / 1000;
                int var7 = this.field3813[var5].field5204 * 22050 / 1000;
                int[] var8 = this.field3813[var5].method2215(var6, this.field3813[var5].field5207);
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

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lhw;)V")
    private class230(class208 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1445(83);
            if (var3 != 0) {
                arg0.field3162--;
                this.field3813[var2] = new class333();
                this.field3813[var2].method2217(arg0);
            }
        }
        this.field3815 = arg0.method1455(-3387);
        this.field3814 = arg0.method1455(-3387);
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
    private class230() {
    }
}
