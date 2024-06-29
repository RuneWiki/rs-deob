import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class213 {

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field3474 = 0;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Lwm;")
    public static class152 field3475 = class157.method1048("gr-Un:", 108);

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "Lwm;")
    public static class152 field3481 = class157.method1048("Memory before cleanup=", 126);

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "Lwm;")
    public static class152 field3486 = class157.method1048(" <col=00ff80>", 120);

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "S")
    public static short field3480 = 32767;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "Z")
    public static boolean field3485 = false;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "F")
    public static float field3484;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BII)Lm;", line = 12)
    public static final class48 method1435(byte arg0, int arg1, int arg2) {
        field3478++;
        class48 var3 = new class48();
        class311 var4 = (class311) class31.field520.method1221((byte) 42);
        int var5 = -15 % ((arg0 + 43) / 47);
        while (var4 != null) {
            if (var4.field5333 && var4.method2158(arg2, arg1, 0)) {
                var3.method334((byte) 74, var4);
            }
            var4 = (class311) class31.field520.method1223(53);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 37)
    public static final void method1436(int arg0) {
        class320.field5588.method1619(arg0 + 11301);
        field3483++;
        if (arg0 != -1) {
            method1440(42, 18, 3, 25);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIZ)I", line = 71)
    public static final int method1437(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            return 25;
        }
        int var4 = arg0 & 0x3;
        field3482++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)Lda;", line = 99)
    public static final class120 method1438(int arg0, int arg1, int arg2) {
        class34 var3 = class287.field4857[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class120 var4 = var3.field558;
            var3.field558 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIII)V", line = 111)
    public static final void method1439(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3479++;
        if (arg1 != 10663) {
            return;
        }
        if (class308.field5283 <= (arg0 - arg5) && class238.field3902 >= (arg0 + arg5) && arg4 - arg5 >= class157.field2505 && arg4 + arg5 <= class110.field1553) {
            class15.method96(arg0, arg3, arg2, arg5, 14986, arg6, arg4);
        } else {
            class85.method559((byte) -64, arg2, arg6, arg4, arg0, arg3, arg5);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIII)I", line = 133)
    public static final int method1440(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 / arg1;
        field3487++;
        int var5 = arg2 & arg1 - 1;
        int var6 = arg0 / arg1;
        if (arg3 != 0) {
            field3475 = (class152) null;
        }
        int var7 = arg0 & arg1 - 1;
        int var8 = class206.method1390(var4, var6, -26462);
        int var9 = class206.method1390(var4 + 1, var6, -26462);
        int var10 = class206.method1390(var4, var6 + 1, -26462);
        int var11 = class206.method1390(var4 + 1, var6 + 1, -26462);
        int var12 = class141.method887((byte) -120, var5, var8, var9, arg1);
        int var13 = class141.method887((byte) -125, var5, var10, var11, arg1);
        return class141.method887((byte) -124, var7, var12, var13, arg1);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V", line = 174)
    public static void method1441(byte arg0) {
        field3475 = null;
        field3481 = null;
        if (arg0 > 11) {
            field3486 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Loe;I)Lwm;", line = 186)
    public static final class152 method1442(class127 arg0, int arg1) {
        field3476++;
        if (client.method1759(arg0).method545(-113) == 0) {
            return null;
        } else if (arg0.field1796 == null || arg0.field1796.method1025(-119).method1000(0) == 0) {
            return class317.field5495 ? class244.field4058 : null;
        } else if (arg1 == -15415) {
            return arg0.field1796;
        } else {
            return (class152) null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Z", line = 210)
    public static final boolean method1443(int arg0, int arg1) {
        field3477++;
        if (arg1 != 1) {
            field3481 = (class152) null;
        }
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }
}
