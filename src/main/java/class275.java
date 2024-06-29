import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public abstract class class275 {

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public static int field3606 = -1;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "Lft;")
    public static class285 field3609 = new class285(9, 7);

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "Lnj;")
    public static class415 field3612 = new class415(47, 3);

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "Lra;")
    public static class361 field3613 = new class361(67, 3);

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "Lnj;")
    public static class415 field3614 = new class415(10, 16);

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I[FFIBIFIIIIIF)V", line = 12)
    public static final void method1666(int arg0, float[] arg1, float arg2, int arg3, byte arg4, int arg5, float arg6, int arg7, int arg8, int arg9, int arg10, int arg11, float arg12) {
        int var13 = arg0 - arg5;
        field3607++;
        if (arg4 != 44) {
            return;
        }
        int var14 = arg9 - arg11;
        int var15 = arg10 - arg3;
        float var16 = arg1[2] * (float) var15 + arg1[1] * (float) var14 + arg1[0] * (float) var13;
        float var17 = arg1[5] * (float) var15 + arg1[3] * (float) var13 + arg1[4] * (float) var14;
        float var18 = arg1[8] * (float) var15 + arg1[6] * (float) var13 + arg1[7] * (float) var14;
        float var19;
        float var20;
        if (arg7 == 0) {
            var19 = arg12 + 0.5F - var18;
            var20 = arg2 + var16 + 0.5F;
        } else if (arg7 == 1) {
            var19 = arg12 + var18 + 0.5F;
            var20 = arg2 + var16 + 0.5F;
        } else if (arg7 == 2) {
            var19 = arg6 + 0.5F - var17;
            var20 = arg2 + 0.5F - var16;
        } else if (arg7 == 3) {
            var19 = arg6 + 0.5F - var17;
            var20 = arg2 + var16 + 0.5F;
        } else if (arg7 == 4) {
            var20 = arg12 + var18 + 0.5F;
            var19 = arg6 + 0.5F - var17;
        } else {
            var20 = arg12 + 0.5F - var18;
            var19 = arg6 + 0.5F - var17;
        }
        if (arg8 == 1) {
            float var22 = var20;
            var20 = -var19;
            var19 = var22;
        } else if (arg8 == 2) {
            var20 = -var20;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var20;
            var20 = var19;
            var19 = -var21;
        }
        class260.field3507 = var19;
        class303.field3964 = var20;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)V", line = 102)
    public static void method1667(boolean arg0) {
        field3614 = null;
        field3612 = null;
        field3613 = null;
        field3609 = null;
        if (arg0) {
            method1670(null, -85);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)I", line = 115)
    public static final int method1668(int arg0) {
        field3610++;
        return arg0 == 3 ? class174.field2183++ : -27;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lfd;I)V", line = 128)
    public static final void method1670(class418 arg0, int arg1) {
        field3611++;
        byte[] var2 = new byte[24];
        int var3 = -46 / ((arg1 - 44) / 63);
        if (class355.field4593 != null) {
            try {
                class355.field4593.method1563(0L, (byte) -82);
                class355.field4593.method1565(var2, 98);
                int var4;
                for (var4 = 0; var4 < 24 && var2[var4] == 0; var4++) {
                }
                if (var4 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method2358(120, 24, 0, var2);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BI)V")
    public abstract void method1664(byte arg0, int arg1);

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)I")
    public abstract int method1665(int arg0, int arg1);

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IB)[B")
    public abstract byte[] method1669(int arg0, byte arg1);

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)Ltb;")
    public abstract class453 method1671(byte arg0);
}
