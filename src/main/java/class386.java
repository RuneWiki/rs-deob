import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class386 extends class431 {

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public int field5802;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public int field5805;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field5807 = -50;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "Lak;")
    public static class234 field5809 = new class234("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)I", line = 8)
    public final int method2410(int arg0) {
        field5801++;
        if (arg0 != -16758) {
            this.field5802 = -53;
        }
        return class398.method2506(this.field5805, 0);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)Leu;", line = 20)
    public static final class337 method2411(int arg0, int arg1) {
        field5806++;
        if (arg1 != -31312) {
            method2412((byte) 49);
        }
        if (arg0 == 0) {
            return new class448();
        } else if (arg0 == 1) {
            return new class482();
        } else if (arg0 == 2) {
            return new class336();
        } else if (arg0 == 3) {
            return new class298();
        } else if (arg0 == 4) {
            return new class142();
        } else if (arg0 == 5) {
            return new class372();
        } else if (arg0 == 6) {
            return new class299();
        } else if (arg0 == 7) {
            return new class161();
        } else if (arg0 == 8) {
            return new class111();
        } else if (arg0 == 9) {
            return new class444();
        } else if (arg0 == 10) {
            return new class271();
        } else if (arg0 == 11) {
            return new class246();
        } else if (arg0 == 12) {
            return new class153();
        } else if (arg0 == 13) {
            return new class274();
        } else if (arg0 == 14) {
            return new class401();
        } else if (arg0 == 15) {
            return new class228();
        } else if (arg0 == 16) {
            return new class522();
        } else if (arg0 == 17) {
            return new class375();
        } else if (arg0 == 18) {
            return new class419();
        } else if (arg0 == 19) {
            return new class434();
        } else if (arg0 == 20) {
            return new class323();
        } else if (arg0 == 21) {
            return new class322();
        } else if (arg0 == 22) {
            return new class78();
        } else if (arg0 == 23) {
            return new class87();
        } else if (arg0 == 24) {
            return new class302();
        } else if (arg0 == 25) {
            return new class131();
        } else if (arg0 == 26) {
            return new class450();
        } else if (arg0 == 27) {
            return new class226();
        } else if (arg0 == 28) {
            return new class24();
        } else if (arg0 == 29) {
            return new class472();
        } else if (arg0 == 30) {
            return new class175();
        } else if (arg0 == 31) {
            return new class494();
        } else if (arg0 == 32) {
            return new class282();
        } else if (arg0 == 33) {
            return new class122();
        } else if (arg0 == 34) {
            return new class517();
        } else if (arg0 == 35) {
            return new class430();
        } else if (arg0 == 36) {
            return new class167();
        } else if (arg0 == 37) {
            return new class264();
        } else if (arg0 == 38) {
            return new class272();
        } else if (arg0 == 39) {
            return new class467();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V", line = 340)
    public static void method2412(byte arg0) {
        if (arg0 < 31) {
            method2411(76, -127);
        }
        field5809 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)Z", line = 350)
    public final boolean method2413(byte arg0, int arg1) {
        field5810++;
        if (arg0 > -97) {
            return false;
        } else {
            return (this.field5805 >> arg1 + 1 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(II)V", line = 362)
    public class386(int arg0, int arg1) {
        this.field5802 = arg1;
        this.field5805 = arg0;
    }

    @OriginalMember(owner = "client!el", name = "g", descriptor = "(I)V", line = 383)
    public static final void method2414(int arg0) {
        class74.method643(arg0, (byte) -68);
        field5804++;
        class356.method2232(108);
        System.gc();
    }

    @OriginalMember(owner = "client!el", name = "h", descriptor = "(I)Z", line = 393)
    public final boolean method2415(int arg0) {
        field5811++;
        if (arg0 == 6840) {
            return (this.field5805 >> 21 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(B)Z", line = 404)
    public final boolean method2416(byte arg0) {
        field5800++;
        if (arg0 != -72) {
            field5807 = 24;
        }
        return (this.field5805 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!el", name = "i", descriptor = "(I)I", line = 415)
    public final int method2417(int arg0) {
        field5808++;
        if (arg0 != -29) {
            this.field5802 = 17;
        }
        return (this.field5805 & 0x1D1196) >> 18;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(B)Z", line = 426)
    public final boolean method2418(byte arg0) {
        field5803++;
        if (arg0 != -47) {
            this.method2413((byte) -95, -52);
        }
        return (this.field5805 & 0x1) != 0;
    }
}
