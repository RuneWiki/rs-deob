import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class261 extends class288 {

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public int field3793;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
    public int field3796;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
    public int field3799;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "[[B")
    public static byte[][] field3801;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "[[[I")
    public static int[][][] field3791;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)V")
    public static final void method1667(byte arg0) {
        int var1 = -88 % ((-arg0 - 17) / 35);
        field3797++;
        int var2 = class163.field2332.method594((byte) 118, 8);
        if (var2 < class238.field3432) {
            for (int var3 = var2; var3 < class238.field3432; var3++) {
                class144.field2060[class121.field1724++] = class46.field540[var3];
            }
        }
        if (var2 > class238.field3432) {
            throw new RuntimeException("gppov1");
        }
        class238.field3432 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            int var5 = class46.field540[var4];
            class240 var6 = class253.field3656[var5];
            int var7 = class163.field2332.method594((byte) 90, 1);
            if (var7 == 0) {
                class46.field540[class238.field3432++] = var5;
                var6.field4546 = class198.field2819;
            } else {
                int var8 = class163.field2332.method594((byte) 111, 2);
                if (var8 == 0) {
                    class46.field540[class238.field3432++] = var5;
                    var6.field4546 = class198.field2819;
                    class286.field4423[class272.field3986++] = var5;
                } else if (var8 == 1) {
                    class46.field540[class238.field3432++] = var5;
                    var6.field4546 = class198.field2819;
                    int var9 = class163.field2332.method594((byte) 121, 3);
                    var6.method1946(1, -105, var9);
                    int var10 = class163.field2332.method594((byte) 123, 1);
                    if (var10 == 1) {
                        class286.field4423[class272.field3986++] = var5;
                    }
                } else if (var8 == 2) {
                    class46.field540[class238.field3432++] = var5;
                    var6.field4546 = class198.field2819;
                    if (class163.field2332.method594((byte) 122, 1) == 1) {
                        int var12 = class163.field2332.method594((byte) 117, 3);
                        var6.method1946(2, -98, var12);
                        int var13 = class163.field2332.method594((byte) 122, 3);
                        var6.method1946(2, -112, var13);
                    } else {
                        int var11 = class163.field2332.method594((byte) 122, 3);
                        var6.method1946(0, -106, var11);
                    }
                    int var14 = class163.field2332.method594((byte) 95, 1);
                    if (var14 == 1) {
                        class286.field4423[class272.field3986++] = var5;
                    }
                } else if (var8 == 3) {
                    class144.field2060[class121.field1724++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBLtl;I)V")
    public static final void method1668(int arg0, byte arg1, class240 arg2, int arg3) {
        field3792++;
        if (arg1 <= 79) {
            method1671(true);
        }
        if ((arg3 & 0x100) != 0) {
            int var4 = class163.field2332.method1378((byte) -123);
            int var5 = class163.field2332.method1392(-46);
            arg2.method1940(var5, var4, -119, class198.field2819);
        }
        if ((arg3 & 0x200) != 0) {
            int var6 = class163.field2332.method1392(-92);
            int[] var7 = new int[var6];
            int[] var8 = new int[var6];
            int[] var9 = new int[var6];
            for (int var10 = 0; var10 < var6; var10++) {
                int var11 = class163.field2332.method1400(false);
                if (var11 == 65535) {
                    var11 = -1;
                }
                var9[var10] = var11;
                var7[var10] = class163.field2332.method1407(104);
                var8[var10] = class163.field2332.method1385(2);
            }
            class40.method250(var7, var9, -2, arg2, var8);
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field4510 = class163.field2332.method1385(2);
            arg2.field4558 = class163.field2332.method1388(-1);
        }
        if ((arg3 & 0x10) != 0) {
            int var12 = class163.field2332.method1392(-78);
            byte[] var13 = new byte[var12];
            class216 var14 = new class216(var13);
            class163.field2332.method1398(0, (byte) -37, var12, var13);
            class167.field2404[arg0] = var14;
            arg2.method1563(var14, true);
        }
        if ((arg3 & 0x1) != 0) {
            int var15 = class163.field2332.method1378((byte) -124);
            int var16 = class163.field2332.method1362(5);
            arg2.method1940(var16, var15, -113, class198.field2819);
            arg2.field4594 = class198.field2819 + 300;
            arg2.field4530 = class163.field2332.method1362(5);
        }
        if ((arg3 & 0x400) != 0) {
            int var17 = class163.field2332.method1380(true);
            if (var17 == 65535) {
                var17 = -1;
            }
            int var18 = class163.field2332.method1411(255);
            boolean var19 = true;
            if (var17 != -1 && arg2.field4590 != -1 && class27.method165(class189.method1246(var17, (byte) -113).field1382, (byte) -118).field4071 < class27.method165(class189.method1246(arg2.field4590, (byte) -127).field1382, (byte) -118).field4071) {
                var19 = false;
            }
            if (var19) {
                arg2.field4507 = (var18 & 0xFFFF) + class198.field2819;
                arg2.field4526 = var18 >> 16;
                arg2.field4578 = 0;
                if (arg2.field4507 > class198.field2819) {
                    arg2.field4578 = -1;
                }
                arg2.field4556 = 0;
                arg2.field4542 = 1;
                arg2.field4590 = var17;
                if (arg2.field4590 != -1 && class198.field2819 == arg2.field4507) {
                    int var20 = class189.method1246(arg2.field4590, (byte) -30).field1382;
                    if (var20 != -1) {
                        class274 var21 = class27.method165(var20, (byte) 78);
                        if (var21 != null && var21.field4072 != null) {
                            class270.method1730(0, arg2.field4563, arg2.field4553, (byte) -127, var21, class177.field2507 == arg2);
                        }
                    }
                }
            }
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field4575 = class163.field2332.method1380(true);
            if (arg2.field4575 == 65535) {
                arg2.field4575 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            int var22 = class163.field2332.method1380(true);
            int var23 = class163.field2332.method1407(104);
            if (var22 == 65535) {
                var22 = -1;
            }
            class203.method1312(var22, arg2, var23, (byte) 107);
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field4522 = class163.field2332.method1407(104);
            arg2.field4582 = class163.field2332.method1392(-30);
            arg2.field4560 = class163.field2332.method1362(5);
            arg2.field4566 = class163.field2332.method1392(-38);
            arg2.field4564 = class163.field2332.method1400(false) + class198.field2819;
            arg2.field4515 = class163.field2332.method1400(false) + class198.field2819;
            arg2.field4570 = class163.field2332.method1362(5);
            arg2.field4603 = 1;
            arg2.field4554 = 0;
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field4596 = class163.field2332.method1352((byte) 86);
            if (arg2.field4596.charAt(0) == '~') {
                arg2.field4596 = arg2.field4596.substring(1);
                class225.method1455(arg2.field4596, -127, arg2.method1557(104), 2);
            } else if (class177.field2507 == arg2) {
                class225.method1455(arg2.field4596, -127, arg2.method1557(104), 2);
            }
            arg2.field4525 = 150;
            arg2.field4517 = 0;
            arg2.field4514 = 0;
        }
        if ((arg3 & 0x80) == 0) {
            return;
        }
        int var24 = class163.field2332.method1385(2);
        int var25 = class163.field2332.method1392(-45);
        int var26 = class163.field2332.method1407(110);
        boolean var27 = (var24 & 0x8000) != 0;
        int var28 = class163.field2332.field3021;
        if (arg2.field3466 != null && arg2.field3468 != null) {
            long var29 = class60.method370((byte) -8, arg2.field3466);
            boolean var31 = false;
            if (var25 <= 1) {
                if (!var27 && (class252.field3647 && !class143.field2048 || class44.field527)) {
                    var31 = true;
                } else {
                    for (int var32 = 0; var32 < class185.field2675; var32++) {
                        if (class209.field2945[var32] == var29) {
                            var31 = true;
                            break;
                        }
                    }
                }
            }
            if (!var31 && class246.field3572 == 0) {
                class16.field196.field3021 = 0;
                class163.field2332.method1398(0, (byte) -37, var26, class16.field196.field3030);
                int var33 = -1;
                class16.field196.field3021 = 0;
                String var35;
                if (var27) {
                    var24 &= 0x7FFF;
                    class23 var34 = class6.method33(class16.field196, (byte) 108);
                    var33 = var34.field277;
                    var35 = var34.field285.method1460((byte) 111, class16.field196);
                } else {
                    var35 = class89.method532(class127.method832(true, class224.method1449(-110, class16.field196)));
                }
                arg2.field4596 = var35.trim();
                arg2.field4514 = var24 & 0xFF;
                arg2.field4525 = 150;
                arg2.field4517 = var24 >> 8;
                if (var25 == 2) {
                    class21.method125(var35, "<img=1>" + arg2.method1557(104), var27 ? 17 : 1, (String) null, (byte) -86, var33);
                } else if (var25 == 1) {
                    class21.method125(var35, "<img=0>" + arg2.method1557(104), var27 ? 17 : 1, (String) null, (byte) -86, var33);
                } else {
                    class21.method125(var35, arg2.method1557(104), var27 ? 17 : 2, (String) null, (byte) -86, var33);
                }
            }
        }
        class163.field2332.field3021 = var26 + var28;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
    public static final void method1669() {
        if (class74.field889 != null) {
            for (int var0 = 0; var0 < class74.field889.length; var0++) {
                for (int var1 = 0; var1 < class268.field3922; var1++) {
                    for (int var2 = 0; var2 < class97.field1292; var2++) {
                        class74.field889[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class133.field1943 != null) {
            for (int var3 = 0; var3 < class133.field1943.length; var3++) {
                for (int var4 = 0; var4 < class268.field3922; var4++) {
                    for (int var5 = 0; var5 < class97.field1292; var5++) {
                        class133.field1943[var3][var4][var5] = null;
                    }
                }
            }
        }
        class193.field2775 = 0;
        if (class181.field2577 != null) {
            for (int var6 = 0; var6 < class193.field2775; var6++) {
                class181.field2577[var6] = null;
            }
        }
        if (class293.field4632 != null) {
            for (int var7 = 0; var7 < class200.field2845; var7++) {
                class293.field4632[var7] = null;
            }
            class200.field2845 = 0;
        }
        if (class222.field3140 != null) {
            for (int var8 = 0; var8 < class222.field3140.length; var8++) {
                class222.field3140[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lbc;ILbc;Lbc;Lbc;)V")
    public static final void method1670(class282 arg0, int arg1, class282 arg2, class282 arg3, class282 arg4) {
        field3794++;
        class181.field2578 = arg4;
        class54.field639 = arg3;
        class5.field63 = arg0;
        int var5 = -99 % ((arg1 + 53) / 55);
        class219.field3110 = arg2;
        class123.field1767 = new class82[class5.field63.method1856(-126)][];
        class60.field719 = new boolean[class5.field63.method1856(-117)];
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V")
    public static void method1671(boolean arg0) {
        field3791 = null;
        if (!arg0) {
            field3791 = null;
        }
        field3801 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lbc;I)V")
    public static final void method1672(class282 arg0, int arg1) {
        if (arg1 < 47) {
            field3795 = -20;
        }
        field3798++;
        class204.field2905 = arg0;
    }
}
