import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class229 extends class424 {

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public int field3054;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public int field3050;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "F")
    public static float field3055;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "[[B")
    public static byte[][] field3047;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)V", line = 5)
    public static final void method1439(int arg0, int arg1, int arg2, int arg3) {
        field3053++;
        int var4 = 71 % ((49 - arg2) / 48);
        class559 var5 = class287.field3714[arg0][arg3];
        class337.method1935(var5 == null ? class224.field2920 : var5, 0, arg1);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V", line = 18)
    public static final void method1440(int arg0, int arg1) {
        field3051++;
        class367 var2 = class573.method3057(arg1, arg0, arg1 ^ 0xC);
        var2.method2113(23);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(BII)Z", line = 30)
    public static final boolean method1441(byte arg0, int arg1, int arg2) {
        if (arg0 != -126) {
            field3055 = 1.6946883F;
        }
        field3049++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        class698 var3 = class348.field4436.method1900(90, arg1);
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method3803((byte) 0, arg2);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZIIII)V", line = 50)
    public static final void method1442(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            return;
        }
        if (arg4 >= class265.field3552 && arg4 <= class641.field8924) {
            int var5 = class650.method3574(class99.field1309, class165.field2061, arg3, 110);
            int var6 = class650.method3574(class99.field1309, class165.field2061, arg2, 112);
            class233.method1482(var6, (byte) -128, arg4, arg1, var5);
        }
        field3048++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[FI)[F", line = 68)
    public static final float[] method1443(int arg0, float[] arg1, int arg2) {
        field3056++;
        if (arg0 != 10) {
            method1442(false, 100, 2, 9, -76);
        }
        float[] var3 = new float[arg2];
        class443.method2513(arg1, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 90)
    public static void method1444(int arg0) {
        field3047 = null;
        if (arg0 > -27) {
            method1440(-12, -19);
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(II)V", line = 100)
    public class229(int arg0, int arg1) {
        this.field3054 = arg1;
        this.field3050 = arg0;
    }
}
