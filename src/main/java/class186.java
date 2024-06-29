import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class186 {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Lmf;")
    public static class174 field3266 = new class174(128);

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "Lij;")
    public static class175 field3272 = new class175();

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3271;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III[I[I)V", line = 7)
    public static final void method1348(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg0 != 1) {
            method1350(false);
        }
        if (arg1 > arg2) {
            int var5 = (arg2 + arg1) / 2;
            int var6 = arg2;
            int var7 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var7;
            int var8 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var8;
            for (int var9 = arg2; var9 < arg1; var9++) {
                if ((var9 & 0x1) + var7 < arg4[var9]) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    int var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg4[arg1] = arg4[var6];
            arg4[var6] = var7;
            arg3[arg1] = arg3[var6];
            arg3[var6] = var8;
            method1348(1, var6 - 1, arg2, arg3, arg4);
            method1348(1, arg1, var6 + 1, arg3, arg4);
        }
        field3268++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZZ)V", line = 67)
    public static final void method1349(boolean arg0, boolean arg1) {
        class213.field3805 = new int[104];
        class305.field5268 = new int[104];
        class191.field3491 = 99;
        class130.field2273 = new int[104];
        class74.field1377 = new int[104];
        field3270++;
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class48.field858 = new byte[var2][104][104];
        class210.field3792 = new int[var2][105][105];
        if (arg0) {
            return;
        }
        class301.field5179 = new byte[var2][104][104];
        class13.field175 = new byte[var2][104][104];
        class10.field151 = new int[104];
        class257.field4452 = new byte[var2][104][104];
        class249.field4234 = new byte[var2][105][105];
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V", line = 96)
    public static void method1350(boolean arg0) {
        field3271 = null;
        field3266 = null;
        field3272 = null;
        if (!arg0) {
            field3273 = -20;
        }
    }
}
