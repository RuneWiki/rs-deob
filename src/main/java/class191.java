import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class191 {

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "[Lup;")
    private class180[] field2749 = new class180[10];

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    private int field2748;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    private int field2747;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "()Lck;", line = 5)
    public final class452 method1201() {
        byte[] var1 = this.method1203();
        return new class452(22050, var1, this.field2748 * 22050 / 1000, this.field2747 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lmg;II)Lsb;", line = 11)
    public static final class191 method1202(class101 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method727(arg2, arg1, 90);
        return var3 == null ? null : new class191(new class391(var3));
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "()[B", line = 21)
    private final byte[] method1203() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2749[var2] != null && this.field2749[var2].field2646 + this.field2749[var2].field2638 > var1) {
                var1 = this.field2749[var2].field2646 + this.field2749[var2].field2638;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2749[var5] != null) {
                int var6 = this.field2749[var5].field2638 * 22050 / 1000;
                int var7 = this.field2749[var5].field2646 * 22050 / 1000;
                int[] var8 = this.field2749[var5].method1157(var6, this.field2749[var5].field2638);
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

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "()I", line = 83)
    public final int method1204() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2749[var2] != null && this.field2749[var2].field2646 / 20 < var1) {
                var1 = this.field2749[var2].field2646 / 20;
            }
        }
        if (this.field2748 < this.field2747 && this.field2748 / 20 < var1) {
            var1 = this.field2748 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2749[var3] != null) {
                this.field2749[var3].field2646 -= var1 * 20;
            }
        }
        if (this.field2748 < this.field2747) {
            this.field2748 -= var1 * 20;
            this.field2747 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lsi;)V", line = 129)
    private class191(class391 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2348(-2);
            if (var3 != 0) {
                arg0.field5719--;
                this.field2749[var2] = new class180();
                this.field2749[var2].method1155(arg0);
            }
        }
        this.field2748 = arg0.method2353((byte) 123);
        this.field2747 = arg0.method2353((byte) 86);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V", line = 149)
    private class191() {
    }
}
