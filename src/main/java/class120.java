import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class120 implements class57 {

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    private int field1540 = -1;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "[Lbq;")
    private class387[] field1538 = new class387[9];

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    private int field1554 = 0;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Lpea;")
    private class641 field1533;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    private int field1535;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "[[B")
    public static byte[][] field1536 = new byte[50][];

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    private int field1545;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
    private int field1552;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
    private int field1558;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "[I")
    public static int[] field1553;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V", line = 3)
    public final void method356(byte arg0) {
        if (arg0 >= -20) {
            this.field1533 = null;
        }
        field1539++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field1554 &= 0xFFFFFFFB;
        this.field1540 = this.method733((byte) -33);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lqw;BI)V", line = 19)
    public final void method728(class379 arg0, byte arg1, int arg2) {
        field1547++;
        this.method732(0, arg0, -9683, arg2);
        int var4 = -40 / ((13 - arg1) / 62);
    }

    @OriginalMember(owner = "client!uf", name = "finalize", descriptor = "()V", line = 29)
    protected final void finalize() throws Throwable {
        field1546++;
        this.field1533.method3510(this.field1535, (byte) -122);
        super.finalize();
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILcn;II)V", line = 38)
    public final void method729(int arg0, class322 arg1, int arg2, int arg3) {
        field1557++;
        this.method730(arg0, 0, arg1, -15807, arg2);
        if (arg3 != 1201) {
            this.field1540 = -52;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILcn;II)V", line = 49)
    private final void method730(int arg0, int arg1, class322 arg2, int arg3, int arg4) {
        field1530++;
        if (this.field1540 == -1) {
            throw new RuntimeException();
        } else if (arg3 == -15807) {
            int var6 = 0x1 << arg4;
            if ((~var6 & this.field1552) == 0) {
                this.field1558 = arg2.field4716;
                this.field1545 = arg2.field4716;
            } else if (this.field1545 != arg2.field4716 || this.field1558 != arg2.field4716) {
                throw new RuntimeException();
            }
            arg2.method2078(false, arg0, arg1, this.field1540, class150.field1894[arg4]);
            this.field1538[arg4] = arg2;
            this.field1552 |= var6;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILga;I)V", line = 83)
    public final void method731(int arg0, class335 arg1, int arg2) {
        field1550++;
        if (this.field1540 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg2;
        if ((~var4 & this.field1552) == 0) {
            this.field1558 = arg1.field4925;
            this.field1545 = arg1.field4939;
        } else if (this.field1545 != arg1.field4939 || this.field1558 != arg1.field4925) {
            throw new RuntimeException();
        }
        if (arg0 > -56) {
            this.method731(12, null, 38);
        }
        arg1.method2140(2, this.field1540, class150.field1894[arg2]);
        this.field1538[arg2] = arg1;
        this.field1552 |= var4;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V", line = 114)
    public final void method357(int arg0) {
        if (arg0 != -8166) {
            this.method730(28, 125, null, -124, 105);
        }
        OpenGL.glBindFramebufferEXT(36008, this.field1535);
        field1549++;
        this.field1554 |= 0x1;
        this.field1540 = this.method733((byte) -33);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILqw;II)V", line = 127)
    private final void method732(int arg0, class379 arg1, int arg2, int arg3) {
        field1543++;
        if (this.field1540 == -1) {
            throw new RuntimeException();
        }
        if (arg2 != -9683) {
            this.method733((byte) 104);
        }
        int var5 = 0x1 << arg3;
        if ((~var5 & this.field1552) == 0) {
            this.field1558 = arg1.field5430;
            this.field1545 = arg1.field5437;
        } else if (this.field1545 != arg1.field5437 || this.field1558 != arg1.field5430) {
            throw new RuntimeException();
        }
        arg1.method2297(class150.field1894[arg3], this.field1540, arg0, true);
        this.field1538[arg3] = arg1;
        this.field1552 |= var5;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)I", line = 159)
    private final int method733(byte arg0) {
        if (arg0 != -33) {
            this.method359(6);
        }
        field1532++;
        if ((this.field1554 & 0x4) != 0) {
            return 36160;
        } else if ((this.field1554 & 0x2) == 0) {
            return (this.field1554 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)V", line = 183)
    public final void method734(int arg0, byte arg1) {
        field1555++;
        if (arg1 <= 30) {
            this.method730(24, 85, null, 55, -107);
        }
        if (this.field1540 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class150.field1894[arg0]);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)V", line = 202)
    public final void method735(int arg0, int arg1) {
        field1534++;
        if (this.field1540 == -1) {
            throw new RuntimeException();
        } else if (arg1 == 36053) {
            OpenGL.glReadBuffer(class150.field1894[arg0]);
        }
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)V", line = 218)
    public static void method736(int arg0) {
        field1553 = null;
        field1536 = null;
        int var1 = 2 / ((-arg0 - 44) / 50);
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lpea;)V", line = 350)
    public class120(class641 arg0) {
        if (!arg0.field9013) {
            throw new IllegalStateException("");
        }
        this.field1533 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class524.field7254, 0);
        this.field1535 = class524.field7254[0];
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 245)
    public final void method354(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        field1544++;
        if (arg0 != -9874) {
            this.method357(35);
        }
        this.field1554 &= 0xFFFFFFFE;
        this.field1540 = this.method733((byte) -33);
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V", line = 260)
    public final void method359(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        field1542++;
        if (arg0 == -2010) {
            this.field1554 &= 0xFFFFFFFD;
            this.field1540 = this.method733((byte) -33);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V", line = 273)
    public final void method355(byte arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field1535);
        field1551++;
        if (arg0 != 59) {
            this.method358(125);
        }
        this.field1554 |= 0x4;
        this.field1540 = this.method733((byte) -33);
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V", line = 289)
    public final void method358(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field1535);
        field1531++;
        if (arg0 == 15414) {
            this.field1554 |= 0x2;
            this.field1540 = this.method733((byte) -33);
        }
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)Z", line = 302)
    public final boolean method737(int arg0) {
        field1537++;
        if (arg0 <= 45) {
            this.method735(-98, -123);
        }
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field1540);
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)V", line = 330)
    public final void method738(int arg0, int arg1) {
        field1556++;
        if (arg0 > -94) {
            field1541 = 34;
        }
        if (this.field1538[arg1] != null) {
            this.field1538[arg1].method545(-115);
        }
        this.field1552 &= ~(0x1 << arg1);
        this.field1538[arg1] = null;
    }
}
