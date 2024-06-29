import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class149 extends class601 {

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "Z")
    public static boolean field1652 = false;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
    public static int field1657 = -1;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZLha;)V", line = 3)
    public static final void method924(boolean arg0, class58 arg1) {
        ++field1651;
        if (arg0) {
            method924(false, (class58) null);
        }
        if ((~class343.field4449 <= -3 || class568.field8075) && class344.field4474 == null) {
            String var2;
            if (class568.field8075 && class343.field4449 < 2) {
                var2 = class52.field548 + class486.field6936.method2936(class489.field6978, -76) + class175.field2063 + " ->";
            } else if (class296.field3651 && class375.field4818.method1657(81, (byte) -40) && class343.field4449 > 2) {
                var2 = class98.method686(31734, class10.field74);
            } else {
                class649 var3 = class10.field74;
                if (var3 == null) {
                    return;
                }
                var2 = class98.method686(31734, var3);
                int[] var4 = null;
                if (!class657.method3746((byte) 80, var3.field9270)) {
                    if (var3.field9263 == -1) {
                        if (!class411.method2523(75, var3.field9270)) {
                            if (class59.method455((byte) 27, var3.field9270)) {
                                Object var5 = null;
                                class316 var6;
                                if (var3.field9270 == 1003) {
                                    var6 = class445.field6442.method3972((byte) 125, (int) var3.field9272);
                                } else {
                                    var6 = class445.field6442.method3972((byte) 102, (int) (2147483647L & var3.field9272 >>> 32));
                                }
                                if (var6.field4045 != null) {
                                    var6 = var6.method1886(class722.field10125, 91);
                                }
                                if (var6 != null) {
                                    var4 = var6.field4040;
                                }
                            }
                        } else {
                            class151 var7 = (class151) class253.field3052.method1754(false, (long) ((int) var3.field9272));
                            if (var7 != null) {
                                class197 var8 = var7.field1661;
                                class326 var9 = var8.field2293;
                                if (var9.field4199 != null) {
                                    var9 = var9.method1939(true, class722.field10125);
                                }
                                if (var9 != null) {
                                    var4 = var9.field4221;
                                }
                            }
                        }
                    } else {
                        var4 = class361.field4643.method912((byte) 1, var3.field9263).field6258;
                    }
                } else {
                    var4 = class361.field4643.method912((byte) 1, (int) var3.field9272).field6258;
                }
                if (var4 != null) {
                    var2 = var2 + class659.method3756(var4, 97);
                }
            }
            if (class343.field4449 > 2) {
                var2 = var2 + "<col=ffffff> / " + (class343.field4449 + -2) + class486.field6929.method2936(class489.field6978, 73);
            }
            if (class266.field3309 == null) {
                if (class465.field6662 != null && class99.field1034 == class101.field1048) {
                    int var10 = class567.field8070.method453(var2, class252.field3041 + 16, class353.field4534, 0, 16777215, class740.field10345, class3.field20 - -4, -126, class6.field42, class126.field1322);
                    class119.method771(16, (byte) -7, class96.field1014.method3137((byte) -54, var2) - -var10, class3.field20 + 4, class252.field3041);
                    return;
                }
            } else {
                class59 var11 = class266.field3309.method3114(62, arg1);
                if (var11 == null) {
                    var11 = class567.field8070;
                }
                var11.method447(38, class353.field4534, class6.field42, var2, class266.field3309.field7579, class266.field3309.field7678, class302.field3780, class266.field3309.field7694, class266.field3309.field7652, class266.field3309.field7573, class740.field10345, class126.field1322, class78.field815, class342.field4436, class266.field3309.field7658);
                class119.method771(class78.field815[3], (byte) -23, class78.field815[2], class78.field815[0], class78.field815[1]);
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(ILgn;)V", line = 112)
    public class149(int arg0, class699 arg1) {
        super(arg0, arg1);
        class341.method2027(super.field8565, 121);
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(II)I", line = 121)
    public final int method34(int arg0, int arg1) {
        if (arg1 != 15706) {
            return 93;
        } else {
            ++field1655;
            return ~super.field8563.method3928((byte) -126).method970((byte) -103) > -97 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)I", line = 137)
    public final int method925(int arg0) {
        int var2 = 0 / ((arg0 - -59) / 61);
        ++field1658;
        return super.field8565;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IZ)V", line = 148)
    public final void method40(int arg0, boolean arg1) {
        super.field8565 = arg0;
        ++field1656;
        if (arg1) {
            this.method35((byte) 74);
        }
        class341.method2027(super.field8565, 116);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IZI)Leca;", line = 164)
    public static final class755 method926(int arg0, boolean arg1, int arg2) {
        ++field1660;
        if (arg0 != Integer.MIN_VALUE) {
            return null;
        } else {
            long var3 = (long) (arg2 | (!arg1 ? 0 : Integer.MIN_VALUE));
            return (class755) class469.field6700.method1754(false, var3);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V", line = 177)
    public final void method35(byte arg0) {
        ++field1654;
        if (arg0 > -37) {
            method926(-24, false, -59);
        }
        if (~super.field8563.method3928((byte) -128).method970((byte) -115) > -97) {
            super.field8565 = 0;
        }
        if (super.field8565 < 0 || super.field8565 > 2) {
            super.field8565 = this.method39((byte) -17);
        }
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lgn;)V", line = 196)
    public class149(class699 arg0) {
        super(arg0);
        class341.method2027(super.field8565, 118);
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)Z", line = 208)
    public final boolean method927(int arg0) {
        if (arg0 != -9242) {
            field1652 = false;
        }
        ++field1659;
        return ~super.field8563.method3928((byte) -128).method970((byte) -117) <= -97;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)I", line = 227)
    public final int method39(byte arg0) {
        if (arg0 != -17) {
            this.method927(115);
        }
        ++field1653;
        return ~super.field8563.method3928((byte) -126).method970((byte) -116) > -97 ? 0 : 2;
    }
}
