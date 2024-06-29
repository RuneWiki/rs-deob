import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class128 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "[Ljc;")
    private class65[] field2940 = new class65[10];

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    private int field2939;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    private int field2941;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lla;II)Lsc;")
    public static final class128 method945(class77 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method585(arg1, 100, arg2);
        return var3 == null ? null : new class128(new class95(var3));
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()Lpe;")
    public final class109 method946() {
        byte[] var1 = this.method947();
        return new class109(22050, var1, this.field2939 * 22050 / 1000, this.field2941 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "()[B")
    private final byte[] method947() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2940[var2] != null && this.field2940[var2].field1465 + this.field2940[var2].field1457 > var1) {
                var1 = this.field2940[var2].field1465 + this.field2940[var2].field1457;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2940[var5] != null) {
                int var6 = this.field2940[var5].field1457 * 22050 / 1000;
                int var7 = this.field2940[var5].field1465 * 22050 / 1000;
                int[] var8 = this.field2940[var5].method469(var6, this.field2940[var5].field1457);
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

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "()I")
    public final int method948() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2940[var2] != null && this.field2940[var2].field1465 / 20 < var1) {
                var1 = this.field2940[var2].field1465 / 20;
            }
        }
        if (this.field2939 < this.field2941 && this.field2939 / 20 < var1) {
            var1 = this.field2939 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2940[var3] != null) {
                this.field2940[var3].field1465 -= var1 * 20;
            }
        }
        if (this.field2939 < this.field2941) {
            this.field2939 -= var1 * 20;
            this.field2941 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lne;)V")
    private class128(class95 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method790((byte) 73);
            if (var3 != 0) {
                arg0.field2304--;
                this.field2940[var2] = new class65();
                this.field2940[var2].method470(arg0);
            }
        }
        this.field2939 = arg0.method795(1);
        this.field2941 = arg0.method795(1);
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    private class128() {
    }
}
