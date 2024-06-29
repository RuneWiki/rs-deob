import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class252 extends class299 {

    @OriginalMember(owner = "client!cba", name = "r", descriptor = "I")
    private int field3146;

    @OriginalMember(owner = "client!cba", name = "l", descriptor = "I")
    private int field3140;

    @OriginalMember(owner = "client!cba", name = "o", descriptor = "I")
    private int field3143;

    @OriginalMember(owner = "client!cba", name = "n", descriptor = "I")
    private int field3142;

    @OriginalMember(owner = "client!cba", name = "h", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!cba", name = "j", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!cba", name = "k", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!cba", name = "m", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!cba", name = "p", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!cba", name = "q", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZLjava/lang/String;IZ)I", line = 4)
    public static final int method1476(boolean arg0, String arg1, int arg2, boolean arg3) {
        ++field3137;
        if (~arg2 <= -3 && arg2 <= 36) {
            boolean var4 = false;
            if (!arg0) {
                return -106;
            } else {
                boolean var5 = false;
                int var6 = 0;
                int var7 = arg1.length();
                for (int var8 = 0; var7 > var8; ++var8) {
                    char var9 = arg1.charAt(var8);
                    if (var8 == 0) {
                        if (~var9 == -46) {
                            var4 = true;
                            continue;
                        }
                        if (var9 == '+' && arg3) {
                            continue;
                        }
                    }
                    int var11;
                    if (~var9 <= -49 && var9 <= '9') {
                        var11 = var9 - '0';
                    } else if (var9 >= 'A' && var9 <= 'Z') {
                        var11 = var9 - '7';
                    } else {
                        if (var9 < 'a' || ~var9 < -123) {
                            throw new NumberFormatException();
                        }
                        var11 = var9 - 'W';
                    }
                    if (arg2 <= var11) {
                        throw new NumberFormatException();
                    }
                    if (var4) {
                        var11 = -var11;
                    }
                    int var10 = arg2 * var6 + var11;
                    if (~(var10 / arg2) != ~var6) {
                        throw new NumberFormatException();
                    }
                    var6 = var10;
                    var5 = true;
                }
                if (!var5) {
                    throw new NumberFormatException();
                } else {
                    return var6;
                }
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(BII)V", line = 85)
    public final void method1477(byte arg0, int arg1, int arg2) {
        if (arg0 < -118) {
            ++field3138;
            int var4 = this.field3140 * arg1 >> 12;
            int var5 = this.field3143 * arg1 >> 12;
            int var6 = this.field3142 * arg2 >> 12;
            int var7 = this.field3146 * arg2 >> 12;
            class222.method1341(super.field3725, (byte) -114, var4, var7, var6, super.field3726, super.field3724, var5);
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V", line = 109)
    public static final void method1478(int arg0) {
        class185.field2107.method949(((float) class639.field9075.field6763 * 0.1F + 0.7F) * 1.1523438F);
        if (arg0 != 983289836) {
            method1478(-44);
        }
        ++field3141;
        class185.field2107.method1032(class695.field9739, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class185.field2107.method937(class71.field696, -1, 0);
        class185.field2107.method947(class258.field3245);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIIIIII)V", line = 126)
    public static final void method1479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3136;
        class101.method549(arg2, 16);
        int var7 = 0;
        int var8 = arg2 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        int var10 = -arg2;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class557.field7954[arg1];
        int var16 = -var8 + arg5;
        int var17 = arg5 - -var8;
        if (arg0 != -2) {
            method1479(-19, 110, -57, 8, -25, -50, 49);
        }
        class315.method1809(var15, arg3, arg0 ^ 126, -arg2 + arg5, var16);
        class315.method1809(var15, arg6, -128, var16, var17);
        class315.method1809(var15, arg3, arg0 ^ 126, var17, arg2 + arg5);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (~var12 <= -1 && ~var11 <= -2) {
                class537.field7559[var11] = var7;
                --var11;
                var12 -= var11 << 1;
            }
            ++var7;
            if (var10 >= 0) {
                --var9;
                var10 -= var9 << 1;
                if (var9 < var8) {
                    int[] var18 = class557.field7954[arg1 + var9];
                    int[] var19 = class557.field7954[arg1 - var9];
                    int var20 = class537.field7559[var9];
                    int var21 = arg5 - -var7;
                    int var22 = -var7 + arg5;
                    int var23 = arg5 + var20;
                    int var24 = -var20 + arg5;
                    class315.method1809(var18, arg3, arg0 + -126, var22, var24);
                    class315.method1809(var18, arg6, -128, var24, var23);
                    class315.method1809(var18, arg3, -128, var23, var21);
                    class315.method1809(var19, arg3, -128, var22, var24);
                    class315.method1809(var19, arg6, -128, var24, var23);
                    class315.method1809(var19, arg3, -128, var23, var21);
                } else {
                    int[] var25 = class557.field7954[arg1 + var9];
                    int[] var26 = class557.field7954[-var9 + arg1];
                    int var27 = arg5 - -var7;
                    int var28 = -var7 + arg5;
                    class315.method1809(var25, arg3, -128, var28, var27);
                    class315.method1809(var26, arg3, arg0 ^ 126, var28, var27);
                }
            }
            int[] var29 = class557.field7954[arg1 + var7];
            int[] var30 = class557.field7954[arg1 - var7];
            int var31 = arg5 + var9;
            int var32 = -var9 + arg5;
            if (var7 >= var8) {
                class315.method1809(var29, arg3, -128, var32, var31);
                class315.method1809(var30, arg3, arg0 ^ 126, var32, var31);
            } else {
                int var33 = var7 <= var11 ? var11 : class537.field7559[var7];
                int var34 = arg5 + var33;
                int var35 = -var33 + arg5;
                class315.method1809(var29, arg3, -128, var32, var35);
                class315.method1809(var29, arg6, -128, var35, var34);
                class315.method1809(var29, arg3, arg0 + -126, var34, var31);
                class315.method1809(var30, arg3, -128, var32, var35);
                class315.method1809(var30, arg6, -128, var35, var34);
                class315.method1809(var30, arg3, -128, var34, var31);
            }
        }
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(III)V", line = 255)
    public final void method1480(int arg0, int arg1, int arg2) {
        ++field3139;
        int var4 = this.field3140 * arg1 >> 12;
        if (arg0 != 4096) {
            this.field3140 = 14;
        }
        int var5 = this.field3143 * arg1 >> 12;
        int var6 = this.field3142 * arg2 >> 12;
        int var7 = this.field3146 * arg2 >> 12;
        class665.method3691(var5, var7, super.field3726, var6, var4, 16);
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(IIIIIII)V", line = 274)
    public class252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3146 = arg3;
        this.field3140 = arg0;
        this.field3143 = arg2;
        this.field3142 = arg1;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(III)V", line = 285)
    public final void method1481(int arg0, int arg1, int arg2) {
        ++field3145;
        int var4 = this.field3140 * arg2 >> 12;
        if (arg0 != 0) {
            this.method1477((byte) -69, -65, -64);
        }
        int var5 = this.field3143 * arg2 >> 12;
        int var6 = this.field3142 * arg1 >> 12;
        int var7 = this.field3146 * arg1 >> 12;
        class703.method3894(var6, super.field3724, var7, -118, var4, var5, super.field3725);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "([Lrb;II)V", line = 305)
    public static final void method1482(class383[] arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = (arg1 + arg2) / 2;
            int var4 = arg1;
            class383 var5 = arg0[var3];
            arg0[var3] = arg0[arg2];
            arg0[arg2] = var5;
            int var6 = var5.field5168;
            for (int var7 = arg1; var7 < arg2; ++var7) {
                if (arg0[var7].field5168 < (var7 & 1) + var6) {
                    class383 var8 = arg0[var7];
                    arg0[var7] = arg0[var4];
                    arg0[var4++] = var8;
                }
            }
            arg0[arg2] = arg0[var4];
            arg0[var4] = var5;
            method1482(arg0, arg1, var4 - 1);
            method1482(arg0, var4 + 1, arg2);
        }
    }
}
