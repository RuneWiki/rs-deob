import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class143 extends class494 implements class258 {

    @OriginalMember(owner = "client!fea", name = "ib", descriptor = "Z")
    private boolean field2372 = false;

    @OriginalMember(owner = "client!fea", name = "Y", descriptor = "Lbv;")
    public class309 field2362;

    @OriginalMember(owner = "client!fea", name = "jb", descriptor = "Z")
    private boolean field2373;

    @OriginalMember(owner = "client!fea", name = "Z", descriptor = "Z")
    public static boolean field2363 = false;

    @OriginalMember(owner = "client!fea", name = "I", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!fea", name = "S", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!fea", name = "T", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!fea", name = "U", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!fea", name = "V", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!fea", name = "W", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!fea", name = "X", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!fea", name = "ab", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!fea", name = "bb", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!fea", name = "cb", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!fea", name = "db", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!fea", name = "fb", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!fea", name = "gb", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!fea", name = "hb", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!fea", name = "kb", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!fea", name = "lb", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!fea", name = "mb", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!fea", name = "nb", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!fea", name = "ob", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!fea", name = "eb", descriptor = "Lhw;")
    private class132 field2368;

    @OriginalMember(owner = "client!fea", name = "g", descriptor = "(I)Z")
    public final boolean method45(int arg0) {
        ++field2358;
        return arg0 > -12 ? false : false;
    }

    @OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Lha;Liv;IIIIIZIIIIIII)V")
    public class143(class59 arg0, class99 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field1730 == 1, class45.method546(arg13, -27939, arg12));
        this.field2362 = new class309(arg0, arg1, arg12, arg13, super.field5926, arg3, this, arg7, arg14);
        this.field2373 = ~arg1.field1709 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!fea", name = "i", descriptor = "(I)I")
    public final int method37(int arg0) {
        if (arg0 != -25675) {
            return -125;
        } else {
            ++field2378;
            return this.field2362.method2008(arg0 ^ 25698);
        }
    }

    @OriginalMember(owner = "client!fea", name = "j", descriptor = "(I)Z")
    public final boolean method35(int arg0) {
        ++field2367;
        return arg0 > -65 ? false : false;
    }

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "(I)V")
    public final void method582(int arg0) {
        ++field2365;
        if (arg0 != -12031) {
            this.field2362 = null;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method42(class59 arg0, int arg1, int arg2, int arg3) {
        ++field2357;
        class472 var5 = this.field2362.method2012(false, false, arg3 + -127, 131072, arg0);
        if (var5 == null) {
            return false;
        } else if (arg3 != 0) {
            return false;
        } else {
            class661 var6 = arg0.method322();
            var6.method744(super.field5922, super.field5927, super.field5933);
            return !class458.field6459 ? var5.method503(arg2, arg1, var6, false, 0) : var5.method492(arg2, arg1, var6, false, 0, class58.field1146);
        }
    }

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "(I)I")
    public final int method588(int arg0) {
        if (arg0 != -32228) {
            this.field2368 = null;
        }
        ++field2361;
        return this.field2362.field4279;
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(Lha;I)Lhw;")
    public final class132 method40(class59 arg0, int arg1) {
        ++field2370;
        return arg1 != 7 ? null : this.field2368;
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(B)Z")
    public final boolean method49(byte arg0) {
        ++field2369;
        if (arg0 != 122) {
            this.method588(-49);
        }
        return this.field2372;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lha;I)V")
    public final void method591(class59 arg0, int arg1) {
        ++field2366;
        if (arg1 != -14218) {
            this.field2368 = null;
        }
        this.field2362.method2018(-1, arg0);
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(ILha;)Ljda;")
    public final class228 method41(int arg0, class59 arg1) {
        ++field2374;
        class472 var3 = this.field2362.method2012(false, true, -127, 2048, arg1);
        if (var3 == null) {
            return null;
        } else {
            class661 var4 = arg1.method322();
            var4.method744(super.field5922, super.field5927, super.field5933);
            class228 var5 = class345.method2171(arg0, this.field2373, false);
            this.field2362.method2014(super.field6839, var4, super.field6835, arg1, super.field6831, var3, true, (byte) -73, super.field6838);
            if (!class458.field6459) {
                var3.method521(var4, var5.field3313[0], 0);
            } else {
                var3.method497(var4, var5.field3313[0], class58.field1146, 0);
            }
            if (this.field2362.field4308 != null) {
                class266 var6 = this.field2362.field4308.method2419();
                if (class458.field6459) {
                    arg1.method295(var6, class58.field1146);
                } else {
                    arg1.method208(var6);
                }
            }
            this.field2372 = var3.method488() || this.field2362.field4308 != null;
            if (this.field2368 != null) {
                class20.method157(super.field5933, super.field5927, this.field2368, var3, false, super.field5922);
            } else {
                this.field2368 = class689.method3846(super.field5922, var3, super.field5933, super.field5927, 2);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(I)I")
    public final int method594(int arg0) {
        ++field2375;
        int var2 = -40 / ((arg0 - -91) / 35);
        return this.field2362.field4306;
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(Z)V")
    public final void method44(boolean arg0) {
        if (arg0) {
            ++field2377;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "(I)I")
    public final int method589(int arg0) {
        ++field2359;
        if (arg0 >= -62) {
            this.method49((byte) 97);
        }
        return this.field2362.field4290;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILha;)V")
    public final void method583(int arg0, class59 arg1) {
        if (arg0 != 836) {
            this.method583(-65, (class59) null);
        }
        ++field2376;
        this.field2362.method2011((byte) 116, arg1);
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lha;IZLga;IBI)V")
    public final void method33(class59 arg0, int arg1, boolean arg2, class404 arg3, int arg4, byte arg5, int arg6) {
        ++field2371;
        if (arg5 >= -106) {
            this.method583(97, (class59) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)Z")
    public final boolean method584(int arg0) {
        if (arg0 != -18443) {
            return true;
        } else {
            ++field2360;
            return this.field2362.method2009(2);
        }
    }

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "(Lha;I)V")
    public final void method31(class59 arg0, int arg1) {
        ++field2356;
        class472 var3 = this.field2362.method2012(true, true, -127, 262144, arg0);
        if (var3 != null) {
            class661 var4 = arg0.method322();
            var4.method744(super.field5922, super.field5927, super.field5933);
            this.field2362.method2014(super.field6839, var4, super.field6835, arg0, super.field6831, var3, false, (byte) -73, super.field6838);
        }
        if (arg1 >= -125) {
            this.method33((class59) null, -30, false, (class404) null, 74, (byte) -52, 38);
        }
    }

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "(Z)I")
    public final int method38(boolean arg0) {
        if (!arg0) {
            return 68;
        } else {
            ++field2355;
            return this.field2362.method2007(80);
        }
    }
}
