import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public abstract class class42 extends class190 {

    @OriginalMember(owner = "client!ad", name = "Eb", descriptor = "[[B")
    public byte[][] field482 = new byte[256][];

    @OriginalMember(owner = "client!ad", name = "yb", descriptor = "Lqj;")
    public static class196 field476 = class80.method502(" zuerst von Ihrer Ignorieren)2Liste(Q", -48);

    @OriginalMember(owner = "client!ad", name = "Gb", descriptor = "I")
    public static int field484 = 0;

    @OriginalMember(owner = "client!ad", name = "Fb", descriptor = "Lqj;")
    public static class196 field483 = class80.method502("details)3dat", -48);

    @OriginalMember(owner = "client!ad", name = "Jb", descriptor = "[I")
    public static int[] field487 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!ad", name = "zb", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!ad", name = "Ab", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!ad", name = "Bb", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!ad", name = "Db", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!ad", name = "Hb", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!ad", name = "Ib", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!ad", name = "Cb", descriptor = "[[[I")
    public static int[][][] field480;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(III)V")
    public static final void method213(int arg0, int arg1, int arg2) {
        field486++;
        int[] var3 = new int[4];
        int[] var4 = new int[4];
        var4[0] = arg1;
        var3[0] = arg2;
        int var5 = 1;
        for (int var6 = arg0; var6 < 4; var6++) {
            if (field487[var6] != arg1) {
                var4[var5] = field487[var6];
                var3[var5] = class71.field1001[var6];
                var5++;
            }
        }
        class71.field1001 = var3;
        field487 = var4;
        class203.method1381(class64.field881.length - 1, class64.field881, -2, 0);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIII)V")
    public final void method214(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field485++;
        int var8 = class55.field688 * arg2 + arg1;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class55.field684) {
            int var11 = class55.field684 - arg2;
            var8 += class55.field688 * var11;
            var10 += arg3 * var11;
            arg4 -= var11;
            arg2 = class55.field684;
        }
        int var12 = class55.field688 - arg3;
        if (arg1 < class55.field682) {
            int var13 = class55.field682 - arg1;
            var8 += var13;
            arg3 -= var13;
            var12 += var13;
            arg1 = class55.field682;
            var10 += var13;
            var9 += var13;
        }
        if (arg2 + arg4 > class55.field685) {
            arg4 -= arg2 + arg4 - class55.field685;
        }
        if (class55.field687 < arg1 + arg3) {
            int var14 = arg1 + arg3 - class55.field687;
            var9 += var14;
            arg3 -= var14;
            var12 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class63.method395(arg3, arg5, arg6, arg4, class55.field683, var12, var8, var9, var10, (byte) -120, this.field482[arg0]);
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(IIIIII)V")
    public final void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field478++;
        int var7 = class55.field688 - arg3;
        int var8 = arg1 + class55.field688 * arg2;
        int var9 = 0;
        int var10 = 0;
        if (class55.field684 > arg2) {
            int var11 = class55.field684 - arg2;
            var8 += class55.field688 * var11;
            var10 += arg3 * var11;
            arg2 = class55.field684;
            arg4 -= var11;
        }
        if (arg1 < class55.field682) {
            int var12 = class55.field682 - arg1;
            arg1 = class55.field682;
            var7 += var12;
            arg3 -= var12;
            var9 += var12;
            var10 += var12;
            var8 += var12;
        }
        if (arg2 + arg4 > class55.field685) {
            arg4 -= arg2 + arg4 - class55.field685;
        }
        if (arg1 + arg3 > class55.field687) {
            int var13 = arg1 + arg3 - class55.field687;
            var7 += var13;
            var9 += var13;
            arg3 -= var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class9.method42(arg3, class55.field683, var7, arg5, this.field482[arg0], arg4, var8, var9, 115, var10);
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
    public class42(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field482 = arg5;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "([B)V")
    public class42(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B[B)V")
    public static final void method216(byte arg0, byte[] arg1) {
        field479++;
        class56 var2 = new class56(arg1);
        if (arg0 != 46) {
            return;
        }
        int var3 = var2.method318(true);
        for (int var4 = 0; var4 < var3; var4++) {
            class10 var5 = new class10();
            class196 var6 = var2.method326(true);
            var5.field124 = var2.method318(true);
            var5.field117 = var2.method318(true);
            var5.field112 = var2.method367(1);
            var5.field113 = var6.method1311((byte) 75, 32, 47);
            var5.field120 = var6.method1295(47, arg0 ^ 0x187E);
            class258.field4508.method1652(26532, var5);
        }
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
    public static void method217(int arg0) {
        field483 = null;
        if (arg0 != -6913) {
            method217(35);
        }
        field480 = null;
        field476 = null;
        field487 = null;
    }
}
