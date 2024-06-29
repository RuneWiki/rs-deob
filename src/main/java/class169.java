import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class169 extends class147 {

    @OriginalMember(owner = "client!da", name = "L", descriptor = "Lhf;")
    public class232 field2853;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "Lqj;")
    private static class196 field2848 = class80.method502("Loaded input handler", -48);

    @OriginalMember(owner = "client!da", name = "K", descriptor = "I")
    public static int field2852 = 0;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "Lqj;")
    public static class196 field2855 = field2848;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BJ)V")
    public static final void method1102(byte arg0, long arg1) {
        field2850++;
        if (arg1 == 0L || arg0 != 65) {
            return;
        }
        for (int var3 = 0; var3 < class156.field2514; var3++) {
            if (class91.field1333[var3] == arg1) {
                class132.field1883++;
                class156.field2514--;
                for (int var4 = var3; var4 < class156.field2514; var4++) {
                    class212.field3811[var4] = class212.field3811[var4 + 1];
                    class52.field654[var4] = class52.field654[var4 + 1];
                    class28.field352[var4] = class28.field352[var4 + 1];
                    class91.field1333[var4] = class91.field1333[var4 + 1];
                    class203.field3668[var4] = class203.field3668[var4 + 1];
                    class195.field3431[var4] = class195.field3431[var4 + 1];
                }
                class242.field4302 = class92.field1341;
                class44.field520.method1173(153, 14592);
                class44.field520.method346(arg1, (byte) -117);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLdj;)V")
    public static final void method1103(byte arg0, class137 arg1) {
        if (arg0 != 15) {
            return;
        }
        if (class171.field2879 == arg1.field2060 || arg1.field2086 == -1 || arg1.field2084 != 0 || arg1.field2079 + 1 > class116.method704(arg1.field2086, -10304).field2361[arg1.field2105]) {
            int var2 = arg1.field2060 - arg1.field2089;
            int var3 = class171.field2879 - arg1.field2089;
            int var4 = arg1.field2092 * 128 + arg1.field2049 * 64;
            int var5 = arg1.field2049 * 64 + arg1.field2047 * 128;
            arg1.field2081 = ((var2 - var3) * var4 + var3 * var5) / var2;
            int var6 = arg1.field2066 * 128 + arg1.field2049 * 64;
            int var7 = arg1.field2067 * 128 + arg1.field2049 * 64;
            arg1.field2085 = ((var2 - var3) * var7 + var3 * var6) / var2;
        }
        field2849++;
        arg1.field2076 = 0;
        if (arg1.field2112 == 0) {
            arg1.field2077 = 1024;
        }
        if (arg1.field2112 == 1) {
            arg1.field2077 = 1536;
        }
        if (arg1.field2112 == 2) {
            arg1.field2077 = 0;
        }
        if (arg1.field2112 == 3) {
            arg1.field2077 = 512;
        }
        arg1.field2096 = arg1.field2077;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
    public static void method1104(int arg0) {
        if (arg0 == -1) {
            field2848 = null;
            field2855 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)Lg;")
    public static final class221 method1105(int arg0, int arg1, int arg2) {
        class61 var3 = class249.field4410[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class221 var4 = var3.field829;
            var3.field829 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLa;III)V")
    public static final void method1106(byte arg0, class111 arg1, int arg2, int arg3, int arg4) {
        field2854++;
        if (class125.field1767 >= 400) {
            return;
        }
        if (arg1.field1591 != null) {
            arg1 = arg1.method659(79);
        }
        if (arg1 == null || !arg1.field1639) {
            return;
        }
        class196 var5 = arg1.field1596;
        if (arg1.field1643 != 0) {
            var5 = class93.method572(-77, new class196[] { var5, class94.method582(arg1.field1643, class102.field1477.field1939, (byte) -2), class24.field302, class230.field4092, class163.method1029(arg1.field1643, false), class231.field4112 });
        }
        if (class34.field416 == 1) {
            class235.method1577(class93.method572(-56, new class196[] { class232.field4135, class9.field88, var5 }), arg3, (short) 4, -1709, arg4, (long) arg2, class80.field1150);
            class16.field184++;
        } else if (!class171.field2883) {
            class196[] var6 = arg1.field1632;
            class45.field527++;
            if (class171.field2882) {
                var6 = class90.method557(111, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class158.field2546 != 0 || !var6[var7].method1320(false, class209.field3763))) {
                        class199.field3531++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 35;
                        }
                        if (var7 == 1) {
                            var8 = 7;
                        }
                        if (var7 == 2) {
                            var8 = 23;
                        }
                        if (var7 == 3) {
                            var8 = 24;
                        }
                        if (var7 == 4) {
                            var8 = 43;
                        }
                        class235.method1577(class93.method572(-109, new class196[] { class71.field1005, var5 }), arg3, var8, -1709, arg4, (long) arg2, var6[var7]);
                    }
                }
            }
            if (class158.field2546 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1320(false, class209.field3763)) {
                        class90.field1316++;
                        short var10 = 0;
                        short var11 = 0;
                        if (arg1.field1643 > class102.field1477.field1939) {
                            var10 = 2000;
                        }
                        if (var9 == 0) {
                            var11 = 35;
                        }
                        if (var9 == 1) {
                            var11 = 7;
                        }
                        if (var9 == 2) {
                            var11 = 23;
                        }
                        if (var9 == 3) {
                            var11 = 24;
                        }
                        if (var9 == 4) {
                            var11 = 43;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class235.method1577(class93.method572(-92, new class196[] { class71.field1005, var5 }), arg3, var11, -1709, arg4, (long) arg2, var6[var9]);
                    }
                }
            }
            class235.method1577(class93.method572(-96, new class196[] { class71.field1005, var5 }), arg3, (short) 1007, -1709, arg4, (long) arg2, class220.field3961);
        } else if ((class62.field848 & 0x2) == 2) {
            class235.method1577(class93.method572(-89, new class196[] { class206.field3706, class9.field88, var5 }), arg3, (short) 22, -1709, arg4, (long) arg2, class57.field764);
            class9.field91++;
        }
        if (arg0 <= 80) {
            field2855 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1107(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class235.field4171 * arg3 + class120.field1734 * arg0 >> 16;
        int var6 = class120.field1734 * arg3 - class235.field4171 * arg0 >> 16;
        int var7 = class8.field79 * var6 + class109.field1561 * arg1 >> 16;
        int var8 = class8.field79 * arg1 - class109.field1561 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class8.field79 * var6 + class109.field1561 * arg2 >> 16;
        int var12 = class8.field79 * arg2 - class109.field1561 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class161.field2580 && var13 < class161.field2580) {
            return false;
        } else if (var9 > class146.field2309 && var13 > class146.field2309) {
            return false;
        } else if (var10 < class43.field494 && var14 < class43.field494) {
            return false;
        } else {
            return var10 <= class6.field48 || var14 <= class6.field48;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lhf;)V")
    public class169(class232 arg0) {
        this.field2853 = arg0;
    }
}
