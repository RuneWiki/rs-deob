import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class114 {

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "[Ltn;")
    private class49[] field1665 = new class49[10];

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    private int field1663;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    private int field1664;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lqj;II)Lhi;")
    public static final class114 method752(class296 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1920(arg2, false, arg1);
        return var3 == null ? null : new class114(new class371(var3));
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "()[B")
    private final byte[] method753() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1665[var2] != null && this.field1665[var2].field756 + this.field1665[var2].field755 > var1) {
                var1 = this.field1665[var2].field756 + this.field1665[var2].field755;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1665[var5] != null) {
                int var6 = this.field1665[var5].field755 * 22050 / 1000;
                int var7 = this.field1665[var5].field756 * 22050 / 1000;
                int[] var8 = this.field1665[var5].method343(var6, this.field1665[var5].field755);
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

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "()I")
    public final int method754() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1665[var2] != null && this.field1665[var2].field756 / 20 < var1) {
                var1 = this.field1665[var2].field756 / 20;
            }
        }
        if (this.field1663 < this.field1664 && this.field1663 / 20 < var1) {
            var1 = this.field1663 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1665[var3] != null) {
                this.field1665[var3].field756 -= var1 * 20;
            }
        }
        if (this.field1663 < this.field1664) {
            this.field1663 -= var1 * 20;
            this.field1664 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "()Leg;")
    public final class56 method755() {
        byte[] var1 = this.method753();
        return new class56(22050, var1, this.field1663 * 22050 / 1000, this.field1664 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Leb;)V")
    private class114(class371 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2429(0);
            if (var3 != 0) {
                arg0.field5273--;
                this.field1665[var2] = new class49();
                this.field1665[var2].method346(arg0);
            }
        }
        this.field1663 = arg0.method2403((byte) 113);
        this.field1664 = arg0.method2403((byte) 77);
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
    private class114() {
    }
}
