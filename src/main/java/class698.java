import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class698 {

    @OriginalMember(owner = "client!vfa", name = "r", descriptor = "I")
    public int field9869;

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "Z")
    public boolean field9856;

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "Z")
    public boolean field9853;

    @OriginalMember(owner = "client!vfa", name = "p", descriptor = "[S")
    public short[] field9867;

    @OriginalMember(owner = "client!vfa", name = "k", descriptor = "I")
    public int field9862;

    @OriginalMember(owner = "client!vfa", name = "t", descriptor = "I")
    private int field9871;

    @OriginalMember(owner = "client!vfa", name = "m", descriptor = "[Lrv;")
    public static class120[] field9864 = new class120[2048];

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "I")
    public static int field9852;

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "I")
    private int field9854;

    @OriginalMember(owner = "client!vfa", name = "f", descriptor = "I")
    public static int field9857;

    @OriginalMember(owner = "client!vfa", name = "g", descriptor = "I")
    public static int field9858;

    @OriginalMember(owner = "client!vfa", name = "h", descriptor = "I")
    public static int field9859;

    @OriginalMember(owner = "client!vfa", name = "i", descriptor = "I")
    public static int field9860;

    @OriginalMember(owner = "client!vfa", name = "j", descriptor = "I")
    public static int field9861;

    @OriginalMember(owner = "client!vfa", name = "l", descriptor = "I")
    private int field9863;

    @OriginalMember(owner = "client!vfa", name = "n", descriptor = "I")
    private int field9865;

    @OriginalMember(owner = "client!vfa", name = "o", descriptor = "I")
    public static int field9866;

    @OriginalMember(owner = "client!vfa", name = "q", descriptor = "I")
    public static int field9868;

    @OriginalMember(owner = "client!vfa", name = "s", descriptor = "I")
    private int field9870;

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "Ljw;")
    public class578 field9855;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)V", line = 3)
    public static void method3935(int arg0) {
        field9864 = null;
        int var1 = 101 / ((-arg0 - 49) / 37);
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIZ)V", line = 15)
    public final void method3936(int arg0, int arg1, boolean arg2) {
        field9859++;
        if (arg1 != -3) {
            this.field9862 = 94;
        }
        int var6;
        if (arg2) {
            var6 = 2048;
        } else {
            int var4 = this.field9854 * arg0 / 50 + this.field9871 & 0x7FF;
            int var5 = this.field9870;
            if (var5 == 1) {
                var6 = (class601.field8476[var4 << 3] >> 4) + 1024;
            } else if (var5 == 3) {
                var6 = class6.field65[var4] >> 1;
            } else if (var5 == 4) {
                var6 = var4 >> 10 << 11;
            } else if (var5 == 2) {
                var6 = var4;
            } else if (var5 == 5) {
                var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
            } else {
                var6 = 2048;
            }
        }
        this.field9855.method1981(-113, (float) ((this.field9865 * var6 >> 11) + this.field9863) / 2048.0F);
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lha;IIIIII)V", line = 90)
    private final void method3937(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9868++;
        if (arg1 != 20997) {
            this.method3940(36, 58, -127, 126, -56);
        }
        this.field9855 = arg0.method492(arg2, arg6, arg5, arg4, arg3, 1.0F);
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "([Ljava/lang/Object;IB[II)V", line = 106)
    public static final void method3938(Object[] arg0, int arg1, byte arg2, int[] arg3, int arg4) {
        if (arg2 > -8) {
            field9857 = -89;
        }
        field9852++;
        if (arg1 <= arg4) {
            return;
        }
        int var5 = (arg1 + arg4) / 2;
        int var6 = arg4;
        int var7 = arg3[var5];
        arg3[var5] = arg3[arg1];
        arg3[arg1] = var7;
        Object var8 = arg0[var5];
        arg0[var5] = arg0[arg1];
        arg0[arg1] = var8;
        int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
        for (int var10 = arg4; var10 < arg1; var10++) {
            if (arg3[var10] < (var10 & var9) + var7) {
                int var11 = arg3[var10];
                arg3[var10] = arg3[var6];
                arg3[var6] = var11;
                Object var12 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6++] = var12;
            }
        }
        arg3[arg1] = arg3[var6];
        arg3[var6] = var7;
        arg0[arg1] = arg0[var6];
        arg0[var6] = var8;
        method3938(arg0, var6 - 1, (byte) -78, arg3, arg4);
        method3938(arg0, arg1, (byte) -111, arg3, var6 + 1);
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)V", line = 164)
    private final void method3939(int arg0) {
        int var2 = this.field9862;
        if (var2 == 2) {
            this.field9870 = 1;
            this.field9863 = 0;
            this.field9854 = 2048;
            this.field9865 = 2048;
        } else if (var2 == 3) {
            this.field9865 = 2048;
            this.field9870 = 1;
            this.field9863 = 0;
            this.field9854 = 4096;
        } else if (var2 == 4) {
            this.field9870 = 4;
            this.field9865 = 2048;
            this.field9854 = 2048;
            this.field9863 = 0;
        } else if (var2 == 5) {
            this.field9865 = 2048;
            this.field9863 = 0;
            this.field9870 = 4;
            this.field9854 = 8192;
        } else if (var2 == 12) {
            this.field9854 = 2048;
            this.field9865 = 2048;
            this.field9863 = 0;
            this.field9870 = 2;
        } else if (var2 == 13) {
            this.field9863 = 0;
            this.field9865 = 2048;
            this.field9870 = 2;
            this.field9854 = 8192;
        } else if (var2 == 10) {
            this.field9863 = 1536;
            this.field9870 = 3;
            this.field9854 = 2048;
            this.field9865 = 512;
        } else if (var2 == 11) {
            this.field9863 = 1536;
            this.field9854 = 4096;
            this.field9865 = 512;
            this.field9870 = 3;
        } else if (var2 == 6) {
            this.field9865 = 768;
            this.field9863 = 1280;
            this.field9854 = 2048;
            this.field9870 = 3;
        } else if (var2 == 7) {
            this.field9870 = 3;
            this.field9854 = 4096;
            this.field9863 = 1280;
            this.field9865 = 768;
        } else if (var2 == 8) {
            this.field9854 = 2048;
            this.field9870 = 3;
            this.field9863 = 1024;
            this.field9865 = 1024;
        } else if (var2 == 9) {
            this.field9865 = 1024;
            this.field9854 = 4096;
            this.field9863 = 1024;
            this.field9870 = 3;
        } else if (var2 == 14) {
            this.field9863 = 1280;
            this.field9865 = 768;
            this.field9870 = 1;
            this.field9854 = 2048;
        } else if (var2 == 15) {
            this.field9863 = 1536;
            this.field9854 = 4096;
            this.field9865 = 512;
            this.field9870 = 1;
        } else if (var2 == 16) {
            this.field9865 = 256;
            this.field9863 = 1792;
            this.field9870 = 1;
            this.field9854 = 8192;
        } else {
            this.field9865 = 2048;
            this.field9863 = 0;
            this.field9854 = 2048;
            this.field9870 = 0;
        }
        field9858++;
        if (arg0 != 1024) {
            this.field9853 = false;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIIII)V", line = 376)
    public final void method3940(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9865 = arg0;
        if (arg2 != 31983) {
            this.field9869 = -67;
        }
        this.field9854 = arg4;
        field9860++;
        this.field9863 = arg1;
        this.field9870 = arg3;
    }

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "(I)V", line = 390)
    public static final void method3941(int arg0) {
        class737.field10289.method387(-21125);
        int var1 = 15 / ((-arg0 - 53) / 35);
        field9861++;
        class297.field4474.method2477(true);
        class214.field3086.method2477(true);
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)I", line = 405)
    public static final int method3942(int arg0, int arg1) {
        field9866++;
        return arg1 == -1054069881 ? arg0 >>> 7 : 20;
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "()V", line = 421)
    protected class698() {
        if (class6.field65 == null) {
            class752.method4176(true);
        }
        this.method3939(1024);
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lha;Lrv;I)V", line = 432)
    public class698(class66 arg0, class120 arg1, int arg2) {
        if (class6.field65 == null) {
            class752.method4176(true);
        }
        this.field9869 = arg1.method842(2384);
        this.field9856 = (this.field9869 & 0x8) != 0;
        this.field9853 = (this.field9869 & 0x10) != 0;
        this.field9869 &= 0x7;
        int var4 = arg1.method898((byte) -101) << arg2;
        int var5 = arg1.method898((byte) -84) << arg2;
        int var6 = arg1.method898((byte) -86) << arg2;
        int var7 = arg1.method842(2384);
        int var8 = var7 * 2 + 1;
        this.field9867 = new short[var8];
        for (int var9 = 0; var9 < this.field9867.length; var9++) {
            short var13 = (short) arg1.method898((byte) -81);
            int var14 = var13 >>> 8;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var8 - var14 < var15) {
                var15 = var8 - var14;
            }
            this.field9867[var9] = (short) class281.method1904(var15, var14 << 8);
        }
        int var10 = (var7 << class310.field4616) + class503.field7200;
        int var11 = class444.field6323 == null ? class595.field8378[class162.method1275(16287, arg1.method898((byte) -110)) & 0xFFFF] : class444.field6323[arg1.method898((byte) -121)];
        int var12 = arg1.method842(2384);
        this.field9862 = var12 & 0x1F;
        this.field9871 = (var12 & 0xE0) << 3;
        if (this.field9862 != 31) {
            this.method3939(1024);
        }
        this.method3937(arg0, 20997, var4, var11, var10, var5, var6);
    }
}
