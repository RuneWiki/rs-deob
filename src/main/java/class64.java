import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class64 {

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Z")
    public boolean field1822 = true;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public int field1824;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public int field1820;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public int field1825;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public int field1823;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public int field1815;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public int field1818;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Lmb;")
    public static class85 field1826 = new class85(64);

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "Lrd;")
    public static class117 field1830 = class95.method812("backbase2", (byte) 8);

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "Lrd;")
    public static class117 field1833 = class95.method812("Classic", (byte) 8);

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "Lrd;")
    public static class117 field1832 = class95.method812("Name des Gegenstands eingeben:", (byte) 8);

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "Lrd;")
    public static class117 field1836 = class95.method812("An:", (byte) 8);

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "Lrd;")
    public static class117 field1835 = class95.method812("Ung-Ultige Verbindung mit einem Anmelde)2Server)3", (byte) 8);

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field1831 = 0;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "Lrd;")
    public static class117 field1838 = class95.method812("blinken3:", (byte) 8);

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "Lrd;")
    public static class117 field1839 = class95.method812("gleiten:", (byte) 8);

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "Lga;")
    public static class44 field1837;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZIII)Ll;")
    public static final class76 method643(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1816++;
        long var6 = ((long) arg1 << 38) + ((long) arg4 << 16) + ((long) arg5 << 40) + (long) arg3;
        if (!arg2) {
            class76 var8 = (class76) class85.field2209.method774(var6, 329);
            if (var8 != null) {
                return var8;
            }
        }
        class49 var9 = class108.method887(-1, arg3);
        if (arg4 > 1 && var9.field1370 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg4 >= var9.field1396[var11] && var9.field1396[var11] != 0) {
                    var10 = var9.field1370[var11];
                }
            }
            if (var10 != -1) {
                var9 = class108.method887(-1, var10);
            }
        }
        class28 var12 = var9.method540(arg0, -129);
        if (var12 == null) {
            return null;
        }
        class76 var13 = null;
        if (var9.field1413 != -1) {
            var13 = method643(1, 1, true, var9.field1401, 10, 0);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class145.field3548;
        int var15 = class145.field3552;
        int var16 = class145.field3547;
        int var17 = class145.field3550;
        int var18 = class145.field3549;
        int var19 = class145.field3551;
        int var20 = class145.field3553;
        int[] var21 = class129.method1051();
        int var22 = class129.field3128;
        int var23 = class129.field3138;
        class76 var24 = new class76(36, 32);
        class145.method1166(var24.field2085, 36, 32);
        class83.field2158 = class129.method1053(class83.field2158);
        class145.method1165(0, 0, 36, 32, 0);
        class129.field3132 = false;
        class129.method1059(16, 16);
        int var25 = var9.field1376;
        if (arg2) {
            var25 = (int) ((double) var25 * 1.5D);
        } else if (arg1 == 2) {
            var25 = (int) ((double) var25 * 1.04D);
        }
        int var26 = class129.field3131[var9.field1428] * var25 >> 16;
        int var27 = class129.field3135[var9.field1428] * var25 >> 16;
        var12.method298();
        var12.method288(0, var9.field1377, var9.field1387, var9.field1428, var9.field1404, var12.field1693 / 2 + var27 + var9.field1379, var9.field1379 + var26);
        if (arg1 >= 1) {
            var24.method727(1);
        }
        if (arg1 >= 2) {
            var24.method727(16777215);
        }
        if (arg5 != 0) {
            var24.method731(arg5);
        }
        class145.method1166(var24.field2085, 36, 32);
        if (var9.field1413 != -1) {
            var13.method712(0, 0);
        }
        if (!arg2 && (var9.field1432 == 1 || arg4 != 1) && arg4 != -1) {
            class37.field1079.method215(class16.method181(-92, arg4), 1, 10, 1);
            class37.field1079.method215(class16.method181(109, arg4), 0, 9, 16776960);
        }
        if (!arg2) {
            class85.field2209.method773(var6, (byte) -17, var24);
        }
        class145.method1166(var14, var15, var16);
        class145.method1158(var17, var20, var18, var19);
        class129.method1053(var21);
        class129.field3138 = var23;
        class129.field3128 = var22;
        class129.method1049();
        class129.field3132 = true;
        return var24;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method644(int arg0) {
        field1836 = null;
        field1835 = null;
        if (arg0 != 2129) {
            method645(null, 76, null, -24);
        }
        field1830 = null;
        field1826 = null;
        field1837 = null;
        field1839 = null;
        field1838 = null;
        field1832 = null;
        field1833 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Laf;ILnc;I)V")
    public static final void method645(class7 arg0, int arg1, class92 arg2, int arg3) {
        field1817++;
        class27 var4 = new class27();
        var4.field791 = arg2;
        var4.field795 = arg0;
        var4.field2048 = arg1;
        var4.field804 = 1;
        class1 var5 = class132.field3168;
        synchronized (class132.field3168) {
            if (arg3 >= -79) {
                method644(7);
            }
            class132.field3168.method10(var4, (byte) 95);
        }
        class16.method179(-40);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)Ldd;")
    public static final class26 method646(int arg0, byte arg1) {
        class26 var2 = (class26) class32.field951.method774((long) arg0, 329);
        field1819++;
        if (var2 != null) {
            return var2;
        }
        int var3 = -107 % ((-arg1 - 7) / 43);
        byte[] var4 = class53.field1524.method526((byte) 117, 1, arg0);
        class26 var5 = new class26();
        if (var4 != null) {
            var5.method276(arg0, (byte) -112, new class14(var4));
        }
        var5.method277(-6373);
        class32.field951.method773((long) arg0, (byte) -17, var5);
        return var5;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class64(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1822 = arg6;
        this.field1824 = arg2;
        this.field1820 = arg3;
        this.field1825 = arg0;
        this.field1823 = arg1;
        this.field1815 = arg5;
        this.field1818 = arg4;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B[B)V")
    public static final void method647(byte arg0, byte[] arg1) {
        field1821++;
        class14 var2 = new class14(arg1);
        var2.field314 = arg1.length - 2;
        class2.field31 = var2.method138((byte) 90);
        class141.field3352 = new int[class2.field31];
        class24.field673 = new int[class2.field31];
        class43.field1219 = new int[class2.field31];
        class66.field1868 = new int[class2.field31];
        if (arg0 < 97) {
            method645(null, 12, null, -121);
        }
        class68.field1920 = new byte[class2.field31][];
        var2.field314 = arg1.length - class2.field31 * 8 - 7;
        class21.field597 = var2.method138((byte) 75);
        class15.field343 = var2.method138((byte) 106);
        int var3 = (var2.method153(true) & 0xFF) + 1;
        for (int var4 = 0; var4 < class2.field31; var4++) {
            class24.field673[var4] = var2.method138((byte) 107);
        }
        for (int var5 = 0; var5 < class2.field31; var5++) {
            class43.field1219[var5] = var2.method138((byte) 120);
        }
        for (int var6 = 0; var6 < class2.field31; var6++) {
            class141.field3352[var6] = var2.method138((byte) 121);
        }
        for (int var7 = 0; var7 < class2.field31; var7++) {
            class66.field1868[var7] = var2.method138((byte) 100);
        }
        var2.field314 = arg1.length + 3 - class2.field31 * 8 - var3 * 3 - 7;
        class68.field1902 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class68.field1902[var8] = var2.method122(17260);
            if (class68.field1902[var8] == 0) {
                class68.field1902[var8] = 1;
            }
        }
        var2.field314 = 0;
        for (int var9 = 0; var9 < class2.field31; var9++) {
            int var10 = class66.field1868[var9];
            int var11 = class141.field3352[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class68.field1920[var9] = var13;
            int var14 = var2.method153(true);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method129((byte) -94);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var10; var17++) {
                        var13[var11 * var17 + var16] = var2.method129((byte) -113);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIB)I")
    public static final int method648(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 > -8) {
            field1826 = null;
        }
        int var4 = arg0 & 0x3;
        field1827++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg2;
        }
    }
}
