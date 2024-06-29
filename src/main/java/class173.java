import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class173 {

    @OriginalMember(owner = "client!og", name = "a", descriptor = "[Laf;")
    private class152[] field3113 = new class152[10];

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    private int field3115;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    private int field3114;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "()[B")
    private final byte[] method1136() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3113[var2] != null && this.field3113[var2].field2826 + this.field3113[var2].field2822 > var1) {
                var1 = this.field3113[var2].field2826 + this.field3113[var2].field2822;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3113[var5] != null) {
                int var6 = this.field3113[var5].field2826 * 22050 / 1000;
                int var7 = this.field3113[var5].field2822 * 22050 / 1000;
                int[] var8 = this.field3113[var5].method1043(var6, this.field3113[var5].field2826);
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

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lfl;II)Log;")
    public static final class173 method1137(class192 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1332(true, arg2, arg1);
        return var3 == null ? null : new class173(new class135(var3));
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "()Lfi;")
    public final class222 method1138() {
        byte[] var1 = this.method1136();
        return new class222(22050, var1, this.field3115 * 22050 / 1000, this.field3114 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "()I")
    public final int method1139() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3113[var2] != null && this.field3113[var2].field2822 / 20 < var1) {
                var1 = this.field3113[var2].field2822 / 20;
            }
        }
        if (this.field3115 < this.field3114 && this.field3115 / 20 < var1) {
            var1 = this.field3115 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3113[var3] != null) {
                this.field3113[var3].field2822 -= var1 * 20;
            }
        }
        if (this.field3115 < this.field3114) {
            this.field3115 -= var1 * 20;
            this.field3114 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lng;)V")
    private class173(class135 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method920((byte) 106);
            if (var3 != 0) {
                arg0.field2449--;
                this.field3113[var2] = new class152();
                this.field3113[var2].method1041(arg0);
            }
        }
        this.field3115 = arg0.method927(127);
        this.field3114 = arg0.method927(125);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    private class173() {
    }
}
