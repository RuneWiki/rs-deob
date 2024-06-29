import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class40 extends class55 {

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "Lek;")
    public static class352 field509 = new class352(16);

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "Z")
    public static boolean field514 = false;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "Ltf;")
    public static class194 field511 = new class194(5000);

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "F")
    public static float field513;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLfh;)V")
    public static final void method378(byte arg0, class463 arg1) {
        field512++;
        if (arg0 != -105) {
            method380(null, -45, 62, 97);
        }
        byte[] var2 = new byte[24];
        if (class191.field2485 != null) {
            try {
                class191.field2485.method533(0, 0L);
                class191.field2485.method534(-3, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method2782(24, var2, false, 0);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IFFFIIII)[F")
    public static final float[] method379(int arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7) {
        field508++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg0 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg0 * 0.024543693F));
        var8[7] = 0.0F;
        if (arg7 != -148) {
            field511 = null;
        }
        var8[0] = var10;
        var8[8] = var10;
        var8[4] = 1.0F;
        float var12 = 1.0F - var10;
        var8[5] = 0.0F;
        var8[3] = 0.0F;
        var8[1] = 0.0F;
        var8[2] = var11;
        var8[6] = -var11;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg6 / 32767.0F;
        float var17 = 1.0F - var16;
        float var18 = -((float) Math.sqrt((double) (1.0F - (var16 * var16))));
        float var19 = (float) Math.sqrt((double) (arg4 * arg4 + arg5 * arg5));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var15 = (float) arg5 / var19;
                var14 = (float) (-arg4) / var19;
            }
            var13[3] = -var15 * var18;
            var13[6] = var14 * var15 * var17;
            var13[0] = var14 * var14 * var17 + var16;
            var13[4] = var16;
            var13[2] = var14 * var15 * var17;
            var13[1] = var15 * var18;
            var13[7] = -var14 * var18;
            var13[8] = var15 * var15 * var17 + var16;
            var13[5] = var14 * var18;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[0] *= arg1;
        var9[7] *= arg3;
        var9[4] *= arg2;
        var9[2] *= arg1;
        var9[1] *= arg1;
        var9[8] *= arg3;
        var9[6] *= arg3;
        var9[3] *= arg2;
        var9[5] *= arg2;
        return var9;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lhd;III)V")
    public static final void method380(class523 arg0, int arg1, int arg2, int arg3) {
        field507++;
        if (arg0 == null) {
            return;
        }
        if (arg1 != 0) {
            method380(null, -104, 59, -7);
        }
        if (arg0.field7564 != null) {
            class170 var4 = new class170();
            var4.field2178 = arg0.field7564;
            var4.field2179 = arg0;
            class239.method1444(var4);
        }
        class211.field2717 = true;
        class496.field7211 = arg2;
        class470.field6816 = arg0.field7567;
        class322.field4090 = arg0.field7562;
        class468.field6768 = arg0.field7581;
        class21.field309 = arg0.field7723;
        class236.field3000 = arg0.field7613;
        class92.field1125 = arg3;
        class136.method935(arg0, -125);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILjava/lang/Object;I)[B")
    public static final byte[] method381(int arg0, int arg1, Object arg2, int arg3) {
        if (arg3 <= 28) {
            method378((byte) -34, null);
        }
        field510++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var4 = (byte[]) arg2;
            return class89.method703(var4, arg0, arg1, (byte) 76);
        } else if (arg2 instanceof class406) {
            class406 var5 = (class406) arg2;
            return var5.method1906(arg0, 2, arg1);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
    public static void method382(int arg0) {
        if (arg0 <= 122) {
            field513 = -1.6982006F;
        }
        field511 = null;
        field509 = null;
    }
}
