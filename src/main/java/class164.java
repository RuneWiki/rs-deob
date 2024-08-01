import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("rg")
public class class164 {

    @OriginalMember(owner = "rg", name = "b", descriptor = "[Loe;")
    public static class135[] field3067 = new class135[4];

    @OriginalMember(owner = "rg", name = "e", descriptor = "I")
    public static int field3070 = 0;

    @OriginalMember(owner = "rg", name = "D", descriptor = "[I")
    public static int[] field3094 = new int[50];

    @OriginalMember(owner = "rg", name = "a", descriptor = "I")
    public int field3066;

    @OriginalMember(owner = "rg", name = "c", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "rg", name = "d", descriptor = "I")
    public int field3069;

    @OriginalMember(owner = "rg", name = "g", descriptor = "I")
    public int field3072;

    @OriginalMember(owner = "rg", name = "h", descriptor = "I")
    public int field3073;

    @OriginalMember(owner = "rg", name = "i", descriptor = "I")
    public int field3074;

    @OriginalMember(owner = "rg", name = "j", descriptor = "I")
    public int field3075;

    @OriginalMember(owner = "rg", name = "l", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "rg", name = "m", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "rg", name = "n", descriptor = "I")
    public int field3079;

    @OriginalMember(owner = "rg", name = "o", descriptor = "I")
    public int field3080;

    @OriginalMember(owner = "rg", name = "p", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "rg", name = "q", descriptor = "I")
    public int field3082;

    @OriginalMember(owner = "rg", name = "r", descriptor = "I")
    public int field3083;

    @OriginalMember(owner = "rg", name = "s", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "rg", name = "u", descriptor = "I")
    public int field3086;

    @OriginalMember(owner = "rg", name = "v", descriptor = "I")
    public int field3087;

    @OriginalMember(owner = "rg", name = "w", descriptor = "I")
    public int field3088;

    @OriginalMember(owner = "rg", name = "x", descriptor = "I")
    public int field3089;

    @OriginalMember(owner = "rg", name = "y", descriptor = "I")
    public int field3090;

    @OriginalMember(owner = "rg", name = "z", descriptor = "I")
    public int field3091;

    @OriginalMember(owner = "rg", name = "A", descriptor = "I")
    public int field3092;

    @OriginalMember(owner = "rg", name = "B", descriptor = "I")
    public int field3093;

    @OriginalMember(owner = "rg", name = "E", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "rg", name = "k", descriptor = "Lkf;")
    public static class100 field3076;

    @OriginalMember(owner = "rg", name = "f", descriptor = "Lah;")
    public static class9 field3071;

    @OriginalMember(owner = "rg", name = "t", descriptor = "[S")
    public static short[] field3085;

