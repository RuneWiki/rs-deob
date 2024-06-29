import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class373 {

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "[Lea;")
    private class456[] field5452 = new class456[10];

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    private int field5453;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    private int field5451;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "()I", line = 8)
    public final int method2956() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5452[var2] != null && this.field5452[var2].field6654 / 20 < var1) {
                var1 = this.field5452[var2].field6654 / 20;
            }
        }
        if (this.field5453 < this.field5451 && this.field5453 / 20 < var1) {
            var1 = this.field5453 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field5452[var3] != null) {
                this.field5452[var3].field6654 -= var1 * 20;
            }
        }
        if (this.field5453 < this.field5451) {
            this.field5453 -= var1 * 20;
            this.field5451 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Llga;II)Lwi;", line = 51)
    public static final class373 method2957(class47 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method512(arg2, arg1, (byte) -97);
        return var3 == null ? null : new class373(new class711(var3));
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Ljc;)V", line = 121)
    private class373(class711 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method5128(0);
            if (var3 != 0) {
                arg0.field9945--;
                this.field5452[var2] = new class456();
                this.field5452[var2].method3518(arg0);
            }
        }
        this.field5453 = arg0.method5116((byte) -126);
        this.field5451 = arg0.method5116((byte) -125);
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V", line = 149)
    private class373() {
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "()[B", line = 64)
    private final byte[] method2958() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5452[var2] != null && this.field5452[var2].field6665 + this.field5452[var2].field6654 > var1) {
                var1 = this.field5452[var2].field6665 + this.field5452[var2].field6654;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field5452[var5] != null) {
                int var6 = this.field5452[var5].field6665 * 22050 / 1000;
                int var7 = this.field5452[var5].field6654 * 22050 / 1000;
                int[] var8 = this.field5452[var5].method3521(var6, this.field5452[var5].field6665);
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

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "()Lvfa;", line = 146)
    public final class313 method2959() {
        byte[] var1 = this.method2958();
        return new class313(22050, var1, this.field5453 * 22050 / 1000, this.field5451 * 22050 / 1000);
    }
}
