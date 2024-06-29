import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class126 {

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "Lic;")
    public static class59 field2852 = class59.method433(0, " )2>");

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Lic;")
    private static class59 field2865 = class59.method433(0, "Close");

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Lic;")
    private static class59 field2858 = class59.method433(0, "Loaded input handler");

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Z")
    public static boolean field2857 = false;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Lic;")
    public static class59 field2859 = class59.method433(0, "k");

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Lic;")
    public static class59 field2855 = field2865;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "Lwf;")
    public static class159 field2864 = null;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "[I")
    public static int[] field2856 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field2866 = -1;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "[I")
    public static int[] field2862 = new int[32];

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "Lic;")
    public static class59 field2863 = field2858;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "Lie;")
    public static class61 field2870;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "Ljava/awt/Frame;")
    public static Frame field2867;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "[[[B")
    public static byte[][][] field2868;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZJ)V")
    public static final void method962(boolean arg0, long arg1) {
        field2854++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class108.method848(41, arg1 - 1L);
            class108.method848(-128, 1L);
        } else {
            class108.method848(-94, arg1);
        }
        if (arg0) {
            field2855 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)Z")
    public static final boolean method963(int arg0, int arg1) {
        field2853++;
        if (arg0 != -1) {
            field2865 = null;
        }
        return (arg1 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILh;I)V")
    public static final void method964(int arg0, int arg1, class49 arg2, int arg3) {
        if (arg2.field1685 == arg0 && arg0 != -1) {
            int var4 = class49.method381(arg0, (byte) 123).field623;
            if (var4 == 1) {
                arg2.field1743 = 0;
                arg2.field1754 = 0;
                arg2.field1709 = arg3;
                arg2.field1691 = 0;
            }
            if (var4 == 2) {
                arg2.field1743 = 0;
            }
        } else if (arg0 == -1 || arg2.field1685 == -1 || class49.method381(arg0, (byte) 126).field638 >= class49.method381(arg2.field1685, (byte) 107).field638) {
            arg2.field1754 = 0;
            arg2.field1685 = arg0;
            arg2.field1691 = 0;
            arg2.field1743 = 0;
            arg2.field1709 = arg3;
            arg2.field1681 = arg2.field1715;
        }
        if (arg1 != -31174) {
            method967(null, null);
        }
        field2860++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method965(int arg0) {
        field2865 = null;
        field2852 = null;
        field2863 = null;
        field2868 = null;
        field2856 = null;
        if (arg0 >= -120) {
            return;
        }
        field2867 = null;
        field2855 = null;
        field2864 = null;
        field2870 = null;
        field2858 = null;
        field2862 = null;
        field2859 = null;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
    public static final void method966(int arg0) {
        class10.field213.method1062(false);
        field2871++;
        if (arg0 > -79) {
            return;
        }
        int var1 = class10.field213.method1064(1, -7284);
        if (var1 == 0) {
            return;
        }
        int var2 = class10.field213.method1064(2, -7284);
        if (var2 == 0) {
            class3.field62[class106.field2526++] = 2047;
        } else if (var2 == 1) {
            int var3 = class10.field213.method1064(3, -7284);
            class159.field3650.method545(var3, false, 11978);
            int var4 = class10.field213.method1064(1, -7284);
            if (var4 == 1) {
                class3.field62[class106.field2526++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class10.field213.method1064(3, -7284);
            class159.field3650.method545(var5, true, 11978);
            int var6 = class10.field213.method1064(3, -7284);
            class159.field3650.method545(var6, true, 11978);
            int var7 = class10.field213.method1064(1, -7284);
            if (var7 == 1) {
                class3.field62[class106.field2526++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class10.field213.method1064(1, -7284);
            int var9 = class10.field213.method1064(1, -7284);
            if (var9 == 1) {
                class3.field62[class106.field2526++] = 2047;
            }
            int var10 = class10.field213.method1064(7, -7284);
            int var11 = class10.field213.method1064(7, -7284);
            class44.field1127 = class10.field213.method1064(2, -7284);
            class159.field3650.method549((byte) -24, var8 == 1, var10, var11);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Loc;")
    public static final class100 method967(Throwable arg0, String arg1) {
        field2869++;
        class100 var2;
        if (arg0 instanceof class100) {
            var2 = (class100) arg0;
            var2.field2473 = var2.field2473 + ' ' + arg1;
        } else {
            var2 = new class100(arg0, arg1);
        }
        return var2;
    }
}
