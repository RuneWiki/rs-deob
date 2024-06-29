import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class155 extends class61 {

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "Leb;")
    private static class230 field2755 = class68.method589(0, "Choose Option");

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "Leb;")
    public static class230 field2756 = field2755;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "[I")
    public static int[] field2768 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "Leb;")
    public static class230 field2772 = class68.method589(0, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
    public static int field2769 = 0;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "Z")
    public static volatile boolean field2771 = false;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "I")
    public int field2763;

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public int field2766;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
    public int field2770;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "[I")
    public static int[] field2760;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1179(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class132.field2397[0].method405(arg3, arg5);
        field2764++;
        class132.field2397[1].method405(arg3, arg5 + arg4 - 16);
        int var6 = (arg4 - 32) * arg4 / arg1;
        if (var6 < 8) {
            var6 = 8;
        }
        if (!arg0) {
            method1184(-110);
        }
        int var7 = (arg4 - var6 - 32) * arg2 / (arg1 - arg4);
        class87.method705(arg3, arg5 + 16, 16, arg4 - 32, class169.field2997);
        class87.method705(arg3, var7 + arg5 + 16, 16, var6, class268.field4751);
        class87.method711(arg3, var7 + arg5 + 16, var6, class37.field704);
        class87.method711(arg3 + 1, arg5 + var7 - -16, var6, class37.field704);
        class87.method709(arg3, arg5 + var7 + 16, 16, class37.field704);
        class87.method709(arg3, arg5 + var7 + 17, 16, class37.field704);
        class87.method711(arg3 + 15, arg5 - -var7 + 16, var6, class225.field3893);
        class87.method711(arg3 + 14, arg5 - -var7 + 17, var6 - 1, class225.field3893);
        class87.method709(arg3, var7 + arg5 + var6 + 15, 16, class225.field3893);
        class87.method709(arg3 + 1, var6 + 14 + arg5 - -var7, 15, class225.field3893);
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(II)Lwj;")
    public static final class6 method1180(int arg0, int arg1) {
        field2757++;
        if (arg0 > -52) {
            return null;
        }
        class6 var2 = (class6) class227.field3919.method273((long) arg1, 255);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class85.field1509.method1546(arg1, (byte) -100, 11);
        class6 var4 = new class6();
        if (var3 != null) {
            var4.method61(new class14(var3), (byte) -121);
        }
        class227.field3919.method276(var4, (long) arg1, -124);
        return var4;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
    public static final void method1181(int arg0) {
        if (arg0 == 4) {
            class45.field803.method1124(0);
            field2761++;
        }
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(II)I")
    public static final int method1182(int arg0, int arg1) {
        if (arg1 != 30453) {
            field2759 = 57;
        }
        field2773++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "(II)Lka;")
    public static final class245 method1183(int arg0, int arg1) {
        field2762++;
        int var2 = arg0 & 0xFFFF;
        int var3 = arg0 >> 16;
        if (arg1 != 17) {
            return null;
        }
        if (class99.field1839[var3] == null || class99.field1839[var3][var2] == null) {
            boolean var4 = class202.method1422(var3, true);
            if (!var4) {
                return null;
            }
        }
        return class99.field1839[var3][var2];
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
    public static void method1184(int arg0) {
        if (arg0 != -1) {
            field2771 = true;
        }
        field2755 = null;
        field2768 = null;
        field2760 = null;
        field2772 = null;
        field2756 = null;
    }
}
