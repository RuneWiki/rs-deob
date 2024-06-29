import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class377 {

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "[Lal;")
    private class89[] field5076 = new class89[10];

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "I")
    private int field5075;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "I")
    private int field5074;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lbi;II)Lqba;")
    public static final class377 method2214(class449 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2537(false, arg1, arg2);
        return var3 == null ? null : new class377(new class335(var3));
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "()I")
    public final int method2215() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5076[var2] != null && this.field5076[var2].field1348 / 20 < var1) {
                var1 = this.field5076[var2].field1348 / 20;
            }
        }
        if (this.field5075 < this.field5074 && this.field5075 / 20 < var1) {
            var1 = this.field5075 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field5076[var3] != null) {
                this.field5076[var3].field1348 -= var1 * 20;
            }
        }
        if (this.field5075 < this.field5074) {
            this.field5075 -= var1 * 20;
            this.field5074 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "()[B")
    private final byte[] method2216() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5076[var2] != null && this.field5076[var2].field1348 + this.field5076[var2].field1340 > var1) {
                var1 = this.field5076[var2].field1348 + this.field5076[var2].field1340;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field5076[var5] != null) {
                int var6 = this.field5076[var5].field1340 * 22050 / 1000;
                int var7 = this.field5076[var5].field1348 * 22050 / 1000;
                int[] var8 = this.field5076[var5].method710(var6, this.field5076[var5].field1340);
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

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "()Lfc;")
    public final class241 method2217() {
        byte[] var1 = this.method2216();
        return new class241(22050, var1, this.field5075 * 22050 / 1000, this.field5074 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Leh;)V")
    private class377(class335 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2034(255);
            if (var3 != 0) {
                arg0.field4619--;
                this.field5076[var2] = new class89();
                this.field5076[var2].method708(arg0);
            }
        }
        this.field5075 = arg0.method2001((byte) -83);
        this.field5074 = arg0.method2001((byte) -83);
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "()V")
    private class377() {
    }
}
