import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class99 extends class62 {

    @OriginalMember(owner = "client!uaa", name = "C", descriptor = "I")
    private int field1444 = 4096;

    @OriginalMember(owner = "client!uaa", name = "E", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!uaa", name = "F", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!uaa", name = "I", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!uaa", name = "D", descriptor = "Lqa;")
    public static class208 field1445;

    @OriginalMember(owner = "client!uaa", name = "J", descriptor = "Lwca;")
    public static class583 field1451;

    @OriginalMember(owner = "client!uaa", name = "G", descriptor = "Ljava/awt/Frame;")
    public static Frame field1448;

    @OriginalMember(owner = "client!uaa", name = "H", descriptor = "Ljava/lang/String;")
    public static String field1449;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BILfaa;II)V", line = 3)
    public static final void method759(byte arg0, int arg1, class136 arg2, int arg3, int arg4) {
        ++field1450;
        if (arg0 == -16) {
            class226 var5 = arg2.method947(false);
            int var6 = -arg2.field1927.field2891 + arg2.field1896 & 16383;
            if (~arg3 == 0) {
                if (~var6 == -1 && arg2.field1920 <= 25) {
                    if (!arg2.field1921 || !var5.method1448(arg2.field1898, (byte) 121)) {
                        arg2.field1898 = var5.method1451(true);
                        arg2.field1921 = arg2.field1898 != -1;
                    }
                } else {
                    if (arg4 < 0 && var5.field3288 != -1) {
                        arg2.field1898 = var5.field3288;
                    } else if (arg4 > 0 && var5.field3264 != -1) {
                        arg2.field1898 = var5.field3264;
                    } else {
                        arg2.field1898 = var5.field3266;
                    }
                    arg2.field1921 = false;
                }
            } else if (arg2.field1923 != -1 && (var6 >= 10240 || ~var6 >= -2049)) {
                int var7 = class342.field4728[arg1] + -arg2.field1927.field2891 & 16383;
                if (arg3 == 2 && var5.field3265 != -1) {
                    if (~var7 < -2049 && var7 <= 6144 && ~var5.field3262 != 0) {
                        arg2.field1898 = var5.field3262;
                    } else if (var7 >= 10240 && var7 < 14336 && var5.field3309 != -1) {
                        arg2.field1898 = var5.field3309;
                    } else if (var7 > 6144 && var7 < 10240 && var5.field3282 != -1) {
                        arg2.field1898 = var5.field3282;
                    } else {
                        arg2.field1898 = var5.field3265;
                    }
                } else if (arg3 == 0 && var5.field3293 != -1) {
                    if (~var7 < -2049 && ~var7 >= -6145 && ~var5.field3292 != 0) {
                        arg2.field1898 = var5.field3292;
                    } else if (var7 >= 10240 && var7 < 14336 && ~var5.field3271 != 0) {
                        arg2.field1898 = var5.field3271;
                    } else if (var7 > 6144 && var7 < 10240 && var5.field3273 != -1) {
                        arg2.field1898 = var5.field3273;
                    } else {
                        arg2.field1898 = var5.field3293;
                    }
                } else if (~var7 < -2049 && ~var7 >= -6145 && var5.field3258 != -1) {
                    arg2.field1898 = var5.field3258;
                } else if (var7 >= 10240 && var7 < 14336 && ~var5.field3259 != 0) {
                    arg2.field1898 = var5.field3259;
                } else if (~var7 < -6145 && ~var7 > -10241 && var5.field3279 != -1) {
                    arg2.field1898 = var5.field3279;
                } else {
                    arg2.field1898 = var5.field3266;
                }
                arg2.field1921 = false;
            } else if (~var6 == -1 && ~arg2.field1920 >= -26) {
                if (arg3 == 2 && ~var5.field3265 != 0) {
                    arg2.field1898 = var5.field3265;
                } else if (~arg3 == -1 && var5.field3293 != -1) {
                    arg2.field1898 = var5.field3293;
                } else {
                    arg2.field1898 = var5.field3266;
                }
                arg2.field1921 = false;
            } else {
                if (~arg3 == -3 && ~var5.field3265 != 0) {
                    if (arg4 < 0 && ~var5.field3276 != 0) {
                        arg2.field1898 = var5.field3276;
                    } else if (~arg4 < -1 && ~var5.field3296 != 0) {
                        arg2.field1898 = var5.field3296;
                    } else {
                        arg2.field1898 = var5.field3265;
                    }
                } else if (~arg3 == -1 && var5.field3293 != -1) {
                    if (arg4 < 0 && var5.field3275 != -1) {
                        arg2.field1898 = var5.field3275;
                    } else if (~arg4 < -1 && ~var5.field3308 != 0) {
                        arg2.field1898 = var5.field3308;
                    } else {
                        arg2.field1898 = var5.field3293;
                    }
                } else if (~arg4 > -1 && var5.field3277 != -1) {
                    arg2.field1898 = var5.field3277;
                } else if (~arg4 < -1 && var5.field3287 != -1) {
                    arg2.field1898 = var5.field3287;
                } else {
                    arg2.field1898 = var5.field3266;
                }
                arg2.field1921 = false;
            }
        }
    }

    @OriginalMember(owner = "client!uaa", name = "h", descriptor = "(I)V", line = 163)
    public static void method760(int arg0) {
        field1449 = null;
        field1448 = null;
        if (arg0 == -3607) {
            field1451 = null;
            field1445 = null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(II)[I", line = 177)
    public final int[] method13(int arg0, int arg1) {
        ++field1447;
        int[] var3 = super.field774.method3086(arg0, -2);
        if (arg1 != 656024161) {
            this.field1444 = 10;
        }
        if (super.field774.field7499) {
            int[] var4 = this.method408(arg0 - 1 & class285.field3989, 0, (byte) -69);
            int[] var5 = this.method408(arg0, 0, (byte) -69);
            int[] var6 = this.method408(arg0 - -1 & class285.field3989, 0, (byte) -69);
            for (int var7 = 0; ~class438.field5847 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field1444;
                int var9 = (var5[class410.field5604 & var7 - -1] + -var5[class410.field5604 & var7 - 1]) * this.field1444;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + 4096 + var13) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "()V", line = 237)
    public class99() {
        super(1, true);
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Lgw;II)V", line = 244)
    public final void method11(class148 arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            this.method11((class148) null, 116, -120);
        }
        ++field1446;
        if (arg2 == 0) {
            this.field1444 = arg0.method1045(true);
        }
    }
}
