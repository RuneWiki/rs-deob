import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class174 {

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field2323 = -50;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2325 = "flash1:";

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public static int field2326 = 0;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "Lcr;")
    public static class189 field2324 = new class189(64);

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2328 = null;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V", line = 5)
    public static final void method1069(byte arg0) {
        class156.field2120.method11((byte) 87);
        field2327++;
        int var1 = class156.field2120.method4(8, (byte) 25);
        if (arg0 <= 89) {
            field2326 = -65;
        }
        if (class198.field2637 > var1) {
            for (int var2 = var1; var2 < class198.field2637; var2++) {
                class227.field2979[class51.field684++] = class398.field5938[var2];
            }
        }
        if (class198.field2637 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class198.field2637 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class398.field5938[var3];
            class43 var5 = class306.field4496[var4];
            int var6 = class156.field2120.method4(1, (byte) 25);
            if (var6 == 0) {
                class398.field5938[class198.field2637++] = var4;
                var5.field4342 = class28.field418;
            } else {
                int var7 = class156.field2120.method4(2, (byte) 25);
                if (var7 == 0) {
                    class398.field5938[class198.field2637++] = var4;
                    var5.field4342 = class28.field418;
                    class151.field2055[class225.field2964++] = var4;
                } else if (var7 == 1) {
                    class398.field5938[class198.field2637++] = var4;
                    var5.field4342 = class28.field418;
                    int var8 = class156.field2120.method4(3, (byte) 25);
                    var5.method2034(var8, (byte) -68, 1);
                    int var9 = class156.field2120.method4(1, (byte) 25);
                    if (var9 == 1) {
                        class151.field2055[class225.field2964++] = var4;
                    }
                } else if (var7 == 2) {
                    class398.field5938[class198.field2637++] = var4;
                    var5.field4342 = class28.field418;
                    if (class156.field2120.method4(1, (byte) 25) == 1) {
                        int var11 = class156.field2120.method4(3, (byte) 25);
                        var5.method2034(var11, (byte) -46, 2);
                        int var12 = class156.field2120.method4(3, (byte) 25);
                        var5.method2034(var12, (byte) -50, 2);
                    } else {
                        int var10 = class156.field2120.method4(3, (byte) 25);
                        var5.method2034(var10, (byte) -125, 0);
                    }
                    int var13 = class156.field2120.method4(1, (byte) 25);
                    if (var13 == 1) {
                        class151.field2055[class225.field2964++] = var4;
                    }
                } else if (var7 == 3) {
                    class227.field2979[class51.field684++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIILvc;)V", line = 120)
    public static final void method1070(int arg0, int arg1, int arg2, int arg3, class308 arg4) {
        arg4.field4537 = (arg1 << 7) + 64;
        arg4.field4532 = arg3;
        arg4.field4529 = (arg2 << 7) + 64;
        class254 var5 = class213.field2852[arg0][arg1][arg2];
        if (var5 != null) {
            int var6 = 0;
            for (class328 var7 = var5.field3515; var7 != null; var7 = var7.field4783) {
                if (var7.field4785.field730) {
                    int var8 = var7.field4785.method174(2);
                    if (var8 != -32768 && var8 < var6) {
                        var6 = var8;
                    }
                }
            }
            if (var6 < 0) {
                arg4.field4532 += var6;
                arg4.field4534 = true;
            }
        }
        if (class213.field2852[arg0][arg1][arg2] == null) {
            class365.method2386(arg0, arg1, arg2);
        }
        class213.field2852[arg0][arg1][arg2].field3525 = arg4;
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(B)V", line = 161)
    public static void method1071(byte arg0) {
        field2328 = null;
        field2324 = null;
        if (arg0 != -13) {
            method1069((byte) 37);
        }
        field2325 = null;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZI)V", line = 175)
    public static final void method1072(boolean arg0, int arg1) {
        field2322++;
        byte[][] var2;
        byte var3;
        if (arg0) {
            var2 = class12.field198;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class379.field5503;
        }
        int[] var4 = null;
        for (int var5 = 0; var5 < var3; var5++) {
            class281.method1935(92);
            for (int var6 = 0; var6 < class192.field2574 >> 3; var6++) {
                for (int var7 = 0; var7 < (class364.field5262 >> 3); var7++) {
                    boolean var8 = false;
                    int var9 = class233.field3116[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = (var9 & 0x32E1B23) >> 24;
                        if (!arg0 || var10 == 0) {
                            int var11 = var9 >> 1 & 0x3;
                            int var12 = var9 >> 14 & 0x3FF;
                            int var13 = var9 >> 3 & 0x7FF;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class147.field2015.length; var15++) {
                                if (class147.field2015[var15] == var14 && var2[var15] != null) {
                                    int[] var16 = class182.method1113((byte) -7, arg0, var12, var7 * 8, var13, class365.field5294, var11, var2[var15], var10, var5, var6 * 8, class61.field807);
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class438.method2755(121, var7 * 8, var5, 8, 8, var6 * 8);
                    }
                }
            }
        }
        if (var4 == null) {
            class247.field3331 = null;
        } else {
            class247.field3331 = class420.method2687(var4[3], 0, var4[2], var4[1], var4[0]);
            class165.field2226 = var4[4];
        }
        if (arg1 >= -57) {
            field2326 = -25;
        }
    }
}
