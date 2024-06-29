import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class199 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "[Ljc;")
    private class100[] field3531 = new class100[10];

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    private int field3533;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    private int field3532;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lsd;II)Lta;")
    public static final class199 method1246(class192 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1208(arg2, (byte) 50, arg1);
        return var3 == null ? null : new class199(new class229(var3));
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()Lmg;")
    public final class135 method1247() {
        byte[] var1 = this.method1248();
        return new class135(22050, var1, this.field3533 * 22050 / 1000, this.field3532 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()[B")
    private final byte[] method1248() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3531[var2] != null && this.field3531[var2].field1807 + this.field3531[var2].field1806 > var1) {
                var1 = this.field3531[var2].field1807 + this.field3531[var2].field1806;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3531[var5] != null) {
                int var6 = this.field3531[var5].field1807 * 22050 / 1000;
                int var7 = this.field3531[var5].field1806 * 22050 / 1000;
                int[] var8 = this.field3531[var5].method616(var6, this.field3531[var5].field1807);
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

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "()I")
    public final int method1249() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3531[var2] != null && this.field3531[var2].field1806 / 20 < var1) {
                var1 = this.field3531[var2].field1806 / 20;
            }
        }
        if (this.field3533 < this.field3532 && this.field3533 / 20 < var1) {
            var1 = this.field3533 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3531[var3] != null) {
                this.field3531[var3].field1806 -= var1 * 20;
            }
        }
        if (this.field3533 < this.field3532) {
            this.field3533 -= var1 * 20;
            this.field3532 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lwa;)V")
    private class199(class229 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1475(255);
            if (var3 != 0) {
                arg0.field4101--;
                this.field3531[var2] = new class100();
                this.field3531[var2].method614(arg0);
            }
        }
        this.field3533 = arg0.method1490((byte) 73);
        this.field3532 = arg0.method1490((byte) 73);
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    private class199() {
    }
}
