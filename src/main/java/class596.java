import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class596 extends class637 {

    @OriginalMember(owner = "client!dda", name = "D", descriptor = "Lnn;")
    public static class214 field8487 = new class214(5, 19);

    @OriginalMember(owner = "client!dda", name = "H", descriptor = "Z")
    public static boolean field8491 = false;

    @OriginalMember(owner = "client!dda", name = "F", descriptor = "Lbv;")
    public static class567 field8489 = new class567("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!dda", name = "A", descriptor = "I")
    public static int field8484;

    @OriginalMember(owner = "client!dda", name = "B", descriptor = "I")
    public static int field8485;

    @OriginalMember(owner = "client!dda", name = "C", descriptor = "I")
    public static int field8486;

    @OriginalMember(owner = "client!dda", name = "E", descriptor = "I")
    public static int field8488;

    @OriginalMember(owner = "client!dda", name = "G", descriptor = "Lgaa;")
    public static class277 field8490;

    @OriginalMember(owner = "client!dda", name = "I", descriptor = "Ljava/lang/Object;")
    public static Object field8492;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIZ)I")
    public static final int method3402(int arg0, int arg1, int arg2, boolean arg3) {
        ++field8488;
        class217 var4 = class132.method1024(arg1, 0, arg3);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = 0;
            if (arg2 != 24625) {
                field8491 = true;
            }
            for (int var6 = 0; ~var4.field3277.length < ~var6; ++var6) {
                if (var4.field3280[var6] == arg0) {
                    var5 += var4.field3277[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method3403(String arg0, int arg1) {
        ++field8486;
        if (arg0 == null) {
            return null;
        } else {
            int var2 = 0;
            int var3 = arg0.length();
            while (~var3 < ~var2 && class417.method2512((byte) 123, arg0.charAt(var2))) {
                ++var2;
            }
            while (~var2 > ~var3 && class417.method2512((byte) 113, arg0.charAt(var3 + -1))) {
                --var3;
            }
            if (arg1 > -66) {
                method3402(54, -24, 9, false);
            }
            int var4 = var3 - var2;
            if (var4 >= 1 && var4 <= 12) {
                StringBuffer var5 = new StringBuffer(var4);
                for (int var6 = var2; ~var6 > ~var3; ++var6) {
                    char var7 = arg0.charAt(var6);
                    if (class187.method1252(114, var7)) {
                        char var8 = class470.method2732((byte) 87, var7);
                        if (~var8 != -1) {
                            var5.append(var8);
                        }
                    }
                }
                if (~var5.length() == -1) {
                    return null;
                } else {
                    return var5.toString();
                }
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IF)V")
    public final void method450(int arg0, float arg1) {
        ++field8485;
        if (arg0 != 5065) {
            method3402(-61, -117, -81, true);
        }
        super.field9252 = arg1;
    }

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "(I)V")
    public static void method3404(int arg0) {
        if (arg0 <= 3) {
            method3402(127, 118, 10, false);
        }
        field8492 = null;
        field8487 = null;
        field8489 = null;
        field8490 = null;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIB)V")
    public final void method448(int arg0, int arg1, int arg2, byte arg3) {
        super.field9251 = arg2;
        super.field9253 = arg1;
        if (arg3 != 24) {
            field8490 = null;
        }
        super.field9249 = arg0;
        ++field8484;
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(IIIIIF)V")
    public class596(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
