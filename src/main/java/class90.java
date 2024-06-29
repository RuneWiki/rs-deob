import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class90 {

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "[Lqv;")
    private class409[] field1200 = new class409[10];

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
    private int field1202;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    private int field1201;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "()I")
    public final int method670() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1200[var2] != null && this.field1200[var2].field5788 / 20 < var1) {
                var1 = this.field1200[var2].field5788 / 20;
            }
        }
        if (this.field1202 < this.field1201 && this.field1202 / 20 < var1) {
            var1 = this.field1202 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1200[var3] != null) {
                this.field1200[var3].field5788 -= var1 * 20;
            }
        }
        if (this.field1202 < this.field1201) {
            this.field1202 -= var1 * 20;
            this.field1201 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lpj;II)Ljt;")
    public static final class90 method671(class132 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method940(arg1, arg2, 0);
        return var3 == null ? null : new class90(new class96(var3));
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "()Lqr;")
    public final class59 method672() {
        byte[] var1 = this.method673();
        return new class59(22050, var1, this.field1202 * 22050 / 1000, this.field1201 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Ljr;)V")
    private class90(class96 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method718(-74);
            if (var3 != 0) {
                arg0.field1301--;
                this.field1200[var2] = new class409();
                this.field1200[var2].method2341(arg0);
            }
        }
        this.field1202 = arg0.method743((byte) -7);
        this.field1201 = arg0.method743((byte) -125);
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V")
    private class90() {
    }

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "()[B")
    private final byte[] method673() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1200[var2] != null && this.field1200[var2].field5788 + this.field1200[var2].field5787 > var1) {
                var1 = this.field1200[var2].field5788 + this.field1200[var2].field5787;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1200[var5] != null) {
                int var6 = this.field1200[var5].field5787 * 22050 / 1000;
                int var7 = this.field1200[var5].field5788 * 22050 / 1000;
                int[] var8 = this.field1200[var5].method2342(var6, this.field1200[var5].field5787);
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
