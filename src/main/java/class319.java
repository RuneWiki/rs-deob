import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class319 {

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "[Lpt;")
    private class491[] field4210 = new class491[10];

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
    private int field4211;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    private int field4212;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "()[B", line = 7)
    private final byte[] method1857() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4210[var2] != null && this.field4210[var2].field6874 + this.field4210[var2].field6853 > var1) {
                var1 = this.field4210[var2].field6874 + this.field4210[var2].field6853;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field4210[var5] != null) {
                int var6 = this.field4210[var5].field6853 * 22050 / 1000;
                int var7 = this.field4210[var5].field6874 * 22050 / 1000;
                int[] var8 = this.field4210[var5].method2863(var6, this.field4210[var5].field6853);
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

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljn;II)Ltu;", line = 66)
    public static final class319 method1858(class668 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3800(arg2, arg1, (byte) -92);
        return var3 == null ? null : new class319(new class389(var3));
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lun;)V", line = 129)
    private class319(class389 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2229(255);
            if (var3 != 0) {
                arg0.field5195--;
                this.field4210[var2] = new class491();
                this.field4210[var2].method2862(arg0);
            }
        }
        this.field4211 = arg0.method2260(-39);
        this.field4212 = arg0.method2260(-104);
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V", line = 149)
    private class319() {
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "()I", line = 79)
    public final int method1859() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4210[var2] != null && this.field4210[var2].field6874 / 20 < var1) {
                var1 = this.field4210[var2].field6874 / 20;
            }
        }
        if (this.field4211 < this.field4212 && this.field4211 / 20 < var1) {
            var1 = this.field4211 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field4210[var3] != null) {
                this.field4210[var3].field6874 -= var1 * 20;
            }
        }
        if (this.field4211 < this.field4212) {
            this.field4211 -= var1 * 20;
            this.field4212 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "()Lep;", line = 124)
    public final class387 method1860() {
        byte[] var1 = this.method1857();
        return new class387(22050, var1, this.field4211 * 22050 / 1000, this.field4212 * 22050 / 1000);
    }
}
