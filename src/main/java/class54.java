import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class54 {

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "[Llj;")
    private class39[] field762 = new class39[10];

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    private int field760;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
    private int field761;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lui;II)Lmq;", line = 4)
    public static final class54 method388(class451 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2691(arg2, arg1, 0);
        return var3 == null ? null : new class54(new class446(var3));
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "()I", line = 14)
    public final int method389() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field762[var2] != null && this.field762[var2].field540 / 20 < var1) {
                var1 = this.field762[var2].field540 / 20;
            }
        }
        if (this.field760 < this.field761 && this.field760 / 20 < var1) {
            var1 = this.field760 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field762[var3] != null) {
                this.field762[var3].field540 -= var1 * 20;
            }
        }
        if (this.field760 < this.field761) {
            this.field760 -= var1 * 20;
            this.field761 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "()Luk;", line = 57)
    public final class328 method390() {
        byte[] var1 = this.method391();
        return new class328(22050, var1, this.field760 * 22050 / 1000, this.field761 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "()[B", line = 63)
    private final byte[] method391() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field762[var2] != null && this.field762[var2].field540 + this.field762[var2].field534 > var1) {
                var1 = this.field762[var2].field540 + this.field762[var2].field534;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field762[var5] != null) {
                int var6 = this.field762[var5].field534 * 22050 / 1000;
                int var7 = this.field762[var5].field540 * 22050 / 1000;
                int[] var8 = this.field762[var5].method298(var6, this.field762[var5].field534);
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

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lre;)V", line = 129)
    private class54(class446 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2628(49152);
            if (var3 != 0) {
                arg0.field6315--;
                this.field762[var2] = new class39();
                this.field762[var2].method301(arg0);
            }
        }
        this.field760 = arg0.method2631(2530);
        this.field761 = arg0.method2631(2530);
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V", line = 149)
    private class54() {
    }
}
