import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class373 extends class69 {

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
    public int field5358;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
    public int field5365;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "[I")
    public int[] field5364;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "[[I")
    public int[][] field5361;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "[Z")
    public boolean[] field5363;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "[I")
    public int[] field5360;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "[[Z")
    public static boolean[][] field5366 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "Lgga;")
    public static class511 field5362;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIII)I")
    public static final int method2316(int arg0, int arg1, int arg2, int arg3) {
        field5359++;
        int var4 = 43 / ((arg3 + 18) / 60);
        if (class661.field9303 == null) {
            return 0;
        }
        int var5 = arg0 >> 9;
        int var6 = arg2 >> 9;
        if (var5 < 0 || var6 < 0 || class741.field10208 - 1 < var5 || var6 > class525.field7224 - 1) {
            return 0;
        }
        int var7 = arg1;
        if (arg1 < 3 && (class533.field7338[1][var5][var6] & 0x2) != 0) {
            var7 = arg1 + 1;
        }
        return class661.field9303[var7].method2529(arg2, arg0, (byte) -128);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIILkka;)V")
    public static final void method2317(int arg0, int arg1, int arg2, int arg3, class516 arg4) {
        class472 var5 = class646.method3699(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field3470 = (arg1 << class732.field10110) + class760.field10442;
        arg4.field3464 = arg3;
        arg4.field3460 = (arg2 << class732.field10110) + class760.field10442;
        var5.field6543 = arg4;
        int var6 = class661.field9303 == class594.field8355 ? 1 : 0;
        if (arg4.method77(25833)) {
            if (arg4.method80(116)) {
                arg4.field3455 = class689.field9618[var6];
                class689.field9618[var6] = arg4;
                return;
            }
            arg4.field3455 = class226.field3436[var6];
            class226.field3436[var6] = arg4;
            class282.field4043 = true;
            return;
        }
        arg4.field3455 = class289.field4265[var6];
        class289.field4265[var6] = arg4;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
    public static void method2318(int arg0) {
        field5366 = null;
        if (arg0 <= 121) {
            method2316(-19, 66, -56, -91);
        }
        field5362 = null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V")
    public static final void method2319(int arg0, int arg1, int arg2) {
        if (class20.field171 != 0) {
            if (arg0 >= 0) {
                class744.field10271[arg0] = arg1;
            } else {
                for (int var3 = 0; var3 < 16; var3++) {
                    class744.field10271[var3] = arg1;
                }
            }
        }
        field5367++;
        if (arg2 == 14351) {
            class493.field6796.method586(arg1, (byte) 96, arg0);
        }
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(I[B)V")
    public class373(int arg0, byte[] arg1) {
        this.field5358 = arg0;
        class511 var3 = new class511(arg1);
        this.field5365 = var3.method3013(-122);
        this.field5364 = new int[this.field5365];
        this.field5361 = new int[this.field5365][];
        this.field5363 = new boolean[this.field5365];
        this.field5360 = new int[this.field5365];
        for (int var4 = 0; var4 < this.field5365; var4++) {
            this.field5364[var4] = var3.method3013(-106);
            if (this.field5364[var4] == 6) {
                this.field5364[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field5365; var5++) {
            this.field5363[var5] = var3.method3013(-107) == 1;
        }
        for (int var6 = 0; var6 < this.field5365; var6++) {
            this.field5360[var6] = var3.method3002(-1);
        }
        for (int var7 = 0; var7 < this.field5365; var7++) {
            this.field5361[var7] = new int[var3.method3013(44)];
        }
        for (int var8 = 0; var8 < this.field5365; var8++) {
            for (int var9 = 0; var9 < this.field5361[var8].length; var9++) {
                this.field5361[var8][var9] = var3.method3013(-97);
            }
        }
    }
}
