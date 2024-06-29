import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class592 extends class38 {

    @OriginalMember(owner = "client!ot", name = "J", descriptor = "I")
    private int field8401 = 409;

    @OriginalMember(owner = "client!ot", name = "O", descriptor = "I")
    private int field8405 = 204;

    @OriginalMember(owner = "client!ot", name = "G", descriptor = "I")
    private int field8398 = 8;

    @OriginalMember(owner = "client!ot", name = "U", descriptor = "I")
    private int field8411 = 1024;

    @OriginalMember(owner = "client!ot", name = "I", descriptor = "I")
    private int field8400 = 1024;

    @OriginalMember(owner = "client!ot", name = "W", descriptor = "I")
    private int field8413 = 81;

    @OriginalMember(owner = "client!ot", name = "Z", descriptor = "I")
    private int field8416 = 0;

    @OriginalMember(owner = "client!ot", name = "Y", descriptor = "I")
    private int field8415 = 4;

    @OriginalMember(owner = "client!ot", name = "V", descriptor = "Ljt;")
    public static class106 field8412 = new class106(8);

    @OriginalMember(owner = "client!ot", name = "D", descriptor = "I")
    public static int field8395;

    @OriginalMember(owner = "client!ot", name = "E", descriptor = "I")
    private int field8396;

    @OriginalMember(owner = "client!ot", name = "H", descriptor = "I")
    private int field8399;

    @OriginalMember(owner = "client!ot", name = "L", descriptor = "I")
    public static int field8402;

    @OriginalMember(owner = "client!ot", name = "N", descriptor = "I")
    public static int field8404;

    @OriginalMember(owner = "client!ot", name = "P", descriptor = "I")
    public static int field8406;

    @OriginalMember(owner = "client!ot", name = "Q", descriptor = "I")
    private int field8407;

    @OriginalMember(owner = "client!ot", name = "R", descriptor = "I")
    public static int field8408;

    @OriginalMember(owner = "client!ot", name = "S", descriptor = "I")
    public static int field8409;

    @OriginalMember(owner = "client!ot", name = "X", descriptor = "I")
    public static int field8414;

    @OriginalMember(owner = "client!ot", name = "F", descriptor = "[I")
    private int[] field8397;

    @OriginalMember(owner = "client!ot", name = "M", descriptor = "[[I")
    private int[][] field8403;

    @OriginalMember(owner = "client!ot", name = "T", descriptor = "[[I")
    private int[][] field8410;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IILrg;)V", line = 3)
    public final void method190(int arg0, int arg1, class645 arg2) {
        if (arg0 < 34) {
            method3460((int[]) null, (int[]) null, (int[]) null, (class282) null, 56);
        }
        ++field8406;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (~arg1 == -8) {
                                        this.field8400 = arg2.method3712((byte) -114);
                                    }
                                } else {
                                    this.field8413 = arg2.method3712((byte) -110);
                                }
                            } else {
                                this.field8416 = arg2.method3712((byte) -109);
                            }
                        } else {
                            this.field8411 = arg2.method3712((byte) 28);
                        }
                    } else {
                        this.field8405 = arg2.method3712((byte) -112);
                    }
                } else {
                    this.field8401 = arg2.method3712((byte) 97);
                }
            } else {
                this.field8398 = arg2.method3745(-6314);
            }
        } else {
            this.field8415 = arg2.method3745(-6314);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V", line = 94)
    public final void method191(byte arg0) {
        ++field8402;
        this.method3461(true);
        if (arg0 < 120) {
            this.field8403 = null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V", line = 110)
    public static void method3459(int arg0) {
        if (arg0 != 4096) {
            method3459(-127);
        }
        field8412 = null;
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "()V", line = 455)
    public class592() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "([I[I[ILkd;I)V", line = 131)
    public static final void method3460(int[] arg0, int[] arg1, int[] arg2, class282 arg3, int arg4) {
        ++field8395;
        if (arg4 != 1) {
            method3459(-51);
        }
        for (int var5 = 0; ~var5 > ~arg1.length; ++var5) {
            int var6 = arg1[var5];
            int var7 = arg2[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (var7 != 0 && arg3.field6116.length > var9) {
                if ((1 & var7) != 0) {
                    if (~var6 == 0) {
                        arg3.field6116[var9] = null;
                    } else {
                        class288 var10 = class742.field10404.method2663(arg4 + -1, var6);
                        int var11 = var10.field4094;
                        class75 var12 = arg3.field6116[var9];
                        if (var12 != null) {
                            if (var12.field1046 == var6) {
                                if (~var11 == -1) {
                                    var12 = arg3.field6116[var9] = null;
                                } else if (~var11 != -2) {
                                    if (var11 == 2) {
                                        var12.field1048 = 0;
                                    }
                                } else {
                                    var12.field1045 = 0;
                                    var12.field1048 = 0;
                                    var12.field1042 = var8;
                                    var12.field1047 = 1;
                                    var12.field1043 = 0;
                                    if (!arg3.field6095) {
                                        class294.method1865(0, arg3, var10, -91);
                                    }
                                }
                            } else if (var10.field4098 >= class742.field10404.method2663(0, var12.field1046).field4098) {
                                var12 = arg3.field6116[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class75 var13 = arg3.field6116[var9] = new class75();
                            var13.field1047 = 1;
                            var13.field1045 = 0;
                            var13.field1048 = 0;
                            var13.field1046 = var6;
                            var13.field1043 = 0;
                            var13.field1042 = var8;
                            if (!arg3.field6095) {
                                class294.method1865(0, arg3, var10, arg4 ^ -72);
                            }
                        }
                    }
                }
                ++var9;
                var7 >>>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)V", line = 234)
    private final void method3461(boolean arg0) {
        ++field8408;
        Random var2 = new Random((long) this.field8398);
        this.field8399 = 4096 / this.field8398;
        this.field8396 = this.field8413 / 2;
        this.field8407 = 4096 / this.field8415;
        int var3 = this.field8407 / 2;
        this.field8403 = new int[this.field8398][this.field8415 + 1];
        this.field8397 = new int[this.field8398 + 1];
        this.field8410 = new int[this.field8398][this.field8415];
        int var4 = this.field8399 / 2;
        this.field8397[0] = 0;
        for (int var5 = 0; ~this.field8398 < ~var5; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field8399;
                int var7 = (-2048 + class162.method1180(var2, 4096, -94)) * this.field8405 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field8397[var5] = this.field8397[var5 + -1] + var8;
            }
            this.field8403[var5][0] = 0;
            for (int var9 = 0; this.field8415 > var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field8407;
                    int var11 = (-2048 + class162.method1180(var2, 4096, -93)) * this.field8401 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field8403[var5][var9] = this.field8403[var5][var9 + -1] + var12;
                }
                this.field8410[var5][var9] = ~this.field8400 < -1 ? 4096 + -class162.method1180(var2, this.field8400, -124) : 4096;
            }
            this.field8403[var5][this.field8415] = 4096;
        }
        if (!arg0) {
            this.field8416 = 7;
        }
        this.field8397[this.field8398] = 4096;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ljava/lang/String;ZII)V", line = 311)
    public static final void method3462(String arg0, boolean arg1, int arg2, int arg3) {
        class697.method3960(1);
        ++field8404;
        class277.method1760((byte) 96);
        class500.method2974((byte) 122);
        class706.method4015((byte) 125, arg2, arg1, arg0);
        class384.method2471(-127);
        class148.method1084(class736.field10316, 0);
        int var4 = -57 / ((arg3 - -10) / 50);
        class442.method2742((byte) -68, class736.field10316);
        class514.method3039(class736.field10316, true, class640.field8990);
        class189.method1317((byte) -113);
        class632.method3646((byte) -74, class391.field5894);
        class459.method2805(9);
        class438.method2708(false);
        if (class87.field1246 == 3) {
            class49.method363(4, -25);
        } else if (~class87.field1246 == -8) {
            class49.method363(8, -80);
        } else if (~class87.field1246 == -11) {
            class49.method363(11, -92);
        } else {
            if (~class87.field1246 == -2 || class87.field1246 == 2) {
                class119.method866((byte) -16);
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(BI)[I", line = 356)
    public final int[] method199(byte arg0, int arg1) {
        ++field8409;
        int[] var3 = super.field397.method1376(arg1, (byte) -121);
        if (arg0 >= -43) {
            this.field8411 = 65;
        }
        if (super.field397.field3005) {
            int var4 = 0;
            int var5;
            for (var5 = class136.field1816[arg1] + this.field8416; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (this.field8398 > var4 && this.field8397[var4] <= var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (var4 & 1) == 0;
            int var8 = this.field8397[var4];
            int var9 = this.field8397[var4 + -1];
            if (this.field8396 + var9 < var5 && ~(var8 - this.field8396) < ~var5) {
                for (int var10 = 0; var10 < class729.field10216; ++var10) {
                    int var11 = 0;
                    int var12 = !var7 ? -this.field8411 : this.field8411;
                    int var13;
                    for (var13 = (this.field8407 * var12 >> 12) + class255.field3666[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~this.field8415 < ~var11 && ~var13 <= ~this.field8403[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field8403[var6][var14];
                    int var16 = this.field8403[var6][var11];
                    if (~var13 < ~(this.field8396 + var15) && ~var13 > ~(-this.field8396 + var16)) {
                        var3[var10] = this.field8410[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class319.method2021(var3, 0, class729.field10216, 0);
            }
        }
        return var3;
    }
}
