import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class709 {

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "I")
    public int field9824 = 5;

    @OriginalMember(owner = "client!mga", name = "h", descriptor = "Z")
    public boolean field9830 = false;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "I")
    public int field9823 = -1;

    @OriginalMember(owner = "client!mga", name = "s", descriptor = "I")
    public int field9841 = 99;

    @OriginalMember(owner = "client!mga", name = "q", descriptor = "I")
    public int field9839 = -1;

    @OriginalMember(owner = "client!mga", name = "g", descriptor = "Z")
    public boolean field9829 = false;

    @OriginalMember(owner = "client!mga", name = "y", descriptor = "I")
    public int field9847 = -1;

    @OriginalMember(owner = "client!mga", name = "r", descriptor = "I")
    public int field9840 = -1;

    @OriginalMember(owner = "client!mga", name = "m", descriptor = "I")
    public int field9835 = -1;

    @OriginalMember(owner = "client!mga", name = "j", descriptor = "Z")
    public boolean field9832 = false;

    @OriginalMember(owner = "client!mga", name = "z", descriptor = "I")
    public int field9848 = 2;

    @OriginalMember(owner = "client!mga", name = "D", descriptor = "Z")
    public boolean field9852 = false;

    @OriginalMember(owner = "client!mga", name = "p", descriptor = "[Ljava/awt/Color;")
    public static Color[] field9838 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!mga", name = "e", descriptor = "I")
    public static int field9827;

    @OriginalMember(owner = "client!mga", name = "i", descriptor = "I")
    public static int field9831;

    @OriginalMember(owner = "client!mga", name = "k", descriptor = "I")
    public static int field9833;

    @OriginalMember(owner = "client!mga", name = "l", descriptor = "I")
    public static int field9834;

    @OriginalMember(owner = "client!mga", name = "n", descriptor = "I")
    public static int field9836;

    @OriginalMember(owner = "client!mga", name = "t", descriptor = "I")
    public int field9842;

    @OriginalMember(owner = "client!mga", name = "u", descriptor = "I")
    public static int field9843;

    @OriginalMember(owner = "client!mga", name = "B", descriptor = "I")
    public static int field9850;

    @OriginalMember(owner = "client!mga", name = "o", descriptor = "Ljk;")
    public class633 field9837;

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "[I")
    public int[] field9825;

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "[I")
    public int[] field9826;

    @OriginalMember(owner = "client!mga", name = "f", descriptor = "[I")
    private int[] field9828;

    @OriginalMember(owner = "client!mga", name = "v", descriptor = "[I")
    public int[] field9844;

    @OriginalMember(owner = "client!mga", name = "A", descriptor = "[I")
    public int[] field9849;

    @OriginalMember(owner = "client!mga", name = "C", descriptor = "[I")
    public int[] field9851;

    @OriginalMember(owner = "client!mga", name = "x", descriptor = "[Z")
    public boolean[] field9846;

    @OriginalMember(owner = "client!mga", name = "w", descriptor = "[[I")
    public int[][] field9845;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(BIIIILka;II)Lka;", line = 4)
    public final class471 method3974(byte arg0, int arg1, int arg2, int arg3, int arg4, class471 arg5, int arg6, int arg7) {
        field9843++;
        int var9 = this.field9849[arg3];
        int var10 = this.field9826[arg3];
        class494 var11 = this.field9837.method3521(41, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg5.method226(arg0, arg1, true);
        }
        if (arg2 != 256) {
            method3977((byte) 55);
        }
        class494 var13 = null;
        if ((this.field9830 || class411.field5804) && arg7 != -1 && arg7 < this.field9826.length) {
            int var14 = this.field9826[arg7];
            var13 = this.field9837.method3521(-120, var14 >> 16);
            arg7 = var14 & 0xFFFF;
        }
        if (this.field9852) {
            arg1 |= 0x200;
        }
        if (var11.method2958(false, var12)) {
            arg1 |= 0x80;
        }
        if (var11.method2957(117, var12)) {
            arg1 |= 0x100;
        }
        if (var11.method2953(var12, 1)) {
            arg1 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2958(false, arg7)) {
                arg1 |= 0x80;
            }
            if (var13.method2957(arg2 ^ 0x177, arg7)) {
                arg1 |= 0x100;
            }
            if (var13.method2953(arg7, 1)) {
                arg1 |= 0x400;
            }
        }
        int var15 = arg1 | 0x20;
        class471 var16 = arg5.method226(arg0, var15, true);
        var16.method2810(var11, arg4 - 1, var12, arg7, this.field9852, arg6, var9, var13, 1000);
        return var16;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(II)Z", line = 78)
    public static final boolean method3975(int arg0, int arg1) {
        field9827++;
        if (arg1 <= 87) {
            return false;
        } else {
            return arg0 == 2 || arg0 == 3;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(ILka;IIII)Lka;", line = 101)
    public final class471 method3976(int arg0, class471 arg1, int arg2, int arg3, int arg4, int arg5) {
        field9833++;
        int var7 = this.field9849[arg5];
        int var8 = this.field9826[arg5];
        class494 var9 = this.field9837.method3521(53, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg1.method226((byte) 1, arg3, true);
        }
        class494 var11 = null;
        if ((this.field9830 || class411.field5804) && arg2 != -1 && this.field9826.length > arg2) {
            int var12 = this.field9826[arg2];
            var11 = this.field9837.method3521(110, var12 >> 16);
            arg2 = var12 & 0xFFFF;
        }
        class494 var13 = null;
        class494 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field9828 != null) {
            if (arg5 < this.field9828.length) {
                var15 = this.field9828[arg5];
                if (var15 != 65535) {
                    var13 = this.field9837.method3521(75, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field9830 || class411.field5804) && arg2 != -1 && this.field9828.length > arg2) {
                var16 = this.field9828[arg2];
                if (var16 != 65535) {
                    var14 = this.field9837.method3521(80, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field9852) {
            arg3 |= 0x200;
        }
        if (var9.method2958(false, var10)) {
            arg3 |= 0x80;
        }
        if (var9.method2957(118, var10)) {
            arg3 |= 0x100;
        }
        if (var9.method2953(var10, arg0 ^ 0xFFFFFFFE)) {
            arg3 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2958(false, var15)) {
                arg3 |= 0x80;
            }
            if (var13.method2957(120, var15)) {
                arg3 |= 0x100;
            }
            if (var13.method2953(var15, 1)) {
                arg3 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method2958(false, arg2)) {
                arg3 |= 0x80;
            }
            if (var11.method2957(124, arg2)) {
                arg3 |= 0x100;
            }
            if (var11.method2953(arg2, 1)) {
                arg3 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method2958(false, var16)) {
                arg3 |= 0x80;
            }
            if (var14.method2957(121, var16)) {
                arg3 |= 0x100;
            }
            if (var14.method2953(var16, arg0 + 2)) {
                arg3 |= 0x400;
            }
        }
        int var17 = arg3 | 0x20;
        class471 var18 = arg1.method226((byte) 1, var17, true);
        var18.method2810(var9, arg0 + arg4, var10, arg2, this.field9852, 0, var7, var11, 1000);
        if (var13 != null) {
            var18.method2810(var13, arg4 - 1, var15, var16, this.field9852, 0, var7, var14, 1000);
        }
        return var18;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(B)V", line = 231)
    public static void method3977(byte arg0) {
        field9838 = null;
        int var1 = -11 / ((-arg0 - 6) / 58);
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lee;II)V", line = 240)
    private final void method3978(class675 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            int var4 = arg0.method3757((byte) -65);
            this.field9849 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field9849[var5] = arg0.method3757((byte) -65);
            }
            this.field9826 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field9826[var6] = arg0.method3757((byte) -65);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field9826[var7] = (arg0.method3757((byte) -65) << 16) + this.field9826[var7];
            }
        } else if (arg1 == 2) {
            this.field9840 = arg0.method3757((byte) -65);
        } else if (arg1 == 3) {
            this.field9846 = new boolean[256];
            int var18 = arg0.method3750((byte) 35);
            for (int var19 = 0; var19 < var18; var19++) {
                this.field9846[arg0.method3750((byte) 35)] = true;
            }
        } else if (arg1 == 5) {
            this.field9824 = arg0.method3750((byte) 35);
        } else if (arg1 == 6) {
            this.field9847 = arg0.method3757((byte) -65);
        } else if (arg1 == 7) {
            this.field9835 = arg0.method3757((byte) -65);
        } else if (arg1 == 8) {
            this.field9841 = arg0.method3750((byte) 35);
        } else if (arg1 == 9) {
            this.field9823 = arg0.method3750((byte) 35);
        } else if (arg1 == 10) {
            this.field9839 = arg0.method3750((byte) 35);
        } else if (arg1 == 11) {
            this.field9848 = arg0.method3750((byte) 35);
        } else if (arg1 == 12) {
            int var15 = arg0.method3750((byte) 35);
            this.field9828 = new int[var15];
            for (int var16 = 0; var16 < var15; var16++) {
                this.field9828[var16] = arg0.method3757((byte) -65);
            }
            for (int var17 = 0; var17 < var15; var17++) {
                this.field9828[var17] = (arg0.method3757((byte) -65) << 16) + this.field9828[var17];
            }
        } else if (arg1 == 13) {
            int var8 = arg0.method3757((byte) -65);
            this.field9845 = new int[var8][];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg0.method3750((byte) 35);
                if (var10 > 0) {
                    this.field9845[var9] = new int[var10];
                    this.field9845[var9][0] = arg0.method3756(false);
                    for (int var11 = 1; var11 < var10; var11++) {
                        this.field9845[var9][var11] = arg0.method3757((byte) -65);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field9852 = true;
        } else if (arg1 == 15) {
            this.field9830 = true;
        } else if (arg1 == 16) {
            this.field9829 = true;
        } else if (arg1 == 18) {
            this.field9832 = true;
        } else if (arg1 == 19) {
            if (this.field9851 == null) {
                this.field9851 = new int[this.field9845.length];
                for (int var14 = 0; var14 < this.field9845.length; var14++) {
                    this.field9851[var14] = 255;
                }
            }
            this.field9851[arg0.method3750((byte) 35)] = arg0.method3750((byte) 35);
        } else if (arg1 == 20) {
            if (this.field9844 == null || this.field9825 == null) {
                this.field9844 = new int[this.field9845.length];
                this.field9825 = new int[this.field9845.length];
                for (int var12 = 0; var12 < this.field9845.length; var12++) {
                    this.field9844[var12] = 256;
                    this.field9825[var12] = 256;
                }
            }
            int var13 = arg0.method3750((byte) 35);
            this.field9844[var13] = arg0.method3757((byte) -65);
            this.field9825[var13] = arg0.method3757((byte) -65);
        }
        field9834++;
        if (arg2 != 15) {
            this.method3978(null, 29, -98);
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(ILee;)V", line = 452)
    public final void method3979(int arg0, class675 arg1) {
        field9850++;
        while (true) {
            int var3 = arg1.method3750((byte) 35);
            if (var3 == 0) {
                if (arg0 == 24718) {
                    return;
                } else {
                    this.field9840 = -64;
                    return;
                }
            }
            this.method3978(arg1, var3, 15);
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IIZI)I", line = 473)
    public final int method3980(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg1 != 1024) {
            this.field9835 = -128;
        }
        field9836++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field9826[arg3];
        class494 var8 = null;
        class494 var9 = this.field9837.method3521(96, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field9830 || class411.field5804) && arg0 != -1 && this.field9826.length > arg0) {
            int var11 = this.field9826[arg0];
            var8 = this.field9837.method3521(115, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field9852) {
            var5 |= 0x200;
        }
        if (var9.method2958(false, var10)) {
            var5 |= 0x80;
        }
        if (var9.method2957(arg1 - 907, var10)) {
            var5 |= 0x100;
        }
        if (var9.method2953(var10, arg1 ^ 0x401)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method2958(false, var6)) {
                var5 |= 0x80;
            }
            if (var8.method2957(arg1 - 909, var6)) {
                var5 |= 0x100;
            }
            if (var8.method2953(var6, 1)) {
                var5 |= 0x400;
            }
        }
        if (this.field9828 != null && arg2) {
            if (this.field9828.length > arg3) {
                int var12 = this.field9828[arg3];
                if (var12 != 65535) {
                    class494 var13 = this.field9837.method3521(28, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method2958(false, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method2957(123, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method2953(var14, 1)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field9830 || class411.field5804) && arg0 != -1 && this.field9828.length > arg0) {
                int var15 = this.field9828[arg0];
                if (var15 != 65535) {
                    class494 var16 = this.field9837.method3521(arg1 - 1135, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method2958(false, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method2957(121, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method2953(var17, 1)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)V", line = 613)
    public final void method3981(int arg0) {
        if (this.field9839 == -1) {
            if (this.field9846 == null) {
                this.field9839 = 0;
            } else {
                this.field9839 = 2;
            }
        }
        if (arg0 != -29274) {
            return;
        }
        if (this.field9823 == -1) {
            if (this.field9846 == null) {
                this.field9823 = 0;
            } else {
                this.field9823 = 2;
            }
        }
        field9831++;
    }
}
