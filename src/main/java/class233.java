import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class233 extends class313 {

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
    private int field3861 = 0;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "[S")
    private short[] field3865 = new short[257];

    @OriginalMember(owner = "client!dk", name = "V", descriptor = "[Z")
    public static boolean[] field3867 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!dk", name = "W", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!dk", name = "X", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!dk", name = "Y", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "[I")
    private int[] field3860;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "[I")
    private int[] field3864;

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "[[I")
    private int[][] field3854;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "(I)V", line = 16)
    private final void method1668(int arg0) {
        int[] var2 = this.field3854[0];
        field3858++;
        if (arg0 != 5861) {
            return;
        }
        int[] var3 = this.field3854[1];
        int[] var4 = this.field3854[this.field3854.length - 2];
        int[] var5 = this.field3854[this.field3854.length - 1];
        this.field3860 = new int[] { var2[0] + var2[0] - var3[0], var2[1] + -var3[1] + var2[1] };
        this.field3864 = new int[] { var4[0] - (var5[0] - var4[0]), var4[1] + -var5[1] + var4[1] };
    }

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "(I)V", line = 35)
    private final void method1669(int arg0) {
        field3869++;
        if (arg0 != -15641) {
            method1672(false);
        }
        int var2 = this.field3861;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; this.field3854.length - 1 > var5 && this.field3854[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field3854[var5 - 1];
                int[] var7 = this.field3854[var5];
                int var8 = this.method1671((byte) 78, var5 - 2)[1];
                int var9 = var6[1];
                int var10 = var7[1];
                int var11 = this.method1671((byte) -77, var5 + 1)[1];
                int var12 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                int var13 = var9 + var11 - var8 - var10;
                int var14 = var8 - var9 - var13;
                int var15 = var10 - var8;
                int var17 = var12 * var12 >> 12;
                int var18 = var14 * var17 >> 12;
                int var19 = (var12 * var13 >> 12) * var17 >> 12;
                int var20 = var12 * var15 >> 12;
                int var21 = var19 + var9 + var18 + var20;
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field3865[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; (this.field3854.length - 1) > var24 && var23 >= this.field3854[var24][0]; var24++) {
                }
                int[] var25 = this.field3854[var24 - 1];
                int[] var26 = this.field3854[var24];
                int var27 = (var23 - var25[0] << 12) / (var26[0] - var25[0]);
                int var28 = 4096 - class209.field3548[(var27 & 0x1FF0) >> 5] >> 1;
                int var29 = 4096 - var28;
                int var30 = var25[1] * var29 + (var26[1] * var28) >> 12;
                if (var30 <= -32768) {
                    var30 = -32767;
                }
                if (var30 >= 32768) {
                    var30 = 32767;
                }
                this.field3865[var22] = (short) var30;
            }
        } else {
            for (int var31 = 0; var31 < 257; var31++) {
                int var32 = var31 << 4;
                int var33;
                for (var33 = 1; (this.field3854.length - 1) > var33 && var32 >= this.field3854[var33][0]; var33++) {
                }
                int[] var34 = this.field3854[var33];
                int[] var35 = this.field3854[var33 - 1];
                int var36 = (var32 - var35[0] << 12) / (var34[0] - var35[0]);
                int var37 = 4096 - var36;
                int var38 = var34[1] * var36 + var35[1] * var37 >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3865[var31] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)[I", line = 217)
    public final int[] method111(int arg0, int arg1) {
        field3866++;
        if (arg0 != 4) {
            this.field3860 = (int[]) null;
        }
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (this.field4961.field3451) {
            int[] var4 = this.method2156(0, true, arg1);
            for (int var5 = 0; var5 < class133.field2269; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field3865[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V", line = 373)
    public class233() {
        super(1, true);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILpi;)V", line = 263)
    public final void method185(int arg0, int arg1, class336 arg2) {
        if (arg0 == 0) {
            this.field3861 = arg2.method2364(-9069);
            this.field3854 = new int[arg2.method2364(arg1 + 8779)][2];
            for (int var4 = 0; var4 < this.field3854.length; var4++) {
                this.field3854[var4][0] = arg2.method2339((byte) -46);
                this.field3854[var4][1] = arg2.method2339((byte) -46);
            }
        }
        field3862++;
        if (arg1 != -17848) {
            this.method111(-38, -41);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLjava/lang/String;)V", line = 291)
    public static final void method1670(byte arg0, String arg1) {
        int var2 = class119.method1012(arg1, (byte) 21);
        field3863++;
        if (arg0 == -56 && var2 != -1) {
            int[] var3 = class38.field552.method2253(class222.field3708.field4822[var2] & 0x3FFF, class222.field3708.field4822[var2] >> 14 & 0x3FFF, class222.field3708.field4822[var2] >> 28 & 0x3, 126);
            class5.method27(var3[2], var3[1], (byte) 126);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)[I", line = 309)
    private final int[] method1671(byte arg0, int arg1) {
        field3855++;
        int var3 = -99 % ((4 - arg0) / 34);
        if (arg1 < 0) {
            return this.field3860;
        } else if (this.field3854.length <= arg1) {
            return this.field3864;
        } else {
            return this.field3854[arg1];
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(Z)V", line = 327)
    public static void method1672(boolean arg0) {
        if (!arg0) {
            field3867 = (boolean[]) null;
        }
        field3867 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(CB)Z", line = 338)
    public static final boolean method1673(char arg0, byte arg1) {
        field3856++;
        if (arg1 != -119) {
            field3870 = 58;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V", line = 352)
    public final void method182(int arg0) {
        if (this.field3854 == null) {
            this.field3854 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (arg0 != 25833) {
            this.method1671((byte) 121, -87);
        }
        field3859++;
        if (this.field3854.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field3861 == 2) {
            this.method1668(5861);
        }
        class154.method1238(0);
        this.method1669(arg0 ^ 0xFFFFA60E);
    }
}
