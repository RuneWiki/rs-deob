import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class366 implements class190 {

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "Lsm;")
    public static class249 field5213 = new class249();

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "Lpf;")
    public static class133 field5214 = new class133(5000);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "[Ldh;")
    public static class269[] field5215;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIII)I")
    public static final int method2211(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 1023) {
            return 69;
        }
        field5212++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return 1023 - arg2;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
    public static void method2212(byte arg0) {
        if (arg0 != -44) {
            field5215 = null;
        }
        field5213 = null;
        field5215 = null;
        field5214 = null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class114 var7 = (class114) class261.field3644.method2823(50);
        if (arg6 != -575004671) {
            field5214 = null;
        }
        while (var7 != null) {
            if (var7.field1606 <= class356.field4972) {
                var7.method2773(arg6 + 575031650);
            } else {
                class422.method2450((var7.field1607 << 7) + 64, (var7.field1602 << 7) + 64, -10831, arg0, var7.field1610, arg1, var7.field1609 * 2, arg5 >> 1, arg4 >> 1);
                class211.field2981.method2849((byte) -42, class460.field6483[0] + arg2, var7.field1604 | 0xFF000000, 0, var7.field1611, class460.field6483[1] + arg3);
            }
            var7 = (class114) class261.field3644.method2818(0);
        }
        field5211++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([IBJI)Ljava/lang/String;")
    public final String method1226(int[] arg0, byte arg1, long arg2, int arg3) {
        field5209++;
        if (arg3 == 0) {
            class310 var6 = class293.field4024.method1761(arg0[0], false);
            return var6.method1874(false, (int) arg2);
        } else if (arg3 == 1 || arg3 == 10) {
            class164 var7 = class58.field918.method344((int) arg2, 31757);
            return var7.field2374;
        } else if (arg3 == 6 || arg3 == 7 || arg3 == 11) {
            return class293.field4024.method1761(arg0[0], false).method1874(false, (int) arg2);
        } else {
            if (arg1 < 67) {
                method2212((byte) 11);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(DB)V")
    public static final void method2214(double arg0, byte arg1) {
        if (arg1 != 16) {
            return;
        }
        field5210++;
        if (class184.field2672 == arg0) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
            class425.field5852[var3] = var4 <= 255 ? var4 : 255;
        }
        class184.field2672 = arg0;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)I")
    public static int method2215(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
