import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class340 {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field4886 = -1;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "[J")
    public static long[] field4887 = new long[32];

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Lpp;")
    public static class464 field4890 = new class464(44, 3);

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field4894 = -1;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Lfa;")
    public static class482 field4888;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field4893;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method2085(int arg0) {
        field4887 = null;
        field4890 = null;
        field4888 = null;
        field4893 = null;
        if (arg0 != 16) {
            field4886 = -8;
        }
    }

    @OriginalMember(owner = "client!bg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4891++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLqa;)V")
    public static final void method2086(byte arg0, class167 arg1) {
        field4892++;
        if (arg0 != 8) {
            method2085(-9);
        }
        if (!(class480.field6825 >= 2 || class90.field1620) || class311.field4557 != null) {
            return;
        }
        String var2;
        if (class90.field1620 && class480.field6825 < 2) {
            var2 = class511.field7082 + class287.field4175.method3220(false, class538.field7500) + class413.field6111 + " ->";
        } else if (class99.field1724 && class404.field6022.method2183(81, false) && class480.field6825 > 2) {
            var2 = class215.method1459(-112, (class587) class432.field6356.field659.field1800.field1800);
        } else {
            class587 var3 = (class587) class432.field6356.field659.field1800;
            var2 = class215.method1459(arg0 ^ 0xFFFFFF8C, var3);
            int[] var4 = null;
            if (class458.method2682(var3.field8359, true)) {
                var4 = class611.field8684.method1621((byte) 105, (int) var3.field8365).field5666;
            } else if (var3.field8368 != -1) {
                var4 = class611.field8684.method1621((byte) -74, var3.field8368).field5666;
            } else if (class393.method2383(-23131, var3.field8359)) {
                class181 var7 = (class181) class432.field6368.method740(0, (long) ((int) var3.field8365));
                if (var7 != null) {
                    class170 var8 = var7.field2623;
                    class432 var9 = var8.field2492;
                    if (var9.field6304 != null) {
                        var9 = var9.method2582(0, class401.field6001);
                    }
                    if (var9 != null) {
                        var4 = var9.field6342;
                    }
                }
            } else if (class36.method315(48, var3.field8359)) {
                Object var5 = null;
                class370 var6;
                if (var3.field8359 == 1004) {
                    var6 = class552.field7819.method2890(0, (int) var3.field8365);
                } else {
                    var6 = class552.field7819.method2890(0, (int) (var3.field8365 >>> 32 & 0x7FFFFFFFL));
                }
                if (var6.field5272 != null) {
                    var6 = var6.method2238((byte) 35, class401.field6001);
                }
                if (var6 != null) {
                    var4 = var6.field5301;
                }
            }
            if (var4 != null) {
                var2 = var2 + class347.method2106(var4, -108);
            }
        }
        if (class480.field6825 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class480.field6825 - 2) + class583.field8314.method3220(false, class538.field7500);
        }
        if (class193.field2782 != null) {
            class259 var10 = class193.field2782.method3077(arg1, (byte) -115);
            if (var10 == null) {
                var10 = class273.field3996;
            }
            var10.method1645(class144.field2231, class193.field2782.field7678, (byte) -127, class371.field5358, class193.field2782.field7775, class193.field2782.field7681, var2, class193.field2782.field7776, class193.field2782.field7699, class266.field3886, class8.field78, class235.field3450, class363.field5154, class193.field2782.field7644, class158.field2366);
            class83.method760(-1001, class8.field78[1], class8.field78[3], class8.field78[0], class8.field78[2]);
        } else if (class353.field5039 != null && class640.field9282 == class202.field2846) {
            int var11 = class273.field3996.method1634(var2, class367.field5208 + 16, class363.field5154, 16777215, class371.field5358, class541.field7536 + 4, false, class144.field2231, 0, class158.field2366);
            class83.method760(-1001, class367.field5208, 16, class541.field7536 + 4, var11 + class26.field358.method3651(-10408, var2));
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lod;[[BI)V")
    public static final void method2087(class568 arg0, byte[][] arg1, int arg2) {
        if (arg2 != 8) {
            return;
        }
        for (int var3 = 0; var3 < arg0.field882; var3++) {
            class547.method3064((byte) -127);
            for (int var4 = 0; var4 < (class146.field2247 >> 3); var4++) {
                for (int var5 = 0; var5 < class66.field990 >> 3; var5++) {
                    int var6 = class82.field1462[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg0.field870 || var7 == 0) {
                            int var8 = (var6 & 0x7) >> 1;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = (var6 & 0x3FF9) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class43.field584.length; var12++) {
                                if (class43.field584[var12] == var11 && arg1[var12] != null) {
                                    arg0.method3230((var9 & 0x7) * 8, var7, class159.field2378, var5 * 8, var4 * 8, var3, (var10 & 0x7) * 8, class268.field3916, arg1[var12], var8, arg2 ^ 0xFFFFFFBA);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        field4889++;
    }
}
