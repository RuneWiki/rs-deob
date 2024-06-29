import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class113 {

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "[Lrk;")
    private class25[] field1614 = new class25[10];

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "I")
    private int field1615;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
    private int field1616;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lpc;II)Lwq;", line = 4)
    public static final class113 method776(class473 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2708(arg1, arg2, (byte) 54);
        return var3 == null ? null : new class113(new class379(var3));
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "()Luo;", line = 15)
    public final class404 method777() {
        byte[] var1 = this.method779();
        return new class404(22050, var1, this.field1615 * 22050 / 1000, this.field1616 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "()I", line = 23)
    public final int method778() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1614[var2] != null && this.field1614[var2].field445 / 20 < var1) {
                var1 = this.field1614[var2].field445 / 20;
            }
        }
        if (this.field1615 < this.field1616 && this.field1615 / 20 < var1) {
            var1 = this.field1615 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1614[var3] != null) {
                this.field1614[var3].field445 -= var1 * 20;
            }
        }
        if (this.field1615 < this.field1616) {
            this.field1615 -= var1 * 20;
            this.field1616 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lmd;)V", line = 69)
    private class113(class379 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2238(255);
            if (var3 != 0) {
                arg0.field5173--;
                this.field1614[var2] = new class25();
                this.field1614[var2].method222(arg0);
            }
        }
        this.field1615 = arg0.method2212((byte) 83);
        this.field1616 = arg0.method2212((byte) 83);
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "()V", line = 149)
    private class113() {
    }

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "()[B", line = 92)
    private final byte[] method779() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1614[var2] != null && this.field1614[var2].field445 + this.field1614[var2].field424 > var1) {
                var1 = this.field1614[var2].field445 + this.field1614[var2].field424;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1614[var5] != null) {
                int var6 = this.field1614[var5].field424 * 22050 / 1000;
                int var7 = this.field1614[var5].field445 * 22050 / 1000;
                int[] var8 = this.field1614[var5].method219(var6, this.field1614[var5].field424);
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
}
