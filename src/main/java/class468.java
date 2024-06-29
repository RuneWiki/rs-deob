import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class468 {

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "[Lpv;")
    private class63[] field6723 = new class63[10];

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    private int field6722;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    private int field6724;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lpu;II)Lek;", line = 6)
    public static final class468 method2764(class522 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3007(arg1, arg2, 5);
        return var3 == null ? null : new class468(new class695(var3));
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "()I", line = 15)
    public final int method2765() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field6723[var2] != null && this.field6723[var2].field1181 / 20 < var1) {
                var1 = this.field6723[var2].field1181 / 20;
            }
        }
        if (this.field6722 < this.field6724 && this.field6722 / 20 < var1) {
            var1 = this.field6722 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field6723[var3] != null) {
                this.field6723[var3].field1181 -= var1 * 20;
            }
        }
        if (this.field6722 < this.field6724) {
            this.field6722 -= var1 * 20;
            this.field6724 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "()Lmm;", line = 59)
    public final class250 method2766() {
        byte[] var1 = this.method2767();
        return new class250(22050, var1, this.field6722 * 22050 / 1000, this.field6724 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "()[B", line = 64)
    private final byte[] method2767() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field6723[var2] != null && this.field6723[var2].field1183 + this.field6723[var2].field1181 > var1) {
                var1 = this.field6723[var2].field1183 + this.field6723[var2].field1181;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field6723[var5] != null) {
                int var6 = this.field6723[var5].field1183 * 22050 / 1000;
                int var7 = this.field6723[var5].field1181 * 22050 / 1000;
                int[] var8 = this.field6723[var5].method651(var6, this.field6723[var5].field1183);
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

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lmo;)V", line = 129)
    private class468(class695 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3826(false);
            if (var3 != 0) {
                arg0.field9761--;
                this.field6723[var2] = new class63();
                this.field6723[var2].method654(arg0);
            }
        }
        this.field6722 = arg0.method3847((byte) 118);
        this.field6724 = arg0.method3847((byte) 118);
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V", line = 149)
    private class468() {
    }
}
