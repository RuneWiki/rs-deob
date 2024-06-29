import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class class147 extends class626 {

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field2246;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public int field2248;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I[FI)[F", line = 4)
    public static final float[] method1139(int arg0, float[] arg1, int arg2) {
        if (arg2 == 20145) {
            field2245++;
            float[] var3 = new float[arg0];
            class622.method3595(arg1, 0, var3, 0, arg0);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V", line = 25)
    public final void method1140(OggPacket arg0, int arg1) {
        this.method9(false, arg0);
        if (arg1 == 2749) {
            field2247++;
            this.field2248++;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILaa;ILdm;IIIJ)V", line = 40)
    public static final void method1141(int arg0, int arg1, class484 arg2, int arg3, class50 arg4, int arg5, int arg6, int arg7, long arg8) {
        if (arg5 != -1) {
            return;
        }
        field2249++;
        int var10 = arg1 * arg1 + arg3 * arg3;
        if (((long) var10) > arg8) {
            return;
        }
        int var11 = Math.min(arg4.field783 / 2, arg4.field830 / 2);
        if ((var11 * var11) >= var10) {
            class43.method392(arg6, arg0, arg4, class272.field3886[arg7], (byte) 126, arg1, arg3, arg2);
            return;
        }
        var11 -= 10;
        int var12;
        if (class666.field9338 == 4) {
            var12 = (int) class321.field4568 & 0x3FFF;
        } else {
            var12 = (int) class321.field4568 + class440.field6138 & 0x3FFF;
        }
        int var13 = class316.field4487[var12];
        int var14 = class316.field4490[var12];
        if (class666.field9338 != 4) {
            var14 = var14 * 256 / (class113.field1812 + 256);
            var13 = var13 * 256 / (class113.field1812 + 256);
        }
        int var15 = arg1 * var14 + arg3 * var13 >> 14;
        int var16 = arg3 * var14 - (arg1 * var13) >> 14;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) (Math.cos(var17) * (double) var11);
        class748.field10461[arg7].method4134((float) arg4.field783 / 2.0F + (float) arg6 + (float) var19, (float) arg4.field830 / 2.0F + (float) arg0 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II[BZIII)Z", line = 92)
    public static final boolean method1142(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (!arg3) {
            method1139(-54, null, 48);
        }
        field2250++;
        int var7 = arg6 % arg1;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg1 - var7;
        }
        int var9 = -((arg1 + arg5 - 1) / arg1);
        int var10 = -((arg6 + arg1 - 1) / arg1);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg2[arg0] == 0) {
                    return true;
                }
                arg0 += arg1;
            }
            int var13 = arg0 - var8;
            if (arg2[var13 - 1] == 0) {
                return true;
            }
            arg0 = arg4 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 141)
    public class147(OggStreamState arg0) {
        this.field2246 = arg0;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public abstract void method8(int arg0);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZLjagtheora/ogg/OggPacket;)V")
    public abstract void method9(boolean arg0, OggPacket arg1);
}
