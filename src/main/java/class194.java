import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class194 extends class232 {

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    private int field2617 = 0;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "Lhc;")
    private class84 field2624 = new class84();

    @OriginalMember(owner = "client!db", name = "l", descriptor = "[I")
    public static int[] field2618 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field2620 = 0;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "Lmq;")
    public static class323 field2625;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILf;)V")
    public final void method1103(int arg0, class491 arg1) {
        --super.field3076;
        ++field2621;
        if (super.field3076 < 0) {
            super.field3076 = 4999;
        }
        super.field3079[super.field3076] = 21;
        if (arg0 == 6) {
            super.field3080[super.field3076] = arg1;
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
    private final void method1104(int arg0) {
        ++field2626;
        int var2 = super.field3076++;
        if (~super.field3076 <= -5001) {
            super.field3076 = 0;
        }
        this.field2617 = super.field3079[var2];
        Object var3 = super.field3080[var2];
        super.field3080[var2] = null;
        if (this.field2617 == 21) {
            class308.method1699(this.field2624, (class491) var3);
        } else if (this.field2617 == 20) {
            class491 var4 = (class491) var3;
            if (var4.field6864 != null) {
                var4.field6864.method10(class95.field1404, (byte) -106);
            }
            if (var4.field6847 != null) {
                var4.field6847.method10(class95.field1404, (byte) -83);
            }
            if (var4.field6840 != null) {
                var4.field6840.method10(class95.field1404, (byte) -94);
            }
            if (var4.field6849 != null) {
                var4.field6849.method10(class95.field1404, (byte) -121);
            }
            if (var4.field6842 != null) {
                var4.field6842.method10(class95.field1404, (byte) -79);
            }
            for (class309 var5 = var4.field6845; var5 != null; var5 = var5.field4084) {
                var5.field4091.method10(class95.field1404, (byte) -62);
            }
        } else if (~this.field2617 <= -31 && ~this.field2617 >= -34) {
            class95.field1404.method1997(3000.0F, super.field3077[var2] * 1.5F);
            ((class177) var3).method383(class121.field1779, class412.field5643, class314.field4169, class150.field2125, ~(this.field2617 + -30) == -1);
        } else if (~this.field2617 <= -41 && ~this.field2617 >= -44) {
            class95.field1404.method1997(3000.0F, super.field3077[var2] * 1.5F);
            ((class177) var3).method383(class121.field1779, class412.field5643, class314.field4169, class37.field552, this.field2617 + -40 == 0);
        } else if (this.field2617 == 22) {
            class95.field1404.method1989(-1, 1583160, 40, 127);
        } else if (this.field2617 != 23) {
            if (~this.field2617 == -25) {
                class95.field1404.method1978(0, (class404[]) null);
            }
        } else {
            class95.field1404.method1965();
        }
        if (arg0 > -6) {
            this.method1112(-58);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lf;B)V")
    public final void method1105(class491 arg0, byte arg1) {
        super.field3079[super.field3078] = 20;
        ++field2623;
        super.field3080[super.field3078] = arg0;
        int var3 = -100 % ((-27 - arg1) / 32);
        ++super.field3078;
        if (~super.field3078 <= -5001) {
            super.field3078 = 0;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)V")
    public final void method1106(byte arg0, int arg1) {
        int var3 = 45 % ((arg0 - -9) / 38);
        ++field2630;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lf;I)V")
    public final void method1107(class491 arg0, int arg1) {
        super.field3079[super.field3078] = 21;
        ++field2627;
        if (arg1 == 0) {
            super.field3080[super.field3078] = arg0;
            ++super.field3078;
            if (super.field3078 >= 5000) {
                super.field3078 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
    public final void method1108(int arg0, int arg1) {
        ++field2622;
        if (arg1 != 0) {
            this.field2624 = null;
        }
        super.field3079[super.field3078] = (byte) arg0;
        ++super.field3078;
        if (~super.field3078 <= -5001) {
            super.field3078 = 0;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ltf;ZFII)V")
    public final void method1109(class177 arg0, boolean arg1, float arg2, int arg3, int arg4) {
        super.field3079[super.field3078] = (byte) (arg1 ? arg3 + 40 : arg3 + 30);
        ++field2619;
        super.field3080[super.field3078] = arg0;
        if (arg4 != 4) {
            this.method1111(29);
        }
        super.field3077[super.field3078] = arg2;
        ++super.field3078;
        if (super.field3078 >= 5000) {
            super.field3078 = 0;
        }
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
    public static void method1110(int arg0) {
        field2625 = null;
        field2618 = null;
        if (arg0 >= -39) {
            method1110(2);
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
    public final void method1111(int arg0) {
        ++field2628;
        if (arg0 == 0) {
            while (~super.field3078 != ~super.field3076) {
                this.method1104(-40);
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public final void method1112(int arg0) {
        if (arg0 >= -125) {
            this.method1103(88, (class491) null);
        }
        ++field2629;
    }
}
