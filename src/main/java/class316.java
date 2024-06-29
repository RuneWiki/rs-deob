import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class316 extends class301 {

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
    private int field4614 = 0;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "Ljba;")
    private class648 field4607 = new class648();

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "Lbv;")
    public static class567 field4613 = new class567("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "Lch;")
    public static class205 field4615;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLsa;FII)V", line = 3)
    public final void method848(boolean arg0, class542 arg1, float arg2, int arg3, int arg4) {
        super.field4343[super.field4340] = (byte) (!arg0 ? arg3 + 30 : arg3 + 40);
        ++field4606;
        super.field4350[super.field4340] = arg1;
        super.field4342[super.field4340] = arg2;
        ++super.field4340;
        if (~super.field4340 <= -5001) {
            super.field4340 = 0;
        }
        if (arg4 != 5357) {
            method1947(false);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)V", line = 24)
    public final void method846(byte arg0, int arg1) {
        ++field4602;
        super.field4343[super.field4340] = (byte) arg1;
        int var3 = -64 % ((arg0 - 16) / 57);
        ++super.field4340;
        if (~super.field4340 <= -5001) {
            super.field4340 = 0;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V", line = 41)
    public final void method849(byte arg0) {
        ++field4610;
        if (arg0 > -76) {
            field4615 = null;
        }
        while (super.field4351 != super.field4340) {
            this.method1946((byte) 83);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILgp;B)Ldba;", line = 55)
    public static final class221 method1945(int arg0, class561 arg1, byte arg2) {
        ++field4609;
        byte[] var3 = arg1.method3177(0, arg0);
        if (arg2 != 20) {
            method1947(true);
        }
        return var3 == null ? null : new class221(var3);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lbr;B)V", line = 74)
    public final void method850(class184 arg0, byte arg1) {
        ++field4601;
        --super.field4351;
        if (~super.field4351 > -1) {
            super.field4351 = 4999;
        }
        int var3 = 39 % ((-34 - arg1) / 37);
        super.field4343[super.field4351] = 21;
        super.field4350[super.field4351] = arg0;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 94)
    public final void method855(int arg0) {
        if (arg0 < -28) {
            ++field4604;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILbr;)V", line = 104)
    public final void method852(int arg0, class184 arg1) {
        if (arg0 == 6186) {
            ++field4608;
            super.field4343[super.field4340] = 20;
            super.field4350[super.field4340] = arg1;
            ++super.field4340;
            if (super.field4340 >= 5000) {
                super.field4340 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)V", line = 120)
    private final void method1946(byte arg0) {
        int var2 = 92 % ((16 - arg0) / 60);
        ++field4611;
        int var3 = super.field4351++;
        if (super.field4351 >= 5000) {
            super.field4351 = 0;
        }
        this.field4614 = super.field4343[var3];
        Object var4 = super.field4350[var3];
        super.field4350[var3] = null;
        if (~this.field4614 == -22) {
            class536.method3022(this.field4607, (class184) var4);
        } else if (~this.field4614 != -21) {
            if (~this.field4614 <= -31 && this.field4614 <= 33) {
                class103.field1747.method517(3000.0F, super.field4342[var3] * 1.5F);
                ((class542) var4).method691(class119.field1913, class389.field5811, class90.field1610, class183.field2645, this.field4614 + -30 == 0);
            } else if (this.field4614 >= 40 && this.field4614 <= 43) {
                class103.field1747.method517(3000.0F, super.field4342[var3] * 1.5F);
                ((class542) var4).method691(class119.field1913, class389.field5811, class90.field1610, class604.field8600, ~(this.field4614 + -40) == -1);
            } else {
                if (this.field4614 != 22) {
                    if (~this.field4614 == -24) {
                        class103.field1747.method585();
                        return;
                    }
                    if (this.field4614 == 24) {
                        class103.field1747.method586(0, (class637[]) null);
                        return;
                    }
                } else {
                    class103.field1747.method658(-1, 1583160, 40, 127);
                }
            }
        } else {
            class184 var5 = (class184) var4;
            if (var5.field2669 != null) {
                var5.field2669.method266(class103.field1747, (byte) -40);
            }
            if (var5.field2653 != null) {
                var5.field2653.method266(class103.field1747, (byte) -40);
            }
            if (var5.field2672 != null) {
                var5.field2672.method266(class103.field1747, (byte) -40);
            }
            if (var5.field2666 != null) {
                var5.field2666.method266(class103.field1747, (byte) -40);
            }
            if (var5.field2662 != null) {
                var5.field2662.method266(class103.field1747, (byte) -40);
            }
            for (class277 var6 = var5.field2675; var6 != null; var6 = var6.field4045) {
                var6.field4044.method266(class103.field1747, (byte) -40);
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V", line = 211)
    public static void method1947(boolean arg0) {
        if (arg0) {
            field4615 = null;
        }
        field4613 = null;
        field4615 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLbr;)V", line = 223)
    public final void method854(boolean arg0, class184 arg1) {
        super.field4343[super.field4340] = 21;
        ++field4605;
        super.field4350[super.field4340] = arg1;
        if (!arg0) {
            this.field4607 = null;
        }
        ++super.field4340;
        if (super.field4340 >= 5000) {
            super.field4340 = 0;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II[I[JI)V", line = 240)
    public static final void method1948(int arg0, int arg1, int[] arg2, long[] arg3, int arg4) {
        if (arg4 != 23109) {
            method1945(54, (class561) null, (byte) -96);
        }
        if (~arg1 < ~arg0) {
            int var5 = (arg0 - -arg1) / 2;
            int var6 = arg0;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var7;
            int var9 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg0; var11 < arg1; ++var11) {
                if ((long) (var10 & var11) + var7 > arg3[var11]) {
                    long var12 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6] = var12;
                    int var14 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6++] = var14;
                }
            }
            arg3[arg1] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg1] = arg2[var6];
            arg2[var6] = var9;
            method1948(arg0, var6 - 1, arg2, arg3, arg4);
            method1948(var6 + 1, arg1, arg2, arg3, 23109);
        }
        ++field4612;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)V", line = 297)
    public final void method853(int arg0, byte arg1) {
        ++field4603;
        if (arg1 != -98) {
            this.field4607 = null;
        }
    }
}
