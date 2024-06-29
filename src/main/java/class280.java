import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class280 extends class128 {

    @OriginalMember(owner = "client!ui", name = "W", descriptor = "I")
    private int field4354 = -1;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "F")
    public static float field4344 = 0.0F;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "[[I")
    public static int[][] field4348 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "J")
    public static long field4345 = 0L;

    @OriginalMember(owner = "client!ui", name = "T", descriptor = "[F")
    public static float[] field4351 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
    private int field4340;

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "I")
    private int field4350;

    @OriginalMember(owner = "client!ui", name = "U", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!ui", name = "V", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "[I")
    private int[] field4343;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "[S")
    public static short[] field4342;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lp;II)V", line = 7)
    public final void method107(class107 arg0, int arg1, int arg2) {
        if (arg2 > -85) {
            field4342 = (short[]) null;
        }
        field4349++;
        if (arg1 == 0) {
            this.field4354 = arg0.method624(14612);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)[[I", line = 26)
    public final int[][] method102(int arg0, int arg1) {
        field4347++;
        int[][] var3 = this.field1755.method875(89, arg0);
        if (this.field1755.field1815 && this.method2003(0)) {
            int var4 = this.field4340 * (class322.field4940 == this.field4350 ? arg0 : this.field4350 * arg0 / class322.field4940);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            if (class10.field141 == this.field4340) {
                for (int var8 = 0; var8 < class10.field141; var8++) {
                    int var9 = this.field4343[var4++];
                    var6[var8] = class229.method1613(4080, var9 << 4);
                    var7[var8] = class229.method1613(65280, var9) >> 4;
                    var5[var8] = class229.method1613(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; var10 < class10.field141; var10++) {
                    int var11 = this.field4340 * var10 / class10.field141;
                    int var12 = this.field4343[var4 + var11];
                    var6[var10] = class229.method1613(4080, var12 << 4);
                    var7[var10] = class229.method1613(65280, var12) >> 4;
                    var5[var10] = class229.method1613(4080, var12 >> 12);
                }
            }
        }
        if (arg1 != 5110) {
            this.method2003(-74);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZIII)V", line = 95)
    public static final void method2002(boolean arg0, int arg1, int arg2, int arg3) {
        field4341++;
        int var4 = class225.field3192 * arg2 >> 8;
        if (arg0 && var4 != 0 && arg1 != -1) {
            class32.method192(var4, (byte) -123, false, class320.field4914, arg1, 0);
            class253.field3838 = true;
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)I", line = 115)
    public final int method856(int arg0) {
        field4352++;
        if (arg0 <= 54) {
            field4342 = (short[]) null;
        }
        return this.field4354;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V", line = 137)
    public class280() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "(I)Z", line = 142)
    private final boolean method2003(int arg0) {
        field4353++;
        if (this.field4343 != null) {
            return true;
        } else if (this.field4354 < arg0) {
            return false;
        } else {
            int var2 = class10.field141;
            int var3 = class322.field4940;
            int var4 = class235.field3422.method519((byte) 56, this.field4354).field1261 ? 64 : 128;
            this.field4343 = class235.field3422.method520(0, var4, var4, 1.0F, false, this.field4354);
            this.field4340 = var4;
            this.field4350 = var4;
            class224.method1542((byte) -54, var3, var2);
            return this.field4343 != null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V", line = 183)
    public final void method852(int arg0) {
        field4346++;
        super.method852(arg0);
        this.field4343 = null;
        if (arg0 != -781218450) {
            this.method2003(70);
        }
    }

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "(I)V", line = 195)
    public static void method2004(int arg0) {
        field4351 = null;
        field4348 = (int[][]) null;
        field4342 = null;
        if (arg0 != 96) {
            method2002(false, -21, -1, 63);
        }
    }
}
