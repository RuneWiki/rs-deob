import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class464 extends class428 {

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "I")
    private int field6537 = 0;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "Lmh;")
    private class577 field6527 = new class577();

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIZLd;)V", line = 11)
    public final void method2422(int arg0, int arg1, boolean arg2, class136 arg3) {
        super.field6012[super.field6011] = (byte) (!arg2 ? arg1 + 30 : arg1 + 40);
        ++field6531;
        super.field6016[super.field6011] = arg3;
        ++super.field6011;
        if (arg0 == -15856) {
            if (super.field6011 >= 5000) {
                super.field6011 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V", line = 28)
    public final void method2427(int arg0) {
        if (arg0 != -30496) {
            this.method2421((byte) -92);
        }
        ++field6529;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V", line = 38)
    public final void method2421(byte arg0) {
        ++field6532;
        while (super.field6018 != super.field6011) {
            this.method2664((byte) 82);
        }
        if (arg0 <= 35) {
            this.field6527 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZLhl;)V", line = 51)
    public final void method2424(boolean arg0, class486 arg1) {
        if (arg0) {
            this.method2426(-54, -80);
        }
        ++field6536;
        super.field6012[super.field6011] = 20;
        super.field6016[super.field6011] = arg1;
        ++super.field6011;
        if (super.field6011 >= 5000) {
            super.field6011 = 0;
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)V", line = 68)
    public final void method2430(int arg0, int arg1) {
        int var3 = 48 / ((-46 - arg0) / 36);
        ++field6535;
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(B)V", line = 77)
    private final void method2664(byte arg0) {
        ++field6528;
        int var2 = super.field6018++;
        if (super.field6018 >= 5000) {
            super.field6018 = 0;
        }
        if (arg0 != 82) {
            this.method2422(-77, 55, true, (class136) null);
        }
        this.field6537 = super.field6012[var2];
        Object var3 = super.field6016[var2];
        super.field6016[var2] = null;
        if (this.field6537 == 21) {
            class165.method1144(this.field6527, (class486) var3);
        } else if (this.field6537 != 20) {
            if (~this.field6537 <= -31 && ~this.field6537 >= -34) {
                ((class136) var3).method271(class532.field7247, class159.field2386, class614.field8507, class525.field7157, ~(this.field6537 + -30) == -1);
            } else if (this.field6537 >= 40 && this.field6537 <= 43) {
                ((class136) var3).method271(class532.field7247, class159.field2386, class614.field8507, class81.field1138, ~(this.field6537 + -40) == -1);
            } else if (~this.field6537 == -23) {
                class449.field6276.method468(-1, 1583160, 40, 127);
            } else {
                if (this.field6537 != 23) {
                    if (this.field6537 == 24) {
                        class449.field6276.method398(0, (class154[]) null);
                        return;
                    }
                } else {
                    class449.field6276.method406();
                }
            }
        } else {
            class486 var4 = (class486) var3;
            if (var4.field6750 != null) {
                var4.field6750.method552(true, class449.field6276);
            }
            if (var4.field6741 != null) {
                var4.field6741.method552(true, class449.field6276);
            }
            if (var4.field6729 != null) {
                var4.field6729.method552(true, class449.field6276);
            }
            if (var4.field6728 != null) {
                var4.field6728.method552(true, class449.field6276);
            }
            if (var4.field6748 != null) {
                var4.field6748.method552(true, class449.field6276);
            }
            for (class20 var5 = var4.field6751; var5 != null; var5 = var5.field284) {
                var5.field281.method552(true, class449.field6276);
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lhl;B)V", line = 173)
    public final void method2420(class486 arg0, byte arg1) {
        ++field6530;
        super.field6012[super.field6011] = 21;
        super.field6016[super.field6011] = arg0;
        ++super.field6011;
        if (arg1 != 118) {
            this.method2424(true, (class486) null);
        }
        if (super.field6011 >= 5000) {
            super.field6011 = 0;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)V", line = 192)
    public final void method2426(int arg0, int arg1) {
        ++field6534;
        super.field6012[super.field6011] = (byte) arg0;
        if (arg1 != -4136) {
            this.field6537 = -120;
        }
        ++super.field6011;
        if (~super.field6011 <= -5001) {
            super.field6011 = 0;
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(ZLhl;)V", line = 209)
    public final void method2429(boolean arg0, class486 arg1) {
        --super.field6018;
        ++field6533;
        if (~super.field6018 > -1) {
            super.field6018 = 4999;
        }
        super.field6012[super.field6018] = 21;
        if (arg0) {
            super.field6016[super.field6018] = arg1;
        }
    }
}
