import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class13 extends class16 {

    @OriginalMember(owner = "client!be", name = "H", descriptor = "Z")
    public boolean field235 = false;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "I")
    public int field237;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "Z")
    public boolean field238;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "[I")
    private int[] field232;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "[I")
    private int[] field229;

    @OriginalMember(owner = "client!be", name = "I", descriptor = "[I")
    private int[] field236;

    @OriginalMember(owner = "client!be", name = "F", descriptor = "[I")
    private int[] field233;

    @OriginalMember(owner = "client!be", name = "L", descriptor = "I")
    public int field239;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "[I")
    public int[] field234;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "[I")
    private static int[] field230;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(DILfd;)Z")
    public final boolean method93(double arg0, int arg1, class40 arg2) {
        for (int var5 = 0; var5 < this.field232.length; var5++) {
            if (arg2.method264(1, this.field232[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field234 = new int[var6];
        for (int var7 = 0; var7 < this.field232.length; var7++) {
            class73 var8 = class25.method169((byte) -104, this.field232[var7], arg2);
            var8.method530();
            byte[] var9 = var8.field1591;
            int[] var10 = var8.field1595;
            int var11 = this.field233[var7];
            if ((var11 & 0xFF000000) == 50331648) {
                int var12 = var11 & 0xFF00FF;
                int var13 = var11 >> 8 & 0xFF;
                for (int var14 = 0; var14 < var10.length; var14++) {
                    int var15 = var10[var14];
                    if (var15 >> 8 == (var15 & 0xFFFF)) {
                        int var16 = var15 & 0xFF;
                        var10[var14] = var12 * var16 >> 8 & 0xFF00FF | var13 * var16 & 0xFF00;
                    }
                }
            }
            for (int var17 = 0; var17 < var10.length; var17++) {
                var10[var17] = class96.method738(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field229[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field1592 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field234[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field1592 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field234[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field1592 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field234[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
    public final void method94(int arg0) {
        if (this.field234 == null) {
            return;
        }
        if (this.field239 == 1 || this.field239 == 3) {
            if (field230 == null || field230.length < this.field234.length) {
                field230 = new int[this.field234.length];
            }
            short var2;
            if (this.field234.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field234.length;
            int var4 = arg0 * var2 * this.field231;
            int var5 = var3 - 1;
            if (this.field239 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field230[var6] = this.field234[var17];
            }
            int[] var7 = this.field234;
            this.field234 = field230;
            field230 = var7;
        }
        if (this.field239 != 2 && this.field239 != 4) {
            return;
        }
        if (field230 == null || field230.length < this.field234.length) {
            field230 = new int[this.field234.length];
        }
        short var8;
        if (this.field234.length == 4096) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field234.length;
        int var10 = this.field231 * arg0;
        int var11 = var8 - 1;
        if (this.field239 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field230[var15] = this.field234[var16];
            }
        }
        int[] var13 = this.field234;
        this.field234 = field230;
        field230 = var13;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()V")
    public static void method95() {
        field230 = null;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "()V")
    public final void method96() {
        this.field234 = null;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lna;)V")
    public class13(class91 arg0) {
        this.field237 = arg0.method641(255);
        this.field238 = arg0.method649(false) == 1;
        int var2 = arg0.method649(false);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field232 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field232[var3] = arg0.method641(255);
        }
        if (var2 > 1) {
            this.field229 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field229[var4] = arg0.method649(false);
            }
        }
        if (var2 > 1) {
            this.field236 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field236[var5] = arg0.method649(false);
            }
        }
        this.field233 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field233[var6] = arg0.method631(-68);
        }
        this.field239 = arg0.method649(false);
        this.field231 = arg0.method649(false);
        this.field234 = null;
    }
}
