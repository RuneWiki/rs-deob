import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class44 extends class72 {

    @OriginalMember(owner = "client!sca", name = "m", descriptor = "Ltaa;")
    public static class405 field665 = new class405();

    @OriginalMember(owner = "client!sca", name = "h", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!sca", name = "i", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!sca", name = "j", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!sca", name = "k", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!sca", name = "l", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!sca", name = "n", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lha;I)V", line = 5)
    public static final void method408(class58 arg0, int arg1) {
        ++field661;
        if ((~class409.field5682 <= -3 || class737.field10375) && class755.field10512 == null) {
            String var2;
            if (class737.field10375 && ~class409.field5682 > -3) {
                var2 = class322.field4580 + class281.field3973.method1839((byte) 45, class744.field10426) + class623.field8966 + " ->";
            } else if (class630.field9043 && class167.field2461.method1540(123, 81) && ~class409.field5682 < -3) {
                var2 = class439.method2636((byte) 104, class522.field7394);
            } else {
                class66 var3 = class522.field7394;
                if (var3 == null) {
                    return;
                }
                var2 = class439.method2636((byte) 114, var3);
                int[] var4 = null;
                if (class449.method2676(var3.field1198, 41)) {
                    var4 = class558.field7942.method721(99, (int) var3.field1194).field3672;
                } else if (~var3.field1191 != 0) {
                    var4 = class558.field7942.method721(arg1 + -2147483567, var3.field1191).field3672;
                } else if (!class237.method1607(52, var3.field1198)) {
                    if (class56.method513(var3.field1198, (byte) 85)) {
                        Object var5 = null;
                        class414 var6;
                        if (~var3.field1198 != -1013) {
                            var6 = class66.field1181.method131(2, (int) (2147483647L & var3.field1194 >>> 32));
                        } else {
                            var6 = class66.field1181.method131(arg1 + -2147483645, (int) var3.field1194);
                        }
                        if (var6.field5720 != null) {
                            var6 = var6.method2513(class742.field10408, true);
                        }
                        if (var6 != null) {
                            var4 = var6.field5727;
                        }
                    }
                } else {
                    class272 var7 = (class272) class758.field10539.method4203(true, (long) ((int) var3.field1194));
                    if (var7 != null) {
                        class84 var8 = var7.field3885;
                        class488 var9 = var8.field1523;
                        if (var9.field6923 != null) {
                            var9 = var9.method2926(8730, class742.field10408);
                        }
                        if (var9 != null) {
                            var4 = var9.field6935;
                        }
                    }
                }
                if (var4 != null) {
                    var2 = var2 + class387.method2418(var4, (byte) -104);
                }
            }
            if (arg1 != Integer.MAX_VALUE) {
                field665 = null;
            }
            if (class409.field5682 > 2) {
                var2 = var2 + "<col=ffffff> / " + (class409.field5682 + -2) + class281.field3966.method1839((byte) 45, class744.field10426);
            }
            if (class756.field10530 == null) {
                if (class66.field1201 != null && class87.field1576 == class649.field9170) {
                    int var10 = class537.field7568.method650(class155.field2330, class581.field8221, 16777215, var2, class647.field9166 + 16, true, class610.field8827, 0, class698.field9810, class456.field6596 + 4);
                    class89.method833(var10 + class419.field5896.method2075(false, var2), class456.field6596 - -4, 16, class647.field9166, 61);
                    return;
                }
            } else {
                class59 var11 = class756.field10530.method451((byte) 120, arg0);
                if (var11 == null) {
                    var11 = class537.field7568;
                }
                var11.method654(class12.field154, class581.field8221, class756.field10530.field783, class544.field7670, var2, class610.field8827, class756.field10530.field874, class689.field9710, class698.field9810, class756.field10530.field830, class155.field2330, arg1 ^ 2147479324, class756.field10530.field795, class756.field10530.field829, class756.field10530.field812);
                class89.method833(class689.field9710[2], class689.field9710[0], class689.field9710[3], class689.field9710[1], 93);
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "(I)I", line = 118)
    public final int method409(int arg0) {
        if (arg0 != 27669) {
            field665 = null;
        }
        ++field662;
        return super.field1282;
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(I)I", line = 132)
    public final int method60(int arg0) {
        ++field666;
        if (super.field1286.method2820(false).method3613((byte) 10) > 1) {
            return 4;
        } else {
            if (arg0 != -3271) {
                this.method55(-80);
            }
            return 2;
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)V", line = 147)
    public static void method410(boolean arg0) {
        field665 = null;
        if (arg0) {
            field665 = null;
        }
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(II)I", line = 158)
    public final int method58(int arg0, int arg1) {
        if (arg1 != 11260) {
            method410(false);
        }
        ++field663;
        return 1;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(II)V", line = 169)
    public final void method59(int arg0, int arg1) {
        super.field1282 = arg0;
        if (arg1 != 3) {
            field665 = null;
        }
        ++field664;
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(ILcq;)V", line = 180)
    public class44(int arg0, class464 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V", line = 183)
    public final void method55(int arg0) {
        if (arg0 <= 30) {
            this.method58(-112, 127);
        }
        if (super.field1282 < 0 && ~super.field1282 < -5) {
            super.field1282 = this.method60(-3271);
        }
        ++field660;
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lcq;)V", line = 196)
    public class44(class464 arg0) {
        super(arg0);
    }
}
