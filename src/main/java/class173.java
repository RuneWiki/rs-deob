import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class173 extends class178 {

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
    public int field2791 = 0;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "Z")
    private boolean field2792 = false;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    public int field2773 = 0;

    @OriginalMember(owner = "client!aa", name = "ib", descriptor = "B")
    public byte field2814 = 0;

    @OriginalMember(owner = "client!aa", name = "ob", descriptor = "I")
    public int field2820 = 0;

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "[I")
    public int[] field2788;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "[I")
    public int[] field2779;

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "[I")
    public int[] field2787;

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "[I")
    public int[] field2801;

    @OriginalMember(owner = "client!aa", name = "hb", descriptor = "[I")
    public int[] field2813;

    @OriginalMember(owner = "client!aa", name = "nb", descriptor = "[I")
    public int[] field2819;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "[I")
    public int[] field2796;

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "[B")
    public byte[] field2782;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "[B")
    public byte[] field2789;

    @OriginalMember(owner = "client!aa", name = "db", descriptor = "[B")
    public byte[] field2809;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "[S")
    public short[] field2793;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "[S")
    public short[] field2798;

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "[B")
    public byte[] field2780;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "[I")
    public int[] field2790;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "[B")
    public byte[] field2769;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "[S")
    public short[] field2802;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "[S")
    public short[] field2777;

    @OriginalMember(owner = "client!aa", name = "mb", descriptor = "[S")
    public short[] field2818;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "[S")
    private short[] field2775;

    @OriginalMember(owner = "client!aa", name = "kb", descriptor = "[S")
    private short[] field2816;

    @OriginalMember(owner = "client!aa", name = "cb", descriptor = "[S")
    private short[] field2808;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "[B")
    private byte[] field2795;

    @OriginalMember(owner = "client!aa", name = "lb", descriptor = "[B")
    private byte[] field2817;

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "[B")
    private byte[] field2804;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "[B")
    private byte[] field2770;

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "[B")
    private byte[] field2803;

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "I")
    public int field2784;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "[S")
    public short[] field2797;

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "[S")
    public short[] field2785;

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "[[I")
    public int[][] field2786;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "[[I")
    public int[][] field2776;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "[Loh;")
    public class281[] field2799;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "[Ltc;")
    public class183[] field2771;

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "[Loh;")
    public class281[] field2800;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "S")
    public short field2778;

    @OriginalMember(owner = "client!aa", name = "ab", descriptor = "S")
    public short field2806;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "[I")
    private static int[] field2774 = new int[10000];

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "[I")
    private static int[] field2794 = new int[10000];

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "[I")
    private static int[] field2772 = class47.field679;

    @OriginalMember(owner = "client!aa", name = "eb", descriptor = "[I")
    private static int[] field2810 = class47.field695;

    @OriginalMember(owner = "client!aa", name = "Z", descriptor = "I")
    private static int field2805 = 0;

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "S")
    private short field2781;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "S")
    private short field2783;

    @OriginalMember(owner = "client!aa", name = "bb", descriptor = "S")
    private short field2807;

    @OriginalMember(owner = "client!aa", name = "fb", descriptor = "S")
    private short field2811;

    @OriginalMember(owner = "client!aa", name = "gb", descriptor = "S")
    private short field2812;

    @OriginalMember(owner = "client!aa", name = "jb", descriptor = "S")
    private short field2815;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "()V")
    public final void method1278() {
        for (int var1 = 0; var1 < this.field2820; var1++) {
            this.field2788[var1] = -this.field2788[var1];
            this.field2787[var1] = -this.field2787[var1];
        }
        this.method1286();
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "()V")
    public final void method1279() {
        this.field2801 = null;
        this.field2790 = null;
        this.field2786 = null;
        this.field2776 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIBSB)I")
    public final int method1280(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field2813[this.field2791] = arg0;
        this.field2819[this.field2791] = arg1;
        this.field2796[this.field2791] = arg2;
        this.field2782[this.field2791] = arg3;
        this.field2780[this.field2791] = -1;
        this.field2793[this.field2791] = arg4;
        this.field2798[this.field2791] = -1;
        this.field2809[this.field2791] = arg5;
        return this.field2791++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Llc;II)Laa;")
    public static final class173 method1281(class86 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method643(arg2, arg1, false);
        return var3 == null ? null : new class173(var3);
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "()Laa;")
    public final class173 method1282() {
        class173 var1 = new class173();
        if (this.field2782 != null) {
            var1.field2782 = new byte[this.field2791];
            for (int var2 = 0; var2 < this.field2791; var2++) {
                var1.field2782[var2] = this.field2782[var2];
            }
        }
        var1.field2820 = this.field2820;
        var1.field2773 = this.field2773;
        var1.field2791 = this.field2791;
        var1.field2784 = this.field2784;
        var1.field2788 = this.field2788;
        var1.field2779 = this.field2779;
        var1.field2787 = this.field2787;
        var1.field2813 = this.field2813;
        var1.field2819 = this.field2819;
        var1.field2796 = this.field2796;
        var1.field2789 = this.field2789;
        var1.field2809 = this.field2809;
        var1.field2780 = this.field2780;
        var1.field2793 = this.field2793;
        var1.field2798 = this.field2798;
        var1.field2814 = this.field2814;
        var1.field2769 = this.field2769;
        var1.field2802 = this.field2802;
        var1.field2777 = this.field2777;
        var1.field2818 = this.field2818;
        var1.field2775 = this.field2775;
        var1.field2816 = this.field2816;
        var1.field2808 = this.field2808;
        var1.field2795 = this.field2795;
        var1.field2817 = this.field2817;
        var1.field2804 = this.field2804;
        var1.field2770 = this.field2770;
        var1.field2803 = this.field2803;
        var1.field2801 = this.field2801;
        var1.field2790 = this.field2790;
        var1.field2786 = this.field2786;
        var1.field2776 = this.field2776;
        var1.field2799 = this.field2799;
        var1.field2771 = this.field2771;
        var1.field2778 = this.field2778;
        var1.field2806 = this.field2806;
        return var1;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(SS)V")
    public final void method1283(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2791; var3++) {
            if (this.field2793[var3] == arg0) {
                this.field2793[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([B)V")
    private final void method1284(byte[] arg0) {
        class152 var2 = new class152(arg0);
        class152 var3 = new class152(arg0);
        class152 var4 = new class152(arg0);
        class152 var5 = new class152(arg0);
        class152 var6 = new class152(arg0);
        class152 var7 = new class152(arg0);
        class152 var8 = new class152(arg0);
        var2.field2511 = arg0.length - 23;
        int var9 = var2.method1126(false);
        int var10 = var2.method1126(false);
        int var11 = var2.method1111(255);
        int var12 = var2.method1111(255);
        boolean var13 = (var12 & 0x1) == 1;
        boolean var14 = (var12 & 0x2) == 2;
        int var15 = var2.method1111(255);
        int var16 = var2.method1111(255);
        int var17 = var2.method1111(255);
        int var18 = var2.method1111(255);
        int var19 = var2.method1111(255);
        int var20 = var2.method1126(false);
        int var21 = var2.method1126(false);
        int var22 = var2.method1126(false);
        int var23 = var2.method1126(false);
        int var24 = var2.method1126(false);
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2769 = new byte[var11];
            var2.field2511 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2769[var28] = var2.method1092((byte) -62);
                if (var29 == 0) {
                    var25++;
                }
                if (var29 >= 1 && var29 <= 3) {
                    var26++;
                }
                if (var29 == 2) {
                    var27++;
                }
            }
        }
        int var32 = var9 + var11;
        int var33 = var32;
        if (var13) {
            var32 += var10;
        }
        int var35 = var10 + var32;
        int var36 = var35;
        if (var15 == 255) {
            var35 += var10;
        }
        int var37 = var35;
        if (var17 == 1) {
            var35 += var10;
        }
        int var38 = var35;
        if (var19 == 1) {
            var35 += var9;
        }
        int var39 = var35;
        if (var16 == 1) {
            var35 += var10;
        }
        int var41 = var23 + var35;
        int var42 = var41;
        if (var18 == 1) {
            var41 += var10 * 2;
        }
        int var44 = var24 + var41;
        int var46 = var10 * 2 + var44;
        int var48 = var20 + var46;
        int var50 = var21 + var48;
        int var52 = var22 + var50;
        int var54 = var25 * 6 + var52;
        int var56 = var26 * 6 + var54;
        int var58 = var26 * 6 + var56;
        int var60 = var26 + var58;
        int var62 = var26 + var60;
        int var64 = var27 * 2 + var26 + var62;
        this.field2820 = var9;
        this.field2791 = var10;
        this.field2784 = var11;
        this.field2788 = new int[var9];
        this.field2779 = new int[var9];
        this.field2787 = new int[var9];
        this.field2813 = new int[var10];
        this.field2819 = new int[var10];
        this.field2796 = new int[var10];
        if (var19 == 1) {
            this.field2801 = new int[var9];
        }
        if (var13) {
            this.field2782 = new byte[var10];
        }
        if (var15 == 255) {
            this.field2789 = new byte[var10];
        } else {
            this.field2814 = (byte) var15;
        }
        if (var16 == 1) {
            this.field2809 = new byte[var10];
        }
        if (var17 == 1) {
            this.field2790 = new int[var10];
        }
        if (var18 == 1) {
            this.field2798 = new short[var10];
        }
        if (var18 == 1 && var11 > 0) {
            this.field2780 = new byte[var10];
        }
        this.field2793 = new short[var10];
        if (var11 > 0) {
            this.field2802 = new short[var11];
            this.field2777 = new short[var11];
            this.field2818 = new short[var11];
            if (var26 > 0) {
                this.field2775 = new short[var26];
                this.field2816 = new short[var26];
                this.field2808 = new short[var26];
                this.field2795 = new byte[var26];
                this.field2817 = new byte[var26];
                this.field2804 = new byte[var26];
            }
            if (var27 > 0) {
                this.field2770 = new byte[var27];
                this.field2803 = new byte[var27];
            }
        }
        var2.field2511 = var11;
        var3.field2511 = var46;
        var4.field2511 = var48;
        var5.field2511 = var50;
        var6.field2511 = var38;
        int var66 = 0;
        int var67 = 0;
        int var68 = 0;
        for (int var69 = 0; var69 < var9; var69++) {
            int var84 = var2.method1111(255);
            int var85 = 0;
            if ((var84 & 0x1) != 0) {
                var85 = var3.method1083(-64);
            }
            int var86 = 0;
            if ((var84 & 0x2) != 0) {
                var86 = var4.method1083(-64);
            }
            int var87 = 0;
            if ((var84 & 0x4) != 0) {
                var87 = var5.method1083(-64);
            }
            this.field2788[var69] = var66 + var85;
            this.field2779[var69] = var67 + var86;
            this.field2787[var69] = var68 + var87;
            var66 = this.field2788[var69];
            var67 = this.field2779[var69];
            var68 = this.field2787[var69];
            if (var19 == 1) {
                this.field2801[var69] = var6.method1111(255);
            }
        }
        var2.field2511 = var44;
        var3.field2511 = var33;
        var4.field2511 = var36;
        var5.field2511 = var39;
        var6.field2511 = var37;
        var7.field2511 = var42;
        var8.field2511 = var41;
        for (int var70 = 0; var70 < var10; var70++) {
            this.field2793[var70] = (short) var2.method1126(false);
            if (var13) {
                this.field2782[var70] = var3.method1092((byte) -62);
            }
            if (var15 == 255) {
                this.field2789[var70] = var4.method1092((byte) -62);
            }
            if (var16 == 1) {
                this.field2809[var70] = var5.method1092((byte) -62);
            }
            if (var17 == 1) {
                this.field2790[var70] = var6.method1111(255);
            }
            if (var18 == 1) {
                this.field2798[var70] = (short) (var7.method1126(false) - 1);
            }
            if (this.field2780 != null) {
                if (this.field2798[var70] == -1) {
                    this.field2780[var70] = -1;
                } else {
                    this.field2780[var70] = (byte) (var8.method1111(255) - 1);
                }
            }
        }
        this.field2773 = -1;
        var2.field2511 = var35;
        var3.field2511 = var32;
        int var71 = 0;
        int var72 = 0;
        int var73 = 0;
        int var74 = 0;
        for (int var75 = 0; var75 < var10; var75++) {
            int var80 = var3.method1111(255);
            if (var80 == 1) {
                var71 = var2.method1083(-64) + var74;
                var72 = var2.method1083(-64) + var71;
                var73 = var2.method1083(-64) + var72;
                var74 = var73;
                this.field2813[var75] = var71;
                this.field2819[var75] = var72;
                this.field2796[var75] = var73;
                if (var71 > this.field2773) {
                    this.field2773 = var71;
                }
                if (var72 > this.field2773) {
                    this.field2773 = var72;
                }
                if (var73 > this.field2773) {
                    this.field2773 = var73;
                }
            }
            if (var80 == 2) {
                var72 = var73;
                var73 = var2.method1083(-64) + var74;
                var74 = var73;
                this.field2813[var75] = var71;
                this.field2819[var75] = var72;
                this.field2796[var75] = var73;
                if (var73 > this.field2773) {
                    this.field2773 = var73;
                }
            }
            if (var80 == 3) {
                var71 = var73;
                var73 = var2.method1083(-64) + var74;
                var74 = var73;
                this.field2813[var75] = var71;
                this.field2819[var75] = var72;
                this.field2796[var75] = var73;
                if (var73 > this.field2773) {
                    this.field2773 = var73;
                }
            }
            if (var80 == 4) {
                int var83 = var71;
                var71 = var72;
                var72 = var83;
                var73 = var2.method1083(-64) + var74;
                var74 = var73;
                this.field2813[var75] = var71;
                this.field2819[var75] = var83;
                this.field2796[var75] = var73;
                if (var73 > this.field2773) {
                    this.field2773 = var73;
                }
            }
        }
        this.field2773++;
        var2.field2511 = var52;
        var3.field2511 = var54;
        var4.field2511 = var56;
        var5.field2511 = var58;
        var6.field2511 = var60;
        var7.field2511 = var62;
        for (int var76 = 0; var76 < var11; var76++) {
            int var79 = this.field2769[var76] & 0xFF;
            if (var79 == 0) {
                this.field2802[var76] = (short) var2.method1126(false);
                this.field2777[var76] = (short) var2.method1126(false);
                this.field2818[var76] = (short) var2.method1126(false);
            }
            if (var79 == 1) {
                this.field2802[var76] = (short) var3.method1126(false);
                this.field2777[var76] = (short) var3.method1126(false);
                this.field2818[var76] = (short) var3.method1126(false);
                this.field2775[var76] = (short) var4.method1126(false);
                this.field2816[var76] = (short) var4.method1126(false);
                this.field2808[var76] = (short) var4.method1126(false);
                this.field2795[var76] = var5.method1092((byte) -62);
                this.field2817[var76] = var6.method1092((byte) -62);
                this.field2804[var76] = var7.method1092((byte) -62);
            }
            if (var79 == 2) {
                this.field2802[var76] = (short) var3.method1126(false);
                this.field2777[var76] = (short) var3.method1126(false);
                this.field2818[var76] = (short) var3.method1126(false);
                this.field2775[var76] = (short) var4.method1126(false);
                this.field2816[var76] = (short) var4.method1126(false);
                this.field2808[var76] = (short) var4.method1126(false);
                this.field2795[var76] = var5.method1092((byte) -62);
                this.field2817[var76] = var6.method1092((byte) -62);
                this.field2804[var76] = var7.method1092((byte) -62);
                this.field2770[var76] = var7.method1092((byte) -62);
                this.field2803[var76] = var7.method1092((byte) -62);
            }
            if (var79 == 3) {
                this.field2802[var76] = (short) var3.method1126(false);
                this.field2777[var76] = (short) var3.method1126(false);
                this.field2818[var76] = (short) var3.method1126(false);
                this.field2775[var76] = (short) var4.method1126(false);
                this.field2816[var76] = (short) var4.method1126(false);
                this.field2808[var76] = (short) var4.method1126(false);
                this.field2795[var76] = var5.method1092((byte) -62);
                this.field2817[var76] = var6.method1092((byte) -62);
                this.field2804[var76] = var7.method1092((byte) -62);
            }
        }
        if (!var14) {
            return;
        }
        var2.field2511 = var64;
        int var77 = var2.method1111(255);
        if (var77 > 0) {
            var2.field2511 += var77 * 4;
        }
        int var78 = var2.method1111(255);
        if (var78 > 0) {
            var2.field2511 += var78 * 4;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(III)V")
    public final void method1285(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field2772[arg2];
            int var5 = field2810[arg2];
            for (int var6 = 0; var6 < this.field2820; var6++) {
                int var7 = this.field2788[var6] * var5 + this.field2779[var6] * var4 >> 16;
                this.field2779[var6] = this.field2779[var6] * var5 - this.field2788[var6] * var4 >> 16;
                this.field2788[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field2772[arg0];
            int var9 = field2810[arg0];
            for (int var10 = 0; var10 < this.field2820; var10++) {
                int var11 = this.field2779[var10] * var9 - this.field2787[var10] * var8 >> 16;
                this.field2787[var10] = this.field2787[var10] * var9 + this.field2779[var10] * var8 >> 16;
                this.field2779[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field2772[arg1];
        int var13 = field2810[arg1];
        for (int var14 = 0; var14 < this.field2820; var14++) {
            int var15 = this.field2788[var14] * var13 + this.field2787[var14] * var12 >> 16;
            this.field2787[var14] = this.field2787[var14] * var13 - this.field2788[var14] * var12 >> 16;
            this.field2788[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "()V")
    private final void method1286() {
        this.field2799 = null;
        this.field2800 = null;
        this.field2771 = null;
        this.field2792 = false;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)Lwg;")
    public final class178 method1287(int arg0, int arg1, int arg2) {
        return this.method1293(this.field2778, this.field2806, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "()V")
    private final void method1288() {
        if (this.field2792) {
            return;
        }
        this.field2792 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field2773; var7++) {
            int var8 = this.field2788[var7];
            int var9 = this.field2779[var7];
            int var10 = this.field2787[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field2781 = (short) var1;
        this.field2812 = (short) var4;
        this.field2815 = (short) var2;
        this.field2807 = (short) var5;
        this.field2783 = (short) var3;
        this.field2811 = (short) var6;
    }

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "()V")
    public final void method1289() {
        for (int var1 = 0; var1 < this.field2820; var1++) {
            int var2 = this.field2788[var1];
            this.field2788[var1] = this.field2787[var1];
            this.field2787[var1] = -var2;
        }
        this.method1286();
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V")
    public final void method1290(int arg0) {
        int var2 = field2772[arg0];
        int var3 = field2810[arg0];
        for (int var4 = 0; var4 < this.field2820; var4++) {
            int var5 = this.field2788[var4] * var3 + this.field2787[var4] * var2 >> 16;
            this.field2787[var4] = this.field2787[var4] * var3 - this.field2788[var4] * var2 >> 16;
            this.field2788[var4] = var5;
        }
        this.method1286();
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II[[I[[IIIIZZ)Laa;")
    public final class173 method1291(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1288();
        int var10 = this.field2781 + arg4;
        int var11 = this.field2812 + arg4;
        int var12 = this.field2783 + arg6;
        int var13 = this.field2811 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class173 var18;
        if (arg7) {
            var18 = new class173();
            var18.field2820 = this.field2820;
            var18.field2773 = this.field2773;
            var18.field2791 = this.field2791;
            var18.field2784 = this.field2784;
            var18.field2813 = this.field2813;
            var18.field2819 = this.field2819;
            var18.field2796 = this.field2796;
            var18.field2782 = this.field2782;
            var18.field2789 = this.field2789;
            var18.field2809 = this.field2809;
            var18.field2780 = this.field2780;
            var18.field2793 = this.field2793;
            var18.field2798 = this.field2798;
            var18.field2814 = this.field2814;
            var18.field2769 = this.field2769;
            var18.field2802 = this.field2802;
            var18.field2777 = this.field2777;
            var18.field2818 = this.field2818;
            var18.field2775 = this.field2775;
            var18.field2816 = this.field2816;
            var18.field2808 = this.field2808;
            var18.field2795 = this.field2795;
            var18.field2817 = this.field2817;
            var18.field2804 = this.field2804;
            var18.field2770 = this.field2770;
            var18.field2803 = this.field2803;
            var18.field2801 = this.field2801;
            var18.field2790 = this.field2790;
            var18.field2786 = this.field2786;
            var18.field2776 = this.field2776;
            var18.field2778 = this.field2778;
            var18.field2806 = this.field2806;
            var18.field2799 = this.field2799;
            var18.field2771 = this.field2771;
            var18.field2800 = this.field2800;
            if (arg0 == 3) {
                var18.field2788 = class25.method181(this.field2788, -1093);
                var18.field2779 = class25.method181(this.field2779, -1093);
                var18.field2787 = class25.method181(this.field2787, -1093);
            } else {
                var18.field2788 = this.field2788;
                var18.field2779 = new int[var18.field2820];
                var18.field2787 = this.field2787;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field2773; var19++) {
                int var30 = this.field2788[var19] + arg4;
                int var31 = this.field2787[var19] + arg6;
                int var32 = var30 & 0x7F;
                int var33 = var31 & 0x7F;
                int var34 = var30 >> 7;
                int var35 = var31 >> 7;
                int var36 = (128 - var32) * arg2[var34][var35] + arg2[var34 + 1][var35] * var32 >> 7;
                int var37 = (128 - var32) * arg2[var34][var35 + 1] + arg2[var34 + 1][var35 + 1] * var32 >> 7;
                int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                var18.field2779[var19] = this.field2779[var19] + var38 - arg5;
            }
            for (int var20 = var18.field2773; var20 < var18.field2820; var20++) {
                int var21 = this.field2788[var20] + arg4;
                int var22 = this.field2787[var20] + arg6;
                int var23 = var21 & 0x7F;
                int var24 = var22 & 0x7F;
                int var25 = var21 >> 7;
                int var26 = var22 >> 7;
                if (var25 >= 0 && var25 < arg2.length - 1 && var26 >= 0 && var26 < arg2[0].length - 1) {
                    int var27 = (128 - var23) * arg2[var25][var26] + arg2[var25 + 1][var26] * var23 >> 7;
                    int var28 = (128 - var23) * arg2[var25][var26 + 1] + arg2[var25 + 1][var26 + 1] * var23 >> 7;
                    int var29 = (128 - var24) * var27 + var24 * var28 >> 7;
                    var18.field2779[var20] = this.field2779[var20] + var29 - arg5;
                }
            }
        } else if (arg0 == 2) {
            for (int var39 = 0; var39 < var18.field2773; var39++) {
                int var51 = (this.field2779[var39] << 16) / this.field2815;
                if (var51 < arg1) {
                    int var52 = this.field2788[var39] + arg4;
                    int var53 = this.field2787[var39] + arg6;
                    int var54 = var52 & 0x7F;
                    int var55 = var53 & 0x7F;
                    int var56 = var52 >> 7;
                    int var57 = var53 >> 7;
                    int var58 = (128 - var54) * arg2[var56][var57] + arg2[var56 + 1][var57] * var54 >> 7;
                    int var59 = (128 - var54) * arg2[var56][var57 + 1] + arg2[var56 + 1][var57 + 1] * var54 >> 7;
                    int var60 = (128 - var55) * var58 + var55 * var59 >> 7;
                    var18.field2779[var39] = (arg1 - var51) * (var60 - arg5) / arg1 + this.field2779[var39];
                } else {
                    var18.field2779[var39] = this.field2779[var39];
                }
            }
            for (int var40 = var18.field2773; var40 < var18.field2820; var40++) {
                int var41 = (this.field2779[var40] << 16) / this.field2815;
                if (var41 < arg1) {
                    int var42 = this.field2788[var40] + arg4;
                    int var43 = this.field2787[var40] + arg6;
                    int var44 = var42 & 0x7F;
                    int var45 = var43 & 0x7F;
                    int var46 = var42 >> 7;
                    int var47 = var43 >> 7;
                    if (var46 >= 0 && var46 < arg2.length - 1 && var47 >= 0 && var47 < arg2[0].length - 1) {
                        int var48 = (128 - var44) * arg2[var46][var47] + arg2[var46 + 1][var47] * var44 >> 7;
                        int var49 = (128 - var44) * arg2[var46][var47 + 1] + arg2[var46 + 1][var47 + 1] * var44 >> 7;
                        int var50 = (128 - var45) * var48 + var45 * var49 >> 7;
                        var18.field2779[var40] = (arg1 - var41) * (var50 - arg5) / arg1 + this.field2779[var40];
                    }
                } else {
                    var18.field2779[var40] = this.field2779[var40];
                }
            }
        } else if (arg0 == 3) {
            int var61 = (arg1 & 0xFF) * 4;
            int var62 = (arg1 >> 8 & 0xFF) * 4;
            var18.method1310(arg2, arg4, arg5, arg6, var61, var62);
        } else if (arg0 == 4) {
            int var63 = this.field2807 - this.field2815;
            for (int var64 = 0; var64 < this.field2773; var64++) {
                int var75 = this.field2788[var64] + arg4;
                int var76 = this.field2787[var64] + arg6;
                int var77 = var75 & 0x7F;
                int var78 = var76 & 0x7F;
                int var79 = var75 >> 7;
                int var80 = var76 >> 7;
                int var81 = (128 - var77) * arg3[var79][var80] + arg3[var79 + 1][var80] * var77 >> 7;
                int var82 = (128 - var77) * arg3[var79][var80 + 1] + arg3[var79 + 1][var80 + 1] * var77 >> 7;
                int var83 = (128 - var78) * var81 + var78 * var82 >> 7;
                var18.field2779[var64] = var83 + this.field2779[var64] + var63 - arg5;
            }
            for (int var65 = var18.field2773; var65 < var18.field2820; var65++) {
                int var66 = this.field2788[var65] + arg4;
                int var67 = this.field2787[var65] + arg6;
                int var68 = var66 & 0x7F;
                int var69 = var67 & 0x7F;
                int var70 = var66 >> 7;
                int var71 = var67 >> 7;
                if (var70 >= 0 && var70 < arg3.length - 1 && var71 >= 0 && var71 < arg3[0].length - 1) {
                    int var72 = (128 - var68) * arg3[var70][var71] + arg3[var70 + 1][var71] * var68 >> 7;
                    int var73 = (128 - var68) * arg3[var70][var71 + 1] + arg3[var70 + 1][var71 + 1] * var68 >> 7;
                    int var74 = (128 - var69) * var72 + var69 * var73 >> 7;
                    var18.field2779[var65] = var74 + this.field2779[var65] + var63 - arg5;
                }
            }
        } else if (arg0 == 5) {
            int var84 = this.field2807 - this.field2815;
            for (int var85 = 0; var85 < this.field2773; var85++) {
                int var100 = this.field2788[var85] + arg4;
                int var101 = this.field2787[var85] + arg6;
                int var102 = var100 & 0x7F;
                int var103 = var101 & 0x7F;
                int var104 = var100 >> 7;
                int var105 = var101 >> 7;
                int var106 = (128 - var102) * arg2[var104][var105] + arg2[var104 + 1][var105] * var102 >> 7;
                int var107 = (128 - var102) * arg2[var104][var105 + 1] + arg2[var104 + 1][var105 + 1] * var102 >> 7;
                int var108 = (128 - var103) * var106 + var103 * var107 >> 7;
                int var109 = (128 - var102) * arg3[var104][var105] + arg3[var104 + 1][var105] * var102 >> 7;
                int var110 = (128 - var102) * arg3[var104][var105 + 1] + arg3[var104 + 1][var105 + 1] * var102 >> 7;
                int var111 = (128 - var103) * var109 + var103 * var110 >> 7;
                int var112 = var108 - var111;
                var18.field2779[var85] = ((this.field2779[var85] << 8) / var84 * var112 >> 8) - (arg5 - var108);
            }
            for (int var86 = var18.field2773; var86 < var18.field2820; var86++) {
                int var87 = this.field2788[var86] + arg4;
                int var88 = this.field2787[var86] + arg6;
                int var89 = var87 & 0x7F;
                int var90 = var88 & 0x7F;
                int var91 = var87 >> 7;
                int var92 = var88 >> 7;
                if (var91 >= 0 && var91 < arg2.length - 1 && var91 < arg3.length - 1 && var92 >= 0 && var92 < arg2[0].length - 1 && var92 < arg3[0].length - 1) {
                    int var93 = (128 - var89) * arg2[var91][var92] + arg2[var91 + 1][var92] * var89 >> 7;
                    int var94 = (128 - var89) * arg2[var91][var92 + 1] + arg2[var91 + 1][var92 + 1] * var89 >> 7;
                    int var95 = (128 - var90) * var93 + var90 * var94 >> 7;
                    int var96 = (128 - var89) * arg3[var91][var92] + arg3[var91 + 1][var92] * var89 >> 7;
                    int var97 = (128 - var89) * arg3[var91][var92 + 1] + arg3[var91 + 1][var92 + 1] * var89 >> 7;
                    int var98 = (128 - var90) * var96 + var90 * var97 >> 7;
                    int var99 = var95 - var98;
                    var18.field2779[var86] = ((this.field2779[var86] << 8) / var84 * var99 >> 8) - (arg5 - var95);
                }
            }
        }
        if (arg8) {
            var18.method1286();
        } else {
            this.field2792 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "()V")
    public static void method1292() {
        field2794 = null;
        field2774 = null;
        field2772 = null;
        field2810 = null;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(IIIII)Lpc;")
    public final class22 method1293(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class246(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIII)V")
    public final void method4(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()I")
    public final int method3() {
        if (!this.field2792) {
            this.method1288();
        }
        return this.field2815;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([[III)I")
    private static final int method1294(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(III)V")
    public final void method1295(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2820; var4++) {
            this.field2788[var4] += arg0;
            this.field2779[var4] += arg1;
            this.field2787[var4] += arg2;
        }
        this.method1286();
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(III)I")
    public final int method1296(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2820; var4++) {
            if (this.field2788[var4] == arg0 && this.field2779[var4] == arg1 && this.field2787[var4] == arg2) {
                return var4;
            }
        }
        this.field2788[this.field2820] = arg0;
        this.field2779[this.field2820] = arg1;
        this.field2787[this.field2820] = arg2;
        this.field2773 = ++this.field2820;
        return this.field2820 - 1;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "([B)V")
    private final void method1297(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class152 var4 = new class152(arg0);
        class152 var5 = new class152(arg0);
        class152 var6 = new class152(arg0);
        class152 var7 = new class152(arg0);
        class152 var8 = new class152(arg0);
        var4.field2511 = arg0.length - 18;
        int var9 = var4.method1126(false);
        int var10 = var4.method1126(false);
        int var11 = var4.method1111(255);
        int var12 = var4.method1111(255);
        int var13 = var4.method1111(255);
        int var14 = var4.method1111(255);
        int var15 = var4.method1111(255);
        int var16 = var4.method1111(255);
        int var17 = var4.method1126(false);
        int var18 = var4.method1126(false);
        int var19 = var4.method1126(false);
        int var20 = var4.method1126(false);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field2820 = var9;
        this.field2791 = var10;
        this.field2784 = var11;
        this.field2788 = new int[var9];
        this.field2779 = new int[var9];
        this.field2787 = new int[var9];
        this.field2813 = new int[var10];
        this.field2819 = new int[var10];
        this.field2796 = new int[var10];
        if (var11 > 0) {
            this.field2769 = new byte[var11];
            this.field2802 = new short[var11];
            this.field2777 = new short[var11];
            this.field2818 = new short[var11];
        }
        if (var16 == 1) {
            this.field2801 = new int[var9];
        }
        if (var12 == 1) {
            this.field2782 = new byte[var10];
            this.field2780 = new byte[var10];
            this.field2798 = new short[var10];
        }
        if (var13 == 255) {
            this.field2789 = new byte[var10];
        } else {
            this.field2814 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2809 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2790 = new int[var10];
        }
        this.field2793 = new short[var10];
        var4.field2511 = var21;
        var5.field2511 = var36;
        var6.field2511 = var38;
        var7.field2511 = var40;
        var8.field2511 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method1111(255);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method1083(-64);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method1083(-64);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method1083(-64);
            }
            this.field2788[var46] = var43 + var63;
            this.field2779[var46] = var44 + var64;
            this.field2787[var46] = var45 + var65;
            var43 = this.field2788[var46];
            var44 = this.field2779[var46];
            var45 = this.field2787[var46];
            if (var16 == 1) {
                this.field2801[var46] = var8.method1111(255);
            }
        }
        var4.field2511 = var32;
        var5.field2511 = var28;
        var6.field2511 = var26;
        var7.field2511 = var30;
        var8.field2511 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field2793[var47] = (short) var4.method1126(false);
            if (var12 == 1) {
                int var61 = var5.method1111(255);
                if ((var61 & 0x1) == 1) {
                    this.field2782[var47] = 1;
                    var2 = true;
                } else {
                    this.field2782[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field2780[var47] = (byte) (var61 >> 2);
                    this.field2798[var47] = this.field2793[var47];
                    this.field2793[var47] = 127;
                    if (this.field2798[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2780[var47] = -1;
                    this.field2798[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field2789[var47] = var6.method1092((byte) -62);
            }
            if (var14 == 1) {
                this.field2809[var47] = var7.method1092((byte) -62);
            }
            if (var15 == 1) {
                this.field2790[var47] = var8.method1111(255);
            }
        }
        this.field2773 = -1;
        var4.field2511 = var25;
        var5.field2511 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method1111(255);
            if (var57 == 1) {
                var48 = var4.method1083(-64) + var51;
                var49 = var4.method1083(-64) + var48;
                var50 = var4.method1083(-64) + var49;
                var51 = var50;
                this.field2813[var52] = var48;
                this.field2819[var52] = var49;
                this.field2796[var52] = var50;
                if (var48 > this.field2773) {
                    this.field2773 = var48;
                }
                if (var49 > this.field2773) {
                    this.field2773 = var49;
                }
                if (var50 > this.field2773) {
                    this.field2773 = var50;
                }
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method1083(-64) + var51;
                var51 = var50;
                this.field2813[var52] = var48;
                this.field2819[var52] = var49;
                this.field2796[var52] = var50;
                if (var50 > this.field2773) {
                    this.field2773 = var50;
                }
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method1083(-64) + var51;
                var51 = var50;
                this.field2813[var52] = var48;
                this.field2819[var52] = var49;
                this.field2796[var52] = var50;
                if (var50 > this.field2773) {
                    this.field2773 = var50;
                }
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method1083(-64) + var51;
                var51 = var50;
                this.field2813[var52] = var48;
                this.field2819[var52] = var60;
                this.field2796[var52] = var50;
                if (var50 > this.field2773) {
                    this.field2773 = var50;
                }
            }
        }
        this.field2773++;
        var4.field2511 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field2769[var53] = 0;
            this.field2802[var53] = (short) var4.method1126(false);
            this.field2777[var53] = (short) var4.method1126(false);
            this.field2818[var53] = (short) var4.method1126(false);
        }
        if (this.field2780 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field2780[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field2802[var56] & 0xFFFF) == this.field2813[var55] && (this.field2777[var56] & 0xFFFF) == this.field2819[var55] && (this.field2818[var56] & 0xFFFF) == this.field2796[var55]) {
                        this.field2780[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field2780 = null;
            }
        }
        if (!var3) {
            this.field2798 = null;
        }
        if (!var2) {
            this.field2782 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lwg;IIIZ)V")
    public final void method1298(class178 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class173 var6 = (class173) arg0;
        var6.method1288();
        var6.method1307();
        field2805++;
        int var7 = 0;
        int[] var8 = var6.field2788;
        int var9 = var6.field2773;
        for (int var10 = 0; var10 < this.field2773; var10++) {
            class281 var13 = this.field2799[var10];
            if (var13.field4473 != 0) {
                int var14 = this.field2779[var10] - arg2;
                if (var14 >= var6.field2815 && var14 <= var6.field2807) {
                    int var15 = this.field2788[var10] - arg1;
                    if (var15 >= var6.field2781 && var15 <= var6.field2812) {
                        int var16 = this.field2787[var10] - arg3;
                        if (var16 >= var6.field2783 && var16 <= var6.field2811) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class281 var18 = var6.field2799[var17];
                                if (var8[var17] == var15 && var6.field2787[var17] == var16 && var6.field2779[var17] == var14 && var18.field4473 != 0) {
                                    if (this.field2800 == null) {
                                        this.field2800 = new class281[this.field2773];
                                    }
                                    if (var6.field2800 == null) {
                                        var6.field2800 = new class281[var9];
                                    }
                                    class281 var19 = this.field2800[var10];
                                    if (var19 == null) {
                                        var19 = this.field2800[var10] = new class281(var13);
                                    }
                                    class281 var20 = var6.field2800[var17];
                                    if (var20 == null) {
                                        var20 = var6.field2800[var17] = new class281(var18);
                                    }
                                    var19.field4475 += var18.field4475;
                                    var19.field4481 += var18.field4481;
                                    var19.field4480 += var18.field4480;
                                    var19.field4473 += var18.field4473;
                                    var20.field4475 += var13.field4475;
                                    var20.field4481 += var13.field4481;
                                    var20.field4480 += var13.field4480;
                                    var20.field4473 += var13.field4473;
                                    var7++;
                                    field2794[var10] = field2805;
                                    field2774[var17] = field2805;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var11 = 0; var11 < this.field2791; var11++) {
            if (field2794[this.field2813[var11]] == field2805 && field2794[this.field2819[var11]] == field2805 && field2794[this.field2796[var11]] == field2805) {
                if (this.field2782 == null) {
                    this.field2782 = new byte[this.field2791];
                }
                this.field2782[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field2791; var12++) {
            if (field2774[var6.field2813[var12]] == field2805 && field2774[var6.field2819[var12]] == field2805 && field2774[var6.field2796[var12]] == field2805) {
                if (var6.field2782 == null) {
                    var6.field2782 = new byte[var6.field2791];
                }
                var6.field2782[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(IIIII)Ljc;")
    public final class246 method1299(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class246(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(III)V")
    public final void method1300(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2820; var4++) {
            this.field2788[var4] = this.field2788[var4] * arg0 / 128;
            this.field2779[var4] = this.field2779[var4] * arg1 / 128;
            this.field2787[var4] = this.field2787[var4] * arg2 / 128;
        }
        this.method1286();
    }

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "()V")
    public final void method1301() {
        for (int var1 = 0; var1 < this.field2820; var1++) {
            int var2 = this.field2787[var1];
            this.field2787[var1] = this.field2788[var1];
            this.field2788[var1] = -var2;
        }
        this.method1286();
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(SS)V")
    public final void method1302(short arg0, short arg1) {
        if (this.field2798 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2791; var3++) {
            if (this.field2798[var3] == arg0) {
                this.field2798[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
    private final void method1303(int arg0) {
        int var2 = field2772[arg0];
        int var3 = field2810[arg0];
        for (int var4 = 0; var4 < this.field2820; var4++) {
            int var5 = this.field2788[var4] * var3 + this.field2779[var4] * var2 >> 16;
            this.field2779[var4] = this.field2779[var4] * var3 - this.field2788[var4] * var2 >> 16;
            this.field2788[var4] = var5;
        }
        this.method1286();
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "()Z")
    public final boolean method1304() {
        return true;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Laa;IS)I")
    private final int method1305(class173 arg0, int arg1, short arg2) {
        int var4 = arg0.field2788[arg1];
        int var5 = arg0.field2779[arg1];
        int var6 = arg0.field2787[arg1];
        for (int var7 = 0; var7 < this.field2820; var7++) {
            if (this.field2788[var7] == var4 && this.field2779[var7] == var5 && this.field2787[var7] == var6) {
                this.field2797[var7] |= arg2;
                return var7;
            }
        }
        this.field2788[this.field2820] = var4;
        this.field2779[this.field2820] = var5;
        this.field2787[this.field2820] = var6;
        this.field2797[this.field2820] = arg2;
        if (arg0.field2801 != null) {
            this.field2801[this.field2820] = arg0.field2801[arg1];
        }
        return this.field2820++;
    }

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "()V")
    public final void method1306() {
        int var10002;
        if (this.field2801 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2820; var3++) {
                int var7 = this.field2801[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field2786 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field2786[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field2820) {
                int var6 = this.field2801[var5];
                this.field2786[var6][var1[var6]++] = var5++;
            }
            this.field2801 = null;
        }
        if (this.field2790 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2791; var10++) {
            int var14 = this.field2790[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field2776 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field2776[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field2791) {
            int var13 = this.field2790[var12];
            this.field2776[var13][var8[var13]++] = var12++;
        }
        this.field2790 = null;
    }

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "()V")
    public final void method1307() {
        if (this.field2799 != null) {
            return;
        }
        this.field2799 = new class281[this.field2773];
        for (int var1 = 0; var1 < this.field2773; var1++) {
            this.field2799[var1] = new class281();
        }
        for (int var2 = 0; var2 < this.field2791; var2++) {
            int var3 = this.field2813[var2];
            int var4 = this.field2819[var2];
            int var5 = this.field2796[var2];
            int var6 = this.field2788[var4] - this.field2788[var3];
            int var7 = this.field2779[var4] - this.field2779[var3];
            int var8 = this.field2787[var4] - this.field2787[var3];
            int var9 = this.field2788[var5] - this.field2788[var3];
            int var10 = this.field2779[var5] - this.field2779[var3];
            int var11 = this.field2787[var5] - this.field2787[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field2782 == null) {
                var19 = 0;
            } else {
                var19 = this.field2782[var2];
            }
            if (var19 == 0) {
                class281 var20 = this.field2799[var3];
                var20.field4475 += var16;
                var20.field4481 += var17;
                var20.field4480 += var18;
                var20.field4473++;
                class281 var21 = this.field2799[var4];
                var21.field4475 += var16;
                var21.field4481 += var17;
                var21.field4480 += var18;
                var21.field4473++;
                class281 var22 = this.field2799[var5];
                var22.field4475 += var16;
                var22.field4481 += var17;
                var22.field4480 += var18;
                var22.field4473++;
            } else if (var19 == 1) {
                if (this.field2771 == null) {
                    this.field2771 = new class183[this.field2791];
                }
                class183 var23 = this.field2771[var2] = new class183();
                var23.field2950 = var16;
                var23.field2946 = var17;
                var23.field2951 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIIIIJILbj;)V")
    public final void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class157 arg10) {
    }

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "()V")
    public final void method1308() {
        for (int var1 = 0; var1 < this.field2820; var1++) {
            this.field2787[var1] = -this.field2787[var1];
        }
        for (int var2 = 0; var2 < this.field2791; var2++) {
            int var3 = this.field2813[var2];
            this.field2813[var2] = this.field2796[var2];
            this.field2796[var2] = var3;
        }
        this.method1286();
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V")
    private final void method1309(int arg0) {
        int var2 = field2772[arg0];
        int var3 = field2810[arg0];
        for (int var4 = 0; var4 < this.field2820; var4++) {
            int var5 = this.field2779[var4] * var3 - this.field2787[var4] * var2 >> 16;
            this.field2787[var4] = this.field2787[var4] * var3 + this.field2779[var4] * var2 >> 16;
            this.field2779[var4] = var5;
        }
        this.method1286();
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([[IIIIII)V")
    private final void method1310(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1294(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1294(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1294(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1294(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1309(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1303(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1295(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    private class173() {
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "([B)V")
    private class173(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1284(arg0);
        } else {
            this.method1297(arg0);
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(III)V")
    public class173(int arg0, int arg1, int arg2) {
        this.field2788 = new int[arg0];
        this.field2779 = new int[arg0];
        this.field2787 = new int[arg0];
        this.field2801 = new int[arg0];
        this.field2813 = new int[arg1];
        this.field2819 = new int[arg1];
        this.field2796 = new int[arg1];
        this.field2782 = new byte[arg1];
        this.field2789 = new byte[arg1];
        this.field2809 = new byte[arg1];
        this.field2793 = new short[arg1];
        this.field2798 = new short[arg1];
        this.field2780 = new byte[arg1];
        this.field2790 = new int[arg1];
        if (arg2 > 0) {
            this.field2769 = new byte[arg2];
            this.field2802 = new short[arg2];
            this.field2777 = new short[arg2];
            this.field2818 = new short[arg2];
            this.field2775 = new short[arg2];
            this.field2816 = new short[arg2];
            this.field2808 = new short[arg2];
            this.field2795 = new byte[arg2];
            this.field2817 = new byte[arg2];
            this.field2804 = new byte[arg2];
            this.field2770 = new byte[arg2];
            this.field2803 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "([Laa;I)V")
    public class173(class173[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2820 = 0;
        this.field2791 = 0;
        this.field2784 = 0;
        boolean var9 = false;
        boolean var10 = false;
        this.field2814 = -1;
        for (int var11 = 0; var11 < arg1; var11++) {
            class173 var25 = arg0[var11];
            if (var25 != null) {
                this.field2820 += var25.field2820;
                this.field2791 += var25.field2791;
                this.field2784 += var25.field2784;
                if (var25.field2789 == null) {
                    if (this.field2814 == -1) {
                        this.field2814 = var25.field2814;
                    }
                    if (this.field2814 != var25.field2814) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var25.field2782 != null;
                var5 |= var25.field2809 != null;
                var6 |= var25.field2790 != null;
                var7 |= var25.field2798 != null;
                var8 |= var25.field2780 != null;
            }
        }
        this.field2788 = new int[this.field2820];
        this.field2779 = new int[this.field2820];
        this.field2787 = new int[this.field2820];
        this.field2801 = new int[this.field2820];
        this.field2797 = new short[this.field2820];
        this.field2813 = new int[this.field2791];
        this.field2819 = new int[this.field2791];
        this.field2796 = new int[this.field2791];
        if (var3) {
            this.field2782 = new byte[this.field2791];
        }
        if (var4) {
            this.field2789 = new byte[this.field2791];
        }
        if (var5) {
            this.field2809 = new byte[this.field2791];
        }
        if (var6) {
            this.field2790 = new int[this.field2791];
        }
        if (var7) {
            this.field2798 = new short[this.field2791];
        }
        if (var8) {
            this.field2780 = new byte[this.field2791];
        }
        this.field2793 = new short[this.field2791];
        this.field2785 = new short[this.field2791];
        if (this.field2784 > 0) {
            this.field2769 = new byte[this.field2784];
            this.field2802 = new short[this.field2784];
            this.field2777 = new short[this.field2784];
            this.field2818 = new short[this.field2784];
            this.field2775 = new short[this.field2784];
            this.field2816 = new short[this.field2784];
            this.field2808 = new short[this.field2784];
            this.field2795 = new byte[this.field2784];
            this.field2817 = new byte[this.field2784];
            this.field2804 = new byte[this.field2784];
            this.field2770 = new byte[this.field2784];
            this.field2803 = new byte[this.field2784];
        }
        this.field2820 = 0;
        this.field2791 = 0;
        this.field2784 = 0;
        boolean var12 = false;
        boolean var13 = false;
        for (int var14 = 0; var14 < arg1; var14++) {
            short var22 = (short) (0x1 << var14);
            class173 var23 = arg0[var14];
            if (var23 != null) {
                for (int var24 = 0; var24 < var23.field2791; var24++) {
                    if (var3 && var23.field2782 != null) {
                        this.field2782[this.field2791] = var23.field2782[var24];
                    }
                    if (var4) {
                        if (var23.field2789 == null) {
                            this.field2789[this.field2791] = var23.field2814;
                        } else {
                            this.field2789[this.field2791] = var23.field2789[var24];
                        }
                    }
                    if (var5 && var23.field2809 != null) {
                        this.field2809[this.field2791] = var23.field2809[var24];
                    }
                    if (var6 && var23.field2790 != null) {
                        this.field2790[this.field2791] = var23.field2790[var24];
                    }
                    if (var7) {
                        if (var23.field2798 == null) {
                            this.field2798[this.field2791] = -1;
                        } else {
                            this.field2798[this.field2791] = var23.field2798[var24];
                        }
                    }
                    this.field2793[this.field2791] = var23.field2793[var24];
                    this.field2785[this.field2791] = var22;
                    this.field2813[this.field2791] = this.method1305(var23, var23.field2813[var24], var22);
                    this.field2819[this.field2791] = this.method1305(var23, var23.field2819[var24], var22);
                    this.field2796[this.field2791] = this.method1305(var23, var23.field2796[var24], var22);
                    this.field2791++;
                }
            }
        }
        int var15 = 0;
        this.field2773 = this.field2820;
        for (int var16 = 0; var16 < arg1; var16++) {
            class173 var17 = arg0[var16];
            short var18 = (short) (0x1 << var16);
            if (var17 != null) {
                for (int var19 = 0; var19 < var17.field2791; var19++) {
                    if (var8) {
                        this.field2780[var15++] = (byte) (var17.field2780 == null || var17.field2780[var19] == -1 ? -1 : var17.field2780[var19] + this.field2784);
                    }
                }
                for (int var20 = 0; var20 < var17.field2784; var20++) {
                    byte var21 = this.field2769[this.field2784] = var17.field2769[var20];
                    if (var21 == 0) {
                        this.field2802[this.field2784] = (short) this.method1305(var17, var17.field2802[var20], var18);
                        this.field2777[this.field2784] = (short) this.method1305(var17, var17.field2777[var20], var18);
                        this.field2818[this.field2784] = (short) this.method1305(var17, var17.field2818[var20], var18);
                    }
                    if (var21 >= 1 && var21 <= 3) {
                        this.field2802[this.field2784] = var17.field2802[var20];
                        this.field2777[this.field2784] = var17.field2777[var20];
                        this.field2818[this.field2784] = var17.field2818[var20];
                        this.field2775[this.field2784] = var17.field2775[var20];
                        this.field2816[this.field2784] = var17.field2816[var20];
                        this.field2808[this.field2784] = var17.field2808[var20];
                        this.field2795[this.field2784] = var17.field2795[var20];
                        this.field2817[this.field2784] = var17.field2817[var20];
                        this.field2804[this.field2784] = var17.field2804[var20];
                    }
                    if (var21 == 2) {
                        this.field2770[this.field2784] = var17.field2770[var20];
                        this.field2803[this.field2784] = var17.field2803[var20];
                    }
                    this.field2784++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Laa;ZZZZ)V")
    public class173(class173 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2820 = arg0.field2820;
        this.field2773 = arg0.field2773;
        this.field2791 = arg0.field2791;
        this.field2784 = arg0.field2784;
        if (arg1) {
            this.field2788 = arg0.field2788;
            this.field2779 = arg0.field2779;
            this.field2787 = arg0.field2787;
        } else {
            this.field2788 = new int[this.field2820];
            this.field2779 = new int[this.field2820];
            this.field2787 = new int[this.field2820];
            for (int var6 = 0; var6 < this.field2820; var6++) {
                this.field2788[var6] = arg0.field2788[var6];
                this.field2779[var6] = arg0.field2779[var6];
                this.field2787[var6] = arg0.field2787[var6];
            }
        }
        if (arg2) {
            this.field2793 = arg0.field2793;
        } else {
            this.field2793 = new short[this.field2791];
            for (int var7 = 0; var7 < this.field2791; var7++) {
                this.field2793[var7] = arg0.field2793[var7];
            }
        }
        if (arg3 || arg0.field2798 == null) {
            this.field2798 = arg0.field2798;
        } else {
            this.field2798 = new short[this.field2791];
            for (int var8 = 0; var8 < this.field2791; var8++) {
                this.field2798[var8] = arg0.field2798[var8];
            }
        }
        if (arg4) {
            this.field2809 = arg0.field2809;
        } else {
            this.field2809 = new byte[this.field2791];
            if (arg0.field2809 == null) {
                for (int var9 = 0; var9 < this.field2791; var9++) {
                    this.field2809[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2791; var10++) {
                    this.field2809[var10] = arg0.field2809[var10];
                }
            }
        }
        this.field2813 = arg0.field2813;
        this.field2819 = arg0.field2819;
        this.field2796 = arg0.field2796;
        this.field2782 = arg0.field2782;
        this.field2789 = arg0.field2789;
        this.field2780 = arg0.field2780;
        this.field2814 = arg0.field2814;
        this.field2769 = arg0.field2769;
        this.field2802 = arg0.field2802;
        this.field2777 = arg0.field2777;
        this.field2818 = arg0.field2818;
        this.field2775 = arg0.field2775;
        this.field2816 = arg0.field2816;
        this.field2808 = arg0.field2808;
        this.field2795 = arg0.field2795;
        this.field2817 = arg0.field2817;
        this.field2804 = arg0.field2804;
        this.field2770 = arg0.field2770;
        this.field2803 = arg0.field2803;
        this.field2801 = arg0.field2801;
        this.field2790 = arg0.field2790;
        this.field2786 = arg0.field2786;
        this.field2776 = arg0.field2776;
        this.field2799 = arg0.field2799;
        this.field2771 = arg0.field2771;
        this.field2800 = arg0.field2800;
        this.field2778 = arg0.field2778;
        this.field2806 = arg0.field2806;
    }
}
