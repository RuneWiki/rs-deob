import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class62 {

    @OriginalMember(owner = "client!ifa", name = "i", descriptor = "I")
    private int field988;

    @OriginalMember(owner = "client!ifa", name = "o", descriptor = "I")
    private int field994;

    @OriginalMember(owner = "client!ifa", name = "p", descriptor = "I")
    private int field995;

    @OriginalMember(owner = "client!ifa", name = "m", descriptor = "I")
    private int field992;

    @OriginalMember(owner = "client!ifa", name = "r", descriptor = "I")
    private int field997;

    @OriginalMember(owner = "client!ifa", name = "g", descriptor = "I")
    private int field986;

    @OriginalMember(owner = "client!ifa", name = "f", descriptor = "I")
    private int field985;

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "I")
    private int field983;

    @OriginalMember(owner = "client!ifa", name = "h", descriptor = "I")
    private int field987;

    @OriginalMember(owner = "client!ifa", name = "n", descriptor = "I")
    private int field993;

    @OriginalMember(owner = "client!ifa", name = "q", descriptor = "I")
    public static int field996 = -1;

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!ifa", name = "j", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!ifa", name = "k", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!ifa", name = "l", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!ifa", name = "s", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "[Lf;")
    public static class256[] field980;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BIII)Z", line = 12)
    public final boolean method383(byte arg0, int arg1, int arg2, int arg3) {
        field981++;
        if (arg3 < this.field997 || arg3 > this.field986) {
            return false;
        }
        if (arg0 != 54) {
            this.field986 = 91;
        }
        if (this.field993 > arg1 || arg1 > this.field983) {
            return false;
        } else if (arg2 >= this.field987 && this.field985 >= arg2) {
            int var5 = arg3 - this.field994;
            int var6 = arg2 - this.field992;
            return (var5 * var5 + (var6 * var6)) < this.field988;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Z)[Lvea;", line = 41)
    public static final class305[] method384(boolean arg0) {
        field991++;
        if (!arg0) {
            field984 = 0;
        }
        return new class305[] { class410.field6109, class258.field3348, class529.field7808 };
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZILmv;)Lfo;", line = 52)
    public static final class606 method385(int arg0, boolean arg1, int arg2, class295 arg3) {
        field998++;
        if (arg1) {
            return null;
        } else {
            byte[] var4 = arg3.method1844(arg2, 31330, arg0);
            return var4 == null ? null : new class606(var4);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)V", line = 73)
    public static void method386(int arg0) {
        field980 = null;
        if (arg0 != 100) {
            field996 = -71;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIIIIIIII)V", line = 83)
    public final void method387(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field982++;
        this.field995 = arg3;
        this.field992 = arg10;
        this.field994 = arg2;
        this.field988 = arg4 * arg4;
        this.field983 = this.field995 + arg5;
        if (arg8 != 12230) {
            return;
        }
        this.field985 = this.field992 + arg9;
        this.field986 = this.field994 + arg0;
        this.field993 = this.field995 + arg6;
        this.field987 = this.field992 + arg1;
        this.field997 = this.field994 + arg7;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 104)
    public static final int method388(boolean arg0, String arg1) {
        field990++;
        if (!class470.field6765.field3004) {
            return -1;
        } else if (class285.field3798.containsKey(arg1)) {
            return 100;
        } else {
            String var2 = class65.method394(arg1, 256);
            if (var2 == null) {
                return -1;
            }
            String var3 = class682.field9622 + var2;
            if (!class257.field3343.method1831(0, "", var3)) {
                return -1;
            } else if (class257.field3343.method1823(var3, arg0)) {
                byte[] var4 = class257.field3343.method1817(-118, var3, "");
                Object var5 = null;
                File var6;
                try {
                    if (!arg0) {
                        method386(59);
                    }
                    var6 = class536.method3093((byte) 79, var2);
                } catch (RuntimeException var11) {
                    return -1;
                }
                if (var4 == null || var6 == null) {
                    return -1;
                }
                boolean var7 = true;
                byte[] var8 = class420.method2542((byte) -23, var6);
                if (var8 != null && var4.length == var8.length) {
                    for (int var9 = 0; var9 < var8.length; var9++) {
                        if (var4[var9] != var8[var9]) {
                            var7 = false;
                            break;
                        }
                    }
                } else {
                    var7 = false;
                }
                try {
                    if (!var7) {
                        class470.field6765.method1407(var6, 0, var4);
                    }
                } catch (Throwable var10) {
                    return -1;
                }
                class657.method3708(arg1, var6, arg0);
                return 100;
            } else {
                return class257.field3343.method1814(0, var3);
            }
        }
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 201)
    public class62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field988 = arg3 * arg3;
        this.field994 = arg0;
        this.field995 = arg1;
        this.field992 = arg2;
        this.field997 = this.field994 + arg4;
        this.field986 = this.field994 + arg5;
        this.field985 = this.field992 + arg9;
        this.field983 = this.field995 + arg7;
        this.field987 = this.field992 + arg8;
        this.field993 = this.field995 + arg6;
    }
}
