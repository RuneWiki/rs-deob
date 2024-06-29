import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class158 {

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lv;")
    public static class146 field3633 = class159.method1226((byte) -37, "");

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Lv;")
    public static class146 field3629 = field3633;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Lua;")
    public static class140 field3630 = new class140(30);

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Lv;")
    private static class146 field3637 = class159.method1226((byte) -37, "Please try again)3");

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Lv;")
    private static class146 field3639 = class159.method1226((byte) -37, "Prepared visibility map");

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Lv;")
    public static class146 field3638 = field3637;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Lv;")
    public static class146 field3636 = field3639;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "[I")
    public static int[] field3640 = new int[5];

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Ldc;")
    public static class25 field3635;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
    public static void method1221(boolean arg0) {
        if (!arg0) {
            field3640 = null;
        }
        field3633 = null;
        field3635 = null;
        field3637 = null;
        field3639 = null;
        field3629 = null;
        field3630 = null;
        field3638 = null;
        field3640 = null;
        field3636 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ldc;IILqb;)V")
    public static final void method1222(class25 arg0, int arg1, int arg2, class113 arg3) {
        field3631++;
        byte[] var4 = null;
        class152 var5 = class9.field166;
        synchronized (class9.field166) {
            for (class18 var6 = (class18) class9.field166.method1138(25852); var6 != null; var6 = (class18) class9.field166.method1142(1)) {
                if ((long) arg1 == var6.field679 && var6.field298 == arg3 && var6.field293 == 0) {
                    var4 = var6.field285;
                    break;
                }
            }
        }
        if (var4 != null) {
            arg0.method153(arg2 - 17457, true, arg1, var4, arg3);
            return;
        }
        if (arg2 != 17577) {
            method1223(61, -71, 75);
        }
        byte[] var7 = arg3.method881(arg2 - 17504, arg1);
        arg0.method153(52, true, arg1, var7, arg3);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)I")
    public static final int method1223(int arg0, int arg1, int arg2) {
        if (arg0 != -127) {
            field3638 = null;
        }
        field3632++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 / 128;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B[BZ)Ljava/lang/Object;")
    public static final Object method1224(byte arg0, byte[] arg1, boolean arg2) {
        field3634++;
        if (arg0 != -12) {
            field3640 = null;
        }
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class142.field3238) {
            try {
                class63 var3 = (class63) Class.forName("p").getDeclaredConstructor().newInstance();
                var3.method458(arg1, 0);
                return var3;
            } catch (Throwable var4) {
                class142.field3238 = true;
            }
        }
        return arg2 ? class25.method162(arg1, 0) : arg1;
    }
}
