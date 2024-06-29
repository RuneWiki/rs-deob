import jaggl.OpenGL;
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class303 extends class434 {

    @OriginalMember(owner = "client!qia", name = "p", descriptor = "[I")
    public static int[] field4138 = new int[6];

    @OriginalMember(owner = "client!qia", name = "o", descriptor = "Lmr;")
    public static class611 field4137 = new class611();

    @OriginalMember(owner = "client!qia", name = "q", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!qia", name = "r", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!qia", name = "s", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!qia", name = "t", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!qia", name = "u", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!qia", name = "v", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(Luea;Lha;Ljia;IIIZLbm;I)V", line = 5)
    public static final void method1891(class241 arg0, class543 arg1, class336 arg2, int arg3, int arg4, int arg5, boolean arg6, class463 arg7, int arg8) {
        field4142++;
        int var9 = arg8 - (arg4 / 2) - 5;
        int var10 = arg5 + 2;
        if (arg7.field6599 != 0) {
            arg1.method3263((byte) -84, var9, (arg5 + (arg2.method2070() * arg3) - var10) + 1, arg4 + 10, var10, arg7.field6599);
        }
        if (arg7.field6589 != 0) {
            arg1.method3261(var9, var10, -21307, arg5 + arg2.method2070() * arg3 + 1 - var10, arg4 + 10, arg7.field6589);
        }
        int var11 = arg7.field6573;
        if (arg0.field3570 && arg7.field6595 != -1) {
            var11 = arg7.field6595;
        }
        for (int var12 = 0; var12 < arg3; var12++) {
            String var13 = class558.field8113[var12];
            if (arg3 - 1 > var12) {
                var13 = var13.substring(0, var13.length() - 4);
            }
            arg2.method2069(arg1, var13, arg8, arg5, var11, true);
            arg5 += arg2.method2070();
        }
        if (!arg6) {
            method1892(false);
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;Z)V", line = 46)
    public final void method143(OggPacket arg0, boolean arg1) {
        field4141++;
        if (!arg1) {
            field4137 = null;
        }
    }

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "(Z)V", line = 56)
    public static void method1892(boolean arg0) {
        if (arg0) {
            field4137 = null;
        }
        field4138 = null;
        field4137 = null;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)V", line = 67)
    public final void method138(int arg0) {
        if (arg0 == 0) {
            field4140++;
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(ILqk;II)V", line = 77)
    public static final void method1893(int arg0, class146 arg1, int arg2, int arg3) {
        field4143++;
        class293.field4024 = arg2;
        class493.field7098 = arg1;
        if (arg0 != 0) {
            method1894(27);
        }
        class656.field9404 = arg3;
    }

    @OriginalMember(owner = "client!qia", name = "c", descriptor = "(I)V", line = 91)
    public static final void method1894(int arg0) {
        class147.method1037((byte) -39, -1, 255);
        if (arg0 != 0) {
            field4138 = null;
        }
        field4144++;
    }

    @OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 102)
    public class303(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(I[FIIIIB)V", line = 106)
    public static final void method1895(int arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field4139++;
        if (arg2 > 0 && !class211.method1496(arg6 - 44, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class211.method1496(0, arg4)) {
            int var7 = class663.method3777(arg3, (byte) -123);
            int var8 = 0;
            int var9 = arg4 > arg2 ? arg2 : arg4;
            int var10 = arg2 >> 1;
            int var11 = arg4 >> 1;
            float[] var12 = arg1;
            if (arg6 == 44) {
                float[] var13 = new float[var7 * var11 * var10];
                while (true) {
                    OpenGL.glTexImage2Df(arg0, var8, arg5, arg2, arg4, 0, arg3, 5126, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = arg2 * var7;
                    float[] var15 = var13;
                    for (int var16 = 0; var16 < var7; var16++) {
                        int var17 = var16;
                        int var18 = var16;
                        int var19 = var14 + var16;
                        for (int var20 = 0; var20 < var11; var20++) {
                            for (int var21 = 0; var21 < var10; var21++) {
                                float var22 = var12[var18];
                                int var23 = var7 + var18;
                                float var24 = var12[var23] + var22;
                                var18 = var7 + var23;
                                float var25 = var12[var19] + var24;
                                int var26 = var7 + var19;
                                float var27 = var12[var26] + var25;
                                var13[var17] = var27 * 0.25F;
                                var19 = var7 + var26;
                                var17 += var7;
                            }
                            var18 += var14;
                            var19 += var14;
                        }
                    }
                    var13 = var12;
                    var12 = var15;
                    arg4 = var11;
                    arg2 = var10;
                    var9 >>= 0x1;
                    var10 >>= 0x1;
                    var11 >>= 0x1;
                    var8++;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
