import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class68 {

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "Lce;")
    public static class126 field1127 = class206.method1445(-7923, "<col=ff7000>");

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "J")
    public long field1117;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "Lrm;")
    public static class172 field1123;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "Lcc;")
    public static class313 field1124;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "Lei;")
    public class68 field1114;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "Lei;")
    public class68 field1129;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "Z")
    public static boolean field1121;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "[I")
    public static int[] field1125;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V", line = 5)
    public static final void method493(byte arg0) {
        field1115++;
        int var1 = class105.field1657;
        int var2 = class301.field5009;
        int var3 = class228.field3850;
        if (arg0 <= 55) {
            method498(65, 89);
        }
        int var4 = 6116423;
        int var5 = class17.field236;
        if (class56.field846) {
            class101.method689(var1, var3, var2, var5, var4);
            class101.method689(var1 + 1, var3 + 1, var2 - 2, 16, 0);
            class101.method681(var1 + 1, var3 + 18, var2 - 2, var5 + -19, 0);
        } else {
            class276.method1844(var1, var3, var2, var5, var4);
            class276.method1844(var1 + 1, var3 + 1, var2 - 2, 16, 0);
            class276.method1842(var1 + 1, var3 + 18, var2 - 2, var5 + -19, 0);
        }
        class200.field3414.method2135(class166.field2961, var1 + 3, var3 + 14, var4, -1);
        int var6 = class138.field2493;
        int var7 = class260.field4366;
        for (int var8 = 0; var8 < class173.field3067; var8++) {
            int var9 = (class173.field3067 - var8 - 1) * 15 + var3 + 31;
            int var10 = 16777215;
            if (var1 < var6 && var1 + var2 > var6 && var7 > var9 - 13 && var9 + 3 > var7) {
                var10 = 16776960;
            }
            class200.field3414.method2135(class202.method1426(22247, var8), var1 + 3, var9, var10, 0);
        }
        class182.method1307(class228.field3850, class105.field1657, class301.field5009, 125, class17.field236);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V", line = 68)
    public static void method494(int arg0) {
        field1124 = null;
        field1127 = null;
        field1123 = null;
        if (arg0 == -4928) {
            field1125 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)I", line = 83)
    public static final int method495(byte arg0) {
        if (arg0 >= -12) {
            method497(50, 66);
        }
        field1126++;
        return ((class159.field2866 == 0 ? 0 : 1) << 21) + ((class69.field1144 == 0 ? 0 : 1) << 20) + ((class280.field4660 ? 1 : 0) << 19) + ((class40.field640 ? 1 : 0) << 15) + ((class249.field4166 ? 1 : 0) << 13) + ((class44.field684 ? 1 : 0) << 9) + ((class74.field1200 ? 1 : 0) << 8) + ((class94.field1474 ? 1 : 0) << 7) + ((class214.field3644 ? 1 : 0) << 6) + ((class44.field677 ? 1 : 0) << 5) + ((class301.field5016 ? 1 : 0) << 4) + (class287.field4776 & 0x7) + ((class205.field3523 == 0 ? 0 : 1) << 22) + (class211.method1473() << 23) - (-((class91.field1424 ? 1 : 0) << 3) + -((class32.field472 ? 1 : 0) << 10)) - (-((class55.field836 & 0x3) << 11) - ((class13.field172 ? 1 : 0) << 16));
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)Z", line = 102)
    public final boolean method496(boolean arg0) {
        field1119++;
        if (this.field1114 == null) {
            return false;
        } else {
            if (!arg0) {
                method498(-93, -83);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V", line = 117)
    public static final void method497(int arg0, int arg1) {
        class245 var2 = class139.method1022(arg1, (byte) -90, arg0);
        field1113++;
        var2.method1682(122);
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)Ljg;", line = 130)
    public static final class137 method498(int arg0, int arg1) {
        if (arg0 <= 11) {
            field1121 = false;
        }
        class137 var2 = (class137) class254.field4264.method1173(-19839, (long) arg1);
        field1122++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class317.field5437.method2173(class150.method1121(arg1, -7634), class117.method765(121, arg1), (byte) -86);
        class137 var4 = new class137();
        var4.field2431 = arg1;
        if (var3 != null) {
            var4.method994(new class134(var3), (byte) 126);
        }
        var4.method997(7641);
        if (var4.field2368 != -1) {
            var4.method1003(method498(27, var4.field2368), method498(39, var4.field2436), (byte) 107);
        }
        if (var4.field2433 != -1) {
            var4.method1001(method498(61, var4.field2429), method498(52, var4.field2433), 0);
        }
        if (!class5.field66 && var4.field2387) {
            var4.field2405 = null;
            var4.field2430 = null;
            var4.field2396 = class124.field2101;
            var4.field2404 = 0;
            var4.field2402 = false;
        }
        class254.field4264.method1179(var4, (long) arg1, (byte) -72);
        return var4;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)V", line = 174)
    public final void method499(byte arg0) {
        field1120++;
        if (this.field1114 == null) {
            return;
        }
        this.field1114.field1129 = this.field1129;
        this.field1129.field1114 = this.field1114;
        if (arg0 == 64) {
            this.field1114 = null;
            this.field1129 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIILcc;)Lvj;", line = 201)
    public static final class184 method500(int arg0, int arg1, int arg2, class313 arg3) {
        if (arg2 > -30) {
            return (class184) null;
        } else {
            field1128++;
            return class298.method2012(arg0, (byte) -110, arg3, arg1) ? class263.method1771(-83) : null;
        }
    }
}
