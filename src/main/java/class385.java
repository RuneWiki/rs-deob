import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class385 {

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5826 = new String[] { method3081(method3080("(\nMH^")), method3081(method3080("(\nMI^")), method3081(method3080("(\nMO^")), method3081(method3080("1\u0001\u000foV")), method3081(method3080("(\nMN^")), method3081(method3080("(\nMK^")) };

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "Z")
    public static boolean field5821 = false;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "Lwia;")
    public static class790 field5819 = new class790(34, -1);

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "[Ltia;")
    public static class280[] field5825 = new class280[300];

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIII)V")
    public static final void method3075(int arg0, int arg1, int arg2, int arg3) {
        try {
            field5824++;
            String var4 = field5826[3] + arg1 + "," + (arg3 >> 6) + "," + (arg2 >> 6) + "," + (arg3 & 0x3F) + "," + (arg2 & 0x3F);
            System.out.println(var4);
            class328.method2778(true, false, -22665, var4);
            if (arg0 != 1) {
                method3077(-20);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5826[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIB)I")
    public static final int method3076(int arg0, int arg1, byte arg2) {
        try {
            field5822++;
            if (arg2 >= -45) {
                return 66;
            }
            int var3 = 0;
            while (arg1 > 0) {
                var3 = var3 << 1 | arg0 & 0x1;
                arg0 >>>= 0x1;
                arg1--;
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5826[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
    public static void method3077(int arg0) {
        try {
            field5825 = null;
            if (arg0 == 34) {
                field5819 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5826[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)I")
    public static final int method3078(boolean arg0) {
        try {
            if (arg0) {
                field5821 = false;
            }
            field5823++;
            return class60.method436(false, 83);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5826[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V")
    public static final void method3079(int arg0) {
        try {
            for (int var1 = 0; var1 < class440.field6489; var1++) {
                class137.field1598[var1] = null;
            }
            field5820++;
            if (arg0 == 15611) {
                class440.field6489 = 0;
                for (int var2 = 0; var2 < class501.field7246; var2++) {
                    for (int var3 = 0; var3 < class132.field1543; var3++) {
                        for (int var4 = 0; var4 < class216.field3296; var4++) {
                            class96 var5 = class734.field10683[var2][var4][var3];
                            if (var5 != null) {
                                if (var5.field1078 > 0) {
                                    var5.field1078 = (short) (var5.field1078 * -1);
                                }
                                if (var5.field1087 > 0) {
                                    var5.field1087 = (short) (var5.field1087 * -1);
                                }
                            }
                        }
                    }
                }
                for (int var6 = 0; var6 < class501.field7246; var6++) {
                    for (int var7 = 0; var7 < class132.field1543; var7++) {
                        for (int var8 = 0; var8 < class216.field3296; var8++) {
                            class96 var9 = class734.field10683[var6][var8][var7];
                            if (var9 != null) {
                                boolean var10 = class734.field10683[0][var8][var7] != null && class734.field10683[0][var8][var7].field1088 != null;
                                if (var9.field1087 < 0) {
                                    int var11 = var7;
                                    int var12 = var7;
                                    int var14 = var6;
                                    class96 var15 = class734.field10683[var6][var8][var7 - 1];
                                    int var16 = class184.field2541[var6].method2407(var7, var8, arg0 - 15721);
                                    while (var11 > 0 && var15 != null && var15.field1087 < 0 && var9.field1087 == var15.field1087 && var9.field1086 == var15.field1086 && var16 == class184.field2541[var6].method2407(var11 - 1, var8, -118) && ((var11 - 1) <= 0 || class184.field2541[var6].method2407(var11 - 2, var8, -112) == var16)) {
                                        var11--;
                                        var15 = class734.field10683[var6][var8][var11 - 1];
                                    }
                                    for (class96 var17 = class734.field10683[var6][var8][var7 + 1]; var12 < class216.field3296 && var17 != null && var17.field1087 < 0 && var9.field1087 == var17.field1087 && var9.field1086 == var17.field1086 && var16 == class184.field2541[var6].method2407(var12 + 1, var8, arg0 - 15725) && ((var12 + 1) >= class216.field3296 || class184.field2541[var6].method2407(var12 + 2, var8, 83) == var16); var17 = class734.field10683[var6][var8][var12 + 1]) {
                                        var12++;
                                    }
                                    int var18 = var6 + 1 - var6;
                                    int var19 = class184.field2541[var10 ? var6 + 1 : var6].method2407(var11, var8, 109);
                                    int var20 = var9.field1087 * var18 + var19;
                                    int var21 = class184.field2541[var10 ? var6 + 1 : var6].method2407(var12 + 1, var8, -100);
                                    int var22 = var21 + (var9.field1087 * var18);
                                    int var23 = var8 << class602.field8828;
                                    int var24 = var11 << class602.field8828;
                                    int var25 = (var12 << class602.field8828) + class358.field5488;
                                    class137.field1598[class440.field6489++] = new class367(1, var6, var9.field1086 + var23, var9.field1086 + var23, var23 + var9.field1086, var9.field1086 + var23, var19, var21, var22, var20, var24, var25, var25, var24);
                                    for (int var26 = var6; var26 <= var14; var26++) {
                                        for (int var27 = var11; var27 <= var12; var27++) {
                                            class734.field10683[var26][var8][var27].field1087 = (short) (class734.field10683[var26][var8][var27].field1087 * -1);
                                        }
                                    }
                                }
                                if (var9.field1078 < 0) {
                                    int var28 = var8;
                                    int var29 = var8;
                                    int var31 = var6;
                                    class96 var32 = class734.field10683[var6][var8 - 1][var7];
                                    int var33 = class184.field2541[var6].method2407(var7, var8, -97);
                                    while (var28 > 0 && var32 != null && var32.field1078 < 0 && var9.field1078 == var32.field1078 && var9.field1084 == var32.field1084 && class184.field2541[var6].method2407(var7, var28 - 1, 49) == var33 && (var28 - 1 <= 0 || class184.field2541[var6].method2407(var7, var28 - 2, -88) == var33)) {
                                        var28--;
                                        var32 = class734.field10683[var6][var28 - 1][var7];
                                    }
                                    for (class96 var34 = class734.field10683[var6][var8 + 1][var7]; class132.field1543 > var29 && var34 != null && var34.field1078 < 0 && var9.field1078 == var34.field1078 && var9.field1084 == var34.field1084 && class184.field2541[var6].method2407(var7, var29 + 1, 25) == var33 && ((var29 + 1) >= class132.field1543 || var33 == class184.field2541[var6].method2407(var7, var29 + 2, arg0 + -15736)); var34 = class734.field10683[var6][var29 + 1][var7]) {
                                        var29++;
                                    }
                                    int var35 = var6 + 1 - var6;
                                    int var36 = class184.field2541[var10 ? var6 + 1 : var6].method2407(var7, var28, 37);
                                    int var37 = var9.field1078 * var35 + var36;
                                    int var38 = class184.field2541[var10 ? var6 + 1 : var6].method2407(var7, var29 + 1, 67);
                                    int var39 = var9.field1078 * var35 + var38;
                                    int var40 = var28 << class602.field8828;
                                    int var41 = (var29 << class602.field8828) + class358.field5488;
                                    int var42 = var7 << class602.field8828;
                                    class137.field1598[class440.field6489++] = new class367(2, var6, var40, var41, var41, var40, var36, var38, var39, var37, var9.field1084 + var42, var9.field1084 + var42, var42 + var9.field1084, var9.field1084 + var42);
                                    for (int var43 = var6; var43 <= var31; var43++) {
                                        for (int var44 = var28; var44 <= var29; var44++) {
                                            class734.field10683[var43][var44][var7].field1078 = (short) (class734.field10683[var43][var44][var7].field1078 * -1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class216.field3282 = true;
            }
        } catch (RuntimeException var46) {
            throw class759.method5498(var46, field5826[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3080(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x76);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3081(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 69;
                    break;
                case 1:
                    var10005 = 100;
                    break;
                case 2:
                    var10005 = 99;
                    break;
                case 3:
                    var10005 = 10;
                    break;
                default:
                    var10005 = 118;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
