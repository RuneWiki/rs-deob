import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class70 {

    @OriginalMember(owner = "client!pv", name = "m", descriptor = "Lnga;")
    private class510 field1258 = new class510(64);

    @OriginalMember(owner = "client!pv", name = "w", descriptor = "Lnga;")
    public class510 field1268 = new class510(50);

    @OriginalMember(owner = "client!pv", name = "x", descriptor = "Lfq;")
    public class199 field1269 = new class199(250);

    @OriginalMember(owner = "client!pv", name = "y", descriptor = "Ljf;")
    private class213 field1270 = new class213();

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "Leq;")
    public class209 field1250;

    @OriginalMember(owner = "client!pv", name = "C", descriptor = "Llm;")
    private class497 field1274;

    @OriginalMember(owner = "client!pv", name = "r", descriptor = "Z")
    private boolean field1263;

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
    public int field1256;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "Leq;")
    private class209 field1255;

    @OriginalMember(owner = "client!pv", name = "o", descriptor = "I")
    public int field1260;

    @OriginalMember(owner = "client!pv", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field1272;

    @OriginalMember(owner = "client!pv", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field1273;

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    public static int field1248 = 16777215;

    @OriginalMember(owner = "client!pv", name = "n", descriptor = "Ljw;")
    public static class551 field1259 = new class551(7, 2);

    @OriginalMember(owner = "client!pv", name = "v", descriptor = "Z")
    public static boolean field1267 = true;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!pv", name = "p", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!pv", name = "q", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!pv", name = "s", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!pv", name = "t", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!pv", name = "u", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!pv", name = "z", descriptor = "I")
    public int field1271;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V", line = 6)
    public final void method717(int arg0) {
        field1252++;
        class199 var2 = this.field1269;
        synchronized (this.field1269) {
            if (arg0 > -6) {
                this.method725(true, -116);
            }
            this.field1269.method1403(-11635);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Laf;BLha;I)V", line = 19)
    public static final void method718(class433 arg0, byte arg1, class58 arg2, int arg3) {
        field1257++;
        if (class221.field3159 != null && arg3 <= arg0.field6049) {
            for (int var4 = 0; var4 < class221.field3159.length; var4++) {
                if (class221.field3159[var4] != -1000000 && (class221.field3159[var4] >= arg0.field6053[0] || class221.field3159[var4] >= arg0.field6053[1] || arg0.field6053[2] <= class221.field3159[var4] || class221.field3159[var4] >= arg0.field6053[3]) && (class82.field1520[var4] >= arg0.field6047[0] || arg0.field6047[1] <= class82.field1520[var4] || arg0.field6047[2] <= class82.field1520[var4] || arg0.field6047[3] <= class82.field1520[var4]) && (class162.field2406[var4] <= arg0.field6047[0] || arg0.field6047[1] >= class162.field2406[var4] || class162.field2406[var4] <= arg0.field6047[2] || arg0.field6047[3] >= class162.field2406[var4]) && (class489.field6979[var4] >= arg0.field6045[0] || arg0.field6045[1] <= class489.field6979[var4] || class489.field6979[var4] >= arg0.field6045[2] || arg0.field6045[3] <= class489.field6979[var4]) && (class584.field8242[var4] <= arg0.field6045[0] || arg0.field6045[1] >= class584.field8242[var4] || arg0.field6045[2] >= class584.field8242[var4] || class584.field8242[var4] <= arg0.field6045[3])) {
                    return;
                }
            }
        }
        if (arg0.field6044 == 1) {
            int var5 = arg0.field6046 + class235.field3337 - class155.field2331;
            if (var5 >= 0 && (class235.field3337 + class235.field3337) >= var5) {
                int var6 = arg0.field6050 + class235.field3337 - class214.field3065;
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > (class235.field3337 + class235.field3337)) {
                    return;
                }
                int var7 = class235.field3337 + arg0.field6055 - class214.field3065;
                if (var7 > (class235.field3337 + class235.field3337)) {
                    var7 = class235.field3337 + class235.field3337;
                } else if (var7 < 0) {
                    return;
                }
                boolean var8 = false;
                while (var7 >= var6) {
                    if (class533.field7539[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (class308.field4358 - arg0.field6047[0]);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!((float) class154.field2310 > var9) && class467.method2838(arg0, 0, 0) && class467.method2838(arg0, 0, 1) && class467.method2838(arg0, 0, 2) && class467.method2838(arg0, 0, 3)) {
                        class217.field3094[class588.field8275++] = arg0;
                    }
                }
            }
        } else if (arg0.field6044 == 2) {
            int var10 = class235.field3337 + arg0.field6050 - class214.field3065;
            if (var10 >= 0 && var10 <= class235.field3337 + class235.field3337) {
                int var11 = class235.field3337 + arg0.field6046 - class155.field2331;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > (class235.field3337 + class235.field3337)) {
                    return;
                }
                int var12 = arg0.field6048 + class235.field3337 - class155.field2331;
                if (class235.field3337 + class235.field3337 < var12) {
                    var12 = class235.field3337 + class235.field3337;
                } else if (var12 < 0) {
                    return;
                }
                boolean var13 = false;
                while (var11 <= var12) {
                    if (class533.field7539[var11++][var10]) {
                        var13 = true;
                        break;
                    }
                }
                if (var13) {
                    float var14 = (float) (class200.field2875 - arg0.field6045[0]);
                    if (var14 < 0.0F) {
                        var14 *= -1.0F;
                    }
                    if (!((float) class154.field2310 > var14) && class467.method2838(arg0, 0, 0) && class467.method2838(arg0, 0, 1) && class467.method2838(arg0, 0, 2) && class467.method2838(arg0, 0, 3)) {
                        class217.field3094[class588.field8275++] = arg0;
                    }
                }
            }
        } else if (arg1 == 105) {
            if (arg0.field6044 == 16 || arg0.field6044 == 8) {
                int var23 = class235.field3337 + arg0.field6046 - class155.field2331;
                if (var23 >= 0 && var23 <= (class235.field3337 + class235.field3337)) {
                    int var24 = class235.field3337 + arg0.field6050 - class214.field3065;
                    if (var24 >= 0 && class235.field3337 + class235.field3337 >= var24 && class533.field7539[var23][var24]) {
                        float var25 = (float) (class308.field4358 - arg0.field6047[0]);
                        if (var25 < 0.0F) {
                            var25 *= -1.0F;
                        }
                        float var26 = (float) (class200.field2875 - arg0.field6045[0]);
                        if (var26 < 0.0F) {
                            var26 *= -1.0F;
                        }
                        if (!(var25 < (float) class154.field2310) || !(var26 < (float) class154.field2310) && class467.method2838(arg0, 0, 0) && class467.method2838(arg0, arg1 ^ 0x69, 1) && class467.method2838(arg0, 0, 2) && class467.method2838(arg0, 0, 3)) {
                            class217.field3094[class588.field8275++] = arg0;
                        }
                    }
                }
            } else if (arg0.field6044 == 4) {
                float var15 = (float) (arg0.field6053[0] - class656.field9229);
                if (!(var15 <= (float) class131.field1952)) {
                    int var16 = class235.field3337 + arg0.field6050 - class214.field3065;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (class235.field3337 + class235.field3337 < var16) {
                        return;
                    }
                    int var17 = class235.field3337 + arg0.field6055 - class214.field3065;
                    if ((class235.field3337 + class235.field3337) < var17) {
                        var17 = class235.field3337 + class235.field3337;
                    } else if (var17 < 0) {
                        return;
                    }
                    int var18 = arg0.field6046 - (class155.field2331 - class235.field3337);
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > (class235.field3337 + class235.field3337)) {
                        return;
                    }
                    int var19 = class235.field3337 + arg0.field6048 - class155.field2331;
                    if (var19 > (class235.field3337 + class235.field3337)) {
                        var19 = class235.field3337 + class235.field3337;
                    } else if (var19 < 0) {
                        return;
                    }
                    boolean var20 = false;
                    label293: for (int var21 = var18; var21 <= var19; var21++) {
                        for (int var22 = var16; var22 <= var17; var22++) {
                            if (class533.field7539[var21][var22]) {
                                var20 = true;
                                break label293;
                            }
                        }
                    }
                    if (var20 && class467.method2838(arg0, 0, 0) && class467.method2838(arg0, 0, 1) && class467.method2838(arg0, 0, 2) && class467.method2838(arg0, 0, 3)) {
                        class217.field3094[class588.field8275++] = arg0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z)V", line = 347)
    public static void method719(boolean arg0) {
        if (!arg0) {
            field1259 = null;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V", line = 358)
    public final void method720(byte arg0) {
        class510 var2 = this.field1258;
        synchronized (this.field1258) {
            this.field1258.method3048(false);
            int var3 = -41 / ((arg0 + 18) / 45);
        }
        field1251++;
        class510 var4 = this.field1268;
        synchronized (this.field1268) {
            this.field1268.method3048(false);
        }
        class199 var5 = this.field1269;
        synchronized (this.field1269) {
            this.field1269.method1403(-11635);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(II)Lok;", line = 376)
    public final class253 method721(int arg0, int arg1) {
        field1265++;
        class510 var3 = this.field1258;
        class253 var4;
        synchronized (this.field1258) {
            var4 = (class253) this.field1258.method3054((byte) -114, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class209 var5 = this.field1255;
        byte[] var6;
        synchronized (this.field1255) {
            var6 = this.field1255.method1453(class705.method3956((byte) 124, arg1), 86, class164.method1223((byte) 105, arg1));
            int var7 = 92 % ((22 - arg0) / 36);
        }
        class253 var8 = new class253();
        var8.field3654 = this;
        var8.field3668 = arg1;
        var8.field3648 = new String[] { null, null, class281.field3948.method1839((byte) 45, this.field1256), null, null };
        var8.field3671 = new String[] { null, null, null, null, class281.field3949.method1839((byte) 45, this.field1256) };
        if (var6 != null) {
            var8.method1723(new class35(var6), 12);
        }
        var8.method1728(-110);
        if (var8.field3619 != -1) {
            var8.method1719(this.method721(-67, var8.field3619), 24953, this.method721(124, var8.field3620));
        }
        if (var8.field3640 != -1) {
            var8.method1721(this.method721(-73, var8.field3640), -5, this.method721(58, var8.field3631));
        }
        if (!this.field1263 && var8.field3626) {
            var8.field3644 = class281.field3946.method1839((byte) 45, this.field1256);
            var8.field3671 = this.field1273;
            var8.field3648 = this.field1272;
            var8.field3681 = 0;
            var8.field3669 = false;
            var8.field3672 = null;
            if (var8.field3664 != null) {
                boolean var9 = false;
                for (class626 var10 = var8.field3664.method4209(false); var10 != null; var10 = var8.field3664.method4207(9356)) {
                    class513 var11 = this.field1274.method2993((int) var10.field8991, (byte) 80);
                    if (var11.field7321) {
                        var10.method3617(1);
                    } else {
                        var9 = true;
                    }
                }
                if (!var9) {
                    var8.field3664 = null;
                }
            }
        }
        class510 var12 = this.field1258;
        synchronized (this.field1258) {
            this.field1258.method3047(false, var8, (long) arg1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lda;IIZLin;ZIILha;BLha;I)Lkr;", line = 453)
    public final class743 method722(class59 arg0, int arg1, int arg2, boolean arg3, class90 arg4, boolean arg5, int arg6, int arg7, class58 arg8, byte arg9, class58 arg10, int arg11) {
        if (arg9 >= -9) {
            return null;
        }
        field1247++;
        class743 var13 = this.method726(arg6, arg11, arg1, arg8, arg2, arg7, (byte) -85, arg4);
        if (var13 != null) {
            return var13;
        }
        class253 var14 = this.method721(113, arg6);
        if (arg1 > 1 && var14.field3627 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg1 >= var14.field3646[var16] && var14.field3646[var16] != 0) {
                    var15 = var14.field3627[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method721(124, var15);
            }
        }
        int[] var17 = var14.method1722(arg5, arg0, arg8, arg4, -124, arg11, arg2, arg1, arg10, arg7);
        if (var17 == null) {
            return null;
        }
        class743 var18;
        if (arg3) {
            var18 = arg10.method561(36, var17, 0, 36, 65, 32);
        } else {
            var18 = arg8.method561(36, var17, 0, 36, 100, 32);
        }
        if (!arg3) {
            class213 var19 = new class213();
            var19.field3060 = arg11;
            var19.field3051 = arg2;
            var19.field3056 = arg8.field1071;
            var19.field3055 = arg4 != null;
            var19.field3057 = arg1;
            var19.field3052 = arg7;
            var19.field3059 = arg6;
            this.field1269.method1393(true, var19, var18);
        }
        return var18;
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)V", line = 520)
    public final void method723(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field1253++;
        class510 var2 = this.field1268;
        synchronized (this.field1268) {
            this.field1268.method3048(false);
        }
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(II)V", line = 534)
    public final void method724(int arg0, int arg1) {
        field1249++;
        class510 var3 = this.field1258;
        synchronized (this.field1258) {
            if (arg0 != 0) {
                return;
            }
            this.field1258.method3049(arg1, (byte) 127);
        }
        class510 var4 = this.field1268;
        synchronized (this.field1268) {
            this.field1268.method3049(arg1, (byte) 126);
        }
        class199 var5 = this.field1269;
        synchronized (this.field1269) {
            this.field1269.method1406((byte) 127, arg1);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZI)V", line = 563)
    public final void method725(boolean arg0, int arg1) {
        field1254++;
        if (this.field1263 == arg0) {
            return;
        }
        if (arg1 != 36) {
            this.method726(78, 17, 29, null, -118, 109, (byte) 118, null);
        }
        this.field1263 = arg0;
        this.method720((byte) -83);
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIILha;IIBLin;)Lkr;", line = 581)
    public final class743 method726(int arg0, int arg1, int arg2, class58 arg3, int arg4, int arg5, byte arg6, class90 arg7) {
        field1266++;
        this.field1270.field3057 = arg2;
        this.field1270.field3052 = arg5;
        if (arg6 != -85) {
            this.method723(46);
        }
        this.field1270.field3059 = arg0;
        this.field1270.field3055 = arg7 != null;
        this.field1270.field3056 = arg3.field1071;
        this.field1270.field3051 = arg4;
        this.field1270.field3060 = arg1;
        return (class743) this.field1269.method1401(0, this.field1270);
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lcw;IZLlm;Leq;Leq;)V", line = 672)
    public class70(class179 arg0, int arg1, boolean arg2, class497 arg3, class209 arg4, class209 arg5) {
        this.field1250 = arg5;
        this.field1274 = arg3;
        this.field1263 = arg2;
        this.field1256 = arg1;
        this.field1255 = arg4;
        if (this.field1255 == null) {
            this.field1260 = 0;
        } else {
            int var7 = this.field1255.method1454(-1) - 1;
            this.field1260 = this.field1255.method1477(0, var7) + var7 * 256;
        }
        this.field1272 = new String[] { null, null, class281.field3948.method1839((byte) 45, this.field1256), null, null };
        this.field1273 = new String[] { null, null, null, null, class281.field3949.method1839((byte) 45, this.field1256) };
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I[FI)[F", line = 603)
    public static final float[] method727(int arg0, float[] arg1, int arg2) {
        field1262++;
        float[] var3 = new float[arg0];
        class622.method3595(arg1, arg2, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(I)V", line = 614)
    public final void method728(int arg0) {
        field1261++;
        class510 var2 = this.field1258;
        synchronized (this.field1258) {
            this.field1258.method3050(false);
        }
        class510 var3 = this.field1268;
        synchronized (this.field1268) {
            if (arg0 != 1) {
                this.field1272 = null;
            }
            this.field1268.method3050(false);
        }
        class199 var4 = this.field1269;
        synchronized (this.field1269) {
            this.field1269.method1398(arg0 ^ 0x706ABA08);
        }
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(II)V", line = 633)
    public final void method729(int arg0, int arg1) {
        field1246++;
        this.field1271 = arg1;
        if (arg0 == 8202) {
            class510 var3 = this.field1268;
            synchronized (this.field1268) {
                this.field1268.method3048(false);
            }
        }
    }
}
