import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class101 extends class120 {

    @OriginalMember(owner = "client!ng", name = "hb", descriptor = "Z")
    private boolean field1451 = true;

    @OriginalMember(owner = "client!ng", name = "ib", descriptor = "Z")
    private boolean field1452 = true;

    @OriginalMember(owner = "client!ng", name = "T", descriptor = "Z")
    public static volatile boolean field1437 = true;

    @OriginalMember(owner = "client!ng", name = "U", descriptor = "Lok;")
    public static class41 field1438 = class137.method956(" steht bereits auf Ihrer Freunde)2Liste(Q", 45);

    @OriginalMember(owner = "client!ng", name = "X", descriptor = "[I")
    public static int[] field1441 = new int[32768];

    @OriginalMember(owner = "client!ng", name = "bb", descriptor = "I")
    public static int field1445 = 0;

    @OriginalMember(owner = "client!ng", name = "cb", descriptor = "Lok;")
    public static class41 field1446 = class137.method956("(U0a )2 via: ", 45);

    @OriginalMember(owner = "client!ng", name = "kb", descriptor = "Lok;")
    private static class41 field1454 = class137.method956("Loading config )2 ", 45);

    @OriginalMember(owner = "client!ng", name = "ab", descriptor = "Lok;")
    public static class41 field1444 = field1454;

    @OriginalMember(owner = "client!ng", name = "db", descriptor = "F")
    public static float field1447;

    @OriginalMember(owner = "client!ng", name = "V", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!ng", name = "W", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!ng", name = "Z", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!ng", name = "eb", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!ng", name = "fb", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!ng", name = "gb", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!ng", name = "jb", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ng", name = "lb", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!ng", name = "Y", descriptor = "[I")
    public static int[] field1442;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)[I", line = 5)
    public final int[] method14(int arg0, int arg1) {
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (arg1 != -14959) {
            field1447 = -1.0179473F;
        }
        field1449++;
        if (this.field1775.field1798) {
            int[] var4 = this.method854(0, this.field1452 ? class27.field410 - arg0 : arg0, -24059);
            if (this.field1451) {
                for (int var5 = 0; var5 < class307.field5160; var5++) {
                    var3[var5] = var4[class51.field776 - var5];
                }
            } else {
                class21.method146(var4, 0, var3, 0, class307.field5160);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)V", line = 47)
    public static void method703(int arg0) {
        field1441 = null;
        field1438 = null;
        field1446 = null;
        field1444 = null;
        field1454 = null;
        if (arg0 < 64) {
            method703(120);
        }
        field1442 = null;
    }

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "(I)Z", line = 75)
    public static final boolean method704(int arg0) {
        if (arg0 != 10) {
            method708(17, 27, -32, -127, -13, 40, -6, 56);
        }
        field1439++;
        if (class111.field1579) {
            try {
                class224.field3593.method297(class138.field2065.field3390, arg0 ^ 0xFFFF9EB6);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(B)V", line = 102)
    public static final void method705(byte arg0) {
        class164.field2597.method839(11892);
        if (arg0 != 44) {
            field1442 = (int[]) null;
        }
        field1448++;
        int var1 = class164.field2597.method849(8, 38);
        if (var1 < class97.field1419) {
            for (int var2 = var1; var2 < class97.field1419; var2++) {
                class239.field3834[class65.field997++] = field1441[var2];
            }
        }
        if (var1 > class97.field1419) {
            throw new RuntimeException("gnpov1");
        }
        class97.field1419 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field1441[var3];
            class50 var5 = class216.field3471[var4];
            int var6 = class164.field2597.method849(1, 38);
            if (var6 == 0) {
                field1441[class97.field1419++] = var4;
                var5.field4294 = class18.field234;
            } else {
                int var7 = class164.field2597.method849(2, 38);
                if (var7 == 0) {
                    field1441[class97.field1419++] = var4;
                    var5.field4294 = class18.field234;
                    class241.field3853[class85.field1239++] = var4;
                } else if (var7 == 1) {
                    field1441[class97.field1419++] = var4;
                    var5.field4294 = class18.field234;
                    int var8 = class164.field2597.method849(3, 38);
                    var5.method1903(false, var8, -104);
                    int var9 = class164.field2597.method849(1, 38);
                    if (var9 == 1) {
                        class241.field3853[class85.field1239++] = var4;
                    }
                } else if (var7 == 2) {
                    field1441[class97.field1419++] = var4;
                    var5.field4294 = class18.field234;
                    int var10 = class164.field2597.method849(3, 38);
                    var5.method1903(true, var10, 60);
                    int var11 = class164.field2597.method849(3, arg0 ^ 0xA);
                    var5.method1903(true, var11, -112);
                    int var12 = class164.field2597.method849(1, 38);
                    if (var12 == 1) {
                        class241.field3853[class85.field1239++] = var4;
                    }
                } else if (var7 == 3) {
                    class239.field3834[class65.field997++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(IZ)V", line = 206)
    public static final void method706(int arg0, boolean arg1) {
        field1453++;
        if (arg0 != Integer.MAX_VALUE) {
            return;
        }
        int var2 = class14.field187.length;
        byte[][] var3;
        if (class166.field2625 && arg1) {
            var3 = class124.field1840;
        } else {
            var3 = class60.field887;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            byte[] var5 = var3[var4];
            if (var5 != null) {
                int var6 = (class110.field1557[var4] & 0xFF) * 64 - class55.field809;
                int var7 = (class110.field1557[var4] >> 8) * 64 - class88.field1300;
                class234.method1685(-20783);
                class126.method887(var7, var5, 32410, class222.field3548, var6, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "(I)V", line = 257)
    public static final void method707(int arg0) {
        field1455++;
        if (arg0 <= 44) {
            field1445 = 22;
        }
        class60.field862.method131(-2);
        class2.field19.method131(-2);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIII)V", line = 271)
    public static final void method708(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = -124 % ((-arg3 - 68) / 41);
        if (arg6 >= 0 && arg5 >= 0 && arg6 < 103 && arg5 < 103) {
            if (arg2 == 0) {
                class241 var9 = class285.method2002(arg4, arg6, arg5);
                if (var9 != null) {
                    int var10 = (int) (var9.field3856 >>> 32) & Integer.MAX_VALUE;
                    if (arg1 == 2) {
                        var9.field3864 = new class272(var10, 2, arg7 + 4, arg4, arg6, arg5, arg0, false, var9.field3864);
                        var9.field3854 = new class272(var10, 2, arg7 + 1 & 0x3, arg4, arg6, arg5, arg0, false, var9.field3854);
                    } else {
                        var9.field3864 = new class272(var10, arg1, arg7, arg4, arg6, arg5, arg0, false, var9.field3864);
                    }
                }
            }
            if (arg2 == 1) {
                class198 var11 = class298.method2052(arg4, arg6, arg5);
                if (var11 != null) {
                    int var12 = (int) (var11.field3184 >>> 32) & Integer.MAX_VALUE;
                    if (arg1 == 4 || arg1 == 5) {
                        var11.field3177 = new class272(var12, 4, arg7, arg4, arg6, arg5, arg0, false, var11.field3177);
                    } else if (arg1 == 6) {
                        var11.field3177 = new class272(var12, 4, arg7 + 4, arg4, arg6, arg5, arg0, false, var11.field3177);
                    } else if (arg1 == 7) {
                        var11.field3177 = new class272(var12, 4, (arg7 + 2 & 0x3) + 4, arg4, arg6, arg5, arg0, false, var11.field3177);
                    } else if (arg1 == 8) {
                        var11.field3177 = new class272(var12, 4, arg7 + 4, arg4, arg6, arg5, arg0, false, var11.field3177);
                        var11.field3176 = new class272(var12, 4, (arg7 + 2 & 0x3) + 4, arg4, arg6, arg5, arg0, false, var11.field3176);
                    }
                }
            }
            if (arg2 == 2) {
                class232 var13 = class128.method897(arg4, arg6, arg5);
                if (arg1 == 11) {
                    arg1 = 10;
                }
                if (var13 != null) {
                    var13.field3674 = new class272(Integer.MAX_VALUE & (int) (var13.field3672 >>> 32), arg1, arg7, arg4, arg6, arg5, arg0, false, var13.field3674);
                }
            }
            if (arg2 == 3) {
                class107 var14 = class241.method1728(arg4, arg6, arg5);
                if (var14 != null) {
                    var14.field1499 = new class272((int) (var14.field1508 >>> 32) & Integer.MAX_VALUE, 22, arg7, arg4, arg6, arg5, arg0, false, var14.field1499);
                }
            }
        }
        field1440++;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V", line = 359)
    public class101() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Llb;II)V", line = 364)
    public final void method30(class112 arg0, int arg1, int arg2) {
        field1450++;
        if (arg1 != -1) {
            method703(-5);
        }
        if (arg2 == 0) {
            this.field1451 = arg0.method792(2) == 1;
        } else if (arg2 == 1) {
            this.field1452 = arg0.method792(2) == 1;
        } else if (arg2 == 2) {
            this.field1770 = arg0.method792(2) == 1;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(IZ)[[I", line = 420)
    public final int[][] method168(int arg0, boolean arg1) {
        field1443++;
        if (!arg1) {
            field1441 = (int[]) null;
        }
        int[][] var3 = this.field1764.method876(arg1, arg0);
        if (this.field1764.field1836) {
            int[][] var4 = this.method858(0, this.field1452 ? class27.field410 - arg0 : arg0, 127);
            int[] var5 = var3[0];
            int[] var6 = var4[1];
            int[] var7 = var4[0];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            if (this.field1451) {
                for (int var11 = 0; var11 < class307.field5160; var11++) {
                    var5[var11] = var7[class51.field776 - var11];
                    var10[var11] = var6[class51.field776 - var11];
                    var9[var11] = var8[class51.field776 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class307.field5160; var12++) {
                    var5[var12] = var7[var12];
                    var10[var12] = var6[var12];
                    var9[var12] = var8[var12];
                }
            }
        }
        return var3;
    }
}
