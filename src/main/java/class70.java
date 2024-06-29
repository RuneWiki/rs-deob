import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class70 {

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "[S")
    public static short[] field1584 = new short[256];

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "Lsg;")
    public static class30 field1585 = class167.method1221((byte) 33, "<col=00ffff>");

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field1586 = 0;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIII)V")
    public static final void method654(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1587++;
        if (arg0 <= arg2) {
            for (int var5 = arg0; var5 < arg2; var5++) {
                class121.field2390[var5][arg4] = arg1;
            }
        } else {
            for (int var6 = arg2; var6 < arg0; var6++) {
                class121.field2390[var6][arg4] = arg1;
            }
        }
        if (arg3 != -12586) {
            field1585 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BLaa;)V")
    public static final void method655(byte arg0, class8 arg1) {
        if (arg0 != -31) {
            return;
        }
        if (class14.field274 != null) {
            try {
                class14.field274.method1677(0, 0L);
                class14.field274.method1675(arg1.field146, (byte) -120, arg1.field124, 24);
            } catch (Exception var2) {
            }
        }
        arg1.field146 += 24;
        field1582++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)I")
    public static final int method656(byte arg0) {
        field1581++;
        try {
            if (class120.field2353 == 0) {
                if ((class111.method874(30351) - 5000L) < class69.field1549) {
                    return 0;
                }
                class2.field36 = class190.field3452.method602(-16536, class54.field1196, class64.field1422);
                class195.field3543 = class111.method874(30351);
                class120.field2353 = 1;
            }
            if (arg0 != -72) {
                method657(-125, 101, -82);
            }
            if (class195.field3543 + 30000L < class111.method874(30351)) {
                return class261.method1806(1000, 66);
            }
            if (class120.field2353 == 1) {
                if (class2.field36.field493 == 2) {
                    return class261.method1806(1001, 3);
                }
                if (class2.field36.field493 != 1) {
                    return -1;
                }
                class175.field3261 = new class212((Socket) class2.field36.field492, class190.field3452);
                class196.field3553.field146 = 0;
                class2.field36 = null;
                int var1 = 0;
                if (class247.field4402) {
                    var1 = class40.field953;
                }
                class196.field3553.method76(5305, 56);
                class196.field3553.method57(var1, 94);
                class175.field3261.method1509(class196.field3553.field124, 0, class196.field3553.field146, true);
                if (class11.field217 != null) {
                    class11.field217.method499(122);
                }
                if (class149.field2843 != null) {
                    class149.field2843.method499(108);
                }
                int var2 = class175.field3261.method1515(0);
                if (class11.field217 != null) {
                    class11.field217.method499(arg0 ^ 0xFFFFFFCB);
                }
                if (class149.field2843 != null) {
                    class149.field2843.method499(118);
                }
                if (var2 != 0) {
                    return class261.method1806(var2, arg0 ^ 0x3C);
                }
                class120.field2353 = 2;
            }
            if (class120.field2353 == 2) {
                if (class175.field3261.method1508(0) < 2) {
                    return -1;
                }
                class211.field3804 = class175.field3261.method1515(0);
                class211.field3804 <<= 0x8;
                class211.field3804 += class175.field3261.method1515(0);
                class120.field2353 = 3;
                class41.field1009 = new byte[class211.field3804];
                class92.field1862 = 0;
            }
            if (class120.field2353 != 3) {
                return -1;
            }
            int var3 = class175.field3261.method1508(arg0 ^ 0xFFFFFFB8);
            if (var3 < 1) {
                return -1;
            }
            if ((class211.field3804 - class92.field1862) < var3) {
                var3 = class211.field3804 - class92.field1862;
            }
            class175.field3261.method1510(class92.field1862, class41.field1009, var3, (byte) -6);
            class92.field1862 += var3;
            if (class211.field3804 > class92.field1862) {
                return -1;
            } else if (class194.method1407(17915, class41.field1009)) {
                int var4 = 0;
                class260.field4600 = new class205[class114.field2257];
                for (int var5 = class212.field3839; var5 <= class197.field3558; var5++) {
                    class205 var6 = class103.method831(-17028, var5);
                    if (var6 != null) {
                        class260.field4600[var4++] = var6;
                    }
                }
                class175.field3261.method1516(-86);
                class175.field3261 = null;
                class114.field2266 = 0;
                class41.field1009 = null;
                class120.field2353 = 0;
                class69.field1549 = class111.method874(30351);
                return 0;
            } else {
                return class261.method1806(1002, arg0 ^ 0xFFFFFFEA);
            }
        } catch (IOException var7) {
            return class261.method1806(1003, 78);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)V")
    public static final void method657(int arg0, int arg1, int arg2) {
        field1583++;
        int var3 = -120 % ((arg1 + 72) / 54);
        class4 var4 = class50.method503((byte) 126, arg2);
        int var5 = var4.field59;
        int var6 = var4.field63;
        int var7 = var4.field60;
        int var8 = class97.field1978[var7 - var6];
        if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        class121.method925(var5, arg0 << var6 & var9 | ~var9 & class142.field2741[var5], true);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static void method658(int arg0) {
        if (arg0 <= 20) {
            method655((byte) 32, (class8) null);
        }
        field1585 = null;
        field1584 = null;
    }
}
