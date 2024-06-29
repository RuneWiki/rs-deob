import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class243 extends class34 {

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "Lcc;")
    private static class209 field4395 = class95.method669(111, "Loading)3)3)3");

    @OriginalMember(owner = "client!ci", name = "N", descriptor = "Lcc;")
    public static class209 field4408 = class95.method669(101, ")3)3)3");

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "Lcc;")
    private static class209 field4385 = class95.method669(126, "Loaded title screen");

    @OriginalMember(owner = "client!ci", name = "D", descriptor = "Lcc;")
    public static class209 field4398 = class95.method669(86, "::fpsoff");

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "Lcc;")
    public static class209 field4391 = field4395;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "Lcc;")
    public static class209 field4382 = field4385;

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "Lcc;")
    public static class209 field4396 = class95.method669(104, "Mem:");

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public int field4383;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    public int field4386;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public int field4387;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "I")
    public int field4388;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    public int field4389;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    public int field4390;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    public int field4393;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
    public int field4399;

    @OriginalMember(owner = "client!ci", name = "F", descriptor = "I")
    public int field4400;

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "I")
    public int field4403;

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "I")
    public int field4404;

    @OriginalMember(owner = "client!ci", name = "K", descriptor = "I")
    public int field4405;

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "I")
    public int field4406;

    @OriginalMember(owner = "client!ci", name = "M", descriptor = "I")
    public int field4407;

    @OriginalMember(owner = "client!ci", name = "O", descriptor = "I")
    public int field4409;

    @OriginalMember(owner = "client!ci", name = "P", descriptor = "I")
    public int field4410;

    @OriginalMember(owner = "client!ci", name = "R", descriptor = "I")
    public int field4412;

    @OriginalMember(owner = "client!ci", name = "S", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!ci", name = "U", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!ci", name = "V", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!ci", name = "T", descriptor = "Lfd;")
    public class121 field4414;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "Lgl;")
    public class210 field4392;

    @OriginalMember(owner = "client!ci", name = "G", descriptor = "Lsh;")
    public class212 field4401;

    @OriginalMember(owner = "client!ci", name = "Q", descriptor = "Lwd;")
    public class22 field4411;

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "Lra;")
    public static class232 field4397;

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "Lsj;")
    public static class49 field4402;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)I")
    public static final int method1690(int arg0, int arg1) {
        field4384++;
        if (arg0 > -94) {
            field4395 = null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static void method1691(byte arg0) {
        field4402 = null;
        field4385 = null;
        field4398 = null;
        field4408 = null;
        field4382 = null;
        field4396 = null;
        if (arg0 < 35) {
            method1690(-18, 122);
        }
        field4397 = null;
        field4395 = null;
        field4391 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lmi;Lmi;I)V")
    public static final void method1692(class259 arg0, class259 arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        if (arg0.field4668 != null) {
            arg0.method1796(-41);
        }
        arg0.field4668 = arg1;
        arg0.field4674 = arg1.field4674;
        arg0.field4668.field4674 = arg0;
        arg0.field4674.field4668 = arg0;
        field4394++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Llk;I)V")
    public static final void method1693(class81 arg0, int arg1) {
        field4416++;
        arg0.field1503 = false;
        if (arg1 <= 97) {
            return;
        }
        if (arg0.field1551 != -1) {
            class241 var2 = class245.method1706(arg0.field1551, (byte) 119);
            if (var2 == null || var2.field4341 == null) {
                arg0.field1551 = -1;
            } else {
                arg0.field1515++;
                if (arg0.field1519 < var2.field4341.length && var2.field4344[arg0.field1519] < arg0.field1515) {
                    arg0.field1519++;
                    arg0.field1515 = 1;
                    class224.method1577(arg0.field1519, var2, arg0.field1534, arg0.field1571, 128, class223.field4069 == arg0);
                }
                if (var2.field4341.length <= arg0.field1519) {
                    arg0.field1519 = 0;
                    arg0.field1515 = 0;
                    class224.method1577(arg0.field1519, var2, arg0.field1534, arg0.field1571, 128, class223.field4069 == arg0);
                }
            }
        }
        if (arg0.field1517 != -1 && arg0.field1538 <= class163.field2968) {
            int var3 = class259.method1797(101, arg0.field1517).field4122;
            if (var3 == -1) {
                arg0.field1517 = -1;
            } else {
                class241 var4 = class245.method1706(var3, (byte) 124);
                if (var4 == null || var4.field4341 == null) {
                    arg0.field1517 = -1;
                } else {
                    if (arg0.field1547 < 0) {
                        arg0.field1547 = 0;
                        class224.method1577(0, var4, arg0.field1534, arg0.field1571, 128, class223.field4069 == arg0);
                    }
                    arg0.field1568++;
                    if (arg0.field1547 < var4.field4341.length && arg0.field1568 > var4.field4344[arg0.field1547]) {
                        arg0.field1547++;
                        arg0.field1568 = 1;
                        class224.method1577(arg0.field1547, var4, arg0.field1534, arg0.field1571, 128, class223.field4069 == arg0);
                    }
                    if (var4.field4341.length <= arg0.field1547) {
                        arg0.field1517 = -1;
                    }
                }
            }
        }
        if (arg0.field1541 != -1 && arg0.field1539 <= 1) {
            class241 var5 = class245.method1706(arg0.field1541, (byte) 120);
            if (var5.field4345 == 1 && arg0.field1573 > 0 && arg0.field1542 <= class163.field2968 && arg0.field1563 < class163.field2968) {
                arg0.field1539 = 1;
                return;
            }
        }
        if (arg0.field1541 != -1 && arg0.field1539 == 0) {
            class241 var6 = class245.method1706(arg0.field1541, (byte) 122);
            if (var6 == null || var6.field4341 == null) {
                arg0.field1541 = -1;
            } else {
                arg0.field1566++;
                if (arg0.field1521 < var6.field4341.length && var6.field4344[arg0.field1521] < arg0.field1566) {
                    arg0.field1566 = 1;
                    arg0.field1521++;
                    class224.method1577(arg0.field1521, var6, arg0.field1534, arg0.field1571, 128, class223.field4069 == arg0);
                }
                if (var6.field4341.length <= arg0.field1521) {
                    arg0.field1521 -= var6.field4366;
                    arg0.field1506++;
                    if (var6.field4370 <= arg0.field1506) {
                        arg0.field1541 = -1;
                    } else if (arg0.field1521 >= 0 && arg0.field1521 < var6.field4341.length) {
                        class224.method1577(arg0.field1521, var6, arg0.field1534, arg0.field1571, 128, class223.field4069 == arg0);
                    } else {
                        arg0.field1541 = -1;
                    }
                }
                arg0.field1503 = var6.field4353;
            }
        }
        if (arg0.field1539 > 0) {
            arg0.field1539--;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)V")
    public static final void method1694(byte arg0) {
        if (class226.field4117 != null) {
            class2 var1 = class226.field4117;
            synchronized (class226.field4117) {
                class226.field4117 = null;
            }
        }
        field4413++;
        if (arg0 != -31) {
            method1691((byte) 122);
        }
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)V")
    public final void method1695(int arg0) {
        this.field4411 = null;
        this.field4414 = null;
        this.field4392 = null;
        this.field4401 = null;
        if (arg0 != 0) {
            this.method1695(-118);
        }
        field4415++;
    }
}
