import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class class195 extends class107 {

    @OriginalMember(owner = "client!nf", name = "Hb", descriptor = "[[B")
    public byte[][] field3307 = new byte[256][];

    @OriginalMember(owner = "client!nf", name = "Gb", descriptor = "Lia;")
    public static class257 field3306 = class28.method234(-125, ":");

    @OriginalMember(owner = "client!nf", name = "Jb", descriptor = "I")
    public static volatile int field3309 = 0;

    @OriginalMember(owner = "client!nf", name = "Bb", descriptor = "Lia;")
    private static class257 field3301 = class28.method234(-90, "flash3:");

    @OriginalMember(owner = "client!nf", name = "Cb", descriptor = "Lia;")
    public static class257 field3302 = class28.method234(103, "");

    @OriginalMember(owner = "client!nf", name = "Ab", descriptor = "Lia;")
    public static class257 field3300 = field3301;

    @OriginalMember(owner = "client!nf", name = "Eb", descriptor = "Lia;")
    public static class257 field3304 = field3301;

    @OriginalMember(owner = "client!nf", name = "Db", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!nf", name = "Fb", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!nf", name = "Ib", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!nf", name = "Kb", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!nf", name = "Lb", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!nf", name = "Mb", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([B)V")
    public class195(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
    public static final void method1308(boolean arg0) {
        if (arg0) {
            class243.field4208 = class152.field2673;
            class75.field1463 = class244.field4235;
        } else {
            class243.field4208 = class159.field2793;
            class75.field1463 = class103.field1911;
        }
        class236.field4045 = class75.field1463.length;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BILad;IIII)V")
    public static final void method1309(byte arg0, int arg1, class241 arg2, int arg3, int arg4, int arg5, int arg6) {
        class55.method420(arg1, arg2.field4177, arg4, (byte) -35, arg6, arg2.field4143, arg3, arg5);
        int var7 = -110 % ((-arg0 - 36) / 47);
        field3305++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIII)V")
    public final void method767(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3308++;
        int var8 = class23.field451 * arg2 + arg1;
        int var9 = class23.field451 - arg3;
        int var10 = 0;
        if (class23.field449 > arg2) {
            int var11 = class23.field449 - arg2;
            var10 += arg3 * var11;
            arg2 = class23.field449;
            arg4 -= var11;
            var8 += class23.field451 * var11;
        }
        if (arg2 + arg4 > class23.field450) {
            arg4 -= arg2 + arg4 - class23.field450;
        }
        int var12 = 0;
        if (class23.field446 > arg1) {
            int var13 = class23.field446 - arg1;
            var8 += var13;
            arg3 -= var13;
            var9 += var13;
            arg1 = class23.field446;
            var10 += var13;
            var12 += var13;
        }
        if ((arg1 + arg3) > class23.field448) {
            int var14 = arg3 + arg1 - class23.field448;
            arg3 -= var14;
            var9 += var14;
            var12 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class165.method1127(arg4, class23.field445, this.field3307[arg0], var10, arg6, arg3, var9, var8, var12, true, arg5);
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(IIIIII)V")
    public final void method786(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3303++;
        int var7 = arg1 + (class23.field451 * arg2);
        int var8 = class23.field451 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class23.field449) {
            int var11 = class23.field449 - arg2;
            arg2 = class23.field449;
            arg4 -= var11;
            var7 += class23.field451 * var11;
            var9 += arg3 * var11;
        }
        if (arg2 + arg4 > class23.field450) {
            arg4 -= arg2 - (class23.field450 - arg4);
        }
        if (arg1 < class23.field446) {
            int var12 = class23.field446 - arg1;
            arg3 -= var12;
            var8 += var12;
            var10 += var12;
            var7 += var12;
            arg1 = class23.field446;
            var9 += var12;
        }
        if ((arg1 + arg3) > class23.field448) {
            int var13 = arg1 + arg3 - class23.field448;
            var8 += var13;
            arg3 -= var13;
            var10 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class152.method1076(-18681, var8, this.field3307[arg0], class23.field445, arg5, var7, arg3, var9, arg4, var10);
        }
    }

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "(I)V")
    public static final void method1310(int arg0) {
        field3312++;
        class231.field3875.method833(arg0);
    }

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "(I)V")
    public static void method1311(int arg0) {
        field3306 = null;
        field3302 = null;
        if (arg0 != -1) {
            method1309((byte) -37, -117, (class241) null, 105, 52, -33, -122);
        }
        field3304 = null;
        field3301 = null;
        field3300 = null;
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(B)[Lte;")
    public static final class184[] method1312(byte arg0) {
        field3310++;
        if (arg0 != 54) {
            method1308(false);
        }
        class184[] var1 = new class184[class135.field2421];
        for (int var2 = 0; var2 < class135.field2421; var2++) {
            byte[] var3 = class137.field2454[var2];
            int var4 = class72.field1411[var2] * class193.field3287[var2];
            if (class69.field1375[var2]) {
                int[] var7 = new int[var4];
                byte[] var8 = class55.field1184[var2];
                for (int var9 = 0; var9 < var4; var9++) {
                    var7[var9] = class198.method1332(class30.method252(-16777216, var8[var9] << 24), class3.field92[class30.method252(var3[var9], 255)]);
                }
                var1[var2] = new class66(class20.field427, class9.field184, class57.field1212[var2], class154.field2701[var2], class72.field1411[var2], class193.field3287[var2], var7);
            } else {
                int[] var5 = new int[var4];
                for (int var6 = 0; var6 < var4; var6++) {
                    var5[var6] = class3.field92[class30.method252(var3[var6], 255)];
                }
                var1[var2] = new class190(class20.field427, class9.field184, class57.field1212[var2], class154.field2701[var2], class72.field1411[var2], class193.field3287[var2], var5);
            }
        }
        class126.method875(false);
        return var1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIZI)I")
    public static final int method1313(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = arg1 & 0x3;
        if (arg2) {
            return -25;
        }
        field3311++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
    public class195(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3307 = arg5;
    }
}
