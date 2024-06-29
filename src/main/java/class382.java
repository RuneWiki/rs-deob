import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class382 {

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "[Lkga;")
    private class570[] field5275 = new class570[10];

    @OriginalMember(owner = "client!uia", name = "c", descriptor = "I")
    private int field5276;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "I")
    private int field5274;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(Lwia;II)Luia;")
    public static final class382 method2377(class791 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4339(arg2, 0, arg1);
        return var3 == null ? null : new class382(new class494(var3));
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "()I")
    public final int method2378() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5275[var2] != null && this.field5275[var2].field8043 / 20 < var1) {
                var1 = this.field5275[var2].field8043 / 20;
            }
        }
        if (this.field5276 < this.field5274 && this.field5276 / 20 < var1) {
            var1 = this.field5276 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field5275[var3] != null) {
                this.field5275[var3].field8043 -= var1 * 20;
            }
        }
        if (this.field5276 < this.field5274) {
            this.field5276 -= var1 * 20;
            this.field5274 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "()[B")
    private final byte[] method2379() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5275[var2] != null && this.field5275[var2].field8044 + this.field5275[var2].field8043 > var1) {
                var1 = this.field5275[var2].field8044 + this.field5275[var2].field8043;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field5275[var5] != null) {
                int var6 = this.field5275[var5].field8044 * 22050 / 1000;
                int var7 = this.field5275[var5].field8043 * 22050 / 1000;
                int[] var8 = this.field5275[var5].method3356(var6, this.field5275[var5].field8044);
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

    @OriginalMember(owner = "client!uia", name = "c", descriptor = "()Ldga;")
    public final class218 method2380() {
        byte[] var1 = this.method2379();
        return new class218(22050, var1, this.field5276 * 22050 / 1000, this.field5274 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(Lso;)V")
    private class382(class494 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2964((byte) 93);
            if (var3 != 0) {
                arg0.field7042--;
                this.field5275[var2] = new class570();
                this.field5275[var2].method3355(arg0);
            }
        }
        this.field5276 = arg0.method2998(true);
        this.field5274 = arg0.method2998(true);
    }

    @OriginalMember(owner = "client!uia", name = "<init>", descriptor = "()V")
    private class382() {
    }
}
