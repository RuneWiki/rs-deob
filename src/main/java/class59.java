import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class59 {

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "[Lwc;")
    private class242[] field1205 = new class242[10];

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    private int field1204;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    private int field1203;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()I")
    public final int method443() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1205[var2] != null && this.field1205[var2].field4378 / 20 < var1) {
                var1 = this.field1205[var2].field4378 / 20;
            }
        }
        if (this.field1204 < this.field1203 && this.field1204 / 20 < var1) {
            var1 = this.field1204 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1205[var3] != null) {
                this.field1205[var3].field4378 -= var1 * 20;
            }
        }
        if (this.field1204 < this.field1203) {
            this.field1204 -= var1 * 20;
            this.field1203 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "()Lpd;")
    public final class168 method444() {
        byte[] var1 = this.method445();
        return new class168(22050, var1, this.field1204 * 22050 / 1000, this.field1203 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "()[B")
    private final byte[] method445() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1205[var2] != null && this.field1205[var2].field4378 + this.field1205[var2].field4366 > var1) {
                var1 = this.field1205[var2].field4378 + this.field1205[var2].field4366;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1205[var5] != null) {
                int var6 = this.field1205[var5].field4366 * 22050 / 1000;
                int var7 = this.field1205[var5].field4378 * 22050 / 1000;
                int[] var8 = this.field1205[var5].method1536(var6, this.field1205[var5].field4366);
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

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lai;II)Lfc;")
    public static final class59 method446(class10 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method104(-128, arg1, arg2);
        return var3 == null ? null : new class59(new class145(var3));
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lnc;)V")
    private class59(class145 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method998(116);
            if (var3 != 0) {
                arg0.field2643--;
                this.field1205[var2] = new class242();
                this.field1205[var2].method1534(arg0);
            }
        }
        this.field1204 = arg0.method1049((byte) 126);
        this.field1203 = arg0.method1049((byte) 120);
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    private class59() {
    }
}
