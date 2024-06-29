import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class287 extends class62 implements class282 {

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
    private int field4511 = 50;

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "Z")
    private boolean field4506 = false;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "Luf;")
    private class176 field4521;

    @OriginalMember(owner = "client!uj", name = "H", descriptor = "Luf;")
    private class176 field4519;

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "Lsc;")
    private class256 field4508;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "Lsc;")
    private class256 field4505;

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
    public static int field4518 = 0;

    @OriginalMember(owner = "client!uj", name = "L", descriptor = "Lta;")
    public static class262 field4523 = new class262(64);

    @OriginalMember(owner = "client!uj", name = "M", descriptor = "Lta;")
    public static class262 field4524 = new class262(4);

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!uj", name = "A", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!uj", name = "D", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!uj", name = "E", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!uj", name = "F", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!uj", name = "I", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!uj", name = "N", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!uj", name = "P", descriptor = "Lqd;")
    public static class3 field4527;

    @OriginalMember(owner = "client!uj", name = "O", descriptor = "Lhj;")
    public static class72 field4526;

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Luf;Luf;Luf;IZ)V")
    public class287(class176 arg0, class176 arg1, class176 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field4521 = arg2;
        this.field4519 = arg0;
        this.field4511 = arg3;
        this.field4506 = arg4;
        this.field4508 = new class256(this.field4511);
        this.field4505 = null;
    }

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "(II)V")
    public final void method1927(int arg0, int arg1) {
        field4512++;
        if (arg1 >= -68) {
            method1928(false, 60);
        }
        for (class101 var3 = (class101) this.field4508.method1707(6709); var3 != null; var3 = (class101) this.field4508.method1699(-78)) {
            if (var3.field1624) {
                var3.method778(arg0);
                var3.field1624 = false;
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZ)Z")
    public final boolean method1895(int arg0, boolean arg1) {
        field4507++;
        if (this.field4506 || this.method498(542, arg0).field3906) {
            return true;
        } else if (arg1) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZFIZ)La;")
    public final class49 method1896(int arg0, boolean arg1, float arg2, int arg3, boolean arg4) {
        if (arg1) {
            this.method1894(82, -16);
        }
        class101 var6 = this.method1930(arg3, true);
        field4515++;
        if (var6 != null && var6.method777(this, this.field4521)) {
            return arg4 ? var6.field1621.method785(arg0, this, 0, this.field4521, false, (double) arg2, arg0) : var6.field1621.method790(this.field4521, (double) arg2, this, arg0, false, arg0, 0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)I")
    public static final int method1928(boolean arg0, int arg1) {
        field4503++;
        if (!arg0) {
            field4518 = -51;
        }
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public final void method1929(int arg0) {
        field4516++;
        this.field4508.method1700(120);
        if (this.field4505 != null) {
            this.field4505.method1700(125);
        }
        if (arg0 != 4) {
            this.method1929(110);
        }
        class101.field1619 = null;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(IZ)Lpk;")
    private final class101 method1930(int arg0, boolean arg1) {
        field4504++;
        class101 var3 = (class101) this.field4508.method1701(false, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field4519.method1163(arg0, 0, 48);
        if (var4 == null) {
            return null;
        } else {
            class101 var5 = new class101(new class37(var4));
            this.field4508.method1704((long) arg0, var5, arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lag;Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1931(class188 arg0, String arg1, byte arg2) {
        if (arg2 < 14) {
            return null;
        }
        field4509++;
        if (arg1.indexOf("%") == -1) {
            return arg1;
        }
        while (true) {
            int var3 = arg1.indexOf("%1");
            if (var3 == -1) {
                while (true) {
                    int var4 = arg1.indexOf("%2");
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg1.indexOf("%3");
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg1.indexOf("%4");
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg1.indexOf("%5");
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg1.indexOf("%dns");
                                                    if (var8 == -1) {
                                                        return arg1;
                                                    }
                                                    String var9 = "";
                                                    if (class55.field854 != null) {
                                                        if (class55.field854.field3831 == null) {
                                                            var9 = class204.method1370(false, class55.field854.field3833);
                                                        } else {
                                                            var9 = (String) class55.field854.field3831;
                                                        }
                                                    }
                                                    arg1 = arg1.substring(0, var8) + var9 + arg1.substring(var8 + 4);
                                                }
                                            }
                                            arg1 = arg1.substring(0, var7) + class123.method887(-78, class1.method2(4, arg0, -72)) + arg1.substring(var7 + 2);
                                        }
                                    }
                                    arg1 = arg1.substring(0, var6) + class123.method887(-112, class1.method2(3, arg0, 123)) + arg1.substring(var6 + 2);
                                }
                            }
                            arg1 = arg1.substring(0, var5) + class123.method887(50, class1.method2(2, arg0, 97)) + arg1.substring(var5 + 2);
                        }
                    }
                    arg1 = arg1.substring(0, var4) + class123.method887(77, class1.method2(1, arg0, 113)) + arg1.substring(var4 + 2);
                }
            }
            arg1 = arg1.substring(0, var3) + class123.method887(75, class1.method2(0, arg0, -26)) + arg1.substring(var3 + 2);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BI)Z")
    public final boolean method1892(byte arg0, int arg1) {
        field4522++;
        if (arg0 != -33) {
            field4526 = null;
        }
        return this.method498(542, arg1).field3914;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BIF)[I")
    public final int[] method1897(byte arg0, int arg1, float arg2) {
        field4520++;
        class101 var4 = this.method1930(arg1, true);
        if (var4 == null) {
            return null;
        } else {
            int var5 = 30 % ((arg0 + 54) / 34);
            var4.field1624 = true;
            return var4.method780(this, this.field4521, arg2, this.field4506 || this.method498(542, arg1).field3906);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V")
    public static void method1932(boolean arg0) {
        if (!arg0) {
            method1928(true, 75);
        }
        field4523 = null;
        field4526 = null;
        field4527 = null;
        field4524 = null;
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(IZ)V")
    public final void method1933(int arg0, boolean arg1) {
        this.field4506 = arg1;
        this.method1929(4);
        field4502++;
        if (arg0 != 12148) {
            field4523 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)V")
    public static final void method1934(int arg0, byte arg1) {
        class167.field2523.method1778(arg0, -40);
        int var2 = 75 / ((74 - arg1) / 52);
        field4510++;
        class6.field110.method1778(arg0, -27);
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(II)I")
    public final int method1893(int arg0, int arg1) {
        if (arg1 >= -31) {
            method1931((class188) null, (String) null, (byte) -28);
        }
        field4513++;
        return this.method498(542, arg0).field3913 & 0xFFFF;
    }

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(II)Lvf;")
    public final class103 method500(int arg0, int arg1) {
        if (arg0 == 20519) {
            field4514++;
            class101 var3 = this.method1930(arg1, true);
            return var3 == null ? null : var3.field1621;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(II)Z")
    public final boolean method1894(int arg0, int arg1) {
        field4517++;
        if (arg1 > -67) {
            field4527 = null;
        }
        return !this.method498(542, arg0).field3916;
    }
}