    @OriginalMember(owner = "rg", name = "a", descriptor = "(IIZI)Llf;")
    public static final class109 method1110(int arg0, int arg1, boolean arg2, int arg3) {
        field3081++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var4 = 1;
        if (arg1 != -19865) {
            return null;
        }
        int var5 = arg3 / arg0;
        while (var5 != 0) {
            var5 /= arg0;
            var4++;
        }
        int var6 = var4;
        if (arg3 < 0 || arg2) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg2) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg3 % arg0;
            arg3 /= arg0;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class109 var9 = new class109();
        var9.field2176 = var6;
        var9.field2182 = var7;
        return var9;
    }

    @OriginalMember(owner = "rg", name = "a", descriptor = "(ILlf;IZI)V")
    public static final void method1111(int arg0, class109 arg1, int arg2, boolean arg3, int arg4) {
        class200 var5 = class129.method932(arg2, -1, arg0);
        field3084++;
        if (var5 == null) {
            return;
        }
        if (var5.field3861 != null) {
            class82 var6 = new class82();
            var6.field1628 = arg1;
            var6.field1608 = var5;
            var6.field1613 = var5.field3861;
            var6.field1619 = arg4;
            class42.method305(24087, var6);
        }
        boolean var7 = arg3;
        if (var5.field3916 > 0) {
            var7 = class113.method838(var5, (byte) -59);
        }
        if (!var7 || !class148.method1035(class126.method918(var5, 104), arg4 - 1, 255)) {
            return;
        }
        if (arg4 == 1) {
            class200.field3850.method1339((byte) 84, 181);
            class30.field644++;
            class200.field3850.method588((byte) 115, arg2);
            class200.field3850.method557(9698, arg0);
        }
        if (arg4 == 2) {
            class115.field2274++;
            class200.field3850.method1339((byte) 121, 198);
            class200.field3850.method588((byte) 104, arg2);
            class200.field3850.method557(9698, arg0);
        }
        if (arg4 == 3) {
            class143.field2752++;
            class200.field3850.method1339((byte) 117, 158);
            class200.field3850.method588((byte) 110, arg2);
            class200.field3850.method557(9698, arg0);
        }
        if (arg4 == 4) {
            class200.field3850.method1339((byte) 115, 84);
            class156.field2934++;
            class200.field3850.method588((byte) 114, arg2);
            class200.field3850.method557(9698, arg0);
        }
        if (arg4 == 5) {
            class209.field4070++;
            class200.field3850.method1339((byte) 120, 203);
            class200.field3850.method588((byte) 104, arg2);
            class200.field3850.method557(9698, arg0);
        }
        if (arg4 == 6) {
            class28.field614++;
            class200.field3850.method1339((byte) 110, 21);
            class200.field3850.method588((byte) 110, arg2);
            class200.field3850.method557(9698, arg0);
        }
        if (arg4 == 7) {
            class171.field3206++;
            class200.field3850.method1339((byte) 125, 234);
            class200.field3850.method588((byte) 126, arg2);
            class200.field3850.method557(9698, arg0);
        }
        if (arg4 == 8) {
            class82.field1616++;
            class200.field3850.method1339((byte) 81, 120);
            class200.field3850.method588((byte) 114, arg2);
            class200.field3850.method557(9698, arg0);
        }
        if (arg4 == 9) {
            class200.field3850.method1339((byte) 81, 128);
            class132.field2541++;
            class200.field3850.method588((byte) 101, arg2);
            class200.field3850.method557(9698, arg0);
        }
        if (arg4 == 10) {
            class200.field3850.method1339((byte) 88, 22);
            class93.field1909++;
            class200.field3850.method588((byte) 112, arg2);
            class200.field3850.method557(9698, arg0);
        }
    }

    @OriginalMember(owner = "rg", name = "a", descriptor = "(B)V")
    public static void method1112(byte arg0) {
        field3085 = null;
        field3071 = null;
        field3094 = null;
        field3067 = null;
        int var1 = 14 / ((arg0 + 47) / 57);
        field3076 = null;
    }

    @OriginalMember(owner = "rg", name = "a", descriptor = "(BLbg;ZLdb;Lbg;)V")
    public static final void method1113(byte arg0, class18 arg1, boolean arg2, class33 arg3, class18 arg4) {
        field3078++;
        class9.field126 = arg4;
        class109.field2157 = arg2;
        class84.field1709 = arg1;
        if (arg0 != 45) {
            method1113((byte) 90, null, false, null, null);
        }
        class150.field2888 = class84.field1709.method167((byte) 10, 10);
        class82.field1624 = arg3;
    }

    @OriginalMember(owner = "rg", name = "a", descriptor = "(III)V")
    public static final void method1114(int arg0, int arg1, int arg2) {
        field3068++;
        if (class57.field1152 != arg2) {
            class47.field980 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class47.field980[var3] = (var3 << 12) / arg2;
            }
            class29.field624 = arg2 - 1;
            class57.field1152 = arg2;
        }
        if (class38.field824 != arg0) {
            class54.field1083 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class54.field1083[var4] = (var4 << 12) / arg0;
            }
            class38.field824 = arg0;
            class150.field2892 = arg0 - 1;
        }
        if (arg1 != 1669028716) {
            field3085 = null;
        }
    }
}
