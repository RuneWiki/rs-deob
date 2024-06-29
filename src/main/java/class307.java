import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class307 extends class376 {

    @OriginalMember(owner = "client!ct", name = "u", descriptor = "I")
    private int field4172 = 0;

    @OriginalMember(owner = "client!ct", name = "n", descriptor = "Lmb;")
    private class224 field4165 = new class224();

    @OriginalMember(owner = "client!ct", name = "t", descriptor = "I")
    public static int field4171 = -1;

    @OriginalMember(owner = "client!ct", name = "s", descriptor = "F")
    public static float field4170;

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!ct", name = "m", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!ct", name = "p", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!ct", name = "q", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!ct", name = "v", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!ct", name = "w", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!ct", name = "x", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V")
    public static final void method1776(byte arg0) {
        ++field4168;
        class228.field3204.method554(((float) class76.field1075.field3666 * 0.1F + 0.7F) * class136.field2060);
        class228.field3204.method534(class528.field7706, class391.field5641, class270.field3642, (float) (class314.field4247 << 0), (float) (class402.field5757 << 0), (float) (class462.field6688 << 0));
        class228.field3204.method480(class419.field6072);
        if (arg0 != 26) {
            field4171 = -40;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILwr;)V")
    public final void method40(int arg0, class532 arg1) {
        ++field4162;
        super.field5400[super.field5405] = 21;
        super.field5406[super.field5405] = arg1;
        ++super.field5405;
        if (arg0 == -26704) {
            if (super.field5405 >= 5000) {
                super.field5405 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lwr;I)V")
    public final void method47(class532 arg0, int arg1) {
        ++field4163;
        super.field5400[super.field5405] = 20;
        super.field5406[super.field5405] = arg0;
        if (arg1 != -51) {
            method1776((byte) 101);
        }
        ++super.field5405;
        if (~super.field5405 <= -5001) {
            super.field5405 = 0;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IB)V")
    public final void method48(int arg0, byte arg1) {
        ++field4166;
        if (arg1 >= -34) {
            field4171 = -7;
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(B)V")
    private final void method1777(byte arg0) {
        ++field4173;
        int var2 = super.field5402++;
        if (~super.field5402 <= -5001) {
            super.field5402 = 0;
        }
        this.field4172 = super.field5400[var2];
        Object var3 = super.field5406[var2];
        super.field5406[var2] = null;
        if (this.field4172 == arg0) {
            class364.method2182(this.field4165, (class532) var3);
        } else if (this.field4172 != 20) {
            if (~this.field4172 <= -31 && ~this.field4172 >= -34) {
                class77.field1093.method462(3000.0F, super.field5403[var2] * 1.5F);
                ((class11) var3).method82(class39.field578, class119.field1859, class282.field3832, class223.field3153, ~(this.field4172 + -30) == -1);
            } else if (this.field4172 >= 40 && ~this.field4172 >= -44) {
                class77.field1093.method462(3000.0F, super.field5403[var2] * 1.5F);
                ((class11) var3).method82(class39.field578, class119.field1859, class282.field3832, class18.field280, this.field4172 + -40 == 0);
            } else {
                if (~this.field4172 != -23) {
                    if (~this.field4172 == -24) {
                        class77.field1093.method488();
                        return;
                    }
                    if (this.field4172 == 24) {
                        class77.field1093.method503(0, (class447[]) null);
                        return;
                    }
                } else {
                    class77.field1093.method517(-1, 1583160, 40, 127);
                }
            }
        } else {
            class532 var4 = (class532) var3;
            if (var4.field7830 != null) {
                var4.field7830.method166(class77.field1093, 103);
            }
            if (var4.field7822 != null) {
                var4.field7822.method166(class77.field1093, arg0 ^ 36);
            }
            if (var4.field7833 != null) {
                var4.field7833.method166(class77.field1093, 64);
            }
            if (var4.field7835 != null) {
                var4.field7835.method166(class77.field1093, 107);
            }
            if (var4.field7838 != null) {
                var4.field7838.method166(class77.field1093, arg0 + -1);
            }
            for (class201 var5 = var4.field7828; var5 != null; var5 = var5.field2918) {
                var5.field2915.method166(class77.field1093, 104);
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lya;IZZF)V")
    public final void method41(class11 arg0, int arg1, boolean arg2, boolean arg3, float arg4) {
        ++field4167;
        super.field5400[super.field5405] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
        super.field5406[super.field5405] = arg0;
        if (arg3) {
            super.field5403[super.field5405] = arg4;
            ++super.field5405;
            if (~super.field5405 <= -5001) {
                super.field5405 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(BI)V")
    public final void method39(byte arg0, int arg1) {
        super.field5400[super.field5405] = (byte) arg1;
        ++field4169;
        if (arg0 <= 120) {
            this.method39((byte) -84, 105);
        }
        ++super.field5405;
        if (~super.field5405 <= -5001) {
            super.field5405 = 0;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(BLwr;)V")
    public final void method51(byte arg0, class532 arg1) {
        --super.field5402;
        ++field4175;
        if (~super.field5402 > -1) {
            super.field5402 = 4999;
        }
        super.field5400[super.field5402] = 21;
        if (arg0 > -74) {
            this.field4165 = null;
        }
        super.field5406[super.field5402] = arg1;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(III)Lwr;")
    public static final class532 method1778(int arg0, int arg1, int arg2) {
        if (class103.field1632[arg0][arg1][arg2] == null) {
            boolean var3 = class103.field1632[0][arg1][arg2] != null && class103.field1632[0][arg1][arg2].field7829 != null;
            if (var3 && arg0 >= class265.field3571 - 1) {
                return null;
            }
            class492.method2913(arg0, arg1, arg2);
        }
        return class103.field1632[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V")
    public final void method42(int arg0) {
        if (arg0 != 0) {
            this.method1777((byte) 18);
        }
        ++field4164;
        while (super.field5405 != super.field5402) {
            this.method1777((byte) 21);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
    public final void method46(int arg0) {
        if (arg0 != 15609) {
            this.method39((byte) 82, -88);
        }
        ++field4174;
    }
}
