import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class290 {

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "Z")
    public static boolean field4244 = true;

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "Ljw;")
    public static class581 field4246 = new class581(44, -1);

    @OriginalMember(owner = "client!vea", name = "f", descriptor = "Lmga;")
    public static class739 field4249 = new class739(64, 11);

    @OriginalMember(owner = "client!vea", name = "g", descriptor = "Ljw;")
    public static class581 field4250 = new class581(127, 6);

    @OriginalMember(owner = "client!vea", name = "h", descriptor = "Lgb;")
    public static class227 field4251 = null;

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!vea", name = "e", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(ZI)Z", line = 3)
    public static final boolean method1838(boolean arg0, int arg1) {
        if (arg0) {
            field4248++;
            return arg1 == 0 || arg1 == 1 || arg1 == 2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(IIIII[[[BIIILha;III)V", line = 15)
    public static final void method1839(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int arg6, int arg7, int arg8, class65 arg9, int arg10, int arg11, int arg12) {
        field4247++;
        if (arg4 == 0 || arg0 == 0) {
            return;
        }
        if (~arg4 == arg8) {
            arg6 = arg6 + 1 & 0x3;
            arg4 = 1;
        }
        if (arg4 == 10) {
            arg6 = arg6 + 3 & 0x3;
            arg4 = 1;
        }
        if (arg4 == 11) {
            arg6 = arg6 + 3 & 0x3;
            arg4 = 8;
        }
        arg9.method489(arg12, arg1, arg11, arg7, arg2, arg3, arg5[arg4 - 1][arg6], arg0, arg10);
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Z)V", line = 48)
    public static final void method1840(boolean arg0) {
        if (arg0) {
            method1840(true);
        }
        for (class150 var1 = (class150) class507.field7007.method3960(0); var1 != null; var1 = (class150) class507.field7007.method3955((byte) -98)) {
            if (var1.field2082.method2720(true)) {
                class379.method2423(121, var1.field2086);
            } else {
                var1.field2082.method3528((byte) -118);
                try {
                    var1.field2082.method2718(-2);
                } catch (Exception var5) {
                    class664.method3681((byte) -65, "TV: " + var1.field2086, var5);
                    class379.method2423(118, var1.field2086);
                }
                if (!var1.field2087 && !var1.field2088) {
                    class665 var3 = var1.field2082.method2726(-2);
                    if (var3 != null) {
                        class501 var4 = var3.method3683((byte) 72);
                        if (var4 != null) {
                            var4.method2892(var1.field2091, (byte) -114);
                            class686.field9647.method598(var4);
                            var1.field2087 = true;
                        }
                    }
                }
            }
        }
        field4245++;
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(Z)V", line = 116)
    public static void method1841(boolean arg0) {
        field4249 = null;
        field4250 = null;
        field4246 = null;
        if (!arg0) {
            field4251 = null;
        }
    }
}
