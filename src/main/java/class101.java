import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class101 extends RuntimeException {

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "Ljava/lang/String;")
    public String field1318;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1323;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field1319 = 255;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "S")
    public static short field1320 = 1;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Luj;")
    public static class158 field1321;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "Lib;")
    public static class98 field1322;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "[[B")
    public static byte[][] field1316;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIBI)Lrl;", line = 12)
    public static final class74 method719(int arg0, int arg1, byte arg2, int arg3) {
        field1317++;
        class74 var4 = new class74();
        var4.field981 = arg1;
        var4.field982 = arg0;
        class272.field3900.method2275(var4, 91, (long) arg3);
        class59.method442(-117, arg0);
        class333 var5 = class89.method644(-119, arg3);
        if (var5 != null) {
            class142.method1097(-128, var5);
        }
        int var6 = 26 / ((arg2 - 67) / 38);
        if (class215.field3038 != null) {
            class142.method1097(103, class215.field3038);
            class215.field3038 = null;
        }
        int var7 = class66.field853;
        for (int var8 = 0; var8 < var7; var8++) {
            if (class274.method1861(116, class156.field2169[var8])) {
                class65.method476(false, var8);
            }
        }
        if (class66.field853 == 1) {
            class159.field2263 = false;
            class90.method648(class146.field2038, 0, class117.field1534, class209.field2967, class65.field815);
        } else {
            class90.method648(class146.field2038, 0, class117.field1534, class209.field2967, class65.field815);
            int var9 = class186.field2554.method1894(class75.field986);
            for (int var10 = 0; var10 < class66.field853; var10++) {
                int var11 = class186.field2554.method1894(class28.method184((byte) 87, var10));
                if (var9 < var11) {
                    var9 = var11;
                }
            }
            class117.field1534 = (class66.field846 ? 26 : 22) + class66.field853 * 15;
            class146.field2038 = var9 + 8;
        }
        if (var5 != null) {
            class45.method323(false, false, var5);
        }
        class71.method525(true, arg0);
        if (class233.field3340 != -1) {
            class142.method1104(class233.field3340, 1, (byte) 78);
        }
        return var4;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 91)
    public static void method720(int arg0) {
        field1322 = null;
        field1316 = (byte[][]) null;
        field1321 = null;
        if (arg0 != -16553) {
            method719(2, 79, (byte) -38, 61);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIILvc;Lvc;IIJ)V", line = 109)
    public static final void method721(int arg0, int arg1, int arg2, int arg3, class260 arg4, class260 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class231 var10 = new class231();
        var10.field3302 = arg8;
        var10.field3306 = arg1 * 128 + 64;
        var10.field3304 = arg2 * 128 + 64;
        var10.field3310 = arg3;
        var10.field3309 = arg4;
        var10.field3305 = arg5;
        var10.field3308 = arg6;
        var10.field3299 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class345.field5367[var11][arg1][arg2] == null) {
                class345.field5367[var11][arg1][arg2] = new class119(var11, arg1, arg2);
            }
        }
        class345.field5367[arg0][arg1][arg2].field1552 = var10;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 137)
    public class101(Throwable arg0, String arg1) {
        this.field1318 = arg1;
        this.field1323 = arg0;
    }
}
