import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class121 {

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "Lge;")
    private class511 field1891 = new class511(16);

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "Lci;")
    private class320 field1903;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "Z")
    public static boolean field1890 = true;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "[F")
    public static float[] field1900 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "S")
    public static short field1901 = 1;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "Ljk;")
    public static class456 field1898;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "[[[I")
    public static int[][][] field1894;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method890(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1897++;
        if (!class175.method1224(arg2, 7607)) {
            return;
        }
        if (class472.field6869[arg2] == null) {
            client.method1369(class283.field4217[arg2], -1, arg1, arg7, arg9, arg8, arg0, arg3, arg4, arg6);
        } else {
            client.method1369(class472.field6869[arg2], -1, arg1, arg7, arg9, arg8, arg0, arg3, arg4, arg6);
        }
        if (arg5 != 1) {
            method899(52, -85, -41, -40, false, null, true, 106, -45, -61, null, -105, -10, null, 32);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
    public final void method891(byte arg0) {
        int var2 = 15 % ((arg0 + 38) / 32);
        field1896++;
        class511 var3 = this.field1891;
        synchronized (this.field1891) {
            this.field1891.method2990((byte) -89);
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)V")
    public static void method892(byte arg0) {
        field1898 = null;
        field1894 = null;
        if (arg0 >= 102) {
            field1900 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(B)V")
    public final void method893(byte arg0) {
        field1902++;
        class511 var2 = this.field1891;
        synchronized (this.field1891) {
            this.field1891.method2980(arg0 ^ 0xF51A66A4);
        }
        if (arg0 != 76) {
            this.field1903 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(FIFBLgl;FIIFIF)[B")
    public static final byte[] method894(float arg0, int arg1, float arg2, byte arg3, class434 arg4, float arg5, int arg6, int arg7, float arg8, int arg9, float arg10) {
        if (arg3 == -86) {
            field1899++;
            byte[] var11 = new byte[arg1 * arg7 * arg9];
            class33.method188(var11, 0, arg10, arg0, arg6, arg2, arg1, arg5, arg4, arg7, 0, arg9, arg8);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)V")
    public static final void method895(int arg0, int arg1) {
        field1892++;
        class275 var2 = class213.method1433((byte) 96, 4, arg0);
        var2.method1774((byte) 82);
        if (arg1 != -1) {
            field1890 = true;
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(II)V")
    public final void method896(int arg0, int arg1) {
        if (arg0 >= -9) {
            this.field1903 = null;
        }
        field1889++;
        class511 var3 = this.field1891;
        synchronized (this.field1891) {
            this.field1891.method2989(false, arg1);
        }
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(II)Lmo;")
    public final class538 method897(int arg0, int arg1) {
        field1895++;
        class511 var3 = this.field1891;
        class538 var4;
        synchronized (this.field1891) {
            var4 = (class538) this.field1891.method2982(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 != 10186) {
            method895(34, 127);
        }
        class320 var5 = this.field1903;
        byte[] var6;
        synchronized (this.field1903) {
            var6 = this.field1903.method2037(arg0, (byte) 52, 30);
        }
        class538 var7 = new class538();
        if (var6 != null) {
            var7.method3170(new class519(var6), false);
        }
        class511 var8 = this.field1891;
        synchronized (this.field1891) {
            this.field1891.method2981(var7, arg1 - 10125, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIILbl;Lbl;)V")
    public static final void method898(int arg0, int arg1, int arg2, class468 arg3, class468 arg4) {
        class188 var5 = class53.method468(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field2764 = arg3;
            var5.field2751 = arg4;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIZ[IZIII[IIILue;I)I")
    public static final int method899(int arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, boolean arg6, int arg7, int arg8, int arg9, int[] arg10, int arg11, int arg12, class159 arg13, int arg14) {
        field1893++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class251.field3739[var15][var35] = 0;
                class287.field4247[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg2 == 1) {
            var16 = class196.method1329(arg13, arg0, arg1, arg11, arg8, arg12, arg14, arg7, 2, arg9, arg3);
        } else if (arg2 == 2) {
            var16 = class300.method1926(arg3, arg9, arg7, arg0, arg14, arg13, arg8, 125, arg1, arg11, arg12);
        } else {
            var16 = class134.method979(arg11, -92, arg3, arg1, arg7, arg9, arg13, arg12, arg0, arg2, arg8, arg14);
        }
        int var17 = arg11 - 64;
        int var18 = arg7 - 64;
        int var19 = class90.field1445;
        int var20 = class347.field5113;
        if (!var16) {
            if (!arg6) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg9 - var23; var24 <= (arg9 + var23); var24++) {
                for (int var25 = arg14 - var23; var25 <= arg14 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class287.field4247[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg9) {
                            var28 = arg9 - var24;
                        } else if (var24 > arg9 + arg12 - 1) {
                            var28 = var24 + 1 - arg9 - arg12;
                        }
                        int var29 = 0;
                        if (arg14 > var25) {
                            var29 = arg14 - var25;
                        } else if (var25 > (arg0 + arg14 - 1)) {
                            var29 = var25 + 1 - arg14 - arg0;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || var21 == var30 && class287.field4247[var26][var27] < var22) {
                            var20 = var25;
                            var22 = class287.field4247[var26][var27];
                            var19 = var24;
                            var21 = var30;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg11 == var19 && arg7 == var20) {
            return 0;
        }
        byte var31 = 0;
        class62.field1087[var31] = var19;
        int var37 = var31 + 1;
        class476.field6935[var31] = var20;
        int var32;
        int var33 = var32 = class251.field3739[var19 - var17][var20 - var18];
        while (arg11 != var19 || arg7 != var20) {
            if (var32 != var33) {
                class62.field1087[var37] = var19;
                var32 = var33;
                class476.field6935[var37++] = var20;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            var33 = class251.field3739[var19 - var17][var20 - var18];
        }
        if (!arg4) {
            method894(-1.0861166F, -22, -0.033060014F, (byte) -97, null, -0.39616078F, -36, -21, -1.9550058F, 57, -1.2784206F);
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg5[var34] = class62.field1087[var37];
            arg10[var34++] = class476.field6935[var37];
            if (var34 >= arg5.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lsn;ILci;)V")
    public class121(class453 arg0, int arg1, class320 arg2) {
        this.field1903 = arg2;
        this.field1903.method2030(-10914, 30);
    }
}
