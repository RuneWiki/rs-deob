import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class229 {

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Lrc;")
    public static class9 field3855 = new class9(5);

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field3861 = -1;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "Z")
    public static boolean field3863 = false;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3864 = "glow2:";

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Z")
    public static volatile boolean field3857 = true;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "[[[B")
    public static byte[][][] field3862;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1536(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != -12403) {
            return;
        }
        if (class126.field2222 <= (arg6 - arg3) && class118.field2098 >= arg3 + arg6 && class118.field2094 <= arg4 - arg3 && (arg3 + arg4) <= class89.field1582) {
            class33.method217(arg6, arg3, (byte) 72, arg5, arg4, arg2, arg0);
        } else {
            class219.method1449(arg5, arg0, arg6, arg2, arg3, arg4, -2432);
        }
        field3858++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)[B")
    public static final synchronized byte[] method1537(byte arg0, int arg1) {
        field3859++;
        if (arg1 == 100 && class146.field2494 > 0) {
            byte[] var2 = class135.field2346[--class146.field2494];
            class135.field2346[class146.field2494] = null;
            return var2;
        } else if (arg1 == 5000 && class228.field3852 > 0) {
            byte[] var3 = class10.field151[--class228.field3852];
            class10.field151[class228.field3852] = null;
            return var3;
        } else if (arg1 == 30000 && class246.field4043 > 0) {
            byte[] var4 = class272.field4367[--class246.field4043];
            class272.field4367[class246.field4043] = null;
            return var4;
        } else if (arg0 == -106) {
            return new byte[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
    public static void method1538(boolean arg0) {
        field3862 = null;
        field3855 = null;
        field3864 = null;
        if (arg0) {
            method1536(-16, -117, -34, -21, -124, 83, 44);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method1539(int arg0, boolean arg1, String arg2) {
        field3854++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class112.field2018.method1614(arg2, 250);
        int var7 = class112.field2018.method1634(arg2, 250) * 13;
        class283.method1855(var5 - var3, -var3 + var4, var6 + var3 + var3, var3 + var7 + var3, arg0);
        class283.method1846(var5 - var3, -var3 + var4, var3 + var6 + var3, var3 - -var3 + var7, 16777215);
        class112.field2018.method1613(arg2, var5, var4, var6, var7, 16777215, -1, 1, 1, 0);
        class264.method1750(var7 + var3 + var3, var3 + var6 + var3, var5 - var3, -var3 + var4, (byte) -96);
        if (!arg1) {
            class237.method1573(var7, var6, var4, (byte) -23, var5);
            return;
        }
        try {
            Graphics var8 = class118.field2099.getGraphics();
            class240.field3944.method187(0, var8, -127, 0);
        } catch (Exception var9) {
            class118.field2099.repaint();
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILba;IIILpb;IIIZIIII)Lba;")
    public static final class279 method1540(int arg0, class279 arg1, int arg2, int arg3, int arg4, class167 arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        long var14 = ((long) arg10 << 48) + ((long) arg7 << 32) + (long) ((arg12 << 16) + (arg11 << 24) + arg8);
        field3856++;
        class279 var16 = (class279) class96.field1651.method57(var14, arg4 - 151);
        if (var16 == null) {
            byte var17;
            if (arg8 == 1) {
                var17 = 9;
            } else if (arg8 == 2) {
                var17 = 12;
            } else if (arg8 == 3) {
                var17 = 15;
            } else if (arg8 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            class221 var19 = new class221(var17 * var18 + 1, var17 * var18 * 2 + -var17, 0);
            int[] var20 = new int[] { 64, 96, 128 };
            int var21 = var19.method1490(0, 0, 0);
            int[][] var22 = new int[var18][var17];
            for (int var23 = 0; var23 < var18; var23++) {
                int var30 = var20[var23];
                int var31 = var20[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = class287.field4562[var33] * var31 + arg2 >> 16;
                    int var35 = class287.field4567[var33] * var30 + arg3 >> 16;
                    var22[var23][var32] = var19.method1490(var35, 0, var34);
                }
            }
            for (int var24 = 0; var24 < var18; var24++) {
                int var25 = (var24 * 256 + 128) / var18;
                int var26 = 256 - var25;
                byte var27 = (byte) (arg11 * var25 + arg12 * var26 >> 8);
                short var28 = (short) (((arg7 & 0xFC00) * var26 + (arg10 & 0xFC00) * var25 & 0xFC0000) + ((arg7 & 0x380) * var26 + (arg10 & 0x380) * var25 & 0x38000) + ((arg7 & 0x7F) * var26 + (arg10 & 0x7F) * var25 & 0x7F00) >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var19.method1473(var21, var22[0][(var29 + 1) % var17], var22[0][var29], (byte) 1, var28, var27);
                    } else {
                        var19.method1473(var22[var24 - 1][var29], var22[var24 - 1][(var29 + 1) % var17], var22[var24][(var29 + 1) % var17], (byte) 1, var28, var27);
                        var19.method1473(var22[var24 - 1][var29], var22[var24][(var29 + 1) % var17], var22[var24][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var19.method1474(64, 768, -50, -10, -50);
            class96.field1651.method62(0, var16, var14);
        }
        int var36 = arg8 * 64 - 1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = arg1.method114();
        int var40 = -var36;
        int var41 = var36;
        if (arg9) {
            if (arg0 > 1152 && arg0 < 1920) {
                var38 = var36 + 128;
            }
            if (arg0 > 128 && arg0 < 896) {
                var40 -= 128;
            }
            if (arg0 > 1664 || arg0 < 384) {
                var37 -= 128;
            }
            if (arg0 > 640 && arg0 < 1408) {
                var41 = var36 + 128;
            }
        }
        if (arg4 != 50) {
            field3857 = false;
        }
        if (var39 < var40) {
            var39 = var40;
        }
        class259 var42 = null;
        int var43 = arg1.method113();
        if (var38 < var43) {
            var43 = var38;
        }
        int var44 = arg1.method109();
        int var45 = arg1.method104();
        if (arg5 != null) {
            int var46 = arg5.field2736[arg13];
            var42 = class89.method579(arg4 + 37, var46 >> 16);
            arg13 = var46 & 0xFFFF;
        }
        if (var45 > var41) {
            var45 = var41;
        }
        if (var44 < var37) {
            var44 = var37;
        }
        class279 var47;
        if (var42 == null) {
            var47 = var16.method99(true, true, true);
            var47.method106((var43 - var39) / 2, 128, (var45 - var44) / 2);
            var47.method126((var39 + var43) / 2, 0, (var44 + var45) / 2);
        } else {
            var47 = var16.method99(!var42.method1718(15693, arg13), !var42.method1719(arg13, 0), true);
            var47.method106((var43 - var39) / 2, 128, (var45 - var44) / 2);
            var47.method126((var39 + var43) / 2, 0, (var44 + var45) / 2);
            var47.method1823(var42, arg13);
        }
        if (arg0 != 0) {
            var47.method115(arg0);
        }
        class18 var48 = (class18) var47;
        if (arg6 != class10.method68(true, class176.field2886, arg2 + var44, arg3 + var39) || class10.method68(true, class176.field2886, arg2 + var45, arg3 + var43) != arg6) {
            for (int var49 = 0; var49 < var48.field220; var49++) {
                var48.field219[var49] += class10.method68(true, class176.field2886, var48.field212[var49] + arg2, var48.field240[var49] + arg3) - arg6;
            }
            var48.field229 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)V")
    public static final void method1541(int arg0, boolean arg1) {
        field3853++;
        int var2 = 25 / ((arg0 - 75) / 32);
        byte var3 = 4;
        byte[][] var4 = class61.field1059;
        int var5 = var4.length;
        for (int var6 = 0; var6 < var5; var6++) {
            int[] var12 = null;
            byte[] var13 = var4[var6];
            int var14 = class276.field4405[var6] >> 8;
            int var15 = class276.field4405[var6] & 0xFF;
            int var16 = var15 * 64 - class255.field4162;
            int var17 = var14 * 64 - class126.field2206;
            if (var13 != null) {
                class97.method614(32067);
                var12 = class77.method469(class99.field1699, arg1, var16, (byte) -58, var13, var17, class126.field2206, class255.field4162);
            }
            if (!arg1 && class96.field1654 / 8 == var14 && class59.field1031 / 8 == var15) {
                if (var12 == null) {
                    class33.field480 = -1;
                } else {
                    class255.field4166 = var12[2];
                    class245.field4026 = var12[4];
                    class33.field480 = var12[0];
                    class67.field1118 = var12[1];
                    class69.field1129 = var12[3];
                }
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = (class276.field4405[var7] >> 8) * 64 - class126.field2206;
            int var9 = (class276.field4405[var7] & 0xFF) * 64 - class255.field4162;
            byte[] var10 = var4[var7];
            if (var10 == null && class59.field1031 < 800) {
                class97.method614(32067);
                for (int var11 = 0; var11 < var3; var11++) {
                    class211.method1411(91, var8, 64, var9, var11, 64);
                }
            }
        }
    }
}
