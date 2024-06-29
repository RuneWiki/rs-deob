import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class307 extends class285 {

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
    private int field4784 = 4096;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
    private int field4786 = 4096;

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "I")
    private int field4790 = 4096;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "Log;")
    public static class157 field4783 = null;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
    public static int field4792 = 0;

    @OriginalMember(owner = "client!ia", name = "bb", descriptor = "B")
    public static byte field4796;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "Lbf;")
    public static class58 field4788;

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "Ljava/awt/Image;")
    public static Image field4795;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "(I)V", line = 6)
    public static void method2178(int arg0) {
        field4783 = null;
        field4788 = null;
        if (arg0 <= 119) {
            field4795 = (Image) null;
        }
        field4795 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZLjj;I)V", line = 28)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        if (arg2 == 0) {
            this.field4790 = arg1.method271(21081);
        } else if (arg2 == 1) {
            this.field4786 = arg1.method271(21081);
        } else if (arg2 == 2) {
            this.field4784 = arg1.method271(21081);
        }
        if (!arg0) {
            field4795 = (Image) null;
        }
        field4791++;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V", line = 303)
    public class307() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIZIILei;BIILpi;IIII)Lei;", line = 78)
    public static final class262 method2179(int arg0, int arg1, boolean arg2, int arg3, int arg4, class262 arg5, byte arg6, int arg7, int arg8, class202 arg9, int arg10, int arg11, int arg12, int arg13) {
        field4794++;
        if (arg6 != -122) {
            return (class262) null;
        }
        long var14 = ((long) arg4 << 32) + ((long) arg13 << 48) + (long) ((arg11 << 24) + (arg7 << 16) + arg10);
        class262 var16 = (class262) class202.field3307.method704((byte) 103, var14);
        if (var16 == null) {
            byte var17;
            if (arg10 == 1) {
                var17 = 9;
            } else if (arg10 == 2) {
                var17 = 12;
            } else if (arg10 == 3) {
                var17 = 15;
            } else if (arg10 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19 = 3;
            class134 var20 = new class134(var17 * var19 + 1, var17 * var19 * 2 + -var17, 0);
            int[][] var21 = new int[var19][var17];
            int var22 = var20.method983(0, 0, 0);
            for (int var23 = 0; var23 < var19; var23++) {
                int var24 = var18[var23];
                int var25 = var18[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = arg3 + (class170.field2810[var27] * var24) >> 16;
                    int var29 = class170.field2801[var27] * var25 + arg8 >> 16;
                    var21[var23][var26] = var20.method983(var29, 0, var28);
                }
            }
            for (int var30 = 0; var30 < var19; var30++) {
                int var31 = (var30 * 256 + 128) / var19;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg7 * var32 + arg11 * var31 >> 8);
                short var34 = (short) (((arg4 & 0x7F) * var32 + (arg13 & 0x7F) * var31 & 0x7F00) + ((arg4 & 0x380) * var32 + (arg13 & 0x380) * var31 & 0x38000) + ((arg4 & 0xFC00) * var32 + (arg13 & 0xFC00) * var31 & 0xFC0000) >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var20.method1003(var22, var21[0][(var35 + 1) % var17], var21[0][var35], (byte) 1, var34, var33);
                    } else {
                        var20.method1003(var21[var30 - 1][var35], var21[var30 - 1][(var35 + 1) % var17], var21[var30][(var35 + 1) % var17], (byte) 1, var34, var33);
                        var20.method1003(var21[var30 - 1][var35], var21[var30][(var35 + 1) % var17], var21[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var20.method988(64, 768, -50, -10, -50);
            class202.field3307.method703(var16, var14, (byte) 93);
        }
        int var36 = arg10 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = var36;
        int var41 = arg5.method1187();
        if (arg2) {
            if (arg0 > 128 && arg0 < 896) {
                var38 -= 128;
            }
            if (arg0 > 1152 && arg0 < 1920) {
                var40 = var36 + 128;
            }
            if (arg0 > 640 && arg0 < 1408) {
                var39 = var36 + 128;
            }
            if (arg0 > 1664 || arg0 < 384) {
                var37 -= 128;
            }
        }
        if (var41 < var38) {
            var41 = var38;
        }
        int var42 = arg5.method1180();
        if (var42 > var40) {
            var42 = var40;
        }
        int var43 = arg5.method1152();
        if (var37 > var43) {
            var43 = var37;
        }
        class126 var44 = null;
        int var45 = arg5.method1158();
        if (var39 < var45) {
            var45 = var39;
        }
        if (arg9 != null) {
            int var46 = arg9.field3293[arg1];
            var44 = class240.method1721((byte) -121, var46 >> 16);
            arg1 = var46 & 0xFFFF;
        }
        class262 var47;
        if (var44 == null) {
            var47 = var16.method1191(true, true, true);
            var47.method1196((var42 - var41) / 2, 128, (var45 - var43) / 2);
            var47.method1189((var41 + var42) / 2, 0, (var43 + var45) / 2);
        } else {
            var47 = var16.method1191(!var44.method914((byte) 55, arg1), !var44.method918(arg1, 4), true);
            var47.method1196((var42 - var41) / 2, 128, (var45 - var43) / 2);
            var47.method1189((var41 + var42) / 2, 0, (var43 + var45) / 2);
            var47.method1868(var44, arg1);
        }
        if (arg0 != 0) {
            var47.method1159(arg0);
        }
        if (class232.field3690) {
            class163 var50 = (class163) var47;
            if (arg12 != class123.method889(arg6 ^ 0xFFFFFF87, class49.field698, arg8 + var41, arg3 + var43) || class123.method889(1, class49.field698, arg8 + var42, arg3 + var45) != arg12) {
                for (int var51 = 0; var51 < var50.field2694; var51++) {
                    var50.field2704[var51] += class123.method889(1, class49.field698, var50.field2669[var51] + arg8, var50.field2676[var51] + arg3) - arg12;
                }
                var50.field2684.field402 = false;
                var50.field2687.field3874 = false;
            }
        } else {
            class250 var48 = (class250) var47;
            if (class123.method889(1, class49.field698, arg8 + var41, arg3 - -var43) != arg12 || class123.method889(1, class49.field698, arg8 + var42, arg3 - -var45) != arg12) {
                for (int var49 = 0; var49 < var48.field3921; var49++) {
                    var48.field3924[var49] += class123.method889(1, class49.field698, var48.field3936[var49] + arg8, var48.field3932[var49] + arg3) - arg12;
                }
                var48.field3928 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)[[I", line = 313)
    public final int[][] method62(byte arg0, int arg1) {
        if (arg0 <= 121) {
            this.field4786 = -35;
        }
        field4793++;
        int[][] var3 = this.field4564.method1552(arg1, (byte) -69);
        if (this.field4564.field3529) {
            int[][] var4 = this.method2053((byte) 111, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class287.field4599; var11++) {
                int var12 = var7[var11];
                int var13 = var6[var11];
                int var14 = var5[var11];
                if (var12 == var14 && var12 == var13) {
                    var8[var11] = this.field4790 * var14 >> 12;
                    var10[var11] = this.field4786 * var12 >> 12;
                    var9[var11] = this.field4784 * var13 >> 12;
                } else {
                    var8[var11] = this.field4790;
                    var10[var11] = this.field4786;
                    var9[var11] = this.field4784;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(B)V", line = 381)
    public static final void method2180(byte arg0) {
        field4787++;
        class221.field3547 = new class157[class193.field3157.method1291(5362)][];
        if (arg0 > 19) {
            class149.field2300 = new boolean[class193.field3157.method1291(5362)];
        }
    }
}
