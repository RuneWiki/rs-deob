import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class103 extends class43 {

    @OriginalMember(owner = "client!je", name = "Z", descriptor = "I")
    private int field1930 = 12288;

    @OriginalMember(owner = "client!je", name = "fb", descriptor = "I")
    private int field1936 = 4096;

    @OriginalMember(owner = "client!je", name = "V", descriptor = "I")
    private int field1926 = 8192;

    @OriginalMember(owner = "client!je", name = "ib", descriptor = "I")
    private int field1939 = 0;

    @OriginalMember(owner = "client!je", name = "hb", descriptor = "I")
    private int field1938 = 0;

    @OriginalMember(owner = "client!je", name = "kb", descriptor = "I")
    private int field1941 = 2048;

    @OriginalMember(owner = "client!je", name = "ob", descriptor = "I")
    private int field1945 = 2048;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "[I")
    public static int[] field1925 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!je", name = "T", descriptor = "Lmb;")
    public static class132 field1924 = class166.method1092(":duelstake:", 116);

    @OriginalMember(owner = "client!je", name = "gb", descriptor = "Lmb;")
    public static class132 field1937 = class166.method1092("gleiten:", 111);

    @OriginalMember(owner = "client!je", name = "db", descriptor = "I")
    public static int field1934 = -1;

    @OriginalMember(owner = "client!je", name = "mb", descriptor = "[I")
    public static int[] field1943 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!je", name = "W", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!je", name = "X", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!je", name = "Y", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!je", name = "ab", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!je", name = "bb", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!je", name = "cb", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!je", name = "eb", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!je", name = "jb", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!je", name = "lb", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!je", name = "nb", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field1926 = arg2.method739(70);
                                }
                            } else {
                                this.field1936 = arg2.method739(arg1 ^ -21);
                            }
                        } else {
                            this.field1930 = arg2.method739(arg1 + 57);
                        }
                    } else {
                        this.field1941 = arg2.method739(-124);
                    }
                } else {
                    this.field1939 = arg2.method739(-127);
                }
            } else {
                this.field1938 = arg2.method739(-127);
            }
        } else {
            this.field1945 = arg2.method739(54);
        }
        ++field1940;
        if (arg1 != -73) {
            method641((class165) null, 75, -117, 79);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([BB)Lji;")
    public static final class107 method636(byte[] arg0, byte arg1) {
        ++field1935;
        if (arg0 == null) {
            return null;
        } else {
            class98 var2 = new class98(arg0, class23.field321, class30.field462, class94.field1657, class153.field2793, class10.field109);
            class187.method1193(1);
            if (arg1 > -2) {
                method640((class132) null, (byte) 98);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V")
    public static void method637(byte arg0) {
        field1924 = null;
        field1937 = null;
        field1943 = null;
        field1925 = null;
        if (arg0 != -70) {
            field1924 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        ++field1927;
        int[] var3 = super.field768.method1123(arg1, arg0);
        if (super.field768.field3219) {
            int var4 = class2.field35[arg0] + -2048;
            for (int var5 = 0; var5 < class131.field2427; ++var5) {
                int var6 = this.field1938 + var4;
                int var7 = var6 < -2048 ? var6 + 4096 : var6;
                int var8 = ~var7 >= -2049 ? var7 : var7 + -4096;
                int var9 = this.field1941 + var4;
                int var10 = class156.field2849[var5] + -2048;
                int var11 = this.field1939 + var10;
                int var12 = var9 < -2048 ? var9 + 4096 : var9;
                int var13 = this.field1945 + var10;
                int var14 = var11 >= -2048 ? var11 : var11 - -4096;
                int var15 = var14 <= 2048 ? var14 : var14 + -4096;
                int var16 = ~var12 < -2049 ? var12 + -4096 : var12;
                int var17 = var13 < -2048 ? var13 + 4096 : var13;
                int var18 = var17 > 2048 ? var17 + -4096 : var17;
                var3[var5] = !this.method643(var18, var8, (byte) 90) && !this.method642(215, var15, var16) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
    public static final Class method638(String arg0, byte arg1) throws ClassNotFoundException {
        if (arg1 > -16) {
            return null;
        } else {
            ++field1932;
            if (arg0.equals("B")) {
                return Byte.TYPE;
            } else if (arg0.equals("I")) {
                return Integer.TYPE;
            } else if (arg0.equals("S")) {
                return Short.TYPE;
            } else if (arg0.equals("J")) {
                return Long.TYPE;
            } else if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else {
                return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIZ)V")
    public static final void method639(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field1928;
        if (!arg4) {
            field1943 = null;
        }
        for (int var5 = 0; var5 < client.field536; ++var5) {
            if (class203.field3725[var5] + class13.field168[var5] > arg0 && class203.field3725[var5] < arg0 - -arg1 && arg3 < class236.field4270[var5] + class128.field2382[var5] && arg2 + arg3 > class236.field4270[var5]) {
                class36.field603[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lmb;B)V")
    public static final void method640(class132 arg0, byte arg1) {
        ++field1942;
        if (class136.field2558 != null) {
            long var2 = arg0.method867(-27410);
            int var4 = 0;
            if (var2 != 0L) {
                while (~var4 > ~class136.field2558.length && ~class136.field2558[var4].field2760 != ~var2) {
                    ++var4;
                }
                if (arg1 > -69) {
                    method640((class132) null, (byte) -81);
                }
                if (var4 < class136.field2558.length && class136.field2558[var4] != null) {
                    class64.field1054.method660(215, 3);
                    class64.field1054.method709(-27341, class136.field2558[var4].field2760);
                    ++class230.field4145;
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(I)V")
    public final void method234(int arg0) {
        ++field1944;
        if (arg0 < 21) {
            field1924 = null;
        }
        class191.method1222(false);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lpb;III)[Lhh;")
    public static final class85[] method641(class165 arg0, int arg1, int arg2, int arg3) {
        ++field1929;
        if (arg1 != 536870911) {
            field1934 = -15;
        }
        return !class172.method1122(arg2, arg0, arg3, true) ? null : class71.method434((byte) 73);
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(III)Z")
    private final boolean method642(int arg0, int arg1, int arg2) {
        ++field1933;
        int var4 = (arg1 + arg2) * this.field1930 >> 12;
        int var5 = class69.field1151[(1047511 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field1930;
        int var7 = (var6 << 12) / this.field1926;
        int var8 = this.field1936 * var7 >> 12;
        if (arg0 != 215) {
            return true;
        } else {
            return ~var8 < ~(arg2 - arg1) && -var8 < arg2 - arg1;
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
    public class103() {
        super(0, true);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIB)Z")
    private final boolean method643(int arg0, int arg1, byte arg2) {
        ++field1931;
        int var4 = (arg1 - arg0) * this.field1930 >> 12;
        int var5 = class69.field1151[(1044885 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field1930;
        int var7 = (var6 << 12) / this.field1926;
        if (arg2 < 37) {
            this.field1941 = 96;
        }
        int var8 = this.field1936 * var7 >> 12;
        return ~var8 < ~(arg0 + arg1) && ~(-var8) > ~(arg0 + arg1);
    }
}
