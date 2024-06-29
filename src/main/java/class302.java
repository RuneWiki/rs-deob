import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class302 extends class70 {

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public int field4916 = 0;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public static int field4910 = 0;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public int field4904;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public int field4908;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public int field4909;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public int field4911;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public int field4914;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public int field4915;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public int field4917;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public int field4919;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "I")
    public int field4922;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    public int field4923;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    public int field4924;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "Lqn;")
    public class238 field4926;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "Lbh;")
    public class304 field4920;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "Lbh;")
    public class304 field4921;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Lcb;")
    public class314 field4913;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "Lth;")
    public class98 field4929;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "Z")
    public boolean field4927;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "[I")
    public int[] field4925;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)I", line = 6)
    public static final int method2158(byte arg0) {
        field4928++;
        int var1 = 51 / ((arg0) / 61);
        return 6;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V", line = 19)
    public static final void method2159(byte arg0) {
        field4907++;
        int var1 = class342.field5413.method295((byte) -101, 8);
        if (class252.field4144 > var1) {
            for (int var2 = var1; var2 < class252.field4144; var2++) {
                class28.field685[class117.field2087++] = class22.field556[var2];
            }
        }
        if (var1 > class252.field4144) {
            throw new RuntimeException("gppov1");
        }
        class252.field4144 = 0;
        int var3 = 0;
        int var4 = -26 % ((arg0 - 19) / 39);
        while (var3 < var1) {
            int var5 = class22.field556[var3];
            class98 var6 = class182.field3151[var5];
            int var7 = class342.field5413.method295((byte) -91, 1);
            if (var7 == 0) {
                class22.field556[class252.field4144++] = var5;
                var6.field221 = class267.field4371;
            } else {
                int var8 = class342.field5413.method295((byte) 123, 2);
                if (var8 == 0) {
                    class22.field556[class252.field4144++] = var5;
                    var6.field221 = class267.field4371;
                    class34.field761[class91.field1613++] = var5;
                } else if (var8 == 1) {
                    class22.field556[class252.field4144++] = var5;
                    var6.field221 = class267.field4371;
                    int var9 = class342.field5413.method295((byte) 122, 3);
                    var6.method57(-2079349584, 1, var9);
                    int var10 = class342.field5413.method295((byte) 116, 1);
                    if (var10 == 1) {
                        class34.field761[class91.field1613++] = var5;
                    }
                } else if (var8 == 2) {
                    class22.field556[class252.field4144++] = var5;
                    var6.field221 = class267.field4371;
                    if (class342.field5413.method295((byte) 42, 1) == 1) {
                        int var11 = class342.field5413.method295((byte) -110, 3);
                        var6.method57(-2079349584, 2, var11);
                        int var12 = class342.field5413.method295((byte) 48, 3);
                        var6.method57(-2079349584, 2, var12);
                    } else {
                        int var13 = class342.field5413.method295((byte) -107, 3);
                        var6.method57(-2079349584, 0, var13);
                    }
                    int var14 = class342.field5413.method295((byte) -99, 1);
                    if (var14 == 1) {
                        class34.field761[class91.field1613++] = var5;
                    }
                } else if (var8 == 3) {
                    class28.field685[class117.field2087++] = var5;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(B)V", line = 130)
    public static final void method2160(byte arg0) {
        if (arg0 <= 68) {
            method2159((byte) 54);
        }
        field4906++;
        if (class157.field2651.toLowerCase().indexOf("microsoft") != -1) {
            class177.field2924[223] = 28;
            class177.field2924[222] = 59;
            class177.field2924[190] = 72;
            class177.field2924[191] = 73;
            class177.field2924[189] = 26;
            class177.field2924[188] = 71;
            class177.field2924[192] = 58;
            class177.field2924[221] = 43;
            class177.field2924[186] = 57;
            class177.field2924[219] = 42;
            class177.field2924[220] = 74;
            class177.field2924[187] = 27;
            return;
        }
        class177.field2924[44] = 71;
        class177.field2924[61] = 27;
        class177.field2924[47] = 73;
        class177.field2924[92] = 74;
        class177.field2924[91] = 42;
        if (class157.field2666 == null) {
            class177.field2924[192] = 58;
            class177.field2924[222] = 59;
        } else {
            class177.field2924[222] = 58;
            class177.field2924[520] = 59;
            class177.field2924[192] = 28;
        }
        class177.field2924[59] = 57;
        class177.field2924[46] = 72;
        class177.field2924[45] = 26;
        class177.field2924[93] = 43;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IZ)V", line = 208)
    public static final void method2161(int arg0, boolean arg1) {
        if (arg1) {
            method2159((byte) 124);
        }
        field4918++;
        class101.field1840 = 1000 / arg0;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V", line = 219)
    public static final void method2162(int arg0, int arg1, int arg2) {
        class51.field1038.method291((byte) 59, 244);
        field4912++;
        class91.field1611++;
        class51.field1038.method1023(arg1, (byte) -28);
        class51.field1038.method1045((byte) 127, arg2);
        if (arg0 != 220) {
            field4910 = 81;
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V", line = 238)
    public final void method2163(int arg0) {
        field4905++;
        if (arg0 != 71) {
            this.field4908 = -83;
        }
        int var2 = this.field4904;
        if (this.field4926 != null) {
            class238 var3 = this.field4926.method1651(-114);
            if (var3 == null) {
                this.field4908 = 0;
                this.field4914 = 0;
                this.field4904 = -1;
                this.field4922 = 0;
                this.field4923 = 0;
                this.field4925 = null;
            } else {
                this.field4925 = var3.field3928;
                this.field4904 = var3.field3920;
                this.field4923 = var3.field3945;
                this.field4922 = var3.field3933;
                this.field4914 = var3.field3888 * 128;
                this.field4908 = var3.field3961;
            }
        } else if (this.field4913 != null) {
            int var4 = class149.method1068(this.field4913, 51);
            if (var2 != var4) {
                this.field4904 = var4;
                class88 var5 = this.field4913.field5107;
                if (var5.field1552 != null) {
                    var5 = var5.method681((byte) 15);
                }
                if (var5 == null) {
                    this.field4908 = this.field4914 = 0;
                } else {
                    this.field4908 = var5.field1593;
                    this.field4914 = var5.field1554 * 128;
                }
            }
        } else if (this.field4929 != null) {
            this.field4904 = class188.method1307(this.field4929, 127);
            this.field4908 = this.field4929.field1806;
            this.field4914 = this.field4929.field1799 * 128;
        }
        if (this.field4904 != var2 && this.field4921 != null) {
            class56.field1105.method1247(this.field4921);
            this.field4921 = null;
        }
    }
}
