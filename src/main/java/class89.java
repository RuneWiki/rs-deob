import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class89 extends class62 {

    @OriginalMember(owner = "client!kba", name = "N", descriptor = "I")
    private int field1334 = 0;

    @OriginalMember(owner = "client!kba", name = "Q", descriptor = "I")
    private int field1337 = 0;

    @OriginalMember(owner = "client!kba", name = "I", descriptor = "I")
    private int field1329 = 0;

    @OriginalMember(owner = "client!kba", name = "O", descriptor = "Lbu;")
    public static class19 field1335;

    @OriginalMember(owner = "client!kba", name = "C", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!kba", name = "D", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!kba", name = "E", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!kba", name = "F", descriptor = "I")
    private int field1326;

    @OriginalMember(owner = "client!kba", name = "G", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!kba", name = "H", descriptor = "I")
    private int field1328;

    @OriginalMember(owner = "client!kba", name = "J", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!kba", name = "K", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!kba", name = "L", descriptor = "I")
    private int field1332;

    @OriginalMember(owner = "client!kba", name = "M", descriptor = "I")
    private int field1333;

    @OriginalMember(owner = "client!kba", name = "P", descriptor = "I")
    private int field1336;

    @OriginalMember(owner = "client!kba", name = "R", descriptor = "I")
    private int field1338;

    @OriginalMember(owner = "client!kba", name = "S", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!kba", name = "T", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIIB)V")
    private final void method664(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 > -55) {
            this.method11((class148) null, -114, -44);
        }
        ++field1327;
        int var5 = arg2 > 2048 ? arg2 - (-arg1 - -(arg1 * arg2 >> 12)) : (4096 - -arg1) * arg2 >> 12;
        if (var5 <= 0) {
            this.field1326 = this.field1328 = this.field1336 = arg2;
        } else {
            int var6 = arg0 * 6;
            int var7 = -var5 + arg2 + arg2;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var9 != -1) {
                if (~var9 != -2) {
                    if (~var9 != -3) {
                        if (var9 != 3) {
                            if (var9 != 4) {
                                if (~var9 == -6) {
                                    this.field1336 = var15;
                                    this.field1328 = var7;
                                    this.field1326 = var5;
                                }
                            } else {
                                this.field1336 = var5;
                                this.field1328 = var7;
                                this.field1326 = var14;
                            }
                        } else {
                            this.field1326 = var7;
                            this.field1328 = var15;
                            this.field1336 = var5;
                        }
                    } else {
                        this.field1326 = var7;
                        this.field1328 = var5;
                        this.field1336 = var14;
                    }
                } else {
                    this.field1336 = var7;
                    this.field1326 = var15;
                    this.field1328 = var5;
                }
            } else {
                this.field1326 = var5;
                this.field1336 = var7;
                this.field1328 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IB)[[I")
    public final int[][] method409(int arg0, byte arg1) {
        ++field1331;
        int[][] var3 = super.field772.method2906(8, arg0);
        if (arg1 > -20) {
            this.field1333 = -7;
        }
        if (super.field772.field6899) {
            int[][] var4 = this.method407(0, (byte) 41, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class438.field5847; ++var11) {
                this.method667(var6[var11], var5[var11], var7[var11], (byte) -128);
                this.field1332 += this.field1334;
                this.field1338 += this.field1329;
                for (this.field1333 += this.field1337; ~this.field1333 > -1; this.field1333 += 4096) {
                }
                if (~this.field1332 > -1) {
                    this.field1332 = 0;
                }
                while (~this.field1333 < -4097) {
                    this.field1333 -= 4096;
                }
                if (~this.field1338 > -1) {
                    this.field1338 = 0;
                }
                if (~this.field1332 < -4097) {
                    this.field1332 = 4096;
                }
                if (~this.field1338 < -4097) {
                    this.field1338 = 4096;
                }
                this.method664(this.field1333, this.field1332, this.field1338, (byte) -56);
                var8[var11] = this.field1326;
                var9[var11] = this.field1328;
                var10[var11] = this.field1336;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)V")
    public static void method665(byte arg0) {
        if (arg0 == -115) {
            field1335 = null;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lgw;II)V")
    public final void method11(class148 arg0, int arg1, int arg2) {
        ++field1330;
        if (arg1 != -1) {
            method666(-83);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field1329 = (arg0.method1062(arg1 ^ 21187) << 12) / 100;
                }
            } else {
                this.field1334 = (arg0.method1062(-21188) << 12) / 100;
            }
        } else {
            this.field1337 = arg0.method1047(0);
        }
    }

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "(I)V")
    public static final void method666(int arg0) {
        ++field1325;
        class58.field738.method500(((float) class56.field668.field6863 * 0.1F + 0.7F) * class377.field5205);
        if (arg0 > 114) {
            class58.field738.method520(class451.field6369, class644.field9377, class168.field2630, (float) (class442.field5895 << 0), (float) (class595.field8782 << 0), (float) (class533.field7941 << 0));
            class58.field738.method426(class584.field8576);
        }
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(IIIB)V")
    private final void method667(int arg0, int arg1, int arg2, byte arg3) {
        ++field1340;
        int var5 = arg1 > arg0 ? arg1 : arg0;
        int var6 = ~arg1 > ~arg0 ? arg1 : arg0;
        int var7 = ~arg2 >= ~var5 ? var5 : arg2;
        int var8 = arg2 < var6 ? arg2 : var6;
        this.field1338 = (var7 + var8) / 2;
        int var9 = -var8 + var7;
        if (var9 <= 0) {
            this.field1333 = 0;
        } else {
            int var10 = (var7 - arg1 << 12) / var9;
            int var11 = (-arg0 + var7 << 12) / var9;
            int var12 = (-arg2 + var7 << 12) / var9;
            if (arg1 != var7) {
                if (arg0 != var7) {
                    this.field1333 = arg1 == var8 ? var11 + 12288 : -var10 + 20480;
                } else {
                    this.field1333 = ~arg2 == ~var8 ? 4096 - -var10 : -var12 + 12288;
                }
            } else {
                this.field1333 = ~arg0 == ~var8 ? 20480 - -var12 : 4096 - var11;
            }
            this.field1333 /= 6;
        }
        if (this.field1338 > 0 && ~this.field1338 > -4097) {
            this.field1332 = (var9 << 12) / (this.field1338 > 2048 ? -(this.field1338 * 2) + 8192 : this.field1338 * 2);
        } else {
            this.field1332 = 0;
        }
        if (arg3 >= -56) {
            this.field1333 = -25;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(I[SII[Ljava/lang/String;)V")
    public static final void method668(int arg0, short[] arg1, int arg2, int arg3, String[] arg4) {
        if (arg0 == 1) {
            if (~arg3 > ~arg2) {
                int var5 = (arg2 + arg3) / 2;
                int var6 = arg3;
                String var7 = arg4[var5];
                arg4[var5] = arg4[arg2];
                arg4[arg2] = var7;
                short var8 = arg1[var5];
                arg1[var5] = arg1[arg2];
                arg1[arg2] = var8;
                for (int var9 = arg3; var9 < arg2; ++var9) {
                    if (var7 == null || arg4[var9] != null && ~(var9 & 1) < ~arg4[var9].compareTo(var7)) {
                        String var10 = arg4[var9];
                        arg4[var9] = arg4[var6];
                        arg4[var6] = var10;
                        short var11 = arg1[var9];
                        arg1[var9] = arg1[var6];
                        arg1[var6++] = var11;
                    }
                }
                arg4[arg2] = arg4[var6];
                arg4[var6] = var7;
                arg1[arg2] = arg1[var6];
                arg1[var6] = var8;
                method668(1, arg1, var6 + -1, arg3, arg4);
                method668(1, arg1, arg2, var6 + 1, arg4);
            }
            ++field1324;
        }
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "()V")
    public class89() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lvp;I)V")
    public static final void method669(class162 arg0, int arg1) {
        if (arg0.field2552 == 5 && ~arg0.field2434 != 0) {
            class32.method208(arg0, class99.field1445, 2);
        }
        if (arg1 != -26747) {
            field1339 = 67;
        }
        ++field1323;
    }

    static {
        new class572("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field1335 = new class19();
    }
}
