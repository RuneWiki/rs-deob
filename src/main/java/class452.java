import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class452 {

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field6387 = 0;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "[Lgm;")
    public static class106[] field6385 = new class106[14];

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "F")
    public static float field6388;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 7)
    public static final void method2744(String arg0, byte arg1) {
        field6392++;
        if (class455.field6428 != null && arg1 <= -50) {
            class402.method2367(class610.field9052, (byte) 103);
            class120.field1689++;
            class112.field1589.method1049(-1, class539.method3267(arg0, false));
            class112.field1589.method1050((byte) 32, arg0);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V", line = 24)
    public static void method2745(byte arg0) {
        int var1 = -56 / ((arg0 + 82) / 42);
        field6385 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZLqa;)V", line = 47)
    public static final void method2746(boolean arg0, class208 arg1) {
        for (class206 var2 = (class206) class515.field7349.method2233(arg0); var2 != null; var2 = (class206) class515.field7349.method2240(16772)) {
            var2.method1362(arg1);
        }
        field6393++;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lqa;ZIIILra;I)V", line = 63)
    public static final void method2747(class208 arg0, boolean arg1, int arg2, int arg3, int arg4, class92 arg5, int arg6) {
        if (arg1) {
            class583.field8560.method316((class165.field2605 - class583.field8560.method326()) / 2, (class47.field562 - class583.field8560.method322()) / 2);
            class236.field3412.method316((class165.field2605 - class236.field3412.method326()) / 2, 18);
        }
        field6389++;
        String var7 = "";
        if (class348.field4768 == class210.field3104) {
            var7 = class553.field8233.method3408(85, class63.field795);
        } else if (class348.field4768 == class143.field2006) {
            var7 = class472.field6673.method3408(108, class63.field795);
        }
        arg5.method734(class47.field562 / 2 - 26, var7, 116, arg4, class165.field2605 / 2, -1);
        int var8 = class47.field562 / 2 - 18;
        arg0.method445(class165.field2605 / 2 - 152, var8, 304, 34, arg3, 0);
        arg0.method445(class165.field2605 / 2 - 151, var8 + 1, 302, 32, 0, 0);
        if (arg6 == 18878) {
            arg0.method498(class165.field2605 / 2 - 150, var8 + 2, class317.field4373 * 3, 30, arg2, 0);
            arg0.method498(class165.field2605 / 2 + class317.field4373 * 3 - 150, var8 + 2, 300 - class317.field4373 * 3, 30, 0, 0);
            arg5.method734(class47.field562 / 2 + 4, class493.field7009, 93, arg4, class165.field2605 / 2, -1);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLqa;)V", line = 98)
    public static final void method2748(byte arg0, class208 arg1) {
        field6390++;
        int var2 = class37.field454;
        int var3 = class483.field6896;
        int var4 = class340.field4704;
        int var5 = class131.field1805 - 3;
        byte var6 = 20;
        if (class533.field7937 == null || class545.field8140 == null) {
            if (class585.field8595.method1981(true, class278.field3899) && class585.field8595.method1981(true, class516.field7356)) {
                class533.field7937 = arg1.method474(class126.method896(class585.field8595, class278.field3899, 0), true);
                class126 var7 = class126.method896(class585.field8595, class516.field7356, 0);
                class545.field8140 = arg1.method474(var7, true);
                var7.method891();
                class100.field1460 = arg1.method474(var7, true);
            } else {
                arg1.method498(var2, var3, var4, var6, class368.field5077 | 255 - class466.field6560 << 24, 1);
            }
        }
        if (class533.field7937 != null && class545.field8140 != null) {
            int var8 = (var4 - class545.field8140.method325() * 2) / class533.field7937.method325();
            for (int var9 = 0; var9 < var8; var9++) {
                class533.field7937.method316(var2 + class545.field8140.method325() + var9 * class533.field7937.method325(), var3);
            }
            class545.field8140.method316(var2, var3);
            class100.field1460.method316(var2 + var4 - class100.field1460.method325(), var3);
        }
        class114.field1608.method726(var2 + 3, class13.field118.method3408(121, class63.field795), true, -1, -16777216 | class158.field2357, var3 + 14);
        arg1.method498(var2, var3 + var6, var4, var5 - var6, class368.field5077 | 255 - class466.field6560 << 24, 1);
        if (arg0 != -35) {
            return;
        }
        int var10 = class623.field9182.method1587((byte) -116);
        int var11 = class623.field9182.method1594(2028208128);
        int var12 = 0;
        for (class583 var13 = (class583) class174.field2677.method124((byte) 42); var13 != null; var13 = (class583) class174.field2677.method120(23)) {
            int var31 = (class103.field1484 - var12 - 1) * 16 + var3 + var6 + 13;
            if (var2 < var10 && var10 < var2 + var4 && var31 - 13 < var11 && var11 < (var31 + 4) && var13.field8551) {
                arg1.method498(var2, var31 - 12, var4, 16, 255 - class536.field7968 << 24 | class444.field6036, 1);
            }
            var12++;
        }
        if ((class223.field3232 == null || class186.field2782 == null || class609.field9044 == null) && class585.field8595.method1981(true, class86.field1236) && class585.field8595.method1981(true, class321.field4431) && class585.field8595.method1981(true, class342.field4735)) {
            class126 var14 = class126.method896(class585.field8595, class321.field4431, 0);
            class186.field2782 = arg1.method474(var14, true);
            var14.method891();
            class424.field5739 = arg1.method474(var14, true);
            class223.field3232 = arg1.method474(class126.method896(class585.field8595, class86.field1236, 0), true);
            class126 var15 = class126.method896(class585.field8595, class342.field4735, 0);
            class609.field9044 = arg1.method474(var15, true);
            var15.method891();
            class559.field8303 = arg1.method474(var15, true);
        }
        if (class223.field3232 != null && class186.field2782 != null && class609.field9044 != null) {
            int var16 = (var4 - (class609.field9044.method325() * 2)) / class223.field3232.method325();
            for (int var17 = 0; var17 < var16; var17++) {
                class223.field3232.method316(class609.field9044.method325() + var2 + var17 * class223.field3232.method325(), -class223.field3232.method318() + (var3 - -var5));
            }
            int var18 = (var5 - class609.field9044.method318() - var6) / class186.field2782.method318();
            for (int var19 = 0; var19 < var18; var19++) {
                class186.field2782.method316(var2, class186.field2782.method318() * var19 + var3 + var6);
                class424.field5739.method316(var4 + var2 - class424.field5739.method325(), var3 + var6 + class186.field2782.method318() * var19);
            }
            class609.field9044.method316(var2, var3 + var5 - class609.field9044.method318());
            class559.field8303.method316(var2 + var4 - class609.field9044.method325(), -class609.field9044.method318() + var5 + var3);
        }
        int var20 = 0;
        for (class583 var21 = (class583) class174.field2677.method124((byte) 42); var21 != null; var21 = (class583) class174.field2677.method120(-102)) {
            int var22 = var3 + var6 - (-((class103.field1484 - var20 - 1) * 16) - 13);
            int var23 = class158.field2357 | 0xFF000000;
            if (var2 < var10 && var2 + var4 > var10 && var22 - 13 < var11 && var11 < (var22 + 4) && var21.field8551) {
                var23 = class271.field3835 | 0xFF000000;
            }
            int[] var24 = null;
            if (class397.method2359(var21.field8566, (byte) -126)) {
                var24 = class150.field2242.method3606((byte) 79, (int) var21.field8564).field8051;
            } else if (var21.field8558 != -1) {
                var24 = class150.field2242.method3606((byte) 97, var21.field8558).field8051;
            } else if (class555.method3354(-68, var21.field8566)) {
                class505 var25 = (class505) class510.field7260.method2799((long) ((int) var21.field8564), true);
                if (var25 != null) {
                    class571 var26 = var25.field7148;
                    class87 var27 = var26.field8405;
                    if (var27.field1314 != null) {
                        var27 = var27.method655((byte) 108, class556.field8280);
                    }
                    if (var27 != null) {
                        var24 = var27.field1267;
                    }
                }
            } else if (class513.method3044(var21.field8566, 1012)) {
                Object var28 = null;
                class145 var29;
                if (var21.field8566 == 1012) {
                    var29 = class216.field3172.method1505(arg0 - 24009, (int) var21.field8564);
                } else {
                    var29 = class216.field3172.method1505(arg0 ^ 0x5DC9, (int) (var21.field8564 >>> 32 & 0x7FFFFFFFL));
                }
                if (var29.field2028 != null) {
                    var29 = var29.method991(class556.field8280, true);
                }
                if (var29 != null) {
                    var24 = var29.field2023;
                }
            }
            String var30 = class632.method3679(var21, (byte) -34);
            if (var24 != null) {
                var30 = var30 + class540.method3280((byte) 104, var24);
            }
            class114.field1608.method732(var22, var23, class352.field4793, (byte) -117, var30, class371.field5098, 0, var2 + 3);
            if (var21.field8552) {
                class580.field8536.method316(var2 + class470.field6636.method2126((byte) 112, var30) + 5, var22 + -12);
            }
            var20++;
        }
        class224.method1445(class37.field454, class340.field4704, (byte) -31, class131.field1805, class483.field6896);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZ)Z", line = 300)
    public static final boolean method2749(int arg0, boolean arg1) {
        field6391++;
        if (arg1) {
            method2744(null, (byte) 63);
        }
        return (arg0 & -arg0) == arg0;
    }
}
