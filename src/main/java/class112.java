import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class112 {

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "Lmn;")
    private class368 field1929;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
    private int field1926;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    private int field1924;

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "Leq;")
    private class213 field1940;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!jr", name = "m", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!jr", name = "r", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!jr", name = "s", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!jr", name = "t", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "Lha;")
    public static class59 field1938;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)I", line = 6)
    public final int method984(int arg0) {
        field1941++;
        int var2 = arg0;
        for (class21 var3 = (class21) this.field1929.method2344(-84); var3 != null; var3 = (class21) this.field1929.method2336((byte) 79)) {
            if (!var3.method167(-4)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)Z", line = 28)
    public static final boolean method985(int arg0, int arg1) {
        if (arg1 <= 21) {
            method998(null, -21);
        }
        field1928++;
        return arg0 == 2 || arg0 == 3;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)I", line = 40)
    public final int method986(int arg0) {
        if (arg0 != -4) {
            this.method986(19);
        }
        field1937++;
        return this.field1924;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(II)V", line = 52)
    public final void method987(int arg0, int arg1) {
        if (arg0 != 2) {
            return;
        }
        field1933++;
        if (class515.field7169 == null) {
            return;
        }
        for (class21 var3 = (class21) this.field1929.method2344(-59); var3 != null; var3 = (class21) this.field1929.method2336((byte) 97)) {
            if (var3.method167(-4)) {
                if (var3.method165(100) == null) {
                    var3.method2314((byte) 60);
                    var3.method115(true);
                    this.field1926 += var3.field325;
                }
            } else if ((++var3.field235) > ((long) arg1)) {
                class21 var4 = class515.field7169.method2000(3, var3);
                this.field1940.method1468((byte) 86, var3.field5204, var4);
                class275.method1815(var4, var3, (byte) 63);
                var3.method2314((byte) 116);
                var3.method115(true);
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(I)V", line = 100)
    public class112(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 103)
    public final Object method988(int arg0) {
        field1934++;
        class21 var2 = (class21) this.field1940.method1467(0);
        while (var2 != null) {
            Object var3 = var2.method165(114);
            if (var3 != null) {
                return var3;
            }
            class21 var4 = var2;
            var2 = (class21) this.field1940.method1467(0);
            var4.method2314((byte) 92);
            var4.method115(true);
            this.field1926 += var4.field325;
        }
        if (arg0 > -67) {
            field1938 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILjava/lang/Object;JI)V", line = 135)
    public final void method989(int arg0, Object arg1, long arg2, int arg3) {
        field1932++;
        if (arg3 > this.field1924) {
            throw new IllegalStateException("s>cs");
        }
        this.method995(arg2, 0);
        this.field1926 -= arg3;
        while (this.field1926 < 0) {
            class21 var7 = (class21) this.field1929.method2341(arg0 ^ 0x7C8A);
            this.method994(var7, arg0 ^ 0xFFFF8305);
        }
        class582 var6 = new class582(arg1, arg3);
        this.field1940.method1468((byte) 54, arg2, var6);
        if (arg0 != 31902) {
            this.field1926 = -106;
        }
        this.field1929.method2338(true, var6);
        var6.field235 = 0L;
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)I", line = 165)
    public final int method990(int arg0) {
        if (arg0 != -18529) {
            this.method992(-64L, 37);
        }
        field1939++;
        return this.field1926;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ljava/lang/Object;JB)V", line = 176)
    public final void method991(Object arg0, long arg1, byte arg2) {
        if (arg2 >= -92) {
            method998(null, -7);
        }
        field1935++;
        this.method989(31902, arg0, arg1, 1);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(JI)Ljava/lang/Object;", line = 188)
    public final Object method992(long arg0, int arg1) {
        int var4 = -59 % ((arg1 - 2) / 47);
        field1925++;
        class21 var5 = (class21) this.field1940.method1465(arg0, -6008);
        if (var5 == null) {
            return null;
        }
        Object var6 = var5.method165(86);
        if (var6 == null) {
            var5.method2314((byte) 102);
            var5.method115(true);
            this.field1926 += var5.field325;
            return null;
        }
        if (var5.method167(-4)) {
            class582 var7 = new class582(var6, var5.field325);
            this.field1940.method1468((byte) 90, var5.field5204, var7);
            this.field1929.method2338(true, var7);
            var7.field235 = 0L;
            var5.method2314((byte) 112);
            var5.method115(true);
        } else {
            this.field1929.method2338(true, var5);
            var5.field235 = 0L;
        }
        return var6;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V", line = 231)
    public static void method993(byte arg0) {
        field1938 = null;
        int var1 = -19 % ((arg0 - 59) / 55);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lqia;I)V", line = 242)
    private final void method994(class21 arg0, int arg1) {
        int var3 = 80 / ((arg1 - 6) / 36);
        field1942++;
        if (arg0 != null) {
            arg0.method2314((byte) 117);
            arg0.method115(true);
            this.field1926 += arg0.field325;
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(JI)V", line = 260)
    private final void method995(long arg0, int arg1) {
        if (arg1 != 0) {
            this.field1929 = null;
        }
        field1930++;
        class21 var4 = (class21) this.field1940.method1465(arg0, -6008);
        this.method994(var4, -57);
    }

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "(I)V", line = 275)
    public final void method996(int arg0) {
        field1936++;
        for (class21 var2 = (class21) this.field1929.method2344(-71); var2 != null; var2 = (class21) this.field1929.method2336((byte) 50)) {
            if (var2.method167(-4)) {
                var2.method2314((byte) 118);
                var2.method115(true);
                this.field1926 += var2.field325;
            }
        }
        if (arg0 >= -75) {
            this.method996(-97);
        }
    }

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 302)
    public final Object method997(int arg0) {
        field1927++;
        class21 var2 = (class21) this.field1940.method1469(0);
        if (arg0 != -5052) {
            this.method986(77);
        }
        while (var2 != null) {
            Object var3 = var2.method165(119);
            if (var3 != null) {
                return var3;
            }
            class21 var4 = var2;
            var2 = (class21) this.field1940.method1467(0);
            var4.method2314((byte) 41);
            var4.method115(true);
            this.field1926 += var4.field325;
        }
        return null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lii;I)Z", line = 339)
    public static final boolean method998(class553 arg0, int arg1) {
        field1943++;
        if (arg0 == null) {
            return false;
        } else if (arg1 != -4) {
            return false;
        } else if (!arg0.field7619) {
            return false;
        } else if (!arg0.method3180(class489.field6766, arg1 ^ 0xFFFFFFD2)) {
            return false;
        } else if (class590.field8050.method1465((long) arg0.field7626, arg1 ^ 0x1774) == null) {
            return class147.field2460.method1465((long) arg0.field7641, arg1 - 6004) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(II)V", line = 379)
    public class112(int arg0, int arg1) {
        this.field1929 = new class368();
        this.field1926 = arg0;
        this.field1924 = arg0;
        int var3;
        for (var3 = 1; (var3 + var3) < arg0 && arg1 > var3; var3 += var3) {
        }
        this.field1940 = new class213(var3);
    }

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "(I)V", line = 370)
    public final void method999(int arg0) {
        field1931++;
        this.field1929.method2342(arg0 + 2110355138);
        this.field1940.method1466(arg0);
        this.field1926 = this.field1924;
    }
}
