import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class459 {

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "Z")
    public boolean field6782;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "B")
    public byte field6787;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "B")
    public byte field6784;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "S")
    public short field6783;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "S")
    public short field6790;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public int field6795;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "S")
    public short field6785;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public static int field6789 = 0;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "Llt;")
    public static class475 field6786 = new class475("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "[[I")
    public static int[][] field6794 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    public static int field6791 = 0;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "[I")
    public static int[] field6793 = new int[25];

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIII)V", line = 11)
    public static final void method2746(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 6) {
            field6789 = 20;
        }
        field6788++;
        int var6 = arg4 - arg0;
        int var7 = arg1 - arg3;
        if (var7 == 0) {
            if (var6 != 0) {
                class308.method1942(arg0, arg2, (byte) -102, arg3, arg4);
            }
        } else if (var6 == 0) {
            class208.method1402(arg2, arg1, arg0, arg3, (byte) 121);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg3;
                arg3 = arg0;
                int var10 = arg1;
                arg0 = var9;
                arg1 = arg4;
                arg4 = var10;
            }
            if (arg3 > arg1) {
                int var11 = arg3;
                int var12 = arg0;
                arg3 = arg1;
                arg0 = arg4;
                arg1 = var11;
                arg4 = var12;
            }
            int var13 = arg0;
            int var14 = arg1 - arg3;
            int var15 = arg4 - arg0;
            int var16 = -(var14 >> 1);
            int var17 = arg0 < arg4 ? 1 : -1;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (var8) {
                for (int var19 = arg3; var19 <= arg1; var19++) {
                    var16 += var15;
                    class339.field4800[var19][var13] = arg2;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var18 = arg3; var18 <= arg1; var18++) {
                    var16 += var15;
                    class339.field4800[var13][var18] = arg2;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)I", line = 131)
    public static final int method2747(int arg0, int arg1) {
        if (arg0 != 2) {
            field6791 = 76;
        }
        field6792++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIII)Lpl;", line = 142)
    public final class459 method2748(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 6) {
            this.field6784 = 100;
        }
        field6780++;
        return new class459(arg2, arg1, arg4, arg0, this.field6785, this.field6783, this.field6790, this.field6784, this.field6787, this.field6782);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)I", line = 154)
    public static final int method2749(int arg0) {
        field6781++;
        if (arg0 != 16) {
            field6794 = null;
        }
        return 16;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V", line = 169)
    public static void method2750(byte arg0) {
        field6794 = null;
        if (arg0 < -69) {
            field6786 = null;
            field6793 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(IIIIIIIIIZ)V", line = 196)
    public class459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field6782 = arg9;
        this.field6787 = (byte) arg8;
        this.field6784 = (byte) arg7;
        this.field6783 = (short) arg5;
        this.field6790 = (short) arg6;
        this.field6795 = arg0;
        this.field6785 = (short) arg4;
    }
}
