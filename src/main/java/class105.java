import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class105 {

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Lie;")
    private class32 field1858 = new class32();

    @OriginalMember(owner = "client!c", name = "u", descriptor = "Ltk;")
    private class51 field1875 = new class51();

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    private int field1873;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    private int field1874;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "Ldk;")
    private class275 field1876;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "Lqk;")
    private static class207 field1864 = class24.method212(255, "Loading fonts )2 ");

    @OriginalMember(owner = "client!c", name = "g", descriptor = "[I")
    public static int[] field1861 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field1860 = 0;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Lqk;")
    public static class207 field1857 = field1864;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public static int field1870 = 0;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "Z")
    public static boolean field1867 = false;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "[Lkb;")
    public static class52[] field1859;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)Lij;")
    public final class194 method754(int arg0) {
        int var2 = -78 % ((-arg0 - 57) / 42);
        field1865++;
        return this.field1876.method1873((byte) 99);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)Lij;")
    public final class194 method755(byte arg0) {
        field1872++;
        if (arg0 >= -45) {
            field1864 = null;
        }
        return this.field1876.method1866((byte) -107);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static void method756(int arg0) {
        if (arg0 != 4) {
            field1860 = -107;
        }
        field1861 = null;
        field1864 = null;
        field1859 = null;
        field1857 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z[Lqk;)Lqk;")
    public static final class207 method757(boolean arg0, class207[] arg1) {
        if (arg0) {
            method760(47, 33L, (int[]) null, (byte) 123);
        }
        field1863++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class48.method361(16, arg1.length, arg1, 0);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZJ)Lie;")
    public final class32 method758(boolean arg0, long arg1) {
        class32 var4 = (class32) this.field1876.method1867(arg1, true);
        if (var4 != null) {
            this.field1875.method389(false, var4);
        }
        field1869++;
        if (arg0) {
            method757(false, (class207[]) null);
        }
        return var4;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(JILie;)V")
    public final void method759(long arg0, int arg1, class32 arg2) {
        field1866++;
        if (this.field1873 == 0) {
            class32 var5 = this.field1875.method397(524287);
            var5.method1346((byte) -16);
            var5.method244(arg1 - 10370);
            if (this.field1858 == var5) {
                class32 var6 = this.field1875.method397(524287);
                var6.method1346((byte) -16);
                var6.method244(arg1 - 10370);
            }
        } else {
            this.field1873--;
        }
        this.field1876.method1863((byte) -128, arg2, arg0);
        this.field1875.method389(false, arg2);
        if (arg1 != 2) {
            this.method762(114);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IJ[IB)Lqk;")
    public static final class207 method760(int arg0, long arg1, int[] arg2, byte arg3) {
        field1871++;
        if (class22.field359 != null) {
            class207 var5 = class22.field359.method1320(arg2, (byte) -82, arg1, arg0);
            if (var5 != null) {
                return var5;
            }
        }
        return arg3 < 34 ? null : class113.method809(13216, arg1);
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
    public static final void method761(int arg0) {
        field1868++;
        int var1 = class4.field66 >> 7;
        if (class25.field533 < 128) {
            class25.field533 = 128;
        }
        int var2 = class260.field4636 >> 7;
        if (arg0 != -4) {
            field1861 = null;
        }
        class266.field4711 &= 0x7FF;
        int var3 = 0;
        if (class25.field533 > 383) {
            class25.field533 = 383;
        }
        int var4 = class22.method139(class4.field66, class260.field4636, arg0 ^ 0xFFFFA257, class93.field1645);
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class93.field1645;
                    if (var7 < 3 && (class271.field4791[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class147.field2515[var7][var5][var6] & 0xFF) * 8 - (class163.field2881[var7][var5][var6] - var4);
                    if (var3 < var8) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class143.field2477) {
            class143.field2477 += (var9 - class143.field2477) / 24;
        } else if (class143.field2477 > var9) {
            class143.field2477 += (var9 - class143.field2477) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
    public final void method762(int arg0) {
        this.field1875.method394(true);
        this.field1876.method1870((byte) -94);
        this.field1858 = new class32();
        if (arg0 > -113) {
            this.method754(20);
        }
        field1856++;
        this.field1873 = this.field1874;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(I)V")
    public class105(int arg0) {
        this.field1873 = arg0;
        this.field1874 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field1876 = new class275(var2);
    }
}
