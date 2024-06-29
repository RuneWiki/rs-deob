import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class76 {

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lsd;")
    private static class166 field1549 = class135.method935("glow3:", 0);

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Lsd;")
    public static class166 field1551 = class135.method935("Ung-Ultige Session)2ID)3", 0);

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Lsd;")
    public static class166 field1550 = class135.method935("Sie befinden sich in einem Mitglieder)2Gebiet(Q", 0);

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Lsd;")
    public static class166 field1552 = field1549;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Lsd;")
    public static class166 field1553 = field1549;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Lre;")
    public static class158 field1547;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
    public static final void method630(int arg0, int arg1, int arg2) {
        if (arg1 >= -41) {
            method632((byte) 106);
        }
        field1546++;
        if (class67.field1366 != 0 && class67.field1366 != 3 || class2.field18 != 1) {
            return;
        }
        int var3 = class57.field1174 - arg2 - 5;
        int var4 = class69.field1409 - arg0 - 25;
        if (var4 < 0 || var3 < 0 || var4 >= 146 || var3 >= 151) {
            return;
        }
        var3 -= 75;
        var4 -= 73;
        int var5 = client.field515 + class132.field2590 & 0x7FF;
        int var6 = class40.field719[var5];
        int var7 = class40.field717[var5];
        int var8 = (class193.field3731 + 256) * var7 >> 8;
        int var9 = (class193.field3731 + 256) * var6 >> 8;
        int var10 = var3 * var8 + var4 * var9 >> 11;
        int var11 = var3 * var9 - var4 * var8 >> 11;
        int var12 = class41.field728.field3526 + var10 >> 7;
        int var13 = class41.field728.field3513 - var11 >> 7;
        boolean var14 = class6.method39(class41.field728.field3521[0], 0, 0, 0, (byte) -106, var13, true, var12, 0, 1, class41.field728.field3554[0], 0);
        if (!var14) {
            return;
        }
        class156.field2989.method429(var4, (byte) 98);
        class156.field2989.method429(var3, (byte) 104);
        class156.field2989.method407((byte) -126, client.field515);
        class156.field2989.method429(57, (byte) 115);
        class156.field2989.method429(class132.field2590, (byte) 127);
        class156.field2989.method429(class193.field3731, (byte) 109);
        class156.field2989.method429(89, (byte) 97);
        class156.field2989.method407((byte) -127, class41.field728.field3526);
        class156.field2989.method407((byte) -126, class41.field728.field3513);
        class156.field2989.method429(class203.field4002, (byte) 94);
        class156.field2989.method429(63, (byte) 104);
        return;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([BII)I")
    public static final int method631(byte[] arg0, int arg1, int arg2) {
        field1548++;
        int var3 = -89 % ((arg1 - 45) / 37);
        return class108.method792(arg2, 0, arg0, 50);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static void method632(byte arg0) {
        field1552 = null;
        field1550 = null;
        field1553 = null;
        if (arg0 < 62) {
            field1549 = null;
        }
        field1547 = null;
        field1551 = null;
        field1549 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)Z")
    public static final boolean method633(int arg0, byte arg1) {
        int var2 = -32 / ((62 - arg1) / 57);
        field1554++;
        return arg0 >= 48 && arg0 <= 57;
    }
}
