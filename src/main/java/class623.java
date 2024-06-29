import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class623 extends class642 {

    @OriginalMember(owner = "client!paa", name = "Q", descriptor = "[[I")
    public static int[][] field8719 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!paa", name = "T", descriptor = "[[Z")
    public static boolean[][] field8722 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!paa", name = "S", descriptor = "I")
    public static int field8721 = 0;

    @OriginalMember(owner = "client!paa", name = "R", descriptor = "I")
    public static int field8720;

    @OriginalMember(owner = "client!paa", name = "P", descriptor = "[I")
    public static int[] field8718;

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "(I)V")
    public static void method3524(int arg0) {
        field8719 = null;
        field8722 = null;
        if (arg0 == 1204) {
            field8718 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "(I)I")
    public static final int method3525(int arg0) {
        field8720++;
        class60 var1 = class21.field142;
        boolean var2 = false;
        if (class11.field68.field5503.method741((byte) 123) != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class144.method897(0, var3, 127, null, 0, null);
        }
        long var4 = class538.method2963(-47);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method355(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class538.method2963(-47) - var4);
        var1.method368(100, 100, 0, -16777216, (byte) -66, 0);
        if (var2) {
            var1.method342(-1);
        }
        if (arg0 != 12) {
            method3524(-59);
        }
        return var7;
    }
}
