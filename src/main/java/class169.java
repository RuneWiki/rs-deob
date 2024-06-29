import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class169 {

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Lag;")
    private class231 field2735 = new class231();

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field2731 = 0;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field2734 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2737 = "shake:";

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "[C")
    public static char[] field2742 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Lme;")
    public static class165 field2732;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "Lag;")
    private class231 field2743;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "[Lmd;")
    public static class273[] field2738;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "[Z")
    public static boolean[] field2730;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lag;I)V")
    public final void method1263(class231 arg0, int arg1) {
        if (arg0.field3923 != null) {
            arg0.method1663(-82);
        }
        arg0.field3922 = this.field2735;
        field2733++;
        arg0.field3923 = this.field2735.field3923;
        arg0.field3923.field3922 = arg0;
        arg0.field3922.field3923 = arg0;
        if (arg1 != 352) {
            this.field2735 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILvd;IIILah;Ldl;II)V")
    public static final void method1264(int arg0, class307 arg1, int arg2, int arg3, int arg4, class1 arg5, class123 arg6, int arg7, int arg8) {
        field2736++;
        class253 var9 = new class253();
        var9.field4273 = arg4 * arg7;
        var9.field4275 = arg0;
        var9.field4294 = arg3 * 128;
        if (arg5 != null) {
            var9.field4274 = arg5.field42 * 128;
            var9.field4290 = arg5.field6;
            var9.field4284 = arg5.field79;
            var9.field4279 = arg5;
            var9.field4302 = arg5.field1;
            var9.field4278 = arg5.field66;
            int var10 = arg5.field57;
            var9.field4287 = arg5.field7;
            int var11 = arg5.field10;
            if (arg8 == 1 || arg8 == 3) {
                var10 = arg5.field10;
                var11 = arg5.field57;
            }
            var9.field4292 = (arg4 + var10) * 128;
            var9.field4296 = (arg3 + var11) * 128;
            if (arg5.field34 != null) {
                var9.field4277 = true;
                var9.method1836(-120);
            }
            if (var9.field4278 != null) {
                var9.field4285 = var9.field4290 + (int) (Math.random() * (double) (var9.field4284 - var9.field4290));
            }
            class209.field3536.method311(102, var9);
        } else if (arg1 != null) {
            var9.field4280 = arg1;
            class54 var12 = arg1.field4960;
            if (var12.field904 != null) {
                var9.field4277 = true;
                var12 = var12.method343(-1);
            }
            if (var12 != null) {
                var9.field4292 = (var12.field915 + arg4) * 128;
                var9.field4296 = (var12.field915 + arg3) * 128;
                var9.field4287 = class226.method1597((byte) 127, arg1);
                var9.field4302 = var12.field933;
                var9.field4274 = var12.field913 * 128;
            }
            class237.field3995.method311(122, var9);
        } else if (arg6 != null) {
            var9.field4281 = arg6;
            var9.field4292 = (arg4 + arg6.method294((byte) -103)) * 128;
            var9.field4296 = (arg3 + arg6.method294((byte) -114)) * 128;
            var9.field4287 = class78.method550(arg7 ^ 0x3C38, arg6);
            var9.field4302 = arg6.field2088;
            var9.field4274 = arg6.field2091 * 128;
            class259.field4355.method986((long) arg2, true, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)Lag;")
    public final class231 method1265(int arg0) {
        field2740++;
        class231 var2 = this.field2735.field3922;
        if (arg0 != 8211) {
            this.method1263((class231) null, 88);
        }
        if (this.field2735 == var2) {
            this.field2743 = null;
            return null;
        } else {
            this.field2743 = var2.field3922;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)Lag;")
    public final class231 method1266(int arg0) {
        if (arg0 != 8226) {
            return null;
        }
        field2729++;
        class231 var2 = this.field2743;
        if (this.field2735 == var2) {
            this.field2743 = null;
            return null;
        } else {
            this.field2743 = var2.field3922;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)I")
    public final int method1267(int arg0) {
        if (arg0 != 11704) {
            method1264(-128, (class307) null, 1, 11, 14, (class1) null, (class123) null, -1, -67);
        }
        int var2 = 0;
        for (class231 var3 = this.field2735.field3922; var3 != this.field2735; var3 = var3.field3922) {
            var2++;
        }
        field2728++;
        return var2;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public static void method1268(byte arg0) {
        if (arg0 <= 60) {
            method1264(-64, (class307) null, -20, 41, 52, (class1) null, (class123) null, -121, -24);
        }
        field2734 = null;
        field2738 = null;
        field2732 = null;
        field2742 = null;
        field2737 = null;
        field2730 = null;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    public class169() {
        this.field2735.field3922 = this.field2735;
        this.field2735.field3923 = this.field2735;
    }
}
