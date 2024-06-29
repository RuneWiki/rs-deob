import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class367 {

    @OriginalMember(owner = "client!um", name = "c", descriptor = "[Llp;")
    private class269[] field5385 = new class269[10];

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    private int field5384;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    private int field5383;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "()[B", line = 7)
    private final byte[] method2248() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5385[var2] != null && this.field5385[var2].field4070 + this.field5385[var2].field4068 > var1) {
                var1 = this.field5385[var2].field4070 + this.field5385[var2].field4068;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field5385[var5] != null) {
                int var6 = this.field5385[var5].field4068 * 22050 / 1000;
                int var7 = this.field5385[var5].field4070 * 22050 / 1000;
                int[] var8 = this.field5385[var5].method1708(var6, this.field5385[var5].field4068);
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

    @OriginalMember(owner = "client!um", name = "b", descriptor = "()I", line = 71)
    public final int method2249() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5385[var2] != null && this.field5385[var2].field4070 / 20 < var1) {
                var1 = this.field5385[var2].field4070 / 20;
            }
        }
        if (this.field5384 < this.field5383 && this.field5384 / 20 < var1) {
            var1 = this.field5384 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field5385[var3] != null) {
                this.field5385[var3].field4070 -= var1 * 20;
            }
        }
        if (this.field5384 < this.field5383) {
            this.field5384 -= var1 * 20;
            this.field5383 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lnn;)V", line = 116)
    private class367(class289 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1858(-3256);
            if (var3 != 0) {
                arg0.field4399--;
                this.field5385[var2] = new class269();
                this.field5385[var2].method1710(arg0);
            }
        }
        this.field5384 = arg0.method1841((byte) -125);
        this.field5383 = arg0.method1841((byte) -4);
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V", line = 136)
    private class367() {
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lph;II)Lum;", line = 140)
    public static final class367 method2250(class459 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2757(arg1, arg2, (byte) -128);
        return var3 == null ? null : new class367(new class289(var3));
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "()Lwq;", line = 148)
    public final class116 method2251() {
        byte[] var1 = this.method2248();
        return new class116(22050, var1, this.field5384 * 22050 / 1000, this.field5383 * 22050 / 1000);
    }
}
