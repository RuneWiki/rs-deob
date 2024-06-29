import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class448 {

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Z")
    public boolean field6891 = false;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public int field6893 = 1190717;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Z")
    public boolean field6902 = true;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public int field6890 = 128;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public int field6899 = -1;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public int field6901 = 8;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public int field6892 = 16;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "Z")
    public boolean field6910 = true;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public int field6908 = -1;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public int field6895 = 0;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public int field6909 = 127;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public int field6906 = -1;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Lsk;")
    public static class423 field6898 = new class423("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field6905 = 0;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "Lnd;")
    public static class366 field6904 = new class366(11, 3);

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public int field6897;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "I")
    public static int field6911;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
    public static int field6912;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    public static int field6913;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Lku;")
    public class244 field6894;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 4)
    public static void method2676(int arg0) {
        if (arg0 >= 126) {
            field6898 = null;
            field6904 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)Ljava/lang/String;", line = 21)
    public static final String method2677(int arg0, int arg1, byte arg2) {
        field6911++;
        if (arg2 <= 40) {
            method2676(55);
        }
        int var3 = arg1 - arg0;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZLha;)V", line = 65)
    private final void method2678(int arg0, boolean arg1, class40 arg2) {
        if (arg1) {
            method2677(48, 29, (byte) 74);
        }
        if (arg0 == 1) {
            this.field6895 = class262.method1594(arg2.method224(-2), 28827);
        } else if (arg0 == 2) {
            this.field6899 = arg2.method257((byte) 110);
        } else if (arg0 == 3) {
            this.field6899 = arg2.method254((byte) -102);
            if (this.field6899 == 65535) {
                this.field6899 = -1;
            }
        } else if (arg0 == 5) {
            this.field6910 = false;
        } else if (arg0 == 7) {
            this.field6908 = class262.method1594(arg2.method224(-2), 28827);
        } else if (arg0 == 8) {
            this.field6894.field3671 = this.field6897;
        } else if (arg0 == 9) {
            this.field6890 = arg2.method254((byte) -46) << 0;
        } else if (arg0 == 10) {
            this.field6902 = false;
        } else if (arg0 == 11) {
            this.field6901 = arg2.method257((byte) 74);
        } else if (arg0 == 12) {
            this.field6891 = true;
        } else if (arg0 == 13) {
            this.field6893 = arg2.method224(-2);
        } else if (arg0 == 14) {
            this.field6892 = arg2.method257((byte) 66);
        } else if (arg0 == 15) {
            this.field6906 = arg2.method254((byte) -46);
            if (this.field6906 == 65535) {
                this.field6906 = -1;
            }
        } else if (arg0 == 16) {
            this.field6909 = arg2.method257((byte) 72);
        }
        field6907++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILha;)V", line = 152)
    public final void method2679(int arg0, class40 arg1) {
        while (true) {
            int var3 = arg1.method257((byte) 57);
            if (var3 == 0) {
                if (arg0 != -2) {
                    method2681(56, -27);
                }
                field6900++;
                return;
            }
            this.method2678(var3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V", line = 176)
    public final void method2680(boolean arg0) {
        this.field6901 = this.field6897 | this.field6901 << 8;
        field6913++;
        if (!arg0 && this.field6906 == -1) {
            this.field6906 = this.field6899;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Z", line = 192)
    public static final boolean method2681(int arg0, int arg1) {
        field6896++;
        if (arg0 != 23208) {
            field6898 = null;
        }
        if (arg1 == 30 || arg1 == 44 || arg1 == 10 || arg1 == 22 || arg1 == 45) {
            return true;
        } else {
            return arg1 == 5 || arg1 == 1011;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V", line = 219)
    public static final void method2682(int arg0) {
        field6903++;
        int var1 = arg0;
        for (int var2 = 0; var2 < class150.field2422; var2++) {
            for (int var3 = 0; var3 < class21.field272; var3++) {
                if (class512.method3062(arg0 + 1702040368, class321.field4830, var3, var1, var2, true)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }
}
