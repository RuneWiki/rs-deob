import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class349 extends class606 {

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "[F")
    private float[] field4932 = new float[4];

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "Z")
    private boolean field4948 = false;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "Lwba;")
    private class48 field4931;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "Lwba;")
    private class48 field4938;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "Lwba;")
    private class48 field4946;

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "Lwba;")
    private class48 field4949;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "Ldh;")
    private class320 field4929;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "Z")
    private boolean field4928;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "Lgda;")
    public static class53 field4937 = new class53(53, 7);

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "I")
    public static int field4945 = -1;

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "[I")
    public static int[] field4947 = new int[8];

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "Z")
    private boolean field4927;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "Z")
    private boolean field4936;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)Z", line = 6)
    public static final boolean method2250(byte arg0, int arg1) {
        ++field4923;
        if (arg0 != 35) {
            return true;
        } else {
            return arg1 == 10 || arg1 == 11 || ~arg1 == -13;
        }
    }

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)Z", line = 24)
    public static final boolean method2251(int arg0) {
        ++field4941;
        if (class367.field5202 == null) {
            return false;
        } else {
            if (class367.field5202.field463 >= 2000) {
                class367.field5202.field463 -= 2000;
            }
            return (short) arg0 == class367.field5202.field463;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V", line = 41)
    public final void method521(byte arg0) {
        ++field4943;
        super.field8525.method1648(1, (byte) 66);
        super.field8525.method1663((class12) null, -2);
        super.field8525.method1613(-30, class502.field7202, class502.field7202);
        super.field8525.method1664((byte) -101, class597.field8397, 0);
        int var2 = 86 / ((-26 - arg0) / 56);
        super.field8525.method1664((byte) -90, class679.field9315, 2);
        super.field8525.method1601(class597.field8397, 0, 256);
        super.field8525.method1648(0, (byte) 66);
        if (this.field4948) {
            super.field8525.method1664((byte) -123, class597.field8397, 0);
            super.field8525.method1601(class597.field8397, 0, 256);
            this.field4948 = false;
        }
        if (this.field4936) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field4936 = false;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)V", line = 76)
    public final void method518(int arg0, boolean arg1) {
        if (arg0 != 5486) {
            method2253(-126);
        }
        ++field4944;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIIIIIII)V", line = 87)
    public static final void method2252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field4930;
        if (class393.method2476(73, arg10)) {
            if (arg5 != -1) {
                field4947 = null;
            }
            if (class419.field5914[arg10] == null) {
                client.method1952(class37.field475[arg10], -1, arg0, arg1, arg9, arg2, arg7, arg3, arg11, arg4, arg8, arg6);
            } else {
                client.method1952(class419.field5914[arg10], -1, arg0, arg1, arg9, arg2, arg7, arg3, arg11, arg4, arg8, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "(I)V", line = 106)
    public static final void method2253(int arg0) {
        ++field4933;
        if (arg0 == -1) {
            for (class639 var1 = (class639) class633.field8740.method2765(-12261); var1 != null; var1 = (class639) class633.field8740.method2759(-15361)) {
                if (~var1.field8778 < -1) {
                    --var1.field8778;
                }
                if (~var1.field8778 == -1) {
                    if (~var1.field8779 > -1 || class516.method3034(var1.field8782, var1.field8779, 11)) {
                        class280.method1836(var1.field8775, var1.field8774, -1, var1.field8782, var1.field8773, var1.field8781, var1.field8779, 1, var1.field8787);
                        var1.method1185(-45);
                    }
                } else {
                    if (var1.field8786 > 0) {
                        --var1.field8786;
                    }
                    if (var1.field8786 == 0 && var1.field8774 >= 1 && var1.field8773 >= 1 && ~var1.field8774 >= ~(class336.field4683 - 2) && ~(class700.field9768 - 2) <= ~var1.field8773 && (var1.field8780 < 0 || class516.method3034(var1.field8784, var1.field8780, 11))) {
                        class280.method1836(var1.field8776, var1.field8774, -1, var1.field8784, var1.field8773, var1.field8781, var1.field8780, 1, var1.field8787);
                        var1.field8786 = -1;
                        if (var1.field8780 == var1.field8779 && ~var1.field8779 == 0) {
                            var1.method1185(-45);
                        } else if (~var1.field8780 == ~var1.field8779 && ~var1.field8776 == ~var1.field8775 && ~var1.field8784 == ~var1.field8782) {
                            var1.method1185(arg0 ^ 123);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lfha;Lfp;)V", line = 215)
    public class349(class378 arg0, class323 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field5408) {
            this.field4931 = class63.method538(arg1.method2102("gl", "uw_ground_unlit", 0), arg0, (byte) -19, 34336);
            this.field4938 = class63.method538(arg1.method2102("gl", "uw_ground_lit", 0), arg0, (byte) -107, 34336);
            this.field4946 = class63.method538(arg1.method2102("gl", "uw_model_unlit", 0), arg0, (byte) -9, 34336);
            this.field4949 = class63.method538(arg1.method2102("gl", "uw_model_lit", 0), arg0, (byte) -106, 34336);
            if (this.field4946 != null & this.field4931 != null & this.field4938 != null & this.field4949 != null) {
                this.field4929 = super.field8525.method1650(1, new int[] { 0, -1 }, false, 2, false);
                this.field4929.method1317(28970, false, false);
                this.field4928 = true;
            } else {
                this.field4928 = false;
            }
        } else {
            this.field4928 = false;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V", line = 165)
    public final void method1984(int arg0) {
        ++field4942;
        if (arg0 != 25411) {
            this.field4927 = false;
        }
        if (this.field4936) {
            int var2 = super.field8525.method434();
            int var3 = super.field8525.method387();
            float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
            float var5 = (float) var2 + -((float) (-var3 + var2) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field8525.method1651((byte) -123), (float) super.field8525.method1589(119) / 255.0F);
            super.field8525.method1648(1, (byte) 66);
            super.field8525.method1640(true, super.field8525.method1649(3));
            super.field8525.method1648(0, (byte) 66);
        }
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(B)V", line = 193)
    public static void method2254(byte arg0) {
        field4947 = null;
        field4937 = null;
        if (arg0 != -104) {
            field4945 = -40;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)Z", line = 204)
    public final boolean method525(int arg0) {
        if (arg0 <= 19) {
            return true;
        } else {
            ++field4934;
            return this.field4928;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIBILjava/lang/String;IILha;)V", line = 244)
    public static final void method2255(int arg0, int arg1, byte arg2, int arg3, String arg4, int arg5, int arg6, class58 arg7) {
        if (class336.field4684 == null || class504.field7231 == null) {
            if (class374.field5245.method2088(class268.field3830, -89) && class374.field5245.method2088(class423.field5962, -64)) {
                class336.field4684 = arg7.method484(class204.method1237(class374.field5245, class268.field3830, 0), true);
                class204 var8 = class204.method1237(class374.field5245, class423.field5962, 0);
                class504.field7231 = arg7.method484(var8, true);
                var8.method1239();
                class657.field9011 = arg7.method484(var8, true);
            } else {
                arg7.method431(arg0, arg5, arg3, arg1, -class309.field4310 + 255 << 24 | class10.field175, 1);
            }
        }
        ++field4926;
        if (arg2 == -111) {
            if (class336.field4684 != null && class504.field7231 != null) {
                int var9 = (-(2 * class504.field7231.method657()) + arg3) / class336.field4684.method657();
                for (int var10 = 0; ~var10 > ~var9; ++var10) {
                    class336.field4684.method658(arg0 - (-class504.field7231.method657() + -(class336.field4684.method657() * var10)), arg5);
                }
                class504.field7231.method658(arg0, arg5);
                class657.field9011.method658(arg0 - -arg3 + -class657.field9011.method657(), arg5);
            }
            class505.field7241.method498(arg0 - -3, 173, -16777216 | class91.field1084, arg5 + 14, arg4, -1);
            arg7.method431(arg0, arg5 - -arg1, arg3, arg6 - arg1, class10.field175 | -class309.field4310 + 255 << 24, 1);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)V", line = 288)
    public final void method516(int arg0, int arg1, int arg2) {
        ++field4935;
        if (arg1 < 91) {
            method2253(7);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lma;II)V", line = 301)
    public final void method523(class12 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            if (!this.field4948) {
                super.field8525.method1663(super.field8525.field3628, -2);
                super.field8525.method1628((byte) 110, 1);
                super.field8525.method1664((byte) -121, class240.field3203, 0);
                super.field8525.method1601(class240.field3203, 0, arg2 ^ 259);
                this.field4948 = true;
            }
        } else {
            if (this.field4948) {
                super.field8525.method1664((byte) -99, class597.field8397, 0);
                super.field8525.method1601(class597.field8397, 0, 256);
                this.field4948 = false;
            }
            super.field8525.method1663(arg0, -2);
            super.field8525.method1628((byte) 120, arg1);
        }
        if (arg2 != 3) {
            this.field4936 = false;
        }
        ++field4939;
    }

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "(I)V", line = 345)
    public static final void method2256(int arg0) {
        for (class508 var1 = (class508) class455.field6429.method4000((byte) -7); var1 != null; var1 = (class508) class455.field6429.method4002(-101)) {
            if (~var1.field7268 < -2) {
                var1.field7268 = 0;
                class609.field8569.method4018((byte) 126, var1, ((class37) var1.field7267.field9891.field8206).field466);
                var1.field7267.method4003(3);
            }
        }
        if (arg0 != -2) {
            field4945 = 71;
        }
        ++field4940;
        class25.field341 = 0;
        class350.field4958 = 0;
        class215.field2820.method2767((byte) -19);
        class417.field5899.method1175((byte) 90);
        class455.field6429.method4003(3);
        class464.method2768(class582.field8201, false);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 379)
    public final void method1989(int arg0) {
        ++field4925;
        int var2 = super.field8525.method1591(0);
        if (arg0 > -62) {
            method2255(-73, 22, (byte) 89, 107, (String) null, -66, 94, (class58) null);
        }
        class328 var3 = super.field8525.method1619(-46);
        if (!this.field4927) {
            OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field4946.field559 : this.field4931.field559);
        } else {
            OpenGL.glBindProgramARB(34336, ~var2 == Integer.MIN_VALUE ? this.field4938.field559 : this.field4949.field559);
        }
        OpenGL.glEnable(34336);
        this.field4936 = true;
        var3.method2148((float) var2, 0, 0.0F, -1.0F, 0.0F, this.field4932);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field4932[0], this.field4932[1], this.field4932[2], this.field4932[3]);
        this.method1984(25411);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)V", line = 413)
    public final void method517(boolean arg0, int arg1) {
        this.field4927 = arg0;
        ++field4924;
        if (arg1 > -64) {
            this.field4938 = null;
        }
        super.field8525.method1648(1, (byte) 66);
        super.field8525.method1663(this.field4929, -2);
        super.field8525.method1613(-30, class589.field8300, class719.field9987);
        super.field8525.method1664((byte) -100, class679.field9315, 0);
        super.field8525.method1450(false, class597.field8397, 2, true, false);
        super.field8525.method1601(class240.field3203, 0, 256);
        super.field8525.method1648(0, (byte) 66);
        this.method1989(-97);
    }
}
