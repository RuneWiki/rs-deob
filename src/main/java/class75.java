import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class75 implements class88 {

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Lpb;")
    private class92 field1857 = new class92();

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "D")
    private double field1880 = 1.0D;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    private int field1878 = 128;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
    private int field1883 = 0;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    private int field1882;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "Lbd;")
    private class11 field1879;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "[Lp;")
    private class90[] field1870;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "La;")
    private static class1 field1850 = class113.method934(-11538, "Enter object name");

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field1860 = 0;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "La;")
    public static class1 field1856 = class113.method934(-11538, "Wen m-Ochten Sie der Liste hinzuf-Ugen?");

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field1863 = 0;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "[I")
    public static int[] field1868 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Z")
    public static boolean field1864 = false;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field1867 = 0;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "La;")
    public static class1 field1861 = class113.method934(-11538, "Handel)4Duell");

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field1858 = 0;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "La;")
    public static class1 field1855 = class113.method934(-11538, "null");

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "Z")
    public static boolean field1865 = true;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "La;")
    public static class1 field1877 = field1850;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "La;")
    private static class1 field1866 = class113.method934(-11538, "Enter message to send to ");

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "La;")
    public static class1 field1873 = class113.method934(-11538, "und haben es deaktiviert)3 Benutzen Sie die");

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "La;")
    public static class1 field1876 = field1866;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "Le;")
    public static class25 field1874;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "Ljava/awt/Frame;")
    public static Frame field1862;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "[[[B")
    public static byte[][][] field1875;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lbd;BILbd;Z)Lt;", line = 3)
    public static final class114 method693(class11 arg0, byte arg1, int arg2, class11 arg3, boolean arg4) {
        if (arg1 < 40) {
            return null;
        }
        field1869++;
        boolean var5 = true;
        int[] var6 = arg0.method238(arg2, true);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg0.method228(var6[var7], -114, arg2);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg4) {
                    var10 = arg3.method228(var9, -122, 0);
                } else {
                    var10 = arg3.method228(0, -123, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class114(arg0, arg3, arg2, arg4);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 60)
    public final void method694(int arg0) {
        field1853++;
        for (int var2 = arg0; var2 < this.field1870.length; var2++) {
            if (this.field1870[var2] != null) {
                this.field1870[var2].method767();
            }
        }
        this.field1857 = new class92();
        this.field1883 = this.field1882;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)[I", line = 87)
    public final int[] method695(int arg0, int arg1) {
        field1872++;
        class90 var3 = this.field1870[arg1];
        int var4 = -68 / ((-arg0 - 75) / 33);
        if (var3 != null) {
            if (var3.field2197 != null) {
                this.field1857.method808(0, var3);
                var3.field2204 = true;
                return var3.field2197;
            }
            boolean var5 = var3.method766(this.field1880, this.field1878, this.field1879);
            if (var5) {
                if (this.field1883 == 0) {
                    class90 var6 = (class90) this.field1857.method802((byte) 87);
                    var6.method767();
                } else {
                    this.field1883--;
                }
                this.field1857.method808(0, var3);
                var3.field2204 = true;
                return var3.field2197;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)I", line = 148)
    public final int method696(boolean arg0, int arg1) {
        field1854++;
        if (arg0) {
            return this.field1870[arg1] == null ? 0 : this.field1870[arg1].field2195;
        } else {
            return 115;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V", line = 183)
    public static void method697(byte arg0) {
        if (arg0 > -18) {
            return;
        }
        field1850 = null;
        field1875 = null;
        field1855 = null;
        field1876 = null;
        field1862 = null;
        field1868 = null;
        field1873 = null;
        field1866 = null;
        field1874 = null;
        field1877 = null;
        field1856 = null;
        field1861 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)Z", line = 211)
    public final boolean method698(byte arg0, int arg1) {
        field1859++;
        return arg0 > -99 ? true : this.field1870[arg1].field2201;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ID)V", line = 225)
    public final void method699(int arg0, double arg1) {
        field1852++;
        if (arg0 < 68) {
            field1861 = null;
        }
        this.field1880 = arg1;
        this.method694(0);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(BI)V", line = 241)
    public final void method700(byte arg0, int arg1) {
        field1881++;
        int var3 = 0;
        if (arg0 != 6) {
            return;
        }
        while (var3 < this.field1870.length) {
            class90 var4 = this.field1870[var3];
            if (var4 != null && var4.field2194 != 0 && var4.field2204) {
                var4.method765(arg1);
                var4.field2204 = false;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)Z", line = 274)
    public final boolean method701(int arg0, byte arg1) {
        field1851++;
        if (arg1 == -90) {
            return this.field1878 == 64;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lbd;Lbd;IDI)V", line = 329)
    public class75(class11 arg0, class11 arg1, int arg2, double arg3, int arg4) {
        this.field1882 = arg2;
        this.field1879 = arg1;
        this.field1880 = arg3;
        this.field1878 = arg4;
        this.field1883 = this.field1882;
        int[] var7 = arg0.method238(0, true);
        int var8 = var7.length;
        this.field1870 = new class90[arg0.method236(0, (byte) 120)];
        for (int var9 = 0; var9 < var8; var9++) {
            class8 var10 = new class8(arg0.method218(var7[var9], 120, 0));
            this.field1870[var7[var9]] = new class90(var10);
        }
    }
}
