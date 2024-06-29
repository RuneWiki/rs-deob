import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class215 {

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Lve;")
    public static class255 field3656 = class87.method607(57, "Opened titlescreen)3");

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field3658 = 0;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "Lfg;")
    public static class203 field3654 = new class203();

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "Lfj;")
    public static class228 field3659;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "[[Ldi;")
    public static class142[][] field3650;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZI)V", line = 19)
    public static final void method1531(boolean arg0, int arg1) {
        field3655++;
        byte[][] var2;
        byte var3;
        if (class281.field4827 && arg0) {
            var2 = class249.field4164;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class244.field4113;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class118.method885(true);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class248.field4152[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg0 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = var8 >> 14 & 0x3FF;
                            int var12 = (var8 & 0x3FFE) >> 3;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class116.field1976.length; var14++) {
                                if (class116.field1976[var14] == var13 && var2[var14] != null) {
                                    class24.method134(var10, var2[var14], var9, (var12 & 0x7) * 8, var6 * 8, class310.field5292, arg0, var5 * 8, (var11 & 0x7) * 8, var4, -26586);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class259.method1801((byte) -71, var5 * 8, 8, 8, var6 * 8, var4);
                    }
                }
            }
        }
        if (arg1 != -1) {
            field3659 = (class228) null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZ)Lve;", line = 121)
    public static final class255 method1532(int arg0, boolean arg1) {
        field3652++;
        if (!arg1) {
            field3656 = (class255) null;
        }
        return class67.method408((byte) 29, false, arg0, 10);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 136)
    public static void method1533(byte arg0) {
        field3654 = null;
        int var1 = 69 / ((arg0 - 16) / 58);
        field3656 = null;
        field3650 = (class142[][]) null;
        field3659 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IB)Lrc;", line = 149)
    public static final class313 method1534(int arg0, byte arg1) {
        field3657++;
        class313 var2 = (class313) class231.field3816.method58(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class315.field5348.method636(arg0, (byte) 51, 0);
        if (var3 == null) {
            return null;
        }
        class313 var4 = new class313();
        class70 var5 = new class70(var3);
        var5.field1068 = var5.field1066.length - 2;
        int var6 = var5.method423(255);
        int var7 = var5.field1066.length - var6 - 12 - 2;
        var5.field1068 = var7;
        int var8 = var5.method469(97);
        var4.field5301 = var5.method423(255);
        var4.field5302 = var5.method423(255);
        var4.field5307 = var5.method423(255);
        var4.field5308 = var5.method423(255);
        int var9 = var5.method481(0);
        if (var9 > 0) {
            var4.field5313 = new class47[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method423(255);
                class47 var12 = new class47(class287.method2033(var11, -1410546649));
                var4.field5313[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method469(104);
                    int var14 = var5.method469(80);
                    var12.method284(true, (long) var13, new class172(var14));
                }
            }
        }
        var5.field1068 = 0;
        if (arg1 < 124) {
            return (class313) null;
        }
        var4.field5314 = var5.method455(-10237);
        int var15 = 0;
        var4.field5310 = new class255[var8];
        var4.field5309 = new int[var8];
        var4.field5304 = new int[var8];
        while (var5.field1068 < var7) {
            int var16 = var5.method423(255);
            if (var16 == 3) {
                var4.field5310[var15] = var5.method479(-1);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field5309[var15] = var5.method481(0);
            } else {
                var4.field5309[var15] = var5.method469(111);
            }
            var4.field5304[var15++] = var16;
        }
        class231.field3816.method63(0, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V", line = 238)
    public static final void method1535(int arg0) {
        class80.field1302 = new class203();
        field3649++;
        if (arg0 != -253789727) {
            method1536((class163[]) null, -5, (byte) 43, false, (byte[]) null, -125, -49, 2);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([Lhc;IBZ[BIII)V", line = 252)
    public static final void method1536(class163[] arg0, int arg1, byte arg2, boolean arg3, byte[] arg4, int arg5, int arg6, int arg7) {
        field3653++;
        byte var8;
        if (arg3) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg3) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg5 + var10 > 0 && arg5 + var10 < 103 && (arg1 + var11) > 0 && arg1 + var11 < 103) {
                            arg0[var9].field2743[arg5 + var10][arg1 + var11] = class154.method1134(arg0[var9].field2743[arg5 + var10][arg1 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class70 var12 = new class70(arg4);
        int var13 = 0;
        if (arg2 < 20) {
            method1534(-11, (byte) -104);
        }
        while (var8 > var13) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class162.method1171(var12, 0, var13, var15 + arg1, arg5 + var14, arg6, arg3, -50, arg7);
                }
            }
            var13++;
        }
        if (!class281.field4827 || arg3) {
            return;
        }
        class181 var16 = null;
        while (true) {
            while (var12.field1066.length > var12.field1068) {
                int var17 = var12.method481(0);
                if (var17 == 0) {
                    var16 = new class181(var12);
                } else if (var17 == 1) {
                    int var18 = var12.method481(0);
                    if (var18 > 0) {
                        for (int var19 = 0; var19 < var18; var19++) {
                            class1 var20 = new class1(var12);
                            var20.field1 += arg5 << 7;
                            int var21 = var20.field1 >> 7;
                            var20.field16 += arg1 << 7;
                            int var22 = var20.field16 >> 7;
                            if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
                                var20.field13 = class106.field1783[var20.field11][var21][var22] - var20.field13;
                                class164.method1204(var20);
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            if (var16 == null) {
                var16 = new class181();
            }
            for (int var23 = 0; var23 < 8; var23++) {
                for (int var24 = 0; var24 < 8; var24++) {
                    int var25 = (arg5 >> 3) + var23;
                    int var26 = (arg1 >> 3) + var24;
                    if (var25 >= 0 && var25 < 13 && var26 >= 0 && var26 < 13) {
                        class185.field2982[var25][var26] = var16;
                    }
                }
            }
            break;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)I", line = 410)
    public static final int method1537(int arg0) {
        field3651++;
        if (arg0 > -63) {
            field3659 = (class228) null;
        }
        return 2;
    }
}
