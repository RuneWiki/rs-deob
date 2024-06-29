import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class51 extends class425 {

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "S")
    public short field662;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Z")
    public static boolean field664 = true;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "Z")
    public static boolean field666 = false;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public static int field665 = -1;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
    public static final void method333(boolean arg0) {
        field663++;
        if (class253.method1759(123) != 2) {
            return;
        }
        byte var1 = (byte) (class265.field3897 - 4 & 0xFF);
        int var2 = class265.field3897 % class80.field1034;
        int var3 = 0;
        if (!arg0) {
            method335(-71, (class219) null);
        }
        while (var3 < 4) {
            for (int var16 = 0; var16 < class381.field5414; var16++) {
                class32.field398[var3][var2][var16] = var1;
            }
            var3++;
        }
        if (class158.field2302 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class370.field5263[var4] = -1000000;
            class147.field2189[var4] = 1000000;
            class327.field4744[var4] = 0;
            class59.field794[var4] = 1000000;
            class357.field5168[var4] = 0;
        }
        if (class336.field4878 != 1) {
            int var15 = class452.method2820(class158.field2302, class417.field5999, false, class386.field5469);
            if (var15 - class249.field3707 >= 800 || (class320.field4692[class158.field2302][class386.field5469 >> 7][class417.field5999 >> 7] & 0x4) == 0) {
                return;
            }
            class352.method2304(4095, class386.field5469 >> 7, class385.field5449, class417.field5999 >> 7, 1, false);
            return;
        }
        if ((class320.field4692[class158.field2302][class181.field2555.field4463 >> 7][class181.field2555.field4466 >> 7] & 0x4) != 0) {
            class352.method2304(4095, class181.field2555.field4463 >> 7, class385.field5449, class181.field2555.field4466 >> 7, 0, false);
        }
        if (class319.field4676 >= 2560) {
            return;
        }
        int var5 = class386.field5469 >> 7;
        int var6 = class417.field5999 >> 7;
        int var7 = class181.field2555.field4463 >> 7;
        int var8 = class181.field2555.field4466 >> 7;
        int var9;
        if (var7 <= var5) {
            var9 = var5 - var7;
        } else {
            var9 = var7 - var5;
        }
        int var10;
        if (var6 >= var8) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        if ((var9 != 0 || var10 != 0) && (-class80.field1034) < var9 && class80.field1034 > var9 && var10 > (-class381.field5414) && var10 < class381.field5414) {
            if (var10 >= var9) {
                int var11 = var9 * 65536 / var10;
                int var12 = 32768;
                while (var6 != var8) {
                    if (var8 > var6) {
                        var6++;
                    } else if (var6 > var8) {
                        var6--;
                    }
                    if ((class320.field4692[class158.field2302][var5][var6] & 0x4) != 0) {
                        class352.method2304(4095, var5, class385.field5449, var6, 1, false);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var7 > var5) {
                            var5++;
                        } else if (var5 > var7) {
                            var5--;
                        }
                        if ((class320.field4692[class158.field2302][var5][var6] & 0x4) != 0) {
                            class352.method2304(4095, var5, class385.field5449, var6, 1, false);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var10 * 65536 / var9;
            int var14 = 32768;
            while (var5 != var7) {
                if (var5 < var7) {
                    var5++;
                } else if (var7 < var5) {
                    var5--;
                }
                if ((class320.field4692[class158.field2302][var5][var6] & 0x4) != 0) {
                    class352.method2304(4095, var5, class385.field5449, var6, 1, false);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var6 < var8) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    if ((class320.field4692[class158.field2302][var5][var6] & 0x4) != 0) {
                        class352.method2304(4095, var5, class385.field5449, var6, 1, false);
                        return;
                    }
                }
            }
            return;
        }
        class334.method2191(arg0, "RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class306.field4459 + "," + class342.field4959, (Throwable) null);
        return;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([B[Lqr;ZILvq;II)V")
    public static final void method334(byte[] arg0, class41[] arg1, boolean arg2, int arg3, class269 arg4, int arg5, int arg6) {
        int var7 = -27 % ((-arg6 - 23) / 33);
        field667++;
        class130 var8 = new class130(arg0);
        int var9 = -1;
        while (true) {
            int var10 = var8.method813(-1);
            if (var10 == 0) {
                return;
            }
            var9 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var8.method854(3944);
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 0x3F;
                int var14 = (var11 & 0xFF3) >> 6;
                int var15 = var11 >> 12;
                int var16 = var8.method837(true);
                int var17 = var16 >> 2;
                int var18 = var16 & 0x3;
                int var19 = var14 + arg3;
                int var20 = var13 + arg5;
                if (var19 > 0 && var20 > 0 && class80.field1034 - 1 > var19 && var20 < class381.field5414 - 1) {
                    class41 var21 = null;
                    if (!arg2) {
                        int var22 = var15;
                        if ((class320.field4692[1][var19][var20] & 0x2) == 2) {
                            var22 = var15 - 1;
                        }
                        if (var22 >= 0) {
                            var21 = arg1[var22];
                        }
                    }
                    class3.method7(-1, var9, var21, var20, true, var19, var17, var15, 91, arg4, var18, arg2, var15);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class51() {
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILml;)V")
    public static final void method335(int arg0, class219 arg1) {
        field661++;
        class355.field5139 = 3;
        class238.method1625(true, -125);
        class266.field3910 = 127;
        class79.field1027 = true;
        class358.field5172 = true;
        class26.field339 = 0;
        class181.field2561 = true;
        class233.field3451 = 0;
        class247.field3703 = true;
        class120.field1626 = true;
        class145.field2183 = 0;
        class170.field2398 = 127;
        field664 = true;
        class189.field2714 = true;
        class291.field4225 = 0;
        class194.field2802 = 2;
        class103.field1326 = true;
        class145.field2182 = 1;
        class131.field1914 = 255;
        class125.field1678 = true;
        class266.field3908 = true;
        if (class306.field4461 < 96) {
            class230.method1595(-87, 0);
        } else {
            class230.method1595(arg0 - 108, 2);
        }
        class84.field1077 = true;
        class68.field910 = 0;
        class220.field3168 = 2;
        class374.field5319 = 2;
        class338.field4903 = false;
        class70.field930 = class409.field5869 == 1 ? 2 : 4;
        class255.field3795 = false;
        class324.field4717 = true;
        class24.field304 = false;
        class393.field5523 = 0;
        class443 var2 = null;
        try {
            class156 var3 = arg1.method1525(arg0);
            while (var3.field2298 == 0) {
                class259.method1790((byte) -92, 1L);
            }
            if (var3.field2298 == 1) {
                var2 = (class443) var3.field2295;
                byte[] var4 = new byte[(int) var2.method2765(arg0)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method2767(true, var4, var5, var4.length - var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class430.method2681(32203, new class130(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2762(-1);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(S)V")
    public class51(short arg0) {
        this.field662 = arg0;
    }
}
