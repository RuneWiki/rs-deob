import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class68 extends class42 {

    @OriginalMember(owner = "client!jf", name = "fb", descriptor = "I")
    private int field1574 = -1;

    @OriginalMember(owner = "client!jf", name = "Y", descriptor = "Z")
    private boolean field1567 = false;

    @OriginalMember(owner = "client!jf", name = "kb", descriptor = "Z")
    private volatile boolean field1579 = false;

    @OriginalMember(owner = "client!jf", name = "bb", descriptor = "Ljc;")
    private class65 field1570;

    @OriginalMember(owner = "client!jf", name = "Z", descriptor = "I")
    private int field1568;

    @OriginalMember(owner = "client!jf", name = "tb", descriptor = "Ljc;")
    private class65 field1588;

    @OriginalMember(owner = "client!jf", name = "lb", descriptor = "[I")
    public static int[] field1580 = new int[32768];

    @OriginalMember(owner = "client!jf", name = "jb", descriptor = "Lr;")
    public static class118 field1578 = class153.method1136(110, "mapfunction");

    @OriginalMember(owner = "client!jf", name = "cb", descriptor = "Lr;")
    public static class118 field1571 = class153.method1136(102, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!jf", name = "nb", descriptor = "Z")
    public static boolean field1582 = false;

    @OriginalMember(owner = "client!jf", name = "W", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!jf", name = "X", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!jf", name = "ab", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!jf", name = "db", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!jf", name = "eb", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!jf", name = "gb", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!jf", name = "hb", descriptor = "I")
    private int field1576;

    @OriginalMember(owner = "client!jf", name = "ib", descriptor = "I")
    private int field1577;

    @OriginalMember(owner = "client!jf", name = "mb", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!jf", name = "pb", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!jf", name = "qb", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!jf", name = "ub", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!jf", name = "vb", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!jf", name = "wb", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!jf", name = "rb", descriptor = "Lu;")
    public static class139 field1586;

    @OriginalMember(owner = "client!jf", name = "ob", descriptor = "Lwa;")
    public static class154 field1583;

    @OriginalMember(owner = "client!jf", name = "sb", descriptor = "[Z")
    private volatile boolean[] field1587;

    @OriginalMember(owner = "client!jf", name = "V", descriptor = "[[[I")
    public static int[][][] field1564;

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Ljc;Ljc;IZZZ)V")
    public class68(class65 arg0, class65 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field1570 = arg0;
        this.field1568 = arg2;
        this.field1567 = arg5;
        this.field1588 = arg1;
        class61.method543(this.field1568, this, false);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(IB)I")
    private final int method578(int arg0, byte arg1) {
        ++field1569;
        if (arg1 > -70) {
            method586((byte) -73);
        }
        if (super.field994[arg0] != null) {
            return 100;
        } else {
            return this.field1587[arg0] ? 100 : class97.method756(this.field1568, -838321904, arg0);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIB)V")
    public final void method579(int arg0, int arg1, byte arg2) {
        ++field1591;
        this.field1577 = arg1;
        this.field1576 = arg0;
        if (arg2 < 42) {
            field1578 = null;
        }
        if (this.field1588 == null) {
            class27.method234(255, true, this.field1576, (byte) 0, this.field1568, this, 106);
        } else {
            class92.method740(this.field1588, false, this, this.field1568);
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)I")
    public final int method580(int arg0) {
        ++field1590;
        if (this.field1579) {
            return 100;
        } else if (super.field994 != null) {
            return 99;
        } else {
            int var2 = class97.method756(255, -838321904, this.field1568);
            if (arg0 != -7) {
                field1578 = null;
            }
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BZ[BIZ)V")
    public final void method581(byte arg0, boolean arg1, byte[] arg2, int arg3, boolean arg4) {
        ++field1581;
        if (arg0 == -108) {
            if (!arg1) {
                arg2[arg2.length - 2] = (byte) (super.field1007[arg3] >> 8);
                arg2[arg2.length + -1] = (byte) super.field1007[arg3];
                if (this.field1570 != null) {
                    class131.method1017(this.field1570, arg3, arg0 ^ -108, arg2);
                    this.field1587[arg3] = true;
                }
                if (arg4) {
                    super.field994[arg3] = class43.method362(arg2, false, false);
                    return;
                }
            } else {
                if (this.field1579) {
                    throw new RuntimeException();
                }
                if (this.field1588 != null) {
                    class131.method1017(this.field1588, this.field1568, 0, arg2);
                }
                this.method355(arg2, (byte) -58);
                this.method587(false);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljc;[BIZB)V")
    public final void method582(class65 arg0, byte[] arg1, int arg2, boolean arg3, byte arg4) {
        ++field1575;
        if (arg4 <= -85) {
            if (this.field1588 != arg0) {
                if (!arg3 && ~this.field1574 == ~arg2) {
                    this.field1579 = true;
                }
                if (arg1 != null && arg1.length > 2) {
                    class66.field1504.reset();
                    class66.field1504.update(arg1, 0, arg1.length + -2);
                    int var6 = (int) class66.field1504.getValue();
                    int var7 = ((255 & arg1[arg1.length + -2]) << 8) + (255 & arg1[arg1.length + -1]);
                    if (~super.field975[arg2] == ~var6 && ~super.field1007[arg2] == ~var7) {
                        this.field1587[arg2] = true;
                        if (arg3) {
                            super.field994[arg2] = class43.method362(arg1, false, false);
                        }
                    } else {
                        this.field1587[arg2] = false;
                        if (this.field1567 || arg3) {
                            class27.method234(this.field1568, arg3, super.field975[arg2], (byte) 2, arg2, this, 122);
                        }
                    }
                } else {
                    this.field1587[arg2] = false;
                    if (this.field1567 || arg3) {
                        class27.method234(this.field1568, arg3, super.field975[arg2], (byte) 2, arg2, this, 111);
                    }
                }
            } else if (this.field1579) {
                throw new RuntimeException();
            } else if (arg1 == null) {
                class27.method234(255, true, this.field1576, (byte) 0, this.field1568, this, 98);
            } else {
                class66.field1504.reset();
                class66.field1504.update(arg1, 0, arg1.length);
                int var8 = (int) class66.field1504.getValue();
                class105 var9 = new class105(class39.method329(arg1, 2283));
                int var10 = var9.method831((byte) 76);
                if (~var10 != -6 && ~var10 != -7) {
                    throw new RuntimeException("Incorrect JS5 protocol number: " + var10);
                } else {
                    int var11 = 0;
                    if (~var10 <= -7) {
                        var11 = var9.method821((byte) 88);
                    }
                    if (~this.field1576 != ~var8 || this.field1577 != var11) {
                        class27.method234(255, true, this.field1576, (byte) 0, this.field1568, this, 124);
                    } else {
                        this.method355(arg1, (byte) -81);
                        this.method587(false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)V")
    public final void method338(byte arg0, int arg1) {
        int var3 = -103 / ((54 - arg0) / 42);
        ++field1566;
        if (this.field1570 != null && this.field1587 != null && this.field1587[arg1]) {
            class92.method740(this.field1570, false, this, arg1);
        } else {
            class27.method234(this.field1568, true, super.field975[arg1], (byte) 2, arg1, this, 101);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)V")
    public final void method348(int arg0, byte arg1) {
        ++field1589;
        class92.method733(arg0, (byte) -87, this.field1568);
        if (arg1 >= -85) {
            this.method580(127);
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)I")
    public final int method583(int arg0) {
        ++field1565;
        int var2 = 0;
        int var3 = 0;
        int var4 = 5 % ((-53 - arg0) / 37);
        for (int var5 = 0; ~super.field994.length < ~var5; ++var5) {
            if (~super.field1019[var5] < -1) {
                var2 += 100;
                var3 += this.method578(var5, (byte) -103);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILr;)V")
    public static final void method584(int arg0, class118 arg1) {
        ++field1584;
        if (class48.field1170 >= 2) {
            if (arg1.method911(class81.field1956, 14934)) {
                System.gc();
            }
            if (arg1.method911(class48.field1165, 14934)) {
                class1.method7(512600200);
            }
            if (arg1.method911(class99.field2293, 14934)) {
                class120.field2786 = true;
            }
            if (arg1.method911(class144.field3237, 14934)) {
                class120.field2786 = false;
            }
            if (arg1.method911(class110.field2536, 14934)) {
                for (int var2 = 0; var2 < 4; ++var2) {
                    for (int var3 = 1; ~var3 > -104; ++var3) {
                        for (int var4 = 1; ~var4 > -104; ++var4) {
                            class121.field2790[var2].field2958[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg1.method911(class59.field1377, 14934) && class33.field842 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method915(class89.field2148, (byte) 59)) {
                class73.field1687 = arg1.method926(12, (byte) 117).method918(false).method906(34);
                class103.method786((class118) null, class144.method1066(true, new class118[] { class83.field1999, class43.method359(class73.field1687, (byte) -122) }), 0, (byte) -128);
            }
            if (arg1.method911(class62.field1435, 14934)) {
                class33.field844 = true;
            }
        }
        class1.field22.method722(45, (byte) 117);
        if (arg0 >= -117) {
            field1571 = null;
        }
        ++class23.field546;
        class1.field22.method800(-125, arg1.method935(-106) - 1);
        class1.field22.method843(arg1.method926(2, (byte) 117), (byte) 104);
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
    public static void method585(int arg0) {
        field1583 = null;
        field1571 = null;
        field1586 = null;
        if (arg0 == -6) {
            field1564 = null;
            field1580 = null;
            field1578 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
    public static final void method586(byte arg0) {
        ++class137.field3116;
        ++field1585;
        int var1 = 75 % (-arg0 / 44);
        class1.field22.method722(30, (byte) -127);
        for (class87 var2 = (class87) class31.field797.method296(0); var2 != null; var2 = (class87) class31.field797.method290(-1)) {
            if (var2.field2107 == 0 || ~var2.field2107 == -4) {
                class144.method1067(var2, 29975, true);
            }
        }
        if (class101.field2351 != null) {
            class26.method232((byte) 112, class101.field2351);
            class101.field2351 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(Z)V")
    private final void method587(boolean arg0) {
        ++field1573;
        this.field1587 = new boolean[super.field994.length];
        for (int var2 = 0; ~var2 > ~this.field1587.length; ++var2) {
            this.field1587[var2] = false;
        }
        if (this.field1570 == null) {
            this.field1579 = true;
        } else {
            this.field1574 = -1;
            for (int var3 = 0; var3 < this.field1587.length; ++var3) {
                if (~super.field1019[var3] < -1) {
                    class136.method1031(this, -102, var3, this.field1570);
                    this.field1574 = var3;
                }
            }
            if (this.field1574 == -1) {
                this.field1579 = true;
            }
            if (arg0) {
                this.field1576 = 16;
            }
        }
    }
}
