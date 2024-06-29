import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class259 extends class338 {

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3516 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3518 = "Opened title screen";

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "Z")
    public static boolean field3519 = false;

    @OriginalMember(owner = "client!gp", name = "s", descriptor = "I")
    public static int field3522 = 0;

    @OriginalMember(owner = "client!gp", name = "v", descriptor = "[S")
    public static short[] field3525 = new short[256];

    @OriginalMember(owner = "client!gp", name = "w", descriptor = "I")
    public static int field3526 = 0;

    @OriginalMember(owner = "client!gp", name = "q", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!gp", name = "t", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!gp", name = "u", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!gp", name = "r", descriptor = "Llg;")
    public class20 field3521;

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "Z")
    public boolean field3517;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)V")
    public static void method1450(byte arg0) {
        field3518 = null;
        field3525 = null;
        field3516 = null;
        if (arg0 <= 113) {
            method1450((byte) 4);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lvm;Lfd;III)V")
    public static final void method1451(class322 arg0, class194 arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 48) {
            return;
        }
        field3523++;
        class175 var5 = arg1.method1043(arg0, (byte) -88);
        if (var5 == null) {
            return;
        }
        arg0.method1648(arg3, arg2, arg1.field2501 + arg3, arg1.field2460 + arg2);
        if (class32.field312 == 2 || class32.field312 == 5 || class342.field4581 == null) {
            arg0.method1566(-16777216, var5, arg3, arg2);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class294.field3993 == 4) {
            var8 = 4096;
            var9 = class91.field1030;
            var7 = (int) (-class425.field6241) & 0x3FFF;
            var6 = class274.field3698;
        } else {
            var6 = class427.field6264.field152;
            var7 = (int) (-class425.field6241) + class136.field1731 & 0x3FFF;
            var8 = 4096 - (class411.field5937 * 16);
            var9 = class427.field6264.field154;
        }
        int var10 = var6 / 32 + 48 - (class315.field4214 * 2 + -208);
        int var11 = class340.field4549 * 4 + 208 + 48 - (var9 / 32) - class340.field4549 * 2;
        class342.field4581.method112((float) arg1.field2501 / 2.0F + (float) arg3, (float) arg1.field2460 / 2.0F + (float) arg2, (float) var10, (float) var11, var8, var7 << 2, var5, arg3, arg2);
        for (class310 var12 = (class310) class267.field3635.method814((byte) 90); var12 != null; var12 = (class310) class267.field3635.method827(-126)) {
            int var50 = var12.field4186;
            int var51 = (class448.field6516.field87[var50] >> 14 & 0x3FFF) - class70.field767;
            int var52 = (class448.field6516.field87[var50] & 0x3FFF) - class291.field3961;
            int var53 = var51 * 4 + 2 - (var6 / 32);
            int var54 = var52 * 4 + 2 - (var9 / 32);
            class30.method144((byte) -92, arg3, arg2, var5, arg1, var54, class448.field6516.field88[var50], var53, arg0);
        }
        for (int var13 = 0; var13 < class401.field5856; var13++) {
            int var47 = class118.field1466[var13] * 4 + 2 - var6 / 32;
            int var48 = class411.field5939[var13] * 4 + 2 - (var9 / 32);
            class225 var49 = class281.method1655((byte) -28, class12.field120[var13]);
            if (var49.field3061 != null) {
                var49 = var49.method1219(-69);
                if (var49 == null || var49.field2988 == -1) {
                    continue;
                }
            }
            class30.method144((byte) -92, arg3, arg2, var5, arg1, var48, var49.field2988, var47, arg0);
        }
        for (class268 var14 = (class268) class419.field6102.method315((byte) -125); var14 != null; var14 = (class268) class419.field6102.method310(arg4 ^ 0xFFFFFF83)) {
            int var44 = (int) (var14.field4510 >> 28 & 0x3L);
            if (class370.field5166 == var44) {
                int var45 = (int) (var14.field4510 & 0x3FFFL) * 4 + 2 - (var6 / 32);
                int var46 = (int) (var14.field4510 >> 14 & 0x3FFFL) * 4 + 2 - (var9 / 32);
                class274.method1512(arg1, var46, class32.field319[0], false, arg3, arg2, var5, var45);
            }
        }
        for (int var15 = 0; var15 < class244.field3320; var15++) {
            class91 var40 = class38.field397[class308.field4175[var15]];
            if (var40 != null && var40.method497(arg4 - 49)) {
                class345 var41 = var40.field1035;
                if (var41 != null && var41.field4672 != null) {
                    var41 = var41.method2026(-1);
                }
                if (var41 != null && var41.field4678 && var41.field4660) {
                    int var42 = var40.field152 / 32 - (var6 / 32);
                    int var43 = var40.field154 / 32 - var9 / 32;
                    if (var41.field4640 == -1) {
                        class274.method1512(arg1, var43, class32.field319[1], false, arg3, arg2, var5, var42);
                    } else {
                        class30.method144((byte) -92, arg3, arg2, var5, arg1, var43, var41.field4640, var42, arg0);
                    }
                }
            }
        }
        for (int var16 = 0; var16 < class293.field3991; var16++) {
            class158 var32 = class85.field957[class345.field4629[var16]];
            if (var32 != null && var32.method850(arg4 - 49)) {
                int var33 = var32.field152 / 32 - (var6 / 32);
                int var34 = var32.field154 / 32 - (var9 / 32);
                boolean var35 = false;
                for (int var36 = 0; var36 < class88.field993; var36++) {
                    if (var32.field2034.equals(class198.field2647[var36]) && class392.field5645[var36] != 0) {
                        var35 = true;
                        break;
                    }
                }
                boolean var37 = false;
                for (int var38 = 0; var38 < class127.field1637; var38++) {
                    if (var32.field2034.equals(class27.field263[var38].field76)) {
                        var37 = true;
                        break;
                    }
                }
                boolean var39 = false;
                if (class427.field6264.field2010 != 0 && var32.field2010 != 0 && class427.field6264.field2010 == var32.field2010) {
                    var39 = true;
                }
                if (var35) {
                    class274.method1512(arg1, var34, class32.field319[3], false, arg3, arg2, var5, var33);
                } else if (var37) {
                    class274.method1512(arg1, var34, class32.field319[5], false, arg3, arg2, var5, var33);
                } else if (var39) {
                    class274.method1512(arg1, var34, class32.field319[4], false, arg3, arg2, var5, var33);
                } else {
                    class274.method1512(arg1, var34, class32.field319[2], false, arg3, arg2, var5, var33);
                }
            }
        }
        class41[] var17 = class416.field5982;
        for (int var18 = 0; var18 < var17.length; var18++) {
            class41 var21 = var17[var18];
            if (var21 != null && var21.field427 != 0 && class234.field3224 % 20 < 10) {
                if (var21.field427 == 1 && var21.field429 >= 0 && var21.field429 < class38.field397.length) {
                    class91 var22 = class38.field397[var21.field429];
                    if (var22 != null) {
                        int var23 = var22.field152 / 32 - (var6 / 32);
                        int var24 = var22.field154 / 32 - (var9 / 32);
                        class125.method674(arg1, var5, var24, arg4 - 49, 360000, arg2, var23, var21.field435, arg3);
                    }
                }
                if (var21.field427 == 2) {
                    int var25 = (var21.field424 - class70.field767) * 4 + 2 - (var6 / 32);
                    int var26 = (var21.field428 - class291.field3961) * 4 + 2 - (var9 / 32);
                    int var27 = var21.field422 * 4;
                    int var28 = var27 * var27;
                    class125.method674(arg1, var5, var26, -1, var28, arg2, var25, var21.field435, arg3);
                }
                if (var21.field427 == 10 && var21.field429 >= 0 && var21.field429 < class85.field957.length) {
                    class158 var29 = class85.field957[var21.field429];
                    if (var29 != null) {
                        int var30 = var29.field152 / 32 - (var6 / 32);
                        int var31 = var29.field154 / 32 - var9 / 32;
                        class125.method674(arg1, var5, var31, -1, 360000, arg2, var30, var21.field435, arg3);
                    }
                }
            }
        }
        if (class294.field3993 == 4) {
            return;
        }
        if (class324.field4321 != 0) {
            int var19 = class324.field4321 * 4 - ((var6 / 32) - (class427.field6264.method857((byte) -106) + -1) * 2 - 2);
            int var20 = class149.field1894 * 4 + ((class427.field6264.method857((byte) -106) + -1) * 2) + 2 - (var9 / 32);
            class274.method1512(arg1, var20, class119.field1480[class6.field52 ? 1 : 0], false, arg3, arg2, var5, var19);
        }
        arg0.method1860(arg1.field2460 / 2 + arg2 - 1, -3272, 3, arg1.field2501 / 2 + arg3 - 1, 3, -1);
        return;
    }
}
