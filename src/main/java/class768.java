import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public abstract class class768 extends class459 {

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "Z")
    public volatile boolean field11246 = true;

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "[Ljava/lang/String;")
    private static final String[] field11249 = new String[] { method5537(method5536("l|:g")), method5537(method5536("`{")), method5537(method5536("y'x%G")), method5537(method5536("ddxM\u0012")), method5537(method5536("ddxC\u0012")), method5537(method5536("wd")), method5537(method5536("ddxL\u0012")), method5537(method5536("we")) };

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "Z")
    public static boolean field11245 = false;

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "Ljava/lang/String;")
    public static String field11247 = null;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "I")
    public static int field11242;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "I")
    public static int field11243;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
    public static int field11248;

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "Z")
    public boolean field11241;

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "Z")
    public boolean field11244;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V")
    public static final void method5533(byte arg0) {
        try {
            field11243++;
            class117 var1 = class185.field2948.field2660;
            int var2 = var1.method1645((byte) -116);
            int var3 = var1.method1687((byte) -109);
            boolean var4 = var1.method1684(true) == 1;
            int var5 = var1.method1654(-117);
            class507.field7569 = var1.method1684(true);
            if (arg0 != 46) {
                field11247 = null;
            }
            class539.method4018(0);
            class152.method1380(var2, true);
            var1.method1156(arg0 - 170);
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < class126.field1823 >> 3; var7++) {
                    for (int var8 = 0; var8 < class169.field2725 >> 3; var8++) {
                        int var9 = var1.method1163(1, arg0 - 158);
                        if (var9 == 1) {
                            class734.field10759[var6][var7][var8] = var1.method1163(26, 7);
                        } else {
                            class734.field10759[var6][var7][var8] = -1;
                        }
                    }
                }
            }
            var1.method1160(7);
            int var10 = (class185.field2948.field2663 - var1.field2799) / 16;
            class710.field10276 = new int[var10][4];
            for (int var11 = 0; var11 < var10; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    class710.field10276[var11][var12] = var1.method1622(arg0 - 18758);
                }
            }
            class221.field3483 = new byte[var10][];
            class426.field6724 = new int[var10];
            class395.field6269 = new byte[var10][];
            class641.field9196 = new int[var10];
            class380.field6122 = new int[var10];
            class325.field5293 = new int[var10];
            class74.field1067 = null;
            class548.field8055 = new byte[var10][];
            class382.field6143 = new byte[var10][];
            class543.field7995 = new int[var10];
            class620.field8953 = null;
            int var13 = 0;
            for (int var14 = 0; var14 < 4; var14++) {
                for (int var15 = 0; var15 < class126.field1823 >> 3; var15++) {
                    for (int var16 = 0; var16 < class169.field2725 >> 3; var16++) {
                        int var17 = class734.field10759[var14][var15][var16];
                        if (var17 != -1) {
                            int var18 = (var17 & 0xFFFA21) >> 14;
                            int var19 = (var17 & 0x3FFA) >> 3;
                            int var20 = (var18 / 8 << 8) + var19 / 8;
                            for (int var21 = 0; var21 < var13; var21++) {
                                if (var20 == class543.field7995[var21]) {
                                    var20 = -1;
                                    break;
                                }
                            }
                            if (var20 != -1) {
                                class543.field7995[var13] = var20;
                                int var22 = var20 >> 8 & 0xFF;
                                int var23 = var20 & 0xFF;
                                class380.field6122[var13] = class686.field9915.method585(-1, "m" + var22 + "_" + var23);
                                class426.field6724[var13] = class686.field9915.method585(-1, "l" + var22 + "_" + var23);
                                class325.field5293[var13] = class686.field9915.method585(-1, field11249[5] + var22 + "_" + var23);
                                class641.field9196[var13] = class686.field9915.method585(-1, field11249[7] + var22 + "_" + var23);
                                var13++;
                            }
                        }
                    }
                }
            }
            class796.method5716(var5, var4, 126, 12, var3);
        } catch (RuntimeException var25) {
            throw class590.method4333(var25, field11249[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
    public static void method5534(int arg0) {
        try {
            int var1 = 75 % ((59 - arg0) / 63);
            field11247 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11249[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(Z)I")
    public abstract int method4226(boolean arg0);

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ltga;IIILjava/awt/Component;)Leca;")
    public static final class793 method5535(class61 arg0, int arg1, int arg2, int arg3, Component arg4) {
        try {
            field11248++;
            if (class210.field3321 == 0) {
                throw new IllegalStateException();
            } else if (arg2 >= 0 && arg2 < 2) {
                if (arg3 < 256) {
                    arg3 = 256;
                }
                try {
                    class793 var5 = (class793) Class.forName(field11249[1]).getDeclaredConstructor().newInstance();
                    var5.field11574 = new int[(class426.field6729 ? 2 : 1) * 256];
                    var5.field11590 = arg3;
                    var5.method3318(arg4);
                    var5.field11587 = (arg3 & 0xFFFFFC00) + 1024;
                    if (var5.field11587 > 16384) {
                        var5.field11587 = 16384;
                    }
                    var5.method3317(var5.field11587);
                    if (class517.field7644 > 0 && class9.field102 == null) {
                        class9.field102 = new class760();
                        class9.field102.field11161 = arg0;
                        arg0.method643(class9.field102, class517.field7644, 22);
                    }
                    if (class9.field102 != null) {
                        if (class9.field102.field11174[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class9.field102.field11174[arg2] = var5;
                    }
                    return var5;
                } catch (Throwable var9) {
                    try {
                        class727 var6 = new class727(arg0, arg2);
                        var6.field11574 = new int[(class426.field6729 ? 2 : 1) * 256];
                        var6.field11590 = arg3;
                        var6.method3318(arg4);
                        var6.field11587 = 16384;
                        var6.method3317(var6.field11587);
                        if (arg1 < class517.field7644 && class9.field102 == null) {
                            class9.field102 = new class760();
                            class9.field102.field11161 = arg0;
                            arg0.method643(class9.field102, class517.field7644, 22);
                        }
                        if (class9.field102 != null) {
                            if (class9.field102.field11174[arg2] != null) {
                                throw new IllegalArgumentException();
                            }
                            class9.field102.field11174[arg2] = var6;
                        }
                        return var6;
                    } catch (Throwable var8) {
                        return new class793();
                    }
                }
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field11249[3] + (arg0 == null ? field11249[0] : field11249[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field11249[0] : field11249[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(Z)[B")
    public abstract byte[] method4228(boolean arg0);

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5536(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5537(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 2;
                    break;
                case 1:
                    var10005 = 9;
                    break;
                case 2:
                    var10005 = 86;
                    break;
                case 3:
                    var10005 = 11;
                    break;
                default:
                    var10005 = 58;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
