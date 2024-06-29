import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class161 extends class99 {

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    private int field2884 = 4096;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
    private int field2890 = 4096;

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
    private int field2891 = 4096;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "I")
    public static int field2887 = 0;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!sa", name = "ab", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "Lsg;")
    public static class247 field2892;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "Lcj;")
    public static class28 field2886;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBIII)V")
    public static final void method1089(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 == -34) {
            for (class217 var5 = (class217) class259.field4539.method873((byte) 76); var5 != null; var5 = (class217) class259.field4539.method870((byte) -127)) {
                class180.method1201(93, arg2, arg3, arg0, var5, arg4);
            }
            for (class217 var6 = (class217) class222.field3784.method873((byte) 76); var6 != null; var6 = (class217) class222.field3784.method870((byte) -125)) {
                byte var10 = 1;
                if (~var6.field3742.field2046 != ~var6.field3742.field2040) {
                    if (var6.field3742.field2056 == var6.field3742.field2040) {
                        var10 = 2;
                    }
                } else {
                    var10 = 0;
                }
                if (var6.field3729 != var10) {
                    int var11 = class145.method995(var6.field3742, false);
                    if (~var6.field3724 != ~var11) {
                        if (var6.field3722 != null) {
                            class206.field3528.method1031(var6.field3722);
                            var6.field3722 = null;
                        }
                        var6.field3724 = var11;
                    }
                    var6.field3729 = var10;
                }
                var6.field3746 = var6.field3742.field2077;
                var6.field3720 = var6.field3742.field2060 * 64 + var6.field3742.field2053;
                var6.field3733 = var6.field3742.field2053;
                var6.field3744 = var6.field3742.field2060 * 64 + var6.field3742.field2077;
                class180.method1201(arg1 ^ -78, arg2, arg3, arg0, var6, arg4);
            }
            ++field2883;
            for (class217 var7 = (class217) class52.field921.method1382(-32642); var7 != null; var7 = (class217) class52.field921.method1386((byte) -102)) {
                byte var8 = 1;
                if (var7.field3732.field2046 == var7.field3732.field2040) {
                    var8 = 0;
                } else if (var7.field3732.field2056 == var7.field3732.field2040) {
                    var8 = 2;
                }
                if (~var7.field3729 != ~var8) {
                    int var9 = class40.method255(var7.field3732, -6694);
                    if (~var7.field3724 != ~var9) {
                        if (var7.field3722 != null) {
                            class206.field3528.method1031(var7.field3722);
                            var7.field3722 = null;
                        }
                        var7.field3724 = var9;
                    }
                    var7.field3729 = var8;
                }
                var7.field3733 = var7.field3732.field2053;
                var7.field3746 = var7.field3732.field2077;
                var7.field3720 = var7.field3732.field2053 - -(var7.field3732.field2060 * 64);
                var7.field3744 = var7.field3732.field2077 - -(var7.field3732.field2060 * 64);
                class180.method1201(112, arg2, arg3, arg0, var7, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)V")
    public static final void method1090(int arg0, int arg1) {
        class230.field3979 = new int[arg1];
        class162.field2911 = new int[arg1];
        if (arg0 >= -46) {
            field2887 = -119;
        }
        class101.field1962 = new int[arg1];
        class240.field4160 = new int[arg1];
        class247.field4296 = new int[arg1];
        ++field2885;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method37(int arg0, boolean arg1) {
        ++field2889;
        if (!arg1) {
            return null;
        } else {
            int[][] var3 = super.field1946.method823(arg0, (byte) -122);
            if (super.field1946.field2297) {
                int[][] var4 = this.method683(-107, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var3[0];
                for (int var11 = 0; ~class199.field3432 < ~var11; ++var11) {
                    int var12 = var7[var11];
                    int var13 = var6[var11];
                    int var14 = var5[var11];
                    if (var12 == var14 && var12 == var13) {
                        var10[var11] = this.field2884 * var14 >> 12;
                        var8[var11] = this.field2891 * var12 >> 12;
                        var9[var11] = this.field2890 * var13 >> 12;
                    } else {
                        var10[var11] = this.field2884;
                        var8[var11] = this.field2891;
                        var9[var11] = this.field2890;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZLcj;ILcj;)Lw;")
    public static final class154 method1091(int arg0, boolean arg1, class28 arg2, int arg3, class28 arg4) {
        ++field2888;
        boolean var5 = true;
        int[] var6 = arg4.method142(false, arg3);
        if (arg0 > -31) {
            field2892 = null;
        }
        for (int var7 = 0; ~var7 > ~var6.length; ++var7) {
            byte[] var8 = arg4.method140(var6[var7], 14281, arg3);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 255 | (255 & var8[0]) << 8;
                byte[] var10;
                if (arg1) {
                    var10 = arg2.method140(var9, 14281, 0);
                } else {
                    var10 = arg2.method140(0, 14281, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        } else {
            try {
                return new class154(arg4, arg2, arg3, arg1);
            } catch (Exception var11) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)V")
    public static void method1092(int arg0) {
        field2892 = null;
        int var1 = 89 / ((arg0 - 55) / 54);
        field2886 = null;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class161() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        ++field2893;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field2890 = arg0.method1674(1355769544);
                }
            } else {
                this.field2891 = arg0.method1674(arg2 + 1355769545);
            }
        } else {
            this.field2884 = arg0.method1674(1355769544);
        }
        if (arg2 != -1) {
            method1092(-105);
        }
    }
}
