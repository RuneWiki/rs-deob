import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class201 extends class177 {

    @OriginalMember(owner = "client!im", name = "y", descriptor = "Ljava/lang/String;")
    public static String field3206 = "glow3:";

    @OriginalMember(owner = "client!im", name = "z", descriptor = "I")
    public static int field3207 = 0;

    @OriginalMember(owner = "client!im", name = "v", descriptor = "Ljava/lang/String;")
    public static String field3203 = "glow1:";

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!im", name = "r", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!im", name = "s", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!im", name = "t", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!im", name = "x", descriptor = "I")
    public int field3205;

    @OriginalMember(owner = "client!im", name = "A", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!im", name = "u", descriptor = "Lwi;")
    public static class233 field3202;

    @OriginalMember(owner = "client!im", name = "w", descriptor = "Lpd;")
    public static class290 field3204;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "Ljava/lang/String;")
    public String field3196;

    @OriginalMember(owner = "client!im", name = "B", descriptor = "Ljava/lang/String;")
    public String field3209;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(Z)Lqb;", line = 7)
    public final class27 method1542(boolean arg0) {
        if (arg0) {
            field3201++;
            return class135.field2258[this.field2847];
        } else {
            return (class27) null;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ZLth;II)Llb;", line = 22)
    public static final class341 method1543(boolean arg0, class57 arg1, int arg2, int arg3) {
        if (arg0) {
            field3207 = 94;
        }
        field3197++;
        return class315.method2233(arg3, (byte) 111, arg1, arg2) ? class177.method1399(true) : null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IB)Llm;", line = 36)
    public static final class21 method1544(int arg0, byte arg1) {
        field3208++;
        if (arg1 > -10) {
            field3203 = (String) null;
        }
        class21 var2 = (class21) class187.field3003.method2329((byte) 107, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class127.field2152.method472(arg0, 48, 16);
        class21 var4 = new class21();
        if (var3 != null) {
            var4.method125(new class227(var3), -124);
        }
        class187.field3003.method2333((long) arg0, 0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ZILth;)Lek;", line = 64)
    public static final class239 method1545(boolean arg0, int arg1, class57 arg2) {
        field3198++;
        byte[] var3 = arg2.method476((byte) -7, arg1);
        if (var3 == null) {
            return null;
        } else {
            if (!arg0) {
                field3199 = 45;
            }
            return new class239(var3);
        }
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(Z)V", line = 80)
    public static void method1546(boolean arg0) {
        field3206 = null;
        field3202 = null;
        field3203 = null;
        field3204 = null;
        if (!arg0) {
            method1545(true, 115, (class57) null);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILth;)V", line = 108)
    public static final void method1547(int arg0, class57 arg1) {
        field3200++;
        if (class238.field3927) {
            return;
        }
        if (class42.field607) {
            class244.method1866();
        } else {
            class246.method1882();
        }
        class151.field2397 = class362.method2540(arg1, class156.field2473, (byte) -104);
        int var2 = class252.field4266;
        int var3 = var2 * 956 / 503;
        class151.field2397.method90((class298.field4779 - var3) / 2, 0, var3, var2);
        class164.field2602 = class133.method1019(-69, arg1, class116.field1941);
        class164.field2602.method2015(class298.field4779 / 2 - (class164.field2602.field4652 / arg0), 18);
        class238.field3927 = true;
    }
}
