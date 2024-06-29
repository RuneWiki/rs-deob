import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class33 extends class136 {

    @OriginalMember(owner = "client!bt", name = "E", descriptor = "I")
    private int field377 = 0;

    @OriginalMember(owner = "client!bt", name = "P", descriptor = "[S")
    private short[] field388 = new short[257];

    @OriginalMember(owner = "client!bt", name = "O", descriptor = "[I")
    public static int[] field387 = new int[32];

    @OriginalMember(owner = "client!bt", name = "Q", descriptor = "Lpk;")
    public static class133 field389;

    @OriginalMember(owner = "client!bt", name = "C", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!bt", name = "D", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!bt", name = "F", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!bt", name = "I", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!bt", name = "K", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!bt", name = "L", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!bt", name = "M", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!bt", name = "N", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!bt", name = "G", descriptor = "[I")
    private int[] field379;

    @OriginalMember(owner = "client!bt", name = "J", descriptor = "[I")
    private int[] field382;

    @OriginalMember(owner = "client!bt", name = "H", descriptor = "[[I")
    private int[][] field380;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(III)Z")
    public static final boolean method263(int arg0, int arg1, int arg2) {
        int var3 = 39 % ((arg1 - -46) / 51);
        ++field376;
        return (32 & arg2) != 0;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)[I")
    public final int[] method82(int arg0, int arg1) {
        ++field381;
        int[] var3 = super.field1957.method2887((byte) -112, arg1);
        int var4 = 96 / ((arg0 - 67) / 50);
        if (super.field1957.field7031) {
            int[] var5 = this.method1033(arg1, 0, 0);
            for (int var6 = 0; class467.field6889 > var6; ++var6) {
                int var7 = var5[var6] >> 4;
                if (~var7 > -1) {
                    var7 = 0;
                }
                if (~var7 < -257) {
                    var7 = 256;
                }
                var3[var6] = this.field388[var7];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "(I)V")
    public static void method264(int arg0) {
        field387 = null;
        if (arg0 != 0) {
            field387 = null;
        }
        field389 = null;
    }

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "(I)V")
    private final void method265(int arg0) {
        ++field383;
        int var2 = this.field377;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field380.length + -1 && ~var4 <= ~this.field380[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field380[var5 + -1];
                    int[] var7 = this.field380[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class25.field297[(var8 & 8181) >> 5] + 4096 >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field388[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field380.length + -1) && ~var13 <= ~this.field380[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field380[var14 - 1];
                    int[] var16 = this.field380[var14];
                    int var17 = (var13 - var15[0] << 12) / (var16[0] - var15[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field388[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field380.length + -1) < ~var22 && ~this.field380[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field380[var22 + -1];
                int[] var24 = this.field380[var22];
                int var25 = this.method267(var22 - 2, -90)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method267(var22 + 1, -107)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var26 + -var27 + var28;
                int var32 = -var31 + var25 - var26;
                int var33 = var27 - var25;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 - -var36 + var26 + var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field388[var20] = (short) var38;
            }
        }
        if (arg0 != 29335) {
            this.method267(67, -5);
        }
    }

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "(I)V")
    private final void method266(int arg0) {
        ++field386;
        int[] var2 = this.field380[0];
        int[] var3 = this.field380[1];
        int[] var4 = this.field380[this.field380.length + -2];
        if (arg0 != -17633) {
            method264(52);
        }
        int[] var5 = this.field380[this.field380.length + -1];
        this.field382 = new int[] { var4[0] + -var5[0] + var4[0], -var5[1] - -var4[1] + var4[1] };
        this.field379 = new int[] { var2[0] - (var3[0] - var2[0]), var2[1] + -var3[1] + var2[1] };
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)[I")
    private final int[] method267(int arg0, int arg1) {
        ++field385;
        if (~arg0 > -1) {
            return this.field379;
        } else if (this.field380.length <= arg0) {
            return this.field382;
        } else {
            int var3 = -125 % ((-42 - arg1) / 34);
            return this.field380[arg0];
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILiv;)V")
    public final void method268(int arg0, int arg1, class65 arg2) {
        ++field384;
        if (~arg1 == -1) {
            this.field377 = arg2.method577(255);
            this.field380 = new int[arg2.method577(arg0 ^ 251)][2];
            for (int var4 = 0; var4 < this.field380.length; ++var4) {
                this.field380[var4][0] = arg2.method623((byte) 123);
                this.field380[var4][1] = arg2.method623((byte) 96);
            }
        }
        if (arg0 != 4) {
            this.method267(-14, -64);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)V")
    public final void method269(boolean arg0) {
        if (this.field380 == null) {
            this.field380 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field375;
        if (~this.field380.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field377 == 2) {
                this.method266(-17633);
            }
            class156.method1112(true);
            this.method265(29335);
            if (arg0) {
                this.field380 = null;
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
    public class33() {
        super(1, true);
    }

    static {
        new class331("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field389 = new class133();
    }
}
