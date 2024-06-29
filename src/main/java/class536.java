import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class536 {

    @OriginalMember(owner = "client!iia", name = "g", descriptor = "Laf;")
    private class39 field7415 = new class39(64);

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "Lae;")
    private class283 field7410;

    @OriginalMember(owner = "client!iia", name = "k", descriptor = "Lv;")
    public static class165 field7419 = new class165();

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "I")
    public static int field7409;

    @OriginalMember(owner = "client!iia", name = "c", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!iia", name = "e", descriptor = "I")
    public static int field7413;

    @OriginalMember(owner = "client!iia", name = "f", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!iia", name = "h", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!iia", name = "i", descriptor = "I")
    public static int field7417;

    @OriginalMember(owner = "client!iia", name = "j", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!iia", name = "l", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!iia", name = "m", descriptor = "I")
    public static int field7421;

    @OriginalMember(owner = "client!iia", name = "d", descriptor = "Z")
    public static boolean field7412;

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(IIZ)V", line = 9)
    public static final void method3182(int arg0, int arg1, boolean arg2) {
        if (arg1 != -1) {
            method3186(88, (char) 65492, (byte) -6);
        }
        if (arg2) {
            class116 var3 = class248.method1672(class84.field1023, class585.field8270, -20647);
            var3.field1575.method2986(arg0, arg1 - 81);
            class443.method2655(0, var3);
        } else {
            class700.method3958(class401.field5666, arg0, -1);
        }
        field7417++;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)V", line = 31)
    public final void method3183(int arg0) {
        field7418++;
        if (arg0 <= 36) {
            field7412 = true;
        }
        class39 var2 = this.field7415;
        synchronized (this.field7415) {
            this.field7415.method314(-2);
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(IZ)I", line = 44)
    public static final int method3184(int arg0, boolean arg1) {
        field7409++;
        if (!arg1) {
            method3187(116, true, 2, -68);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)V", line = 61)
    public static void method3185(int arg0) {
        if (arg0 != 242) {
            method3182(-101, 78, true);
        }
        field7419 = null;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(ICB)C", line = 73)
    public static final char method3186(int arg0, char arg1, byte arg2) {
        if (arg2 != 8) {
            method3182(99, -116, false);
        }
        field7416++;
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 == 'Œ') {
            return 'O';
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(IZII)Lae;", line = 151)
    public static final class283 method3187(int arg0, boolean arg1, int arg2, int arg3) {
        field7420++;
        class327 var4 = null;
        if (class448.field6274 != null) {
            var4 = new class327(arg0, class448.field6274, class100.field1178[arg0], 1000000);
        }
        class570.field8021[arg0] = class203.field2847.method98(32, var4, class43.field448, arg0);
        if (arg3 == 1000000) {
            class570.field8021[arg0].method1646(26533);
            return new class283(class570.field8021[arg0], arg1, arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Ljk;ILae;)V", line = 171)
    public class536(class788 arg0, int arg1, class283 arg2) {
        this.field7410 = arg2;
        this.field7410.method1867(31, (byte) 49);
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(IB)Lsv;", line = 187)
    public final class568 method3188(int arg0, byte arg1) {
        field7413++;
        if (arg1 != 49) {
            field7412 = false;
        }
        class39 var3 = this.field7415;
        class568 var4;
        synchronized (this.field7415) {
            var4 = (class568) this.field7415.method312(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class283 var5 = this.field7410;
        byte[] var6;
        synchronized (this.field7410) {
            var6 = this.field7410.method1849(arg0, (byte) -90, 31);
        }
        class568 var7 = new class568();
        if (var6 != null) {
            var7.method3346((byte) 127, new class511(var6));
        }
        class39 var8 = this.field7415;
        synchronized (this.field7415) {
            this.field7415.method305(var7, (long) arg0, 18320);
            return var7;
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(II)V", line = 216)
    public final void method3189(int arg0, int arg1) {
        field7414++;
        class39 var3 = this.field7415;
        synchronized (this.field7415) {
            this.field7415.method308(-1, arg1);
            if (arg0 != -224) {
                method3182(-81, -47, true);
            }
        }
    }

    @OriginalMember(owner = "client!iia", name = "c", descriptor = "(I)V", line = 229)
    public final void method3190(int arg0) {
        if (arg0 != 97) {
            this.field7410 = null;
        }
        field7411++;
        class39 var2 = this.field7415;
        synchronized (this.field7415) {
            this.field7415.method319(-36);
        }
    }
}
