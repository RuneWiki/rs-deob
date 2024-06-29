import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class9 extends class274 {

    @OriginalMember(owner = "client!n", name = "B", descriptor = "I")
    private final int field119;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    private final int field108;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    private final int field107;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    private final int field118;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "Lce;")
    public static class126 field111 = class206.method1445(-7923, "cookieprefix");

    @OriginalMember(owner = "client!n", name = "w", descriptor = "Lce;")
    public static class126 field114 = class206.method1445(-7923, "gr-Un:");

    @OriginalMember(owner = "client!n", name = "x", descriptor = "[I")
    public static int[] field115 = new int[500];

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field106 = 1;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "Lce;")
    public static class126 field123 = class206.method1445(-7923, "::noclip");

    @OriginalMember(owner = "client!n", name = "D", descriptor = "[S")
    public static short[] field121 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!n", name = "G", descriptor = "F")
    public static float field124;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 8)
    public static final void method48(int arg0) {
        class227.field3834.method1233((byte) -78);
        field110++;
        int var1 = class227.field3834.method1241(1, 123);
        if (var1 == 0) {
            return;
        }
        int var2 = class227.field3834.method1241(2, -113);
        if (~var2 == arg0) {
            class139.field2526[class206.field3528++] = 2047;
        } else if (var2 == 1) {
            int var3 = class227.field3834.method1241(3, arg0 - 20);
            class286.field4744.method1006(false, var3, arg0 + 3);
            int var4 = class227.field3834.method1241(1, -115);
            if (var4 == 1) {
                class139.field2526[class206.field3528++] = 2047;
            }
        } else if (var2 == 2) {
            int var9 = class227.field3834.method1241(3, 122);
            class286.field4744.method1006(true, var9, 2);
            int var10 = class227.field3834.method1241(3, 18);
            class286.field4744.method1006(true, var10, 2);
            int var11 = class227.field3834.method1241(1, -116);
            if (var11 == 1) {
                class139.field2526[class206.field3528++] = 2047;
            }
        } else if (var2 == 3) {
            class131.field2250 = class227.field3834.method1241(2, arg0 ^ 0x7A);
            int var5 = class227.field3834.method1241(1, 91);
            if (var5 == 1) {
                class139.field2526[class206.field3528++] = 2047;
            }
            int var6 = class227.field3834.method1241(1, -127);
            int var7 = class227.field3834.method1241(7, -120);
            int var8 = class227.field3834.method1241(7, -112);
            class286.field4744.method2027(var7, var6 == 1, var8, 0);
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V", line = 81)
    public static void method49(byte arg0) {
        field115 = null;
        field121 = null;
        field111 = null;
        if (arg0 != -51) {
            method53(-115, 105);
        }
        field114 = null;
        field123 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V", line = 97)
    public final void method50(int arg0, int arg1, int arg2) {
        int var4 = this.field108 * arg0 >> 12;
        int var5 = this.field118 * arg1 >> 12;
        if (arg2 != 1) {
            method55(123);
        }
        field116++;
        int var6 = this.field107 * arg0 >> 12;
        int var7 = this.field119 * arg1 >> 12;
        class99.method671(this.field4609, var4, var6, arg2 ^ 0xFFFFCC16, var5, var7);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILce;)Z", line = 115)
    public static final boolean method51(int arg0, class126 arg1) {
        field104++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class14.field197; var2++) {
            if (arg1.method881(class298.field4953[var2], (byte) 92)) {
                return true;
            }
        }
        if (arg1.method881(class286.field4744.field5019, (byte) 92)) {
            return true;
        } else {
            if (arg0 != -25847) {
                field106 = 17;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IBI)V", line = 147)
    public final void method52(int arg0, byte arg1, int arg2) {
        if (arg1 != 66) {
            return;
        }
        int var4 = this.field108 * arg0 >> 12;
        field112++;
        int var5 = this.field118 * arg2 >> 12;
        int var6 = this.field107 * arg0 >> 12;
        int var7 = this.field119 * arg2 >> 12;
        class57.method395(var5, this.field4606, this.field4610, var4, this.field4609, var7, var6, false);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Lrc;", line = 166)
    public static final class224 method53(int arg0, int arg1) {
        class224 var2 = (class224) class84.field1343.method1173(-19839, (long) arg0);
        field122++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class234.field3952.method2173(1, arg0, (byte) -34);
        if (arg1 != 27993) {
            method48(100);
        }
        class224 var4 = new class224();
        if (var3 != null) {
            var4.method1532(arg1 - 39873, arg0, new class134(var3));
        }
        class84.field1343.method1179(var4, (long) arg0, (byte) -72);
        return var4;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(B)Lpe;", line = 191)
    public static final class262 method54(byte arg0) {
        int var1 = 13 / ((76 - arg0) / 34);
        field109++;
        try {
            return (class262) Class.forName("bm").getDeclaredConstructor().newInstance();
        } catch (Throwable var3) {
            return new class23();
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(IIIIIII)V", line = 219)
    public class9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field119 = arg3;
        this.field108 = arg0;
        this.field107 = arg2;
        this.field118 = arg1;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V", line = 235)
    public static final void method55(int arg0) {
        field113++;
        class157.field2817.method113(-12725);
        for (int var1 = arg0; var1 < 32; var1++) {
            class315.field5418[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class127.field2194[var2] = 0L;
        }
        class10.field126 = 0;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIB)V", line = 261)
    public final void method56(int arg0, int arg1, byte arg2) {
        field120++;
        if (arg2 != 66) {
            field115 = (int[]) null;
        }
    }
}
