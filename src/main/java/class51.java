import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class51 extends class73 {

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "Z")
    public boolean field1443 = false;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
    public int field1442;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "Z")
    public boolean field1441;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "[I")
    private int[] field1440;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "[I")
    private int[] field1437;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "[I")
    private int[] field1444;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "[I")
    private int[] field1445;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "I")
    public int field1447;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "I")
    private int field1439;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "[I")
    public int[] field1446;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "[I")
    private static int[] field1438;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V")
    public final void method557(int arg0) {
        if (this.field1446 == null) {
            return;
        }
        if (this.field1447 == 1 || this.field1447 == 3) {
            if (field1438 == null || field1438.length < this.field1446.length) {
                field1438 = new int[this.field1446.length];
            }
            short var2;
            if (this.field1446.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1446.length / 4;
            int var4 = arg0 * var2 * this.field1439;
            int var5 = var3 - 1;
            if (this.field1447 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field1438[var6] = this.field1446[var17];
                field1438[var3 + var6] = this.field1446[var3 + var17];
                field1438[var3 + var6 + var3] = this.field1446[var3 + var17 + var3];
                field1438[var3 + var6 + var3 + var3] = this.field1446[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field1446;
            this.field1446 = field1438;
            field1438 = var7;
        }
        if (this.field1447 != 2 && this.field1447 != 4) {
            return;
        }
        if (field1438 == null || field1438.length < this.field1446.length) {
            field1438 = new int[this.field1446.length];
        }
        short var8;
        if (this.field1446.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field1446.length / 4;
        int var10 = this.field1439 * arg0;
        int var11 = var8 - 1;
        if (this.field1447 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field1438[var15] = this.field1446[var16];
                field1438[var9 + var15] = this.field1446[var9 + var16];
                field1438[var9 + var15 + var9] = this.field1446[var9 + var16 + var9];
                field1438[var9 + var15 + var9 + var9] = this.field1446[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field1446;
        this.field1446 = field1438;
        field1438 = var13;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(DILge;)Z")
    public final boolean method558(double arg0, int arg1, class47 arg2) {
        for (int var5 = 0; var5 < this.field1440.length; var5++) {
            if (arg2.method527(true, this.field1440[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1446 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field1440.length; var7++) {
            class114 var10 = class132.method1084(true, this.field1440[var7], arg2);
            var10.method924();
            byte[] var11 = var10.field2797;
            int[] var12 = var10.field2796;
            int var13 = this.field1445[var7];
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
                var12[var19] = class129.method1061(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1437[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field2800 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1446[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field2800 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1446[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field2800 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1446[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field1446[var8] &= 0xF8F8FF;
            int var9 = this.field1446[var8];
            this.field1446[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field1446[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field1446[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "()V")
    public static void method559() {
        field1438 = null;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "()V")
    public final void method560() {
        this.field1446 = null;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lbf;)V")
    public class51(class14 arg0) {
        this.field1442 = arg0.method138((byte) 92);
        this.field1441 = arg0.method153(true) == 1;
        int var2 = arg0.method153(true);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1440 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1440[var3] = arg0.method138((byte) 86);
        }
        if (var2 > 1) {
            this.field1437 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1437[var4] = arg0.method153(true);
            }
        }
        if (var2 > 1) {
            this.field1444 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1444[var5] = arg0.method153(true);
            }
        }
        this.field1445 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1445[var6] = arg0.method121((byte) 59);
        }
        this.field1447 = arg0.method153(true);
        this.field1439 = arg0.method153(true);
        this.field1446 = null;
    }
}
