import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class75 extends class121 {

    @OriginalMember(owner = "client!kf", name = "ab", descriptor = "I")
    public int field1840 = 0;

    @OriginalMember(owner = "client!kf", name = "cb", descriptor = "I")
    public int field1842 = -1;

    @OriginalMember(owner = "client!kf", name = "Y", descriptor = "I")
    public int field1838 = -1;

    @OriginalMember(owner = "client!kf", name = "pb", descriptor = "Z")
    public boolean field1855 = true;

    @OriginalMember(owner = "client!kf", name = "nb", descriptor = "Lec;")
    public static class32 field1853 = new class32(4096);

    @OriginalMember(owner = "client!kf", name = "qb", descriptor = "Lhe;")
    private static class54 field1856 = class6.method58("Password: ", false);

    @OriginalMember(owner = "client!kf", name = "rb", descriptor = "Lhe;")
    public static class54 field1857 = field1856;

    @OriginalMember(owner = "client!kf", name = "sb", descriptor = "Lhe;")
    public static class54 field1858 = class6.method58("sch-Utteln:", false);

    @OriginalMember(owner = "client!kf", name = "tb", descriptor = "[I")
    public static int[] field1859 = new int[32];

    @OriginalMember(owner = "client!kf", name = "ub", descriptor = "Lhe;")
    private static class54 field1860;

    @OriginalMember(owner = "client!kf", name = "yb", descriptor = "Lhe;")
    public static class54 field1864;

    @OriginalMember(owner = "client!kf", name = "xb", descriptor = "Z")
    public static boolean field1863;

    @OriginalMember(owner = "client!kf", name = "vb", descriptor = "[Lhe;")
    public static class54[] field1861;

    @OriginalMember(owner = "client!kf", name = "Ab", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!kf", name = "X", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!kf", name = "Z", descriptor = "I")
    public int field1839;

    @OriginalMember(owner = "client!kf", name = "bb", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!kf", name = "db", descriptor = "I")
    public int field1843;

    @OriginalMember(owner = "client!kf", name = "eb", descriptor = "I")
    public int field1844;

    @OriginalMember(owner = "client!kf", name = "fb", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!kf", name = "gb", descriptor = "I")
    public int field1846;

    @OriginalMember(owner = "client!kf", name = "hb", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!kf", name = "ib", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!kf", name = "jb", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!kf", name = "kb", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!kf", name = "lb", descriptor = "I")
    public int field1851;

    @OriginalMember(owner = "client!kf", name = "mb", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!kf", name = "ob", descriptor = "I")
    public int field1854;

    @OriginalMember(owner = "client!kf", name = "zb", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!kf", name = "wb", descriptor = "Lvc;")
    public static class149 field1862;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIBLqb;II)V")
    public static final void method575(int arg0, int arg1, byte arg2, class113 arg3, int arg4, int arg5) {
        field1849++;
        if (arg3 == null) {
            return;
        }
        int var6 = class91.field2220 + class63.field1533 & 0x7FF;
        int var7 = arg0 * arg0 + arg1 * arg1;
        if (var7 > 6400) {
            return;
        }
        int var8 = class152.field3416[var6];
        int var9 = var8 * 256 / (class40.field1050 + 256);
        int var10 = class152.field3420[var6];
        if (arg2 <= 115) {
            method575(73, 113, (byte) -107, null, -121, 11);
        }
        int var11 = var10 * 256 / (class40.field1050 + 256);
        int var12 = arg1 * var11 - arg0 * var9 >> 16;
        int var13 = arg0 * var11 + arg1 * var9 >> 16;
        if (var7 > 2500) {
            arg3.method858(class4.field136, arg5 + var13 + 94 + 4 - arg3.field2703 / 2, arg4 + 83 + -var12 - 4 + -(arg3.field2701 / 2));
        } else {
            arg3.method865(arg5 + var13 + 94 + 4 - arg3.field2703 / 2, arg4 - arg3.field2701 / 2 + 83 + -4 + -var12);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILm;I)V")
    public final void method576(int arg0, class83 arg1, int arg2) {
        field1852++;
        if (arg2 != 255) {
            return;
        }
        while (true) {
            int var4 = arg1.method638(0);
            if (var4 == 0) {
                return;
            }
            this.method579(arg0, var4, arg1, -27753);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lhe;ILhe;Lhe;)V")
    public static final void method577(class54 arg0, int arg1, class54 arg2, class54 arg3) {
        if (arg1 > 3) {
            class66.field1609 = arg3;
            class66.field1606 = arg0;
            class66.field1611 = arg2;
            field1845++;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
    public static void method578(byte arg0) {
        field1862 = null;
        field1859 = null;
        field1857 = null;
        field1861 = null;
        field1864 = null;
        field1856 = null;
        if (arg0 == 31) {
            field1858 = null;
            field1860 = null;
            field1853 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILm;I)V")
    private final void method579(int arg0, int arg1, class83 arg2, int arg3) {
        if (arg3 != -27753) {
            method577(null, 23, null, null);
        }
        if (arg1 == 1) {
            this.field1840 = arg2.method670(false);
        } else if (arg1 == 2) {
            this.field1842 = arg2.method638(0);
        } else if (arg1 == 5) {
            this.field1855 = false;
        } else if (arg1 == 7) {
            this.field1838 = arg2.method670(false);
        }
        field1841++;
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)V")
    public final void method580(int arg0) {
        field1847++;
        if (~this.field1838 != arg0) {
            this.method581(true, this.field1838);
            this.field1843 = this.field1844;
            this.field1839 = this.field1846;
            this.field1851 = this.field1854;
        }
        this.method581(true, this.field1840);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(ZI)V")
    private final void method581(boolean arg0, int arg1) {
        field1848++;
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var7 = var5;
        double var9 = var5;
        if (var5 < var3) {
            var9 = var3;
        }
        double var11 = (double) (arg1 & 0xFF) / 256.0D;
        if (var3 < var5) {
            var7 = var3;
        }
        if (var7 > var11) {
            var7 = var11;
        }
        if (var11 > var9) {
            var9 = var11;
        }
        double var13 = (var7 + var9) / 2.0D;
        this.field1844 = (int) (var13 * 256.0D);
        if (this.field1844 < 0) {
            this.field1844 = 0;
        } else if (this.field1844 > 255) {
            this.field1844 = 255;
        }
        double var15 = 0.0D;
        double var17 = 0.0D;
        if (var7 != var9) {
            if (var5 == var9) {
                var15 = (var3 - var11) / (-var7 + var9);
            } else if (var3 == var9) {
                var15 = (var11 - var5) / (-var7 + var9) + 2.0D;
            } else if (var9 == var11) {
                var15 = (var5 - var3) / (var9 - var7) + 4.0D;
            }
            if (var13 < 0.5D) {
                var17 = (var9 - var7) / (var7 + var9);
            }
            if (var13 >= 0.5D) {
                var17 = (var9 - var7) / (2.0D - var9 - var7);
            }
        }
        this.field1854 = (int) (var17 * 256.0D);
        if (this.field1854 < 0) {
            this.field1854 = 0;
        } else if (this.field1854 > 255) {
            this.field1854 = 255;
        }
        double var19 = var15 / 6.0D;
        this.field1846 = (int) (var19 * 256.0D);
        if (!arg0) {
            this.field1855 = false;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1859[var1] = var0 - 1;
            var0 += var0;
        }
        field1860 = class6.method58(" from your friend list first", false);
        field1864 = field1860;
        field1863 = false;
        field1861 = new class54[100];
        field1866 = 0;
    }
}
