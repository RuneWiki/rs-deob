import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class113 {

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2038 = Calendar.getInstance();

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field2043 = 0;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "S")
    public short field2047;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Z")
    public boolean field2033;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Z")
    public boolean field2034;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "Z")
    public boolean field2035;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "Z")
    public boolean field2041;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "[I")
    public static int[] field2040;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lvh;ILvh;)V")
    public static final void method790(class108 arg0, int arg1, class108 arg2) {
        class142.field2442 = arg0;
        class132.field2304 = arg2;
        if (arg1 == -1) {
            class201.field3312 = class132.field2304.method754(121, 3);
            field2036++;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)I")
    public static int method791(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method792(String arg0, int arg1) {
        field2042++;
        if (class252.field4135 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = arg1; var2 < class252.field4135.field3158; var2++) {
            if (class127.method879(class267.method1757("<br>", class252.field4135.field3152[var2], " ", arg1 ^ 0xFFFFFF86), arg0, arg1 ^ 0x1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lga;BII)V")
    public static final void method793(class141 arg0, byte arg1, int arg2, int arg3) {
        field2045++;
        if (arg0.field1384 == arg2 && arg2 != -1) {
            class167 var4 = class105.method714(arg2, (byte) 98);
            int var5 = var4.field2742;
            if (var5 == 1) {
                arg0.field1440 = 0;
                arg0.field1400 = 1;
                arg0.field1393 = arg3;
                arg0.field1420 = 0;
                arg0.field1465 = 0;
                class112.method786(arg0.field1458, var4, arg0.field1465, arg0.field1397, (byte) -67, false);
            }
            if (var5 == 2) {
                arg0.field1440 = 0;
            }
        } else if (arg2 == -1 || arg0.field1384 == -1 || class105.method714(arg2, (byte) 8).field2744 >= class105.method714(arg0.field1384, (byte) 103).field2744) {
            arg0.field1420 = 0;
            arg0.field1393 = arg3;
            arg0.field1448 = arg0.field1422;
            arg0.field1440 = 0;
            arg0.field1400 = 1;
            arg0.field1384 = arg2;
            arg0.field1465 = 0;
            if (arg0.field1384 != -1) {
                class112.method786(arg0.field1458, class105.method714(arg0.field1384, (byte) 98), arg0.field1465, arg0.field1397, (byte) -114, false);
            }
        }
        if (arg1 <= 110) {
            field2040 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public static void method794(byte arg0) {
        if (arg0 < 28) {
            field2038 = null;
        }
        field2040 = null;
        field2038 = null;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II)Lsb;")
    public static final class123 method795(int arg0, int arg1) {
        field2037++;
        class123 var2 = (class123) class10.field120.method3(32, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1 == 237) {
            byte[] var3;
            if (arg0 < 32768) {
                var3 = class208.field3504.method746(arg0, (byte) -128, 1);
            } else {
                var3 = class54.field938.method746(arg0 & 0x7FFF, (byte) -128, 1);
            }
            class123 var4 = new class123();
            if (var3 != null) {
                var4.method848(arg1 ^ 0xED, new class101(var3));
            }
            if (arg0 >= 32768) {
                var4.method844((byte) -75);
            }
            class10.field120.method4(0, var4, (long) arg0);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public static final void method796(int arg0) {
        if (arg0 == 1) {
            class115.field2068 = new class46[class84.field1518.method757(-1)][];
            field2039++;
            class63.field1095 = new boolean[class84.field1518.method757(arg0 - 2)];
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V")
    public static final void method797(int arg0) {
        class79.method516(-373, class6.field76);
        class156.field2616++;
        field2044++;
        if (class290.field4630 && class30.field449) {
            int var1 = class48.field839;
            int var2 = var1 - class26.field394;
            if (class236.field3892 > var2) {
                var2 = class236.field3892;
            }
            if (class236.field3892 + class187.field3030.field701 < class6.field76.field701 + var2) {
                var2 = class236.field3892 + class187.field3030.field701 - class6.field76.field701;
            }
            int var3 = class256.field4182;
            int var4 = class187.field3030.field733 + var2 - class236.field3892;
            int var5 = class6.field76.field818;
            int var6 = var3 - class290.field4622;
            if (class6.field70 > var6) {
                var6 = class6.field70;
            }
            int var7 = var2 - class229.field3861;
            if (class6.field70 + class187.field3030.field715 < class6.field76.field715 + var6) {
                var6 = class6.field70 - (class6.field76.field715 - class187.field3030.field715);
            }
            int var8 = class187.field3030.field644 + var6 - class6.field70;
            if (arg0 != 1758) {
                field2043 = 29;
            }
            int var9 = var6 - class215.field3633;
            if (class156.field2616 > class6.field76.field768 && (var7 > var5 || (-var5) > var7 || var5 < var9 || var9 < -var5)) {
                class270.field4344 = true;
            }
            if (class6.field76.field724 != null && class270.field4344) {
                class198 var10 = new class198();
                var10.field3205 = class6.field76;
                var10.field3195 = var4;
                var10.field3190 = var8;
                var10.field3204 = class6.field76.field724;
                class71.method434(-10521, var10);
            }
            if (class69.field1131 == 0) {
                if (class270.field4344) {
                    if (class6.field76.field655 != null) {
                        class198 var11 = new class198();
                        var11.field3195 = var4;
                        var11.field3204 = class6.field76.field655;
                        var11.field3190 = var8;
                        var11.field3205 = class6.field76;
                        var11.field3191 = class198.field3206;
                        class71.method434(-10521, var11);
                    }
                    if (class198.field3206 != null && client.method1915(class6.field76) != null) {
                        class168.field2778.method199(237, -98);
                        class258.field4222++;
                        class168.field2778.method698(arg0 - 1647, class6.field76.field786);
                        class168.field2778.method690(class6.field76.field704, arg0 ^ 0x6AD);
                        class168.field2778.method644(class198.field3206.field786, true);
                        class168.field2778.method673(class198.field3206.field704, true);
                    }
                } else if ((class172.field2823 == 1 || class141.method985(class275.field4399 - 1, (byte) 35)) && class275.field4399 > 2) {
                    class126.method858((byte) -28);
                } else if (class275.field4399 > 0) {
                    class241.method1593(false);
                }
                class6.field76 = null;
            }
        } else if (class156.field2616 > 1) {
            class6.field76 = null;
        }
    }
}
