import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class318 extends class183 {

    @OriginalMember(owner = "client!nd", name = "ib", descriptor = "I")
    private int field5374 = 0;

    @OriginalMember(owner = "client!nd", name = "eb", descriptor = "[S")
    private short[] field5370 = new short[257];

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "Ljf;")
    public static class229 field5361 = class212.method1457((byte) 75, "::tele ");

    @OriginalMember(owner = "client!nd", name = "bb", descriptor = "Ljf;")
    public static class229 field5367 = class212.method1457((byte) 69, "Vous ne pouvez pas ajouter votre nom -9 votre liste noire)3");

    @OriginalMember(owner = "client!nd", name = "cb", descriptor = "J")
    public static long field5368 = 0L;

    @OriginalMember(owner = "client!nd", name = "ob", descriptor = "Ljf;")
    public static class229 field5380 = class212.method1457((byte) 94, "Sprites geladen)3");

    @OriginalMember(owner = "client!nd", name = "hb", descriptor = "I")
    public static int field5373 = 0;

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!nd", name = "ab", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!nd", name = "fb", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!nd", name = "jb", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!nd", name = "kb", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!nd", name = "lb", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!nd", name = "nb", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!nd", name = "mb", descriptor = "Lek;")
    public static class185 field5378;

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "[I")
    private int[] field5362;

    @OriginalMember(owner = "client!nd", name = "Z", descriptor = "[I")
    private int[] field5365;

    @OriginalMember(owner = "client!nd", name = "gb", descriptor = "[Lwc;")
    public static class104[] field5372;

    @OriginalMember(owner = "client!nd", name = "db", descriptor = "[[I")
    private int[][] field5369;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(II)[I", line = 15)
    public final int[] method10(int arg0, int arg1) {
        if (arg1 != -1) {
            field5372 = (class104[]) null;
        }
        int[] var3 = this.field3161.method664(arg0, 0);
        field5363++;
        if (this.field3161.field1736) {
            int[] var4 = this.method1253(0, arg0, arg1 + 102);
            for (int var5 = 0; var5 < class22.field393; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field5370[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V", line = 57)
    private final void method2143(int arg0) {
        int[] var2 = this.field5369[1];
        int[] var3 = this.field5369[0];
        int[] var4 = this.field5369[this.field5369.length - 2];
        field5377++;
        if (arg0 != 28948) {
            this.method2149(126, 20);
        }
        int[] var5 = this.field5369[this.field5369.length - 1];
        this.field5362 = new int[] { var3[0] + var3[0] - var2[0], var3[1] - var2[1] - -var3[1] };
        this.field5365 = new int[] { var4[0] + var4[0] - var5[0], var4[1] + var4[1] + -var5[1] };
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V", line = 79)
    public class318() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V", line = 83)
    public final void method25(int arg0) {
        field5376++;
        if (this.field5369 == null) {
            this.field5369 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (this.field5369.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field5374 == 2) {
            this.method2143(28948);
        }
        if (arg0 != -8) {
            this.method2143(83);
        }
        class298.method2055((byte) 103);
        this.method2145(arg0 ^ 0xFFFFC434);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZIIII)V", line = 108)
    public static final void method2144(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            field5380 = (class229) null;
        }
        field5360++;
        class84.field1608.field195 = 0;
        class84.field1608.method140(237, (byte) 75);
        class84.field1608.method140(arg1, (byte) 75);
        class84.field1608.method140(arg4, (byte) 75);
        class84.field1608.method125(-25369, arg3);
        class84.field1608.method125(-25369, arg2);
        class169.field2893 = -3;
        class16.field242 = 0;
        class161.field2732 = 0;
        class252.field4409 = 1;
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V", line = 129)
    private final void method2145(int arg0) {
        if (arg0 != 15308) {
            this.field5374 = -112;
        }
        int var2 = this.field5374;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; var5 < (this.field5369.length - 1) && this.field5369[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field5369[var5 - 1];
                int[] var7 = this.field5369[var5];
                int var8 = this.method2149(var5 - 2, arg0 + 3935)[1];
                int var9 = var6[1];
                int var10 = var7[1];
                int var11 = this.method2149(var5 + 1, 19243)[1];
                int var12 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                int var13 = var12 * var12 >> 12;
                int var14 = var9 + var11 - var10 - var8;
                int var15 = var8 - var9 - var14;
                int var16 = var10 - var8;
                int var18 = (var12 * var14 >> 12) * var13 >> 12;
                int var19 = var13 * var15 >> 12;
                int var20 = var12 * var16 >> 12;
                int var21 = var19 + var9 + var18 + var20;
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field5370[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; var24 < this.field5369.length - 1 && var23 >= this.field5369[var24][0]; var24++) {
                }
                int[] var25 = this.field5369[var24];
                int[] var26 = this.field5369[var24 - 1];
                int var27 = (var23 - var26[0] << 12) / (var25[0] - var26[0]);
                int var28 = 4096 - class281.field4824[var27 >> 5 & 0xFF] >> 1;
                int var29 = 4096 - var28;
                int var30 = var25[1] * var28 + var26[1] * var29 >> 12;
                if (var30 <= -32768) {
                    var30 = -32767;
                }
                if (var30 >= 32768) {
                    var30 = 32767;
                }
                this.field5370[var22] = (short) var30;
            }
        } else {
            for (int var31 = 0; var31 < 257; var31++) {
                int var32 = var31 << 4;
                int var33;
                for (var33 = 1; (this.field5369.length - 1) > var33 && var32 >= this.field5369[var33][0]; var33++) {
                }
                int[] var34 = this.field5369[var33 - 1];
                int[] var35 = this.field5369[var33];
                int var36 = (var32 - var34[0] << 12) / (var35[0] - var34[0]);
                int var37 = 4096 - var36;
                int var38 = var34[1] * var37 + var35[1] * var36 >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field5370[var31] = (short) var38;
            }
        }
        field5366++;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(Z)V", line = 318)
    public static final void method2146(boolean arg0) {
        field5359++;
        class96 var1 = new class96();
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class149.field2576[var2][var3] = var1;
            }
        }
        if (!arg0) {
            field5361 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V", line = 347)
    public static void method2147(int arg0) {
        if (arg0 != -1) {
            method2146(true);
        }
        field5372 = null;
        field5378 = null;
        field5380 = null;
        field5367 = null;
        field5361 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIZI)V", line = 361)
    public static final void method2148(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg4) {
            method2146(true);
        }
        if (class142.field2458 >= arg2 && arg1 >= class56.field991) {
            boolean var6;
            if (arg0 < class149.field2578) {
                arg0 = class149.field2578;
                var6 = false;
            } else if (class327.field5490 < arg0) {
                arg0 = class327.field5490;
                var6 = false;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg5 < class149.field2578) {
                arg5 = class149.field2578;
                var7 = false;
            } else if (class327.field5490 >= arg5) {
                var7 = true;
            } else {
                arg5 = class327.field5490;
                var7 = false;
            }
            if (arg2 >= class56.field991) {
                class34.method306(arg0, class173.field3021[arg2++], (byte) 127, arg5, arg3);
            } else {
                arg2 = class56.field991;
            }
            if (arg1 > class142.field2458) {
                arg1 = class142.field2458;
            } else {
                class34.method306(arg0, class173.field3021[arg1--], (byte) 125, arg5, arg3);
            }
            if (var6 && var7) {
                for (int var8 = arg2; var8 <= arg1; var8++) {
                    int[] var9 = class173.field3021[var8];
                    var9[arg0] = var9[arg5] = arg3;
                }
            } else if (var6) {
                for (int var11 = arg2; var11 <= arg1; var11++) {
                    class173.field3021[var11][arg0] = arg3;
                }
            } else if (var7) {
                for (int var10 = arg2; var10 <= arg1; var10++) {
                    class173.field3021[var10][arg5] = arg3;
                }
            }
        }
        field5364++;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILkh;I)V", line = 482)
    public final void method14(int arg0, class14 arg1, int arg2) {
        if (arg2 == 0) {
            this.field5374 = arg1.method93(false);
            this.field5369 = new int[arg1.method93(false)][2];
            for (int var4 = 0; var4 < this.field5369.length; var4++) {
                this.field5369[var4][0] = arg1.method116(-1);
                this.field5369[var4][1] = arg1.method116(-1);
            }
        }
        field5375++;
        if (arg0 > -43) {
            field5361 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(II)[I", line = 508)
    private final int[] method2149(int arg0, int arg1) {
        field5379++;
        if (arg0 < 0) {
            return this.field5362;
        } else if (this.field5369.length > arg0) {
            if (arg1 != 19243) {
                this.field5374 = -47;
            }
            return this.field5369[arg0];
        } else {
            return this.field5365;
        }
    }
}
