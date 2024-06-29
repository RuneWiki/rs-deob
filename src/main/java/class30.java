import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class30 {

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Leh;")
    public class119 field428 = new class119();

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Z")
    public boolean field435 = false;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field433 = 0;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field430 = new CRC32();

    @OriginalMember(owner = "client!he", name = "j", descriptor = "Lfg;")
    public static class18 field436 = new class18(64);

    @OriginalMember(owner = "client!he", name = "n", descriptor = "J")
    public static long field440 = 0L;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "Lvq;")
    public static class22 field441 = new class22();

    @OriginalMember(owner = "client!he", name = "r", descriptor = "[I")
    public static int[] field444 = new int[100];

    @OriginalMember(owner = "client!he", name = "s", descriptor = "Ljava/lang/String;")
    public static String field445 = "glow1:";

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public int field434;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public int field437;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V", line = 3)
    public static final void method225(int arg0, int arg1) {
        field438++;
        if (arg0 != -8) {
            method230(67);
        }
        class351.field4992 = 3;
        class333.field4785 = arg1;
        class319.field4609 = 100;
        class218.field3234 = -1;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 23)
    public static void method226(int arg0) {
        if (arg0 > -18) {
            return;
        }
        field444 = null;
        field436 = null;
        field445 = null;
        field441 = null;
        field430 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIIZ)V", line = 40)
    public static final void method227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field429++;
        int var8 = arg3 - 334;
        if (arg7) {
            method226(-45);
        }
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class250.field3615 - class431.field6221) * var8 / 100 + class431.field6221;
        int var10 = arg6 * var9 >> 8;
        int var11 = 16384 - arg1 & 0x3FFF;
        int var12 = 16384 - arg5 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class56.field897[var11] * -var10 >> 15;
            var15 = class56.field898[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class56.field897[var12] * var15 >> 15;
            var15 = class56.field898[var12] * var15 >> 15;
        }
        class40.field623 = arg1;
        class265.field3985 = arg4 - var13;
        class437.field6364 = arg0 - var14;
        class286.field4288 = arg2 - var15;
        class291.field4330 = arg5;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZLjava/lang/String;Lpi;Z)V", line = 94)
    public static final void method228(boolean arg0, String arg1, class220 arg2, boolean arg3) {
        field439++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class269.field4041.method1443(arg1, (class421[]) null, (byte) -54, 250);
        int var8 = class269.field4041.method1439((class421[]) null, 250, arg1, arg3) * 13;
        class73.field1235.method681(var5 - var4, -var4 + var6, var4 + var4 + var7, var4 + var4 + var8, -16777216, 0);
        class73.field1235.method711(var5 - var4, var6 - var4, var4 + var4 + var7, var4 + var8 + var4, -1, 0);
        arg2.method1674(var5, var6, (class421[]) null, 0, var7, (int[]) null, 1, 1, 0, 0, (class134) null, arg1, (byte) -5, -1, var8, -1);
        class253.method1834(var4 + var7 + var4, var4 + var8 + var4, !arg3, var5 - var4, -var4 + var6);
        if (arg0) {
            class73.field1235.method749();
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V", line = 123)
    public static final void method229(int arg0) {
        if (arg0 != -20024) {
            method232(-95, -96, 9, -100);
        }
        class219.field3253.method106((byte) -109);
        field427++;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V", line = 139)
    public static final void method230(int arg0) {
        while (true) {
            if (class268.field4020.method2783(0, class51.field824) >= 27) {
                int var1 = class268.field4020.method2778(15, (byte) -95);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class447.field6512[var1] == null) {
                        class447.field6512[var1] = new class98();
                        class447.field6512[var1].field5657 = var1;
                        var2 = true;
                    }
                    class98 var3 = class447.field6512[var1];
                    class416.field6027[class156.field2376++] = var1;
                    var3.field5627 = class267.field4002;
                    if (var3.field1545 != null && var3.field1545.method71(true)) {
                        class7.method46((byte) -100, var3);
                    }
                    int var4 = class268.field4020.method2778(5, (byte) -95);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class139.field2206[class268.field4020.method2778(3, (byte) -95)];
                    int var6 = class268.field4020.method2778(5, (byte) -95);
                    var3.method817(class371.method2357(class268.field4020.method2778(14, (byte) -95), -13299), 17671);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class268.field4020.method2778(1, (byte) -95);
                    if (var7 == 1) {
                        class218.field3229[class176.field2619++] = var1;
                    }
                    int var8 = class268.field4020.method2778(1, (byte) -95);
                    var3.method2474(false, var3.field1545.field174);
                    var3.field5650 = var3.field1545.field143 << 3;
                    if (var3.field5650 == 0) {
                        var3.method2475(false, 0);
                    } else if (var2) {
                        var3.method2475(false, var5);
                    }
                    var3.method2471((byte) 69, class86.field1394.field5694[0] + var4, var3.method1070((byte) -50), class86.field1394.field5696[0] + var6, var8 == 1, class367.field5213);
                    if (var3.field1545.method71(true)) {
                        class402.method2554(var3.field5694[0], class367.field5213, (class127) null, 0, var3.field5696[0], (class45) null, (byte) -81, var3);
                    }
                    continue;
                }
            }
            field432++;
            class268.field4020.method2779(-89);
            if (arg0 < 51) {
                method226(16);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIII)V", line = 215)
    public static final void method231(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class197.field2878 == 1) {
            class387.field5545[class342.field4848 / 100].method2645(class169.field2519 - 8, class205.field3004 + -8);
        }
        if (arg2 != 29158) {
            method231(19, 123, 65, 7, -111);
        }
        field431++;
        if (class197.field2878 == 2) {
            class387.field5545[(class342.field4848 / 100) + 4].method2645(class169.field2519 - 8, class205.field3004 + -8);
        }
        class255.method1844(true);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)V", line = 236)
    public static final void method232(int arg0, int arg1, int arg2, int arg3) {
        if (class28.field412 != null) {
            class28.field412[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
        }
    }
}
