import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class79 extends class73 {

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public int field1383 = -1;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public int field1387 = 0;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public static int field1376 = 0;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "Lli;")
    public static class185 field1370 = class245.method1649(")4a=", 125);

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "S")
    public static short field1381 = 32767;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "Lli;")
    public static class185 field1382 = class245.method1649("settings=", -111);

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "[S")
    public static short[] field1377 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "I")
    public static int field1388 = 0;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public int field1367;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public int field1368;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public int field1369;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public int field1372;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public int field1375;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public int field1378;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public int field1379;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public int field1384;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public int field1385;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public int field1386;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public static void method510(byte arg0) {
        field1377 = null;
        field1370 = null;
        int var1 = -108 % ((arg0 - 49) / 45);
        field1382 = null;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)I")
    public static final int method511(byte arg0) {
        if (arg0 != -78) {
            method510((byte) -30);
        }
        field1371++;
        return class171.field3157;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)I")
    public static final int method512(int arg0, int arg1) {
        field1389++;
        if (arg0 >= -48) {
            field1381 = -116;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)Lli;")
    public static final class185 method513(int arg0, int arg1, int arg2) {
        field1374++;
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return class278.field4943;
        } else if (var3 < -6) {
            return class249.field4420;
        } else if (var3 < -3) {
            return class82.field1624;
        } else if (var3 < 0) {
            return class227.field4140;
        } else if (var3 > 9) {
            return class225.field4125;
        } else if (var3 > 6) {
            return class216.field3957;
        } else {
            if (arg1 < 48) {
                field1381 = 74;
            }
            if (var3 > 3) {
                return class123.field2222;
            } else if (var3 > 0) {
                return class181.field3332;
            } else {
                return class127.field2284;
            }
        }
    }
}
