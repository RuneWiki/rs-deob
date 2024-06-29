import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class294 extends class34 {

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
    public int field5112 = 0;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "Lvm;")
    public static class297 field5107 = new class297(64);

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
    public static int field5114 = 0;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "Lke;")
    public static class256 field5116 = class316.method2202("settings", 27626);

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "Lvm;")
    public static class297 field5115 = new class297(5);

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "Lke;")
    private static class256 field5118 = class316.method2202(" has logged out)3", 27626);

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "Lke;")
    public static class256 field5117 = field5118;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "Lng;")
    public static class138 field5109;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)I", line = 4)
    public static final int method2060(byte arg0) {
        if (arg0 != -105) {
            return -115;
        }
        field5113++;
        if ((double) class45.field843 == 3.0D) {
            return 37;
        } else if ((double) class45.field843 == 4.0D) {
            return 50;
        } else if ((double) class45.field843 == 6.0D) {
            return 75;
        } else if ((double) class45.field843 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILra;)V", line = 31)
    public final void method2061(int arg0, class41 arg1) {
        field5111++;
        while (true) {
            int var3 = arg1.method357(false);
            if (var3 == 0) {
                if (arg0 != -1) {
                    this.field5112 = 95;
                }
                return;
            }
            this.method2062((byte) -69, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BILra;)V", line = 62)
    private final void method2062(byte arg0, int arg1, class41 arg2) {
        if (arg0 == -69) {
            if (arg1 == 2) {
                this.field5112 = arg2.method346(-16);
            }
            field5106++;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)Ltd;", line = 79)
    public static final class189 method2063(int arg0, int arg1) {
        class189 var2 = (class189) class44.field819.method1260(-117, (long) arg0);
        field5108++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class72.field1326.method1016(0, 100, arg0 & 0x7FFF);
        } else {
            var3 = field5109.method1016(0, 100, arg0);
        }
        class189 var4 = new class189();
        if (var3 != null) {
            var4.method1372(new class41(var3), (byte) -124);
        }
        int var5 = -126 % ((arg1 - 45) / 41);
        if (arg0 >= 32768) {
            var4.method1383(24991);
        }
        class44.field819.method1259(var4, (long) arg0, 0);
        return var4;
    }

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "(I)V", line = 113)
    public static void method2064(int arg0) {
        field5115 = null;
        if (arg0 != 50) {
            method2060((byte) 39);
        }
        field5109 = null;
        field5118 = null;
        field5107 = null;
        field5116 = null;
        field5117 = null;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)V", line = 133)
    public static final void method2065(int arg0, int arg1) {
        if (arg1 != 22519) {
            method2063(126, -116);
        }
        if (arg0 == -1 && !class250.field4242) {
            class98.method701(1);
        } else if (arg0 != -1 && (class250.field4248 != arg0 || !class85.method625(true)) && class38.field694 != 0 && !class250.field4242) {
            class54.method431(0, false, class38.field694, arg1 ^ 0x50F7, 2, class21.field277, arg0);
        }
        class250.field4248 = arg0;
        field5110++;
    }
}
