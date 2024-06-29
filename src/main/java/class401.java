import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class401 extends class98 {

    @OriginalMember(owner = "client!ab", name = "bb", descriptor = "I")
    private int field5741 = 1024;

    @OriginalMember(owner = "client!ab", name = "Z", descriptor = "I")
    private int field5739 = 4;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
    private int field5729 = 0;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
    private int field5726 = 81;

    @OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
    private int field5738 = 1024;

    @OriginalMember(owner = "client!ab", name = "hb", descriptor = "I")
    private int field5747 = 409;

    @OriginalMember(owner = "client!ab", name = "jb", descriptor = "I")
    private int field5749 = 8;

    @OriginalMember(owner = "client!ab", name = "mb", descriptor = "I")
    private int field5752 = 204;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
    public static int field5730 = 127;

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "[[B")
    public static byte[][] field5734 = new byte[1000][];

    @OriginalMember(owner = "client!ab", name = "gb", descriptor = "[I")
    public static int[] field5746 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
    public static int field5727 = -1;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "[I")
    public static int[] field5732 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
    private int field5728;

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "I")
    private int field5736;

    @OriginalMember(owner = "client!ab", name = "ab", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!ab", name = "cb", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!ab", name = "eb", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!ab", name = "fb", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!ab", name = "ib", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!ab", name = "kb", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!ab", name = "lb", descriptor = "I")
    private int field5751;

    @OriginalMember(owner = "client!ab", name = "nb", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "Ltq;")
    public static class376 field5725;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "[I")
    private int[] field5731;

    @OriginalMember(owner = "client!ab", name = "X", descriptor = "[[I")
    private int[][] field5737;

    @OriginalMember(owner = "client!ab", name = "db", descriptor = "[[I")
    private int[][] field5743;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILjava/lang/String;)V", line = 5)
    public static final void method2553(int arg0, String arg1) {
        ++field5750;
        System.out.println("Error: " + class130.method802(arg1, -117, "\n", "%0a"));
        if (arg0 != 1024) {
            field5732 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(B)V", line = 25)
    public static void method2554(byte arg0) {
        field5734 = null;
        field5732 = null;
        if (arg0 <= -89) {
            field5746 = null;
            field5725 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(II)Lwc;", line = 40)
    public static final class41 method2555(int arg0, int arg1) {
        ++field5740;
        class41 var2 = (class41) class421.field6016.method856((long) arg0, (byte) 123);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class268.field3810.method2431((byte) 81, 11, arg0);
            class41 var4 = new class41();
            if (var3 != null) {
                var4.method255(arg1 + -938, new class236(var3));
            }
            if (arg1 != 1024) {
                return null;
            } else {
                class421.field6016.method849((byte) 63, var4, (long) arg0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V", line = 104)
    public class401() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 81)
    public final void method188(int arg0) {
        if (arg0 != 1) {
            this.field5741 = -104;
        }
        ++field5733;
        this.method2558(67108863);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILdg;I)V", line = 112)
    public final void method81(int arg0, class236 arg1, int arg2) {
        ++field5735;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (arg0 == 7) {
                                        this.field5741 = arg1.method1617((byte) 48);
                                    }
                                } else {
                                    this.field5726 = arg1.method1617((byte) 48);
                                }
                            } else {
                                this.field5729 = arg1.method1617((byte) 48);
                            }
                        } else {
                            this.field5738 = arg1.method1617((byte) 48);
                        }
                    } else {
                        this.field5752 = arg1.method1617((byte) 48);
                    }
                } else {
                    this.field5747 = arg1.method1617((byte) 48);
                }
            } else {
                this.field5749 = arg1.method1574(arg2 ^ -22);
            }
        } else {
            this.field5739 = arg1.method1574(arg2 + -27);
        }
        if (arg2 != 0) {
            this.method188(-60);
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(IB)V", line = 219)
    public static final void method2556(int arg0, byte arg1) {
        ++field5748;
        if (~class383.field5407 == -1) {
            class385.field5427.method1040(arg0, arg1 + -48);
        } else {
            class311.field4393 = arg0;
        }
        if (arg1 != 10) {
            field5734 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(IB)V", line = 244)
    public static final void method2557(int arg0, byte arg1) {
        ++field5745;
        int var2 = 96 % ((-57 - arg1) / 40);
        class118.field1443.method1629(arg0, 98);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)[I", line = 254)
    public final int[] method83(int arg0, int arg1) {
        ++field5753;
        int[] var3 = super.field1177.method820(arg1, true);
        if (arg0 != 0) {
            return null;
        } else {
            if (super.field1177.field1610) {
                int var4 = 0;
                int var5;
                for (var5 = class163.field2285[arg1] + this.field5729; ~var5 > -1; var5 += 4096) {
                }
                while (~var5 < -4097) {
                    var5 -= 4096;
                }
                while (this.field5749 > var4 && ~var5 <= ~this.field5731[var4]) {
                    ++var4;
                }
                int var6 = var4 - 1;
                boolean var7 = (1 & var4) == 0;
                int var8 = this.field5731[var4];
                int var9 = this.field5731[var4 + -1];
                if (~(this.field5751 + var9) > ~var5 && ~var5 > ~(-this.field5751 + var8)) {
                    for (int var10 = 0; ~var10 > ~class268.field3811; ++var10) {
                        int var11 = !var7 ? -this.field5738 : this.field5738;
                        int var12 = 0;
                        int var13;
                        for (var13 = (this.field5728 * var11 >> 12) + class189.field2722[var10]; ~var13 > -1; var13 += 4096) {
                        }
                        while (var13 > 4096) {
                            var13 -= 4096;
                        }
                        while (~this.field5739 < ~var12 && var13 >= this.field5743[var6][var12]) {
                            ++var12;
                        }
                        int var14 = var12 + -1;
                        int var15 = this.field5743[var6][var14];
                        int var16 = this.field5743[var6][var12];
                        if (var13 > this.field5751 + var15 && ~var13 > ~(-this.field5751 + var16)) {
                            var3[var10] = this.field5737[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class316.method2073(var3, 0, class268.field3811, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V", line = 356)
    private final void method2558(int arg0) {
        ++field5744;
        Random var2 = new Random((long) this.field5749);
        this.field5728 = 4096 / this.field5739;
        this.field5751 = this.field5726 / 2;
        this.field5736 = 4096 / this.field5749;
        int var3 = this.field5728 / 2;
        this.field5731 = new int[this.field5749 + 1];
        int var4 = this.field5736 / 2;
        if (arg0 != 67108863) {
            method2557(-120, (byte) -28);
        }
        this.field5737 = new int[this.field5749][this.field5739];
        this.field5743 = new int[this.field5749][this.field5739 + 1];
        this.field5731[0] = 0;
        for (int var5 = 0; ~this.field5749 < ~var5; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field5736;
                int var7 = (-2048 + class211.method1428(var2, 4096, arg0 + -67108799)) * this.field5752 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field5731[var5] = this.field5731[var5 + -1] - -var8;
            }
            this.field5743[var5][0] = 0;
            for (int var9 = 0; ~this.field5739 < ~var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field5728;
                    int var11 = (class211.method1428(var2, 4096, -111) + -2048) * this.field5747 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field5743[var5][var9] = this.field5743[var5][var9 + -1] + var12;
                }
                this.field5737[var5][var9] = ~this.field5741 >= -1 ? 4096 : -class211.method1428(var2, this.field5741, class2.method10(arg0, -67108743)) + 4096;
            }
            this.field5743[var5][this.field5739] = 4096;
        }
        this.field5731[this.field5749] = 4096;
    }
}
