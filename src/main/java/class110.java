import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class110 {

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "Ljava/lang/String;")
    private String field1541 = "null";

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "Lwl;")
    public static class410 field1536 = new class410();

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "Loo;")
    public static class629 field1545 = new class629(2, 16);

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "[F")
    public static float[] field1546 = new float[16];

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "C")
    public char field1527;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "C")
    public char field1532;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    private int field1539;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Lhe;")
    public class372 field1534;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "Lhe;")
    private class372 field1543;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILvd;Ld;Ljava/awt/Canvas;)Lha;", line = 3)
    public static final class60 method818(int arg0, int arg1, class39 arg2, class151 arg3, Canvas arg4) {
        field1529++;
        if (!class648.method3768(12)) {
            throw new RuntimeException("");
        } else if (class383.method2462((byte) 31, "jaggl")) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg4, 8, 8, 8, 24, 0, arg0);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class704 var8 = new class704(var5, arg4, var6, arg3, arg2, arg0);
            var8.method2330(1);
            return arg1 == 3306 ? var8 : null;
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 31)
    private final void method819(byte arg0) {
        this.field1543 = new class372(this.field1534.method2285(0));
        int var2 = 119 % ((arg0 - 12) / 44);
        field1537++;
        for (class139 var3 = (class139) this.field1534.method2283(false); var3 != null; var3 = (class139) this.field1534.method2282((byte) 43)) {
            class394 var4 = new class394(var3.field1856, (int) var3.field2810);
            this.field1543.method2278((byte) -45, class296.method1871(false, var3.field1856), var4);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V", line = 54)
    public static final void method820(int arg0, int arg1, int arg2) {
        class186 var3 = class80.field1136[arg0][arg1][arg2];
        if (var3 != null) {
            class51.method371(var3.field2844);
            if (var3.field2844 != null) {
                var3.field2844 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII)V", line = 67)
    public static final void method821(int arg0, int arg1, int arg2, int arg3) {
        class186 var4 = class80.field1136[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class665 var5 = var4.field2835;
        class665 var6 = var4.field2832;
        if (var5 != null) {
            var5.field9348 = (short) (var5.field9348 * arg3 / (0x10 << class459.field6769 - 7));
            var5.field9345 = (short) (var5.field9345 * arg3 / (0x10 << class459.field6769 - 7));
        }
        if (var6 != null) {
            var6.field9348 = (short) (var6.field9348 * arg3 / (0x10 << class459.field6769 - 7));
            var6.field9345 = (short) (var6.field9345 * arg3 / (0x10 << class459.field6769 - 7));
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILrg;)V", line = 90)
    private final void method822(int arg0, int arg1, class645 arg2) {
        field1538++;
        if (arg1 != -4) {
            method831(true);
        }
        if (arg0 == 1) {
            this.field1527 = class33.method166(false, arg2.method3743(true));
        } else if (arg0 == 2) {
            this.field1532 = class33.method166(false, arg2.method3743(true));
        } else if (arg0 == 3) {
            this.field1541 = arg2.method3752(-2);
        } else if (arg0 == 4) {
            this.field1539 = arg2.method3720(-19541);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg2.method3712((byte) -121);
            this.field1534 = new class372(class432.method2684(var4, -21774));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method3720(-19541);
                class184 var7;
                if (arg0 == 5) {
                    var7 = new class139(arg2.method3752(-2));
                } else {
                    var7 = new class317(arg2.method3720(-19541));
                }
                this.field1534.method2278((byte) -77, (long) var6, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V", line = 143)
    public static void method823(boolean arg0) {
        field1546 = null;
        if (arg0) {
            method821(-89, 24, 75, 52);
        }
        field1536 = null;
        field1545 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 157)
    public final String method824(byte arg0, int arg1) {
        field1540++;
        if (this.field1534 == null) {
            return this.field1541;
        }
        class139 var3 = (class139) this.field1534.method2287((long) arg1, (byte) -117);
        if (var3 == null) {
            return this.field1541;
        } else {
            if (arg0 >= -96) {
                this.field1527 = '2';
            }
            return var3.field1856;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)V", line = 178)
    public static final void method825(boolean arg0) {
        class256.field3682.method809(true);
        if (arg0) {
            field1547 = -71;
        }
        field1544++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 189)
    private final void method826(int arg0) {
        field1528++;
        this.field1543 = new class372(this.field1534.method2285(0));
        if (arg0 != 3595) {
            method821(-10, -84, -41, -53);
        }
        for (class317 var2 = (class317) this.field1534.method2283(false); var2 != null; var2 = (class317) this.field1534.method2282((byte) 83)) {
            class317 var3 = new class317((int) var2.field2810);
            this.field1543.method2278((byte) -95, (long) var2.field4518, var3);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 217)
    public final boolean method827(String arg0, int arg1) {
        field1530++;
        if (this.field1534 == null) {
            return false;
        }
        if (this.field1543 == null) {
            this.method819((byte) -33);
        }
        class394 var3 = (class394) this.field1543.method2287(class296.method1871(false, arg0), (byte) -117);
        if (arg1 != -21008) {
            field1536 = null;
        }
        while (var3 != null) {
            if (var3.field5928.equals(arg0)) {
                return true;
            }
            var3 = (class394) this.field1543.method2280(true);
        }
        return false;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lrg;I)V", line = 246)
    public final void method828(class645 arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        while (true) {
            int var3 = arg0.method3745(-6314);
            if (var3 == 0) {
                field1531++;
                return;
            }
            this.method822(var3, -4, arg0);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)Z", line = 267)
    public final boolean method829(int arg0, int arg1) {
        field1542++;
        if (arg1 >= -36) {
            this.field1527 = (char) 65472;
        }
        if (this.field1534 == null) {
            return false;
        }
        if (this.field1543 == null) {
            this.method826(3595);
        }
        class317 var3 = (class317) this.field1543.method2287((long) arg0, (byte) -117);
        return var3 != null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lha;BILqq;ILtl;Lfo;II)V", line = 292)
    public static final void method830(class60 arg0, byte arg1, int arg2, class477 arg3, int arg4, class622 arg5, class519 arg6, int arg7, int arg8) {
        field1526++;
        int var9 = arg7 - arg8 / 2 - 5;
        int var10 = arg4 + 2;
        if (arg6.field7410 != 0) {
            arg0.method482(var9, arg6.field7410, arg8 + 10, arg1 ^ 0xFFFFFF85, var10, arg2 * arg3.method2878() + arg4 + 1 - var10);
        }
        if (arg6.field7406 != 0) {
            arg0.method481(arg6.field7406, -116, var9, var10, arg8 + 10, -var10 + 1 + arg4 + arg2 * arg3.method2878());
        }
        if (arg1 != -124) {
            return;
        }
        int var11 = arg6.field7428;
        if (arg5.field8726 && arg6.field7403 != -1) {
            var11 = arg6.field7403;
        }
        for (int var12 = 0; var12 < arg2; var12++) {
            String var13 = class252.field3635[var12];
            if (arg2 - 1 > var12) {
                var13 = var13.substring(0, var13.length() - 4);
            }
            arg3.method2874(arg0, var13, arg7, arg4, var11, true);
            arg4 += arg3.method2878();
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(Z)I", line = 340)
    public static final int method831(boolean arg0) {
        if (arg0) {
            method823(true);
        }
        field1533++;
        return class10.field148;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZI)I", line = 354)
    public final int method832(boolean arg0, int arg1) {
        if (arg0) {
            return 126;
        }
        field1535++;
        if (this.field1534 == null) {
            return this.field1539;
        } else {
            class317 var3 = (class317) this.field1534.method2287((long) arg1, (byte) -117);
            return var3 == null ? this.field1539 : var3.field4518;
        }
    }
}
