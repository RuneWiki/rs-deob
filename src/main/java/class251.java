import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class251 extends class42 {

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
    public int field3728;

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "I")
    public int field3731;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "[[I")
    public int[][] field3733;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "[I")
    public int[] field3730;

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "[Z")
    public boolean[] field3729;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "[I")
    public int[] field3734;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "Lqt;")
    public static class459 field3727 = new class459(17, 8);

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "Lqt;")
    public static class459 field3736 = new class459(45, 3);

    @OriginalMember(owner = "client!ll", name = "A", descriptor = "[[I")
    public static int[][] field3739 = new int[128][128];

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "[[I")
    public static int[][] field3737 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "I")
    public static int field3738 = 0;

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!ll", name = "B", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIII)V")
    public static final void method1626(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3735++;
        for (int var5 = arg2; var5 < class7.field52; var5++) {
            Rectangle var6 = class184.field2724[var5];
            if (arg0 < (var6.x + var6.width) && arg0 + arg1 > var6.x && arg4 < var6.y + var6.height && var6.y < (arg3 + arg4)) {
                class25.field361[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIBII)V")
    public static final void method1627(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        int var7 = -23 % ((11 - arg4) / 55);
        field3732++;
        if (class465.field6763 <= arg0 - arg1 && class176.field2630 >= arg0 + arg1 && arg2 - arg1 >= class424.field5996 && arg1 + arg2 <= class333.field4936) {
            class79.method602(arg0, arg6, arg1, arg5, (byte) -117, arg3, arg2);
        } else {
            class461.method2732(arg1, (byte) -5, arg2, arg6, arg0, arg3, arg5);
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(I[B)V")
    public class251(int arg0, byte[] arg1) {
        this.field3728 = arg0;
        class519 var3 = new class519(arg1);
        this.field3731 = var3.method3072((byte) -128);
        this.field3733 = new int[this.field3731][];
        this.field3730 = new int[this.field3731];
        this.field3729 = new boolean[this.field3731];
        this.field3734 = new int[this.field3731];
        for (int var4 = 0; var4 < this.field3731; var4++) {
            this.field3730[var4] = var3.method3072((byte) -119);
        }
        for (int var5 = 0; var5 < this.field3731; var5++) {
            this.field3729[var5] = var3.method3072((byte) -119) == 1;
        }
        for (int var6 = 0; var6 < this.field3731; var6++) {
            this.field3734[var6] = var3.method3018(566990904);
        }
        for (int var7 = 0; var7 < this.field3731; var7++) {
            this.field3733[var7] = new int[var3.method3072((byte) -128)];
        }
        for (int var8 = 0; var8 < this.field3731; var8++) {
            for (int var9 = 0; var9 < this.field3733[var8].length; var9++) {
                this.field3733[var8][var9] = var3.method3072((byte) -127);
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
    public static void method1628(int arg0) {
        if (arg0 != -31410) {
            method1627(-33, 57, 12, -49, (byte) -12, 73, -61);
        }
        field3727 = null;
        field3736 = null;
        field3739 = null;
        field3737 = null;
    }
}
