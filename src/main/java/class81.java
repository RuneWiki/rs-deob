import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class81 extends class320 {

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "Ljava/lang/String;")
    private String field1171 = "null";

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
    public static int field1184 = 0;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "Lcn;")
    public static class37 field1169 = new class37(32);

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "S")
    public static short field1187 = 1;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "D")
    public static double field1186 = -1.0D;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
    public static int field1185 = -1;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "C")
    public char field1165;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "C")
    public char field1176;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "I")
    private int field1173;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "Lrn;")
    public static class18 field1188;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "Lcn;")
    private class37 field1170;

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "Lcn;")
    public class37 field1175;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLug;I)V", line = 4)
    private final void method729(byte arg0, class25 arg1, int arg2) {
        if (arg0 >= -90) {
            return;
        }
        if (arg2 == 1) {
            this.field1165 = class221.method1658((byte) -119, arg1.method286((byte) 92));
        } else if (arg2 == 2) {
            this.field1176 = class221.method1658((byte) -113, arg1.method286((byte) 107));
        } else if (arg2 == 3) {
            this.field1171 = arg1.method297((byte) -72);
        } else if (arg2 == 4) {
            this.field1173 = arg1.method262((byte) 28);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method314((byte) 35);
            this.field1175 = new class37(class261.method1918(var4, 22));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method262((byte) 77);
                class172 var7;
                if (arg2 == 5) {
                    var7 = new class126(arg1.method297((byte) -45));
                } else {
                    var7 = new class164(arg1.method262((byte) 100));
                }
                this.field1175.method375(var7, (long) var6, -111);
            }
        }
        field1172++;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)Ljava/lang/String;", line = 59)
    public final String method730(int arg0, int arg1) {
        field1168++;
        if (this.field1175 == null) {
            return this.field1171;
        }
        if (arg0 != -2) {
            this.method730(-25, 64);
        }
        class126 var3 = (class126) this.field1175.method370((byte) -120, (long) arg1);
        return var3 == null ? this.field1171 : var3.field2105;
    }

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)V", line = 81)
    private final void method731(int arg0) {
        field1167++;
        if (arg0 != -10913) {
            return;
        }
        this.field1170 = new class37(this.field1175.method372(arg0 + 43634));
        for (class126 var2 = (class126) this.field1175.method371(arg0 - 8226); var2 != null; var2 = (class126) this.field1175.method378((byte) -91)) {
            class243 var3 = new class243(var2.field2105, (int) var2.field2734);
            this.field1170.method375(var3, class79.method726((byte) -127, var2.field2105), -82);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZLah;)V", line = 105)
    public static final void method732(int arg0, boolean arg1, class36 arg2) {
        int var3 = arg2.field540;
        if (arg0 != 22) {
            field1184 = -48;
        }
        field1181++;
        int var4 = (int) arg2.field2734;
        arg2.method1357(947647010);
        if (arg1) {
            class48.method466(var3, arg0 - 23);
        }
        class317.method2243(var3, -1110808080);
        class342 var5 = class355.method2497(arg0 - 22, var4);
        if (var5 != null) {
            class339.method2380(var5, 113);
        }
        int var6 = class66.field1006;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class260.method1911((byte) 11, class356.field5670[var7])) {
                class226.method1687(var7, (byte) 18);
            }
        }
        if (class66.field1006 == 1) {
            class6.field89 = false;
            class89.method800(class135.field2259, (byte) -64, class43.field700, class310.field4785, class10.field141);
        } else {
            class89.method800(class135.field2259, (byte) -64, class43.field700, class310.field4785, class10.field141);
            int var8 = class64.field988.method1194(class222.field3450);
            for (int var9 = 0; var9 < class66.field1006; var9++) {
                int var10 = class64.field988.method1194(class78.method720(var9, false));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class43.field700 = var8 + 8;
            class135.field2259 = class66.field1006 * 15 + (class149.field2444 ? 26 : 22);
        }
        if (class164.field2604 != -1) {
            class238.method1768((byte) 28, 1, class164.field2604);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lug;B)V", line = 175)
    public final void method733(class25 arg0, byte arg1) {
        if (arg1 != -36) {
            return;
        }
        while (true) {
            int var3 = arg0.method281(arg1 - 88);
            if (var3 == 0) {
                field1166++;
                return;
            }
            this.method729((byte) -111, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(II)Z", line = 198)
    public final boolean method734(int arg0, int arg1) {
        field1178++;
        if (this.field1175 == null) {
            return false;
        }
        if (this.field1170 == null) {
            this.method739(true);
        }
        class164 var3 = (class164) this.field1170.method370((byte) -120, (long) arg0);
        if (var3 == null) {
            return false;
        } else {
            if (arg1 >= -29) {
                field1187 = -88;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(IB)V", line = 222)
    public static final void method735(int arg0, byte arg1) {
        class138 var2 = class149.method1242(arg0, 0, 1);
        var2.method1152(126);
        if (arg1 >= 94) {
            field1182++;
        }
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(II)I", line = 239)
    public final int method736(int arg0, int arg1) {
        field1174++;
        if (this.field1175 == null) {
            return this.field1173;
        }
        class164 var3 = (class164) this.field1175.method370((byte) -120, (long) arg1);
        if (var3 == null) {
            return this.field1173;
        } else if (arg0 <= 31) {
            return 20;
        } else {
            return var3.field2610;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 260)
    public final boolean method737(int arg0, String arg1) {
        if (arg0 < 42) {
            return false;
        }
        field1183++;
        if (this.field1175 == null) {
            return false;
        }
        if (this.field1170 == null) {
            this.method731(-10913);
        }
        for (class243 var3 = (class243) this.field1170.method370((byte) -120, class79.method726((byte) -102, arg1)); var3 != null; var3 = (class243) this.field1170.method377(-1)) {
            if (var3.field3781.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)V", line = 301)
    public static void method738(int arg0) {
        field1188 = null;
        field1169 = null;
        if (arg0 != 0) {
            field1184 = -105;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V", line = 326)
    private final void method739(boolean arg0) {
        field1179++;
        this.field1170 = new class37(this.field1175.method372(32721));
        if (!arg0) {
            this.method730(1, -98);
        }
        for (class164 var2 = (class164) this.field1175.method371(-19139); var2 != null; var2 = (class164) this.field1175.method378((byte) -81)) {
            class164 var3 = new class164((int) var2.field2734);
            this.field1170.method375(var3, (long) var2.field2610, 114);
        }
    }
}
