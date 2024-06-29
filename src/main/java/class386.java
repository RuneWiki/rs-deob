import java.awt.Canvas;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public abstract class class386 extends class388 {

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public int field5675;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
    public int field5697;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    public int field5690;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public int field5674;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public int field5676;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
    public int field5686;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
    public int field5683;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "[Lri;")
    public static class74[] field5678 = new class74[128];

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "F")
    public static float field5687 = 1024.0F;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "[[I")
    public static int[][] field5679 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5673 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "[I")
    public static int[] field5693 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "Lbg;")
    public static class324 field5692 = new class324(57, 15);

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "F")
    public static float field5695;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "Ljava/lang/String;")
    public static String field5680;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(B)Z")
    public final boolean method32(byte arg0) {
        field5688++;
        if (arg0 <= 104) {
            this.field5686 = 125;
        }
        return false;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIBIII)V")
    public static final void method2350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        if (arg2 == arg4 && arg5 == arg9 && arg0 == arg8 && arg3 == arg7) {
            class87.method769(arg1, false, arg7, arg9, arg0, arg4);
        } else {
            int var10 = arg4;
            int var11 = arg9;
            int var12 = arg4 * 3;
            int var13 = arg9 * 3;
            int var14 = arg2 * 3;
            int var15 = arg5 * 3;
            int var16 = arg8 * 3;
            int var17 = arg3 * 3;
            int var18 = arg0 + var14 - (var16 - -arg4);
            int var19 = var15 + arg7 - arg9 - var17;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg4;
                int var34 = (var28 + var32 + var30 >> 12) + arg9;
                class87.method769(arg1, false, var34, var11, var33, var10);
                var10 = var33;
                var11 = var34;
            }
        }
        field5689++;
        if (arg6 <= 40) {
            method2354(null, 123);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII)V")
    public static final void method2351(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class72.field992 <= (arg4 - arg3) && (arg3 + arg4) <= class126.field1842 && class471.field6963 <= arg0 - arg3 && (arg0 + arg3) <= class401.field5947) {
            class60.method542(arg4, arg3, arg0, (byte) 48, arg1);
        } else {
            class293.method1858(arg0, arg1, arg3, arg4, true);
        }
        if (arg2 == 26941) {
            field5685++;
        }
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V")
    public static void method2352(int arg0) {
        field5680 = null;
        if (arg0 != 6) {
            method2352(8);
        }
        field5693 = null;
        field5673 = null;
        field5678 = null;
        field5679 = null;
        field5692 = null;
    }

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)V")
    public static final void method2353(int arg0) {
        field5691++;
        if (arg0 != 128) {
            field5692 = null;
        }
        if (class64.field761 == -1) {
            return;
        }
        int var1 = class104.field1460.method1268((byte) 58);
        int var2 = class104.field1460.method1280(arg0 + 2917);
        class306 var3 = (class306) class188.field2670.method1018(109);
        if (var3 != null) {
            var1 = var3.method233(-89);
            var2 = var3.method236((byte) -66);
        }
        class226.method1533(0, 0, class94.field1278, class64.field761, 29474, 0, 0, class410.field6100, var2, var1);
        if (class502.field7456 != null) {
            class411.method2516(var1, var2, (byte) -120);
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(Z)I")
    public abstract int method228(boolean arg0);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IILfi;BZLya;I)V")
    public final void method25(int arg0, int arg1, class388 arg2, byte arg3, boolean arg4, class38 arg5, int arg6) {
        if (arg3 != -99) {
            this.field5697 = -97;
        }
        field5694++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/awt/Canvas;I)Lkd;")
    public static final class185 method2354(Canvas arg0, int arg1) {
        field5681++;
        try {
            Class var2 = Class.forName("hs");
            class185 var3 = (class185) var2.getDeclaredConstructor().newInstance();
            if (arg1 != 18248) {
                field5692 = null;
            }
            var3.method1299((byte) 66, arg0);
            return var3;
        } catch (Throwable var5) {
            class425 var4 = new class425();
            var4.method1299((byte) 66, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZII)V")
    public static final void method2355(boolean arg0, int arg1, int arg2) {
        field5682++;
        class215 var3 = class171.method1208(arg2, (byte) 116, 14);
        var3.method1465(-25852);
        var3.field3082 = arg1;
        if (arg0) {
            field5678 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V")
    public final void method29(int arg0) {
        int var2 = 79 % ((57 - arg0) / 44);
        field5677++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(IIIIIII)V")
    public class386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5675 = arg5;
        this.field5697 = arg0;
        this.field5690 = arg3;
        this.field5674 = arg4;
        this.field5676 = arg2;
        this.field5686 = arg1;
        this.field5683 = arg6;
    }
}
