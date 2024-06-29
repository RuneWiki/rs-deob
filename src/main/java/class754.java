import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class754 extends class142 implements class722 {

    @OriginalMember(owner = "client!lo", name = "S", descriptor = "Z")
    private boolean field10455;

    @OriginalMember(owner = "client!lo", name = "Y", descriptor = "S")
    private short field10461;

    @OriginalMember(owner = "client!lo", name = "db", descriptor = "Z")
    private boolean field10466;

    @OriginalMember(owner = "client!lo", name = "gb", descriptor = "Z")
    private boolean field10469;

    @OriginalMember(owner = "client!lo", name = "Z", descriptor = "B")
    private byte field10462;

    @OriginalMember(owner = "client!lo", name = "ib", descriptor = "Z")
    private boolean field10471;

    @OriginalMember(owner = "client!lo", name = "hb", descriptor = "Lka;")
    private class472 field10470;

    @OriginalMember(owner = "client!lo", name = "cb", descriptor = "Lr;")
    private class184 field10465;

    @OriginalMember(owner = "client!lo", name = "R", descriptor = "[I")
    public static int[] field10454 = new int[6];

    @OriginalMember(owner = "client!lo", name = "E", descriptor = "I")
    public static int field10445;

    @OriginalMember(owner = "client!lo", name = "I", descriptor = "I")
    public static int field10446;

    @OriginalMember(owner = "client!lo", name = "K", descriptor = "I")
    public static int field10448;

    @OriginalMember(owner = "client!lo", name = "L", descriptor = "I")
    public static int field10449;

    @OriginalMember(owner = "client!lo", name = "M", descriptor = "I")
    public static int field10450;

    @OriginalMember(owner = "client!lo", name = "N", descriptor = "I")
    public static int field10451;

    @OriginalMember(owner = "client!lo", name = "P", descriptor = "I")
    public static int field10452;

    @OriginalMember(owner = "client!lo", name = "Q", descriptor = "I")
    public static int field10453;

    @OriginalMember(owner = "client!lo", name = "T", descriptor = "I")
    public static int field10456;

    @OriginalMember(owner = "client!lo", name = "U", descriptor = "I")
    public static int field10457;

    @OriginalMember(owner = "client!lo", name = "V", descriptor = "I")
    public static int field10458;

    @OriginalMember(owner = "client!lo", name = "W", descriptor = "I")
    public static int field10459;

    @OriginalMember(owner = "client!lo", name = "X", descriptor = "I")
    public static int field10460;

    @OriginalMember(owner = "client!lo", name = "ab", descriptor = "I")
    public static int field10463;

    @OriginalMember(owner = "client!lo", name = "bb", descriptor = "I")
    public static int field10464;

    @OriginalMember(owner = "client!lo", name = "eb", descriptor = "I")
    public static int field10467;

    @OriginalMember(owner = "client!lo", name = "fb", descriptor = "I")
    public static int field10468;

    @OriginalMember(owner = "client!lo", name = "jb", descriptor = "I")
    public static int field10472;

    @OriginalMember(owner = "client!lo", name = "kb", descriptor = "I")
    public static int field10473;

    @OriginalMember(owner = "client!lo", name = "lb", descriptor = "I")
    public static int field10474;

    @OriginalMember(owner = "client!lo", name = "mb", descriptor = "I")
    public static int field10475;

    @OriginalMember(owner = "client!lo", name = "nb", descriptor = "I")
    public static int field10476;

    @OriginalMember(owner = "client!lo", name = "J", descriptor = "Loia;")
    private class90 field10447;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "(B)Z", line = 3)
    public final boolean method157(byte arg0) {
        ++field10468;
        if (arg0 >= -70) {
            this.field10471 = false;
        }
        return this.field10455;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILha;)V", line = 14)
    public final void method678(int arg0, class60 arg1) {
        if (arg0 == -25163) {
            ++field10463;
            Object var3 = null;
            class184 var5;
            if (this.field10465 == null && this.field10471) {
                class696 var4 = this.method4197(true, arg1, true, 262144);
                var5 = var4 != null ? var4.field9720 : null;
            } else {
                var5 = this.field10465;
                this.field10465 = null;
            }
            if (var5 != null) {
                class65.method500(var5, super.field2167, super.field2170, super.field2165, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)I", line = 42)
    public final int method680(int arg0) {
        if (arg0 != 30472) {
            return 37;
        } else {
            ++field10456;
            return 65535 & this.field10461;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILac;ZLjava/lang/String;)Lv;", line = 57)
    public static final class580 method4195(int arg0, class541 arg1, boolean arg2, String arg3) {
        ++field10464;
        if (arg2) {
            return null;
        } else {
            long var4 = OpenGL.glCreateShaderObjectARB(arg0);
            OpenGL.glShaderSourceARB(var4, arg3);
            OpenGL.glCompileShaderARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35713, class60.field651, 0);
            if (class60.field651[0] == 0) {
                if (class60.field651[0] == 0) {
                    System.out.println("Shader compile failed:");
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class60.field651, 1);
                if (~class60.field651[1] < -2) {
                    byte[] var6 = new byte[class60.field651[1]];
                    OpenGL.glGetInfoLogARB(var4, class60.field651[1], class60.field651, 0, var6, 0);
                    System.out.println(new String(var6));
                }
                if (~class60.field651[0] == -1) {
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            return new class580(arg1, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)I", line = 99)
    public final int method685(int arg0) {
        if (arg0 != 4657) {
            return -4;
        } else {
            ++field10467;
            return this.field10462;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)Lmu;", line = 111)
    public static final class303 method4196(int arg0, int arg1) {
        ++field10450;
        class303[] var2 = class348.method2030(94);
        for (int var3 = 0; ~var2.length < ~var3; ++var3) {
            class303 var4 = var2[var3];
            if (~var4.field4092 == ~arg1) {
                return var4;
            }
        }
        if (arg0 < 101) {
            field10454 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "(I)Z", line = 138)
    public final boolean method126(int arg0) {
        ++field10449;
        if (arg0 != 6540) {
            this.method4199(23, -77, (class60) null);
        }
        return this.field10470 == null ? false : this.field10470.method219();
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(B)I", line = 153)
    public final int method686(byte arg0) {
        if (arg0 != 20) {
            this.method686((byte) 84);
        }
        ++field10451;
        return 22;
    }

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "(I)I", line = 168)
    public final int method132(int arg0) {
        if (arg0 != 0) {
            return 87;
        } else {
            ++field10459;
            return this.field10470 != null ? this.field10470.method234() : 0;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZLha;ZI)Lsfa;", line = 181)
    private final class696 method4197(boolean arg0, class60 arg1, boolean arg2, int arg3) {
        if (!arg0) {
            return null;
        } else {
            ++field10476;
            class685 var5 = class707.field9894.method4109(65535 & this.field10461, (byte) 119);
            class281 var6;
            class281 var7;
            if (!this.field10466) {
                var6 = class86.field1182[super.field2167];
                if (super.field2167 < 3) {
                    var7 = class86.field1182[super.field2167 - -1];
                } else {
                    var7 = null;
                }
            } else {
                var6 = class143.field1850[super.field2167];
                var7 = class86.field1182[0];
            }
            return var5.method3874(super.field2165, false, var7, this.field10462, super.field2178, arg2, super.field2170, arg3, (class150) null, var6, arg1, 22);
        }
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lha;Lvha;IIIIIZIZ)V", line = 211)
    public class754(class60 arg0, class685 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field9551);
        this.field10455 = arg9;
        this.field10461 = (short) arg1.field9541;
        super.field2170 = arg4;
        this.field10466 = arg7;
        this.field10469 = ~arg1.field9610 != -1 && !arg7;
        super.field2165 = arg6;
        this.field10462 = (byte) arg8;
        this.field10471 = arg0.method381() && arg1.field9540 && !this.field10466 && class11.field68.field5545.method61((byte) 123) != 0;
        int var11 = 2048;
        if (this.field10455) {
            var11 |= 65536;
        }
        class696 var12 = this.method4197(true, arg0, this.field10471, var11);
        if (var12 != null) {
            this.field10470 = var12.field9718;
            this.field10465 = var12.field9720;
            if (this.field10455) {
                this.field10470 = this.field10470.method241((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "(I)Z", line = 245)
    public final boolean method123(int arg0) {
        int var2 = 100 / ((arg0 - -76) / 47);
        ++field10460;
        if (this.field10470 == null) {
            return true;
        } else {
            return !this.field10470.method204();
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILha;BI)Z", line = 260)
    public final boolean method131(int arg0, class60 arg1, byte arg2, int arg3) {
        if (arg2 <= 59) {
            return false;
        } else {
            ++field10448;
            class472 var5 = this.method4199(-69, 131072, arg1);
            if (var5 != null) {
                class10 var6 = arg1.method410();
                var6.method33(super.field2170, super.field2178, super.field2165);
                return !class670.field9312 ? var5.method206(arg0, arg3, var6, false, 0) : var5.method196(arg0, arg3, var6, false, 0, class661.field9249);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(Lha;I)V", line = 286)
    public final void method136(class60 arg0, int arg1) {
        int var3 = 121 / ((53 - arg1) / 46);
        ++field10475;
    }

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "(I)V", line = 295)
    public static void method4198(int arg0) {
        if (arg0 == 25581) {
            field10454 = null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(Z)I", line = 305)
    public final int method128(boolean arg0) {
        if (arg0) {
            return 68;
        } else {
            ++field10472;
            return this.field10470 == null ? 0 : this.field10470.method212();
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BLha;)Loia;", line = 316)
    public final class90 method134(byte arg0, class60 arg1) {
        if (this.field10447 == null) {
            this.field10447 = class185.method1041(super.field2178, super.field2170, this.method4199(121, 0, arg1), super.field2165, 4);
        }
        if (arg0 != -53) {
            field10454 = null;
        }
        ++field10446;
        return this.field10447;
    }

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "(B)V", line = 330)
    public final void method150(byte arg0) {
        ++field10453;
        if (arg0 != -73) {
            this.field10461 = 12;
        }
        this.field10455 = false;
        if (this.field10470 != null) {
            this.field10470.method202(-65537 & this.field10470.method225());
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILha;)Lka;", line = 346)
    private final class472 method4199(int arg0, int arg1, class60 arg2) {
        ++field10445;
        if (this.field10470 != null && ~arg2.method396(this.field10470.method225(), arg1) == -1) {
            return this.field10470;
        } else {
            class696 var4 = this.method4197(true, arg2, false, arg1);
            int var5 = 19 / ((77 - arg0) / 35);
            return var4 == null ? null : var4.field9718;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lha;I)V", line = 367)
    public final void method679(class60 arg0, int arg1) {
        ++field10458;
        if (arg1 != 24447) {
            method4195(95, (class541) null, true, (String) null);
        }
        Object var3 = null;
        class184 var5;
        if (this.field10465 == null && this.field10471) {
            class696 var4 = this.method4197(true, arg0, true, 262144);
            var5 = var4 != null ? var4.field9720 : null;
        } else {
            var5 = this.field10465;
            this.field10465 = null;
        }
        if (var5 != null) {
            class432.method2467(var5, super.field2167, super.field2170, super.field2165, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)Z", line = 395)
    public final boolean method682(boolean arg0) {
        if (!arg0) {
            this.field10447 = null;
        }
        ++field10473;
        return this.field10471;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lgg;BZILha;II)V", line = 411)
    public final void method162(class176 arg0, byte arg1, boolean arg2, int arg3, class60 arg4, int arg5, int arg6) {
        int var8 = -7 % ((15 - arg1) / 55);
        ++field10452;
        if (arg0 instanceof class754) {
            class754 var9 = (class754) arg0;
            if (this.field10470 != null && var9.field10470 != null) {
                this.field10470.method232(var9.field10470, arg3, arg5, arg6, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(Lha;I)Lbd;", line = 433)
    public final class62 method127(class60 arg0, int arg1) {
        ++field10457;
        if (this.field10470 == null) {
            return null;
        } else {
            if (arg1 >= -12) {
                this.field10461 = 45;
            }
            class10 var3 = arg0.method410();
            var3.method33(super.field2170, super.field2178, super.field2165);
            class62 var4 = class413.method2384(1, (byte) -47, this.field10469);
            if (class670.field9312) {
                this.field10470.method243(var3, var4.field678[0], class661.field9249, 0);
            } else {
                this.field10470.method230(var3, var4.field678[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V", line = 467)
    public final void method681(byte arg0) {
        if (arg0 != -96) {
            this.method4197(true, (class60) null, false, 21);
        }
        if (this.field10470 != null) {
            this.field10470.method240();
        }
        ++field10474;
    }
}
