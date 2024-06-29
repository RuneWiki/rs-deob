import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class65 {

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "Lhb;")
    private class155 field1086 = new class155(256);

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "Lhb;")
    private class155 field1095 = new class155(256);

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "Ldk;")
    private class251 field1088;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "Ldk;")
    private class251 field1092;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1079 = "flash1:";

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Z")
    public static boolean field1078 = false;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1084 = "glow2:";

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1093 = "Loaded fonts";

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "[I")
    public static int[] field1080;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "[Lbi;")
    public static class229[] field1085;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method454(int arg0) {
        field1093 = null;
        field1084 = null;
        field1079 = null;
        field1085 = null;
        if (arg0 == 0) {
            field1080 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method455(int arg0, String arg1, boolean arg2) {
        field1083++;
        class314.field5061.method828(121, 214);
        class196.field3167++;
        class314.field5061.method1108(class230.method1551(arg1, (byte) -87) + 1, arg2);
        class314.field5061.method1148((byte) -99, arg1);
        class314.field5061.method1118(-106, arg0);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II[II)Lqj;")
    private final class248 method456(int arg0, int arg1, int[] arg2, int arg3) {
        field1089++;
        int var5 = ((arg3 & 0x60000FFF) << 4 | arg3 >>> 12) ^ arg0;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class248 var9 = (class248) this.field1095.method1059(0, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class16 var10 = (class16) this.field1086.method1059(0, var7);
            if (var10 == null) {
                var10 = class16.method78(this.field1092, arg3, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field1086.method1052(var7, (byte) -65, var10);
            }
            if (arg1 != 313592368) {
                this.method459((int[]) null, -62, 127, 95);
            }
            class248 var11 = var10.method79(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method913(-3542);
                this.field1095.method1052(var7, (byte) -65, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZI)V")
    public static final void method457(boolean arg0, int arg1) {
        field1081++;
        if (class294.field4708 == arg0) {
            return;
        }
        class294.field4708 = arg0;
        class136.method954(490368332);
        if (arg1 != 1480833420) {
            field1093 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V")
    public static final void method458(int arg0) {
        class274.field4404.method1257(-113);
        field1090++;
        class160.field2547.method1257(-111);
        if (arg0 != 1480833420) {
            field1078 = true;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([IIII)Lqj;")
    private final class248 method459(int[] arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 ^ (arg2 >>> 12 | (arg2 & 0x80000FFF) << 4);
        int var6 = var5 | arg2 << 16;
        field1087++;
        long var7 = (long) var6;
        class248 var9 = (class248) this.field1095.method1059(0, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 != null && arg0[0] <= 0) {
            return null;
        } else if (arg3 == 5244) {
            class114 var10 = class114.method798(this.field1088, arg2, arg1);
            if (var10 == null) {
                return null;
            }
            class248 var11 = var10.method800();
            this.field1095.method1052(var7, (byte) -65, var11);
            if (arg0 != null) {
                arg0[0] -= var11.field3941.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z[II)Lqj;")
    public final class248 method460(boolean arg0, int[] arg1, int arg2) {
        field1094++;
        if (arg0) {
            return null;
        } else if (this.field1092.method1671((byte) -23) == 1) {
            return this.method456(arg2, 313592368, arg1, 0);
        } else if (this.field1092.method1678((byte) 26, arg2) == 1) {
            return this.method456(0, 313592368, arg1, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZI[I)Lqj;")
    public final class248 method461(boolean arg0, int arg1, int[] arg2) {
        if (arg0) {
            this.field1095 = null;
        }
        field1091++;
        if (this.field1088.method1671((byte) -23) == 1) {
            return this.method459(arg2, arg1, 0, 5244);
        } else if (this.field1088.method1678((byte) 126, arg1) == 1) {
            return this.method459(arg2, 0, arg1, 5244);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Ldk;Ldk;)V")
    public class65(class251 arg0, class251 arg1) {
        this.field1088 = arg0;
        this.field1092 = arg1;
    }
}
