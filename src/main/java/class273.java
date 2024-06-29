import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class273 extends class240 {

    @OriginalMember(owner = "client!dm", name = "hb", descriptor = "I")
    private int field4696 = 0;

    @OriginalMember(owner = "client!dm", name = "eb", descriptor = "[S")
    private short[] field4693 = new short[257];

    @OriginalMember(owner = "client!dm", name = "W", descriptor = "I")
    public static int field4685 = 0;

    @OriginalMember(owner = "client!dm", name = "P", descriptor = "[[I")
    public static int[][] field4678 = new int[104][104];

    @OriginalMember(owner = "client!dm", name = "V", descriptor = "Lcd;")
    public static class64 field4684 = class44.method335((byte) 71, "0");

    @OriginalMember(owner = "client!dm", name = "db", descriptor = "Lcd;")
    public static class64 field4692 = class44.method335((byte) 71, "Texturen geladen)3");

    @OriginalMember(owner = "client!dm", name = "bb", descriptor = "I")
    public static int field4690 = 0;

    @OriginalMember(owner = "client!dm", name = "ib", descriptor = "[I")
    public static int[] field4697 = new int[50];

    @OriginalMember(owner = "client!dm", name = "O", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!dm", name = "Q", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!dm", name = "R", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!dm", name = "U", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!dm", name = "X", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!dm", name = "Y", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!dm", name = "Z", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!dm", name = "ab", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!dm", name = "gb", descriptor = "Lkj;")
    public static class167 field4695;

    @OriginalMember(owner = "client!dm", name = "cb", descriptor = "[I")
    private int[] field4691;

    @OriginalMember(owner = "client!dm", name = "fb", descriptor = "[I")
    private int[] field4694;

    @OriginalMember(owner = "client!dm", name = "T", descriptor = "[Lnm;")
    public static class176[] field4682;

    @OriginalMember(owner = "client!dm", name = "S", descriptor = "[[I")
    private int[][] field4681;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(B)V", line = 10)
    private final void method1894(byte arg0) {
        int[] var2 = this.field4681[0];
        field4689++;
        int[] var3 = this.field4681[this.field4681.length - 2];
        int var4 = -44 % ((arg0 - 56) / 50);
        int[] var5 = this.field4681[this.field4681.length - 1];
        int[] var6 = this.field4681[1];
        this.field4691 = new int[] { -var6[0] - (-var2[0] - var2[0]), var2[1] - var6[1] - -var2[1] };
        this.field4694 = new int[] { var3[0] - (var5[0] - var3[0]), var3[1] - var5[1] + var3[1] };
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)[I", line = 28)
    public final int[] method12(int arg0, int arg1) {
        field4683++;
        if (arg0 != 64) {
            this.method1894((byte) -25);
        }
        int[] var3 = this.field4094.method179(arg1, true);
        if (this.field4094.field344) {
            int[] var4 = this.method1745(arg1, 0, (byte) 105);
            for (int var5 = 0; var5 < class169.field2936; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field4693[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(IIII)V", line = 69)
    public static final void method1895(int arg0, int arg1, int arg2, int arg3) {
        field4679++;
        class60 var4 = class25.method229(arg0, (byte) 124, arg2);
        if (var4 != null && var4.field1087 != null) {
            class11 var5 = new class11();
            var5.field229 = var4.field1087;
            var5.field212 = var4;
            class218.method1562((byte) 61, var5);
        }
        class223.field3809 = arg0;
        class185.field3168 = arg2;
        if (arg3 != -185714772) {
            method1895(-101, 117, -13, 44);
        }
        class164.field2883 = arg1;
        class42.field690 = true;
        class190.method1342(var4, 0);
    }

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "(I)V", line = 96)
    private final void method1896(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field4680++;
        int var2 = this.field4696;
        if (var2 == 2) {
            for (int var20 = 0; var20 < 257; var20++) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < (this.field4681.length - 1) && this.field4681[var22][0] <= var21; var22++) {
                }
                int[] var23 = this.field4681[var22 - 1];
                int[] var24 = this.field4681[var22];
                int var25 = this.method1898(var22 - 2, (byte) 60)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1898(var22 + 1, (byte) 84)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] - var23[0]);
                int var30 = var28 - (var25 + var27 - var26);
                int var31 = var25 - var26 - var30;
                int var32 = var29 * var29 >> 12;
                int var33 = var27 - var25;
                int var35 = (var29 * var30 >> 12) * var32 >> 12;
                int var36 = var29 * var33 >> 12;
                int var37 = var31 * var32 >> 12;
                int var38 = var26 + var36 + var37 + var35;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field4693[var20] = (short) var38;
            }
        } else if (var2 == 1) {
            for (int var11 = 0; var11 < 257; var11++) {
                int var12 = var11 << 4;
                int var13;
                for (var13 = 1; (this.field4681.length - 1) > var13 && var12 >= this.field4681[var13][0]; var13++) {
                }
                int[] var14 = this.field4681[var13 - 1];
                int[] var15 = this.field4681[var13];
                int var16 = (var12 - var14[0] << 12) / (var15[0] - var14[0]);
                int var17 = 4096 - class268.field4619[var16 >> 5 & 0xFF] >> 1;
                int var18 = 4096 - var17;
                int var19 = var14[1] * var18 + (var15[1] * var17) >> 12;
                if (var19 <= -32768) {
                    var19 = -32767;
                }
                if (var19 >= 32768) {
                    var19 = 32767;
                }
                this.field4693[var11] = (short) var19;
            }
        } else {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; var5 < (this.field4681.length - 1) && this.field4681[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field4681[var5 - 1];
                int[] var7 = this.field4681[var5];
                int var8 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                int var9 = 4096 - var8;
                int var10 = var6[1] * var9 + var7[1] * var8 >> 12;
                if (var10 <= -32768) {
                    var10 = -32767;
                }
                if (var10 >= 32768) {
                    var10 = 32767;
                }
                this.field4693[var3] = (short) var10;
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "(I)V", line = 276)
    public static void method1897(int arg0) {
        field4697 = null;
        field4684 = null;
        field4692 = null;
        field4678 = (int[][]) null;
        field4682 = null;
        field4695 = null;
        if (arg0 > -43) {
            field4692 = (class64) null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)[I", line = 295)
    private final int[] method1898(int arg0, byte arg1) {
        if (arg1 <= 44) {
            this.method1898(-85, (byte) 110);
        }
        field4677++;
        if (arg0 < 0) {
            return this.field4691;
        } else if (this.field4681.length > arg0) {
            return this.field4681[arg0];
        } else {
            return this.field4694;
        }
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V", line = 326)
    public class273() {
        super(1, true);
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)V", line = 330)
    public final void method288(int arg0) {
        field4686++;
        if (this.field4681 == null) {
            this.field4681 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (arg0 != 17772) {
            return;
        }
        if (this.field4681.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field4696 == 2) {
            this.method1894((byte) 121);
        }
        class92.method692(0);
        this.method1896(-1);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILkh;)V", line = 364)
    public final void method16(int arg0, int arg1, class13 arg2) {
        if (arg1 == 0) {
            this.field4696 = arg2.method152((byte) -79);
            this.field4681 = new int[arg2.method152((byte) -119)][2];
            for (int var4 = 0; var4 < this.field4681.length; var4++) {
                this.field4681[var4][0] = arg2.method112((byte) 92);
                this.field4681[var4][1] = arg2.method112((byte) 92);
            }
        }
        field4688++;
        if (arg0 != 2) {
            field4692 = (class64) null;
        }
    }
}
