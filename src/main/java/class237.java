import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class237 extends class112 {

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
    private int field3879 = 0;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "[S")
    private short[] field3873 = new short[257];

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "Lwm;")
    public static class152 field3884 = class157.method1048(" est d-Bj-9 dans votre liste noire)3", 97);

    @OriginalMember(owner = "client!ck", name = "Y", descriptor = "Lwm;")
    public static class152 field3887 = class157.method1048("(U1", 104);

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "Z")
    public static boolean field3886 = false;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "Lwm;")
    public static class152 field3876 = class157.method1048(":assist:", 95);

    @OriginalMember(owner = "client!ck", name = "db", descriptor = "Lwm;")
    public static class152 field3892 = class157.method1048("huffman", 101);

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
    public static int field3880 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!ck", name = "Z", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!ck", name = "ab", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!ck", name = "bb", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!ck", name = "cb", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!ck", name = "fb", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!ck", name = "gb", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "[I")
    private int[] field3874;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "[I")
    private int[] field3877;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "[Lcc;")
    public static class248[] field3881;

    @OriginalMember(owner = "client!ck", name = "eb", descriptor = "[[I")
    private int[][] field3893;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)V", line = 5)
    public final void method673(int arg0) {
        field3875++;
        if (this.field3893 == null) {
            this.field3893 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (this.field3893.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (arg0 != 8) {
            this.method1625(93);
        }
        if (this.field3879 == 2) {
            this.method1625(-15999);
        }
        class243.method1667(14);
        this.method1630((byte) 57);
    }

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "(I)V", line = 40)
    private final void method1625(int arg0) {
        int[] var2 = this.field3893[0];
        field3888++;
        int[] var3 = this.field3893[1];
        int[] var4 = this.field3893[this.field3893.length - 1];
        int[] var5 = this.field3893[this.field3893.length - 2];
        this.field3874 = new int[] { var5[0] - (var4[0] - var5[0]), var5[1] - (var4[1] + -var5[1]) };
        if (arg0 != -15999) {
            this.method673(97);
        }
        this.field3877 = new int[] { var2[0] + var2[0] - var3[0], var2[1] + var2[1] + -var3[1] };
    }

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "(I)V", line = 63)
    public static final void method1626(int arg0) {
        class149.field2315.method1619(11300);
        class148.field2297.method1619(11300);
        field3891++;
        if (arg0 < -27) {
            class70.field1012.method1619(11300);
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V", line = 170)
    public class237() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)[I", line = 88)
    public final int[] method53(byte arg0, int arg1) {
        field3883++;
        if (arg0 != -3) {
            return (int[]) null;
        }
        int[] var3 = this.field1585.method1952(arg1, (byte) 66);
        if (this.field1585.field4935) {
            int[] var4 = this.method751(arg1, (byte) 97, 0);
            for (int var5 = 0; var5 < class58.field889; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field3873[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "(I)V", line = 149)
    public static void method1627(int arg0) {
        field3887 = null;
        if (arg0 == 8469) {
            field3876 = null;
            field3881 = null;
            field3884 = null;
            field3892 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILhi;)V", line = 176)
    public final void method52(int arg0, int arg1, class291 arg2) {
        field3889++;
        if (arg1 == 0) {
            this.field3879 = arg2.method2011(arg0 ^ 0xFFFF867D);
            this.field3893 = new int[arg2.method2011(-34)][2];
            for (int var4 = 0; var4 < this.field3893.length; var4++) {
                this.field3893[var4][0] = arg2.method2021((byte) 74);
                this.field3893[var4][1] = arg2.method2021((byte) 74);
            }
        }
        if (arg0 != 31164) {
            method1627(59);
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)[I", line = 203)
    private final int[] method1628(int arg0, int arg1) {
        field3890++;
        if (arg1 < 78) {
            field3876 = (class152) null;
        }
        if (arg0 >= 0) {
            return this.field3893.length > arg0 ? this.field3893[arg0] : this.field3874;
        } else {
            return this.field3877;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLhi;)Lhn;", line = 232)
    public static final class33 method1629(byte arg0, class291 arg1) {
        field3882++;
        return arg0 >= -47 ? (class33) null : new class33(arg1.method1986(true), arg1.method1986(true), arg1.method1986(true), arg1.method1986(true), arg1.method2009((byte) 64), arg1.method2009((byte) 64), arg1.method2011(-17));
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(B)V", line = 253)
    private final void method1630(byte arg0) {
        int var2 = this.field3879;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; this.field3893.length - 1 > var5 && this.field3893[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field3893[var5];
                int[] var7 = this.field3893[var5 - 1];
                int var8 = this.method1628(var5 - 2, 121)[1];
                int var9 = var7[1];
                int var10 = var6[1];
                int var11 = this.method1628(var5 + 1, arg0 + 55)[1];
                int var12 = (var4 - var7[0] << 12) / (var6[0] - var7[0]);
                int var13 = var12 * var12 >> 12;
                int var14 = var9 + var11 - var8 - var10;
                int var15 = var8 - var9 - var14;
                int var16 = var10 - var8;
                int var18 = (var12 * var14 >> 12) * var13 >> 12;
                int var19 = var13 * var15 >> 12;
                int var20 = var12 * var16 >> 12;
                int var21 = var9 + var20 + var18 + var19;
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field3873[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; var24 < this.field3893.length - 1 && var23 >= this.field3893[var24][0]; var24++) {
                }
                int[] var25 = this.field3893[var24];
                int[] var26 = this.field3893[var24 - 1];
                int var27 = (var23 - var26[0] << 12) / (var25[0] - var26[0]);
                int var28 = 4096 - class268.field4522[var27 >> 5 & 0xFF] >> 1;
                int var29 = 4096 - var28;
                int var30 = var26[1] * var29 + (var25[1] * var28) >> 12;
                if (var30 <= -32768) {
                    var30 = -32767;
                }
                if (var30 >= 32768) {
                    var30 = 32767;
                }
                this.field3873[var22] = (short) var30;
            }
        } else {
            for (int var31 = 0; var31 < 257; var31++) {
                int var32 = var31 << 4;
                int var33;
                for (var33 = 1; (this.field3893.length - 1) > var33 && var32 >= this.field3893[var33][0]; var33++) {
                }
                int[] var34 = this.field3893[var33 - 1];
                int[] var35 = this.field3893[var33];
                int var36 = (var32 - var34[0] << 12) / (var35[0] - var34[0]);
                int var37 = 4096 - var36;
                int var38 = var34[1] * var37 + (var35[1] * var36) >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3873[var31] = (short) var38;
            }
        }
        field3885++;
        if (arg0 != 57) {
            method1626(21);
        }
    }
}
