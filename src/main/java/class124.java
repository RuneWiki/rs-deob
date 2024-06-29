import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class124 {

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "Lea;")
    private class227 field2171 = new class227();

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    private int field2182;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    private int field2184;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Ll;")
    private class328 field2170;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Z")
    public static volatile boolean field2174 = true;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "[I")
    public static int[] field2176 = new int[256];

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "Llj;")
    public static class59 field2185 = new class59(64);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "Ljj;")
    public static class168 field2187;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Lek;")
    public static class206 field2173;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "Lek;")
    public static class206 field2186;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(JLjava/lang/Object;I)V", line = 9)
    public final void method888(long arg0, Object arg1, int arg2) {
        this.method897(128, arg0);
        if (this.field2184 == 0) {
            class185 var5 = (class185) this.field2171.method1587(0);
            var5.method535(-2801);
            var5.method2152((byte) 50);
        } else {
            this.field2184--;
        }
        field2183++;
        class331 var6 = new class331(arg1);
        this.field2170.method2337(var6, 709, arg0);
        this.field2171.method1585(var6, (byte) -12);
        var6.field4902 = 0L;
        if (arg2 <= 8) {
            this.method896(91, (byte) 72);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V", line = 37)
    public final void method889(byte arg0) {
        this.field2171.method1582(-26);
        field2177++;
        this.field2170.method2346((byte) 83);
        int var2 = -82 / ((-arg0 - 65) / 53);
        this.field2184 = this.field2182;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 49)
    public static final void method890(int arg0) {
        class174.field2885 = arg0;
        class275.field4492 = false;
        class92.field1637 = 0;
        class272.field4424 = 0;
        class144.field2423 = -1;
        field2180++;
        class284.field4641 = 0;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lqn;IIIIILcb;Lth;I)V", line = 62)
    public static final void method891(class238 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class314 arg6, class98 arg7, int arg8) {
        field2172++;
        class302 var9 = new class302();
        var9.field4911 = arg2 * 128;
        var9.field4915 = arg1;
        var9.field4909 = arg4 * arg5;
        if (arg0 != null) {
            var9.field4904 = arg0.field3920;
            var9.field4914 = arg0.field3888 * 128;
            var9.field4923 = arg0.field3945;
            int var11 = arg0.field3935;
            var9.field4908 = arg0.field3961;
            var9.field4922 = arg0.field3933;
            var9.field4925 = arg0.field3928;
            int var12 = arg0.field3890;
            if (arg8 == 1 || arg8 == 3) {
                var12 = arg0.field3935;
                var11 = arg0.field3890;
            }
            var9.field4919 = (arg2 + var12) * 128;
            var9.field4926 = arg0;
            var9.field4924 = (arg4 + var11) * 128;
            if (arg0.field3937 != null) {
                var9.field4927 = true;
                var9.method2163(arg5 - 57);
            }
            if (var9.field4925 != null) {
                var9.field4917 = (int) (Math.random() * (double) (var9.field4922 - var9.field4923)) + var9.field4923;
            }
            class232.field3798.method437(var9, (byte) 51);
        } else if (arg6 != null) {
            var9.field4913 = arg6;
            class88 var10 = arg6.field5107;
            if (var10.field1552 != null) {
                var9.field4927 = true;
                var10 = var10.method681((byte) 15);
            }
            if (var10 != null) {
                var9.field4919 = (var10.field1565 + arg2) * 128;
                var9.field4924 = (var10.field1565 + arg4) * 128;
                var9.field4904 = class149.method1068(arg6, 97);
                var9.field4908 = var10.field1593;
                var9.field4914 = var10.field1554 * 128;
            }
            class46.field931.method437(var9, (byte) 51);
        } else if (arg7 != null) {
            var9.field4929 = arg7;
            var9.field4924 = (arg4 + arg7.method49((byte) 94)) * 128;
            var9.field4919 = (arg7.method49((byte) 99) + arg2) * 128;
            var9.field4904 = class188.method1307(arg7, 127);
            var9.field4908 = arg7.field1806;
            var9.field4914 = arg7.field1799 * 128;
            class362.field5736.method2337(var9, arg5 + 581, (long) arg3);
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)I", line = 150)
    public final int method892(int arg0) {
        field2175++;
        int var2 = arg0;
        for (class185 var3 = (class185) this.field2171.method1580((byte) -122); var3 != null; var3 = (class185) this.field2171.method1586((byte) 50)) {
            if (!var3.method858(arg0 - 121)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(JI)Ljava/lang/Object;", line = 176)
    public final Object method893(long arg0, int arg1) {
        field2169++;
        class185 var4 = (class185) this.field2170.method2344(-1, arg0);
        if (arg1 < 48) {
            this.method888(108L, (Object) null, 80);
        }
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method857(0);
        if (var5 == null) {
            var4.method535(-2801);
            var4.method2152((byte) 73);
            this.field2184++;
            return null;
        }
        if (var4.method858(-110)) {
            class331 var6 = new class331(var5);
            this.field2170.method2337(var6, 709, var4.field1291);
            this.field2171.method1585(var6, (byte) -12);
            var6.field4902 = 0L;
            var4.method535(-2801);
            var4.method2152((byte) -106);
        } else {
            this.field2171.method1585(var4, (byte) -12);
            var4.field4902 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V", line = 222)
    public static void method894(byte arg0) {
        field2186 = null;
        if (arg0 <= 45) {
            field2185 = (class59) null;
        }
        field2173 = null;
        field2187 = null;
        field2185 = null;
        field2176 = null;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(I)V", line = 273)
    public class124(int arg0) {
        this.field2182 = arg0;
        this.field2184 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2170 = new class328(var2);
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V", line = 250)
    public final void method895(int arg0) {
        if (arg0 != 128) {
            field2174 = false;
        }
        for (class185 var2 = (class185) this.field2171.method1580((byte) -128); var2 != null; var2 = (class185) this.field2171.method1586((byte) 50)) {
            if (var2.method858(arg0 ^ 0xFFFFFF18)) {
                var2.method535(arg0 - 2929);
                var2.method2152((byte) -110);
                this.field2184++;
            }
        }
        field2181++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)V", line = 292)
    public final void method896(int arg0, byte arg1) {
        field2178++;
        if (class138.field2346 != null) {
            for (class185 var3 = (class185) this.field2171.method1580((byte) -122); var3 != null; var3 = (class185) this.field2171.method1586((byte) 50)) {
                if (var3.method858(-121)) {
                    if (var3.method857(0) == null) {
                        var3.method535(-2801);
                        var3.method2152((byte) 102);
                        this.field2184++;
                    }
                } else if (((long) arg0) < (++var3.field4902)) {
                    class185 var4 = class138.field2346.method1071(var3, (byte) 125);
                    this.field2170.method2337(var4, 709, var3.field1291);
                    class220.method1534(var4, var3, -125);
                    var3.method535(-2801);
                    var3.method2152((byte) 118);
                }
            }
        }
        if (arg1 >= -13) {
            method890(-69);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IJ)V", line = 341)
    public final void method897(int arg0, long arg1) {
        if (arg0 != 128) {
            this.field2170 = (class328) null;
        }
        field2179++;
        class185 var4 = (class185) this.field2170.method2344(arg0 ^ 0xFFFFFF7F, arg1);
        if (var4 != null) {
            var4.method535(-2801);
            var4.method2152((byte) -79);
            this.field2184++;
        }
    }
}
