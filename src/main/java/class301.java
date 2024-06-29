import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class301 {

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "I")
    public int field4064 = 64;

    @OriginalMember(owner = "client!nba", name = "j", descriptor = "I")
    public int field4068 = 1190717;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "Z")
    public boolean field4059 = false;

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "Z")
    public boolean field4060 = true;

    @OriginalMember(owner = "client!nba", name = "l", descriptor = "I")
    public int field4070 = 127;

    @OriginalMember(owner = "client!nba", name = "p", descriptor = "I")
    public int field4074 = 0;

    @OriginalMember(owner = "client!nba", name = "n", descriptor = "I")
    public int field4072 = 8;

    @OriginalMember(owner = "client!nba", name = "s", descriptor = "I")
    public int field4077 = -1;

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
    public int field4063 = 512;

    @OriginalMember(owner = "client!nba", name = "q", descriptor = "Z")
    public boolean field4075 = true;

    @OriginalMember(owner = "client!nba", name = "w", descriptor = "I")
    public int field4081 = -1;

    @OriginalMember(owner = "client!nba", name = "k", descriptor = "Llga;")
    public static class712 field4069 = new class712(63, -1);

    @OriginalMember(owner = "client!nba", name = "t", descriptor = "I")
    public static int field4078 = -1;

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!nba", name = "m", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!nba", name = "o", descriptor = "I")
    public int field4073;

    @OriginalMember(owner = "client!nba", name = "r", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!nba", name = "u", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!nba", name = "v", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "Lcfa;")
    public class170 field4062;

    @OriginalMember(owner = "client!nba", name = "i", descriptor = "Lcfa;")
    public static class170 field4067;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IB)V")
    public static final void method1806(int arg0, byte arg1) {
        if (arg0 != -15) {
            field4078 = -85;
        }
        field4065++;
        if (class410.field5781 == null) {
            class410.field5781 = new byte[4][class272.field3589][class3.field26];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class272.field3589; var3++) {
                for (int var4 = 0; var4 < class3.field26; var4++) {
                    class410.field5781[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1807(String arg0, byte arg1) {
        System.out.println("Error: " + class430.method2453("\n", 4185, "%0a", arg0));
        field4071++;
        if (arg1 != -80) {
            field4078 = -21;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Z)V")
    public static void method1808(boolean arg0) {
        field4067 = null;
        if (arg0) {
            field4067 = null;
        }
        field4069 = null;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(ILji;)V")
    public final void method1809(int arg0, class611 arg1) {
        while (true) {
            int var3 = arg1.method3428((byte) 126);
            if (var3 == 0) {
                field4066++;
                int var4 = -102 % ((arg0 - 40) / 58);
                return;
            }
            this.method1810(2818, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IILji;)V")
    private final void method1810(int arg0, int arg1, class611 arg2) {
        if (arg1 == 1) {
            this.field4074 = class210.method1174(arg2.method3385(arg0 - 2942), 76);
        } else if (arg1 == 2) {
            this.field4081 = arg2.method3428((byte) -108);
        } else if (arg1 == 3) {
            this.field4081 = arg2.method3402((byte) 127);
            if (this.field4081 == 65535) {
                this.field4081 = -1;
            }
        } else if (arg1 == 5) {
            this.field4060 = false;
        } else if (arg1 == 7) {
            this.field4077 = class210.method1174(arg2.method3385(arg0 ^ 0xFFFFF481), arg0 - 2733);
        } else if (arg1 == 8) {
            this.field4062.field2129 = this.field4073;
        } else if (arg1 == 9) {
            this.field4063 = arg2.method3402((byte) 127) << 2;
        } else if (arg1 == 10) {
            this.field4075 = false;
        } else if (arg1 == 11) {
            this.field4072 = arg2.method3428((byte) -118);
        } else if (arg1 == 12) {
            this.field4059 = true;
        } else if (arg1 == 13) {
            this.field4068 = arg2.method3385(-128);
        } else if (arg1 == 14) {
            this.field4064 = arg2.method3428((byte) -127) << 2;
        } else if (arg1 == 16) {
            this.field4070 = arg2.method3428((byte) 12);
        }
        if (arg0 == 2818) {
            field4079++;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)Z")
    public static final boolean method1811(int arg0, int arg1) {
        field4061++;
        if (arg1 == 8) {
            return arg0 == 4 || arg0 == 8 || arg0 == 11;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)V")
    public final void method1812(byte arg0) {
        this.field4072 = this.field4072 << 8 | this.field4073;
        if (arg0 != 80) {
            method1808(true);
        }
        field4080++;
    }
}
