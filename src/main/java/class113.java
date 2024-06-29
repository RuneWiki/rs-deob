import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class class113 extends class128 {

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
    public static int field1884 = 0;

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
    public static int field1891 = 1;

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "S")
    public static short field1892 = 320;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "Llm;")
    public static class57 field1886 = new class57(0, -1);

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "Ljg;")
    public static class326 field1889;

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "Lnn;")
    public static class45 field1887;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V", line = 5)
    public static void method962(int arg0) {
        if (arg0 < -70) {
            field1889 = null;
            field1887 = null;
            field1886 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V", line = 17)
    public static final void method963(int arg0) {
        class209.method1553(false, (byte) 96);
        System.gc();
        field1888++;
        class33.method302((byte) -26, arg0);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BIIIIIIII)V", line = 27)
    public static final void method964(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1890++;
        if (class272.method1863(-671591600, arg8)) {
            class33.method298(arg2, arg6, true, class109.field1852[arg8], -1, arg4, arg1, arg3, arg7, arg5);
            int var9 = -9 % ((arg0 - 83) / 38);
        } else if (arg3 == -1) {
            for (int var10 = 0; var10 < 100; var10++) {
                class272.field4337[var10] = true;
            }
        } else {
            class272.field4337[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILlg;)Ljava/lang/String;", line = 60)
    public static final String method965(int arg0, int arg1, class137 arg2) {
        if (arg1 != -32038) {
            return (String) null;
        }
        field1883++;
        if (!client.method1894(arg2).method509(2966, arg0) && arg2.field2413 == null) {
            return null;
        } else if (arg2.field2458 == null || arg2.field2458.length <= arg0 || arg2.field2458[arg0] == null || arg2.field2458[arg0].trim().length() == 0) {
            return class348.field5537 ? "Hidden-" + arg0 : null;
        } else {
            return arg2.field2458[arg0];
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Llg;II)I", line = 85)
    public static final int method966(class137 arg0, int arg1, int arg2) {
        field1882++;
        if (arg0.field2375 == null || arg0.field2375.length <= arg1) {
            return -2;
        }
        try {
            int[] var3 = arg0.field2375[arg1];
            if (arg2 > -90) {
                method964((byte) -117, -83, 94, 89, -121, 117, -107, -64, 28);
            }
            int var4 = 0;
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                byte var7 = 0;
                int var8 = var3[var6++];
                int var9 = 0;
                if (var8 == 0) {
                    return var4;
                }
                if (var8 == 15) {
                    var7 = 1;
                }
                if (var8 == 1) {
                    var9 = class212.field3575[var3[var6++]];
                }
                if (var8 == 2) {
                    var9 = class262.field4246[var3[var6++]];
                }
                if (var8 == 3) {
                    var9 = class75.field1230[var3[var6++]];
                }
                if (var8 == 4) {
                    int var10 = var3[var6++] << 16;
                    int var11 = var10 + var3[var6++];
                    class137 var12 = class146.method1167(1169843632, var11);
                    int var13 = var3[var6++];
                    if (var13 != -1 && (!class5.method31(-1731690365, var13).field2319 || class36.field527)) {
                        for (int var14 = 0; var14 < var12.field2379.length; var14++) {
                            if (var13 + 1 == var12.field2379[var14]) {
                                var9 += var12.field2461[var14];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var9 = class116.field2006[var3[var6++]];
                }
                if (var8 == 6) {
                    var9 = class341.field5432[class262.field4246[var3[var6++]] - 1];
                }
                if (var8 == 7) {
                    var9 = class116.field2006[var3[var6++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var9 = class218.field3632.field3480;
                }
                if (var8 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class233.field3867[var15]) {
                            var9 += class262.field4246[var15];
                        }
                    }
                }
                if (var8 == 16) {
                    var7 = 2;
                }
                if (var8 == 17) {
                    var7 = 3;
                }
                if (var8 == 10) {
                    int var16 = var3[var6++] << 16;
                    int var17 = var16 + var3[var6++];
                    class137 var18 = class146.method1167(1169843632, var17);
                    int var19 = var3[var6++];
                    if (var19 != -1 && (!class5.method31(-1731690365, var19).field2319 || class36.field527)) {
                        for (int var20 = 0; var20 < var18.field2379.length; var20++) {
                            if ((var19 + 1) == var18.field2379[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var9 = class78.field1259;
                }
                if (var8 == 12) {
                    var9 = class176.field2996;
                }
                if (var8 == 13) {
                    int var21 = class116.field2006[var3[var6++]];
                    int var22 = var3[var6++];
                    var9 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var23 = var3[var6++];
                    var9 = class332.method2307(-1, var23);
                }
                if (var8 == 18) {
                    var9 = (class218.field3632.field2036 >> 7) + class24.field345;
                }
                if (var8 == 19) {
                    var9 = (class218.field3632.field1985 >> 7) + class34.field484;
                }
                if (var8 == 20) {
                    var9 = var3[var6++];
                }
                if (var7 == 0) {
                    if (var5 == 0) {
                        var4 += var9;
                    }
                    if (var5 == 1) {
                        var4 -= var9;
                    }
                    if (var5 == 2 && var9 != 0) {
                        var4 /= var9;
                    }
                    if (var5 == 3) {
                        var4 *= var9;
                    }
                    var5 = 0;
                } else {
                    var5 = var7;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method690(int arg0);

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "(I)Z")
    public abstract boolean method691(int arg0);
}
