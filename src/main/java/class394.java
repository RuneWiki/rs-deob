import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class394 extends class170 {

    @OriginalMember(owner = "client!o", name = "w", descriptor = "Ljava/lang/String;")
    private String field5460 = "null";

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field5473 = -60;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "Lhc;")
    public static class368 field5471 = new class368("flash3:", "", "", "");

    @OriginalMember(owner = "client!o", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field5478 = new String[100];

    @OriginalMember(owner = "client!o", name = "B", descriptor = "C")
    public char field5465;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "C")
    public char field5467;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    private int field5461;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "Ltn;")
    public class109 field5464;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "Ltn;")
    private class109 field5472;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "Lmq;")
    public static class31 field5477;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V")
    private final void method2442(int arg0) {
        this.field5472 = new class109(this.field5464.method834(95));
        field5474++;
        if (arg0 == -7) {
            for (class245 var2 = (class245) this.field5464.method842((byte) -25); var2 != null; var2 = (class245) this.field5464.method836(arg0 - 92)) {
                class204 var3 = new class204(var2.field3460, (int) var2.field4226);
                this.field5472.method835(4, var3, class149.method1108((byte) -84, var2.field3460));
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILrg;)V")
    public final void method2443(int arg0, class366 arg1) {
        while (true) {
            int var3 = arg1.method2306((byte) 107);
            if (var3 == 0) {
                field5470++;
                int var4 = -101 % ((19 - arg0) / 62);
                return;
            }
            this.method2446((byte) 48, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method2444(int arg0, int arg1) {
        if (arg0 <= 18) {
            this.field5460 = null;
        }
        field5475++;
        if (this.field5464 == null) {
            return this.field5460;
        } else {
            class245 var3 = (class245) this.field5464.method837((byte) -72, (long) arg1);
            return var3 == null ? this.field5460 : var3.field3460;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)I")
    public final int method2445(byte arg0, int arg1) {
        field5463++;
        if (this.field5464 == null) {
            return this.field5461;
        }
        class166 var3 = (class166) this.field5464.method837((byte) -72, (long) arg1);
        if (var3 == null) {
            return this.field5461;
        } else {
            if (arg0 <= 107) {
                field5478 = null;
            }
            return var3.field2342;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BILrg;)V")
    private final void method2446(byte arg0, int arg1, class366 arg2) {
        field5466++;
        if (arg0 != 48) {
            this.field5465 = '\f';
        }
        if (arg1 == 1) {
            this.field5465 = class93.method732(63, arg2.method2289((byte) -77));
        } else if (arg1 == 2) {
            this.field5467 = class93.method732(63, arg2.method2289((byte) -77));
        } else if (arg1 == 3) {
            this.field5460 = arg2.method2255(arg0 ^ 0xFFFF822E);
        } else if (arg1 == 4) {
            this.field5461 = arg2.method2258(1177515464);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method2297(13352);
            this.field5464 = new class109(class177.method1249((byte) -125, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method2258(1177515464);
                class311 var7;
                if (arg1 == 5) {
                    var7 = new class245(arg2.method2255(-32226));
                } else {
                    var7 = new class166(arg2.method2258(1177515464));
                }
                this.field5464.method835(4, var7, (long) var6);
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method2447(String arg0, int arg1) {
        field5468++;
        if (this.field5464 == null) {
            return false;
        } else if (arg1 == 654) {
            if (this.field5472 == null) {
                this.method2442(-7);
            }
            for (class204 var3 = (class204) this.field5472.method837((byte) -72, class149.method1108((byte) -84, arg0)); var3 != null; var3 = (class204) this.field5472.method838(48)) {
                if (var3.field2898.equals(arg0)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)Z")
    public final boolean method2448(boolean arg0, int arg1) {
        field5469++;
        if (this.field5464 == null) {
            return false;
        }
        if (this.field5472 == null) {
            this.method2451(93);
        }
        class166 var3 = (class166) this.field5472.method837((byte) -72, (long) arg1);
        if (arg0) {
            field5471 = null;
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(I)V")
    public static void method2449(int arg0) {
        field5471 = null;
        field5478 = null;
        field5477 = null;
        if (arg0 != 30636) {
            method2450(-80, 121, -124);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V")
    public static final void method2450(int arg0, int arg1, int arg2) {
        class63 var3 = class341.field4617[arg0][arg1][arg2];
        if (var3 != null && var3.field854 != null) {
            var3.field854 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V")
    private final void method2451(int arg0) {
        this.field5472 = new class109(this.field5464.method834(46));
        int var2 = 56 / ((arg0 + 24) / 60);
        field5462++;
        for (class166 var3 = (class166) this.field5464.method842((byte) -25); var3 != null; var3 = (class166) this.field5464.method836(-123)) {
            class166 var4 = new class166((int) var3.field4226);
            this.field5472.method835(4, var4, (long) var3.field2342);
        }
    }
}
