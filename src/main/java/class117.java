import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class117 extends class593 {

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "Ldea;")
    public class405 field1904;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "Z")
    public static boolean field1902 = false;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "Lcb;")
    public static class78 field1898 = new class78(32);

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "B")
    public static byte field1900;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "Lcw;")
    public static class471 field1905;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V", line = 13)
    public static void method969(int arg0) {
        field1905 = null;
        if (arg0 != 5154) {
            method969(-97);
        }
        field1898 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V", line = 24)
    public static final void method970(int arg0, int arg1) {
        class627.method3558(-31764);
        if (arg1 != -25876) {
            method970(97, 39);
        }
        field1899++;
        int var2 = class173.field2515.method3060(-93, arg0).field6016;
        if (var2 == 0) {
            return;
        }
        int var3 = class401.field6001.field8833[arg0];
        if (var2 == 6) {
            class229.field3402 = var3;
        }
        if (var2 == 5) {
            class54.field776 = var3;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lco;I)V", line = 49)
    public static final void method971(class268 arg0, int arg1) {
        field1903++;
        if (arg0.field3952.length - arg0.field3913 < 1) {
            return;
        }
        if (arg1 != 3) {
            method972(true);
        }
        int var2 = arg0.method1738(255);
        if (var2 < 0 || var2 > 1 || (arg0.field3952.length - arg0.field3913) < 2) {
            return;
        }
        int var3 = arg0.method1745(arg1 + 32129);
        if ((arg0.field3952.length - arg0.field3913) < (var3 * 6)) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method1745(32132);
            int var6 = arg0.method1748(arg1 ^ 0x50);
            if (var5 < class310.field4551.length && class459.field6618[var5] && (class524.field7287.method3670(var5, true).field287 != '1' || var6 >= -1 && var6 <= 1)) {
                class310.field4551[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lnd;II[B)V", line = 98)
    public class117(class632 arg0, int arg1, int arg2, byte[] arg3) {
        this.field1904 = arg0.method3596(arg1, arg2, false, 0, arg3, class384.field5715);
        this.field1904.method1535(false, false, -61);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V", line = 115)
    public static final void method972(boolean arg0) {
        class79.field1434.method425(-105);
        field1901++;
        for (class587 var1 = (class587) class432.field6356.method427(arg0); var1 != null; var1 = (class587) class432.field6356.method420(false)) {
            if (var1.field8359 < 1000) {
                var1.method911(-52);
                class79.field1434.method414(var1, (byte) 104);
            }
        }
        class79.field1434.method426((byte) 106, class432.field6356);
        if (class480.field6825 <= 1) {
            class634.field9212 = null;
        } else if (class99.field1724 && class404.field6022.method2183(81, false) && class480.field6825 > 2) {
            class634.field9212 = (class587) class432.field6356.field659.field1800.field1800;
        } else {
            class634.field9212 = (class587) class432.field6356.field659.field1800;
        }
        int var2 = -1;
        class7 var3 = (class7) class360.field5112.method427(arg0);
        if (var3 != null) {
            var2 = var3.method25(26999);
        }
        if (!class2.field20) {
            if (var2 == 0 && (class54.field776 == 1 && class480.field6825 > 2 || class55.method454((byte) -118))) {
                var2 = 2;
            }
            if (var2 == 2 && class480.field6825 > 0 && var3 != null) {
                if (class311.field4557 == null && class551.field7807 == 0) {
                    class355.method2159(var3.method26(arg0), var3.method27(false), (byte) 116);
                } else {
                    class359.field5100 = 2;
                }
            }
            if (var2 == 0 && class480.field6825 > 0) {
                class643.method3706(false);
            }
            if (class311.field4557 == null && class551.field7807 == 0) {
                class361.field5125 = null;
                class359.field5100 = 0;
                return;
            }
            return;
        }
        if (var2 == -1) {
            int var4 = class619.field8735.method1614((byte) -46);
            int var5 = class619.field8735.method1607((byte) -78);
            if ((class270.field3975 - 10) > var4 || class526.field7324 + class270.field3975 + 10 < var4 || var5 < class6.field49 - 10 || var5 > (class6.field49 + class354.field5064 + 10)) {
                class576.method3296((byte) -125);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class270.field3975;
        int var7 = class6.field49;
        int var8 = class526.field7324;
        int var9 = var3.method27(false);
        int var10 = var3.method26(true);
        int var11 = -1;
        for (int var12 = 0; var12 < class480.field6825; var12++) {
            if (class255.field3709) {
                int var17 = var7 + ((class480.field6825 - var12 + -1) * 16) + 33;
                if (var6 < var9 && (var6 + var8) > var9 && var17 - 13 < var10 && var10 < var17 + 4) {
                    var11 = var12;
                }
            } else {
                int var16 = (class480.field6825 - var12 - 1) * 16 + var7 + 31;
                if (var9 > var6 && var9 < (var6 + var8) && var10 > (var16 - 13) && (var16 + 3) > var10) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class300 var14 = new class300(class432.field6356);
            for (class587 var15 = (class587) var14.method1877(-19613); var15 != null; var15 = (class587) var14.method1876(0)) {
                if (var11 == var13) {
                    class127.method1001(82, var15, var10, var9);
                }
                var13++;
            }
        }
        class576.method3296((byte) 116);
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lnd;II[I)V", line = 273)
    public class117(class632 arg0, int arg1, int arg2, int[] arg3) {
        this.field1904 = arg0.method3587(false, arg2, arg3, arg1, (byte) -98);
        this.field1904.method1535(false, false, -61);
    }
}
