import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class290 {

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public int field4128 = 0;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public int field4123 = -1;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public int field4124 = -1;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    private int field4130 = -1;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "[Ljava/lang/String;")
    public String[] field4143 = new String[5];

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "Z")
    public boolean field4134 = true;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    public int field4148 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "Z")
    public boolean field4133 = false;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "Z")
    public boolean field4137 = true;

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
    private int field4159 = -1;

    @OriginalMember(owner = "client!lm", name = "N", descriptor = "I")
    private int field4161 = -1;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public int field4144 = -1;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "Z")
    public boolean field4139 = true;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    public int field4146 = -1;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    private int field4145 = -1;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "I")
    public int field4153 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "I")
    public int field4155 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!lm", name = "Q", descriptor = "I")
    private int field4164 = -1;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "I")
    public int field4156 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "[I")
    public static int[] field4129 = new int[64];

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public static int field4141 = -1;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "[I")
    public static int[] field4154 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field4131 = 0;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public int field4126;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public int field4127;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public int field4136;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public int field4138;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
    public int field4149;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
    private int field4150;

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "I")
    public int field4151;

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "I")
    private int field4157;

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "I")
    private int field4160;

    @OriginalMember(owner = "client!lm", name = "O", descriptor = "I")
    private int field4162;

    @OriginalMember(owner = "client!lm", name = "P", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "Ljava/lang/String;")
    public String field4125;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "Ljava/lang/String;")
    public String field4142;

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "[I")
    public int[] field4158;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Len;ZZ)Lkh;", line = 10)
    public final class11 method1851(class174 arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            return null;
        }
        field4135++;
        int var4 = arg2 ? this.field4124 : this.field4123;
        int var5 = var4 | arg0.field2424 << 29;
        class11 var6 = (class11) class437.field6406.method2049(-112, (long) var5);
        if (var6 != null) {
            return var6;
        } else if (class266.field3731.method345(1, var4)) {
            class145 var7 = class145.method854(class266.field3731, var4, 0);
            if (var7 != null) {
                var6 = arg0.method955(var7, true);
                class437.field6406.method2046((long) var5, 0, var6);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILen;)Lkh;", line = 67)
    public final class11 method1852(int arg0, class174 arg1) {
        field4140++;
        if (arg0 != -15913) {
            this.method1851((class174) null, true, false);
        }
        class11 var3 = (class11) class437.field6406.method2049(arg0 ^ 0x3E71, (long) (arg1.field2424 << 29 | this.field4145 | 0x20000));
        if (var3 != null) {
            return var3;
        }
        class266.field3731.method345(1, this.field4145);
        class145 var4 = class145.method854(class266.field3731, this.field4145, 0);
        if (var4 != null) {
            var3 = arg1.method955(var4, true);
            class437.field6406.method2046((long) (this.field4145 | 0x20000 | arg1.field2424 << 29), 0, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)Z", line = 103)
    public final boolean method1853(int arg0) {
        field4132++;
        if (arg0 != -7348) {
            this.method1853(90);
        }
        if (this.field4161 == -1 && this.field4159 == -1) {
            return true;
        }
        boolean var2 = false;
        int var3;
        if (this.field4161 == -1) {
            var3 = class16.method112(30673, this.field4159);
        } else {
            var3 = class283.field3972[this.field4161];
        }
        if (this.field4157 > var3 || var3 > this.field4160) {
            return false;
        } else if (this.field4164 == -1 && this.field4130 == -1) {
            return true;
        } else {
            boolean var4 = false;
            int var5;
            if (this.field4164 == -1) {
                var5 = class16.method112(arg0 + 38021, this.field4130);
            } else {
                var5 = class283.field3972[this.field4164];
            }
            return var5 >= this.field4162 && var5 <= this.field4150;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILbk;)V", line = 179)
    private final void method1854(int arg0, int arg1, class211 arg2) {
        field4163++;
        if (arg1 == 1) {
            this.field4123 = arg2.method1355(arg0 ^ 0xFFFFCA8C);
        } else if (arg1 == 2) {
            this.field4124 = arg2.method1355(32136);
        } else if (arg1 == 3) {
            this.field4142 = arg2.method1350(64);
        } else if (arg1 == 4) {
            this.field4149 = arg2.method1353(100);
        } else if (arg1 == 5) {
            this.field4146 = arg2.method1353(106);
        } else if (arg1 == 6) {
            this.field4128 = arg2.method1342((byte) -128);
        } else if (arg1 == 7) {
            int var4 = arg2.method1342((byte) -127);
            if ((var4 & 0x2) == 2) {
                this.field4133 = true;
            }
            if ((var4 & 0x1) == 0) {
                this.field4139 = false;
            }
        } else if (arg1 == 8) {
            this.field4137 = arg2.method1342((byte) -126) == 1;
        } else if (arg1 == 9) {
            this.field4159 = arg2.method1355(32136);
            if (this.field4159 == 65535) {
                this.field4159 = -1;
            }
            this.field4161 = arg2.method1355(32136);
            if (this.field4161 == 65535) {
                this.field4161 = -1;
            }
            this.field4157 = arg2.method1336((byte) -97);
            this.field4160 = arg2.method1336((byte) -23);
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field4143[arg1 - 10] = arg2.method1350(83);
        } else if (arg1 == 15) {
            int var5 = arg2.method1342((byte) -126);
            this.field4158 = new int[var5 * 2];
            for (int var6 = 0; var6 < (var5 * 2); var6++) {
                this.field4158[var6] = arg2.method1344((byte) -4);
            }
            this.field4138 = arg2.method1336((byte) -91);
            this.field4127 = arg2.method1336((byte) -109);
        } else if (arg1 == 16) {
            this.field4134 = false;
        } else if (arg1 == 17) {
            this.field4125 = arg2.method1350(107);
        } else if (arg1 == 18) {
            this.field4145 = arg2.method1355(32136);
        } else if (arg1 == 19) {
            this.field4144 = arg2.method1355(32136);
        } else if (arg1 == 20) {
            this.field4130 = arg2.method1355(32136);
            if (this.field4130 == 65535) {
                this.field4130 = -1;
            }
            this.field4164 = arg2.method1355(arg0 ^ 0xFFFFCA8C);
            if (this.field4164 == 65535) {
                this.field4164 = -1;
            }
            this.field4162 = arg2.method1336((byte) -82);
            this.field4150 = arg2.method1336((byte) -29);
        } else if (arg1 == 21) {
            this.field4136 = arg2.method1336((byte) -92);
        } else if (arg1 == 22) {
            this.field4151 = arg2.method1336((byte) -41);
        }
        if (arg0 != -18684) {
            this.field4143 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V", line = 319)
    public final void method1855(byte arg0) {
        int var2 = -17 % ((arg0 - 48) / 40);
        if (this.field4158 != null) {
            for (int var3 = 0; var3 < this.field4158.length; var3 += 2) {
                if (this.field4155 > this.field4158[var3]) {
                    this.field4155 = this.field4158[var3];
                } else if (this.field4153 < this.field4158[var3]) {
                    this.field4153 = this.field4158[var3];
                }
                if (this.field4158[var3 + 1] < this.field4148) {
                    this.field4148 = this.field4158[var3 + 1];
                } else if (this.field4158[var3 + 1] > this.field4156) {
                    this.field4156 = this.field4158[var3 + 1];
                }
            }
        }
        field4147++;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V", line = 388)
    public static void method1856(int arg0) {
        field4129 = null;
        field4154 = null;
        if (arg0 != 27661) {
            method1856(95);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lbk;I)V", line = 412)
    public final void method1857(class211 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1342((byte) -127);
            if (var3 == 0) {
                field4122++;
                if (arg1 != 15) {
                    this.field4146 = 0;
                    return;
                }
                return;
            }
            this.method1854(-18684, var3, arg0);
        }
    }
}
