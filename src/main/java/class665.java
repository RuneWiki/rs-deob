import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class665 extends class518 {

    @OriginalMember(owner = "client!ds", name = "I", descriptor = "I")
    private int field9393 = 1;

    @OriginalMember(owner = "client!ds", name = "B", descriptor = "I")
    private int field9398 = 1;

    @OriginalMember(owner = "client!ds", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field9399 = new String[] { method4801(method4800("8@[\u0003$")), method4801(method4800("2F\u0019.")), method4801(method4800("'\u001d[lq")), method4801(method4800("8@[\u0001$")), method4801(method4800("8@[\u0000$")), method4801(method4800("8@[\u0005$")) };

    @OriginalMember(owner = "client!ds", name = "J", descriptor = "I")
    public static int field9391;

    @OriginalMember(owner = "client!ds", name = "C", descriptor = "I")
    public static int field9392;

    @OriginalMember(owner = "client!ds", name = "G", descriptor = "I")
    public static int field9394;

    @OriginalMember(owner = "client!ds", name = "F", descriptor = "I")
    public static int field9395;

    @OriginalMember(owner = "client!ds", name = "D", descriptor = "I")
    public static int field9396;

    @OriginalMember(owner = "client!ds", name = "H", descriptor = "I")
    public static int field9397;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILjc;I)V")
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            ++field9392;
            if (arg2 != -3) {
                method4798(false);
            }
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (arg0 == 2) {
                        super.field7565 = ~arg1.method5128(0) == -2;
                    }
                } else {
                    this.field9398 = arg1.method5128(arg2 + 3);
                }
            } else {
                this.field9393 = arg1.method5128(arg2 ^ -3);
            }
        } catch (RuntimeException var6) {
            throw method4799(var6, field9399[3] + arg0 + ',' + (arg1 != null ? field9399[2] : field9399[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field9396;
            int[] var3 = super.field7564.method4462(26041, arg0);
            int var4 = -64 % ((-57 - arg1) / 55);
            if (super.field7564.field8652) {
                int var5 = this.field9398 - (-this.field9398 + -1);
                int var6 = 65536 / var5;
                int var7 = this.field9393 + this.field9393 - -1;
                int var8 = 65536 / var7;
                int[][] var9 = new int[var5][];
                for (int var10 = -this.field9398 + arg0; this.field9398 + arg0 >= var10; ++var10) {
                    int[] var11 = this.method3944(class478.field7048 & var10, 0, (byte) 73);
                    int[] var12 = new int[class110.field1436];
                    int var13 = 0;
                    for (int var14 = -this.field9393; var14 <= this.field9393; ++var14) {
                        var13 += var11[class247.field3543 & var14];
                    }
                    int var15 = 0;
                    while (var15 < class110.field1436) {
                        var12[var15] = var8 * var13 >> 16;
                        int var16 = var13 - var11[-this.field9393 + var15 & class247.field3543];
                        ++var15;
                        var13 = var11[this.field9393 + var15 & class247.field3543] + var16;
                    }
                    var9[var10 - arg0 + this.field9398] = var12;
                }
                for (int var17 = 0; ~var17 > ~class110.field1436; ++var17) {
                    int var18 = 0;
                    for (int var19 = 0; ~var5 < ~var19; ++var19) {
                        var18 += var9[var19][var17];
                    }
                    var3[var17] = var6 * var18 >> 16;
                }
            }
            return var3;
        } catch (RuntimeException var21) {
            throw method4799(var21, field9399[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V")
    public class665() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)Liga;")
    public static final class353 method4798(boolean arg0) {
        try {
            ++field9391;
            if (class534.field7732 != null && class533.field7719 != null) {
                if (!arg0) {
                    method4799((Throwable) null, (String) null);
                }
                for (class353 var1 = (class353) class533.field7719.method2704(0); var1 != null; var1 = (class353) class533.field7719.method2704(0)) {
                    class475 var2 = class534.field7725.method2508(var1.field5108, false);
                    if (var2 != null && var2.field7005 && var2.method3672((byte) -109, class534.field7728)) {
                        return var1;
                    }
                }
                return null;
            } else {
                return null;
            }
        } catch (RuntimeException var4) {
            throw method4799(var4, field9399[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lim;")
    public static final class643 method4799(Throwable arg0, String arg1) {
        ++field9395;
        class643 var2;
        if (arg0 instanceof class643) {
            var2 = (class643) arg0;
            var2.field9156 = var2.field9156 + ' ' + arg1;
        } else {
            var2 = new class643(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)[[I")
    public final int[][] method349(int arg0, int arg1) {
        try {
            if (arg0 != 0) {
                return null;
            } else {
                ++field9394;
                int[][] var3 = super.field7575.method1955(arg1, -2);
                if (super.field7575.field3416) {
                    int var4 = this.field9398 + this.field9398 - -1;
                    int var5 = 65536 / var4;
                    int var6 = this.field9393 - -1 + this.field9393;
                    int var7 = 65536 / var6;
                    int[][][] var8 = new int[var4][][];
                    for (int var9 = -this.field9398 + arg1; ~var9 >= ~(this.field9398 + arg1); ++var9) {
                        int[][] var10 = this.method3943(0, class478.field7048 & var9, -23583);
                        int[][] var11 = new int[3][class110.field1436];
                        int var12 = 0;
                        int var13 = 0;
                        int var14 = 0;
                        int[] var15 = var10[0];
                        int[] var16 = var10[1];
                        int[] var17 = var10[2];
                        for (int var18 = -this.field9393; this.field9393 >= var18; ++var18) {
                            int var19 = var18 & class247.field3543;
                            var13 += var16[var19];
                            var14 += var17[var19];
                            var12 += var15[var19];
                        }
                        int[] var20 = var11[0];
                        int[] var21 = var11[1];
                        int[] var22 = var11[2];
                        int var23 = 0;
                        while (~class110.field1436 < ~var23) {
                            var20[var23] = var7 * var12 >> 16;
                            var21[var23] = var7 * var13 >> 16;
                            var22[var23] = var7 * var14 >> 16;
                            int var24 = class247.field3543 & -this.field9393 + var23;
                            int var25 = var12 - var15[var24];
                            int var26 = var13 - var16[var24];
                            ++var23;
                            int var27 = var14 - var17[var24];
                            int var28 = class247.field3543 & this.field9393 + var23;
                            var13 = var16[var28] + var26;
                            var14 = var17[var28] + var27;
                            var12 = var15[var28] + var25;
                        }
                        var8[this.field9398 + var9 + -arg1] = var11;
                    }
                    int[] var29 = var3[0];
                    int[] var30 = var3[1];
                    int[] var31 = var3[2];
                    for (int var32 = 0; var32 < class110.field1436; ++var32) {
                        int var33 = 0;
                        int var34 = 0;
                        int var35 = 0;
                        for (int var36 = 0; ~var36 > ~var4; ++var36) {
                            int[][] var37 = var8[var36];
                            var34 += var37[1][var32];
                            var35 += var37[2][var32];
                            var33 += var37[0][var32];
                        }
                        var29[var32] = var5 * var33 >> 16;
                        var30[var32] = var5 * var34 >> 16;
                        var31[var32] = var5 * var35 >> 16;
                    }
                }
                return var3;
            }
        } catch (RuntimeException var39) {
            throw method4799(var39, field9399[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4800(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 12);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4801(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 92;
                    break;
                case 1:
                    var10005 = 51;
                    break;
                case 2:
                    var10005 = 117;
                    break;
                case 3:
                    var10005 = 66;
                    break;
                default:
                    var10005 = 12;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
