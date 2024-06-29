import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public abstract class class92 {

    @OriginalMember(owner = "client!rda", name = "m", descriptor = "Lnd;")
    public class632 field1635;

    @OriginalMember(owner = "client!rda", name = "i", descriptor = "Luaa;")
    public static class395 field1631 = new class395(20);

    @OriginalMember(owner = "client!rda", name = "l", descriptor = "Z")
    public static boolean field1634 = false;

    @OriginalMember(owner = "client!rda", name = "n", descriptor = "Liu;")
    public static class517 field1636 = new class517(30, 0);

    @OriginalMember(owner = "client!rda", name = "o", descriptor = "Lbv;")
    public static class567 field1637 = new class567("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!rda", name = "j", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!rda", name = "p", descriptor = "Lgr;")
    public static class524 field1638;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)V", line = 3)
    public void method812(byte arg0) {
        if (arg0 == -31) {
            field1633++;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lbda;III)V", line = 16)
    public static final void method813(class400 arg0, int arg1, int arg2, int arg3) {
        if (arg3 > -74) {
            return;
        }
        field1630++;
        if (arg0.field1514 == arg1 && arg1 != -1) {
            class439 var4 = class49.field739.method2297((byte) 106, arg1);
            int var5 = var4.field6396;
            if (var5 == 1) {
                arg0.field1519 = arg2;
                arg0.field1511 = 0;
                arg0.field1537 = 1;
                arg0.field1488 = 0;
                arg0.field1506 = 0;
                class402.method2456(class644.field9367 == arg0, arg0.field5109, arg0.field1511, var4, (byte) -23, arg0.field5108, arg0.field5116);
            }
            if (var5 == 2) {
                arg0.field1488 = 0;
                return;
            }
        } else if (arg1 == -1 || arg0.field1514 == -1 || class49.field739.method2297((byte) 116, arg1).field6408 >= class49.field739.method2297((byte) 106, arg0.field1514).field6408) {
            arg0.field1488 = 0;
            arg0.field1519 = arg2;
            arg0.field1537 = 1;
            arg0.field1576 = arg0.field1567;
            arg0.field1514 = arg1;
            arg0.field1506 = 0;
            arg0.field1511 = 0;
            if (arg0.field1514 == -1) {
                return;
            }
            class402.method2456(class644.field9367 == arg0, arg0.field5109, arg0.field1511, class49.field739.method2297((byte) 118, arg0.field1514), (byte) -23, arg0.field5108, arg0.field5116);
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)V", line = 65)
    public void method814(int arg0) {
        if (arg0 == 2) {
            field1627++;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lgp;ZLqa;)V", line = 76)
    public static final void method815(class561 arg0, boolean arg1, class167 arg2) {
        field1626++;
        if (class349.field4995) {
            return;
        }
        arg2.method121(0);
        class214.field3242 = arg2.method548(class518.method2917(arg0, class400.field5989), true);
        class214.field3242.method953((class68.field1285 - class214.field3242.method955()) / 2, (class442.field6464 - class214.field3242.method960()) / 2);
        class477.field6821 = arg2.method548(class518.method2917(arg0, class605.field8617), arg1);
        class477.field6821.method953((class68.field1285 - class477.field6821.method955()) / 2, 18);
        class349.field4995 = true;
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)V", line = 98)
    public void method816(int arg0) {
        field1628++;
        if (arg0 != 1) {
            field1636 = null;
        }
    }

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "(I)V", line = 108)
    public void method817(int arg0) {
        if (arg0 < -66) {
            field1629++;
        }
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(B)V", line = 119)
    public static void method818(byte arg0) {
        if (arg0 >= -93) {
            method813(null, -92, 69, 81);
        }
        field1637 = null;
        field1636 = null;
        field1631 = null;
        field1638 = null;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(BZ)V", line = 133)
    public static final void method819(byte arg0, boolean arg1) {
        field1625++;
        if (arg0 > -2) {
            field1636 = null;
        }
        while (class52.field761.method1661(class541.field7525, -1672) >= 15) {
            int var2 = class52.field761.method1660(124, 15);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            class181 var4 = (class181) class432.field6368.method740(0, (long) var2);
            if (var4 == null) {
                class170 var5 = new class170();
                var5.field1555 = var2;
                var4 = new class181(var5);
                class432.field6368.method737((long) var2, (byte) 92, var4);
                var3 = true;
                class629.field8848[class313.field4570++] = var4;
            }
            class170 var6 = var4.field2623;
            class591.field8401[class128.field2098++] = var2;
            var6.field1560 = class310.field4553;
            if (var6.field2492 != null && var6.field2492.method2573(109)) {
                class440.method2602((byte) 108, var6);
            }
            int var7;
            if (arg1) {
                var7 = class52.field761.method1660(36, 8);
                if (var7 > 127) {
                    var7 -= 256;
                }
            } else {
                var7 = class52.field761.method1660(56, 5);
                if (var7 > 15) {
                    var7 -= 32;
                }
            }
            int var8 = (class52.field761.method1660(-126, 3) + 4 & 0xCC400007) << 11;
            int var9 = class52.field761.method1660(-127, 2);
            var6.method1177(class204.field2882.method287(class52.field761.method1660(39, 14), 8), (byte) 118);
            int var10 = class52.field761.method1660(-128, 1);
            int var11;
            if (arg1) {
                var11 = class52.field761.method1660(-128, 8);
                if (var11 > 127) {
                    var11 -= 256;
                }
            } else {
                var11 = class52.field761.method1660(123, 5);
                if (var11 > 15) {
                    var11 -= 32;
                }
            }
            int var12 = class52.field761.method1660(-126, 1);
            if (var12 == 1) {
                class513.field7105[class601.field8529++] = var2;
            }
            var6.method776((byte) -112, var6.field2492.field6337);
            var6.field1550 = var6.field2492.field6350 << 3;
            if (var3) {
                var6.method771(0, var8, true);
            }
            var6.method1182(var10 == 1, var9, class644.field9367.field1571[0] + var7, class644.field9367.field1572[0] + var11, var6.method781((byte) 113), -1);
            if (var6.field2492.method2573(-110)) {
                class589.method3371(var6.field1571[0], 0, null, var6.field1572[0], var6.field5116, null, (byte) -54, var6);
            }
        }
        class52.field761.method1668((byte) -40);
    }

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "(B)V", line = 238)
    public void method820(byte arg0) {
        if (arg0 >= -122) {
            field1638 = null;
        }
        field1623++;
    }

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "(I)V", line = 251)
    public void method821(int arg0) {
        field1632++;
        if (arg0 != 1) {
            field1638 = null;
        }
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Lnd;)V", line = 269)
    public class92(class632 arg0) {
        this.field1635 = arg0;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZII)V")
    public abstract void method675(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)Z")
    public abstract boolean method673(int arg0);

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZI)V")
    public abstract void method676(boolean arg0, int arg1);

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(B)V")
    public abstract void method669(byte arg0);

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZB)V")
    public abstract void method671(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IILqv;)V")
    public abstract void method672(int arg0, int arg1, class96 arg2);
}
