import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class447 implements class379 {

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    private int field6709 = 0;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "[Llh;")
    private class371[] field6701 = new class371[9];

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    private int field6697 = -1;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Lnq;")
    private class325 field6700;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    private int field6712;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "[Z")
    public static boolean[] field6721 = new boolean[100];

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    private int field6698;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    private int field6699;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
    private int field6714;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    public static int field6716;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIZLus;I)V")
    private final void method2706(int arg0, int arg1, boolean arg2, class1 arg3, int arg4) {
        field6718++;
        if (this.field6697 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg0;
        if ((~var6 & this.field6714) == 0) {
            this.field6699 = arg3.field5;
            this.field6698 = arg3.field5;
        } else if (this.field6698 != arg3.field5 || this.field6699 != arg3.field5) {
            throw new RuntimeException();
        }
        arg3.method1(arg4, this.field6697, arg1, -9324, class509.field7485[arg0]);
        this.field6701[arg0] = arg3;
        this.field6714 |= var6;
        if (arg2) {
            method2718(-76, null);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
    public final void method2372(int arg0) {
        field6704++;
        int var2 = 62 % ((60 - arg0) / 54);
        OpenGL.glBindFramebufferEXT(36008, this.field6712);
        this.field6709 |= 0x1;
        this.field6697 = this.method2707((byte) -101);
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)I")
    private final int method2707(byte arg0) {
        field6703++;
        if (arg0 > -93) {
            this.field6699 = 119;
        }
        if ((this.field6709 & 0x4) != 0) {
            return 36160;
        } else if ((this.field6709 & 0x2) == 0) {
            return (this.field6709 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IBLwv;)V")
    public final void method2708(int arg0, byte arg1, class25 arg2) {
        if (arg1 != 20) {
            this.method2711(69, -15);
        }
        field6715++;
        this.method2714(arg0, arg2, -123, 0);
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V")
    public final void method2375(byte arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        if (arg0 <= 92) {
            this.method2715(37, true, null);
        }
        field6705++;
        this.field6709 &= 0xFFFFFFFB;
        this.field6697 = this.method2707((byte) -105);
    }

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "(I)V")
    public static void method2709(int arg0) {
        if (arg0 != 36160) {
            method2710(-101, null);
        }
        field6721 = null;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V")
    public final void method2373(int arg0) {
        field6702++;
        OpenGL.glBindFramebufferEXT(36160, this.field6712);
        if (arg0 == 23993) {
            this.field6709 |= 0x4;
            this.field6697 = this.method2707((byte) -113);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILo;)V")
    public static final void method2710(int arg0, class23 arg1) {
        class306.field4447[arg0] = arg1;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)V")
    public final void method2711(int arg0, int arg1) {
        field6724++;
        if (arg0 != -66) {
            return;
        }
        if (this.field6697 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class509.field7485[arg1]);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILus;II)V")
    public final void method2712(int arg0, class1 arg1, int arg2, int arg3) {
        field6706++;
        this.method2706(arg0, 0, false, arg1, arg3);
        int var5 = 83 % ((-arg2 - 15) / 47);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
    public final void method2374(byte arg0) {
        field6696++;
        OpenGL.glBindFramebufferEXT(36009, this.field6712);
        this.field6709 |= 0x2;
        this.field6697 = this.method2707((byte) -108);
        int var2 = 46 / ((-arg0 - 43) / 43);
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V")
    public final void method2376(int arg0) {
        field6717++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field6709 &= 0xFFFFFFFE;
        if (arg0 >= -108) {
            this.method2706(-21, -107, false, null, -27);
        }
        this.field6697 = this.method2707((byte) -120);
    }

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "(I)Z")
    public final boolean method2713(int arg0) {
        field6722++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field6697);
        return arg0 == var2;
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V")
    public final void method2377(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        field6707++;
        if (arg0 != 486) {
            this.method2373(-86);
        }
        this.field6709 &= 0xFFFFFFFD;
        this.field6697 = this.method2707((byte) -115);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILwv;II)V")
    private final void method2714(int arg0, class25 arg1, int arg2, int arg3) {
        field6719++;
        if (this.field6697 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if (arg2 > -61) {
            return;
        }
        if ((~var5 & this.field6714) == 0) {
            this.field6698 = arg1.field361;
            this.field6699 = arg1.field366;
        } else if (this.field6698 != arg1.field361 || this.field6699 != arg1.field366) {
            throw new RuntimeException();
        }
        arg1.method230(this.field6697, arg3, 10968, class509.field7485[arg0]);
        this.field6701[arg0] = arg1;
        this.field6714 |= var5;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZLin;)V")
    public final void method2715(int arg0, boolean arg1, class60 arg2) {
        field6716++;
        if (this.field6697 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field6714 & ~var4) == 0) {
            this.field6699 = arg2.field871;
            this.field6698 = arg2.field862;
        } else if (this.field6698 != arg2.field862 || this.field6699 != arg2.field871) {
            throw new RuntimeException();
        }
        if (arg1) {
            this.field6709 = 61;
        }
        arg2.method433(-128, this.field6697, class509.field7485[arg0]);
        this.field6701[arg0] = arg2;
        this.field6714 |= var4;
    }

    @OriginalMember(owner = "client!sk", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field6700.method2068(this.field6712, true);
        field6711++;
        super.finalize();
    }

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "(I)I")
    public final int method2716(int arg0) {
        field6710++;
        return arg0 == -27190 ? this.field6699 : 2;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IB)V")
    public final void method2717(int arg0, byte arg1) {
        if (this.field6701[arg0] != null) {
            this.field6701[arg0].method2(false);
        }
        field6723++;
        this.field6714 &= ~(0x1 << arg0);
        this.field6701[arg0] = null;
        if (arg1 >= -74) {
            this.field6712 = 2;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILwj;)V")
    public static final void method2718(int arg0, class275 arg1) {
        field6708++;
        boolean var2 = false;
        if (class393.field6017 == arg1.field3870 || arg1.field3871 == -1 || arg1.field3886 != 0) {
            var2 = true;
        } else {
            class91 var3 = class201.field2707.method489(91, arg1.field3871);
            if (var3.field1339 || var3.field1313[arg1.field3842] < arg1.field3880 + 1) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field3870 - arg1.field3817;
            int var5 = class393.field6017 - arg1.field3817;
            int var6 = arg1.field3830 * 128 + (arg1.method637((byte) -111) * 64);
            int var7 = arg1.field3857 * 128 + arg1.method637((byte) -95) * 64;
            int var8 = arg1.field3869 * 128 + (arg1.method637((byte) -105) * 64);
            int var9 = arg1.field3841 * 128 + arg1.method637((byte) 20) * 64;
            arg1.field1867 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg1.field1862 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg1.field3914 = 0;
        if (arg1.field3814 == 0) {
            arg1.method1768(8192, false, 6946);
        }
        if (arg1.field3814 == 1) {
            arg1.method1768(12288, false, 6946);
        }
        if (arg1.field3814 == 2) {
            arg1.method1768(0, false, 6946);
        }
        if (arg1.field3814 == 3) {
            arg1.method1768(4096, false, 6946);
        }
        if (arg0 != 64) {
            field6721 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BC)Z")
    public static final boolean method2719(byte arg0, char arg1) {
        field6713++;
        if (arg0 != -11) {
            field6721 = null;
        }
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(IB)V")
    public final void method2720(int arg0, byte arg1) {
        field6720++;
        if (this.field6697 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class509.field7485[arg0]);
        if (arg1 != -53) {
            this.field6698 = -6;
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lnq;)V")
    public class447(class325 arg0) {
        if (!arg0.field4939) {
            throw new IllegalStateException("");
        }
        this.field6700 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class55.field782, 0);
        this.field6712 = class55.field782[0];
    }
}
