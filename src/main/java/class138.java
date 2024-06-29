import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class class138 extends class26 {

    @OriginalMember(owner = "client!mg", name = "wb", descriptor = "[[B")
    public byte[][] field2559 = new byte[256][];

    @OriginalMember(owner = "client!mg", name = "zb", descriptor = "[[B")
    public static byte[][] field2562 = new byte[250][];

    @OriginalMember(owner = "client!mg", name = "Cb", descriptor = "I")
    public static int field2565 = 50;

    @OriginalMember(owner = "client!mg", name = "Bb", descriptor = "Li;")
    private static class88 field2564 = class208.method1425(105, "green:");

    @OriginalMember(owner = "client!mg", name = "Jb", descriptor = "Li;")
    private static class88 field2572 = class208.method1425(105, "Loaded textures");

    @OriginalMember(owner = "client!mg", name = "Ib", descriptor = "Li;")
    public static class88 field2571 = field2572;

    @OriginalMember(owner = "client!mg", name = "Ab", descriptor = "Li;")
    public static class88 field2563 = field2564;

    @OriginalMember(owner = "client!mg", name = "Db", descriptor = "Li;")
    public static class88 field2566 = field2564;

    @OriginalMember(owner = "client!mg", name = "yb", descriptor = "Lsf;")
    public static class202 field2561 = new class202();

    @OriginalMember(owner = "client!mg", name = "xb", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!mg", name = "Eb", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!mg", name = "Fb", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!mg", name = "Hb", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!mg", name = "Kb", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!mg", name = "Gb", descriptor = "Z")
    public static boolean field2569;

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "([B)V")
    public class138(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(IIIIIII)V")
    public final void method160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2573++;
        int var8 = class72.field1333 * arg2 + arg1;
        int var9 = 0;
        int var10 = class72.field1333 - arg3;
        int var11 = 0;
        if (class72.field1334 > arg2) {
            int var12 = class72.field1334 - arg2;
            arg2 = class72.field1334;
            var11 += arg3 * var12;
            arg4 -= var12;
            var8 += class72.field1333 * var12;
        }
        if (class72.field1335 < arg2 + arg4) {
            arg4 -= arg4 + arg2 - class72.field1335;
        }
        if (arg1 < class72.field1332) {
            int var13 = class72.field1332 - arg1;
            arg1 = class72.field1332;
            var9 += var13;
            var10 += var13;
            var11 += var13;
            var8 += var13;
            arg3 -= var13;
        }
        if (class72.field1336 < arg1 + arg3) {
            int var14 = arg1 + arg3 - class72.field1336;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class95.method678(class72.field1331, arg3, (byte) 96, arg6, var11, var10, this.field2559[arg0], arg5, var8, arg4, var9);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIII)V")
    public final void method142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2567++;
        int var7 = class72.field1333 - arg3;
        int var8 = class72.field1333 * arg2 + arg1;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class72.field1334) {
            int var11 = class72.field1334 - arg2;
            var10 += arg3 * var11;
            arg4 -= var11;
            var8 += class72.field1333 * var11;
            arg2 = class72.field1334;
        }
        if (class72.field1335 < arg2 + arg4) {
            arg4 -= arg2 + arg4 - class72.field1335;
        }
        if (class72.field1332 > arg1) {
            int var12 = class72.field1332 - arg1;
            var8 += var12;
            var9 += var12;
            var10 += var12;
            arg3 -= var12;
            var7 += var12;
            arg1 = class72.field1332;
        }
        if (arg1 + arg3 > class72.field1336) {
            int var13 = arg1 + arg3 - class72.field1336;
            var7 += var13;
            arg3 -= var13;
            var9 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class79.method527(arg5, var9, var8, this.field2559[arg0], arg3, arg4, var7, class72.field1331, -1, var10);
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(Z)V")
    public static final void method920(boolean arg0) {
        class88.field1634 = -1;
        class114.field2063 = 0;
        class238.field4432 = -1;
        class146.field2749.field831 = 0;
        class192.field3702 = 0;
        class203.field3864 = 0;
        class247.field4514 = 0;
        class101.field1843 = -1;
        class230.field4314.field831 = 0;
        class228.field4272 = 0;
        field2570++;
        class46.field821 = -1;
        class116.field2104 = 0;
        class108.field1960 = false;
        for (int var1 = 0; var1 < class244.field4493.length; var1++) {
            if (class244.field4493[var1] != null) {
                class244.field4493[var1].field4116 = -1;
            }
        }
        for (int var2 = 0; var2 < class225.field4225.length; var2++) {
            if (class225.field4225[var2] != null) {
                class225.field4225[var2].field4116 = -1;
            }
        }
        class42.method276((byte) -47);
        class131.method883(30, 65536);
        for (int var3 = 0; var3 < 100; var3++) {
            class225.field4230[var3] = true;
        }
        if (!arg0) {
            field2572 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)V")
    public static void method921(int arg0) {
        field2572 = null;
        field2566 = null;
        field2561 = null;
        field2564 = null;
        field2563 = null;
        field2571 = null;
        if (arg0 != -1) {
            field2565 = -99;
        }
        field2562 = null;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)I")
    public static final int method922(int arg0, int arg1) {
        if (arg1 == -27988) {
            field2568++;
            return arg0 >>> 8;
        } else {
            return 78;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
    public class138(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field2559 = arg5;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([Li;B)[Li;")
    public static final class88[] method923(class88[] arg0, byte arg1) {
        class88[] var2 = new class88[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class166.method1142(new class88[] { class170.method1214(var3, 92), class170.field3308 }, -3);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class166.method1142(new class88[] { var2[var3], arg0[var3] }, -3);
            }
        }
        int var4 = 35 % ((arg1 + 49) / 52);
        field2560++;
        return var2;
    }
}
