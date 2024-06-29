import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class498 extends class320 {

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public int field7355;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public int field7352;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "[I")
    public int[] field7354;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "[[I")
    public int[][] field7356;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "[Z")
    public boolean[] field7351;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "[I")
    public int[] field7350;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "Lno;")
    public static class494 field7357 = new class494("", 12);

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "[I")
    public static int[] field7360 = new int[14];

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public static int field7359 = 0;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "Liv;")
    public static class64 field7361 = new class64(48, 0);

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field7353;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public static int field7358;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZII)I")
    public static final int method2985(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            return -4;
        }
        int var4 = arg2 & 0x3;
        field7358++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 1023 - arg3;
        } else {
            return 1023 - arg0;
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
    public static void method2986(int arg0) {
        field7360 = null;
        field7357 = null;
        field7361 = null;
        if (arg0 != -2) {
            method2987(9, 79, -108, 109, -5, 58, 79, -95);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7353++;
        int var8 = 86 / ((arg2 - 62) / 57);
        int var9 = arg4 + arg7;
        int var10 = arg3 - arg4;
        for (int var11 = arg7; var11 < var9; var11++) {
            class179.method1269(class21.field430[var11], arg0, arg1, arg5, 26985);
        }
        int var12 = arg5 - arg4;
        int var13 = arg1 + arg4;
        for (int var14 = arg3; var14 > var10; var14--) {
            class179.method1269(class21.field430[var14], arg0, arg1, arg5, 26985);
        }
        for (int var15 = var9; var15 <= var10; var15++) {
            int[] var16 = class21.field430[var15];
            class179.method1269(var16, arg0, arg1, var13, 26985);
            class179.method1269(var16, arg6, var13, var12, 26985);
            class179.method1269(var16, arg0, var12, arg5, 26985);
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(I[B)V")
    public class498(int arg0, byte[] arg1) {
        this.field7355 = arg0;
        class145 var3 = new class145(arg1);
        this.field7352 = var3.method1063((byte) -99);
        this.field7354 = new int[this.field7352];
        this.field7356 = new int[this.field7352][];
        this.field7351 = new boolean[this.field7352];
        this.field7350 = new int[this.field7352];
        for (int var4 = 0; var4 < this.field7352; var4++) {
            this.field7350[var4] = var3.method1063((byte) 113);
        }
        for (int var5 = 0; var5 < this.field7352; var5++) {
            this.field7351[var5] = var3.method1063((byte) 103) == 1;
        }
        for (int var6 = 0; var6 < this.field7352; var6++) {
            this.field7354[var6] = var3.method1069((byte) -78);
        }
        for (int var7 = 0; var7 < this.field7352; var7++) {
            this.field7356[var7] = new int[var3.method1063((byte) -52)];
        }
        for (int var8 = 0; var8 < this.field7352; var8++) {
            for (int var9 = 0; var9 < this.field7356[var8].length; var9++) {
                this.field7356[var8][var9] = var3.method1063((byte) -63);
            }
        }
    }

    static {
        new class342(null, "geschickt werden.", null, null);
    }
}
