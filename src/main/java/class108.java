import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class108 {

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public int field1443 = 16777215;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public int field1447 = 0;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public int field1442 = 0;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    private int field1453 = -1;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public int field1448 = 70;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public int field1450 = 0;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public int field1440 = -1;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "Ljava/lang/String;")
    private String field1455 = "";

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public int field1458 = -1;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    private int field1459 = -1;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    private int field1444 = -1;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    private int field1460 = -1;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public int field1452 = -1;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "Z")
    public static boolean field1446 = false;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "[Lkaa;")
    public static class583[] field1461 = new class583[300];

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "Lvq;")
    public class512 field1449;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILha;)Lfd;", line = 4)
    public final class298 method700(int arg0, class548 arg1) {
        field1451++;
        int var3 = -83 % ((arg0 + 15) / 33);
        if (this.field1460 < 0) {
            return null;
        }
        class298 var4 = (class298) this.field1449.field7080.method3898((byte) -42, (long) this.field1460);
        if (var4 == null) {
            this.method706(false, arg1);
            var4 = (class298) this.field1449.field7080.method3898((byte) -42, (long) this.field1460);
        }
        return var4;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Ljava/lang/String;", line = 29)
    public final String method701(int arg0, int arg1) {
        if (arg1 > 0) {
            this.method706(true, null);
        }
        field1456++;
        String var3 = this.field1455;
        while (true) {
            int var4 = var3.indexOf("%1");
            if (var4 < 0) {
                return var3;
            }
            var3 = var3.substring(0, var4) + class378.method2368(arg0, false, (byte) -85) + var3.substring(var4 + 2);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(ILha;)Lfd;", line = 53)
    public final class298 method702(int arg0, class548 arg1) {
        field1445++;
        if (this.field1444 < 0) {
            return null;
        } else if (arg0 >= -100) {
            return null;
        } else {
            class298 var3 = (class298) this.field1449.field7080.method3898((byte) -42, (long) this.field1444);
            if (var3 == null) {
                this.method706(false, arg1);
                var3 = (class298) this.field1449.field7080.method3898((byte) -42, (long) this.field1444);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ldc;II)V", line = 77)
    private final void method703(class63 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field1458 = arg0.method482(-772591672);
        } else if (arg2 == 2) {
            this.field1443 = arg0.method476((byte) -66);
        } else if (arg2 == 3) {
            this.field1444 = arg0.method482(-772591672);
        } else if (arg2 == 4) {
            this.field1453 = arg0.method482(-772591672);
        } else if (arg2 == 5) {
            this.field1459 = arg0.method482(-772591672);
        } else if (arg2 == 6) {
            this.field1460 = arg0.method482(-772591672);
        } else if (arg2 == 7) {
            this.field1442 = arg0.method496(-97);
        } else if (arg2 == 8) {
            this.field1455 = arg0.method477(true);
        } else if (arg2 == 9) {
            this.field1448 = arg0.method482(-772591672);
        } else if (arg2 == 10) {
            this.field1450 = arg0.method496(arg1 ^ 0xFFFF89B2);
        } else if (arg2 == 11) {
            this.field1440 = 0;
        } else if (arg2 == 12) {
            this.field1452 = arg0.method505((byte) -119);
        } else if (arg2 == 13) {
            this.field1447 = arg0.method496(arg1 ^ 0xFFFF89B9);
        } else if (arg2 == 14) {
            this.field1440 = arg0.method482(-772591672);
        }
        if (arg1 != 30215) {
            this.field1458 = -13;
        }
        field1441++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V", line = 145)
    public static void method704(boolean arg0) {
        if (!arg0) {
            field1446 = true;
        }
        field1461 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLdc;)V", line = 155)
    public final void method705(byte arg0, class63 arg1) {
        while (true) {
            int var3 = arg1.method505((byte) -119);
            if (var3 == 0) {
                if (arg0 >= -92) {
                    return;
                }
                field1457++;
                return;
            }
            this.method703(arg1, 30215, var3);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZLha;)V", line = 187)
    private final void method706(boolean arg0, class548 arg1) {
        field1454++;
        if (arg0) {
            this.method708(-80, null);
        }
        class237 var3 = this.field1449.field7079;
        if (this.field1444 >= 0 && this.field1449.field7080.method3898((byte) -42, (long) this.field1444) == null && var3.method1578(this.field1444, (byte) -81)) {
            class52 var4 = class52.method382(var3, this.field1444);
            this.field1449.field7080.method3899(-70, arg1.method1496(var4, true), (long) this.field1444);
        }
        if (this.field1459 >= 0 && this.field1449.field7080.method3898((byte) -42, (long) this.field1459) == null && var3.method1578(this.field1459, (byte) -81)) {
            class52 var5 = class52.method382(var3, this.field1459);
            this.field1449.field7080.method3899(40, arg1.method1496(var5, true), (long) this.field1459);
        }
        if (this.field1453 >= 0 && this.field1449.field7080.method3898((byte) -42, (long) this.field1453) == null && var3.method1578(this.field1453, (byte) -81)) {
            class52 var6 = class52.method382(var3, this.field1453);
            this.field1449.field7080.method3899(-110, arg1.method1496(var6, true), (long) this.field1453);
        }
        if (this.field1460 >= 0 && this.field1449.field7080.method3898((byte) -42, (long) this.field1460) == null && var3.method1578(this.field1460, (byte) -81)) {
            class52 var7 = class52.method382(var3, this.field1460);
            this.field1449.field7080.method3899(123, arg1.method1496(var7, true), (long) this.field1460);
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(ILha;)Lfd;", line = 266)
    public final class298 method707(int arg0, class548 arg1) {
        field1439++;
        if (arg0 > this.field1459) {
            return null;
        }
        class298 var3 = (class298) this.field1449.field7080.method3898((byte) -42, (long) this.field1459);
        if (var3 == null) {
            this.method706(false, arg1);
            var3 = (class298) this.field1449.field7080.method3898((byte) -42, (long) this.field1459);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(ILha;)Lfd;", line = 287)
    public final class298 method708(int arg0, class548 arg1) {
        field1438++;
        if (arg0 != -20858) {
            this.method707(114, null);
        }
        if (this.field1453 < 0) {
            return null;
        }
        class298 var3 = (class298) this.field1449.field7080.method3898((byte) -42, (long) this.field1453);
        if (var3 == null) {
            this.method706(false, arg1);
            var3 = (class298) this.field1449.field7080.method3898((byte) -42, (long) this.field1453);
        }
        return var3;
    }
}
