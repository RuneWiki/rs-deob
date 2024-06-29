import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class101 implements class775 {

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "Lrm;")
    private class433 field1635;

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "[Lef;")
    private class515[] field1638;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "Lha;")
    private class66 field1627;

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "Z")
    private boolean field1633;

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "[[Z")
    public static boolean[][] field1642;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "[[[B")
    public static byte[][][] field1628;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lgv;BLgv;)V")
    public static final void method874(class90 arg0, byte arg1, class90 arg2) {
        field1632++;
        if (arg2.field1366 != null) {
            arg2.method731((byte) 39);
        }
        arg2.field1366 = arg0.field1366;
        arg2.field1364 = arg0;
        if (arg1 != 121) {
            field1642 = null;
        }
        arg2.field1366.field1364 = arg2;
        arg2.field1364.field1366 = arg2;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIBII)V")
    public static final void method875(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg4 <= class706.field9700 && arg2 >= class223.field3260) {
            boolean var6;
            if (arg1 < class268.field3766) {
                arg1 = class268.field3766;
                var6 = false;
            } else if (arg1 > class236.field3392) {
                var6 = false;
                arg1 = class236.field3392;
            } else {
                var6 = true;
            }
            boolean var7;
            if (class268.field3766 > arg0) {
                var7 = false;
                arg0 = class268.field3766;
            } else if (class236.field3392 < arg0) {
                var7 = false;
                arg0 = class236.field3392;
            } else {
                var7 = true;
            }
            if (class223.field3260 > arg4) {
                arg4 = class223.field3260;
            } else {
                class679.method3826(class298.field4105[arg4++], arg0, 11, arg1, arg5);
            }
            if (arg2 <= class706.field9700) {
                class679.method3826(class298.field4105[arg2--], arg0, 11, arg1, arg5);
            } else {
                arg2 = class706.field9700;
            }
            if (var6 && var7) {
                for (int var8 = arg4; var8 <= arg2; var8++) {
                    int[] var9 = class298.field4105[var8];
                    var9[arg1] = var9[arg0] = arg5;
                }
            } else if (var6) {
                for (int var11 = arg4; var11 <= arg2; var11++) {
                    class298.field4105[var11][arg1] = arg5;
                }
            } else if (var7) {
                for (int var10 = arg4; var10 <= arg2; var10++) {
                    class298.field4105[var10][arg0] = arg5;
                }
            }
        }
        if (arg3 != -79) {
            method884(24, -9, 80);
        }
        field1643++;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)I")
    public final int method876(boolean arg0) {
        field1636++;
        int var2 = 0;
        if (!arg0) {
            return 105;
        }
        class515[] var3 = this.field1638;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class515 var5 = var3[var4];
            if (var5 == null || var5.method1789((byte) 29)) {
                var2++;
            }
        }
        return var2 * 100 / this.field1638.length;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(JB)Z")
    public final boolean method877(long arg0, byte arg1) {
        if (arg1 == -58) {
            field1629++;
            return class197.method1423(1) >= arg0 + ((long) this.field1635.field5893);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)V")
    public static void method878(byte arg0) {
        int var1 = -64 % ((arg0 - 22) / 43);
        field1628 = null;
        field1642 = null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZZ)V")
    public final void method879(boolean arg0, boolean arg1) {
        field1637++;
        boolean var3 = true;
        class515[] var4 = this.field1638;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class515 var6 = var4[var5];
            if (var6 != null) {
                var6.method1102(var3 || this.field1633, 1164);
            }
        }
        this.field1633 = arg0;
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)V")
    public final void method880(int arg0) {
        field1640++;
        int var2 = 34 / ((-arg0 - 86) / 35);
        if (class95.field1472 != this.field1627) {
            this.field1633 = true;
            this.field1627 = class95.field1472;
        }
        this.field1627.method536(0);
        class515[] var3 = this.field1638;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class515 var5 = var3[var4];
            if (var5 != null) {
                var5.method1790(6187);
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)I")
    public final int method881(int arg0) {
        if (arg0 == -10641) {
            field1634++;
            return this.field1635.field5895;
        } else {
            return 126;
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V")
    public final void method882(int arg0) {
        if (arg0 != 14289) {
            this.field1635 = null;
        }
        field1631++;
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(B)V")
    public static final void method883(byte arg0) {
        field1641++;
        if (arg0 == -83) {
            class197.field2993.method273(127);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)V")
    public static final void method884(int arg0, int arg1, int arg2) {
        field1630++;
        if (arg2 != 221) {
            field1642 = null;
        }
        class281 var3 = class54.method395((byte) -53, (long) arg0, 17);
        var3.method1821((byte) 90);
        var3.field3910 = arg1;
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lrm;Lhea;)V")
    public class101(class433 arg0, class447 arg1) {
        this.field1635 = arg0;
        this.field1638 = new class515[this.field1635.field5890.length];
        for (int var3 = 0; var3 < this.field1638.length; var3++) {
            this.field1638[var3] = arg1.method2597(110, this.field1635.field5890[var3]);
        }
    }

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "(I)V")
    public static final void method885(int arg0) {
        if (class742.field10231.toLowerCase().indexOf("microsoft") == -1) {
            class414.field5667[59] = 57;
            class414.field5667[92] = 74;
            class414.field5667[61] = 27;
            class414.field5667[47] = 73;
            if (class742.field10246 == null) {
                class414.field5667[222] = 59;
                class414.field5667[192] = 58;
            } else {
                class414.field5667[192] = 28;
                class414.field5667[520] = 59;
                class414.field5667[222] = 58;
            }
            class414.field5667[45] = 26;
            class414.field5667[46] = 72;
            class414.field5667[44] = 71;
            class414.field5667[93] = 43;
            class414.field5667[91] = 42;
        } else {
            class414.field5667[192] = 58;
            class414.field5667[223] = 28;
            class414.field5667[219] = 42;
            class414.field5667[221] = 43;
            class414.field5667[187] = 27;
            class414.field5667[190] = 72;
            class414.field5667[220] = 74;
            class414.field5667[191] = 73;
            class414.field5667[188] = 71;
            class414.field5667[186] = 57;
            class414.field5667[222] = 59;
            class414.field5667[189] = 26;
        }
        field1639++;
        if (arg0 != 190) {
            method874(null, (byte) -113, null);
        }
    }
}
