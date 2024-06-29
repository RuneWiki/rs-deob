import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class136 {

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLod;ZLjava/lang/String;Z)V")
    public static final void method990(boolean arg0, class352 arg1, boolean arg2, String arg3, boolean arg4) {
        field2072++;
        if (arg4) {
            return;
        }
        if (!arg2) {
            class482.method2889(arg3, arg1, (byte) 93, 3);
            return;
        }
        if (class352.field5203.startsWith("win") && class352.field5196 != 3) {
            String var5 = null;
            if (arg1.field5199 != null) {
                var5 = arg1.field5199.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class449 var6 = class482.method2889(arg3, arg1, (byte) 101, 0);
                class341.field5068 = arg3;
                class211.field3451 = arg1;
                class326.field4910 = var6;
                return;
            }
        }
        if (class352.field5203.startsWith("mac")) {
            String var7 = null;
            if (arg1.field5199 != null) {
                var7 = arg1.field5199.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg0) {
                class482.method2889(arg3, arg1, (byte) 97, 1);
                return;
            }
        }
        class482.method2889(arg3, arg1, (byte) 107, 2);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(FIBFLhj;IIFFFI)[B")
    public static final byte[] method991(float arg0, int arg1, byte arg2, float arg3, class403 arg4, int arg5, int arg6, float arg7, float arg8, float arg9, int arg10) {
        field2076++;
        byte[] var11 = new byte[arg5 * arg10 * arg6];
        class110.method844(arg6, 0, arg4, arg1, arg9, arg10, arg7, arg0, arg5, var11, -108, arg8, arg3);
        if (arg2 < 17) {
            field2074 = 23;
        }
        return var11;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method992(int arg0, String arg1) {
        System.exit(1);
        if (arg0 < 10) {
            method990(false, null, false, null, true);
        }
        field2075++;
    }
}
