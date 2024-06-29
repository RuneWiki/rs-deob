import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class616 {

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
    public int field8147 = -1;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
    public int field8141 = -1;

    @OriginalMember(owner = "client!dv", name = "o", descriptor = "I")
    public int field8155 = 5;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
    public int field8146 = -1;

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
    public int field8154 = -1;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
    public int field8150 = 99;

    @OriginalMember(owner = "client!dv", name = "r", descriptor = "I")
    public int field8158 = 0;

    @OriginalMember(owner = "client!dv", name = "y", descriptor = "Z")
    public boolean field8165 = false;

    @OriginalMember(owner = "client!dv", name = "A", descriptor = "I")
    public int field8167 = -1;

    @OriginalMember(owner = "client!dv", name = "v", descriptor = "I")
    public int field8162 = 2;

    @OriginalMember(owner = "client!dv", name = "p", descriptor = "Z")
    public boolean field8156 = false;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "Z")
    public boolean field8145 = false;

    @OriginalMember(owner = "client!dv", name = "B", descriptor = "Z")
    public boolean field8168 = false;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "Ljw;")
    public static class520 field8143 = new class520(64);

    @OriginalMember(owner = "client!dv", name = "x", descriptor = "Lhi;")
    public static class193 field8164 = new class193(1);

    @OriginalMember(owner = "client!dv", name = "C", descriptor = "Ltga;")
    public static class54 field8169 = new class54("LIVE", 0);

    @OriginalMember(owner = "client!dv", name = "D", descriptor = "Z")
    public static boolean field8170 = false;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public static int field8142;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public int field8144;

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "I")
    public static int field8151;

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "I")
    public static int field8152;

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
    public static int field8153;

    @OriginalMember(owner = "client!dv", name = "q", descriptor = "I")
    public static int field8157;

    @OriginalMember(owner = "client!dv", name = "s", descriptor = "I")
    public static int field8159;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "Luc;")
    public class27 field8148;

    @OriginalMember(owner = "client!dv", name = "t", descriptor = "[I")
    public int[] field8160;

    @OriginalMember(owner = "client!dv", name = "u", descriptor = "[I")
    private int[] field8161;

    @OriginalMember(owner = "client!dv", name = "w", descriptor = "[I")
    public int[] field8163;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "[Z")
    public boolean[] field8149;

    @OriginalMember(owner = "client!dv", name = "z", descriptor = "[[I")
    public int[][] field8166;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V", line = 6)
    public static void method3370(int arg0) {
        field8169 = null;
        field8164 = null;
        field8143 = null;
        if (arg0 > -110) {
            field8169 = null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIBIBILba;)Lba;", line = 25)
    public final class358 method3371(int arg0, int arg1, int arg2, byte arg3, int arg4, byte arg5, int arg6, class358 arg7) {
        field8142++;
        int var9 = this.field8163[arg6];
        int var10 = this.field8160[arg6];
        if (arg3 != 74) {
            this.field8167 = 52;
        }
        class696 var11 = this.field8148.method229(-91, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg7.method1519(arg5, arg2, true);
        }
        class696 var13 = null;
        if ((this.field8156 || class672.field9512) && arg0 != -1 && arg0 < this.field8160.length) {
            int var14 = this.field8160[arg0];
            var13 = this.field8148.method229(arg3 - 109, var14 >> 16);
            arg0 = var14 & 0xFFFF;
        }
        if (this.field8165) {
            arg2 |= 0x200;
        }
        if (var11.method3855(1, var12)) {
            arg2 |= 0x80;
        }
        if (var11.method3853(var12, (byte) 19)) {
            arg2 |= 0x100;
        }
        if (var11.method3856(false, var12)) {
            arg2 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3855(1, arg0)) {
                arg2 |= 0x80;
            }
            if (var13.method3853(arg0, (byte) 19)) {
                arg2 |= 0x100;
            }
            if (var13.method3856(false, arg0)) {
                arg2 |= 0x400;
            }
        }
        int var15 = arg2 | 0x20;
        class358 var16 = arg7.method1519(arg5, var15, true);
        var16.method2110(this.field8165, arg1, var9, arg0, arg3 ^ 0xFFFFFF8B, var13, var12, var11, arg4 - 1);
        return var16;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(BLeh;)V", line = 87)
    public final void method3372(byte arg0, class335 arg1) {
        while (true) {
            int var3 = arg1.method2034(255);
            if (var3 == 0) {
                int var4 = -126 / ((arg0 + 85) / 38);
                field8153++;
                return;
            }
            this.method3376(arg1, 3132, var3);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IBIIILba;)Lba;", line = 109)
    public final class358 method3373(int arg0, byte arg1, int arg2, int arg3, int arg4, class358 arg5) {
        field8157++;
        int var7 = this.field8163[arg0];
        int var8 = this.field8160[arg0];
        class696 var9 = this.field8148.method229(-118, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg5.method1519((byte) 1, arg2, true);
        }
        class696 var11 = null;
        if ((this.field8156 || class672.field9512) && arg4 != -1 && arg4 < this.field8160.length) {
            int var12 = this.field8160[arg4];
            var11 = this.field8148.method229(-63, var12 >> 16);
            arg4 = var12 & 0xFFFF;
        }
        class696 var13 = null;
        class696 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field8161 != null) {
            if (this.field8161.length > arg0) {
                var15 = this.field8161[arg0];
                if (var15 != 65535) {
                    var13 = this.field8148.method229(-100, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field8156 || class672.field9512) && arg4 != -1 && this.field8161.length > arg4) {
                var16 = this.field8161[arg4];
                if (var16 != 65535) {
                    var14 = this.field8148.method229(-120, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field8165) {
            arg2 |= 0x200;
        }
        if (var9.method3855(1, var10)) {
            arg2 |= 0x80;
        }
        if (var9.method3853(var10, (byte) 19)) {
            arg2 |= 0x100;
        }
        if (var9.method3856(false, var10)) {
            arg2 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3855(1, var15)) {
                arg2 |= 0x80;
            }
            if (var13.method3853(var15, (byte) 19)) {
                arg2 |= 0x100;
            }
            if (var13.method3856(false, var15)) {
                arg2 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method3855(1, arg4)) {
                arg2 |= 0x80;
            }
            if (var11.method3853(arg4, (byte) 19)) {
                arg2 |= 0x100;
            }
            if (var11.method3856(false, arg4)) {
                arg2 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method3855(1, var16)) {
                arg2 |= 0x80;
            }
            if (var14.method3853(var16, (byte) 19)) {
                arg2 |= 0x100;
            }
            if (var14.method3856(false, var16)) {
                arg2 |= 0x400;
            }
        }
        int var17 = arg2 | 0x20;
        if (arg1 != 44) {
            this.field8147 = -13;
        }
        class358 var18 = arg5.method1519((byte) 1, var17, true);
        var18.method2110(this.field8165, 0, var7, arg4, -60, var11, var10, var9, arg3 - 1);
        if (var13 != null) {
            var18.method2110(this.field8165, 0, var7, var16, arg1 - 100, var14, var15, var13, arg3 - 1);
        }
        return var18;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IZII)I", line = 265)
    public final int method3374(int arg0, boolean arg1, int arg2, int arg3) {
        field8159++;
        int var5 = 0;
        int var6 = 0;
        if (arg0 < 104) {
            field8170 = false;
        }
        int var7 = this.field8160[arg3];
        class696 var8 = null;
        class696 var9 = this.field8148.method229(-76, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field8156 || class672.field9512) && arg2 != -1 && arg2 < this.field8160.length) {
            int var11 = this.field8160[arg2];
            var8 = this.field8148.method229(-122, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field8165) {
            var5 |= 0x200;
        }
        if (var9.method3855(1, var10)) {
            var5 |= 0x80;
        }
        if (var9.method3853(var10, (byte) 19)) {
            var5 |= 0x100;
        }
        if (var9.method3856(false, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method3855(1, var6)) {
                var5 |= 0x80;
            }
            if (var8.method3853(var6, (byte) 19)) {
                var5 |= 0x100;
            }
            if (var8.method3856(false, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field8161 != null && arg1) {
            if (arg3 < this.field8161.length) {
                int var12 = this.field8161[arg3];
                if (var12 != 65535) {
                    class696 var13 = this.field8148.method229(-56, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method3855(1, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method3853(var14, (byte) 19)) {
                            var5 |= 0x100;
                        }
                        if (var13.method3856(false, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field8156 || class672.field9512) && arg2 != -1 && this.field8161.length > arg2) {
                int var15 = this.field8161[arg2];
                if (var15 != 65535) {
                    class696 var16 = this.field8148.method229(-90, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method3855(1, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method3853(var17, (byte) 19)) {
                            var5 |= 0x100;
                        }
                        if (var16.method3856(false, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V", line = 400)
    public final void method3375(int arg0) {
        if (arg0 > -75) {
            this.method3371(-93, 122, -3, (byte) -40, 24, (byte) -127, -36, null);
        }
        if (this.field8167 == -1) {
            if (this.field8149 == null) {
                this.field8167 = 0;
            } else {
                this.field8167 = 2;
            }
        }
        if (this.field8154 == -1) {
            if (this.field8149 == null) {
                this.field8154 = 0;
            } else {
                this.field8154 = 2;
            }
        }
        field8151++;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Leh;II)V", line = 454)
    private final void method3376(class335 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            int var13 = arg0.method2001((byte) -83);
            this.field8163 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field8163[var14] = arg0.method2001((byte) -83);
            }
            this.field8160 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field8160[var15] = arg0.method2001((byte) -83);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field8160[var16] = (arg0.method2001((byte) -83) << 16) + this.field8160[var16];
            }
        } else if (arg2 == 2) {
            this.field8146 = arg0.method2001((byte) -83);
        } else if (arg2 == 3) {
            this.field8149 = new boolean[256];
            int var11 = arg0.method2034(255);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field8149[arg0.method2034(255)] = true;
            }
        } else if (arg2 == 5) {
            this.field8155 = arg0.method2034(255);
        } else if (arg2 == 6) {
            this.field8147 = arg0.method2001((byte) -83);
        } else if (arg2 == 7) {
            this.field8141 = arg0.method2001((byte) -83);
        } else if (arg2 == 8) {
            this.field8150 = arg0.method2034(255);
        } else if (arg2 == 9) {
            this.field8167 = arg0.method2034(255);
        } else if (arg2 == 10) {
            this.field8154 = arg0.method2034(arg1 - 2877);
        } else if (arg2 == 11) {
            this.field8162 = arg0.method2034(arg1 ^ 0xCC3);
        } else if (arg2 == 12) {
            int var4 = arg0.method2034(255);
            this.field8161 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field8161[var5] = arg0.method2001((byte) -83);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                this.field8161[var6] = (arg0.method2001((byte) -83) << 16) + this.field8161[var6];
            }
        } else if (arg2 == 13) {
            int var7 = arg0.method2001((byte) -83);
            this.field8166 = new int[var7][];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = arg0.method2034(255);
                if (var9 > 0) {
                    this.field8166[var8] = new int[var9];
                    this.field8166[var8][0] = arg0.method2042((byte) 53);
                    for (int var10 = 1; var10 < var9; var10++) {
                        this.field8166[var8][var10] = arg0.method2001((byte) -83);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field8165 = true;
        } else if (arg2 == 15) {
            this.field8156 = true;
        } else if (arg2 == 16) {
            this.field8145 = true;
        } else if (arg2 == 17) {
            this.field8158 = arg0.method2034(arg1 - 2877);
        } else if (arg2 == 18) {
            this.field8168 = true;
        }
        if (arg1 != 3132) {
            this.method3375(95);
        }
        field8152++;
    }
}
