import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class60 extends class279 {

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "I")
    private int field940 = 4096;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "[I")
    private int[] field939 = new int[3];

    @OriginalMember(owner = "client!ig", name = "P", descriptor = "I")
    private int field943 = 409;

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
    private int field942 = 4096;

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "I")
    private int field949 = 4096;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "I")
    public static int field936 = 0;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "[I")
    public static int[] field938 = new int[2];

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "[I")
    public static int[] field935 = new int[2000];

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "Ltl;")
    public static class59 field944 = class85.method639("showVideoAd", 9588);

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "[S")
    public static short[] field947 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "Leh;")
    public static class94 field934 = new class94(16);

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!ig", name = "N", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "Lme;")
    public static class295 field948;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(II)I", line = 21)
    public static final int method504(int arg0, int arg1) {
        if (arg1 > -49) {
            field934 = (class94) null;
        }
        field941++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V", line = 133)
    public class60() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILs;)V", line = 58)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg1 == 0) {
            this.field943 = arg2.method1214(-18254);
        } else if (arg1 == 1) {
            this.field940 = arg2.method1214(-18254);
        } else if (arg1 == 2) {
            this.field949 = arg2.method1214(-18254);
        } else if (arg1 == 3) {
            this.field942 = arg2.method1214(-18254);
        } else if (arg1 == 4) {
            int var5 = arg2.method1208((byte) -117);
            this.field939[0] = class93.method680(267386880, var5 << 4);
            this.field939[1] = class93.method680(var5, 65280) >> 4;
            this.field939[2] = class93.method680(var5, 255) >> 12;
        }
        if (arg0 >= -125) {
            field938 = (int[]) null;
        }
        field946++;
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)V", line = 111)
    public static void method505(int arg0) {
        field947 = null;
        field944 = null;
        field938 = null;
        field935 = null;
        int var1 = -46 % ((-arg0 - 13) / 41);
        field948 = null;
        field934 = null;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(II)[[I", line = 141)
    public final int[][] method87(int arg0, int arg1) {
        if (arg0 != -7523) {
            this.method87(-25, 7);
        }
        field937++;
        int[][] var3 = this.field4786.method1427(0, arg1);
        if (this.field4786.field3297) {
            int[][] var4 = this.method1956(0, arg1, (byte) -112);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class56.field835; var11++) {
                int var12 = var6[var11];
                int var13 = var12 - this.field939[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field943) {
                    var8[var11] = var12;
                    var10[var11] = var5[var11];
                    var9[var11] = var7[var11];
                } else {
                    int var14 = var5[var11];
                    int var15 = var14 - this.field939[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 <= this.field943) {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field939[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field943 >= var17) {
                            var8[var11] = this.field942 * var12 >> 12;
                            var10[var11] = this.field949 * var14 >> 12;
                            var9[var11] = this.field940 * var16 >> 12;
                        } else {
                            var8[var11] = var12;
                            var10[var11] = var14;
                            var9[var11] = var16;
                        }
                    } else {
                        var8[var11] = var12;
                        var10[var11] = var14;
                        var9[var11] = var7[var11];
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILch;)I", line = 242)
    public static final int method506(int arg0, class102 arg1) {
        field950++;
        int var2 = arg1.field1681;
        if (arg1.field1767 == arg1.field1720) {
            var2 = arg1.field1655;
        } else if (arg1.field1788 == arg1.field1767) {
            var2 = arg1.field1695;
        }
        if (arg0 != 24642) {
            method506(-125, (class102) null);
        }
        return var2;
    }
}
