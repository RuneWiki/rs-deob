import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class103 extends class29 {

    @OriginalMember(owner = "client!s", name = "C", descriptor = "Lph;")
    public static class229 field1751 = class266.method1858("Chargement en cours)3 Veuillez patienter)3", 0);

    @OriginalMember(owner = "client!s", name = "H", descriptor = "Lph;")
    public static class229 field1756 = class266.method1858("Attaquer", 0);

    @OriginalMember(owner = "client!s", name = "I", descriptor = "Lph;")
    public static class229 field1757 = class266.method1858("floorshadows", 0);

    @OriginalMember(owner = "client!s", name = "D", descriptor = "I")
    public static int field1752 = 0;

    @OriginalMember(owner = "client!s", name = "A", descriptor = "Lph;")
    public static class229 field1749 = class266.method1858("Ablegen", 0);

    @OriginalMember(owner = "client!s", name = "B", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!s", name = "F", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!s", name = "G", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!s", name = "J", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!s", name = "K", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!s", name = "M", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!s", name = "N", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!s", name = "O", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!s", name = "S", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!s", name = "L", descriptor = "Lfe;")
    private class97 field1760;

    @OriginalMember(owner = "client!s", name = "E", descriptor = "[[[I")
    public static int[][][] field1753;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "()V", line = 15)
    public static final void method786() {
        for (int var0 = 0; var0 < class45.field688; var0++) {
            class152 var1 = class24.field312[var0];
            class311.method2104(var1);
            class24.field312[var0] = null;
        }
        class45.field688 = 0;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZLri;I)V", line = 31)
    public static final void method787(boolean arg0, class301 arg1, int arg2) {
        field1768++;
        int var3 = arg1.field5006 == 0 ? arg1.field4923 : arg1.field5006;
        int var4 = arg1.field4877 == 0 ? arg1.field4882 : arg1.field4877;
        class5.method27(arg1.field4948, var3, arg0, class37.field604[arg1.field4948 >> 16], var4, 43);
        if (arg2 < 62) {
            field1753 = (int[][][]) ((int[][][]) null);
        }
        if (arg1.field4955 != null) {
            class5.method27(arg1.field4948, var3, arg0, arg1.field4955, var4, 85);
        }
        class48 var5 = (class48) class251.field4176.method713(3365, (long) arg1.field4948);
        if (var5 != null) {
            class146.method1074(23227, var5.field700, var3, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lhb;II)V", line = 62)
    private final void method788(class164 arg0, int arg1, int arg2) {
        field1761++;
        if (~arg1 != arg2) {
            return;
        }
        int var4 = arg0.method1178(8);
        if (this.field1760 == null) {
            int var5 = class303.method2049(var4, 2539);
            this.field1760 = new class97(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg0.method1178(arg2 + 258) == 1;
            int var8 = arg0.method1176(arg2 ^ 0xC18705CE);
            class80 var9;
            if (var7) {
                var9 = new class302(arg0.method1190(0));
            } else {
                var9 = new class295(arg0.method1191(31776));
            }
            this.field1760.method710(var9, (byte) -62, (long) var8);
        }
    }

    @OriginalMember(owner = "client!s", name = "g", descriptor = "(I)V", line = 109)
    public static void method789(int arg0) {
        field1757 = null;
        field1756 = null;
        if (arg0 != 0) {
            method793(47, -102, 24, -54, (class216) null, -120, -24L, -21, -62, 52, -128);
        }
        field1751 = null;
        field1749 = null;
        field1753 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lhb;I)V", line = 141)
    public final void method790(class164 arg0, int arg1) {
        if (arg1 != 9420) {
            return;
        }
        field1750++;
        while (true) {
            int var3 = arg0.method1178(8);
            if (var3 == 0) {
                return;
            }
            this.method788(arg0, var3, -250);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lph;II)Lph;", line = 163)
    public final class229 method791(class229 arg0, int arg1, int arg2) {
        field1762++;
        if (arg1 != 0) {
            method794(-13);
        }
        if (this.field1760 == null) {
            return arg0;
        } else {
            class302 var4 = (class302) this.field1760.method713(3365, (long) arg2);
            return var4 == null ? arg0 : var4.field5052;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILsi;I)Lka;", line = 183)
    public static final class293 method792(int arg0, class66 arg1, int arg2) {
        if (arg0 != -1217871116) {
            method795(-60L, -101, -69, 87);
        }
        field1763++;
        return class45.method333(0, arg1, arg2) ? class329.method2258((byte) 126) : null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIILrk;IJIIII)Z", line = 198)
    public static final boolean method793(int arg0, int arg1, int arg2, int arg3, class216 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class139.method1005(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!s", name = "h", descriptor = "(I)V", line = 206)
    public static final void method794(int arg0) {
        field1759++;
        class88.field1497.method40(8);
        int var1 = class88.field1497.method34(-10, 8);
        if (var1 < class253.field4233) {
            for (int var2 = var1; var2 < class253.field4233; var2++) {
                class57.field809[class63.field950++] = class162.field2620[var2];
            }
        }
        if (var1 > class253.field4233) {
            throw new RuntimeException("gnpov1");
        }
        class253.field4233 = 0;
        if (arg0 != 26950) {
            field1767 = 39;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class162.field2620[var3];
            class217 var5 = class187.field3035[var4];
            int var6 = class88.field1497.method34(118, 1);
            if (var6 == 0) {
                class162.field2620[class253.field4233++] = var4;
                var5.field5162 = class319.field5393;
            } else {
                int var7 = class88.field1497.method34(124, 2);
                if (var7 == 0) {
                    class162.field2620[class253.field4233++] = var4;
                    var5.field5162 = class319.field5393;
                    class105.field1782[class313.field5278++] = var4;
                } else if (var7 == 1) {
                    class162.field2620[class253.field4233++] = var4;
                    var5.field5162 = class319.field5393;
                    int var11 = class88.field1497.method34(117, 3);
                    var5.method2063(var11, false, 19522);
                    int var12 = class88.field1497.method34(arg0 ^ 0x693E, 1);
                    if (var12 == 1) {
                        class105.field1782[class313.field5278++] = var4;
                    }
                } else if (var7 == 2) {
                    class162.field2620[class253.field4233++] = var4;
                    var5.field5162 = class319.field5393;
                    int var8 = class88.field1497.method34(-113, 3);
                    var5.method2063(var8, true, 19522);
                    int var9 = class88.field1497.method34(-32, 3);
                    var5.method2063(var9, true, 19522);
                    int var10 = class88.field1497.method34(116, 1);
                    if (var10 == 1) {
                        class105.field1782[class313.field5278++] = var4;
                    }
                } else if (var7 == 3) {
                    class57.field809[class63.field950++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(JIII)Z", line = 315)
    public static final boolean method795(long arg0, int arg1, int arg2, int arg3) {
        field1769++;
        int var5 = (int) arg0 >> 14 & 0x1F;
        int var6 = (int) arg0 >> 20 & arg1;
        int var7 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class83 var8 = class260.method1807(false, var7);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var10 = var8.field1424;
                var9 = var8.field1434;
            } else {
                var9 = var8.field1424;
                var10 = var8.field1434;
            }
            int var11 = var8.field1380;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class226.method1568(var9, class230.field3820.field5159[0], arg3, class230.field3820.field5104[0], var10, arg2, var11, -24320, 0, 2, true, 0);
        } else {
            class226.method1568(0, class230.field3820.field5159[0], arg3, class230.field3820.field5104[0], 0, arg2, 0, -24320, var6, 2, true, var5 + 1);
        }
        class120.field2029 = class48.field697;
        class271.field4538 = 2;
        class43.field666 = 0;
        class256.field4281 = class220.field3613;
        return true;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I", line = 359)
    public final int method796(int arg0, int arg1, int arg2) {
        field1766++;
        if (this.field1760 == null) {
            return arg0;
        }
        class295 var4 = (class295) this.field1760.method713(3365, (long) arg2);
        if (var4 == null) {
            return arg0;
        } else {
            int var5 = -59 % ((arg1 + 79) / 45);
            return var4.field4829;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lph;I)Lph;", line = 379)
    public static final class229 method797(class229 arg0, int arg1) {
        if (arg1 != -17882) {
            method792(87, (class66) null, -121);
        }
        field1758++;
        int var2 = class95.method707(arg0, 0);
        return var2 == -1 ? class328.field5580 : class1.field5.field872[var2].method1597(arg1 ^ 0xFFFFC0E2, class184.field2988, class77.field1283);
    }
}
