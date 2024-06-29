import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class270 {

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public int field3737 = -1;

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "I")
    public int field3743 = -1;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "Z")
    public boolean field3736 = false;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "Z")
    public boolean field3744 = false;

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "I")
    public int field3754 = -1;

    @OriginalMember(owner = "client!tq", name = "w", descriptor = "I")
    public int field3756 = 5;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public int field3735 = 2;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
    public int field3739 = -1;

    @OriginalMember(owner = "client!tq", name = "y", descriptor = "I")
    public int field3758 = 99;

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "Z")
    public boolean field3751 = false;

    @OriginalMember(owner = "client!tq", name = "C", descriptor = "I")
    public int field3762 = -1;

    @OriginalMember(owner = "client!tq", name = "A", descriptor = "Z")
    public boolean field3760 = false;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "[S")
    public static short[] field3747 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!tq", name = "E", descriptor = "F")
    public static float field3764;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!tq", name = "v", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!tq", name = "x", descriptor = "I")
    public int field3757;

    @OriginalMember(owner = "client!tq", name = "B", descriptor = "Lwk;")
    public static class171 field3761;

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "Laj;")
    public class300 field3753;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "[I")
    private int[] field3740;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "[I")
    public int[] field3746;

    @OriginalMember(owner = "client!tq", name = "D", descriptor = "[I")
    public static int[] field3763;

    @OriginalMember(owner = "client!tq", name = "F", descriptor = "[I")
    public int[] field3765;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "[Z")
    public static boolean[] field3738;

    @OriginalMember(owner = "client!tq", name = "z", descriptor = "[Z")
    public boolean[] field3759;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "[[I")
    public int[][] field3742;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIBILc;I)Lc;", line = 7)
    public final class201 method1721(int arg0, int arg1, byte arg2, int arg3, class201 arg4, int arg5) {
        field3745++;
        int var7 = this.field3746[arg5];
        int var8 = this.field3765[arg5];
        class472 var9 = this.field3753.method1936(var8 >> 16, 213);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method292((byte) 1, arg1, true);
        }
        class472 var11 = null;
        if ((this.field3744 || class58.field786) && arg0 != -1 && this.field3765.length > arg0) {
            int var12 = this.field3765[arg0];
            var11 = this.field3753.method1936(var12 >> 16, 213);
            arg0 = var12 & 0xFFFF;
        }
        class472 var13 = null;
        if (arg2 != -69) {
            this.field3735 = -75;
        }
        class472 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field3740 != null) {
            if (arg5 < this.field3740.length) {
                var15 = this.field3740[arg5];
                if (var15 != 65535) {
                    var13 = this.field3753.method1936(var15 >> 16, 213);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field3744 || class58.field786) && arg0 != -1 && this.field3740.length > arg0) {
                var16 = this.field3740[arg0];
                if (var16 != 65535) {
                    var14 = this.field3753.method1936(var16 >> 16, 213);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field3760) {
            arg1 |= 0x200;
        }
        if (var9.method2837(var10, 26582)) {
            arg1 |= 0x80;
        }
        if (var9.method2834((byte) 73, var10)) {
            arg1 |= 0x100;
        }
        if (var9.method2836(var10, (byte) 11)) {
            arg1 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2837(var15, 26582)) {
                arg1 |= 0x80;
            }
            if (var13.method2834((byte) 91, var15)) {
                arg1 |= 0x100;
            }
            if (var13.method2836(var15, (byte) 11)) {
                arg1 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method2837(arg0, 26582)) {
                arg1 |= 0x80;
            }
            if (var11.method2834((byte) 61, arg0)) {
                arg1 |= 0x100;
            }
            if (var11.method2836(arg0, (byte) 11)) {
                arg1 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method2837(var16, arg2 + 26651)) {
                arg1 |= 0x80;
            }
            if (var14.method2834((byte) 83, var16)) {
                arg1 |= 0x100;
            }
            if (var14.method2836(var16, (byte) 11)) {
                arg1 |= 0x400;
            }
        }
        int var17 = arg1 | 0x20;
        class201 var18 = arg4.method292((byte) 1, var17, true);
        var18.method1398(var7, 0, arg0, arg2 ^ 0xFFFFFFBB, var10, this.field3760, var9, arg3 - 1, var11);
        if (var13 != null) {
            var18.method1398(var7, 0, var16, 0, var15, this.field3760, var13, arg3 - 1, var14);
        }
        return var18;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V", line = 141)
    public static void method1722(byte arg0) {
        if (arg0 != -63) {
            field3750 = -112;
        }
        field3763 = null;
        field3738 = null;
        field3747 = null;
        field3761 = null;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ltl;II)V", line = 157)
    private final void method1723(class91 arg0, int arg1, int arg2) {
        if (arg1 >= -91) {
            this.field3744 = true;
        }
        field3752++;
        if (arg2 == 1) {
            int var13 = arg0.method631(10494);
            this.field3746 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3746[var14] = arg0.method631(10494);
            }
            this.field3765 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field3765[var15] = arg0.method631(10494);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field3765[var16] = (arg0.method631(10494) << 16) + this.field3765[var16];
            }
        } else if (arg2 == 2) {
            this.field3737 = arg0.method631(10494);
        } else if (arg2 == 3) {
            this.field3759 = new boolean[256];
            int var4 = arg0.method618((byte) 100);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3759[arg0.method618((byte) 100)] = true;
            }
        } else if (arg2 == 4) {
            this.field3736 = true;
        } else if (arg2 == 5) {
            this.field3756 = arg0.method618((byte) 100);
        } else if (arg2 == 6) {
            this.field3743 = arg0.method631(10494);
        } else if (arg2 == 7) {
            this.field3762 = arg0.method631(10494);
        } else if (arg2 == 8) {
            this.field3758 = arg0.method618((byte) 100);
        } else if (arg2 == 9) {
            this.field3754 = arg0.method618((byte) 100);
        } else if (arg2 == 10) {
            this.field3739 = arg0.method618((byte) 100);
        } else if (arg2 == 11) {
            this.field3735 = arg0.method618((byte) 100);
        } else if (arg2 == 12) {
            int var6 = arg0.method618((byte) 100);
            this.field3740 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3740[var7] = arg0.method631(10494);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field3740[var8] += arg0.method631(10494) << 16;
            }
            return;
        } else if (arg2 == 13) {
            int var9 = arg0.method631(10494);
            this.field3742 = new int[var9][];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = arg0.method618((byte) 100);
                if (var11 > 0) {
                    this.field3742[var10] = new int[var11];
                    this.field3742[var10][0] = arg0.method641(32455);
                    for (int var12 = 1; var12 < var11; var12++) {
                        this.field3742[var10][var12] = arg0.method631(10494);
                    }
                }
            }
            return;
        } else if (arg2 == 14) {
            this.field3760 = true;
            return;
        } else if (arg2 == 15) {
            this.field3744 = true;
            return;
        } else if (arg2 == 16) {
            this.field3751 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljb;I)Ljb;", line = 321)
    public static final class499 method1724(class499 arg0, int arg1) {
        field3749++;
        if (arg0.field7322 != -1) {
            return class211.method1457(arg0.field7322, 6687);
        }
        int var2 = arg0.field7312 >>> 16;
        class304 var3 = new class304(class27.field449);
        for (class407 var4 = (class407) var3.method1951(140); var4 != null; var4 = (class407) var3.method1949((byte) 125)) {
            if (var4.field6155 == var2) {
                return class211.method1457((int) var4.field6799, 6687);
            }
        }
        if (arg1 != 325644272) {
            field3763 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BZII)I", line = 363)
    public final int method1725(byte arg0, boolean arg1, int arg2, int arg3) {
        field3748++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field3765[arg2];
        int var8 = 42 % ((arg0 + 44) / 50);
        class472 var9 = null;
        class472 var10 = this.field3753.method1936(var7 >> 16, 213);
        int var11 = var7 & 0xFFFF;
        if (var10 == null) {
            return var5;
        }
        if ((this.field3744 || class58.field786) && arg3 != -1 && arg3 < this.field3765.length) {
            int var12 = this.field3765[arg3];
            var9 = this.field3753.method1936(var12 >> 16, 213);
            var6 = var12 & 0xFFFF;
        }
        if (this.field3760) {
            var5 |= 0x200;
        }
        if (var10.method2837(var11, 26582)) {
            var5 |= 0x80;
        }
        if (var10.method2834((byte) 122, var11)) {
            var5 |= 0x100;
        }
        if (var10.method2836(var11, (byte) 11)) {
            var5 |= 0x400;
        }
        if (var9 != null) {
            if (var9.method2837(var6, 26582)) {
                var5 |= 0x80;
            }
            if (var9.method2834((byte) 66, var6)) {
                var5 |= 0x100;
            }
            if (var9.method2836(var6, (byte) 11)) {
                var5 |= 0x400;
            }
        }
        if (this.field3740 != null && arg1) {
            if (this.field3740.length > arg2) {
                int var13 = this.field3740[arg2];
                if (var13 != 65535) {
                    class472 var14 = this.field3753.method1936(var13 >> 16, 213);
                    int var15 = var13 & 0xFFFF;
                    if (var14 != null) {
                        if (var14.method2837(var15, 26582)) {
                            var5 |= 0x80;
                        }
                        if (var14.method2834((byte) 96, var15)) {
                            var5 |= 0x100;
                        }
                        if (var14.method2836(var15, (byte) 11)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field3744 || class58.field786) && arg3 != -1 && this.field3740.length > arg3) {
                int var16 = this.field3740[arg3];
                if (var16 != 65535) {
                    class472 var17 = this.field3753.method1936(var16 >> 16, 213);
                    int var18 = var16 & 0xFFFF;
                    if (var17 != null) {
                        if (var17.method2837(var18, 26582)) {
                            var5 |= 0x80;
                        }
                        if (var17.method2834((byte) 80, var18)) {
                            var5 |= 0x100;
                        }
                        if (var17.method2836(var18, (byte) 11)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V", line = 489)
    public final void method1726(int arg0) {
        if (this.field3739 == -1) {
            if (this.field3759 == null) {
                this.field3739 = 0;
            } else {
                this.field3739 = 2;
            }
        }
        field3734++;
        if (arg0 != 512 || this.field3754 != -1) {
            return;
        }
        if (this.field3759 == null) {
            this.field3754 = 0;
        } else {
            this.field3754 = 2;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILtl;)V", line = 520)
    public final void method1727(int arg0, class91 arg1) {
        if (arg0 != 32) {
            this.method1721(-18, -122, (byte) 48, -82, null, -67);
        }
        field3755++;
        while (true) {
            int var3 = arg1.method618((byte) 100);
            if (var3 == 0) {
                return;
            }
            this.method1723(arg1, -99, var3);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lc;IIIIBII)Lc;", line = 543)
    public final class201 method1728(class201 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field3741++;
        int var9 = this.field3746[arg7];
        int var10 = this.field3765[arg7];
        class472 var11 = this.field3753.method1936(var10 >> 16, 213);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg0.method292(arg5, arg6, true);
        }
        class472 var13 = null;
        if ((this.field3744 || class58.field786) && arg3 != -1 && arg3 < this.field3765.length) {
            int var14 = this.field3765[arg3];
            var13 = this.field3753.method1936(var14 >> 16, 213);
            arg3 = var14 & 0xFFFF;
        }
        if (this.field3760) {
            arg6 |= 0x200;
        }
        if (var11.method2837(var12, arg4 ^ 0x66D6)) {
            arg6 |= 0x80;
        }
        if (var11.method2834((byte) 119, var12)) {
            arg6 |= 0x100;
        }
        if (var11.method2836(var12, (byte) 11)) {
            arg6 |= 0x400;
        }
        if (arg4 != 256) {
            method1724(null, 20);
        }
        if (var13 != null) {
            if (var13.method2837(arg3, 26582)) {
                arg6 |= 0x80;
            }
            if (var13.method2834((byte) 63, arg3)) {
                arg6 |= 0x100;
            }
            if (var13.method2836(arg3, (byte) 11)) {
                arg6 |= 0x400;
            }
        }
        int var15 = arg6 | 0x20;
        class201 var16 = arg0.method292(arg5, var15, true);
        var16.method1398(var9, arg1, arg3, 0, var12, this.field3760, var11, arg2 - 1, var13);
        return var16;
    }
}
