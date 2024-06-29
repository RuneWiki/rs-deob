import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class284 {

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "[Lto;")
    private class268[] field4525 = new class268[10];

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    private int field4524;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    private int field4523;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "()[B", line = 5)
    private final byte[] method2048() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4525[var2] != null && this.field4525[var2].field4228 + this.field4525[var2].field4210 > var1) {
                var1 = this.field4525[var2].field4228 + this.field4525[var2].field4210;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field4525[var5] != null) {
                int var6 = this.field4525[var5].field4210 * 22050 / 1000;
                int var7 = this.field4525[var5].field4228 * 22050 / 1000;
                int[] var8 = this.field4525[var5].method1882(var6, this.field4525[var5].field4210);
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

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "()I", line = 64)
    public final int method2049() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4525[var2] != null && this.field4525[var2].field4228 / 20 < var1) {
                var1 = this.field4525[var2].field4228 / 20;
            }
        }
        if (this.field4524 < this.field4523 && this.field4524 / 20 < var1) {
            var1 = this.field4524 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field4525[var3] != null) {
                this.field4525[var3].field4228 -= var1 * 20;
            }
        }
        if (this.field4524 < this.field4523) {
            this.field4524 -= var1 * 20;
            this.field4523 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lnk;II)Ltf;", line = 107)
    public static final class284 method2050(class16 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method100(arg1, arg2, (byte) -107);
        return var3 == null ? null : new class284(new class143(var3));
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "()Lfn;", line = 115)
    public final class37 method2051() {
        byte[] var1 = this.method2048();
        return new class37(22050, var1, this.field4524 * 22050 / 1000, this.field4523 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Llf;)V", line = 128)
    private class284(class143 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1043(true);
            if (var3 != 0) {
                arg0.field2295--;
                this.field4525[var2] = new class268();
                this.field4525[var2].method1880(arg0);
            }
        }
        this.field4524 = arg0.method1051(1);
        this.field4523 = arg0.method1051(1);
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V", line = 149)
    private class284() {
    }
}
