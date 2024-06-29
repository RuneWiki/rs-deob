import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class287 {

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "Z")
    public boolean field4112 = true;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
    private int field4121 = -1;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    public int field4119 = 0;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "Z")
    public boolean field4117 = false;

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
    public int field4129 = -1;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "Z")
    public boolean field4127 = true;

    @OriginalMember(owner = "client!ho", name = "v", descriptor = "[Ljava/lang/String;")
    public String[] field4132 = new String[5];

    @OriginalMember(owner = "client!ho", name = "C", descriptor = "I")
    public int field4139 = -1;

    @OriginalMember(owner = "client!ho", name = "A", descriptor = "I")
    private int field4137 = -1;

    @OriginalMember(owner = "client!ho", name = "M", descriptor = "Z")
    public boolean field4149 = true;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    private int field4114 = -1;

    @OriginalMember(owner = "client!ho", name = "P", descriptor = "I")
    private int field4151 = -1;

    @OriginalMember(owner = "client!ho", name = "w", descriptor = "I")
    private int field4133 = -1;

    @OriginalMember(owner = "client!ho", name = "G", descriptor = "I")
    public int field4143 = -1;

    @OriginalMember(owner = "client!ho", name = "K", descriptor = "I")
    public int field4147 = -1;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
    public static int field4124 = 0;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "Lcc;")
    public static class327 field4120 = new class327(64);

    @OriginalMember(owner = "client!ho", name = "R", descriptor = "I")
    public static int field4153 = 0;

    @OriginalMember(owner = "client!ho", name = "Q", descriptor = "[I")
    public static int[] field4152 = new int[1000];

    @OriginalMember(owner = "client!ho", name = "T", descriptor = "[I")
    public static int[] field4155 = new int[14];

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "F")
    public static float field4115;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    private int field4111;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public int field4113;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
    public int field4125;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
    private int field4126;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
    private int field4128;

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!ho", name = "x", descriptor = "I")
    public int field4134;

    @OriginalMember(owner = "client!ho", name = "y", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!ho", name = "B", descriptor = "I")
    public int field4138;

    @OriginalMember(owner = "client!ho", name = "E", descriptor = "I")
    private int field4141;

    @OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
    public int field4142;

    @OriginalMember(owner = "client!ho", name = "H", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!ho", name = "I", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!ho", name = "J", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!ho", name = "L", descriptor = "I")
    public int field4148;

    @OriginalMember(owner = "client!ho", name = "N", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!ho", name = "U", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!ho", name = "S", descriptor = "Lwl;")
    public static class13 field4154;

    @OriginalMember(owner = "client!ho", name = "D", descriptor = "Lll;")
    public static class54 field4140;

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "Ljava/lang/String;")
    public String field4130;

    @OriginalMember(owner = "client!ho", name = "z", descriptor = "Ljava/lang/String;")
    public String field4136;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "[I")
    public int[] field4123;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B[I[J)V", line = 4)
    public static final void method1963(byte arg0, int[] arg1, long[] arg2) {
        field4131++;
        if (arg0 != -46) {
            method1970((byte) 90);
        }
        class8.method49(1, arg2.length - 1, arg2, 0, arg1);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lfd;I)V", line = 18)
    public final void method1964(class299 arg0, int arg1) {
        if (arg1 != 0) {
            this.method1966((byte) 75);
        }
        field4144++;
        while (true) {
            int var3 = arg0.method2096((byte) -122);
            if (var3 == 0) {
                return;
            }
            this.method1967(arg1 ^ 0xFFFFE4C3, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)Ljava/lang/String;", line = 54)
    public static final String method1965(int arg0, int arg1) {
        field4116++;
        return arg0 >= arg1 ? "*" : Integer.toString(arg0);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)Lfe;", line = 71)
    public final class153 method1966(byte arg0) {
        if (arg0 >= -100) {
            this.method1967(104, -75, (class299) null);
        }
        field4150++;
        class153 var2 = (class153) class357.field5586.method2265((long) (this.field4133 | 0x20000), (byte) 71);
        if (var2 != null) {
            return var2;
        }
        class276.field3962.method1076(this.field4133, 66);
        class153 var3 = class354.method2463(32, 0, class276.field3962, this.field4133);
        if (var3 != null) {
            var3.field2028 = var3.field2024;
            var3.field2018 = 0;
            var3.field2026 = var3.field2029;
            var3.field2019 = 0;
            class357.field5586.method2257(-125, var3, (long) (this.field4133 | 0x20000));
        }
        return var3;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IILfd;)V", line = 115)
    private final void method1967(int arg0, int arg1, class299 arg2) {
        if (arg1 == 1) {
            this.field4129 = arg2.method2083((byte) -94);
        } else if (arg1 == 2) {
            this.field4147 = arg2.method2083((byte) -121);
        } else if (arg1 == 3) {
            this.field4136 = arg2.method2060(arg0 - 5509);
        } else if (arg1 == 4) {
            this.field4142 = arg2.method2085((byte) 62);
        } else if (arg1 == 5) {
            this.field4143 = arg2.method2085((byte) 67);
        } else if (arg1 == 6) {
            this.field4119 = arg2.method2096((byte) -122);
        } else if (arg1 == 7) {
            int var6 = arg2.method2096((byte) -122);
            if ((var6 & 0x2) == 2) {
                this.field4117 = true;
            }
            if ((var6 & 0x1) == 0) {
                this.field4112 = false;
            }
        } else if (arg1 == 8) {
            this.field4127 = arg2.method2096((byte) -122) == 1;
        } else if (arg1 == 9) {
            this.field4137 = arg2.method2083((byte) -40);
            if (this.field4137 == 65535) {
                this.field4137 = -1;
            }
            this.field4151 = arg2.method2083((byte) -41);
            if (this.field4151 == 65535) {
                this.field4151 = -1;
            }
            this.field4128 = arg2.method2062(-25795);
            this.field4126 = arg2.method2062(-25795);
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field4132[arg1 - 10] = arg2.method2060(-12482);
        } else if (arg1 == 15) {
            int var4 = arg2.method2096((byte) -122);
            this.field4123 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field4123[var5] = arg2.method2043(true);
            }
            this.field4113 = arg2.method2062(-25795);
            this.field4138 = arg2.method2062(-25795);
        } else if (arg1 == 16) {
            this.field4149 = false;
        } else if (arg1 == 17) {
            this.field4130 = arg2.method2060(-12482);
        } else if (arg1 == 18) {
            this.field4133 = arg2.method2083((byte) -81);
        } else if (arg1 == 19) {
            this.field4139 = arg2.method2083((byte) -89);
        } else if (arg1 == 20) {
            this.field4114 = arg2.method2083((byte) -39);
            if (this.field4114 == 65535) {
                this.field4114 = -1;
            }
            this.field4121 = arg2.method2083((byte) -25);
            if (this.field4121 == 65535) {
                this.field4121 = -1;
            }
            this.field4141 = arg2.method2062(-25795);
            this.field4111 = arg2.method2062(arg0 ^ 0x7FFE);
        } else if (arg1 == 21) {
            this.field4134 = arg2.method2062(-25795);
        } else if (arg1 == 22) {
            this.field4125 = arg2.method2062(-25795);
        }
        field4146++;
        if (arg0 != -6973) {
            method1965(-128, -21);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)Z", line = 260)
    public final boolean method1968(int arg0) {
        field4118++;
        if (arg0 != -1) {
            field4154 = (class13) null;
        }
        if (this.field4151 == -1 && this.field4137 == -1) {
            return true;
        }
        boolean var2 = false;
        int var3;
        if (this.field4151 == -1) {
            var3 = class56.method424((byte) -98, this.field4137);
        } else {
            var3 = class208.field2956[this.field4151];
        }
        if (this.field4128 > var3 || this.field4126 < var3) {
            return false;
        } else if (this.field4121 == -1 && this.field4114 == -1) {
            return true;
        } else {
            boolean var4 = false;
            int var5;
            if (this.field4121 == -1) {
                var5 = class56.method424((byte) -104, this.field4114);
            } else {
                var5 = class208.field2956[this.field4121];
            }
            return var5 >= this.field4141 && this.field4111 >= var5;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZZZ)Lma;", line = 329)
    public final class145 method1969(boolean arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            this.method1968(-42);
        }
        field4145++;
        int var4 = arg0 ? this.field4147 : this.field4129;
        class145 var5 = (class145) class357.field5586.method2265((long) (var4 | (arg0 ? 65536 : 0)), (byte) -102);
        if (var5 != null) {
            return var5;
        } else if (class276.field3962.method1076(var4, 85)) {
            class153 var6 = class354.method2463(32, 0, class276.field3962, var4);
            class145 var7;
            if (class47.field623 && !arg2) {
                var7 = new class127(var6);
            } else {
                var7 = var6;
            }
            if (var7 != null) {
                var7.field2026 = var7.field2029;
                var7.field2019 = 0;
                var7.field2028 = var7.field2024;
                var7.field2018 = 0;
                class357.field5586.method2257(-125, var7, (long) ((arg0 ? 65536 : 0) | var4));
            }
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)V", line = 374)
    public static void method1970(byte arg0) {
        field4154 = null;
        field4155 = null;
        field4152 = null;
        field4120 = null;
        if (arg0 != -41) {
            method1965(-111, 123);
        }
        field4140 = null;
    }
}
