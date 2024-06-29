import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class215 {

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field3002 = 0;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field3000 = 0;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "Lrc;")
    public static class9 field2997 = new class9(64);

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Lbc;")
    public static class282 field3001;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "Lbc;")
    public static class282 field3004;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IBLbc;)Lck;")
    public static final class1 method1347(int arg0, byte arg1, class282 arg2) {
        field3003++;
        if (arg1 != -101) {
            method1351(-96, 101);
        }
        return class185.method1211(arg1 + 101, arg2, arg0) ? class94.method566(arg1 + 101) : null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
    public static void method1348(byte arg0) {
        field3004 = null;
        field3001 = null;
        field2997 = null;
        if (arg0 > -124) {
            field3001 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
    public static final void method1349(boolean arg0) {
        class197.method1272((byte) 80, 5);
        class181.method1177(5, 62);
        field3005++;
        class26.method152(5, 0);
        class67.method413((byte) 88, 5);
        class221.method1438(5, 69);
        class42.method268(5, 0);
        class66.method403(arg0, 5);
        class125.method815(true, 5);
        class117.method756(-91, 5);
        class114.method739(0, 5);
        class131.method862(-115, 5);
        class134.method874(5, -6003);
        class88.method516((byte) -38, 5);
        class52.method318(0, 5);
        class87.method511(5, (byte) -124);
        class285.method1905(5, 10257);
        class140.method912(32, 5);
        class271.method1737((byte) 80, 50);
        class258.method1651((byte) 65, 5);
        class41.method256(5, 121);
        class227.field3200.method62(-71, 5);
        class101.field1376.method62(-29, 5);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZII)V")
    public static final void method1350(boolean arg0, int arg1, int arg2) {
        class234 var3 = class80.field943[class199.field2833][arg1][arg2];
        field2999++;
        if (var3 == null) {
            class82.method489(class199.field2833, arg1, arg2);
            return;
        }
        class192 var4 = null;
        class192 var5 = (class192) var3.method1532(-77);
        int var6 = -99999999;
        while (var5 != null) {
            class229 var13 = class36.method224(var5.field2762.field1303, 108);
            int var14 = var13.field3254;
            if (var13.field3263 == 1) {
                var14 = (var5.field2762.field1302 + 1) * var14;
            }
            if (var14 > var6) {
                var6 = var14;
                var4 = var5;
            }
            var5 = (class192) var3.method1523(-124);
        }
        if (var4 == null) {
            class82.method489(class199.field2833, arg1, arg2);
            return;
        }
        if (arg0) {
            method1351(-48, 127);
        }
        var3.method1527(var4, 73);
        class192 var7 = (class192) var3.method1532(-95);
        class97 var8 = null;
        class97 var9 = null;
        while (var7 != null) {
            class97 var12 = var7.field2762;
            if (var4.field2762.field1303 != var12.field1303) {
                if (var8 == null) {
                    var8 = var12;
                }
                if (var8.field1303 != var12.field1303 && var9 == null) {
                    var9 = var12;
                }
            }
            var7 = (class192) var3.method1523(-99);
        }
        long var10 = (long) ((arg2 << 7) + arg1 + 1610612736);
        class234.method1529(class199.field2833, arg1, arg2, class4.method21(arg2 * 128 + 64, class199.field2833, arg1 * 128 + 64, (byte) 26), var4.field2762, var10, var8, var9);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)V")
    public static final void method1351(int arg0, int arg1) {
        field2998++;
        class72.field867 = 1000 / arg1;
        if (arg0 != 20114) {
            field3002 = -121;
        }
    }
}
