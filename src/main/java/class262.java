import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class262 extends class214 {

    @OriginalMember(owner = "client!ns", name = "W", descriptor = "I")
    private int field3657 = 0;

    @OriginalMember(owner = "client!ns", name = "Y", descriptor = "[S")
    private short[] field3659 = new short[257];

    @OriginalMember(owner = "client!ns", name = "V", descriptor = "Ltm;")
    public static class112 field3656 = new class112("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!ns", name = "Z", descriptor = "Lfn;")
    public static class52 field3660 = new class52(90, 0);

    @OriginalMember(owner = "client!ns", name = "J", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!ns", name = "K", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!ns", name = "M", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!ns", name = "N", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!ns", name = "O", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!ns", name = "P", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!ns", name = "R", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!ns", name = "U", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!ns", name = "X", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!ns", name = "ab", descriptor = "Ldr;")
    public static class250 field3661;

    @OriginalMember(owner = "client!ns", name = "bb", descriptor = "Loj;")
    public static class485 field3662;

    @OriginalMember(owner = "client!ns", name = "S", descriptor = "[I")
    private int[] field3653;

    @OriginalMember(owner = "client!ns", name = "T", descriptor = "[I")
    private int[] field3654;

    @OriginalMember(owner = "client!ns", name = "L", descriptor = "[[I")
    private int[][] field3647;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "(I)V")
    public static void method1620(int arg0) {
        field3660 = null;
        if (arg0 <= 44) {
            field3661 = null;
        }
        field3656 = null;
        field3662 = null;
        field3661 = null;
    }

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "(I)V")
    public final void method12(int arg0) {
        if (this.field3647 == null) {
            this.field3647 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field3648;
        if (~this.field3647.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field3657 == -3) {
                this.method1623(true);
            }
            class407.method2390((byte) -128);
            this.method1625((byte) -6);
            if (arg0 != 27108) {
                field3661 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BI)[I")
    public final int[] method14(byte arg0, int arg1) {
        ++field3649;
        int[] var3 = super.field3024.method2585(arg1, 0);
        if (arg0 != 123) {
            field3656 = null;
        }
        if (super.field3024.field6135) {
            int[] var4 = this.method1352(arg1, 0, -35);
            for (int var5 = 0; class399.field5585 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field3659[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)[I")
    private final int[] method1621(int arg0, int arg1) {
        int var3 = 11 % ((-32 - arg1) / 45);
        ++field3652;
        if (~arg0 > -1) {
            return this.field3653;
        } else {
            return ~arg0 <= ~this.field3647.length ? this.field3654 : this.field3647[arg0];
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(BI)V")
    public static final void method1622(byte arg0, int arg1) {
        ++field3658;
        class265 var2 = class440.method2554(arg1, 2, 3);
        int var3 = 27 % ((5 - arg0) / 63);
        var2.method1677(21748);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Llk;II)V")
    public final void method15(class425 arg0, int arg1, int arg2) {
        if (arg1 > -114) {
            this.field3657 = 43;
        }
        ++field3646;
        if (~arg2 == -1) {
            this.field3657 = arg0.method2503(true);
            this.field3647 = new int[arg0.method2503(true)][2];
            for (int var4 = 0; var4 < this.field3647.length; ++var4) {
                this.field3647[var4][0] = arg0.method2508(true);
                this.field3647[var4][1] = arg0.method2508(true);
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(Z)V")
    private final void method1623(boolean arg0) {
        ++field3655;
        if (!arg0) {
            this.field3654 = null;
        }
        int[] var2 = this.field3647[0];
        int[] var3 = this.field3647[1];
        int[] var4 = this.field3647[this.field3647.length + -2];
        int[] var5 = this.field3647[this.field3647.length + -1];
        this.field3653 = new int[] { var2[0] - var3[0] - -var2[0], var2[1] - -var2[1] - var3[1] };
        this.field3654 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] + -var5[1] + var4[1] };
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(IB)Z")
    public static final boolean method1624(int arg0, byte arg1) {
        ++field3651;
        class334 var2 = class58.method435((byte) 47, arg0);
        if (var2 == null) {
            return false;
        } else if (class14.field222 != 3) {
            class355.field4955 = var2.field4576;
            class267.field3718 = var2.field4579;
            if (class96.field1373 != class396.field5558) {
                class381.field5400 = class355.field4955 + 40000;
                class230.field3247 = 50000 - -class355.field4955;
                class363.field5157 = class381.field5400;
            }
            return true;
        } else {
            String var3 = "";
            if (class96.field1373 != class396.field5558) {
                var3 = ":" + (var2.field4576 - -7000);
            }
            String var4 = "";
            int var5 = 65 / ((arg1 - -49) / 44);
            if (class172.field2556 != null) {
                var4 = "/p=" + class172.field2556;
            }
            String var6 = "http://" + var2.field4579 + var3 + "/l=" + class487.field6867 + "/a=" + class303.field4156 + var4 + "/j" + (class486.field6856 ? "1" : "0") + ",o" + (!class389.field5486 ? "0" : "1") + ",a2";
            try {
                class334.field4582.getAppletContext().showDocument(new URL(var6), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)V")
    private final void method1625(byte arg0) {
        if (arg0 != -6) {
            field3662 = null;
        }
        int var2 = this.field3657;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field3647.length - 1 && ~var4 <= ~this.field3647[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field3647[var5 + -1];
                    int[] var7 = this.field3647[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class328.field4534[(8189 & var8) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field3659[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field3647.length + -1 > var14 && var13 >= this.field3647[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field3647[var14 + -1];
                    int[] var16 = this.field3647[var14];
                    int var17 = (var13 - var15[0] << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field3659[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field3647.length + -1 > var22 && ~var21 <= ~this.field3647[var22][0]; ++var22) {
                }
                int[] var23 = this.field3647[var22 + -1];
                int[] var24 = this.field3647[var22];
                int var25 = this.method1621(var22 + -2, -78)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1621(var22 + 1, 68)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var26 + -var27 + var28;
                int var32 = var25 - var31 + -var26;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 - -var36 + var37 + var26;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field3659[var20] = (short) var38;
            }
        }
        ++field3645;
    }

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "(I)I")
    public static final int method1626(int arg0) {
        int var1 = 77 % ((arg0 - 44) / 51);
        ++field3650;
        class104 var2 = class267.field3716;
        synchronized (class267.field3716) {
            return class267.field3716.method652((byte) -61);
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
    public class262() {
        super(1, true);
    }
}
