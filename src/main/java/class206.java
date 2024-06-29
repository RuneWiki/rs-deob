import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class206 extends class627 {

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "Lmq;")
    public static class78 field2648 = new class78(62, 12);

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "D")
    public static double field2649;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public int field2623;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public int field2624;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    public int field2627;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public int field2628;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
    public int field2629;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    public int field2631;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "I")
    public int field2633;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    public int field2634;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "I")
    public int field2637;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
    public int field2638;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
    public int field2640;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "I")
    public int field2641;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
    public int field2642;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public int field2644;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    public int field2645;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    public int field2646;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
    public int field2650;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "Lbea;")
    public class37 field2643;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "Lma;")
    public class639 field2632;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "Lod;")
    public class726 field2639;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "Lbf;")
    public class729 field2626;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public final void method1271(byte arg0) {
        this.field2626 = null;
        this.field2643 = null;
        field2647++;
        if (arg0 <= 26) {
            method1275(-92, -55, -70, 68, -89, -11, null, null, -63, null, null, -52, -30);
        }
        this.field2632 = null;
        this.field2639 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static final void method1272(int arg0) {
        class116.field1424 = false;
        field2636++;
        class522.field7389 = arg0;
        class215.field2726 = 0;
        class384.field5349 = new class600[500];
        class389.field5412 = class431.field6109;
        field2635 = 0;
        class359.field5120 = new class600[1000];
        class185.field2426 = new class600[2000];
        class470.field6755 = new class600[500];
        class113.field1392 = 0;
        class469.field6745 = class431.field6109;
        class468.field6737 = new int[class126.field1511][class90.field1142 + 1][class665.field9107 + 1];
        if (class618.field8660 instanceof class50) {
            class182.field2387 = false;
        } else {
            class182.field2387 = true;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
    public static void method1273(byte arg0) {
        if (arg0 <= 107) {
            field2635 = 44;
        }
        field2648 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII[BI)V")
    public static final void method1274(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field2625++;
        if (arg1 >= arg3) {
            return;
        }
        int var6 = arg3 - arg1 >> 2;
        int var7 = arg1 + arg5;
        while (true) {
            var6--;
            if (var6 < 0) {
                if (arg0 <= 35) {
                    method1274(-128, -49, 41, -55, null, 110);
                }
                int var8 = arg3 - arg1 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg4[var7++] = 1;
                }
            }
            arg4[var7++] = 1;
            arg4[var7++] = 1;
            arg4[var7++] = 1;
            arg4[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIII[F[FI[I[III)V")
    public static final void method1275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float[] arg7, int arg8, int[] arg9, int[] arg10, int arg11, int arg12) {
        field2630++;
        int var13 = arg1 * arg12 + arg5;
        if (arg8 != 16003) {
            method1274(62, 81, 32, -51, null, -86);
        }
        int var14 = arg4 * arg11 + arg0;
        int var15 = arg12 - arg3;
        int var16 = arg11 - arg3;
        if (arg9 == null) {
            for (int var17 = 0; var17 < arg2; var17++) {
                int var18 = arg3 + var13;
                while (var13 < var18) {
                    arg7[var14++] = arg6[var13++];
                }
                var13 += var15;
                var14 += var16;
            }
        } else if (arg6 == null) {
            for (int var19 = 0; var19 < arg2; var19++) {
                int var20 = var13 + arg3;
                while (var20 > var13) {
                    arg10[var14++] = arg9[var13++];
                }
                var13 += var15;
                var14 += var16;
            }
        } else {
            for (int var21 = 0; var21 < arg2; var21++) {
                int var22 = arg3 + var13;
                while (var22 > var13) {
                    arg10[var14] = arg9[var13];
                    arg7[var14++] = arg6[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        }
    }
}
