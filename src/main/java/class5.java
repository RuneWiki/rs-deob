import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 {

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public int field124 = -1;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public int field125 = -1;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public int field128 = -1;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public int field126 = 2;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public int field122 = 99;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public int field135 = 5;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    public int field144 = -1;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Z")
    public boolean field134 = false;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    public int field145 = -1;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "Z")
    public boolean field142 = false;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "Z")
    public boolean field149 = false;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "Z")
    public boolean field147 = false;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Lvj;")
    public static class304 field132 = new class304("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "[Ljava/awt/Color;")
    public static Color[] field136 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "Z")
    public static boolean field151 = false;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public int field139;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "Lpp;")
    public class267 field138;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "[I")
    public int[] field127;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "[I")
    public int[] field129;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "[I")
    private int[] field130;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "[Z")
    public boolean[] field131;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "[[I")
    public int[][] field137;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILmd;)V")
    private final void method25(int arg0, int arg1, class379 arg2) {
        if (arg0 == 1) {
            int var4 = arg2.method2212((byte) 83);
            this.field127 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field127[var5] = arg2.method2212((byte) 83);
            }
            this.field129 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field129[var6] = arg2.method2212((byte) 83);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field129[var7] += arg2.method2212((byte) 83) << 16;
            }
        } else if (arg0 == 2) {
            this.field125 = arg2.method2212((byte) 83);
        } else if (arg0 == 3) {
            this.field131 = new boolean[256];
            int var8 = arg2.method2238(255);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field131[arg2.method2238(255)] = true;
            }
        } else if (arg0 == 4) {
            this.field147 = true;
        } else if (arg0 == 5) {
            this.field135 = arg2.method2238(255);
        } else if (arg0 == 6) {
            this.field124 = arg2.method2212((byte) 83);
        } else if (arg0 == 7) {
            this.field145 = arg2.method2212((byte) 83);
        } else if (arg0 == 8) {
            this.field122 = arg2.method2238(arg1 ^ 0xFFFFF216);
        } else if (arg0 == 9) {
            this.field128 = arg2.method2238(255);
        } else if (arg0 == 10) {
            this.field144 = arg2.method2238(255);
        } else if (arg0 == 11) {
            this.field126 = arg2.method2238(255);
        } else if (arg0 == 12) {
            int var14 = arg2.method2238(255);
            this.field130 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field130[var15] = arg2.method2212((byte) 83);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field130[var16] += arg2.method2212((byte) 83) << 16;
            }
        } else if (arg0 == 13) {
            int var10 = arg2.method2212((byte) 83);
            this.field137 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg2.method2238(255);
                if (var12 > 0) {
                    this.field137[var11] = new int[var12];
                    this.field137[var11][0] = arg2.method2249((byte) 81);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field137[var11][var13] = arg2.method2212((byte) 83);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field142 = true;
        } else if (arg0 == 15) {
            this.field149 = true;
        } else if (arg0 == 16) {
            this.field134 = true;
        }
        if (arg1 != -3351) {
            this.field131 = null;
        }
        field133++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lc;IIIII)Lc;")
    public final class121 method26(class121 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field148++;
        int var7 = this.field127[arg5];
        int var8 = this.field129[arg5];
        class504 var9 = this.field138.method1606(var8 >> 16, -60);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method863((byte) 1, arg1, true);
        }
        class504 var11 = null;
        if ((this.field149 || class89.field1364) && arg3 != -1 && arg3 < this.field129.length) {
            int var12 = this.field129[arg3];
            var11 = this.field138.method1606(var12 >> 16, 100);
            arg3 = var12 & 0xFFFF;
        }
        class504 var13 = null;
        class504 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field130 != null) {
            if (arg5 < this.field130.length) {
                var15 = this.field130[arg5];
                if (var15 != 65535) {
                    var13 = this.field138.method1606(var15 >> 16, 64);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field149 || class89.field1364) && arg3 != -1 && this.field130.length > arg3) {
                var16 = this.field130[arg3];
                if (var16 != 65535) {
                    var14 = this.field138.method1606(var16 >> 16, 99);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field142) {
            arg1 |= 0x200;
        }
        if (var9.method2876((byte) -120, var10)) {
            arg1 |= 0x80;
        }
        if (var9.method2880((byte) 69, var10)) {
            arg1 |= 0x100;
        }
        if (var9.method2878(20411, var10)) {
            arg1 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2876((byte) -120, var15)) {
                arg1 |= 0x80;
            }
            if (var13.method2880((byte) 69, var15)) {
                arg1 |= 0x100;
            }
            if (var13.method2878(20411, var15)) {
                arg1 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method2876((byte) -120, arg3)) {
                arg1 |= 0x80;
            }
            if (var11.method2880((byte) 69, arg3)) {
                arg1 |= 0x100;
            }
            if (var11.method2878(20411, arg3)) {
                arg1 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method2876((byte) -120, var16)) {
                arg1 |= 0x80;
            }
            if (var14.method2880((byte) 69, var16)) {
                arg1 |= 0x100;
            }
            if (var14.method2878(20411, var16)) {
                arg1 |= 0x400;
            }
        }
        int var17 = arg1 | 0x20;
        class121 var18 = arg0.method863((byte) 1, var17, true);
        if (arg2 > -55) {
            this.method30((byte) -21, null, 47, (byte) -79, -114, -9, 60, -95);
        }
        var18.method841(0, this.field142, (byte) 101, var9, var10, var11, arg3, var7, arg4 - 1);
        if (var13 != null) {
            var18.method841(0, this.field142, (byte) 110, var13, var15, var14, var16, var7, arg4 - 1);
        }
        return var18;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public final void method27(int arg0) {
        if (this.field128 == -1) {
            if (this.field131 == null) {
                this.field128 = 0;
            } else {
                this.field128 = 2;
            }
        }
        field146++;
        if (this.field144 != arg0) {
            return;
        }
        if (this.field131 == null) {
            this.field144 = 0;
        } else {
            this.field144 = 2;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILmd;)V")
    public final void method28(int arg0, class379 arg1) {
        int var3 = -49 / ((arg0 - 66) / 40);
        field150++;
        while (true) {
            int var4 = arg1.method2238(255);
            if (var4 == 0) {
                return;
            }
            this.method25(var4, -3351, arg1);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)Z")
    public static final boolean method29(int arg0, int arg1, int arg2) {
        field123++;
        if (arg0 > -81) {
            method31(-41);
        }
        return (arg1 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLc;IBIIII)Lc;")
    public final class121 method30(byte arg0, class121 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field140++;
        int var9 = this.field127[arg4];
        int var10 = this.field129[arg4];
        class504 var11 = this.field138.method1606(var10 >> 16, 103);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg1.method863(arg0, arg2, true);
        }
        class504 var13 = null;
        if ((this.field149 || class89.field1364) && arg6 != -1 && this.field129.length > arg6) {
            int var14 = this.field129[arg6];
            var13 = this.field138.method1606(var14 >> 16, 125);
            arg6 = var14 & 0xFFFF;
        }
        if (this.field142) {
            arg2 |= 0x200;
        }
        if (var11.method2876((byte) -120, var12)) {
            arg2 |= 0x80;
        }
        if (var11.method2880((byte) 69, var12)) {
            arg2 |= 0x100;
        }
        int var15 = -18 / ((-arg3 - 46) / 49);
        if (var11.method2878(20411, var12)) {
            arg2 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2876((byte) -120, arg6)) {
                arg2 |= 0x80;
            }
            if (var13.method2880((byte) 69, arg6)) {
                arg2 |= 0x100;
            }
            if (var13.method2878(20411, arg6)) {
                arg2 |= 0x400;
            }
        }
        int var16 = arg2 | 0x20;
        class121 var17 = arg1.method863(arg0, var16, true);
        var17.method841(arg7, this.field142, (byte) -62, var11, var12, var13, arg6, var9, arg5 - 1);
        return var17;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static void method31(int arg0) {
        field136 = null;
        field132 = null;
        if (arg0 != -6257) {
            field132 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZII)I")
    public final int method32(int arg0, boolean arg1, int arg2, int arg3) {
        field143++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field129[arg0];
        class504 var8 = null;
        class504 var9 = this.field138.method1606(var7 >> 16, 57);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field149 || class89.field1364) && arg3 != -1 && this.field129.length > arg3) {
            int var11 = this.field129[arg3];
            var8 = this.field138.method1606(var11 >> 16, 60);
            var6 = var11 & 0xFFFF;
        }
        if (this.field142) {
            var5 |= 0x200;
        }
        if (var9.method2876((byte) -120, var10)) {
            var5 |= 0x80;
        }
        if (var9.method2880((byte) 69, var10)) {
            var5 |= 0x100;
        }
        if (var9.method2878(20411, var10)) {
            var5 |= 0x400;
        }
        if (arg2 != -1) {
            this.field142 = true;
        }
        if (var8 != null) {
            if (var8.method2876((byte) -120, var6)) {
                var5 |= 0x80;
            }
            if (var8.method2880((byte) 69, var6)) {
                var5 |= 0x100;
            }
            if (var8.method2878(arg2 + 20412, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field130 != null && arg1) {
            if (arg0 < this.field130.length) {
                int var12 = this.field130[arg0];
                if (var12 != 65535) {
                    class504 var13 = this.field138.method1606(var12 >> 16, arg2 ^ 0x6D);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method2876((byte) -120, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method2880((byte) 69, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method2878(arg2 + 20412, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field149 || class89.field1364) && arg3 != -1 && this.field130.length > arg3) {
                int var15 = this.field130[arg3];
                if (var15 != 65535) {
                    class504 var16 = this.field138.method1606(var15 >> 16, 88);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method2876((byte) -120, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method2880((byte) 69, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method2878(arg2 ^ 0xFFFFB044, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    static {
        new class304("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
    }
}
