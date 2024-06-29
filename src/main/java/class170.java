import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class170 extends class242 implements class691 {

    @OriginalMember(owner = "client!ov", name = "L", descriptor = "Z")
    private boolean field2057 = false;

    @OriginalMember(owner = "client!ov", name = "W", descriptor = "Llq;")
    public class512 field2067;

    @OriginalMember(owner = "client!ov", name = "P", descriptor = "Z")
    private boolean field2061;

    @OriginalMember(owner = "client!ov", name = "ab", descriptor = "Lgfa;")
    public static class696 field2071 = new class696(12, 0, 1, 0);

    @OriginalMember(owner = "client!ov", name = "jb", descriptor = "F")
    public static float field2080 = 1.0F;

    @OriginalMember(owner = "client!ov", name = "K", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!ov", name = "M", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!ov", name = "N", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!ov", name = "O", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!ov", name = "R", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!ov", name = "S", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!ov", name = "T", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!ov", name = "U", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!ov", name = "V", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!ov", name = "X", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!ov", name = "Y", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!ov", name = "Z", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!ov", name = "cb", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!ov", name = "db", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!ov", name = "eb", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!ov", name = "fb", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!ov", name = "gb", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!ov", name = "hb", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!ov", name = "ib", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!ov", name = "bb", descriptor = "Lsr;")
    private class229 field2072;

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "(I)V", line = 4)
    public static void method1066(int arg0) {
        int var1 = 2 / ((arg0 - -12) / 33);
        field2071 = null;
    }

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "(B)I", line = 15)
    public final int method172(byte arg0) {
        if (arg0 != -117) {
            return -113;
        } else {
            ++field2058;
            return this.field2067.method3034(arg0 ^ -101);
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIZLr;ILub;I)V", line = 31)
    public final void method169(int arg0, int arg1, boolean arg2, class165 arg3, int arg4, class20 arg5, int arg6) {
        if (arg4 > 113) {
            ++field2076;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)I", line = 42)
    public final int method1067(byte arg0) {
        int var2 = 13 % ((arg0 - -1) / 37);
        ++field2068;
        return this.field2067.field7499;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILr;)V", line = 53)
    public final void method1068(int arg0, class165 arg1) {
        ++field2077;
        this.field2067.method3042(arg1, -92);
        if (arg0 > -22) {
            this.method165((byte) 92);
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lr;Z)V", line = 65)
    public final void method162(class165 arg0, boolean arg1) {
        ++field2063;
        class55 var3 = this.field2067.method3039(true, true, 262144, arg1, arg0);
        if (var3 != null) {
            int var4 = super.field530 >> 9;
            int var5 = super.field531 >> 9;
            class394 var6 = arg0.method315();
            var6.method712(super.field530, super.field527, super.field531);
            this.field2067.method3038(var5, var6, var4, -92, var4, var5, false, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lr;III)Z", line = 86)
    public final boolean method166(class165 arg0, int arg1, int arg2, int arg3) {
        ++field2069;
        class55 var5 = this.field2067.method3039(false, false, 131072, false, arg0);
        if (var5 == null) {
            return false;
        } else {
            class394 var6 = arg0.method315();
            var6.method712(super.field530, super.field527, super.field531);
            if (arg3 >= -20) {
                this.field2057 = false;
            }
            return !class547.field7943 ? var5.method129(arg1, arg2, var6, false) : var5.method124(arg1, arg2, var6, false, class676.field9693);
        }
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lr;Lfga;IIIIIZIII)V", line = 111)
    public class170(class165 arg0, class232 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class543.method3181(false, arg9, arg8));
        this.field2067 = new class512(arg0, arg1, arg8, arg9, super.field532, arg3, this, arg7, arg10);
        this.field2061 = ~arg1.field3029 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "(I)Z", line = 123)
    public final boolean method175(int arg0) {
        ++field2060;
        return arg0 != 0;
    }

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "(I)I", line = 134)
    public final int method173(int arg0) {
        ++field2062;
        return arg0 != 32249 ? -99 : this.field2067.method3033((byte) -70);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lr;B)Llt;", line = 145)
    public final class626 method170(class165 arg0, byte arg1) {
        ++field2079;
        class55 var3 = this.field2067.method3039(true, false, 2048, false, arg0);
        if (arg1 != -2) {
            return null;
        } else if (var3 == null) {
            return null;
        } else {
            class394 var4 = arg0.method315();
            var4.method712(super.field530, super.field527, super.field531);
            class626 var5 = null;
            if (this.field2061) {
                var5 = class547.method3208(1, -16660);
            }
            int var6 = super.field530 >> 9;
            int var7 = super.field531 >> 9;
            this.field2067.method3038(var7, var4, var6, -62, var6, var7, true, var3, arg0);
            if (class547.field7943) {
                var3.method122(var4, var5 != null ? var5.field8985[0] : null, class676.field9693, 0);
            } else {
                var3.method67(var4, var5 != null ? var5.field8985[0] : null, 0);
            }
            if (this.field2067.field7505 != null) {
                class436 var8 = this.field2067.field7505.method3869();
                if (!class547.field7943) {
                    arg0.method228(var8);
                } else {
                    arg0.method223(var8, class676.field9693);
                }
            }
            this.field2057 = var3.method112() || this.field2067.field7505 != null;
            if (this.field2072 != null) {
                class571.method3343(super.field527, this.field2072, var3, super.field530, -28256, super.field531);
            } else {
                this.field2072 = class430.method2587((byte) 77, super.field527, super.field531, super.field530, var3);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "(I)V", line = 200)
    public final void method163(int arg0) {
        ++field2064;
        int var2 = 19 % ((arg0 - 35) / 54);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)Z", line = 210)
    public final boolean method1069(int arg0) {
        ++field2078;
        if (arg0 != 17819) {
            this.method1067((byte) -42);
        }
        return this.field2067.method3035((byte) -104);
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(B)Z", line = 222)
    public final boolean method167(byte arg0) {
        if (arg0 != 118) {
            this.method172((byte) 80);
        }
        ++field2075;
        return false;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)I", line = 234)
    public final int method1070(int arg0) {
        ++field2070;
        if (arg0 != -24359) {
            this.method165((byte) -94);
        }
        return this.field2067.field7483;
    }

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "(I)V", line = 246)
    public final void method1071(int arg0) {
        ++field2056;
        if (arg0 != -31121) {
            this.field2061 = true;
        }
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)I", line = 256)
    public final int method1072(int arg0) {
        if (arg0 != 4378) {
            return 5;
        } else {
            ++field2073;
            return this.field2067.field7502;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(BLr;)V", line = 269)
    public final void method1073(byte arg0, class165 arg1) {
        ++field2066;
        if (arg0 != 73) {
            this.method1071(-113);
        }
        this.field2067.method3041(arg1, (byte) 124);
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(BLr;)Lsr;", line = 280)
    public final class229 method161(byte arg0, class165 arg1) {
        if (arg0 <= 100) {
            field2080 = -1.0206177F;
        }
        ++field2074;
        return this.field2072;
    }

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "(B)Z", line = 291)
    public final boolean method165(byte arg0) {
        ++field2065;
        return arg0 >= -21 ? true : this.field2057;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IB)V", line = 303)
    public static final void method1074(int arg0, byte arg1) {
        class200.field2421 = 3;
        if (arg1 <= 63) {
            field2071 = null;
        }
        ++field2059;
        class167.field2045 = 100;
        class523.field7669 = arg0;
        class409.field5794 = -1;
    }
}
