import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class76 {

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "F")
    public float field1084 = 0.25F;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "F")
    public float field1091 = 1.0F;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "F")
    public float field1080 = 1.0F;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "F")
    public float field1088;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public int field1085;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "F")
    public float field1097;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "Lqe;")
    public class275 field1089;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    public int field1093;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "I")
    public int field1099;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
    public int field1096;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public int field1081;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "F")
    public float field1086;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "Lkn;")
    public static class442 field1092 = new class442("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "I")
    public static int field1100 = 0;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILkh;)V", line = 3)
    public final void method560(int arg0, class11 arg1) {
        field1079++;
        if (arg0 != 9231) {
            this.field1082 = -126;
        }
        this.field1091 = (float) (arg1.method172((byte) 52) * 8) / 255.0F;
        this.field1084 = (float) (arg1.method172((byte) 52) * 8) / 255.0F;
        this.field1080 = (float) (arg1.method172((byte) 52) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)I", line = 23)
    public static final int method561(int arg0, int arg1) {
        field1098++;
        if (arg0 != 255) {
            method562(-2, 51, -36, 8);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)I", line = 39)
    public static final int method562(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 39) {
            return 21;
        }
        if (arg3 > 243) {
            arg1 >>= 0x4;
        } else if (arg3 > 217) {
            arg1 >>= 0x3;
        } else if (arg3 > 192) {
            arg1 >>= 0x2;
        } else if (arg3 > 179) {
            arg1 >>= 0x1;
        }
        field1090++;
        return (arg1 >> 5 << 7) + ((arg2 >> 2 & 0x3F) << 10) + (arg3 >> 1);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lwk;I)Z", line = 71)
    public final boolean method563(class76 arg0, int arg1) {
        if (arg1 <= 62) {
            method566((byte) -70);
        }
        field1078++;
        return this.field1096 == arg0.field1096 && this.field1097 == arg0.field1097 && this.field1088 == arg0.field1088 && this.field1086 == arg0.field1086 && this.field1084 == arg0.field1084 && this.field1091 == arg0.field1091 && this.field1080 == arg0.field1080 && this.field1082 == arg0.field1082 && this.field1081 == arg0.field1081 && this.field1089 == arg0.field1089;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZI)V", line = 82)
    public static final void method564(boolean arg0, int arg1) {
        if (arg1 != -23445) {
            field1094 = 109;
        }
        field1087++;
        for (class194 var2 = (class194) class375.field5353.method646(arg1 ^ 0xFFFFA45B); var2 != null; var2 = (class194) class375.field5353.method641(false)) {
            if (var2.field2659 != null) {
                class164.field2266.method2788(var2.field2659);
                var2.field2659 = null;
            }
            if (var2.field2658 != null) {
                class164.field2266.method2788(var2.field2658);
                var2.field2658 = null;
            }
            var2.method2467((byte) 64);
        }
        if (!arg0) {
            return;
        }
        for (class194 var3 = (class194) class447.field6276.method646(48); var3 != null; var3 = (class194) class447.field6276.method641(false)) {
            if (var3.field2659 != null) {
                class164.field2266.method2788(var3.field2659);
                var3.field2659 = null;
            }
            var3.method2467((byte) 121);
        }
        for (class194 var4 = (class194) class188.field2593.method885(-115); var4 != null; var4 = (class194) class188.field2593.method881((byte) -68)) {
            if (var4.field2659 != null) {
                class164.field2266.method2788(var4.field2659);
                var4.field2659 = null;
            }
            var4.method2467((byte) -92);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 151)
    public static final String method565(byte arg0, String arg1) {
        if (arg0 > -11) {
            field1092 = null;
        }
        field1083++;
        String var2 = class357.method2282(true, class67.method527(arg1, (byte) -124));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V", line = 205)
    public class76() {
        this.field1088 = 0.69921875F;
        this.field1085 = -50;
        this.field1097 = 1.1523438F;
        this.field1089 = class66.field986;
        this.field1093 = -50;
        this.field1099 = -60;
        this.field1096 = class19.field344;
        this.field1081 = 0;
        this.field1082 = class269.field3745;
        this.field1086 = 1.2F;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lkh;)V", line = 221)
    public class76(class11 arg0) {
        int var2 = arg0.method172((byte) 52);
        if (class312.field4271 && class341.field4664.method48() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field1096 = class19.field344;
            } else {
                this.field1096 = arg0.method185(25239);
            }
            if ((var2 & 0x2) == 0) {
                this.field1097 = 1.1523438F;
            } else {
                this.field1097 = (float) arg0.method174(255) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field1088 = 0.69921875F;
            } else {
                this.field1088 = (float) arg0.method174(255) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field1086 = 1.2F;
            } else {
                this.field1086 = (float) arg0.method174(255) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method185(25239);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method174(255);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method174(255);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method174(255);
            }
            this.field1096 = class19.field344;
            this.field1086 = 1.2F;
            this.field1097 = 1.1523438F;
            this.field1088 = 0.69921875F;
        }
        if ((var2 & 0x10) == 0) {
            this.field1085 = -50;
            this.field1099 = -60;
            this.field1093 = -50;
        } else {
            this.field1093 = arg0.method207(7124);
            this.field1099 = arg0.method207(7124);
            this.field1085 = arg0.method207(7124);
        }
        if ((var2 & 0x20) == 0) {
            this.field1082 = class269.field3745;
        } else {
            this.field1082 = arg0.method185(25239);
        }
        if ((var2 & 0x40) == 0) {
            this.field1081 = 0;
        } else {
            this.field1081 = arg0.method174(255);
        }
        if ((var2 & 0x80) == 0) {
            this.field1089 = class66.field986;
        } else {
            this.field1089 = class46.method406((byte) -92, arg0.method174(255), arg0.method174(255), arg0.method174(255), arg0.method174(255), arg0.method174(255), arg0.method174(255));
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V", line = 183)
    public static void method566(byte arg0) {
        if (arg0 != -100) {
            field1100 = 23;
        }
        field1092 = null;
    }
}
