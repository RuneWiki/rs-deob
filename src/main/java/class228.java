import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class228 extends class176 {

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public int field3251;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public int field3252;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public int field3255;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public int field3258;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "Z")
    public boolean field3259;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public int field3253;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    public static int field3260 = -1;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "[Lha;")
    public static class52[] field3257;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1451(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3261++;
        if (!arg4 && class88.field1390 == arg2 && class193.field2733 == arg0 && class67.field1116 == class206.field2901 || class491.field6875.method2608(class103.field1570, (byte) -128)) {
            return;
        }
        class67.field1116 = class206.field2901;
        class88.field1390 = arg2;
        class193.field2733 = arg0;
        if (class491.field6875.method2608(class103.field1570, (byte) -113)) {
            class67.field1116 = 0;
        }
        class45.method440(arg1, 49);
        class639.method3699(class443.field6309.method739(class173.field2491, 123), true, class206.field2905, (byte) 82);
        int var5 = class519.field7304;
        class519.field7304 = (class88.field1390 - (class32.field513 >> 4)) * 8;
        int var6 = class6.field80;
        class6.field80 = (class193.field2733 - (class611.field8786 >> 4)) * 8;
        class214.field3044 = class413.method2464(class88.field1390 * 8, class193.field2733 * 8);
        class246.field3427 = null;
        int var7 = class519.field7304 - var5;
        int var8 = class6.field80 - var6;
        if (arg1 == 10) {
            for (int var17 = 0; var17 < class204.field2859; var17++) {
                class576 var30 = class342.field4610[var17];
                if (var30 != null) {
                    class109 var31 = var30.field7929;
                    for (int var32 = 0; var32 < 10; var32++) {
                        var31.field616[var32] -= var7;
                        var31.field618[var32] -= var8;
                    }
                    var31.field6029 -= var8 * 128;
                    var31.field6037 -= var7 * 128;
                }
            }
        } else {
            class480.field6764 = 0;
            boolean var9 = false;
            int var10 = class32.field513 * 128 - 128;
            int var11 = class611.field8786 * 128 - 128;
            for (int var12 = 0; var12 < class204.field2859; var12++) {
                class576 var13 = class342.field4610[var12];
                if (var13 != null) {
                    class109 var14 = var13.field7929;
                    var14.field6029 -= var8 * 128;
                    var14.field6037 -= var7 * 128;
                    if (var14.field6037 >= 0 && var14.field6037 <= var10 && var14.field6029 >= 0 && var11 >= var14.field6029) {
                        boolean var15 = true;
                        for (int var16 = 0; var16 < 10; var16++) {
                            var14.field616[var16] -= var7;
                            var14.field618[var16] -= var8;
                            if (var14.field616[var16] < 0 || class32.field513 <= var14.field616[var16] || var14.field618[var16] < 0 || class611.field8786 <= var14.field618[var16]) {
                                var15 = false;
                            }
                        }
                        if (var15) {
                            class586.field8386[class480.field6764++] = var14.field607;
                        } else {
                            var14.method770(null, true);
                            var13.method1117(0);
                            var9 = true;
                        }
                    } else {
                        var14.method770(null, true);
                        var9 = true;
                        var13.method1117(0);
                    }
                }
            }
            if (var9) {
                class204.field2859 = class278.field3837.method1250(arg3 - 28221);
                class278.field3837.method1246(class342.field4610, arg3 ^ 0xFFFF91BA);
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class188 var28 = class349.field4696[var18];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field616[var29] -= var7;
                    var28.field618[var29] -= var8;
                }
                var28.field6037 -= var7 * 128;
                var28.field6029 -= var8 * 128;
            }
        }
        if (arg3 != 28221) {
            method1453(true);
        }
        class201[] var19 = class132.field2113;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class201 var27 = var19[var20];
            if (var27 != null) {
                var27.field2822 -= var7 * 128;
                var27.field2826 -= var8 * 128;
            }
        }
        for (class438 var21 = (class438) class311.field4187.method456((byte) -53); var21 != null; var21 = (class438) class311.field4187.method460((byte) -91)) {
            var21.field6220 -= var7;
            var21.field6213 -= var8;
            if (class489.field6847 != 4 && (var21.field6220 < 0 || var21.field6213 < 0 || var21.field6220 >= class32.field513 || var21.field6213 >= class611.field8786)) {
                var21.method1117(arg3 - 28221);
            }
        }
        if (class489.field6847 != 4) {
            for (class93 var22 = (class93) class220.field3147.method1248(-1); var22 != null; var22 = (class93) class220.field3147.method1245((byte) 95)) {
                int var23 = (int) (var22.field2524 & 0x3FFFL);
                int var24 = var23 - class519.field7304;
                int var25 = (int) (var22.field2524 >> 14 & 0x3FFFL);
                int var26 = var25 - class6.field80;
                if (var24 < 0 || var26 < 0 || class32.field513 <= var24 || class611.field8786 <= var26) {
                    var22.method1117(0);
                }
            }
        }
        if (class145.field2248 != 0) {
            class145.field2248 -= var7;
            class118.field1943 -= var8;
        }
        class298.method1898(arg3 - 13659);
        if (arg1 != 10) {
            class563.field7794 -= var7 * 128;
            class333.field4458 -= var8;
            class87.field1384 -= var8;
            class462.field6490 -= var7;
            class124.field2019 -= var7;
            class462.field6488 -= var8 * 128;
            if (Math.abs(var7) > class32.field513 || Math.abs(var8) > class611.field8786) {
                class465.method2718(-8274);
            }
        } else if (class107.field1653 == 4) {
            class414.field5848 -= var8 * 128;
            class312.field4212 -= var8 * 128;
            class592.field8507 -= var7 * 128;
            class487.field6841 -= var7 * 128;
        } else {
            class107.field1653 = 1;
        }
        class67.method561((byte) -93);
        class408.method2420((byte) -124);
        class625.field9107.method465(true);
        class456.field6423.method465(true);
        class297.field4071.method3144((byte) -124);
        class82.method628(false);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(CB)B")
    public static final byte method1452(char arg0, byte arg1) {
        field3254++;
        if (arg1 != -126) {
            method1452((char) 65431, (byte) -87);
        }
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIIIIZ)V")
    public class228(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field3251 = arg1;
        this.field3252 = arg0;
        this.field3255 = arg2;
        this.field3258 = arg3;
        this.field3259 = arg5;
        this.field3253 = arg4;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
    public static void method1453(boolean arg0) {
        field3257 = null;
        if (arg0) {
            field3257 = null;
        }
    }
}
