import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class320 {

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "[I")
    private int[] field4393 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Lde;")
    public static class10 field4401 = new class10(1, 2, 2, 0);

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field4404;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "[Lef;")
    public static class441[] field4411;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "Lcw;")
    public class390 field4408;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "[I")
    private int[] field4398;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "[S")
    private short[] field4394;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "[S")
    private short[] field4402;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "[S")
    private short[] field4406;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "[S")
    private short[] field4409;

    static {
        new class157("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field4404 = new String[100];
        field4411 = new class441[50];
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Lqq;", line = 3)
    public final class496 method1895(byte arg0) {
        field4392++;
        class496[] var2 = new class496[5];
        int var3 = 0;
        class421 var4 = this.field4408.field5624;
        synchronized (this.field4408.field5624) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field4393[var5] != -1) {
                    var2[var3++] = class44.method299(this.field4408.field5624, this.field4393[var5], arg0 - 6441, 0);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field7253 < 13) {
                var2[var6].method2938(false, 0);
            }
        }
        if (arg0 != -61) {
            method1903(71, 52, 92, 82, -2, 23, null, null, -111);
        }
        class496 var7 = new class496(var2, var3);
        if (this.field4409 != null) {
            for (int var8 = 0; var8 < this.field4409.length; var8++) {
                var7.method2941(this.field4406[var8], this.field4409[var8], false);
            }
        }
        if (this.field4402 != null) {
            for (int var9 = 0; var9 < this.field4402.length; var9++) {
                var7.method2946(this.field4394[var9], arg0 ^ 0xFFFFFFAE, this.field4402[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 77)
    public static final void method1896(int arg0) {
        field4410++;
        class439[] var1 = class349.field5069;
        synchronized (class349.field5069) {
            for (int var2 = arg0; var2 < class349.field5069.length; var2++) {
                class349.field5069[var2] = new class439();
                class103.field1640[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Z", line = 106)
    public final boolean method1897(int arg0) {
        field4395++;
        if (this.field4398 == null) {
            return true;
        }
        boolean var2 = true;
        class421 var3 = this.field4408.field5624;
        synchronized (this.field4408.field5624) {
            for (int var4 = 0; var4 < this.field4398.length; var4++) {
                if (!this.field4408.field5624.method2498(-125, this.field4398[var4], 0)) {
                    var2 = false;
                }
            }
            if (arg0 != -127) {
                this.method1898((byte) 98, null);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLsv;)V", line = 134)
    public final void method1898(byte arg0, class319 arg1) {
        if (arg0 != 22) {
            return;
        }
        field4403++;
        while (true) {
            int var3 = arg1.method1869(-66);
            if (var3 == 0) {
                return;
            }
            this.method1899(var3, (byte) -67, arg1);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBLsv;)V", line = 156)
    private final void method1899(int arg0, byte arg1, class319 arg2) {
        field4399++;
        if (arg1 != -67) {
            return;
        }
        if (arg0 == 1) {
            arg2.method1869(arg1 ^ 0x1D);
        } else if (arg0 == 2) {
            int var8 = arg2.method1869(arg1 - 6);
            this.field4398 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4398[var9] = arg2.method1844(class373.method2233(arg1, 61));
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var6 = arg2.method1869(-83);
                this.field4406 = new short[var6];
                this.field4409 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field4409[var7] = (short) arg2.method1844(-111);
                    this.field4406[var7] = (short) arg2.method1844(-120);
                }
            } else if (arg0 == 41) {
                int var4 = arg2.method1869(-90);
                this.field4402 = new short[var4];
                this.field4394 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field4402[var5] = (short) arg2.method1844(class373.method2233(arg1, 56));
                    this.field4394[var5] = (short) arg2.method1844(-119);
                }
                return;
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field4393[arg0 - 60] = arg2.method1844(-103);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)Lqq;", line = 248)
    public final class496 method1900(boolean arg0) {
        if (!arg0) {
            this.method1904((byte) 118);
        }
        field4396++;
        if (this.field4398 == null) {
            return null;
        }
        class496[] var2 = new class496[this.field4398.length];
        class421 var3 = this.field4408.field5624;
        synchronized (this.field4408.field5624) {
            int var4 = 0;
            while (true) {
                if (this.field4398.length <= var4) {
                    break;
                }
                var2[var4] = class44.method299(this.field4408.field5624, this.field4398[var4], -6502, 0);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field4398.length; var5++) {
            if (var2[var5].field7253 < 13) {
                var2[var5].method2938(false, 0);
            }
        }
        class496 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class496(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field4409 != null) {
            for (int var7 = 0; var7 < this.field4409.length; var7++) {
                var6.method2941(this.field4406[var7], this.field4409[var7], false);
            }
        }
        if (this.field4402 != null) {
            for (int var8 = 0; var8 < this.field4402.length; var8++) {
                var6.method2946(this.field4394[var8], 94, this.field4402[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V", line = 321)
    public static void method1901(int arg0) {
        field4401 = null;
        if (arg0 != 30906) {
            method1896(5);
        }
        field4404 = null;
        field4411 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BII)I", line = 343)
    public static final int method1902(byte arg0, int arg1, int arg2) {
        if (arg0 != -115) {
            field4400 = -81;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        field4405++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIII[B[BI)V", line = 364)
    public static final void method1903(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, byte[] arg7, int arg8) {
        field4407++;
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & 0x3);
        if (arg5 != -61) {
            field4404 = null;
        }
        for (int var11 = -arg8; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg2++;
                arg7[var10001] = (byte) (arg7[var10001] - arg6[arg3++]);
                int var14 = arg2++;
                arg7[var14] = (byte) (arg7[var14] - arg6[arg3++]);
                int var15 = arg2++;
                arg7[var15] = (byte) (arg7[var15] - arg6[arg3++]);
                int var16 = arg2++;
                arg7[var16] = (byte) (arg7[var16] - arg6[arg3++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg2++;
                arg7[var10001] = (byte) (arg7[var10001] - arg6[arg3++]);
            }
            arg2 += arg0;
            arg3 += arg1;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)Z", line = 409)
    public final boolean method1904(byte arg0) {
        field4397++;
        int var2 = 21 / ((arg0 - 69) / 52);
        boolean var3 = true;
        class421 var4 = this.field4408.field5624;
        synchronized (this.field4408.field5624) {
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field4393[var5] != -1 && !this.field4408.field5624.method2498(-103, this.field4393[var5], 0)) {
                    var3 = false;
                }
            }
            return var3;
        }
    }
}
