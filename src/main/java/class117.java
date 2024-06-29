import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class117 {

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "Lmg;")
    private class151 field1884 = new class151();

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    private int field1874;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    private int field1878;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "Lld;")
    private class118 field1887;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "Lok;")
    public static class146 field1879 = class235.method1724(-12908, "Hidden)2use");

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Lvh;")
    public static class49 field1873 = null;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "[[I")
    public static int[][] field1877 = new int[104][104];

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "[I")
    public static int[] field1881 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field1885 = 0;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "Z")
    public static boolean field1888 = true;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 4)
    public final void method791(int arg0) {
        field1886++;
        this.field1884.method1196((byte) 82);
        this.field1887.method801(0);
        if (arg0 != 8) {
            field1879 = (class146) null;
        }
        this.field1878 = this.field1874;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V", line = 17)
    public static final void method792(byte arg0) {
        class118.field1914 = (byte[][][]) null;
        if (arg0 >= -122) {
            field1877 = (int[][]) ((int[][]) null);
        }
        class245.field4054 = null;
        field1876++;
        class199.field3332 = (int[][][]) null;
        class84.field1339 = null;
        class20.field389 = (byte[][][]) null;
        class25.field447 = null;
        class297.field5056 = null;
        class106.field1711 = null;
        class164.field2777 = (byte[][][]) null;
        class55.field988 = (byte[][][]) null;
        class292.field4973 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V", line = 45)
    public final void method793(byte arg0) {
        for (class223 var2 = (class223) this.field1884.method1197(17181); var2 != null; var2 = (class223) this.field1884.method1198((byte) -128)) {
            if (var2.method721(-124)) {
                var2.method1325(-2935);
                var2.method1703((byte) 97);
                this.field1878++;
            }
        }
        field1880++;
        if (arg0 > -45) {
            this.method797((Object) null, 112, 23L);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V", line = 81)
    public final void method794(int arg0, int arg1) {
        if (arg0 != -17435) {
            method792((byte) 28);
        }
        field1890++;
        if (class287.field4916 == null) {
            return;
        }
        for (class223 var3 = (class223) this.field1884.method1197(17181); var3 != null; var3 = (class223) this.field1884.method1198((byte) -125)) {
            if (var3.method721(arg0 ^ 0x4461)) {
                if (var3.method722((byte) 116) == null) {
                    var3.method1325(-2935);
                    var3.method1703((byte) 124);
                    this.field1878++;
                }
            } else if ((++var3.field3874) > ((long) arg1)) {
                class223 var4 = class287.field4916.method2144(32, var3);
                this.field1887.method805(var4, var3.field2883, arg0 + 17545);
                class113.method762((byte) -101, var4, var3);
                var3.method1325(-2935);
                var3.method1703((byte) 90);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILr;IIIIZI)V", line = 129)
    public static final void method795(int arg0, class264 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field1891++;
        if (class294.field4989) {
            class203.field3395 = 32;
        } else {
            class203.field3395 = 0;
        }
        class294.field4989 = arg6;
        if (class14.field272 != 0) {
            if (arg4 <= arg7 && arg7 < arg4 + 16 && arg2 <= arg0 && arg0 < arg2 + 16) {
                arg1.field4377 -= 4;
                class164.method1280(false, arg1);
            } else if (arg4 <= arg7 && arg7 < (arg4 + 16) && arg0 >= arg5 + arg2 - 16 && arg0 < arg2 + arg5) {
                arg1.field4377 += 4;
                class164.method1280(false, arg1);
            } else if (arg4 - class203.field3395 <= arg7 && arg7 < (arg4 + class203.field3395 + 16) && arg2 + 16 <= arg0 && arg0 < arg2 + arg5 - 16) {
                int var8 = (arg5 - 32) * arg5 / arg3;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg0 - var8 / 2 - arg2 - 16;
                int var10 = arg5 - var8 - 32;
                arg1.field4377 = (arg3 - arg5) * var9 / var10;
                class164.method1280(arg6, arg1);
                class294.field4989 = true;
            }
        }
        if (class236.field3947 == 0) {
            return;
        }
        int var11 = arg1.field4393;
        if (arg7 >= (arg4 - var11) && arg2 <= arg0 && arg7 < arg4 + 16 && (arg2 + arg5) >= arg0) {
            arg1.field4377 += class236.field3947 * 45;
            class164.method1280(false, arg1);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IJ)V", line = 203)
    public final void method796(int arg0, long arg1) {
        class223 var4 = (class223) this.field1887.method810((byte) -118, arg1);
        field1883++;
        if (var4 != null) {
            var4.method1325(-2935);
            var4.method1703((byte) -17);
            this.field1878++;
        }
        int var5 = 118 / ((69 - arg0) / 55);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/Object;IJ)V", line = 231)
    public final void method797(Object arg0, int arg1, long arg2) {
        field1882++;
        this.method796(-9, arg2);
        if (this.field1878 == arg1) {
            class223 var5 = (class223) this.field1884.method1194(false);
            var5.method1325(-2935);
            var5.method1703((byte) -65);
        } else {
            this.field1878--;
        }
        class321 var6 = new class321(arg0);
        this.field1887.method805(var6, arg2, 110);
        this.field1884.method1195((byte) -93, var6);
        var6.field3874 = 0L;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)I", line = 258)
    public final int method798(byte arg0) {
        int var2 = 0;
        field1872++;
        for (class223 var3 = (class223) this.field1884.method1197(17181); var3 != null; var3 = (class223) this.field1884.method1198((byte) -128)) {
            if (!var3.method721(-126)) {
                var2++;
            }
        }
        int var4 = -95 % ((arg0 + 3) / 40);
        return var2;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(I)V", line = 330)
    public class117(int arg0) {
        this.field1874 = arg0;
        this.field1878 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field1887 = new class118(var2);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BJ)Ljava/lang/Object;", line = 289)
    public final Object method799(byte arg0, long arg1) {
        field1875++;
        if (arg0 != 52) {
            this.method797((Object) null, -121, 22L);
        }
        class223 var4 = (class223) this.field1887.method810((byte) -119, arg1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method722((byte) 116);
        if (var5 == null) {
            var4.method1325(-2935);
            var4.method1703((byte) -18);
            this.field1878++;
            return null;
        }
        if (var4.method721(arg0 - 177)) {
            class321 var6 = new class321(var5);
            this.field1887.method805(var6, var4.field2883, arg0 ^ 0x6D);
            this.field1884.method1195((byte) -93, var6);
            var6.field3874 = 0L;
            var4.method1325(-2935);
            var4.method1703((byte) -111);
        } else {
            this.field1884.method1195((byte) -93, var4);
            var4.field3874 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)V", line = 346)
    public static void method800(byte arg0) {
        field1879 = null;
        field1873 = null;
        field1877 = (int[][]) null;
        field1881 = null;
        if (arg0 >= -63) {
            field1873 = (class49) null;
        }
    }
}
