import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class273 {

    @OriginalMember(owner = "client!bha", name = "i", descriptor = "Laga;")
    private class671 field3944;

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "Llba;")
    private class223 field3936;

    @OriginalMember(owner = "client!bha", name = "c", descriptor = "I")
    public int field3938;

    @OriginalMember(owner = "client!bha", name = "b", descriptor = "I")
    private int field3937;

    @OriginalMember(owner = "client!bha", name = "q", descriptor = "[B")
    public byte[] field3952;

    @OriginalMember(owner = "client!bha", name = "o", descriptor = "I")
    private int field3950;

    @OriginalMember(owner = "client!bha", name = "n", descriptor = "I")
    private int field3949;

    @OriginalMember(owner = "client!bha", name = "f", descriptor = "I")
    private int field3941;

    @OriginalMember(owner = "client!bha", name = "d", descriptor = "Lfea;")
    public static class678 field3939 = new class678("WTQA", "office", "_qa", 2);

    @OriginalMember(owner = "client!bha", name = "s", descriptor = "Lul;")
    public static class486 field3954 = new class486("", 13);

    @OriginalMember(owner = "client!bha", name = "g", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!bha", name = "h", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!bha", name = "j", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!bha", name = "k", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!bha", name = "l", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!bha", name = "m", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!bha", name = "p", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!bha", name = "r", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!bha", name = "t", descriptor = "Lfe;")
    public static class344 field3955;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bha", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field3956;

    @OriginalMember(owner = "client!bha", name = "e", descriptor = "[[Ler;")
    private class234[][] field3940;

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(IILr;I)V")
    public final void method1773(int arg0, int arg1, class113 arg2, int arg3) {
        field3943++;
        class662 var5 = (class662) arg2;
        int var6 = var5.field9311 + arg0 + 1;
        int var7 = var5.field9310 + arg1 + 1;
        if (arg3 != 19252) {
            this.field3949 = 9;
        }
        int var8 = this.field3938 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field9314;
        int var11 = var5.field9309;
        int var12 = this.field3938 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var8 += this.field3938 * var14;
            var10 -= var14;
            var9 += var11 * var14;
        }
        if (this.field3937 <= var7 + var10) {
            int var15 = var7 - this.field3937 - (-var10 - 1);
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var9 += var16;
            var12 += var16;
            var11 -= var16;
            var13 += var16;
            var8 += var16;
            var6 = 1;
        }
        if ((var6 + var11) >= this.field3938) {
            int var17 = var11 + var6 + 1 - this.field3938;
            var13 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class128.method884(var13, var10, var8, var12, (byte) -4, var11, var9, var5.field9312, this.field3952);
            this.method1781(arg3 + 46283, var10, var6, var7, var11);
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(I)V")
    public static void method1774(int arg0) {
        if (arg0 == 128) {
            field3939 = null;
            field3955 = null;
            field3954 = null;
        }
    }

    @OriginalMember(owner = "client!bha", name = "b", descriptor = "(I)V")
    public final void method1775(int arg0) {
        this.field3940 = new class234[this.field3949][this.field3941];
        field3951++;
        for (int var2 = arg0; var2 < this.field3941; var2++) {
            for (int var3 = 0; var3 < this.field3949; var3++) {
                this.field3940[var3][var2] = new class234(this.field3936, this, this.field3944, var3, var2, this.field3950, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field3940[var3][var2].field3512 == 0) {
                    this.field3940[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bha", name = "c", descriptor = "(I)V")
    public static final void method1776(int arg0) {
        field3948++;
        try {
            if (arg0 != 10371) {
                field3954 = null;
            }
            Method var1 = (field3956 == null ? (field3956 = method1782("java.lang.Runtime")) : field3956).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class783.field10746 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(Lr;III)Z")
    public final boolean method1777(class113 arg0, int arg1, int arg2, int arg3) {
        field3945++;
        class662 var5 = (class662) arg0;
        int var6 = var5.field9310 + arg2 + 1;
        int var7 = var5.field9311 + arg3 + 1;
        int var8 = this.field3938 * var6 + var7;
        if (arg1 <= 74) {
            this.method1779(-71, -56, -22, null);
        }
        int var9 = var5.field9314;
        int var10 = var5.field9309;
        int var11 = this.field3938 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var9 -= var12;
            var6 = 1;
            var8 += this.field3938 * var12;
        }
        if ((var6 + var9) >= this.field3937) {
            int var13 = var6 - (-var9 - 1) - this.field3937;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += var14;
            var10 -= var14;
            var7 = 1;
            var11 += var14;
        }
        if ((var7 + var10) >= this.field3938) {
            int var15 = var7 + var10 + 1 - this.field3938;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field3938 + var11;
            return class593.method3462(var17, this.field3952, var10, 99, var8, var16, var9);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(Z)V")
    public static final void method1778(boolean arg0) {
        field3947++;
        if (arg0) {
            method1774(-92);
        }
        class432.field6002 = 0;
        class791.field10846 = 0;
        class530.field7304 = 0;
        class653.field9116 = 0;
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(IIILr;)V")
    public final void method1779(int arg0, int arg1, int arg2, class113 arg3) {
        field3953++;
        class662 var5 = (class662) arg3;
        int var6 = var5.field9310 + arg0 + 1;
        int var7 = var5.field9311 + arg2 + 1;
        int var8 = this.field3938 * var6 + var7;
        int var9 = arg1;
        int var10 = var5.field9314;
        int var11 = var5.field9309;
        int var12 = this.field3938 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var9 = var11 * var14 + arg1;
            var6 = 1;
            var10 -= var14;
            var8 += this.field3938 * var14;
        }
        if (this.field3937 <= var6 + var10) {
            int var15 = var10 + var6 + 1 - this.field3937;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var12 += var16;
            var13 += var16;
            var7 = 1;
            var9 += var16;
            var11 -= var16;
            var8 += var16;
        }
        if (this.field3938 <= (var7 + var11)) {
            int var17 = var7 + var11 + 1 - this.field3938;
            var11 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class91.method666(var11, var12, var5.field9312, var13, var8, (byte) -68, this.field3952, var9, var10);
            this.method1781(65535, var10, var7, var6, var11);
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(Z[[ZIIII)V")
    public final void method1780(boolean arg0, boolean[][] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3936.method1393(false, 0);
        if (arg5 <= 104) {
            this.field3937 = -52;
        }
        field3942++;
        this.field3936.method1479(false, 7);
        this.field3936.method1404((byte) -113, 1);
        this.field3936.method1509(4, 1);
        this.field3936.method1467(false, false, -2, (byte) 112);
        float var7 = 1.0F / (float) (this.field3936.field3353 * 128);
        if (arg0) {
            for (int var8 = 0; var8 < this.field3941; var8++) {
                int var9 = var8 << this.field3950;
                int var10 = var8 + 1 << this.field3950;
                label145: for (int var11 = 0; var11 < this.field3949; var11++) {
                    if (this.field3940[var11][var8] != null) {
                        int var12 = var11 << this.field3950;
                        int var13 = var11 + 1 << this.field3950;
                        for (int var14 = var12; var14 < var13; var14++) {
                            if (-arg2 <= var14 - arg3 && arg2 >= var14 - arg3) {
                                for (int var15 = var9; var15 < var10; var15++) {
                                    if ((var15 - arg4) >= (-arg2) && (var15 - arg4) <= arg2 && arg1[arg2 + var14 - arg3][var15 + arg2 - arg4]) {
                                        class517 var16 = this.field3936.method1470(116);
                                        var16.method3096(var7, var7, 1.0F, -9950);
                                        var16.method47(-var11, -var8, 0);
                                        this.field3936.method1475(75, class304.field4414);
                                        this.field3940[var11][var8].method1604(0);
                                        continue label145;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field3941; var17++) {
                int var18 = var17 << this.field3950;
                int var19 = var17 + 1 << this.field3950;
                for (int var20 = 0; var20 < this.field3949; var20++) {
                    class234 var21 = this.field3940[var20][var17];
                    if (var21 != null) {
                        class614 var22 = this.field3936.method1463(var21.field3512 * 3, 87);
                        Buffer var23 = var22.method1126(true, (byte) 112);
                        if (var23 != null) {
                            Stream var24 = this.field3936.method1449(14, var23);
                            int var25 = 0;
                            int var26 = var20 << this.field3950;
                            int var27 = var20 + 1 << this.field3950;
                            for (int var28 = var18; var28 < var19; var28++) {
                                if ((-arg2) <= (var28 - arg4) && var28 - arg4 <= arg2) {
                                    int var30 = this.field3944.field5827 * var28 + var26;
                                    for (int var31 = var26; var31 < var27; var31++) {
                                        if ((-arg2) <= (var31 - arg3) && arg2 >= var31 - arg3 && arg1[var31 + arg2 - arg3][arg2 + var28 - arg4]) {
                                            short[] var32 = this.field3944.field9401[var30];
                                            if (var32 != null) {
                                                if (Stream.method2346()) {
                                                    for (int var33 = 0; var33 < var32.length; var33++) {
                                                        var25++;
                                                        var24.method2339(var32[var33] & 0xFFFF);
                                                    }
                                                } else {
                                                    for (int var34 = 0; var34 < var32.length; var34++) {
                                                        var24.method2343(var32[var34] & 0xFFFF);
                                                        var25++;
                                                    }
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            var24.method2351();
                            if (var22.method1121(3104) && var25 > 0) {
                                class517 var29 = this.field3936.method1470(118);
                                var29.method3096(var7, var7, 1.0F, -9950);
                                var29.method47(-var20, -var17, 0);
                                this.field3936.method1475(67, class304.field4414);
                                var21.method1599(var25 / 3, var22, 0);
                            }
                        }
                    }
                }
            }
        }
        this.field3936.method1377(true);
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(IIIII)V")
    private final void method1781(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3946++;
        if (this.field3940 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg2 + arg4 - 1 - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg3 - (1 - arg1) - 1 >> 7;
        if (arg0 != 65535) {
            method1774(29);
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class234[] var11 = this.field3940[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field3526 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(Llba;Laga;)V")
    public class273(class223 arg0, class671 arg1) {
        this.field3944 = arg1;
        this.field3936 = arg0;
        this.field3938 = (this.field3944.field5827 * this.field3944.field5818 >> this.field3936.field3284) + 2;
        this.field3937 = (this.field3944.field5826 * this.field3944.field5818 >> this.field3936.field3284) + 2;
        this.field3952 = new byte[this.field3938 * this.field3937];
        this.field3950 = this.field3936.field3284 + 7 - this.field3944.field5825;
        this.field3949 = this.field3944.field5827 >> this.field3950;
        this.field3941 = this.field3944.field5826 >> this.field3950;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1782(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
