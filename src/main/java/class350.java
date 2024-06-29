import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class350 extends class224 {

    @OriginalMember(owner = "client!es", name = "s", descriptor = "Z")
    public static boolean field5589 = false;

    @OriginalMember(owner = "client!es", name = "w", descriptor = "Lhga;")
    public static class158 field5593 = new class158(93, 12);

    @OriginalMember(owner = "client!es", name = "p", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!es", name = "r", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!es", name = "t", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!es", name = "v", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!es", name = "q", descriptor = "[I")
    public static int[] field5587;

    @OriginalMember(owner = "client!es", name = "u", descriptor = "[Lf;")
    public static class702[] field5591;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(I)Z", line = 5)
    public static final boolean method2355(int arg0) {
        ++field5592;
        class66 var1 = class307.field4831.field8428.field853;
        if (var1 != null && class307.field4831.field8428 != var1) {
            class295 var2 = (class295) var1;
            if (var2.field4631 >= 2000) {
                var2.field4631 -= 2000;
            }
            if (~var2.field4631 == -1007) {
                return true;
            } else {
                if (arg0 != 2544) {
                    field5587 = null;
                }
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IZIZ)V", line = 31)
    public final void method583(int arg0, boolean arg1, int arg2, boolean arg3) {
        ++field5590;
        class627.field8857.method344(arg0 + -2, arg2, super.field3611.field7317 - -4, super.field3611.field7316 + 2, ((class217) super.field3611).field3562, 0);
        class627.field8857.method344(arg0 + -1, arg2 + 1, super.field3611.field7317 + 2, super.field3611.field7316, 0, 0);
        if (!arg1) {
            method2357(-1);
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lri;Lri;Llf;)V", line = 48)
    public class350(class97 arg0, class97 arg1, class217 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ILjava/lang/String;)V", line = 52)
    public static final void method2356(int arg0, String arg1) {
        ++field5588;
        class98.field1592 = arg1;
        if (class450.field6772 != null) {
            try {
                String var2 = class450.field6772.getParameter("cookieprefix");
                String var3 = class450.field6772.getParameter("cookiehost");
                String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
                String var5;
                if (arg1.length() != 0) {
                    var5 = var4 + "; Expires=" + class121.method1090(false, 94608000000L + class112.method1033(-11752)) + "; Max-Age=" + 94608000L;
                } else {
                    var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                if (arg0 > -43) {
                    field5587 = null;
                }
                class358.method2401((byte) -122, "document.cookie=\"" + var5 + "\"", class450.field6772);
            } catch (Throwable var6) {
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ZIII)V", line = 87)
    public final void method582(boolean arg0, int arg1, int arg2, int arg3) {
        ++field5586;
        int var5 = this.method1645(true) * super.field3611.field7317 / 10000;
        class627.field8857.method335(arg1, arg3 + 2, var5, super.field3611.field7316 + -2, ((class217) super.field3611).field3565, 0);
        class627.field8857.method335(arg1 + var5, arg3 + 2, -var5 + super.field3611.field7317, super.field3611.field7316 + -2, arg2, 0);
    }

    @OriginalMember(owner = "client!es", name = "d", descriptor = "(I)V", line = 102)
    public static void method2357(int arg0) {
        field5593 = null;
        if (arg0 <= 60) {
            method2357(118);
        }
        field5587 = null;
        field5591 = null;
    }
}
