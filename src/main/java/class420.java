import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class420 extends class354 {

    @OriginalMember(owner = "client!id", name = "R", descriptor = "I")
    private int field6392 = 4096;

    @OriginalMember(owner = "client!id", name = "Y", descriptor = "I")
    private int field6398 = 2000;

    @OriginalMember(owner = "client!id", name = "Z", descriptor = "I")
    private int field6399 = 0;

    @OriginalMember(owner = "client!id", name = "V", descriptor = "I")
    private int field6395 = 0;

    @OriginalMember(owner = "client!id", name = "T", descriptor = "I")
    private int field6393 = 16;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "Lof;")
    public static class446 field6389 = new class446("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!id", name = "X", descriptor = "[F")
    public static float[] field6397 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "F")
    public static float field6391;

    @OriginalMember(owner = "client!id", name = "ab", descriptor = "F")
    public static float field6400;

    @OriginalMember(owner = "client!id", name = "K", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!id", name = "U", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!id", name = "W", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!id", name = "bb", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!id", name = "cb", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!id", name = "db", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!id", name = "eb", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIB)I")
    public static final int method2562(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var7 = arg3 & 3;
        ++field6404;
        if (~(arg5 & 1) == -2) {
            int var8 = arg2;
            arg2 = arg1;
            arg1 = var8;
        }
        if (arg6 != -65) {
            method2568(52, (byte[][][]) null, -83, -40, -4, (class165) null, 57, 24, 98, 40, -2, 2, 61);
        }
        if (~var7 == -1) {
            return arg4;
        } else if (var7 == 1) {
            return -arg2 + 1 + 7 + -arg0;
        } else {
            return var7 == 2 ? -arg4 + 7 + -arg1 + 1 : arg0;
        }
    }

    @OriginalMember(owner = "client!id", name = "h", descriptor = "(I)V")
    public static final void method2563(int arg0) {
        class70.field975.method2135(0);
        if (arg0 < 72) {
            method2562(-109, 50, -33, 34, 35, 121, (byte) -55);
        }
        ++field6386;
        class81.field1184.method2135(0);
        class515.field7567.method2135(0);
        class259.field3636.method2135(0);
        class166.field2250.method2135(0);
    }

    @OriginalMember(owner = "client!id", name = "g", descriptor = "(I)V")
    public final void method357(int arg0) {
        if (arg0 >= 28) {
            class410.method2530(1);
            ++field6402;
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)V")
    public static void method2564(boolean arg0) {
        field6389 = null;
        field6397 = null;
        if (arg0) {
            method2570(-74, -35, false);
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)Z")
    public static final boolean method2565(byte arg0) {
        ++field6394;
        if (arg0 != -5) {
            method2565((byte) 44);
        }
        if (class211.field2989) {
            try {
                class305.method1920(class312.field4572.field7381, "showVideoAd", 21694);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    public class420() {
        super(0, true);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lnj;II)V")
    public final void method272(class164 arg0, int arg1, int arg2) {
        ++field6385;
        if (arg2 == 1638) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (arg1 != 2) {
                        if (arg1 != 3) {
                            if (~arg1 == -5) {
                                this.field6392 = arg0.method1074(-635989152);
                            }
                        } else {
                            this.field6395 = arg0.method1074(arg2 + -635990790);
                        }
                    } else {
                        this.field6393 = arg0.method1087(false);
                    }
                } else {
                    this.field6398 = arg0.method1074(-635989152);
                }
            } else {
                this.field6399 = arg0.method1087(false);
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)V")
    public static final void method2566(int arg0, boolean arg1) {
        ++field6396;
        if (class374.field5695 != null) {
            class374.field5695.method1934((byte) -24);
            class374.field5695 = null;
        }
        class380.field5793 = 0;
        class475.method2833(0);
        if (arg0 == -5) {
            class425.method2598();
            for (int var2 = 0; ~var2 > -5; ++var2) {
                class9.field174[var2].method1213((byte) -117);
            }
            class229.method1543(false, 64);
            System.gc();
            class411.method2532(-81, 2);
            class539.field7905 = false;
            class513.field7536 = -1;
            class212.method1462(true, arg0 ^ -5429);
            class276.field3936 = 0;
            class331.field5162 = 0;
            class328.field5099 = 0;
            class492.field7259 = 0;
            class405.field6149 = 0;
            class499.field7355 = 0;
            for (int var3 = 0; var3 < class361.field5531.length; ++var3) {
                class361.field5531[var3] = null;
            }
            class276.method1774(false);
            for (int var4 = 0; ~var4 > -2049; ++var4) {
                class241.field3398[var4] = null;
            }
            class333.field5187 = 0;
            class406.field6158.method1745(-93);
            class515.field7566 = 0;
            class392.field6005.method1745(-123);
            class278.method1787((byte) -99);
            class508.field7476 = 0;
            class288.field4208.method569(-87);
            class439.method2661(104);
            class41.method331(true);
            class515.field7569 = 0L;
            class203.field2719 = null;
            if (arg1) {
                class134.method908(11, arg0 ^ -7);
            } else {
                class134.method908(2, 2);
                try {
                    class305.method1920(class312.field4572.field7381, "loggedout", 21694);
                } catch (Throwable var5) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lwj;B)V")
    public static final void method2567(class275 arg0, byte arg1) {
        ++field6388;
        if (arg0 instanceof class17) {
            class17 var2 = (class17) arg0;
            if (var2.field274 != null) {
                class27.method245((byte) 14, var2, ~class56.field800.field1866 != ~var2.field1866);
            }
        } else if (arg0 instanceof class96) {
            class96 var3 = (class96) arg0;
            class462.method2796(false, class56.field800.field1866 != var3.field1866, var3);
        }
        int var4 = 41 / ((29 - arg1) / 47);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[[[BIIILqa;IIIIIII)V")
    public static final void method2568(int arg0, byte[][][] arg1, int arg2, int arg3, int arg4, class165 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field6403;
        if (arg2 != 0 && arg11 != 0) {
            if (~arg2 == -10) {
                arg9 = arg9 - -1 & 3;
                arg2 = 1;
            }
            if (~arg2 == -11) {
                arg9 = arg9 - -3 & 3;
                arg2 = 1;
            }
            if (~arg2 == -12) {
                arg9 = arg9 + 3 & 3;
                arg2 = 8;
            }
            arg5.method770(arg4, arg8, arg7, arg0, arg6, arg12, arg1[arg2 + arg3][arg9], arg11, arg10);
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(IIIII)V")
    public static final void method2569(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class374.field5693 != null) {
            class374.field5693[arg0][arg1] = -16777216 | arg2;
        }
        if (class236.field3344 != null) {
            class236.field3344[arg0][arg1] = (short) arg3;
        }
        if (class113.field1574 != null) {
            class113.field1574[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(BI)[I")
    public final int[] method270(byte arg0, int arg1) {
        ++field6390;
        if (arg0 > -74) {
            this.field6392 = -39;
        }
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (super.field5478.field6213) {
            int var4 = this.field6392 >> 1;
            int[][] var5 = super.field5478.method2523(-1);
            Random var6 = new Random((long) this.field6399);
            for (int var7 = 0; ~var7 > ~this.field6398; ++var7) {
                int var8 = this.field6392 <= 0 ? this.field6395 : -var4 + this.field6395 + class491.method2931(var6, Integer.MIN_VALUE, this.field6392);
                int var9 = var8 >> 4 & 255;
                int var10 = class491.method2931(var6, Integer.MIN_VALUE, class531.field7814);
                int var11 = class491.method2931(var6, Integer.MIN_VALUE, class33.field511);
                int var12 = var10 - -(class165.field2241[var9] * this.field6393 >> 12);
                int var13 = (class369.field5635[var9] * this.field6393 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || var14 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = var13 - var11;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 + -(class491.method2931(var6, Integer.MIN_VALUE, 4096) >> 2);
                    int var27 = ~var13 < ~var11 ? 1 : -1;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; var12 > var28; ++var28) {
                        int var29 = (-var10 + var28) * var25 + 1024 + var26;
                        int var30 = var28 & class179.field2409;
                        int var31 = class423.field6453 & var21;
                        var24 += var23;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (~var24 < -1) {
                            var21 -= -var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIZ)V")
    public static final void method2570(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method2567((class275) null, (byte) -56);
        }
        ++field6401;
        if (class67.field957 != class249.field3474) {
            if (!class203.method1373(0, arg0, 1, -3, 0, 1, false, arg1, (byte) 11)) {
                class203.method1373(0, arg0, 1, -2, 0, 1, false, arg1, (byte) 11);
            }
        } else if (!class203.method1373(0, arg0, 1, -2, 0, 1, false, arg1, (byte) 11)) {
            class203.method1373(0, arg0, 1, -3, 0, 1, false, arg1, (byte) 11);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IILuu;)Lgg;")
    public static final class118 method2571(int arg0, int arg1, class191 arg2) {
        ++field6387;
        byte[] var3 = arg2.method1289(arg1, arg0 + 106);
        if (arg0 != 1) {
            return null;
        } else {
            return var3 == null ? null : new class118(var3);
        }
    }
}
