import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class109 extends class45 {

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "Ljava/lang/String;")
    public String field1803;

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
    public static int field1793 = 2;

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!mn", name = "y", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!mn", name = "A", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "Lcj;")
    public static class147 field1796;

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "Lcj;")
    public static class147 field1801;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "Ldf;")
    public static class171 field1792;

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "Lth;")
    public static class57 field1795;

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "Lth;")
    public static class57 field1800;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V", line = 9)
    public static final void method835(int arg0) {
        field1794++;
        if (class238.field3927 && arg0 <= -96) {
            class238.field3927 = false;
            class151.field2397 = null;
            class164.field2602 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILjava/lang/String;)V", line = 33)
    public static final void method836(int arg0, String arg1) {
        field1802++;
        if (arg1 == null) {
            return;
        }
        String var2 = class81.method660(arg1, -239);
        if (var2 == null || arg0 != -1) {
            return;
        }
        for (int var3 = 0; var3 < class38.field570; var3++) {
            String var4 = class81.method660(class241.field3986[var3], -239);
            if (var4 != null && var4.equals(var2)) {
                class195.field3108++;
                class38.field570--;
                for (int var5 = var3; var5 < class38.field570; var5++) {
                    class241.field3986[var5] = class241.field3986[var5 + 1];
                    class121.field2021[var5] = class121.field2021[var5 + 1];
                    class65.field1147[var5] = class65.field1147[var5 + 1];
                    class128.field2169[var5] = class128.field2169[var5 + 1];
                    class162.field2570[var5] = class162.field2570[var5 + 1];
                    class92.field1560[var5] = class92.field1560[var5 + 1];
                }
                class44.field683 = class55.field908;
                class36.field520.method2228(74, 16547);
                class36.field520.method1712(class163.method1261(1, arg1), -115);
                class36.field520.method1709(arg1, (byte) -49);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V", line = 89)
    public static final void method837(boolean arg0) {
        field1804++;
        class179.method1406(16, false);
        System.gc();
        class22.method143(-29, 25);
        if (!arg0) {
            field1801 = (class147) null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lim;ILim;IZ)I", line = 108)
    public static final int method838(class201 arg0, int arg1, class201 arg2, int arg3, boolean arg4) {
        field1797++;
        if (arg1 == 1) {
            int var5 = arg0.field2841;
            int var6 = arg2.field2841;
            if (!arg4) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg1 == 2) {
            return class362.method2536(true, arg0.method1542(true).field325, arg2.method1542(true).field325, class204.field3223);
        } else if (arg1 == 3) {
            if (arg0.field3196.equals("-")) {
                if (arg2.field3196.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field3196.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class362.method2536(true, arg0.field3196, arg2.field3196, class204.field3223);
            }
        } else if (arg1 == 4) {
            return arg0.method1391((byte) 127) ? (arg2.method1391((byte) -9) ? 0 : 1) : (arg2.method1391((byte) 116) ? -1 : 0);
        } else if (arg1 == 5) {
            return arg0.method1393((byte) 61) ? (arg2.method1393((byte) 61) ? 0 : 1) : (arg2.method1393((byte) 61) ? -1 : 0);
        } else if (arg1 == 6) {
            return arg0.method1397((byte) -125) ? (arg2.method1397((byte) -98) ? 0 : 1) : (arg2.method1397((byte) -113) ? -1 : 0);
        } else if (arg1 == 7) {
            return arg0.method1392(238) ? (arg2.method1392(238) ? 0 : 1) : (arg2.method1392(238) ? -1 : 0);
        } else {
            int var7 = 22 / ((arg3 + 24) / 59);
            return arg0.field3205 - arg2.field3205;
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V", line = 172)
    public class109() {
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V", line = 176)
    public static void method839(int arg0) {
        field1801 = null;
        field1800 = null;
        if (arg0 != -23208) {
            field1795 = (class57) null;
        }
        field1792 = null;
        field1796 = null;
        field1795 = null;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 189)
    public class109(String arg0) {
        this.field1803 = arg0;
    }
}
