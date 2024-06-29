import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class110 extends class87 {

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "I")
    private int field1843 = -1;

    @OriginalMember(owner = "client!kg", name = "J", descriptor = "Ljava/lang/String;")
    public static String field1835 = "glow2:";

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "I")
    public static int field1840 = 0;

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "I")
    public static int field1844 = 0;

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "I")
    public static int field1832 = 0;

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field1842 = "Loading world list data";

    @OriginalMember(owner = "client!kg", name = "Y", descriptor = "I")
    public static int field1849 = 0;

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "Lie;")
    public static class2 field1836 = new class2();

    @OriginalMember(owner = "client!kg", name = "H", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!kg", name = "L", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!kg", name = "U", descriptor = "I")
    private int field1845;

    @OriginalMember(owner = "client!kg", name = "V", descriptor = "I")
    private int field1846;

    @OriginalMember(owner = "client!kg", name = "W", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!kg", name = "X", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!kg", name = "Z", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!kg", name = "ab", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "[I")
    private int[] field1834;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)Z")
    private final boolean method837(boolean arg0) {
        ++field1838;
        if (this.field1834 != null) {
            return true;
        } else {
            if (!arg0) {
                field1840 = 82;
            }
            if (this.field1843 >= 0) {
                int var2 = class206.field3032;
                int var3 = class123.field2045;
                int var4 = class143.field2314.method242(false, this.field1843).field4465 ? 64 : 128;
                this.field1834 = class143.field2314.method248(var4, var4, this.field1843, -125, 1.0F, false);
                this.field1846 = var4;
                this.field1845 = var4;
                class92.method700(var2, var3, false);
                return this.field1834 != null;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)V")
    public static final void method838(int arg0, int arg1) {
        ++field1837;
        if (arg1 == 904) {
            class35.field449.method1416(arg0, 0);
            class52.field712.method1416(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "(I)V")
    public static void method839(int arg0) {
        if (arg0 <= 10) {
            method838(-11, -71);
        }
        field1835 = null;
        field1836 = null;
        field1842 = null;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    public class110() {
        super(0, false);
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V")
    public final void method645(byte arg0) {
        ++field1839;
        super.method645((byte) -123);
        if (arg0 <= -10) {
            this.field1834 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(IZ)V")
    public static final void method840(int arg0, boolean arg1) {
        if (arg0 == 0) {
            class81.method608(false, class179.field2677, arg1, class1.field17, class137.field2230);
            ++field1848;
        }
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(III)V")
    public static final void method841(int arg0, int arg1, int arg2) {
        ++field1850;
        if (arg1 != -129) {
            method842(-106, 40, 116, 9, -2, 21);
        }
        class303.field4900[arg0] = arg2;
        class292 var3 = (class292) class170.field2574.method1073(-1, (long) arg0);
        if (var3 != null) {
            var3.field4645 = class3.method14(29853) - -500L;
        } else {
            class292 var4 = new class292(500L + class3.method14(arg1 ^ -29726));
            class170.field2574.method1074((byte) 39, var4, (long) arg0);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIII)V")
    public static final void method842(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class162.field2509 = arg2;
        class139.field2263 = arg4;
        class234.field3421 = arg1;
        ++field1847;
        if (arg3 != 2047) {
            method840(-117, true);
        }
        class121.field2001 = arg5;
        class301.field4853 = arg0;
        if (class139.field2263 >= 100) {
            int var6 = class162.field2509 * 128 + 64;
            int var7 = class121.field2001 * 128 + 64;
            int var8 = class113.method851(class37.field474, -34, var7, var6) - class301.field4853;
            int var9 = var6 - class93.field1533;
            int var10 = var8 - class226.field3324;
            int var11 = var7 - class260.field4024;
            int var12 = (int) Math.sqrt((double) (var9 * var9 - -(var11 * var11)));
            class115.field1906 = (int) (325.949D * Math.atan2((double) var10, (double) var12)) & 2047;
            class268.field4303 = (int) (-325.949D * Math.atan2((double) var9, (double) var11)) & 2047;
            if (~class115.field1906 > -129) {
                class115.field1906 = 128;
            }
            if (~class115.field1906 < -384) {
                class115.field1906 = 383;
            }
        }
        class119.field1931 = 2;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field1843 = arg0.method331(arg2 + -25729);
        }
        if (arg2 != 25645) {
            this.field1843 = -103;
        }
        ++field1833;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)[[I")
    public final int[][] method143(int arg0, int arg1) {
        ++field1851;
        int[][] var3 = super.field1390.method1902(-102, arg0);
        if (arg1 != 6) {
            return null;
        } else {
            if (super.field1390.field4428 && this.method837(true)) {
                int var4 = (~class123.field2045 == ~this.field1846 ? arg0 : this.field1846 * arg0 / class123.field2045) * this.field1845;
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                if (class206.field3032 == this.field1845) {
                    for (int var8 = 0; ~class206.field3032 < ~var8; ++var8) {
                        int var9 = this.field1834[var4++];
                        var7[var8] = class301.method2056(var9, 255) << 4;
                        var6[var8] = class301.method2056(var9 >> 4, 4080);
                        var5[var8] = class301.method2056(16711680, var9) >> 12;
                    }
                } else {
                    for (int var10 = 0; ~class206.field3032 < ~var10; ++var10) {
                        int var11 = this.field1845 * var10 / class206.field3032;
                        int var12 = this.field1834[var4 + var11];
                        var7[var10] = class301.method2056(var12 << 4, 4080);
                        var6[var10] = class301.method2056(var12, 65280) >> 4;
                        var5[var10] = class301.method2056(16711680, var12) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)I")
    public final int method644(byte arg0) {
        int var2 = -87 / ((-23 - arg0) / 48);
        ++field1841;
        return this.field1843;
    }
}
