import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class300 extends class107 {

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "I")
    private int field4924 = 32768;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "I")
    public static int field4917 = 0;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "Z")
    public static boolean field4918 = false;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "[Lrk;")
    public static class292[] field4921;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "[Lrk;")
    public static class292[] field4926;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "[[[I")
    public static int[][][] field4915;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        if (arg2 != 28) {
            method2061((byte) 9);
        }
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field1660 = arg1.method1849(255) == 1;
            }
        } else {
            this.field4924 = arg1.method1837(252) << 4;
        }
        ++field4928;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
    public class300() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        ++field4920;
        int var3 = 97 % ((-34 - arg0) / 49);
        int[] var4 = super.field1661.method894(116, arg1);
        if (super.field1661.field2115) {
            int[] var5 = this.method756(1, arg1, -29053);
            int[] var6 = this.method756(2, arg1, -29053);
            for (int var7 = 0; class24.field443 > var7; ++var7) {
                int var8 = (4092 & var5[var7]) >> 4;
                int var9 = var6[var7] * this.field4924 >> 12;
                int var10 = class144.field2323[var8] * var9 >> 12;
                int var11 = class76.field1233[var8] * var9 >> 12;
                int var12 = class128.field2053 & (var10 >> 12) + var7;
                int var13 = (var11 >> 12) + arg1 & class107.field1677;
                int[] var14 = this.method756(0, var13, -29053);
                var4[var7] = var14[var12];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(B)V")
    public final void method300(byte arg0) {
        ++field4916;
        if (arg0 != 35) {
            method2061((byte) 63);
        }
        class28.method220((byte) -100);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIILvb;IIB)V")
    public static final void method2060(int arg0, int arg1, int arg2, class62 arg3, int arg4, int arg5, byte arg6) {
        class236.method1621(85, arg2, arg3.field929, arg5, arg0, arg3.field994, arg4, arg1);
        if (arg6 <= -2) {
            ++field4919;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)[[I")
    public final int[][] method190(int arg0, byte arg1) {
        ++field4927;
        if (arg1 != -117) {
            field4918 = false;
        }
        int[][] var3 = super.field1662.method1302(arg0, (byte) 26);
        if (super.field1662.field3063) {
            int[] var4 = this.method756(1, arg0, -29053);
            int[] var5 = this.method756(2, arg0, -29053);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class24.field443 < ~var9; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field4924 >> 12;
                int var12 = class144.field2323[var10] * var11 >> 12;
                int var13 = (var12 >> 12) + var9 & class128.field2053;
                int var14 = class76.field1233[var10] * var11 >> 12;
                int var15 = class107.field1677 & (var14 >> 12) + arg0;
                int[][] var16 = this.method759(0, -128, var15);
                var6[var9] = var16[0][var13];
                var7[var9] = var16[1][var13];
                var8[var9] = var16[2][var13];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(B)V")
    public static void method2061(byte arg0) {
        field4926 = null;
        if (arg0 <= -53) {
            field4915 = null;
            field4921 = null;
        }
    }
}
