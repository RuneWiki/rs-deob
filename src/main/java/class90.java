import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class90 {

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1662 = "Loading defaults - ";

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field1665 = -1;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static volatile int field1667 = -1;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "Led;")
    public static class267 field1666 = class197.method1263(104);

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "[C")
    public static char[] field1668 = new char[128];

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "Lbm;")
    public static class307 field1663;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILbm;II)Lfd;", line = 12)
    public static final class206 method619(int arg0, class307 arg1, int arg2, int arg3) {
        int var4 = 104 % ((-arg0 - 11) / 48);
        field1669++;
        return class135.method885(arg2, arg1, -10948, arg3) ? class191.method1224(true) : null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lag;B)V", line = 28)
    public static final void method620(class202 arg0, byte arg1) {
        field1664++;
        if (arg0.field3273.length - arg0.field3249 < 1) {
            return;
        }
        int var2 = arg0.method1317((byte) -106);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg0.field3273.length - arg0.field3249) < var3) {
            return;
        }
        class331.field5068 = arg0.method1317((byte) -76);
        if (class331.field5068 < 1) {
            class331.field5068 = 1;
        } else if (class331.field5068 > 4) {
            class331.field5068 = 4;
        }
        class17.method122((byte) 127, arg0.method1317((byte) -86) == 1);
        class104.field1794 = arg0.method1317((byte) -81) == 1;
        class64.field1227 = arg0.method1317((byte) -72) == 1;
        class318.field4809 = arg0.method1317((byte) -97) == 1;
        class79.field1555 = arg0.method1317((byte) -111) == 1;
        client.field902 = arg0.method1317((byte) -80) == 1;
        class157.field2572 = arg0.method1317((byte) -109) == 1;
        class259.field4030 = arg0.method1317((byte) -79) == 1;
        class305.field4620 = arg0.method1317((byte) -111);
        if (class305.field4620 > 2) {
            class305.field4620 = 2;
        }
        if (var2 < 2) {
            class334.field5115 = arg0.method1317((byte) -122) == 1;
            arg0.method1317((byte) -80);
        } else {
            class334.field5115 = arg0.method1317((byte) -122) == 1;
        }
        class45.field926 = arg0.method1317((byte) -117) == 1;
        class140.field2314 = arg0.method1317((byte) -126) == 1;
        if (arg1 != 84) {
            field1667 = -83;
        }
        class337.field5238 = arg0.method1317((byte) -120);
        if (class337.field5238 > 2) {
            class337.field5238 = 2;
        }
        class219.field3477 = class337.field5238;
        class191.field3110 = arg0.method1317((byte) -121) == 1;
        class202.field3278 = arg0.method1317((byte) -89);
        if (class202.field3278 > 127) {
            class202.field3278 = 127;
        }
        class171.field2751 = arg0.method1317((byte) -113);
        class80.field1573 = arg0.method1317((byte) -114);
        if (class80.field1573 > 127) {
            class80.field1573 = 127;
        }
        if (var2 >= 1) {
            class180.field2902 = arg0.method1315(arg1 ^ 0x3785);
            class171.field2757 = arg0.method1315(arg1 ^ 0x3785);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method1317((byte) -89);
        }
        if (var2 >= 4) {
            int var4 = arg0.method1317((byte) -116);
            if (class318.field4807 < 96) {
                var4 = 0;
            }
            class275.method1840(var4);
        }
        if (var2 >= 5) {
            class211.field3397 = arg0.method1346(60);
        }
        if (var2 >= 6) {
            class52.field1051 = arg0.method1317((byte) -81);
        }
        if (var2 >= 7) {
            class236.field3714 = arg0.method1317((byte) -73) == 1;
        }
        if (var2 >= 8) {
            class6.field136 = arg0.method1317((byte) -85) == 1;
        }
        if (var2 >= 9) {
            class259.field4028 = arg0.method1317((byte) -113);
        }
        if (var2 >= 10) {
            class28.field539 = arg0.method1317((byte) -113) != 0;
        }
        if (var2 >= 11) {
            class290.field4460 = arg0.method1317((byte) -128) != 0;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 197)
    public static void method621(int arg0) {
        field1662 = null;
        if (arg0 != 16168) {
            field1667 = -73;
        }
        field1668 = null;
        field1663 = null;
        field1666 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)Lek;", line = 210)
    public static final class226 method622(byte arg0, int arg1) {
        field1661++;
        if (arg0 > -44) {
            return (class226) null;
        }
        class226 var2 = (class226) class319.field4849.method2367((long) arg1, -12270);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class70.field1485.method2036(26, arg1, (byte) 30);
        class226 var4 = new class226();
        if (var3 != null) {
            var4.method1501((byte) -1, new class202(var3));
        }
        class319.field4849.method2369((long) arg1, -28759, var4);
        return var4;
    }
}
