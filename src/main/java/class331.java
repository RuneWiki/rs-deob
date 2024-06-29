import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class331 extends class120 {

    @OriginalMember(owner = "client!iw", name = "Nb", descriptor = "I")
    public static int field4939 = 1403;

    @OriginalMember(owner = "client!iw", name = "zb", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!iw", name = "Ab", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!iw", name = "Bb", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!iw", name = "Cb", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!iw", name = "Db", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!iw", name = "Eb", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!iw", name = "Fb", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!iw", name = "Gb", descriptor = "I")
    private int field4932;

    @OriginalMember(owner = "client!iw", name = "Hb", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!iw", name = "Ib", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!iw", name = "Jb", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!iw", name = "Kb", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!iw", name = "Lb", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!iw", name = "Mb", descriptor = "Ltd;")
    private class476 field4938;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Ltd;I)V")
    public final void method2135(class476 arg0, int arg1) {
        this.field4938 = arg0;
        ++field4931;
        if (arg1 != 0) {
            this.field4938 = null;
        }
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(I)V")
    public class331(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(III[B)V")
    public final void method2136(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 != 35716) {
            this.method2146(true);
        }
        for (int var5 = 0; var5 < arg1; ++var5) {
            arg3[var5 - -arg2] = (byte) (super.field1556[super.field1521++] + -this.field4938.method2810(115));
        }
        ++field4937;
    }

    @OriginalMember(owner = "client!iw", name = "z", descriptor = "(I)V")
    public final void method2137(int arg0) {
        ++field4935;
        if (arg0 == 1112311075) {
            this.field4932 = super.field1521 * 8;
        }
    }

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "(IB)I")
    public final int method2138(int arg0, byte arg1) {
        ++field4929;
        int var3 = this.field4932 >> 3;
        if (arg1 != -105) {
            return -89;
        } else {
            int var4 = -(7 & this.field4932) + 8;
            int var5 = 0;
            this.field4932 += arg0;
            while (~var4 > ~arg0) {
                var5 += (super.field1556[var3++] & class696.field9839[var4]) << arg0 - var4;
                arg0 -= var4;
                var4 = 8;
            }
            int var6;
            if (~arg0 != ~var4) {
                var6 = (super.field1556[var3] >> var4 - arg0 & class696.field9839[arg0]) + var5;
            } else {
                var6 = (super.field1556[var3] & class696.field9839[var4]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(ZI)I")
    public final int method2139(boolean arg0, int arg1) {
        if (!arg0) {
            return 95;
        } else {
            ++field4926;
            return arg1 * 8 + -this.field4932;
        }
    }

    @OriginalMember(owner = "client!iw", name = "n", descriptor = "(II)V")
    public final void method2140(int arg0, int arg1) {
        ++field4934;
        super.field1556[super.field1521++] = (byte) (arg0 + this.field4938.method2810(35));
        if (arg1 != -23703) {
            this.field4938 = null;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(B[I)V")
    public final void method2141(byte arg0, int[] arg1) {
        this.field4938 = new class476(arg1);
        ++field4927;
        if (arg0 >= -100) {
            field4939 = -39;
        }
    }

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "(Z)I")
    public final int method2142(boolean arg0) {
        if (arg0) {
            this.method2138(-3, (byte) -77);
        }
        ++field4930;
        int var2 = 255 & super.field1556[super.field1521++] + -this.field4938.method2810(-104);
        return ~var2 > -129 ? var2 : (255 & super.field1556[super.field1521++] - this.field4938.method2810(-105)) + (var2 + -128 << 8);
    }

    @OriginalMember(owner = "client!iw", name = "l", descriptor = "(B)V")
    public static final void method2143(byte arg0) {
        class411.field5797 = null;
        class191.field2851 = null;
        class783.field10776 = null;
        class261.field3671 = false;
        int var1 = -123 / ((arg0 - -19) / 55);
        ++field4925;
        class676.field9629 = null;
        class410.field5785 = null;
    }

    @OriginalMember(owner = "client!iw", name = "A", descriptor = "(I)Z")
    public final boolean method2144(int arg0) {
        ++field4936;
        int var2 = -127 / ((-26 - arg0) / 53);
        int var3 = 255 & super.field1556[super.field1521] - this.field4938.method2807((byte) -12);
        return var3 >= 128;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(B[BLog;I)Lut;")
    public static final class134 method2145(byte arg0, byte[] arg1, class673 arg2, int arg3) {
        ++field4928;
        if (arg1 != null && arg1.length != 0) {
            long var4 = OpenGL.glCreateShaderObjectARB(arg3);
            if (arg0 > -26) {
                field4939 = -65;
            }
            OpenGL.glShaderSourceRawARB(var4, arg1);
            OpenGL.glCompileShaderARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35713, class406.field5737, 0);
            if (~class406.field5737[0] == -1) {
                if (~class406.field5737[0] == -1) {
                    System.out.println("Shader compile failed:");
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class406.field5737, 1);
                if (~class406.field5737[1] < -2) {
                    byte[] var6 = new byte[class406.field5737[1]];
                    OpenGL.glGetInfoLogARB(var4, class406.field5737[1], class406.field5737, 0, var6, 0);
                    System.out.println(new String(var6));
                }
                if (class406.field5737[0] == 0) {
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            return new class134(arg2, var4, arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "(Z)V")
    public final void method2146(boolean arg0) {
        super.field1521 = (this.field4932 + 7) / 8;
        ++field4933;
        if (arg0) {
            this.method2136(21, 32, -2, (byte[]) null);
        }
    }
}
