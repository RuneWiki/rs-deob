import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class260 extends class335 {

    @OriginalMember(owner = "client!gk", name = "N", descriptor = "I")
    private int field4066 = 0;

    @OriginalMember(owner = "client!gk", name = "ab", descriptor = "[S")
    private short[] field4079 = new short[257];

    @OriginalMember(owner = "client!gk", name = "M", descriptor = "[I")
    public static int[] field4065 = new int[2048];

    @OriginalMember(owner = "client!gk", name = "O", descriptor = "I")
    public static int field4067 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!gk", name = "S", descriptor = "Z")
    public static boolean field4071 = true;

    @OriginalMember(owner = "client!gk", name = "V", descriptor = "Ljava/lang/String;")
    public static String field4074 = "Loading wordpack - ";

    @OriginalMember(owner = "client!gk", name = "cb", descriptor = "I")
    public static int field4081 = 0;

    @OriginalMember(owner = "client!gk", name = "Q", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!gk", name = "T", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!gk", name = "U", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!gk", name = "W", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!gk", name = "X", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!gk", name = "Y", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!gk", name = "Z", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!gk", name = "bb", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!gk", name = "db", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!gk", name = "P", descriptor = "[I")
    private int[] field4068;

    @OriginalMember(owner = "client!gk", name = "R", descriptor = "[I")
    private int[] field4070;

    @OriginalMember(owner = "client!gk", name = "L", descriptor = "[[I")
    private int[][] field4064;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)[I", line = 7)
    public final int[] method149(int arg0, int arg1) {
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (arg1 != 621) {
            this.method1777(113);
        }
        field4069++;
        if (this.field5233.field2467) {
            int[] var4 = this.method2330(arg0, true, 0);
            for (int var5 = 0; var5 < class105.field1630; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field4079[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILkh;I)V", line = 47)
    public final void method230(int arg0, class166 arg1, int arg2) {
        if (arg2 <= 51) {
            this.method230(121, (class166) null, -75);
        }
        field4072++;
        if (arg0 != 0) {
            return;
        }
        this.field4066 = arg1.method1178(0);
        this.field4064 = new int[arg1.method1178(0)][2];
        for (int var4 = 0; var4 < this.field4064.length; var4++) {
            this.field4064[var4][0] = arg1.method1151(-86);
            this.field4064[var4][1] = arg1.method1151(-73);
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(Z)V", line = 79)
    public static void method1775(boolean arg0) {
        field4065 = null;
        field4074 = null;
        if (arg0) {
            method1775(false);
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V", line = 383)
    public class260() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ll;I)V", line = 99)
    public static final void method1776(class133 arg0, int arg1) {
        if (arg1 != -32768) {
            field4071 = true;
        }
        field4076++;
        class62.field999 = arg0;
    }

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "(I)V", line = 110)
    private final void method1777(int arg0) {
        if (arg0 != 0) {
            this.method1777(40);
        }
        field4075++;
        int var2 = this.field4066;
        if (var2 == 2) {
            for (int var20 = 0; var20 < 257; var20++) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < (this.field4064.length - 1) && var21 >= this.field4064[var22][0]; var22++) {
                }
                int[] var23 = this.field4064[var22];
                int[] var24 = this.field4064[var22 - 1];
                int var25 = this.method1778(var22 - 2, (byte) 31)[1];
                int var26 = var24[1];
                int var27 = var23[1];
                int var28 = this.method1778(var22 + 1, (byte) 31)[1];
                int var29 = var28 + var26 - var27 - var25;
                int var30 = (var21 - var24[0] << 12) / (var23[0] - var24[0]);
                int var31 = var25 - var26 - var29;
                int var33 = var30 * var30 >> 12;
                int var34 = var27 - var25;
                int var35 = (var29 * var30 >> 12) * var33 >> 12;
                int var36 = var31 * var33 >> 12;
                int var37 = var30 * var34 >> 12;
                int var38 = var35 + var36 + var37 + var26;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field4079[var20] = (short) var38;
            }
        } else if (var2 == 1) {
            for (int var11 = 0; var11 < 257; var11++) {
                int var12 = var11 << 4;
                int var13;
                for (var13 = 1; var13 < this.field4064.length - 1 && this.field4064[var13][0] <= var12; var13++) {
                }
                int[] var14 = this.field4064[var13];
                int[] var15 = this.field4064[var13 - 1];
                int var16 = (var12 - var15[0] << 12) / (var14[0] - var15[0]);
                int var17 = 4096 - class288.field4490[var16 >> 5 & 0xFF] >> 1;
                int var18 = 4096 - var17;
                int var19 = var14[1] * var17 + var15[1] * var18 >> 12;
                if (var19 <= -32768) {
                    var19 = -32767;
                }
                if (var19 >= 32768) {
                    var19 = 32767;
                }
                this.field4079[var11] = (short) var19;
            }
        } else {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; this.field4064.length - 1 > var5 && this.field4064[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field4064[var5];
                int[] var7 = this.field4064[var5 - 1];
                int var8 = (var4 - var7[0] << 12) / (var6[0] - var7[0]);
                int var9 = 4096 - var8;
                int var10 = var6[1] * var8 + var7[1] * var9 >> 12;
                if (var10 <= -32768) {
                    var10 = -32767;
                }
                if (var10 >= 32768) {
                    var10 = 32767;
                }
                this.field4079[var3] = (short) var10;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(IB)[I", line = 288)
    private final int[] method1778(int arg0, byte arg1) {
        if (arg1 != 31) {
            field4074 = (String) null;
        }
        field4077++;
        if (arg0 >= 0) {
            return this.field4064.length <= arg0 ? this.field4068 : this.field4064[arg0];
        } else {
            return this.field4070;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IBI)I", line = 308)
    public static final int method1779(int arg0, byte arg1, int arg2) {
        field4073++;
        class137 var3 = (class137) class281.field4320.method1222(arg1 ^ 0x1C, (long) arg2);
        if (arg1 != 28) {
            return 88;
        } else if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var3.field2159.length) {
            return var3.field2159[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "(I)V", line = 334)
    private final void method1780(int arg0) {
        int[] var2 = this.field4064[0];
        int[] var3 = this.field4064[1];
        field4082++;
        int[] var4 = this.field4064[this.field4064.length - 2];
        int[] var5 = this.field4064[this.field4064.length - 1];
        this.field4068 = new int[] { var4[arg0] - (var5[0] - var4[0]), var4[1] - var5[1] + var4[1] };
        this.field4070 = new int[] { var2[0] + var2[0] - var3[0], var2[1] + -var3[1] + var2[1] };
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "(I)V", line = 356)
    public final void method381(int arg0) {
        field4080++;
        if (this.field4064 == null) {
            this.field4064 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (this.field4064.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field4066 == 2) {
            this.method1780(0);
        }
        class117.method865(10);
        int var2 = 96 % ((arg0 - 44) / 35);
        this.method1777(0);
    }

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "(I)V", line = 395)
    public static final void method1781(int arg0) {
        class240.field3835 = new class87();
        field4078++;
        if (arg0 != 2) {
            field4081 = -58;
        }
    }
}
