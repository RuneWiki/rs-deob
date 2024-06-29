import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class260 extends class326 {

    @OriginalMember(owner = "client!im", name = "K", descriptor = "I")
    private int field4083 = 0;

    @OriginalMember(owner = "client!im", name = "T", descriptor = "[S")
    private short[] field4092 = new short[257];

    @OriginalMember(owner = "client!im", name = "U", descriptor = "[Z")
    public static boolean[] field4093 = new boolean[112];

    @OriginalMember(owner = "client!im", name = "J", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!im", name = "L", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!im", name = "M", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!im", name = "N", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!im", name = "O", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!im", name = "Q", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!im", name = "S", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!im", name = "W", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!im", name = "V", descriptor = "Lun;")
    public static class190 field4094;

    @OriginalMember(owner = "client!im", name = "I", descriptor = "[I")
    private int[] field4081;

    @OriginalMember(owner = "client!im", name = "P", descriptor = "[I")
    private int[] field4088;

    @OriginalMember(owner = "client!im", name = "R", descriptor = "[[I")
    private int[][] field4090;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lgh;III)V", line = 3)
    public static final void method1866(class248 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class131.field1938) {
            class124 var4 = class83.field1138[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1788 != null && var4.field1788.field2205.method1237()) {
                arg0.method1213(var4.field1788.field2205, 128, 0, 0, true);
            }
        }
        if (arg3 < class131.field1938) {
            class124 var5 = class83.field1138[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1788 != null && var5.field1788.field2205.method1237()) {
                arg0.method1213(var5.field1788.field2205, 0, 0, 128, true);
            }
        }
        if (arg2 < class131.field1938 && arg3 < class308.field4794) {
            class124 var6 = class83.field1138[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1788 != null && var6.field1788.field2205.method1237()) {
                arg0.method1213(var6.field1788.field2205, 128, 0, 128, true);
            }
        }
        if (arg2 < class131.field1938 && arg3 > 0) {
            class124 var7 = class83.field1138[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1788 != null && var7.field1788.field2205.method1237()) {
                arg0.method1213(var7.field1788.field2205, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)[I", line = 58)
    public final int[] method103(int arg0, int arg1) {
        field4082++;
        if (arg0 > -25) {
            method1871((class212) null, (int[]) null, (byte) 18, (int[]) null, (int[]) null);
        }
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (this.field5112.field3583) {
            int[] var4 = this.method2287(0, arg1, -3896);
            for (int var5 = 0; var5 < class166.field2731; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field4092[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V", line = 332)
    public class260() {
        super(1, true);
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(I)V", line = 105)
    private final void method1867(int arg0) {
        if (arg0 != 0) {
            method1866((class248) null, 89, -2, 89);
        }
        field4089++;
        int var2 = this.field4083;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; (this.field4090.length - 1) > var5 && this.field4090[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field4090[var5 - 1];
                int[] var7 = this.field4090[var5];
                int var8 = this.method1870(var5 - 2, -111)[1];
                int var9 = var7[1];
                int var10 = var6[1];
                int var11 = this.method1870(var5 + 1, -126)[1];
                int var12 = var11 + var10 - var8 - var9;
                int var13 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                int var14 = var13 * var13 >> 12;
                int var15 = var9 - var8;
                int var16 = var8 - var12 - var10;
                int var17 = (var12 * var13 >> 12) * var14 >> 12;
                int var18 = var14 * var16 >> 12;
                int var20 = var13 * var15 >> 12;
                int var21 = var17 + var18 + var10 + var20;
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field4092[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; var24 < (this.field4090.length - 1) && var23 >= this.field4090[var24][0]; var24++) {
                }
                int[] var25 = this.field4090[var24 - 1];
                int[] var26 = this.field4090[var24];
                int var27 = (var23 - var25[0] << 12) / (var26[0] - var25[0]);
                int var28 = 4096 - class282.field4363[var27 >> 5 & 0xFF] >> 1;
                int var29 = 4096 - var28;
                int var30 = var25[1] * var29 + (var26[1] * var28) >> 12;
                if (var30 <= -32768) {
                    var30 = -32767;
                }
                if (var30 >= 32768) {
                    var30 = 32767;
                }
                this.field4092[var22] = (short) var30;
            }
        } else {
            for (int var31 = 0; var31 < 257; var31++) {
                int var32 = var31 << 4;
                int var33;
                for (var33 = 1; var33 < (this.field4090.length - 1) && var32 >= this.field4090[var33][0]; var33++) {
                }
                int[] var34 = this.field4090[var33 - 1];
                int[] var35 = this.field4090[var33];
                int var36 = (var32 - var34[0] << 12) / (var35[0] - var34[0]);
                int var37 = 4096 - var36;
                int var38 = var34[1] * var37 + (var35[1] * var36) >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field4092[var31] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "e", descriptor = "(I)V", line = 285)
    private final void method1868(int arg0) {
        int[] var2 = this.field4090[0];
        field4087++;
        int[] var3 = this.field4090[1];
        if (arg0 == 1381) {
            int[] var4 = this.field4090[this.field4090.length - 1];
            int[] var5 = this.field4090[this.field4090.length - 2];
            this.field4088 = new int[] { var2[0] - (var3[0] - var2[0]), var2[1] + -var3[1] + var2[1] };
            this.field4081 = new int[] { var5[0] + var5[0] - var4[0], var5[1] - -var5[1] + -var4[1] };
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IZLvl;)V", line = 304)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        if (arg0 == 0) {
            this.field4083 = arg2.method58(-288140008);
            this.field4090 = new int[arg2.method58(-288140008)][2];
            for (int var4 = 0; var4 < this.field4090.length; var4++) {
                this.field4090[var4][0] = arg2.method39((byte) 119);
                this.field4090[var4][1] = arg2.method39((byte) 36);
            }
        }
        if (!arg1) {
            field4091++;
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(ZI)V", line = 339)
    public static final void method1869(boolean arg0, int arg1) {
        class34 var2 = class91.method656(arg1, -2, 11);
        if (!arg0) {
            field4093 = (boolean[]) null;
        }
        field4085++;
        var2.method306(13);
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(II)[I", line = 352)
    private final int[] method1870(int arg0, int arg1) {
        if (arg1 >= -103) {
            field4094 = (class190) null;
        }
        field4086++;
        if (arg0 < 0) {
            return this.field4088;
        } else if (arg0 < this.field4090.length) {
            return this.field4090[arg0];
        } else {
            return this.field4081;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lnm;[IB[I[I)V", line = 371)
    public static final void method1871(class212 arg0, int[] arg1, byte arg2, int[] arg3, int[] arg4) {
        if (arg2 != 117) {
            return;
        }
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg3[var5];
            int var8 = arg1[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg0.field4705.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field4705[var9] = null;
                    } else {
                        class281 var10 = class295.method2064(0, var6);
                        int var11 = var10.field4321;
                        class11 var12 = arg0.field4705[var9];
                        if (var12 != null) {
                            if (var12.field198 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field4705[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field209 = 1;
                                    var12.field199 = 0;
                                    var12.field200 = var8;
                                    var12.field204 = 0;
                                    var12.field201 = 0;
                                    class91.method658(var10, true, false, arg0.field4698, 0, arg0.field4731);
                                } else if (var11 == 2) {
                                    var12.field204 = 0;
                                }
                            } else if (var10.field4338 >= class295.method2064(arg2 - 117, var12.field198).field4338) {
                                var12 = arg0.field4705[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class11 var13 = arg0.field4705[var9] = new class11();
                            var13.field209 = 1;
                            var13.field198 = var6;
                            var13.field200 = var8;
                            var13.field201 = 0;
                            var13.field199 = 0;
                            var13.field204 = 0;
                            class91.method658(var10, true, false, arg0.field4698, 0, arg0.field4731);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field4095++;
    }

    @OriginalMember(owner = "client!im", name = "e", descriptor = "(B)V", line = 469)
    public final void method99(byte arg0) {
        field4084++;
        if (this.field4090 == null) {
            this.field4090 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (this.field4090.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field4083 == 2) {
            this.method1868(1381);
        }
        class59.method480(true);
        if (arg0 == 31) {
            this.method1867(0);
        }
    }

    @OriginalMember(owner = "client!im", name = "f", descriptor = "(I)V", line = 505)
    public static void method1872(int arg0) {
        field4093 = null;
        field4094 = null;
        if (arg0 != 32594) {
            method1866((class248) null, -113, -87, 102);
        }
    }
}
