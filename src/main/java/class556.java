import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class556 extends class493 {

    @OriginalMember(owner = "client!fs", name = "x", descriptor = "Lmt;")
    private class399 field7842;

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "Lhl;")
    private class529 field7837;

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "Lqv;")
    private class447 field7836;

    @OriginalMember(owner = "client!fs", name = "u", descriptor = "Lea;")
    public static class547 field7839 = new class547(104, -2);

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
    public static int field7832;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
    public static int field7833;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "I")
    public static int field7834;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "I")
    public static int field7835;

    @OriginalMember(owner = "client!fs", name = "t", descriptor = "I")
    public static int field7838;

    @OriginalMember(owner = "client!fs", name = "v", descriptor = "I")
    public static int field7840;

    @OriginalMember(owner = "client!fs", name = "w", descriptor = "I")
    public static int field7841;

    @OriginalMember(owner = "client!fs", name = "y", descriptor = "I")
    public static int field7843;

    @OriginalMember(owner = "client!fs", name = "A", descriptor = "I")
    public static int field7845;

    @OriginalMember(owner = "client!fs", name = "z", descriptor = "Lni;")
    public static class522 field7844;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZ)V", line = 8)
    public final void method632(int arg0, boolean arg1) {
        ++field7840;
        if (arg0 < 93) {
            this.method634((byte) -62);
        }
        super.field6720.method2156(class669.field9307, class365.field4838, 22831);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)V", line = 22)
    public final void method627(int arg0, int arg1, int arg2) {
        if (this.field7842.field5652) {
            float var4 = (float) (super.field6720.field5048 % 4000) / 4000.0F;
            super.field6720.method2148(this.field7842.field5648, 36);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0F, 0.0F, 1.0F);
        } else {
            int var5 = super.field6720.field5048 % 4000 * 16 / 4000;
            super.field6720.method2148(this.field7842.field5654[var5], -117);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        if (arg2 <= -75) {
            ++field7833;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IILbl;)V", line = 48)
    public final void method629(int arg0, int arg1, class649 arg2) {
        ++field7843;
        if (arg0 != 6) {
            this.method633(52, false);
        }
    }

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "(I)V", line = 60)
    public static void method3150(int arg0) {
        field7839 = null;
        field7844 = null;
        if (arg0 != 0) {
            method3151(-105, (byte[]) null, 58, (byte[]) null, -58, 58, 30, -85, -104);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I[BI[BIIIII)V", line = 71)
    public static final void method3151(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field7838;
        int var9 = -(arg7 >> 2);
        if (arg8 == 0) {
            int var10 = -(arg7 & 3);
            for (int var11 = -arg2; ~var11 > -1; ++var11) {
                int var10001;
                for (int var12 = var9; var12 < 0; ++var12) {
                    var10001 = arg6++;
                    arg1[var10001] += arg3[arg4++];
                    int var14 = arg6++;
                    arg1[var14] += arg3[arg4++];
                    int var15 = arg6++;
                    arg1[var15] += arg3[arg4++];
                    int var16 = arg6++;
                    arg1[var16] += arg3[arg4++];
                }
                for (int var13 = var10; ~var13 > -1; ++var13) {
                    var10001 = arg6++;
                    arg1[var10001] += arg3[arg4++];
                }
                arg6 += arg5;
                arg4 += arg0;
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(IZ)V", line = 116)
    public final void method633(int arg0, boolean arg1) {
        OpenGL.glBindProgramARB(34336, this.field7836.field6243);
        ++field7841;
        OpenGL.glEnable(34336);
        if (arg0 != 69) {
            field7844 = null;
        }
        super.field6720.method2174(0, -128, class547.field7717);
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)V", line = 129)
    public final void method628(int arg0) {
        ++field7835;
        super.field6720.method2174(0, -114, class71.field769);
        OpenGL.glBindProgramARB(34336, 0);
        if (arg0 != -2) {
            this.method628(102);
        }
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIIIIZI)Z", line = 144)
    public static final boolean method3152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        ++field7834;
        int var9 = class653.field9086.field898[0];
        int var10 = class653.field9086.field899[0];
        if (var9 >= 0 && class272.field3589 > var9 && var10 >= 0 && var10 < class3.field26) {
            if (arg4 <= arg6 && arg6 < class272.field3589 && arg5 >= 0 && ~arg5 > ~class3.field26) {
                int var11 = class234.method1411(class171.field2130[class653.field9086.field2175], class653.field9086.method543(0), class161.field2022, arg1, arg0, arg5, arg2, var10, class570.field8033, arg7, arg6, arg3, 48, var9, arg8);
                if (~var11 > -2) {
                    return false;
                } else {
                    class476.field6576 = class161.field2022[var11 + -1];
                    class98.field1303 = class570.field8033[var11 + -1];
                    class50.field530 = false;
                    class611.method3415(-17470);
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lhl;Lni;Lmt;)V", line = 180)
    public class556(class529 arg0, class522 arg1, class399 arg2) {
        super(arg0);
        this.field7842 = arg2;
        this.field7837 = arg0;
        if (arg1 != null && this.field7842.method2309(-22382) && this.field7837.field7192) {
            this.field7836 = class715.method3999(arg1.method2879("gl", "transparent_water", -32734), this.field7837, 34336, 25246);
        } else {
            this.field7836 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)Z", line = 196)
    public final boolean method634(byte arg0) {
        if (arg0 != 27) {
            method3151(-3, (byte[]) null, 8, (byte[]) null, 91, 11, -110, 7, 116);
        }
        ++field7845;
        return this.field7836 != null;
    }
}
