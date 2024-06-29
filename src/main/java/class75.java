import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class75 {

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lib;")
    private class3 field1107 = new class3();

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "Lqe;")
    private class298 field1111 = new class298();

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    private int field1123;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    private int field1112;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "Lfl;")
    private class86 field1122;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Lga;")
    public static class150 field1109 = new class150();

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "[I")
    public static int[] field1116 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "Lok;")
    public static class41 field1115 = class137.method956(" )2>", 45);

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Lok;")
    public static class41 field1113 = class137.method956("Wordpack geladen)3", 45);

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "Lok;")
    public static class41 field1118 = class137.method956("<col=ffff00>", 45);

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    public static int field1119 = -1;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field1120 = 0;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "[I")
    public static int[] field1117 = new int[4096];

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "Lok;")
    public static class41 field1124;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "[Ltb;")
    public static class199[] field1125;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "[Lka;")
    public static class279[] field1121;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 6)
    public final void method548(int arg0) {
        this.field1111.method2054((byte) 96);
        field1105++;
        if (arg0 <= -84) {
            this.field1122.method615(15968);
            this.field1107 = new class3();
            this.field1123 = this.field1112;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V", line = 21)
    public static void method549(int arg0) {
        field1116 = null;
        field1117 = null;
        field1115 = null;
        field1118 = null;
        field1124 = null;
        field1109 = null;
        field1113 = null;
        field1125 = null;
        field1121 = null;
        if (arg0 != -51) {
            field1113 = (class41) null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Llh;", line = 40)
    public final class59 method550(byte arg0) {
        field1110++;
        int var2 = 111 % ((-arg0 - 9) / 32);
        return this.field1122.method616(118);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)Llh;", line = 55)
    public final class59 method551(boolean arg0) {
        field1102++;
        if (arg0) {
            method553(-101);
        }
        return this.field1122.method609(124);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZIILbc;)V", line = 68)
    public static final void method552(int arg0, boolean arg1, int arg2, int arg3, class302 arg4) {
        int var5 = arg4.field4949;
        int var6 = arg4.field4936;
        if (arg4.field4893 == 0) {
            arg4.field4936 = arg4.field5041;
        } else if (arg4.field4893 == 1) {
            arg4.field4936 = arg3 - arg4.field5041;
        } else if (arg4.field4893 == 2) {
            arg4.field4936 = arg4.field5041 * arg3 >> 14;
        } else if (arg4.field4893 == 3) {
            if (arg4.field4951 == 2) {
                arg4.field4936 = (arg4.field5041 - 1) * arg4.field4998 + arg4.field5041 * 32;
            } else if (arg4.field4951 == 7) {
                arg4.field4936 = (arg4.field5041 - 1) * arg4.field4998 + arg4.field5041 * 115;
            }
        }
        if (arg4.field5005 == 0) {
            arg4.field4949 = arg4.field4921;
        } else if (arg4.field5005 == 1) {
            arg4.field4949 = arg2 - arg4.field4921;
        } else if (arg4.field5005 == 2) {
            arg4.field4949 = arg4.field4921 * arg2 >> 14;
        } else if (arg4.field5005 == 3) {
            if (arg4.field4951 == 2) {
                arg4.field4949 = arg4.field4921 * 32 + ((arg4.field4921 - 1) * arg4.field4931);
            } else if (arg4.field4951 == 7) {
                arg4.field4949 = (arg4.field4921 - 1) * arg4.field4931 + arg4.field4921 * 12;
            }
        }
        field1108++;
        if (arg4.field4893 == 4) {
            arg4.field4936 = arg4.field4949 * arg4.field4906 / arg4.field4990;
        }
        if (arg4.field5005 == 4) {
            arg4.field4949 = arg4.field4990 * arg4.field4936 / arg4.field4906;
        }
        if (class150.field2331 && (client.method2119(arg4) != 0 || arg4.field4951 == 0)) {
            if (arg4.field4949 < 5 && arg4.field4936 < 5) {
                arg4.field4936 = 5;
                arg4.field4949 = 5;
            } else {
                if (arg4.field4949 <= 0) {
                    arg4.field4949 = 5;
                }
                if (arg4.field4936 <= 0) {
                    arg4.field4936 = 5;
                }
            }
        }
        if (~arg4.field4924 == arg0) {
            class186.field3039 = arg4;
        }
        if (arg1 && arg4.field5013 != null && (arg4.field4936 != var6 || arg4.field4949 != var5)) {
            class73 var7 = new class73();
            var7.field1079 = arg4;
            var7.field1083 = arg4.field5013;
            class110.field1569.method1503(var7, (byte) -70);
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)Z", line = 187)
    public static final boolean method553(int arg0) {
        field1106++;
        if (class166.field2625) {
            return true;
        } else if (arg0 == 23987) {
            return class198.field3178;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(JI)Lib;", line = 203)
    public final class3 method554(long arg0, int arg1) {
        field1104++;
        int var4 = 51 % ((arg1 + 35) / 35);
        class3 var5 = (class3) this.field1122.method617(arg0, false);
        if (var5 != null) {
            this.field1111.method2055(var5, 68);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(JBLib;)V", line = 227)
    public final void method555(long arg0, byte arg1, class3 arg2) {
        if (this.field1123 == 0) {
            class3 var5 = this.field1111.method2059(false);
            var5.method418(6971);
            var5.method11(true);
            if (this.field1107 == var5) {
                class3 var6 = this.field1111.method2059(false);
                var6.method418(6971);
                var6.method11(true);
            }
        } else {
            this.field1123--;
        }
        this.field1122.method610(100, arg2, arg0);
        if (arg1 > -115) {
            method549(94);
        }
        field1103++;
        this.field1111.method2055(arg2, 68);
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(I)V", line = 313)
    public class75(int arg0) {
        this.field1123 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field1112 = arg0;
        this.field1122 = new class86(var2);
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1117[var0] = class311.method2154(var0, (byte) 67);
        }
        field1124 = class137.method956("Fertigkeit: ", 45);
    }
}
