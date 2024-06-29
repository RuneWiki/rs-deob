import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class165 extends class384 {

    @OriginalMember(owner = "client!wfa", name = "A", descriptor = "F")
    private float field2118 = 0.0F;

    @OriginalMember(owner = "client!wfa", name = "q", descriptor = "Leb;")
    private class9 field2108;

    @OriginalMember(owner = "client!wfa", name = "x", descriptor = "Lmq;")
    public static class78 field2115 = new class78(68, 6);

    @OriginalMember(owner = "client!wfa", name = "n", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!wfa", name = "o", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!wfa", name = "p", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!wfa", name = "r", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!wfa", name = "s", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!wfa", name = "t", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!wfa", name = "u", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!wfa", name = "v", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!wfa", name = "w", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!wfa", name = "y", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!wfa", name = "z", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Lbia;BI)V")
    public final void method1015(class329 arg0, byte arg1, int arg2) {
        if (arg1 != 80) {
            method1022((byte) 58, (String) null);
        }
        super.field5337.method3711(false, arg0);
        ++field2113;
    }

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "(I)V")
    public static void method1016(int arg0) {
        field2115 = null;
        if (arg0 <= 13) {
            method1024(false);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)I")
    public static final int method1017(int arg0, int arg1) {
        return class340.field4391 != null ? class340.field4391[arg0][arg1] & 65535 : 0;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IZ)V")
    public final void method1018(int arg0, boolean arg1) {
        ++field2110;
        super.field5337.method3708(121, class409.field5765, class155.field1901);
        if (arg0 != 4) {
            this.field2118 = -0.6007648F;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Lbm;Leb;)V")
    public class165(class684 arg0, class9 arg1) {
        super(arg0);
        this.field2108 = arg1;
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(B)V")
    public final void method1019(byte arg0) {
        ++field2117;
        super.field5337.method3723(true, 1);
        super.field5337.method3708(110, class155.field1901, class155.field1901);
        super.field5337.method3777(false, 0, class632.field8774);
        super.field5337.method3713(class632.field8774, 0, (byte) 94);
        super.field5337.method1381(1, -55);
        super.field5337.method3711(false, (class329) null);
        if (arg0 != -60) {
            method1022((byte) 32, (String) null);
        }
        super.field5337.method3723(true, 0);
        super.field5337.method3713(class632.field8774, 0, (byte) -51);
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZB)V")
    public final void method1020(boolean arg0, byte arg1) {
        ++field2107;
        super.field5337.method3723(true, 1);
        if (arg1 <= 23) {
            this.field2108 = null;
        }
        super.field5337.method3708(81, class409.field5765, class235.field3034);
        super.field5337.method1395(false, 0, true, -54, class632.field8774);
        super.field5337.method3713(class155.field1970, 0, (byte) 88);
        super.field5337.method1381(0, -84);
        super.field5337.method3723(true, 0);
        super.field5337.method3717(-16777216, (byte) -87);
        super.field5337.method3713(class663.field9083, 0, (byte) 102);
        this.method1023((byte) -52);
    }

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "(B)Z")
    public final boolean method1021(byte arg0) {
        if (arg0 < 78) {
            method1024(false);
        }
        ++field2109;
        return this.field2108.method42((byte) 118);
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method1022(byte arg0, String arg1) {
        ++field2114;
        if (arg1 == null) {
            return null;
        } else {
            int var2 = 0;
            if (arg0 <= 99) {
                method1026((byte) 98);
            }
            int var3 = arg1.length();
            while (~var2 > ~var3 && class609.method3337(-98, arg1.charAt(var2))) {
                ++var2;
            }
            while (var3 > var2 && class609.method3337(-123, arg1.charAt(var3 + -1))) {
                --var3;
            }
            int var4 = -var2 + var3;
            if (~var4 <= -2 && ~var4 >= -13) {
                StringBuffer var5 = new StringBuffer(var4);
                for (int var6 = var2; var3 > var6; ++var6) {
                    char var7 = arg1.charAt(var6);
                    if (class716.method3974((byte) 98, var7)) {
                        char var8 = class266.method1598(var7, (byte) -86);
                        if (var8 != 0) {
                            var5.append(var8);
                        }
                    }
                }
                if (var5.length() == 0) {
                    return null;
                } else {
                    return var5.toString();
                }
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "(B)V")
    public final void method1023(byte arg0) {
        if (~super.field5337.method3773((byte) -124) == -1) {
            class462 var2 = super.field5337.method3743(arg0 ^ 32739);
            super.field5337.method3723(true, 1);
            class462 var3 = super.field5337.method3729(1);
            var3.method1961(var2);
            var3.method2725(1.0F, 0.125F, arg0 + -29285, 0.125F);
            var3.method2719(arg0 + -29226, 0.0F, 0.0F, this.field2118);
            super.field5337.method3771(arg0 + 52, class211.field2697);
            super.field5337.method3723(true, 0);
        }
        ++field2116;
        if (arg0 != -52) {
            this.field2108 = null;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(Z)Ljava/lang/String;")
    public static final String method1024(boolean arg0) {
        if (arg0) {
            method1027(-91);
        }
        ++field2112;
        return !class322.field4113 && class750.field10502 != null ? class750.field10502.field10132 : "";
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IBI)V")
    public final void method1025(int arg0, byte arg1, int arg2) {
        ++field2105;
        super.field5337.method3723(true, 1);
        if (arg1 != 102) {
            this.field2118 = -0.831869F;
        }
        if ((128 & arg0) != 0) {
            super.field5337.method3711(false, (class329) null);
        } else if ((1 & arg2) != 1) {
            if (!this.field2108.field99) {
                super.field5337.method3711(false, this.field2108.field97[0]);
            } else {
                super.field5337.method3711(false, this.field2108.field100);
            }
        } else if (this.field2108.field99) {
            this.field2118 = (float) (super.field5337.field9610 % 4000) / 4000.0F;
            super.field5337.method3711(false, this.field2108.field100);
        } else {
            int var4 = super.field5337.field9610 % 4000 * 16 / 4000;
            super.field5337.method3711(false, this.field2108.field97[var4]);
        }
        super.field5337.method3723(true, 0);
    }

    @OriginalMember(owner = "client!wfa", name = "f", descriptor = "(B)V")
    public static final void method1026(byte arg0) {
        ++field2106;
        if (!class446.field6280) {
            class591.field8230 += (-12.0F - class591.field8230) / 2.0F;
            class70.field945 = true;
            if (arg0 > -127) {
                method1016(71);
            }
            class446.field6280 = true;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "f", descriptor = "(I)V")
    public static final void method1027(int arg0) {
        class114 var1 = class618.field8650;
        synchronized (class618.field8650) {
            if (arg0 != -13) {
                field2115 = null;
            }
            class618.field8650.method781((byte) 47);
        }
        ++field2111;
    }
}
