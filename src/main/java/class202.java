import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class202 extends class7 {

    @OriginalMember(owner = "client!uc", name = "V", descriptor = "[S")
    private short[] field3806 = new short[257];

    @OriginalMember(owner = "client!uc", name = "db", descriptor = "I")
    private int field3814 = 0;

    @OriginalMember(owner = "client!uc", name = "U", descriptor = "Lob;")
    public static class141 field3805 = class175.method1195(40, "(U5");

    @OriginalMember(owner = "client!uc", name = "Y", descriptor = "Lob;")
    public static class141 field3809 = class175.method1195(40, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "Lpi;")
    public static class158 field3804 = new class158();

    @OriginalMember(owner = "client!uc", name = "kb", descriptor = "Lob;")
    public static class141 field3821 = class175.method1195(40, "Neuer Benutzer");

    @OriginalMember(owner = "client!uc", name = "mb", descriptor = "I")
    public static int field3823 = -1;

    @OriginalMember(owner = "client!uc", name = "pb", descriptor = "Z")
    public static boolean field3826 = false;

    @OriginalMember(owner = "client!uc", name = "lb", descriptor = "Lob;")
    private static class141 field3822 = class175.method1195(40, " has logged in)3");

    @OriginalMember(owner = "client!uc", name = "jb", descriptor = "I")
    public static int field3820 = 0;

    @OriginalMember(owner = "client!uc", name = "nb", descriptor = "Z")
    public static volatile boolean field3824 = true;

    @OriginalMember(owner = "client!uc", name = "ob", descriptor = "Lob;")
    public static class141 field3825 = field3822;

    @OriginalMember(owner = "client!uc", name = "ib", descriptor = "Lmd;")
    public static class123 field3819 = new class123(4096);

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!uc", name = "W", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!uc", name = "Z", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!uc", name = "bb", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!uc", name = "eb", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!uc", name = "fb", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!uc", name = "gb", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!uc", name = "hb", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!uc", name = "X", descriptor = "[I")
    private int[] field3808;

    @OriginalMember(owner = "client!uc", name = "cb", descriptor = "[I")
    private int[] field3813;

    @OriginalMember(owner = "client!uc", name = "ab", descriptor = "[[I")
    private int[][] field3811;

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class202() {
        super(1, true);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZILjava/awt/Component;Lt;)Llg;")
    public static final class116 method1338(int arg0, boolean arg1, int arg2, Component arg3, class189 arg4) {
        ++field3817;
        if (~class108.field2080 == -1) {
            throw new IllegalStateException();
        } else if (~arg0 <= -1 && ~arg0 > -3) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class116 var5 = (class116) Class.forName("pf").newInstance();
                var5.field2238 = new int[256 * (!class16.field290 ? 1 : 2)];
                var5.field2254 = arg2;
                var5.method85(arg3);
                var5.field2258 = (arg2 & -1024) + 1024;
                if (var5.field2258 > 16384) {
                    var5.field2258 = 16384;
                }
                var5.method84(var5.field2258);
                if (~class41.field804 < -1 && class109.field2110 == null) {
                    class109.field2110 = new class142();
                    class109.field2110.field2746 = arg4;
                    arg4.method1256(3360, class41.field804, class109.field2110);
                }
                if (class109.field2110 != null) {
                    if (class109.field2110.field2749[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class109.field2110.field2749[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    if (!arg1) {
                        return null;
                    } else {
                        class13 var6 = new class13(arg4, arg0);
                        var6.field2238 = new int[(!class16.field290 ? 1 : 2) * 256];
                        var6.field2254 = arg2;
                        var6.method85(arg3);
                        var6.field2258 = 16384;
                        var6.method84(var6.field2258);
                        if (~class41.field804 < -1 && class109.field2110 == null) {
                            class109.field2110 = new class142();
                            class109.field2110.field2746 = arg4;
                            arg4.method1256(3360, class41.field804, class109.field2110);
                        }
                        if (class109.field2110 != null) {
                            if (class109.field2110.field2749[arg0] != null) {
                                throw new IllegalArgumentException();
                            }
                            class109.field2110.field2749[arg0] = var6;
                        }
                        return var6;
                    }
                } catch (Throwable var7) {
                    return new class116();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(II)[I")
    private final int[] method1339(int arg0, int arg1) {
        if (arg0 > -57) {
            this.method31(13, 107, (class146) null);
        }
        ++field3818;
        if (arg1 < 0) {
            return this.field3808;
        } else {
            return this.field3811.length <= arg1 ? this.field3813 : this.field3811[arg1];
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
    private final void method1340(byte arg0) {
        ++field3803;
        int[] var2 = this.field3811[0];
        int[] var3 = this.field3811[1];
        int[] var4 = this.field3811[this.field3811.length + -1];
        int[] var5 = this.field3811[this.field3811.length + -2];
        this.field3808 = new int[] { var2[0] - var3[0] + var2[0], var2[1] - -var2[1] - var3[1] };
        this.field3813 = new int[] { var5[0] + -var4[0] + var5[0], -var4[1] - (-var5[1] - var5[1]) };
        if (arg0 < 5) {
            this.method30((byte) -118, 4);
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)V")
    public static void method1341(byte arg0) {
        field3805 = null;
        int var1 = 50 % ((37 - arg0) / 49);
        field3809 = null;
        field3819 = null;
        field3825 = null;
        field3822 = null;
        field3804 = null;
        field3821 = null;
    }

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "(I)V")
    private final void method1342(int arg0) {
        int var2 = this.field3814;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field3811.length + -1 && ~this.field3811[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field3811[var5];
                    int[] var7 = this.field3811[var5 - 1];
                    int var8 = (-var7[0] + var4 << 12) / (var6[0] + -var7[0]);
                    int var9 = 4096 - class135.field2566[255 & var8 >> 5] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var9 + var7[1] * var10 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field3806[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field3811.length + -1 > var14 && ~var13 <= ~this.field3811[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field3811[var14];
                    int[] var16 = this.field3811[var14 - 1];
                    int var17 = (var13 - var16[0] << 12) / (var15[0] + -var16[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field3806[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var22 = var20 << 4;
                int var23;
                for (var23 = 1; ~var23 > ~(this.field3811.length + -1) && var22 >= this.field3811[var23][0]; ++var23) {
                }
                int[] var24 = this.field3811[var23];
                int[] var25 = this.field3811[var23 - 1];
                int var26 = this.method1339(-81, var23 + -2)[1];
                int var27 = var25[1];
                int var28 = var24[1];
                int var29 = this.method1339(-94, var23 + 1)[1];
                int var30 = (-var25[0] + var22 << 12) / (var24[0] + -var25[0]);
                int var31 = -var26 + -var28 + var27 + var29;
                int var32 = var30 * var30 >> 12;
                int var33 = var28 - var26;
                int var35 = var26 - (var27 + var31);
                int var36 = (var30 * var31 >> 12) * var32 >> 12;
                int var37 = var32 * var35 >> 12;
                int var38 = var30 * var33 >> 12;
                int var39 = var27 + var38 + var37 + var36;
                if (var39 <= -32768) {
                    var39 = -32767;
                }
                if (var39 >= 32768) {
                    var39 = 32767;
                }
                this.field3806[var20] = (short) var39;
            }
        }
        ++field3815;
        int var21 = -4 % ((arg0 - -17) / 46);
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V")
    public final void method47(int arg0) {
        if (this.field3811 == null) {
            this.field3811 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field3807;
        if (this.field3811.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field3814 == 2) {
                this.method1340((byte) 86);
            }
            class54.method359(arg0);
            this.method1342(41);
            if (arg0 != 1) {
                field3804 = null;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(III)V")
    public static final void method1343(int arg0, int arg1, int arg2) {
        class27.field515 = true;
        class57.field1094 = arg0;
        class32.field671 = arg1;
        client.field605 = arg2;
        field3823 = -1;
        class27.field508 = -1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        ++field3812;
        int[] var3 = super.field100.method842(arg1, 12);
        if (super.field100.field2534) {
            int[] var4 = this.method52(arg1, 0, 120);
            for (int var5 = 0; class117.field2272 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field3806[var6];
            }
        }
        return arg0 <= 13 ? null : var3;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        if (arg0 == 0) {
            this.field3814 = arg2.method991(255);
            this.field3811 = new int[arg2.method991(255)][2];
            for (int var4 = 0; ~var4 > ~this.field3811.length; ++var4) {
                this.field3811[var4][0] = arg2.method1007(104);
                this.field3811[var4][1] = arg2.method1007(91);
            }
        }
        int var5 = 15 / ((arg1 - 66) / 57);
        ++field3816;
    }
}
