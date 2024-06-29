import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class60 {

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "[Loga;")
    private class442[] field1343 = new class442[10];

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    private int field1344;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    private int field1342;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lom;II)Lwc;")
    public static final class60 method682(class344 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2216(arg1, arg2, true);
        return var3 == null ? null : new class60(new class61(var3));
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()Lee;")
    public final class630 method683() {
        byte[] var1 = this.method684();
        return new class630(22050, var1, this.field1344 * 22050 / 1000, this.field1342 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "()[B")
    private final byte[] method684() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1343[var2] != null && this.field1343[var2].field6361 + this.field1343[var2].field6356 > var1) {
                var1 = this.field1343[var2].field6361 + this.field1343[var2].field6356;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1343[var5] != null) {
                int var6 = this.field1343[var5].field6361 * 22050 / 1000;
                int var7 = this.field1343[var5].field6356 * 22050 / 1000;
                int[] var8 = this.field1343[var5].method2664(var6, this.field1343[var5].field6361);
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

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "()I")
    public final int method685() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1343[var2] != null && this.field1343[var2].field6356 / 20 < var1) {
                var1 = this.field1343[var2].field6356 / 20;
            }
        }
        if (this.field1344 < this.field1342 && this.field1344 / 20 < var1) {
            var1 = this.field1344 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1343[var3] != null) {
                this.field1343[var3].field6356 -= var1 * 20;
            }
        }
        if (this.field1344 < this.field1342) {
            this.field1344 -= var1 * 20;
            this.field1342 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lqh;)V")
    private class60(class61 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method732(-559537960);
            if (var3 != 0) {
                arg0.field1393--;
                this.field1343[var2] = new class442();
                this.field1343[var2].method2661(arg0);
            }
        }
        this.field1344 = arg0.method723((byte) -25);
        this.field1342 = arg0.method723((byte) -25);
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
    private class60() {
    }
}
