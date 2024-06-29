import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class56 {

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field1166 = 0;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Loh;")
    public static class263 field1167 = class253.method1681(-120, "null");

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Loh;")
    public static class263 field1168 = class253.method1681(-119, "Benutzen");

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZI)Loh;")
    public static final class263 method354(int arg0, boolean arg1, int arg2) {
        field1165++;
        if (arg2 != -1) {
            method354(-85, true, 99);
        }
        return class120.method778(10, arg1, (byte) 59, arg0);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBJZI)Loh;")
    public static final class263 method355(int arg0, byte arg1, long arg2, boolean arg3, int arg4) {
        if (arg1 != 84) {
            return null;
        }
        class263 var6 = class7.method46(0, arg1 - 83);
        field1164++;
        if (arg2 < 0L) {
            arg2 = -arg2;
            var6.method1760(true, class204.field3701);
        }
        class263 var7 = class41.field919;
        class263 var8 = class101.field1931;
        if (arg0 == 1) {
            var7 = class101.field1931;
            var8 = class41.field919;
        }
        if (arg0 == 2) {
            var8 = class176.field3172;
            var7 = class101.field1931;
        }
        class263 var9 = class7.method46(0, 1);
        class263 var10 = class7.method46(0, arg1 ^ 0x55);
        for (int var11 = 0; var11 < arg4; var11++) {
            var10.method1760(true, class136.method891(-66, (int) (arg2 % 10L)));
            arg2 /= 10L;
        }
        int var12 = 0;
        if (arg2 == 0L) {
            var9 = class108.field2045;
        }
        while (arg2 > 0L) {
            if (arg3 && var12 != 0 && (var12 % 3) == 0) {
                var9.method1760(true, var8);
            }
            var9.method1760(true, class136.method891(-71, (int) (arg2 % 10L)));
            arg2 /= 10L;
            var12++;
        }
        if (var10.method1740(-123) > 0) {
            var10.method1760(true, var7);
        }
        return class124.method797(-69, new class263[] { var6, var9.method1781(10086), var10.method1781(arg1 + 10002) });
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)[Lfd;")
    public static final class119[] method356(byte arg0) {
        field1163++;
        class119[] var1 = new class119[class31.field781];
        for (int var2 = 0; var2 < class31.field781; var2++) {
            var1[var2] = new class88(class240.field4200, class2.field46, class198.field3584[var2], class46.field1003[var2], class198.field3583[var2], class181.field3289[var2], class191.field3425[var2], class103.field1965);
        }
        class14.method111(0);
        int var3 = -19 / ((-arg0 - 36) / 56);
        return var1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method357(int arg0) {
        if (arg0 == 10) {
            field1167 = null;
            field1168 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZII)I")
    public static final int method358(boolean arg0, int arg1, int arg2) {
        field1169++;
        class103 var3 = (class103) class184.field3327.method31(-32665, (long) arg2);
        if (arg0) {
            return -99;
        } else if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && var3.field1964.length > arg1) {
            return var3.field1964[arg1];
        } else {
            return -1;
        }
    }
}
