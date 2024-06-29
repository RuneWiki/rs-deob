import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class205 {

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field3252 = 0;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Lik;")
    public static class259 field3248 = new class259(5);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "[Lai;")
    public static class126[] field3253;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)[Lbh;", line = 12)
    public static final class274[] method1497(byte arg0) {
        field3251++;
        class274[] var1 = new class274[class103.field1744];
        if (arg0 >= -110) {
            field3248 = (class259) null;
        }
        for (int var2 = 0; var2 < class103.field1744; var2++) {
            if (class265.field4126) {
                var1[var2] = new class209(class326.field5064, class52.field820, class246.field3811[var2], class62.field962[var2], class108.field1797[var2], class3.field14[var2], class270.field4198[var2], class251.field3871);
            } else {
                var1[var2] = new class315(class326.field5064, class52.field820, class246.field3811[var2], class62.field962[var2], class108.field1797[var2], class3.field14[var2], class270.field4198[var2], class251.field3871);
            }
        }
        class233.method1680((byte) -12);
        return var1;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 42)
    public static final void method1498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field3249++;
        class10 var13 = new class10();
        var13.field157 = arg5;
        var13.field152 = arg6;
        var13.field168 = arg4;
        var13.field171 = arg8;
        var13.field164 = arg9;
        var13.field156 = arg7;
        var13.field172 = arg2;
        var13.field166 = arg10;
        var13.field159 = arg1;
        var13.field154 = arg11;
        var13.field167 = arg0;
        if (arg3 != 0) {
            method1499(true, (byte) 45);
        }
        var13.field165 = arg12;
        class198.field3138.method1493(-111, var13);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZB)V", line = 70)
    public static final void method1499(boolean arg0, byte arg1) {
        if (arg1 != -49) {
            field3248 = (class259) null;
        }
        field3247++;
        if (arg0 != class136.field2160) {
            class136.field2160 = arg0;
            class17.method141(110);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIII[[II)I", line = 86)
    public static final int method1500(int arg0, int arg1, int arg2, int arg3, int[][] arg4, int arg5) {
        int var6 = (128 - arg1) * arg4[arg2][arg5] + arg4[arg2 + 1][arg5] * arg1 >> 7;
        field3250++;
        if (arg0 != 1164571624) {
            field3252 = -48;
        }
        int var7 = (128 - arg1) * arg4[arg2][arg5 + 1] + arg4[arg2 + 1][arg5 + 1] * arg1 >> 7;
        return (128 - arg3) * var6 + (arg3 * var7) >> 7;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 103)
    public static void method1501(int arg0) {
        if (arg0 != -1) {
            field3252 = 38;
        }
        field3253 = null;
        field3248 = null;
    }
}
