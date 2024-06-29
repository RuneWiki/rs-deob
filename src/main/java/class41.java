import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!w")
public abstract class class41 {

    @OriginalMember(owner = "mapview!w", name = "g", descriptor = "Z")
    public boolean field513;

    @OriginalMember(owner = "mapview!w", name = "k", descriptor = "Z")
    private boolean field517;

    @OriginalMember(owner = "mapview!w", name = "e", descriptor = "Lp;")
    public static class30 field511 = null;

    @OriginalMember(owner = "mapview!w", name = "o", descriptor = "I")
    public static volatile int field521 = -1;

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "I")
    public static int field509 = 500;

    @OriginalMember(owner = "mapview!w", name = "s", descriptor = "I")
    public static int field525 = 0;

    @OriginalMember(owner = "mapview!w", name = "q", descriptor = "I")
    private int field523;

    @OriginalMember(owner = "mapview!w", name = "r", descriptor = "I")
    public int field524;

    @OriginalMember(owner = "mapview!w", name = "i", descriptor = "Lka;")
    private class22 field515;

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "[I")
    private int[] field508;

    @OriginalMember(owner = "mapview!w", name = "f", descriptor = "[I")
    private int[] field512;

    @OriginalMember(owner = "mapview!w", name = "h", descriptor = "[I")
    private int[] field514;

    @OriginalMember(owner = "mapview!w", name = "l", descriptor = "[I")
    private int[] field518;

    @OriginalMember(owner = "mapview!w", name = "m", descriptor = "[I")
    public int[] field519;

    @OriginalMember(owner = "mapview!w", name = "n", descriptor = "[Lka;")
    private class22[] field520;

    @OriginalMember(owner = "mapview!w", name = "t", descriptor = "[Ld;")
    public static class7[] field526;

    @OriginalMember(owner = "mapview!w", name = "j", descriptor = "[Ljava/lang/Object;")
    public Object[] field516;

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "[[I")
    private int[][] field507;

    @OriginalMember(owner = "mapview!w", name = "p", descriptor = "[[I")
    private int[][] field522;

    @OriginalMember(owner = "mapview!w", name = "d", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field510;

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(IZI)[B", line = 11)
    public final byte[] method256(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method260(null, -39, 66, -42);
        }
        return this.method260(null, arg0, 95, arg2);
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(IBIZI)V", line = 30)
    public static final void method257(int arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        int var5 = arg2 >> 6;
        if (!arg3) {
            return;
        }
        int var6 = arg0 >> 6;
        if (class23.field215[arg4][var5][var6] == null) {
            class23.field215[arg4][var5][var6] = new byte[4096];
        }
        class23.field215[arg4][var5][var6][(class18.method90(63, arg2) << 6) + class18.method90(63, arg0)] = arg1;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(ILu;B)I", line = 46)
    public final int method258(int arg0, class38 arg1, byte arg2) {
        if (arg2 <= 19) {
            this.field524 = -100;
        }
        class38 var4 = arg1.method233((byte) 44);
        return this.field520[arg0].method100(126, var4.method245(0));
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(I)V", line = 58)
    public static void method259(int arg0) {
        if (arg0 != -12130) {
            method259(-39);
        }
        field526 = null;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "([IIII)[B", line = 87)
    private final byte[] method260(int[] arg0, int arg1, int arg2, int arg3) {
        int var5 = 94 / ((arg2 - 23) / 60);
        if (arg1 < 0 || this.field510.length <= arg1 || this.field510[arg1] == null || arg3 < 0 || this.field510[arg1].length <= arg3) {
            return null;
        }
        if (this.field510[arg1][arg3] == null) {
            boolean var6 = this.method262(arg1, arg0, (byte) -120);
            if (!var6) {
                this.method261(arg1, -2);
                boolean var7 = this.method262(arg1, arg0, (byte) 112);
                if (!var7) {
                    return null;
                }
            }
        }
        byte[] var8 = class13.method72(5, false, this.field510[arg1][arg3]);
        if (this.field517) {
            this.field510[arg1][arg3] = null;
        }
        return var8;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(II)V", line = 126)
    private final void method261(int arg0, int arg1) {
        if (arg1 != -2) {
            field521 = 56;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(I[IB)Z", line = 150)
    private final boolean method262(int arg0, int[] arg1, byte arg2) {
        if (this.field516[arg0] == null) {
            return false;
        }
        int var4 = this.field512[arg0];
        int[] var5 = this.field507[arg0];
        Object[] var6 = this.field510[arg0];
        boolean var7 = true;
        for (int var8 = 0; var8 < var4; var8++) {
            if (var6[var5[var8]] == null) {
                var7 = false;
                break;
            }
        }
        if (var7) {
            return true;
        }
        byte[] var9;
        if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
            var9 = class13.method72(5, false, this.field516[arg0]);
        } else {
            var9 = class13.method72(5, true, this.field516[arg0]);
            class33 var10 = new class33(var9);
            var10.method194(arg1, 5, var10.field429.length, true);
        }
        int var11 = -116 / ((-arg2 - 31) / 44);
        byte[] var12;
        try {
            var12 = class32.method181((byte) -105, var9);
        } catch (RuntimeException var29) {
            throw class40.method251(var29, "T3 - " + (arg1 != null) + "," + arg0 + "," + var9.length + "," + class23.method105(var9, false, var9.length) + "," + class23.method105(var9, false, var9.length - 2) + "," + this.field518[arg0] + "," + this.field523);
        }
        if (this.field513) {
            this.field516[arg0] = null;
        }
        if (var4 > 1) {
            int var14 = var12.length;
            int[] var15 = new int[var4];
            int var30 = var14 - 1;
            int var16 = var12[var30] & 0xFF;
            int var17 = var30 - var4 * var16 * 4;
            class33 var18 = new class33(var12);
            var18.field427 = var17;
            for (int var19 = 0; var19 < var16; var19++) {
                int var20 = 0;
                for (int var21 = 0; var21 < var4; var21++) {
                    var20 += var18.method190(4096);
                    var15[var21] += var20;
                }
            }
            byte[][] var22 = new byte[var4][];
            for (int var23 = 0; var23 < var4; var23++) {
                var22[var23] = new byte[var15[var23]];
                var15[var23] = 0;
            }
            var18.field427 = var17;
            int var24 = 0;
            for (int var25 = 0; var25 < var16; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var4; var27++) {
                    var26 += var18.method190(4096);
                    class21.method99(var12, var24, var22[var27], var15[var27], var26);
                    var24 += var26;
                    var15[var27] += var26;
                }
            }
            for (int var28 = 0; var28 < var4; var28++) {
                if (this.field517) {
                    var6[var5[var28]] = var22[var28];
                } else {
                    var6[var5[var28]] = class39.method247(-96, var22[var28], false);
                }
            }
        } else if (this.field517) {
            var6[var5[0]] = var12;
        } else {
            var6[var5[0]] = class39.method247(-38, var12, false);
        }
        return true;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Lu;I)I", line = 321)
    public final int method263(class38 arg0, int arg1) {
        if (arg1 > -67) {
            this.method261(-11, -79);
        }
        class38 var3 = arg0.method233((byte) 44);
        return this.field515.method100(126, var3.method245(0));
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(B[B)V", line = 336)
    public final void method264(byte arg0, byte[] arg1) {
        if (arg0 < 11) {
            this.field516 = null;
        }
        this.field523 = class23.method105(arg1, false, arg1.length);
        class33 var3 = new class33(class32.method181((byte) -104, arg1));
        int var4 = var3.method188((byte) 127);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
        }
        if (var4 >= 6) {
            var3.method190(4096);
        }
        int var5 = 0;
        int var6 = -1;
        int var7 = var3.method188((byte) -108);
        this.field524 = var3.method186(-253);
        this.field519 = new int[this.field524];
        for (int var8 = 0; var8 < this.field524; var8++) {
            this.field519[var8] = var5 += var3.method186(-253);
            if (var6 < this.field519[var8]) {
                var6 = this.field519[var8];
            }
        }
        this.field507 = new int[var6 + 1][];
        this.field514 = new int[var6 + 1];
        this.field510 = new Object[var6 + 1][];
        this.field516 = new Object[var6 + 1];
        this.field512 = new int[var6 + 1];
        this.field518 = new int[var6 + 1];
        if (var7 != 0) {
            this.field508 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field524; var9++) {
                this.field508[this.field519[var9]] = var3.method190(4096);
            }
            this.field515 = new class22(this.field508);
        }
        for (int var10 = 0; var10 < this.field524; var10++) {
            this.field518[this.field519[var10]] = var3.method190(4096);
        }
        for (int var11 = 0; var11 < this.field524; var11++) {
            this.field514[this.field519[var11]] = var3.method190(4096);
        }
        for (int var12 = 0; var12 < this.field524; var12++) {
            this.field512[this.field519[var12]] = var3.method186(-253);
        }
        for (int var13 = 0; var13 < this.field524; var13++) {
            int var14 = 0;
            int var15 = this.field519[var13];
            int var16 = this.field512[var15];
            this.field507[var15] = new int[var16];
            int var17 = -1;
            for (int var18 = 0; var18 < var16; var18++) {
                int var19 = this.field507[var15][var18] = var14 += var3.method186(-253);
                if (var17 < var19) {
                    var17 = var19;
                }
            }
            this.field510[var15] = new Object[var17 + 1];
        }
        if (var7 == 0) {
            return;
        }
        this.field522 = new int[var6 + 1][];
        this.field520 = new class22[var6 + 1];
        for (int var20 = 0; var20 < this.field524; var20++) {
            int var21 = this.field519[var20];
            int var22 = this.field512[var21];
            this.field522[var21] = new int[this.field510[var21].length];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field522[var21][this.field507[var21][var23]] = var3.method190(4096);
            }
            this.field520[var21] = new class22(this.field522[var21]);
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(BLu;Lu;)[B", line = 506)
    public final byte[] method265(byte arg0, class38 arg1, class38 arg2) {
        class38 var4 = arg1.method233((byte) 44);
        if (arg0 == 83) {
            class38 var5 = arg2.method233((byte) 44);
            int var6 = this.field515.method100(126, var4.method245(0));
            int var7 = this.field520[var6].method100(125, var5.method245(0));
            return this.method256(var6, true, var7);
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "<init>", descriptor = "(ZZ)V", line = 521)
    public class41(boolean arg0, boolean arg1) {
        this.field513 = arg0;
        this.field517 = arg1;
    }
}
