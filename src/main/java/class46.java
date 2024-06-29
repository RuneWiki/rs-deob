import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class46 extends class115 {

    @OriginalMember(owner = "client!of", name = "S", descriptor = "[S")
    private short[] field591 = new short[257];

    @OriginalMember(owner = "client!of", name = "mb", descriptor = "I")
    private int field611 = 0;

    @OriginalMember(owner = "client!of", name = "Q", descriptor = "I")
    public static int field590 = 50;

    @OriginalMember(owner = "client!of", name = "T", descriptor = "Lek;")
    public static class125 field592 = null;

    @OriginalMember(owner = "client!of", name = "X", descriptor = "Lqe;")
    public static class168 field596 = class66.method448("Mem:", 80);

    @OriginalMember(owner = "client!of", name = "U", descriptor = "Lqe;")
    public static class168 field593 = class66.method448("scrollbar", -121);

    @OriginalMember(owner = "client!of", name = "fb", descriptor = "I")
    public static int field604 = 0;

    @OriginalMember(owner = "client!of", name = "ab", descriptor = "I")
    public static int field599 = 0;

    @OriginalMember(owner = "client!of", name = "nb", descriptor = "I")
    public static int field612 = 0;

    @OriginalMember(owner = "client!of", name = "kb", descriptor = "I")
    public static int field609 = 0;

    @OriginalMember(owner = "client!of", name = "V", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!of", name = "W", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!of", name = "Y", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!of", name = "Z", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!of", name = "bb", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!of", name = "cb", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!of", name = "db", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!of", name = "hb", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!of", name = "ib", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!of", name = "jb", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!of", name = "lb", descriptor = "Lgd;")
    public static class65 field610;

    @OriginalMember(owner = "client!of", name = "gb", descriptor = "[I")
    private int[] field605;

    @OriginalMember(owner = "client!of", name = "ob", descriptor = "[I")
    private int[] field613;

    @OriginalMember(owner = "client!of", name = "eb", descriptor = "[[I")
    private int[][] field603;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)[I")
    private final int[] method300(boolean arg0, int arg1) {
        ++field601;
        if (arg0) {
            return null;
        } else if (arg1 < 0) {
            return this.field613;
        } else {
            return arg1 >= this.field603.length ? this.field605 : this.field603[arg1];
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(IB)V")
    public static final void method301(int arg0, byte arg1) {
        ++field600;
        if (class97.method636(arg0, -123)) {
            if (arg1 > 91) {
                class129[] var2 = class108.field1741[arg0];
                for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                    class129 var4 = var2[var3];
                    if (var4 != null) {
                        var4.field2229 = 0;
                        var4.field2172 = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        if (~arg2 == -1) {
            this.field611 = arg1.method758(true);
            this.field603 = new int[arg1.method758(true)][2];
            for (int var4 = 0; ~this.field603.length < ~var4; ++var4) {
                this.field603[var4][0] = arg1.method731(false);
                this.field603[var4][1] = arg1.method731(false);
            }
        }
        if (arg0 != 107) {
            this.method3((byte) 20, (class112) null, -42);
        }
        ++field606;
    }

    @OriginalMember(owner = "client!of", name = "i", descriptor = "(I)V")
    private final void method302(int arg0) {
        ++field608;
        int[] var2 = this.field603[0];
        int[] var3 = this.field603[this.field603.length + -2];
        int[] var4 = this.field603[1];
        int[] var5 = this.field603[this.field603.length + -1];
        this.field605 = new int[] { var3[0] - (var5[0] + -var3[0]), var3[1] - var5[1] - -var3[1] };
        this.field613 = new int[] { var2[0] + -var4[0] + var2[0], var2[1] + -var4[arg0] + var2[1] };
    }

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(I)V")
    public final void method170(int arg0) {
        ++field597;
        if (arg0 == 395462996) {
            if (this.field603 == null) {
                this.field603 = new int[][] { new int[2], { 4096, 4096 } };
            }
            if (this.field603.length < 2) {
                throw new RuntimeException("Curve operation requires at least two markers");
            } else {
                if (~this.field611 == -3) {
                    this.method302(arg0 + -395462995);
                }
                class142.method969(-15046);
                this.method305(arg0 + -395461182);
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(IB)I")
    public static final int method303(int arg0, byte arg1) {
        if (arg1 != 97) {
            method301(80, (byte) -23);
        }
        ++field607;
        return arg0 & 1023;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(IBI)I")
    public static final int method304(int arg0, byte arg1, int arg2) {
        ++field595;
        int var3 = arg0 >>> 31;
        return arg1 != 2 ? 97 : (arg0 - -var3) / arg2 + -var3;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        int[] var3 = super.field1872.method182((byte) -90, arg0);
        if (super.field1872.field341) {
            int[] var4 = this.method792(0, 0, arg0);
            for (int var5 = 0; ~class130.field2297 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field591[var6];
            }
        }
        ++field594;
        if (arg1 <= 37) {
            method301(114, (byte) 84);
        }
        return var3;
    }

    @OriginalMember(owner = "client!of", name = "j", descriptor = "(I)V")
    private final void method305(int arg0) {
        if (arg0 != 1814) {
            method303(-55, (byte) -101);
        }
        ++field598;
        int var2 = this.field611;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field603.length - 1 > var5 && var4 >= this.field603[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field603[var5 - 1];
                    int[] var7 = this.field603[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = 4096 - class170.field2961[(8189 & var8) >> 5] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field591[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field603.length - 1 > var14 && ~this.field603[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field603[var14 + -1];
                    int[] var16 = this.field603[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field591[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field603.length - 1) < ~var22 && ~this.field603[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field603[var22];
                int[] var24 = this.field603[var22 + -1];
                int var25 = this.method300(false, var22 - 2)[1];
                int var26 = var24[1];
                int var27 = var23[1];
                int var28 = this.method300(false, var22 + 1)[1];
                int var29 = -var25 + -var27 + var28 - -var26;
                int var30 = (-var24[0] + var21 << 12) / (var23[0] - var24[0]);
                int var31 = var25 - var26 + -var29;
                int var32 = var30 * var30 >> 12;
                int var33 = -var25 + var27;
                int var35 = (var29 * var30 >> 12) * var32 >> 12;
                int var36 = var31 * var32 >> 12;
                int var37 = var30 * var33 >> 12;
                int var38 = var36 + var37 + var35 + var26;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field591[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(B)V")
    public static void method306(byte arg0) {
        field610 = null;
        field593 = null;
        field596 = null;
        int var1 = 79 % ((65 - arg0) / 44);
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(III)Ldj;")
    public static final class162 method307(int arg0, int arg1, int arg2) {
        class177 var3 = class254.field4395[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class162 var4 = var3.field3116;
            var3.field3116 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class46() {
        super(1, true);
    }
}
