import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public abstract class class728 extends class577 {

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field10053;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public static int field10050;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public static int field10051;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public int field10052;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public static int field10054;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "[Lus;")
    public static class1[] field10055;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V")
    public static void method4071(byte arg0) {
        if (arg0 > -10) {
            method4073(122, -49, 0, 97, 40, (byte) -2, null);
        }
        field10055 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public abstract void method1417(OggPacket arg0, int arg1);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public abstract void method1416(int arg0);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II[FIFFI[FIIIFII)V")
    public static final void method4072(int arg0, int arg1, float[] arg2, int arg3, float arg4, float arg5, int arg6, float[] arg7, int arg8, int arg9, int arg10, float arg11, int arg12, int arg13) {
        int var14 = arg9 - arg6;
        int var15 = arg0 - arg13;
        int var16 = arg8 - arg12;
        field10051++;
        float var17 = arg7[2] * (float) var15 + arg7[0] * (float) var14 + arg7[1] * (float) var16;
        float var18 = arg7[5] * (float) var15 + arg7[3] * (float) var14 + arg7[4] * (float) var16;
        float var19 = arg7[8] * (float) var15 + arg7[6] * (float) var14 + arg7[7] * (float) var16;
        float var20;
        float var21;
        if (arg3 == 0) {
            var20 = arg5 + var17 + 0.5F;
            var21 = arg4 + 0.5F - var19;
        } else if (arg3 == 1) {
            var20 = arg5 + var17 + 0.5F;
            var21 = arg4 + var19 + 0.5F;
        } else if (arg3 == 2) {
            var20 = arg5 + 0.5F - var17;
            var21 = arg11 + 0.5F - var18;
        } else if (arg3 == 3) {
            var21 = arg11 + 0.5F - var18;
            var20 = arg5 + var17 + 0.5F;
        } else if (arg3 == 4) {
            var21 = arg11 + 0.5F - var18;
            var20 = arg4 + var19 + 0.5F;
        } else {
            var21 = arg11 + 0.5F - var18;
            var20 = arg4 + 0.5F - var19;
        }
        if (arg1 == arg10) {
            float var23 = var20;
            var20 = -var21;
            var21 = var23;
        } else if (arg1 == 2) {
            var21 = -var21;
            var20 = -var20;
        } else if (arg1 == 3) {
            float var22 = var20;
            var20 = var21;
            var21 = -var22;
        }
        arg2[0] = var20;
        arg2[1] = var21;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIBLha;)Lka;")
    public static final class496 method4073(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class65 arg6) {
        field10050++;
        long var7 = (long) arg3;
        class496 var9 = (class496) class699.field9728.method3742((byte) 67, var7);
        short var10 = 2055;
        if (var9 == null) {
            class100 var11 = class488.method2912(class286.field4217, (byte) 11, arg3, 0);
            if (var11 == null) {
                return null;
            }
            if (var11.field1150 < 13) {
                var11.method715((byte) 84, 2);
            }
            var9 = arg6.method480(var11, var10, class280.field4068, 64, 768);
            class699.field9728.method3739(var7, (byte) 58, var9);
        }
        if (arg5 != -69) {
            field10055 = null;
        }
        class496 var12 = var9.method93((byte) 2, var10, true);
        if (arg0 != 0) {
            var12.method92(arg0);
        }
        if (arg1 != 0) {
            var12.method78(arg1);
        }
        if (arg2 != 0) {
            var12.method74(arg2);
        }
        if (arg4 != 0) {
            var12.method114(0, arg4, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V")
    public final void method4074(int arg0, OggPacket arg1) {
        this.method1417(arg1, 119);
        field10054++;
        if (arg0 >= -9) {
            this.field10052 = 78;
        }
        this.field10052++;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class728(OggStreamState arg0) {
        this.field10053 = arg0;
    }
}
