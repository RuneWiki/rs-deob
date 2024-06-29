import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class54 {

    @OriginalMember(owner = "client!gea", name = "h", descriptor = "Lca;")
    private class119 field735 = new class119();

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "I")
    private int field730;

    @OriginalMember(owner = "client!gea", name = "i", descriptor = "I")
    private int field736;

    @OriginalMember(owner = "client!gea", name = "l", descriptor = "Lbc;")
    private class9 field739;

    @OriginalMember(owner = "client!gea", name = "g", descriptor = "I")
    public static int field734 = -1;

    @OriginalMember(owner = "client!gea", name = "n", descriptor = "I")
    public static int field741 = 0;

    @OriginalMember(owner = "client!gea", name = "q", descriptor = "Lwq;")
    public static class492 field744 = new class492();

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!gea", name = "e", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!gea", name = "f", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!gea", name = "j", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!gea", name = "k", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!gea", name = "m", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!gea", name = "o", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!gea", name = "p", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!gea", name = "r", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!gea", name = "s", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIIZ)V", line = 5)
    public static final void method465(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (class114.field1483 != null && (arg1 != 3 || class260.field3509.field1264 != arg3 || class260.field3509.field1266 != arg0)) {
            class294.method1737(class114.field1483, class688.field9413, (byte) 126);
            class114.field1483 = null;
        }
        field728++;
        if (arg1 == 3 && class114.field1483 == null) {
            class114.field1483 = class239.method1509(class688.field9413, arg3, (byte) 84, arg0, 0, 0);
            if (class114.field1483 != null) {
                class260.field3509.field1266 = arg0;
                class260.field3509.field1264 = arg3;
                class260.field3509.method1574(class688.field9413, false);
            }
        }
        if (arg1 == 3 && class114.field1483 == null) {
            method465(-1, class260.field3509.field1293, arg2, -1, 1517967785, true);
            return;
        }
        Container var6;
        if (class114.field1483 != null) {
            var6 = class114.field1483;
            class207.field2669 = arg0;
            class544.field7066 = arg3;
        } else if (class425.field5520 == null) {
            if (class348.field4462 == null) {
                var6 = class50.field706;
            } else {
                var6 = class348.field4462;
            }
            class544.field7066 = var6.getSize().width;
            class207.field2669 = var6.getSize().height;
        } else {
            Insets var7 = class425.field5520.getInsets();
            class544.field7066 = class425.field5520.getSize().width - var7.left - var7.right;
            int var10001 = -var7.top;
            class207.field2669 = class425.field5520.getSize().height + var10001 - var7.bottom;
            var6 = class425.field5520;
        }
        if (arg1 == 1) {
            class289.field3729 = (class544.field7066 - class94.field1240) / 2;
            class519.field6796 = class94.field1240;
            class461.field6047 = class535.field6968;
            class349.field4470 = 0;
        } else {
            class556.method2982(arg4 ^ 0x5A7A59A9);
        }
        if (class555.field7261 != class119.field1536) {
            boolean var10000;
            if (class519.field6796 < 1024 && class461.field6047 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg5) {
            class453.method2556((byte) 108);
        } else {
            class524.field6827.setSize(class519.field6796, class461.field6047);
            class520.field6799.method367(class524.field6827);
            if (class425.field5520 == var6) {
                Insets var8 = class425.field5520.getInsets();
                class524.field6827.setLocation(class289.field3729 + var8.left, var8.top - -class349.field4470);
            } else {
                class524.field6827.setLocation(class289.field3729, class349.field4470);
            }
        }
        if (arg1 >= 2) {
            class265.field3555 = true;
        } else {
            class265.field3555 = false;
        }
        if (class196.field2562 != -1) {
            class380.method2169(true, true);
        }
        if (class2.field15 != null && class169.method1160(12, class566.field7391)) {
            class154.method1112((byte) -89);
        }
        int var9 = 0;
        if (arg4 != 1517967785) {
            return;
        }
        while (var9 < 100) {
            class53.field719[var9] = true;
            var9++;
        }
        class539.field7014 = true;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IB)V", line = 138)
    public final void method466(int arg0, byte arg1) {
        if (arg1 >= -103) {
            method468((byte) -20);
        }
        if (class528.field6864 != null) {
            for (class206 var3 = (class206) this.field735.method887(-119); var3 != null; var3 = (class206) this.field735.method892(true)) {
                if (var3.method1329((byte) -85)) {
                    if (var3.method1326(124) == null) {
                        var3.method2438((byte) 117);
                        var3.method237((byte) -88);
                        this.field736 += var3.field2652;
                    }
                } else if ((long) arg0 < ++var3.field437) {
                    class206 var4 = class528.field6864.method2248((byte) -121, var3);
                    this.field739.method38(var4, -13, var3.field5499);
                    class17.method99(var4, (byte) 90, var3);
                    var3.method2438((byte) -48);
                    var3.method237((byte) -121);
                }
            }
        }
        field738++;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILgj;)V", line = 190)
    private final void method467(int arg0, class654 arg1) {
        field745++;
        long var3 = arg1.method1871(10292);
        class206 var5 = (class206) this.field739.method39(var3, 31750);
        if (arg0 != 0) {
            field744 = null;
        }
        while (var5 != null) {
            if (var5.field2651.method1872(arg1, 18282)) {
                this.method470(var5, arg0 - 103);
                return;
            }
            var5 = (class206) this.field739.method46(0);
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(B)V", line = 215)
    public static void method468(byte arg0) {
        field744 = null;
        if (arg0 != -42) {
            method468((byte) 44);
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lgj;ZLjava/lang/Object;)V", line = 227)
    public final void method469(class654 arg0, boolean arg1, Object arg2) {
        this.method471((byte) -128, arg0, 1, arg2);
        field733++;
        if (!arg1) {
            this.method466(-23, (byte) -28);
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lka;I)V", line = 239)
    private final void method470(class206 arg0, int arg1) {
        field732++;
        if (arg0 != null) {
            arg0.method2438((byte) 119);
            arg0.method237((byte) -121);
            this.field736 += arg0.field2652;
        }
        if (arg1 > -46) {
            this.field736 = 81;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(BLgj;ILjava/lang/Object;)V", line = 259)
    private final void method471(byte arg0, class654 arg1, int arg2, Object arg3) {
        if (arg0 > -127) {
            this.method473((byte) -29);
        }
        field740++;
        if (arg2 > this.field730) {
            throw new IllegalStateException("s>cs");
        }
        this.method467(0, arg1);
        this.field736 -= arg2;
        while (this.field736 < 0) {
            class206 var6 = (class206) this.field735.method893((byte) 115);
            this.method470(var6, -60);
        }
        class590 var5 = new class590(arg1, arg3, arg2);
        this.field739.method38(var5, -124, arg1.method1871(10292));
        this.field735.method890((byte) -125, var5);
        var5.field437 = 0L;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Z)V", line = 296)
    public final void method472(boolean arg0) {
        this.field735.method896(13);
        if (!arg0) {
            this.method477(107);
        }
        field737++;
        this.field739.method41(62);
        this.field736 = this.field730;
    }

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(I)V", line = 313)
    public class54(int arg0) {
        this.field730 = arg0;
        this.field736 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field739 = new class9(var2);
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(B)I", line = 330)
    public final int method473(byte arg0) {
        field731++;
        if (arg0 != 70) {
            method465(-33, 33, -29, -116, 84, true);
        }
        return this.field736;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IILsa;II)V", line = 343)
    public static final void method474(int arg0, int arg1, class698 arg2, int arg3, int arg4) {
        field742++;
        class118 var5 = (class118) class434.field5598.method2090(true);
        if (arg0 != -10083) {
            return;
        }
        while (var5 != null) {
            if (var5.field1533 == arg3 && arg1 << 9 == var5.field1524 && arg4 << 9 == var5.field1516 && var5.field1535.field9625 == arg2.field9625) {
                if (var5.field1530 != null) {
                    class690.field9426.method2236(var5.field1530);
                    var5.field1530 = null;
                }
                if (var5.field1514 != null) {
                    class690.field9426.method2236(var5.field1514);
                    var5.field1514 = null;
                }
                var5.method2438((byte) 107);
                return;
            }
            var5 = (class118) class434.field5598.method2088(-152);
        }
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(ILgj;)Ljava/lang/Object;", line = 382)
    public final Object method475(int arg0, class654 arg1) {
        field743++;
        long var3 = arg1.method1871(10292);
        class206 var5 = (class206) this.field739.method39(var3, 31750);
        if (arg0 != -20988) {
            this.method467(-20, null);
        }
        while (var5 != null) {
            if (var5.field2651.method1872(arg1, 18282)) {
                Object var6 = var5.method1326(arg0 + 21112);
                if (var6 != null) {
                    if (var5.method1329((byte) -69)) {
                        class590 var7 = new class590(arg1, var6, var5.field2652);
                        this.field739.method38(var7, -97, var5.field5499);
                        this.field735.method890((byte) -73, var7);
                        var7.field437 = 0L;
                        var5.method2438((byte) 7);
                        var5.method237((byte) -105);
                    } else {
                        this.field735.method890((byte) -121, var5);
                        var5.field437 = 0L;
                    }
                    return var6;
                }
                var5.method2438((byte) -85);
                var5.method237((byte) -87);
                this.field736 += var5.field2652;
            }
            var5 = (class206) this.field739.method46(0);
        }
        return null;
    }

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "(B)V", line = 434)
    public final void method476(byte arg0) {
        class206 var2 = (class206) this.field735.method887(-120);
        int var3 = -68 % ((33 - arg0) / 49);
        while (var2 != null) {
            if (var2.method1329((byte) -99)) {
                var2.method2438((byte) 118);
                var2.method237((byte) -112);
                this.field736 += var2.field2652;
            }
            var2 = (class206) this.field735.method892(true);
        }
        field746++;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)I", line = 458)
    public final int method477(int arg0) {
        field729++;
        if (arg0 != 1517967785) {
            this.field739 = null;
        }
        return this.field730;
    }
}
