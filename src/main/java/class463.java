import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class463 extends class512 {

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "I")
    private int field6883 = 1;

    @OriginalMember(owner = "client!tj", name = "S", descriptor = "I")
    private int field6888 = 1;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    public static int field6880 = 0;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "[I")
    public static int[] field6877 = new int[256];

    @OriginalMember(owner = "client!tj", name = "R", descriptor = "[I")
    public static int[] field6887 = new int[1000];

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "[[I")
    public static int[][] field6885 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
    public static int field6878;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "Lug;")
    public static class322 field6884;

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "Lst;")
    public static class473 field6886;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "(I)V", line = 3)
    public static void method2760(int arg0) {
        field6887 = null;
        field6886 = null;
        if (arg0 != 31777) {
            method2760(-96);
        }
        field6877 = null;
        field6884 = null;
        field6885 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)[I", line = 19)
    public final int[] method75(int arg0, byte arg1) {
        ++field6882;
        int var3 = 123 % ((43 - arg1) / 48);
        int[] var4 = super.field7494.method232(arg0, true);
        if (super.field7494.field474) {
            int var5 = this.field6888 + 1 + this.field6888;
            int var6 = 65536 / var5;
            int var7 = this.field6883 + 1 + this.field6883;
            int var8 = 65536 / var7;
            int[][] var9 = new int[var5][];
            for (int var10 = arg0 - this.field6888; this.field6888 + arg0 >= var10; ++var10) {
                int[] var14 = this.method3013(false, 0, var10 & class270.field4492);
                int[] var15 = new int[class402.field6113];
                int var16 = 0;
                for (int var17 = -this.field6883; ~var17 >= ~this.field6883; ++var17) {
                    var16 += var14[var17 & class269.field4478];
                }
                int var18 = 0;
                while (~var18 > ~class402.field6113) {
                    var15[var18] = var8 * var16 >> 16;
                    int var19 = var16 - var14[class269.field4478 & -this.field6883 + var18];
                    ++var18;
                    var16 = var14[class269.field4478 & var18 - -this.field6883] + var19;
                }
                var9[-arg0 + var10 + this.field6888] = var15;
            }
            for (int var11 = 0; ~var11 > ~class402.field6113; ++var11) {
                int var12 = 0;
                for (int var13 = 0; var5 > var13; ++var13) {
                    var12 += var9[var13][var11];
                }
                var4[var11] = var6 * var12 >> 16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V", line = 105)
    public class463() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)[[I", line = 109)
    public final int[][] method278(int arg0, int arg1) {
        ++field6881;
        int[][] var3 = super.field7496.method2777(arg1, 0);
        int var4 = -19 % ((-40 - arg0) / 47);
        if (super.field7496.field6942) {
            int var5 = this.field6888 - -this.field6888 + 1;
            int var6 = 65536 / var5;
            int var7 = this.field6883 + this.field6883 + 1;
            int var8 = 65536 / var7;
            int[][][] var9 = new int[var5][][];
            for (int var10 = -this.field6888 + arg1; var10 <= arg1 - -this.field6888; ++var10) {
                int[][] var20 = this.method3012(var10 & class270.field4492, 102, 0);
                int[][] var21 = new int[3][class402.field6113];
                int var22 = 0;
                int var23 = 0;
                int var24 = 0;
                int[] var25 = var20[0];
                int[] var26 = var20[1];
                int[] var27 = var20[2];
                for (int var28 = -this.field6883; ~this.field6883 <= ~var28; ++var28) {
                    int var38 = var28 & class269.field4478;
                    var23 += var26[var38];
                    var24 += var27[var38];
                    var22 += var25[var38];
                }
                int[] var29 = var21[0];
                int[] var30 = var21[1];
                int[] var31 = var21[2];
                int var32 = 0;
                while (var32 < class402.field6113) {
                    var29[var32] = var8 * var22 >> 16;
                    var30[var32] = var8 * var23 >> 16;
                    var31[var32] = var8 * var24 >> 16;
                    int var33 = class269.field4478 & var32 - this.field6883;
                    int var34 = var23 - var26[var33];
                    ++var32;
                    int var35 = var24 - var27[var33];
                    int var36 = var22 - var25[var33];
                    int var37 = var32 - -this.field6883 & class269.field4478;
                    var24 = var27[var37] + var35;
                    var23 = var26[var37] + var34;
                    var22 = var25[var37] + var36;
                }
                var9[-arg1 + var10 - -this.field6888] = var21;
            }
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class402.field6113; ++var14) {
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                for (int var18 = 0; var18 < var5; ++var18) {
                    int[][] var19 = var9[var18];
                    var16 += var19[1][var14];
                    var15 += var19[0][var14];
                    var17 += var19[2][var14];
                }
                var11[var14] = var6 * var15 >> 16;
                var12[var14] = var6 * var16 >> 16;
                var13[var14] = var6 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILjava/lang/String;Z)Z", line = 242)
    public static final boolean method2761(int arg0, String arg1, boolean arg2) {
        ++field6878;
        if (~class493.field7198 != -4) {
            class244.field4183 = new class487();
            class244.field4183.field7133 = arg1;
            class244.field4183.field7139 = arg0;
            if (class255.field4320 != class180.field2857) {
                class244.field4183.field7137 = class244.field4183.field7139 + 40000;
                class244.field4183.field7136 = class244.field4183.field7139 + 50000;
            }
            return true;
        } else {
            String var3 = "";
            if (arg2) {
                return false;
            } else {
                if (class255.field4320 != class180.field2857) {
                    var3 = ":" + (arg0 + 7000);
                }
                String var4 = "";
                if (class60.field917 != null) {
                    var4 = "/p=" + class60.field917;
                }
                String var5 = "http://" + arg1 + var3 + "/l=" + class300.field4813 + "/a=" + class57.field899 + var4 + "/j" + (class193.field3011 ? "1" : "0") + ",o" + (!class128.field2196 ? "0" : "1") + ",a2";
                try {
                    class326.field5138.getAppletContext().showDocument(new URL(var5), "_self");
                    return true;
                } catch (Exception var6) {
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZILia;)V", line = 294)
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field7491 = arg2.method126((byte) -100) == 1;
                }
            } else {
                this.field6888 = arg2.method126((byte) -84);
            }
        } else {
            this.field6883 = arg2.method126((byte) -93);
        }
        if (!arg0) {
            this.method278(-61, 87);
        }
        ++field6879;
    }
}
