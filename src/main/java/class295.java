import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class295 implements class393 {

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
    private int field4297 = 0;

    @OriginalMember(owner = "client!pr", name = "y", descriptor = "[Lpm;")
    private class395[] field4308 = new class395[9];

    @OriginalMember(owner = "client!pr", name = "z", descriptor = "I")
    private int field4309 = -1;

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "Lrl;")
    private class487 field4302;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
    private int field4291;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field4284 = -1;

    @OriginalMember(owner = "client!pr", name = "E", descriptor = "I")
    public static int field4313 = 0;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "Lgn;")
    public static class475 field4290 = new class475(25, 7);

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "I")
    private int field4303;

    @OriginalMember(owner = "client!pr", name = "u", descriptor = "I")
    private int field4304;

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!pr", name = "w", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!pr", name = "x", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!pr", name = "A", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!pr", name = "C", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!pr", name = "D", descriptor = "I")
    private int field4312;

    @OriginalMember(owner = "client!pr", name = "F", descriptor = "Lgs;")
    public static class33 field4314;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IILip;)V", line = 11)
    public final void method1780(int arg0, int arg1, class479 arg2) {
        field4301++;
        if (this.field4309 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((~var4 & this.field4303) == 0) {
            this.field4304 = arg2.field6915;
            this.field4312 = arg2.field6923;
        } else if (this.field4312 != arg2.field6923 || this.field4304 != arg2.field6915) {
            throw new RuntimeException();
        }
        if (arg1 != -1) {
            this.field4312 = 18;
        }
        arg2.method2797(class12.field189[arg0], -22791, this.field4309);
        this.field4308[arg0] = arg2;
        this.field4303 |= var4;
    }

    @OriginalMember(owner = "client!pr", name = "finalize", descriptor = "()V", line = 45)
    protected final void finalize() throws Throwable {
        field4287++;
        this.field4302.method2902(-1778, this.field4291);
        super.finalize();
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V", line = 57)
    public final void method1781(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field4291);
        field4310++;
        this.field4297 |= 0x1;
        this.field4309 = this.method1797(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)V", line = 67)
    public final void method1782(int arg0, int arg1) {
        field4306++;
        if (arg0 != -1) {
            this.field4303 = 62;
        }
        if (this.field4308[arg1] != null) {
            this.field4308[arg1].method224(0);
        }
        this.field4303 &= ~(0x1 << arg1);
        this.field4308[arg1] = null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BLud;I)V", line = 89)
    public final void method1783(byte arg0, class26 arg1, int arg2) {
        this.method1798((byte) -40, arg2, arg1, 0);
        if (arg0 != 64) {
            this.field4308 = null;
        }
        field4295++;
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(II)V", line = 104)
    public final void method1784(int arg0, int arg1) {
        if (arg0 > -97) {
            this.field4312 = 119;
        }
        field4292++;
        if (this.field4309 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class12.field189[arg1]);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lgh;III)V", line = 118)
    public final void method1785(class368 arg0, int arg1, int arg2, int arg3) {
        int var5 = -63 / ((-arg3 - 20) / 35);
        this.method1787((byte) -117, arg2, 0, arg0, arg1);
        field4296++;
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(B)V", line = 129)
    public final void method1786(byte arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        field4294++;
        if (arg0 != -107) {
            this.method1785(null, -76, -123, 97);
        }
        this.field4297 &= 0xFFFFFFFD;
        this.field4309 = this.method1797(0);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BIILgh;I)V", line = 145)
    private final void method1787(byte arg0, int arg1, int arg2, class368 arg3, int arg4) {
        field4305++;
        if (this.field4309 == -1) {
            throw new RuntimeException();
        } else if (arg0 < -48) {
            int var6 = 0x1 << arg1;
            if ((~var6 & this.field4303) == 0) {
                this.field4304 = arg3.field5528;
                this.field4312 = arg3.field5528;
            } else if (this.field4312 != arg3.field5528 || this.field4304 != arg3.field5528) {
                throw new RuntimeException();
            }
            arg3.method2245(class12.field189[arg1], arg2, 52, arg4, this.field4309);
            this.field4308[arg1] = arg3;
            this.field4303 |= var6;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V", line = 177)
    public final void method1788(byte arg0) {
        if (arg0 == 28) {
            field4307++;
            OpenGL.glBindFramebufferEXT(36009, this.field4291);
            this.field4297 |= 0x2;
            this.field4309 = this.method1797(0);
        }
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lrl;)V", line = 351)
    public class295(class487 arg0) {
        if (!arg0.field7348) {
            throw new IllegalStateException("");
        }
        this.field4302 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class38.field590, 0);
        this.field4291 = class38.field590[0];
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)Z", line = 195)
    public final boolean method1789(boolean arg0) {
        if (arg0) {
            this.method1781(-49);
        }
        field4300++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field4309);
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "(B)V", line = 215)
    public static void method1790(byte arg0) {
        field4290 = null;
        field4314 = null;
        if (arg0 != -78) {
            field4284 = 105;
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)V", line = 232)
    public final void method1791(byte arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field4291);
        field4288++;
        this.field4297 |= 0x4;
        if (arg0 == -90) {
            this.field4309 = this.method1797(0);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V", line = 248)
    public final void method1792(int arg0) {
        if (arg0 != 31577) {
            field4290 = null;
        }
        OpenGL.glBindFramebufferEXT(36008, 0);
        field4289++;
        this.field4297 &= 0xFFFFFFFE;
        this.field4309 = this.method1797(0);
    }

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "(B)I", line = 261)
    public final int method1793(byte arg0) {
        int var2 = 97 % ((36 - arg0) / 34);
        field4286++;
        return this.field4304;
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V", line = 272)
    public final void method1794(int arg0) {
        field4311++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field4297 &= 0xFFFFFFFB;
        this.field4309 = this.method1797(0);
        if (arg0 != 17692) {
            this.field4303 = 9;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IB)V", line = 287)
    public final void method1795(int arg0, byte arg1) {
        field4293++;
        if (arg1 != -103) {
            this.field4312 = -107;
        }
        if (this.field4309 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class12.field189[arg0]);
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(II)V", line = 302)
    public static final void method1796(int arg0, int arg1) {
        field4285++;
        class261.field3728 = -1;
        class134.field1711 = -1;
        class192.field2715 = arg0;
        if (arg1 != -22589) {
            method1796(-39, -72);
        }
        class126.method706(4832);
    }

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)I", line = 325)
    private final int method1797(int arg0) {
        if (arg0 != 0) {
            this.method1780(-49, -115, null);
        }
        field4298++;
        if ((this.field4297 & 0x4) != 0) {
            return 36160;
        } else if ((this.field4297 & 0x2) == 0) {
            return (this.field4297 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BILud;I)V", line = 365)
    private final void method1798(byte arg0, int arg1, class26 arg2, int arg3) {
        field4299++;
        if (this.field4309 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg1;
        if ((this.field4303 & ~var5) == 0) {
            this.field4312 = arg2.field435;
            this.field4304 = arg2.field433;
        } else if (this.field4312 != arg2.field435 || this.field4304 != arg2.field433) {
            throw new RuntimeException();
        }
        arg2.method226(this.field4309, arg3, class12.field189[arg1], 19814);
        this.field4308[arg1] = arg2;
        if (arg0 >= -18) {
            this.method1792(18);
        }
        this.field4303 |= var5;
    }
}
