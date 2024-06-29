import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class151 extends class561 {

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "Lju;")
    public static class102 field2082 = new class102(76, -1);

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2088 = null;

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "I")
    public static int field2087 = 0;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "Lcw;")
    private class21 field2084;

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "Lcj;")
    public static class443 field2090;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)Z")
    public final boolean method680(int arg0) {
        ++field2085;
        return !super.method680(arg0) ? false : super.field7983.method3340(arg0 ^ 29892, ((class751) super.field7977).field10441);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIII)V")
    public static final void method967(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != class674.field9500.field5142.method3216(0) && ~arg2 != -1 && class596.field8577 < 50 && ~arg3 != 0) {
            class293.field3830[class596.field8577++] = new class362((byte) 1, arg3, arg2, arg5, arg1, 0, arg4, (class674) null);
        }
        ++field2086;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZIII)V")
    public final void method968(boolean arg0, int arg1, int arg2, int arg3) {
        ++field2089;
        if (arg2 == -30264) {
            int var5 = this.method3360(false) * super.field7977.field9575 / 10000;
            int[] var6 = new int[4];
            class96.field1401.method2163(var6);
            class96.field1401.method2097(arg3, arg1 + 2, arg3 - -var5, arg1 - -super.field7977.field9561);
            this.field2084.method109(arg3, arg1 + 2, super.field7977.field9575, super.field7977.field9561);
            class96.field1401.method2097(var6[0], var6[1], var6[2], var6[3]);
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(B)V")
    public static void method969(byte arg0) {
        if (arg0 != -77) {
            field2087 = -82;
        }
        field2088 = null;
        field2082 = null;
        field2090 = null;
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lwu;Lwu;Luv;)V")
    public class151(class557 arg0, class557 arg1, class751 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V")
    public final void method682(byte arg0) {
        super.method682((byte) 122);
        ++field2081;
        this.field2084 = class7.method32(false, ((class751) super.field7977).field10441, super.field7983);
        if (arg0 <= 29) {
            this.field2084 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIILjava/lang/Class;)Lgs;")
    public static final class743 method970(int arg0, int arg1, int arg2, Class arg3) {
        class38 var4 = class352.field4549[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        } else {
            for (class590 var5 = var4.field538; var5 != null; var5 = var5.field8467) {
                class743 var6 = var5.field8468;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field10352 == arg1 && var6.field10357 == arg2) {
                    return var6;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BZII)V")
    public final void method971(byte arg0, boolean arg1, int arg2, int arg3) {
        ++field2083;
        class96.field1401.method2166(arg2 + -2, arg3, super.field7977.field9575 - -4, super.field7977.field9561 + 2, ((class751) super.field7977).field10439, 0);
        class96.field1401.method2166(arg2 - 1, arg3 + 1, super.field7977.field9575 + 2, super.field7977.field9561, 0, 0);
        if (arg0 != 20) {
            method967(23, 23, 5, -96, -37, -46);
        }
    }
}
