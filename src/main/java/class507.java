import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class507 {

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "Ljava/lang/String;")
    private String field7076 = "null";

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field7075 = -1;

    @OriginalMember(owner = "client!iu", name = "s", descriptor = "Lbfa;")
    public static class574 field7091 = new class574();

    @OriginalMember(owner = "client!iu", name = "o", descriptor = "C")
    public char field7087;

    @OriginalMember(owner = "client!iu", name = "p", descriptor = "C")
    public char field7088;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "I")
    public static int field7079;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
    public static int field7080;

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "I")
    private int field7082;

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!iu", name = "m", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!iu", name = "n", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!iu", name = "r", descriptor = "I")
    public static int field7090;

    @OriginalMember(owner = "client!iu", name = "q", descriptor = "Lgca;")
    private class209 field7089;

    @OriginalMember(owner = "client!iu", name = "t", descriptor = "Lgca;")
    public class209 field7092;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 3)
    public final String method3023(byte arg0, int arg1) {
        field7085++;
        if (this.field7092 == null) {
            return this.field7076;
        }
        if (arg0 < 40) {
            this.field7089 = null;
        }
        class407 var3 = (class407) this.field7092.method1381(true, (long) arg1);
        return var3 == null ? this.field7076 : var3.field5650;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B[[[Lch;)V", line = 26)
    public static final void method3024(byte arg0, class38[][][] arg1) {
        if (arg0 != -75) {
            return;
        }
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class38[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class38 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field532 instanceof class649) {
                            ((class649) var6.field532).method279((byte) -113);
                        }
                        if (var6.field542 instanceof class649) {
                            ((class649) var6.field542).method279((byte) -50);
                        }
                        if (var6.field533 instanceof class649) {
                            ((class649) var6.field533).method279((byte) -100);
                        }
                        if (var6.field539 instanceof class649) {
                            ((class649) var6.field539).method279((byte) -8);
                        }
                        if (var6.field540 instanceof class649) {
                            ((class649) var6.field540).method279((byte) -45);
                        }
                        for (class590 var7 = var6.field538; var7 != null; var7 = var7.field8467) {
                            class743 var8 = var7.field8468;
                            if (var8 instanceof class649) {
                                ((class649) var8).method279((byte) -102);
                            }
                        }
                    }
                }
            }
        }
        field7080++;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(BLjava/awt/Component;)Lrl;", line = 101)
    public static final class232 method3025(byte arg0, Component arg1) {
        field7084++;
        return arg0 < 61 ? null : new class47(arg1);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lpaa;ZLpaa;)V", line = 112)
    public static final void method3026(class712 arg0, boolean arg1, class712 arg2) {
        field7077++;
        class270.field3642++;
        class120 var3 = class292.method1716(class608.field8668, true, class555.field7839);
        var3.field1653.method199(arg1, arg2.field9998);
        var3.field1653.method154(false, arg0.field10026);
        var3.field1653.method147((byte) 53, arg2.field9953);
        var3.field1653.method142(arg0.field9953, 5);
        var3.field1653.method175(arg2.field10026, -16904);
        var3.field1653.method152(arg0.field9998, 127);
        class471.method2805(106, var3);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V", line = 129)
    public static final void method3027(int arg0) {
        if (arg0 != -1) {
            field7091 = null;
        }
        class647.field9171 = true;
        field7074++;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Z)V", line = 140)
    private final void method3028(boolean arg0) {
        if (arg0) {
            return;
        }
        field7078++;
        this.field7089 = new class209(this.field7092.method1379(!arg0));
        for (class407 var2 = (class407) this.field7092.method1382(27901); var2 != null; var2 = (class407) this.field7092.method1383(false)) {
            class86 var3 = new class86(var2.field5650, (int) var2.field7166);
            this.field7089.method1387(var3, class552.method3295(var2.field5650, !arg0), (byte) -127);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)Z", line = 167)
    public final boolean method3029(int arg0, int arg1) {
        if (arg0 >= -19) {
            this.method3031(-35, (byte) -37, null);
        }
        field7073++;
        if (this.field7092 == null) {
            return false;
        }
        if (this.field7089 == null) {
            this.method3034(0);
        }
        class285 var3 = (class285) this.field7089.method1381(true, (long) arg1);
        return var3 != null;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lvj;I)V", line = 192)
    public final void method3030(class26 arg0, int arg1) {
        field7090++;
        while (true) {
            int var3 = arg0.method194((byte) 119);
            if (var3 == 0) {
                if (arg1 == 5) {
                    return;
                } else {
                    method3025((byte) -32, null);
                    return;
                }
            }
            this.method3031(var3, (byte) -116, arg0);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IBLvj;)V", line = 212)
    private final void method3031(int arg0, byte arg1, class26 arg2) {
        field7081++;
        if (arg0 == 1) {
            this.field7087 = class503.method3005(true, arg2.method195(128));
        } else if (arg0 == 2) {
            this.field7088 = class503.method3005(true, arg2.method195(128));
        } else if (arg0 == 3) {
            this.field7076 = arg2.method196((byte) -92);
        } else if (arg0 == 4) {
            this.field7082 = arg2.method189(255);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg2.method193(2);
            this.field7092 = new class209(class670.method3834(var4, 23538));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method189(255);
                class513 var7;
                if (arg0 == 5) {
                    var7 = new class407(arg2.method196((byte) -92));
                } else {
                    var7 = new class285(arg2.method189(255));
                }
                this.field7092.method1387(var7, (long) var6, (byte) -113);
            }
        }
        if (arg1 > -84) {
            this.method3023((byte) 116, 6);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 275)
    public final boolean method3032(String arg0, int arg1) {
        field7086++;
        if (this.field7092 == null) {
            return false;
        }
        if (this.field7089 == null) {
            this.method3028(false);
        }
        if (arg1 != 2) {
            method3026(null, false, null);
        }
        for (class86 var3 = (class86) this.field7089.method1381(true, class552.method3295(arg0, true)); var3 != null; var3 = (class86) this.field7089.method1391(-1)) {
            if (var3.field1188.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(BI)I", line = 303)
    public final int method3033(byte arg0, int arg1) {
        field7083++;
        if (this.field7092 == null) {
            return this.field7082;
        }
        class285 var3 = (class285) this.field7092.method1381(true, (long) arg1);
        if (var3 == null) {
            return this.field7082;
        } else {
            if (arg0 >= -80) {
                this.method3034(115);
            }
            return var3.field3770;
        }
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)V", line = 328)
    private final void method3034(int arg0) {
        field7079++;
        this.field7089 = new class209(this.field7092.method1379(true));
        if (arg0 != 0) {
            this.field7087 = '>';
        }
        for (class285 var2 = (class285) this.field7092.method1382(27901); var2 != null; var2 = (class285) this.field7092.method1383(false)) {
            class285 var3 = new class285((int) var2.field7166);
            this.field7089.method1387(var3, (long) var2.field3770, (byte) -114);
        }
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(Z)V", line = 353)
    public static void method3035(boolean arg0) {
        field7091 = null;
        if (!arg0) {
            method3035(false);
        }
    }
}
