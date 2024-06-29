import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class257 {

    @OriginalMember(owner = "client!vca", name = "r", descriptor = "I")
    private int field4087 = -1;

    @OriginalMember(owner = "client!vca", name = "g", descriptor = "I")
    public int field4076 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vca", name = "x", descriptor = "I")
    private int field4093 = -1;

    @OriginalMember(owner = "client!vca", name = "y", descriptor = "Z")
    public boolean field4094 = true;

    @OriginalMember(owner = "client!vca", name = "H", descriptor = "I")
    public int field4103 = 0;

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "Z")
    public boolean field4071 = false;

    @OriginalMember(owner = "client!vca", name = "z", descriptor = "Z")
    public boolean field4095 = true;

    @OriginalMember(owner = "client!vca", name = "M", descriptor = "I")
    public int field4108 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vca", name = "L", descriptor = "I")
    public int field4107 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vca", name = "G", descriptor = "I")
    public int field4102 = -1;

    @OriginalMember(owner = "client!vca", name = "q", descriptor = "I")
    private int field4086 = -1;

    @OriginalMember(owner = "client!vca", name = "m", descriptor = "I")
    public int field4082 = -1;

    @OriginalMember(owner = "client!vca", name = "p", descriptor = "I")
    public int field4085 = -1;

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "[Ljava/lang/String;")
    public String[] field4074 = new String[5];

    @OriginalMember(owner = "client!vca", name = "v", descriptor = "I")
    public int field4091 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vca", name = "I", descriptor = "I")
    private int field4104 = -1;

    @OriginalMember(owner = "client!vca", name = "S", descriptor = "I")
    private int field4113 = -1;

    @OriginalMember(owner = "client!vca", name = "R", descriptor = "I")
    public int field4112 = -1;

    @OriginalMember(owner = "client!vca", name = "Q", descriptor = "Z")
    public boolean field4111 = true;

    @OriginalMember(owner = "client!vca", name = "h", descriptor = "[I")
    public static int[] field4077 = new int[2];

    @OriginalMember(owner = "client!vca", name = "k", descriptor = "I")
    public static int field4080 = -1;

    @OriginalMember(owner = "client!vca", name = "f", descriptor = "I")
    public int field4075;

    @OriginalMember(owner = "client!vca", name = "i", descriptor = "I")
    public int field4078;

    @OriginalMember(owner = "client!vca", name = "j", descriptor = "I")
    public int field4079;

    @OriginalMember(owner = "client!vca", name = "l", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!vca", name = "n", descriptor = "I")
    public int field4083;

    @OriginalMember(owner = "client!vca", name = "o", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!vca", name = "t", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!vca", name = "w", descriptor = "I")
    private int field4092;

    @OriginalMember(owner = "client!vca", name = "A", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!vca", name = "B", descriptor = "I")
    public int field4097;

    @OriginalMember(owner = "client!vca", name = "C", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!vca", name = "D", descriptor = "I")
    public int field4099;

    @OriginalMember(owner = "client!vca", name = "E", descriptor = "I")
    private int field4100;

    @OriginalMember(owner = "client!vca", name = "F", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!vca", name = "J", descriptor = "I")
    private int field4105;

    @OriginalMember(owner = "client!vca", name = "O", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!vca", name = "P", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!vca", name = "T", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!vca", name = "U", descriptor = "I")
    private int field4115;

    @OriginalMember(owner = "client!vca", name = "K", descriptor = "Lsba;")
    private class200 field4106;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "Llk;")
    public class544 field4070;

    @OriginalMember(owner = "client!vca", name = "s", descriptor = "Ljava/lang/String;")
    public String field4088;

    @OriginalMember(owner = "client!vca", name = "u", descriptor = "Ljava/lang/String;")
    public String field4090;

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "[I")
    public int[] field4072;

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "[Lob;")
    public static class686[] field4073;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lr;ZZ)Lf;", line = 11)
    public final class702 method1815(class167 arg0, boolean arg1, boolean arg2) {
        field4089++;
        int var4 = arg1 ? this.field4085 : this.field4102;
        int var5 = arg0.field2804 << 29 | var4;
        class702 var6 = (class702) this.field4070.field7923.method560(arg2, (long) var5);
        if (var6 != null) {
            return var6;
        } else if (this.field4070.field7911.method942(0, var4)) {
            class284 var7 = class284.method2027(this.field4070.field7911, var4, 0);
            if (var7 != null) {
                var6 = arg0.method265(var7, true);
                this.field4070.field7923.method559(var6, (long) var5, 0);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lie;BI)V", line = 41)
    private final void method1816(class6 arg0, byte arg1, int arg2) {
        if (arg1 != -40) {
            this.field4088 = null;
        }
        field4110++;
        if (arg2 == 1) {
            this.field4102 = arg0.method67(12021);
        } else if (arg2 == 2) {
            this.field4085 = arg0.method67(12021);
        } else if (arg2 == 3) {
            this.field4088 = arg0.method42((byte) -44);
        } else if (arg2 == 4) {
            this.field4097 = arg0.method86(-58);
        } else if (arg2 == 5) {
            this.field4082 = arg0.method86(-57);
        } else if (arg2 == 6) {
            this.field4103 = arg0.method70(-9059);
            return;
        } else if (arg2 == 7) {
            int var12 = arg0.method70(arg1 ^ 0x2345);
            if ((var12 & 0x2) == 2) {
                this.field4071 = true;
            }
            if ((var12 & 0x1) == 0) {
                this.field4094 = false;
                return;
            }
        } else if (arg2 == 8) {
            this.field4111 = arg0.method70(-9059) == 1;
            return;
        } else if (arg2 == 9) {
            this.field4104 = arg0.method67(12021);
            if (this.field4104 == 65535) {
                this.field4104 = -1;
            }
            this.field4113 = arg0.method67(arg1 + 12061);
            if (this.field4113 == 65535) {
                this.field4113 = -1;
            }
            this.field4115 = arg0.method72(arg1 + 11);
            this.field4105 = arg0.method72(-63);
            return;
        } else if (arg2 < 10 || arg2 > 14) {
            if (arg2 != 15) {
                if (arg2 != 16) {
                    if (arg2 == 17) {
                        this.field4090 = arg0.method42((byte) -118);
                    } else if (arg2 == 18) {
                        this.field4086 = arg0.method67(12021);
                        return;
                    } else if (arg2 == 19) {
                        this.field4112 = arg0.method67(12021);
                        return;
                    } else if (arg2 == 20) {
                        this.field4087 = arg0.method67(12021);
                        if (this.field4087 == 65535) {
                            this.field4087 = -1;
                        }
                        this.field4093 = arg0.method67(12021);
                        if (this.field4093 == 65535) {
                            this.field4093 = -1;
                        }
                        this.field4100 = arg0.method72(-83);
                        this.field4092 = arg0.method72(arg1 ^ 0x1A);
                        return;
                    } else if (arg2 == 21) {
                        this.field4078 = arg0.method72(-86);
                        return;
                    } else if (arg2 == 22) {
                        this.field4075 = arg0.method72(arg1 ^ 0x39);
                        return;
                    } else if (arg2 == 249) {
                        int var6 = arg0.method70(-9059);
                        if (this.field4106 == null) {
                            int var7 = class413.method2636(var6, 127);
                            this.field4106 = new class200(var7);
                        }
                        for (int var8 = 0; var8 < var6; var8++) {
                            boolean var9 = arg0.method70(arg1 - 9019) == 1;
                            int var10 = arg0.method86(arg1 - 1);
                            class66 var11;
                            if (var9) {
                                var11 = new class420(arg0.method42((byte) -74));
                            } else {
                                var11 = new class160(arg0.method72(arg1 - 66));
                            }
                            this.field4106.method1564((long) var10, var11, (byte) 100);
                        }
                        return;
                    }
                    return;
                }
                this.field4095 = false;
                return;
            }
            int var4 = arg0.method70(-9059);
            this.field4072 = new int[var4 * 2];
            for (int var5 = 0; var5 < (var4 * 2); var5++) {
                this.field4072[var5] = arg0.method45(class357.method2397(arg1, 8684));
            }
            this.field4083 = arg0.method72(-113);
            this.field4099 = arg0.method72(-126);
            return;
        } else {
            this.field4074[arg2 - 10] = arg0.method42((byte) -126);
            return;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V", line = 216)
    public static void method1817(int arg0) {
        field4077 = null;
        field4073 = null;
        if (arg0 <= 122) {
            method1823(-112);
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(BII)I", line = 228)
    public final int method1818(byte arg0, int arg1, int arg2) {
        field4109++;
        if (this.field4106 == null) {
            return arg2;
        } else {
            class160 var4 = (class160) this.field4106.method1558((long) arg1, (byte) -93);
            int var5 = 43 / ((arg0 + 47) / 35);
            return var4 == null ? arg2 : var4.field2728;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(ILr;)Lf;", line = 252)
    public final class702 method1819(int arg0, class167 arg1) {
        field4114++;
        class702 var3 = (class702) this.field4070.field7923.method560(false, (long) (this.field4086 | 0x20000 | arg1.field2804 << 29));
        if (var3 != null) {
            return var3;
        }
        this.field4070.field7911.method942(0, this.field4086);
        class284 var4 = class284.method2027(this.field4070.field7911, this.field4086, arg0);
        if (var4 != null) {
            var3 = arg1.method265(var4, true);
            this.field4070.field7923.method559(var3, (long) (this.field4086 | 0x20000 | arg1.field2804 << 29), 0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Z)V", line = 284)
    public final void method1820(boolean arg0) {
        if (arg0) {
            return;
        }
        field4101++;
        if (this.field4072 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field4072.length; var2 += 2) {
            if (this.field4107 > this.field4072[var2]) {
                this.field4107 = this.field4072[var2];
            } else if (this.field4072[var2] > this.field4108) {
                this.field4108 = this.field4072[var2];
            }
            if (this.field4091 > this.field4072[var2 + 1]) {
                this.field4091 = this.field4072[var2 + 1];
            } else if (this.field4076 < this.field4072[var2 + 1]) {
                this.field4076 = this.field4072[var2 + 1];
            }
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;", line = 323)
    public final String method1821(int arg0, int arg1, String arg2) {
        field4096++;
        if (this.field4106 == null) {
            return arg2;
        }
        class420 var4 = (class420) this.field4106.method1558((long) arg1, (byte) -93);
        if (arg0 == -25509) {
            return var4 == null ? arg2 : var4.field6425;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(BLhfa;)Z", line = 398)
    public final boolean method1822(byte arg0, class285 arg1) {
        field4098++;
        int var3;
        if (this.field4113 == -1) {
            if (this.field4104 == -1) {
                return true;
            }
            var3 = arg1.method2031((byte) 52, this.field4104);
        } else {
            var3 = arg1.method2032((byte) -49, this.field4113);
        }
        if (this.field4115 > var3 || this.field4105 < var3) {
            return false;
        }
        boolean var4 = false;
        int var5;
        if (this.field4093 == -1) {
            if (this.field4087 == -1) {
                return true;
            }
            var5 = arg1.method2031((byte) -120, this.field4087);
        } else {
            var5 = arg1.method2032((byte) -72, this.field4093);
        }
        if (var5 >= this.field4100 && this.field4092 >= var5) {
            if (arg0 >= -50) {
                this.field4070 = null;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)V", line = 437)
    public static final void method1823(int arg0) {
        field4081++;
        class157.field2684.method3488(-4744);
        class262.method1861((byte) 81);
        class622.field8790 = 0;
        class11.field179 = null;
        class157.field2688 = 0;
        class437.field6668 = null;
        class17.field302 = null;
        class558.field8066.field57 = 0;
        class271.method1913((byte) 114);
        class92.field1171 = null;
        class204.field3334 = 0;
        class538.field7861 = arg0;
        class307.field4836 = 0;
        class145.field2442 = null;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lie;I)V", line = 467)
    public final void method1824(class6 arg0, int arg1) {
        if (arg1 <= 60) {
            this.field4092 = 79;
        }
        while (true) {
            int var3 = arg0.method70(-9059);
            if (var3 == 0) {
                field4084++;
                return;
            }
            this.method1816(arg0, (byte) -40, var3);
        }
    }
}
