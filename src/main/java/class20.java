import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class20 extends class417 {

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "[[Lko;")
    private class256[][] field303 = new class256[16][128];

    @OriginalMember(owner = "client!tm", name = "I", descriptor = "[I")
    private int[] field312 = new int[16];

    @OriginalMember(owner = "client!tm", name = "eb", descriptor = "[I")
    private int[] field334 = new int[16];

    @OriginalMember(owner = "client!tm", name = "jb", descriptor = "[I")
    public int[] field339 = new int[16];

    @OriginalMember(owner = "client!tm", name = "T", descriptor = "I")
    private int field323 = 1000000;

    @OriginalMember(owner = "client!tm", name = "D", descriptor = "[[Lko;")
    private class256[][] field307 = new class256[16][128];

    @OriginalMember(owner = "client!tm", name = "ob", descriptor = "[I")
    private int[] field344 = new int[16];

    @OriginalMember(owner = "client!tm", name = "pb", descriptor = "[I")
    private int[] field345 = new int[16];

    @OriginalMember(owner = "client!tm", name = "Y", descriptor = "[I")
    private int[] field328 = new int[16];

    @OriginalMember(owner = "client!tm", name = "S", descriptor = "[I")
    public int[] field322 = new int[16];

    @OriginalMember(owner = "client!tm", name = "kb", descriptor = "[I")
    private int[] field340 = new int[16];

    @OriginalMember(owner = "client!tm", name = "y", descriptor = "I")
    private int field302 = 256;

    @OriginalMember(owner = "client!tm", name = "gb", descriptor = "[I")
    private int[] field336 = new int[16];

    @OriginalMember(owner = "client!tm", name = "xb", descriptor = "[I")
    private int[] field353 = new int[16];

    @OriginalMember(owner = "client!tm", name = "Bb", descriptor = "[I")
    private int[] field357 = new int[16];

    @OriginalMember(owner = "client!tm", name = "ib", descriptor = "[I")
    private int[] field338 = new int[16];

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "[I")
    private int[] field297 = new int[16];

    @OriginalMember(owner = "client!tm", name = "Gb", descriptor = "[I")
    public int[] field362 = new int[16];

    @OriginalMember(owner = "client!tm", name = "X", descriptor = "[I")
    private int[] field327 = new int[16];

    @OriginalMember(owner = "client!tm", name = "Fb", descriptor = "[I")
    private int[] field361 = new int[16];

    @OriginalMember(owner = "client!tm", name = "V", descriptor = "Le;")
    private class82 field325 = new class82();

    @OriginalMember(owner = "client!tm", name = "Mb", descriptor = "Laf;")
    private class208 field368 = new class208(this);

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "Lbo;")
    private class453 field299 = new class453(128);

    @OriginalMember(owner = "client!tm", name = "mb", descriptor = "I")
    public static int field342 = 0;

    @OriginalMember(owner = "client!tm", name = "Db", descriptor = "Ljava/lang/String;")
    public static String field359 = "skill: ";

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!tm", name = "w", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!tm", name = "x", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!tm", name = "A", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!tm", name = "B", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!tm", name = "C", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!tm", name = "E", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!tm", name = "F", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!tm", name = "G", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!tm", name = "H", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!tm", name = "J", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!tm", name = "K", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!tm", name = "L", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!tm", name = "M", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!tm", name = "N", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!tm", name = "O", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!tm", name = "P", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!tm", name = "Q", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!tm", name = "R", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!tm", name = "U", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!tm", name = "W", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!tm", name = "Z", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!tm", name = "ab", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!tm", name = "bb", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!tm", name = "cb", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!tm", name = "db", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!tm", name = "fb", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!tm", name = "hb", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!tm", name = "lb", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!tm", name = "nb", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!tm", name = "qb", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!tm", name = "rb", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!tm", name = "sb", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!tm", name = "tb", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!tm", name = "ub", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!tm", name = "vb", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!tm", name = "wb", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!tm", name = "yb", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!tm", name = "zb", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!tm", name = "Ab", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!tm", name = "Cb", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!tm", name = "Eb", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!tm", name = "Ib", descriptor = "I")
    private int field364;

    @OriginalMember(owner = "client!tm", name = "Jb", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "client!tm", name = "Nb", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client!tm", name = "Kb", descriptor = "J")
    private long field366;

    @OriginalMember(owner = "client!tm", name = "Lb", descriptor = "J")
    private long field367;

    @OriginalMember(owner = "client!tm", name = "Ob", descriptor = "Lhg;")
    private class49 field370;

    @OriginalMember(owner = "client!tm", name = "Hb", descriptor = "Z")
    private boolean field363;

    @OriginalMember(owner = "client!tm", name = "Pb", descriptor = "Z")
    private boolean field371;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZ)V", line = 5)
    private final void method144(int arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field295++;
        if ((this.field322[arg0] & 0x2) == 0) {
            return;
        }
        for (class256 var3 = (class256) this.field368.field2829.method1575(0); var3 != null; var3 = (class256) this.field368.field2829.method1573((byte) -128)) {
            if (var3.field3725 == arg0 && this.field303[arg0][var3.field3752] == null && var3.field3726 < 0) {
                var3.field3726 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIIIIII)V", line = 40)
    public static final void method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field306++;
        if (arg2 != 2 || arg7 < 1 || arg6 < 1 || (class351.field5217 - 2) < arg7 || arg6 > class143.field1815 - 2) {
            return;
        }
        if (!class226.method1467(arg2 ^ 0x2) && !class329.method2155(16, arg6, arg4, arg7, class63.field946)) {
            return;
        }
        if (class106.field1405 == null) {
            return;
        }
        int var9 = arg4;
        if (arg4 < 3 && class186.method1239(arg6, 256, arg7)) {
            var9 = arg4 + 1;
        }
        class436.method2729(class126.field1647, arg1, arg6, arg4, var9, class420.field6108[arg4], arg7, (byte) -86);
        if (arg0 < 0) {
            return;
        }
        boolean var10 = class24.field434;
        class24.field434 = true;
        class143.method989(arg4, (byte) 57, var9, arg8, arg7, class126.field1647, false, arg5, arg6, arg3, arg0, false, class420.field6108[arg4]);
        class24.field434 = var10;
        return;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)V", line = 83)
    public final synchronized void method146(int arg0, int arg1, int arg2) {
        this.method148((byte) -33, arg0, arg1);
        if (arg2 != 128) {
            this.field365 = -96;
        }
        field355++;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)V", line = 95)
    public final synchronized void method147(int arg0, int arg1) {
        this.field302 = arg1;
        if (arg0 != -20849) {
            this.method149(-67, -58, 55);
        }
        field354++;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BII)V", line = 112)
    private final void method148(byte arg0, int arg1, int arg2) {
        this.field344[arg2] = arg1;
        field305++;
        this.field345[arg2] = class394.method2529(arg1, -128);
        if (arg0 > -20) {
            this.method148((byte) -113, -27, -128);
        }
        this.method164(0, arg2, arg1);
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(III)V", line = 130)
    private final void method149(int arg0, int arg1, int arg2) {
        field320++;
        if (arg1 != 354) {
            method145(62, 100, 3, 72, 89, -54, -69, -110, 42);
        }
        this.field327[arg0] = arg2;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V", line = 1700)
    public class20() {
        this.method176(false, 256, -1);
        this.method184(-18, true);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIZ)V", line = 151)
    public static final void method150(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (class240.field3368 <= arg0 && class136.field1769 >= arg0) {
            int var5 = class400.method2567(class157.field1981, class312.field4602, (byte) 126, arg3);
            int var6 = class400.method2567(class157.field1981, class312.field4602, (byte) 126, arg2);
            class361.method2378(arg0, var5, arg1, var6, -1);
        }
        field358++;
        if (arg4) {
            method167((byte) 28);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZZ)V", line = 170)
    private final synchronized void method151(boolean arg0, boolean arg1) {
        field311++;
        this.field325.method649();
        if (arg1) {
            this.field303 = null;
        }
        this.field370 = null;
        this.method184(-18, arg0);
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "()I", line = 189)
    public final synchronized int method152() {
        field313++;
        return 0;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILhg;ZZ)V", line = 197)
    private final synchronized void method153(int arg0, class49 arg1, boolean arg2, boolean arg3) {
        this.method151(arg2, false);
        field292++;
        this.field325.method643(arg1.field756);
        this.field363 = arg3;
        this.field367 = 0L;
        int var5 = this.field325.method640();
        for (int var6 = 0; var6 < var5; var6++) {
            this.field325.method644(var6);
            this.field325.method648(var6);
            this.field325.method650(var6);
        }
        this.field364 = this.field325.method653();
        this.field365 = this.field325.field1155[this.field364];
        if (arg0 == 2265) {
            this.field366 = this.field325.method652(this.field365);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BLko;)I", line = 227)
    private final int method154(byte arg0, class256 arg1) {
        field333++;
        int var3 = arg1.field3748 + (arg1.field3751 * arg1.field3738 >> 12);
        int var4 = ((this.field327[arg1.field3725] - 8192) * this.field338[arg1.field3725] >> 12) + var3;
        class354 var5 = arg1.field3737;
        if (var5.field5251 > 0 && (var5.field5240 > 0 || this.field336[arg1.field3725] > 0)) {
            int var6 = var5.field5240 << 2;
            int var7 = var5.field5244 << 1;
            if (var7 > arg1.field3744) {
                var6 = arg1.field3744 * var6 / var7;
            }
            int var8 = (this.field336[arg1.field3725] >> 7) + var6;
            double var9 = Math.sin((double) (arg1.field3739 & 0x1FF) * 0.01227184630308513D);
            var4 += (int) ((double) var8 * var9);
        }
        int var11 = 28 % ((-arg0 - 78) / 39);
        int var12 = (int) ((double) (arg1.field3730.field1910 * 256) * Math.pow(2.0D, (double) var4 * 3.255208333333333E-4D) / (double) class388.field5673 + 0.5D);
        return var12 >= 1 ? var12 : 1;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)I", line = 263)
    public final int method155(byte arg0) {
        if (arg0 < 116) {
            method188(14, 37, 105, 107, -39);
        }
        field321++;
        return this.field302;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "()Lmq;", line = 274)
    public final synchronized class417 method156() {
        field350++;
        return null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZLko;)V", line = 283)
    public final void method157(int arg0, boolean arg1, class256 arg2) {
        field293++;
        int var4 = arg2.field3730.field1907.length;
        if (arg0 != 16) {
            method145(27, 31, 76, -121, 59, 37, 97, 122, -57);
        }
        int var6;
        if (arg1 && arg2.field3730.field1906) {
            int var5 = var4 + var4 - arg2.field3730.field1908;
            var6 = (int) ((long) this.field339[arg2.field3725] * (long) var5 >> 6);
            int var7 = var4 << 8;
            if (var7 <= var6) {
                var6 = var7 + var7 - var6 - 1;
                arg2.field3732.method1723(true);
            }
        } else {
            var6 = (int) ((long) this.field339[arg2.field3725] * (long) var4 >> 6);
        }
        arg2.field3732.method1733(var6);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lko;I)I", line = 315)
    private final int method158(class256 arg0, int arg1) {
        field349++;
        int var3 = this.field340[arg0.field3725];
        if (arg1 != 32) {
            this.field325 = null;
        }
        return var3 >= 8192 ? 16384 - ((128 - arg0.field3743) * (16384 - var3) + 32 >> 6) : arg0.field3743 * var3 + 32 >> 6;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)V", line = 335)
    public final synchronized void method159(byte arg0) {
        for (class101 var2 = (class101) this.field299.method2812(15710); var2 != null; var2 = (class101) this.field299.method2819((byte) 126)) {
            var2.method777(arg0 ^ 0x11);
        }
        if (arg0 != -49) {
            this.field367 = -42L;
        }
        field332++;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILko;)Z", line = 352)
    public final boolean method160(int arg0, class256 arg1) {
        if (arg0 != 3) {
            this.method173((byte) -94, -40, -54);
        }
        field346++;
        if (arg1.field3732 != null) {
            return false;
        }
        if (arg1.field3726 >= 0) {
            arg1.method2632(true);
            if (arg1.field3749 > 0 && this.field307[arg1.field3725][arg1.field3749] == arg1) {
                this.field307[arg1.field3725][arg1.field3749] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(III)V", line = 380)
    private final void method161(int arg0, int arg1, int arg2) {
        int var4 = 112 / ((arg0 + 52) / 57);
        field301++;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V", line = 390)
    public static final void method162(int arg0) {
        field324++;
        if (class211.field2872 != null) {
            return;
        }
        int var1 = class420.field6109;
        int var2 = class244.field3436;
        int var3 = class159.field2075 - var1 - class357.field5298;
        int var4 = class331.field4882 - var2 - class435.field6313;
        if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
            try {
                Container var5;
                if (class428.field6222 == null) {
                    var5 = class63.field948.field5381;
                } else {
                    var5 = class428.field6222;
                }
                int var6 = 0;
                int var7 = 0;
                if (class428.field6222 == var5) {
                    Insets var8 = class428.field6222.getInsets();
                    var7 = var8.top;
                    var6 = var8.left;
                }
                Graphics var9 = var5.getGraphics();
                var9.setColor(Color.black);
                if (var1 > 0) {
                    var9.fillRect(var6, var7, var1, class331.field4882);
                }
                if (var2 > 0) {
                    var9.fillRect(var6, var7, class159.field2075, var2);
                }
                if (var3 > 0) {
                    var9.fillRect(var6 + class159.field2075 - var3, var7, var3, class331.field4882);
                }
                if (var4 > 0) {
                    var9.fillRect(var6, class331.field4882 + var7 - var4, class159.field2075, var4);
                }
            } catch (Exception var10) {
            }
        }
        if (arg0 != 1016) {
            field342 = 52;
        }
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(II)V", line = 465)
    private final void method163(int arg0, int arg1) {
        field317++;
        int var3 = 11 % ((-arg1 - 92) / 34);
        for (class256 var4 = (class256) this.field368.field2829.method1575(0); var4 != null; var4 = (class256) this.field368.field2829.method1573((byte) -128)) {
            if ((arg0 < 0 || var4.field3725 == arg0) && var4.field3726 < 0) {
                this.field303[var4.field3725][var4.field3752] = null;
                var4.field3726 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(III)V", line = 497)
    private final void method164(int arg0, int arg1, int arg2) {
        if (this.field312[arg1] != arg2) {
            this.field312[arg1] = arg2;
            for (int var4 = 0; var4 < 128; var4++) {
                this.field307[arg1][var4] = null;
            }
        }
        field310++;
        if (arg0 != 0) {
            method150(118, -65, -128, -29, true);
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "([III)V", line = 522)
    public final synchronized void method165(int[] arg0, int arg1, int arg2) {
        if (this.field325.method641()) {
            int var4 = this.field325.field1150 * this.field323 / class388.field5673;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field367;
                if ((this.field366 - var5) >= 0L) {
                    this.field367 = var5;
                    break;
                }
                int var7 = (int) ((((long) var4) + this.field366 - this.field367 - 1L) / (long) var4);
                this.field367 += (long) var4 * (long) var7;
                this.field368.method165(arg0, arg1, var7);
                this.method168(-1);
                arg1 += var7;
                arg2 -= var7;
            } while (this.field325.method641());
        }
        field315++;
        this.field368.method165(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)Z", line = 561)
    public final synchronized boolean method166(int arg0) {
        int var2 = 65 % ((2 - arg0) / 56);
        field348++;
        return this.field325.method641();
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(B)V", line = 572)
    public static void method167(byte arg0) {
        field359 = null;
        int var1 = 124 % ((arg0 + 43) / 63);
    }

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "(I)V", line = 589)
    private final void method168(int arg0) {
        field352++;
        int var2 = this.field364;
        int var3 = this.field365;
        long var4 = this.field366;
        if (this.field370 != null && this.field369 == var3) {
            this.method153(2265, this.field370, this.field371, this.field363);
            this.method168(-1);
            return;
        }
        while (this.field365 == var3) {
            while (this.field325.field1155[var2] == var3) {
                this.field325.method644(var2);
                int var6 = this.field325.method645(var2);
                if (var6 == 1) {
                    this.field325.method647();
                    this.field325.method650(var2);
                    if (this.field325.method646()) {
                        if (this.field370 != null) {
                            this.method174(this.field370, (byte) 121, this.field363);
                            this.method168(-1);
                            return;
                        }
                        if (!this.field363 || var3 == 0) {
                            this.method184(arg0 - 17, true);
                            this.field325.method649();
                            return;
                        }
                        this.field325.method642(var4);
                    }
                    break;
                }
                if ((var6 & 0x80) != 0) {
                    this.method182(arg0 ^ 0xFFFFA146, var6);
                }
                this.field325.method648(var2);
                this.field325.method650(var2);
            }
            var2 = this.field325.method653();
            var3 = this.field325.field1155[var2];
            var4 = this.field325.method652(var3);
        }
        this.field365 = var3;
        this.field366 = var4;
        this.field364 = var2;
        if (this.field370 != null && var3 > this.field369) {
            this.field365 = this.field369;
            this.field364 = -1;
            this.field366 = this.field325.method652(this.field365);
        }
        if (arg0 != -1) {
            this.field362 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(II)V", line = 673)
    private final void method169(int arg0, int arg1) {
        field316++;
        if (arg0 != 631539431) {
            return;
        }
        for (class256 var3 = (class256) this.field368.field2829.method1575(0); var3 != null; var3 = (class256) this.field368.field2829.method1573((byte) -128)) {
            if (arg1 < 0 || var3.field3725 == arg1) {
                if (var3.field3732 != null) {
                    var3.field3732.method1726(class388.field5673 / 100);
                    if (var3.field3732.method1720()) {
                        this.field368.field2837.method248(var3.field3732);
                    }
                    var3.method1652((byte) -36);
                }
                if (var3.field3726 < 0) {
                    this.field303[var3.field3725][var3.field3752] = null;
                }
                var3.method2632(true);
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIII)V", line = 726)
    private final void method170(int arg0, int arg1, int arg2, int arg3) {
        field296++;
        if (arg3 != -23056) {
            this.method178(27, true);
        }
    }

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "(I)V", line = 740)
    public final synchronized void method171(int arg0) {
        field343++;
        class101 var2 = (class101) this.field299.method2812(15710);
        if (arg0 != -12399) {
            this.field338 = null;
        }
        while (var2 != null) {
            var2.method2632(true);
            var2 = (class101) this.field299.method2819((byte) 99);
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(IIII)V", line = 758)
    private final void method172(int arg0, int arg1, int arg2, int arg3) {
        field356++;
        class256 var5 = this.field303[arg0][arg3];
        if (arg2 != 1196153896) {
            this.method175(-77, -7, -125, 65);
        }
        if (var5 == null) {
            return;
        }
        this.field303[arg0][arg3] = null;
        if ((this.field322[arg0] & 0x2) == 0) {
            var5.field3726 = 0;
            return;
        }
        for (class256 var6 = (class256) this.field368.field2829.method1575(arg2 ^ 0x474BDC28); var6 != null; var6 = (class256) this.field368.field2829.method1573((byte) -128)) {
            if (var5.field3725 == var6.field3725 && var6.field3726 < 0 && var5 != var6) {
                var5.field3726 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(BII)V", line = 798)
    private final void method173(byte arg0, int arg1, int arg2) {
        if (arg0 != 33) {
            this.field336 = null;
        }
        this.field334[arg1] = arg2;
        field298++;
        this.field362[arg1] = (int) (Math.pow(2.0D, (double) arg2 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lhg;BZ)V", line = 818)
    public final synchronized void method174(class49 arg0, byte arg1, boolean arg2) {
        field294++;
        if (arg1 <= 103) {
            this.field323 = -52;
        }
        this.method153(2265, arg0, true, arg2);
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(IIII)V", line = 832)
    private final void method175(int arg0, int arg1, int arg2, int arg3) {
        field314++;
        this.method172(arg2, 64, 1196153896, arg3);
        if ((this.field322[arg2] & 0x2) != 0) {
            for (class256 var5 = (class256) this.field368.field2829.method1564(-25594); var5 != null; var5 = (class256) this.field368.field2829.method1562(arg0 ^ 0x75186EC6)) {
                if (var5.field3725 == arg2 && var5.field3726 < 0) {
                    this.field303[arg2][var5.field3752] = null;
                    this.field303[arg2][arg3] = var5;
                    int var6 = (var5.field3751 * var5.field3738 >> 12) + var5.field3748;
                    var5.field3748 += arg3 - var5.field3752 << 8;
                    var5.field3738 = var6 - var5.field3748;
                    var5.field3752 = arg3;
                    var5.field3751 = 4096;
                    return;
                }
            }
        }
        class101 var7 = (class101) this.field299.method2826(false, (long) this.field312[arg2]);
        if (var7 == null) {
            return;
        }
        class151 var8 = var7.field1341[arg3];
        if (var8 == null) {
            return;
        }
        class256 var9 = new class256();
        var9.field3758 = var7;
        var9.field3730 = var8;
        var9.field3725 = arg2;
        var9.field3737 = var7.field1331[arg3];
        var9.field3749 = var7.field1337[arg3];
        if (arg0 != 1964535494) {
            this.field365 = 47;
        }
        var9.field3752 = arg3;
        var9.field3729 = var7.field1328[arg3] * arg1 * var7.field1330 * arg1 + 1024 >> 11;
        var9.field3743 = var7.field1338[arg3] & 0xFF;
        var9.field3748 = (arg3 << 8) - (var7.field1329[arg3] & 0x7FFF);
        var9.field3757 = 0;
        var9.field3750 = 0;
        var9.field3742 = 0;
        var9.field3726 = -1;
        var9.field3759 = 0;
        if (this.field339[arg2] == 0) {
            var9.field3732 = class260.method1729(var8, this.method154((byte) -124, var9), this.method183(var9, -127), this.method158(var9, 32));
        } else {
            var9.field3732 = class260.method1729(var8, this.method154((byte) 78, var9), 0, this.method158(var9, 32));
            this.method157(arg0 ^ 0x75186ED6, var7.field1329[arg3] < 0, var9);
        }
        if (var7.field1329[arg3] < 0) {
            var9.field3732.method1740(-1);
        }
        if (var9.field3749 >= 0) {
            class256 var10 = this.field307[arg2][var9.field3749];
            if (var10 != null && var10.field3726 < 0) {
                this.field303[arg2][var10.field3752] = null;
                var10.field3726 = 0;
            }
            this.field307[arg2][var9.field3749] = var9;
        }
        this.field368.field2829.method1560(arg0 ^ 0x8AE79157, var9);
        this.field303[arg2][arg3] = var9;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZII)V", line = 928)
    private final synchronized void method176(boolean arg0, int arg1, int arg2) {
        field308++;
        if (arg0) {
            this.field361 = null;
        }
        if (arg2 >= 0) {
            this.field297[arg2] = arg1;
        } else {
            for (int var4 = 0; var4 < 16; var4++) {
                this.field297[var4] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(B)V", line = 951)
    public final synchronized void method177(byte arg0) {
        int var2 = -66 / ((-arg0 - 22) / 32);
        field326++;
        this.method151(true, false);
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(IZ)V", line = 962)
    private final void method178(int arg0, boolean arg1) {
        if (!arg1) {
            this.field364 = -21;
        }
        if ((this.field322[arg0] & 0x4) != 0) {
            for (class256 var3 = (class256) this.field368.field2829.method1575(0); var3 != null; var3 = (class256) this.field368.field2829.method1573((byte) -128)) {
                if (var3.field3725 == arg0) {
                    var3.field3731 = 0;
                }
            }
        }
        field318++;
    }

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "(B)Ljn;", line = 1000)
    public static final class47 method179(byte arg0) {
        field335++;
        try {
            return new class205();
        } catch (Throwable var2) {
            try {
                return arg0 <= 94 ? null : (class47) Class.forName("qp").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class413();
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lko;II[II)Z", line = 1029)
    public final boolean method180(class256 arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field309++;
        arg0.field3734 = class388.field5673 / 100;
        if (arg0.field3726 >= 0 && (arg0.field3732 == null || arg0.field3732.method1749())) {
            arg0.method1652((byte) -36);
            arg0.method2632(true);
            if (arg0.field3749 > 0 && this.field307[arg0.field3725][arg0.field3749] == arg0) {
                this.field307[arg0.field3725][arg0.field3749] = null;
            }
            return true;
        }
        int var6 = arg0.field3751;
        if (var6 > 0) {
            int var7 = var6 - (int) (Math.pow(2.0D, (double) this.field357[arg0.field3725] * 4.921259842519685E-4D) * 16.0D + 0.5D);
            if (var7 < 0) {
                var7 = 0;
            }
            arg0.field3751 = var7;
        }
        arg0.field3732.method1730(this.method154((byte) -126, arg0));
        class354 var8 = arg0.field3737;
        arg0.field3744++;
        if (arg4 != -2) {
            this.field339 = null;
        }
        arg0.field3739 += var8.field5251;
        boolean var9 = false;
        double var10 = (double) ((arg0.field3752 - 60 << 8) + (arg0.field3751 * arg0.field3738 >> 12)) * 5.086263020833333E-6D;
        if (var8.field5255 > 0) {
            if (var8.field5243 > 0) {
                arg0.field3759 += (int) (Math.pow(2.0D, (double) var8.field5243 * var10) * 128.0D + 0.5D);
            } else {
                arg0.field3759 += 128;
            }
            if (arg0.field3759 * var8.field5255 >= 819200) {
                var9 = true;
            }
        }
        if (var8.field5248 != null) {
            if (var8.field5253 <= 0) {
                arg0.field3750 += 128;
            } else {
                arg0.field3750 += (int) (Math.pow(2.0D, (double) var8.field5253 * var10) * 128.0D + 0.5D);
            }
            while (arg0.field3757 < var8.field5248.length - 2 && arg0.field3750 > (var8.field5248[arg0.field3757 + 2] & 0xFF << 8)) {
                arg0.field3757 += 2;
            }
            if (var8.field5248.length - 2 == arg0.field3757 && var8.field5248[arg0.field3757 + 1] == 0) {
                var9 = true;
            }
        }
        if (arg0.field3726 >= 0 && var8.field5250 != null && (this.field322[arg0.field3725] & 0x1) == 0 && (arg0.field3749 < 0 || this.field307[arg0.field3725][arg0.field3749] != arg0)) {
            if (var8.field5249 <= 0) {
                arg0.field3726 += 128;
            } else {
                arg0.field3726 += (int) (Math.pow(2.0D, (double) var8.field5249 * var10) * 128.0D + 0.5D);
            }
            while ((var8.field5250.length - 2) > arg0.field3742 && arg0.field3726 > (var8.field5250[arg0.field3742 + 2] & 0xFF << 8)) {
                arg0.field3742 += 2;
            }
            if ((var8.field5250.length - 2) == arg0.field3742) {
                var9 = true;
            }
        }
        if (!var9) {
            arg0.field3732.method1712(arg0.field3734, this.method183(arg0, arg4 + 79), this.method158(arg0, arg4 ^ 0xFFFFFFDE));
            return false;
        }
        arg0.field3732.method1726(arg0.field3734);
        if (arg3 == null) {
            arg0.field3732.method187(arg2);
        } else {
            arg0.field3732.method165(arg3, arg1, arg2);
        }
        if (arg0.field3732.method1720()) {
            this.field368.field2837.method248(arg0.field3732);
        }
        arg0.method1652((byte) -36);
        if (arg0.field3726 >= 0) {
            arg0.method2632(true);
            if (arg0.field3749 > 0 && this.field307[arg0.field3725][arg0.field3749] == arg0) {
                this.field307[arg0.field3725][arg0.field3749] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 1151)
    public static final void method181(int arg0, int arg1, String arg2, String arg3, int arg4, String arg5) {
        class237.method1536((String) null, arg2, arg3, true, -1, arg1, arg0, arg5);
        field347++;
        if (arg4 != 9231) {
            field337 = 61;
        }
    }

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "(II)V", line = 1166)
    private final void method182(int arg0, int arg1) {
        field300++;
        if (arg0 != 24249) {
            this.method180((class256) null, 77, -2, (int[]) null, 102);
        }
        int var3 = arg1 & 0xF0;
        if (var3 == 128) {
            int var4 = arg1 & 0xF;
            int var5 = (arg1 & 0x7FDE) >> 8;
            int var6 = (arg1 & 0x7FFC6E) >> 16;
            this.method172(var4, var6, arg0 + 1196129647, var5);
        } else if (var3 == 144) {
            int var7 = arg1 & 0xF;
            int var8 = (arg1 & 0x7FF4) >> 8;
            int var9 = arg1 >> 16 & 0x7F;
            if (var9 <= 0) {
                this.method172(var7, 64, 1196153896, var8);
            } else {
                this.method175(1964535494, var9, var7, var8);
            }
        } else if (var3 == 160) {
            int var10 = arg1 & 0xF;
            int var11 = arg1 >> 8 & 0x7F;
            int var12 = (arg1 & 0x7FE58F) >> 16;
            this.method170(var11, var10, var12, -23056);
        } else if (var3 == 176) {
            int var13 = arg1 & 0xF;
            int var14 = (arg1 & 0x7F77) >> 8;
            int var15 = arg1 >> 16 & 0x7F;
            if (var14 == 0) {
                this.field345[var13] = (var15 << 14) + class394.method2529(this.field345[var13], -2080769);
            }
            if (var14 == 32) {
                this.field345[var13] = (var15 << 7) + class394.method2529(this.field345[var13], -16257);
            }
            if (var14 == 1) {
                this.field336[var13] = (var15 << 7) + class394.method2529(this.field336[var13], -16257);
            }
            if (var14 == 33) {
                this.field336[var13] = class394.method2529(this.field336[var13], -128) + var15;
            }
            if (var14 == 5) {
                this.field357[var13] = class394.method2529(-16257, this.field357[var13]) + (var15 << 7);
            }
            if (var14 == 37) {
                this.field357[var13] = var15 + class394.method2529(this.field357[var13], -128);
            }
            if (var14 == 7) {
                this.field353[var13] = class394.method2529(-16257, this.field353[var13]) + (var15 << 7);
            }
            if (var14 == 39) {
                this.field353[var13] = class394.method2529(this.field353[var13], -128) + var15;
            }
            if (var14 == 10) {
                this.field340[var13] = (var15 << 7) + class394.method2529(-16257, this.field340[var13]);
            }
            if (var14 == 42) {
                this.field340[var13] = class394.method2529(this.field340[var13], -128) + var15;
            }
            if (var14 == 11) {
                this.field361[var13] = class394.method2529(this.field361[var13], -16257) + (var15 << 7);
            }
            if (var14 == 43) {
                this.field361[var13] = class394.method2529(-128, this.field361[var13]) + var15;
            }
            if (var14 == 64) {
                if (var15 < 64) {
                    this.field322[var13] = class394.method2529(this.field322[var13], -2);
                } else {
                    this.field322[var13] = class258.method1708(this.field322[var13], 1);
                }
            }
            if (var14 == 65) {
                if (var15 < 64) {
                    this.method144(var13, false);
                    this.field322[var13] = class394.method2529(this.field322[var13], -3);
                } else {
                    this.field322[var13] = class258.method1708(this.field322[var13], 2);
                }
            }
            if (var14 == 99) {
                this.field328[var13] = class394.method2529(127, this.field328[var13]) + (var15 << 7);
            }
            if (var14 == 98) {
                this.field328[var13] = class394.method2529(this.field328[var13], 16256) + var15;
            }
            if (var14 == 101) {
                this.field328[var13] = (var15 << 7) + class394.method2529(this.field328[var13], 127) + 16384;
            }
            if (var14 == 100) {
                this.field328[var13] = var15 + class394.method2529(16256, this.field328[var13]) + 16384;
            }
            if (var14 == 120) {
                this.method169(631539431, var13);
            }
            if (var14 == 121) {
                this.method185(-17, var13);
            }
            if (var14 == 123) {
                this.method163(var13, -128);
            }
            if (var14 == 6) {
                int var16 = this.field328[var13];
                if (var16 == 16384) {
                    this.field338[var13] = (var15 << 7) + class394.method2529(this.field338[var13], -16257);
                }
            }
            if (var14 == 38) {
                int var17 = this.field328[var13];
                if (var17 == 16384) {
                    this.field338[var13] = var15 + class394.method2529(this.field338[var13], -128);
                }
            }
            if (var14 == 16) {
                this.field339[var13] = (var15 << 7) + class394.method2529(this.field339[var13], -16257);
            }
            if (var14 == 48) {
                this.field339[var13] = class394.method2529(-128, this.field339[var13]) + var15;
            }
            if (var14 == 81) {
                if (var15 >= 64) {
                    this.field322[var13] = class258.method1708(this.field322[var13], 4);
                } else {
                    this.method178(var13, true);
                    this.field322[var13] = class394.method2529(this.field322[var13], -5);
                }
            }
            if (var14 == 17) {
                this.method173((byte) 33, var13, (var15 << 7) + (this.field334[var13] & 0xFFFFC07F));
            }
            if (var14 == 49) {
                this.method173((byte) 33, var13, (this.field334[var13] & 0xFFFFFF80) + var15);
            }
        } else if (var3 == 192) {
            int var18 = arg1 & 0xF;
            int var19 = arg1 >> 8 & 0x7F;
            this.method164(arg0 - 24249, var18, this.field345[var18] + var19);
        } else if (var3 == 208) {
            int var20 = arg1 & 0xF;
            int var21 = (arg1 & 0x7FCF) >> 8;
            this.method161(arg0 ^ 0x5E8C, var21, var20);
        } else if (var3 == 224) {
            int var22 = arg1 & 0xF;
            int var23 = (arg1 >> 8 & 0x7F) + (arg1 >> 9 & 0x3F80);
            this.method149(var22, arg0 - 23895, var23);
        } else {
            int var24 = arg1 & 0xFF;
            if (var24 == 255) {
                this.method184(-18, true);
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(Lko;I)I", line = 1404)
    private final int method183(class256 arg0, int arg1) {
        field341++;
        if (this.field297[arg0.field3725] == 0) {
            return 0;
        }
        class354 var3 = arg0.field3737;
        int var4 = this.field361[arg0.field3725] * this.field353[arg0.field3725] + 4096 >> 13;
        int var5 = var4 * var4 + 16384 >> 15;
        int var6 = arg0.field3729 * var5 + 16384 >> 15;
        int var7 = this.field302 * var6 + 128 >> 8;
        int var8 = this.field297[arg0.field3725] * var7 + 128 >> 8;
        if (var3.field5255 > 0) {
            var8 = (int) ((double) var8 * Math.pow(0.5D, (double) arg0.field3759 * 1.953125E-5D * (double) var3.field5255) + 0.5D);
        }
        if (var3.field5248 != null) {
            int var9 = arg0.field3750;
            int var10 = var3.field5248[arg0.field3757 + 1];
            if (arg0.field3757 < var3.field5248.length - 2) {
                int var11 = (var3.field5248[arg0.field3757] & 0xFF) << 8;
                int var12 = var3.field5248[arg0.field3757 + 2] & 0xFF << 8;
                var10 += (var9 - var11) * (var3.field5248[arg0.field3757 + 3] - var10) / (var12 - var11);
            }
            var8 = var8 * var10 + 32 >> 6;
        }
        if (arg0.field3726 > 0 && var3.field5250 != null) {
            int var13 = arg0.field3726;
            int var14 = var3.field5250[arg0.field3742 + 1];
            if (arg0.field3742 < (var3.field5250.length - 2)) {
                int var15 = (var3.field5250[arg0.field3742] & 0xFF) << 8;
                int var16 = (var3.field5250[arg0.field3742 + 2] & 0xFF) << 8;
                var14 += (var13 - var15) * (var3.field5250[arg0.field3742 + 3] - var14) / (var16 - var15);
            }
            var8 = var8 * var14 + 32 >> 6;
        }
        int var17 = -11 % ((-arg1 - 71) / 46);
        return var8;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(IZ)V", line = 1475)
    private final void method184(int arg0, boolean arg1) {
        if (arg1) {
            this.method169(arg0 ^ 0xDA5B7909, -1);
        } else {
            this.method163(-1, -126);
        }
        field304++;
        this.method185(arg0 + 1, -1);
        if (arg0 != -18) {
            return;
        }
        for (int var3 = 0; var3 < 16; var3++) {
            this.field312[var3] = this.field344[var3];
        }
        for (int var4 = 0; var4 < 16; var4++) {
            this.field345[var4] = class394.method2529(-128, this.field344[var4]);
        }
    }

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "(II)V", line = 1505)
    private final void method185(int arg0, int arg1) {
        field330++;
        if (arg1 < 0) {
            for (int var3 = 0; var3 < 16; var3++) {
                this.method185(-17, var3);
            }
            return;
        }
        this.field353[arg1] = 12800;
        this.field340[arg1] = 8192;
        this.field361[arg1] = 16383;
        this.field327[arg1] = 8192;
        this.field336[arg1] = 0;
        this.field357[arg1] = 8192;
        this.method144(arg1, false);
        this.method178(arg1, true);
        this.field322[arg1] = 0;
        this.field328[arg1] = 32767;
        this.field338[arg1] = 256;
        this.field339[arg1] = 0;
        if (arg0 != -17) {
            this.method173((byte) -49, 20, -80);
        }
        this.method173((byte) 33, arg1, 8192);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILeb;Lhg;ILir;)Z", line = 1544)
    public final synchronized boolean method186(int arg0, class386 arg1, class49 arg2, int arg3, class185 arg4) {
        arg2.method348();
        field319++;
        boolean var6 = true;
        int[] var7 = null;
        if (arg0 > 0) {
            var7 = new int[] { arg0 };
        }
        for (class68 var8 = (class68) arg2.field755.method2812(15710); var8 != null; var8 = (class68) arg2.field755.method2819((byte) 121)) {
            int var10 = (int) var8.field6091;
            class101 var11 = (class101) this.field299.method2826(false, (long) var10);
            if (var11 == null) {
                var11 = class247.method1614((byte) 34, arg4, var10);
                if (var11 == null) {
                    var6 = false;
                    continue;
                }
                this.field299.method2815(-1, (long) var10, var11);
            }
            if (!var11.method779(var8.field989, var7, arg1, true)) {
                var6 = false;
            }
        }
        int var9 = -101 % ((-arg3 - 13) / 60);
        if (var6) {
            arg2.method347();
        }
        return var6;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V", line = 1596)
    public final synchronized void method187(int arg0) {
        if (this.field325.method641()) {
            int var2 = this.field325.field1150 * this.field323 / class388.field5673;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field367;
                if (this.field366 - var3 >= 0L) {
                    this.field367 = var3;
                    break;
                }
                int var5 = (int) ((this.field366 + ((long) var2) - this.field367 - 1L) / (long) var2);
                this.field367 += (long) var2 * (long) var5;
                arg0 -= var5;
                this.field368.method187(var5);
                this.method168(-1);
            } while (this.field325.method641());
        }
        field331++;
        this.field368.method187(arg0);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIII)I", line = 1634)
    public static final int method188(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field360++;
        if (arg2 < 107) {
            field359 = null;
        }
        int var5 = 65536 - class240.field3365[arg1 * 8192 / arg4] >> 1;
        return ((65536 - var5) * arg3 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "()Lmq;", line = 1649)
    public final synchronized class417 method189() {
        field329++;
        return this.field368;
    }
}
