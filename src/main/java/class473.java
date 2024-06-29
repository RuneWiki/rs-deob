import java.awt.Container;
import java.awt.Image;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class473 {

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Lvv;")
    private class531 field6850 = new class531();

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
    private int field6864;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    private int field6858;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Lew;")
    private class270 field6847;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "[I")
    public static int[] field6848 = new int[3];

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "[[B")
    public static byte[][] field6856 = new byte[250][];

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
    public static int field6857 = 1;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field6843;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field6846;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field6853;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
    public static int field6862;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Ljava/awt/Image;")
    public static Image field6842;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "[[I")
    public static int[][] field6844;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public final void method2764(int arg0) {
        if (arg0 != -769) {
            this.field6847 = null;
        }
        field6859++;
        this.field6850.method3149(65280);
        this.field6847.method1583(86);
        this.field6858 = this.field6864;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2765(int arg0) {
        field6860++;
        class395 var2 = (class395) this.field6847.method1582(-102);
        while (var2 != null) {
            Object var3 = var2.method289(20239);
            if (var3 != null) {
                return var3;
            }
            class395 var4 = var2;
            var2 = (class395) this.field6847.method1582(-114);
            var4.method2791((byte) 112);
            var4.method1645(-104);
            this.field6858 += var2.field5691;
        }
        return arg0 <= 91 ? null : null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)I")
    public final int method2766(boolean arg0) {
        field6845++;
        if (arg0) {
            field6856 = null;
        }
        return this.field6864;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method2767(long arg0, int arg1) {
        if (arg1 != 0) {
            this.method2765(104);
        }
        field6852++;
        class395 var4 = (class395) this.field6847.method1592((byte) -25, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method289(20239);
        if (var5 == null) {
            var4.method2791((byte) 112);
            var4.method1645(79);
            this.field6858 += var4.field5691;
            return null;
        }
        if (var4.method290(122)) {
            class42 var6 = new class42(var5, var4.field5691);
            this.field6847.method1586(var6, var4.field6883, arg1 ^ 0x1);
            this.field6850.method3150(16711680, var6);
            var6.field3883 = 0L;
            var4.method2791((byte) 112);
            var4.method1645(-115);
        } else {
            this.field6850.method3150(16711680, var4);
            var4.field3883 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2768(int arg0) {
        field6854++;
        class395 var2 = (class395) this.field6847.method1588(60);
        if (arg0 != 2) {
            this.method2767(-106L, 81);
        }
        while (var2 != null) {
            Object var3 = var2.method289(20239);
            if (var3 != null) {
                return var3;
            }
            class395 var4 = var2;
            var2 = (class395) this.field6847.method1582(arg0 ^ 0xFFFFFF83);
            var4.method2791((byte) 112);
            var4.method1645(-118);
            this.field6858 += var2.field5691;
        }
        return null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Z")
    public static final boolean method2769(int arg0, int arg1) {
        field6863++;
        if (arg0 != 2) {
            field6856 = null;
        }
        return arg1 == 3 || arg1 == 7 || arg1 == 10;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lpo;B)V")
    private final void method2770(class395 arg0, byte arg1) {
        if (arg1 != 78) {
            method2772(11, (byte) 77, -91, false, 53, 123);
        }
        field6846++;
        if (arg0 != null) {
            arg0.method2791((byte) 112);
            arg0.method1645(-114);
            this.field6858 += arg0.field5691;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(JI)V")
    private final void method2771(long arg0, int arg1) {
        field6849++;
        if (arg1 != 2) {
            this.method2774((byte) -79);
        }
        class395 var4 = (class395) this.field6847.method1592((byte) -25, arg0);
        this.method2770(var4, (byte) 78);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBIZII)V")
    public static final void method2772(int arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field6861++;
        if (arg1 != -52) {
            method2776((byte) -125);
        }
        if (class26.field358 != null && (arg5 != 3 || class76.field1075.field3653 != arg2 || class76.field1075.field3650 != arg4)) {
            class196.method1290(-14477, class26.field358, class346.field4985);
            class26.field358 = null;
        }
        if (arg5 == 3 && class26.field358 == null) {
            class26.field358 = class2.method17(arg2, arg4, 0, class346.field4985, 0, (byte) -125);
            if (class26.field358 != null) {
                class76.field1075.field3650 = arg4;
                class76.field1075.field3653 = arg2;
                class76.field1075.method1098(-9, class346.field4985);
            }
        }
        if (arg5 == 3 && class26.field358 == null) {
            method2772(arg0, (byte) -52, -1, true, -1, class76.field1075.field3676);
            return;
        }
        Container var6;
        if (class26.field358 != null) {
            class389.field5618 = arg4;
            class233.field3246 = arg2;
            var6 = class26.field358;
        } else if (class391.field5642 == null) {
            var6 = class346.field4985.field2623;
            class233.field3246 = var6.getSize().width;
            class389.field5618 = var6.getSize().height;
        } else {
            Insets var7 = class391.field5642.getInsets();
            class233.field3246 = class391.field5642.getSize().width - var7.right - var7.left;
            int var10001 = -var7.top;
            class389.field5618 = class391.field5642.getSize().height + var10001 - var7.bottom;
            var6 = class391.field5642;
        }
        if (arg5 == 1) {
            class348.field5033 = class3.field38;
            class66.field953 = class109.field1768;
            class122.field1894 = (class233.field3246 - class109.field1768) / 2;
            class74.field1046 = 0;
        } else if (class20.field294 < 96 && class195.field2849 == 0) {
            int var8 = class233.field3246 > 1024 ? 1024 : class233.field3246;
            class122.field1894 = (class233.field3246 - var8) / 2;
            int var9 = class389.field5618 <= 768 ? class389.field5618 : 768;
            class66.field953 = var8;
            class74.field1046 = 0;
            class348.field5033 = var9;
        } else {
            class66.field953 = class233.field3246;
            class122.field1894 = 0;
            class74.field1046 = 0;
            class348.field5033 = class389.field5618;
        }
        if (class81.field1144 != class523.field7659) {
            boolean var10000;
            if (class66.field953 < 1024 && class348.field5033 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg3) {
            class466.method2711(3);
        } else {
            class415.field6025.setSize(class66.field953, class348.field5033);
            class275.field3737.method454(class415.field6025);
            if (class391.field5642 == var6) {
                Insets var10 = class391.field5642.getInsets();
                class415.field6025.setLocation(class122.field1894 + var10.left, class74.field1046 + var10.top);
            } else {
                class415.field6025.setLocation(class122.field1894, class74.field1046);
            }
        }
        if (arg5 >= 2) {
            class102.field1605 = true;
        } else {
            class102.field1605 = false;
        }
        if (class236.field3268 != -1) {
            class454.method2663(true, true);
        }
        if (class104.field1702 != null && class32.method239(class494.field7155, 0)) {
            class326.method1935(arg1 - 30568);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class428.field6214[var11] = true;
        }
        class77.field1095 = true;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)I")
    public final int method2773(int arg0) {
        int var2 = -20 / ((40 - arg0) / 49);
        field6843++;
        return this.field6858;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public final void method2774(byte arg0) {
        for (class395 var2 = (class395) this.field6850.method3152(false); var2 != null; var2 = (class395) this.field6850.method3153((byte) 87)) {
            if (var2.method290(124)) {
                var2.method2791((byte) 112);
                var2.method1645(-105);
                this.field6858 += var2.field5691;
            }
        }
        int var3 = 13 % ((arg0 - 51) / 42);
        field6851++;
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)I")
    public final int method2775(int arg0) {
        field6855++;
        int var2 = arg0;
        for (class395 var3 = (class395) this.field6850.method3152(false); var3 != null; var3 = (class395) this.field6850.method3153((byte) 106)) {
            if (!var3.method290(115)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V")
    public static void method2776(byte arg0) {
        if (arg0 >= 9) {
            field6844 = null;
            field6848 = null;
            field6856 = null;
            field6842 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILjava/lang/Object;J)V")
    public final void method2777(int arg0, Object arg1, long arg2) {
        field6841++;
        if (arg0 == -1025) {
            this.method2778(1, arg0 ^ 0xFFFFFBFE, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILjava/lang/Object;J)V")
    private final void method2778(int arg0, int arg1, Object arg2, long arg3) {
        field6853++;
        if (arg0 > this.field6864) {
            throw new IllegalStateException("s>cs");
        }
        this.method2771(arg3, 2);
        this.field6858 -= arg0;
        while (this.field6858 < 0) {
            class395 var7 = (class395) this.field6850.method3148(true);
            this.method2770(var7, (byte) 78);
        }
        class42 var6 = new class42(arg2, arg0);
        this.field6847.method1586(var6, arg3, arg1);
        this.field6850.method3150(16711680, var6);
        var6.field3883 = 0L;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
    public final void method2779(int arg0, int arg1) {
        field6862++;
        if (class478.field6915 != null) {
            for (class395 var3 = (class395) this.field6850.method3152(false); var3 != null; var3 = (class395) this.field6850.method3153((byte) 126)) {
                if (var3.method290(111)) {
                    if (var3.method289(arg0 ^ 0x753F) == null) {
                        var3.method2791((byte) 112);
                        var3.method1645(-106);
                        this.field6858++;
                    }
                } else if ((long) arg1 < ++var3.field3883) {
                    class395 var4 = class478.field6915.method1549(var3, -102);
                    this.field6847.method1586(var4, var3.field6883, 1);
                    class347.method2086(var3, var4, 0);
                    var3.method2791((byte) 112);
                    var3.method1645(-118);
                }
            }
        }
        if (arg0 != 14896) {
            this.method2775(-89);
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(I)V")
    public class473(int arg0) {
        this.field6864 = arg0;
        this.field6858 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field6847 = new class270(var2);
    }
}
