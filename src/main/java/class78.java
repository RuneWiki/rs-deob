import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class78 {

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field1085 = 0;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field1086 = 0;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "Lf;")
    public static class329 field1084;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "[I")
    public static int[] field1083;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)V", line = 20)
    public static final void method526(int arg0, int arg1) {
        if (arg0 != 1) {
            method527(-19);
        }
        class154.field2317.method2174(-12634, arg1);
        field1082++;
        class311.field4732.method2174(-12634, arg1);
        class184.field2757.method2174(-12634, arg1);
        class94.field1412.method2174(arg0 ^ 0xFFFFCEA7, arg1);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V", line = 34)
    public static void method527(int arg0) {
        field1083 = null;
        if (arg0 != 0) {
            field1085 = 87;
        }
        field1084 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIII)Z", line = 54)
    public static final boolean method528(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class28.field382 * arg3 + class184.field2756 * arg0 >> 16;
        int var6 = class184.field2756 * arg3 - class28.field382 * arg0 >> 16;
        int var7 = class26.field366 * arg1 + class113.field1748 * var6 >> 16;
        int var8 = class113.field1748 * arg1 - class26.field366 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class26.field366 * arg2 + class113.field1748 * var6 >> 16;
        int var12 = class113.field1748 * arg2 - class26.field366 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class161.field2418 && var13 < class161.field2418) {
            return false;
        } else if (var9 > class300.field4591 && var13 > class300.field4591) {
            return false;
        } else if (var10 < class169.field2532 && var14 < class169.field2532) {
            return false;
        } else {
            return var10 <= class104.field1646 || var14 <= class104.field1646;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZI)I", line = 106)
    public static final int method529(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method527(-111);
        }
        class223 var3 = (class223) class295.field4520.method1320((long) arg2, 13002);
        field1081++;
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field3395.length; var5++) {
                if (var3.field3398[var5] == arg0) {
                    var4 += var3.field3395[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V", line = 148)
    public class78() {
        new class269();
    }
}
