import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class165 {

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Lvc;")
    public static class200 field2920 = new class200();

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "Lbd;")
    public static class162 field2925 = class17.method142(0, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "Lbd;")
    public static class162 field2927 = class17.method142(0, "null");

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "Lbd;")
    public static class162 field2926 = class17.method142(0, "::serverjs5drop");

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "Lbd;")
    public static class162 field2929 = class17.method142(0, "k");

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "[Ldc;")
    public static class71[] field2924;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V", line = 28)
    public static final void method1298(byte arg0) {
        field2922++;
        if (arg0 != -20) {
            method1299((byte) -92);
        }
        class12.field190.method1529(false);
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V", line = 40)
    public static void method1299(byte arg0) {
        if (arg0 <= 84) {
            return;
        }
        field2926 = null;
        field2929 = null;
        field2924 = null;
        field2920 = null;
        field2927 = null;
        field2925 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLdj;II)V", line = 57)
    public static final void method1300(byte arg0, class39 arg1, int arg2, int arg3) {
        field2916++;
        if ((arg3 & 0x1) != 0) {
            int var4 = class63.field975.method761((byte) 108);
            int var5 = class63.field975.method756(915905888);
            int var6 = class63.field975.method735((byte) -120);
            boolean var7 = (var4 & 0x8000) != 0;
            int var8 = class63.field975.field1653;
            if (arg1.field611 != null && arg1.field600 != null) {
                long var9 = arg1.field611.method1256(0);
                boolean var11 = false;
                if (var5 <= 1) {
                    if (!var7 && (class202.field3426 == 1 || class228.field3800 == 1)) {
                        var11 = true;
                    } else {
                        for (int var12 = 0; var12 < class135.field2417; var12++) {
                            if (class112.field2026[var12] == var9) {
                                var11 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var11 && class268.field4483 == 0) {
                    class126.field2287.field1653 = 0;
                    class63.field975.method736(0, class126.field2287.field1681, 671376144, var6);
                    class126.field2287.field1653 = 0;
                    int var13 = -1;
                    class162 var14;
                    if (var7) {
                        class20 var15 = class137.method1075(false, class126.field2287);
                        var4 &= 0x7FFF;
                        var13 = var15.field322;
                        var14 = var15.field320.method659(false, class126.field2287);
                    } else {
                        var14 = class276.method1872(class223.method1615(19314, class126.field2287).method1242(2));
                    }
                    arg1.field5070 = var14.method1278(-1);
                    arg1.field5024 = var4 >> 8;
                    arg1.field5011 = var4 & 0xFF;
                    arg1.field5052 = 150;
                    if (var5 == 2) {
                        class63.method426(var7 ? 17 : 1, var13, class135.method1062(new class162[] { class196.field3353, arg1.method292(0) }, true), -1, (class162) null, var14);
                    } else if (var5 == 1) {
                        class63.method426(var7 ? 17 : 1, var13, class135.method1062(new class162[] { class48.field776, arg1.method292(0) }, true), -1, (class162) null, var14);
                    } else {
                        class63.method426(var7 ? 17 : 2, var13, arg1.method292(0), -1, (class162) null, var14);
                    }
                }
            }
            class63.field975.field1653 = var8 + var6;
        }
        if ((arg3 & 0x80) != 0) {
            int var16 = class63.field975.method707(2);
            int var17 = class63.field975.method707(2);
            arg1.method2055(var17, 21686, class90.field1598, var16);
            arg1.field5065 = class90.field1598 + 300;
            arg1.field5071 = class63.field975.method735((byte) -127);
        }
        if ((arg3 & 0x40) != 0) {
            arg1.field5019 = class63.field975.method711(255);
            if (arg1.field5019 == 65535) {
                arg1.field5019 = -1;
            }
        }
        if ((arg3 & 0x100) != 0) {
            arg1.field5054 = class63.field975.method707(2);
            arg1.field5032 = class63.field975.method756(915905888);
            arg1.field5035 = class63.field975.method714((byte) 34);
            arg1.field5038 = class63.field975.method714((byte) 34);
            arg1.field5049 = class63.field975.method761((byte) 108) + class90.field1598;
            arg1.field5063 = class63.field975.method711(255) + class90.field1598;
            arg1.field5009 = class63.field975.method735((byte) 119);
            arg1.field5006 = 1;
            arg1.field5022 = 0;
        }
        if ((arg3 & 0x20) != 0) {
            arg1.field5070 = class63.field975.method744((byte) 45);
            if (arg1.field5070.method1246(116, 0) == 126) {
                arg1.field5070 = arg1.field5070.method1254((byte) 95, 1);
                class82.method633(2, arg1.field5070, arg1.method292(0), 103);
            } else if (class122.field2215 == arg1) {
                class82.method633(2, arg1.field5070, arg1.method292(0), 105);
            }
            arg1.field5011 = 0;
            arg1.field5052 = 150;
            arg1.field5024 = 0;
        }
        if ((arg3 & 0x400) != 0) {
            int var18 = class63.field975.method735((byte) 34);
            int var19 = class63.field975.method756(915905888);
            arg1.method2055(var19, 21686, class90.field1598, var18);
        }
        if ((arg3 & 0x2) != 0) {
            int var20 = class63.field975.method711(255);
            if (var20 == 65535) {
                var20 = -1;
            }
            int var21 = class63.field975.method756(915905888);
            class290.method2010(-27020, arg1, var20, var21);
        }
        if ((arg3 & 0x8) != 0) {
            int var22 = class63.field975.method714((byte) 34);
            byte[] var23 = new byte[var22];
            class94 var24 = new class94(var23);
            class63.field975.method758(var23, 0, var22, 24107);
            class56.field877[arg2] = var24;
            arg1.method294(-123, var24);
        }
        int var25 = 8 % ((-arg0 - 9) / 32);
        if ((arg3 & 0x200) != 0) {
            arg1.field5029 = class63.field975.method711(255);
            int var26 = class63.field975.method729((byte) 116);
            arg1.field5048 = 0;
            arg1.field5015 = 0;
            arg1.field5033 = var26 >> 16;
            if (arg1.field5029 == 65535) {
                arg1.field5029 = -1;
            }
            arg1.field5036 = (var26 & 0xFFFF) + class90.field1598;
            if (arg1.field5036 > class90.field1598) {
                arg1.field5015 = -1;
            }
            if (arg1.field5029 != -1 && class90.field1598 == arg1.field5036) {
                int var27 = class297.method2038(-124, arg1.field5029).field674;
                if (var27 != -1) {
                    class142 var28 = class139.method1084(-50, var27);
                    if (var28 != null && var28.field2522 != null) {
                        class229.method1638(class122.field2215 == arg1, var28, 0, arg1.field5047, -648569400, arg1.field5013);
                    }
                }
            }
        }
        if ((arg3 & 0x10) != 0) {
            arg1.field5007 = class63.field975.method711(255);
            arg1.field5059 = class63.field975.method734(2);
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V", line = 286)
    public static final void method1301(byte arg0) {
        class160 var1 = new class160();
        field2921++;
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class96.field1758[var2][var3] = var1;
            }
        }
        int var4 = -85 % ((arg0 + 47) / 35);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 313)
    public static final void method1302(int arg0) {
        if (arg0 < 13) {
            method1298((byte) 7);
        }
        if (class293.field4927 == null || class31.field518 == null) {
            class293.field4927 = new int[256];
            class31.field518 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class293.field4927[var1] = (int) (Math.sin(var2) * 4096.0D);
                class31.field518[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field2917++;
    }
}
