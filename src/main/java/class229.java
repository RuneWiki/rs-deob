import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class229 extends class73 {

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Lli;")
    public class185 field4169;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "[Lli;")
    public static class185[] field4165 = new class185[100];

    @OriginalMember(owner = "client!r", name = "v", descriptor = "Lfl;")
    public static class191 field4168 = new class191();

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(Z)V")
    public static void method1580(boolean arg0) {
        if (!arg0) {
            field4165 = null;
            field4168 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lp;Z)V")
    public static final void method1581(class82 arg0, boolean arg1) {
        if (!arg1) {
            if (class191.field3541 == arg0.field1488) {
                class44.field700[arg0.field1595] = true;
            }
            field4164++;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjd;)Lwj;")
    public static final class183 method1582(int arg0, class118 arg1) {
        if (arg0 != -5748) {
            field4165 = null;
        }
        field4160++;
        return new class183(arg1.method876(65280), arg1.method876(arg0 ^ 0xFFFF168C), arg1.method876(arg0 ^ 0xFFFF168C), arg1.method876(65280), arg1.method873((byte) -109), arg1.method873((byte) -106), arg1.method867(false));
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)V")
    public static final void method1583(byte arg0, int arg1) {
        field4161++;
        class212.field3868.method85((byte) 75, arg1);
        class27.field458.method85((byte) 75, arg1);
        class26.field435.method85((byte) 75, arg1);
        class106.field1903.method85((byte) 75, arg1);
        int var2 = 126 / ((64 - arg0) / 60);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
    public static final void method1584(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class157.method1116(arg4, arg3 - arg1, arg1 + arg3, class145.field2757[arg2], arg0 ^ 0xFFFFFF99);
        int var5 = arg0;
        field4166++;
        int var6 = arg1;
        int var7 = -arg1;
        int var8 = -1;
        while (var5 < var6) {
            var5++;
            var8 += 2;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                int var9 = arg3 + var5;
                var7 -= var6 << 1;
                int[] var10 = class145.field2757[arg2 - var6];
                int[] var11 = class145.field2757[arg2 + var6];
                int var12 = arg3 - var5;
                class157.method1116(arg4, var12, var9, var11, -69);
                class157.method1116(arg4, var12, var9, var10, arg0 - 44);
            }
            int var13 = arg3 + var6;
            int[] var14 = class145.field2757[arg2 + var5];
            int var15 = arg3 - var6;
            int[] var16 = class145.field2757[arg2 - var5];
            class157.method1116(arg4, var15, var13, var14, -38);
            class157.method1116(arg4, var15, var13, var16, -96);
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIII)Z")
    public static final boolean method1585(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class257.field4580 * arg0 + class144.field2750 * arg3 >> 16;
        int var6 = class257.field4580 * arg3 - class144.field2750 * arg0 >> 16;
        int var7 = class68.field1210 * arg1 + class242.field4324 * var6 >> 16;
        int var8 = class242.field4324 * arg1 - class68.field1210 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class68.field1210 * arg2 + class242.field4324 * var6 >> 16;
        int var12 = class242.field4324 * arg2 - class68.field1210 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class243.field4349 && var13 < class243.field4349) {
            return false;
        } else if (var9 > class196.field3600 && var13 > class196.field3600) {
            return false;
        } else if (var10 < class193.field3569 && var14 < class193.field3569) {
            return false;
        } else {
            return var10 <= class80.field1405 || var14 <= class80.field1405;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)Luj;")
    public static final class119 method1586(int arg0, int arg1) {
        class119 var2 = (class119) class99.field1824.method82(127, (long) arg0);
        field4167++;
        if (var2 != null) {
            return var2;
        } else if (arg1 == -32637) {
            byte[] var3 = class15.field254.method1688(0, arg0, 33);
            class119 var4 = new class119();
            if (var3 != null) {
                var4.method882(arg0, new class118(var3), -113);
            }
            class99.field1824.method84(103, (long) arg0, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class229() {
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lli;)V")
    public class229(class185 arg0) {
        this.field4169 = arg0;
    }
}
