import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class367 extends class323 implements class231 {

    @OriginalMember(owner = "client!rba", name = "R", descriptor = "Z")
    private boolean field5068;

    @OriginalMember(owner = "client!rba", name = "E", descriptor = "Z")
    private boolean field5055;

    @OriginalMember(owner = "client!rba", name = "A", descriptor = "B")
    private byte field5051;

    @OriginalMember(owner = "client!rba", name = "v", descriptor = "B")
    private byte field5046;

    @OriginalMember(owner = "client!rba", name = "P", descriptor = "B")
    private byte field5066;

    @OriginalMember(owner = "client!rba", name = "G", descriptor = "S")
    private short field5057;

    @OriginalMember(owner = "client!rba", name = "z", descriptor = "Z")
    private boolean field5050;

    @OriginalMember(owner = "client!rba", name = "D", descriptor = "Lr;")
    private class159 field5054;

    @OriginalMember(owner = "client!rba", name = "S", descriptor = "Lk;")
    private class485 field5069;

    @OriginalMember(owner = "client!rba", name = "W", descriptor = "Lh;")
    public static class572 field5073 = new class572("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!rba", name = "Y", descriptor = "I")
    public static int field5075 = 1401;

    @OriginalMember(owner = "client!rba", name = "X", descriptor = "Lbu;")
    public static class19 field5074 = new class19();

    @OriginalMember(owner = "client!rba", name = "u", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!rba", name = "w", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!rba", name = "x", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!rba", name = "y", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!rba", name = "B", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!rba", name = "C", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!rba", name = "F", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!rba", name = "H", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!rba", name = "I", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!rba", name = "J", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!rba", name = "K", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!rba", name = "L", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!rba", name = "M", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!rba", name = "N", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!rba", name = "O", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!rba", name = "Q", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!rba", name = "T", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!rba", name = "U", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!rba", name = "V", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!rba", name = "Z", descriptor = "Lpl;")
    private class558 field5076;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)I", line = 7)
    public final int method183(int arg0) {
        if (arg0 != -19248) {
            this.field5066 = 74;
        }
        ++field5045;
        return 65535 & this.field5057;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILqa;IB)Z", line = 18)
    public final boolean method171(int arg0, class208 arg1, int arg2, byte arg3) {
        ++field5067;
        if (arg3 < 44) {
            return true;
        } else {
            class159 var5 = this.method2202(arg1, (byte) 65, 131072);
            if (var5 != null) {
                class165 var6 = arg1.method428();
                var6.method353(super.field4446, super.field4449, super.field4457);
                return var5.method72(arg2, arg0, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)Z", line = 42)
    public final boolean method192(byte arg0) {
        if (arg0 != -41) {
            this.method189((class208) null, -100);
        }
        ++field5049;
        return this.field5050;
    }

    @OriginalMember(owner = "client!rba", name = "e", descriptor = "(B)Ljava/lang/String;", line = 54)
    public static final String method2201(byte arg0) {
        ++field5065;
        if (!class446.field6245 && class151.field2298 != null) {
            return arg0 > -92 ? null : class151.field2298.field8567;
        } else {
            return "";
        }
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lqa;Luh;IIIIZIIIII)V", line = 69)
    public class367(class208 arg0, class145 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class414.method2444(arg11, arg10, 3));
        super.field4457 = arg5;
        this.field5068 = arg6;
        this.field5055 = ~arg1.field2056 != -1 && !arg6;
        this.field5051 = (byte) arg10;
        this.field5046 = (byte) arg2;
        this.field5066 = (byte) arg11;
        this.field5057 = (short) arg1.field2049;
        super.field4446 = arg3;
        this.field5050 = arg0.method457() && arg1.field2084 && !this.field5068 && class56.field668.method2897(class526.field7533, 6373) != 0;
        class429 var13 = this.method2205(2048, this.field5050, (byte) -75, arg0);
        if (var13 != null) {
            this.field5054 = var13.field5765;
            this.field5069 = var13.field5763;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILqa;)V", line = 94)
    public final void method194(int arg0, class208 arg1) {
        ++field5061;
        if (arg0 != 0) {
            method2204(-54, (class208) null, 63L);
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(BLqa;)V", line = 104)
    public final void method174(byte arg0, class208 arg1) {
        ++field5047;
        Object var3 = null;
        class485 var5;
        if (this.field5069 == null && this.field5050) {
            class429 var4 = this.method2205(262144, true, (byte) -75, arg1);
            var5 = var4 == null ? null : var4.field5763;
        } else {
            var5 = this.field5069;
            this.field5069 = null;
        }
        if (arg0 <= -36) {
            if (var5 != null) {
                class377.method2253(var5, this.field5046, super.field4446, super.field4457, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "(I)V", line = 134)
    public final void method172(int arg0) {
        if (this.field5054 != null) {
            this.field5054.method55();
        }
        ++field5062;
        if (arg0 < 95) {
            this.method174((byte) -25, (class208) null);
        }
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)I", line = 149)
    public final int method170(int arg0) {
        if (arg0 > -120) {
            method2204(127, (class208) null, -121L);
        }
        ++field5059;
        return this.field5066;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lqa;BI)Lr;", line = 163)
    private final class159 method2202(class208 arg0, byte arg1, int arg2) {
        ++field5071;
        if (this.field5054 != null && ~arg0.method528(this.field5054.method90(), arg2) == -1) {
            return this.field5054;
        } else {
            class429 var4 = this.method2205(arg2, false, (byte) -75, arg0);
            if (arg1 != 65) {
                this.method2205(107, false, (byte) 108, (class208) null);
            }
            return var4 != null ? var4.field5765 : null;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Z)I", line = 189)
    public final int method1941(boolean arg0) {
        if (arg0) {
            this.method181(56, (class208) null);
        }
        ++field5048;
        return this.field5054 != null ? this.field5054.method86() : 0;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(IZ)V", line = 201)
    public static final void method2203(int arg0, boolean arg1) {
        if (arg0 != 37) {
            if (arg0 != 50) {
                if (arg0 == 75) {
                    class339.field4678 = 6.0F;
                } else if (~arg0 == -101) {
                    class339.field4678 = 8.0F;
                } else if (arg0 == 200) {
                    class339.field4678 = 16.0F;
                }
            } else {
                class339.field4678 = 4.0F;
            }
        } else {
            class339.field4678 = 3.0F;
        }
        ++field5056;
        class451.field6372 = -1;
        class451.field6372 = -1;
        if (arg1) {
            method2207(-105);
        }
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(B)I", line = 233)
    public final int method173(byte arg0) {
        int var2 = -76 % ((-43 - arg0) / 49);
        ++field5064;
        return this.field5051;
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(BLqa;)V", line = 243)
    public final void method178(byte arg0, class208 arg1) {
        ++field5052;
        Object var3 = null;
        class485 var5;
        if (this.field5069 == null && this.field5050) {
            class429 var4 = this.method2205(262144, true, (byte) -75, arg1);
            var5 = var4 == null ? null : var4.field5763;
        } else {
            var5 = this.field5069;
            this.field5069 = null;
        }
        if (var5 != null) {
            class46.method290(var5, this.field5046, super.field4446, super.field4457, (boolean[]) null);
        }
        if (arg0 != 115) {
            this.method194(88, (class208) null);
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILqa;J)V", line = 271)
    public static final void method2204(int arg0, class208 arg1, long arg2) {
        int var4 = -80 % ((arg0 - -15) / 50);
        class1.field4 = 0;
        class523.field7481 = class297.field4079;
        ++field5070;
        class297.field4079 = 0;
        long var5 = class598.method3538(true);
        for (class206 var7 = (class206) class515.field7349.method2233(true); var7 != null; var7 = (class206) class515.field7349.method2240(16772)) {
            if (var7.method1355(arg1, arg2)) {
                ++class1.field4;
            }
        }
        if (class3.field18 && ~(arg2 % 100L) == -1L) {
            System.out.println("Particle system count: " + class515.field7349.method2238(46) + ", running: " + class1.field4 + ". Particles: " + class297.field4079 + ". Time taken: " + (-var5 + class598.method3538(true)) + "ms");
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(IZBLqa;)Lis;", line = 305)
    private final class429 method2205(int arg0, boolean arg1, byte arg2, class208 arg3) {
        ++field5072;
        class145 var5 = class216.field3172.method1505(-24044, this.field5057 & 65535);
        class176 var6;
        class176 var7;
        if (this.field5068) {
            var6 = class114.field1609[this.field5046];
            var7 = class207.field3077[0];
        } else {
            if (this.field5046 < 3) {
                var7 = class207.field3077[this.field5046 - -1];
            } else {
                var7 = null;
            }
            var6 = class207.field3077[this.field5046];
        }
        return arg2 != -75 ? null : var5.method997(super.field4446, this.field5051, -80, arg1, arg0, super.field4457, var7, var6, this.field5066, arg3, super.field4449);
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIIII)V", line = 336)
    public static final void method2206(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class524.field7489 = arg2;
        class220.field3205 = arg0;
        class84.field1206 = arg3;
        if (arg1 == -1) {
            ++field5058;
            class215.field3164 = arg4;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(BILqa;)Lr;", line = 350)
    public final class159 method190(byte arg0, int arg1, class208 arg2) {
        if (arg0 < 40) {
            this.method183(-18);
        }
        ++field5060;
        return this.method2202(arg2, (byte) 65, arg1);
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(ILqa;)Lin;", line = 361)
    public final class77 method181(int arg0, class208 arg1) {
        ++field5063;
        if (this.field5054 == null) {
            return null;
        } else {
            class165 var3 = arg1.method428();
            if (arg0 < 0) {
                return null;
            } else {
                var3.method353(super.field4446 - -super.field4448, super.field4449, super.field4457 + super.field4447);
                class77 var4 = null;
                if (this.field5055) {
                    var4 = class450.method2725(1, 26728);
                }
                this.field5054.method93(var3, var4 != null ? var4.field1022[0] : null, 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lqa;I)Lpl;", line = 386)
    public final class558 method189(class208 arg0, int arg1) {
        if (this.field5076 == null) {
            this.field5076 = class115.method826(this.method2202(arg0, (byte) 65, 0), super.field4446, 21979, super.field4457, super.field4449);
        }
        ++field5053;
        return arg1 != 31733 ? null : this.field5076;
    }

    @OriginalMember(owner = "client!rba", name = "g", descriptor = "(I)V", line = 401)
    public static void method2207(int arg0) {
        field5074 = null;
        if (arg0 == -1) {
            field5073 = null;
        }
    }
}
