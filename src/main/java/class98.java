import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class98 extends class89 {

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "I")
    private int field1817 = 4096;

    @OriginalMember(owner = "client!lb", name = "X", descriptor = "[I")
    private int[] field1820 = new int[3];

    @OriginalMember(owner = "client!lb", name = "eb", descriptor = "I")
    private int field1827 = 3216;

    @OriginalMember(owner = "client!lb", name = "ib", descriptor = "I")
    private int field1831 = 3216;

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "Lha;")
    public static class46 field1815 = class271.method1828("Opened titlescreen)3", -46);

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "[I")
    public static int[] field1816 = new int[100];

    @OriginalMember(owner = "client!lb", name = "Z", descriptor = "Lha;")
    public static class46 field1822 = class271.method1828(" )2> <col=ffffff>", -46);

    @OriginalMember(owner = "client!lb", name = "cb", descriptor = "[I")
    public static int[] field1825 = new int[2];

    @OriginalMember(owner = "client!lb", name = "kb", descriptor = "Lha;")
    private static class46 field1833 = class271.method1828("Allocated memory", -46);

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "Lha;")
    public static class46 field1818 = field1833;

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!lb", name = "Y", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!lb", name = "ab", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!lb", name = "bb", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!lb", name = "db", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!lb", name = "fb", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!lb", name = "gb", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!lb", name = "hb", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!lb", name = "jb", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "[I")
    public static int[] field1814;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)V")
    public static final void method758(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1830;
        if (arg0 != -13001) {
            method758(-65, -65, -35, -121, -62);
        }
        class146 var5 = class6.method22((byte) 16, 10, arg4);
        var5.method1088(11102);
        var5.field2643 = arg2;
        var5.field2637 = arg1;
        var5.field2640 = arg3;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field1827 = arg0.method545((byte) 98);
                }
            } else {
                this.field1831 = arg0.method545((byte) -97);
            }
        } else {
            this.field1817 = arg0.method545((byte) 101);
        }
        if (arg1 != -641641492) {
            this.field1820 = null;
        }
        ++field1823;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method759(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (~arg1 == ~arg9 && ~arg0 == ~arg2 && ~arg5 == ~arg8 && ~arg3 == ~arg4) {
            class260.method1741(arg7, arg2, arg3, 31489, arg9, arg8);
        } else {
            int var10 = arg9;
            int var11 = arg2;
            int var12 = arg9 * 3;
            int var13 = arg2 * 3;
            int var14 = arg5 * 3;
            int var15 = arg1 * 3;
            int var16 = arg4 * 3;
            int var17 = -arg9 + var15 + -var14 + arg8;
            int var18 = arg0 * 3;
            int var19 = -var18 + var16 - (-var13 + var18);
            int var20 = -var12 + var15;
            int var21 = -var13 + var18;
            int var22 = var12 + var14 - (var15 - -var15);
            int var23 = var18 - arg2 + (arg3 - var16);
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var22 * var25;
                int var27 = var19 * var25;
                int var28 = var24 * var25 >> 12;
                int var29 = var23 * var28;
                int var30 = var17 * var28;
                int var31 = var21 * var24;
                int var32 = var20 * var24;
                int var33 = (var30 - -var26 + var32 >> 12) + arg9;
                int var34 = arg2 - -(var29 + var31 + var27 >> 12);
                class260.method1741(arg7, var11, var34, 31489, var10, var33);
                var10 = var33;
                var11 = var34;
            }
        }
        ++field1832;
        if (arg6 != 3) {
            field1816 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
    public class98() {
        super(1, true);
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
    private final void method760(int arg0) {
        ++field1829;
        double var2 = Math.cos((double) ((float) this.field1827 / 4096.0F));
        this.field1820[0] = (int) (Math.sin((double) ((float) this.field1831 / 4096.0F)) * var2 * (double) arg0);
        this.field1820[1] = (int) (4096.0D * Math.cos((double) ((float) this.field1831 / 4096.0F)) * var2);
        this.field1820[2] = (int) (Math.sin((double) ((float) this.field1827 / 4096.0F)) * 4096.0D);
        int var4 = this.field1820[2] * this.field1820[2] >> 12;
        int var5 = this.field1820[1] * this.field1820[1] >> 12;
        int var6 = this.field1820[0] * this.field1820[0] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var5 + var6 + var4 >> 12)));
        if (~var7 != -1) {
            this.field1820[0] = (this.field1820[0] << 12) / var7;
            this.field1820[1] = (this.field1820[1] << 12) / var7;
            this.field1820[2] = (this.field1820[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        int var3 = -122 / ((51 - arg1) / 44);
        int[] var4 = super.field1688.method936(1, arg0);
        ++field1824;
        if (super.field1688.field2200) {
            int var5 = class1.field17 * this.field1817 >> 12;
            int[] var6 = this.method685(93, class231.field4015 & arg0 - 1, 0);
            int[] var7 = this.method685(-87, arg0, 0);
            int[] var8 = this.method685(78, arg0 + 1 & class231.field4015, 0);
            for (int var9 = 0; ~class241.field4284 < ~var9; ++var9) {
                int var10 = (var8[var9] + -var6[var9]) * var5 >> 12;
                int var11 = (var7[class115.field2177 & var9 + -1] - var7[class115.field2177 & var9 + 1]) * var5 >> 12;
                int var12 = var10 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                int var13 = var11 >> 4;
                if (var12 > 255) {
                    var12 = 255;
                }
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~var13 < -256) {
                    var13 = 255;
                }
                int var14 = 255 & class14.field213[((var12 + 1) * var12 >> 1) + var13];
                int var15 = var14 * 4096 >> 8;
                int var16 = var11 * var14 >> 8;
                int var17 = var10 * var14 >> 8;
                int var18 = this.field1820[0] * var16 >> 12;
                int var19 = this.field1820[1] * var17 >> 12;
                int var20 = this.field1820[2] * var15 >> 12;
                var4[var9] = var19 + var20 + var18;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
    public final void method8(boolean arg0) {
        this.method760(4096);
        if (!arg0) {
            this.method760(-53);
        }
        ++field1828;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/util/Random;ZI)I")
    public static final int method761(Random arg0, boolean arg1, int arg2) {
        ++field1821;
        if (~arg2 >= -1) {
            throw new IllegalArgumentException();
        } else if (class12.method63(arg2, !arg1)) {
            return (int) ((long) arg2 * (4294967295L & (long) arg0.nextInt()) >> 32);
        } else {
            if (arg1) {
                method758(-122, 125, -32, 88, -102);
            }
            int var3 = -((int) (4294967296L % (long) arg2)) + Integer.MIN_VALUE;
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (~var4 <= ~var3);
            return class28.method198(-126, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZILmb;Lmb;ZZI)I")
    public static final int method762(boolean arg0, int arg1, class119 arg2, class119 arg3, boolean arg4, boolean arg5, int arg6) {
        ++field1826;
        int var7 = class50.method367((byte) -95, arg5, arg3, arg2, arg6);
        if (~var7 != -1) {
            return arg5 ? -var7 : var7;
        } else if (~arg1 == 0) {
            return 0;
        } else {
            int var8 = class50.method367((byte) -95, arg4, arg3, arg2, arg1);
            if (arg0) {
                return 94;
            } else {
                return arg4 ? -var8 : var8;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIII)I")
    public static final int method763(boolean arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 3;
        ++field1819;
        if (~var4 == -1) {
            return arg3;
        } else {
            if (!arg0) {
                field1816 = null;
            }
            if (~var4 == -2) {
                return -arg1 + 7;
            } else {
                return var4 == 2 ? -arg3 + 7 : arg1;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)V")
    public static void method764(int arg0) {
        field1816 = null;
        field1818 = null;
        field1814 = null;
        field1825 = null;
        field1822 = null;
        if (arg0 > -32) {
            field1814 = null;
        }
        field1815 = null;
        field1833 = null;
    }
}
