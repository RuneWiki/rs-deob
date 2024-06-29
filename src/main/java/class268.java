import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class268 extends InputStream {

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "J")
    public static long field4410 = 0L;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "Lui;")
    public static class98 field4419 = new class98(32);

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    public static int field4421 = 0;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "Ljo;")
    public static class150 field4420 = new class150();

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "Lui;")
    public static class98 field4422 = new class98(5);

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Lnm;")
    public static class221 field4406;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILsi;)Lsi;", line = 5)
    public static final class264 method1886(int arg0, class264 arg1) {
        field4417++;
        if (arg1.field4201 != -1) {
            return class94.method629(5386, arg1.field4201);
        }
        int var2 = arg1.field4204 >>> 16;
        class327 var3 = new class327(class218.field3363);
        int var4 = 0 / ((arg0 - 83) / 33);
        for (class167 var5 = (class167) var3.method2332(0); var5 != null; var5 = (class167) var3.method2331((byte) 111)) {
            if (var5.field2631 == var2) {
                return class94.method629(5386, (int) var5.field2549);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lsi;IIIBIIILjava/lang/String;Luj;)V", line = 42)
    public static final void method1887(class264 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, String arg8, class175 arg9) {
        field4413++;
        int var10 = arg1 * arg1 + arg2 * arg2;
        int var11 = (int) class355.field5628 + class322.field5284 & 0x7FF;
        int var12 = Math.max(arg0.field4223 / 2, arg0.field4236 / 2) + 10;
        if (var12 * var12 < var10) {
            return;
        }
        int var13 = class272.field4480[var11];
        int var14 = class272.field4470[var11];
        int var15 = var14 * 256 / (class196.field3008 + 256);
        int var16 = var13 * 256 / (class196.field3008 + 256);
        int var17 = arg1 * var15 + arg2 * var16 >> 16;
        int var18 = arg9.method1223(arg8, 100);
        int var19 = var17 - var18 / 2;
        if (arg4 != 37) {
            field4410 = -99L;
        }
        int var20 = arg9.method1228(arg8, 100, 0);
        int var21 = arg1 * var16 - arg2 * var15 >> 16;
        if (var19 < -arg0.field4223 || arg0.field4223 < var19 || var21 < (-arg0.field4236) || arg0.field4236 < var21) {
            return;
        }
        if (class245.field3886) {
            class335.method2366((class232) arg0.method1859(-1, false));
        } else {
            class317.method2278(arg0.field4260, arg0.field4338);
        }
        arg9.method1210(arg8, arg7 + (arg0.field4223 / 2) + var19, arg0.field4236 / 2 + -var21 + arg3 + -var20 + -arg5, var18, 50, arg6, 0, 256, 1, 0, 0);
        if (class245.field3886) {
            class335.method2368();
        } else {
            class317.method2272();
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIBZZ)V", line = 93)
    public static final void method1888(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, boolean arg6) {
        field4414++;
        if (arg2 < arg0) {
            int var7 = arg2;
            int var8 = (arg0 + arg2) / 2;
            class201 var9 = class105.field1524[var8];
            class105.field1524[var8] = class105.field1524[arg0];
            class105.field1524[arg0] = var9;
            for (int var10 = arg2; var10 < arg0; var10++) {
                if (class118.method764(-34, arg6, arg5, arg1, arg3, class105.field1524[var10], var9) <= 0) {
                    class201 var11 = class105.field1524[var10];
                    class105.field1524[var10] = class105.field1524[var7];
                    class105.field1524[var7++] = var11;
                }
            }
            class105.field1524[arg0] = class105.field1524[var7];
            class105.field1524[var7] = var9;
            method1888(var7 - 1, arg1, arg2, arg3, (byte) 72, arg5, arg6);
            method1888(arg0, arg1, var7 + 1, arg3, (byte) 109, arg5, arg6);
        }
        int var12 = -9 % ((-arg4 - 14) / 54);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V", line = 140)
    public static final void method1889(int arg0) {
        field4418++;
        class148.field2390.method644((byte) -116);
        class182.field2831.method644((byte) -126);
        class29.field437.method644((byte) -56);
        class172.field2680.method644((byte) -66);
        if (arg0 != -29506) {
            field4422 = (class98) null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "read", descriptor = "()I", line = 157)
    public final int read() {
        class177.method1246(30000L, -32644);
        field4407++;
        return -1;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V", line = 167)
    public static void method1890(int arg0) {
        field4422 = null;
        field4406 = null;
        field4419 = null;
        field4420 = null;
        if (arg0 != 9) {
            field4421 = -110;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V", line = 180)
    public static final void method1891(boolean arg0) {
        field4411++;
        if (!arg0) {
            method1886(-29, (class264) null);
        }
        class312.field5086.method644((byte) -113);
        class213.field3246.method644((byte) -82);
        class69.field1069.method644((byte) -60);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)Lie;", line = 193)
    public static final class3 method1892(int arg0, int arg1) {
        if (arg1 >= -39) {
            field4406 = (class221) null;
        }
        field4409++;
        if (arg0 == 0) {
            return new class285();
        } else if (arg0 == 1) {
            return new class27();
        } else if (arg0 == 2) {
            return new class78();
        } else if (arg0 == 3) {
            return new class140();
        } else if (arg0 == 4) {
            return new class46();
        } else if (arg0 == 5) {
            return new class41();
        } else if (arg0 == 6) {
            return new class163();
        } else if (arg0 == 7) {
            return new class25();
        } else if (arg0 == 8) {
            return new class60();
        } else if (arg0 == 9) {
            return new class310();
        } else if (arg0 == 10) {
            return new class166();
        } else if (arg0 == 11) {
            return new class132();
        } else if (arg0 == 12) {
            return new class170();
        } else if (arg0 == 13) {
            return new class152();
        } else if (arg0 == 14) {
            return new class165();
        } else if (arg0 == 15) {
            return new class153();
        } else if (arg0 == 16) {
            return new class283();
        } else if (arg0 == 17) {
            return new class89();
        } else if (arg0 == 18) {
            return new class334();
        } else if (arg0 == 19) {
            return new class161();
        } else if (arg0 == 20) {
            return new class53();
        } else if (arg0 == 21) {
            return new class17();
        } else if (arg0 == 22) {
            return new class125();
        } else if (arg0 == 23) {
            return new class195();
        } else if (arg0 == 24) {
            return new class31();
        } else if (arg0 == 25) {
            return new class361();
        } else if (arg0 == 26) {
            return new class322();
        } else if (arg0 == 27) {
            return new class242();
        } else if (arg0 == 28) {
            return new class319();
        } else if (arg0 == 29) {
            return new class130();
        } else if (arg0 == 30) {
            return new class294();
        } else if (arg0 == 31) {
            return new class300();
        } else if (arg0 == 32) {
            return new class261();
        } else if (arg0 == 33) {
            return new class157();
        } else if (arg0 == 34) {
            return new class215();
        } else if (arg0 == 35) {
            return new class6();
        } else if (arg0 == 36) {
            return new class243();
        } else if (arg0 == 37) {
            return new class26();
        } else if (arg0 == 38) {
            return new class51();
        } else if (arg0 == 39) {
            return new class75();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V", line = 518)
    public static final void method1893(int arg0) {
        int var1 = class159.field2552.method246(8, 8);
        if (class38.field561 > var1) {
            for (int var2 = var1; var2 < class38.field561; var2++) {
                class292.field4846[class153.field2485++] = class150.field2410[var2];
            }
        }
        if (arg0 > -60) {
            return;
        }
        field4415++;
        if (class38.field561 < var1) {
            throw new RuntimeException("gppov1");
        }
        class38.field561 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class150.field2410[var3];
            class39 var5 = class130.field1984[var4];
            int var6 = class159.field2552.method246(8, 1);
            if (var6 == 0) {
                class150.field2410[class38.field561++] = var4;
                var5.field4743 = class58.field875;
            } else {
                int var7 = class159.field2552.method246(8, 2);
                if (var7 == 0) {
                    class150.field2410[class38.field561++] = var4;
                    var5.field4743 = class58.field875;
                    class166.field2611[class99.field1440++] = var4;
                } else if (var7 == 1) {
                    class150.field2410[class38.field561++] = var4;
                    var5.field4743 = class58.field875;
                    int var12 = class159.field2552.method246(8, 3);
                    var5.method2036(1, 74, var12);
                    int var13 = class159.field2552.method246(8, 1);
                    if (var13 == 1) {
                        class166.field2611[class99.field1440++] = var4;
                    }
                } else if (var7 == 2) {
                    class150.field2410[class38.field561++] = var4;
                    var5.field4743 = class58.field875;
                    if (class159.field2552.method246(8, 1) == 1) {
                        int var8 = class159.field2552.method246(8, 3);
                        var5.method2036(2, 106, var8);
                        int var9 = class159.field2552.method246(8, 3);
                        var5.method2036(2, 114, var9);
                    } else {
                        int var10 = class159.field2552.method246(8, 3);
                        var5.method2036(0, 118, var10);
                    }
                    int var11 = class159.field2552.method246(8, 1);
                    if (var11 == 1) {
                        class166.field2611[class99.field1440++] = var4;
                    }
                } else if (var7 == 3) {
                    class292.field4846[class153.field2485++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)I", line = 640)
    public static final int method1894(int arg0, int arg1, int arg2) {
        field4405++;
        int var3 = 44 / ((38 - arg0) / 55);
        int var4 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var4 = arg2 * var4;
            }
            arg1 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg1 == 1) {
            return arg2 * var4;
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lge;IIIIIZZZ)Llj;", line = 669)
    public static final class289 method1895(class340 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7, boolean arg8) {
        field4412++;
        class109 var9 = class322.method2311(arg3, -123);
        if (arg1 > 1 && var9.field1587 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1604[var11] && var9.field1604[var11] != 0) {
                    var10 = var9.field1587[var11];
                }
            }
            if (var10 != -1) {
                var9 = class322.method2311(var10, -107);
            }
        }
        class67 var12 = var9.method721(arg0, 16870);
        if (var12 == null) {
            return null;
        }
        class137 var13 = null;
        if (var9.field1555 != -1) {
            var13 = (class137) method1895(arg0, 10, -120, var9.field1580, 0, 1, true, false, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1557 != -1) {
            var13 = (class137) method1895(arg0, arg1, -37, var9.field1567, arg4, arg5, true, false, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class317.field5228;
        int var15 = class317.field5231;
        int var16 = class317.field5227;
        int[] var17 = new int[4];
        class317.method2269(var17);
        class137 var18 = new class137(36, 32);
        class317.method2280(var18.field2172, 36, 32);
        class272.method1915();
        class272.method1924(16, 16);
        class272.field4479 = false;
        int var19 = var9.field1610;
        if (arg8) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg5 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class272.field4480[var9.field1562] * var19 >> 16;
        int var21 = class272.field4470[var9.field1562] * var19 >> 16;
        var12.method182(0, var9.field1579, var9.field1549, var9.field1562, var9.field1559, var21 + var9.field1578 - (var12.method192() / 2), var20 - -var9.field1578, -1L);
        if (arg5 >= 1) {
            var18.method965(1);
            if (arg5 >= 2) {
                var18.method965(16777215);
            }
            class317.method2280(var18.field2172, 36, 32);
        }
        if (arg4 != 0) {
            var18.method951(arg4);
        }
        if (var9.field1555 != -1) {
            var13.method945(0, 0);
        } else if (var9.field1557 != -1) {
            class317.method2280(var13.field2172, 36, 32);
            var18.method945(0, 0);
            var18 = var13;
        }
        if (arg7 && (var9.field1565 == 1 || arg1 != 1) && arg1 != -1) {
            class265.field4365.method1232(class227.method1540((byte) 96, arg1), 0, 9, 16776960, 1);
        }
        class317.method2280(var14, var15, var16);
        class317.method2289(var17);
        class272.method1915();
        class272.field4479 = true;
        if (arg2 > -32) {
            method1888(55, 53, 108, -25, (byte) -96, true, true);
        }
        return class245.field3886 && !arg6 ? new class232(var18) : var18;
    }
}
