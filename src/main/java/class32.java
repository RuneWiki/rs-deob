import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class32 {

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "Z")
    public boolean field510 = true;

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
    private int field513 = -1;

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
    private int field517;

    @OriginalMember(owner = "client!wv", name = "p", descriptor = "Lno;")
    private class658 field521;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "Lwaa;")
    private class659 field507;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "Lgaa;")
    private class275 field506;

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "Lqn;")
    private class60 field515;

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "Lfl;")
    private class692 field516;

    @OriginalMember(owner = "client!wv", name = "o", descriptor = "Lnea;")
    public static class670 field520 = new class670();

    @OriginalMember(owner = "client!wv", name = "t", descriptor = "I")
    public static int field525 = 0;

    @OriginalMember(owner = "client!wv", name = "s", descriptor = "[Liv;")
    public static class87[] field524 = new class87[16];

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!wv", name = "m", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!wv", name = "n", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!wv", name = "q", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!wv", name = "r", descriptor = "Lrt;")
    public static class212 field523;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V", line = 4)
    public static final void method262(int arg0) {
        field519++;
        if (arg0 >= -9) {
            method266(58);
        }
        if (class10.field197 == null) {
            return;
        }
        class670.field9502.method324(-104);
        class288.method1783();
        class75.method594((byte) 117);
        class312.method1862(5121);
        class397.method2280(-83);
        class9.method121(-117);
        if (class111.field1784 != null) {
            class111.field1784.method1192(1);
        }
        class680.method3795(-1697594487);
        class465.method2628((byte) -111);
        class601.method3312((byte) 53);
        class690.method3836((byte) -73);
        class148.method1065(64, false);
        for (int var1 = 0; var1 < 2048; var1++) {
            class403 var5 = class572.field7601[var1];
            if (var5 != null) {
                var5.field5646 = null;
                for (int var6 = 0; var6 < var5.field5640.length; var6++) {
                    var5.field5640[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class176.field2705; var2++) {
            class287 var3 = class51.field718[var2].field3983;
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field5640.length; var4++) {
                    var3.field5640[var4] = null;
                }
            }
        }
        class129.field2152 = null;
        class166.field2583 = null;
        class10.field197.method3574(46);
        class10.field197 = null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V", line = 82)
    public final void method263(byte arg0) {
        if (arg0 != 72) {
            this.field508 = 95;
        }
        this.method265(this.field512, true, this.field515);
        field514++;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(III[B)V", line = 93)
    public final void method264(int arg0, int arg1, int arg2, byte[] arg3) {
        field509++;
        this.field516.method490(arg2, arg1 * this.field521.method3627(false, arg2), true, arg3);
        if (arg0 == -128) {
            this.method265(arg1, true, this.field516);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IZLqn;)V", line = 111)
    private final void method265(int arg0, boolean arg1, class60 arg2) {
        field522++;
        if (arg1 && arg0 != 0) {
            this.method267(false);
            this.field521.method3630(this.field506, -2);
            this.field521.method3605(0, arg2, arg0, 4, (byte) 6);
        }
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)V", line = 129)
    public static void method266(int arg0) {
        field523 = null;
        if (arg0 != 2048) {
            field520 = null;
        }
        field524 = null;
        field520 = null;
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lno;Lwaa;Lsm;IIIII)V", line = 258)
    public class32(class658 arg0, class659 arg1, class262 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field517 = arg7;
        this.field521 = arg0;
        this.field508 = arg6;
        this.field507 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field2247 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field3599[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field512 = var10;
        if (var10 <= 0) {
            this.field506 = null;
        } else {
            class335 var14 = new class335(var10 * 2);
            if (this.field521.field9272) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field2247 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field3599[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method2031((byte) 54, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field2247 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field3599[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method2008(27798, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field515 = this.field521.method3625(false, var14.field4600, -7206, var14.field4619, 5123);
            this.field516 = new class692(this.field521, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Z)V", line = 145)
    private final void method267(boolean arg0) {
        field518++;
        if (!this.field510) {
            return;
        }
        this.field510 = arg0;
        byte[] var2 = this.field507.field9355;
        byte[] var3 = this.field521.field9336;
        int var4 = 0;
        int var5 = this.field507.field9341;
        int var6 = this.field508 + (this.field507.field9341 * this.field517);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field506 != null && this.field513 == var4) {
            this.field510 = false;
            return;
        }
        this.field513 = var4;
        int var8 = 0;
        int var9 = this.field508 + (this.field517 * var5);
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var9] == 0) {
                    int var12 = 0;
                    if (var2[var9 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var9] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field507.field9341 - 128;
        }
        if (this.field506 == null) {
            this.field506 = new class275(this.field521, 3553, 6406, 128, 128, false, this.field521.field9336, 6406, false);
            this.field506.method1664(false, false, (byte) 18);
            this.field506.method2163(-30033, true);
        } else {
            this.field506.method1670((byte) 12, 0, 0, 0, 6406, 128, this.field521.field9336, 128, false, 0);
        }
    }
}
