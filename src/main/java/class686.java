import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class686 extends class440 {

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
    private int field9656 = 8;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
    private int field9664 = 4;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
    private int field9658 = 81;

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "I")
    private int field9671 = 204;

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "I")
    private int field9672 = 1024;

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "I")
    private int field9673 = 0;

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "I")
    private int field9675 = 1024;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
    private int field9662 = 409;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "[F")
    public static float[] field9663 = new float[16384];

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "[F")
    public static float[] field9674 = new float[16384];

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "[[I")
    public static int[][] field9660 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
    public static int field9653;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
    public static int field9654;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
    private int field9655;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
    private int field9657;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
    public static int field9659;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "I")
    public static int field9667;

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "I")
    private int field9668;

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    public static int field9669;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "I")
    public static int field9670;

    @OriginalMember(owner = "client!ob", name = "cb", descriptor = "I")
    public static int field9676;

    @OriginalMember(owner = "client!ob", name = "db", descriptor = "I")
    public static int field9677;

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "[I")
    private int[] field9665;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "[[I")
    private int[][] field9661;

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "[[I")
    private int[][] field9666;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field9674[var2] = (float) Math.sin((double) var2 * var0);
            field9663[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II[B)I", line = 9)
    public static final int method3784(int arg0, int arg1, byte[] arg2) {
        if (arg0 != -8) {
            return 73;
        } else {
            ++field9669;
            return class453.method2677(0, arg2, arg1, 57);
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V", line = 23)
    public class686() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILmo;I)V", line = 26)
    public final void method234(int arg0, class695 arg1, int arg2) {
        ++field9659;
        if (arg0 == 5) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (~arg2 != -4) {
                            if (arg2 != 4) {
                                if (~arg2 != -6) {
                                    if (arg2 != 6) {
                                        if (~arg2 == -8) {
                                            this.field9672 = arg1.method3847((byte) 118);
                                        }
                                    } else {
                                        this.field9658 = arg1.method3847((byte) 118);
                                    }
                                } else {
                                    this.field9673 = arg1.method3847((byte) 118);
                                }
                            } else {
                                this.field9675 = arg1.method3847((byte) 118);
                            }
                        } else {
                            this.field9671 = arg1.method3847((byte) 118);
                        }
                    } else {
                        this.field9662 = arg1.method3847((byte) 118);
                    }
                } else {
                    this.field9656 = arg1.method3826(false);
                }
            } else {
                this.field9664 = arg1.method3826(false);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "(I)V", line = 118)
    public static void method3785(int arg0) {
        field9674 = null;
        int var1 = -65 % ((73 - arg0) / 52);
        field9660 = null;
        field9663 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)[I", line = 142)
    public final int[] method229(byte arg0, int arg1) {
        ++field9654;
        int[] var3 = super.field6412.method3250((byte) 5, arg1);
        int var4 = 73 / ((arg0 - -56) / 41);
        if (super.field6412.field8047) {
            int var5 = 0;
            int var6;
            for (var6 = class418.field6099[arg1] - -this.field9673; var6 < 0; var6 += 4096) {
            }
            while (var6 > 4096) {
                var6 -= 4096;
            }
            while (var5 < this.field9656 && ~var6 <= ~this.field9665[var5]) {
                ++var5;
            }
            int var7 = var5 + -1;
            boolean var8 = ~(var5 & 1) == -1;
            int var9 = this.field9665[var5];
            int var10 = this.field9665[var5 - 1];
            if (this.field9668 + var10 < var6 && ~var6 > ~(-this.field9668 + var9)) {
                for (int var11 = 0; class549.field7715 > var11; ++var11) {
                    int var12 = var8 ? this.field9675 : -this.field9675;
                    int var13 = 0;
                    int var14;
                    for (var14 = class499.field7073[var11] - -(this.field9655 * var12 >> 12); ~var14 > -1; var14 += 4096) {
                    }
                    while (var14 > 4096) {
                        var14 -= 4096;
                    }
                    while (this.field9664 > var13 && ~this.field9666[var7][var13] >= ~var14) {
                        ++var13;
                    }
                    int var15 = var13 + -1;
                    int var16 = this.field9666[var7][var15];
                    int var17 = this.field9666[var7][var13];
                    if (~var14 < ~(this.field9668 + var16) && var14 < var17 - this.field9668) {
                        var3[var11] = this.field9661[var7][var15];
                    } else {
                        var3[var11] = 0;
                    }
                }
            } else {
                class476.method2790(var3, 0, class549.field7715, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(BI)Z", line = 240)
    public static final boolean method3786(byte arg0, int arg1) {
        ++field9667;
        if (arg0 != -112) {
            field9660 = null;
        }
        return arg1 == 3 || ~arg1 == -5;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V", line = 259)
    private final void method3787(byte arg0) {
        ++field9670;
        Random var2 = new Random((long) this.field9656);
        this.field9655 = 4096 / this.field9664;
        this.field9668 = this.field9658 / 2;
        this.field9657 = 4096 / this.field9656;
        int var3 = this.field9655 / 2;
        this.field9665 = new int[this.field9656 - -1];
        this.field9666 = new int[this.field9656][this.field9664 - -1];
        int var4 = this.field9657 / 2;
        this.field9661 = new int[this.field9656][this.field9664];
        this.field9665[0] = 0;
        if (arg0 >= 15) {
            for (int var5 = 0; var5 < this.field9656; ++var5) {
                if (~var5 < -1) {
                    int var6 = this.field9657;
                    int var7 = (-2048 + class311.method1976(-1, 4096, var2)) * this.field9671 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field9665[var5] = this.field9665[var5 + -1] + var8;
                }
                this.field9666[var5][0] = 0;
                for (int var9 = 0; var9 < this.field9664; ++var9) {
                    if (var9 > 0) {
                        int var10 = this.field9655;
                        int var11 = (-2048 + class311.method1976(-1, 4096, var2)) * this.field9662 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field9666[var5][var9] = this.field9666[var5][var9 - 1] + var12;
                    }
                    this.field9661[var5][var9] = this.field9672 > 0 ? 4096 - class311.method1976(-1, this.field9672, var2) : 4096;
                }
                this.field9666[var5][this.field9664] = 4096;
            }
            this.field9665[this.field9656] = 4096;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 323)
    public final void method230(int arg0) {
        if (arg0 == -9) {
            this.method3787((byte) 28);
            ++field9653;
        }
    }

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "(I)I", line = 337)
    public static final int method3788(int arg0) {
        ++field9676;
        if (arg0 != 4192) {
            method3786((byte) 38, -35);
        }
        if (class648.field9107 == null) {
            if (!class623.field8731 && ~class340.field5002 < -1) {
                if (class671.field9479 && class603.field8514.method1364(true, 81) && class340.field5002 > 2) {
                    return ((class279) class663.field9367.field716.field9384.field9384).field4220;
                }
                return ((class279) class663.field9367.field716.field9384).field4220;
            }
            int var1 = class508.field7171.method2090(-7249);
            int var2 = class508.field7171.method2093(22302);
            int var3 = class352.field5079;
            int var4 = class101.field1573;
            int var5 = class70.field1246;
            if (var3 < var1 && ~(var3 + var5) < ~var1) {
                int var6 = -1;
                for (int var7 = 0; ~var7 > ~class340.field5002; ++var7) {
                    if (!class566.field7979) {
                        int var11 = (-var7 + class340.field5002 + -1) * 16 + var4 + 31;
                        if (var2 > var11 - 13 && var11 + 3 >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = var4 - -33 - -((-var7 + -1 + class340.field5002) * 16);
                        if (var2 > var12 + -13 && ~var2 >= ~(var12 + 3)) {
                            var6 = var7;
                        }
                    }
                }
                if (~var6 != 0) {
                    int var8 = 0;
                    class177 var9 = new class177(class663.field9367);
                    for (class279 var10 = (class279) var9.method1202(arg0 + -4186); var10 != null; var10 = (class279) var9.method1204(0)) {
                        if (var6 == var8++) {
                            return var10.field4220;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
