import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class499 extends class123 {

    @OriginalMember(owner = "client!oga", name = "f", descriptor = "I")
    private int field7206 = 0;

    @OriginalMember(owner = "client!oga", name = "F", descriptor = "Lqha;")
    private class112 field7219 = new class112(16);

    @OriginalMember(owner = "client!oga", name = "z", descriptor = "I")
    private int field7234 = 0;

    @OriginalMember(owner = "client!oga", name = "s", descriptor = "Lef;")
    private class513 field7232 = new class513();

    @OriginalMember(owner = "client!oga", name = "m", descriptor = "J")
    private long field7237 = 0L;

    @OriginalMember(owner = "client!oga", name = "o", descriptor = "Llp;")
    private class411 field7212;

    @OriginalMember(owner = "client!oga", name = "y", descriptor = "I")
    private int field7215;

    @OriginalMember(owner = "client!oga", name = "E", descriptor = "Z")
    private boolean field7233;

    @OriginalMember(owner = "client!oga", name = "k", descriptor = "Lef;")
    private class513 field7235;

    @OriginalMember(owner = "client!oga", name = "I", descriptor = "Llp;")
    private class411 field7220;

    @OriginalMember(owner = "client!oga", name = "G", descriptor = "Lwd;")
    private class287 field7209;

    @OriginalMember(owner = "client!oga", name = "A", descriptor = "Lcg;")
    private class149 field7210;

    @OriginalMember(owner = "client!oga", name = "C", descriptor = "[B")
    private byte[] field7218;

    @OriginalMember(owner = "client!oga", name = "w", descriptor = "Z")
    private boolean field7238;

    @OriginalMember(owner = "client!oga", name = "p", descriptor = "I")
    private int field7230;

    @OriginalMember(owner = "client!oga", name = "j", descriptor = "I")
    private int field7222;

    @OriginalMember(owner = "client!oga", name = "i", descriptor = "Lgh;")
    private class574 field7228;

    @OriginalMember(owner = "client!oga", name = "L", descriptor = "[Ljava/lang/String;")
    private static final String[] field7239 = new String[] { method3777(method3776("\u0011\u001b\u0018\u001bDV")), method3777(method3776("\u0011\u001b\u0018\u001bFV")), method3777(method3776("\u0011\u001b\u0018\u001bGV")), method3777(method3776("\u0011\u001b\u0018\u001bIV")), method3777(method3776("\u0011\u001b\u0018\u001bEV")), method3777(method3776("\u0011\u001b\u0018\u001bKV")), method3777(method3776("\u0011\u001b\u0018\u001bBV")), method3777(method3776("\u0011\u001b\u0018\u001bNV")), method3777(method3776("\u0011\u001b\u0018\u001bJV")), method3777(method3776("\u0011\u001b\u0018\u001b0\u0017\u0012\u0010A2V")), method3777(method3776("\u0010\t\u0015Y")), method3777(method3776("\u0005RW\u001bq")), method3777(method3776("\u0011\u001b\u0018\u001bAV")), method3777(method3776("\u0011\u001b\u0018\u001b@V")), method3777(method3776("\u0011\u001b\u0018\u001bMV")), method3777(method3776("\u0011\u001b\u0018\u001bCV")) };

    @OriginalMember(owner = "client!oga", name = "h", descriptor = "Lwia;")
    public static class790 field7231 = new class790(38, 8);

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!oga", name = "q", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!oga", name = "r", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!oga", name = "x", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!oga", name = "u", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!oga", name = "l", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!oga", name = "t", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!oga", name = "B", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!oga", name = "K", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!oga", name = "D", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!oga", name = "g", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!oga", name = "v", descriptor = "I")
    public static int field7226;

    @OriginalMember(owner = "client!oga", name = "H", descriptor = "Lgj;")
    private class660 field7227;

    @OriginalMember(owner = "client!oga", name = "J", descriptor = "Z")
    private boolean field7236;

    @OriginalMember(owner = "client!oga", name = "n", descriptor = "[B")
    private byte[] field7229;

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "(B)I")
    public final int method3767(byte arg0) {
        try {
            if (arg0 < 103) {
                return 122;
            } else {
                field7207++;
                return this.field7206;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7239[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)Lgj;")
    public final class660 method1071(int arg0) {
        try {
            if (arg0 > -124) {
                field7231 = null;
            }
            field7224++;
            if (this.field7227 != null) {
                return this.field7227;
            }
            if (this.field7228 == null) {
                if (this.field7210.method1247(-120)) {
                    return null;
                }
                this.field7228 = this.field7210.method1259(true, 255, 8133, this.field7215, (byte) 0);
            }
            if (this.field7228.field8473) {
                return null;
            }
            byte[] var2 = this.field7228.method4281((byte) -68);
            if (this.field7228 instanceof class683) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field7227 = new class660(var2, this.field7230, this.field7218);
                    if (this.field7227.field9536 != this.field7222) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var4) {
                    this.field7227 = null;
                    if (this.field7210.method1247(-7)) {
                        this.field7228 = null;
                    } else {
                        this.field7228 = this.field7210.method1259(true, 255, 8133, this.field7215, (byte) 0);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field7227 = new class660(var2, this.field7230, this.field7218);
                } catch (RuntimeException var5) {
                    this.field7210.method1258((byte) 44);
                    this.field7227 = null;
                    if (this.field7210.method1247(-98)) {
                        this.field7228 = null;
                    } else {
                        this.field7228 = this.field7210.method1259(true, 255, 8133, this.field7215, (byte) 0);
                    }
                    return null;
                }
                if (this.field7220 != null) {
                    this.field7209.method2333(this.field7220, this.field7215, (byte) -113, var2);
                }
            }
            if (this.field7212 != null) {
                this.field7229 = new byte[this.field7227.field9525];
                this.field7206 = 0;
            }
            this.field7228 = null;
            return this.field7227;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field7239[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(B)I")
    public final int method3768(byte arg0) {
        try {
            field7216++;
            if (arg0 != -86) {
                this.method3769(-66, 39, 8);
            }
            if (this.field7227 == null) {
                return 0;
            } else if (this.field7233) {
                class206 var2 = this.field7235.method3863((byte) 64);
                return var2 == null ? 0 : (int) var2.field3177;
            } else {
                return this.field7227.field9545;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7239[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(BI)V")
    public final void method1070(byte arg0, int arg1) {
        try {
            field7226++;
            if (this.field7212 != null) {
                for (class206 var3 = this.field7232.method3863((byte) 64); var3 != null; var3 = this.field7232.method3862(-353)) {
                    if (var3.field3177 == (long) arg1) {
                        return;
                    }
                }
                class206 var4 = new class206();
                if (arg0 >= 25) {
                    var4.field3177 = arg1;
                    this.field7232.method3868(102, var4);
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field7239[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(III)Lgh;")
    private final class574 method3769(int arg0, int arg1, int arg2) {
        try {
            int var4 = 87 / ((-arg1 - 9) / 54);
            field7217++;
            class574 var5 = (class574) this.field7219.method977((long) arg0, 1);
            if (var5 != null && arg2 == 0 && !var5.field8479 && var5.field8473) {
                var5.method1824(1);
                var5 = null;
            }
            if (var5 == null) {
                if (arg2 == 0) {
                    if (this.field7212 == null || this.field7229[arg0] == -1) {
                        if (this.field7210.method1247(-110)) {
                            return null;
                        }
                        var5 = this.field7210.method1259(true, this.field7215, 8133, arg0, (byte) 2);
                    } else {
                        var5 = this.field7209.method2335(this.field7212, arg0, 0);
                    }
                } else if (arg2 == 1) {
                    if (this.field7212 == null) {
                        throw new RuntimeException();
                    }
                    var5 = this.field7209.method2336(3, this.field7212, arg0);
                } else if (arg2 == 2) {
                    if (this.field7212 == null) {
                        throw new RuntimeException();
                    }
                    if (this.field7229[arg0] != -1) {
                        throw new RuntimeException();
                    }
                    if (this.field7210.method1246(0)) {
                        return null;
                    }
                    var5 = this.field7210.method1259(false, this.field7215, 8133, arg0, (byte) 2);
                } else {
                    throw new RuntimeException();
                }
                this.field7219.method968((byte) -111, (long) arg0, var5);
            }
            if (var5.field8473) {
                return null;
            }
            byte[] var6 = var5.method4281((byte) -68);
            if (!(var5 instanceof class683)) {
                try {
                    if (var6 == null || var6.length <= 2) {
                        throw new RuntimeException();
                    }
                    class316.field4994.reset();
                    class316.field4994.update(var6, 0, var6.length - 2);
                    int var7 = (int) class316.field4994.getValue();
                    if (this.field7227.field9540[arg0] != var7) {
                        throw new RuntimeException();
                    }
                    if (this.field7227.field9530 != null && this.field7227.field9530[arg0] != null) {
                        byte[] var8 = this.field7227.field9530[arg0];
                        byte[] var9 = class127.method1108((byte) -14, var6.length - 2, 0, var6);
                        for (int var10 = 0; var10 < 64; var10++) {
                            if (var8[var10] != var9[var10]) {
                                throw new RuntimeException();
                            }
                        }
                    }
                    this.field7210.field1850 = 0;
                    this.field7210.field1853 = 0;
                } catch (RuntimeException var19) {
                    this.field7210.method1258((byte) 44);
                    var5.method1824(1);
                    if (var5.field8479 && !this.field7210.method1247(0)) {
                        class727 var11 = this.field7210.method1259(true, this.field7215, 8133, arg0, (byte) 2);
                        this.field7219.method968((byte) -111, (long) arg0, var11);
                    }
                    return null;
                }
                var6[var6.length - 2] = (byte) (this.field7227.field9548[arg0] >>> 8);
                var6[var6.length - 1] = (byte) this.field7227.field9548[arg0];
                if (this.field7212 != null) {
                    this.field7209.method2333(this.field7212, arg0, (byte) 64, var6);
                    if (this.field7229[arg0] != 1) {
                        this.field7206++;
                        this.field7229[arg0] = 1;
                    }
                }
                if (!var5.field8479) {
                    var5.method1824(1);
                }
                return var5;
            }
            try {
                if (var6 == null || var6.length <= 2) {
                    throw new RuntimeException();
                }
                class316.field4994.reset();
                class316.field4994.update(var6, 0, var6.length - 2);
                int var12 = (int) class316.field4994.getValue();
                if (this.field7227.field9540[arg0] != var12) {
                    throw new RuntimeException();
                }
                if (this.field7227.field9530 != null && this.field7227.field9530[arg0] != null) {
                    byte[] var13 = this.field7227.field9530[arg0];
                    byte[] var14 = class127.method1108((byte) -54, var6.length - 2, 0, var6);
                    for (int var15 = 0; var15 < 64; var15++) {
                        if (var13[var15] != var14[var15]) {
                            throw new RuntimeException();
                        }
                    }
                }
                int var16 = (var6[var6.length - 2] & 0xFF << 8) + (var6[var6.length - 1] & 0xFF);
                if ((this.field7227.field9548[arg0] & 0xFFFF) != var16) {
                    throw new RuntimeException();
                }
                if (this.field7229[arg0] != 1) {
                    this.field7206++;
                    this.field7229[arg0] = 1;
                }
                if (!var5.field8479) {
                    var5.method1824(1);
                }
                return var5;
            } catch (Exception var20) {
                this.field7229[arg0] = -1;
                var5.method1824(1);
                if (var5.field8479 && !this.field7210.method1247(106)) {
                    class727 var17 = this.field7210.method1259(true, this.field7215, 8133, arg0, (byte) 2);
                    this.field7219.method968((byte) -111, (long) arg0, var17);
                }
                return null;
            }
        } catch (RuntimeException var21) {
            throw class759.method5498(var21, field7239[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)V")
    public final void method3770(int arg0) {
        try {
            field7213++;
            if (this.field7212 != null && arg0 == 0) {
                this.field7236 = true;
                if (this.field7235 == null) {
                    this.field7235 = new class513();
                }
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7239[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IB)I")
    public final int method1067(int arg0, byte arg1) {
        try {
            if (arg1 == 1) {
                field7223++;
                class574 var3 = (class574) this.field7219.method977((long) arg0, arg1);
                return var3 == null ? 0 : var3.method4285((byte) -42);
            } else {
                return -126;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7239[14] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)[B")
    public final byte[] method1066(int arg0, int arg1) {
        try {
            field7221++;
            class574 var3 = this.method3769(arg0, -67, arg1);
            if (var3 == null) {
                return null;
            } else {
                byte[] var4 = var3.method4281((byte) -68);
                var3.method1824(1);
                return var4;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field7239[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "(B)V")
    public static void method3771(byte arg0) {
        try {
            field7231 = null;
            if (arg0 <= 102) {
                field7231 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7239[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "(I)I")
    public final int method3772(int arg0) {
        try {
            field7211++;
            if (this.field7227 == null) {
                return 0;
            } else {
                if (arg0 <= 78) {
                    this.method3769(91, 107, -49);
                }
                return this.field7227.field9545;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7239[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "(I)I")
    public final int method3773(int arg0) {
        try {
            field7214++;
            if (this.method1071(-128) == null) {
                return this.field7228 == null ? 0 : this.field7228.method4285((byte) -42);
            } else {
                if (arg0 != 0) {
                    this.field7220 = null;
                }
                return 100;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7239[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "(I)V")
    public final void method3774(int arg0) {
        try {
            field7225++;
            if (this.field7235 != null && this.method1071(-126) != null) {
                class206 var2 = this.field7232.method3863((byte) 64);
                int var3 = 49 % ((arg0 + 5) / 60);
                while (var2 != null) {
                    int var4 = (int) var2.field3177;
                    if (var4 < 0 || this.field7227.field9525 <= var4 || this.field7227.field9546[var4] == 0) {
                        var2.method1824(1);
                    } else {
                        if (this.field7229[var4] == 0) {
                            this.method3769(var4, 110, 1);
                        }
                        if (this.field7229[var4] == -1) {
                            this.method3769(var4, -111, 2);
                        }
                        if (this.field7229[var4] == 1) {
                            var2.method1824(1);
                        }
                    }
                    var2 = this.field7232.method3862(-353);
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field7239[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "(B)V")
    public final void method3775(byte arg0) {
        try {
            field7208++;
            if (this.field7235 != null) {
                if (this.method1071(-128) == null) {
                    return;
                }
                if (this.field7233) {
                    boolean var2 = true;
                    for (class206 var3 = this.field7235.method3863((byte) 64); var3 != null; var3 = this.field7235.method3862(-353)) {
                        int var4 = (int) var3.field3177;
                        if (this.field7229[var4] == 0) {
                            this.method3769(var4, 49, 1);
                        }
                        if (this.field7229[var4] == 0) {
                            var2 = false;
                        } else {
                            var3.method1824(1);
                        }
                    }
                    while (this.field7234 < this.field7227.field9546.length) {
                        if (this.field7227.field9546[this.field7234] == 0) {
                            this.field7234++;
                        } else {
                            if (this.field7209.field4275 >= 250) {
                                var2 = false;
                                break;
                            }
                            if (this.field7229[this.field7234] == 0) {
                                this.method3769(this.field7234, 117, 1);
                            }
                            if (this.field7229[this.field7234] == 0) {
                                class206 var5 = new class206();
                                var5.field3177 = this.field7234;
                                var2 = false;
                                this.field7235.method3868(-70, var5);
                            }
                            this.field7234++;
                        }
                    }
                    if (var2) {
                        this.field7233 = false;
                        this.field7234 = 0;
                    }
                } else if (this.field7236) {
                    boolean var6 = true;
                    for (class206 var7 = this.field7235.method3863((byte) 64); var7 != null; var7 = this.field7235.method3862(-353)) {
                        int var8 = (int) var7.field3177;
                        if (this.field7229[var8] != 1) {
                            this.method3769(var8, 73, 2);
                        }
                        if (this.field7229[var8] == 1) {
                            var7.method1824(1);
                        } else {
                            var6 = false;
                        }
                    }
                    while (this.field7234 < this.field7227.field9546.length) {
                        if (this.field7227.field9546[this.field7234] == 0) {
                            this.field7234++;
                        } else {
                            if (this.field7210.method1246(0)) {
                                var6 = false;
                                break;
                            }
                            if (this.field7229[this.field7234] != 1) {
                                this.method3769(this.field7234, 53, 2);
                            }
                            if (this.field7229[this.field7234] != 1) {
                                class206 var9 = new class206();
                                var9.field3177 = this.field7234;
                                var6 = false;
                                this.field7235.method3868(73, var9);
                            }
                            this.field7234++;
                        }
                    }
                    if (var6) {
                        this.field7234 = 0;
                        this.field7236 = false;
                    }
                } else {
                    this.field7235 = null;
                }
            }
            if (arg0 < 72) {
                this.method1066(74, -9);
            }
            if (this.field7238 && this.field7237 <= class430.method3299(81)) {
                for (class574 var10 = (class574) this.field7219.method971(347); var10 != null; var10 = (class574) this.field7219.method973(true)) {
                    if (!var10.field8473) {
                        if (var10.field8478) {
                            if (!var10.field8479) {
                                throw new RuntimeException();
                            }
                            var10.method1824(1);
                        } else {
                            var10.field8478 = true;
                        }
                    }
                }
                this.field7237 = class430.method3299(123) + 1000L;
            }
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field7239[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(ILlp;Llp;Lcg;Lwd;I[BIZ)V")
    public class499(int arg0, class411 arg1, class411 arg2, class149 arg3, class287 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        try {
            this.field7212 = arg1;
            this.field7215 = arg0;
            if (this.field7212 == null) {
                this.field7233 = false;
            } else {
                this.field7233 = true;
                this.field7235 = new class513();
            }
            this.field7220 = arg2;
            this.field7209 = arg4;
            this.field7210 = arg3;
            this.field7218 = arg6;
            this.field7238 = arg8;
            this.field7230 = arg5;
            this.field7222 = arg7;
            if (this.field7220 != null) {
                this.field7228 = this.field7209.method2335(this.field7220, this.field7215, 0);
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field7239[9] + arg0 + ',' + (arg1 == null ? field7239[10] : field7239[11]) + ',' + (arg2 == null ? field7239[10] : field7239[11]) + ',' + (arg3 == null ? field7239[10] : field7239[11]) + ',' + (arg4 == null ? field7239[10] : field7239[11]) + ',' + arg5 + ',' + (arg6 == null ? field7239[10] : field7239[11]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3776(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xC);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3777(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 126;
                    break;
                case 1:
                    var10005 = 124;
                    break;
                case 2:
                    var10005 = 121;
                    break;
                case 3:
                    var10005 = 53;
                    break;
                default:
                    var10005 = 12;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
