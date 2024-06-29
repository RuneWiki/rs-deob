import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class143 extends class335 {

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    private int field2129 = 0;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "Ljd;")
    private class152 field2131 = new class152();

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "Lri;")
    public static class73 field2133;

    @OriginalMember(owner = "client!jf", name = "I", descriptor = "[[S")
    public static short[][] field2143;

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "Lvp;")
    public static class123 field2142;

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "Lng;")
    public static class226 field2145;

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "F")
    public static float field2141;

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "F")
    public static float field2144;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZLfl;)V")
    public final void method943(boolean arg0, class518 arg1) {
        if (arg0) {
            super.field4718[super.field4722] = 20;
            ++field2140;
            super.field4717[super.field4722] = arg1;
            ++super.field4722;
            if (super.field4722 >= 5000) {
                super.field4722 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
    private final void method944(int arg0) {
        ++field2138;
        int var2 = super.field4720++;
        if (~super.field4720 <= -5001) {
            super.field4720 = 0;
        }
        int var3 = 97 / ((arg0 - -54) / 38);
        this.field2129 = super.field4718[var2];
        Object var4 = super.field4717[var2];
        super.field4717[var2] = null;
        if (~this.field2129 == -22) {
            class94.method546(this.field2131, (class518) var4);
        } else if (~this.field2129 != -21) {
            if (~this.field2129 <= -31 && ~this.field2129 >= -34) {
                class271.field3941.method1039(3000.0F, super.field4725[var2] * 1.5F);
                ((class35) var4).method207(class381.field5776, class346.field4983, class367.field5607, class329.field4682, this.field2129 + -30 == 0);
            } else if (this.field2129 >= 40 && this.field2129 <= 43) {
                class271.field3941.method1039(3000.0F, super.field4725[var2] * 1.5F);
                ((class35) var4).method207(class381.field5776, class346.field4983, class367.field5607, class467.field6892, ~(this.field2129 + -40) == -1);
            } else if (~this.field2129 != -23) {
                if (~this.field2129 != -24) {
                    if (~this.field2129 == -25) {
                        class271.field3941.method1068(0, (class107[]) null);
                        return;
                    }
                } else {
                    class271.field3941.method1116();
                }
            } else {
                class271.field3941.method1120(-1, 1583160, 40, 127);
            }
        } else {
            class518 var5 = (class518) var4;
            if (var5.field7559 != null) {
                var5.field7559.method10((byte) -32, class271.field3941);
            }
            if (var5.field7570 != null) {
                var5.field7570.method10((byte) -32, class271.field3941);
            }
            if (var5.field7551 != null) {
                var5.field7551.method10((byte) -32, class271.field3941);
            }
            if (var5.field7552 != null) {
                var5.field7552.method10((byte) -32, class271.field3941);
            }
            if (var5.field7550 != null) {
                var5.field7550.method10((byte) -32, class271.field3941);
            }
            for (class284 var6 = var5.field7569; var6 != null; var6 = var6.field4087) {
                var6.field4083.method10((byte) -32, class271.field3941);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public final void method945(byte arg0) {
        if (arg0 == -14) {
            ++field2139;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILfl;)V")
    public final void method946(int arg0, class518 arg1) {
        super.field4718[super.field4722] = 21;
        ++field2127;
        super.field4717[super.field4722] = arg1;
        ++super.field4722;
        if (~super.field4722 <= -5001) {
            super.field4722 = 0;
        }
        if (arg0 >= -71) {
            field2137 = -75;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
    public final void method947(int arg0, int arg1) {
        if (arg1 == 2) {
            ++field2128;
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
    public static void method948(int arg0) {
        field2142 = null;
        if (arg0 == 571) {
            field2145 = null;
            field2133 = null;
            field2143 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
    public final void method949(int arg0) {
        while (~super.field4722 != ~super.field4720) {
            this.method944(64);
        }
        ++field2126;
        if (arg0 != 38) {
            field2142 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)V")
    public final void method950(int arg0, byte arg1) {
        ++field2130;
        super.field4718[super.field4722] = (byte) arg0;
        ++super.field4722;
        if (arg1 == 41) {
            if (super.field4722 >= 5000) {
                super.field4722 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BFLna;IZ)V")
    public final void method951(byte arg0, float arg1, class35 arg2, int arg3, boolean arg4) {
        ++field2135;
        if (arg0 > -126) {
            this.field2131 = null;
        }
        super.field4718[super.field4722] = (byte) (!arg4 ? arg3 + 30 : arg3 + 40);
        super.field4717[super.field4722] = arg2;
        super.field4725[super.field4722] = arg1;
        ++super.field4722;
        if (super.field4722 >= 5000) {
            super.field4722 = 0;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lqa;BII)V")
    public static final void method952(class162 arg0, byte arg1, int arg2, int arg3) {
        class33.field345 = arg0;
        ++field2136;
        if (arg1 < 96) {
            method952((class162) null, (byte) 39, -36, -78);
        }
        class491.field7281 = new class234[arg3][arg2];
        if (class203.field2928 != null) {
            class251.field3732 = class522.method3095(class203.field2928[3], class203.field2928[0], -78, class203.field2928[2], class203.field2928[1], class203.field2928[4], class203.field2928[5]);
        }
        class235.field3486 = new class234();
        class277.method1809((byte) 91);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lfl;B)V")
    public final void method953(class518 arg0, byte arg1) {
        int var3 = -11 % ((26 - arg1) / 54);
        --super.field4720;
        ++field2132;
        if (super.field4720 < 0) {
            super.field4720 = 4999;
        }
        super.field4718[super.field4720] = 21;
        super.field4717[super.field4720] = arg0;
    }

    static {
        new class475("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field2137 = 0;
        field2133 = new class73(6, 8);
        field2143 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field2142 = new class123();
        field2145 = new class226(64);
    }
}
