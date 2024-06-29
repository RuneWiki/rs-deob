import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class51 extends class145 {

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "Z")
    public boolean field1293 = false;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public int field1283;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "Z")
    public boolean field1291;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "[I")
    private int[] field1289;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "[I")
    private int[] field1284;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "[I")
    private int[] field1287;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "[I")
    private int[] field1286;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
    public int field1290;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
    private int field1288;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "[I")
    public int[] field1292;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "[I")
    private static int[] field1285;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "()V", line = 6)
    public final void method553() {
        this.field1292 = null;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "()V", line = 12)
    public static void method554() {
        field1285 = null;
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V", line = 20)
    public final void method555(int arg0) {
        if (this.field1292 == null) {
            return;
        }
        if (this.field1290 == 1 || this.field1290 == 3) {
            if (field1285 == null || field1285.length < this.field1292.length) {
                field1285 = new int[this.field1292.length];
            }
            short var2;
            if (this.field1292.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1292.length / 4;
            int var4 = arg0 * var2 * this.field1288;
            int var5 = var3 - 1;
            if (this.field1290 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field1285[var6] = this.field1292[var17];
                field1285[var3 + var6] = this.field1292[var3 + var17];
                field1285[var3 + var6 + var3] = this.field1292[var3 + var17 + var3];
                field1285[var3 + var6 + var3 + var3] = this.field1292[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field1292;
            this.field1292 = field1285;
            field1285 = var7;
        }
        if (this.field1290 != 2 && this.field1290 != 4) {
            return;
        }
        if (field1285 == null || field1285.length < this.field1292.length) {
            field1285 = new int[this.field1292.length];
        }
        short var8;
        if (this.field1292.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field1292.length / 4;
        int var10 = this.field1288 * arg0;
        int var11 = var8 - 1;
        if (this.field1290 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field1285[var15] = this.field1292[var16];
                field1285[var9 + var15] = this.field1292[var9 + var16];
                field1285[var9 + var15 + var9] = this.field1292[var9 + var16 + var9];
                field1285[var9 + var15 + var9 + var9] = this.field1292[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field1292;
        this.field1292 = field1285;
        field1285 = var13;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(DILoc;)Z", line = 121)
    public final boolean method556(double arg0, int arg1, class100 arg2) {
        for (int var5 = 0; var5 < this.field1289.length; var5++) {
            if (arg2.method854(-1, this.field1289[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1292 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field1289.length; var7++) {
            class141 var10 = class77.method675(0, this.field1289[var7], arg2);
            var10.method1153();
            byte[] var11 = var10.field3544;
            int[] var12 = var10.field3549;
            int var13 = this.field1286[var7];
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
                var12[var19] = class40.method480(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1284[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field3543 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1292[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field3543 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1292[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field3543 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1292[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field1292[var8] &= 0xF8F8FF;
            int var9 = this.field1292[var8];
            this.field1292[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field1292[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field1292[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Ldc;)V", line = 300)
    public class51(class25 arg0) {
        this.field1283 = arg0.method301(-4853);
        this.field1291 = arg0.method322((byte) -50) == 1;
        int var2 = arg0.method322((byte) -50);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1289 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1289[var3] = arg0.method301(-4853);
        }
        if (var2 > 1) {
            this.field1284 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1284[var4] = arg0.method322((byte) -50);
            }
        }
        if (var2 > 1) {
            this.field1287 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1287[var5] = arg0.method322((byte) -50);
            }
        }
        this.field1286 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1286[var6] = arg0.method313((byte) -89);
        }
        this.field1290 = arg0.method322((byte) -50);
        this.field1288 = arg0.method322((byte) -50);
        this.field1292 = null;
    }
}
