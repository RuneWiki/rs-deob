import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class606 {

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "[I")
    private int[] field8691;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "[B")
    private byte[] field8692;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "[I")
    private int[] field8693;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8695 = new String[] { method4480(method4479("\u0005EZG")), method4480(method4479("\u0003Y\u0018\u0017f\u0005YB\u0015'")), method4480(method4479("\u0010\u001e\u0018\u0005r")), method4480(method4479("\u0003Y\u0018i'")), method4480(method4479("\u0003Y\u0018h'")), method4480(method4479("\u0003Y\u0018o'")), method4480(method4479("\u0003Y\u0018n'")), method4480(method4479("%_\u0016H`\u000fUAD}\u000f\u0010PD}KTW_nKFWGz\u000e\u0010")), method4480(method4479("\u0003Y\u0018j'")) };

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static int field8685 = -1;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field8688 = -1;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public static int field8683;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field8684;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field8686;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field8687;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field8689;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field8690;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field8694;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I[B[BIIB)I", line = 6)
    public final int method4474(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, byte arg5) {
        try {
            field8687++;
            if (arg5 != 82) {
                this.field8691 = null;
            }
            int var7 = 0;
            int var18 = arg0 + arg4;
            int var8 = arg3 << 3;
            while (arg0 < var18) {
                int var9 = arg2[arg0] & 0xFF;
                int var10 = this.field8691[var9];
                byte var11 = this.field8692[var9];
                if (var11 == 0) {
                    throw new RuntimeException(field8695[7] + var9);
                }
                int var12 = var8 >> 3;
                int var13 = var8 & 0x7;
                int var14 = var7 & -var13 >> 31;
                int var15 = (var13 + var11 - 1 >> 3) + var12;
                var8 += var11;
                int var19 = var13 + 24;
                arg1[var12] = (byte) (var7 = class10.method71(var14, var10 >>> var19));
                if (var15 > var12) {
                    var12++;
                    var13 = var19 - 8;
                    arg1[var12] = (byte) (var7 = var10 >>> var13);
                    if (var15 > var12) {
                        var13 -= 8;
                        var12++;
                        arg1[var12] = (byte) (var7 = var10 >>> var13);
                        if (var12 < var15) {
                            var13 -= 8;
                            var12++;
                            arg1[var12] = (byte) (var7 = var10 >>> var13);
                            if (var15 > var12) {
                                var13 -= 8;
                                var12++;
                                arg1[var12] = (byte) (var7 = var10 << -var13);
                            }
                        }
                    }
                }
                arg0++;
            }
            return (var8 + 7 >> 3) - arg3;
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field8695[8] + arg0 + ',' + (arg1 == null ? field8695[0] : field8695[2]) + ',' + (arg2 == null ? field8695[0] : field8695[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 83)
    public static final void method4475(int arg0) {
        try {
            if (class427.field6149 != null) {
                class427.field6149.method177((byte) -87);
                class468.field6847 = null;
                class427.field6149 = null;
            }
            if (arg0 != -1) {
                method4478(-21, -78, false);
            }
            field8686++;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8695[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([BBII[BI)I", line = 100)
    public final int method4476(byte[] arg0, byte arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        try {
            field8690++;
            if (arg2 == 0) {
                return 0;
            }
            int var21 = arg2 + arg3;
            int var7 = 0;
            int var8 = -33 % ((arg1 - 47) / 41);
            int var9 = arg5;
            while (true) {
                byte var10 = arg0[var9];
                if (var10 < 0) {
                    var7 = this.field8693[var7];
                } else {
                    var7++;
                }
                int var11;
                if ((var11 = this.field8693[var7]) < 0) {
                    arg4[arg3++] = (byte) (~var11);
                    if (arg3 >= var21) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x40) == 0) {
                    var7++;
                } else {
                    var7 = this.field8693[var7];
                }
                int var12;
                if ((var12 = this.field8693[var7]) < 0) {
                    arg4[arg3++] = (byte) (~var12);
                    if (arg3 >= var21) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x20) == 0) {
                    var7++;
                } else {
                    var7 = this.field8693[var7];
                }
                int var13;
                if ((var13 = this.field8693[var7]) < 0) {
                    arg4[arg3++] = (byte) (~var13);
                    if (var21 <= arg3) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x10) == 0) {
                    var7++;
                } else {
                    var7 = this.field8693[var7];
                }
                int var14;
                if ((var14 = this.field8693[var7]) < 0) {
                    arg4[arg3++] = (byte) (~var14);
                    if (arg3 >= var21) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x8) == 0) {
                    var7++;
                } else {
                    var7 = this.field8693[var7];
                }
                int var15;
                if ((var15 = this.field8693[var7]) < 0) {
                    arg4[arg3++] = (byte) (~var15);
                    if (var21 <= arg3) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x4) == 0) {
                    var7++;
                } else {
                    var7 = this.field8693[var7];
                }
                int var16;
                if ((var16 = this.field8693[var7]) < 0) {
                    arg4[arg3++] = (byte) (~var16);
                    if (var21 <= arg3) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x2) == 0) {
                    var7++;
                } else {
                    var7 = this.field8693[var7];
                }
                int var17;
                if ((var17 = this.field8693[var7]) < 0) {
                    arg4[arg3++] = (byte) (~var17);
                    if (arg3 >= var21) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x1) == 0) {
                    var7++;
                } else {
                    var7 = this.field8693[var7];
                }
                int var18;
                if ((var18 = this.field8693[var7]) < 0) {
                    arg4[arg3++] = (byte) (~var18);
                    if (arg3 >= var21) {
                        break;
                    }
                    var7 = 0;
                }
                var9++;
            }
            return var9 + 1 - arg5;
        } catch (RuntimeException var20) {
            throw class665.method4799(var20, field8695[3] + (arg0 == null ? field8695[0] : field8695[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field8695[0] : field8695[2]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V", line = 247)
    public static final void method4477(byte arg0) {
        try {
            int var1 = 102 / ((59 - arg0) / 35);
            for (int var2 = 0; var2 < class347.field5048; var2++) {
                class441 var3 = class759.field10834[var2];
                boolean var4 = false;
                if (var3.field6511 == null) {
                    var3.field6515--;
                    if (var3.field6515 >= (var3.method3435((byte) -105) ? -1500 : -10)) {
                        if (var3.field6508 == 1 && var3.field6509 == null) {
                            var3.field6509 = class373.method2957(class395.field5736, var3.field6516, 0);
                            if (var3.field6509 == null) {
                                continue;
                            }
                            var3.field6515 += var3.field6509.method2956();
                        } else if (var3.method3435((byte) -48) && (var3.field6518 == null || var3.field6522 == null)) {
                            if (var3.field6518 == null) {
                                var3.field6518 = class186.method1539(class449.field6575, var3.field6516);
                            }
                            if (var3.field6518 == null) {
                                continue;
                            }
                            if (var3.field6522 == null) {
                                var3.field6522 = var3.field6518.method1537(new int[] { 22050 });
                                if (var3.field6522 == null) {
                                    continue;
                                }
                            }
                        }
                        if (var3.field6515 < 0) {
                            int var5 = 8192;
                            int var7;
                            if (var3.field6513 == 0) {
                                var7 = var3.field6520 * (var3.field6508 == 3 ? class451.field6612.field9102.method2498(3) : class451.field6612.field9106.method2498(3)) >> 2;
                            } else {
                                int var6 = (var3.field6513 & 0x3B4D54D) >> 24;
                                if (class203.field2988.field2981 == var6) {
                                    int var8 = var3.field6513 & 0xFF << 9;
                                    int var9 = class203.field2988.method1437((byte) -28) << 8;
                                    int var10 = (var3.field6513 & 0xFFAEA4) >> 16;
                                    int var11 = (var10 << 9) + var9 + 256 - class203.field2988.field2969;
                                    int var12 = var3.field6513 >> 8 & 0xFF;
                                    int var13 = (var12 << 9) + (256 - class203.field2988.field2984) + var9;
                                    int var14 = Math.abs(var11) + Math.abs(var13) - 512;
                                    if (var14 > var8) {
                                        var3.field6515 = -99999;
                                        continue;
                                    }
                                    if (var14 < 0) {
                                        var14 = 0;
                                    }
                                    var7 = (var8 - var14) * class451.field6612.field9087.method2498(3) * var3.field6520 / var8 >> 2;
                                    if (var3.field6514 != null && var3.field6514 instanceof class604) {
                                        class604 var15 = (class604) var3.field6514;
                                        short var16 = var15.field8669;
                                        short var17 = var15.field8663;
                                    }
                                    if (var11 != 0 || var13 != 0) {
                                        int var18 = -class57.field802 - ((int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D) + 4096) & 0x3FFF;
                                        if (var18 > 8192) {
                                            var18 = 16384 - var18;
                                        }
                                        int var19;
                                        if (var14 <= 0) {
                                            var19 = 8192;
                                        } else if (var14 >= 4096) {
                                            var19 = 16384;
                                        } else {
                                            var19 = (8192 - var14) / 4096 + 8192;
                                        }
                                        var5 = (16384 - var19 >> 1) + var18 * var19 / 8192;
                                    }
                                } else {
                                    var7 = 0;
                                }
                            }
                            if (var7 > 0) {
                                class313 var20 = null;
                                if (var3.field6508 == 1) {
                                    var20 = var3.field6509.method2959().method2495(class631.field8967);
                                } else if (var3.method3435((byte) 96)) {
                                    var20 = var3.field6522;
                                }
                                class93 var21 = var3.field6511 = class93.method915(var20, var3.field6519, var7, var5);
                                var21.method936(var3.field6510 - 1);
                                class261.field3699.method4230(var21);
                            }
                        }
                    } else {
                        var4 = true;
                    }
                } else if (!var3.field6511.method4293(-124)) {
                    var4 = true;
                }
                if (var4) {
                    class347.field5048--;
                    for (int var22 = var2; var22 < class347.field5048; var22++) {
                        class759.field10834[var22] = class759.field10834[var22 + 1];
                    }
                    var2--;
                }
            }
            field8694++;
            if (class399.field5812 && !class628.method4611(106)) {
                if (class451.field6612.field9094.method2498(3) != 0 && class291.field4106 != -1) {
                    if (class732.field10452 == null) {
                        class772.method5562(0, class291.field4106, class379.field5540, class451.field6612.field9094.method2498(3), (byte) 55, false);
                    } else {
                        class741.method5372(class291.field4106, class451.field6612.field9094.method2498(3), class379.field5540, true, class732.field10452, 0, false);
                    }
                }
                class732.field10452 = null;
                class399.field5812 = false;
            } else if (class451.field6612.field9094.method2498(3) != 0 && class291.field4106 != -1 && !class628.method4611(67)) {
                class256.field3667++;
                class274 var23 = class375.method2969((byte) 1, class98.field1327, class60.field916.field11100);
                var23.field3885.method5127(class291.field4106, 26108);
                class60.field916.method5608(var23, 29867);
                class291.field4106 = -1;
            }
        } catch (RuntimeException var25) {
            throw class665.method4799(var25, field8695[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZ)Z", line = 464)
    public static final boolean method4478(int arg0, int arg1, boolean arg2) {
        try {
            field8683++;
            if (arg2) {
                return false;
            } else {
                return (arg0 & 0x40000) != 0 | class529.method4008(-1, arg0, arg1) || class478.method3704(arg0, -1557, arg1);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8695[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "([B)V", line = 479)
    public class606(byte[] arg0) {
        try {
            int var2 = arg0.length;
            this.field8691 = new int[var2];
            this.field8692 = arg0;
            int[] var3 = new int[33];
            this.field8693 = new int[8];
            int var4 = 0;
            for (int var5 = 0; var5 < var2; var5++) {
                byte var6 = arg0[var5];
                if (var6 != 0) {
                    int var7 = 0x1 << 32 - var6;
                    int var8 = var3[var6];
                    this.field8691[var5] = var8;
                    int var12;
                    if ((var7 & var8) == 0) {
                        for (int var9 = var6 - 1; var9 >= 1; var9--) {
                            int var10 = var3[var9];
                            if (var8 != var10) {
                                break;
                            }
                            int var11 = 0x1 << 32 - var9;
                            if ((var10 & var11) != 0) {
                                var3[var9] = var3[var9 - 1];
                                break;
                            }
                            var3[var9] = class10.method71(var10, var11);
                        }
                        var12 = var7 | var8;
                    } else {
                        var12 = var3[var6 - 1];
                    }
                    var3[var6] = var12;
                    for (int var13 = var6 + 1; var13 <= 32; var13++) {
                        if (var3[var13] == var8) {
                            var3[var13] = var12;
                        }
                    }
                    int var14 = 0;
                    for (int var15 = 0; var15 < var6; var15++) {
                        int var16 = Integer.MIN_VALUE >>> var15;
                        if ((var8 & var16) == 0) {
                            var14++;
                        } else {
                            if (this.field8693[var14] == 0) {
                                this.field8693[var14] = var4;
                            }
                            var14 = this.field8693[var14];
                        }
                        int var17 = var16 >>> 1;
                        if (this.field8693.length <= var14) {
                            int[] var18 = new int[this.field8693.length * 2];
                            for (int var19 = 0; var19 < this.field8693.length; var19++) {
                                var18[var19] = this.field8693[var19];
                            }
                            this.field8693 = var18;
                        }
                    }
                    if (var4 <= var14) {
                        var4 = var14 + 1;
                    }
                    this.field8693[var14] = ~var5;
                }
            }
        } catch (RuntimeException var21) {
            throw class665.method4799(var21, field8695[1] + (arg0 == null ? field8695[0] : field8695[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4479(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xF);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4480(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 107;
                    break;
                case 1:
                    var10005 = 48;
                    break;
                case 2:
                    var10005 = 54;
                    break;
                case 3:
                    var10005 = 43;
                    break;
                default:
                    var10005 = 15;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
