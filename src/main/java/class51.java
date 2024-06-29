import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class51 extends class47 {

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "Z")
    public boolean field1229 = false;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public int field1223;

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "Z")
    public boolean field1230;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "[I")
    private int[] field1233;

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "[I")
    private int[] field1232;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "[I")
    private int[] field1226;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "[I")
    private int[] field1224;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
    private int field1231;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "[I")
    public int[] field1225;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "[I")
    private static int[] field1227;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(DILpc;)Z")
    public final boolean method425(double arg0, int arg1, class105 arg2) {
        for (int var5 = 0; var5 < this.field1233.length; var5++) {
            if (arg2.method891(1527, this.field1233[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1225 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field1233.length; var7++) {
            class24 var10 = class122.method1012(this.field1233[var7], arg2, 32767);
            var10.method214();
            byte[] var11 = var10.field566;
            int[] var12 = var10.field565;
            int var13 = this.field1224[var7];
            if ((var13 & 0xFF000000) == 50331648) {
                int var14 = var13 & 0xFF00FF;
                int var15 = var13 >> 8 & 0xFF;
                for (int var16 = 0; var16 < var12.length; var16++) {
                    int var17 = var12[var16];
                    if (var17 >> 8 == (var17 & 0xFFFF)) {
                        int var18 = var17 & 0xFF;
                        var12[var16] = var14 * var18 >> 8 & 0xFF00FF | var15 * var18 & 0xFF00;
                    }
                }
            }
            for (int var19 = 0; var19 < var12.length; var19++) {
                var12[var19] = class40.method340(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1232[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field569 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1225[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field569 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1225[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field569 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1225[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field1225[var8] &= 0xF8F8FF;
            int var9 = this.field1225[var8];
            this.field1225[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field1225[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field1225[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "()V")
    public final void method426() {
        this.field1225 = null;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
    public final void method427(int arg0) {
        if (this.field1225 == null) {
            return;
        }
        if (this.field1228 == 1 || this.field1228 == 3) {
            if (field1227 == null || field1227.length < this.field1225.length) {
                field1227 = new int[this.field1225.length];
            }
            short var2;
            if (this.field1225.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1225.length / 4;
            int var4 = arg0 * var2 * this.field1231;
            int var5 = var3 - 1;
            if (this.field1228 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field1227[var6] = this.field1225[var17];
                field1227[var3 + var6] = this.field1225[var3 + var17];
                field1227[var3 + var6 + var3] = this.field1225[var3 + var17 + var3];
                field1227[var3 + var6 + var3 + var3] = this.field1225[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field1225;
            this.field1225 = field1227;
            field1227 = var7;
        }
        if (this.field1228 != 2 && this.field1228 != 4) {
            return;
        }
        if (field1227 == null || field1227.length < this.field1225.length) {
            field1227 = new int[this.field1225.length];
        }
        short var8;
        if (this.field1225.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field1225.length / 4;
        int var10 = this.field1231 * arg0;
        int var11 = var8 - 1;
        if (this.field1228 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field1227[var15] = this.field1225[var16];
                field1227[var9 + var15] = this.field1225[var9 + var16];
                field1227[var9 + var15 + var9] = this.field1225[var9 + var16 + var9];
                field1227[var9 + var15 + var9 + var9] = this.field1225[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field1225;
        this.field1225 = field1227;
        field1227 = var13;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "()V")
    public static void method428() {
        field1227 = null;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lib;)V")
    public class51(class57 arg0) {
        this.field1223 = arg0.method506(-1);
        this.field1230 = arg0.method510(-128) == 1;
        int var2 = arg0.method510(-111);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1233 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1233[var3] = arg0.method506(-1);
        }
        if (var2 > 1) {
            this.field1232 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1232[var4] = arg0.method510(-110);
            }
        }
        if (var2 > 1) {
            this.field1226 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1226[var5] = arg0.method510(-121);
            }
        }
        this.field1224 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1224[var6] = arg0.method495(16711680);
        }
        this.field1228 = arg0.method510(-114);
        this.field1231 = arg0.method510(-123);
        this.field1225 = null;
    }
}
