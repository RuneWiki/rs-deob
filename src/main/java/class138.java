import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class138 extends class222 implements class123 {

    @OriginalMember(owner = "client!c", name = "y", descriptor = "Z")
    private boolean field1885 = false;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "I")
    private int field1882 = 50;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "Lfh;")
    private class140 field1899;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "Lfh;")
    private class140 field1895;

    @OriginalMember(owner = "client!c", name = "X", descriptor = "Ldj;")
    private class143 field1908;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "Ldj;")
    private class143 field1890;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "Ljava/lang/String;")
    public static String field1887 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!c", name = "L", descriptor = "[[[I")
    public static int[][][] field1897 = new int[2][][];

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!c", name = "B", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!c", name = "R", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!c", name = "S", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!c", name = "T", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!c", name = "V", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!c", name = "W", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!c", name = "Y", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!c", name = "ab", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!c", name = "bb", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!c", name = "cb", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)Z", line = 4)
    public static final boolean method1038(boolean arg0) {
        if (arg0) {
            field1891++;
            return class47.field623 ? true : class180.field2467;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)V", line = 19)
    public final void method1039(boolean arg0, int arg1) {
        if (arg1 == 2047) {
            field1894++;
            this.field1885 = arg0;
            this.method1042(-126);
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IZ)I", line = 33)
    public final int method911(int arg0, boolean arg1) {
        if (arg1) {
            return -41;
        } else {
            field1898++;
            return this.method1618(arg0, (byte) -17).field109 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IB)Z", line = 47)
    public final boolean method903(int arg0, byte arg1) {
        if (arg1 == 26) {
            field1912++;
            return this.method1618(arg0, (byte) 126).field102;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!c", name = "i", descriptor = "(II)V", line = 59)
    public final void method1040(int arg0, int arg1) {
        if (arg1 > -2) {
            this.field1882 = -23;
        }
        for (class50 var3 = (class50) this.field1908.method1113(40); var3 != null; var3 = (class50) this.field1908.method1117(-91)) {
            if (var3.field672) {
                var3.method396(arg0);
                var3.field672 = false;
            }
        }
        field1901++;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II)Z", line = 85)
    public final boolean method902(int arg0, int arg1) {
        field1892++;
        if (arg1 == 0) {
            return !this.method1618(arg0, (byte) 124).field116;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!c", name = "h", descriptor = "(II)I", line = 100)
    public final int method916(int arg0, int arg1) {
        int var3 = 111 / ((arg1 - 2) / 47);
        field1889++;
        return this.method1618(arg0, (byte) -77).field111 & 0xFF;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(IB)[I", line = 109)
    public final int[] method910(int arg0, byte arg1) {
        field1911++;
        class50 var3 = this.method1041(arg0, 25248);
        if (var3 == null) {
            return null;
        } else {
            int var4 = 43 / ((-arg1 - 36) / 60);
            return var3.method393(this, this.field1899, this.field1885 || this.method1618(arg0, (byte) 108).field106);
        }
    }

    @OriginalMember(owner = "client!c", name = "j", descriptor = "(II)Lso;", line = 124)
    private final class50 method1041(int arg0, int arg1) {
        if (arg1 != 25248) {
            return (class50) null;
        }
        field1878++;
        class50 var3 = (class50) this.field1908.method1116(17301, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field1895.method1089(arg0, (byte) 127, 0);
        if (var4 == null) {
            return null;
        } else {
            class50 var5 = new class50(new class299(var4));
            this.field1908.method1115((long) arg0, 45, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZFZII)Lvn;", line = 148)
    public final class11 method913(boolean arg0, float arg1, boolean arg2, int arg3, int arg4) {
        field1886++;
        class50 var6 = this.method1041(arg4, 25248);
        if (var6 == null || !var6.method398(this, this.field1899)) {
            return null;
        } else if (arg2) {
            return (class11) null;
        } else if (arg0) {
            return var6.field670.method1779(arg3, this, this.field1899, -127, (double) arg1, arg3, false);
        } else {
            return var6.field670.method1774((double) arg1, -37, arg3, this, this.field1899, arg3, false);
        }
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(II)Z", line = 169)
    public final boolean method914(int arg0, int arg1) {
        field1910++;
        if (this.field1885 || this.method1618(arg1, (byte) -77).field106) {
            return true;
        } else {
            if (arg0 != 0) {
                field1887 = (String) null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V", line = 186)
    public final void method1042(int arg0) {
        field1893++;
        this.field1908.method1120((byte) 123);
        if (this.field1890 != null) {
            this.field1890.method1120((byte) 120);
        }
        int var2 = -78 / ((arg0 - 56) / 48);
        class50.field664 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([BZI)Ljava/lang/Object;", line = 201)
    public static final Object method1043(byte[] arg0, boolean arg1, int arg2) {
        field1906++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > arg2 && !class96.field1254) {
            try {
                class152 var3 = (class152) Class.forName("ki").getDeclaredConstructor().newInstance();
                var3.method1091(0, arg0);
                return var3;
            } catch (Throwable var5) {
                class96.field1254 = true;
            }
        }
        return arg1 ? class183.method1336(arg0, 112) : arg0;
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(II)I", line = 231)
    public final int method907(int arg0, int arg1) {
        field1900++;
        return arg1 == 65535 ? this.method1618(arg0, (byte) 118).field114 & 0xFFFF : -126;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZ)Z", line = 244)
    public final boolean method909(int arg0, boolean arg1) {
        field1905++;
        if (!arg1) {
            field1897 = (int[][][]) ((int[][][]) null);
        }
        class50 var3 = this.method1041(arg0, 25248);
        return var3 == null ? false : var3.method398(this, this.field1899);
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lfh;Lfh;Lfh;IZ)V", line = 338)
    public class138(class140 arg0, class140 arg1, class140 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field1882 = arg3;
        this.field1899 = arg2;
        this.field1895 = arg0;
        this.field1885 = arg4;
        this.field1908 = new class143(this.field1882);
        if (class47.field623) {
            this.field1890 = new class143(this.field1882);
        } else {
            this.field1890 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIII)V", line = 270)
    public static final void method1044(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1896++;
        class234[] var7 = class102.field1326;
        if (arg1 != -8967) {
            field1897 = (int[][][]) ((int[][][]) null);
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class234 var9 = var7[var8];
            if (var9 != null && var9.field3359 == 2) {
                class10.method66((byte) 51, arg3 >> 1, var9.field3365 * 2, arg4, (var9.field3354 - class331.field4867 << 7) + var9.field3362, (-class355.field5556 + var9.field3363 << 7) + var9.field3366, arg2, arg5 >> 1);
                if (class300.field4405 > -1 && class313.field4603 % 20 < 10) {
                    class291.field4233[var9.field3355].method85(arg6 + class300.field4405 - 12, class206.field2860 + arg0 - 28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(IB)V", line = 302)
    public final void method1045(int arg0, byte arg1) {
        field1881++;
        if (arg1 != -111) {
            return;
        }
        this.field1882 = arg0;
        this.field1908 = new class143(this.field1882);
        if (class47.field623) {
            this.field1890 = new class143(this.field1882);
        } else {
            this.field1890 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(II)Z", line = 320)
    public final boolean method904(int arg0, int arg1) {
        field1880++;
        if (arg0 != -1) {
            this.field1885 = true;
        }
        return this.method1618(arg1, (byte) 115).field107;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)V", line = 362)
    public final void method915(byte arg0, int arg1, int arg2) {
        class255.method1781(this.method1618(arg2, (byte) -37).field110 & 0xFF, this.method1618(arg2, (byte) 117).field111 & 0xFF, -107);
        field1909++;
        if (arg0 >= -86) {
            this.method916(51, 122);
        }
        boolean var4 = false;
        class50 var5 = this.method1041(arg2, 25248);
        if (var5 != null) {
            var4 = var5.method399(this, this.field1899, arg1);
        }
        if (!var4) {
            class137 var6 = this.method1048(-926489461, arg2);
            var6.method1037(1);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)I", line = 394)
    public final int method908(byte arg0, int arg1) {
        if (arg0 == -119) {
            field1888++;
            return this.method1618(arg1, (byte) 113).field113 & 0xFF;
        } else {
            return -42;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lfh;Lfh;I)I", line = 406)
    public static final int method1046(class140 arg0, class140 arg1, int arg2) {
        int var3 = 0;
        if (arg1.method1076(class245.field3587, 105)) {
            var3++;
        }
        if (arg1.method1076(class80.field1031, 122)) {
            var3++;
        }
        field1902++;
        if (arg1.method1076(class195.field2693, 117)) {
            var3++;
        }
        if (arg0.method1076(class245.field3587, 68)) {
            var3++;
        }
        if (arg0.method1076(class80.field1031, arg2 + 23291)) {
            var3++;
        }
        if (arg2 == -23185) {
            if (arg0.method1076(class195.field2693, arg2 + 23247)) {
                var3++;
            }
            return var3;
        } else {
            return -119;
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(IZ)Lln;", line = 440)
    public final class255 method1047(int arg0, boolean arg1) {
        field1913++;
        if (arg1) {
            class50 var3 = this.method1041(arg0, 25248);
            return var3 == null ? null : var3.field670;
        } else {
            return (class255) null;
        }
    }

    @OriginalMember(owner = "client!c", name = "k", descriptor = "(II)Lqd;", line = 454)
    private final class137 method1048(int arg0, int arg1) {
        field1903++;
        class137 var3 = (class137) this.field1890.method1116(17301, (long) arg1);
        if (var3 == null) {
            class137 var4 = new class137(this.method1618(arg1, (byte) -69).field114 & 0xFFFF);
            this.field1890.method1115((long) arg1, 103, var4);
            return arg0 == -926489461 ? var4 : (class137) null;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(II)V", line = 473)
    public final void method912(int arg0, int arg1) {
        this.method915((byte) -101, this.field1885 || this.method1618(arg1, (byte) 106).field106 ? 64 : 128, arg1);
        field1884++;
        if (arg0 != 64) {
            this.field1899 = (class140) null;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V", line = 484)
    public static void method1049(byte arg0) {
        field1897 = (int[][][]) null;
        field1887 = null;
        if (arg0 < 61) {
            field1907 = -77;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(FII)[I", line = 502)
    public final int[] method906(float arg0, int arg1, int arg2) {
        class50 var4 = this.method1041(arg2, 25248);
        if (arg1 != 274092135) {
            this.field1899 = (class140) null;
        }
        field1883++;
        if (var4 == null) {
            return null;
        } else {
            var4.field672 = true;
            return var4.method395(this, this.field1899, arg0, this.field1885 || this.method1618(arg2, (byte) 110).field106);
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(II)I", line = 520)
    public final int method905(int arg0, int arg1) {
        field1879++;
        if (arg1 != 255) {
            field1887 = (String) null;
        }
        return this.method1618(arg0, (byte) -40).field110 & 0xFF;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lwf;I)V", line = 532)
    public static final void method1050(class333 arg0, int arg1) {
        int var2 = arg0.field5084;
        field1904++;
        if (var2 == 324) {
            if (class297.field4304 == -1) {
                class35.field424 = arg0.field5125;
                class297.field4304 = arg0.field5168;
            }
            if (class100.field1307.field1670) {
                arg0.field5168 = class297.field4304;
            } else {
                arg0.field5168 = class35.field424;
            }
            return;
        }
        if (arg1 <= 21) {
            field1907 = -61;
        }
        if (var2 == 325) {
            if (class297.field4304 == -1) {
                class297.field4304 = arg0.field5168;
                class35.field424 = arg0.field5125;
            }
            if (class100.field1307.field1670) {
                arg0.field5168 = class35.field424;
            } else {
                arg0.field5168 = class297.field4304;
            }
        } else if (var2 == 327) {
            arg0.field5160 = 150;
            arg0.field5210 = (int) (Math.sin((double) class313.field4603 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field5070 = -1;
            arg0.field5144 = 5;
        } else if (var2 == 328) {
            if (class359.field5616.field3475 == null) {
                arg0.field5070 = 0;
            } else {
                arg0.field5160 = 150;
                arg0.field5210 = (int) (Math.sin((double) class313.field4603 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field5144 = 5;
                arg0.field5070 = ((int) class201.method1476(-121, class359.field5616.field3475) << 11) + 2047;
                arg0.field5054 = class359.field5616.field4942;
                arg0.field5053 = class359.field5616.field4897;
                arg0.field5218 = class359.field5616.field4914;
                arg0.field5074 = 0;
            }
        }
    }
}
