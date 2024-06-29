import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class557 implements class702 {

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "Ljava/lang/String;")
    public String field7913;

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "I")
    public int field7914;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public int field7902;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
    public int field7909;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    public int field7905;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public int field7901;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "Laba;")
    public class185 field7904;

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
    public int field7915;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    public int field7907;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
    public int field7906;

    @OriginalMember(owner = "client!tp", name = "q", descriptor = "I")
    public int field7917;

    @OriginalMember(owner = "client!tp", name = "s", descriptor = "I")
    public int field7919;

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "Lfda;")
    public class336 field7910;

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "[I")
    public static int[] field7911 = new int[256];

    @OriginalMember(owner = "client!tp", name = "p", descriptor = "Ljo;")
    public static class351 field7916;

    @OriginalMember(owner = "client!tp", name = "t", descriptor = "Ljava/lang/String;")
    public static String field7920;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field7903;

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
    public static int field7908;

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "I")
    public static int field7912;

    @OriginalMember(owner = "client!tp", name = "r", descriptor = "[I")
    public static int[] field7918;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field7911[var0] = var1;
        }
        field7916 = new class351(46, 8);
        field7920 = null;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)V", line = 7)
    public static void method3231(byte arg0) {
        if (arg0 >= -116) {
            field7916 = null;
        }
        field7916 = null;
        field7920 = null;
        field7911 = null;
        field7918 = null;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Ljava/lang/String;II)Lqk;", line = 25)
    public static final class18 method3232(String arg0, int arg1, int arg2) {
        field7908++;
        class18 var3;
        try {
            var3 = (class18) Class.forName("bd").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class319();
        }
        if (arg2 == 30482) {
            var3.field294 = arg0;
            var3.field299 = arg1;
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILev;III)Z", line = 49)
    public static final boolean method3233(int arg0, class719 arg1, int arg2, int arg3, int arg4) {
        field7903++;
        if (!class74.field991 || !class790.field10837) {
            return false;
        } else if (class683.field9698 < 100) {
            return false;
        } else if (class136.method966(0, arg4, arg2, arg3)) {
            int var5 = arg3 << class310.field4616;
            int var6 = arg2 << class310.field4616;
            int var7 = class622.field8777[arg4].method1976(arg3, -1, arg2) - 1;
            int var8 = var7 + arg1.method246(-107);
            if (arg1.field10107 == 1) {
                if (!class693.method3898(var7, var5, var8, var6, class13.field254 + var6, var8, var5, 0, var5, var6)) {
                    return false;
                } else if (class693.method3898(var7, var5, var8, var6 + class13.field254, class13.field254 + var6, var7, var5, arg0 ^ 0x80, var5, var6)) {
                    class550.field7818++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field10107 == 2) {
                if (!class693.method3898(var7, var5, var8, class13.field254 + var6, var6 - -class13.field254, var8, var5 + class13.field254, arg0 ^ 0x80, var5, var6 + class13.field254)) {
                    return false;
                } else if (class693.method3898(var7, var5, var7, class13.field254 + var6, var6 - -class13.field254, var8, class13.field254 + var5, 0, class13.field254 + var5, class13.field254 + var6)) {
                    class550.field7818++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field10107 == 4) {
                if (!class693.method3898(var7, var5 + class13.field254, var8, var6, class13.field254 + var6, var8, var5 + class13.field254, 0, class13.field254 + var5, var6)) {
                    return false;
                } else if (class693.method3898(var7, var5 + class13.field254, var8, class13.field254 + var6, var6 - -class13.field254, var7, class13.field254 + var5, 0, var5 + class13.field254, var6)) {
                    class550.field7818++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field10107 == 8) {
                if (!class693.method3898(var7, var5, var8, var6, var6, var8, class13.field254 + var5, 0, var5, var6)) {
                    return false;
                } else if (class693.method3898(var7, var5, var7, var6, var6, var8, var5 + class13.field254, 0, class13.field254 + var5, var6)) {
                    class550.field7818++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field10107 == 16) {
                if (class357.method2250(class503.field7200, var7, class503.field7200 + var6, var8, var5, class503.field7200, (byte) -56)) {
                    class550.field7818++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field10107 == 32) {
                if (class357.method2250(class503.field7200, var7, class503.field7200 + var6, var8, class503.field7200 + var5, class503.field7200, (byte) -56)) {
                    class550.field7818++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field10107 == 64) {
                if (class357.method2250(class503.field7200, var7, var6, var8, class503.field7200 + var5, class503.field7200, (byte) -56)) {
                    class550.field7818++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field10107 != arg0) {
                return true;
            } else if (class357.method2250(class503.field7200, var7, var6, var8, var5, class503.field7200, (byte) -56)) {
                class550.field7818++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)Lve;", line = 174)
    public final class527 method606(int arg0) {
        field7912++;
        return arg0 == 0 ? class272.field3798 : null;
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Ljava/lang/String;Lfda;Laba;IIIIIIIIII)V", line = 222)
    public class557(String arg0, class336 arg1, class185 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field7913 = arg0;
        this.field7914 = arg11;
        this.field7902 = arg12;
        this.field7909 = arg7;
        this.field7905 = arg4;
        this.field7901 = arg9;
        this.field7904 = arg2;
        this.field7915 = arg6;
        this.field7907 = arg10;
        this.field7906 = arg8;
        this.field7917 = arg5;
        this.field7919 = arg3;
        this.field7910 = arg1;
    }
}
