import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class429 extends class168 {

    @OriginalMember(owner = "client!ifa", name = "l", descriptor = "Ljava/lang/String;")
    public String field5741;

    @OriginalMember(owner = "client!ifa", name = "k", descriptor = "[Lan;")
    public static class23[] field5740 = new class23[5];

    @OriginalMember(owner = "client!ifa", name = "j", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!ifa", name = "m", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!ifa", name = "n", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!ifa", name = "o", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!ifa", name = "p", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!ifa", name = "q", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!ifa", name = "r", descriptor = "I")
    public static int field5747;

    static {
        for (int var0 = 0; var0 < field5740.length; var0++) {
            field5740[var0] = new class23();
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BI)I", line = 4)
    public static final int method2456(byte arg0, int arg1) {
        if (arg0 > -27) {
            field5743 = -117;
        }
        field5739++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILei;I)Z", line = 17)
    public static final boolean method2457(int arg0, class180 arg1, int arg2) {
        field5745++;
        int var3 = arg1.method1235(2, -4080);
        if (var3 == 0) {
            if (arg1.method1235(1, arg2 ^ 0xD9E40298) != 0) {
                method2457(arg0, arg1, 639365768);
            }
            int var4 = arg1.method1235(6, arg2 ^ 0xD9E40298);
            int var5 = arg1.method1235(6, -4080);
            boolean var6 = arg1.method1235(1, -4080) == 1;
            if (var6) {
                class85.field1165[class322.field4152++] = arg0;
            }
            if (class5.field49[arg0] != null) {
                throw new RuntimeException("hr:lr");
            }
            class124 var7 = class32.field531[arg0];
            class724 var8 = class5.field49[arg0] = new class724();
            var8.field189 = arg0;
            if (class511.field7199[arg0] != null) {
                var8.method4046(class511.field7199[arg0], false);
            }
            var8.method86(-7554, true, var7.field1787);
            var8.field221 = var7.field1786;
            int var9 = var7.field1790;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FC507) >> 14;
            int var12 = var9 & 0xFF;
            int var13 = (var11 << 6) + var4 - class332.field4232;
            int var14 = (var12 << 6) + var5 - class447.field5936;
            var8.field10074 = var7.field1785;
            var8.field259[0] = class182.field2548[arg0];
            var8.field5796 = var8.field5793 = (byte) var10;
            if (class99.method797(var14, 1, var13)) {
                var8.field5793++;
            }
            var8.method4040(var13, arg2 ^ 0xD9E40D02, var14);
            var8.field10058 = false;
            class32.field531[arg0] = null;
            return true;
        } else if (var3 == 1) {
            int var15 = arg1.method1235(2, -4080);
            int var16 = class32.field531[arg0].field1790;
            class32.field531[arg0].field1790 = ((var16 >> 28) + var15 & 0x3 << 28) + (var16 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var17 = arg1.method1235(5, arg2 ^ 0xD9E40298);
            int var18 = var17 >> 3;
            int var19 = var17 & 0x7;
            int var20 = class32.field531[arg0].field1790;
            int var21 = (var20 >> 28) + var18 & 0x3;
            int var22 = var20 >> 14 & 0xFF;
            int var23 = var20 & 0xFF;
            if (var19 == 0) {
                var23--;
                var22--;
            }
            if (var19 == 1) {
                var23--;
            }
            if (var19 == 2) {
                var23--;
                var22++;
            }
            if (var19 == 3) {
                var22--;
            }
            if (var19 == 4) {
                var22++;
            }
            if (var19 == 5) {
                var23++;
                var22--;
            }
            if (var19 == 6) {
                var23++;
            }
            if (var19 == 7) {
                var22++;
                var23++;
            }
            class32.field531[arg0].field1790 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg1.method1235(18, -4080);
            if (arg2 != 639365768) {
                method2462((byte) 117);
            }
            int var25 = var24 >> 16;
            int var26 = (var24 & 0xFF81) >> 8;
            int var27 = var24 & 0xFF;
            int var28 = class32.field531[arg0].field1790;
            int var29 = (var28 >> 28) + var25 & 0x3;
            int var30 = (var28 >> 14) + var26 & 0xFF;
            int var31 = var27 + var28 & 0xFF;
            class32.field531[arg0].field1790 = (var29 << 28) + (var30 << 14) + var31;
            return false;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)V", line = 185)
    public static final void method2458(int arg0) {
        field5742++;
        if (arg0 != 255) {
            method2457(77, null, 93);
        }
        class571.method3275(27461, 11);
        class431.method2465(arg0 ^ 0xFFFFFF00);
        System.gc();
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IBI)V", line = 203)
    public static final void method2459(int arg0, byte arg1, int arg2) {
        if (arg1 >= -38) {
            field5740 = null;
        }
        field5744++;
        class37 var3 = class636.method3571(15, 0, -80);
        var3.method232(-3);
        var3.field582 = arg0;
        var3.field579 = arg2;
    }

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(I)Lcs;", line = 218)
    public static final class344 method2460(int arg0) {
        field5747++;
        if (class73.field1026 == null || class283.field3566 == null) {
            return null;
        } else if (arg0 == 27684) {
            for (class344 var1 = (class344) class283.field3566.method3360(false); var1 != null; var1 = (class344) class283.field3566.method3360(false)) {
                class278 var2 = class73.field1015.method3085((byte) -122, var1.field4349);
                if (var2 != null && var2.field3493 && var2.method1644(class73.field1016, true)) {
                    return var1;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "(I)V", line = 247)
    public static void method2461(int arg0) {
        if (arg0 == 0) {
            field5740 = null;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)V", line = 257)
    public static final void method2462(byte arg0) {
        field5746++;
        if (class142.field2011 == 0) {
            return;
        }
        try {
            if (++class359.field4634 > 2000) {
                if (class12.field143 != null) {
                    class12.field143.method2307(-1884375310);
                    class12.field143 = null;
                }
                if (class638.field8793 >= 2) {
                    class692.field9626 = -5;
                    class142.field2011 = 0;
                    return;
                }
                class345.field4358.method990(arg0 ^ 0xFFFFFFFC);
                class638.field8793++;
                class359.field4634 = 0;
                class142.field2011 = 1;
            }
            if (class142.field2011 == 1) {
                class217.field2933 = class345.field4358.method992(31687, class162.field2227);
                class142.field2011 = 2;
            }
            if (class142.field2011 == 2) {
                if (class217.field2933.field2538 == 2) {
                    throw new IOException();
                }
                if (class217.field2933.field2538 != 1) {
                    return;
                }
                class12.field143 = class594.method3367((Socket) class217.field2933.field2540, (byte) -51, 7500);
                class217.field2933 = null;
                class402.method2242((byte) 18);
                class142.field2011 = 4;
            }
            if (class142.field2011 == 4) {
                if (!class12.field143.method2304(1, -117)) {
                    return;
                }
                class12.field143.method2305(4993, 1, class609.field8448.field6180, 0);
                int var1 = class609.field8448.field6180[0] & 0xFF;
                class142.field2011 = 0;
                class692.field9626 = var1;
                class12.field143.method2307(-1884375310);
                class12.field143 = null;
                return;
            }
        } catch (IOException var2) {
            if (class12.field143 != null) {
                class12.field143.method2307(-1884375310);
                class12.field143 = null;
            }
            if (class638.field8793 >= 2) {
                class142.field2011 = 0;
                class692.field9626 = -4;
            } else {
                class345.field4358.method990(arg0 ^ 0xFFFFFFFC);
                class142.field2011 = 1;
                class638.field8793++;
                class359.field4634 = 0;
            }
        }
        if (arg0 != -4) {
            method2462((byte) 54);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "()V", line = 372)
    public class429() {
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 375)
    public class429(String arg0, int arg1) {
        this.field5741 = arg0;
    }
}
