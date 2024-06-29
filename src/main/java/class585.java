import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class585 {

    @OriginalMember(owner = "client!va", name = "a", descriptor = "Laq;")
    private class494 field8404 = new class494(64);

    @OriginalMember(owner = "client!va", name = "i", descriptor = "Lgga;")
    private class513 field8412;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field8406 = 0;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field8405;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field8407;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field8408;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field8409;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I[FIIFIIFBIIF[FI)V")
    public static final void method3433(int arg0, float[] arg1, int arg2, int arg3, float arg4, int arg5, int arg6, float arg7, byte arg8, int arg9, int arg10, float arg11, float[] arg12, int arg13) {
        int var14 = arg3 - arg2;
        int var15 = arg13 - arg5;
        field8407++;
        int var16 = arg0 - arg10;
        if (arg8 > -96) {
            method3433(119, null, -42, -87, -0.012942654F, -123, 70, 0.5053589F, (byte) -15, -111, 20, 0.8655073F, null, -49);
        }
        float var17 = arg1[2] * (float) var14 + arg1[0] * (float) var16 + arg1[1] * (float) var15;
        float var18 = arg1[5] * (float) var14 + arg1[4] * (float) var15 + arg1[3] * (float) var16;
        float var19 = arg1[8] * (float) var14 + arg1[7] * (float) var15 + arg1[6] * (float) var16;
        float var20;
        float var21;
        if (arg9 == 0) {
            var20 = arg7 + 0.5F - var19;
            var21 = arg4 + var17 + 0.5F;
        } else if (arg9 == 1) {
            var20 = arg7 + var19 + 0.5F;
            var21 = arg4 + var17 + 0.5F;
        } else if (arg9 == 2) {
            var20 = arg11 + 0.5F - var18;
            var21 = arg4 + 0.5F - var17;
        } else if (arg9 == 3) {
            var20 = arg11 + 0.5F - var18;
            var21 = arg4 + var17 + 0.5F;
        } else if (arg9 == 4) {
            var21 = arg7 + var19 + 0.5F;
            var20 = arg11 + 0.5F - var18;
        } else {
            var20 = arg11 + 0.5F - var18;
            var21 = arg7 + 0.5F - var19;
        }
        if (arg6 == 1) {
            float var23 = var21;
            var21 = -var20;
            var20 = var23;
        } else if (arg6 == 2) {
            var21 = -var21;
            var20 = -var20;
        } else if (arg6 == 3) {
            float var22 = var21;
            var21 = var20;
            var20 = -var22;
        }
        arg12[0] = var21;
        arg12[1] = var20;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Lkt;")
    public final class93 method3434(int arg0, int arg1) {
        field8408++;
        class494 var3 = this.field8404;
        class93 var4;
        synchronized (this.field8404) {
            var4 = (class93) this.field8404.method2882((long) arg0, (byte) -45);
        }
        if (var4 != null) {
            return var4;
        }
        class513 var5 = this.field8412;
        byte[] var6;
        synchronized (this.field8412) {
            var6 = this.field8412.method3019(11, arg0, 88);
        }
        class93 var7 = new class93();
        if (var6 != null) {
            var7.method790(-22425, new class431(var6));
        }
        class494 var8 = this.field8404;
        synchronized (this.field8404) {
            this.field8404.method2890(-7307, (long) arg0, var7);
            if (arg1 != 10549) {
                this.field8404 = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V")
    public final void method3435(int arg0, int arg1) {
        class494 var3 = this.field8404;
        synchronized (this.field8404) {
            if (arg1 <= 19) {
                method3433(-11, null, 44, 94, 0.96916646F, 87, -84, 0.7546467F, (byte) 103, 40, 106, -0.8554957F, null, -90);
            }
            this.field8404.method2888(arg0, 120);
        }
        field8411++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public final void method3436(int arg0) {
        field8405++;
        if (arg0 != 8818) {
            this.method3438(107);
        }
        class494 var2 = this.field8404;
        synchronized (this.field8404) {
            this.field8404.method2893((byte) 123);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ltd;B)I")
    public static final int method3437(class551 arg0, byte arg1) {
        if (arg1 != -69) {
            method3433(-37, null, -93, 33, 0.9859826F, -39, 73, 1.4998509F, (byte) 30, -52, -120, 0.043263394F, null, -128);
        }
        field8410++;
        String var2 = class44.method332(false, arg0);
        return class675.field9477.method2746(var2, class312.field4420, true);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    public final void method3438(int arg0) {
        class494 var2 = this.field8404;
        synchronized (this.field8404) {
            this.field8404.method2881((byte) -24);
        }
        field8409++;
        int var3 = 81 % ((arg0 - 6) / 44);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lmca;ILgga;)V")
    public class585(class41 arg0, int arg1, class513 arg2) {
        this.field8412 = arg2;
        if (this.field8412 != null) {
            this.field8412.method3007(-1, 11);
        }
    }
}
