import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class543 {

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "[Lra;")
    private class792[] field6812 = new class792[10];

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    private int field6814;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    private int field6813;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lwm;II)Lpc;", line = 5)
    public static final class543 method2949(class30 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method139(arg1, (byte) -94, arg2);
        return var3 == null ? null : new class543(new class234(var3));
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "()I", line = 13)
    public final int method2950() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field6812[var2] != null && this.field6812[var2].field10852 / 20 < var1) {
                var1 = this.field6812[var2].field10852 / 20;
            }
        }
        if (this.field6814 < this.field6813 && this.field6814 / 20 < var1) {
            var1 = this.field6814 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field6812[var3] != null) {
                this.field6812[var3].field10852 -= var1 * 20;
            }
        }
        if (this.field6814 < this.field6813) {
            this.field6814 -= var1 * 20;
            this.field6813 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lmc;)V", line = 61)
    private class543(class234 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1509(true);
            if (var3 != 0) {
                arg0.field3133--;
                this.field6812[var2] = new class792();
                this.field6812[var2].method4333(arg0);
            }
        }
        this.field6814 = arg0.method1553((byte) -112);
        this.field6813 = arg0.method1553((byte) -122);
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V", line = 81)
    private class543() {
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "()[B", line = 86)
    private final byte[] method2951() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field6812[var2] != null && this.field6812[var2].field10855 + this.field6812[var2].field10852 > var1) {
                var1 = this.field6812[var2].field10855 + this.field6812[var2].field10852;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field6812[var5] != null) {
                int var6 = this.field6812[var5].field10855 * 22050 / 1000;
                int var7 = this.field6812[var5].field10852 * 22050 / 1000;
                int[] var8 = this.field6812[var5].method4336(var6, this.field6812[var5].field10855);
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

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "()Lnga;", line = 146)
    public final class701 method2952() {
        byte[] var1 = this.method2951();
        return new class701(22050, var1, this.field6814 * 22050 / 1000, this.field6813 * 22050 / 1000);
    }
}
