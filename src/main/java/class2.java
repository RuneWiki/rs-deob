import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class2 {

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "[Laa;")
    private class9[] field7 = new class9[10];

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    private int field9;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    private int field8;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "()I", line = 5)
    public final int method5() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field7[var2] != null && this.field7[var2].field106 / 20 < var1) {
                var1 = this.field7[var2].field106 / 20;
            }
        }
        if (this.field9 < this.field8 && this.field9 / 20 < var1) {
            var1 = this.field9 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field7[var3] != null) {
                this.field7[var3].field106 -= var1 * 20;
            }
        }
        if (this.field9 < this.field8) {
            this.field9 -= var1 * 20;
            this.field8 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "()Ltg;", line = 48)
    public final class316 method6() {
        byte[] var1 = this.method7();
        return new class316(22050, var1, this.field9 * 22050 / 1000, this.field8 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "()[B", line = 56)
    private final byte[] method7() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field7[var2] != null && this.field7[var2].field89 + this.field7[var2].field106 > var1) {
                var1 = this.field7[var2].field89 + this.field7[var2].field106;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field7[var5] != null) {
                int var6 = this.field7[var5].field89 * 22050 / 1000;
                int var7 = this.field7[var5].field106 * 22050 / 1000;
                int[] var8 = this.field7[var5].method48(var6, this.field7[var5].field89);
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

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lkh;)V", line = 129)
    private class2(class14 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method93(false);
            if (var3 != 0) {
                arg0.field195--;
                this.field7[var2] = new class9();
                this.field7[var2].method49(arg0);
            }
        }
        this.field9 = arg0.method116(-1);
        this.field8 = arg0.method116(-1);
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V", line = 149)
    private class2() {
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lek;II)Lpa;", line = 122)
    public static final class2 method8(class185 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1275(arg2, arg1, -5211);
        return var3 == null ? null : new class2(new class14(var3));
    }
}
