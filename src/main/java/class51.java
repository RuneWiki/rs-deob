import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class51 {

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "[Lhj;")
    private class87[] field862 = new class87[10];

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    private int field863;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    private int field864;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lpb;II)Lef;")
    public static final class51 method348(class165 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1079(arg1, 121, arg2);
        return var3 == null ? null : new class51(new class112(var3));
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()Lqc;")
    public final class177 method349() {
        byte[] var1 = this.method351();
        return new class177(22050, var1, this.field863 * 22050 / 1000, this.field864 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "()I")
    public final int method350() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field862[var2] != null && this.field862[var2].field1516 / 20 < var1) {
                var1 = this.field862[var2].field1516 / 20;
            }
        }
        if (this.field863 < this.field864 && this.field863 / 20 < var1) {
            var1 = this.field863 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field862[var3] != null) {
                this.field862[var3].field1516 -= var1 * 20;
            }
        }
        if (this.field863 < this.field864) {
            this.field863 -= var1 * 20;
            this.field864 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lkd;)V")
    private class51(class112 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method716(-1308);
            if (var3 != 0) {
                arg0.field2133--;
                this.field862[var2] = new class87();
                this.field862[var2].method542(arg0);
            }
        }
        this.field863 = arg0.method739(-126);
        this.field864 = arg0.method739(60);
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    private class51() {
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "()[B")
    private final byte[] method351() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field862[var2] != null && this.field862[var2].field1516 + this.field862[var2].field1513 > var1) {
                var1 = this.field862[var2].field1516 + this.field862[var2].field1513;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field862[var5] != null) {
                int var6 = this.field862[var5].field1513 * 22050 / 1000;
                int var7 = this.field862[var5].field1516 * 22050 / 1000;
                int[] var8 = this.field862[var5].method544(var6, this.field862[var5].field1513);
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
