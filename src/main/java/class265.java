import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class265 extends class154 {

    @OriginalMember(owner = "client!gca", name = "m", descriptor = "Ljava/lang/String;")
    public String field3728 = null;

    @OriginalMember(owner = "client!gca", name = "q", descriptor = "I")
    public int field3732 = 0;

    @OriginalMember(owner = "client!gca", name = "s", descriptor = "Z")
    private boolean field3734 = true;

    @OriginalMember(owner = "client!gca", name = "y", descriptor = "I")
    public static int field3740 = 1;

    @OriginalMember(owner = "client!gca", name = "l", descriptor = "B")
    public byte field3727;

    @OriginalMember(owner = "client!gca", name = "z", descriptor = "B")
    public byte field3741;

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!gca", name = "k", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!gca", name = "n", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!gca", name = "o", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!gca", name = "p", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!gca", name = "r", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!gca", name = "u", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!gca", name = "x", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!gca", name = "j", descriptor = "J")
    public long field3725;

    @OriginalMember(owner = "client!gca", name = "t", descriptor = "Z")
    private boolean field3735;

    @OriginalMember(owner = "client!gca", name = "w", descriptor = "[Lcn;")
    public static class543[] field3738;

    @OriginalMember(owner = "client!gca", name = "v", descriptor = "[Lica;")
    public class692[] field3737;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(II)V")
    public final void method1727(int arg0, int arg1) {
        ++field3739;
        if (arg1 > -53) {
            method1732(-29, (int[]) null, 113, -2, 70, -1, -26, 75);
        }
        --this.field3732;
        if (this.field3732 == 0) {
            this.field3737 = null;
        } else {
            class275.method1769(this.field3737, arg0 + 1, this.field3737, arg0, this.field3732 - arg0);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZLfca;)V")
    private final void method1728(boolean arg0, class93 arg1) {
        ++field3736;
        int var3 = arg1.method793((byte) 68);
        if (~(var3 & 2) != -1) {
            this.field3734 = true;
        }
        if ((var3 & 1) != 0) {
            this.field3735 = true;
        }
        if (arg0) {
            this.field3727 = -73;
        }
        super.field2528 = arg1.method770((byte) 69);
        this.field3725 = arg1.method770((byte) 121);
        this.field3728 = arg1.method752(0);
        arg1.method793((byte) 96);
        this.field3727 = arg1.method766((byte) 122);
        this.field3741 = arg1.method766((byte) 122);
        this.field3732 = arg1.method793((byte) 70);
        if (this.field3732 > 0) {
            this.field3737 = new class692[this.field3732];
            for (int var4 = 0; ~var4 > ~this.field3732; ++var4) {
                class692 var5 = new class692();
                if (this.field3735) {
                    arg1.method770((byte) 93);
                }
                if (this.field3734) {
                    var5.field9601 = arg1.method752(0);
                }
                var5.field9610 = arg1.method766((byte) 122);
                var5.field9599 = arg1.method763(5);
                this.field3737[var4] = var5;
            }
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V")
    public static void method1729(int arg0) {
        field3738 = null;
        if (arg0 != 0) {
            method1731(92, -2, (class662) null);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method1730(String arg0, int arg1) {
        if (arg1 <= 8) {
            this.field3727 = 51;
        }
        ++field3730;
        for (int var3 = 0; var3 < this.field3732; ++var3) {
            if (this.field3737[var3].field9601.equalsIgnoreCase(arg0)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IILgj;)Lnf;")
    public static final class604 method1731(int arg0, int arg1, class662 arg2) {
        ++field3729;
        class604 var3 = (class604) class197.field2993.method266((byte) -114, (long) arg0);
        if (var3 == null) {
            if (!class35.field587) {
                var3 = class474.method2723((byte) -21, arg2.method3742(5, arg0));
            } else {
                var3 = class95.field1472.method498(class49.method370(arg2, arg0), true);
            }
            class197.field2993.method270(var3, (long) arg0, -127);
        }
        return arg1 != 65485 ? null : var3;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I[IIIIIII)V")
    public static final void method1732(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3724;
        if (~arg3 < -1 && !class461.method2656(0, arg3)) {
            throw new IllegalArgumentException("");
        } else if (~arg2 < -1 && !class461.method2656(0, arg2)) {
            throw new IllegalArgumentException("");
        } else if (~arg0 != -32994) {
            throw new IllegalArgumentException("");
        } else {
            int var8 = 0;
            int var9 = ~arg3 <= ~arg2 ? arg2 : arg3;
            int var10 = arg3 >> 1;
            if (arg7 == 28264) {
                int var11 = arg2 >> 1;
                int[] var12 = arg1;
                int[] var13 = new int[var10 * var11];
                while (true) {
                    OpenGL.glTexImage2Di(arg4, var8, arg5, arg3, arg2, 0, arg0, arg6, var12, 0);
                    if (~var9 >= -2) {
                        return;
                    }
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = arg3 + var15;
                    int[] var17 = var13;
                    for (int var18 = 0; ~var18 > ~var11; ++var18) {
                        for (int var19 = 0; ~var19 > ~var10; ++var19) {
                            int var20 = var12[var15++];
                            int var21 = var12[var15++];
                            int var22 = var12[var16++];
                            int var23 = (var20 & 65489) >> 8;
                            int var24 = var20 & 255;
                            int var25 = var12[var16++];
                            int var26 = 255 & var20 >> 16;
                            int var27 = 255 & var20 >> 24;
                            int var28 = (255 & var21 >> 8) + var23;
                            int var29 = (255 & var21) + var24;
                            int var30 = (var21 >> 24 & 255) + var27;
                            int var31 = ((var21 & 16764490) >> 16) + var26;
                            int var32 = (var22 >> 16 & 255) + var31;
                            int var33 = (255 & var22 >> 8) + var28;
                            int var34 = (var22 & 255) + var29;
                            int var35 = (var22 >> 24 & 255) + var30;
                            int var36 = ((var25 & 16764114) >> 16) + var32;
                            int var37 = (var25 >> 24 & 255) + var35;
                            int var38 = (var25 & 255) + var34;
                            int var39 = ((var25 & 65485) >> 8) + var33;
                            var13[var14++] = class530.method3011(class204.method1456(255, var38 >> 2), class530.method3011(class530.method3011(class204.method1456(-16777216, var37 << 22), class204.method1456(var36 << 14, 16711680)), class204.method1456(var39 << 6, 65280)));
                        }
                        var15 += arg3;
                        var16 += arg3;
                    }
                    var13 = var12;
                    var12 = var17;
                    arg3 = var10;
                    arg2 = var11;
                    var11 >>= 1;
                    var9 >>= 1;
                    ++var8;
                    var10 >>= 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IB)V")
    private final void method1733(int arg0, byte arg1) {
        if (this.field3737 != null) {
            class275.method1769(this.field3737, 0, this.field3737 = new class692[arg0], 0, this.field3732);
        } else {
            this.field3737 = new class692[arg0];
        }
        if (arg1 != 37) {
            this.field3727 = -68;
        }
        ++field3731;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILica;)V")
    public final void method1734(int arg0, class692 arg1) {
        ++field3733;
        if (this.field3737 == null || ~this.field3737.length >= ~this.field3732) {
            this.method1733(this.field3732 + 5, (byte) 37);
        }
        this.field3737[this.field3732++] = arg1;
        if (arg0 != 1038085672) {
            this.field3734 = true;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public static final byte[] method1735(int arg0, String arg1) {
        ++field3726;
        int var2 = arg1.length();
        if (var2 == 0) {
            return new byte[0];
        } else {
            int var3 = var2 - -3 & -4;
            int var4 = var3 / 4 * 3;
            if (var2 > var3 - arg0 && ~class152.method1195(arg1.charAt(var3 + -2), false) != 0) {
                if (~var2 >= ~(var3 + -1) || ~class152.method1195(arg1.charAt(var3 + -1), false) == 0) {
                    --var4;
                }
            } else {
                var4 -= 2;
            }
            byte[] var5 = new byte[var4];
            class494.method2836(0, (byte) 75, var5, arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lfca;)V")
    public class265(class93 arg0) {
        this.method1728(false, arg0);
    }
}
