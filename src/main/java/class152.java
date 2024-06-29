import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class152 {

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "[Lsa;")
    private class163[] field2943 = new class163[10];

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    private int field2944;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    private int field2942;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()I")
    public final int method1028() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2943[var2] != null && this.field2943[var2].field3108 / 20 < var1) {
                var1 = this.field2943[var2].field3108 / 20;
            }
        }
        if (this.field2944 < this.field2942 && this.field2944 / 20 < var1) {
            var1 = this.field2944 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2943[var3] != null) {
                this.field2943[var3].field3108 -= var1 * 20;
            }
        }
        if (this.field2944 < this.field2942) {
            this.field2944 -= var1 * 20;
            this.field2942 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "()Lbb;")
    public final class13 method1029() {
        byte[] var1 = this.method1031();
        return new class13(22050, var1, this.field2944 * 22050 / 1000, this.field2942 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lf;II)Lqh;")
    public static final class152 method1030(class47 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method353(arg1, arg2, -55);
        return var3 == null ? null : new class152(new class53(var3));
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "()[B")
    private final byte[] method1031() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2943[var2] != null && this.field2943[var2].field3108 + this.field2943[var2].field3099 > var1) {
                var1 = this.field2943[var2].field3108 + this.field2943[var2].field3099;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2943[var5] != null) {
                int var6 = this.field2943[var5].field3099 * 22050 / 1000;
                int var7 = this.field2943[var5].field3108 * 22050 / 1000;
                int[] var8 = this.field2943[var5].method1098(var6, this.field2943[var5].field3099);
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

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lff;)V")
    private class152(class53 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method400(255);
            if (var3 != 0) {
                arg0.field1000--;
                this.field2943[var2] = new class163();
                this.field2943[var2].method1099(arg0);
            }
        }
        this.field2944 = arg0.method405(2);
        this.field2942 = arg0.method405(2);
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
    private class152() {
    }
}
