import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class135 extends class202 {

    @OriginalMember(owner = "client!oj", name = "W", descriptor = "Lef;")
    public class175 field2278 = new class175();

    @OriginalMember(owner = "client!oj", name = "bb", descriptor = "Ltg;")
    public class78 field2283 = new class78();

    @OriginalMember(owner = "client!oj", name = "X", descriptor = "Lre;")
    private class221 field2279;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "S")
    public static short field2261 = 320;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "I")
    public static int field2263 = 1;

    @OriginalMember(owner = "client!oj", name = "T", descriptor = "Le;")
    private static class191 field2275 = class54.method368("Loading fonts )2 ", 2047);

    @OriginalMember(owner = "client!oj", name = "V", descriptor = "Le;")
    public static class191 field2277 = field2275;

    @OriginalMember(owner = "client!oj", name = "Z", descriptor = "Le;")
    public static class191 field2281 = class54.method368("Verbindung zum Update)2Server hergestellt)3", 2047);

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "I")
    public static int field2267 = 0;

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "[[B")
    public static byte[][] field2266 = new byte[1000][];

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!oj", name = "P", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!oj", name = "Q", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!oj", name = "R", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!oj", name = "Y", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!oj", name = "S", descriptor = "Lng;")
    public static class121 field2274;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "Lwa;")
    public static class226 field2260;

    @OriginalMember(owner = "client!oj", name = "ab", descriptor = "Ljava/awt/Image;")
    public static Image field2282;

    @OriginalMember(owner = "client!oj", name = "U", descriptor = "[I")
    public static int[] field2276;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "()Lii;")
    public final class202 method511() {
        field2280++;
        class110 var1;
        do {
            var1 = (class110) this.field2278.method1175(-1);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1843 == null);
        return var1.field1843;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Ldk;")
    public static final class184 method904(int arg0, int arg1) {
        field2273++;
        class184 var2 = (class184) class210.field3729.method991((long) arg1, -25858);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class82.field1385.method826((byte) 35, class75.method485(arg1, -1044), class151.method1025(127, arg1));
        class184 var4 = new class184();
        var4.field3168 = arg1;
        if (var3 != null) {
            var4.method1239(new class225(var3), (byte) 46);
        }
        var4.method1250(123);
        class210.field3729.method987(var4, (long) arg1, -2438);
        int var5 = 47 % ((arg0 + 74) / 34);
        return var4;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(IIII)V")
    public static final void method905(int arg0, int arg1, int arg2, int arg3) {
        class241 var4 = class14.method97(4, arg1, -71);
        var4.method1694((byte) -90);
        var4.field4279 = arg3;
        field2269++;
        if (arg0 == 13851) {
            var4.field4301 = arg2;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)I")
    public static final int method906(int arg0, byte arg1) {
        field2271++;
        if (arg1 >= -16) {
            return -102;
        } else if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
            return arg0 + 32;
        } else if (arg0 == 159) {
            return 255;
        } else if (arg0 == 140) {
            return 156;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([IZILcd;II)V")
    private final void method907(int[] arg0, boolean arg1, int arg2, class110 arg3, int arg4, int arg5) {
        if (arg1) {
            field2267 = -35;
        }
        if ((this.field2279.field3950[arg3.field1845] & 0x4) != 0 && arg3.field1842 < 0) {
            int var7 = this.field2279.field3930[arg3.field1845] / class75.field1284;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field1836) / var7;
                if (arg2 < var8) {
                    arg3.field1836 += arg2 * var7;
                    break;
                }
                arg2 -= var8;
                arg3.field1843.method503(arg0, arg5, var8);
                arg3.field1836 += var7 * var8 - 1048576;
                int var9 = class75.field1284 / 100;
                arg5 += var8;
                class116 var10 = arg3.field1843;
                int var11 = 262144 / var7;
                if (var11 < var9) {
                    var9 = var11;
                }
                if (this.field2279.field3911[arg3.field1845] == 0) {
                    arg3.field1843 = class116.method771(arg3.field1853, var10.method745(), var10.method769(), var10.method749());
                } else {
                    arg3.field1843 = class116.method771(arg3.field1853, var10.method745(), 0, var10.method749());
                    this.field2279.method1542((byte) -76, arg3.field1837.field2180[arg3.field1855] < 0, arg3);
                    arg3.field1843.method763(var9, var10.method769());
                }
                if (arg3.field1837.field2180[arg3.field1855] < 0) {
                    arg3.field1843.method770(-1);
                }
                var10.method741(var9);
                var10.method503(arg0, arg5, arg4 - arg5);
                if (var10.method744()) {
                    this.field2283.method502(var10);
                }
            }
        }
        field2264++;
        arg3.field1843.method503(arg0, arg5, arg2);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "()I")
    public final int method501() {
        field2262++;
        return 0;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
    public static void method908(byte arg0) {
        field2274 = null;
        field2282 = null;
        if (arg0 != -33) {
            method904(-1, 109);
        }
        field2260 = null;
        field2277 = null;
        field2266 = null;
        field2276 = null;
        field2275 = null;
        field2281 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([III)V")
    public final void method503(int[] arg0, int arg1, int arg2) {
        this.field2283.method503(arg0, arg1, arg2);
        field2268++;
        for (class110 var4 = (class110) this.field2278.method1173(85); var4 != null; var4 = (class110) this.field2278.method1175(-1)) {
            if (!this.field2279.method1530(-94, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1854) {
                        this.method907(arg0, false, var6, var4, var5 + var6, var5);
                        var4.field1854 -= var6;
                        break;
                    }
                    this.method907(arg0, false, var4.field1854, var4, var5 + var6, var5);
                    var5 += var4.field1854;
                    var6 -= var4.field1854;
                } while (!this.field2279.method1506((byte) 24, var6, arg0, var4, var5));
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "()Lii;")
    public final class202 method508() {
        field2265++;
        class110 var1 = (class110) this.field2278.method1173(42);
        if (var1 == null) {
            return null;
        } else if (var1.field1843 == null) {
            return this.method511();
        } else {
            return var1.field1843;
        }
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V")
    public final void method510(int arg0) {
        this.field2283.method510(arg0);
        field2270++;
        for (class110 var2 = (class110) this.field2278.method1173(44); var2 != null; var2 = (class110) this.field2278.method1175(-1)) {
            if (!this.field2279.method1530(100, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1854) {
                        this.method909(var2, var3, 0);
                        var2.field1854 -= var3;
                        break;
                    }
                    this.method909(var2, var2.field1854, 0);
                    var3 -= var2.field1854;
                } while (!this.field2279.method1506((byte) -98, var3, (int[]) null, var2, 0));
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lcd;II)V")
    private final void method909(class110 arg0, int arg1, int arg2) {
        if ((this.field2279.field3950[arg0.field1845] & 0x4) != arg2 && arg0.field1842 < 0) {
            int var4 = this.field2279.field3930[arg0.field1845] / class75.field1284;
            int var5 = (var4 + 1048575 - arg0.field1836) / var4;
            arg0.field1836 = arg1 * var4 + arg0.field1836 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field2279.field3911[arg0.field1845] == 0) {
                    arg0.field1843 = class116.method771(arg0.field1853, arg0.field1843.method745(), arg0.field1843.method769(), arg0.field1843.method749());
                } else {
                    arg0.field1843 = class116.method771(arg0.field1853, arg0.field1843.method745(), 0, arg0.field1843.method749());
                    this.field2279.method1542((byte) 105, arg0.field1837.field2180[arg0.field1855] < 0, arg0);
                }
                if (arg0.field1837.field2180[arg0.field1855] < 0) {
                    arg0.field1843.method770(-1);
                }
                arg1 = arg0.field1836 / var4;
            }
        }
        field2272++;
        arg0.field1843.method510(arg1);
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lre;)V")
    public class135(class221 arg0) {
        this.field2279 = arg0;
    }
}
