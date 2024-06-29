import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class660 extends class29 implements class599 {

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "Z")
    private boolean field9392 = false;

    @OriginalMember(owner = "client!qe", name = "nb", descriptor = "Lsw;")
    public class11 field9415;

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "Z")
    private boolean field9405;

    @OriginalMember(owner = "client!qe", name = "jb", descriptor = "Leba;")
    public static class550 field9411 = new class550(67, -2);

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
    public static int field9393;

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
    public static int field9394;

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
    public static int field9395;

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "I")
    public static int field9396;

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "I")
    public static int field9397;

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
    public static int field9398;

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
    public static int field9399;

    @OriginalMember(owner = "client!qe", name = "Y", descriptor = "I")
    public static int field9400;

    @OriginalMember(owner = "client!qe", name = "Z", descriptor = "I")
    public static int field9401;

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "I")
    public static int field9402;

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "I")
    public static int field9403;

    @OriginalMember(owner = "client!qe", name = "cb", descriptor = "I")
    public static int field9404;

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "I")
    public static int field9406;

    @OriginalMember(owner = "client!qe", name = "fb", descriptor = "I")
    public static int field9407;

    @OriginalMember(owner = "client!qe", name = "gb", descriptor = "I")
    public static int field9408;

    @OriginalMember(owner = "client!qe", name = "hb", descriptor = "I")
    public static int field9409;

    @OriginalMember(owner = "client!qe", name = "ib", descriptor = "I")
    public static int field9410;

    @OriginalMember(owner = "client!qe", name = "kb", descriptor = "I")
    public static int field9412;

    @OriginalMember(owner = "client!qe", name = "lb", descriptor = "I")
    public static int field9413;

    @OriginalMember(owner = "client!qe", name = "mb", descriptor = "I")
    public static int field9414;

    @OriginalMember(owner = "client!qe", name = "ob", descriptor = "I")
    public static int field9416;

    @OriginalMember(owner = "client!qe", name = "pb", descriptor = "I")
    public static int field9417;

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "Lcu;")
    private class475 field9391;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qe", name = "qb", descriptor = "Ljava/lang/Class;")
    public static Class field9418;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3775(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lr;Ltc;IIIIIZIIIIIII)V", line = 3)
    public class660(class562 arg0, class600 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field8322 == 1, class654.method3697(arg12, arg13, (byte) -57));
        this.field9415 = new class11(arg0, arg1, arg12, arg13, super.field385, arg3, arg4, arg6, arg7, arg14);
        this.field9405 = arg1.field8293 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "(I)V", line = 12)
    public static final void method3772(int arg0) {
        ++class427.field5758;
        ++field9410;
        if (arg0 != -1) {
            field9416 = -89;
        }
        class229 var1 = class97.method550(class71.field841, false, class182.field2543);
        var1.field2971.method918(24551, class460.field6025);
        class307.method1805(var1, -14704);
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(Z)V", line = 28)
    public static final void method3773(boolean arg0) {
        ++field9402;
        try {
            if (arg0) {
                field9417 = 13;
            }
            Method var1 = (field9418 != null ? field9418 : (field9418 = method3775("java.lang.Runtime"))).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class653.field9306 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILir;ZILr;IB)V", line = 64)
    public final void method169(int arg0, class27 arg1, boolean arg2, int arg3, class562 arg4, int arg5, byte arg6) {
        ++field9408;
        if (arg6 < -117) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)I", line = 76)
    public final int method710(byte arg0) {
        ++field9396;
        if (arg0 <= 55) {
            field9417 = -26;
        }
        return this.field9415.field131;
    }

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "(I)I", line = 88)
    public final int method173(int arg0) {
        if (arg0 != 0) {
            this.method177((class562) null, true);
        }
        ++field9401;
        return this.field9415.method63(-92);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lr;B)V", line = 100)
    public final void method707(class562 arg0, byte arg1) {
        ++field9398;
        this.field9415.method61(arg0, (byte) -93);
        int var3 = 12 % ((-28 - arg1) / 54);
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V", line = 111)
    public final void method175(byte arg0) {
        if (arg0 > 24) {
            ++field9407;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLr;II)Z", line = 123)
    public final boolean method167(boolean arg0, class562 arg1, int arg2, int arg3) {
        ++field9400;
        class470 var5 = this.field9415.method67(false, super.field398, super.field397, arg0, arg1, 0, 131072);
        if (var5 == null) {
            return false;
        } else {
            class487 var6 = arg1.method1153();
            var6.method359(super.field398, super.field388, super.field397);
            return class347.field4632 ? var5.method603(arg3, arg2, var6, false, class414.field5430) : var5.method655(arg3, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLr;)Lqw;", line = 141)
    public final class329 method165(byte arg0, class562 arg1) {
        ++field9394;
        class470 var3 = this.field9415.method67(false, super.field398, super.field397, true, arg1, 0, 2048);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 < 109) {
                this.field9405 = false;
            }
            class487 var4 = arg1.method1153();
            var4.method359(super.field398, super.field388, super.field397);
            class329 var5 = null;
            if (this.field9405) {
                var5 = class541.method3035(27479, 1);
            }
            this.field9415.method62(var4, super.field421, var3, -20068, arg1, true, super.field420, super.field423, super.field419);
            if (class347.field4632) {
                var3.method648(var4, var5 == null ? null : var5.field4414[0], class414.field5430, 0);
            } else {
                var3.method625(var4, var5 == null ? null : var5.field4414[0], 0);
            }
            if (this.field9415.field122 != null) {
                class144 var6 = this.field9415.field122.method2915();
                if (class347.field4632) {
                    arg1.method1120(var6, class414.field5430);
                } else {
                    arg1.method1096(var6);
                }
            }
            this.field9392 = var3.method657() || this.field9415.field122 != null;
            if (this.field9391 != null) {
                class424.method2404(var3, -17171, super.field397, super.field398, this.field9391, super.field388);
            } else {
                this.field9391 = class258.method1562(super.field398, (byte) -47, super.field397, var3, super.field388);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "(I)V", line = 195)
    public static void method3774(int arg0) {
        field9411 = null;
        if (arg0 != 0) {
            field9411 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)Z", line = 205)
    public final boolean method705(int arg0) {
        ++field9404;
        return arg0 <= 67 ? false : this.field9415.method59(0);
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(B)I", line = 222)
    public final int method176(byte arg0) {
        ++field9395;
        return arg0 >= -114 ? 124 : this.field9415.method64(-117);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lr;I)V", line = 234)
    public final void method700(class562 arg0, int arg1) {
        ++field9397;
        this.field9415.method65(-124, arg0);
        if (arg1 != -21186) {
            this.field9391 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)Z", line = 245)
    public final boolean method161(int arg0) {
        if (arg0 != 28602) {
            return false;
        } else {
            ++field9399;
            return false;
        }
    }

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "(I)Z", line = 257)
    public final boolean method166(int arg0) {
        ++field9413;
        return arg0 != 0;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)I", line = 270)
    public final int method706(int arg0) {
        ++field9403;
        return arg0 != 16259 ? -47 : this.field9415.field129;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lr;Z)V", line = 281)
    public final void method177(class562 arg0, boolean arg1) {
        ++field9412;
        class470 var3 = this.field9415.method67(arg1, super.field398, super.field397, true, arg0, 0, 262144);
        if (var3 != null) {
            class487 var4 = arg0.method1153();
            var4.method359(super.field398, super.field388, super.field397);
            this.field9415.method62(var4, super.field421, var3, -20068, arg0, false, super.field420, super.field423, super.field419);
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)I", line = 298)
    public final int method699(byte arg0) {
        ++field9414;
        return arg0 >= -32 ? 66 : this.field9415.field124;
    }

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "(I)Z", line = 309)
    public final boolean method168(int arg0) {
        ++field9409;
        return arg0 != 20071 ? true : this.field9392;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Lr;I)Lcu;", line = 322)
    public final class475 method174(class562 arg0, int arg1) {
        if (arg1 != -14700) {
            return null;
        } else {
            ++field9393;
            return this.field9391;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 335)
    public final void method703(int arg0) {
        if (arg0 != 6956) {
            this.method166(32);
        }
        ++field9406;
    }
}
