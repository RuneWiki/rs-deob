import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class159 extends class2 {

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    private int field2537 = -32768;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field2528 = 2301979;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public static int field2536 = -2;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2531 = "white:";

    @OriginalMember(owner = "client!j", name = "y", descriptor = "[I")
    public static int[] field2538 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public int field2529;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public int field2530;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(III)Lcc;")
    public static final class209 method1094(int arg0, int arg1, int arg2) {
        class151 var3 = class218.field3584[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class209 var4 = var3.field2352;
            var3.field2352 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)Ljava/lang/String;")
    public static final String method1095(int arg0) {
        field2533++;
        String var1;
        if (~class46.field778 == arg0 && class83.field1384 < 2) {
            var1 = class100.field1625 + class179.field2921 + class14.field159 + " ->";
        } else if (class139.field2211 && class83.field1384 < 2) {
            var1 = class19.field230 + class179.field2921 + class203.field3235 + " ->";
        } else if (class298.field4759 && class100.field1627[81] && class83.field1384 > 2) {
            var1 = class112.method789(class83.field1384 - 2, arg0 + 75);
        } else {
            var1 = class112.method789(class83.field1384 - 1, 113);
        }
        if (class83.field1384 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class83.field1384 - 2) + class196.field3176;
        }
        return var1;
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)Z")
    public static final boolean method1096(int arg0) {
        field2532++;
        if (arg0 >= -3) {
            field2538 = null;
        }
        return class22.field272 == 0 ? class84.field1392.method2122((byte) 26) : true;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I")
    public final int method15() {
        field2534++;
        return this.field2537;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIIIJILic;)V")
    public final void method9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class171 arg10) {
        field2539++;
        class37 var13 = class81.method562(this.field2530, -20358).method809((class307) null, (byte) 111, -1, 0, (class264) null, this.field2529, 0);
        if (var13 != null) {
            var13.method9(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field2537 = var13.method15();
        }
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V")
    public static void method1097(int arg0) {
        if (arg0 <= 0) {
            field2538 = null;
        }
        field2538 = null;
        field2531 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2535++;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(III)Lim;")
    public static final class179 method1098(int arg0, int arg1, int arg2) {
        class151 var3 = class218.field3584[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2357; var4++) {
            class179 var5 = var3.field2347[var4];
            if ((var5.field2933 >> 29 & 0x3L) == 2L && var5.field2931 == arg1 && var5.field2915 == arg2) {
                return var5;
            }
        }
        return null;
    }
}
