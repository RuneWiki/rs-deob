import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class253 extends Canvas {

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Ljava/awt/Component;")
    private Component field4443;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field4438 = 0;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Lr;")
    public static class66 field4441 = class93.method641(43, "hint_mapmarkers");

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lik;Ljava/lang/Object;B)V")
    public static final void method1700(class117 arg0, Object arg1, byte arg2) {
        if (arg2 >= -49) {
            method1702((byte) -99);
        }
        field4439++;
        if (arg0.field2198 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field2198.peekEvent() != null; var3++) {
            class91.method636(-5, 1L);
        }
        if (arg1 != null) {
            arg0.field2198.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!hc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field4440++;
        this.field4443.paint(arg0);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZI)V")
    public static final void method1701(boolean arg0, int arg1) {
        class48.method342((byte) 99, class12.field143, arg0, class19.field257, class150.field2702);
        field4442++;
        if (arg1 != 640) {
            field4435 = 80;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static void method1702(byte arg0) {
        field4441 = null;
        int var1 = -74 % ((arg0 - 43) / 60);
    }

    @OriginalMember(owner = "client!hc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field4443.update(arg0);
        field4436++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lha;IIIB)V")
    public static final void method1703(class63 arg0, int arg1, int arg2, int arg3, byte arg4) {
        class129.method901(16322);
        field4437++;
        class235.method1546(arg1, arg2, arg0.field1215 + arg1, arg0.field1196 + arg2);
        if (arg4 >= -9) {
            return;
        }
        if (class35.field517 == 2 || class35.field517 == 5 || class196.field3396 == null) {
            class235.method1538(arg1, arg2, 0, arg0.field1177, arg0.field1106);
        } else {
            int var5 = class207.field3595.field2077 / 32 + 48;
            int var6 = class259.field4562 + class124.field2341 & 0x7FF;
            int var7 = 464 - class207.field3595.field2053 / 32;
            ((class168) class196.field3396).method975(arg1, arg2, arg0.field1215, arg0.field1196, var5, var7, var6, class240.field4172 + 256, arg0.field1177, arg0.field1106);
            if (class176.field3090 != null) {
                for (int var8 = 0; var8 < class176.field3090.field2163; var8++) {
                    if (class176.field3090.method760((byte) 95, var8)) {
                        int var9 = (class176.field3090.field2160[var8] - class34.field512) * 4 + 2 - (class207.field3595.field2053 / 32);
                        int var10 = (class176.field3090.field2157[var8] - class3.field39) * 4 + 2 - (class207.field3595.field2077 / 32);
                        int var11 = class123.field2314[var6];
                        int var12 = class123.field2326[var6];
                        int var13 = var12 * 256 / (class240.field4172 + 256);
                        class39 var14 = class176.field3103;
                        int var15 = var11 * 256 / (class240.field4172 + 256);
                        int var16 = var9 * var15 + var10 * var13 >> 16;
                        int var17 = var9 * var13 - var10 * var15 >> 16;
                        if (class176.field3090.method764(126, var8) == 1) {
                            var14 = class33.field501;
                        }
                        if (class176.field3090.method764(-21, var8) == 2) {
                            var14 = class59.field1016;
                        }
                        int var18 = var14.method221(class176.field3090.field2161[var8], 100);
                        int var19 = var16 - var18 / 2;
                        if (-arg0.field1215 <= var19 && var19 <= arg0.field1215 && var17 >= (-arg0.field1196) && arg0.field1196 >= var17) {
                            int var20 = 16777215;
                            if (class176.field3090.field2166[var8] != -1) {
                                var20 = class176.field3090.field2166[var8];
                            }
                            class235.method1543(arg0.field1177, arg0.field1106);
                            var14.method237(class176.field3090.field2161[var8], arg1 + var19 + (arg0.field1215 / 2), arg2 - -(arg0.field1196 / 2) + -var17, var18, 50, var20, 0, 256, 1, 0, 0);
                            class235.method1557();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class242.field4233; var21++) {
                int var54 = class215.field3709[var21] * 4 + 2 - (class207.field3595.field2053 / 32);
                int var55 = class32.field480[var21] * 4 + 2 - (class207.field3595.field2077 / 32);
                class231 var56 = class52.method359(95, class53.field929[var21]);
                if (var56.field4027 != null) {
                    var56 = var56.method1515(-1);
                    if (var56 == null || var56.field4013 == -1) {
                        continue;
                    }
                }
                class9.method41(var54, -69, arg0, arg1, var55, class96.field1845[var56.field4013], arg2);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    class125 var51 = class63.field1249[class196.field3401][var22][var50];
                    if (var51 != null) {
                        int var52 = var50 * 4 + 2 - (class207.field3595.field2053 / 32);
                        int var53 = var22 * 4 + 2 - (class207.field3595.field2077 / 32);
                        class9.method41(var52, -35, arg0, arg1, var53, class93.field1785[0], arg2);
                    }
                }
            }
            for (int var23 = 0; var23 < class160.field2869; var23++) {
                class37 var46 = class178.field3112[class49.field877[var23]];
                if (var46 != null && var46.method204(111)) {
                    class206 var47 = var46.field548;
                    if (var47 != null && var47.field3541 != null) {
                        var47 = var47.method1339(-94);
                    }
                    if (var47 != null && var47.field3548 && var47.field3543) {
                        int var48 = var46.field2077 / 32 - (class207.field3595.field2077 / 32);
                        int var49 = var46.field2053 / 32 - class207.field3595.field2053 / 32;
                        class9.method41(var49, -89, arg0, arg1, var48, class93.field1785[1], arg2);
                    }
                }
            }
            for (int var24 = 0; var24 < client.field1650; var24++) {
                class45 var38 = class59.field988[class192.field3335[var24]];
                if (var38 != null && var38.method204(97)) {
                    int var39 = var38.field2077 / 32 - (class207.field3595.field2077 / 32);
                    boolean var40 = false;
                    int var41 = var38.field2053 / 32 - (class207.field3595.field2053 / 32);
                    long var42 = var38.field815.method479(10908);
                    for (int var44 = 0; var44 < class173.field3058; var44++) {
                        if (class176.field3104[var44] == var42 && class245.field4279[var44] != 0) {
                            var40 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class207.field3595.field832 != 0 && var38.field832 != 0 && class207.field3595.field832 == var38.field832) {
                        var45 = true;
                    }
                    if (var40) {
                        class9.method41(var41, -27, arg0, arg1, var39, class93.field1785[3], arg2);
                    } else if (var45) {
                        class9.method41(var41, -92, arg0, arg1, var39, class93.field1785[4], arg2);
                    } else {
                        class9.method41(var41, -52, arg0, arg1, var39, class93.field1785[2], arg2);
                    }
                }
            }
            class76[] var25 = class194.field3354;
            for (int var26 = 0; var26 < var25.length; var26++) {
                class76 var29 = var25[var26];
                if (var29 != null && var29.field1502 != 0 && (class75.field1501 % 20) < 10) {
                    if (var29.field1502 == 1 && var29.field1506 >= 0 && var29.field1506 < class178.field3112.length) {
                        class37 var30 = class178.field3112[var29.field1506];
                        if (var30 != null) {
                            int var31 = var30.field2077 / 32 - (class207.field3595.field2077 / 32);
                            int var32 = var30.field2053 / 32 - (class207.field3595.field2053 / 32);
                            class190.method1253(var29.field1512, (byte) 122, var31, arg0, arg2, arg1, var32);
                        }
                    }
                    if (var29.field1502 == 2) {
                        int var33 = (var29.field1509 - class3.field39) * 4 + 2 - (class207.field3595.field2077 / 32);
                        int var34 = (var29.field1505 - class34.field512) * 4 + 2 - (class207.field3595.field2053 / 32);
                        class190.method1253(var29.field1512, (byte) 119, var33, arg0, arg2, arg1, var34);
                    }
                    if (var29.field1502 == 10 && var29.field1506 >= 0 && var29.field1506 < class59.field988.length) {
                        class45 var35 = class59.field988[var29.field1506];
                        if (var35 != null) {
                            int var36 = var35.field2077 / 32 - (class207.field3595.field2077 / 32);
                            int var37 = var35.field2053 / 32 - (class207.field3595.field2053 / 32);
                            class190.method1253(var29.field1512, (byte) 110, var36, arg0, arg2, arg1, var37);
                        }
                    }
                }
            }
            if (class32.field481 != 0) {
                int var27 = class32.field481 * 4 + 2 - (class207.field3595.field2077 / 32);
                int var28 = class72.field1426 * 4 + 2 - (class207.field3595.field2053 / 32);
                class9.method41(var28, -65, arg0, arg1, var27, class154.field2750, arg2);
            }
            class235.method1558(arg0.field1215 / 2 + arg1 - 1, arg0.field1196 / 2 + arg2 + -1, 3, 3, 16777215);
        }
        class142.field2607[arg3] = true;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class253(Component arg0) {
        this.field4443 = arg0;
    }
}
