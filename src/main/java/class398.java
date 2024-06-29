import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class398 {

    @OriginalMember(owner = "client!cv", name = "u", descriptor = "I")
    private int field5856 = 0;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
    public int field5838;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "[Loo;")
    public class439[] field5837;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "Lnk;")
    public static class500 field5840 = new class500("WTQA", 2);

    @OriginalMember(owner = "client!cv", name = "t", descriptor = "Lob;")
    public static class516 field5855 = new class516("", 15);

    @OriginalMember(owner = "client!cv", name = "v", descriptor = "Z")
    public static boolean field5857 = false;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!cv", name = "h", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!cv", name = "i", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!cv", name = "l", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!cv", name = "m", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!cv", name = "o", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!cv", name = "p", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!cv", name = "q", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!cv", name = "s", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "J")
    private long field5846;

    @OriginalMember(owner = "client!cv", name = "n", descriptor = "Loo;")
    private class439 field5849;

    @OriginalMember(owner = "client!cv", name = "r", descriptor = "Loo;")
    private class439 field5853;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V", line = 5)
    public static void method2474(int arg0) {
        field5840 = null;
        field5855 = null;
        if (arg0 != 0) {
            field5854 = 21;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIII[F)V", line = 20)
    public static final void method2475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6) {
        if (arg3 != 5126) {
            return;
        }
        field5851++;
        if (arg0 > 0 && !class390.method2453(arg3 - 7754, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class390.method2453(-2628, arg1)) {
            int var7 = class80.method645(-6408, arg2);
            int var8 = 0;
            int var9 = arg0 < arg1 ? arg0 : arg1;
            int var10 = arg0 >> 1;
            int var11 = arg1 >> 1;
            float[] var12 = arg6;
            float[] var13 = new float[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg5, var8, arg4, arg0, arg1, 0, arg2, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg0 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            float var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                float[] var16 = var13;
                var13 = var12;
                var12 = var16;
                arg0 = var10;
                arg1 = var11;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var8++;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V", line = 121)
    public final void method2476(int arg0) {
        for (int var2 = arg0; var2 < this.field5838; var2++) {
            class439 var3 = this.field5837[var2];
            while (true) {
                class439 var4 = var3.field6403;
                if (var3 == var4) {
                    break;
                }
                var4.method2663(-117);
            }
        }
        field5844++;
        this.field5849 = null;
        this.field5853 = null;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z)V", line = 150)
    public static final void method2477(boolean arg0) {
        field5847++;
        if (!arg0) {
            method2477(true);
        }
        class122.field1907.method2476(0);
        class470.field6917.method815(1690797447);
        class178.field2695.method815(1690797447);
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "([Loo;B)I", line = 163)
    public final int method2478(class439[] arg0, byte arg1) {
        field5842++;
        int var3 = 0;
        if (arg1 != -36) {
            this.method2482(4);
        }
        for (int var4 = 0; var4 < this.field5838; var4++) {
            class439 var5 = this.field5837[var4];
            for (class439 var6 = var5.field6403; var6 != var5; var6 = var6.field6403) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "(I)I", line = 196)
    public final int method2479(int arg0) {
        field5852++;
        if (arg0 <= 37) {
            this.method2482(-41);
        }
        return this.field5838;
    }

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "(I)Loo;", line = 208)
    public final class439 method2480(int arg0) {
        field5841++;
        if (this.field5849 == null) {
            return null;
        }
        class439 var2 = this.field5837[(int) (this.field5846 & (long) (this.field5838 + arg0))];
        while (this.field5849 != var2) {
            if (this.field5849.field6399 == this.field5846) {
                class439 var3 = this.field5849;
                this.field5849 = this.field5849.field6403;
                return var3;
            }
            this.field5849 = this.field5849.field6403;
        }
        this.field5849 = null;
        return null;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)Loo;", line = 236)
    public final class439 method2481(byte arg0) {
        field5845++;
        if (this.field5856 > 0 && this.field5837[this.field5856 - 1] != this.field5853) {
            class439 var2 = this.field5853;
            this.field5853 = var2.field6403;
            return var2;
        }
        if (arg0 != -27) {
            this.method2476(-103);
        }
        while (this.field5856 < this.field5838) {
            class439 var3 = this.field5837[this.field5856++].field6403;
            if (this.field5837[this.field5856 - 1] != var3) {
                this.field5853 = var3.field6403;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "(I)I", line = 268)
    public final int method2482(int arg0) {
        field5850++;
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field5838; var3++) {
            class439 var4 = this.field5837[var3];
            for (class439 var5 = var4.field6403; var5 != var4; var5 = var5.field6403) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "(I)Loo;", line = 298)
    public final class439 method2483(int arg0) {
        this.field5856 = 0;
        field5848++;
        int var2 = -111 % ((arg0 - 50) / 57);
        return this.method2481((byte) -27);
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(III)Z", line = 314)
    public static final boolean method2484(int arg0, int arg1, int arg2) {
        if (arg2 <= 63) {
            field5857 = true;
        }
        field5836++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IJ)Loo;", line = 326)
    public final class439 method2485(int arg0, long arg1) {
        this.field5846 = arg1;
        field5843++;
        class439 var4 = this.field5837[(int) ((long) (this.field5838 - 1) & arg1)];
        this.field5849 = var4.field6403;
        if (arg0 < 0) {
            this.method2478(null, (byte) -38);
        }
        while (this.field5849 != var4) {
            if (this.field5849.field6399 == arg1) {
                class439 var5 = this.field5849;
                this.field5849 = this.field5849.field6403;
                return var5;
            }
            this.field5849 = this.field5849.field6403;
        }
        this.field5849 = null;
        return null;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILoo;J)V", line = 356)
    public final void method2486(int arg0, class439 arg1, long arg2) {
        field5839++;
        if (arg1.field6396 != null) {
            arg1.method2663(-127);
        }
        int var5 = 101 / ((-arg0 - 57) / 40);
        class439 var6 = this.field5837[(int) (arg2 & (long) (this.field5838 - 1))];
        arg1.field6396 = var6.field6396;
        arg1.field6403 = var6;
        arg1.field6396.field6403 = arg1;
        arg1.field6403.field6396 = arg1;
        arg1.field6399 = arg2;
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(I)V", line = 375)
    public class398(int arg0) {
        this.field5838 = arg0;
        this.field5837 = new class439[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class439 var3 = this.field5837[var2] = new class439();
            var3.field6396 = var3;
            var3.field6403 = var3;
        }
    }
}
