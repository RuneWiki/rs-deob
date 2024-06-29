import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class263 {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "[I")
    private int[] field4106;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field4113 = 0;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "Lta;")
    public static class262 field4110 = new class262(4);

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "F")
    public static float field4115;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "Lne;")
    public static class52 field4121;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIILrg;ZIIILql;III)Lrg;")
    public static final class233 method1786(int arg0, int arg1, int arg2, int arg3, int arg4, class233 arg5, boolean arg6, int arg7, int arg8, int arg9, class223 arg10, int arg11, int arg12, int arg13) {
        field4118++;
        long var14 = ((long) arg2 << 32) + ((long) arg4 << 48) + (long) ((arg11 << 24) + (arg9 << 16) + arg13);
        class233 var16 = (class233) class26.field399.method1780(var14, (byte) -122);
        if (var16 == null) {
            byte var17;
            if (arg13 == 1) {
                var17 = 9;
            } else if (arg13 == 2) {
                var17 = 12;
            } else if (arg13 == 3) {
                var17 = 15;
            } else if (arg13 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19 = 3;
            int[][] var20 = new int[var19][var17];
            class183 var21 = new class183(var17 * var19 + 1, var17 * var19 * 2 + -var17, 0);
            int var22 = var21.method1224(0, 0, 0);
            for (int var23 = 0; var23 < var19; var23++) {
                int var30 = var18[var23];
                int var31 = var18[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = arg0 + (class97.field1557[var33] * var30) >> 16;
                    int var35 = arg7 + (class97.field1556[var33] * var31) >> 16;
                    var20[var23][var32] = var21.method1224(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var19; var24++) {
                int var25 = (var24 * 256 + 128) / var19;
                int var26 = 256 - var25;
                short var27 = (short) (((arg2 & 0x7F) * var26 + (arg4 & 0x7F) * var25 & 0x7F00) + ((arg2 & 0x380) * var26 + (arg4 & 0x380) * var25 & 0x38000) + ((arg2 & 0xFC00) * var26 + (arg4 & 0xFC00) * var25 & 0xFC0000) >> 8);
                byte var28 = (byte) (arg9 * var26 + arg11 * var25 >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var21.method1219(var22, var20[0][(var29 + 1) % var17], var20[0][var29], (byte) 1, var27, var28);
                    } else {
                        var21.method1219(var20[var24 - 1][var29], var20[var24 - 1][(var29 + 1) % var17], var20[var24][(var29 + 1) % var17], (byte) 1, var27, var28);
                        var21.method1219(var20[var24 - 1][var29], var20[var24][(var29 + 1) % var17], var20[var24][var29], (byte) 1, var27, var28);
                    }
                }
            }
            var16 = var21.method1210(64, 768, -50, -10, -50);
            class26.field399.method1784(var16, false, var14);
        }
        int var36 = arg13 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = arg5.method1550();
        int var40 = var36;
        int var41 = arg5.method1535();
        int var42 = var36;
        if (arg6) {
            if (arg12 > 1152 && arg12 < 1920) {
                var42 = var36 + 128;
            }
            if (arg12 > 640 && arg12 < 1408) {
                var40 = var36 + 128;
            }
            if (arg12 > 128 && arg12 < 896) {
                var38 -= 128;
            }
            if (arg12 > 1664 || arg12 < 384) {
                var37 -= 128;
            }
        }
        int var43 = arg5.method1531();
        if (var43 < var37) {
            var43 = var37;
        }
        if (var42 < var41) {
            var41 = var42;
        }
        if (var38 > var39) {
            var39 = var38;
        }
        int var44 = arg5.method1529();
        if (var44 > var40) {
            var44 = var40;
        }
        class286 var45 = null;
        if (arg10 != null) {
            int var46 = arg10.field3484[arg3];
            var45 = class198.method1324((byte) -106, var46 >> 16);
            arg3 = var46 & 0xFFFF;
        }
        class233 var47;
        if (var45 == null) {
            var47 = var16.method1537(true, true, true);
            var47.method1544((var41 - var39) / 2, 128, (var44 - var43) / 2);
            var47.method1549((var39 + var41) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method1537(!var45.method1924(false, arg3), !var45.method1921(arg8 - 16764564, arg3), true);
            var47.method1544((var41 - var39) / 2, 128, (var44 - var43) / 2);
            var47.method1549((var39 + var41) / 2, 0, (var43 + var44) / 2);
            var47.method1541(var45, arg3);
        }
        if (arg12 != 0) {
            var47.method1552(arg12);
        }
        class281 var48 = (class281) var47;
        if (arg8 != 16777215) {
            return null;
        }
        if (class224.method1502((byte) -125, class274.field4318, arg7 + var43, arg0 + var39) != arg1 || arg1 != class224.method1502((byte) -125, class274.field4318, arg7 + var44, arg0 + var41)) {
            for (int var49 = 0; var49 < var48.field4413; var49++) {
                var48.field4394[var49] += class224.method1502((byte) -127, class274.field4318, var48.field4402[var49] + arg7, var48.field4424[var49] + arg0) - arg1;
            }
            var48.field4408 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public static void method1787(int arg0) {
        field4110 = null;
        int var1 = 59 % ((arg0 - 27) / 34);
        field4121 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III[II)V")
    public static final void method1788(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        arg0--;
        field4108++;
        int var13 = arg4 - 1;
        int var5 = var13 - 7;
        if (arg1 != -18732) {
            field4113 = 12;
        }
        while (var5 > arg0) {
            int var6 = arg0 + 1;
            arg3[var6] = arg2;
            int var7 = var6 + 1;
            arg3[var7] = arg2;
            int var8 = var7 + 1;
            arg3[var8] = arg2;
            int var9 = var8 + 1;
            arg3[var9] = arg2;
            int var10 = var9 + 1;
            arg3[var10] = arg2;
            int var11 = var10 + 1;
            arg3[var11] = arg2;
            int var12 = var11 + 1;
            arg3[var12] = arg2;
            arg0 = var12 + 1;
            arg3[arg0] = arg2;
        }
        while (arg0 < var13) {
            arg0++;
            arg3[arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BZLjava/lang/String;)V")
    public static final void method1789(byte arg0, boolean arg1, String arg2) {
        field4107++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class124.field1953.method31(arg2, 250);
        int var7 = class124.field1953.method17(arg2, 250) * 13;
        class201.method1333(var4 - var3, -var3 + var5, var6 + var3 + var3, var3 + var3 + var7, 0);
        class201.method1340(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 16777215);
        class124.field1953.method28(arg2, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class178.method1187(0, var5 - var3, -var3 + var4, var3 + var6 + var3, var3 + var7 - -var3);
        if (arg0 != 64) {
            method1791((byte) -104, 67);
        }
        if (!arg1) {
            class204.method1365(var6, (byte) -13, var4, var7, var5);
            return;
        }
        try {
            Graphics var8 = class189.field3021.getGraphics();
            class223.field3508.method232(27378, 0, 0, var8);
        } catch (Exception var9) {
            class189.field3021.repaint();
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)Lwi;")
    public static final class135 method1790(byte arg0, int arg1) {
        field4117++;
        class135 var2 = (class135) class99.field1580.method1701(false, (long) arg1);
        if (arg0 < 30) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class98.field1569.method1163(5, arg1, 48);
            class135 var4 = new class135();
            if (var3 != null) {
                var4.method952(new class37(var3), 0);
            }
            class99.field1580.method1704((long) arg1, var4, true);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "([I)V")
    public class263(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field4106 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field4106[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field4106[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field4106[var5 + var5] = arg0[var4];
            this.field4106[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(BI)I")
    public static final int method1791(byte arg0, int arg1) {
        field4119++;
        if (class118.field1829 != null) {
            class118.field1829.method1242((byte) 113);
            class118.field1829 = null;
        }
        class179.field2683++;
        if (class179.field2683 > 4) {
            class214.field3298 = 0;
            class179.field2683 = 0;
            return arg1;
        }
        if (arg0 != 24) {
            method1793(40, -54, 48, 89);
        }
        class214.field3298 = 0;
        if (class286.field4498 == class153.field2341) {
            class153.field2341 = class174.field2582;
        } else {
            class153.field2341 = class286.field4498;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
    public static final boolean method1792(String arg0, byte arg1, String arg2) {
        field4112++;
        if (arg1 > -63) {
            method1790((byte) 48, -30);
        }
        int var3 = arg0.length();
        int var4 = arg2.length();
        if (var3 < var4) {
            return false;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            char var6 = arg0.charAt(var5);
            char var7 = arg2.charAt(var5);
            if (var6 != var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && Character.toUpperCase(var6) != Character.toUpperCase(var7)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)V")
    public static final void method1793(int arg0, int arg1, int arg2, int arg3) {
        class295 var4 = class250.method1673(-119, 9, arg2);
        field4109++;
        var4.method1980(1022716908);
        if (arg0 != 14844) {
            field4113 = -7;
        }
        var4.field4632 = arg1;
        var4.field4636 = arg3;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)I")
    public final int method1794(int arg0, int arg1) {
        int var3 = (this.field4106.length >> 1) - 1;
        if (arg0 > -43) {
            return -68;
        }
        field4114++;
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field4106[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4106[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }
}
