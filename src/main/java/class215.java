import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class215 {

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "[Lgg;")
    private class192[] field3925 = new class192[10];

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    private int field3926;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    private int field3924;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()I")
    public final int method1514() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3925[var2] != null && this.field3925[var2].field3510 / 20 < var1) {
                var1 = this.field3925[var2].field3510 / 20;
            }
        }
        if (this.field3926 < this.field3924 && this.field3926 / 20 < var1) {
            var1 = this.field3926 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3925[var3] != null) {
                this.field3925[var3].field3510 -= var1 * 20;
            }
        }
        if (this.field3926 < this.field3924) {
            this.field3926 -= var1 * 20;
            this.field3924 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lhg;II)Lef;")
    public static final class215 method1515(class177 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1271(arg1, -2154, arg2);
        return var3 == null ? null : new class215(new class280(var3));
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "()[B")
    private final byte[] method1516() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3925[var2] != null && this.field3925[var2].field3510 + this.field3925[var2].field3498 > var1) {
                var1 = this.field3925[var2].field3510 + this.field3925[var2].field3498;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3925[var5] != null) {
                int var6 = this.field3925[var5].field3498 * 22050 / 1000;
                int var7 = this.field3925[var5].field3510 * 22050 / 1000;
                int[] var8 = this.field3925[var5].method1377(var6, this.field3925[var5].field3498);
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

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "()Lcl;")
    public final class194 method1517() {
        byte[] var1 = this.method1516();
        return new class194(22050, var1, this.field3926 * 22050 / 1000, this.field3924 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lee;)V")
    private class215(class280 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1907(16832);
            if (var3 != 0) {
                arg0.field5027--;
                this.field3925[var2] = new class192();
                this.field3925[var2].method1380(arg0);
            }
        }
        this.field3926 = arg0.method1891(-116);
        this.field3924 = arg0.method1891(-114);
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    private class215() {
    }
}
