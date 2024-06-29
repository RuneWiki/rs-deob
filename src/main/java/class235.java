import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class235 extends class215 {

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    private int field3884 = 1;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "I")
    private int field3887 = 1;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "I")
    public static int field3883 = 0;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "Lte;")
    public static class244 field3879 = new class244(20);

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "D")
    public static double field3890 = -1.0D;

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "Lte;")
    public static class244 field3886 = new class244(30);

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "Leh;")
    public static class137 field3881;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "[Lnf;")
    public static class227[] field3889;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        ++field3882;
        if (arg0 != 1521146348) {
            field3881 = null;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field3453 = ~arg2.method584(255) == -2;
                }
            } else {
                this.field3887 = arg2.method584(255);
            }
        } else {
            this.field3884 = arg2.method584(255);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBLeh;)[Lwj;")
    public static final class149[] method1664(int arg0, byte arg1, class137 arg2) {
        ++field3880;
        if (!class52.method300(109, arg0, arg2)) {
            return null;
        } else {
            if (arg1 != -127) {
                field3883 = -113;
            }
            return class110.method712((byte) 95);
        }
    }

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "(I)V")
    public static void method1665(int arg0) {
        field3881 = null;
        field3879 = null;
        field3886 = null;
        field3889 = null;
        if (arg0 != -15867) {
            method1666(true, -50);
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class235() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)[[I")
    public final int[][] method46(int arg0, int arg1) {
        if (arg0 != -1) {
            return null;
        } else {
            int[][] var3 = super.field3461.method1126(1, arg1);
            ++field3891;
            if (super.field3461.field2591) {
                int var4 = this.field3887 + 1 + this.field3887;
                int var5 = 65536 / var4;
                int var6 = this.field3884 + 1 + this.field3884;
                int[][][] var7 = new int[var4][][];
                int var8 = 65536 / var6;
                for (int var9 = -this.field3887 + arg1; arg1 - -this.field3887 >= var9; ++var9) {
                    int[][] var19 = this.method1504(-96, 0, var9 & class83.field1026);
                    int[][] var20 = new int[3][class244.field4015];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[1];
                    int[] var26 = var19[2];
                    for (int var27 = -this.field3884; ~var27 >= ~this.field3884; ++var27) {
                        int var37 = var27 & class118.field1673;
                        var22 += var25[var37];
                        var23 += var26[var37];
                        var21 += var24[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (var31 < class244.field4015) {
                        var28[var31] = var8 * var21 >> 16;
                        var29[var31] = var8 * var22 >> 16;
                        var30[var31] = var8 * var23 >> 16;
                        int var32 = class118.field1673 & -this.field3884 + var31;
                        ++var31;
                        int var33 = var22 - var25[var32];
                        int var34 = var23 - var26[var32];
                        int var35 = var21 - var24[var32];
                        int var36 = var31 - -this.field3884 & class118.field1673;
                        var23 = var26[var36] + var34;
                        var21 = var24[var36] + var35;
                        var22 = var25[var36] + var33;
                    }
                    var7[this.field3887 + var9 + -arg1] = var20;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[2];
                int[] var12 = var3[1];
                for (int var13 = 0; var13 < class244.field4015; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; ~var4 < ~var17; ++var17) {
                        int[][] var18 = var7[var17];
                        var15 += var18[1][var13];
                        var14 += var18[0][var13];
                        var16 += var18[2][var13];
                    }
                    var10[var13] = var5 * var14 >> 16;
                    var12[var13] = var5 * var15 >> 16;
                    var11[var13] = var5 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        ++field3888;
        int[] var3 = super.field3445.method1755(arg0, (byte) 118);
        if (arg1 != 255) {
            this.method45(59, 83, (class96) null);
        }
        if (super.field3445.field4163) {
            int var4 = this.field3884 - -1 + this.field3884;
            int var5 = this.field3887 + 1 + this.field3887;
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][] var8 = new int[var5][];
            for (int var9 = -this.field3887 + arg0; this.field3887 + arg0 >= var9; ++var9) {
                int[] var13 = this.method1503(-1, 0, var9 & class83.field1026);
                int var14 = 0;
                int[] var15 = new int[class244.field4015];
                for (int var16 = -this.field3884; this.field3884 >= var16; ++var16) {
                    var14 += var13[var16 & class118.field1673];
                }
                int var17 = 0;
                while (~class244.field4015 < ~var17) {
                    var15[var17] = var6 * var14 >> 16;
                    int var18 = var14 - var13[var17 - this.field3884 & class118.field1673];
                    ++var17;
                    var14 = var13[class118.field1673 & var17 - -this.field3884] + var18;
                }
                var8[var9 - (-this.field3887 + arg0)] = var15;
            }
            for (int var10 = 0; var10 < class244.field4015; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var5; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var7 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZI)Lbb;")
    public static final class124 method1666(boolean arg0, int arg1) {
        ++field3885;
        class124 var2 = (class124) class36.field463.method1693((long) arg1, 97);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class82.field1020.method928(33, (byte) 116, arg1);
            class124 var4 = new class124();
            if (var3 != null) {
                var4.method818(new class96(var3), arg1, arg0);
            }
            class36.field463.method1694(arg0, (long) arg1, var4);
            return var4;
        }
    }
}
