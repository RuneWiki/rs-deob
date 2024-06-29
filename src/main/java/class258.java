import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class258 extends class220 {

    @OriginalMember(owner = "client!jh", name = "tc", descriptor = "Z")
    public boolean field4321 = false;

    @OriginalMember(owner = "client!jh", name = "xc", descriptor = "I")
    public int field4325 = -1;

    @OriginalMember(owner = "client!jh", name = "yc", descriptor = "I")
    public int field4326 = -1;

    @OriginalMember(owner = "client!jh", name = "pc", descriptor = "I")
    public int field4317 = 0;

    @OriginalMember(owner = "client!jh", name = "Jc", descriptor = "I")
    public int field4337 = -1;

    @OriginalMember(owner = "client!jh", name = "Lc", descriptor = "I")
    public int field4339 = 0;

    @OriginalMember(owner = "client!jh", name = "Ic", descriptor = "I")
    public int field4336 = -1;

    @OriginalMember(owner = "client!jh", name = "Hc", descriptor = "B")
    private byte field4335 = 0;

    @OriginalMember(owner = "client!jh", name = "zc", descriptor = "I")
    public int field4327 = -1;

    @OriginalMember(owner = "client!jh", name = "Oc", descriptor = "I")
    public int field4342 = 0;

    @OriginalMember(owner = "client!jh", name = "qc", descriptor = "I")
    public int field4318 = -1;

    @OriginalMember(owner = "client!jh", name = "Yc", descriptor = "I")
    public int field4352 = 255;

    @OriginalMember(owner = "client!jh", name = "Cc", descriptor = "I")
    public int field4330 = 0;

    @OriginalMember(owner = "client!jh", name = "Xc", descriptor = "I")
    public int field4351 = 0;

    @OriginalMember(owner = "client!jh", name = "Zc", descriptor = "I")
    public int field4353 = -1;

    @OriginalMember(owner = "client!jh", name = "bd", descriptor = "B")
    private byte field4355 = 0;

    @OriginalMember(owner = "client!jh", name = "wc", descriptor = "I")
    public static int field4324 = 1;

    @OriginalMember(owner = "client!jh", name = "Kc", descriptor = "Ljava/lang/String;")
    public static String field4338 = "flash3:";

    @OriginalMember(owner = "client!jh", name = "Sc", descriptor = "Ljava/lang/String;")
    public static String field4346 = "Connected to update server";

    @OriginalMember(owner = "client!jh", name = "sc", descriptor = "F")
    public static float field4320;

    @OriginalMember(owner = "client!jh", name = "nc", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!jh", name = "rc", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!jh", name = "uc", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!jh", name = "vc", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!jh", name = "Ac", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!jh", name = "Dc", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!jh", name = "Ec", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!jh", name = "Fc", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!jh", name = "Gc", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!jh", name = "Nc", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!jh", name = "Pc", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!jh", name = "Rc", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!jh", name = "Tc", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!jh", name = "Uc", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!jh", name = "Wc", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!jh", name = "oc", descriptor = "Ltf;")
    public class115 field4316;

    @OriginalMember(owner = "client!jh", name = "ad", descriptor = "Lpd;")
    public static class290 field4354;

    @OriginalMember(owner = "client!jh", name = "Qc", descriptor = "Lth;")
    public static class57 field4344;

    @OriginalMember(owner = "client!jh", name = "Bc", descriptor = "Ljava/lang/String;")
    public static String field4329;

    @OriginalMember(owner = "client!jh", name = "Mc", descriptor = "Ljava/lang/String;")
    public String field4340;

    @OriginalMember(owner = "client!jh", name = "Vc", descriptor = "Ljava/lang/String;")
    public String field4349;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIII)V", line = 4)
    public final void method445(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4322++;
        if (!this.field3533) {
            if (this.field4316 == null) {
                return;
            }
            class43 var6 = this.field3547 != -1 && this.field3559 == 0 ? class198.method1524(this.field3547, 116) : null;
            class43 var7 = this.field3544 == -1 || this.field4321 || this.field3544 == this.method1641(0).field1737 && var6 != null ? null : class198.method1524(this.field3544, 127);
            class96 var8 = this.field4316.method897(var7, this.field3489, var6, (byte) -92, this.field3532, this.field3517, false, this.field3576, this.field3554, false, this.field3558, this.field3539);
            if (var8 == null) {
                return;
            }
            this.method1649((class96) null, -14851, var8);
        }
        if (this.field3508 != null) {
            this.field3508.method1230(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(ZI)Ljava/lang/String;", line = 40)
    public final String method1975(boolean arg0, int arg1) {
        field4345++;
        String var3 = "";
        if (class19.field213 != null) {
            var3 = var3 + class19.field213[this.field4335];
        }
        if (arg1 != 12473) {
            return (String) null;
        }
        if (class74.field1268 != null && class74.field1268[this.field4335] != -1) {
            class48 var4 = class229.method1780(false, class74.field1268[this.field4335]);
            if (var4.field753 == 's') {
                var3 = var3 + var4.method374((byte) -115, this.field4355 & 0xFF);
            } else {
                class285.method2079(new Throwable(), (byte) -16, "gdn1");
                class74.field1268[this.field4335] = -1;
            }
        }
        String var5;
        if (arg0) {
            var5 = var3 + this.field4340;
        } else {
            var5 = var3 + this.field4349;
        }
        if (class75.field1279 != null) {
            var5 = var5 + class75.field1279[this.field4335];
        }
        return var5;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(CILjava/lang/StringBuffer;B)Ljava/lang/StringBuffer;", line = 85)
    public static final StringBuffer method1976(char arg0, int arg1, StringBuffer arg2, byte arg3) {
        field4350++;
        int var4 = arg2.length();
        arg2.setLength(arg1);
        for (int var5 = var4; var5 < arg1; var5++) {
            arg2.setCharAt(var5, arg0);
        }
        if (arg3 >= -48) {
            method1976((char) 65467, 12, (StringBuffer) null, (byte) -13);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILo;IIIILdc;IIIIIIBII)V", line = 108)
    private final void method1977(int arg0, class96 arg1, int arg2, int arg3, int arg4, int arg5, class158 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, byte arg13, int arg14, int arg15) {
        field4333++;
        if (arg13 <= 0) {
            this.method1975(true, 76);
        }
        int var17 = arg5 * arg5 + arg15 * arg15;
        if (var17 < 16 || arg11 < var17) {
            return;
        }
        int var18 = (int) (Math.atan2((double) arg5, (double) arg15) * 325.949D) & 0x7FF;
        class96 var19 = class298.method2133(this.field3511, this.field3577, (byte) 115, arg7, arg1, this.field3504, var18);
        if (var19 == null) {
            return;
        }
        if (!class42.field607) {
            var19.method440(0, arg12, arg2, arg14, arg9, arg10, arg0, arg4, -1L, arg3, arg6);
            return;
        }
        float var20 = class42.method303();
        float var21 = class42.method290();
        class42.method279();
        class42.method300(var20, var21 - 150.0F);
        var19.method440(0, arg12, arg2, arg14, arg9, arg10, arg0, arg4, -1L, arg3, arg6);
        class42.method282();
        class42.method300(var20, var21);
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(B)V", line = 158)
    public static void method1978(byte arg0) {
        field4346 = null;
        field4344 = null;
        if (arg0 <= -121) {
            field4354 = null;
            field4338 = null;
            field4329 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZLqm;I)V", line = 172)
    public final void method1979(boolean arg0, class227 arg1, int arg2) {
        arg1.field3760 = 0;
        field4331++;
        int var4 = arg1.method1720((byte) -85);
        int var5 = var4 & 0x1;
        boolean var6 = (var4 & 0x4) != 0;
        boolean var7 = (var4 & 0x2) != 0;
        int var8 = super.method1634(-1);
        this.method1635(((var4 & 0x39) >> 3) + 1, -1);
        this.field4335 = (byte) ((var4 & 0xF3) >> 6);
        int var9 = -1;
        this.field3577 += (this.method1634(-1) - var8) * 64;
        this.field3511 += (this.method1634(-1) - var8) * 64;
        this.field4355 = arg1.method1733(0);
        this.field4327 = arg1.method1733(0);
        this.field4318 = arg1.method1733(0);
        int[] var10 = new int[12];
        this.field4317 = 0;
        for (int var11 = 0; var11 < 12; var11++) {
            int var12 = arg1.method1720((byte) -57);
            if (var12 == 0) {
                var10[var11] = 0;
            } else {
                int var13 = arg1.method1720((byte) -33);
                int var14 = (var12 << 8) + var13;
                if (var11 == 0 && var14 == 65535) {
                    var9 = arg1.method1765(arg0);
                    this.field4317 = arg1.method1720((byte) -86);
                    break;
                }
                if (var14 < 32768) {
                    var10[var11] = class75.method624(var14 - 256, Integer.MIN_VALUE);
                } else {
                    int var15 = class184.field2964[var14 - 32768];
                    var10[var11] = class75.method624(1073741824, var15);
                    int var16 = class6.method22(var15, 16430).field830;
                    if (var16 != 0) {
                        this.field4317 = var16;
                    }
                }
            }
        }
        int[] var17 = new int[5];
        for (int var18 = 0; var18 < 5; var18++) {
            int var19 = arg1.method1720((byte) -97);
            if (var19 < 0 || class336.field5316[var18].length <= var19) {
                var19 = 0;
            }
            var17[var18] = var19;
        }
        this.field3561 = arg1.method1765(arg0);
        this.field4340 = arg1.method1758((byte) 107);
        if (var7) {
            this.field4349 = arg1.method1758((byte) 98);
        } else {
            this.field4349 = this.field4340;
        }
        this.field4330 = arg1.method1720((byte) -57);
        if (var6) {
            this.field4342 = arg1.method1765(true);
            this.field4339 = this.field4330;
            this.field4353 = -1;
        } else {
            this.field4342 = 0;
            this.field4339 = arg1.method1720((byte) -103);
            this.field4353 = arg1.method1720((byte) -91);
            if (this.field4353 == 255) {
                this.field4353 = -1;
            }
        }
        int var20 = this.field4351;
        this.field4351 = arg1.method1720((byte) -35);
        if (this.field4351 == 0) {
            class179.method1407(this, (byte) 115, arg2);
        } else {
            int var21 = this.field4337;
            int var22 = this.field4336;
            int var23 = this.field4352;
            int var24 = this.field4325;
            int var25 = this.field4326;
            this.field4336 = arg1.method1765(true);
            this.field4337 = arg1.method1765(true);
            this.field4325 = arg1.method1765(arg0);
            this.field4326 = arg1.method1765(true);
            this.field4352 = arg1.method1720((byte) -43);
            if (this.field4351 != var20 || this.field4336 != var22 || this.field4337 != var21 || this.field4325 != var24 || this.field4326 != var25 || this.field4352 != var23) {
                class24.method160(true, this, arg2);
            }
        }
        if (this.field4316 == null) {
            this.field4316 = new class115();
        }
        int var26 = this.field4316.field1930;
        this.field4316.method898(var17, var9, this.field3561, Integer.MIN_VALUE, var10, var5 == 1);
        if (var9 != var26) {
            this.field3577 = this.field3519[0] * 128 + (this.method1634(-1) * 64);
            this.field3511 = this.field3553[0] * 128 + this.method1634(-1) * 64;
        }
        if (this.field3508 != null) {
            this.field3508.method1239();
        }
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)I", line = 339)
    public final int method1648(int arg0) {
        field4343++;
        if (arg0 != -1) {
            field4329 = (String) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)I", line = 359)
    public final int method1634(int arg0) {
        field4319++;
        if (arg0 != -1) {
            field4346 = (String) null;
        }
        return this.field4316 == null || this.field4316.field1930 == -1 ? super.method1634(-1) : class222.method1683(-126, this.field4316.field1930).field2025;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "()I", line = 374)
    public final int method444() {
        field4341++;
        return this.field3534;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIIIIJILdc;)V", line = 390)
    public final void method440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class158 arg10) {
        field4328++;
        if (this.field4316 == null) {
            return;
        }
        class43 var13 = this.field3547 != -1 && this.field3559 == 0 ? class198.method1524(this.field3547, -76) : null;
        class106 var14 = this.method1641(0);
        boolean var15 = var14.field1756 != 0 || var14.field1744 != 0 || var14.field1719 != 0 || var14.field1738 != 0;
        class43 var16 = this.field3544 == -1 || this.field4321 || this.field3544 == this.method1641(0).field1737 && var13 != null ? null : class198.method1524(this.field3544, -121);
        class96 var17 = this.field4316.method897(var16, this.field3489, var13, (byte) -78, this.field3532, this.field3517, true, this.field3576, this.field3554, var15, this.field3558, this.field3539);
        int var18 = class297.method2129(true);
        if (class42.field607 && class10.field81 < 96 && var18 > 50) {
            class216.method1629(64);
        }
        if (class93.field1571 != 0 && var18 < 50) {
            int var19 = 50 - var18;
            while (class184.field2973 < var19) {
                class46.field746[class184.field2973] = new byte[102400];
                class184.field2973++;
            }
            while (var19 < class184.field2973) {
                class184.field2973--;
                class46.field746[class184.field2973] = null;
            }
        }
        if (var17 == null) {
            return;
        }
        this.field3534 = var17.method444();
        if (client.field717 && (this.field4316.field1930 == -1 || class222.method1683(1, this.field4316.field1930).field2060)) {
            class96 var20 = class59.method501(240, this.field3511, arg0, 0, 1, this.field3546, var16 == null ? var13 : var16, 0, var17, this.field3504, 160, (byte) -74, var16 == null ? this.field3517 : this.field3554, this.field3577);
            if (class42.field607) {
                float var21 = class42.method303();
                float var22 = class42.method290();
                class42.method279();
                class42.method300(var21, var22 - 150.0F);
                var20.method440(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class158) null);
                class42.method282();
                class42.method300(var21, var22);
            } else {
                var20.method440(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class158) null);
            }
        }
        if (class6.field55 == this) {
            for (int var23 = class74.field1261.length - 1; var23 >= 0; var23--) {
                class273 var24 = class74.field1261[var23];
                if (var24 != null && var24.field4523 != -1) {
                    if (var24.field4529 == 1 && var24.field4525 >= 0 && var24.field4525 < class165.field2621.length) {
                        class288 var25 = class165.field2621[var24.field4525];
                        if (var25 != null) {
                            int var26 = var25.field3577 / 32 - class6.field55.field3577 / 32;
                            int var27 = var25.field3511 / 32 - (class6.field55.field3511 / 32);
                            this.method1977(arg6, var17, arg2, arg9, arg7, var26, (class158) null, var24.field4523, arg0, arg4, arg5, 360000, arg1, (byte) 35, arg3, var27);
                        }
                    }
                    if (var24.field4529 == 2) {
                        int var28 = (var24.field4534 - class93.field1562) * 4 - ((class6.field55.field3577 / 32) - 2);
                        int var29 = (var24.field4532 - class275.field4546) * 4 + 2 - class6.field55.field3511 / 32;
                        int var30 = var24.field4530 * 4;
                        int var31 = var30 * var30;
                        this.method1977(arg6, var17, arg2, arg9, arg7, var28, (class158) null, var24.field4523, arg0, arg4, arg5, var31, arg1, (byte) 127, arg3, var29);
                    }
                    if (var24.field4529 == 10 && var24.field4525 >= 0 && class56.field924.length > var24.field4525) {
                        class258 var32 = class56.field924[var24.field4525];
                        if (var32 != null) {
                            int var33 = var32.field3577 / 32 - (class6.field55.field3577 / 32);
                            int var34 = var32.field3511 / 32 - class6.field55.field3511 / 32;
                            this.method1977(arg6, var17, arg2, arg9, arg7, var33, (class158) null, var24.field4523, arg0, arg4, arg5, 360000, arg1, (byte) 41, arg3, var34);
                        }
                    }
                }
            }
        }
        class96 var35 = null;
        this.method1640(var17, 53);
        this.method1645(arg0, var17, (byte) -119);
        if (!this.field4321 && this.field3552 != -1 && this.field3566 != -1) {
            class94 var36 = class282.method2071(this.field3552, 0);
            var35 = var36.method732(this.field3527, (byte) 80, this.field3566, this.field3499);
            if (var35 != null) {
                var35.method512(0, -this.field3509, 0);
                if (var36.field1585) {
                    if (class149.field2387 != 0) {
                        var35.method531(class149.field2387);
                    }
                    if (class252.field4264 != 0) {
                        var35.method543(class252.field4264);
                    }
                    if (class57.field966 != 0) {
                        var35.method512(0, class57.field966, 0);
                    }
                }
            }
        }
        class96 var37 = null;
        if (!this.field4321 && this.field3478 != null) {
            if (class332.field5261 >= this.field3523) {
                this.field3478 = null;
            }
            if (this.field3486 <= class332.field5261 && class332.field5261 < this.field3523) {
                if ((this.field3478 instanceof class56)) {
                    var37 = (class96) ((class56) this.field3478).method450((byte) 125);
                } else {
                    var37 = (class96) this.field3478;
                }
                var37.method512(this.field3516 - this.field3577, -this.field3504 + this.field3585, this.field3507 - this.field3511);
                if (this.field3549 == 512) {
                    var37.method526();
                } else if (this.field3549 == 1024) {
                    var37.method514();
                } else if (this.field3549 == 1536) {
                    var37.method522();
                }
            }
        }
        if (class42.field607) {
            this.method1649(var35, -14851, var17);
            var17.field1597 = true;
            var17.method440(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3508);
            if (var35 != null) {
                if (this.field3508 != null) {
                    class337 var38 = (class337) var35;
                    this.field3508.method1228(var38.field5345, var38.field5326, true, var38.field5344, var38.field5365, var38.field5332);
                }
                var35.field1597 = true;
                var35.method440(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3508);
            }
        } else {
            if (var35 != null) {
                var17 = ((class62) var17).method524(var35);
            }
            if (var37 != null) {
                var17 = ((class62) var17).method524(var37);
            }
            this.method1649(var35, -14851, var17);
            var17.field1597 = true;
            var17.method440(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3508);
        }
        if (var37 == null) {
            return;
        }
        if (this.field3549 == 512) {
            var37.method522();
        } else if (this.field3549 == 1024) {
            var37.method514();
        } else if (this.field3549 == 1536) {
            var37.method526();
        }
        var37.method512(this.field3577 - this.field3516, -this.field3585 + this.field3504, this.field3511 - this.field3507);
    }

    @OriginalMember(owner = "client!jh", name = "finalize", descriptor = "()V", line = 656)
    protected final void finalize() {
        field4348++;
        if (this.field3508 != null) {
            this.field3508.method1232();
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)I", line = 671)
    public final int method1636(int arg0) {
        field4315++;
        return arg0 == -1 ? this.field3561 : -99;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)I", line = 692)
    public static final int method1980(boolean arg0) {
        if (arg0) {
            method1980(false);
        }
        field4323++;
        return 2;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIZB)V", line = 727)
    public final void method1981(int arg0, int arg1, boolean arg2, byte arg3) {
        if (arg3 != -67) {
            this.finalize();
        }
        super.method1633(arg2, arg0, this.method1634(-1), arg1, 124);
        field4332++;
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(B)Z", line = 738)
    public final boolean method1646(byte arg0) {
        field4334++;
        if (arg0 == -7) {
            return this.field4316 != null;
        } else {
            return false;
        }
    }
}
