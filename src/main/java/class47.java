import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class47 {

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "Z")
    public boolean field722 = false;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
    public int field734 = -1;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
    public int field731 = -1;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "I")
    public int field728 = 99;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public int field725 = 2;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    public int field730 = -1;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "Z")
    public boolean field726 = false;

    @OriginalMember(owner = "client!hq", name = "B", descriptor = "Z")
    public boolean field747 = false;

    @OriginalMember(owner = "client!hq", name = "w", descriptor = "I")
    public int field742 = 5;

    @OriginalMember(owner = "client!hq", name = "y", descriptor = "I")
    public int field744 = -1;

    @OriginalMember(owner = "client!hq", name = "H", descriptor = "I")
    public int field753 = -1;

    @OriginalMember(owner = "client!hq", name = "C", descriptor = "Z")
    public boolean field748 = false;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "Lvg;")
    public static class622 field733 = new class622(112, 4);

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "Z")
    public static boolean field745 = true;

    @OriginalMember(owner = "client!hq", name = "A", descriptor = "I")
    public static int field746 = 0;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!hq", name = "x", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!hq", name = "D", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!hq", name = "E", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!hq", name = "G", descriptor = "I")
    public int field752;

    @OriginalMember(owner = "client!hq", name = "v", descriptor = "Lar;")
    public class524 field741;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "[I")
    public int[] field724;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "[I")
    private int[] field727;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "[I")
    public int[] field729;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "[I")
    public int[] field732;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "[I")
    public int[] field736;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "[I")
    public int[] field737;

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "[Lf;")
    public static class256[] field740;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "[Z")
    public boolean[] field735;

    @OriginalMember(owner = "client!hq", name = "F", descriptor = "[[B")
    public static byte[][] field751;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "[[I")
    public int[][] field721;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)Lkn;")
    public static final class306 method278(int arg0, int arg1, int arg2) {
        class44 var3 = class603.field8695[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class306 var4 = var3.field673;
            var3.field673 = null;
            class355.method2197(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
    public static void method279(int arg0) {
        if (arg0 == 128) {
            field751 = null;
            field733 = null;
            field740 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
    public final void method280(byte arg0) {
        if (this.field731 == -1) {
            if (this.field735 == null) {
                this.field731 = 0;
            } else {
                this.field731 = 2;
            }
        }
        field749++;
        if (arg0 != 1) {
            this.method280((byte) -7);
        }
        if (this.field744 != -1) {
            return;
        }
        if (this.field735 == null) {
            this.field744 = 0;
        } else {
            this.field744 = 2;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BLgk;)V")
    public final void method281(byte arg0, class540 arg1) {
        while (true) {
            int var3 = arg1.method3115(arg0 ^ 0x74E8);
            if (var3 == 0) {
                field738++;
                if (arg0 != 71) {
                    this.field735 = null;
                    return;
                }
                return;
            }
            this.method285((byte) -69, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIBILda;II)Lda;")
    public final class395 method282(int arg0, int arg1, int arg2, byte arg3, int arg4, class395 arg5, int arg6, int arg7) {
        field723++;
        int var9 = this.field729[arg2];
        int var10 = this.field732[arg2];
        class128 var11 = this.field741.method2967(arg7 - 65536, var10 >> 16);
        int var12 = var10 & arg7;
        if (var11 == null) {
            return arg5.method1038(arg3, arg0, true);
        }
        class128 var13 = null;
        if ((this.field722 || class59.field959) && arg6 != -1 && arg6 < this.field732.length) {
            int var14 = this.field732[arg6];
            var13 = this.field741.method2967(-1, var14 >> 16);
            arg6 = var14 & 0xFFFF;
        }
        if (this.field726) {
            arg0 |= 0x200;
        }
        if (var11.method913(arg7 - 65453, var12)) {
            arg0 |= 0x80;
        }
        if (var11.method916(var12, (byte) -103)) {
            arg0 |= 0x100;
        }
        if (var11.method914((byte) -127, var12)) {
            arg0 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method913(121, arg6)) {
                arg0 |= 0x80;
            }
            if (var13.method916(arg6, (byte) -103)) {
                arg0 |= 0x100;
            }
            if (var13.method914((byte) -125, arg6)) {
                arg0 |= 0x400;
            }
        }
        int var15 = arg0 | 0x20;
        class395 var16 = arg5.method1038(arg3, var15, true);
        var16.method2456(var9, var12, arg4, var13, var11, arg1 - 1, arg6, arg7 - 65535, this.field726);
        return var16;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IILda;III)Lda;")
    public final class395 method283(int arg0, int arg1, class395 arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 256) {
            return null;
        }
        field720++;
        int var7 = this.field729[arg0];
        int var8 = this.field732[arg0];
        class128 var9 = this.field741.method2967(-1, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method1038((byte) 1, arg3, true);
        }
        class128 var11 = null;
        if ((this.field722 || class59.field959) && arg4 != -1 && arg4 < this.field732.length) {
            int var12 = this.field732[arg4];
            var11 = this.field741.method2967(-1, var12 >> 16);
            arg4 = var12 & 0xFFFF;
        }
        class128 var13 = null;
        class128 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field727 != null) {
            if (this.field727.length > arg0) {
                var15 = this.field727[arg0];
                if (var15 != 65535) {
                    var13 = this.field741.method2967(-1, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field722 || class59.field959) && arg4 != -1 && this.field727.length > arg4) {
                var16 = this.field727[arg4];
                if (var16 != 65535) {
                    var14 = this.field741.method2967(arg1 ^ 0xFFFFFEFF, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field726) {
            arg3 |= 0x200;
        }
        if (var9.method913(82, var10)) {
            arg3 |= 0x80;
        }
        if (var9.method916(var10, (byte) -103)) {
            arg3 |= 0x100;
        }
        if (var9.method914((byte) -128, var10)) {
            arg3 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method913(120, var15)) {
                arg3 |= 0x80;
            }
            if (var13.method916(var15, (byte) -103)) {
                arg3 |= 0x100;
            }
            if (var13.method914((byte) -125, var15)) {
                arg3 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method913(98, arg4)) {
                arg3 |= 0x80;
            }
            if (var11.method916(arg4, (byte) -103)) {
                arg3 |= 0x100;
            }
            if (var11.method914((byte) -126, arg4)) {
                arg3 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method913(113, var16)) {
                arg3 |= 0x80;
            }
            if (var14.method916(var16, (byte) -103)) {
                arg3 |= 0x100;
            }
            if (var14.method914((byte) -128, var16)) {
                arg3 |= 0x400;
            }
        }
        int var17 = arg3 | 0x20;
        class395 var18 = arg2.method1038((byte) 1, var17, true);
        var18.method2456(var7, var10, 0, var11, var9, arg5 - 1, arg4, 0, this.field726);
        if (var13 != null) {
            var18.method2456(var7, var15, 0, var14, var13, arg5 - 1, var16, 0, this.field726);
        }
        return var18;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZIBI)I")
    public final int method284(boolean arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -53) {
            return -14;
        }
        field739++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field732[arg1];
        class128 var8 = null;
        class128 var9 = this.field741.method2967(-1, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field722 || class59.field959) && arg3 != -1 && this.field732.length > arg3) {
            int var11 = this.field732[arg3];
            var8 = this.field741.method2967(arg2 ^ 0x34, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field726) {
            var5 |= 0x200;
        }
        if (var9.method913(81, var10)) {
            var5 |= 0x80;
        }
        if (var9.method916(var10, (byte) -103)) {
            var5 |= 0x100;
        }
        if (var9.method914((byte) -126, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method913(105, var6)) {
                var5 |= 0x80;
            }
            if (var8.method916(var6, (byte) -103)) {
                var5 |= 0x100;
            }
            if (var8.method914((byte) -128, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field727 != null && arg0) {
            if (this.field727.length > arg1) {
                int var12 = this.field727[arg1];
                if (var12 != 65535) {
                    class128 var13 = this.field741.method2967(arg2 ^ 0x34, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method913(83, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method916(var14, (byte) -103)) {
                            var5 |= 0x100;
                        }
                        if (var13.method914((byte) -127, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field722 || class59.field959) && arg3 != -1 && arg3 < this.field727.length) {
                int var15 = this.field727[arg3];
                if (var15 != 65535) {
                    class128 var16 = this.field741.method2967(arg2 ^ 0x34, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method913(84, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method916(var17, (byte) -103)) {
                            var5 |= 0x100;
                        }
                        if (var16.method914((byte) -126, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BILgk;)V")
    private final void method285(byte arg0, int arg1, class540 arg2) {
        field750++;
        if (arg0 > 0) {
            this.field734 = -28;
        }
        if (arg1 == 1) {
            int var4 = arg2.method3169(26488);
            this.field729 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field729[var5] = arg2.method3169(26488);
            }
            this.field732 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field732[var6] = arg2.method3169(26488);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field732[var7] = (arg2.method3169(26488) << 16) + this.field732[var7];
            }
        } else if (arg1 == 2) {
            this.field730 = arg2.method3169(26488);
        } else if (arg1 == 3) {
            this.field735 = new boolean[256];
            int var18 = arg2.method3115(29871);
            for (int var19 = 0; var19 < var18; var19++) {
                this.field735[arg2.method3115(29871)] = true;
            }
        } else if (arg1 == 5) {
            this.field742 = arg2.method3115(29871);
        } else if (arg1 == 6) {
            this.field734 = arg2.method3169(26488);
        } else if (arg1 == 7) {
            this.field753 = arg2.method3169(26488);
        } else if (arg1 == 8) {
            this.field728 = arg2.method3115(29871);
        } else if (arg1 == 9) {
            this.field731 = arg2.method3115(29871);
        } else if (arg1 == 10) {
            this.field744 = arg2.method3115(29871);
        } else if (arg1 == 11) {
            this.field725 = arg2.method3115(29871);
        } else if (arg1 == 12) {
            int var8 = arg2.method3115(29871);
            this.field727 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field727[var9] = arg2.method3169(26488);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field727[var10] = (arg2.method3169(26488) << 16) + this.field727[var10];
            }
        } else if (arg1 == 13) {
            int var14 = arg2.method3169(26488);
            this.field721 = new int[var14][];
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = arg2.method3115(29871);
                if (var16 > 0) {
                    this.field721[var15] = new int[var16];
                    this.field721[var15][0] = arg2.method3154((byte) -109);
                    for (int var17 = 1; var17 < var16; var17++) {
                        this.field721[var15][var17] = arg2.method3169(26488);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field726 = true;
        } else if (arg1 == 15) {
            this.field722 = true;
        } else if (arg1 == 16) {
            this.field748 = true;
        } else if (arg1 == 18) {
            this.field747 = true;
            return;
        } else if (arg1 == 19) {
            if (this.field724 == null) {
                this.field724 = new int[this.field721.length];
                for (int var11 = 0; var11 < this.field721.length; var11++) {
                    this.field724[var11] = 255;
                }
            }
            this.field724[arg2.method3115(29871)] = arg2.method3115(29871);
            return;
        } else if (arg1 == 20) {
            if (this.field736 == null || this.field737 == null) {
                this.field736 = new int[this.field721.length];
                this.field737 = new int[this.field721.length];
                for (int var12 = 0; var12 < this.field721.length; var12++) {
                    this.field736[var12] = 256;
                    this.field737[var12] = 256;
                }
            }
            int var13 = arg2.method3115(29871);
            this.field736[var13] = arg2.method3169(26488);
            this.field737[var13] = arg2.method3169(26488);
            return;
        }
    }
}
