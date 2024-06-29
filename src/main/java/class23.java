import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class23 extends class176 {

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "[S")
    public static short[] field283 = new short[256];

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field289 = 3;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "Lek;")
    public static class295 field287 = new class295();

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "C")
    public char field298;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public int field284;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public int field291;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "J")
    public long field294;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Lud;")
    public class23 field288;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "Z")
    public boolean field295;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)I", line = 6)
    public final int method161(int arg0) {
        field297++;
        if (arg0 != -1) {
            field300 = -70;
        }
        return this.field291;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)C", line = 27)
    public final char method162(int arg0) {
        field290++;
        return (char) (arg0 == 0 ? this.field298 : 65447);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)J", line = 41)
    public final long method163(byte arg0) {
        if (arg0 == 39) {
            field293++;
            return this.field294;
        } else {
            return -79L;
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)Z", line = 53)
    public final boolean method164(int arg0) {
        field296++;
        if (arg0 != -1) {
            method168((class134) null, 73);
        }
        return this.field295;
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V", line = 70)
    public static void method165(int arg0) {
        if (arg0 != 2) {
            method166(-98, 23, 54);
        }
        field287 = null;
        field283 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V", line = 81)
    public static final void method166(int arg0, int arg1, int arg2) {
        field299++;
        if (arg0 != -1932894386) {
            field300 = 43;
        }
        class288 var3 = new class288(16);
        for (class282 var4 = (class282) class330.field4663.method1884(0); var4 != null; var4 = (class282) class330.field4663.method1890(-1)) {
            var4.method2594((byte) -22);
            int var5 = (int) (var4.field5855 >> 28);
            int var6 = (int) (var4.field5855 >> 14 & 0x3FFFL) - arg2;
            int var7 = (int) (var4.field5855 & 0x3FFFL) - arg1;
            if (var7 >= 0 && var6 >= 0 && class176.field2403 > var7 && var6 < class383.field5395) {
                var3.method1886(var4, (long) (var7 | var5 << 28 | var6 << 14), 1);
            }
        }
        class330.field4663 = var3;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)I", line = 117)
    public final int method167(byte arg0) {
        if (arg0 != 96) {
            this.field295 = true;
        }
        field292++;
        return this.field284;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lae;I)V", line = 133)
    public static final void method168(class134 arg0, int arg1) {
        if (arg1 < 92) {
            method165(-55);
        }
        field286++;
        int var2 = class8.field120;
        int var3 = class379.field5341;
        int var4 = class113.field1393;
        int var5 = class302.field4246 - 3;
        byte var6 = 20;
        if (class261.field3722 == null || class383.field5402 == null) {
            if (class298.field4178.method2412(class199.field2830, 123) && class298.field4178.method2412(class65.field750, 126)) {
                class261.field3722 = arg0.method596(class375.method2402(class298.field4178, class199.field2830, 0), true);
                class375 var7 = class375.method2402(class298.field4178, class65.field750, 0);
                class383.field5402 = arg0.method596(var7, true);
                var7.method2390();
                class339.field4810 = arg0.method596(var7, true);
            } else {
                arg0.method653(var2, var3, var4, var6, 255 - class131.field1592 << 24 | class211.field3005, 1);
            }
        }
        if (class261.field3722 != null && class383.field5402 != null) {
            int var8 = (var4 - class383.field5402.method765() * 2) / class261.field3722.method765();
            for (int var9 = 0; var9 < var8; var9++) {
                class261.field3722.method2446(var2 - (-class383.field5402.method765() - (var9 * class261.field3722.method765())), var3);
            }
            class383.field5402.method2446(var2, var3);
            class339.field4810.method2446(var2 + var4 - class339.field4810.method765(), var3);
        }
        class174.field2391.method1767(-1, var2 + 3, class135.field1694 | 0xFF000000, class193.field2764.method2331(25, class271.field3836), var3 + 14, 4);
        arg0.method653(var2, var3 + var6, var4, var5 - var6, class211.field3005 | -class131.field1592 + 255 << 24, 1);
        int var10 = class306.field4306.method17(20417);
        int var11 = class306.field4306.method18(1);
        for (int var12 = 0; var12 < class208.field2958; var12++) {
            int var26 = var3 + var6 - (-((-var12 + class208.field2958 + -1) * 16) + -13);
            if (var10 > var2 && (var2 + var4) > var10 && (var26 - 13) < var11 && (var26 + 4) > var11) {
                arg0.method653(var2, var26 - 12, var4, 16, 255 - class388.field5481 << 24 | class385.field5437, 1);
            }
        }
        if ((class208.field2959 == null || class73.field876 == null || class127.field1545 == null) && class298.field4178.method2412(class406.field5865, 127) && class298.field4178.method2412(class77.field918, 123) && class298.field4178.method2412(class105.field1263, 127)) {
            class375 var13 = class375.method2402(class298.field4178, class77.field918, 0);
            class73.field876 = arg0.method596(var13, true);
            var13.method2390();
            class3.field26 = arg0.method596(var13, true);
            class208.field2959 = arg0.method596(class375.method2402(class298.field4178, class406.field5865, 0), true);
            class375 var14 = class375.method2402(class298.field4178, class105.field1263, 0);
            class127.field1545 = arg0.method596(var14, true);
            var14.method2390();
            class271.field3827 = arg0.method596(var14, true);
        }
        if (class208.field2959 != null && class73.field876 != null && class127.field1545 != null) {
            int var15 = (var4 - class127.field1545.method765() * 2) / class208.field2959.method765();
            for (int var16 = 0; var16 < var15; var16++) {
                class208.field2959.method2446(var2 + class127.field1545.method765() + (class208.field2959.method765() * var16), var3 + var5 - class208.field2959.method759());
            }
            int var17 = (var5 - class127.field1545.method759() - var6) / class73.field876.method759();
            for (int var18 = 0; var18 < var17; var18++) {
                class73.field876.method2446(var2, var18 * class73.field876.method759() + var3 + var6);
                class3.field26.method2446(var2 + var4 - class3.field26.method765(), var3 + var6 + class73.field876.method759() * var18);
            }
            class127.field1545.method2446(var2, var3 + var5 - class127.field1545.method759());
            class271.field3827.method2446(var2 + var4 - class127.field1545.method765(), -class127.field1545.method759() + var3 + var5);
        }
        int var19 = 0;
        for (class302 var20 = (class302) class393.field5547.method506((byte) -128); var20 != null; var20 = (class302) class393.field5547.method514(true)) {
            int var21 = ((class208.field2958 - var19 - 1) * 16) + var3 + var6 + 13;
            int var22 = class135.field1694 | 0xFF000000;
            if (var10 > var2 && var10 < (var2 + var4) && var11 > (var21 - 13) && var11 < var21 + 4) {
                var22 = class48.field579 | 0xFF000000;
            }
            int[] var23 = null;
            if (class174.method1191(var20.field4247, (byte) -110)) {
                var23 = class50.method288(0, (int) var20.field4250).field2295;
            } else if (class422.method2666(var20.field4247, -8164)) {
                class77 var24 = class167.field2335[(int) var20.field4250];
                if (var24 != null) {
                    var23 = var24.field912.field1639;
                }
            } else if (class327.method2117(var20.field4247, 19)) {
                if (var20.field4247 == 1009) {
                    var23 = class374.method2382((int) var20.field4250, false).field1051;
                } else {
                    var23 = class374.method2382((int) (var20.field4250 >>> 32 & 0x7FFFFFFFL), false).field1051;
                }
            }
            String var25 = class359.method2309(0, var20);
            if (var23 != null) {
                var25 = var25 + class309.method2047(0, var23);
            }
            class174.field2391.method1771(class222.field3112, 0, var21, var2 + 3, var25, var22, class170.field2351, 0);
            var19++;
        }
        class254.method1716(class113.field1393, class302.field4246, class8.field120, -102, class379.field5341);
    }
}
