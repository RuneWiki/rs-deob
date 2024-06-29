import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class69 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Lce;")
    public static class126 field1130 = class206.method1445(-7923, "0(U");

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field1143 = 0;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field1144 = 127;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "Lce;")
    public static class126 field1138 = class206.method1445(-7923, "Mem:");

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public int field1136;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public int field1145;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    private int field1146;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "[[B")
    public static byte[][] field1132;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BLce;)Z", line = 4)
    public static final boolean method501(byte arg0, class126 arg1) {
        field1137++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class116.field1961; var2++) {
            if (arg1.method881(class112.field1887[var2], (byte) 92)) {
                return true;
            }
        }
        if (arg0 < 13) {
            field1132 = (byte[][]) ((byte[][]) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)Lvj;", line = 45)
    public final class184 method502(int arg0) {
        field1133++;
        class184 var2 = (class184) class81.field1305.method1173(-19839, (long) this.field1146);
        if (var2 != null) {
            return var2;
        }
        int var3 = 1 % ((34 - arg0) / 51);
        class184 var4 = class214.method1483(-5048, this.field1146, class269.field4538, 0);
        if (var4 != null) {
            class81.field1305.method1179(var4, (long) this.field1146, (byte) -72);
        }
        return var4;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)Lpa;", line = 73)
    public static final class152 method503(byte arg0, int arg1) {
        field1142++;
        if (arg0 != -13) {
            field1143 = -51;
        }
        if (arg1 == 0) {
            return new class226();
        } else if (arg1 == 1) {
            return new class7();
        } else if (arg1 == 2) {
            return new class212();
        } else if (arg1 == 3) {
            return new class102();
        } else if (arg1 == 4) {
            return new class22();
        } else if (arg1 == 5) {
            return new class257();
        } else if (arg1 == 6) {
            return new class36();
        } else if (arg1 == 7) {
            return new class19();
        } else if (arg1 == 8) {
            return new class47();
        } else if (arg1 == 9) {
            return new class270();
        } else if (arg1 == 10) {
            return new class272();
        } else if (arg1 == 11) {
            return new class255();
        } else if (arg1 == 12) {
            return new class1();
        } else if (arg1 == 13) {
            return new class28();
        } else if (arg1 == 14) {
            return new class228();
        } else if (arg1 == 15) {
            return new class203();
        } else if (arg1 == 16) {
            return new class122();
        } else if (arg1 == 17) {
            return new class131();
        } else if (arg1 == 18) {
            return new class4();
        } else if (arg1 == 19) {
            return new class20();
        } else if (arg1 == 20) {
            return new class197();
        } else if (arg1 == 21) {
            return new class250();
        } else if (arg1 == 22) {
            return new class243();
        } else if (arg1 == 23) {
            return new class153();
        } else if (arg1 == 24) {
            return new class263();
        } else if (arg1 == 25) {
            return new class10();
        } else if (arg1 == 26) {
            return new class175();
        } else if (arg1 == 27) {
            return new class159();
        } else if (arg1 == 28) {
            return new class254();
        } else if (arg1 == 29) {
            return new class52();
        } else if (arg1 == 30) {
            return new class281();
        } else if (arg1 == 31) {
            return new class194();
        } else if (arg1 == 32) {
            return new class207();
        } else if (arg1 == 33) {
            return new class280();
        } else if (arg1 == 34) {
            return new class91();
        } else if (arg1 == 35) {
            return new class193();
        } else if (arg1 == 36) {
            return new class75();
        } else if (arg1 == 37) {
            return new class140();
        } else if (arg1 == 38) {
            return new class309();
        } else if (arg1 == 39) {
            return new class214();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V", line = 395)
    public static void method504(int arg0) {
        if (arg0 != -13269) {
            method501((byte) -21, (class126) null);
        }
        field1132 = (byte[][]) null;
        field1138 = null;
        field1130 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)V", line = 409)
    public static final void method505(int arg0, byte arg1) {
        field1141++;
        if (arg1 == 19) {
            class32.field457.method1175(true, arg0);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V", line = 422)
    public static final void method506(int arg0, int arg1) {
        if (arg1 == -1 && !class51.field785) {
            class176.method1273((byte) -106);
        } else if (arg1 != -1 && (class200.field3412 != arg1 || !class98.method668((byte) 121)) && class159.field2866 != 0 && !class51.field785) {
            class39.method243(arg1, 2, class4.field28, 0, false, class159.field2866, -128);
        }
        class200.field3412 = arg1;
        if (arg0 != 2) {
            method505(-94, (byte) -113);
        }
        field1131++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILbb;I)V", line = 447)
    private final void method507(int arg0, int arg1, class134 arg2, int arg3) {
        if (~arg3 == arg1) {
            this.field1146 = arg2.method942(true);
        } else if (arg3 == 2) {
            this.field1136 = arg2.method948(arg1 - 123);
            this.field1145 = arg2.method948(-122);
        }
        field1140++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V", line = 478)
    public static final void method508(byte arg0) {
        field1139++;
        if (class182.field3162 != -1) {
            class152.method1128(class182.field3162, -101);
        }
        if (arg0 >= -13) {
            field1138 = (class126) null;
        }
        for (int var1 = 0; var1 < class320.field5481; var1++) {
            if (class220.field3698[var1]) {
                class250.field4186[var1] = true;
            }
            class234.field3956[var1] = class220.field3698[var1];
            class220.field3698[var1] = false;
        }
        class162.field2919 = -1;
        if (class56.field846) {
            class59.field923 = true;
        }
        class58.field898 = null;
        class249.field4164 = -1;
        class163.field2924 = class249.field4174;
        if (class182.field3162 != -1) {
            class320.field5481 = 0;
            class264.method1773(class1.field6, class7.field87, 0, 0, 0, 0, -1, (byte) 122, class182.field3162);
        }
        if (class56.field846) {
            class101.method682();
        } else {
            class276.method1860();
        }
        class303.field5038 = 0;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBLbb;)V", line = 534)
    public final void method509(int arg0, byte arg1, class134 arg2) {
        field1135++;
        if (arg1 > -1) {
            return;
        }
        while (true) {
            int var4 = arg2.method948(-125);
            if (var4 == 0) {
                return;
            }
            this.method507(arg0, -2, arg2, var4);
        }
    }
}
