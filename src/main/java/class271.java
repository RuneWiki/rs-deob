import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class271 {

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "Lp;")
    private static class280 field4731 = class18.method140((byte) -117, "wave:");

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "Lp;")
    public static class280 field4735 = field4731;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Lp;")
    public static class280 field4734 = class18.method140((byte) -121, "::tele ");

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "Lp;")
    public static class280 field4736 = class18.method140((byte) -119, "settings");

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "Lp;")
    private static class280 field4733 = class18.method140((byte) -128, "Attack");

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "Lp;")
    public static class280 field4739 = field4731;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "Lp;")
    public static class280 field4737 = field4733;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILjava/lang/String;)Lp;")
    public static final class280 method1810(int arg0, String arg1) {
        field4740++;
        if (arg0 != 8481) {
            field4733 = null;
        }
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg1.getBytes();
        }
        class280 var3 = new class280();
        var3.field4908 = 0;
        var3.field4907 = var2;
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field4908++] = var2[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static final void method1811(int arg0) {
        field4738++;
        class24.field443 = 0;
        class204.field3543 = 0;
        class75.method563(arg0 + 16237);
        class148.method1028((byte) 50);
        class224.method1511(94);
        if (arg0 != -16235) {
            method1811(86);
        }
        for (int var1 = 0; var1 < class24.field443; var1++) {
            int var3 = class113.field1991[var1];
            if (class117.field2104 != class46.field756[var3].field4848) {
                if (class46.field756[var3].field987.method1712((byte) 125)) {
                    class268.method1799(-23980, class46.field756[var3]);
                }
                class46.field756[var3].method432((class255) null, 1);
                class46.field756[var3] = null;
            }
        }
        if (class23.field422 != class20.field367.field481) {
            throw new RuntimeException("gnp1 pos:" + class20.field367.field481 + " psize:" + class23.field422);
        }
        for (int var2 = 0; var2 < class112.field1845; var2++) {
            if (class46.field756[class46.field767[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class112.field1845);
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1812(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg0 - arg2) >= class89.field1440 && (arg0 + arg2) <= class12.field249 && arg4 - arg2 >= class36.field654 && (arg2 + arg4) <= class249.field4360) {
            class83.method603(arg1, arg2, arg6, arg4, arg0, arg5, (byte) 104);
        } else {
            class35.method290(arg1, arg2, arg5, false, arg6, arg4, arg0);
        }
        field4743++;
        if (arg3 != 2) {
            field4739 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
    public static void method1813(int arg0) {
        field4734 = null;
        if (arg0 != 30066) {
            method1813(54);
        }
        field4737 = null;
        field4733 = null;
        field4735 = null;
        field4731 = null;
        field4739 = null;
        field4736 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)Ljl;")
    public static final class242 method1814(int arg0, int arg1) {
        field4741++;
        if (arg0 != 1) {
            return null;
        } else if (arg1 == 0) {
            return new class181();
        } else if (arg1 == 1) {
            return new class197();
        } else if (arg1 == 2) {
            return new class129();
        } else if (arg1 == 3) {
            return new class126();
        } else if (arg1 == 4) {
            return new class98();
        } else if (arg1 == 5) {
            return new class6();
        } else if (arg1 == 6) {
            return new class40();
        } else if (arg1 == 7) {
            return new class127();
        } else if (arg1 == 8) {
            return new class193();
        } else if (arg1 == 9) {
            return new class278();
        } else if (arg1 == 10) {
            return new class282();
        } else if (arg1 == 11) {
            return new class75();
        } else if (arg1 == 12) {
            return new class13();
        } else if (arg1 == 13) {
            return new class279();
        } else if (arg1 == 14) {
            return new class200();
        } else if (arg1 == 15) {
            return new class232();
        } else if (arg1 == 16) {
            return new class259();
        } else if (arg1 == 17) {
            return new class228();
        } else if (arg1 == 18) {
            return new class91();
        } else if (arg1 == 19) {
            return new class173();
        } else if (arg1 == 20) {
            return new class167();
        } else if (arg1 == 21) {
            return new class93();
        } else if (arg1 == 22) {
            return new class35();
        } else if (arg1 == 23) {
            return new class194();
        } else if (arg1 == 24) {
            return new class131();
        } else if (arg1 == 25) {
            return new class214();
        } else if (arg1 == 26) {
            return new class22();
        } else if (arg1 == 27) {
            return new class243();
        } else if (arg1 == 28) {
            return new class112();
        } else if (arg1 == 29) {
            return new class54();
        } else if (arg1 == 30) {
            return new class177();
        } else if (arg1 == 31) {
            return new class159();
        } else if (arg1 == 32) {
            return new class183();
        } else if (arg1 == 33) {
            return new class12();
        } else if (arg1 == 34) {
            return new class102();
        } else if (arg1 == 35) {
            return new class3();
        } else if (arg1 == 36) {
            return new class231();
        } else if (arg1 == 37) {
            return new class269();
        } else if (arg1 == 38) {
            return new class250();
        } else if (arg1 == 39) {
            return new class154();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V")
    public static final void method1815(int arg0) {
        field4742++;
        if (arg0 != 0) {
            return;
        }
        for (class144 var1 = (class144) class261.field4614.method142(true); var1 != null; var1 = (class144) class261.field4614.method143((byte) -118)) {
            int var2 = var1.field2517;
            if (class48.method356(-664, var2)) {
                boolean var3 = true;
                class113[] var4 = class251.field4394[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field2008;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2827;
                    class113 var7 = class233.method1569(65535, var6);
                    if (var7 != null) {
                        class242.method1642((byte) 33, var7);
                    }
                }
            }
        }
    }
}
