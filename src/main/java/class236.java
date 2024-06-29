import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class236 extends class274 {

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    private int field3007 = 0;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Lvh;")
    private class242 field2997 = new class242();

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field3000 = -1;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "Z")
    public static boolean field3006 = true;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "[I")
    public static int[] field3005 = new int[4];

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V", line = 4)
    public static void method1413(byte arg0) {
        field3005 = null;
        int var1 = 47 / ((-8 - arg0) / 43);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lta;IIFZ)V", line = 14)
    public final void method1414(class143 arg0, int arg1, int arg2, float arg3, boolean arg4) {
        ++field3010;
        super.field3438[super.field3435] = (byte) (arg4 ? arg1 + 40 : arg1 + 30);
        if (arg2 == 12214) {
            super.field3444[super.field3435] = arg0;
            super.field3440[super.field3435] = arg3;
            ++super.field3435;
            if (~super.field3435 <= -5001) {
                super.field3435 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(ILev;)V", line = 32)
    public final void method1415(int arg0, class490 arg1) {
        --super.field3442;
        if (arg0 != -12933) {
            field3000 = 120;
        }
        ++field3002;
        if (super.field3442 < 0) {
            super.field3442 = 4999;
        }
        super.field3438[super.field3442] = 21;
        super.field3444[super.field3442] = arg1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V", line = 50)
    public final void method1416(byte arg0, int arg1) {
        int var3 = 63 / ((-51 - arg0) / 47);
        ++field3004;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lev;I)V", line = 62)
    public final void method1417(class490 arg0, int arg1) {
        ++field3009;
        super.field3438[super.field3435] = 20;
        super.field3444[super.field3435] = arg0;
        ++super.field3435;
        if (~super.field3435 <= -5001) {
            super.field3435 = 0;
        }
        if (arg1 != 5000) {
            field3000 = -80;
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)V", line = 81)
    private final void method1418(byte arg0) {
        ++field2998;
        int var2 = super.field3442++;
        if (~super.field3442 <= -5001) {
            super.field3442 = 0;
        }
        this.field3007 = super.field3438[var2];
        Object var3 = super.field3444[var2];
        if (arg0 != 110) {
            this.method1422(-60);
        }
        super.field3444[var2] = null;
        if (this.field3007 == 21) {
            class315.method1847(this.field2997, (class490) var3);
        } else if (this.field3007 != 20) {
            if (~this.field3007 <= -31 && ~this.field3007 >= -34) {
                class481.field7025.method338(3000.0F, super.field3440[var2] * 1.5F);
                ((class143) var3).method386(class255.field3246, class139.field1797, class230.field2929, class38.field501, ~(this.field3007 + -30) == -1);
            } else if (this.field3007 >= 40 && ~this.field3007 >= -44) {
                class481.field7025.method338(3000.0F, super.field3440[var2] * 1.5F);
                ((class143) var3).method386(class255.field3246, class139.field1797, class230.field2929, class473.field6847, ~(this.field3007 + -40) == -1);
            } else if (~this.field3007 == -23) {
                class481.field7025.method317(-1, 1583160, 40, 127);
            } else {
                if (this.field3007 != 23) {
                    if (this.field3007 == 24) {
                        class481.field7025.method311(0, (class256[]) null);
                        return;
                    }
                } else {
                    class481.field7025.method329();
                }
            }
        } else {
            class490 var4 = (class490) var3;
            if (var4.field7126 != null) {
                var4.field7126.method192(class481.field7025, 1);
            }
            if (var4.field7130 != null) {
                var4.field7130.method192(class481.field7025, arg0 ^ 111);
            }
            if (var4.field7138 != null) {
                var4.field7138.method192(class481.field7025, 1);
            }
            if (var4.field7137 != null) {
                var4.field7137.method192(class481.field7025, 1);
            }
            if (var4.field7131 != null) {
                var4.field7131.method192(class481.field7025, 1);
            }
            for (class376 var5 = var4.field7127; var5 != null; var5 = var5.field4952) {
                var5.field4953.method192(class481.field7025, arg0 + -109);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILev;)V", line = 176)
    public final void method1419(int arg0, class490 arg1) {
        ++field2999;
        super.field3438[super.field3435] = 21;
        super.field3444[super.field3435] = arg1;
        ++super.field3435;
        if (arg0 == 1911) {
            if (super.field3435 >= 5000) {
                super.field3435 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V", line = 192)
    public final void method1420(byte arg0) {
        if (arg0 >= 53) {
            ++field3003;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V", line = 207)
    public final void method1421(int arg0, int arg1) {
        ++field3008;
        super.field3438[super.field3435] = (byte) arg1;
        ++super.field3435;
        if (super.field3435 >= arg0) {
            super.field3435 = 0;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V", line = 224)
    public final void method1422(int arg0) {
        if (arg0 == 255) {
            ++field3001;
            while (super.field3442 != super.field3435) {
                this.method1418((byte) 110);
            }
        }
    }
}
