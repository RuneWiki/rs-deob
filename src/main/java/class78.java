import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class78 extends class114 {

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "Lia;")
    public static class257 field1500 = class28.method234(103, "gelb:");

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "[[[Lsf;")
    public static class33[][][] field1499 = new class33[4][104][104];

    @OriginalMember(owner = "client!kj", name = "X", descriptor = "[Z")
    public static boolean[] field1511 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!kj", name = "ab", descriptor = "Lia;")
    private static class257 field1514 = class28.method234(-69, "slide:");

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "Lia;")
    public static class257 field1495 = field1514;

    @OriginalMember(owner = "client!kj", name = "eb", descriptor = "J")
    public static long field1518 = 0L;

    @OriginalMember(owner = "client!kj", name = "cb", descriptor = "Lme;")
    public static class44 field1516 = null;

    @OriginalMember(owner = "client!kj", name = "db", descriptor = "I")
    public static int field1517 = 0;

    @OriginalMember(owner = "client!kj", name = "W", descriptor = "Lia;")
    private static class257 field1510 = class28.method234(-7, "skill)2");

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "Lia;")
    public static class257 field1496 = field1510;

    @OriginalMember(owner = "client!kj", name = "V", descriptor = "Lia;")
    public static class257 field1509 = field1514;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!kj", name = "S", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!kj", name = "T", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!kj", name = "U", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!kj", name = "Y", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!kj", name = "bb", descriptor = "Lmb;")
    public static class178 field1515;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "Lvb;")
    public static class226 field1505;

    @OriginalMember(owner = "client!kj", name = "Z", descriptor = "Lsc;")
    private class56 field1513;

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "Ln;")
    public static class61 field1504;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)V")
    public static void method568(byte arg0) {
        field1511 = null;
        field1499 = null;
        field1514 = null;
        if (arg0 != 42) {
            return;
        }
        field1505 = null;
        field1496 = null;
        field1504 = null;
        field1495 = null;
        field1516 = null;
        field1500 = null;
        field1510 = null;
        field1509 = null;
        field1515 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILk;I)Lia;")
    public static final class257 method569(int arg0, class152 arg1, int arg2) {
        field1503++;
        try {
            if (arg2 >= 0) {
                field1518 = -60L;
            }
            class257 var3 = new class257();
            var3.field4447 = arg1.method1055(-32768);
            if (arg0 < var3.field4447) {
                var3.field4447 = arg0;
            }
            var3.field4407 = new byte[var3.field4447];
            arg1.field2677 += class171.field2941.method853(arg1.field2677, arg1.field2638, (byte) -101, var3.field4447, var3.field4407, 0);
            return var3;
        } catch (Exception var4) {
            return class24.field474;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V")
    public static final void method570(boolean arg0) {
        if (class182.field3175 != null) {
            class182.field3175.method624(103);
        }
        field1512++;
        if (class79.field1543 != null) {
            class79.field1543.method624(96);
        }
        class12.method127(2, class2.field45, (byte) 99, 22050);
        class182.field3175 = class105.method762(-1, class156.field2728, 22050, class72.field1404, 0);
        class182.field3175.method622(arg0, class136.field2436);
        class79.field1543 = class105.method762(-1, class156.field2728, 2048, class72.field1404, 1);
        class79.field1543.method622(false, field1504);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZLk;I)V")
    private final void method571(boolean arg0, class152 arg1, int arg2) {
        if (arg2 == 249) {
            int var4 = arg1.method1051((byte) -34);
            if (this.field1513 == null) {
                int var5 = class105.method760((byte) 120, var4);
                this.field1513 = new class56(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method1051((byte) 98) == 1;
                int var8 = arg1.method1064((byte) -121);
                class30 var9;
                if (var7) {
                    var9 = new class129(arg1.method1039(1995));
                } else {
                    var9 = new class220(arg1.method1042(123));
                }
                this.field1513.method424(var9, (byte) -40, (long) var8);
            }
        }
        if (arg0) {
            field1517 = 54;
        }
        field1497++;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BILia;)Lia;")
    public final class257 method572(byte arg0, int arg1, class257 arg2) {
        field1507++;
        if (arg0 > -115) {
            return null;
        } else if (this.field1513 == null) {
            return arg2;
        } else {
            class129 var4 = (class129) this.field1513.method434((byte) -93, (long) arg1);
            return var4 == null ? arg2 : var4.field2311;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLk;)V")
    public final void method573(byte arg0, class152 arg1) {
        while (true) {
            int var3 = arg1.method1051((byte) 102);
            if (var3 == 0) {
                if (arg0 > -12) {
                    field1510 = null;
                }
                field1502++;
                return;
            }
            this.method571(false, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lia;IZ)V")
    public static final void method574(class257 arg0, int arg1, boolean arg2) {
        field1501++;
        if (arg2) {
            try {
                class239.field4113.getAppletContext().showDocument(arg0.method1695(class239.field4113.getCodeBase(), 7464), "_blank");
            } catch (Exception var4) {
            }
        } else {
            try {
                class239.field4113.getAppletContext().showDocument(arg0.method1695(class239.field4113.getCodeBase(), 7464), "_top");
            } catch (Exception var3) {
            }
        }
        if (arg1 < 7) {
            field1500 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(II)I")
    public static final int method575(int arg0, int arg1) {
        field1506++;
        if (arg0 < 50) {
            method570(false);
        }
        return arg1 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)I")
    public final int method576(int arg0, int arg1, int arg2) {
        field1498++;
        if (this.field1513 == null) {
            return arg2;
        }
        if (arg0 != -6983) {
            field1499 = null;
        }
        class220 var4 = (class220) this.field1513.method434((byte) -93, (long) arg1);
        return var4 == null ? arg2 : var4.field3726;
    }
}
