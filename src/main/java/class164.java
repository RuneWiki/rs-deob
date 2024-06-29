import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class164 {

    @OriginalMember(owner = "client!aba", name = "j", descriptor = "Lhm;")
    private class208 field1931 = new class208(64);

    @OriginalMember(owner = "client!aba", name = "o", descriptor = "Lhm;")
    public class208 field1936 = new class208(64);

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "Lpfa;")
    private class275 field1924;

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "Lpfa;")
    public class275 field1929;

    @OriginalMember(owner = "client!aba", name = "i", descriptor = "I")
    public static int field1930 = -1;

    @OriginalMember(owner = "client!aba", name = "n", descriptor = "[I")
    public static int[] field1935 = new int[8];

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!aba", name = "k", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!aba", name = "l", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!aba", name = "m", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IILoa;Z)Liaa;", line = 3)
    public static final class462 method999(int arg0, int arg1, class650 arg2, boolean arg3) {
        field1926++;
        if (arg0 == -1) {
            return null;
        }
        if (class391.field5010 != null) {
            for (int var4 = 0; var4 < class391.field5010.length; var4++) {
                if (class391.field5010[var4] == arg0) {
                    return class580.field7774[var4];
                }
            }
        }
        class462 var5 = (class462) class331.field4104.method1221((long) arg0, true);
        if (arg1 != 12173) {
            method999(-38, -39, null, true);
        }
        if (var5 != null) {
            if (arg3 && var5.field5751 == null) {
                class20 var6 = class267.method1587((byte) -124, arg0, class578.field7760);
                if (var6 == null) {
                    return null;
                }
                var5.field5751 = var6;
            }
            return var5;
        }
        class495[] var7 = class495.method2690(class608.field8288, arg0);
        if (var7 == null) {
            return null;
        }
        class20 var8 = class267.method1587((byte) -124, arg0, class578.field7760);
        if (var8 == null) {
            return null;
        }
        class462 var9;
        if (arg3) {
            var9 = new class462(arg2.method414(var8, var7, true), var8);
        } else {
            var9 = new class462(arg2.method414(var8, var7, true));
        }
        class331.field4104.method1230((byte) 36, (long) arg0, var9);
        return var9;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V", line = 71)
    public final void method1000(int arg0) {
        field1925++;
        int var2 = -30 % ((arg0 - 44) / 59);
        class208 var3 = this.field1931;
        synchronized (this.field1931) {
            this.field1931.method1218(110);
        }
        class208 var4 = this.field1936;
        synchronized (this.field1936) {
            this.field1936.method1218(108);
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 89)
    public static final String method1001(String arg0, int arg1) {
        if (arg1 != 1758854057) {
            method1008(false, 80);
        }
        field1934++;
        if (class607.field8279.startsWith("win")) {
            return arg0 + ".dll";
        } else if (class607.field8279.startsWith("linux")) {
            return "lib" + arg0 + ".so";
        } else if (class607.field8279.startsWith("mac")) {
            return "lib" + arg0 + ".dylib";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IB)Lkm;", line = 112)
    public final class329 method1002(int arg0, byte arg1) {
        field1923++;
        class208 var3 = this.field1931;
        class329 var4;
        synchronized (this.field1931) {
            var4 = (class329) this.field1931.method1221((long) arg0, true);
        }
        if (var4 != null) {
            return var4;
        }
        class275 var5 = this.field1924;
        byte[] var6;
        synchronized (this.field1924) {
            var6 = this.field1924.method1659(-93, arg0, 34);
        }
        class329 var7 = new class329();
        var7.field4087 = this;
        if (arg1 < 54) {
            this.method1002(127, (byte) -101);
        }
        if (var6 != null) {
            var7.method1888(new class572(var6), (byte) 127);
        }
        class208 var8 = this.field1931;
        synchronized (this.field1931) {
            this.field1931.method1230((byte) -112, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Z)V", line = 147)
    public static void method1003(boolean arg0) {
        if (!arg0) {
            method1007(true, 17, -81, -31);
        }
        field1935 = null;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(III)V", line = 159)
    public final void method1004(int arg0, int arg1, int arg2) {
        this.field1931 = new class208(arg2);
        field1928++;
        this.field1936 = new class208(arg1);
        if (arg0 <= 30) {
            this.method1004(72, -41, -89);
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)V", line = 172)
    public final void method1005(byte arg0) {
        field1932++;
        class208 var2 = this.field1931;
        synchronized (this.field1931) {
            if (arg0 >= -14) {
                this.field1924 = null;
            }
            this.field1931.method1224(false);
        }
        class208 var3 = this.field1936;
        synchronized (this.field1936) {
            this.field1936.method1224(false);
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(II)V", line = 196)
    public final void method1006(int arg0, int arg1) {
        class208 var3 = this.field1931;
        synchronized (this.field1931) {
            this.field1931.method1222(14564, arg0);
            if (arg1 != -3) {
                this.method1004(-31, 58, -113);
            }
        }
        field1922++;
        class208 var4 = this.field1936;
        synchronized (this.field1936) {
            this.field1936.method1222(14564, arg0);
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(ZIII)I", line = 212)
    public static final int method1007(boolean arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field1927++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else {
            if (arg0) {
                field1935 = null;
            }
            return var4 == 2 ? 4095 - arg2 : -arg3 + 4095;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(ZI)V", line = 237)
    public static final void method1008(boolean arg0, int arg1) {
        if (arg0) {
            if (class305.field3866 != -1) {
                class72.method572(58, class305.field3866);
            }
            for (class293 var2 = (class293) class216.field2530.method3830((byte) 102); var2 != null; var2 = (class293) class216.field2530.method3838((byte) -92)) {
                if (!var2.method1565((byte) 122)) {
                    var2 = (class293) class216.field2530.method3830((byte) 112);
                    if (var2 == null) {
                        break;
                    }
                }
                class190.method1128(false, -103, true, var2);
            }
            class305.field3866 = -1;
            class216.field2530 = new class694(8);
            class443.method2436(arg1 ^ 0xFFFF8DBF);
            class305.field3866 = class637.field8625;
            class602.method3309(false, 3);
            class377.method2172(100);
            class620.method3449(class305.field3866);
        }
        field1933++;
        class180.field2124 = false;
        class33.field515 = "";
        class469.field5798 = "";
        class152.method944(true);
        if (arg1 != -29249) {
            return;
        }
        class530.field6684 = -1;
        class288.method1732(class585.field7863, -16340);
        class67.field815 = new class365();
        class67.field815.field508[0] = class85.field1090 / 2;
        class67.field815.field8011 = class656.field8932 * 512 / 2;
        class67.field815.field8018 = class85.field1090 * 512 / 2;
        class67.field815.field511[0] = class656.field8932 / 2;
        class710.field9924 = 0;
        class238.field3071 = 0;
        if (class385.field4946 == 2) {
            class238.field3071 = class27.field314 << 9;
            class710.field9924 = class633.field8590 << 9;
        } else {
            class257.method1535(arg1 ^ 0xFFFF8D94);
        }
        class532.method2871(true);
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Lbs;ILpfa;Lpfa;)V", line = 314)
    public class164(class643 arg0, int arg1, class275 arg2, class275 arg3) {
        this.field1924 = arg2;
        this.field1929 = arg3;
        this.field1924.method1655(34, (byte) -82);
    }
}
