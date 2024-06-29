import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class327 extends class149 {

    @OriginalMember(owner = "client!di", name = "I", descriptor = "I")
    private int field5008 = 1;

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "I")
    private int field5016 = 1;

    @OriginalMember(owner = "client!di", name = "M", descriptor = "Z")
    public static boolean field5012;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!di", name = "K", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!di", name = "L", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!di", name = "N", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!di", name = "O", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!di", name = "P", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!di", name = "R", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!di", name = "S", descriptor = "I")
    public static int field5018;

    static {
        new class375("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field5012 = false;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ltf;[[BI)V", line = 12)
    public static final void method2112(class167 arg0, byte[][] arg1, int arg2) {
        ++field5015;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = -56 % ((arg2 - -21) / 55);
        for (int var5 = 0; ~arg0.field5171 < ~var5; ++var5) {
            class300.method1929((byte) -4);
            for (int var6 = 0; ~(class96.field1403 >> 3) < ~var6; ++var6) {
                for (int var7 = 0; var7 < class485.field7122 >> 3; ++var7) {
                    boolean var8 = false;
                    int var9 = class501.field7483[var5][var6][var7];
                    if (~var9 != 0) {
                        int var10 = var9 >> 24 & 3;
                        if (!arg0.field5190 || var10 == 0) {
                            int var11 = (7 & var9) >> 1;
                            int var12 = (16774478 & var9) >> 14;
                            int var13 = var9 >> 3 & 2047;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; class253.field3509.length > var15; ++var15) {
                                if (class253.field3509[var15] == var14 && arg1[var15] != null) {
                                    class91 var16 = new class91(arg1[var15]);
                                    arg0.method2154(var16, var7 * 8, var12, var6 * 8, var5, var13, class444.field6605, var11, var10, -57);
                                    var8 = true;
                                    arg0.method1172(class337.field5242, var10, ~var3[0] != 0 ? null : var3, var12, var6 * 8, var7 * 8, var5, var13, var11, 1904049923, var16);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        arg0.method2163(var6 * 8, 8, 8, var5, var7 * 8, (byte) 126);
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class429.field6384 = class296.field4391.method393(var3[2], class496.field7258, var3[3], var3[0], -109, var3[1]);
            class21.field336 = var3[4];
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V", line = 101)
    public class327() {
        super(1, false);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)[I", line = 105)
    public final int[] method92(int arg0, int arg1) {
        ++field5013;
        int[] var3 = super.field2152.method2891(arg1, (byte) 101);
        if (arg0 != -10835) {
            return null;
        } else {
            if (super.field2152.field7051) {
                int var4 = this.field5016 + this.field5016 - -1;
                int var5 = 65536 / var4;
                int var6 = this.field5008 - -this.field5008 + 1;
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = -this.field5016 + arg1; var9 <= this.field5016 + arg1; ++var9) {
                    int[] var13 = this.method983(0, 24824, var9 & class51.field694);
                    int[] var14 = new int[class316.field4838];
                    int var15 = 0;
                    for (int var16 = -this.field5008; this.field5008 >= var16; ++var16) {
                        var15 += var13[class320.field4897 & var16];
                    }
                    int var17 = 0;
                    while (var17 < class316.field4838) {
                        var14[var17] = var7 * var15 >> 16;
                        int var18 = var15 - var13[class320.field4897 & -this.field5008 + var17];
                        ++var17;
                        var15 = var13[class320.field4897 & this.field5008 + var17] + var18;
                    }
                    var8[this.field5016 + var9 - arg1] = var14;
                }
                for (int var10 = 0; class316.field4838 > var10; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; var12 < var4; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IBLtl;)V", line = 197)
    public final void method93(int arg0, byte arg1, class91 arg2) {
        if (arg1 == 35) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (arg0 == 2) {
                        super.field2148 = ~arg2.method618((byte) 100) == -2;
                    }
                } else {
                    this.field5016 = arg2.method618((byte) 100);
                }
            } else {
                this.field5008 = arg2.method618((byte) 100);
            }
            ++field5018;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lbv;BILjava/lang/String;)Lvl;", line = 244)
    public static final class240 method2113(class282 arg0, byte arg1, int arg2, String arg3) {
        ++field5011;
        int var4 = OpenGL.glGenProgramARB();
        if (arg1 != -106) {
            method2113((class282) null, (byte) 60, 70, (String) null);
        }
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramStringARB(arg2, 34933, arg3);
        OpenGL.glGetIntegerv(34379, class348.field5423, 0);
        if (~class348.field5423[0] != 0) {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return new class240(arg0, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BLjava/lang/String;Ltl;)I", line = 274)
    public static final int method2114(byte arg0, String arg1, class91 arg2) {
        ++field5009;
        int var3 = arg2.field1292;
        byte[] var4 = class315.method2043(arg1, (byte) 126);
        arg2.method594(false, var4.length);
        arg2.field1292 += class527.field7780.method1650(arg2.field1277, 0, var4.length, var4, arg2.field1292, (byte) -93);
        if (arg0 != 58) {
            field5012 = true;
        }
        return -var3 + arg2.field1292;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)[[I", line = 296)
    public final int[][] method139(byte arg0, int arg1) {
        ++field5017;
        int[][] var3 = super.field2147.method2726(arg1, 0);
        if (arg0 >= -45) {
            return null;
        } else {
            if (super.field2147.field6664) {
                int var4 = this.field5016 - -1 + this.field5016;
                int var5 = 65536 / var4;
                int var6 = this.field5008 - (-this.field5008 - 1);
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var4][][];
                for (int var9 = -this.field5016 + arg1; var9 <= arg1 - -this.field5016; ++var9) {
                    int[][] var19 = this.method984((byte) 103, 0, class51.field694 & var9);
                    int[][] var20 = new int[3][class316.field4838];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[1];
                    int[] var26 = var19[2];
                    for (int var27 = -this.field5008; ~this.field5008 <= ~var27; ++var27) {
                        int var37 = class320.field4897 & var27;
                        var21 += var24[var37];
                        var22 += var25[var37];
                        var23 += var26[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (class316.field4838 > var31) {
                        var28[var31] = var7 * var21 >> 16;
                        var29[var31] = var7 * var22 >> 16;
                        var30[var31] = var7 * var23 >> 16;
                        int var32 = -this.field5008 + var31 & class320.field4897;
                        int var33 = var23 - var26[var32];
                        int var34 = var22 - var25[var32];
                        int var35 = var21 - var24[var32];
                        ++var31;
                        int var36 = class320.field4897 & this.field5008 + var31;
                        var22 = var25[var36] + var34;
                        var21 = var24[var36] + var35;
                        var23 = var26[var36] + var33;
                    }
                    var8[this.field5016 + var9 + -arg1] = var20;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; var13 < class316.field4838; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; var17 < var4; ++var17) {
                        int[][] var18 = var8[var17];
                        var14 += var18[0][var13];
                        var16 += var18[2][var13];
                        var15 += var18[1][var13];
                    }
                    var10[var13] = var5 * var14 >> 16;
                    var11[var13] = var5 * var15 >> 16;
                    var12[var13] = var5 * var16 >> 16;
                }
            }
            return var3;
        }
    }
}
