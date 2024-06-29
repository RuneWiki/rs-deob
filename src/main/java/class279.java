import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class279 extends class170 {

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "[B")
    private byte[] field4809 = new byte[512];

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "I")
    public int field4810 = 4;

    @OriginalMember(owner = "client!ob", name = "cb", descriptor = "Z")
    public boolean field4819 = true;

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "I")
    public int field4808 = 4;

    @OriginalMember(owner = "client!ob", name = "db", descriptor = "I")
    public int field4820 = 0;

    @OriginalMember(owner = "client!ob", name = "eb", descriptor = "I")
    public int field4821 = 1638;

    @OriginalMember(owner = "client!ob", name = "nb", descriptor = "I")
    public int field4830 = 4;

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "Z")
    public static boolean field4811 = true;

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "[I")
    public static int[] field4818 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "[[S")
    public static short[][] field4815 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ob", name = "lb", descriptor = "I")
    public static int field4828 = 0;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!ob", name = "gb", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!ob", name = "hb", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!ob", name = "jb", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!ob", name = "kb", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!ob", name = "ob", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!ob", name = "pb", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!ob", name = "mb", descriptor = "Lem;")
    public static class10 field4829;

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "[S")
    private short[] field4816;

    @OriginalMember(owner = "client!ob", name = "fb", descriptor = "[S")
    public static short[] field4822;

    @OriginalMember(owner = "client!ob", name = "ib", descriptor = "[S")
    private short[] field4825;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([III)V", line = 9)
    public final void method1946(int[] arg0, int arg1, int arg2) {
        field4814++;
        int var4 = class307.field5221[arg1] * this.field4810;
        if (arg2 > -126) {
            field4815 = (short[][]) ((short[][]) null);
        }
        if (this.field4830 == 1) {
            short var5 = this.field4816[0];
            int var6 = this.field4825[0] << 12;
            int var7 = this.field4808 * var6 >> 12;
            int var8 = var4 * var6 >> 12;
            int var9 = this.field4810 * var6 >> 12;
            int var10 = var8 >> 12;
            int var11 = var8 & 0xFFF;
            int var12 = class263.field4565[var11];
            int var13 = var10 + 1;
            if (var9 <= var13) {
                var13 = 0;
            }
            int var14 = this.field4809[var13 & 0xFF] & 0xFF;
            int var15 = this.field4809[var10 & 0xFF] & 0xFF;
            if (this.field4819) {
                for (int var19 = 0; var19 < class185.field3225; var19++) {
                    int var20 = class118.field2002[var19] * this.field4808;
                    int var21 = this.method1949(var15, var7, var14, var11, var6 * var20 >> 12, var12, 4095);
                    int var22 = var5 * var21 >> 12;
                    arg0[var19] = (var22 >> 1) + 2048;
                }
            } else {
                for (int var16 = 0; var16 < class185.field3225; var16++) {
                    int var17 = class118.field2002[var16] * this.field4808;
                    int var18 = this.method1949(var15, var7, var14, var11, var6 * var17 >> 12, var12, 4095);
                    arg0[var16] = var5 * var18 >> 12;
                }
            }
            return;
        }
        short var23 = this.field4816[0];
        if (var23 > 8 || var23 < -8) {
            int var24 = this.field4825[0] << 12;
            int var25 = this.field4810 * var24 >> 12;
            int var26 = var4 * var24 >> 12;
            int var27 = var26 >> 12;
            int var28 = this.field4808 * var24 >> 12;
            int var29 = var26 & 0xFFF;
            int var30 = class263.field4565[var29];
            int var31 = var27 + 1;
            int var32 = this.field4809[var27 & 0xFF] & 0xFF;
            if (var25 <= var31) {
                var31 = 0;
            }
            int var33 = this.field4809[var31 & 0xFF] & 0xFF;
            for (int var34 = 0; var34 < class185.field3225; var34++) {
                int var35 = class118.field2002[var34] * this.field4808;
                int var36 = this.method1949(var32, var28, var33, var29, var24 * var35 >> 12, var30, 4095);
                arg0[var34] = var23 * var36 >> 12;
            }
        }
        for (int var37 = 1; var37 < this.field4830; var37++) {
            short var38 = this.field4816[var37];
            if (var38 > 8 || var38 < -8) {
                int var39 = this.field4825[var37] << 12;
                int var40 = this.field4808 * var39 >> 12;
                int var41 = var4 * var39 >> 12;
                int var42 = this.field4810 * var39 >> 12;
                int var43 = var41 >> 12;
                int var44 = var43 + 1;
                int var45 = this.field4809[var43 & 0xFF] & 0xFF;
                int var46 = var41 & 0xFFF;
                int var47 = class263.field4565[var46];
                if (var42 <= var44) {
                    var44 = 0;
                }
                int var48 = this.field4809[var44 & 0xFF] & 0xFF;
                if (this.field4819 && (this.field4830 - 1) == var37) {
                    for (int var49 = 0; var49 < class185.field3225; var49++) {
                        int var50 = class118.field2002[var49] * this.field4808;
                        int var51 = this.method1949(var45, var40, var48, var46, var39 * var50 >> 12, var47, 4095);
                        int var52 = (var38 * var51 >> 12) + arg0[var49];
                        arg0[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; var53 < class185.field3225; var53++) {
                        int var54 = class118.field2002[var53] * this.field4808;
                        int var55 = this.method1949(var45, var40, var48, var46, var39 * var54 >> 12, var47, 4095);
                        arg0[var53] += var38 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)I", line = 167)
    public static final int method1947(int arg0, int arg1) {
        field4812++;
        int var2 = 52 / ((arg0 - 49) / 57);
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V", line = 545)
    public class279() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLbg;)Lmh;", line = 182)
    public static final class128 method1948(byte arg0, class194 arg1) {
        if (arg0 != 100) {
            field4815 = (short[][]) ((short[][]) null);
        }
        field4826++;
        return class195.method1355(arg1, 32767, (byte) 84);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)[I", line = 195)
    public final int[] method69(byte arg0, int arg1) {
        if (arg0 != 85) {
            method1954(false, (byte[]) null);
        }
        field4827++;
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            this.method1946(var3, arg1, -128);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIII)I", line = 228)
    private final int method1949(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4817++;
        int var8 = arg3 - 4096;
        int var9 = arg4 >> 12;
        int var10 = var9 + 1;
        int var11 = arg4 & arg6;
        if (arg1 <= var10) {
            var10 = 0;
        }
        int var12 = var9 & 0xFF;
        int var13 = var10 & 0xFF;
        int var14 = this.field4809[arg0 + var12] & 0x3;
        int var15;
        if (var14 <= 1) {
            var15 = var14 == 0 ? var11 + arg3 : -var11 + arg3;
        } else {
            var15 = var14 == 2 ? var11 - arg3 : -var11 - arg3;
        }
        int var16 = var11 - 4096;
        int var17 = this.field4809[arg0 + var13] & 0x3;
        int var18 = class263.field4565[var11];
        int var19;
        if (var17 <= 1) {
            var19 = var17 == 0 ? arg3 + var16 : arg3 - var16;
        } else {
            var19 = var17 == 2 ? var16 - arg3 : -arg3 + -var16;
        }
        int var20 = ((var19 - var15) * var18 >> 12) + var15;
        int var21 = this.field4809[arg2 + var12] & 0x3;
        int var22;
        if (var21 > 1) {
            var22 = var21 == 2 ? var11 - var8 : -var8 + -var11;
        } else {
            var22 = var21 == 0 ? var8 + var11 : var8 - var11;
        }
        int var23 = this.field4809[arg2 + var13] & 0x3;
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var16 - var8 : -var16 - var8;
        } else {
            var24 = var23 == 0 ? var8 + var16 : -var16 + var8;
        }
        int var25 = ((var24 - var22) * var18 >> 12) + var22;
        return var20 + ((var25 - var20) * arg5 >> 12);
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V", line = 300)
    public static final void method1950(int arg0) {
        field4813++;
        int var1 = 110 % ((arg0 + 31) / 52);
        if (class105.field1799 == 10 && class247.field4247) {
            class298.method2039((byte) -52, 28);
        }
        if (class105.field1799 == 30) {
            class298.method2039((byte) -52, 25);
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(II)I", line = 334)
    public static int method1951(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(B)V", line = 345)
    public static void method1952(byte arg0) {
        field4829 = null;
        field4822 = null;
        field4818 = null;
        if (arg0 <= 82) {
            field4829 = (class10) null;
        }
        field4815 = (short[][]) null;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V", line = 361)
    public final void method267(int arg0) {
        if (arg0 != -2718) {
            field4811 = true;
        }
        field4831++;
        this.field4809 = class187.method1257((byte) -123, this.field4820);
        this.method1953((byte) -128);
        for (int var2 = this.field4830 - 1; var2 >= 1; var2--) {
            short var3 = this.field4816[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field4830--;
        }
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(B)V", line = 392)
    private final void method1953(byte arg0) {
        int var2 = -94 / ((arg0 + 36) / 42);
        if (this.field4821 > 0) {
            this.field4816 = new short[this.field4830];
            this.field4825 = new short[this.field4830];
            for (int var4 = 0; var4 < this.field4830; var4++) {
                this.field4816[var4] = (short) ((int) (Math.pow((double) ((float) this.field4821 / 4096.0F), (double) var4) * 4096.0D));
                this.field4825[var4] = (short) ((int) Math.pow(2.0D, (double) var4));
            }
        } else if (this.field4816 != null && this.field4816.length == this.field4830) {
            this.field4825 = new short[this.field4830];
            for (int var3 = 0; var3 < this.field4830; var3++) {
                this.field4825[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        field4832++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILbg;B)V", line = 449)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        if (arg0 == 0) {
            this.field4819 = arg1.method1325(7627) == 1;
        } else if (arg0 == 1) {
            this.field4830 = arg1.method1325(7627);
        } else if (arg0 == 2) {
            this.field4821 = arg1.method1354(2);
            if (this.field4821 < 0) {
                this.field4816 = new short[this.field4830];
                for (int var5 = 0; var5 < this.field4830; var5++) {
                    this.field4816[var5] = (short) arg1.method1354(2);
                }
            }
        } else if (arg0 == 3) {
            this.field4808 = this.field4810 = arg1.method1325(7627);
        } else if (arg0 == 4) {
            this.field4820 = arg1.method1325(7627);
        } else if (arg0 == 5) {
            this.field4808 = arg1.method1325(7627);
        } else if (arg0 == 6) {
            this.field4810 = arg1.method1325(7627);
        }
        field4823++;
        if (arg2 != 13) {
            method1948((byte) 56, (class194) null);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z[B)[B", line = 528)
    public static final byte[] method1954(boolean arg0, byte[] arg1) {
        if (arg0) {
            return (byte[]) null;
        }
        field4824++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class224.method1546(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }
}
