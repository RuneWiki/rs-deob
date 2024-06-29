import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class127 extends class100 implements class258 {

    @OriginalMember(owner = "client!ju", name = "I", descriptor = "Z")
    private boolean field2137 = false;

    @OriginalMember(owner = "client!ju", name = "cb", descriptor = "Lbv;")
    public class309 field2157;

    @OriginalMember(owner = "client!ju", name = "bb", descriptor = "Z")
    private boolean field2156;

    @OriginalMember(owner = "client!ju", name = "J", descriptor = "I")
    public static int field2138 = 0;

    @OriginalMember(owner = "client!ju", name = "K", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!ju", name = "L", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!ju", name = "M", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!ju", name = "N", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!ju", name = "O", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!ju", name = "P", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!ju", name = "Q", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!ju", name = "R", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!ju", name = "S", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!ju", name = "T", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!ju", name = "U", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!ju", name = "V", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!ju", name = "W", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!ju", name = "X", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!ju", name = "Y", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!ju", name = "Z", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!ju", name = "ab", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!ju", name = "eb", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!ju", name = "db", descriptor = "Lhw;")
    private class132 field2158;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)I", line = 4)
    public final int method594(int arg0) {
        ++field2147;
        int var2 = -66 / ((-91 - arg0) / 35);
        return this.field2157.field4306;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILha;)V", line = 14)
    public final void method583(int arg0, class59 arg1) {
        this.field2157.method2011((byte) 116, arg1);
        if (arg0 != 836) {
            this.method37(42);
        }
        ++field2141;
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(Lha;I)V", line = 27)
    public final void method31(class59 arg0, int arg1) {
        ++field2155;
        if (arg1 >= -125) {
            this.method41(111, (class59) null);
        }
        class472 var3 = this.field2157.method2012(true, true, -128, 262144, arg0);
        if (var3 != null) {
            int var4 = super.field5922 >> 9;
            int var5 = super.field5933 >> 9;
            class661 var6 = arg0.method322();
            var6.method744(super.field5922, super.field5927, super.field5933);
            this.field2157.method2014(var4, var6, var5, arg0, var4, var3, false, (byte) -73, var5);
        }
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(Z)I", line = 54)
    public final int method38(boolean arg0) {
        if (!arg0) {
            this.method40((class59) null, -82);
        }
        ++field2149;
        return this.field2157.method2007(109);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lha;III)Z", line = 67)
    public final boolean method42(class59 arg0, int arg1, int arg2, int arg3) {
        ++field2143;
        class472 var5 = this.field2157.method2012(false, false, -127, 131072, arg0);
        if (var5 == null) {
            return false;
        } else {
            class661 var6 = arg0.method322();
            var6.method744(super.field5922, super.field5927, super.field5933);
            if (arg3 != 0) {
                return true;
            } else {
                return class458.field6459 ? var5.method492(arg2, arg1, var6, false, 0, class58.field1146) : var5.method503(arg2, arg1, var6, false, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "(I)Z", line = 86)
    public final boolean method45(int arg0) {
        if (arg0 > -12) {
            this.method38(true);
        }
        ++field2150;
        return false;
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lha;Liv;IIIIIZIII)V", line = 97)
    public class127(class59 arg0, class99 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class471.method2775(arg8, arg9, false));
        this.field2157 = new class309(arg0, arg1, arg8, arg9, super.field5926, arg3, this, arg7, arg10);
        this.field2156 = arg1.field1709 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "(I)I", line = 108)
    public final int method37(int arg0) {
        ++field2139;
        if (arg0 != -25675) {
            this.field2156 = false;
        }
        return this.field2157.method2008(-71);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)Z", line = 119)
    public final boolean method584(int arg0) {
        ++field2159;
        if (arg0 != -18443) {
            this.field2137 = true;
        }
        return this.field2157.method2009(2);
    }

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "(I)I", line = 135)
    public final int method589(int arg0) {
        if (arg0 > -62) {
            this.field2158 = null;
        }
        ++field2140;
        return this.field2157.field4290;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lha;I)V", line = 146)
    public final void method591(class59 arg0, int arg1) {
        ++field2152;
        this.field2157.method2018(-1, arg0);
        if (arg1 != -14218) {
            this.field2156 = true;
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(ILha;)Ljda;", line = 157)
    public final class228 method41(int arg0, class59 arg1) {
        ++field2153;
        class472 var3 = this.field2157.method2012(false, true, arg0 ^ -128, 2048, arg1);
        if (var3 == null) {
            return null;
        } else {
            class661 var4 = arg1.method322();
            var4.method744(super.field5922, super.field5927, super.field5933);
            class228 var5 = class345.method2171(arg0, this.field2156, false);
            int var6 = super.field5922 >> 9;
            int var7 = super.field5933 >> 9;
            this.field2157.method2014(var6, var4, var7, arg1, var6, var3, true, (byte) -73, var7);
            if (!class458.field6459) {
                var3.method521(var4, var5.field3313[0], 0);
            } else {
                var3.method497(var4, var5.field3313[0], class58.field1146, 0);
            }
            if (this.field2157.field4308 != null) {
                class266 var8 = this.field2157.field4308.method2419();
                if (class458.field6459) {
                    arg1.method295(var8, class58.field1146);
                } else {
                    arg1.method208(var8);
                }
            }
            this.field2137 = var3.method488() || this.field2157.field4308 != null;
            if (this.field2158 != null) {
                class20.method157(super.field5933, super.field5927, this.field2158, var3, false, super.field5922);
            } else {
                this.field2158 = class689.method3846(super.field5922, var3, super.field5933, super.field5927, 2);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(Lha;I)Lhw;", line = 206)
    public final class132 method40(class59 arg0, int arg1) {
        ++field2151;
        return arg1 != 7 ? null : this.field2158;
    }

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "(I)I", line = 217)
    public final int method588(int arg0) {
        ++field2142;
        if (arg0 != -32228) {
            this.field2157 = null;
        }
        return this.field2157.field4279;
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)V", line = 235)
    public final void method582(int arg0) {
        if (arg0 != -12031) {
            this.field2156 = false;
        }
        ++field2144;
    }

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "(I)Z", line = 245)
    public final boolean method35(int arg0) {
        if (arg0 >= -65) {
            return true;
        } else {
            ++field2148;
            return false;
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(Z)V", line = 259)
    public final void method44(boolean arg0) {
        ++field2145;
        if (!arg0) {
            this.field2156 = false;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)Z", line = 271)
    public final boolean method49(byte arg0) {
        if (arg0 != 122) {
            return false;
        } else {
            ++field2146;
            return this.field2137;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lha;IZLga;IBI)V", line = 286)
    public final void method33(class59 arg0, int arg1, boolean arg2, class404 arg3, int arg4, byte arg5, int arg6) {
        ++field2154;
        if (arg5 < -106) {
            throw new IllegalStateException();
        }
    }
}
