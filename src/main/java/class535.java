import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class535 {

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field7533 = 0;

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "I")
    public static int field7538 = 0;

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "Ljava/lang/String;")
    public static String field7539 = null;

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "Llf;")
    public static class251 field7537 = new class251(3, 2);

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
    public static int field7540 = 0;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
    public static int field7532;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "Lhu;")
    public static class143 field7531;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "[Ltf;")
    public static class312[] field7535;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(JJ)J")
    public static long method3181(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
    public static final void method3182(byte arg0) {
        class408.field5349.method1687((byte) 61);
        field7532++;
        if (arg0 >= -86) {
            method3182((byte) -48);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I[BIIIII)V")
    public static final void method3183(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7534++;
        if (arg6 > 0 && !class152.method1091(arg6, -81)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class152.method1091(arg0, -24)) {
            int var7 = class65.method546(arg3, (byte) -124);
            int var8 = 0;
            if (arg2 == -2) {
                int var9 = arg0 <= arg6 ? arg0 : arg6;
                int var10 = arg6 >> 1;
                int var11 = arg0 >> 1;
                byte[] var12 = arg1;
                byte[] var13 = new byte[var10 * var11 * var7];
                while (true) {
                    OpenGL.glTexImage2Dub(arg4, var8, arg5, arg6, arg0, 0, arg3, 5121, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = arg6 * var7;
                    for (int var15 = 0; var15 < var7; var15++) {
                        int var17 = var15;
                        int var18 = var15;
                        int var19 = var15 + var14;
                        for (int var20 = 0; var20 < var11; var20++) {
                            for (int var21 = 0; var21 < var10; var21++) {
                                byte var22 = var12[var18];
                                int var23 = var7 + var18;
                                int var24 = var12[var23] + var22;
                                var18 = var7 + var23;
                                int var25 = var12[var19] + var24;
                                int var26 = var7 + var19;
                                int var27 = var12[var26] + var25;
                                var13[var17] = (byte) (var27 >> 2);
                                var19 = var7 + var26;
                                var17 += var7;
                            }
                            var18 += var14;
                            var19 += var14;
                        }
                    }
                    byte[] var16 = var13;
                    var13 = var12;
                    arg0 = var11;
                    var12 = var16;
                    arg6 = var10;
                    var10 >>= 0x1;
                    var9 >>= 0x1;
                    var11 >>= 0x1;
                    var8++;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IILkg;)V")
    public static final void method3184(int arg0, int arg1, class287 arg2) {
        field7536++;
        if (arg2.field3430 != null) {
            int var3 = arg2.field3430[arg1 + 1];
            if (arg2.field3420 != var3) {
                arg2.field3423 = 0;
                arg2.field3392 = 0;
                arg2.field3376 = 1;
                arg2.field3368 = 0;
                arg2.field3456 = arg2.field3458;
                arg2.field3420 = var3;
                if (arg2.field3420 != -1) {
                    class60.method520(arg2.field3392, (byte) -70, arg2, class362.field4504.method3600(arg0 ^ 0xFFFFFFD8, arg2.field3420));
                }
            }
        }
        if (arg0 != 0) {
            method3185(122);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
    public static void method3185(int arg0) {
        field7539 = null;
        field7535 = null;
        field7531 = null;
        if (arg0 != -1939) {
            method3184(18, 93, null);
        }
        field7537 = null;
    }
}
