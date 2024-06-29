import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class15 extends class105 {

    @OriginalMember(owner = "client!o", name = "B", descriptor = "[I")
    private final int[] field122 = new int[this.field1871];

    @OriginalMember(owner = "client!o", name = "I", descriptor = "Lhi;")
    public static class82 field128 = class95.method664((byte) -45, "<col=40ff00>");

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "Lhi;")
    public static class82 field136 = class95.method664((byte) -105, "Choisir une option");

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    public static int field124 = 0;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    public static int field133 = -1;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "I")
    private int field119;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    private int field126;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "Lhi;")
    public static class82 field127;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "[B")
    private byte[] field137;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "[[[Lrk;")
    public static class16[][][] field120;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLsm;)V", line = 8)
    public static final void method82(boolean arg0, class120 arg1) {
        class8 var2 = null;
        try {
            class301 var3 = arg1.method829(113, "runescape");
            while (var3.field5121 == 0) {
                class290.method2001(1L, false);
            }
            if (var3.field5121 == 1) {
                var2 = (class8) var3.field5122;
                class153 var4 = class27.method170(1);
                var2.method52(0, 0, var4.field2611, var4.field2598);
            }
        } catch (Exception var8) {
        }
        if (!arg0) {
            method92((class331) null, 38);
        }
        field131++;
        try {
            if (var2 != null) {
                var2.method48(102);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIII)V", line = 46)
    public static final void method83(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field135++;
        if (arg1 <= arg2) {
            for (int var5 = arg1; var5 < arg2; var5++) {
                class73.field1117[var5][arg3] = arg0;
            }
        } else {
            for (int var6 = arg2; var6 < arg1; var6++) {
                class73.field1117[var6][arg3] = arg0;
            }
        }
        if (arg4 != 1) {
            field133 = 124;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V", line = 85)
    public static final void method84(boolean arg0) {
        class5.field43.method451(118);
        for (int var1 = 0; var1 < 32; var1++) {
            class149.field2532[var1] = 0L;
        }
        field139++;
        if (!arg0) {
            method92((class331) null, -94);
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class327.field5590[var2] = 0L;
        }
        class191.field3205 = 0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 116)
    public final void method85(int arg0) {
        if (arg0 == 4631) {
            field132++;
            this.field119 = 0;
            this.field126 = 0;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)V", line = 128)
    public void method86(int arg0, byte arg1) {
        this.field137[this.field119++] = (byte) ((class277.method1935(arg1, 255) >> 1) + 127);
        field125++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IBI)V", line = 143)
    public final void method87(int arg0, byte arg1, int arg2) {
        this.field126 += this.field122[arg0] * arg2 >> 12;
        field123++;
        if (arg1 != -109) {
            this.method86(33, (byte) 41);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I[I)[I", line = 156)
    public static final int[] method88(int arg0, int[] arg1) {
        if (arg0 >= -68) {
            field128 = (class82) null;
        }
        field130++;
        if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            class190.method1319(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V", line = 178)
    public final void method89(int arg0) {
        field141++;
        if (arg0 > -32) {
            return;
        }
        this.field126 = Math.abs(this.field126);
        if (this.field126 >= 4096) {
            this.field126 = 4095;
        }
        this.method86(this.field119++, (byte) (this.field126 >> 4));
        this.field126 = 0;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V", line = 194)
    public static void method90(int arg0) {
        field136 = null;
        field120 = (class16[][][]) null;
        if (arg0 != 24188) {
            field128 = (class82) null;
        }
        field128 = null;
        field127 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BIILwe;[[F[[I[[F[I[[FLqf;I)V", line = 221)
    public static final void method91(byte arg0, int arg1, int arg2, class173 arg3, float[][] arg4, int[][] arg5, float[][] arg6, int[] arg7, float[][] arg8, class300 arg9, int arg10) {
        field138++;
        int[] var11 = new int[arg7.length / 2];
        int var12 = 0;
        if (arg0 >= -43) {
            field128 = (class82) null;
        }
        while (var12 < var11.length) {
            int var13 = arg7[var12 + var12];
            int var14 = arg7[var12 - (-var12 - 1)];
            if (arg10 == 1) {
                int var15 = var13;
                var13 = var14;
                var14 = 128 - var15;
            } else if (arg10 == 2) {
                var14 = 128 - var14;
                var13 = 128 - var13;
            } else if (arg10 == 3) {
                int var16 = var13;
                var13 = 128 - var14;
                var14 = var16;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg8[arg1][arg2];
                var18 = arg4[arg1][arg2];
                var19 = arg6[arg1][arg2];
            } else if (var13 == 128 && var14 == 0) {
                var18 = arg4[arg1 + 1][arg2];
                var17 = arg8[arg1 + 1][arg2];
                var19 = arg6[arg1 + 1][arg2];
            } else if (var13 == 128 && var14 == 128) {
                var19 = arg6[arg1 + 1][arg2 + 1];
                var18 = arg4[arg1 + 1][arg2 + 1];
                var17 = arg8[arg1 + 1][arg2 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var17 = arg8[arg1][arg2 + 1];
                var19 = arg6[arg1][arg2 + 1];
                var18 = arg4[arg1][arg2 + 1];
            } else {
                float var20 = arg6[arg1][arg2];
                float var21 = arg4[arg1][arg2];
                float var22 = arg8[arg1][arg2];
                float var23 = (float) var13 / 128.0F;
                float var24 = (arg4[arg1 + 1][arg2] - var21) * var23 + var21;
                float var25 = (arg8[arg1 + 1][arg2] - var22) * var23 + var22;
                float var26 = (arg6[arg1 + 1][arg2] - var20) * var23 + var20;
                float var27 = (float) var14 / 128.0F;
                float var28 = arg8[arg1][arg2 + 1];
                float var29 = (arg8[arg1 + 1][arg2 + 1] - var28) * var23 + var28;
                var17 = (var29 - var25) * var27 + var25;
                float var30 = arg6[arg1][arg2 + 1];
                float var31 = (arg6[arg1 + 1][arg2 + 1] - var30) * var23 + var30;
                var19 = (var31 - var26) * var27 + var26;
                float var32 = arg4[arg1][arg2 + 1];
                float var33 = (arg4[arg1 + 1][arg2 + 1] - var32) * var23 + var32;
                var18 = (var33 - var24) * var27 + var24;
            }
            int var34 = (arg1 << 7) + var13;
            int var35 = (arg2 << 7) + var14;
            int var36 = class17.method97(var14, var13, arg2, true, arg1, arg5);
            var11[var12] = arg3.method1218(arg9, var34, var36, var35, var17, var18, var19);
            var12++;
        }
        arg3.method1219(var11);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lf;I)V", line = 350)
    public static final void method92(class331 arg0, int arg1) {
        field134++;
        class156.method1111(-16646, arg0, 200000);
        int var2 = 73 % ((arg1 - 10) / 38);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lum;ZBLum;I)Lpb;", line = 362)
    public static final class290 method93(class222 arg0, boolean arg1, byte arg2, class222 arg3, int arg4) {
        boolean var5 = true;
        field140++;
        int[] var6 = arg0.method1585(false, arg4);
        if (arg2 != 92) {
            return (class290) null;
        }
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg0.method1601(var6[var7], 0, arg4);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[0] & 0xFF << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg1) {
                    var10 = arg3.method1601(var9, 0, 0);
                } else {
                    var10 = arg3.method1601(0, 0, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class290(arg0, arg3, arg4, arg1);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IIIIIF)V", line = 413)
    public class15(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field1871; var7++) {
            this.field122[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }
}
