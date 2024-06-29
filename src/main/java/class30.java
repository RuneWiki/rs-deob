import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class30 extends class112 {

    @OriginalMember(owner = "client!ee", name = "vb", descriptor = "I")
    public int field754 = 0;

    @OriginalMember(owner = "client!ee", name = "bb", descriptor = "[[B")
    private byte[][] field734 = new byte[256][];

    @OriginalMember(owner = "client!ee", name = "lb", descriptor = "Ljava/util/Random;")
    private Random field744 = new Random();

    @OriginalMember(owner = "client!ee", name = "Ab", descriptor = "Z")
    private boolean field759 = false;

    @OriginalMember(owner = "client!ee", name = "jb", descriptor = "[I")
    private int[] field742;

    @OriginalMember(owner = "client!ee", name = "ib", descriptor = "[I")
    private int[] field741;

    @OriginalMember(owner = "client!ee", name = "ob", descriptor = "[I")
    private int[] field747;

    @OriginalMember(owner = "client!ee", name = "yb", descriptor = "I")
    private int field757;

    @OriginalMember(owner = "client!ee", name = "Bb", descriptor = "I")
    private int field760;

    @OriginalMember(owner = "client!ee", name = "gb", descriptor = "Lhb;")
    private static class44 field739 = class102.method810("or2", -28606);

    @OriginalMember(owner = "client!ee", name = "kb", descriptor = "[Lhb;")
    private static class44[] field743 = new class44[100];

    @OriginalMember(owner = "client!ee", name = "hb", descriptor = "Lhb;")
    private static class44 field740 = class102.method810("red", -28606);

    @OriginalMember(owner = "client!ee", name = "mb", descriptor = "Lhb;")
    private static class44 field745 = class102.method810("gr2", -28606);

    @OriginalMember(owner = "client!ee", name = "pb", descriptor = "Lhb;")
    private static class44 field748 = class102.method810("or1", -28606);

    @OriginalMember(owner = "client!ee", name = "rb", descriptor = "Lhb;")
    private static class44 field750 = class102.method810("blu", -28606);

    @OriginalMember(owner = "client!ee", name = "sb", descriptor = "Lhb;")
    private static class44 field751 = class102.method810("gre", -28606);

    @OriginalMember(owner = "client!ee", name = "fb", descriptor = "Lhb;")
    private static class44 field738 = class102.method810("dre", -28606);

    @OriginalMember(owner = "client!ee", name = "ub", descriptor = "Lhb;")
    private static class44 field753 = class102.method810("mag", -28606);

    @OriginalMember(owner = "client!ee", name = "tb", descriptor = "Lhb;")
    private static class44 field752 = class102.method810("gr3", -28606);

    @OriginalMember(owner = "client!ee", name = "db", descriptor = "Lhb;")
    private static class44 field736 = class102.method810("whi", -28606);

    @OriginalMember(owner = "client!ee", name = "nb", descriptor = "Lhb;")
    private static class44 field746 = class102.method810("bla", -28606);

    @OriginalMember(owner = "client!ee", name = "wb", descriptor = "Lhb;")
    private static class44 field755 = class102.method810("yel", -28606);

    @OriginalMember(owner = "client!ee", name = "qb", descriptor = "Lhb;")
    private static class44 field749 = class102.method810("cya", -28606);

    @OriginalMember(owner = "client!ee", name = "ab", descriptor = "Lhb;")
    private static class44 field733 = class102.method810("or3", -28606);

    @OriginalMember(owner = "client!ee", name = "xb", descriptor = "Lhb;")
    private static class44 field756 = class102.method810("dbl", -28606);

    @OriginalMember(owner = "client!ee", name = "eb", descriptor = "Lhb;")
    private static class44 field737 = class102.method810("gr1", -28606);

    @OriginalMember(owner = "client!ee", name = "cb", descriptor = "Lhb;")
    private static class44 field735 = class102.method810("lre", -28606);

    @OriginalMember(owner = "client!ee", name = "zb", descriptor = "Lhb;")
    private static class44 field758 = class102.method810("str", -28606);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lhb;IIIZI)V", line = 7)
    public final void method286(class44 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field744.setSeed((long) arg5);
        int var7 = (this.field744.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field754;
        for (int var9 = 0; var9 < arg0.field1070; var9++) {
            if (arg0.field1074[var9] == 64 && var9 + 4 < arg0.field1070 && arg0.field1074[var9 + 4] == 64) {
                int var10 = this.method288(arg0.method396((byte) -104, var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field1074[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        this.method296(this.field734[var11], arg1 + 1, this.field742[var11] + var8 + 1, this.field741[var11], this.field747[var11], 0, 192);
                    }
                    this.method296(this.field734[var11], arg1, this.field742[var11] + var8, this.field741[var11], this.field747[var11], arg3, var7);
                }
                arg1 += this.field741[var11];
                if ((this.field744.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lhb;IIIIIZIII)V", line = 50)
    public final void method287(class44 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        int var12 = 0;
        class44 var13 = class89.method721((byte) 56, 100);
        int var14 = -1;
        int var15 = 0;
        class44 var16 = null;
        if (arg9 == 0) {
            arg9 = this.field757;
        }
        boolean var17 = true;
        if (arg4 < this.field760 + this.field757 + arg9 && arg4 < arg9 + arg9) {
            var17 = false;
        }
        int var18 = 0;
        int var19 = arg0.method414((byte) 50);
        for (int var20 = 0; var20 < var19; var20++) {
            int var24 = arg0.method385(255, var20);
            if (var24 == 64 && var20 + 4 < var19 && arg0.method385(255, var20 + 4) == 64) {
                var16 = arg0.method396((byte) -115, var20, var20 + 5);
                var13.method390((byte) -122, var16);
                var20 += 4;
            } else if (var24 == 92 && var20 + 1 < var19 && arg0.method385(255, var20 + 1) == 110) {
                var16 = null;
                field743[var18++] = var13.method396((byte) -88, var12, var13.method414((byte) 85)).method384(true);
                var12 = var13.method414((byte) 39);
                var11 = 0;
                var14 = -1;
                var20++;
            } else {
                var13.method410(var24, (byte) -127);
                var11 += this.method293(var24);
                if (var24 == 32 || var24 == 45) {
                    var14 = var13.method414((byte) 89);
                    var15 = var11;
                }
                if (var17 && var11 > arg3 && var14 >= 0) {
                    field743[var18++] = var13.method396((byte) -112, var12, var14).method384(true);
                    var12 = var14;
                    var14 = -1;
                    var11 -= var15;
                    if (var16 != null && var12 > 4) {
                        var12 -= 5;
                        var13.method411((byte) -96, var12, var16);
                    }
                }
            }
        }
        if (var13.method414((byte) 57) > var12) {
            field743[var18++] = var13.method396((byte) -121, var12, var13.method414((byte) 11)).method384(true);
        }
        if (arg8 == 3 && var18 == 1) {
            arg8 = 1;
        }
        int var21;
        if (arg8 == 0) {
            var21 = this.field757 + arg2;
        } else if (arg8 == 1) {
            var21 = (arg4 - this.field757 - this.field760 - (var18 - 1) * arg9) / 2 + this.field757 + arg2;
        } else if (arg8 == 2) {
            var21 = arg2 + arg4 - this.field760 - (var18 - 1) * arg9;
        } else {
            int var22 = (arg4 - this.field757 - this.field760 - (var18 - 1) * arg9) / (var18 + 1);
            if (var22 < 0) {
                var22 = 0;
            }
            var21 = this.field757 + arg2 + var22;
            arg9 += var22;
        }
        for (int var23 = 0; var23 < var18; var23++) {
            if (arg7 == 0) {
                this.method295(field743[var23], arg1, var21, arg5, arg6);
            } else if (arg7 == 1) {
                this.method289(field743[var23], arg3 / 2 + arg1, var21, arg5, arg6);
            } else if (arg7 == 2) {
                this.method303(field743[var23], arg1 + arg3, var21, arg5, arg6);
            } else if (var18 - 1 == var23) {
                this.method295(field743[var23], arg1, var21, arg5, arg6);
            } else {
                this.method306(field743[var23], arg1, var21, arg5, arg6, arg3);
            }
            var21 += arg9;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lhb;)I", line = 189)
    private final int method288(class44 arg0) {
        if (arg0.method382((byte) -85, field740)) {
            return 16711680;
        } else if (arg0.method382((byte) -85, field751)) {
            return 65280;
        } else if (arg0.method382((byte) -85, field750)) {
            return 255;
        } else if (arg0.method382((byte) -85, field755)) {
            return 16776960;
        } else if (arg0.method382((byte) -85, field749)) {
            return 65535;
        } else if (arg0.method382((byte) -85, field753)) {
            return 16711935;
        } else if (arg0.method382((byte) -85, field736)) {
            return 16777215;
        } else if (arg0.method382((byte) -85, field746)) {
            return 0;
        } else if (arg0.method382((byte) -85, field735)) {
            return 16748608;
        } else if (arg0.method382((byte) -85, field738)) {
            return 8388608;
        } else if (arg0.method382((byte) -85, field756)) {
            return 128;
        } else if (arg0.method382((byte) -85, field748)) {
            return 16756736;
        } else if (arg0.method382((byte) -85, field739)) {
            return 16740352;
        } else if (arg0.method382((byte) -85, field733)) {
            return 16723968;
        } else if (arg0.method382((byte) -85, field737)) {
            return 12648192;
        } else if (arg0.method382((byte) -85, field745)) {
            return 8453888;
        } else if (arg0.method382((byte) -85, field752)) {
            return 4259584;
        } else {
            if (arg0.method382((byte) -85, field758)) {
                this.field759 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lhb;IIIZ)V", line = 254)
    public final void method289(class44 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method295(arg0, arg1 - this.method304(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([BIIIII)V", line = 260)
    private final void method290(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class112.field2773 * arg2 + arg1;
        int var8 = class112.field2773 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class112.field2775) {
            int var11 = class112.field2775 - arg2;
            arg4 -= var11;
            arg2 = class112.field2775;
            var10 += arg3 * var11;
            var7 += class112.field2773 * var11;
        }
        if (arg2 + arg4 > class112.field2771) {
            arg4 -= arg2 + arg4 - class112.field2771;
        }
        if (arg1 < class112.field2772) {
            int var12 = class112.field2772 - arg1;
            arg3 -= var12;
            arg1 = class112.field2772;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class112.field2774) {
            int var13 = arg1 + arg3 - class112.field2774;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method292(class112.field2776, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([I[BIIIIIIII)V", line = 307)
    private final void method291(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var12 = 256 - arg9;
        for (int var13 = -arg6; var13 < 0; var13++) {
            for (int var14 = -arg5; var14 < 0; var14++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var15 = arg0[arg4];
                    arg0[arg4++] = (((var15 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * var12 & 0xFF0000) >> 8) + var11;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([I[BIIIIIII)V", line = 339)
    private final void method292(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)I", line = 398)
    public final int method293(int arg0) {
        return this.field741[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lhb;III)V", line = 406)
    public final void method294(class44 arg0, int arg1, int arg2, int arg3) {
        this.method301(arg0, arg1 - this.method297(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Lhb;IIIZ)V", line = 422)
    public final void method295(class44 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field759 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field754;
        for (int var8 = 0; var8 < arg0.field1070; var8++) {
            if (arg0.field1074[var8] == 64 && var8 + 4 < arg0.field1070 && arg0.field1074[var8 + 4] == 64) {
                int var9 = this.method288(arg0.method396((byte) -96, var8 + 1, var8 + 4));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field1074[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method290(this.field734[var10], arg1 + 1, this.field742[var10] + var7 + 1, this.field741[var10], this.field747[var10], 0);
                    }
                    this.method290(this.field734[var10], arg1, this.field742[var10] + var7, this.field741[var10], this.field747[var10], arg3);
                }
                arg1 += this.field741[var10];
            }
        }
        if (this.field759) {
            class112.method860(var6, (int) ((double) this.field754 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([BIIIIII)V", line = 471)
    private final void method296(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class112.field2773 * arg2 + arg1;
        int var9 = class112.field2773 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class112.field2775) {
            int var12 = class112.field2775 - arg2;
            arg4 -= var12;
            arg2 = class112.field2775;
            var11 += arg3 * var12;
            var8 += class112.field2773 * var12;
        }
        if (arg2 + arg4 > class112.field2771) {
            arg4 -= arg2 + arg4 - class112.field2771;
        }
        if (arg1 < class112.field2772) {
            int var13 = class112.field2772 - arg1;
            arg3 -= var13;
            arg1 = class112.field2772;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class112.field2774) {
            int var14 = arg1 + arg3 - class112.field2774;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method291(class112.field2776, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Lhb;)I", line = 521)
    public final int method297(class44 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field1070; var3++) {
            var2 += this.field741[arg0.field1074[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "()V", line = 537)
    public static void method298() {
        field740 = null;
        field751 = null;
        field750 = null;
        field755 = null;
        field749 = null;
        field753 = null;
        field736 = null;
        field746 = null;
        field735 = null;
        field738 = null;
        field756 = null;
        field748 = null;
        field739 = null;
        field733 = null;
        field737 = null;
        field745 = null;
        field752 = null;
        field758 = null;
        field743 = null;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Lhb;III)V", line = 558)
    public final void method299(class44 arg0, int arg1, int arg2, int arg3) {
        this.method301(arg0, arg1 - this.method297(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lhb;IIII)V", line = 562)
    public final void method300(class44 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method297(arg0) / 2;
        int var7 = arg2 - this.field754;
        for (int var8 = 0; var8 < arg0.method414((byte) 18); var8++) {
            int var9 = arg0.field1074[var8] & 0xFF;
            if (var9 != 32) {
                this.method290(this.field734[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field742[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field741[var9], this.field747[var9], arg3);
            }
            var6 += this.field741[var9];
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(Lhb;III)V", line = 590)
    public final void method301(class44 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field754;
        for (int var6 = 0; var6 < arg0.field1070; var6++) {
            int var7 = arg0.field1074[var6] & 0xFF;
            if (var7 != 32) {
                this.method290(this.field734[var7], arg1, this.field742[var7] + var5, this.field741[var7], this.field747[var7], arg3);
            }
            arg1 += this.field741[var7];
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Lhb;IIII)V", line = 621)
    public final void method302(class44 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method297(arg0) / 2;
        int var7 = arg2 - this.field754;
        for (int var8 = 0; var8 < arg0.field1070; var8++) {
            int var9 = arg0.field1074[var8] & 0xFF;
            if (var9 != 32) {
                this.method290(this.field734[var9], var6, this.field742[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field741[var9], this.field747[var9], arg3);
            }
            var6 += this.field741[var9];
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 734)
    public class30(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field742 = arg0;
        this.field741 = arg1;
        this.field747 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field734 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field742[var10] < var8) {
                var8 = this.field742[var10];
            }
            if (this.field747[var10] + this.field742[var10] > var9) {
                var9 = this.field747[var10] + this.field742[var10];
            }
            byte[] var11 = this.field734[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field754 = this.field747[32] + this.field742[32];
        this.field757 = this.field754 - var8;
        this.field760 = var9 - this.field754;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(Lhb;IIIZ)V", line = 651)
    public final void method303(class44 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method295(arg0, arg1 - this.method304(arg0), arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(Lhb;)I", line = 661)
    public final int method304(class44 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field1070; var3++) {
            if (arg0.field1074[var3] == 64 && var3 + 4 < arg0.field1070 && arg0.field1074[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field741[arg0.field1074[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lhb;IIIII)V", line = 702)
    public final void method305(class44 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method297(arg0) / 2;
        int var10 = arg2 - this.field754;
        for (int var11 = 0; var11 < arg0.method414((byte) 107); var11++) {
            int var12 = arg0.field1074[var11] & 0xFF;
            if (var12 != 32) {
                this.method290(this.field734[var12], var9, this.field742[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field741[var12], this.field747[var12], arg3);
            }
            var9 += this.field741[var12];
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Lhb;IIIZI)V", line = 792)
    private final void method306(class44 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class44 var7 = arg0.method384(true);
        int var8 = 0;
        for (int var9 = 0; var9 < var7.method414((byte) 9); var9++) {
            if (var7.method385(255, var9) == 32) {
                var8++;
            }
        }
        int var10 = 0;
        int var11 = 0;
        if (var8 > 0) {
            var10 = (arg5 - this.method304(var7)) * 256 / var8;
        }
        this.field759 = false;
        int var12 = arg1;
        if (var7 == null) {
            return;
        }
        int var13 = arg2 - this.field754;
        for (int var14 = 0; var14 < var7.field1070; var14++) {
            if (var7.field1074[var14] == 64 && var14 + 4 < var7.field1070 && var7.field1074[var14 + 4] == 64) {
                int var15 = this.method288(var7.method396((byte) -76, var14 + 1, var14 + 4));
                if (var15 != -1) {
                    arg3 = var15;
                }
                var14 += 4;
            } else {
                int var16 = var7.field1074[var14] & 0xFF;
                if (var16 != 32) {
                    if (arg4) {
                        this.method290(this.field734[var16], arg1 + 1, this.field742[var16] + var13 + 1, this.field741[var16], this.field747[var16], 0);
                    }
                    this.method290(this.field734[var16], arg1, this.field742[var16] + var13, this.field741[var16], this.field747[var16], arg3);
                }
                arg1 += this.field741[var16];
                if (var16 == 32) {
                    int var17 = var10 + var11;
                    arg1 += var17 / 256;
                    var11 = var17 & 0xFF;
                }
            }
        }
        if (this.field759) {
            class112.method860(var12, (int) ((double) this.field754 * 0.7D) + var13, arg1 - var12, 8388608);
        }
    }
}
