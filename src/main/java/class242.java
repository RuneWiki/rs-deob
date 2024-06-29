import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class242 extends class177 {

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    private int field3633 = 2000;

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "I")
    private int field3642 = 4096;

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "I")
    private int field3647 = 0;

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "I")
    private int field3640 = 0;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "I")
    private int field3645 = 16;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "I")
    public static int field3637 = 0;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "Ljava/lang/String;")
    public static String field3646 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3648 = " more options";

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BZ)V", line = 6)
    public static final void method1672(byte arg0, boolean arg1) {
        field3650++;
        if (arg0 <= 56) {
            method1674((byte) -30, -55, 15, -89, 101, 11);
        }
        class270.field4081 = arg1;
        class318.field4960 = !class252.method1753(-8090);
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V", line = 96)
    public class242() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(IIII)Lpk;", line = 21)
    public static final class111 method1673(int arg0, int arg1, int arg2, int arg3) {
        field3638++;
        class111 var4 = new class111();
        var4.field1750 = arg1;
        var4.field1751 = arg3;
        client.field3794.method208(var4, (long) arg0, 0);
        class281.method1979(12, arg1);
        class184 var5 = class100.method781((byte) 48, arg0);
        if (arg2 >= -80) {
            method1675((byte) -9);
        }
        if (var5 != null) {
            class133.method1007(var5, 113);
        }
        if (class20.field227 != null) {
            class133.method1007(class20.field227, 54);
            class20.field227 = null;
        }
        int var6 = class6.field62;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class218.method1561(112, class326.field5068[var7])) {
                class213.method1537(var7, -1);
            }
        }
        if (class6.field62 == 1) {
            class67.field982 = false;
            class141.method1064(class327.field5074, class253.field3776, class143.field2208, class62.field936, (byte) 105);
        } else {
            class141.method1064(class327.field5074, class253.field3776, class143.field2208, class62.field936, (byte) 105);
            int var8 = class64.field956.method426(class272.field4119);
            for (int var9 = 0; var9 < class6.field62; var9++) {
                int var10 = class64.field956.method426(class189.method1365(false, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class327.field5074 = var8 + 8;
            class62.field936 = class6.field62 * 15 + (class285.field4395 ? 26 : 22);
        }
        if (var5 != null) {
            class184.method1339(var5, false, (byte) -126);
        }
        class321.method2193(arg1, 0);
        if (class319.field4972 != -1) {
            class243.method1685(1, -12359, class319.field4972);
        }
        return var4;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)[I", line = 113)
    public final int[] method95(int arg0, int arg1) {
        field3636++;
        if (arg0 >= -52) {
            return (int[]) null;
        }
        int[] var3 = this.field2652.method1481(arg1, (byte) -128);
        if (this.field2652.field3287) {
            int var4 = this.field3642 >> 1;
            int[][] var5 = this.field2652.method1480((byte) -65);
            Random var6 = new Random((long) this.field3640);
            for (int var7 = 0; var7 < this.field3633; var7++) {
                int var8 = this.field3642 <= 0 ? this.field3647 : this.field3647 + class66.method561(true, var6, this.field3642) - var4;
                int var9 = (var8 & 0xFF3) >> 4;
                int var10 = class66.method561(true, var6, class287.field4415);
                int var11 = class66.method561(true, var6, class282.field4361);
                int var12 = (class156.field2345[var9] * this.field3645 >> 12) + var10;
                int var13 = (class307.field4795[var9] * this.field3645 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = var12 - var10;
                if (var15 != 0 || var14 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var12;
                        var12 = var13;
                        int var18 = var10;
                        var13 = var17;
                        var10 = var11;
                        var11 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                        var10 = var12;
                        var12 = var19;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = var13 - var11;
                    int var24 = 2048 / var22;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var25 = 1024 - (class66.method561(true, var6, 4096) >> 2);
                    int var26 = -var22 / 2;
                    int var27 = var13 <= var11 ? -1 : 1;
                    for (int var28 = var10; var28 < var12; var28++) {
                        var26 += var23;
                        int var29 = (var28 - var10) * var24 + var25 + 1024;
                        int var30 = class11.field120 & var21;
                        int var31 = class133.field2090 & var28;
                        if (var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (var26 > 0) {
                            var26 += -var22;
                            var21 += var27;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 248)
    public final void method465(int arg0) {
        int var2 = -108 % ((-arg0 - 6) / 43);
        class308.method2137(-114);
        field3644++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lhb;II)V", line = 274)
    public final void method97(class35 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3640 = arg0.method273(65280);
        } else if (arg2 == 1) {
            this.field3633 = arg0.method300(arg1 ^ 0x5319EB83);
        } else if (arg2 == 2) {
            this.field3645 = arg0.method273(arg1 + 83341);
        } else if (arg2 == 3) {
            this.field3647 = arg0.method300(-1394191632);
        } else if (arg2 == 4) {
            this.field3642 = arg0.method300(arg1 ^ 0x5319EB83);
        }
        if (arg1 != -18061) {
            this.field3640 = 12;
        }
        field3639++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BIIIII)V", line = 322)
    public static final void method1674(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 > -118) {
            field3648 = (String) null;
        }
        field3641++;
        for (int var6 = arg2; var6 <= arg2 + arg4; var6++) {
            for (int var7 = arg3; var7 <= arg3 + arg5; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class277.field4260[arg1][var7][var6] = 127;
                }
            }
        }
        for (int var8 = arg2; var8 < (arg2 + arg4); var8++) {
            for (int var9 = arg3; var9 < arg3 + arg5; var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class41.field612[arg1][var9][var8] = arg1 > 0 ? class41.field612[arg1 - 1][var9][var8] : 0;
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var10 = arg2 + 1; var10 < (arg2 + arg4); var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class41.field612[arg1][arg3][var10] = class41.field612[arg1][arg3 - 1][var10];
                }
            }
        }
        if (arg2 > 0 && arg2 < 104) {
            for (int var11 = arg3 + 1; var11 < arg3 + arg5; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class41.field612[arg1][var11][arg2] = class41.field612[arg1][var11][arg2 - 1];
                }
            }
        }
        if (arg3 < 0 || arg2 < 0 || arg3 >= 104 || arg2 >= 104) {
            return;
        }
        if (arg1 == 0) {
            if (arg3 > 0 && class41.field612[arg1][arg3 - 1][arg2] != 0) {
                class41.field612[arg1][arg3][arg2] = class41.field612[arg1][arg3 - 1][arg2];
            } else if (arg2 > 0 && class41.field612[arg1][arg3][arg2 - 1] != 0) {
                class41.field612[arg1][arg3][arg2] = class41.field612[arg1][arg3][arg2 - 1];
            } else if (arg3 > 0 && arg2 > 0 && class41.field612[arg1][arg3 - 1][arg2 - 1] != 0) {
                class41.field612[arg1][arg3][arg2] = class41.field612[arg1][arg3 - 1][arg2 - 1];
            }
        } else if (arg3 > 0 && class41.field612[arg1 - 1][arg3 - 1][arg2] != class41.field612[arg1][arg3 - 1][arg2]) {
            class41.field612[arg1][arg3][arg2] = class41.field612[arg1][arg3 - 1][arg2];
        } else if (arg2 > 0 && class41.field612[arg1 - 1][arg3][arg2 - 1] != class41.field612[arg1][arg3][arg2 - 1]) {
            class41.field612[arg1][arg3][arg2] = class41.field612[arg1][arg3][arg2 - 1];
        } else if (arg3 > 0 && arg2 > 0 && class41.field612[arg1][arg3 - 1][arg2 - 1] != class41.field612[arg1 - 1][arg3 - 1][arg2 - 1]) {
            class41.field612[arg1][arg3][arg2] = class41.field612[arg1][arg3 - 1][arg2 - 1];
        }
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(B)V", line = 445)
    public static void method1675(byte arg0) {
        if (arg0 == 85) {
            field3646 = null;
            field3648 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILlb;)V", line = 476)
    public static final void method1676(int arg0, class211 arg1) {
        field3634++;
        if (arg0 > 113) {
            class138.field2151 = arg1;
        }
    }
}
