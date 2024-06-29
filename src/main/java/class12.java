import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class12 extends class56 {

    @OriginalMember(owner = "client!daa", name = "I", descriptor = "I")
    private int field212 = 1;

    @OriginalMember(owner = "client!daa", name = "F", descriptor = "I")
    private int field209 = 1;

    @OriginalMember(owner = "client!daa", name = "O", descriptor = "Lhj;")
    public static class596 field217 = new class596(72, 6);

    @OriginalMember(owner = "client!daa", name = "E", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!daa", name = "G", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!daa", name = "K", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!daa", name = "L", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!daa", name = "M", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!daa", name = "N", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!daa", name = "D", descriptor = "Lga;")
    public static class423 field207;

    @OriginalMember(owner = "client!daa", name = "H", descriptor = "[I")
    public static int[] field211;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Ljava/lang/String;")
    public static final String method185(String arg0, String arg1, byte arg2, String arg3) {
        if (arg2 >= -112) {
            method185((String) null, (String) null, (byte) -101, (String) null);
        }
        ++field214;
        for (int var4 = arg3.indexOf(arg0); var4 != -1; var4 = arg3.indexOf(arg0, arg1.length() + var4)) {
            arg3 = arg3.substring(0, var4) + arg1 + arg3.substring(arg0.length() + var4);
        }
        return arg3;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)[I")
    public final int[] method145(int arg0, int arg1) {
        ++field215;
        int[] var3 = super.field752.method1308(false, arg1);
        if (super.field752.field2441) {
            int var4 = this.field209 + 1 + this.field209;
            int var5 = 65536 / var4;
            int var6 = this.field212 + 1 + this.field212;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field209 + arg1; ~(arg1 - -this.field209) <= ~var9; ++var9) {
                int[] var13 = this.method492(0, var9 & class75.field1037, (byte) 52);
                int[] var14 = new int[class642.field8759];
                int var15 = 0;
                for (int var16 = -this.field212; ~this.field212 <= ~var16; ++var16) {
                    var15 += var13[class446.field5990 & var16];
                }
                int var17 = 0;
                while (var17 < class642.field8759) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[var17 - this.field212 & class446.field5990];
                    ++var17;
                    var15 = var13[class446.field5990 & this.field212 + var17] + var18;
                }
                var8[var9 - arg1 + this.field209] = var14;
            }
            for (int var10 = 0; class642.field8759 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        if (arg0 != 0) {
            this.method187((byte) 125, -13);
        }
        return var3;
    }

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "(III)I")
    public static final int method186(int arg0, int arg1, int arg2) {
        ++field213;
        double var3 = Math.log((double) arg0) / Math.log(2.0D);
        if (arg1 >= -93) {
            method189(-93, 37, 88);
        }
        double var5 = Math.log((double) arg2) / Math.log(2.0D);
        double var7 = Math.random() * (-var5 + var3) + var5;
        return (int) (Math.pow(2.0D, var7) + 0.5D);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(BI)[[I")
    public final int[][] method187(byte arg0, int arg1) {
        if (arg0 <= 35) {
            return null;
        } else {
            ++field210;
            int[][] var3 = super.field759.method220(arg1, (byte) -91);
            if (super.field759.field341) {
                int var4 = this.field209 + 1 + this.field209;
                int var5 = 65536 / var4;
                int var6 = this.field212 - -this.field212 + 1;
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var4][][];
                for (int var9 = -this.field209 + arg1; ~(this.field209 + arg1) <= ~var9; ++var9) {
                    int[][] var19 = this.method495(93, var9 & class75.field1037, 0);
                    int[][] var20 = new int[3][class642.field8759];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[1];
                    int[] var26 = var19[2];
                    for (int var27 = -this.field212; ~var27 >= ~this.field212; ++var27) {
                        int var37 = class446.field5990 & var27;
                        var21 += var24[var37];
                        var23 += var26[var37];
                        var22 += var25[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (~var31 > ~class642.field8759) {
                        var28[var31] = var7 * var21 >> 16;
                        var29[var31] = var7 * var22 >> 16;
                        var30[var31] = var7 * var23 >> 16;
                        int var32 = class446.field5990 & var31 - this.field212;
                        int var33 = var21 - var24[var32];
                        ++var31;
                        int var34 = var22 - var25[var32];
                        int var35 = var23 - var26[var32];
                        int var36 = class446.field5990 & this.field212 + var31;
                        var21 = var24[var36] + var33;
                        var22 = var25[var36] + var34;
                        var23 = var26[var36] + var35;
                    }
                    var8[-arg1 + var9 + this.field209] = var20;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; ~var13 > ~class642.field8759; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; ~var17 > ~var4; ++var17) {
                        int[][] var18 = var8[var17];
                        var15 += var18[1][var13];
                        var14 += var18[0][var13];
                        var16 += var18[2][var13];
                    }
                    var10[var13] = var5 * var14 >> 16;
                    var11[var13] = var5 * var15 >> 16;
                    var12[var13] = var5 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "(I)V")
    public static void method188(int arg0) {
        field207 = null;
        if (arg0 != 2048) {
            field211 = null;
        }
        field211 = null;
        field217 = null;
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "()V")
    public class12() {
        super(1, false);
    }

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "(III)Z")
    public static final boolean method189(int arg0, int arg1, int arg2) {
        ++field208;
        if (arg0 > -67) {
            field217 = null;
        }
        return ~(arg2 & 2048) != -1;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(BILes;)V")
    public final void method144(byte arg0, int arg1, class403 arg2) {
        ++field216;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field762 = ~arg2.method2396((byte) 60) == -2;
                }
            } else {
                this.field209 = arg2.method2396((byte) -111);
            }
        } else {
            this.field212 = arg2.method2396((byte) -81);
        }
        if (arg0 > -44) {
            this.method187((byte) 80, -63);
        }
    }
}
