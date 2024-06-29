import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class106 extends class194 {

    @OriginalMember(owner = "client!af", name = "M", descriptor = "[S")
    private short[] field1259 = new short[257];

    @OriginalMember(owner = "client!af", name = "W", descriptor = "I")
    private int field1269 = 0;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    public static int field1260 = 0;

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "I")
    public static int field1263 = 0;

    @OriginalMember(owner = "client!af", name = "ab", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!af", name = "Z", descriptor = "Lhq;")
    public static class365 field1272;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!af", name = "P", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!af", name = "X", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "[I")
    private int[] field1258;

    @OriginalMember(owner = "client!af", name = "V", descriptor = "[I")
    private int[] field1268;

    @OriginalMember(owner = "client!af", name = "bb", descriptor = "[[I")
    private int[][] field1274;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(II)[I")
    private final int[] method634(int arg0, int arg1) {
        ++field1257;
        if (~arg0 > -1) {
            return this.field1268;
        } else if (this.field1274.length <= arg0) {
            return this.field1258;
        } else {
            if (arg1 != 1) {
                this.method280(-125);
            }
            return this.field1274[arg0];
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)Ldj;")
    public static final class130 method635(boolean arg0, int arg1) {
        if (!arg0) {
            method639(76);
        }
        ++field1265;
        class130 var2 = (class130) class416.field5701.method648(1, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class288.field3786.method1794(5860, class397.method2453(100, arg1), class361.method2268((byte) -75, arg1));
            class130 var4 = new class130();
            if (var3 != null) {
                var4.method827((byte) -25, new class242(var3));
            }
            class416.field5701.method643((long) arg1, var4, (byte) 122);
            return var4;
        }
    }

    @OriginalMember(owner = "client!af", name = "h", descriptor = "(I)V")
    private final void method636(int arg0) {
        ++field1261;
        int[] var2 = this.field1274[0];
        int[] var3 = this.field1274[1];
        int[] var4 = this.field1274[this.field1274.length + -2];
        int[] var5 = this.field1274[this.field1274.length + -1];
        this.field1268 = new int[] { var2[arg0] - var3[0] - -var2[0], var2[1] - var3[1] - -var2[1] };
        this.field1258 = new int[] { var4[0] - (var5[0] + -var4[0]), var4[1] - (-var4[1] - -var5[1]) };
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([BII)I")
    public static final int method637(byte[] arg0, int arg1, int arg2) {
        ++field1256;
        int var3 = -24 / ((arg2 - 36) / 58);
        return class68.method394(94, arg1, arg0, 0);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILbg;)V")
    public final void method54(int arg0, int arg1, class242 arg2) {
        if (~arg0 == -1) {
            this.field1269 = arg2.method1563(-128);
            this.field1274 = new int[arg2.method1563(-128)][2];
            for (int var4 = 0; var4 < this.field1274.length; ++var4) {
                this.field1274[var4][0] = arg2.method1587((byte) -102);
                this.field1274[var4][1] = arg2.method1587((byte) -102);
            }
        }
        ++field1271;
        int var5 = 8 / ((52 - arg1) / 61);
    }

    @OriginalMember(owner = "client!af", name = "i", descriptor = "(I)V")
    private final void method638(int arg0) {
        if (arg0 != 0) {
            this.method636(-58);
        }
        int var2 = this.field1269;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field1274.length + -1) && var4 >= this.field1274[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field1274[var5 - 1];
                    int[] var7 = this.field1274[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class296.field3949[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field1259[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field1274.length + -1 && ~this.field1274[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field1274[var14 + -1];
                    int[] var16 = this.field1274[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field1259[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field1274.length - 1 > var22 && ~var21 <= ~this.field1274[var22][0]; ++var22) {
                }
                int[] var23 = this.field1274[var22 + -1];
                int[] var24 = this.field1274[var22];
                int var25 = this.method634(var22 + -2, 1)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method634(var22 + 1, arg0 ^ 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var28 + var26 - var25;
                int var32 = -var26 + -var31 + var25;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var36 - -var26 + var35 + var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field1259[var20] = (short) var38;
            }
        }
        ++field1266;
    }

    @OriginalMember(owner = "client!af", name = "j", descriptor = "(I)V")
    public static void method639(int arg0) {
        field1272 = null;
        if (arg0 <= 68) {
            method635(true, -72);
        }
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(I)V")
    public final void method280(int arg0) {
        if (this.field1274 == null) {
            this.field1274 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field1262;
        if (~this.field1274.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field1269 == -3) {
                this.method636(0);
            }
            class141.method911(-7448);
            int var2 = 38 % ((arg0 - 28) / 63);
            this.method638(0);
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class106() {
        super(1, true);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)I")
    public static final int method640(byte arg0, int arg1) {
        if (arg0 != 45) {
            return -57;
        } else {
            ++field1264;
            class326 var2 = class212.method1300(arg1, (byte) -121);
            int var3 = var2.field4344;
            int var4 = var2.field4343;
            int var5 = var2.field4345;
            int var6 = class186.field2162[var5 - var4];
            return class56.field649[var3] >> var4 & var6;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Laq;III)V")
    public static final void method641(class453 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            field1263 = -73;
        }
        ++field1267;
        if (~arg0.field6416 == -1) {
            arg0.field6394 = arg0.field6474;
        } else if (arg0.field6416 == 1) {
            arg0.field6394 = (-arg0.field6377 + arg1) / 2 + arg0.field6474;
        } else if (~arg0.field6416 != -3) {
            if (~arg0.field6416 == -4) {
                arg0.field6394 = arg0.field6474 * arg1 >> 14;
            } else if (~arg0.field6416 != -5) {
                arg0.field6394 = -arg0.field6377 + arg1 + -(arg0.field6474 * arg1 >> 14);
            } else {
                arg0.field6394 = (arg0.field6474 * arg1 >> 14) + (arg1 - arg0.field6377) / 2;
            }
        } else {
            arg0.field6394 = -arg0.field6474 + arg1 + -arg0.field6377;
        }
        if (~arg0.field6454 != -1) {
            if (arg0.field6454 != 1) {
                if (arg0.field6454 == 2) {
                    arg0.field6434 = -arg0.field6432 + arg3 + -arg0.field6381;
                } else if (arg0.field6454 == 3) {
                    arg0.field6434 = arg0.field6381 * arg3 >> 14;
                } else if (~arg0.field6454 == -5) {
                    arg0.field6434 = (arg0.field6381 * arg3 >> 14) + (-arg0.field6432 + arg3) / 2;
                } else {
                    arg0.field6434 = -(arg0.field6381 * arg3 >> 14) + -arg0.field6432 + arg3;
                }
            } else {
                arg0.field6434 = (-arg0.field6432 + arg3) / 2 + arg0.field6381;
            }
        } else {
            arg0.field6434 = arg0.field6381;
        }
        if (class186.field2151) {
            if (~client.method2696(arg0).field4847 == -1 && arg0.field6383 != 0) {
                return;
            }
            if (arg0.field6434 < 0) {
                arg0.field6434 = 0;
            } else if (~(arg0.field6434 + arg0.field6432) < ~arg3) {
                arg0.field6434 = -arg0.field6432 + arg3;
            }
            if (arg0.field6394 < 0) {
                arg0.field6394 = 0;
                return;
            }
            if (arg1 < arg0.field6394 + arg0.field6377) {
                arg0.field6394 = arg1 - arg0.field6377;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field1270;
        int[] var3 = super.field2292.method1781(arg0, false);
        int var4 = 54 % ((57 - arg1) / 46);
        if (super.field2292.field3708) {
            int[] var5 = this.method1203(0, 58, arg0);
            for (int var6 = 0; ~class138.field1579 < ~var6; ++var6) {
                int var7 = var5[var6] >> 4;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (var7 > 256) {
                    var7 = 256;
                }
                var3[var6] = this.field1259[var7];
            }
        }
        return var3;
    }

    static {
        new class72("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field1273 = 0;
        field1272 = new class365(500);
    }
}
