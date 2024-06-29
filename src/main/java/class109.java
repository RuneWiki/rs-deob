import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class109 extends class92 {

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    private int field1307 = 0;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "Lcga;")
    private class255 field1311 = new class255();

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field1313 = new String[100];

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "[I")
    public static int[] field1315 = new int[1000];

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "Ljj;")
    public static class398 field1310 = new class398(47, -1);

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public static int field1319 = 0;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ld;IZI)V", line = 6)
    public final void method516(class176 arg0, int arg1, boolean arg2, int arg3) {
        super.field1130[super.field1137] = (byte) (arg2 ? arg3 + 40 : arg3 + 30);
        ++field1318;
        super.field1132[super.field1137] = arg0;
        ++super.field1137;
        if (arg1 != -1) {
            this.method515(49);
        }
        if (~super.field1137 <= -5001) {
            super.field1137 = 0;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ldga;II)V", line = 25)
    public static final void method580(class138 arg0, int arg1, int arg2) {
        ++field1312;
        if (arg2 == -1) {
            if (class80.field1011 != null) {
                try {
                    class80.field1011.method1291((byte) -100, 0L);
                    class80.field1011.method1289(arg1, 24, arg0.field1712, arg2 ^ -126);
                } catch (Exception var3) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V", line = 45)
    public static void method581(byte arg0) {
        if (arg0 != -46) {
            method580((class138) null, 44, -43);
        }
        field1313 = null;
        field1315 = null;
        field1310 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V", line = 57)
    public final void method515(int arg0) {
        if (arg0 != -30473) {
            field1315 = null;
        }
        ++field1316;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(Laf;I)V", line = 68)
    public final void method513(class651 arg0, int arg1) {
        if (arg1 != 5000) {
            this.method515(124);
        }
        --super.field1138;
        ++field1314;
        if (~super.field1138 > -1) {
            super.field1138 = 4999;
        }
        super.field1130[super.field1138] = 21;
        super.field1132[super.field1138] = arg0;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V", line = 88)
    private final void method582(int arg0) {
        ++field1309;
        int var2 = super.field1138;
        if (arg0 != -21) {
            field1315 = null;
        }
        ++super.field1138;
        if (super.field1138 >= 5000) {
            super.field1138 = 0;
        }
        this.field1307 = super.field1130[var2];
        Object var3 = super.field1132[var2];
        super.field1132[var2] = null;
        if (~this.field1307 == -22) {
            class176.method1164(this.field1311, (class651) var3);
        } else if (~this.field1307 != -21) {
            if (~this.field1307 <= -31 && this.field1307 <= 33) {
                ((class176) var3).method149(class297.field3975, class274.field3710, class351.field5123, class554.field7580, ~(this.field1307 + -30) == -1);
            } else if (~this.field1307 <= -41 && this.field1307 <= 43) {
                ((class176) var3).method149(class297.field3975, class274.field3710, class351.field5123, class32.field307, this.field1307 - 40 == 0);
            } else {
                if (this.field1307 != 22) {
                    if (this.field1307 == 23) {
                        class277.field3750.method1953();
                        return;
                    }
                    if (~this.field1307 == -25) {
                        class277.field3750.method2016(0, (class329[]) null);
                        return;
                    }
                } else {
                    class277.field3750.method1878(-1, 1583160, 40, 127);
                }
            }
        } else {
            class651 var4 = (class651) var3;
            if (var4.field9220 != null) {
                var4.field9220.method123((byte) 104, class277.field3750);
            }
            if (var4.field9224 != null) {
                var4.field9224.method123((byte) 99, class277.field3750);
            }
            if (var4.field9238 != null) {
                var4.field9238.method123((byte) 109, class277.field3750);
            }
            if (var4.field9234 != null) {
                var4.field9234.method123((byte) 95, class277.field3750);
            }
            if (var4.field9227 != null) {
                var4.field9227.method123((byte) 122, class277.field3750);
            }
            for (class82 var5 = var4.field9228; var5 != null; var5 = var5.field1024) {
                var5.field1027.method123((byte) 121, class277.field3750);
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Laf;I)V", line = 185)
    public final void method512(class651 arg0, int arg1) {
        super.field1130[super.field1137] = 20;
        ++field1308;
        super.field1132[super.field1137] = arg0;
        ++super.field1137;
        if (arg1 != 19048) {
            field1310 = null;
        }
        if (super.field1137 >= 5000) {
            super.field1137 = 0;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(ZI)V", line = 202)
    public final void method517(boolean arg0, int arg1) {
        ++field1304;
        if (arg0) {
            field1319 = -31;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V", line = 216)
    public final void method510(boolean arg0) {
        if (!arg0) {
            this.method512((class651) null, -73);
        }
        ++field1305;
        while (~super.field1138 != ~super.field1137) {
            this.method582(-21);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)V", line = 234)
    public final void method509(boolean arg0, int arg1) {
        ++field1317;
        super.field1130[super.field1137] = (byte) arg1;
        if (arg0) {
            field1315 = null;
        }
        ++super.field1137;
        if (super.field1137 >= 5000) {
            super.field1137 = 0;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILaf;)V", line = 257)
    public final void method511(int arg0, class651 arg1) {
        super.field1130[super.field1137] = 21;
        if (arg0 <= 89) {
            field1319 = 102;
        }
        ++field1306;
        super.field1132[super.field1137] = arg1;
        ++super.field1137;
        if (super.field1137 >= 5000) {
            super.field1137 = 0;
        }
    }
}
