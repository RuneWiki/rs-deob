import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class158 extends class159 {

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "[I")
    public static int[] field2133 = new int[1];

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public int field2122;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public int field2123;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public int field2129;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public int field2132;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    public int field2134;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
    public int field2136;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "Lofa;")
    public class347 field2127;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "Lofa;")
    public class347 field2137;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Lha;")
    public static class66 field2124;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "Lda;")
    public static class67 field2130;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "Ljava/lang/String;")
    public String field2131;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "Z")
    public boolean field2126;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "[Ljava/lang/Object;")
    public Object[] field2128;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([FII)[F")
    public static final float[] method1095(float[] arg0, int arg1, int arg2) {
        field2135++;
        float[] var3 = new float[arg1];
        if (arg2 <= 30) {
            method1096(43, 42, 112, null, null);
        }
        class421.method2537(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIILmd;Lmd;)V")
    public static final void method1096(int arg0, int arg1, int arg2, class569 arg3, class569 arg4) {
        class194 var5 = class782.method4289(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field2529 = arg3;
        var5.field2531 = arg4;
        int var6 = class737.field10008 == class645.field8694 ? 1 : 0;
        if (!arg3.method769(-102)) {
            arg3.field2808 = class570.field7774[var6];
            class570.field7774[var6] = arg3;
        } else if (arg3.method777(-98)) {
            arg3.field2808 = class151.field2056[var6];
            class151.field2056[var6] = arg3;
        } else {
            arg3.field2808 = class737.field10005[var6];
            class737.field10005[var6] = arg3;
            class132.field1818 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method769(-109)) {
            if (arg4.method777(-121)) {
                arg4.field2808 = class151.field2056[var6];
                class151.field2056[var6] = arg4;
                return;
            }
            arg4.field2808 = class737.field10005[var6];
            class737.field10005[var6] = arg4;
            class132.field1818 = true;
            return;
        }
        arg4.field2808 = class570.field7774[var6];
        class570.field7774[var6] = arg4;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)V")
    public static final void method1097(int arg0, byte arg1) {
        if (arg1 < 115) {
            return;
        }
        field2125++;
        class116 var2 = (class116) class138.field1861.method1248(116, (long) arg0);
        if (var2 != null) {
            var2.field1564 = !var2.field1564;
            var2.field1570.method2593(1, var2.field1564);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)Z")
    public static final boolean method1098(int arg0, int arg1, int arg2) {
        field2121++;
        int var3 = 0 % ((-arg0 - 25) / 50);
        return (arg2 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static void method1099(int arg0) {
        field2133 = null;
        if (arg0 != 0) {
            field2124 = null;
        }
        field2124 = null;
        field2130 = null;
    }
}
