import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class264 {

    @OriginalMember(owner = "client!je", name = "b", descriptor = "[Lqh;")
    private class47[] field3752 = new class47[10];

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    private int field3751;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    private int field3753;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "()Lhh;")
    public final class80 method1626() {
        byte[] var1 = this.method1628();
        return new class80(22050, var1, this.field3751 * 22050 / 1000, this.field3753 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "()I")
    public final int method1627() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3752[var2] != null && this.field3752[var2].field718 / 20 < var1) {
                var1 = this.field3752[var2].field718 / 20;
            }
        }
        if (this.field3751 < this.field3753 && this.field3751 / 20 < var1) {
            var1 = this.field3751 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3752[var3] != null) {
                this.field3752[var3].field718 -= var1 * 20;
            }
        }
        if (this.field3751 < this.field3753) {
            this.field3751 -= var1 * 20;
            this.field3753 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "()[B")
    private final byte[] method1628() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3752[var2] != null && this.field3752[var2].field718 + this.field3752[var2].field705 > var1) {
                var1 = this.field3752[var2].field718 + this.field3752[var2].field705;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3752[var5] != null) {
                int var6 = this.field3752[var5].field705 * 22050 / 1000;
                int var7 = this.field3752[var5].field718 * 22050 / 1000;
                int[] var8 = this.field3752[var5].method357(var6, this.field3752[var5].field705);
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

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lae;)V")
    private class264(class156 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method941((byte) 126);
            if (var3 != 0) {
                arg0.field2018--;
                this.field3752[var2] = new class47();
                this.field3752[var2].method356(arg0);
            }
        }
        this.field3751 = arg0.method993((byte) -98);
        this.field3753 = arg0.method993((byte) -122);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lhe;II)Lje;")
    public static final class264 method1629(class239 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1470(4, arg2, arg1);
        return var3 == null ? null : new class264(new class156(var3));
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
    private class264() {
    }
}
