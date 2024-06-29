import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class54 extends class22 {

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    private int field839 = 0;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "Lis;")
    private class330 field834 = new class330();

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "Lwt;")
    public static class194 field841 = new class194("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "Lum;")
    public static class347 field842 = new class347();

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "Lgn;")
    public static class475 field843 = new class475(2, 6);

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "[I")
    public static int[] field844 = new int[99];

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public final void method156(byte arg0) {
        if (arg0 <= 93) {
            field844 = null;
        }
        ++field838;
        while (super.field289 != super.field287) {
            this.method412(-26);
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V")
    public static final void method410(byte arg0) {
        ++field836;
        if (arg0 < 75) {
            field842 = null;
        }
        int var1 = (int) ((double) class362.field5442 * 34.46D);
        int var2 = var1 << 0;
        if (class481.field6937.method774()) {
            var2 += 128;
        }
        class481.field6937.method814(50, var2);
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)V")
    public static void method411(byte arg0) {
        field844 = null;
        field843 = null;
        if (arg0 <= 65) {
            field843 = null;
        }
        field841 = null;
        field842 = null;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(BLhg;)V")
    public final void method155(byte arg0, class468 arg1) {
        super.field286[super.field287] = 21;
        ++field829;
        super.field290[super.field287] = arg1;
        ++super.field287;
        if (~super.field287 <= -5001) {
            super.field287 = 0;
        }
        if (arg0 != 108) {
            this.method150((class468) null, -65);
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V")
    private final void method412(int arg0) {
        ++field835;
        int var2 = super.field289++;
        if (super.field289 >= 5000) {
            super.field289 = 0;
        }
        this.field839 = super.field286[var2];
        int var3 = 124 / ((arg0 - 47) / 44);
        Object var4 = super.field290[var2];
        super.field290[var2] = null;
        if (this.field839 == 21) {
            class376.method2284(this.field834, (class468) var4);
        } else if (~this.field839 != -21) {
            if (this.field839 >= 30 && ~this.field839 >= -34) {
                class473.field6834.method821(3000.0F, super.field291[var2] * 1.5F);
                ((class441) var4).method859(class463.field6724, class284.field4053, class210.field2977, class52.field777, this.field839 + -30 == 0);
            } else if (this.field839 >= 40 && ~this.field839 >= -44) {
                class473.field6834.method821(3000.0F, super.field291[var2] * 1.5F);
                ((class441) var4).method859(class463.field6724, class284.field4053, class210.field2977, class139.field1822, this.field839 + -40 == 0);
            } else if (~this.field839 != -23) {
                if (~this.field839 != -24) {
                    if (~this.field839 == -25) {
                        class473.field6834.method766(0, (class472[]) null);
                        return;
                    }
                } else {
                    class473.field6834.method768();
                }
            } else {
                class473.field6834.method808(-1, 1583160, 40, 127);
            }
        } else {
            class468 var5 = (class468) var4;
            if (var5.field6778 != null) {
                var5.field6778.method361(class473.field6834, -1);
            }
            if (var5.field6766 != null) {
                var5.field6766.method361(class473.field6834, -1);
            }
            if (var5.field6772 != null) {
                var5.field6772.method361(class473.field6834, -1);
            }
            if (var5.field6777 != null) {
                var5.field6777.method361(class473.field6834, -1);
            }
            if (var5.field6761 != null) {
                var5.field6761.method361(class473.field6834, -1);
            }
            for (class323 var6 = var5.field6769; var6 != null; var6 = var6.field4727) {
                var6.field4726.method361(class473.field6834, -1);
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lhg;I)V")
    public final void method150(class468 arg0, int arg1) {
        ++field828;
        super.field286[super.field287] = 20;
        super.field290[super.field287] = arg0;
        if (arg1 <= 82) {
            this.method157(-51);
        }
        ++super.field287;
        if (~super.field287 <= -5001) {
            super.field287 = 0;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
    public final void method157(int arg0) {
        if (arg0 < 2) {
            method410((byte) -73);
        }
        ++field832;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lhe;B)V")
    public static final void method413(class239 arg0, byte arg1) {
        if (arg1 == 12) {
            class110.field1443 = arg0;
            ++field830;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V")
    public final void method153(int arg0, int arg1) {
        ++field827;
        if (arg1 != 4) {
            method411((byte) 3);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLhg;)V")
    public final void method149(byte arg0, class468 arg1) {
        --super.field289;
        int var3 = -74 % ((arg0 - 65) / 38);
        ++field837;
        if (~super.field289 > -1) {
            super.field289 = 4999;
        }
        super.field286[super.field289] = 21;
        super.field290[super.field289] = arg1;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Log;IIFZ)V")
    public final void method148(class441 arg0, int arg1, int arg2, float arg3, boolean arg4) {
        ++field840;
        super.field286[super.field287] = (byte) (!arg4 ? arg2 + 30 : arg2 + 40);
        if (arg1 == 0) {
            super.field290[super.field287] = arg0;
            super.field291[super.field287] = arg3;
            ++super.field287;
            if (super.field287 >= 5000) {
                super.field287 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILhe;IZII)V")
    public static final void method414(int arg0, int arg1, class239 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class409.field6002 = arg0;
        class25.field424 = arg4;
        if (arg5 <= 123) {
            method411((byte) 6);
        }
        class8.field139 = arg3;
        class55.field857 = arg1;
        class181.field2593 = arg2;
        class376.field5626 = arg6;
        class378.field5658 = 1;
        ++field831;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)V")
    public final void method154(int arg0, int arg1) {
        if (arg1 != 5000) {
            field843 = null;
        }
        super.field286[super.field287] = (byte) arg0;
        ++field833;
        ++super.field287;
        if (~super.field287 <= -5001) {
            super.field287 = 0;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -100; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field844[var1] = var0 / 4;
        }
    }
}
