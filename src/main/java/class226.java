import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class226 {

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "Lda;")
    public static class275 field3825 = class255.method1672(103, "(U");

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "Lda;")
    private static class275 field3829 = class255.method1672(104, "Prepared sound engine");

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field3836 = 0;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "Lda;")
    public static class275 field3828 = class255.method1672(110, "mapdots");

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "Lda;")
    public static class275 field3831 = field3829;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "[Lda;")
    public static class275[] field3835 = new class275[8];

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3827;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIII)V")
    public static final void method1461(int arg0, int arg1, int arg2, int arg3) {
        class3 var4 = class235.field4101[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class119 var5 = var4.field41;
        if (var5 != null) {
            var5.field2128 = var5.field2128 * arg3 / 16;
            var5.field2131 = var5.field2131 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIILfd;I)V")
    public static final void method1462(int arg0, int arg1, int arg2, class229 arg3, int arg4) {
        field3832++;
        if (class120.field2165 >= 3) {
            class47.method290(arg0, arg2, 0, arg3.field3938, arg3.field3961);
        } else {
            ((class259) class44.field749).method720(arg0, arg2, arg3.field3885, arg3.field3980, class44.field749.field3084 / 2, class44.field749.field3085 / 2, class169.field2938, 256, arg3.field3938, arg3.field3961);
        }
        class100.field1691[arg4] = true;
        if (arg1 != 111) {
            method1468(32, -83);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1463(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class40.field673 * arg3 + class173.field3000 * arg0 >> 16;
        int var6 = class173.field3000 * arg3 - class40.field673 * arg0 >> 16;
        int var7 = class219.field3710 * var6 + class157.field2758 * arg1 >> 16;
        int var8 = class219.field3710 * arg1 - class157.field2758 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class219.field3710 * var6 + class157.field2758 * arg2 >> 16;
        int var12 = class219.field3710 * arg2 - class157.field2758 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class34.field540 && var13 < class34.field540) {
            return false;
        } else if (var9 > field3833 && var13 > field3833) {
            return false;
        } else if (var10 < class153.field2686 && var14 < class153.field2686) {
            return false;
        } else {
            return var10 <= class207.field3501 || var14 <= class207.field3501;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIILak;JZ)V")
    public static final void method1464(int arg0, int arg1, int arg2, int arg3, class234 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class214 var8 = new class214();
        var8.field3648 = arg4;
        var8.field3646 = arg1 * 128 + 64;
        var8.field3649 = arg2 * 128 + 64;
        var8.field3644 = arg3;
        var8.field3645 = arg5;
        if (class235.field4101[arg0][arg1][arg2] == null) {
            class235.field4101[arg0][arg1][arg2] = new class3(arg0, arg1, arg2);
        }
        class235.field4101[arg0][arg1][arg2].field39 = var8;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)I")
    public static final int method1465(int arg0, int arg1, int arg2) {
        int var3 = arg0 >>> 31;
        if (arg2 >= -70) {
            field3835 = null;
        }
        field3837++;
        return (arg0 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)Z")
    public static final boolean method1466(int arg0, int arg1) {
        if (arg0 == -1) {
            field3834++;
            return ((arg1 & 0x6DBF29E5) >> 30) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
    public static void method1467(byte arg0) {
        field3829 = null;
        field3827 = null;
        field3835 = null;
        field3828 = null;
        field3831 = null;
        int var1 = 115 / ((arg0 + 22) / 35);
        field3825 = null;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)V")
    public static final void method1468(int arg0, int arg1) {
        class96.field1636 = null;
        class116.field2070 = -1;
        class83.field1347 = 1;
        class192.field3309 = false;
        int var2 = 109 / ((10 - arg1) / 49);
        class224.field3787 = arg0;
        class238.field4185 = 0;
        class100.field1688 = -1;
        field3826++;
    }
}
