import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class47 {

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "Lgj;")
    public static class662 field727;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "Lsp;")
    public static class663 field731;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg4 >= -57) {
            field727 = null;
        }
        field728++;
        if ((arg6 ? class111.field1911.field6724.method925((byte) 95) : class111.field1911.field6762.method925((byte) 64)) != 0 && arg1 != 0 && class57.field806 < 50 && arg2 != -1) {
            class531.field7189[class57.field806++] = new class481((byte) (arg6 ? 3 : 2), arg2, arg1, arg3, arg0, 0, arg5, null);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V")
    public static void method346(byte arg0) {
        if (arg0 == 71) {
            field727 = null;
            field731 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILkka;)V")
    public static final void method347(int arg0, class329 arg1) {
        field730++;
        arg1.method2079((byte) -55);
        int var2 = 0;
        for (int var3 = 0; var3 < class696.field9624; var3++) {
            int var15 = class417.field5700[var3];
            if ((class434.field5900[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class434.field5900[var15] = (byte) class530.method3011(class434.field5900[var15], 2);
                } else {
                    int var16 = arg1.method2078(1, arg0 ^ 0x3C5D);
                    if (var16 == 0) {
                        var2 = class678.method3824(arg1, false);
                        class434.field5900[var15] = (byte) class530.method3011(class434.field5900[var15], 2);
                    } else {
                        class617.method3483(arg1, 1, var15);
                    }
                }
            }
        }
        arg1.method2081(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method2079((byte) -112);
        for (int var4 = 0; var4 < class696.field9624; var4++) {
            int var13 = class417.field5700[var4];
            if ((class434.field5900[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class434.field5900[var13] = (byte) class530.method3011(class434.field5900[var13], 2);
                } else {
                    int var14 = arg1.method2078(1, 15455);
                    if (var14 == 0) {
                        var2 = class678.method3824(arg1, false);
                        class434.field5900[var13] = (byte) class530.method3011(class434.field5900[var13], 2);
                    } else {
                        class617.method3483(arg1, arg0 ^ 0x3, var13);
                    }
                }
            }
        }
        arg1.method2081(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method2079((byte) -56);
        for (int var5 = 0; var5 < class18.field418; var5++) {
            int var11 = class582.field8242[var5];
            if ((class434.field5900[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class434.field5900[var11] = (byte) class530.method3011(class434.field5900[var11], 2);
                } else {
                    int var12 = arg1.method2078(1, 15455);
                    if (var12 == 0) {
                        var2 = class678.method3824(arg1, false);
                        class434.field5900[var11] = (byte) class530.method3011(class434.field5900[var11], 2);
                    } else if (class563.method3256(var11, (byte) -84, arg1)) {
                        class434.field5900[var11] = (byte) class530.method3011(class434.field5900[var11], 2);
                    }
                }
            }
        }
        arg1.method2081(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method2079((byte) -114);
        for (int var6 = 0; var6 < class18.field418; var6++) {
            int var9 = class582.field8242[var6];
            if ((class434.field5900[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class434.field5900[var9] = (byte) class530.method3011(class434.field5900[var9], 2);
                } else {
                    int var10 = arg1.method2078(1, 15455);
                    if (var10 == 0) {
                        var2 = class678.method3824(arg1, false);
                        class434.field5900[var9] = (byte) class530.method3011(class434.field5900[var9], 2);
                    } else if (class563.method3256(var9, (byte) -84, arg1)) {
                        class434.field5900[var9] = (byte) class530.method3011(class434.field5900[var9], 2);
                    }
                }
            }
        }
        arg1.method2081(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class18.field418 = 0;
        class696.field9624 = 0;
        int var7 = 1;
        if (arg0 != 2) {
            method345(-3, 123, -108, -119, 57, 75, false);
        }
        while (var7 < 2048) {
            class434.field5900[var7] = (byte) (class434.field5900[var7] >> 1);
            class771 var8 = class527.field7150[var7];
            if (var8 == null) {
                class582.field8242[class18.field418++] = var7;
            } else {
                class417.field5700[class696.field9624++] = var7;
            }
            var7++;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI)I")
    public static final int method348(byte arg0, int arg1) {
        field729++;
        int var2 = -13 % ((69 - arg0) / 39);
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lgj;ILjava/lang/String;Z)Lfh;")
    public static final class678 method349(class662 arg0, int arg1, String arg2, boolean arg3) {
        field732++;
        int var4 = arg0.method3738(~arg1, arg2);
        if (var4 == -1) {
            return new class678(0);
        }
        int[] var5 = arg0.method3740(16, var4);
        class678 var6 = new class678(var5.length);
        int var7 = 0;
        if (arg1 != 0) {
            return null;
        }
        int var8 = 0;
        while (true) {
            while (var6.field9442 > var7) {
                class93 var9 = new class93(arg0.method3732(var5[var8++], 8906, var4));
                int var10 = var9.method773(arg1 + 3);
                int var11 = var9.method763(arg1 - 96);
                int var12 = var9.method793((byte) 122);
                if (!arg3 && var12 == 1) {
                    var6.field9442--;
                } else {
                    var6.field9443[var7] = var10;
                    var6.field9447[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }
}
