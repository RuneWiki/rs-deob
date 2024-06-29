import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class62 {

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field950 = 0;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Z")
    public static boolean field955 = false;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "[B")
    public static byte[] field959 = new byte[520];

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Z")
    public static boolean field954;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "[I")
    public static int[] field957;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(J[IIZ)Ljava/lang/String;", line = 4)
    public static final String method620(long arg0, int[] arg1, int arg2, boolean arg3) {
        field953++;
        if (class83.field1194 != null) {
            String var5 = class83.field1194.method106(arg2, (byte) 124, arg0, arg1);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg3) {
            field955 = true;
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIII)V", line = 35)
    public static final void method621(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field958++;
        if (class224.field3509 == arg1 || arg0 == 0 || class181.field2851 >= 50 || arg2 == -1) {
            return;
        }
        class173.field2745[class181.field2851] = arg2;
        class192.field3023[class181.field2851] = arg0;
        class228.field3557[class181.field2851] = arg4;
        class201.field3108[class181.field2851] = null;
        class297.field4618[class181.field2851] = 0;
        class43.field694[class181.field2851] = arg3;
        class181.field2851++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 55)
    public static void method622(int arg0) {
        field957 = null;
        field959 = null;
        int var1 = -128 % ((-arg0 - 43) / 43);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)V", line = 70)
    public static final void method623(int arg0, boolean arg1) {
        class294.field4577 = 0;
        class351.field5613 = (byte[][][]) null;
        class122.field1950 = null;
        class351.field5608 = (byte[][][]) null;
        class351.field5609 = (int[][][]) null;
        class351.field5618 = (byte[][][]) null;
        class128.field2131 = null;
        if (arg1 && class351.field5602 != null) {
            class192.field3028 = class351.field5602.field885;
        } else {
            class192.field3028 = -1;
        }
        field949++;
        class351.field5612 = (byte[][][]) null;
        class351.field5617 = (byte[][][]) null;
        class351.field5602 = null;
        class351.field5616 = (int[][][]) null;
        class351.field5607 = null;
        class351.field5599.method440(1906703368);
        client.field1848 = null;
        class66.field1000 = null;
        class351.field5601 = null;
        class214.field3352 = null;
        class293.field4559 = null;
        class76.field1118 = null;
        class298.field4623 = null;
        class119.field1835 = null;
        class160.field2551 = null;
        class191.field3006 = -1;
        class114.field1754 = null;
        class36.field544 = -1;
        if (arg0 != 25821) {
            return;
        }
        class76.field1117 = null;
        class177.method1387((byte) -118);
        class50.field783 = null;
        class338.field5202 = null;
        class301.field4683 = null;
        class255.method1890(128, 64, -89);
        class309.method2203(64, 64, false);
        class48.method467(4096, 64);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)V", line = 123)
    public static final void method624(byte arg0, int arg1) {
        field960++;
        int var2 = -80 / ((arg0 + 39) / 33);
        class138 var3 = class149.method1242(arg1, 0, 11);
        var3.method1152(124);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Z", line = 138)
    public static final boolean method625(int arg0, int arg1, int arg2) {
        int var3 = class76.field1115[arg0][arg1][arg2];
        if (-class105.field1577 == var3) {
            return false;
        } else if (class105.field1577 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class112.method965(var4 + 1, class277.field4290[arg0][arg1][arg2], var5 + 1) && class112.method965(var4 + 128 - 1, class277.field4290[arg0][arg1 + 1][arg2], var5 + 1) && class112.method965(var4 + 128 - 1, class277.field4290[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class112.method965(var4 + 1, class277.field4290[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class76.field1115[arg0][arg1][arg2] = class105.field1577;
                return true;
            } else {
                class76.field1115[arg0][arg1][arg2] = -class105.field1577;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([BZ)Lvd;", line = 165)
    public static final class72 method626(byte[] arg0, boolean arg1) {
        class72 var2 = new class72();
        field951++;
        class25 var3 = new class25(arg0);
        var3.field397 = var3.field448.length - 2;
        if (!arg1) {
            method626((byte[]) null, false);
        }
        int var4 = var3.method314((byte) 90);
        int var5 = var3.field448.length - var4 - 2 - 12;
        var3.field397 = var5;
        int var6 = var3.method262((byte) 91);
        var2.field1071 = var3.method314((byte) 64);
        var2.field1078 = var3.method314((byte) 92);
        var2.field1072 = var3.method314((byte) 82);
        var2.field1083 = var3.method314((byte) 53);
        int var7 = var3.method281(44);
        if (var7 > 0) {
            var2.field1079 = new class37[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method314((byte) 62);
                class37 var10 = new class37(class261.method1918(var9, 22));
                var2.field1079[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method262((byte) 127);
                    int var12 = var3.method262((byte) 105);
                    var10.method375(new class164(var12), (long) var11, 104);
                }
            }
        }
        int var13 = 0;
        var3.field397 = 0;
        var2.field1081 = var3.method255(0);
        var2.field1084 = new int[var6];
        var2.field1070 = new String[var6];
        var2.field1076 = new int[var6];
        while (var5 > var3.field397) {
            int var14 = var3.method314((byte) 72);
            if (var14 == 3) {
                var2.field1070[var13] = var3.method297((byte) -74).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field1084[var13] = var3.method281(116);
            } else {
                var2.field1084[var13] = var3.method262((byte) 11);
            }
            var2.field1076[var13++] = var14;
        }
        return var2;
    }
}
