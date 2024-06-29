import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class1 {

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field3 = 127;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "Z")
    public static boolean field4 = false;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "S")
    public static short field6 = 1;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field7 = 0;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "Lok;")
    private static class41 field10 = class137.method956("Loading)3)3)3", 45);

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "Lok;")
    public static class41 field2 = field10;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field9 = 0;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "[I")
    public static int[] field12;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZIIBIZ)V", line = 8)
    public static final void method1(int arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5, boolean arg6) {
        if (arg2 < arg5) {
            int var7 = (arg2 + arg5) / 2;
            class79 var8 = class184.field3006[var7];
            int var9 = arg2;
            class184.field3006[var7] = class184.field3006[arg5];
            class184.field3006[arg5] = var8;
            for (int var10 = arg2; var10 < arg5; var10++) {
                if (class122.method869(arg0, arg6, arg3, arg1, var8, -1, class184.field3006[var10]) <= 0) {
                    class79 var11 = class184.field3006[var10];
                    class184.field3006[var10] = class184.field3006[var9];
                    class184.field3006[var9++] = var11;
                }
            }
            class184.field3006[arg5] = class184.field3006[var9];
            class184.field3006[var9] = var8;
            method1(arg0, arg1, arg2, arg3, (byte) -80, var9 - 1, arg6);
            method1(arg0, arg1, var9 + 1, arg3, (byte) -126, arg5, arg6);
        }
        if (arg4 < -77) {
            field11++;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V", line = 57)
    public static void method2(boolean arg0) {
        field12 = null;
        field2 = null;
        field10 = null;
        if (!arg0) {
            field12 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)Laf;", line = 96)
    public static final class72 method3(int arg0) {
        field1++;
        byte[] var1 = class223.field3562[0];
        int var2 = class69.field1040[0] * class173.field2812[0];
        int[] var3 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class312.field5263[class217.method1563(255, var1[var4])];
        }
        if (arg0 != -100001) {
            field12 = (int[]) null;
        }
        class72 var5 = new class72(class204.field3299, class205.field3318, class95.field1412[0], class314.field5288[0], class69.field1040[0], class173.field2812[0], var3);
        class286.method2005((byte) -9);
        return var5;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)Lok;", line = 126)
    public static final class41 method4(int arg0, byte arg1) {
        if (arg1 < 5) {
            method2(true);
        }
        field5++;
        return class314.method2172(arg0, -10, 10, false);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lmh;III)Laf;", line = 147)
    public static final class72 method5(class65 arg0, int arg1, int arg2, int arg3) {
        field8++;
        if (arg2 <= 16) {
            method4(-93, (byte) 97);
        }
        return class10.method40(arg1, true, arg3, arg0) ? method3(-100001) : null;
    }
}
