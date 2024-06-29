import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class276 implements class406 {

    @OriginalMember(owner = "client!je", name = "i", descriptor = "[Lqd;")
    private class313[] field3785 = new class313[9];

    @OriginalMember(owner = "client!je", name = "z", descriptor = "I")
    private int field3802 = 0;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    private int field3797 = -1;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "Lef;")
    private class338 field3806;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "I")
    private int field3805;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field3777 = -1;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Lar;")
    public static class479 field3783 = new class479();

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    private int field3784;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    private int field3790;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    private int field3794;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)Z")
    public final boolean method1631(int arg0) {
        field3786++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field3797);
        return arg0 == var2;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    public final void method1632(int arg0) {
        field3801++;
        if (arg0 == 1393) {
            OpenGL.glBindFramebufferEXT(36009, 0);
            this.field3802 &= 0xFFFFFFFD;
            this.field3797 = this.method1648((byte) 118);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public final void method1633(int arg0) {
        field3793++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field3802 &= 0xFFFFFFFE;
        int var2 = -18 % ((arg0 + 54) / 48);
        this.field3797 = this.method1648((byte) 92);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZLvg;I)V")
    public final void method1634(int arg0, boolean arg1, class39 arg2, int arg3) {
        this.method1642((byte) 110, arg2, arg3, arg0, 0);
        if (arg1) {
            field3789++;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)V")
    public final void method1635(boolean arg0, int arg1) {
        field3795++;
        if (this.field3797 == -1) {
            throw new RuntimeException();
        }
        if (arg0) {
            this.method1647(-95, 45);
        }
        OpenGL.glDrawBuffer(class59.field723[arg1]);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IILsf;)V")
    public final void method1636(int arg0, int arg1, class362 arg2) {
        field3780++;
        if (arg1 != 20374) {
            this.field3790 = -64;
        }
        if (this.field3797 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((~var4 & this.field3794) == 0) {
            this.field3790 = arg2.field5294;
            this.field3784 = arg2.field5284;
        } else if (this.field3784 != arg2.field5284 || this.field3790 != arg2.field5294) {
            throw new RuntimeException();
        }
        arg2.method2181(this.field3797, (byte) -111, class59.field723[arg0]);
        this.field3785[arg0] = arg2;
        this.field3794 |= var4;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
    public final void method1637(int arg0, int arg1) {
        if (arg0 <= 24) {
            this.method1646(true);
        }
        if (this.field3785[arg1] != null) {
            this.field3785[arg1].method332((byte) 37);
        }
        field3799++;
        this.field3794 &= ~(0x1 << arg1);
        this.field3785[arg1] = null;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
    public final void method1638(byte arg0) {
        field3798++;
        OpenGL.glBindFramebufferEXT(36009, this.field3805);
        this.field3802 |= 0x2;
        this.field3797 = this.method1648((byte) 119);
        if (arg0 != -30) {
            this.method1635(false, 119);
        }
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V")
    public static void method1639(int arg0) {
        field3783 = null;
        if (arg0 != 1) {
            method1639(70);
        }
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(I)I")
    public final int method1640(int arg0) {
        if (arg0 != 23756) {
            this.field3805 = -52;
        }
        field3779++;
        return this.field3790;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
    public final void method1641(int arg0) {
        field3778++;
        OpenGL.glBindFramebufferEXT(36160, this.field3805);
        this.field3802 |= 0x4;
        this.field3797 = this.method1648((byte) 124);
        if (arg0 != 24617) {
            this.method1637(-88, 48);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BLvg;III)V")
    private final void method1642(byte arg0, class39 arg1, int arg2, int arg3, int arg4) {
        field3800++;
        if (this.field3797 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg2;
        if ((~var6 & this.field3794) == 0) {
            this.field3790 = arg1.field490;
            this.field3784 = arg1.field490;
        } else if (this.field3784 != arg1.field490 || this.field3790 != arg1.field490) {
            throw new RuntimeException();
        }
        arg1.method333(this.field3797, arg4, arg3, class59.field723[arg2], 34069);
        this.field3785[arg2] = arg1;
        this.field3794 |= var6;
        if (arg0 < 103) {
            this.field3797 = -102;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIZLml;)V")
    private final void method1643(int arg0, int arg1, boolean arg2, class264 arg3) {
        field3788++;
        if (this.field3797 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg1;
        if ((~var5 & this.field3794) == 0) {
            this.field3790 = arg3.field3645;
            this.field3784 = arg3.field3641;
        } else if (this.field3784 != arg3.field3641 || this.field3790 != arg3.field3645) {
            throw new RuntimeException();
        }
        arg3.method1581(-34, class59.field723[arg1], arg0, this.field3797);
        this.field3785[arg1] = arg3;
        if (arg2) {
            field3777 = -94;
        }
        this.field3794 |= var5;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)V")
    public static final void method1644(int arg0, int arg1) {
        field3781++;
        int var2 = 0 / ((5 - arg0) / 32);
        class347.field4970 = arg1;
        class147.field2137.method1068(0);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public final void method1645(byte arg0) {
        if (arg0 > -116) {
            this.field3802 = 96;
        }
        OpenGL.glBindFramebufferEXT(36008, this.field3805);
        field3792++;
        this.field3802 |= 0x1;
        this.field3797 = this.method1648((byte) 87);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
    public final void method1646(boolean arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        field3791++;
        if (!arg0) {
            this.method1635(true, -73);
        }
        this.field3802 &= 0xFFFFFFFB;
        this.field3797 = this.method1648((byte) 110);
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(II)V")
    public final void method1647(int arg0, int arg1) {
        if (arg0 != 19433) {
            return;
        }
        field3803++;
        if (this.field3797 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class59.field723[arg1]);
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(B)I")
    private final int method1648(byte arg0) {
        field3787++;
        if ((this.field3802 & 0x4) != 0) {
            return 36160;
        } else if ((this.field3802 & 0x2) != 0) {
            return 36009;
        } else if ((this.field3802 & 0x1) == 0) {
            return arg0 < 85 ? -51 : -1;
        } else {
            return 36008;
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lef;)V")
    public class276(class338 arg0) {
        if (!arg0.field4798) {
            throw new IllegalStateException("");
        }
        this.field3806 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class226.field3219, 0);
        this.field3805 = class226.field3219[0];
    }

    @OriginalMember(owner = "client!je", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3796++;
        this.field3806.method1987(47, this.field3805);
        super.finalize();
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IBLml;)V")
    public final void method1649(int arg0, byte arg1, class264 arg2) {
        field3782++;
        this.method1643(0, arg0, false, arg2);
        if (arg1 != 17) {
            this.method1641(91);
        }
    }
}
