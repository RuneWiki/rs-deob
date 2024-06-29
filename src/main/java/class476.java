import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class476 implements class212 {

    @OriginalMember(owner = "client!es", name = "l", descriptor = "[Lko;")
    private class189[] field7004 = new class189[9];

    @OriginalMember(owner = "client!es", name = "e", descriptor = "I")
    private int field6997 = 0;

    @OriginalMember(owner = "client!es", name = "h", descriptor = "I")
    private int field7000 = -1;

    @OriginalMember(owner = "client!es", name = "y", descriptor = "Lvd;")
    private class258 field7017;

    @OriginalMember(owner = "client!es", name = "k", descriptor = "I")
    private int field7003;

    @OriginalMember(owner = "client!es", name = "u", descriptor = "[I")
    public static int[] field7013 = new int[50];

    @OriginalMember(owner = "client!es", name = "E", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!es", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field7025;

    @OriginalMember(owner = "client!es", name = "F", descriptor = "Luv;")
    public static class2 field7024;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field6993;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    public static int field6994;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "I")
    private int field6996;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!es", name = "g", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!es", name = "i", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!es", name = "j", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!es", name = "m", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!es", name = "n", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!es", name = "o", descriptor = "I")
    public static int field7007;

    @OriginalMember(owner = "client!es", name = "p", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!es", name = "q", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!es", name = "r", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!es", name = "s", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!es", name = "t", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!es", name = "v", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!es", name = "w", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!es", name = "x", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!es", name = "z", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!es", name = "A", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!es", name = "B", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!es", name = "C", descriptor = "I")
    private int field7021;

    @OriginalMember(owner = "client!es", name = "D", descriptor = "I")
    private int field7022;

    @OriginalMember(owner = "client!es", name = "H", descriptor = "I")
    public static int field7026;

    static {
        new class347("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        field7023 = -1;
        field7025 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
        field7024 = new class2(55, 0);
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(I)V", line = 3)
    public final void method1368(int arg0) {
        field6998++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field6997 &= 0xFFFFFFFE;
        this.field7000 = this.method2827((byte) -35);
        if (arg0 != -1470) {
            field7013 = null;
        }
    }

    @OriginalMember(owner = "client!es", name = "finalize", descriptor = "()V", line = 16)
    protected final void finalize() throws Throwable {
        this.field7017.method1584((byte) -58, this.field7003);
        field7001++;
        super.finalize();
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(Z)V", line = 29)
    public static void method2825(boolean arg0) {
        field7013 = null;
        field7024 = null;
        field7025 = null;
        if (!arg0) {
            field7024 = null;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IB)I", line = 41)
    public static final int method2826(int arg0, byte arg1) {
        field7018++;
        return arg1 > -55 ? -63 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(B)I", line = 52)
    private final int method2827(byte arg0) {
        field7007++;
        if ((this.field6997 & 0x4) != 0) {
            return 36160;
        } else if ((this.field6997 & 0x2) == 0) {
            if (arg0 != -35) {
                this.field7004 = null;
            }
            return (this.field6997 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!es", name = "d", descriptor = "(I)I", line = 80)
    public final int method2828(int arg0) {
        if (arg0 != -4399) {
            this.field7022 = -80;
        }
        field7016++;
        return this.field7022;
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(B)V", line = 91)
    public final void method1369(byte arg0) {
        int var2 = 36 % ((arg0 - 60) / 41);
        OpenGL.glBindFramebufferEXT(36008, this.field7003);
        field6995++;
        this.field6997 |= 0x1;
        this.field7000 = this.method2827((byte) -35);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ILui;ZII)V", line = 105)
    private final void method2829(int arg0, class487 arg1, boolean arg2, int arg3, int arg4) {
        field7015++;
        if (this.field7000 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg4;
        if ((this.field7021 & ~var6) == 0) {
            this.field6996 = arg1.field7244;
            this.field7022 = arg1.field7244;
        } else if (this.field6996 != arg1.field7244 || this.field7022 != arg1.field7244) {
            throw new RuntimeException();
        }
        arg1.method2912(class406.field6106[arg4], arg3, false, arg0, this.field7000);
        this.field7004[arg4] = arg1;
        this.field7021 |= var6;
        if (!arg2) {
            this.method2828(-103);
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IILud;)V", line = 135)
    public final void method2830(int arg0, int arg1, class94 arg2) {
        this.method2839(arg0, 0, arg2, -22609);
        int var4 = -83 % ((arg1 - 45) / 57);
        field7014++;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ILnt;I)V", line = 145)
    public final void method2831(int arg0, class375 arg1, int arg2) {
        field7006++;
        if (this.field7000 == -1) {
            throw new RuntimeException();
        }
        int var4 = arg2 << arg0;
        if ((this.field7021 & ~var4) == 0) {
            this.field7022 = arg1.field5668;
            this.field6996 = arg1.field5659;
        } else if (this.field6996 != arg1.field5659 || this.field7022 != arg1.field5668) {
            throw new RuntimeException();
        }
        arg1.method2222(this.field7000, (byte) 122, class406.field6106[arg0]);
        this.field7004[arg0] = arg1;
        this.field7021 |= var4;
    }

    @OriginalMember(owner = "client!es", name = "d", descriptor = "(B)Z", line = 175)
    public final boolean method2832(byte arg0) {
        field7008++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field7000);
        int var3 = -5 / ((arg0 - 17) / 44);
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V", line = 197)
    public final void method1370(boolean arg0) {
        field7009++;
        OpenGL.glBindFramebufferEXT(36160, this.field7003);
        this.field6997 |= 0x4;
        if (!arg0) {
            field7023 = 48;
        }
        this.field7000 = this.method2827((byte) -35);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V", line = 211)
    public final void method1365(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        if (arg0 != 12318) {
            field7024 = null;
        }
        field6993++;
        this.field6997 &= 0xFFFFFFFD;
        this.field7000 = this.method2827((byte) -35);
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(I)V", line = 224)
    public final void method1367(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        field7019++;
        this.field6997 &= 0xFFFFFFFB;
        this.field7000 = this.method2827((byte) -35);
        if (arg0 != 9756) {
            this.field6996 = -7;
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(IB)V", line = 237)
    public final void method2833(int arg0, byte arg1) {
        if (this.field7004[arg0] != null) {
            this.field7004[arg0].method737(6407);
        }
        field7005++;
        this.field7021 &= ~(0x1 << arg0);
        this.field7004[arg0] = null;
        int var3 = 8 / ((14 - arg1) / 47);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V", line = 252)
    public final void method2834(int arg0, int arg1) {
        field6999++;
        if (this.field7000 == arg0) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class406.field6106[arg1]);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(BC)Z", line = 265)
    public static final boolean method2835(byte arg0, char arg1) {
        if (arg0 <= 7) {
            method2835((byte) -16, (char) 65458);
        }
        field7002++;
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(II)V", line = 278)
    public static final void method2836(int arg0, int arg1) {
        field7010++;
        if (class426.field6351 == arg0) {
            return;
        }
        class50.field640 = class448.field6611 = class413.field6237[arg0];
        class270.method1681(0);
        class211.field3041 = new int[class50.field640][class448.field6611];
        class175.field2590 = new int[class50.field640][class448.field6611];
        class444.field6530 = new int[4][class50.field640 >> 3][class448.field6611 >> 3];
        for (int var2 = 0; var2 < 4; var2++) {
            class151.field2300[var2] = class256.method1524(-28193, class448.field6611, class50.field640);
        }
        class274.field4082 = new byte[4][class50.field640][class448.field6611];
        class132.method976(class50.field640, 6, 4, class448.field6611);
        class385.method2307(12, class407.field6147, class448.field6611 >> 3, class50.field640 >> 3);
        class426.field6351 = arg0;
        if (arg1 >= -43) {
            method2825(false);
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lvd;)V", line = 408)
    public class476(class258 arg0) {
        if (!arg0.field3812) {
            throw new IllegalStateException("");
        }
        this.field7017 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class15.field196, 0);
        this.field7003 = class15.field196[0];
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(IB)V", line = 330)
    public final void method2837(int arg0, byte arg1) {
        if (arg1 < 84) {
            this.field6997 = 33;
        }
        field7011++;
        if (this.field7000 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class406.field6106[arg0]);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIZLui;)V", line = 345)
    public final void method2838(int arg0, int arg1, boolean arg2, class487 arg3) {
        if (!arg2) {
            this.method2829(0, arg3, true, arg1, arg0);
            field7012++;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IILud;I)V", line = 365)
    private final void method2839(int arg0, int arg1, class94 arg2, int arg3) {
        field7020++;
        if (this.field7000 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if (arg3 != -22609) {
            this.field7000 = -39;
        }
        if ((this.field7021 & ~var5) == 0) {
            this.field6996 = arg2.field1457;
            this.field7022 = arg2.field1459;
        } else if (this.field6996 != arg2.field1457 || this.field7022 != arg2.field1459) {
            throw new RuntimeException();
        }
        arg2.method739(this.field7000, class406.field6106[arg0], arg1, 118);
        this.field7004[arg0] = arg2;
        this.field7021 |= var5;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(B)V", line = 396)
    public final void method1366(byte arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field7003);
        field6994++;
        this.field6997 |= 0x2;
        int var2 = -82 / ((arg0 - 69) / 46);
        this.field7000 = this.method2827((byte) -35);
    }
}
