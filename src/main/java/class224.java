import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class224 extends class21 {

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
    public static int field3532 = 0;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "Lte;")
    public static class124 field3528;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIII)V", line = 10)
    public static final void method1483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class177.method1111(arg5, true);
        int var7 = arg5 - arg6;
        if (var7 < 0) {
            var7 = 0;
        }
        field3526++;
        int var8 = arg5;
        int var9 = 0;
        int var10 = var7;
        int var11 = -arg5;
        int var12 = -var7;
        int var13 = -1;
        if (arg0 <= 100) {
            method1483(-90, -7, 89, 116, -36, 114, 14);
        }
        int var14 = arg1 - var7;
        int var15 = -1;
        int[] var16 = class155.field2522[arg2];
        class241.method1598(arg4, -7, var16, var14, arg1 - arg5);
        int var17 = arg1 + var7;
        class241.method1598(arg3, -7, var16, var17, var14);
        class241.method1598(arg4, -7, var16, arg1 + arg5, var17);
        while (var9 < var8) {
            var15 += 2;
            var13 += 2;
            var11 += var13;
            var12 += var15;
            if (var12 >= 0 && var10 >= 1) {
                class322.field4897[var10] = var9;
                var10--;
                var12 -= var10 << 1;
            }
            var9++;
            if (var11 >= 0) {
                var8--;
                var11 -= var8 << 1;
                if (var8 >= var7) {
                    int[] var18 = class155.field2522[arg2 + var8];
                    int[] var19 = class155.field2522[arg2 - var8];
                    int var20 = arg1 + var9;
                    int var21 = arg1 - var9;
                    class241.method1598(arg4, -7, var18, var20, var21);
                    class241.method1598(arg4, -7, var19, var20, var21);
                } else {
                    int[] var22 = class155.field2522[arg2 + var8];
                    int[] var23 = class155.field2522[arg2 - var8];
                    int var24 = class322.field4897[var8];
                    int var25 = arg1 + var9;
                    int var26 = arg1 + var24;
                    int var27 = arg1 - var9;
                    int var28 = arg1 - var24;
                    class241.method1598(arg4, -7, var22, var28, var27);
                    class241.method1598(arg3, -7, var22, var26, var28);
                    class241.method1598(arg4, -7, var22, var25, var26);
                    class241.method1598(arg4, -7, var23, var28, var27);
                    class241.method1598(arg3, -7, var23, var26, var28);
                    class241.method1598(arg4, -7, var23, var25, var26);
                }
            }
            int[] var29 = class155.field2522[arg2 + var9];
            int[] var30 = class155.field2522[arg2 - var9];
            int var31 = arg1 + var8;
            int var32 = arg1 - var8;
            if (var9 >= var7) {
                class241.method1598(arg4, -7, var29, var31, var32);
                class241.method1598(arg4, -7, var30, var31, var32);
            } else {
                int var33 = var10 >= var9 ? var10 : class322.field4897[var9];
                int var34 = arg1 - var33;
                int var35 = arg1 + var33;
                class241.method1598(arg4, -7, var29, var34, var32);
                class241.method1598(arg3, -7, var29, var35, var34);
                class241.method1598(arg4, -7, var29, var31, var35);
                class241.method1598(arg4, -7, var30, var34, var32);
                class241.method1598(arg3, -7, var30, var35, var34);
                class241.method1598(arg4, -7, var30, var31, var35);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(IIB)V", line = 142)
    private final void method1484(int arg0, int arg1, byte arg2) {
        field3527++;
        int var4 = class51.field1027[arg0];
        int var5 = class330.field5058[arg1];
        int var6 = -90 % ((arg2 + 42) / 53);
        float var7 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if (-3.141592653589793D <= (double) var7 && (double) var7 <= -2.356194490192345D) {
            class43.field818 = arg1;
            class28.field538 = arg0;
        } else if ((double) var7 <= -1.5707963267948966D && -2.356194490192345D <= (double) var7) {
            class43.field818 = arg0;
            class28.field538 = arg1;
        } else if ((double) var7 <= -0.7853981633974483D && -1.5707963267948966D <= (double) var7) {
            class43.field818 = arg0;
            class28.field538 = class294.field4489 - arg1;
        } else if (var7 <= 0.0F && (double) var7 >= -0.7853981633974483D) {
            class43.field818 = class147.field2421 - arg1;
            class28.field538 = arg0;
        } else if (var7 >= 0.0F && (double) var7 <= 0.7853981633974483D) {
            class43.field818 = class147.field2421 - arg1;
            class28.field538 = class294.field4489 - arg0;
        } else if ((double) var7 >= 0.7853981633974483D && (double) var7 <= 1.5707963267948966D) {
            class28.field538 = class294.field4489 - arg1;
            class43.field818 = class147.field2421 - arg0;
        } else if ((double) var7 >= 1.5707963267948966D && (double) var7 <= 2.356194490192345D) {
            class28.field538 = arg1;
            class43.field818 = class147.field2421 - arg0;
        } else if ((double) var7 >= 2.356194490192345D && (double) var7 <= 3.141592653589793D) {
            class28.field538 = class294.field4489 - arg0;
            class43.field818 = arg1;
        }
        class28.field538 &= class4.field108;
        class43.field818 &= class204.field3323;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V", line = 213)
    public class224() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(IB)[[I", line = 217)
    public final int[][] method175(int arg0, byte arg1) {
        if (arg1 <= 16) {
            this.method175(-102, (byte) -83);
        }
        field3534++;
        int[][] var3 = this.field441.method220(arg0, 17433);
        if (this.field441.field532) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class294.field4489; var7++) {
                this.method1484(var7, arg0, (byte) 11);
                int[][] var8 = this.method173(0, class43.field818, (byte) 88);
                var4[var7] = var8[0][class28.field538];
                var5[var7] = var8[1][class28.field538];
                var6[var7] = var8[2][class28.field538];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)[I", line = 262)
    public final int[] method177(int arg0, int arg1) {
        field3531++;
        int var3 = 70 / ((33 - arg0) / 36);
        int[] var4 = this.field443.method1040(arg1, false);
        if (this.field443.field2637) {
            for (int var5 = 0; var5 < class294.field4489; var5++) {
                this.method1484(var5, arg1, (byte) -111);
                int[] var6 = this.method171(0, -72, class43.field818);
                var4[var5] = var6[class28.field538];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(Z)V", line = 299)
    public static final void method1485(boolean arg0) {
        if (class66.field1265 != null && (class66.field1265.field1869 - (class66.field1265.method710(-1) * 64 - 64) >> 7) == field3532 && (class66.field1265.field1872 - ((class66.field1265.method710(-1) - 1) * 64) >> 7) == class6.field129) {
            field3532 = 0;
        }
        field3535++;
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var2 = 0; var2 < 104; var2++) {
                class67.field1274[var1][var2] = 0;
            }
        }
        if (arg0) {
            method1485(true);
        }
        for (int var3 = 0; var3 < class305.field4623; var3++) {
            class278 var4 = class97.field1715[class283.field4384[var3]];
            if (var4 != null) {
                var4.field1907 = false;
            }
        }
        for (int var5 = 0; var5 < class285.field4417; var5++) {
            class255 var6 = class8.field179[class131.field2226[var5]];
            if (var6 != null) {
                var6.field1907 = false;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V", line = 360)
    public static void method1486(int arg0) {
        if (arg0 != 1) {
            method1483(12, -82, -92, -120, 80, -78, -120);
        }
        field3528 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILag;)V", line = 373)
    public final void method178(int arg0, int arg1, class202 arg2) {
        field3529++;
        if (arg1 == 0) {
            this.field444 = arg2.method1317((byte) -121) == 1;
        }
        if (arg0 != -318) {
            field3530 = 96;
        }
    }
}
