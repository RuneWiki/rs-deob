import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class82 {

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "[I")
    public static int[] field1299 = new int[256];

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1297 = 0;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "Lec;")
    public static class25 field1298 = new class25(64);

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field1304 = 0;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1305 = "Please remove ";

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)I")
    public static final int method551(int arg0, int arg1) {
        field1300++;
        return arg0 == -24862 ? arg1 >>> 8 : -7;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIILjk;Ljk;IIIIJ)V")
    public static final void method552(int arg0, int arg1, int arg2, int arg3, class276 arg4, class276 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class98 var12 = new class98();
        var12.field1465 = arg10;
        var12.field1475 = arg1 * 128 + 64;
        var12.field1472 = arg2 * 128 + 64;
        var12.field1468 = arg3;
        var12.field1480 = arg4;
        var12.field1479 = arg5;
        var12.field1478 = arg6;
        var12.field1464 = arg7;
        var12.field1466 = arg8;
        var12.field1469 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class27.field346[var13][arg1][arg2] == null) {
                class27.field346[var13][arg1][arg2] = new class154(var13, arg1, arg2);
            }
        }
        class27.field346[arg0][arg1][arg2].field2414 = var12;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static final void method553(byte arg0) {
        class271.field4443 = 0;
        field1301++;
        class281.field4649 = 0;
        class76.field1196 = 0;
        client.field2582 = false;
        class143.field2237 = arg0;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)I")
    public static int method554(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(II)Z")
    public static final boolean method555(int arg0, int arg1) {
        field1302++;
        if (class41.field517 == arg0) {
            return false;
        }
        class209.field3357 = new int[104][104];
        class92.field1400 = new int[104][104];
        class171.field2647 = new int[104][104];
        class193.field3049 = new int[4][13][13];
        class304.field4963 = new int[104][104];
        for (int var2 = 0; var2 < 4; var2++) {
            class183.field2841[var2] = new class142(104, 104);
        }
        if (arg1 <= 60) {
            field1297 = -121;
        }
        class128.field1972 = new byte[4][104][104];
        class239.field3780 = new class281[4][104][104];
        class41.field517 = arg0;
        class219.field3506 = new byte[4][104][104];
        return true;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V")
    public static final void method556(int arg0, int arg1, int arg2) {
        if (arg2 == 19879) {
            class36 var3 = class161.method1067(14, arg1, (byte) 81);
            field1295++;
            var3.method219(-11);
            var3.field465 = arg0;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "()V")
    public static final void method557() {
        for (int var0 = 0; var0 < class259.field4255; var0++) {
            class114 var1 = class207.field3309[var0];
            class257.method1793(var1);
            class207.field3309[var0] = null;
        }
        class259.field4255 = 0;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
    public static void method558(byte arg0) {
        field1299 = null;
        if (arg0 == -31) {
            field1305 = null;
            field1298 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(III)V")
    public static final void method559(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class277.field4590; var3++) {
            for (int var4 = 0; var4 < class183.field2835; var4++) {
                for (int var5 = 0; var5 < class90.field1391; var5++) {
                    class154 var6 = class27.field346[var3][var4][var5];
                    if (var6 != null) {
                        class169 var7 = var6.field2411;
                        if (var7 != null && var7.field2639.method1599()) {
                            class173.method1154(var7.field2639, var3, var4, var5, 1, 1);
                            if (var7.field2634 != null && var7.field2634.method1599()) {
                                class173.method1154(var7.field2634, var3, var4, var5, 1, 1);
                                var7.field2639.method1586(var7.field2634, 0, 0, 0, false);
                                var7.field2634 = var7.field2634.method1579(arg0, arg1, arg2);
                            }
                            var7.field2639 = var7.field2639.method1579(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field2431; var8++) {
                            class114 var10 = var6.field2418[var8];
                            if (var10 != null && var10.field1726.method1599()) {
                                class173.method1154(var10.field1726, var3, var4, var5, var10.field1715 + 1 - var10.field1724, var10.field1714 - var10.field1719 + 1);
                                var10.field1726 = var10.field1726.method1579(arg0, arg1, arg2);
                            }
                        }
                        class286 var9 = var6.field2419;
                        if (var9 != null && var9.field4769.method1599()) {
                            class224.method1562(var9.field4769, var3, var4, var5);
                            var9.field4769 = var9.field4769.method1579(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }
}
