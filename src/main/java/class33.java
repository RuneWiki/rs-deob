import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class33 {

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field629 = 2;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Lr;")
    public static class264 field636 = null;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "[I")
    public static int[] field633 = new int[8];

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Loh;")
    public static class15 field628;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field635;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "[Lpc;")
    public static class87[] field638;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "[[[B")
    public static byte[][][] field632;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 30)
    public static final void method240(int arg0) {
        class243.method1761();
        field634++;
        class200.field3348 = new class188[7];
        class200.field3348[1] = new class304();
        class200.field3348[2] = new class221();
        if (arg0 == -25291) {
            class200.field3348[3] = new class69();
            class200.field3348[4] = new class77();
            class200.field3348[5] = new class227();
            class200.field3348[6] = new class153();
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V", line = 55)
    public static void method241(byte arg0) {
        field628 = null;
        field636 = null;
        field632 = (byte[][][]) null;
        field633 = null;
        field638 = null;
        if (arg0 > -69) {
            field632 = (byte[][][]) ((byte[][][]) null);
        }
        field635 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([[IB)V", line = 71)
    public static final void method242(int[][] arg0, byte arg1) {
        class81.field1297 = arg0;
        int var2 = 12 / ((80 - arg1) / 40);
        field630++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lvi;IIIIIIII)V", line = 90)
    public static final void method243(class5 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field637++;
        int var9 = arg3 & 0x3;
        int var10 = -80 % ((arg5 + 14) / 60);
        int var11;
        int var12;
        if (var9 == 1 || var9 == 3) {
            var12 = arg0.field62;
            var11 = arg0.field66;
        } else {
            var11 = arg0.field62;
            var12 = arg0.field66;
        }
        int var13;
        int var14;
        if (arg6 + var12 <= 104) {
            var13 = (var12 + 1 >> 1) + arg6;
            var14 = (var12 >> 1) + arg6;
        } else {
            var13 = arg6 + 1;
            var14 = arg6;
        }
        int var15;
        int var16;
        if (arg8 + var11 > 104) {
            var15 = arg8 + 1;
            var16 = arg8;
        } else {
            var15 = (var11 + 1 >> 1) + arg8;
            var16 = (var11 >> 1) + arg8;
        }
        int var17 = (arg8 << 7) + (var11 << 6);
        int var18 = (arg6 << 7) + (var12 << 6);
        int[][] var19 = class174.field2914[arg1];
        int var20 = 0;
        int var21 = var19[var14][var15] + var19[var14][var16] + var19[var13][var15] + var19[var13][var16] >> 2;
        if (arg1 != 0) {
            int[][] var22 = class174.field2914[0];
            var20 = var21 - (var22[var13][var16] + var22[var14][var16] + var22[var14][var15] + var22[var13][var15] >> 2);
        }
        int[][] var23 = (int[][]) null;
        if (arg1 < 3) {
            var23 = class174.field2914[arg1 + 1];
        }
        class50 var24 = arg0.method27(var21, false, var18, var19, arg4, true, var17, (byte) 92, var23, arg3, (class315) null);
        class48.method395(var24.field904, var18 - arg7, var20, var17 - arg2);
    }
}
