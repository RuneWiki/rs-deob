import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class234 extends class300 {

    @OriginalMember(owner = "client!f", name = "S", descriptor = "[S")
    private short[] field3784 = new short[257];

    @OriginalMember(owner = "client!f", name = "Y", descriptor = "I")
    private int field3790 = 0;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "Z")
    public static boolean field3773 = true;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "I")
    public static int field3778 = 0;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "I")
    public static int field3777 = -1;

    @OriginalMember(owner = "client!f", name = "X", descriptor = "Ljava/lang/String;")
    public static String field3789 = "K";

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!f", name = "U", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!f", name = "V", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!f", name = "W", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "[I")
    private int[] field3775;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "[I")
    private int[] field3781;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "[[I")
    private int[][] field3772;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(B)V")
    public static void method1644(byte arg0) {
        if (arg0 <= 123) {
            field3777 = -94;
        }
        field3789 = null;
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
    private final void method1645(int arg0) {
        ++field3787;
        int[] var2 = this.field3772[0];
        int[] var3 = this.field3772[this.field3772.length + -2];
        int[] var4 = this.field3772[this.field3772.length - 1];
        this.field3775 = new int[] { var3[0] - -var3[arg0] - var4[0], -var4[1] - -var3[1] + var3[1] };
        int[] var5 = this.field3772[1];
        this.field3781 = new int[] { var2[0] + var2[0] + -var5[0], var2[1] - (var5[1] - var2[1]) };
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
    public class234() {
        super(1, true);
    }

    @OriginalMember(owner = "client!f", name = "g", descriptor = "(I)V")
    public static final void method1646(int arg0) {
        ++field3779;
        for (class251 var1 = (class251) class241.field3882.method1548(0); var1 != null; var1 = (class251) class241.field3882.method1549(arg0 ^ 1487289168)) {
            if (var1.field4096) {
                var1.method1794(true);
            }
        }
        for (class251 var2 = (class251) class206.field3234.method1548(0); var2 != null; var2 = (class251) class206.field3234.method1549(arg0 + -1487289046)) {
            if (var2.field4096) {
                var2.method1794(true);
            }
        }
        if (arg0 != 1487289132) {
            method1644((byte) -79);
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
    public final void method144(int arg0) {
        if (arg0 <= 126) {
            field3777 = -56;
        }
        ++field3788;
        if (this.field3772 == null) {
            this.field3772 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field3772.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field3790 == 2) {
                this.method1645(0);
            }
            class123.method801(102);
            this.method1649(31873);
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(II)[I")
    private final int[] method1647(int arg0, int arg1) {
        ++field3776;
        if (arg1 > arg0) {
            return this.field3781;
        } else {
            return ~this.field3772.length >= ~arg0 ? this.field3775 : this.field3772[arg0];
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lvl;Lvl;Lvl;Lvl;I)V")
    public static final void method1648(class73 arg0, class73 arg1, class73 arg2, class73 arg3, int arg4) {
        class111.field1601 = arg1;
        class39.field474 = arg0;
        class217.field3394 = arg3;
        ++field3774;
        if (arg4 > 58) {
            class266.field4331 = arg2;
            class68.field1018 = new class231[class217.field3394.method494(107)][];
            class123.field1763 = new boolean[class217.field3394.method494(125)];
        }
    }

    @OriginalMember(owner = "client!f", name = "h", descriptor = "(I)V")
    private final void method1649(int arg0) {
        ++field3785;
        int var2 = this.field3790;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field3772.length + -1 > var5 && ~this.field3772[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field3772[var5];
                    int[] var7 = this.field3772[var5 - 1];
                    int var8 = (-var7[0] + var4 << 12) / (var6[0] + -var7[0]);
                    int var9 = 4096 - class255.field4160[255 & var8 >> 5] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var7[1] * var10 - -(var6[1] * var9) >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field3784[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field3772.length + -1) && this.field3772[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field3772[var14];
                    int[] var16 = this.field3772[var14 + -1];
                    int var17 = (-var16[0] + var13 << 12) / (var15[0] + -var16[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field3784[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field3772.length + -1) && ~this.field3772[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field3772[var22];
                int[] var24 = this.field3772[var22 - 1];
                int var25 = this.method1647(var22 + -2, 0)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1647(var22 + 1, 0)[1];
                int var29 = -var25 + var26;
                int var31 = (-var24[0] + var21 << 12) / (var23[0] + -var24[0]);
                int var32 = -var25 + var28 - (-var27 + var26);
                int var33 = var31 * var31 >> 12;
                int var34 = var29 * var31 >> 12;
                int var35 = (var31 * var32 >> 12) * var33 >> 12;
                int var36 = -var27 + -var32 + var25;
                int var37 = var33 * var36 >> 12;
                int var38 = var37 - -var34 + var27 + var35;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3784[var20] = (short) var38;
            }
        }
        if (arg0 != 31873) {
            this.method1645(59);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method1650(String arg0, int arg1) {
        ++field3782;
        long var2 = 0L;
        int var4 = arg0.length();
        int var5 = 76 / ((-15 - arg1) / 56);
        for (int var6 = 0; ~var4 < ~var6; ++var6) {
            var2 = (var2 << 5) + (-var2 - -((long) arg0.charAt(var6)));
        }
        return var2;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        ++field3783;
        if (~arg2 == -1) {
            this.field3790 = arg0.method1218(-48);
            this.field3772 = new int[arg0.method1218(82)][2];
            for (int var4 = 0; var4 < this.field3772.length; ++var4) {
                this.field3772[var4][0] = arg0.method1186((byte) -101);
                this.field3772[var4][1] = arg0.method1186((byte) -51);
            }
        }
        if (arg1 > -43) {
            this.field3784 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        if (arg1 != -957953300) {
            this.method144(-103);
        }
        ++field3786;
        int[] var3 = super.field4797.method217(arg0, true);
        if (super.field4797.field470) {
            int[] var4 = this.method2018(0, -1, arg0);
            for (int var5 = 0; ~var5 > ~class180.field2826; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field3784[var6];
            }
        }
        return var3;
    }
}
