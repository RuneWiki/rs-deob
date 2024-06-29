import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class327 implements class230 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    private int field4477 = -1;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    private int field4488 = 0;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "[Lvc;")
    private class357[] field4490 = new class357[9];

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Luq;")
    private class313 field4485;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    private int field4502;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field4494 = 0;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    private int field4486;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    private int field4492;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    private int field4493;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILku;I)V")
    private final void method2013(int arg0, int arg1, class495 arg2, int arg3) {
        field4491++;
        if (this.field4477 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg1;
        if ((~var5 & this.field4493) == 0) {
            this.field4492 = arg2.field6904;
            this.field4486 = arg2.field6902;
        } else if (this.field4486 != arg2.field6902 || this.field4492 != arg2.field6904) {
            throw new RuntimeException();
        }
        int var6 = -47 / ((arg3 + 35) / 57);
        arg2.method2778(class147.field1898[arg1], this.field4477, arg0, (byte) 35);
        this.field4490[arg1] = arg2;
        this.field4493 |= var5;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIBLsk;)V")
    public final void method2014(int arg0, int arg1, byte arg2, class415 arg3) {
        if (arg2 >= 6) {
            field4478++;
            this.method2015(0, (byte) -123, arg0, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBIILsk;)V")
    private final void method2015(int arg0, byte arg1, int arg2, int arg3, class415 arg4) {
        field4495++;
        if (this.field4477 == -1) {
            throw new RuntimeException();
        }
        if (arg1 != -123) {
            field4494 = 106;
        }
        int var6 = 0x1 << arg2;
        if ((this.field4493 & ~var6) == 0) {
            this.field4486 = arg4.field5706;
            this.field4492 = arg4.field5706;
        } else if (this.field4486 != arg4.field5706 || this.field4492 != arg4.field5706) {
            throw new RuntimeException();
        }
        arg4.method2473((byte) -96, this.field4477, arg0, class147.field1898[arg2], arg3);
        this.field4490[arg2] = arg4;
        this.field4493 |= var6;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI)V")
    public final void method2016(boolean arg0, int arg1) {
        if (!arg0) {
            this.method2018(null, 23, 99);
        }
        field4496++;
        if (this.field4477 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class147.field1898[arg1]);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjv;I)V")
    public final void method2017(int arg0, class584 arg1, int arg2) {
        field4481++;
        if (this.field4477 == -1) {
            throw new RuntimeException();
        }
        int var4 = -16 % ((arg2 + 12) / 57);
        int var5 = 0x1 << arg0;
        if ((this.field4493 & ~var5) == 0) {
            this.field4492 = arg1.field8451;
            this.field4486 = arg1.field8452;
        } else if (this.field4486 != arg1.field8452 || this.field4492 != arg1.field8451) {
            throw new RuntimeException();
        }
        arg1.method3369(class147.field1898[arg0], this.field4477, 0);
        this.field4490[arg0] = arg1;
        this.field4493 |= var5;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lku;II)V")
    public final void method2018(class495 arg0, int arg1, int arg2) {
        field4497++;
        this.method2013(arg1, arg2, arg0, 77);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
    public final void method1452(boolean arg0) {
        field4479++;
        OpenGL.glBindFramebufferEXT(36160, this.field4502);
        this.field4488 |= 0x4;
        this.field4477 = this.method2023(arg0);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public final void method1448(byte arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field4502);
        field4480++;
        int var2 = -56 / ((arg0 + 80) / 43);
        this.field4488 |= 0x1;
        this.field4477 = this.method2023(false);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
    public static final void method2019(int arg0, int arg1, int arg2) {
        class563 var3 = class199.field2605[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field7885 != null) {
            var3.field7885 = null;
        }
        if (var3.field7889 != null) {
            var3.field7889 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Z")
    public final boolean method2020(int arg0) {
        field4483++;
        if (arg0 >= -48) {
            this.method1449((byte) -122);
        }
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field4477);
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
    public final void method2021(int arg0, int arg1) {
        field4482++;
        if (this.field4477 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class147.field1898[arg1]);
        if (arg0 > -20) {
            field4494 = -7;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(ZI)V")
    public final void method2022(boolean arg0, int arg1) {
        field4498++;
        if (this.field4490[arg1] != null) {
            this.field4490[arg1].method157((byte) 126);
        }
        this.field4493 &= ~(0x1 << arg1);
        this.field4490[arg1] = null;
        if (arg0) {
            this.method2022(false, -106);
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)I")
    private final int method2023(boolean arg0) {
        if (arg0) {
            field4487 = -12;
        }
        field4504++;
        if ((this.field4488 & 0x4) != 0) {
            return 36160;
        } else if ((this.field4488 & 0x2) == 0) {
            return (this.field4488 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)I")
    public final int method2024(int arg0) {
        field4500++;
        return arg0 == -30372 ? this.field4492 : -39;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
    public final void method1449(byte arg0) {
        field4489++;
        OpenGL.glBindFramebufferEXT(36009, this.field4502);
        this.field4488 |= 0x2;
        if (arg0 != -74) {
            this.method2016(false, -128);
        }
        this.field4477 = this.method2023(false);
    }

    @OriginalMember(owner = "client!wd", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field4485.method1941(this.field4502, 16711680);
        field4484++;
        super.finalize();
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public final void method1451(int arg0) {
        field4503++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        if (arg0 <= -3) {
            this.field4488 &= 0xFFFFFFFD;
            this.field4477 = this.method2023(false);
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)V")
    public final void method1453(byte arg0) {
        if (arg0 >= 24) {
            OpenGL.glBindFramebufferEXT(36160, 0);
            field4499++;
            this.field4488 &= 0xFFFFFFFB;
            this.field4477 = this.method2023(false);
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)V")
    public final void method1450(byte arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        field4501++;
        if (arg0 != -33) {
            this.method2022(true, -30);
        }
        this.field4488 &= 0xFFFFFFFE;
        this.field4477 = this.method2023(false);
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Luq;)V")
    public class327(class313 arg0) {
        if (!arg0.field4336) {
            throw new IllegalStateException("");
        }
        this.field4485 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class194.field2520, 0);
        this.field4502 = class194.field2520[0];
    }

    static {
        new class344("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
    }
}
