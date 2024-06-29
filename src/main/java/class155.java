import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class155 extends class67 {

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
    public int field3003;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public int field2994;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public static int field2995 = 0;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "Li;")
    public static class88 field2997 = class208.method1425(105, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "Li;")
    private static class88 field3002 = class208.method1425(105, "This world is running a closed Beta)3");

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "Li;")
    private static class88 field3000 = class208.method1425(105, " is already on your ignore list)3");

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "Li;")
    public static class88 field3004 = field3002;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public static int field2993 = 0;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "Li;")
    public static class88 field3001 = field3000;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
    public static int field2999 = 0;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "Lbj;")
    public static class22 field2996;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBZII[Lq;)V")
    public static final void method1057(int arg0, byte arg1, boolean arg2, int arg3, int arg4, class174[] arg5) {
        if (arg1 > -64) {
            return;
        }
        field2998++;
        for (int var6 = 0; var6 < arg5.length; var6++) {
            class174 var7 = arg5[var6];
            if (var7 != null && var7.field3506 == arg3) {
                class57.method416(arg2, arg4, arg0, var7, -121);
                class200.method1376(var7, arg0, (byte) -127, arg4);
                if (var7.field3417 > var7.field3377 - var7.field3424) {
                    var7.field3417 = var7.field3377 - var7.field3424;
                }
                if (var7.field3386 - var7.field3382 < var7.field3395) {
                    var7.field3395 = var7.field3386 - var7.field3382;
                }
                if (var7.field3395 < 0) {
                    var7.field3395 = 0;
                }
                if (var7.field3417 < 0) {
                    var7.field3417 = 0;
                }
                if (var7.field3392 == 0) {
                    class110.method761(arg2, var7, (byte) 29);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
    public static void method1058(byte arg0) {
        field2996 = null;
        field3000 = null;
        field2997 = null;
        if (arg0 != -80) {
            method1057(-59, (byte) -103, true, 121, -101, null);
        }
        field3004 = null;
        field3001 = null;
        field3002 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)I")
    public static final int method1059(byte arg0, int arg1) {
        if (arg0 != -86) {
            method1057(-54, (byte) 17, true, -39, 31, null);
        }
        field3005++;
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(II)V")
    public class155(int arg0, int arg1) {
        this.field3003 = arg1;
        this.field2994 = arg0;
    }
}
