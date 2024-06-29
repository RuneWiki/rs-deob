import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class94 {

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public int field1369;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public int field1367;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "S")
    public short field1380;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public int field1374;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "S")
    public short field1372;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public int field1375;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "S")
    public short field1364;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "B")
    public byte field1379;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "B")
    public byte field1376;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public int field1368;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "Z")
    public boolean field1362;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Lbi;")
    public static class104 field1363 = new class104(15, 4);

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
    public static int field1382 = 0;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "F")
    public static float field1366;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "[[B")
    public static byte[][] field1365;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)V")
    public static final void method642(int arg0, boolean arg1) {
        field1370++;
        if (arg1 && class194.field2863 != null) {
            class496.field7470 = class194.field2863.field4164;
        } else {
            class496.field7470 = -1;
        }
        class204.field3125 = null;
        class213.field3643 = 0;
        class541.field7908 = null;
        class194.field2863 = null;
        class194.method1227();
        class194.field2876.method2120((byte) 27);
        class399.field6037 = null;
        class484.field7357 = -1;
        class416.field6308 = null;
        class6.field71 = -1;
        class85.field1245 = null;
        class194.field2874 = null;
        class350.field5418 = null;
        class526.field7755 = null;
        class143.field1929 = null;
        class236.field3870 = null;
        class39.field386 = null;
        class523.field7736 = null;
        class194.field2866.method663(false);
        class194.field2869.method2743(64, 64, (byte) -14);
        class194.field2866.method661(64, 128, 2);
        if (arg0 == 17795) {
            class194.field2871.method3006(64, 64);
            class197.field3037.method764((byte) 19, 64);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static final void method643(int arg0) {
        field1381++;
        if (arg0 != 15831) {
            method645((byte) -36);
        }
        class409.field6204 = false;
        class346.method2292(class201.field3054, 0, class521.field7715, class64.field1007, class296.field4670);
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)Lsp;")
    public static final class525 method644(int arg0) {
        field1378++;
        try {
            if (arg0 != -898) {
                method647(122, null);
            }
            return (class525) Class.forName("le").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
    public static void method645(byte arg0) {
        field1363 = null;
        if (arg0 == -114) {
            field1365 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field1369 = arg1;
        this.field1367 = arg3;
        this.field1380 = (short) arg5;
        this.field1374 = arg2;
        this.field1372 = (short) arg4;
        this.field1375 = arg11;
        this.field1364 = (short) arg6;
        this.field1379 = (byte) arg8;
        this.field1376 = (byte) arg7;
        this.field1368 = arg0;
        this.field1362 = arg10;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V")
    public static final void method646(byte arg0) {
        field1377++;
        class148.method905();
        for (int var1 = 0; var1 < 4; var1++) {
            class352.field5488[var1].method1907(43);
        }
        class187.method1172(true);
        class54.method410(20250);
        System.gc();
        if (arg0 < 75) {
            method647(-10, null);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILtq;)V")
    public static final void method647(int arg0, class276 arg1) {
        field1373++;
        arg1.method1860((byte) -128);
        int var2 = 0;
        for (int var3 = 0; var3 < class234.field3861; var3++) {
            int var15 = class21.field245[var3];
            if ((class310.field4853[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class310.field4853[var15] = (byte) class410.method2621(class310.field4853[var15], 2);
                } else {
                    int var16 = arg1.method1852(115, 1);
                    if (var16 == 0) {
                        var2 = class258.method1758(arg1, arg0);
                        class310.field4853[var15] = (byte) class410.method2621(class310.field4853[var15], 2);
                    } else {
                        class538.method3188(var15, (byte) 89, arg1);
                    }
                }
            }
        }
        arg1.method1854((byte) 81);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method1860((byte) -100);
        for (int var4 = 0; var4 < class234.field3861; var4++) {
            int var13 = class21.field245[var4];
            if ((class310.field4853[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class310.field4853[var13] = (byte) class410.method2621(class310.field4853[var13], 2);
                    var2--;
                } else {
                    int var14 = arg1.method1852(arg0 ^ 0x75, 1);
                    if (var14 == 0) {
                        var2 = class258.method1758(arg1, arg0);
                        class310.field4853[var13] = (byte) class410.method2621(class310.field4853[var13], 2);
                    } else {
                        class538.method3188(var13, (byte) 98, arg1);
                    }
                }
            }
        }
        arg1.method1854((byte) 65);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method1860((byte) -107);
        for (int var5 = 0; var5 < class242.field3931; var5++) {
            int var11 = class260.field4199[var5];
            if ((class310.field4853[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class310.field4853[var11] = (byte) class410.method2621(class310.field4853[var11], 2);
                    var2--;
                } else {
                    int var12 = arg1.method1852(99, 1);
                    if (var12 == 0) {
                        var2 = class258.method1758(arg1, 0);
                        class310.field4853[var11] = (byte) class410.method2621(class310.field4853[var11], 2);
                    } else if (class140.method853(-345, var11, arg1)) {
                        class310.field4853[var11] = (byte) class410.method2621(class310.field4853[var11], 2);
                    }
                }
            }
        }
        arg1.method1854((byte) 91);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method1860((byte) -91);
        for (int var6 = arg0; var6 < class242.field3931; var6++) {
            int var9 = class260.field4199[var6];
            if ((class310.field4853[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class310.field4853[var9] = (byte) class410.method2621(class310.field4853[var9], 2);
                } else {
                    int var10 = arg1.method1852(109, 1);
                    if (var10 == 0) {
                        var2 = class258.method1758(arg1, 0);
                        class310.field4853[var9] = (byte) class410.method2621(class310.field4853[var9], 2);
                    } else if (class140.method853(-345, var9, arg1)) {
                        class310.field4853[var9] = (byte) class410.method2621(class310.field4853[var9], 2);
                    }
                }
            }
        }
        arg1.method1854((byte) 51);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class242.field3931 = 0;
        class234.field3861 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class310.field4853[var7] = (byte) (class310.field4853[var7] >> 1);
            class350 var8 = class264.field4276[var7];
            if (var8 == null) {
                class260.field4199[class242.field3931++] = var7;
            } else {
                class21.field245[class234.field3861++] = var7;
            }
        }
    }
}
