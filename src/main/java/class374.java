import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class374 extends class136 {

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    private int field5543 = 1;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    private int field5548 = 1;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public static int field5542 = 0;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILiv;)V", line = 3)
    public final void method268(int arg0, int arg1, class65 arg2) {
        ++field5541;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field1966 = ~arg2.method577(arg0 + 251) == -2;
                }
            } else {
                this.field5543 = arg2.method577(arg0 ^ 251);
            }
        } else {
            this.field5548 = arg2.method577(255);
        }
        if (arg0 != 4) {
            this.field5543 = 84;
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V", line = 49)
    public class374() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILuu;)Z", line = 52)
    public static final boolean method2302(int arg0, class188 arg1) {
        ++field5545;
        int var2 = -105 / ((arg0 - 71) / 50);
        if (~class227.field3312 == ~arg1.field2732) {
            class289.field4154 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)[[I", line = 71)
    public final int[][] method272(byte arg0, int arg1) {
        ++field5546;
        int[][] var3 = super.field1952.method3127((byte) 19, arg1);
        if (arg0 <= 33) {
            this.field5548 = 103;
        }
        if (super.field1952.field7770) {
            int var4 = this.field5543 + this.field5543 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field5548 + this.field5548 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg1 - this.field5543; ~var9 >= ~(this.field5543 + arg1); ++var9) {
                int[][] var19 = this.method1036(3, 0, class519.field7637 & var9);
                int[][] var20 = new int[3][class467.field6889];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field5548; ~this.field5548 <= ~var27; ++var27) {
                    int var37 = var27 & class166.field2356;
                    var21 += var24[var37];
                    var22 += var25[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~class467.field6889 < ~var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class166.field2356 & -this.field5548 + var31;
                    int var33 = var22 - var25[var32];
                    int var34 = var21 - var24[var32];
                    ++var31;
                    int var35 = var23 - var26[var32];
                    int var36 = class166.field2356 & this.field5548 + var31;
                    var21 = var24[var36] + var34;
                    var23 = var26[var36] + var35;
                    var22 = var25[var36] + var33;
                }
                var8[this.field5543 - arg1 + var9] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~var13 > ~class467.field6889; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var4 < ~var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var15 += var18[1][var13];
                    var16 += var18[2][var13];
                    var14 += var18[0][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)Lkk;", line = 212)
    public static final class126 method2303(int arg0) {
        ++field5544;
        if (arg0 >= -28) {
            method2302(-117, (class188) null);
        }
        try {
            return new class116();
        } catch (Throwable var2) {
            try {
                return (class126) Class.forName("ci").newInstance();
            } catch (Throwable var1) {
                return new class337();
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)[I", line = 244)
    public final int[] method82(int arg0, int arg1) {
        ++field5547;
        int var3 = 55 % ((67 - arg0) / 50);
        int[] var4 = super.field1957.method2887((byte) -112, arg1);
        if (super.field1957.field7031) {
            int var5 = this.field5543 + this.field5543 + 1;
            int var6 = 65536 / var5;
            int var7 = this.field5548 - -1 + this.field5548;
            int var8 = 65536 / var7;
            int[][] var9 = new int[var5][];
            for (int var10 = -this.field5543 + arg1; ~(arg1 - -this.field5543) <= ~var10; ++var10) {
                int[] var14 = this.method1033(class519.field7637 & var10, 0, 0);
                int[] var15 = new int[class467.field6889];
                int var16 = 0;
                for (int var17 = -this.field5548; this.field5548 >= var17; ++var17) {
                    var16 += var14[var17 & class166.field2356];
                }
                int var18 = 0;
                while (var18 < class467.field6889) {
                    var15[var18] = var8 * var16 >> 16;
                    int var19 = var16 - var14[-this.field5548 + var18 & class166.field2356];
                    ++var18;
                    var16 = var14[class166.field2356 & this.field5548 + var18] + var19;
                }
                var9[this.field5543 + var10 - arg1] = var15;
            }
            for (int var11 = 0; ~var11 > ~class467.field6889; ++var11) {
                int var12 = 0;
                for (int var13 = 0; var13 < var5; ++var13) {
                    var12 += var9[var13][var11];
                }
                var4[var11] = var6 * var12 >> 16;
            }
        }
        return var4;
    }
}
