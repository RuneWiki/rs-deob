import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class625 implements class236 {

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "I")
    private int field8704 = 0;

    @OriginalMember(owner = "client!ufa", name = "n", descriptor = "[Lqi;")
    private class521[] field8711 = new class521[9];

    @OriginalMember(owner = "client!ufa", name = "B", descriptor = "I")
    private int field8724 = -1;

    @OriginalMember(owner = "client!ufa", name = "k", descriptor = "Len;")
    private class289 field8708;

    @OriginalMember(owner = "client!ufa", name = "m", descriptor = "I")
    private int field8710;

    @OriginalMember(owner = "client!ufa", name = "q", descriptor = "[Lwn;")
    public static class663[] field8714 = new class663[5];

    @OriginalMember(owner = "client!ufa", name = "C", descriptor = "Lkh;")
    public static class15 field8725;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "I")
    public static int field8698;

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "I")
    public static int field8699;

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
    public static int field8700;

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "I")
    public static int field8701;

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "I")
    public static int field8702;

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "I")
    public static int field8703;

    @OriginalMember(owner = "client!ufa", name = "h", descriptor = "I")
    public static int field8705;

    @OriginalMember(owner = "client!ufa", name = "i", descriptor = "I")
    public static int field8706;

    @OriginalMember(owner = "client!ufa", name = "j", descriptor = "I")
    public static int field8707;

    @OriginalMember(owner = "client!ufa", name = "l", descriptor = "I")
    public static int field8709;

    @OriginalMember(owner = "client!ufa", name = "o", descriptor = "I")
    private int field8712;

    @OriginalMember(owner = "client!ufa", name = "p", descriptor = "I")
    public static int field8713;

    @OriginalMember(owner = "client!ufa", name = "r", descriptor = "I")
    public static int field8715;

    @OriginalMember(owner = "client!ufa", name = "s", descriptor = "I")
    private int field8716;

    @OriginalMember(owner = "client!ufa", name = "t", descriptor = "I")
    public static int field8717;

    @OriginalMember(owner = "client!ufa", name = "u", descriptor = "I")
    private int field8718;

    @OriginalMember(owner = "client!ufa", name = "v", descriptor = "I")
    public static int field8719;

    @OriginalMember(owner = "client!ufa", name = "w", descriptor = "I")
    public static int field8720;

    @OriginalMember(owner = "client!ufa", name = "x", descriptor = "I")
    public static int field8721;

    @OriginalMember(owner = "client!ufa", name = "y", descriptor = "I")
    public static int field8722;

    @OriginalMember(owner = "client!ufa", name = "z", descriptor = "I")
    public static int field8723;

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(B)V")
    public final void method1486(byte arg0) {
        field8698++;
        OpenGL.glBindFramebufferEXT(36160, this.field8710);
        this.field8704 |= 0x4;
        this.field8724 = this.method3472(-30781);
        if (arg0 != 29) {
            this.field8724 = -126;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)V")
    public final void method1485(byte arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        field8701++;
        this.field8704 &= 0xFFFFFFFD;
        this.field8724 = this.method3472(-30781);
        int var2 = -116 % ((13 - arg0) / 39);
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(Z)V")
    public final void method1489(boolean arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field8710);
        field8699++;
        this.field8704 |= 0x1;
        if (!arg0) {
            this.field8724 = this.method3472(-30781);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BI)V")
    public final void method3469(byte arg0, int arg1) {
        field8700++;
        if (this.field8711[arg1] != null) {
            this.field8711[arg1].method1953(-1);
        }
        this.field8718 &= ~(0x1 << arg1);
        int var3 = 65 / ((arg0 - 24) / 40);
        this.field8711[arg1] = null;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lwg;IIB)V")
    public final void method3470(class389 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 == -99) {
            field8705++;
            this.method3474((byte) -74, 0, arg1, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIILwaa;)V")
    private final void method3471(int arg0, int arg1, int arg2, class646 arg3) {
        field8703++;
        if (this.field8724 == -1) {
            throw new RuntimeException();
        } else if (arg0 == -17) {
            int var5 = 0x1 << arg2;
            if ((this.field8718 & ~var5) == 0) {
                this.field8712 = arg3.field9171;
                this.field8716 = arg3.field9165;
            } else if (this.field8716 != arg3.field9165 || this.field8712 != arg3.field9171) {
                throw new RuntimeException();
            }
            arg3.method3598(arg1, this.field8724, (byte) -82, class630.field8793[arg2]);
            this.field8711[arg2] = arg3;
            this.field8718 |= var5;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "(I)I")
    private final int method3472(int arg0) {
        field8713++;
        if ((this.field8704 & 0x4) != 0) {
            return 36160;
        }
        if (arg0 != -30781) {
            field8714 = null;
        }
        if ((this.field8704 & 0x2) == 0) {
            return (this.field8704 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IZ)V")
    public final void method3473(int arg0, boolean arg1) {
        if (arg1) {
            this.field8708 = null;
        }
        field8722++;
        if (this.field8724 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class630.field8793[arg0]);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BIILwg;I)V")
    private final void method3474(byte arg0, int arg1, int arg2, class389 arg3, int arg4) {
        field8715++;
        if (this.field8724 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg4;
        if ((this.field8718 & ~var6) == 0) {
            this.field8712 = arg3.field5456;
            this.field8716 = arg3.field5456;
        } else if (this.field8716 != arg3.field5456 || this.field8712 != arg3.field5456) {
            throw new RuntimeException();
        }
        arg3.method2237(class630.field8793[arg4], arg1, arg2, true, this.field8724);
        if (arg0 != -74) {
            this.field8710 = -29;
        }
        this.field8711[arg4] = arg3;
        this.field8718 |= var6;
    }

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "(I)Z")
    public final boolean method3475(int arg0) {
        if (arg0 != 28296) {
            this.field8704 = -126;
        }
        field8723++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field8724);
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(I)V")
    public final void method1488(int arg0) {
        field8709++;
        OpenGL.glBindFramebufferEXT(36009, this.field8710);
        this.field8704 |= 0x2;
        this.field8724 = this.method3472(-30781);
        if (arg0 <= 48) {
            this.method3469((byte) 107, 55);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ILfj;I)V")
    public final void method3476(int arg0, class601 arg1, int arg2) {
        field8702++;
        if (this.field8724 == -1) {
            throw new RuntimeException();
        }
        int var4 = 26 % ((arg2 - 20) / 62);
        int var5 = 0x1 << arg0;
        if ((~var5 & this.field8718) == 0) {
            this.field8716 = arg1.field8346;
            this.field8712 = arg1.field8348;
        } else if (this.field8716 != arg1.field8346 || this.field8712 != arg1.field8348) {
            throw new RuntimeException();
        }
        arg1.method3329(class630.field8793[arg0], (byte) 44, this.field8724);
        this.field8711[arg0] = arg1;
        this.field8718 |= var5;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)V")
    public final void method1484(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        field8719++;
        this.field8704 &= 0xFFFFFFFB;
        if (arg0 != 6181) {
            this.method3476(54, null, -116);
        }
        this.field8724 = this.method3472(-30781);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lwaa;BI)V")
    public final void method3477(class646 arg0, byte arg1, int arg2) {
        this.method3471(-17, 0, arg2, arg0);
        if (arg1 == -6) {
            field8721++;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "(I)V")
    public static void method3478(int arg0) {
        field8714 = null;
        field8725 = null;
        if (arg0 != 172) {
            field8725 = null;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IC)Z")
    public static final boolean method3479(int arg0, char arg1) {
        field8717++;
        if (arg0 != -66) {
            method3478(-25);
        }
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Z)V")
    public final void method1487(boolean arg0) {
        field8707++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field8704 &= 0xFFFFFFFE;
        this.field8724 = this.method3472(-30781);
        if (arg0) {
            this.method3474((byte) 33, -41, -101, null, -80);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(BI)V")
    public final void method3480(byte arg0, int arg1) {
        field8720++;
        if (this.field8724 == -1) {
            throw new RuntimeException();
        } else if (arg0 < -53) {
            OpenGL.glDrawBuffer(class630.field8793[arg1]);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field8708.method1792(this.field8710, 4);
        field8706++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Len;)V")
    public class625(class289 arg0) {
        if (!arg0.field4252) {
            throw new IllegalStateException("");
        }
        this.field8708 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class210.field3097, 0);
        this.field8710 = class210.field3097[0];
    }

    static {
        for (int var0 = 0; var0 < field8714.length; var0++) {
            field8714[var0] = new class663();
        }
        field8725 = new class15();
    }
}
