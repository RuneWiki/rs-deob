import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class367 extends class260 {

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    public int field5388;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public int field5384;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "[[I")
    public int[][] field5389;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "[I")
    public int[] field5392;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "[I")
    public int[] field5381;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "[Z")
    public boolean[] field5387;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field5379 = 0;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "[[I")
    public static int[][] field5382 = new int[128][128];

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
    public static int field5390 = 0;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "Ljava/awt/Frame;")
    public static Frame field5383;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V")
    public static void method2212(int arg0) {
        field5382 = null;
        if (arg0 > -38) {
            field5382 = null;
        }
        field5383 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method2213(int arg0, int arg1, Random arg2) {
        field5380++;
        if (arg0 != -837693600) {
            method2215(null, false, null, 68);
        }
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class226.method1402(arg1, (byte) -107)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class374.method2237(arg1, var4, 15124);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIZ)V")
    public static final void method2214(int arg0, int arg1, int arg2, boolean arg3) {
        field5385++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        int var4 = 8 / ((24 - arg1) / 58);
        class295.field4060 = arg3;
        class188.field2724 = arg0;
        class512.field7596 = arg2;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/String;ZLmg;I)Llk;")
    public static final class414 method2215(String arg0, boolean arg1, class101 arg2, int arg3) {
        field5391++;
        if (arg3 != 6018) {
            method2216(8, 6, 16, -2, -80, -113);
        }
        int var4 = arg2.method735(arg3 - 6016, arg0);
        if (var4 == -1) {
            return new class414(0);
        }
        int[] var5 = arg2.method754(var4, (byte) 82);
        class414 var6 = new class414(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field6045) {
                class391 var9 = new class391(arg2.method727(var5[var8++], var4, arg3 - 6109));
                int var10 = var9.method2361((byte) -56);
                int var11 = var9.method2353((byte) 114);
                int var12 = var9.method2348(-2);
                if (!arg1 && var12 == 1) {
                    var6.field6045--;
                } else {
                    var6.field6043[var7] = var10;
                    var6.field6038[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIII)V")
    public static final void method2216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5386++;
        if (arg3 <= class224.field3193 && arg1 >= class417.field6057) {
            boolean var6;
            if (class424.field6204 > arg2) {
                arg2 = class424.field6204;
                var6 = false;
            } else if (class76.field1021 < arg2) {
                arg2 = class76.field1021;
                var6 = false;
            } else {
                var6 = true;
            }
            boolean var7;
            if (class424.field6204 > arg4) {
                arg4 = class424.field6204;
                var7 = false;
            } else if (class76.field1021 < arg4) {
                arg4 = class76.field1021;
                var7 = false;
            } else {
                var7 = true;
            }
            if (arg3 < class417.field6057) {
                arg3 = class417.field6057;
            } else {
                class210.method1300(arg2, class437.field6400[arg3++], (byte) 96, arg4, arg0);
            }
            if (class224.field3193 < arg1) {
                arg1 = class224.field3193;
            } else {
                class210.method1300(arg2, class437.field6400[arg1--], (byte) 116, arg4, arg0);
            }
            if (var6 && var7) {
                for (int var8 = arg3; var8 <= arg1; var8++) {
                    int[] var9 = class437.field6400[var8];
                    var9[arg2] = var9[arg4] = arg0;
                }
            } else if (var6) {
                for (int var11 = arg3; var11 <= arg1; var11++) {
                    class437.field6400[var11][arg2] = arg0;
                }
            } else if (var7) {
                for (int var10 = arg3; var10 <= arg1; var10++) {
                    class437.field6400[var10][arg4] = arg0;
                }
            }
        }
        if (arg5 != 0) {
            method2215(null, false, null, -33);
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(I[B)V")
    public class367(int arg0, byte[] arg1) {
        this.field5388 = arg0;
        class391 var3 = new class391(arg1);
        this.field5384 = var3.method2348(-2);
        this.field5389 = new int[this.field5384][];
        this.field5392 = new int[this.field5384];
        this.field5381 = new int[this.field5384];
        this.field5387 = new boolean[this.field5384];
        for (int var4 = 0; var4 < this.field5384; var4++) {
            this.field5392[var4] = var3.method2348(-2);
        }
        for (int var5 = 0; var5 < this.field5384; var5++) {
            this.field5387[var5] = var3.method2348(-2) == 1;
        }
        for (int var6 = 0; var6 < this.field5384; var6++) {
            this.field5381[var6] = var3.method2353((byte) 72);
        }
        for (int var7 = 0; var7 < this.field5384; var7++) {
            this.field5389[var7] = new int[var3.method2348(-2)];
        }
        for (int var8 = 0; var8 < this.field5384; var8++) {
            for (int var9 = 0; var9 < this.field5389[var8].length; var9++) {
                this.field5389[var8][var9] = var3.method2348(-2);
            }
        }
    }
}
