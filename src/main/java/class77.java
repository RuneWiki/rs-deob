import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class77 extends class69 {

    @OriginalMember(owner = "client!me", name = "zb", descriptor = "[[B")
    private byte[][] field1732 = new byte[256][];

    @OriginalMember(owner = "client!me", name = "Eb", descriptor = "I")
    public int field1737 = 0;

    @OriginalMember(owner = "client!me", name = "ob", descriptor = "Ljava/util/Random;")
    private Random field1721 = new Random();

    @OriginalMember(owner = "client!me", name = "Hb", descriptor = "Z")
    private boolean field1740 = false;

    @OriginalMember(owner = "client!me", name = "sb", descriptor = "[I")
    private int[] field1725;

    @OriginalMember(owner = "client!me", name = "tb", descriptor = "[I")
    private int[] field1726;

    @OriginalMember(owner = "client!me", name = "Bb", descriptor = "[I")
    private int[] field1734;

    @OriginalMember(owner = "client!me", name = "Gb", descriptor = "I")
    private int field1739;

    @OriginalMember(owner = "client!me", name = "Fb", descriptor = "I")
    private int field1738;

    @OriginalMember(owner = "client!me", name = "nb", descriptor = "Lrc;")
    private static class105 field1720 = class43.method374("bla", 0);

    @OriginalMember(owner = "client!me", name = "hb", descriptor = "Lrc;")
    private static class105 field1714 = class43.method374("red", 0);

    @OriginalMember(owner = "client!me", name = "mb", descriptor = "Lrc;")
    private static class105 field1719 = class43.method374("blu", 0);

    @OriginalMember(owner = "client!me", name = "ib", descriptor = "Lrc;")
    private static class105 field1715 = class43.method374("str", 0);

    @OriginalMember(owner = "client!me", name = "gb", descriptor = "Lrc;")
    private static class105 field1713 = class43.method374("yel", 0);

    @OriginalMember(owner = "client!me", name = "qb", descriptor = "Lrc;")
    private static class105 field1723 = class43.method374("mag", 0);

    @OriginalMember(owner = "client!me", name = "rb", descriptor = "Lrc;")
    private static class105 field1724 = class43.method374("or3", 0);

    @OriginalMember(owner = "client!me", name = "kb", descriptor = "Lrc;")
    private static class105 field1717 = class43.method374("whi", 0);

    @OriginalMember(owner = "client!me", name = "pb", descriptor = "Lrc;")
    private static class105 field1722 = class43.method374("or2", 0);

    @OriginalMember(owner = "client!me", name = "jb", descriptor = "Lrc;")
    private static class105 field1716 = class43.method374("dre", 0);

    @OriginalMember(owner = "client!me", name = "ub", descriptor = "Lrc;")
    private static class105 field1727 = class43.method374("gre", 0);

    @OriginalMember(owner = "client!me", name = "vb", descriptor = "Lrc;")
    private static class105 field1728 = class43.method374("gr2", 0);

    @OriginalMember(owner = "client!me", name = "xb", descriptor = "Lrc;")
    private static class105 field1730 = class43.method374("gr3", 0);

    @OriginalMember(owner = "client!me", name = "lb", descriptor = "[Lrc;")
    private static class105[] field1718 = new class105[100];

    @OriginalMember(owner = "client!me", name = "yb", descriptor = "Lrc;")
    private static class105 field1731 = class43.method374("or1", 0);

    @OriginalMember(owner = "client!me", name = "Ab", descriptor = "Lrc;")
    private static class105 field1733 = class43.method374("cya", 0);

    @OriginalMember(owner = "client!me", name = "Cb", descriptor = "Lrc;")
    private static class105 field1735 = class43.method374("lre", 0);

    @OriginalMember(owner = "client!me", name = "wb", descriptor = "Lrc;")
    private static class105 field1729 = class43.method374("dbl", 0);

    @OriginalMember(owner = "client!me", name = "Db", descriptor = "Lrc;")
    private static class105 field1736 = class43.method374("gr1", 0);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([I[BIIIIIIII)V", line = 4)
    private final void method653(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(I)I", line = 36)
    public final int method654(int arg0) {
        return this.field1726[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lrc;IIIZI)V", line = 39)
    private final void method655(class105 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class105 var7 = arg0.method843(32);
        int var8 = 0;
        for (int var9 = 0; var9 < var7.method863(-127); var9++) {
            if (var7.method837(var9, (byte) 59) == 32) {
                var8++;
            }
        }
        int var10 = 0;
        int var11 = 0;
        if (var8 > 0) {
            var10 = (arg5 - this.method672(var7)) * 256 / var8;
        }
        this.field1740 = false;
        int var12 = arg1;
        if (var7 == null) {
            return;
        }
        int var13 = arg2 - this.field1737;
        for (int var14 = 0; var14 < var7.field2383; var14++) {
            if (var7.field2417[var14] == 64 && var14 + 4 < var7.field2383 && var7.field2417[var14 + 4] == 64) {
                int var15 = this.method656(var7.method860(var14 + 1, false, var14 + 4));
                if (var15 != -1) {
                    arg3 = var15;
                }
                var14 += 4;
            } else {
                int var16 = var7.field2417[var14] & 0xFF;
                if (var16 != 32) {
                    if (arg4) {
                        this.method667(this.field1732[var16], arg1 + 1, this.field1725[var16] + var13 + 1, this.field1726[var16], this.field1734[var16], 0);
                    }
                    this.method667(this.field1732[var16], arg1, this.field1725[var16] + var13, this.field1726[var16], this.field1734[var16], arg3);
                }
                arg1 += this.field1726[var16];
                if (var16 == 32) {
                    int var17 = var10 + var11;
                    arg1 += var17 / 256;
                    var11 = var17 & 0xFF;
                }
            }
        }
        if (this.field1740) {
            class69.method589(var12, (int) ((double) this.field1737 * 0.7D) + var13, arg1 - var12, 8388608);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lrc;)I", line = 108)
    private final int method656(class105 arg0) {
        if (arg0.method829(true, field1714)) {
            return 16711680;
        } else if (arg0.method829(true, field1727)) {
            return 65280;
        } else if (arg0.method829(true, field1719)) {
            return 255;
        } else if (arg0.method829(true, field1713)) {
            return 16776960;
        } else if (arg0.method829(true, field1733)) {
            return 65535;
        } else if (arg0.method829(true, field1723)) {
            return 16711935;
        } else if (arg0.method829(true, field1717)) {
            return 16777215;
        } else if (arg0.method829(true, field1720)) {
            return 0;
        } else if (arg0.method829(true, field1735)) {
            return 16748608;
        } else if (arg0.method829(true, field1716)) {
            return 8388608;
        } else if (arg0.method829(true, field1729)) {
            return 128;
        } else if (arg0.method829(true, field1731)) {
            return 16756736;
        } else if (arg0.method829(true, field1722)) {
            return 16740352;
        } else if (arg0.method829(true, field1724)) {
            return 16723968;
        } else if (arg0.method829(true, field1736)) {
            return 12648192;
        } else if (arg0.method829(true, field1728)) {
            return 8453888;
        } else if (arg0.method829(true, field1730)) {
            return 4259584;
        } else {
            if (arg0.method829(true, field1715)) {
                this.field1740 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lrc;IIII)V", line = 165)
    public final void method657(class105 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method662(arg0) / 2;
        int var7 = arg2 - this.field1737;
        for (int var8 = 0; var8 < arg0.method863(-121); var8++) {
            int var9 = arg0.field2417[var8] & 0xFF;
            if (var9 != 32) {
                this.method667(this.field1732[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field1725[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field1726[var9], this.field1734[var9], arg3);
            }
            var6 += this.field1726[var9];
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lrc;IIIZ)V", line = 188)
    public final void method658(class105 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field1740 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field1737;
        for (int var8 = 0; var8 < arg0.field2383; var8++) {
            if (arg0.field2417[var8] == 64 && var8 + 4 < arg0.field2383 && arg0.field2417[var8 + 4] == 64) {
                int var9 = this.method656(arg0.method860(var8 + 1, false, var8 + 4));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field2417[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method667(this.field1732[var10], arg1 + 1, this.field1725[var10] + var7 + 1, this.field1726[var10], this.field1734[var10], 0);
                    }
                    this.method667(this.field1732[var10], arg1, this.field1725[var10] + var7, this.field1726[var10], this.field1734[var10], arg3);
                }
                arg1 += this.field1726[var10];
            }
        }
        if (this.field1740) {
            class69.method589(var6, (int) ((double) this.field1737 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Lrc;IIIZI)V", line = 233)
    public final void method659(class105 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field1721.setSeed((long) arg5);
        int var7 = (this.field1721.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field1737;
        for (int var9 = 0; var9 < arg0.field2383; var9++) {
            if (arg0.field2417[var9] == 64 && var9 + 4 < arg0.field2383 && arg0.field2417[var9 + 4] == 64) {
                int var10 = this.method656(arg0.method860(var9 + 1, false, var9 + 4));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field2417[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        this.method666(this.field1732[var11], arg1 + 1, this.field1725[var11] + var8 + 1, this.field1726[var11], this.field1734[var11], 0, 192);
                    }
                    this.method666(this.field1732[var11], arg1, this.field1725[var11] + var8, this.field1726[var11], this.field1734[var11], arg3, var7);
                }
                arg1 += this.field1726[var11];
                if ((this.field1721.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Lrc;IIII)V", line = 280)
    public final void method660(class105 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method662(arg0) / 2;
        int var7 = arg2 - this.field1737;
        for (int var8 = 0; var8 < arg0.field2383; var8++) {
            int var9 = arg0.field2417[var8] & 0xFF;
            if (var9 != 32) {
                this.method667(this.field1732[var9], var6, this.field1725[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field1726[var9], this.field1734[var9], arg3);
            }
            var6 += this.field1726[var9];
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Lrc;IIIZ)V", line = 305)
    public final void method661(class105 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method658(arg0, arg1 - this.method672(arg0), arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Lrc;)I", line = 309)
    public final int method662(class105 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field2383; var3++) {
            var2 += this.field1726[arg0.field2417[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "()V", line = 324)
    public static void method663() {
        field1714 = null;
        field1727 = null;
        field1719 = null;
        field1713 = null;
        field1733 = null;
        field1723 = null;
        field1717 = null;
        field1720 = null;
        field1735 = null;
        field1716 = null;
        field1729 = null;
        field1731 = null;
        field1722 = null;
        field1724 = null;
        field1736 = null;
        field1728 = null;
        field1730 = null;
        field1715 = null;
        field1718 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lrc;III)V", line = 363)
    public final void method664(class105 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field1737;
        for (int var6 = 0; var6 < arg0.field2383; var6++) {
            int var7 = arg0.field2417[var6] & 0xFF;
            if (var7 != 32) {
                this.method667(this.field1732[var7], arg1, this.field1725[var7] + var5, this.field1726[var7], this.field1734[var7], arg3);
            }
            arg1 += this.field1726[var7];
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([I[BIIIIIII)V", line = 392)
    private final void method665(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([BIIIIII)V", line = 455)
    private final void method666(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class69.field1552 * arg2 + arg1;
        int var9 = class69.field1552 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class69.field1549) {
            int var12 = class69.field1549 - arg2;
            arg4 -= var12;
            arg2 = class69.field1549;
            var11 += arg3 * var12;
            var8 += class69.field1552 * var12;
        }
        if (arg2 + arg4 > class69.field1547) {
            arg4 -= arg2 + arg4 - class69.field1547;
        }
        if (arg1 < class69.field1546) {
            int var13 = class69.field1546 - arg1;
            arg3 -= var13;
            arg1 = class69.field1546;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class69.field1551) {
            int var14 = arg1 + arg3 - class69.field1551;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method653(class69.field1548, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([BIIIII)V", line = 503)
    private final void method667(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class69.field1552 * arg2 + arg1;
        int var8 = class69.field1552 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class69.field1549) {
            int var11 = class69.field1549 - arg2;
            arg4 -= var11;
            arg2 = class69.field1549;
            var10 += arg3 * var11;
            var7 += class69.field1552 * var11;
        }
        if (arg2 + arg4 > class69.field1547) {
            arg4 -= arg2 + arg4 - class69.field1547;
        }
        if (arg1 < class69.field1546) {
            int var12 = class69.field1546 - arg1;
            arg3 -= var12;
            arg1 = class69.field1546;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class69.field1551) {
            int var13 = arg1 + arg3 - class69.field1551;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method665(class69.field1548, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Lrc;III)V", line = 561)
    public final void method668(class105 arg0, int arg1, int arg2, int arg3) {
        this.method664(arg0, arg1 - this.method662(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lrc;IIIIIZIII)V", line = 565)
    public final void method669(class105 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        int var12 = 0;
        class105 var13 = class59.method480(-25862, 100);
        int var14 = -1;
        int var15 = 0;
        class105 var16 = null;
        if (arg9 == 0) {
            arg9 = this.field1739;
        }
        boolean var17 = true;
        if (arg4 < this.field1739 + this.field1738 + arg9 && arg4 < arg9 + arg9) {
            var17 = false;
        }
        int var18 = 0;
        int var19 = arg0.method863(-127);
        for (int var20 = 0; var20 < var19; var20++) {
            int var24 = arg0.method837(var20, (byte) 59);
            if (var24 == 64 && var20 + 4 < var19 && arg0.method837(var20 + 4, (byte) 59) == 64) {
                var16 = arg0.method860(var20, false, var20 + 5);
                var13.method842(var16, (byte) 20);
                var20 += 4;
            } else if (var24 == 92 && var20 + 1 < var19 && arg0.method837(var20 + 1, (byte) 59) == 110) {
                var16 = null;
                field1718[var18++] = var13.method860(var12, false, var13.method863(-123)).method843(32);
                var12 = var13.method863(-128);
                var11 = 0;
                var14 = -1;
                var20++;
            } else {
                var13.method836(var24, (byte) -126);
                var11 += this.method654(var24);
                if (var24 == 32 || var24 == 45) {
                    var14 = var13.method863(-123);
                    var15 = var11;
                }
                if (var17 && var11 > arg3 && var14 >= 0) {
                    field1718[var18++] = var13.method860(var12, false, var14).method843(32);
                    var12 = var14;
                    var14 = -1;
                    var11 -= var15;
                    if (var16 != null && var12 > 4) {
                        var12 -= 5;
                        var13.method852(var12, var16, (byte) 53);
                    }
                }
            }
        }
        if (var13.method863(-125) > var12) {
            field1718[var18++] = var13.method860(var12, false, var13.method863(-123)).method843(32);
        }
        if (arg8 == 3 && var18 == 1) {
            arg8 = 1;
        }
        int var21;
        if (arg8 == 0) {
            var21 = this.field1739 + arg2;
        } else if (arg8 == 1) {
            var21 = (arg4 - this.field1739 - this.field1738 - (var18 - 1) * arg9) / 2 + this.field1739 + arg2;
        } else if (arg8 == 2) {
            var21 = arg2 + arg4 - this.field1738 - (var18 - 1) * arg9;
        } else {
            int var22 = (arg4 - this.field1739 - this.field1738 - (var18 - 1) * arg9) / (var18 + 1);
            if (var22 < 0) {
                var22 = 0;
            }
            var21 = this.field1739 + arg2 + var22;
            arg9 += var22;
        }
        for (int var23 = 0; var23 < var18; var23++) {
            if (arg7 == 0) {
                this.method658(field1718[var23], arg1, var21, arg5, arg6);
            } else if (arg7 == 1) {
                this.method673(field1718[var23], arg3 / 2 + arg1, var21, arg5, arg6);
            } else if (arg7 == 2) {
                this.method661(field1718[var23], arg1 + arg3, var21, arg5, arg6);
            } else if (var18 - 1 == var23) {
                this.method658(field1718[var23], arg1, var21, arg5, arg6);
            } else {
                this.method655(field1718[var23], arg1, var21, arg5, arg6, arg3);
            }
            var21 += arg9;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lrc;IIIII)V", line = 707)
    public final void method670(class105 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method662(arg0) / 2;
        int var10 = arg2 - this.field1737;
        for (int var11 = 0; var11 < arg0.method863(-128); var11++) {
            int var12 = arg0.field2417[var11] & 0xFF;
            if (var12 != 32) {
                this.method667(this.field1732[var12], var9, this.field1725[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field1726[var12], this.field1734[var12], arg3);
            }
            var9 += this.field1726[var12];
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(Lrc;III)V", line = 738)
    public final void method671(class105 arg0, int arg1, int arg2, int arg3) {
        this.method664(arg0, arg1 - this.method662(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(Lrc;)I", line = 744)
    public final int method672(class105 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field2383; var3++) {
            if (arg0.field2417[var3] == 64 && var3 + 4 < arg0.field2383 && arg0.field2417[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field1726[arg0.field2417[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(Lrc;IIIZ)V", line = 767)
    public final void method673(class105 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method658(arg0, arg1 - this.method672(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 809)
    public class77(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field1725 = arg0;
        this.field1726 = arg1;
        this.field1734 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field1732 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field1725[var10] < var8) {
                var8 = this.field1725[var10];
            }
            if (this.field1734[var10] + this.field1725[var10] > var9) {
                var9 = this.field1734[var10] + this.field1725[var10];
            }
            byte[] var11 = this.field1732[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field1737 = this.field1734[32] + this.field1725[32];
        this.field1739 = this.field1737 - var8;
        this.field1738 = var9 - this.field1737;
    }
}
