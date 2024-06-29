import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class681 implements class152 {

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Lgea;")
    private class76 field9470 = new class76(256);

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "Lni;")
    private class522 field9483;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "Lni;")
    private class522 field9481;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    private int field9476;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "[Lpba;")
    private class335[] field9469;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "S")
    public static short field9479 = 32767;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "Lwr;")
    public static class459 field9475 = new class459(64);

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "F")
    public static float field9487;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field9471;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field9472;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field9473;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field9474;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field9477;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field9478;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field9480;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field9482;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field9484;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public static int field9485;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public static int field9486;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field9488;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "Luaa;")
    public static class119 field9490;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "Lea;")
    public static class547 field9489;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIFZI)[I", line = 3)
    public final int[] method927(int arg0, int arg1, int arg2, float arg3, boolean arg4, int arg5) {
        if (arg0 < 108) {
            this.method922(-35, -59);
        }
        field9472++;
        return this.method3865(false, arg2).method4235(this.field9469[arg2].field4526, (double) arg3, arg5, this, this.field9481, (byte) 79, arg1);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)I", line = 16)
    public final int method926(boolean arg0) {
        if (!arg0) {
            this.method923(-28, (byte) 95, -93, -0.31396338F, false, -83);
        }
        field9473++;
        return this.field9476;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)Lmp;", line = 28)
    private final class761 method3865(boolean arg0, int arg1) {
        field9471++;
        class392 var3 = this.field9470.method566((byte) 127, (long) arg1);
        if (var3 != null) {
            return (class761) var3;
        }
        byte[] var4 = this.field9483.method2873(arg1, -5);
        if (var4 == null) {
            return null;
        } else if (arg0) {
            return null;
        } else {
            class761 var5 = new class761(new class611(var4));
            this.field9470.method567(26404, var5, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[S[Ljava/lang/String;II)V", line = 60)
    public static final void method3866(int arg0, short[] arg1, String[] arg2, int arg3, int arg4) {
        if (arg4 < arg3) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg4;
            String var7 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var8;
            for (int var9 = arg4; var9 < arg3; var9++) {
                if (var7 == null || arg2[var9] != null && (var9 & 0x1) > arg2[var9].compareTo(var7)) {
                    String var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg2[arg3] = arg2[var6];
            arg2[var6] = var7;
            arg1[arg3] = arg1[var6];
            arg1[var6] = var8;
            method3866(47, arg1, arg2, var6 - 1, arg4);
            method3866(47, arg1, arg2, arg3, var6 + 1);
        }
        field9478++;
        if (arg0 != 47) {
            method3868(42);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBIFZI)[I", line = 114)
    public final int[] method923(int arg0, byte arg1, int arg2, float arg3, boolean arg4, int arg5) {
        if (arg1 > -111) {
            this.method3865(true, 110);
        }
        field9480++;
        return this.method3865(false, arg0).method4233(arg2, arg4, this, (double) arg3, this.field9469[arg0].field4526, this.field9481, arg5, (byte) -34);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)Z", line = 127)
    public final boolean method922(int arg0, int arg1) {
        int var3 = 38 % ((arg0 + 70) / 39);
        field9485++;
        class761 var4 = this.method3865(false, arg1);
        return var4 != null && var4.method4231(0, this.field9481, this);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)V", line = 141)
    public static final void method3867(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class634.field8808 = arg4;
        if (arg1 >= -81) {
            method3867(33, 69, -94, -55, 47);
        }
        class506.field6859 = arg0;
        field9484++;
        class73.field785 = arg3;
        class596.field8314 = arg2;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BZIIFI)[F", line = 156)
    public final float[] method924(byte arg0, boolean arg1, int arg2, int arg3, float arg4, int arg5) {
        field9474++;
        if (arg0 > -116) {
            this.field9469 = null;
        }
        return this.method3865(false, arg2).method4232(this, this.field9481, (byte) -86, arg5, arg3, this.field9469[arg2].field4526);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)Lpba;", line = 167)
    public final class335 method925(int arg0, int arg1) {
        field9477++;
        if (arg1 != -28755) {
            this.method3865(false, 2);
        }
        return this.field9469[arg0];
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 179)
    public static void method3868(int arg0) {
        if (arg0 == -19788) {
            field9489 = null;
            field9475 = null;
            field9490 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lni;Lni;Lni;)V", line = 196)
    public class681(class522 arg0, class522 arg1, class522 arg2) {
        this.field9483 = arg1;
        this.field9481 = arg2;
        class611 var4 = new class611(arg0.method2885(0, 0, false));
        this.field9476 = var4.method3402((byte) 127);
        this.field9469 = new class335[this.field9476];
        for (int var5 = 0; var5 < this.field9476; var5++) {
            if (var4.method3428((byte) 72) == 1) {
                this.field9469[var5] = new class335();
            }
        }
        for (int var6 = 0; var6 < this.field9476; var6++) {
            if (this.field9469[var6] != null) {
                this.field9469[var6].field4527 = var4.method3428((byte) 50) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field9476; var7++) {
            if (this.field9469[var7] != null) {
                this.field9469[var7].field4524 = var4.method3428((byte) 95) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field9476; var8++) {
            if (this.field9469[var8] != null) {
                this.field9469[var8].field4537 = var4.method3428((byte) -105) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field9476; var9++) {
            if (this.field9469[var9] != null) {
                this.field9469[var9].field4533 = var4.method3390((byte) -19);
            }
        }
        for (int var10 = 0; var10 < this.field9476; var10++) {
            if (this.field9469[var10] != null) {
                this.field9469[var10].field4534 = var4.method3390((byte) -19);
            }
        }
        for (int var11 = 0; var11 < this.field9476; var11++) {
            if (this.field9469[var11] != null) {
                this.field9469[var11].field4522 = var4.method3390((byte) -19);
            }
        }
        for (int var12 = 0; var12 < this.field9476; var12++) {
            if (this.field9469[var12] != null) {
                this.field9469[var12].field4518 = var4.method3390((byte) -19);
            }
        }
        for (int var13 = 0; var13 < this.field9476; var13++) {
            if (this.field9469[var13] != null) {
                this.field9469[var13].field4535 = (short) var4.method3402((byte) 127);
            }
        }
        for (int var14 = 0; var14 < this.field9476; var14++) {
            if (this.field9469[var14] != null) {
                this.field9469[var14].field4525 = var4.method3390((byte) -19);
            }
        }
        for (int var15 = 0; var15 < this.field9476; var15++) {
            if (this.field9469[var15] != null) {
                this.field9469[var15].field4542 = var4.method3390((byte) -19);
            }
        }
        for (int var16 = 0; var16 < this.field9476; var16++) {
            if (this.field9469[var16] != null) {
                this.field9469[var16].field4529 = var4.method3428((byte) -126) == 1;
            }
        }
        for (int var17 = 0; var17 < this.field9476; var17++) {
            if (this.field9469[var17] != null) {
                this.field9469[var17].field4526 = var4.method3428((byte) -117) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field9476; var18++) {
            if (this.field9469[var18] != null) {
                this.field9469[var18].field4536 = var4.method3390((byte) -19);
            }
        }
        for (int var19 = 0; var19 < this.field9476; var19++) {
            if (this.field9469[var19] != null) {
                this.field9469[var19].field4528 = var4.method3428((byte) 46) == 1;
            }
        }
        for (int var20 = 0; var20 < this.field9476; var20++) {
            if (this.field9469[var20] != null) {
                this.field9469[var20].field4521 = var4.method3428((byte) 31) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field9476; var21++) {
            if (this.field9469[var21] != null) {
                this.field9469[var21].field4519 = var4.method3428((byte) 122) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field9476; var22++) {
            if (this.field9469[var22] != null) {
                this.field9469[var22].field4523 = var4.method3428((byte) 89);
            }
        }
        for (int var23 = 0; var23 < this.field9476; var23++) {
            if (this.field9469[var23] != null) {
                this.field9469[var23].field4539 = var4.method3418(-2);
            }
        }
        for (int var24 = 0; var24 < this.field9476; var24++) {
            if (this.field9469[var24] != null) {
                this.field9469[var24].field4520 = var4.method3428((byte) 35);
            }
        }
    }
}
