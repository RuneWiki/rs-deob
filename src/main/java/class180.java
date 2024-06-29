import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class180 {

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
    public int field2709;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field2700 = null;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field2703 = 0;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public int field2691;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public int field2696;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public int field2699;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "Ldj;")
    public class328 field2704;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "[I")
    public int[] field2692;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "[I")
    public int[] field2693;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "[I")
    public int[] field2702;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "[I")
    public int[] field2706;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "[I")
    public static int[] field2710;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "[I")
    public int[] field2711;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "[I")
    public int[] field2712;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "[Lsd;")
    public static class27[] field2708;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "[Ldj;")
    public class328[] field2698;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "[[I")
    public int[][] field2694;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "[[I")
    public int[][] field2697;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "[[[Lp;")
    public static class99[][][] field2695;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 7)
    public static void method1304(int arg0) {
        field2700 = null;
        field2708 = null;
        field2695 = (class99[][][]) null;
        field2710 = null;
        if (arg0 < 25) {
            method1304(14);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B[B)V", line = 34)
    private final void method1305(byte arg0, byte[] arg1) {
        field2707++;
        class35 var3 = new class35(class321.method2195(arg1, arg0 + 6345));
        int var4 = var3.method273(65280);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field2696 = var3.method299(-97);
        } else {
            this.field2696 = 0;
        }
        int var5 = 0;
        int var6 = var3.method273(65280);
        int var7 = -1;
        if (arg0 != -97) {
            return;
        }
        this.field2691 = var3.method300(arg0 ^ 0x5319AD6F);
        this.field2693 = new int[this.field2691];
        for (int var8 = 0; var8 < this.field2691; var8++) {
            this.field2693[var8] = var5 += var3.method300(class203.method1462(arg0, 1394191727));
            if (var7 < this.field2693[var8]) {
                var7 = this.field2693[var8];
            }
        }
        this.field2699 = var7 + 1;
        this.field2694 = new int[this.field2699][];
        this.field2711 = new int[this.field2699];
        this.field2692 = new int[this.field2699];
        this.field2706 = new int[this.field2699];
        this.field2712 = new int[this.field2699];
        if (var6 != 0) {
            this.field2702 = new int[this.field2699];
            for (int var9 = 0; var9 < this.field2699; var9++) {
                this.field2702[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field2691; var10++) {
                this.field2702[this.field2693[var10]] = var3.method299(-80);
            }
            this.field2704 = new class328(this.field2702);
        }
        for (int var11 = 0; var11 < this.field2691; var11++) {
            this.field2706[this.field2693[var11]] = var3.method299(-70);
        }
        for (int var12 = 0; var12 < this.field2691; var12++) {
            this.field2692[this.field2693[var12]] = var3.method299(arg0 - 3);
        }
        for (int var13 = 0; var13 < this.field2691; var13++) {
            this.field2712[this.field2693[var13]] = var3.method300(class203.method1462(arg0, 1394191727));
        }
        for (int var14 = 0; var14 < this.field2691; var14++) {
            int var15 = 0;
            int var16 = this.field2693[var14];
            int var17 = -1;
            int var18 = this.field2712[var16];
            this.field2694[var16] = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                int var20 = this.field2694[var16][var19] = var15 += var3.method300(-1394191632);
                if (var17 < var20) {
                    var17 = var20;
                }
            }
            this.field2711[var16] = var17 + 1;
            if ((var17 + 1) == var18) {
                this.field2694[var16] = null;
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2698 = new class328[var7 + 1];
        this.field2697 = new int[var7 + 1][];
        for (int var21 = 0; var21 < this.field2691; var21++) {
            int var22 = this.field2693[var21];
            int var23 = this.field2712[var22];
            this.field2697[var22] = new int[this.field2711[var22]];
            for (int var24 = 0; var24 < this.field2711[var22]; var24++) {
                this.field2697[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field2694[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field2694[var22][var25];
                }
                this.field2697[var22][var26] = var3.method299(-114);
            }
            this.field2698[var22] = new class328(this.field2697[var22]);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIII)I", line = 219)
    public static final int method1306(int arg0, int arg1, int arg2, int arg3) {
        field2705++;
        int var4 = arg3 / arg1;
        int var5 = arg3 & arg1 - 1;
        int var6 = arg0 & arg1 - 1;
        if (arg2 != -1237) {
            field2695 = (class99[][][]) ((class99[][][]) null);
        }
        int var7 = arg0 / arg1;
        int var8 = class191.method1391((byte) 38, var7, var4);
        int var9 = class191.method1391((byte) 38, var7, var4 + 1);
        int var10 = class191.method1391((byte) 38, var7 + 1, var4);
        int var11 = class191.method1391((byte) 38, var7 + 1, var4 + 1);
        int var12 = class117.method912(36, arg1, var9, var5, var8);
        int var13 = class117.method912(-82, arg1, var11, var5, var10);
        return class117.method912(-110, arg1, var13, var6, var12);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)Lum;", line = 254)
    public static final class144 method1307(int arg0, int arg1) {
        field2690++;
        class144 var2 = (class144) class87.field1278.method816((long) arg0, (byte) 73);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class196.field3113.method1507(arg0, (byte) 88, 11);
        class144 var4 = new class144();
        if (var3 != null) {
            var4.method1081(new class35(var3), 0);
        }
        class87.field1278.method817(var4, (long) arg0, (byte) -121);
        return arg1 >= -96 ? (class144) null : var4;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "([BI)V", line = 291)
    public class180(byte[] arg0, int arg1) {
        this.field2709 = class16.method123(arg0.length, true, arg0);
        if (this.field2709 != arg1) {
            throw new RuntimeException();
        }
        this.method1305((byte) -97, arg0);
    }
}
