import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class247 {

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Lei;")
    private class175 field3964 = new class175();

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Leb;")
    public static class103 field3969 = null;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "[Z")
    public static boolean[] field3975 = new boolean[112];

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Leb;")
    public static class103 field3976;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Lch;")
    public static class125 field3968;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Lei;")
    private class175 field3971;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "Lfe;")
    public static class218 field3977;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg3 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg4;
            arg4 = var7;
        }
        int var8 = arg5 & 0x3;
        int var9 = -85 / ((17 - arg2) / 63);
        field3970++;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return 7 - arg1 - (arg0 - 1);
        } else if (var8 == 2) {
            return 7 + 1 - arg4 - arg6;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BLmc;Z)V")
    public static final void method1629(byte arg0, class163 arg1, boolean arg2) {
        field3974++;
        if (arg2) {
            int var3 = class97.field1469;
            int var4 = var3 * 956 / 503;
            class273.field4409.method163((class107.field1856 - var4) / 2, 0, var4, var3);
            class172.field2782.method533(class107.field1856 / 2 - (class172.field2782.field3434 / 2), 18);
        }
        arg1.method1137(class124.field2070, class107.field1856 / 2, class97.field1469 / 2 - 26, 16777215, -1);
        int var5 = class97.field1469 / 2 - 18;
        if (arg0 != -48) {
            field3976 = null;
        }
        class63.method510(class107.field1856 / 2 - 152, var5, 304, 34, 9179409);
        class63.method510(class107.field1856 / 2 - 151, var5 + 1, 302, 32, 0);
        class63.method507(class107.field1856 / 2 - 150, var5 + 2, class152.field2456 * 3, 30, 9179409);
        class63.method507(class107.field1856 / 2 + class152.field2456 * 3 - 150, var5 + 2, 300 - (class152.field2456 * 3), 30, 0);
        arg1.method1137(class92.field1314, class107.field1856 / 2, class97.field1469 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1630(String arg0, byte arg1, String arg2, String arg3) {
        field3967++;
        int var4 = arg3.length();
        int var5 = arg2.length();
        int var6 = arg0.length();
        if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        int var7 = var4;
        int var8 = var6 - var5;
        if (var8 != 0) {
            int var9 = 0;
            while (true) {
                int var10 = arg3.indexOf(arg2, var9);
                if (var10 < 0) {
                    break;
                }
                var7 += var8;
                var9 = var5 + var10;
            }
        }
        int var11 = 0;
        StringBuffer var12 = new StringBuffer(var7);
        if (arg1 < 79) {
            field3975 = null;
        }
        while (true) {
            int var13 = arg3.indexOf(arg2, var11);
            if (var13 < 0) {
                var12.append(arg3.substring(var11));
                return var12.toString();
            }
            var12.append(arg3.substring(var11, var13));
            var11 = var13 + var5;
            var12.append(arg0);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public final void method1631(byte arg0) {
        while (true) {
            class175 var2 = this.field3964.field2816;
            if (this.field3964 == var2) {
                this.field3971 = null;
                field3978++;
                if (arg0 >= -90) {
                    method1629((byte) 12, (class163) null, false);
                    return;
                }
                return;
            }
            var2.method1213(true);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BIILeb;)V")
    public static final void method1632(byte arg0, int arg1, int arg2, class103 arg3) {
        field3973++;
        if (class202.field3248 < 2 && class262.field4151 == 0 && !class290.field4632) {
            return;
        }
        if (arg0 != -75) {
            method1637((byte) 22);
        }
        String var4 = class76.method578((byte) -121);
        if (arg3 == null) {
            int var6 = class283.field4524.method1117(var4, arg2 + 4, arg1 + 15, 16777215, 0, class130.field2173, class297.field4697);
            class134.method944(15, arg1, var6 + class283.field4524.method1119(var4), arg2 + 4, false);
            return;
        }
        class163 var5 = arg3.method727(arg0 ^ 0x31, class235.field3756);
        if (var5 == null) {
            var5 = class283.field4524;
        }
        var5.method1125(var4, arg2, arg1, arg3.field1691, arg3.field1693, arg3.field1713, arg3.field1714, arg3.field1641, arg3.field1676, class130.field2173, class297.field4697, class207.field3350);
        class134.method944(class207.field3350[3], class207.field3350[1], class207.field3350[2], class207.field3350[0], false);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)Lei;")
    public final class175 method1633(byte arg0) {
        if (arg0 != -71) {
            return null;
        }
        class175 var2 = this.field3964.field2816;
        field3966++;
        if (this.field3964 == var2) {
            return null;
        } else {
            var2.method1213(true);
            return var2;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BLei;)V")
    public final void method1634(byte arg0, class175 arg1) {
        if (arg0 < 10) {
            method1637((byte) -72);
        }
        if (arg1.field2812 != null) {
            arg1.method1213(true);
        }
        arg1.field2816 = this.field3964;
        field3963++;
        arg1.field2812 = this.field3964.field2812;
        arg1.field2812.field2816 = arg1;
        arg1.field2816.field2812 = arg1;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)Lei;")
    public final class175 method1635(int arg0) {
        field3961++;
        if (arg0 >= -11) {
            this.method1636((byte) 105);
        }
        class175 var2 = this.field3964.field2816;
        if (this.field3964 == var2) {
            this.field3971 = null;
            return null;
        } else {
            this.field3971 = var2.field2816;
            return var2;
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
    public class247() {
        this.field3964.field2816 = this.field3964;
        this.field3964.field2812 = this.field3964;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(B)Lei;")
    public final class175 method1636(byte arg0) {
        field3962++;
        if (arg0 > -88) {
            field3972 = -71;
        }
        class175 var2 = this.field3971;
        if (this.field3964 == var2) {
            this.field3971 = null;
            return null;
        } else {
            this.field3971 = var2.field2816;
            return var2;
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(B)V")
    public static void method1637(byte arg0) {
        field3968 = null;
        field3969 = null;
        field3975 = null;
        field3977 = null;
        field3976 = null;
        int var1 = 8 / ((-arg0 - 52) / 55);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)I")
    public final int method1638(int arg0) {
        field3965++;
        int var2 = 0;
        for (class175 var3 = this.field3964.field2816; var3 != this.field3964; var3 = var3.field2816) {
            var2++;
        }
        if (arg0 != 1) {
            this.field3964 = null;
        }
        return var2;
    }
}
