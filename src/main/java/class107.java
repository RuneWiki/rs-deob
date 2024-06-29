import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class107 {

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "Lfg;")
    public static class84 field1519 = new class84(15, 0, 1, 0);

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "[B")
    public static byte[] field1523 = new byte[2048];

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "B")
    public byte field1504;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "B")
    public byte field1505;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "B")
    public byte field1506;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "B")
    public byte field1507;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "B")
    public byte field1518;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "B")
    public byte field1520;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "B")
    public byte field1524;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public int field1512;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public int field1513;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "S")
    public short field1499;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Z")
    public boolean field1500;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Z")
    public boolean field1509;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "Z")
    public boolean field1510;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "Z")
    public boolean field1511;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "Z")
    public boolean field1514;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "Z")
    public boolean field1515;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "Z")
    public boolean field1516;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "Z")
    public boolean field1517;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "Z")
    public boolean field1521;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "Z")
    public boolean field1522;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method682(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 >= -80) {
            method685(-73, -97, 88, null);
        }
        field1502++;
        int var8 = arg7 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class542.field7920 - class84.field1231) * var8 / 100 + class84.field1231;
        int var10 = arg1 * var9 >> 8;
        int var11 = 16384 - arg0 & 0x3FFF;
        int var12 = 16384 - arg4 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class428.field6502[var11] * -var10 >> 15;
            var15 = class428.field6501[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class428.field6502[var12] * var15 >> 15;
            var15 = class428.field6501[var12] * var15 >> 15;
        }
        class296.field4378 = arg0;
        class26.field384 = arg5 - var14;
        class199.field2646 = arg6 - var13;
        class49.field702 = arg4;
        class140.field1869 = arg2 - var15;
        class334.field5197 = 0;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)Z")
    public static final boolean method683(int arg0, int arg1) {
        field1501++;
        if (arg0 >= -112) {
            return false;
        } else {
            return arg1 == 3 || arg1 == 4;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZBLdq;Ljava/lang/String;Z)V")
    public static final void method684(boolean arg0, byte arg1, class500 arg2, String arg3, boolean arg4) {
        if (arg1 < 55) {
            field1519 = null;
        }
        field1508++;
        if (!arg4) {
            class276.method1779(arg3, arg2, 3, 0);
            return;
        }
        if (class500.field7386.startsWith("win") && class500.field7379 != 3) {
            String var5 = null;
            if (arg2.field7381 != null) {
                var5 = arg2.field7381.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class234 var6 = class276.method1779(arg3, arg2, 0, 0);
                class91.field1319 = arg2;
                class430.field6548 = var6;
                class250.field3480 = arg3;
                return;
            }
        }
        if (class500.field7386.startsWith("mac")) {
            String var7 = null;
            if (arg2.field7381 != null) {
                var7 = arg2.field7381.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg0) {
                class276.method1779(arg3, arg2, 1, 0);
                return;
            }
        }
        class276.method1779(arg3, arg2, 2, 0);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIILuu;)Lji;")
    public static final class441 method685(int arg0, int arg1, int arg2, class191 arg3) {
        field1503++;
        class164 var4 = new class164(arg3.method1281(arg0, arg2, 65));
        if (arg1 <= 77) {
            method684(true, (byte) 58, null, null, true);
        }
        class441 var5 = new class441(arg2, var4.method1064(false), var4.method1064(false), var4.method1099(-110), var4.method1099(-111), var4.method1087(false) == 1, var4.method1087(false), var4.method1087(false));
        int var6 = var4.method1087(false);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field6637.method453((byte) 103, new class345(var4.method1087(false), var4.method1074(-635989152), var4.method1074(-635989152), var4.method1074(-635989152), var4.method1074(-635989152), var4.method1074(-635989152), var4.method1074(-635989152), var4.method1074(-635989152), var4.method1074(-635989152)));
        }
        var5.method2668(74);
        return var5;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static void method686(int arg0) {
        field1519 = null;
        if (arg0 == 0) {
            field1523 = null;
        }
    }
}
