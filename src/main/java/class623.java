import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class623 extends class444 implements class411 {

    @OriginalMember(owner = "client!fv", name = "n", descriptor = "I")
    private int field8879;

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field8878 = new String[100];

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
    public static int field8868;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
    public static int field8869;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
    public static int field8871;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public static int field8872;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "I")
    public static int field8873;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    public static int field8875;

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "I")
    public static int field8877;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "Lr;")
    public static class98 field8870;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "[I")
    public static int[] field8876;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "[Lf;")
    public static class257[] field8874;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "([BIII)V", line = 3)
    public final void method2453(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field8871;
        this.method2590(arg0, arg3);
        if (arg2 != 12500) {
            this.method2455(-39);
        }
        this.field8879 = arg1;
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lkfa;I[BI)V", line = 17)
    public class623(class382 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field8879 = arg1;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)J", line = 26)
    public final long method2456(byte arg0) {
        if (arg0 < 89) {
            return 85L;
        } else {
            ++field8869;
            return super.field6425.getAddress();
        }
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)V", line = 37)
    public static void method3514(int arg0) {
        field8876 = null;
        field8874 = null;
        field8870 = null;
        if (arg0 != -14228) {
            field8870 = null;
        }
        field8878 = null;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILnr;)V", line = 51)
    public static final void method3515(int arg0, class19 arg1) {
        arg1.field272 = false;
        ++field8872;
        if (arg1.field273 != null) {
            arg1.field273.field2575 = 0;
        }
        for (class19 var2 = arg1.method202(); var2 != null; var2 = arg1.method207()) {
            method3515(0, var2);
        }
        if (arg0 != 0) {
            field8876 = null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lkfa;ILjaclib/memory/Buffer;)V", line = 75)
    public class623(class382 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field8879 = arg1;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)I", line = 84)
    public final int method2455(int arg0) {
        if (arg0 >= -70) {
            field8878 = null;
        }
        ++field8868;
        return this.field8879;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)I", line = 98)
    public final int method2454(int arg0) {
        ++field8875;
        int var2 = 7 % ((-36 - arg0) / 55);
        return 0;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIIII)Z", line = 109)
    public static final boolean method3516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8873;
        if (arg1 <= 27) {
            method3515(33, (class19) null);
        }
        int var7 = arg6 - -arg2;
        int var8 = arg0 + arg4;
        int var9 = arg3 + arg5;
        if (!class45.method363(var8, 1, var8, var9, var7, var9, arg3, arg6, var8, arg6)) {
            return false;
        } else if (!class45.method363(var8, 1, var8, arg3, var7, var9, arg3, var7, var8, arg6)) {
            return false;
        } else {
            if (~arg6 > ~class311.field4314) {
                if (!class45.method363(var8, 1, arg4, arg3, arg6, var9, var9, arg6, var8, arg6)) {
                    return false;
                }
                if (!class45.method363(arg4, 1, arg4, arg3, arg6, arg3, var9, arg6, var8, arg6)) {
                    return false;
                }
            } else {
                if (!class45.method363(var8, 1, arg4, arg3, var7, var9, var9, var7, var8, var7)) {
                    return false;
                }
                if (!class45.method363(arg4, 1, arg4, arg3, var7, arg3, var9, var7, var8, var7)) {
                    return false;
                }
            }
            if (~class475.field6813 < ~arg3) {
                if (!class45.method363(var8, 1, arg4, arg3, var7, arg3, arg3, arg6, var8, arg6)) {
                    return false;
                }
                if (!class45.method363(arg4, 1, arg4, arg3, var7, arg3, arg3, var7, var8, arg6)) {
                    return false;
                }
            } else {
                if (!class45.method363(var8, 1, arg4, var9, var7, var9, var9, arg6, var8, arg6)) {
                    return false;
                }
                if (!class45.method363(arg4, 1, arg4, var9, var7, var9, var9, var7, var8, arg6)) {
                    return false;
                }
            }
            return true;
        }
    }
}
