import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class271 {

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4357 = "Loading fonts - ";

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "Lag;")
    public static class211 field4359 = null;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)I")
    public static final int method1814(int arg0) {
        field4358++;
        if (arg0 != -1) {
            method1815((byte) -85, 18, (class211) null, -28, 108);
        }
        return class243.field3871.method1253(12);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BILag;II)V")
    public static final void method1815(byte arg0, int arg1, class211 arg2, int arg3, int arg4) {
        class276.method1859((byte) 108);
        field4356++;
        int var5 = 100 / ((arg0 + 56) / 40);
        class127.method904(arg3, arg1, arg2.field3430 + arg3, arg2.field3394 + arg1);
        if (class178.field2908 == 2 || class178.field2908 == 5 || class134.field2128 == null) {
            class127.method884(arg3, arg1, 0, arg2.field3460, arg2.field3505);
        } else {
            int var6;
            int var7;
            int var8;
            int var9;
            if (class120.field1919 == 4) {
                var7 = (int) class90.field1456 & 0x7FF;
                var6 = class256.field4149;
                var8 = 256;
                var9 = class95.field1537;
            } else {
                var6 = class239.field3829.field637;
                var7 = (int) class90.field1456 + class173.field2831 & 0x7FF;
                var8 = class292.field4687 + 256;
                var9 = class239.field3829.field710;
            }
            int var10 = (var6 / 32) + 48;
            int var11 = 464 - var9 / 32;
            ((class232) class134.field2128).method1397(arg3, arg1, arg2.field3430, arg2.field3394, var10, var11, var7, var8, arg2.field3460, arg2.field3505);
            if (class287.field4602 != null) {
                for (int var12 = 0; var12 < class287.field4602.field4681; var12++) {
                    if (class287.field4602.field4686[var12] != null && class287.field4602.field4685[var12] >> 28 == class56.field941) {
                        int var13 = ((class287.field4602.field4685[var12] & 0xFFFD2FB) >> 14) - class276.field4438;
                        int var14 = (class287.field4602.field4685[var12] & 0x3FFF) - class108.field1732;
                        if (var13 >= 0 && var13 < 104 && var14 >= 0 && var14 < 104) {
                            int var15 = var13 * 4 + 2 - (var6 / 32);
                            int var16 = var14 * 4 + 2 - (var9 / 32);
                            class79.method540(arg2, false, var15, arg1, var16, class287.field4602.field4686[var12].field4333, arg3);
                        }
                    }
                }
            }
            for (int var17 = 0; var17 < class223.field3627; var17++) {
                int var52 = class47.field787[var17] * 4 + 2 - (var6 / 32);
                int var53 = class34.field517[var17] * 4 + 2 - var9 / 32;
                class158 var54 = class5.method29(class196.field3166[var17], true);
                if (var54.field2448 != null) {
                    var54 = var54.method1077(-6291);
                    if (var54 == null || var54.field2509 == -1) {
                        continue;
                    }
                }
                class79.method540(arg2, false, var52, arg1, var53, var54.field2509, arg3);
            }
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var48 = 0; var48 < 104; var48++) {
                    class246 var49 = class192.field3113[class56.field941][var18][var48];
                    if (var49 != null) {
                        int var50 = var18 * 4 + 2 - (var6 / 32);
                        int var51 = var48 * 4 + 2 - (var9 / 32);
                        class99.method676(arg3, var50, class309.field4940[0], arg1, 26670, arg2, var51);
                    }
                }
            }
            for (int var19 = 0; var19 < class246.field3912; var19++) {
                class131 var44 = class12.field127[class184.field3020[var19]];
                if (var44 != null && var44.method285(104)) {
                    class253 var45 = var44.field2056;
                    if (var45 != null && var45.field4062 != null) {
                        var45 = var45.method1711(true);
                    }
                    if (var45 != null && var45.field4044 && var45.field4076) {
                        int var46 = var44.field710 / 32 - (var9 / 32);
                        int var47 = var44.field637 / 32 - (var6 / 32);
                        if (var45.field4024 == -1) {
                            class99.method676(arg3, var47, class309.field4940[1], arg1, 26670, arg2, var46);
                        } else {
                            class79.method540(arg2, false, var47, arg1, var46, var45.field4024, arg3);
                        }
                    }
                }
            }
            for (int var20 = 0; var20 < class13.field145; var20++) {
                class299 var36 = class270.field4355[class259.field4176[var20]];
                if (var36 != null && var36.method285(122)) {
                    int var37 = var36.field710 / 32 - var9 / 32;
                    boolean var38 = false;
                    int var39 = var36.field637 / 32 - (var6 / 32);
                    for (int var40 = 0; var40 < class124.field1968; var40++) {
                        if (var36.field4778.equals(class258.field4165[var40]) && class279.field4478[var40] != 0) {
                            var38 = true;
                            break;
                        }
                    }
                    boolean var41 = false;
                    for (int var42 = 0; var42 < class215.field3553; var42++) {
                        if (var36.field4778.equals(class305.field4883[var42].field3024)) {
                            var41 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    if (class239.field3829.field4781 != 0 && var36.field4781 != 0 && class239.field3829.field4781 == var36.field4781) {
                        var43 = true;
                    }
                    if (var38) {
                        class99.method676(arg3, var39, class309.field4940[3], arg1, 26670, arg2, var37);
                    } else if (var41) {
                        class99.method676(arg3, var39, class309.field4940[5], arg1, 26670, arg2, var37);
                    } else if (var43) {
                        class99.method676(arg3, var39, class309.field4940[4], arg1, 26670, arg2, var37);
                    } else {
                        class99.method676(arg3, var39, class309.field4940[2], arg1, 26670, arg2, var37);
                    }
                }
            }
            class56[] var21 = client.field4852;
            for (int var22 = 0; var22 < var21.length; var22++) {
                class56 var25 = var21[var22];
                if (var25 != null && var25.field942 != 0 && class29.field360 % 20 < 10) {
                    if (var25.field942 == 1 && var25.field930 >= 0 && class12.field127.length > var25.field930) {
                        class131 var26 = class12.field127[var25.field930];
                        if (var26 != null) {
                            int var27 = var26.field637 / 32 - var6 / 32;
                            int var28 = var26.field710 / 32 - (var9 / 32);
                            class33.method218(arg1, arg2, var28, var25.field935, (byte) -66, 360000, arg3, var27);
                        }
                    }
                    if (var25.field942 == 2) {
                        int var29 = (var25.field931 - class276.field4438) * 4 + 2 - (var6 / 32);
                        int var30 = (var25.field934 - class108.field1732) * 4 + 2 - var9 / 32;
                        int var31 = var25.field928 * 4;
                        int var32 = var31 * var31;
                        class33.method218(arg1, arg2, var30, var25.field935, (byte) -113, var32, arg3, var29);
                    }
                    if (var25.field942 == 10 && var25.field930 >= 0 && class270.field4355.length > var25.field930) {
                        class299 var33 = class270.field4355[var25.field930];
                        if (var33 != null) {
                            int var34 = var33.field637 / 32 - (var6 / 32);
                            int var35 = var33.field710 / 32 - var9 / 32;
                            class33.method218(arg1, arg2, var35, var25.field935, (byte) -119, 360000, arg3, var34);
                        }
                    }
                }
            }
            if (class120.field1919 != 4) {
                if (class237.field3804 != 0) {
                    int var23 = (class237.field3804 * 4 - -((class239.field3829.method279(23397) - 1) * 2)) + 2 - (var6 / 32);
                    int var24 = class86.field1418 * 4 + (class239.field3829.method279(23397) * 2) + 2 - (var9 / 32) - 2;
                    class99.method676(arg3, var23, class308.field4927[class130.field2033 ? 1 : 0], arg1, 26670, arg2, var24);
                }
                class127.method886(arg2.field3430 / 2 + arg3 - 1, arg1 - -(arg2.field3394 / 2) - 1, 3, 3, 16777215);
            }
        }
        class85.field1415[arg4] = true;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1816(Component arg0, int arg1) {
        arg0.removeMouseListener(class177.field2899);
        field4360++;
        arg0.removeMouseMotionListener(class177.field2899);
        arg0.removeFocusListener(class177.field2899);
        class220.field3600 = 0;
        if (arg1 != 9938) {
            field4359 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V")
    public static void method1817(int arg0) {
        if (arg0 != 32) {
            method1816((Component) null, 38);
        }
        field4357 = null;
        field4359 = null;
    }
}
