import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class100 extends class167 {

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
    private int field1821 = 4096;

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "I")
    private int field1829 = 4096;

    @OriginalMember(owner = "client!jb", name = "gb", descriptor = "I")
    private int field1833 = 4096;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "I")
    public static int field1825 = 0;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
    public static int field1826 = -1;

    @OriginalMember(owner = "client!jb", name = "hb", descriptor = "[I")
    public static int[] field1834 = new int[100];

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!jb", name = "eb", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!jb", name = "fb", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!jb", name = "ib", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!jb", name = "jb", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "J")
    public static long field1823;

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "[I")
    public static int[] field1827;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(B)V")
    public static final void method675(byte arg0) {
        ++field1836;
        if (arg0 <= 87) {
            field1825 = -128;
        }
        for (int var1 = 0; ~class215.field3914 < ~var1; ++var1) {
            int var2 = class203.field3679[var1];
            class56 var3 = class43.field950[var2];
            int var4 = class18.field511.method998(127);
            if (~(var4 & 2) != -1) {
                var4 += class18.field511.method998(84) << 8;
            }
            class159.method1135(var4, var3, var2, -1);
        }
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)V")
    public static void method676(int arg0) {
        if (arg0 <= -15) {
            field1834 = null;
            field1827 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lai;Lai;Lai;I)V")
    public static final void method677(class10 arg0, class10 arg1, class10 arg2, int arg3) {
        ++field1820;
        class191.field3403 = arg1.method84(class49.field1032, 1491);
        class178.field3220 = arg2.method84(class54.field1116, 1491);
        class111.field2096 = arg2.method84(class34.field800, 1491);
        class44.field956 = arg2.method84(class48.field1006, 1491);
        class96.field1756 = arg2.method84(class17.field499, 1491);
        class97.field1783 = arg2.method84(class157.field2853, 1491);
        class81.field1538 = arg2.method84(class198.field3550, 1491);
        class60.field1211 = arg2.method84(class149.field2719, 1491);
        class246.field4538 = arg2.method84(class163.field2973, 1491);
        class101.field1843 = arg2.method84(class97.field1776, 1491);
        int var4 = -92 / ((arg3 - 35) / 47);
        class101.field1846 = arg2.method84(class172.field3107, 1491);
        class76.field1453 = arg0.method84(class162.field2966, 1491);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[[I")
    public final int[][] method116(int arg0, int arg1) {
        ++field1828;
        if (arg1 != -9179) {
            return null;
        } else {
            int[][] var3 = super.field3022.method1148(arg0, 8708);
            if (super.field3022.field2957) {
                int[][] var4 = this.method1180(arg0, arg1 ^ -19258, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var3[0];
                for (int var11 = 0; class115.field2146 > var11; ++var11) {
                    int var12 = var7[var11];
                    int var13 = var5[var11];
                    int var14 = var6[var11];
                    if (var12 == var13 && var12 == var14) {
                        var10[var11] = this.field1821 * var13 >> 12;
                        var8[var11] = this.field1829 * var12 >> 12;
                        var9[var11] = this.field1833 * var14 >> 12;
                    } else {
                        var10[var11] = this.field1821;
                        var8[var11] = this.field1829;
                        var9[var11] = this.field1833;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
    public class100() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([BILsf;B)V")
    public static final void method678(byte[] arg0, int arg1, class203 arg2, byte arg3) {
        ++field1831;
        class185 var4 = new class185();
        var4.field389 = (long) arg1;
        var4.field3321 = arg0;
        var4.field3327 = 0;
        var4.field3322 = arg2;
        class36 var5 = class55.field1118;
        synchronized (class55.field1118) {
            class55.field1118.method325(119, var4);
        }
        int var6 = -100 / ((4 - arg3) / 63);
        class247.method1616(13819);
    }

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "(I)[Lr;")
    public static final class186[] method679(int arg0) {
        class186[] var1 = new class186[class203.field3668];
        for (int var2 = 0; ~var2 > ~class203.field3668; ++var2) {
            var1[var2] = new class153(class106.field1934, class199.field3582, field1827[var2], class106.field1927[var2], class204.field3690[var2], class11.field376[var2], class105.field1921[var2], class122.field2287);
        }
        if (arg0 < 68) {
            field1823 = 100L;
        }
        ++field1830;
        class45.method376(5851);
        return var1;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        ++field1832;
        if (arg1) {
            method679(-37);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field1833 = arg0.method1049((byte) 115);
                }
            } else {
                this.field1829 = arg0.method1049((byte) 97);
            }
        } else {
            this.field1821 = arg0.method1049((byte) 89);
        }
    }
}
